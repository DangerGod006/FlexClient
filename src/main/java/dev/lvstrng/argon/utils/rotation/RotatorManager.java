package dev.lvstrng.argon.utils.rotation;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.EventManager;
import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.BlockBreakingListener;
import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.MovementPacketListener;
import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.event.events.PacketSendListener;
import dev.lvstrng.argon.utils.RotationUtils;
import net.minecraft.class_2708;
import net.minecraft.class_2828;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/rotation/RotatorManager.class */
public final class RotatorManager implements PacketSendListener, BlockBreakingListener, ItemUseListener, AttackListener, MovementPacketListener, PacketReceiveListener {
    private boolean enabled;
    private boolean rotateBack;
    private boolean resetRotation;
    private final EventManager eventManager = Argon.INSTANCE.eventManager;
    private Rotation currentRotation;
    private float clientYaw;
    private float clientPitch;
    private float serverYaw;
    private float serverPitch;
    private boolean wasDisabled;

    public RotatorManager() {
        this.eventManager.remove(PacketSendListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(ItemUseListener.class, this);
        this.eventManager.remove(MovementPacketListener.class, this);
        this.eventManager.remove(PacketReceiveListener.class, this);
        this.eventManager.remove(BlockBreakingListener.class, this);
        this.enabled = true;
        this.rotateBack = false;
        this.resetRotation = false;
        this.serverYaw = 0.0f;
        this.serverPitch = 0.0f;
        this.clientYaw = 0.0f;
        this.clientPitch = 0.0f;
    }

    public void shutDown() {
        this.eventManager.remove(PacketSendListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        this.eventManager.remove(ItemUseListener.class, this);
        this.eventManager.remove(MovementPacketListener.class, this);
        this.eventManager.remove(PacketReceiveListener.class, this);
        this.eventManager.remove(BlockBreakingListener.class, this);
    }

    public Rotation getServerRotation() {
        return new Rotation(this.serverYaw, this.serverPitch);
    }

    public void enable() {
        this.enabled = true;
        this.rotateBack = false;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void disable() {
        if (isEnabled()) {
            this.enabled = false;
            if (!this.rotateBack) {
                this.rotateBack = true;
            }
        }
    }

    public void setRotation(Rotation rotation) {
        this.currentRotation = rotation;
    }

    public void setRotation(double yaw, double pitch) {
        setRotation(new Rotation(yaw, pitch));
    }

    private void resetClientRotation() {
        Argon.mc.field_1724.method_36456(this.clientYaw);
        Argon.mc.field_1724.method_36457(this.clientPitch);
        this.resetRotation = false;
    }

    public void setClientRotation(Rotation rotation) {
        this.clientYaw = Argon.mc.field_1724.method_36454();
        this.clientPitch = Argon.mc.field_1724.method_36455();
        Argon.mc.field_1724.method_36456((float) rotation.yaw());
        Argon.mc.field_1724.method_36457((float) rotation.pitch());
        this.resetRotation = true;
    }

    public void setServerRotation(Rotation rotation) {
        this.serverYaw = (float) rotation.yaw();
        this.serverPitch = (float) rotation.pitch();
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (!isEnabled() && this.wasDisabled) {
            this.enabled = true;
            this.wasDisabled = false;
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        if (!event.isCancelled() && isEnabled()) {
            this.enabled = false;
            this.wasDisabled = true;
        }
    }

    @Override // dev.lvstrng.argon.event.events.PacketSendListener
    public void onPacketSend(PacketSendListener.PacketSendEvent event) {
        class_2828 class_2828Var = event.packet;
        if (class_2828Var instanceof class_2828) {
            class_2828 packet = class_2828Var;
            this.serverYaw = packet.method_12271(this.serverYaw);
            this.serverPitch = packet.method_12270(this.serverPitch);
        }
    }

    @Override // dev.lvstrng.argon.event.events.BlockBreakingListener
    public void onBlockBreaking(BlockBreakingListener.BlockBreakingEvent event) {
        if (!event.isCancelled() && isEnabled()) {
            this.enabled = false;
            this.wasDisabled = true;
        }
    }

    @Override // dev.lvstrng.argon.event.events.MovementPacketListener
    public void onSendMovementPackets() {
        if (isEnabled() && this.currentRotation != null) {
            setClientRotation(this.currentRotation);
            setServerRotation(this.currentRotation);
        } else if (this.rotateBack) {
            Rotation serverRot = new Rotation(this.serverYaw, this.serverPitch);
            Rotation clientRot = new Rotation(Argon.mc.field_1724.method_36454(), Argon.mc.field_1724.method_36455());
            if (RotationUtils.getTotalDiff(serverRot, clientRot) > 1.0d) {
                Rotation smoothRotation = RotationUtils.getSmoothRotation(serverRot, clientRot, 0.2d);
                setClientRotation(smoothRotation);
                setServerRotation(smoothRotation);
                return;
            }
            this.rotateBack = false;
        }
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        class_2708 class_2708Var = event.packet;
        if (class_2708Var instanceof class_2708) {
            class_2708 packet = class_2708Var;
            this.serverYaw = packet.comp_3228().comp_3150();
            this.serverPitch = packet.comp_3228().comp_3151();
        }
    }
}
