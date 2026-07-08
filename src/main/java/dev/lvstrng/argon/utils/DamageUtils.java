package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiFunction;
import net.minecraft.class_1267;
import net.minecraft.class_1280;
import net.minecraft.class_1282;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_1927;
import net.minecraft.class_1934;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2902;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5134;
import net.minecraft.class_640;
import org.joml.Math;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/DamageUtils.class */
public class DamageUtils {
    public static final RaycastFactory HIT_FACTORY = (context, blockPos) -> {
        class_2680 blockState = Argon.mc.field_1687.method_8320(blockPos);
        if (blockState.method_26204().method_9520() < 600.0f) {
            return null;
        }
        return blockState.method_26220(Argon.mc.field_1687, blockPos).method_1092(context.start(), context.end(), blockPos);
    };

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/DamageUtils$RaycastFactory.class */
    @FunctionalInterface
    public interface RaycastFactory extends BiFunction<ExposureRaycastContext, class_2338, class_3965> {
    }

    private DamageUtils() {
    }

    public static float crystalDamage(class_1309 target, class_243 targetPos, class_238 targetBox, class_243 explosionPos, RaycastFactory raycastFactory) {
        return explosionDamage(target, targetPos, targetBox, explosionPos, 12.0f, raycastFactory);
    }

    public static float bedDamage(class_1309 target, class_243 targetPos, class_238 targetBox, class_243 explosionPos, RaycastFactory raycastFactory) {
        return explosionDamage(target, targetPos, targetBox, explosionPos, 10.0f, raycastFactory);
    }

    public static float anchorDamage(class_1309 target, class_243 targetPos, class_238 targetBox, class_243 explosionPos, RaycastFactory raycastFactory) {
        return explosionDamage(target, targetPos, targetBox, explosionPos, 10.0f, raycastFactory);
    }

    public static float explosionDamage(class_1309 target, class_243 targetPos, class_238 targetBox, class_243 explosionPos, float power, RaycastFactory raycastFactory) {
        double modDistance = distance(targetPos.field_1352, targetPos.field_1351, targetPos.field_1350, explosionPos.field_1352, explosionPos.field_1351, explosionPos.field_1350);
        if (modDistance > power) {
            return 0.0f;
        }
        double exposure = getExposure(explosionPos, targetBox, raycastFactory);
        double impact = (1.0d - (modDistance / ((double) power))) * exposure;
        float damage = (int) (((((impact * impact) + impact) / 2.0d) * 7.0d * 12.0d) + 1.0d);
        return calculateReductions(damage, target, Argon.mc.field_1687.method_48963().method_48807((class_1927) null));
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(squaredDistance(x1, y1, z1, x2, y2, z2));
    }

    public static double distanceTo(class_1297 entity) {
        return distanceTo(entity.method_23317(), entity.method_23318(), entity.method_23321());
    }

    public static double distanceTo(class_2338 blockPos) {
        return distanceTo(blockPos.method_10263(), blockPos.method_10264(), blockPos.method_10260());
    }

    public static double distanceTo(class_243 vec3d) {
        return distanceTo(vec3d.method_10216(), vec3d.method_10214(), vec3d.method_10215());
    }

    public static double distanceTo(double x, double y, double z) {
        return Math.sqrt(squaredDistanceTo(x, y, z));
    }

    public static double squaredDistanceTo(class_1297 entity) {
        return squaredDistanceTo(entity.method_23317(), entity.method_23318(), entity.method_23321());
    }

    public static double squaredDistanceTo(class_2338 blockPos) {
        return squaredDistanceTo(blockPos.method_10263(), blockPos.method_10264(), blockPos.method_10260());
    }

    public static double squaredDistanceTo(double x, double y, double z) {
        return squaredDistance(Argon.mc.field_1724.method_23317(), Argon.mc.field_1724.method_23318(), Argon.mc.field_1724.method_23321(), x, y, z);
    }

