package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_2596;
import net.minecraft.class_2720;
import net.minecraft.class_2856;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/PackSpoof.class */
public class PackSpoof extends Module implements PacketReceiveListener {
    public PackSpoof() {
        super(EncryptedString.of("Pack Spoof"), EncryptedString.of("Ignores custom resource packs"), -1, Category.MISC);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PacketReceiveListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PacketReceiveListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        if (this.mc.method_1562() != null) {
            class_2596<?> packet = event.packet;
            if (packet instanceof class_2720) {
                event.cancel();
                this.mc.method_1562().method_52787(new class_2856(this.mc.field_1724.method_5667(), class_2856.class_2857.field_13016));
                this.mc.method_1562().method_52787(new class_2856(this.mc.field_1724.method_5667(), class_2856.class_2857.field_13017));
            }
        }
    }
}
