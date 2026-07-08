package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.event.events.MouseMoveListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.RotationUtils;
import dev.lvstrng.argon.utils.TimerUtils;
import dev.lvstrng.argon.utils.WorldUtils;
import dev.lvstrng.argon.utils.rotation.Rotation;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AimAssist.class */
public final class AimAssist extends Module implements HudListener, MouseMoveListener {
    private final BooleanSetting stickyAim;
    private final BooleanSetting onlyWeapon;
    private final BooleanSetting onLeftClick;
    private final ModeSetting<AimMode> aimAt;
    private final BooleanSetting stopAtTargetVertical;
    private final BooleanSetting stopAtTargetHorizontal;
    private final NumberSetting radius;
    private final BooleanSetting seeOnly;
    private final BooleanSetting lookAtNearest;
    private final NumberSetting fov;
    private final MinMaxSetting pitchSpeed;
    private final MinMaxSetting yawSpeed;
    private final NumberSetting speedChange;
    private final NumberSetting randomization;
    private final BooleanSetting yawAssist;
    private final BooleanSetting pitchAssist;
    private final NumberSetting waitFor;
    private final ModeSetting<LerpMode> lerp;
    private final ModeSetting<PosMode> posMode;
    private final TimerUtils timer;
    private final TimerUtils resetSpeed;
    private boolean move;
    private float pitch;
    private float yaw;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AimAssist$AimMode.class */
    public enum AimMode {
        Head,
        Chest,
        Legs
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AimAssist$LerpMode.class */
    public enum LerpMode {
        Normal,
        Smoothstep,
        EaseOut
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AimAssist$PosMode.class */
    public enum PosMode {
        Normal,
        Lerped
    }

