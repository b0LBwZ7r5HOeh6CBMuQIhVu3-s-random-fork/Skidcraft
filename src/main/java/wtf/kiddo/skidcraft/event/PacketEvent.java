package wtf.kiddo.skidcraft.event;

import me.bush.eventbus.event.Event;
import net.minecraft.src.Packet;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public final class PacketEvent extends Event {
    private final Packet packet;
    private final Type type;

    public PacketEvent(Packet packet, Type type) {
        this.packet = packet;
        this.type = type;
    }

    public Packet getPacket() {
        return packet;
    }

    public Type getType() {
        return type;
    }

    /*接收包还没插*/
    public enum Type {
        SENT,RECEIVED
    }

    @Override
    protected boolean isCancellable() {
        return true;
    }
}
