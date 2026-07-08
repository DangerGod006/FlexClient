package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_1293;
import net.minecraft.class_1294;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/Fullbright.class */
public final class Fullbright extends Module implements TickListener {
    public Fullbright() {
        super(EncryptedString.of("Fullbright"), EncryptedString.of("Makes everything fully bright like daytime"), -1, Category.RENDER);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        if (this.mc.field_1724 != null) {
            this.mc.field_1724.method_6016(class_1294.field_5925);
        }
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1724 == null) {
            return;
        }
        this.mc.field_1724.method_6092(new class_1293(class_1294.field_5925, 999999, 0, false, false, false));
    }
}
