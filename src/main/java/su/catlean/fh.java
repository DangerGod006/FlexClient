package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fh.class */
final class fh {

    @NotNull
    private final class_1297 f;
    private final float g;
    private final double r;
    private final double P;
    private final double o;
    private int C;
    private static final long a = 0;
    private static final String b = null;
    private static final long c = 0;

    public fh(@NotNull class_1297 entity, float hp, double posX, double posY, long a2, double posZ, int ticks) {
        long j = a ^ a2;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5559238187300696337L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entity, b);
        try {
            this.f = entity;
            this.g = hp;
            this.r = posX;
            this.P = posY;
            this.o = posZ;
            this.C = ticks;
            if (obj == null) {
                obj = new _g[1];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5563020563082069774L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5580202469138731718L, j) /* invoke-custom */;
        }
    }

    public fh(class_1297 class_1297Var, float f, double d, double d2, double d3, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(class_1297Var, f, d, d2, (a ^ j) ^ 109669433823135L, d3, (i2 & ((int) c)) != 0 ? 0 : i);
    }

    @NotNull
    public final class_1297 x() {
        return this.f;
    }

    public final float Z() {
        return this.g;
    }

    public final double z() {
        return this.r;
    }

    public final double D() {
        return this.P;
    }

    public final double M() {
        return this.o;
    }

    public final int k() {
        return this.C;
    }

    public final void J(int i) {
        this.C = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [float] */
    public final float s(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 92417173860633L;
        Object objT = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3408422373891462010L, j2) /* invoke-custom */;
        try {
            objT = jl.y.T(RangesKt.coerceAtLeast(this.C - 1.0f, 0.0f), this.C, j3);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3399849089144074687L, j2) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[4], 3354647753938035602L, j2) /* invoke-custom */;
            }
            return objT;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, 3394477369989722285L, j2) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