    public AimAssist() {
        super(EncryptedString.of("Aim Assist"), EncryptedString.of("Automatically aims at players for you"), -1, Category.COMBAT);
        this.stickyAim = new BooleanSetting(EncryptedString.of("Sticky Aim"), false).setDescription(EncryptedString.of("Aims at the last attacked player"));
        this.onlyWeapon = new BooleanSetting(EncryptedString.of("Only Weapon"), true);
        this.onLeftClick = new BooleanSetting(EncryptedString.of("On Left Click"), false).setDescription(EncryptedString.of("Only gets triggered if holding down left click"));
        this.aimAt = new ModeSetting<>(EncryptedString.of("Aim At"), AimMode.Head, AimMode.class);
        this.stopAtTargetVertical = new BooleanSetting(EncryptedString.of("Stop at Target Vert"), true).setDescription(EncryptedString.of("Stops vertically assisting if already aiming at the entity, helps bypass anti-cheat"));
        this.stopAtTargetHorizontal = new BooleanSetting(EncryptedString.of("Stop at Target Horiz"), false).setDescription(EncryptedString.of("Stops horizontally assisting if already aiming at the entity, helps bypass anti-cheat"));
        this.radius = new NumberSetting(EncryptedString.of("Radius"), 0.1d, 6.0d, 5.0d, 0.1d);
        this.seeOnly = new BooleanSetting(EncryptedString.of("See Only"), true);
        this.lookAtNearest = new BooleanSetting(EncryptedString.of("Look at Nearest"), false);
        this.fov = new NumberSetting(EncryptedString.of("FOV"), 5.0d, 360.0d, 180.0d, 1.0d);
        this.pitchSpeed = new MinMaxSetting(EncryptedString.of("Vertical Speed"), 0.0d, 10.0d, 0.1d, 2.0d, 4.0d);
        this.yawSpeed = new MinMaxSetting(EncryptedString.of("Horizontal Speed"), 0.0d, 10.0d, 0.1d, 2.0d, 4.0d);
        this.speedChange = new NumberSetting(EncryptedString.of("Speed Delay"), 0.0d, 1000.0d, 250.0d, 1.0d).setDescription(EncryptedString.of("Time in milliseconds to wait after resetting random speed"));
        this.randomization = new NumberSetting(EncryptedString.of("Chance"), 0.0d, 100.0d, 50.0d, 1.0d);
        this.yawAssist = new BooleanSetting(EncryptedString.of("Horizontal"), true);
        this.pitchAssist = new BooleanSetting(EncryptedString.of("Vertical"), true);
        this.waitFor = new NumberSetting(EncryptedString.of("Wait on Move"), 0.0d, 1000.0d, 0.0d, 1.0d).setDescription(EncryptedString.of("After you move your mouse aim assist will stop working for the selected amount of time"));
        this.lerp = (ModeSetting) new ModeSetting(EncryptedString.of("Lerp"), LerpMode.Normal, LerpMode.class).setDescription(EncryptedString.of("Linear interpolation to use to rotate"));
        this.posMode = (ModeSetting) new ModeSetting(EncryptedString.of("Pos mode"), PosMode.Normal, PosMode.class).setDescription(EncryptedString.of("Precision of the target position"));
        this.timer = new TimerUtils();
        this.resetSpeed = new TimerUtils();
        addSettings(this.stickyAim, this.onlyWeapon, this.onLeftClick, this.aimAt, this.stopAtTargetVertical, this.stopAtTargetHorizontal, this.radius, this.seeOnly, this.lookAtNearest, this.fov, this.pitchSpeed, this.yawSpeed, this.speedChange, this.randomization, this.yawAssist, this.pitchAssist, this.waitFor, this.lerp, this.posMode);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.move = true;
        this.pitch = this.pitchSpeed.getRandomValueFloat();
        this.yaw = this.yawSpeed.getRandomValueFloat();
        this.eventManager.add(HudListener.class, this);
        this.eventManager.add(MouseMoveListener.class, this);
        this.timer.reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(HudListener.class, this);
        this.eventManager.remove(MouseMoveListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        if (this.timer.delay(this.waitFor.getValueFloat()) && !this.move) {
            this.move = true;
            this.timer.reset();
        }
        if (this.mc.field_1724 == null || this.mc.field_1755 != null) {
            return;
        }
        if (this.onlyWeapon.getValue() && !WorldUtils.isWeapon(this.mc.field_1724.method_6047())) {
            return;
        }
        if (this.onLeftClick.getValue() && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1) {
            return;
        }
        class_1657 target = WorldUtils.findNearestPlayer(this.mc.field_1724, this.radius.getValueFloat(), this.seeOnly.getValue(), true);
        if (this.stickyAim.getValue()) {
            class_1309 class_1309VarMethod_6052 = this.mc.field_1724.method_6052();
            if (class_1309VarMethod_6052 instanceof class_1657) {
                class_1657 player = (class_1657) class_1309VarMethod_6052;
                if (player.method_5739(this.mc.field_1724) < this.radius.getValue()) {
                    target = player;
                }
            }
        }
        if (target == null) {
            return;
        }
        if (this.resetSpeed.delay(this.speedChange.getValueFloat())) {
            this.pitch = this.pitchSpeed.getRandomValueFloat();
            this.yaw = this.yawSpeed.getRandomValueFloat();
            this.resetSpeed.reset();
        }
        class_243 targetPos = this.posMode.isMode(PosMode.Normal) ? target.method_73189() : target.method_30950(RenderUtils.tickProgress());
        if (this.aimAt.isMode(AimMode.Chest)) {
            targetPos = targetPos.method_1031(0.0d, -0.5d, 0.0d);
        } else if (this.aimAt.isMode(AimMode.Legs)) {
            targetPos = targetPos.method_1031(0.0d, -1.2d, 0.0d);
        }
        if (this.lookAtNearest.getValue()) {
            double offsetX = this.mc.field_1724.method_23317() - target.method_23317() > 0.0d ? 0.29d : -0.29d;
            double offsetZ = this.mc.field_1724.method_23321() - target.method_23321() > 0.0d ? 0.29d : -0.29d;
            targetPos = targetPos.method_1031(offsetX, 0.0d, offsetZ);
        }
        Rotation rotation = RotationUtils.getDirection(this.mc.field_1724, targetPos);
        double angleToRotation = RotationUtils.getAngleToRotation(rotation);
        if (angleToRotation > ((double) this.fov.getValueInt()) / 2.0d) {
            return;
        }
        float yawStrength = this.yaw / 50.0f;
        float pitchStrength = this.pitch / 50.0f;
        float yaw = this.mc.field_1724.method_36454();
        float pitch = this.mc.field_1724.method_36455();
        if (this.lerp.isMode(LerpMode.Smoothstep)) {
            yaw = (float) smoothStepLerp(yawStrength, this.mc.field_1724.method_36454(), (float) rotation.yaw());
            pitch = (float) smoothStepLerp(pitchStrength, this.mc.field_1724.method_36455(), (float) rotation.pitch());
        }
        if (this.lerp.isMode(LerpMode.Normal)) {
            yaw = lerp(yawStrength, this.mc.field_1724.method_36454(), (float) rotation.yaw());
            pitch = lerp(pitchStrength, this.mc.field_1724.method_36455(), (float) rotation.pitch());
        }
        if (this.lerp.isMode(LerpMode.EaseOut)) {
            yaw = (float) easeOutBackDegrees(this.mc.field_1724.method_36454(), rotation.yaw(), yawStrength * RenderUtils.frameDelta());
            pitch = (float) easeOutBackDegrees(this.mc.field_1724.method_36455(), rotation.pitch(), pitchStrength * RenderUtils.frameDelta());
        }
        if (MathUtils.randomInt(1, 100) <= this.randomization.getValueInt() && this.move) {
            if (this.yawAssist.getValue()) {
                if (this.stopAtTargetHorizontal.getValue()) {
                    class_3966 hitResult = WorldUtils.getHitResult(this.radius.getValue());
                    if (hitResult instanceof class_3966) {
                        class_3966 hitResult2 = hitResult;
                        if (hitResult2.method_17782() == target) {
                            return;
                        }
                    }
                }
                this.mc.field_1724.method_36456(yaw);
            }
            if (this.pitchAssist.getValue()) {
                if (this.stopAtTargetVertical.getValue()) {
                    class_3966 hitResult3 = WorldUtils.getHitResult(this.radius.getValue());
                    if (hitResult3 instanceof class_3966) {
                        class_3966 hitResult4 = hitResult3;
                        if (hitResult4.method_17782() == target) {
                            return;
                        }
                    }
                }
                this.mc.field_1724.method_36457(pitch);
            }
        }
    }

    public float lerp(float delta, float start, float end) {
        return start + (class_3532.method_15393(end - start) * delta);
    }

    public static double easeOutBackDegrees(double start, double end, float speed) {
        double x = 1.0d - Math.pow(1.0d - ((double) speed), 3.0d);
        return start + (class_3532.method_15338(end - start) * (1.0d + (2.70158d * Math.pow(x - 1.0d, 3.0d)) + (1.70158d * Math.pow(x - 1.0d, 2.0d))));
    }

    public double smoothStepLerp(double delta, double start, double end) {
        double delta2 = Math.max(0.0d, Math.min(1.0d, delta));
        double t = delta2 * delta2 * (3.0d - (2.0d * delta2));
        double value = start + (class_3532.method_15338(end - start) * t);
        return value;
    }

    @Override // dev.lvstrng.argon.event.events.MouseMoveListener
    public void onMouseMove(MouseMoveListener.MouseMoveEvent event) {
        this.move = false;
        this.timer.reset();
    }
}
