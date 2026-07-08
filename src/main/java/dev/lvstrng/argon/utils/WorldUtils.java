package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.modules.client.Friends;
import java.util.Objects;
import java.util.stream.Stream;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1675;
import net.minecraft.class_1799;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/WorldUtils.class */
public final class WorldUtils {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !WorldUtils.class.desiredAssertionStatus();
    }

    public static boolean isDeadBodyNearby() {
        return Argon.mc.field_1687.method_18456().parallelStream().filter(e -> {
            return e != Argon.mc.field_1724;
        }).filter(e2 -> {
            return e2.method_5858(Argon.mc.field_1724) <= 36.0d;
        }).anyMatch((v0) -> {
            return v0.method_29504();
        });
    }

    public static class_1297 findNearestEntity(class_1657 toPlayer, float radius, boolean seeOnly) {
        float mr = Float.MAX_VALUE;
        class_1297 entity = null;
        if (!$assertionsDisabled && Argon.mc.field_1687 == null) {
            throw new AssertionError();
        }
        for (class_1297 e : Argon.mc.field_1687.method_18112()) {
            float d = e.method_5739(toPlayer);
            if (e != toPlayer && d <= radius && Argon.mc.field_1724.method_6057(e) == seeOnly && d < mr) {
                mr = d;
                entity = e;
            }
        }
        return entity;
    }

    public static double distance(class_243 fromVec, class_243 toVec) {
        return Math.sqrt(Math.pow(toVec.field_1352 - fromVec.field_1352, 2.0d) + Math.pow(toVec.field_1351 - fromVec.field_1351, 2.0d) + Math.pow(toVec.field_1350 - fromVec.field_1350, 2.0d));
    }

    public static class_1657 findNearestPlayer(class_1657 toPlayer, float range, boolean seeOnly, boolean excludeFriends) {
        float minRange = Float.MAX_VALUE;
        class_1657 minPlayer = null;
        for (class_1657 player : Argon.mc.field_1687.method_18456()) {
            float distance = (float) distance(toPlayer.method_73189(), player.method_73189());
            if (!excludeFriends || !((Friends) Argon.INSTANCE.getModuleManager().getModule(Friends.class)).disableAimAssist.getValue() || !Argon.INSTANCE.getFriendManager().isFriend(player)) {
                if (player != toPlayer && distance <= range && player.method_6057(toPlayer) == seeOnly && distance < minRange) {
                    minRange = distance;
                    minPlayer = player;
                }
            }
        }
        return minPlayer;
    }

    public static class_243 getPlayerLookVec(float yaw, float pitch) {
        float f = pitch * 0.017453292f;
        float g = (-yaw) * 0.017453292f;
        float h = class_3532.method_15362(g);
        float i = class_3532.method_15374(g);
        float j = class_3532.method_15362(f);
        float k = class_3532.method_15374(f);
        return new class_243(i * j, -k, h * j);
    }

    public static class_243 getPlayerLookVec(class_1657 player) {
        return getPlayerLookVec(player.method_36454(), player.method_36455());
    }

    public static class_239 getHitResult(double radius) {
        return getHitResult(Argon.mc.field_1724, false, Argon.mc.field_1724.method_36454(), Argon.mc.field_1724.method_36455(), radius);
    }

    public static class_239 getHitResult(class_1657 entity, boolean ignoreInvisibles, float yaw, float pitch, double distance) {
        class_3965 class_3965VarMethod_17778;
        if (entity == null || Argon.mc.field_1687 == null) {
            return null;
        }
        class_243 cameraPosVec = entity.method_5836(RenderUtils.tickProgress());
        class_243 rotationVec = getPlayerLookVec(yaw, pitch);
        class_243 range = cameraPosVec.method_1031(rotationVec.field_1352 * distance, rotationVec.field_1351 * distance, rotationVec.field_1350 * distance);
        class_3965 class_3965VarMethod_17742 = Argon.mc.field_1687.method_17742(new class_3959(cameraPosVec, range, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, entity));
        double e = distance * distance;
        if (class_3965VarMethod_17742 != null) {
            e = class_3965VarMethod_17742.method_17784().method_1025(cameraPosVec);
        }
        class_243 vec3d3 = cameraPosVec.method_1031(rotationVec.field_1352 * distance, rotationVec.field_1351 * distance, rotationVec.field_1350 * distance);
        class_238 box = entity.method_5829().method_18804(rotationVec.method_1021(distance)).method_1009(1.0d, 1.0d, 1.0d);
        class_3965 class_3965VarMethod_18075 = class_1675.method_18075(entity, cameraPosVec, vec3d3, box, entityx -> {
            return (entityx.method_7325() || !entityx.method_5863() || (entityx.method_5767() && ignoreInvisibles)) ? false : true;
        }, e);
        if (class_3965VarMethod_18075 != null) {
            class_243 vec3d4 = class_3965VarMethod_18075.method_17784();
            double g = cameraPosVec.method_1025(vec3d4);
            if ((distance > distance && g > Math.pow(distance, 2.0d)) || g < e || class_3965VarMethod_17742 == null) {
                if (g > Math.pow(distance, 2.0d)) {
                    class_3965VarMethod_17778 = class_3965.method_17778(vec3d4, class_2350.method_10142(rotationVec.field_1352, rotationVec.field_1351, rotationVec.field_1350), class_2338.method_49638(vec3d4));
                } else {
                    class_3965VarMethod_17778 = class_3965VarMethod_18075;
                }
                class_3965VarMethod_17742 = class_3965VarMethod_17778;
            }
        }
        return class_3965VarMethod_17742;
    }

    public static void placeBlock(class_3965 blockHit, boolean swingHand) {
        class_1269 result = Argon.mc.field_1761.method_2896(Argon.mc.field_1724, class_1268.field_5808, blockHit);
        if (!result.method_23665() || !swingHand) {
            return;
        }
        Argon.mc.field_1724.method_6104(class_1268.field_5808);
    }

    public static Stream<class_2818> getLoadedChunks() {
        int radius = Math.max(2, Argon.mc.field_1690.method_38521()) + 3;
        int diameter = (radius * 2) + 1;
        class_1923 center = Argon.mc.field_1724.method_31476();
        class_1923 min = new class_1923(center.field_9181 - radius, center.field_9180 - radius);
        class_1923 max = new class_1923(center.field_9181 + radius, center.field_9180 + radius);
        return Stream.iterate(min, pos -> {
            int x = pos.field_9181;
            int z = pos.field_9180;
            int x2 = x + 1;
            if (x2 > max.field_9181) {
                x2 = min.field_9181;
                z++;
            }
            if (z > max.field_9180) {
                throw new IllegalStateException("Stream limit didn't work.");
            }
            return new class_1923(x2, z);
        }).limit(((long) diameter) * ((long) diameter)).filter(c -> {
            return Argon.mc.field_1687.method_8393(c.field_9181, c.field_9180);
        }).map(c2 -> {
            return Argon.mc.field_1687.method_8497(c2.field_9181, c2.field_9180);
        }).filter((v0) -> {
            return Objects.nonNull(v0);
        });
    }

    public static boolean isShieldFacingAway(class_1657 player) {
        if (Argon.mc.field_1724 != null && player != null) {
            class_243 playerPos = Argon.mc.field_1724.method_73189();
            class_243 targetPos = player.method_73189();
            class_243 directionToPlayer = playerPos.method_1020(targetPos).method_1029();
            float yaw = player.method_36454();
            float pitch = player.method_36455();
            class_243 facingDirection = new class_243((-Math.sin(Math.toRadians(yaw))) * Math.cos(Math.toRadians(pitch)), -Math.sin(Math.toRadians(pitch)), Math.cos(Math.toRadians(yaw)) * Math.cos(Math.toRadians(pitch))).method_1029();
            double dotProduct = facingDirection.method_1026(directionToPlayer);
            return dotProduct < 0.0d;
        }
        return false;
    }

    public static boolean isSword(class_1799 itemStack) {
        return itemStack.method_31573(class_3489.field_42611);
    }

    public static boolean isAxe(class_1799 itemStack) {
        return itemStack.method_31573(class_3489.field_42612);
    }

    public static boolean isWeapon(class_1799 itemStack) {
        return isSword(itemStack) || isAxe(itemStack);
    }

    public static boolean isTool(class_1799 itemStack) {
        return isWeapon(itemStack) || itemStack.method_31573(class_3489.field_42614) || itemStack.method_31573(class_3489.field_42615) || itemStack.method_31573(class_3489.field_42613);
    }

    public static boolean isCrit(class_1657 player, class_1297 target) {
        return (player.method_7261(0.5f) <= 0.9f || player.field_6017 <= 0.0d || player.method_24828() || player.method_6101() || player.method_5869() || player.method_6059(class_1294.field_5919) || !(target instanceof class_1309)) ? false : true;
    }

    public static void hitEntity(class_1297 entity, boolean swingHand) {
        Argon.mc.field_1761.method_2918(Argon.mc.field_1724, entity);
        if (swingHand) {
            Argon.mc.field_1724.method_6104(class_1268.field_5808);
        }
    }
}
