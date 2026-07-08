package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.GameRenderListener;
import dev.lvstrng.argon.event.events.PacketReceiveListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.WorldUtils;
import java.awt.Color;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2605;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.class_2636;
import net.minecraft.class_2637;
import net.minecraft.class_2646;
import net.minecraft.class_2818;
import net.minecraft.class_3719;
import net.minecraft.class_3866;
import net.minecraft.class_4184;
import net.minecraft.class_7833;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/StorageEsp.class */
public final class StorageEsp extends Module implements GameRenderListener, PacketReceiveListener {
    private final NumberSetting alpha;
    private final BooleanSetting donutBypass;
    private final BooleanSetting tracers;

    public StorageEsp() {
        super(EncryptedString.of("Storage ESP"), EncryptedString.of("Renders storage blocks through walls"), -1, Category.RENDER);
        this.alpha = new NumberSetting(EncryptedString.of("Alpha"), 1.0d, 255.0d, 125.0d, 1.0d);
        this.donutBypass = new BooleanSetting(EncryptedString.of("Donut Bypass"), false);
        this.tracers = new BooleanSetting(EncryptedString.of("Tracers"), false).setDescription(EncryptedString.of("Draws a line from your player to the storage block"));
        addSettings(this.donutBypass, this.alpha, this.tracers);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PacketReceiveListener.class, this);
        this.eventManager.add(GameRenderListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PacketReceiveListener.class, this);
        this.eventManager.remove(GameRenderListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.GameRenderListener
    public void onGameRender(GameRenderListener.GameRenderEvent event) {
        renderStorages(event);
    }

    private Color getColor(class_2586 blockEntity, int a) {
        if (blockEntity instanceof class_2646) {
            return new Color(200, 91, 0, a);
        }
        if (blockEntity instanceof class_2595) {
            return new Color(156, 91, 0, a);
        }
        if (blockEntity instanceof class_2611) {
            return new Color(117, 0, 255, a);
        }
        if (blockEntity instanceof class_2636) {
            return new Color(138, 126, 166, a);
        }
        if (blockEntity instanceof class_2627) {
            return new Color(134, 0, 158, a);
        }
        if (blockEntity instanceof class_3866) {
            return new Color(125, 125, 125, a);
        }
        if (blockEntity instanceof class_3719) {
            return new Color(255, 140, 140, a);
        }
        if (blockEntity instanceof class_2605) {
            return new Color(80, 80, 255, a);
        }
        return new Color(255, 255, 255, 0);
    }

    private void renderStorages(GameRenderListener.GameRenderEvent event) {
        class_4184 cam = this.mc.field_1773.method_19418();
        if (cam == null) {
            return;
        }
        event.matrices.method_22903();
        class_243 cameraPos = cam.method_71156();
        event.matrices.method_22907(class_7833.field_40714.rotationDegrees(cam.method_19329()));
        event.matrices.method_22907(class_7833.field_40716.rotationDegrees(cam.method_19330() + 180.0f));
        event.matrices.method_22904(-cameraPos.field_1352, -cameraPos.field_1351, -cameraPos.field_1350);
        for (class_2818 chunk : WorldUtils.getLoadedChunks().toList()) {
            for (class_2338 blockPos : chunk.method_12021()) {
                class_2586 blockEntity = this.mc.field_1687.method_8321(blockPos);
                if (blockEntity != null) {
                    RenderUtils.renderFilledBox(event.matrices, blockPos.method_10263() + 0.1f, blockPos.method_10264() + 0.05f, blockPos.method_10260() + 0.1f, blockPos.method_10263() + 0.9f, blockPos.method_10264() + 0.85f, blockPos.method_10260() + 0.9f, getColor(blockEntity, this.alpha.getValueInt()));
                    class_243 center = new class_243(((double) blockPos.method_10263()) + 0.5d, ((double) blockPos.method_10264()) + 0.5d, ((double) blockPos.method_10260()) + 0.5d);
                    if (this.tracers.getValue() && this.mc.field_1765 != null) {
                        RenderUtils.renderLine(event.matrices, getColor(blockEntity, 255), this.mc.field_1765.method_17784(), center);
                    }
                }
            }
        }
        event.matrices.method_22909();
    }

    @Override // dev.lvstrng.argon.event.events.PacketReceiveListener
    public void onPacketReceive(PacketReceiveListener.PacketReceiveEvent event) {
        if (this.donutBypass.getValue() && (event.packet instanceof class_2637)) {
            event.cancel();
        }
    }
}
