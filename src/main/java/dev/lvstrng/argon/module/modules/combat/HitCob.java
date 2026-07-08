package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.RotationUtils;
import dev.lvstrng.argon.utils.rotation.Rotation;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/HitCob.class */
public final class HitCob extends Module implements AttackListener {
    private static final double SPEED_STOPPED = 0.05d;
    private static final double SPEED_WALKING = 0.13d;
    private static final double SPEED_SPRINTING = 0.26d;
    private final BooleanSetting instantRotate;
    private final BooleanSetting placeOnFeet;
    private final BooleanSetting predictKnockback;
    private final NumberSetting range;

    public HitCob() {
        super(EncryptedString.of("Hit Cob"), EncryptedString.of("Places cobweb at target feet on hit"), -1, Category.COMBAT);
        this.instantRotate = new BooleanSetting(EncryptedString.of("Instant Rotate"), true).setDescription(EncryptedString.of("Silently rotates to placement position before placing"));
        this.placeOnFeet = new BooleanSetting(EncryptedString.of("Place On Feet"), false).setDescription(EncryptedString.of("Always place exactly at target feet, ignoring knockback prediction"));
        this.predictKnockback = new BooleanSetting(EncryptedString.of("Predict Knockback"), true).setDescription(EncryptedString.of("Predicts where target will land after knockback and places there"));
        this.range = new NumberSetting(EncryptedString.of("Range"), 2.0d, 6.0d, 4.5d, 0.1d).setDescription(EncryptedString.of("Max distance to target to place cobweb"));
        addSettings(this.instantRotate, this.placeOnFeet, this.predictKnockback, this.range);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(AttackListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(AttackListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        class_2338 placePos;
        double knockbackDist;
        if (this.mc.field_1724 == null || this.mc.field_1687 == null || this.mc.field_1765 == null || this.mc.field_1765.method_17783() != class_239.class_240.field_1331) {
            return;
        }
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 eHit = class_3966Var;
            class_1309 class_1309VarMethod_17782 = eHit.method_17782();
            if (class_1309VarMethod_17782 instanceof class_1309) {
                class_1309 target = class_1309VarMethod_17782;
                int webSlot = findCobwebSlot();
                if (webSlot == -1) {
                    return;
                }
                class_2338 feetPos = target.method_24515();
                double dist = this.mc.field_1724.method_73189().method_1022(class_243.method_24953(feetPos));
                if (dist <= this.range.getValue() && this.mc.field_1687.method_8320(feetPos).method_26204() != class_2246.field_10343 && this.mc.field_1687.method_8320(feetPos.method_10074()).method_26212(this.mc.field_1687, feetPos.method_10074())) {
                    if (!this.placeOnFeet.getValue() && this.predictKnockback.getValue()) {
                        class_243 vel = target.method_18798();
                        double speed = Math.hypot(vel.field_1352, vel.field_1350);
                        if (speed < SPEED_STOPPED) {
                            knockbackDist = this.mc.field_1724.method_5624() ? 1.8d : 1.2d;
                        } else if (speed < SPEED_WALKING) {
                            knockbackDist = this.mc.field_1724.method_5624() ? 1.5d : 1.0d;
                        } else {
                            knockbackDist = this.mc.field_1724.method_5624() ? 1.2d : 0.8d;
                        }
                        class_243 direction = target.method_73189().method_1020(this.mc.field_1724.method_73189()).method_1029();
                        class_243 predicted = target.method_73189().method_1019(direction.method_1021(knockbackDist));
                        class_2338 predictedFeet = class_2338.method_49638(predicted);
                        boolean predictedValid = this.mc.field_1687.method_8320(predictedFeet).method_26204() != class_2246.field_10343 && this.mc.field_1687.method_8320(predictedFeet).method_26215() && this.mc.field_1687.method_8320(predictedFeet.method_10074()).method_26212(this.mc.field_1687, predictedFeet.method_10074()) && this.mc.field_1724.method_73189().method_1022(class_243.method_24953(predictedFeet)) <= this.range.getValue();
                        placePos = predictedValid ? predictedFeet : feetPos;
                    } else {
                        placePos = feetPos;
                    }
                    if (this.mc.field_1687.method_8320(placePos).method_26215() && this.mc.field_1687.method_8320(placePos.method_10074()).method_26212(this.mc.field_1687, placePos.method_10074())) {
                        int originalSlot = this.mc.field_1724.method_31548().method_67532();
                        float originalYaw = this.mc.field_1724.method_36454();
                        float originalPitch = this.mc.field_1724.method_36455();
                        if (this.instantRotate.getValue()) {
                            class_243 hitVec = class_243.method_24953(placePos).method_1031(0.0d, 0.5d, 0.0d);
                            Rotation rot = RotationUtils.getDirection(this.mc.field_1724, hitVec);
                            this.mc.field_1724.method_36456((float) rot.yaw());
                            this.mc.field_1724.method_36457((float) rot.pitch());
                        }
                        this.mc.field_1724.method_31548().method_61496(webSlot);
                        class_243 hitVec2 = class_243.method_24953(placePos).method_1031(0.0d, 0.5d, 0.0d);
                        class_3965 blockHit = new class_3965(hitVec2, class_2350.field_11036, placePos, false);
                        this.mc.field_1761.method_2896(this.mc.field_1724, class_1268.field_5808, blockHit);
                        this.mc.field_1724.method_31548().method_61496(originalSlot);
                        if (this.instantRotate.getValue()) {
                            this.mc.field_1724.method_36456(originalYaw);
                            this.mc.field_1724.method_36457(originalPitch);
                        }
                    }
                }
            }
        }
    }

    private int findCobwebSlot() {
        for (int i = 0; i < 9; i++) {
            class_1799 stack = this.mc.field_1724.method_31548().method_5438(i);
            if (!stack.method_7960() && stack.method_31574(class_1802.field_8786)) {
                return i;
            }
        }
        return -1;
    }
}
