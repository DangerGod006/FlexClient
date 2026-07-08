package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.utils.rotation.Rotation;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_4969;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/BlockUtils.class */
public final class BlockUtils {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !BlockUtils.class.desiredAssertionStatus();
    }

    public static boolean isBlock(class_2338 pos, class_2248 block) {
        return Argon.mc.field_1687.method_8320(pos).method_26204() == block;
    }

    public static void rotateToBlock(class_2338 pos) {
        if (!$assertionsDisabled && Argon.mc.field_1724 == null) {
            throw new AssertionError();
        }
        Rotation rotation = RotationUtils.getDirection(Argon.mc.field_1724, pos.method_46558());
        Argon.mc.field_1724.method_36457((float) rotation.pitch());
        Argon.mc.field_1724.method_36456((float) rotation.yaw());
    }

    public static boolean isAnchorCharged(class_2338 pos) {
        return isBlock(pos, class_2246.field_23152) && ((Integer) Argon.mc.field_1687.method_8320(pos).method_11654(class_4969.field_23153)).intValue() != 0;
    }

    public static boolean isAnchorNotCharged(class_2338 pos) {
        return isBlock(pos, class_2246.field_23152) && ((Integer) Argon.mc.field_1687.method_8320(pos).method_11654(class_4969.field_23153)).intValue() == 0;
    }

    public static boolean canPlaceBlockClient(class_2338 block) {
        class_2338 up = block.method_10084();
        if (!Argon.mc.field_1687.method_22347(up)) {
            return false;
        }
        double x = up.method_10263();
        double y = up.method_10264();
        double z = up.method_10260();
        List<class_1297> list = Argon.mc.field_1687.method_8335((class_1297) null, new class_238(x, y, z, x + 1.0d, y + 1.0d, z + 1.0d));
        list.removeIf(entity -> {
            return entity instanceof class_1542;
        });
        return list.isEmpty();
    }

    public static Stream<class_2338> getAllInBoxStream(class_2338 from, class_2338 to) {
        class_2338 min = new class_2338(Math.min(from.method_10263(), to.method_10263()), Math.min(from.method_10264(), to.method_10264()), Math.min(from.method_10260(), to.method_10260()));
        class_2338 max = new class_2338(Math.max(from.method_10263(), to.method_10263()), Math.max(from.method_10264(), to.method_10264()), Math.max(from.method_10260(), to.method_10260()));
        Stream<class_2338> stream = Stream.iterate(min, pos -> {
            int x = pos.method_10263();
            int y = pos.method_10264();
            int z = pos.method_10260();
            int x2 = x + 1;
            if (x2 > max.method_10263()) {
                x2 = min.method_10263();
                y++;
            }
            if (y > max.method_10264()) {
                y = min.method_10264();
                z++;
            }
            if (z > max.method_10260()) {
                throw new IllegalStateException("Stream limit didn't work.");
            }
            return new class_2338(x2, y, z);
        });
        int limit = ((max.method_10263() - min.method_10263()) + 1) * ((max.method_10264() - min.method_10264()) + 1) * ((max.method_10260() - min.method_10260()) + 1);
        return stream.limit(limit);
    }
}
