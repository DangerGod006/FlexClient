package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.event.events.GameRenderListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.RenderUtils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/Trajectory.class */
public final class Trajectory extends Module implements GameRenderListener {
    private final BooleanSetting showPearls;
    private final BooleanSetting showBows;
    private final BooleanSetting showTridents;
    private final BooleanSetting showLandingPoint;
    private final NumberSetting markerSize;
    private final NumberSetting trajectoryAccuracy;
    private final BooleanSetting colorGradient;

    public Trajectory() {
        super(EncryptedString.of("Trajectory"), EncryptedString.of("Shows projectile trajectories"), -1, Category.RENDER);
        this.showPearls = new BooleanSetting(EncryptedString.of("Show Pearls"), true).setDescription(EncryptedString.of("Display trajectories for Ender Pearls"));
        this.showBows = new BooleanSetting(EncryptedString.of("Show Bows"), true).setDescription(EncryptedString.of("Display trajectories for bow arrows"));
        this.showTridents = new BooleanSetting(EncryptedString.of("Show Tridents"), true).setDescription(EncryptedString.of("Display trajectories for tridents"));
        this.showLandingPoint = new BooleanSetting(EncryptedString.of("Show Landing Point"), true).setDescription(EncryptedString.of("Show landing point marker"));
        this.markerSize = new NumberSetting(EncryptedString.of("Marker Size"), 0.1d, 1.0d, 0.2d, 0.1d).setDescription(EncryptedString.of("Size of the landing point marker"));
        this.trajectoryAccuracy = new NumberSetting(EncryptedString.of("Accuracy"), 20.0d, 200.0d, 100.0d, 10.0d).setDescription(EncryptedString.of("Number of trajectory points (higher = more accurate)"));
        this.colorGradient = new BooleanSetting(EncryptedString.of("Color Gradient"), true).setDescription(EncryptedString.of("Use gradient color for trajectory line"));
        addSettings(this.showPearls, this.showBows, this.showTridents, this.showLandingPoint, this.markerSize, this.trajectoryAccuracy, this.colorGradient);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(GameRenderListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(GameRenderListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.GameRenderListener
    public void onGameRender(GameRenderListener.GameRenderEvent event) {
        class_4184 camera;
        if (this.mc.field_1724 == null || this.mc.field_1687 == null || !this.mc.field_1724.method_5805() || this.mc.field_1724.method_6047().method_7960() || (camera = this.mc.field_1773.method_19418()) == null) {
            return;
        }
        class_4587 matrices = event.matrices;
        matrices.method_22903();
        class_243 camPos = camera.method_71156();
        matrices.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
        matrices.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        matrices.method_22904(-camPos.field_1352, -camPos.field_1351, -camPos.field_1350);
        class_1792 item = this.mc.field_1724.method_6047().method_7909();
        if (this.showPearls.getValue() && item == class_1802.field_8634) {
            renderTrajectory(matrices, 1.5d, 0.03d, 0.99d, new Color(160, 82, 45, 200));
        } else if (this.showBows.getValue() && item == class_1802.field_8102) {
            double vel = this.mc.field_1724.method_6115() ? calculateBowVelocity() : 3.0d;
            renderTrajectory(matrices, vel, 0.05d, 0.99d, new Color(139, 90, 43, 200));
        } else if (this.showTridents.getValue() && item == class_1802.field_8547) {
            renderTrajectory(matrices, 2.5d, 0.08d, 0.99d, new Color(70, 130, 180, 200));
        }
        matrices.method_22909();
    }

    private void renderTrajectory(class_4587 matrices, double velocity, double gravity, double drag, Color baseColor) {
        Color color;
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        class_243 startPos = this.mc.field_1724.method_33571().method_1019(this.mc.field_1724.method_5828(1.0f).method_1021(0.16d));
        class_243 look = this.mc.field_1724.method_5828(1.0f).method_1029();
        class_243 motion = look.method_1021(velocity);
        List<class_243> points = new ArrayList<>();
        class_243 pos = startPos;
        int accuracy = this.trajectoryAccuracy.getValueInt();
        int i = 0;
        while (true) {
            if (i >= accuracy) {
                break;
            }
            points.add(pos);
            class_243 nextPos = pos.method_1019(motion);
            class_3965 class_3965VarMethod_17742 = this.mc.field_1687.method_17742(new class_3959(pos, nextPos, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, this.mc.field_1724));
            if (class_3965VarMethod_17742 != null && class_3965VarMethod_17742.method_17783() != class_239.class_240.field_1333) {
                points.add(class_3965VarMethod_17742.method_17784());
                break;
            } else {
                pos = nextPos;
                motion = new class_243(motion.field_1352 * drag, (motion.field_1351 * drag) - gravity, motion.field_1350 * drag);
                i++;
            }
        }
        if (points.size() < 2) {
            return;
        }
        for (int i2 = 0; i2 < points.size() - 1; i2++) {
            if (this.colorGradient.getValue()) {
                float p = i2 / (points.size() - 1);
                color = new Color(Math.max(0, (int) (baseColor.getRed() * (1.0f - (p * 0.5f)))), Math.max(0, (int) (baseColor.getGreen() * (1.0f - (p * 0.5f)))), Math.max(0, (int) (baseColor.getBlue() * (1.0f - (p * 0.5f)))), baseColor.getAlpha());
            } else {
                color = baseColor;
            }
            Color color2 = color;
            RenderUtils.renderLine(matrices, color2, points.get(i2), points.get(i2 + 1));
        }
        if (this.showLandingPoint.getValue()) {
            class_243 land = (class_243) points.getLast();
            float s = this.markerSize.getValueFloat();
            RenderUtils.renderFilledBox(matrices, ((float) land.field_1352) - s, (float) land.field_1351, ((float) land.field_1350) - s, ((float) land.field_1352) + s, ((float) land.field_1351) + (s * 2.0f), ((float) land.field_1350) + s, new Color(255, 255, 0, 200));
        }
    }

    private double calculateBowVelocity() {
        if (this.mc.field_1724 == null) {
            return 0.0d;
        }
        int useTime = this.mc.field_1724.method_6048();
        float progress = Math.min(useTime / 20.0f, 1.0f);
        float vel = ((progress * progress) + (progress * 2.0f)) / 3.0f;
        return Math.min(vel, 1.0f) * 3.0f;
    }
}
