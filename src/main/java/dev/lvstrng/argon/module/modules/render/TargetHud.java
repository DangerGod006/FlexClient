package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.event.events.PacketSendListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import java.awt.Color;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2824;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/TargetHud.class */
public final class TargetHud extends Module implements HudListener, PacketSendListener {
    private final NumberSetting xCoord;
    private final NumberSetting yCoord;
    private final BooleanSetting hudTimeout;
    private long lastAttackTime;
    public static float animation;
    private static final long timeout = 10000;

    public TargetHud() {
        super(EncryptedString.of("Target HUD"), EncryptedString.of("Gives you information about the enemy player"), -1, Category.RENDER);
        this.xCoord = new NumberSetting(EncryptedString.of("X"), 0.0d, 1920.0d, 500.0d, 1.0d);
        this.yCoord = new NumberSetting(EncryptedString.of("Y"), 0.0d, 1080.0d, 500.0d, 1.0d);
        this.hudTimeout = new BooleanSetting(EncryptedString.of("Timeout"), true).setDescription(EncryptedString.of("Target hud will disappear after 10 seconds"));
        this.lastAttackTime = 0L;
        addSettings(this.xCoord, this.yCoord, this.hudTimeout);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(HudListener.class, this);
        this.eventManager.add(PacketSendListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(HudListener.class, this);
        this.eventManager.remove(PacketSendListener.class, this);
        super.onDisable();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c5  */
    @Override // dev.lvstrng.argon.event.events.HudListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRenderHud(dev.lvstrng.argon.event.events.HudListener.HudEvent r22) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.lvstrng.argon.module.modules.render.TargetHud.onRenderHud(dev.lvstrng.argon.event.events.HudListener$HudEvent):void");
    }

    private Color getDamageTickColor(int hurtTime) {
        switch (hurtTime) {
            case 0:
                return null;
            case 1:
                return new Color(0, 255, 0, 255);
            case 2:
                return new Color(50, 255, 0, 255);
            case 3:
                return new Color(100, 255, 0, 255);
            case 4:
                return new Color(175, 255, 0, 255);
            case 5:
                return new Color(200, 255, 0, 255);
            case 6:
                return new Color(255, 255, 0, 255);
            case 7:
                return new Color(255, 150, 0, 255);
            case 8:
                return new Color(255, 100, 0, 255);
            case 9:
                return new Color(255, 50, 0, 255);
            case 10:
                return new Color(255, 0, 0, 255);
            default:
                throw new IllegalStateException("uv" + hurtTime);
        }
    }

    @Override // dev.lvstrng.argon.event.events.PacketSendListener
    public void onPacketSend(PacketSendListener.PacketSendEvent event) {
        class_2824 class_2824Var = event.packet;
        if (class_2824Var instanceof class_2824) {
            class_2824 packet = class_2824Var;
            packet.method_34209(new class_2824.class_5908() { // from class: dev.lvstrng.argon.module.modules.render.TargetHud.1
                public void method_34219(class_1268 hand) {
                }

                public void method_34220(class_1268 hand, class_243 pos) {
                }

                public void method_34218() {
                    if (TargetHud.this.mc.field_1692 instanceof class_1657) {
                        TargetHud.this.lastAttackTime = System.currentTimeMillis();
                    }
                }
            });
        }
    }
}
