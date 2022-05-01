package wtf.kiddo.skidcraft.event;

import me.bush.eventbus.event.Event;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public final class Render3DEvent extends Event {
    private final float partialTicks;

    public Render3DEvent(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return partialTicks;
    }

    @Override
    protected boolean isCancellable() {
        return true;
    }
}
