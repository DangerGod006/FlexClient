package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import java.lang.reflect.Field;
import net.minecraft.class_1309;
import net.minecraft.class_1802;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/NoShieldDelay.class */
public final class NoShieldDelay extends Module implements TickListener {
    public final NumberSetting shieldDelay;

    public NoShieldDelay() {
        super(EncryptedString.of("No Shield Delay"), EncryptedString.of("Removes the shield raise delay"), -1, Category.MISC);
        this.shieldDelay = new NumberSetting(EncryptedString.of("Shield Delay"), 0.0d, 5.0d, 0.0d, 1.0d).setDescription(EncryptedString.of("Ticks of delay before shield raises. 0 = instant"));
        addSettings(this.shieldDelay);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        int boost;
        if (this.mc.field_1724 != null && this.mc.field_1724.method_6115()) {
            if ((this.mc.field_1724.method_6030().method_31574(class_1802.field_8255) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8255)) && (boost = 5 - this.shieldDelay.getValueInt()) > 0) {
                this.mc.field_1724.method_6014();
                try {
                    Field field = class_1309.class.getDeclaredField("itemUseTimeLeft");
                    field.setAccessible(true);
                    int current = ((Integer) field.get(this.mc.field_1724)).intValue();
                    field.set(this.mc.field_1724, Integer.valueOf(current + boost));
                } catch (Exception e) {
                }
            }
        }
    }
}
