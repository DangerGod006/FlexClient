package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_2670;
import net.minecraft.class_2827;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/PingSpoof.class */
public final class PingSpoof extends Module implements PacketReceiveListener {
    private final MinMaxSetting ping;
    private int delay;

    public PingSpoof() {
        super(EncryptedString.of("Ping Spoof"), EncryptedString.of("Holds back packets making the server think your internet connection is bad."), -1, Category.MISC);
        this.ping = new MinMaxSetting(EncryptedString.of("Ping"), 0.0d, 1000.0d, 1.0d, 0.0d, 600.0d).setDescription(EncryptedString.of("The ping you want to achieve"));
        addSettings(this.ping);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PacketReceiveListener.class, this);
        this.delay = this.ping.getRandomValueInt();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PacketReceiveListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        class_2670 class_2670Var = event.packet;
        if (class_2670Var instanceof class_2670) {
            class_2670 packet = class_2670Var;
            new Thread(() -> {
                try {
                    Thread.sleep(this.delay);
                    this.mc.method_1562().method_48296().method_10743(new class_2827(packet.method_11517()));
                    this.delay = this.ping.getRandomValueInt();
                } catch (InterruptedException e) {
                }
            }).start();
            event.cancel();
        }
    }
}
