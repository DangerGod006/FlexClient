package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.GameRenderListener;
import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.ColorUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.ProjectionUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.Utils;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_746;
import net.minecraft.class_7833;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/PlayerESP.class */
public final class PlayerESP extends Module implements GameRenderListener, HudListener {
    public final ModeSetting<Mode> mode;
    private final NumberSetting alpha;
    private final NumberSetting width;
    private final BooleanSetting tracers;
    private final BooleanSetting threeDOutline;
    private final BooleanSetting twoDOutline;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/PlayerESP$Mode.class */
    public enum Mode {
        TwoD,
        ThreeD
    }

    public PlayerESP() {
        super(EncryptedString.of("Player ESP"), EncryptedString.of("Renders players through walls"), -1, Category.RENDER);
        this.mode = new ModeSetting<>(EncryptedString.of("Mode"), Mode.ThreeD, Mode.class);
        this.alpha = new NumberSetting(EncryptedString.of("Alpha"), 0.0d, 255.0d, 100.0d, 1.0d);
        this.width = new NumberSetting(EncryptedString.of("Line width"), 1.0d, 10.0d, 1.0d, 1.0d);
        this.tracers = new BooleanSetting(EncryptedString.of("Tracers"), false).setDescription(EncryptedString.of("Draws a line from your player to the other"));
        this.threeDOutline = new BooleanSetting(EncryptedString.of("3D box outline"), false);
        this.twoDOutline = new BooleanSetting(EncryptedString.of("2D Outline"), false);
        addSettings(this.alpha, this.mode, this.threeDOutline, this.twoDOutline, this.width, this.tracers);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(GameRenderListener.class, this);
        this.eventManager.add(HudListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(GameRenderListener.class, this);
        this.eventManager.remove(HudListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.GameRenderListener
    public void onGameRender(GameRenderListener.GameRenderEvent event) {
        class_4184 camera;
        if (this.mc.field_1687 == null || this.mc.field_1724 == null || (camera = this.mc.field_1773.method_19418()) == null) {
            return;
        }
        event.matrices.method_22903();
        class_243 cameraPos = camera.method_71156();
        event.matrices.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
        event.matrices.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        event.matrices.method_22904(-cameraPos.field_1352, -cameraPos.field_1351, -cameraPos.field_1350);
        for (class_1657 player : this.mc.field_1687.method_18456()) {
            if (shouldRender(player)) {
                class_238 box = getRenderBox(player, event.delta).method_1014(0.02d);
                if (this.mode.isMode(Mode.ThreeD)) {
                    RenderUtils.renderFilledBox(event.matrices, (float) box.field_1323, (float) box.field_1322, (float) box.field_1321, (float) box.field_1320, (float) box.field_1325, (float) box.field_1324, getColor(this.alpha.getValueInt()).brighter());
                    if (this.threeDOutline.getValue()) {
                        RenderUtils.renderBoxOutline(event.matrices, box, getColor(255), this.width.getValueInt());
                    }
                }
                if (this.tracers.getValue() && this.mc.field_1765 != null) {
                    RenderUtils.renderLine(event.matrices, Utils.getMainColor(255, 1), this.mc.field_1765.method_17784(), player.method_30950(RenderUtils.tickProgress()));
                }
            }
        }
        event.matrices.method_22909();
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        ScreenBounds bounds;
        if (!this.mode.isMode(Mode.TwoD) || this.mc.field_1687 == null || this.mc.field_1724 == null) {
            return;
        }
        for (class_1657 player : this.mc.field_1687.method_18456()) {
            if (shouldRender(player) && (bounds = projectBounds(getRenderBox(player, event.delta))) != null && bounds.isValid()) {
                Color outlineColor = getColor(255);
                int thickness = Math.max(1, this.width.getValueInt());
                if (this.twoDOutline.getValue()) {
                    Color borderColor = new Color(0, 0, 0, Math.min(255, outlineColor.getAlpha()));
                    drawOutline(event.context, bounds, thickness + 1, borderColor);
                }
                drawOutline(event.context, bounds, thickness, outlineColor);
            }
        }
    }

    private boolean shouldRender(class_1297 entity) {
        class_746 class_746Var;
        return (entity instanceof class_1657) && (class_746Var = (class_1657) entity) != this.mc.field_1724 && class_746Var.method_5805();
    }

    private class_238 getRenderBox(class_1657 player, float tickDelta) {
        double x = class_3532.method_16436(tickDelta, player.field_6014, player.method_23317());
        double y = class_3532.method_16436(tickDelta, player.field_6036, player.method_23318());
        double z = class_3532.method_16436(tickDelta, player.field_5969, player.method_23321());
        return player.method_5829().method_989(x - player.method_23317(), y - player.method_23318(), z - player.method_23321());
    }

    private ScreenBounds projectBounds(class_238 box) {
        double minX = Double.POSITIVE_INFINITY;
        double minY = Double.POSITIVE_INFINITY;
        double maxX = Double.NEGATIVE_INFINITY;
        double maxY = Double.NEGATIVE_INFINITY;
        int visibleCorners = 0;
        for (double x : new double[]{box.field_1323, box.field_1320}) {
            for (double y : new double[]{box.field_1322, box.field_1325}) {
                for (double z : new double[]{box.field_1321, box.field_1324}) {
                    ProjectionUtils.ProjectedPoint projected = ProjectionUtils.project(new class_243(x, y, z));
                    if (projected != null) {
                        visibleCorners++;
                        minX = Math.min(minX, projected.x());
                        minY = Math.min(minY, projected.y());
                        maxX = Math.max(maxX, projected.x());
                        maxY = Math.max(maxY, projected.y());
                    }
                }
            }
        }
        if (visibleCorners == 0) {
            return null;
        }
        return new ScreenBounds((int) Math.floor(minX), (int) Math.floor(minY), (int) Math.ceil(maxX), (int) Math.ceil(maxY));
    }

    private void drawOutline(class_332 context, ScreenBounds bounds, int thickness, Color color) {
        int packedColor = color.getRGB();
        context.method_25294(bounds.minX, bounds.minY, bounds.maxX, bounds.minY + thickness, packedColor);
        context.method_25294(bounds.minX, bounds.maxY - thickness, bounds.maxX, bounds.maxY, packedColor);
        context.method_25294(bounds.minX, bounds.minY + thickness, bounds.minX + thickness, bounds.maxY - thickness, packedColor);
        context.method_25294(bounds.maxX - thickness, bounds.minY + thickness, bounds.maxX, bounds.maxY - thickness, packedColor);
    }

    private Color getColor(int alpha) {
        int red = ClickGUI.red.getValueInt();
        int green = ClickGUI.green.getValueInt();
        int blue = ClickGUI.blue.getValueInt();
        if (ClickGUI.rainbow.getValue()) {
            return ColorUtils.getBreathingRGBColor(1, alpha);
        }
        return new Color(red, green, blue, alpha);
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds.class */
    private static final class ScreenBounds extends Record {
        private final int minX;
        private final int minY;
        private final int maxX;
        private final int maxY;

        private ScreenBounds(int minX, int minY, int maxX, int maxY) {
            this.minX = minX;
            this.minY = minY;
            this.maxX = maxX;
            this.maxY = maxY;
        }

        @Override // java.lang.Record
        public final String toString() {
            return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, ScreenBounds.class), ScreenBounds.class, "minX;minY;maxX;maxY", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minY:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxY:I").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final int hashCode() {
            return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, ScreenBounds.class), ScreenBounds.class, "minX;minY;maxX;maxY", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minY:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxY:I").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final boolean equals(Object o) {
            return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, ScreenBounds.class, Object.class), ScreenBounds.class, "minX;minY;maxX;maxY", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->minY:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxX:I", "FIELD:Ldev/lvstrng/argon/module/modules/render/PlayerESP$ScreenBounds;->maxY:I").dynamicInvoker().invoke(this, o) /* invoke-custom */;
        }

        public int minX() {
            return this.minX;
        }

        public int minY() {
            return this.minY;
        }

        public int maxX() {
            return this.maxX;
        }

        public int maxY() {
            return this.maxY;
        }

        private boolean isValid() {
            return this.maxX > this.minX && this.maxY > this.minY;
        }
    }
}
