package wtf.kiddo.skidcraft;

import me.bush.eventbus.bus.EventBus;
import me.bush.eventbus.event.Event;
import wtf.kiddo.skidcraft.mod.ModManager;
import wtf.kiddo.skidcraft.value.ValueManager;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public enum Client {
    INSTANCE;
    private EventBus eventBus;
    private ValueManager valueManager;
    private ModManager modManager;

    public void startClient() {
        eventBus = new EventBus();
        valueManager = new ValueManager();
        modManager = new ModManager();
        modManager.initializeMods();
    }

    public final EventBus getEventBus() {
        return eventBus;
    }

    public ValueManager getValueManager() {
        return valueManager;
    }

    public ModManager getModManager() {
        return modManager;
    }
}
