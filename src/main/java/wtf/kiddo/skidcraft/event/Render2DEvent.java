package wtf.kiddo.skidcraft.event;

import me.bush.eventbus.event.Event;
import net.minecraft.src.ScaledResolution;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public final class Render2DEvent extends Event {
    private final ScaledResolution scaledResolution;
    private final float ticks;

    public Render2DEvent(ScaledResolution scaledResolution, float ticks) {
        this.scaledResolution = scaledResolution;
        this.ticks = ticks;
    }

    public ScaledResolution getScaledResolution() {
        return scaledResolution;
    }

    public float getTicks() {
        return ticks;
    }

    @Override
    protected boolean isCancellable() {
        return false;
    }
}
