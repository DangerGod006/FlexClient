package dev.lvstrng.argon.module.modules.misc;

import com.google.common.collect.Queues;
import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.event.events.PacketSendListener;
import dev.lvstrng.argon.event.events.PlayerTickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.TimerUtils;
import io.netty.channel.ChannelFutureListener;
import java.util.Queue;
import net.minecraft.class_1304;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2813;
import net.minecraft.class_2824;
import net.minecraft.class_2879;
import net.minecraft.class_2885;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/FakeLag.class */
public final class FakeLag extends Module implements PlayerTickListener, PacketReceiveListener, PacketSendListener {
    public final Queue<class_2596<?>> packetQueue;
    public boolean bool;
    public class_243 pos;
    public TimerUtils timerUtil;
    private final MinMaxSetting lagDelay;
    private final BooleanSetting cancelOnElytra;
    private int delay;

    public FakeLag() {
        super(EncryptedString.of("Fake Lag"), EncryptedString.of("Makes it impossible to aim at you by creating a lagging effect"), -1, Category.MISC);
        this.packetQueue = Queues.newConcurrentLinkedQueue();
        this.pos = class_243.field_1353;
        this.timerUtil = new TimerUtils();
        this.lagDelay = new MinMaxSetting(EncryptedString.of("Lag Delay"), 0.0d, 1000.0d, 1.0d, 100.0d, 200.0d);
        this.cancelOnElytra = new BooleanSetting(EncryptedString.of("Cancel on Elytra"), false).setDescription(EncryptedString.of("Cancel the lagging effect when you're wearing an elytra"));
        addSettings(this.lagDelay, this.cancelOnElytra);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PlayerTickListener.class, this);
        this.eventManager.add(PacketSendListener.class, this);
        this.eventManager.add(PacketReceiveListener.class, this);
        this.timerUtil.reset();
        if (this.mc.field_1724 != null) {
            this.pos = this.mc.field_1724.method_73189();
        }
        this.delay = this.lagDelay.getRandomValueInt();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PlayerTickListener.class, this);
        this.eventManager.remove(PacketSendListener.class, this);
        this.eventManager.remove(PacketReceiveListener.class, this);
        reset();
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        if (this.mc.field_1687 != null && !this.mc.field_1724.method_29504() && (event.packet instanceof class_2664)) {
            reset();
        }
    }

    @Override // dev.lvstrng.argon.event.events.PacketSendListener
    public void onPacketSend(PacketSendListener.PacketSendEvent event) {
        if (this.mc.field_1687 == null || this.mc.field_1724.method_6115() || this.mc.field_1724.method_29504()) {
            return;
        }
        if ((event.packet instanceof class_2824) || (event.packet instanceof class_2879) || (event.packet instanceof class_2885) || (event.packet instanceof class_2813)) {
            reset();
            return;
        }
        if (this.cancelOnElytra.getValue() && this.mc.field_1724.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833) {
            reset();
        } else if (!this.bool) {
            this.packetQueue.add(event.packet);
            event.cancel();
        }
    }

    @Override // dev.lvstrng.argon.event.events.PlayerTickListener
    public void onPlayerTick() {
        if (this.timerUtil.delay(this.delay) && this.mc.field_1724 != null && !this.mc.field_1724.method_6115()) {
            reset();
            this.delay = this.lagDelay.getRandomValueInt();
        }
    }

    private void reset() {
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        this.bool = true;
        synchronized (this.packetQueue) {
            while (!this.packetQueue.isEmpty()) {
                this.mc.method_1562().method_48296().method_52906(this.packetQueue.poll(), (ChannelFutureListener) null, false);
            }
        }
        this.bool = false;
        this.timerUtil.reset();
        this.pos = this.mc.field_1724.method_73189();
    }
}