    public static double squaredDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        double f = x1 - x2;
        double g = y1 - y2;
        double h = z1 - z2;
        return Math.fma(f, f, Math.fma(g, g, h * h));
    }

    public static float crystalDamage(class_1309 target, class_243 crystal, boolean predictMovement, class_2338 obsidianPos) {
        return overridingExplosionDamage(target, crystal, 12.0f, predictMovement, obsidianPos, class_2246.field_10540.method_9564());
    }

    public static float crystalDamage(class_1309 target, class_243 crystal) {
        return explosionDamage(target, crystal, 12.0f, false);
    }

    public static float bedDamage(class_1309 target, class_243 bed) {
        return explosionDamage(target, bed, 10.0f, false);
    }

    public static float anchorDamage(class_1309 target, class_243 anchor) {
        return overridingExplosionDamage(target, anchor, 10.0f, false, class_2338.method_49638(anchor), class_2246.field_10124.method_9564());
    }

    private static float overridingExplosionDamage(class_1309 target, class_243 explosionPos, float power, boolean predictMovement, class_2338 overridePos, class_2680 overrideState) {
        return explosionDamage(target, explosionPos, power, predictMovement, getOverridingHitFactory(overridePos, overrideState));
    }

    private static float explosionDamage(class_1309 target, class_243 explosionPos, float power, boolean predictMovement) {
        return explosionDamage(target, explosionPos, power, predictMovement, HIT_FACTORY);
    }

    public static class_1934 getGameMode(class_1657 player) {
        class_640 playerListEntry = Argon.mc.method_1562().method_2871(player.method_5667());
        return playerListEntry == null ? class_1934.field_9219 : playerListEntry.method_2958();
    }

    private static float explosionDamage(class_1309 target, class_243 explosionPos, float power, boolean predictMovement, RaycastFactory raycastFactory) {
        if (target == null) {
            return 0.0f;
        }
        if (target instanceof class_1657) {
            class_1657 player = (class_1657) target;
            if (getGameMode(player) == class_1934.field_9220) {
                return 0.0f;
            }
        }
        class_243 position = predictMovement ? target.method_73189().method_1019(target.method_18798()) : target.method_73189();
        class_238 box = target.method_5829();
        if (predictMovement) {
            box = box.method_997(target.method_18798());
        }
        return explosionDamage(target, position, box, explosionPos, power, raycastFactory);
    }

    public static RaycastFactory getOverridingHitFactory(class_2338 overridePos, class_2680 overrideState) {
        return (context, blockPos) -> {
            class_2680 blockState;
            if (blockPos.equals(overridePos)) {
                blockState = overrideState;
            } else {
                blockState = Argon.mc.field_1687.method_8320(blockPos);
                if (blockState.method_26204().method_9520() < 600.0f) {
                    return null;
                }
            }
            return blockState.method_26220(Argon.mc.field_1687, blockPos).method_1092(context.start(), context.end(), blockPos);
        };
    }

    public static float getAttackDamage(class_1309 attacker, class_1309 target) {
        class_1282 class_1282VarMethod_48812;
        float itemDamage = (float) attacker.method_45325(class_5134.field_23721);
        if (attacker instanceof class_1657) {
            class_1657 player = (class_1657) attacker;
            class_1282VarMethod_48812 = Argon.mc.field_1687.method_48963().method_48802(player);
        } else {
            class_1282VarMethod_48812 = Argon.mc.field_1687.method_48963().method_48812(attacker);
        }
        class_1282 damageSource = class_1282VarMethod_48812;
        attacker.method_59958();
        float enchantDamage = 0.0f;
        if (attacker instanceof class_1657) {
            class_1657 playerEntity = (class_1657) attacker;
            float charge = playerEntity.method_7261(0.5f);
            itemDamage *= 0.2f + (charge * charge * 0.8f);
            enchantDamage = 0.0f * charge;
            if (charge > 0.9f && attacker.field_6017 > 0.0d && !attacker.method_24828() && !attacker.method_6101() && !attacker.method_5799() && !attacker.method_6059(class_1294.field_5919) && !attacker.method_5765()) {
                itemDamage *= 1.5f;
            }
        }
        float damage = itemDamage + enchantDamage;
        return calculateReductions(damage, target, damageSource);
    }

    public static float fallDamage(class_1309 entity) {
        if (entity instanceof class_1657) {
            class_1657 player = (class_1657) entity;
            if (player.method_31549().field_7479) {
                return 0.0f;
            }
        }
        if (entity.method_6059(class_1294.field_5906) || entity.method_6059(class_1294.field_5902)) {
            return 0.0f;
        }
        int surface = Argon.mc.field_1687.method_8500(entity.method_24515()).method_12032(class_2902.class_2903.field_13197).method_12603(entity.method_31477() & 15, entity.method_31479() & 15);
        if (entity.method_31478() >= surface) {
            return fallDamageReductions(entity, surface);
        }
        class_3965 raycastResult = Argon.mc.field_1687.method_17742(new class_3959(entity.method_73189(), new class_243(entity.method_23317(), Argon.mc.field_1687.method_31607(), entity.method_23321()), class_3959.class_3960.field_17558, class_3959.class_242.field_36338, entity));
        if (raycastResult.method_17783() == class_239.class_240.field_1333) {
            return 0.0f;
        }
        return fallDamageReductions(entity, raycastResult.method_17777().method_10264());
    }

    private static float fallDamageReductions(class_1309 entity, int surface) {
        int fallHeight = (int) (((entity.method_23318() - ((double) surface)) + entity.field_6017) - 3.0d);
        class_1293 jumpBoostInstance = entity.method_6112(class_1294.field_5913);
        if (jumpBoostInstance != null) {
            fallHeight -= jumpBoostInstance.method_5578() + 1;
        }
        return calculateReductions(fallHeight, entity, Argon.mc.field_1687.method_48963().method_48827());
    }

    /* JADX INFO: renamed from: dev.lvstrng.argon.utils.DamageUtils$1, reason: invalid class name */
    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/DamageUtils$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$world$Difficulty = new int[class_1267.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$world$Difficulty[class_1267.field_5805.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$world$Difficulty[class_1267.field_5807.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public static float calculateReductions(float damage, class_1309 entity, class_1282 damageSource) {
        if (damageSource.method_5514()) {
            switch (AnonymousClass1.$SwitchMap$net$minecraft$world$Difficulty[Argon.mc.field_1687.method_8407().ordinal()]) {
                case 1:
                    damage = Math.min((damage / 2.0f) + 1.0f, damage);
                    break;
                case 2:
                    damage *= 1.5f;
                    break;
            }
        }
        return Math.max(protectionReduction(entity, resistanceReduction(entity, class_1280.method_5496(entity, damage, damageSource, getArmor(entity), (float) entity.method_45325(class_5134.field_23725))), damageSource), 0.0f);
    }

    private static float getArmor(class_1309 entity) {
        return (float) Math.floor(entity.method_45325(class_5134.field_23724));
    }

    private static float protectionReduction(class_1309 player, float damage, class_1282 source) {
        return class_1280.method_5497(damage, 0.0f);
    }

    private static float resistanceReduction(class_1309 player, float damage) {
        class_1293 resistance = player.method_6112(class_1294.field_5907);
        if (resistance != null) {
            int lvl = resistance.method_5578() + 1;
            damage *= 1.0f - (lvl * 0.2f);
        }
        return Math.max(damage, 0.0f);
    }

    private static float getExposure(class_243 source, class_238 box, RaycastFactory raycastFactory) {
        double xDiff = box.field_1320 - box.field_1323;
        double yDiff = box.field_1325 - box.field_1322;
        double zDiff = box.field_1324 - box.field_1321;
        double xStep = 1.0d / ((xDiff * 2.0d) + 1.0d);
        double yStep = 1.0d / ((yDiff * 2.0d) + 1.0d);
        double zStep = 1.0d / ((zDiff * 2.0d) + 1.0d);
        if (xStep > 0.0d && yStep > 0.0d && zStep > 0.0d) {
            int misses = 0;
            int hits = 0;
            double xOffset = (1.0d - (Math.floor(1.0d / xStep) * xStep)) * 0.5d;
            double zOffset = (1.0d - (Math.floor(1.0d / zStep) * zStep)) * 0.5d;
            double xStep2 = xStep * xDiff;
            double yStep2 = yStep * yDiff;
            double zStep2 = zStep * zDiff;
            double startX = box.field_1323 + xOffset;
            double startY = box.field_1322;
            double startZ = box.field_1321 + zOffset;
            double endX = box.field_1320 + xOffset;
            double endY = box.field_1325;
            double endZ = box.field_1324 + zOffset;
            double d = startX;
            while (true) {
                double x = d;
                if (x <= endX) {
                    double d2 = startY;
                    while (true) {
                        double y = d2;
                        if (y <= endY) {
                            double d3 = startZ;
                            while (true) {
                                double z = d3;
                                if (z <= endZ) {
                                    class_243 position = new class_243(x, y, z);
                                    if (raycast(new ExposureRaycastContext(position, source), raycastFactory) == null) {
                                        misses++;
                                    }
                                    hits++;
                                    d3 = z + zStep2;
                                }
                            }
                            d2 = y + yStep2;
                        }
                    }
                    d = x + xStep2;
                } else {
                    return misses / hits;
                }
            }
        } else {
            return 0.0f;
        }
    }

    private static class_3965 raycast(ExposureRaycastContext context, RaycastFactory raycastFactory) {
        return (class_3965) class_1922.method_17744(context.start, context.end, context, raycastFactory, ctx -> {
            return null;
        });
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext.class */
    public static final class ExposureRaycastContext extends Record {
        private final class_243 start;
        private final class_243 end;

        public ExposureRaycastContext(class_243 start, class_243 end) {
            this.start = start;
            this.end = end;
        }

        @Override // java.lang.Record
        public final String toString() {
            return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, ExposureRaycastContext.class), ExposureRaycastContext.class, "start;end", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->start:Lnet/minecraft/class_243;", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->end:Lnet/minecraft/class_243;").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final int hashCode() {
            return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, ExposureRaycastContext.class), ExposureRaycastContext.class, "start;end", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->start:Lnet/minecraft/class_243;", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->end:Lnet/minecraft/class_243;").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final boolean equals(Object o) {
            return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, ExposureRaycastContext.class, Object.class), ExposureRaycastContext.class, "start;end", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->start:Lnet/minecraft/class_243;", "FIELD:Ldev/lvstrng/argon/utils/DamageUtils$ExposureRaycastContext;->end:Lnet/minecraft/class_243;").dynamicInvoker().invoke(this, o) /* invoke-custom */;
        }

        public class_243 start() {
            return this.start;
        }

        public class_243 end() {
            return this.end;
        }
    }
}
