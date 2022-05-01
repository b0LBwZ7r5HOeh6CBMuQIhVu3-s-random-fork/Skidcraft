package wtf.kiddo.skidcraft.event;

import me.bush.eventbus.event.Event;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public final class KeyInputEvent extends Event {
    private final int key;

    public KeyInputEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    @Override
    protected boolean isCancellable() {
        return false;
    }
}
