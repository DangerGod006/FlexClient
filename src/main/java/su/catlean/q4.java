package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q4.class */
public final class q4 extends _g {

    @NotNull
    public static final q4 c;
    static final KProperty[] e;

    @NotNull
    private static final a6 W;

    @NotNull
    private static final cr N;

    @NotNull
    private static final c8 x;

    @NotNull
    private static final c8 b;

    @NotNull
    private static final cw P;

    @NotNull
    private static final c8 y;

    @NotNull
    private static final cq u;

    @NotNull
    private static final bg l;
    private static boolean t;
    private static int A;
    private static final long a = yz.a(-6680767085894232486L, -3152355307944075782L, MethodHandles.lookup().lookupClass()).a(209676086885715L);
    private static final String[] d;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private q4(short s, int i2, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29554, 1025479264430479271L ^ j2) /* invoke-custom */, jt.I(), null, 4, null, j2 ^ 53799671550624L);
    }

    private final id E(long j2) {
        return (id) W.E(this, (a ^ j2) ^ 4619751529976L, e[0]);
    }

    private final void p(long j2, id idVar) {
        W.b(this, (a ^ j2) ^ 13073968939103L, e[0], idVar);
    }

    private static void w() {
    }

    private final nv F(long j2) {
        return (nv) N.E(this, (a ^ j2) ^ 47063349674449L, e[1]);
    }

    private final void M(int i2, short s, nv nvVar, char c2) {
        N.b(this, ((((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 133038570842819L, e[1], nvVar);
    }

    private final int D(int i2, char c2, short s) {
        return ((Number) x.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 130295500229357L, e[2])).intValue();
    }

    private final void z(int i2, int i3, long j2) {
        x.b(this, (((((long) i3) << 32) | ((j2 << 32) >>> 32)) ^ a) ^ 88349586857855L, e[2], Integer.valueOf(i2));
    }

    private final int s(long j2) {
        return ((Number) b.E(this, (a ^ j2) ^ 114849333273846L, e[3])).intValue();
    }

    private final void m(int i2, long j2) {
        b.b(this, (a ^ j2) ^ 58612417734756L, e[3], Integer.valueOf(i2));
    }

    private final r7 H(long j2) {
        return (r7) P.E(this, (a ^ j2) ^ 114450575761141L, e[4]);
    }

    private final int R(long j2) {
        return ((Number) y.E(this, (a ^ j2) ^ 95296027935534L, e[5])).intValue();
    }

    private final boolean W(long j2) {
        long j3 = a ^ j2;
        return ((Boolean) u.E(this, j3 ^ 96362563446907L, e[(int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16541, 1829652911696058098L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r30v2, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void A(PlayerUpdateEvent playerUpdateEvent) {
        long j2 = a ^ 112932953386487L;
        long j3 = j2 ^ 105454901868225L;
        long j4 = j2 ^ 140040261316309L;
        long j5 = j2 ^ 89018422651678L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 90631366201017L;
        long j7 = j2 ^ 85772908774661L;
        long j8 = j2 ^ 48477314773351L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6680939193804190151L, j2) /* invoke-custom */;
        try {
            r0 = A;
            ?? IsEmpty = r0;
            if (r0 != 0) {
                if (r0 > 0) {
                    A--;
                    return;
                }
                IsEmpty = yl.g.m().H(j3).r().isEmpty();
            }
            ?? r02 = IsEmpty;
            if (r0 != 0) {
                if (IsEmpty != 0) {
                    return;
                } else {
                    r02 = 0;
                }
            }
            ?? r30 = r02;
            class_1703 class_1703Var = zf.v(j8).field_7512;
            Intrinsics.checkNotNullExpressionValue(class_1703Var, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19478, 3325023096456104116L ^ j2) /* invoke-custom */);
            Iterator it = z(class_1703Var, j6).iterator();
            Intrinsics.checkNotNullExpressionValue(it, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1270, 2479891933642031180L ^ j2) /* invoke-custom */);
            loop0: while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3120, 8821065453102729371L ^ j2) /* invoke-custom */);
                ag.e(((Number) next).intValue(), j4, 0, null, false, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11830, 8972924391482703411L ^ j2) /* invoke-custom */, null);
                r30++;
                while (r30 >= s(j7)) {
                    if (r0 != 0) {
                        break loop0;
                    }
                }
            }
            A = D(i2, (char) i3, (short) i4);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6678635930223365188L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0161 -> B:69:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int J(short r8, net.minecraft.class_1792 r9, net.minecraft.class_1703 r10, long r11, kotlin.ranges.IntRange r13) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.J(short, net.minecraft.class_1792, net.minecraft.class_1703, long, kotlin.ranges.IntRange):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.ranges.IntRange] */
    private final IntRange R(int i2, long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ a;
        Object intRange = i2;
        try {
            switch (intRange) {
                case 46:
                    intRange = new IntRange((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30995, 1020449380445932831L ^ j3) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14910, 5775501575471369780L ^ j3) /* invoke-custom */);
                    return intRange;
                case 63:
                    return new IntRange(0, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32683, 6523692255363025827L ^ j3) /* invoke-custom */);
                default:
                    return new IntRange(0, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17182, 6674165468687726347L ^ j3) /* invoke-custom */);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(intRange, -8693358637187459146L, j3) /* invoke-custom */;
        }
        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(intRange, -8693358637187459146L, j3) /* invoke-custom */;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.ranges.IntRange] */
    private final IntRange k(long j2, int i2) {
        long j3 = a ^ j2;
        Object intRange = i2;
        try {
            switch (intRange) {
                case 46:
                    intRange = new IntRange((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30995, 1020380694462461259L ^ j3) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19668, 1011426419943784600L ^ j3) /* invoke-custom */);
                    return intRange;
                case 63:
                    return new IntRange((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1453, 173597265684072955L ^ j3) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9784, 959522235303209585L ^ j3) /* invoke-custom */);
                default:
                    return new IntRange((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27477, 2433028170434995968L ^ j3) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10290, 3723603526937748599L ^ j3) /* invoke-custom */);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(intRange, 4543780159642709986L, j3) /* invoke-custom */;
        }
        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(intRange, 4543780159642709986L, j3) /* invoke-custom */;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x00dc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.util.ArrayList z(net.minecraft.class_1703 r11, long r12) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.z(net.minecraft.class_1703, long):java.util.ArrayList");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x039c: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void n(su.catlean.api.event.events.render.Render3DEvent r9) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.n(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[LOOP:0: B:3:0x0069->B:12:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x00c6 -> B:6:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.mh X(int r9, int r10, @org.jetbrains.annotations.NotNull java.lang.String r11, int r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.X(int, int, java.lang.String, int):su.catlean.mh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    private final void E(int i2, long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 55490115992566L;
        long j5 = j3 ^ 7214885125668L;
        long j6 = j3 ^ 68132361320446L;
        Object objQ = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-690242505447285990L, j3) /* invoke-custom */;
        try {
            try {
                objQ = l.q(R(j6), j5);
                boolean z = objQ;
                if (objQ != 0) {
                    if (objQ == 0) {
                        return;
                    }
                    ag.e(i2, j4, 1, class_1713.field_7795, false, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1980, 4082986289131897502L ^ j3) /* invoke-custom */, null);
                    z = 1;
                }
                t = z;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -687936749732534625L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objQ, -687936749732534625L, j3) /* invoke-custom */;
        }
    }

    private static final Unit A() {
        fi.C.o(new dw((a ^ 39247070690060L) ^ 36729803887070L));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.r7] */
    private static final boolean r() {
        long j2 = a ^ 2206593276379L;
        Object objH = j2;
        try {
            objH = c.H(objH ^ 47102440311594L);
            return objH != r7.OFF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 1692470234784761744L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.r7] */
    private static final boolean g() {
        long j2 = a ^ 97887237064381L;
        Object objH = j2;
        try {
            objH = c.H(objH ^ 125138216555596L);
            return objH != r7.OFF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 583928295029971190L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 114226383160323L;
        long j3 = j2 ^ 127041350092535L;
        long j4 = j2 ^ 129983519491706L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j4 << 16) >>> 32);
        int i5 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 38501690573393L;
        long j6 = j2 ^ 6012783722568L;
        long j7 = j2 ^ 47074368163118L;
        long j8 = j2 ^ 118394603124634L;
        long j9 = j2 ^ 76651167574944L;
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[32];
        int i7 = 0;
        String str = "\u008aâõûã° nÌ°A\u0016häÃ¶o\u001dôò\u008a\u0084df\u0084\u0098õú9[%\u009e8g¹\u0083ÔøO±\u0011&îÓî\u0002wRÞ \u0015\u0000°\u0002\u0091\\}oæ\r&\u0089oDª2%d\u0096ª]\u0006\tT\u000fÿR¦\\·\u0085½Å´ÎüEh×(4\u0011%>0àMÒð\u0092\u0016\u0083\u0097lá¡Ú\tQ@\u008f8 \u007fþ$\u001býyJ\no\u001aÇ\u0001\u008c«^Ú\u0085(M¼\u0004ó7«óÒ¶\u0094J+·Â½\u0080Oy]Î¿£\u001búr¶@E\u0095\u0006R6 °°W\u0018Q $ r\u0016³%õ\f\"g\u0093'\u0086¾\u0090\u0019Ø(úFry\u0011g¹ÒH\f¿\rRï\u0087î tÝ#·Ä¨÷ïðë\u0004Mð\u0093F£ó4áE0~Óq6«-Ö®ëîXX\b$6÷|¾¼ ËTwü>\u0082\u0087\u0082s\u001c\u0002Õ\u009ayº\u001cN\u0000ÑÉP\u0087´\u0091às¦ÚD\u001bÝXH¨fvj\u0098äÈ\u008e\u0004x\u0095\u0001\u0085è\u000e\u000eÌQè\u0099Jaç\u008aOÄi\u0083\u0002\u0099\u0089è¢:\u0015\u008f\u009e¬q#C\u0019Aý¡\tS\u0018\u009d\u008c}I\u001cÜª\n¬ï-:É(íU\u0010=\bÃ6óÐ\u001d\u0010\u001b\u0000\u008d;û<\u007f\t%\u0018\u0018kÌÄ¥\u0010 â©çsÞù!}ÐøÂ#nå)Ü\u001ft$#=Ö¹\u0011Ò\u009e«\u0018Êq\u0005'0\u0000ñú\u009c\u000evZêÕÑ\u0016\u0096ç|ÝÀ\u008a\u001d7\u00978\u009eg§©\u0093fmXõì÷T\b¹Å6\u001e\u0014züYU\u0017Â°Ñ=8G÷\b\u000f\u009bÚMÉ¨Ø¢[\u00165\nÓô0P\u000eÅ\u0016âgÄkj×òË\u0098Ä\u0003\u0096\u001a±wbð{\u0019ð\u0084l\u0090\u008dz\u0001\t\u000bã½¼\u0097\u0098\n\u0080\u0085\u009c\u0019\u0082\u009a\u008bt\u0019Êó\u0012\rñ\u0005Û\u001b#¯\u009b\u0014.*PoMôn\u0010ÝÓ\u0086Ï\u009f-Ñ¾u\u0096iÏeóÞA\u0087å\u0006òV\u0016(×9ß\u0083\u0013ñæÿ\u0018\t\u0083\u007fj!Gíg\u0014$B\u009c@ß¾®sè©T²ù@¡\u009d/µ\u001b\u0094EàW\u0016 4\u0006ì9'à*Ã\u0006eäOÆ\r\u0093\u0082ßú\"ÑÖ·[^\u0011 ªJ\u0086±e\\L\u009a\u0018\u000bW\u0005\u008c\u000bU¼-\u0018\u0098Z\u0016q\u008ffÿ·kXçBi/ñ )··\u008bÿC\u001a$×ëq\u001d\u0015¯k²\u001daÑ@?¼î\u0002,\u0016£\u0092\u0082ÓèO\u0018¤á\u0093\u0094sÆQ`É[\u0097`\u008cÜª\u009b9nÁGÎëÎM ü&°¬b\u0014ÖÏ#Å! \u008fa3\u0096i¤ÒG©: a\u0001\u0012ÆÕÜ\u0005µ\u0013 ËÓpVH\u0016\u001e\u0094îWð Â÷lÉ¬9G©¡\u0005Y»ZÛ\u008a\u0013¾Ù\u001fo\u0018æ\u0015µÄO\u0001.ä\u0012xQ0\u0007â8{ç\u007f¾\u008fÙÌ\u0011g å\u0084Ñ¦}mhGfáKÂ\u009bÉ»h·hoY\u008bl+èl§Ë\u0019\u008eeú\u0091\u0018\u0092Ûã\u0017unUE\u0010³TÃýÿ¥Â¦Ü\u0002\u0088sHê\u0005(8ÍÅ\u0085\u0087£Î1<\u000bHJ\u0095D=«Ã«5\u001fLª\u000b@\f\u0017ãò\u0098\u0092\u0003\nI\u0014yC\u0094\rhº z_¨Cú\u0017sêXºá7\u0015y?S\u0017ò\u000eáÊ³\u000fìk`*a\u008b¦`ä(ë\u0005\u001dQàÙ5H¹!\u0015'ÜZ\u00ad¹ÿÍø'\u0087Á}ß\u00040y§×P÷gÀE²H\u001dÁ\u0015â â\u0098ÉòÄo¢QåëÅ¶NÎ5¢Gn±`IÇ\u009aÓ\u0096O&o[]jv(E¨A-\u000f¯\u008bdØ\u001cÆ\u008f÷;â1\u008a·gHÎ-£öD®\u0084Û}HÜ·í°ýk\\x®Ú\u0010Ûþ\rÊ\u008d/ÞTãì\u0011Dû\u008em\u008b ýX\u008c[#\fÜ\u0096hüdÙ¤ã\u00178\u0018w*ÞtÁÞ\u000f\u0014\u001aÁËkÔ\tA\u0010íd\u000eÚsÅ\u001dÚÙ.%¾\u0014\n\u0018&\u0018fË®èß¯ÌÖ°ÚIêM\u00143a§»\u001bú,Ô\u00ad·";
        int length = "\u008aâõûã° nÌ°A\u0016häÃ¶o\u001dôò\u008a\u0084df\u0084\u0098õú9[%\u009e8g¹\u0083ÔøO±\u0011&îÓî\u0002wRÞ \u0015\u0000°\u0002\u0091\\}oæ\r&\u0089oDª2%d\u0096ª]\u0006\tT\u000fÿR¦\\·\u0085½Å´ÎüEh×(4\u0011%>0àMÒð\u0092\u0016\u0083\u0097lá¡Ú\tQ@\u008f8 \u007fþ$\u001býyJ\no\u001aÇ\u0001\u008c«^Ú\u0085(M¼\u0004ó7«óÒ¶\u0094J+·Â½\u0080Oy]Î¿£\u001búr¶@E\u0095\u0006R6 °°W\u0018Q $ r\u0016³%õ\f\"g\u0093'\u0086¾\u0090\u0019Ø(úFry\u0011g¹ÒH\f¿\rRï\u0087î tÝ#·Ä¨÷ïðë\u0004Mð\u0093F£ó4áE0~Óq6«-Ö®ëîXX\b$6÷|¾¼ ËTwü>\u0082\u0087\u0082s\u001c\u0002Õ\u009ayº\u001cN\u0000ÑÉP\u0087´\u0091às¦ÚD\u001bÝXH¨fvj\u0098äÈ\u008e\u0004x\u0095\u0001\u0085è\u000e\u000eÌQè\u0099Jaç\u008aOÄi\u0083\u0002\u0099\u0089è¢:\u0015\u008f\u009e¬q#C\u0019Aý¡\tS\u0018\u009d\u008c}I\u001cÜª\n¬ï-:É(íU\u0010=\bÃ6óÐ\u001d\u0010\u001b\u0000\u008d;û<\u007f\t%\u0018\u0018kÌÄ¥\u0010 â©çsÞù!}ÐøÂ#nå)Ü\u001ft$#=Ö¹\u0011Ò\u009e«\u0018Êq\u0005'0\u0000ñú\u009c\u000evZêÕÑ\u0016\u0096ç|ÝÀ\u008a\u001d7\u00978\u009eg§©\u0093fmXõì÷T\b¹Å6\u001e\u0014züYU\u0017Â°Ñ=8G÷\b\u000f\u009bÚMÉ¨Ø¢[\u00165\nÓô0P\u000eÅ\u0016âgÄkj×òË\u0098Ä\u0003\u0096\u001a±wbð{\u0019ð\u0084l\u0090\u008dz\u0001\t\u000bã½¼\u0097\u0098\n\u0080\u0085\u009c\u0019\u0082\u009a\u008bt\u0019Êó\u0012\rñ\u0005Û\u001b#¯\u009b\u0014.*PoMôn\u0010ÝÓ\u0086Ï\u009f-Ñ¾u\u0096iÏeóÞA\u0087å\u0006òV\u0016(×9ß\u0083\u0013ñæÿ\u0018\t\u0083\u007fj!Gíg\u0014$B\u009c@ß¾®sè©T²ù@¡\u009d/µ\u001b\u0094EàW\u0016 4\u0006ì9'à*Ã\u0006eäOÆ\r\u0093\u0082ßú\"ÑÖ·[^\u0011 ªJ\u0086±e\\L\u009a\u0018\u000bW\u0005\u008c\u000bU¼-\u0018\u0098Z\u0016q\u008ffÿ·kXçBi/ñ )··\u008bÿC\u001a$×ëq\u001d\u0015¯k²\u001daÑ@?¼î\u0002,\u0016£\u0092\u0082ÓèO\u0018¤á\u0093\u0094sÆQ`É[\u0097`\u008cÜª\u009b9nÁGÎëÎM ü&°¬b\u0014ÖÏ#Å! \u008fa3\u0096i¤ÒG©: a\u0001\u0012ÆÕÜ\u0005µ\u0013 ËÓpVH\u0016\u001e\u0094îWð Â÷lÉ¬9G©¡\u0005Y»ZÛ\u008a\u0013¾Ù\u001fo\u0018æ\u0015µÄO\u0001.ä\u0012xQ0\u0007â8{ç\u007f¾\u008fÙÌ\u0011g å\u0084Ñ¦}mhGfáKÂ\u009bÉ»h·hoY\u008bl+èl§Ë\u0019\u008eeú\u0091\u0018\u0092Ûã\u0017unUE\u0010³TÃýÿ¥Â¦Ü\u0002\u0088sHê\u0005(8ÍÅ\u0085\u0087£Î1<\u000bHJ\u0095D=«Ã«5\u001fLª\u000b@\f\u0017ãò\u0098\u0092\u0003\nI\u0014yC\u0094\rhº z_¨Cú\u0017sêXºá7\u0015y?S\u0017ò\u000eáÊ³\u000fìk`*a\u008b¦`ä(ë\u0005\u001dQàÙ5H¹!\u0015'ÜZ\u00ad¹ÿÍø'\u0087Á}ß\u00040y§×P÷gÀE²H\u001dÁ\u0015â â\u0098ÉòÄo¢QåëÅ¶NÎ5¢Gn±`IÇ\u009aÓ\u0096O&o[]jv(E¨A-\u000f¯\u008bdØ\u001cÆ\u008f÷;â1\u008a·gHÎ-£öD®\u0084Û}HÜ·í°ýk\\x®Ú\u0010Ûþ\rÊ\u008d/ÞTãì\u0011Dû\u008em\u008b ýX\u008c[#\fÜ\u0096hüdÙ¤ã\u00178\u0018w*ÞtÁÞ\u000f\u0014\u001aÁËkÔ\tA\u0010íd\u000eÚsÅ\u001dÚÙ.%¾\u0014\n\u0018&\u0018fË®èß¯ÌÖ°ÚIêM\u00143a§»\u001bú,Ô\u00ad·".length();
        char cCharAt = ' ';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            d = strArr;
                            f = new String[32];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[32];
                            int i13 = 0;
                            String str3 = "å·ìuø£\u008aìãë\u009ax0î\u001f\u001c!\bz\u0081ºt\u0088÷Ì»7\u0097§®\u0086öð=\u0088¿eÃ¨ñ¼L±Ú[¤Ý*\u0091\u0007X\u0006\u007f!ÚZ$LË\u0095´\u001a\u0091\u0010ß\u007fØó~Uîe·¬\u0005øìªb\u008eg0\u001b:t\u0090vjåä¼ðª\u0004ê]´\u0018\u008e+É\u0010\tÃT\u001218\u001dùï\u009a\u001fTN\"îÐÔÃªûÄîrj\u008ffº\u0093TÚÃE«®¼\u0001k¦\u0003[t¯²ýâ\"ùxVÇ]ï;+¼réÎu9\u0005F©~ÓºQ´wûYF`\u009d\n*_MÙ+\u0098ÛO'¾Ü\u0006bÌ'\r_\u0081½ao\b\u0006ÜÌ]jì;!~ª6$\u0003Ì¹y»6\u0092ÞQÂ\u0015ð\u0004\u0084L\u001bÏ-[M)~\u0087\u008al¨C\u0094v";
                            int length2 = "å·ìuø£\u008aìãë\u009ax0î\u001f\u001c!\bz\u0081ºt\u0088÷Ì»7\u0097§®\u0086öð=\u0088¿eÃ¨ñ¼L±Ú[¤Ý*\u0091\u0007X\u0006\u007f!ÚZ$LË\u0095´\u001a\u0091\u0010ß\u007fØó~Uîe·¬\u0005øìªb\u008eg0\u001b:t\u0090vjåä¼ðª\u0004ê]´\u0018\u008e+É\u0010\tÃT\u001218\u001dùï\u009a\u001fTN\"îÐÔÃªûÄîrj\u008ffº\u0093TÚÃE«®¼\u0001k¦\u0003[t¯²ýâ\"ùxVÇ]ï;+¼réÎu9\u0005F©~ÓºQ´wûYF`\u009d\n*_MÙ+\u0098ÛO'¾Ü\u0006bÌ'\r_\u0081½ao\b\u0006ÜÌ]jì;!~ª6$\u0003Ì¹y»6\u0092ÞQÂ\u0015ð\u0004\u0084L\u001bÏ-[M)~\u0087\u008al¨C\u0094v".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j10 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j11 = j10;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j11 >>> 56), (byte) (j11 >>> 48), (byte) (j11 >>> 40), (byte) (j11 >>> 32), (byte) (j11 >>> 24), (byte) (j11 >>> 16), (byte) (j11 >>> 8), (byte) j11});
                                    long j12 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j12;
                                            if (i14 >= length2) {
                                                h = jArr;
                                                i = new Integer[32];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22958, 396171843830718538L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(118, 6542433078880103733L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13081, 6109330138812833365L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12791, 8419343971846479029L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15377, 7193053023388324176L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2359, 6990159186813346928L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26654, 7905070343904068928L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7045, 5711185566693291737L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1227, 8930973855304018329L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32426, 5086728743264982007L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25170, 6512324658779328276L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8315, 8932279625054309672L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22392, 2339744591628384828L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12009, 7285982662115022604L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(q4.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25333, 6103412627106729917L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8436, 4893714725506371001L ^ j2) /* invoke-custom */, 0));
                                                e = kPropertyArr;
                                                c = new q4((short) i3, i4, i5);
                                                W = yp.y(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24052, 4665748722283950269L ^ j2) /* invoke-custom */, q4::A, j9, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18536, 7889884921795719573L ^ j2) /* invoke-custom */, (Object) null);
                                                N = yp.j(j3, c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25453, 4454992121660050999L ^ j2) /* invoke-custom */, new nv((List) null, 1, j5, (DefaultConstructorMarker) null), null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13281, 5087763307980278275L ^ j2) /* invoke-custom */, null);
                                                x = yp.L(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26590, 1499977583325481615L ^ j2) /* invoke-custom */, 0, new IntRange(0, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7595, 917481506195661915L ^ j2) /* invoke-custom */), j6, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16978, 5993283589486328754L ^ j2) /* invoke-custom */, null);
                                                b = yp.L(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20396, 5029079960517976809L ^ j2) /* invoke-custom */, 1, new IntRange(1, 3), j6, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24254, 2803672037221345097L ^ j2) /* invoke-custom */, null);
                                                P = yp.L(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24766, 4172906254101646821L ^ j2) /* invoke-custom */, r7.OFF, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13281, 5087763307980278275L ^ j2) /* invoke-custom */, null, j8);
                                                y = yp.L(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30538, 2975425306703370783L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5113, 8243303436860811776L ^ j2) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15144, 2035473279084151504L ^ j2) /* invoke-custom */), j6, null, q4::r, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22302, 7025506791195815667L ^ j2) /* invoke-custom */, null);
                                                u = yp.t(c, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19732, 7599369423669076035L ^ j2) /* invoke-custom */, false, j7, null, q4::g, 4, null);
                                                l = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j12;
                                            if (i14 >= length2) {
                                                str3 = "¯¥4¦Ú\u007fcÃÌßH4\u0093j\u0080å";
                                                length2 = "¯¥4¦Ú\u007fcÃÌßH4\u0093j\u0080å".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j10 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "ËE\u001dÞ3Ô7Ã`½`¢\u0096°#2r\u009c\u0097\u0016=\u0010 \u007f \u007fÌ\\Z¹\u0007]¡)¿\u0080\u008a30Â\u0095ä¤Ü\u008c´º\u0002³ÔQ%\u0011Õ\u0006Et";
                        length = "ËE\u001dÞ3Ô7Ã`½`¢\u0096°#2r\u009c\u0097\u0016=\u0010 \u007f \u007fÌ\\Z¹\u0007]¡)¿\u0080\u008a30Â\u0095ä¤Ü\u008c´º\u0002³ÔQ%\u0011Õ\u0006Et".length();
                        cCharAt = 24;
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 9915;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/q4", e2);
            }
        }
        return f[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 0
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/q4"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 12809;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/q4", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 0
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/q4"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.q4.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
