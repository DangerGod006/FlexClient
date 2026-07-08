package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/CrystalUtils.class */
public final class CrystalUtils {
    public static boolean canPlaceCrystalClient(class_2338 block) {
        class_2680 blockState = Argon.mc.field_1687.method_8320(block);
        if (!blockState.method_27852(class_2246.field_10540) && !blockState.method_27852(class_2246.field_9987)) {
            return false;
        }
        return canPlaceCrystalClientAssumeObsidian(block);
    }

    public static boolean canPlaceCrystalClientAssumeObsidian(class_2338 block) {
        class_2338 blockPos2 = block.method_10084();
        if (!Argon.mc.field_1687.method_22347(blockPos2)) {
            return false;
        }
        double d = blockPos2.method_10263();
        double e = blockPos2.method_10264();
        double f = blockPos2.method_10260();
        List<class_1297> list = Argon.mc.field_1687.method_8335((class_1297) null, new class_238(d, e, f, d + 1.0d, e + 2.0d, f + 1.0d));
        return list.isEmpty();
    }

    public static boolean canPlaceCrystalServer(class_2338 pos) {
        class_2680 blockState = Argon.mc.field_1687.method_8320(pos);
        if (!blockState.method_27852(class_2246.field_10540) || !blockState.method_27852(class_2246.field_9987)) {
            return false;
        }
        class_2338 blockPos = pos.method_10084();
        if (!Argon.mc.field_1687.method_22347(blockPos)) {
            return false;
        }
        double d = blockPos.method_10263();
        double e = blockPos.method_10264();
        double f = blockPos.method_10260();
        List<class_1297> list = Argon.mc.field_1687.method_8335((class_1297) null, new class_238(d, e, f, d + 1.0d, e + 2.0d, f + 1.0d));
        return list.isEmpty();
    }
}
