package wtf.kiddo.skidcraft.mod;

import net.minecraft.client.Minecraft;
import wtf.kiddo.skidcraft.Client;
import wtf.kiddo.skidcraft.value.Value;

import java.util.List;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public abstract class Mod {
    private String label, suffix;
    private boolean enabled;
    private int key;
    private Category category;
    private final Minecraft mc = Minecraft.getMinecraft();

    public Mod(String label,Category category) {
        this.label = label;
        this.category = category;
    }

    protected abstract void onEnable();

    protected abstract void onDisable();

    public String getLabel() {
        return label;
    }

    public String getSuffix() {
        return suffix;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getKey() {
        return key;
    }

    public Category getCategory() {
        return category;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            Client.INSTANCE.getEventBus().subscribe(this);
            onEnable();
        } else {
            Client.INSTANCE.getEventBus().unsubscribe(this);
            onDisable();
        }
    }

    public void setKey(int key) {
        this.key = key;
    }

    public List<Value> getValues() {
        return Client.INSTANCE.getValueManager().getAllValuesFrom(label);
    }

    public void toggle() {
        setEnabled(!isEnabled());
    }

    public Value findValue(String term) {
        for (Value value : Client.INSTANCE.getValueManager().getAllValuesFrom(getLabel())) {
            if (value.getLabel().equalsIgnoreCase(term)) {
                return value;
            }
        }
        return null;
    }

    public Minecraft getMc() {
        return mc;
    }
}
