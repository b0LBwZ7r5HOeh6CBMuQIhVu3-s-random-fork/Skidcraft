package wtf.kiddo.skidcraft.mod.impl.visuals;

import me.bush.eventbus.annotation.EventListener;
import net.minecraft.src.Packet39AttachEntity;
import wtf.kiddo.skidcraft.Client;
import wtf.kiddo.skidcraft.event.PacketEvent;
import wtf.kiddo.skidcraft.event.Render2DEvent;
import wtf.kiddo.skidcraft.mod.Category;
import wtf.kiddo.skidcraft.mod.Mod;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public final class HUD extends Mod {
    public HUD() {
        super("HUD", Category.VISUALS);
        this.setEnabled(true);
    }

    @EventListener
    public void onRender2DEvent(final Render2DEvent event) {
        float posy = 4;
        for (Mod mod : Client.INSTANCE.getModManager().getModMap().values()) {
            if(mod.isEnabled()) {
                getMc().fontRenderer.drawStringWithShadow(mod.getLabel(),4, (int) posy,-1);
                posy += (getMc().fontRenderer.FONT_HEIGHT + 2);
            }
        }
    }

    @Override
    protected void onEnable() {

    }

    @Override
    protected void onDisable() {

    }
}
