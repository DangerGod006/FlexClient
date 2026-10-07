package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2833;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.ShouldDismountEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uj.class */
public final class uj extends _g {

    @NotNull
    public static final uj D = null;
    static final KProperty[] h = null;

    @NotNull
    private static final cw e = null;

    @NotNull
    private static final cq c = null;

    @NotNull
    private static final cq n = null;

    @NotNull
    private static final cq o = null;

    @NotNull
    private static final cq j = null;

    @NotNull
    private static final ct g = null;

    @NotNull
    private static final ct z = null;

    @NotNull
    private static final cp V = null;

    @NotNull
    private static final ct k = null;

    @NotNull
    private static final cq O = null;

    @NotNull
    private static final cq E = null;

    @NotNull
    private static final cq B = null;

    @NotNull
    private static final cq L = null;

    @NotNull
    private static final ct P = null;

    @NotNull
    private static final cq N = null;

    @NotNull
    private static final cq T = null;

    @NotNull
    private static final cq a = null;

    @NotNull
    private static final c8 m = null;

    @NotNull
    private static final c8 d = null;

    @NotNull
    private static final ct l = null;

    @NotNull
    private static final ArrayList A = null;
    private static int W;
    private static int f;
    private static boolean y;
    private static boolean Y;
    private static boolean S;
    private static final long b = 0;
    private static final String[] i = null;
    private static final String[] t = null;
    private static final Map u = null;
    private static final long[] w = null;
    private static final Integer[] x = null;
    private static final Map C = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private uj(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19418, 4876138967935695413L ^ j3) /* invoke-custom */, jt.V(), null, 4, null, j3 ^ 122433218145068L);
    }

    private final ik q(byte b2, long j2) {
        return (ik) e.E(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ b) ^ 34616687738998L, h[0]);
    }

    private final boolean D(long j2) {
        return ((Boolean) c.E(this, (b ^ j2) ^ 78558386716068L, h[1])).booleanValue();
    }

    private final boolean T(long j2) {
        return ((Boolean) n.E(this, (b ^ j2) ^ 12487121544372L, h[2])).booleanValue();
    }

    private final boolean G(long j2) {
        return ((Boolean) o.E(this, (b ^ j2) ^ 108700925255634L, h[3])).booleanValue();
    }

    private final boolean W(short s, short s2, int i2) {
        return ((Boolean) j.E(this, ((((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b) ^ 35644665666679L, h[4])).booleanValue();
    }

    private final float P(long j2, byte b2) {
        return ((Number) g.E(this, (((j2 << 8) | ((((long) b2) << 56) >>> 56)) ^ b) ^ 115925617747250L, h[5])).floatValue();
    }

    private final float F(long j2) {
        long j3 = b ^ j2;
        return ((Number) z.E(this, j3 ^ 24342428013247L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23816, 366598049750022505L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final h r(long j2) {
        long j3 = b ^ j2;
        return (h) V.E(this, j3 ^ 118898144847322L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12285, 8953603045642140909L ^ j3) /* invoke-custom */]);
    }

    private final float K(long j2) {
        long j3 = b ^ j2;
        return ((Number) k.E(this, j3 ^ 23468680918801L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32685, 8251329602402434669L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean p(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) O.E(this, j3 ^ 2392638850670L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13583, 781057820815771060L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean e(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) E.E(this, j3 ^ 80209741200335L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11632, 3443401886849425515L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean B(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) B.E(this, j3 ^ 116956316823385L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31136, 4669411505202421821L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean E(char c2, int i2, short s) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ b;
        return ((Boolean) L.E(this, j2 ^ 52845018740261L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6295, 7221604101653403754L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final float Z(long j2) {
        long j3 = b ^ j2;
        return ((Number) P.E(this, j3 ^ 138846083173515L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20995, 8314412053220845687L ^ j3) /* invoke-custom */])).floatValue();
    }

    private final boolean x(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) N.E(this, j3 ^ 69908726141600L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(58, 5400343303047291976L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean H(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) T.E(this, j3 ^ 130548591972963L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6417, 9165019645724638647L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean V(long j2) {
        long j3 = b ^ j2;
        return ((Boolean) a.E(this, j3 ^ 24141067472701L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21014, 7245301646802643943L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final int M(long j2) {
        long j3 = b ^ j2;
        return ((Number) m.E(this, j3 ^ 75674332724515L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22132, 3310249262349213080L ^ j3) /* invoke-custom */])).intValue();
    }

    private final int C(long j2) {
        long j3 = b ^ j2;
        return ((Number) d.E(this, j3 ^ 123217635153168L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1918, 6845344441898329253L ^ j3) /* invoke-custom */])).intValue();
    }

    private final float L(short s, char c2, int i2) {
        long j2 = (((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ b;
        return ((Number) l.E(this, j2 ^ 78743058494867L, h[(int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22679, 8795894462339062745L ^ j2) /* invoke-custom */])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.uj] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.String] */
    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 122304444111779L;
        long j5 = j2 ^ 76401611909238L;
        long j6 = j2 ^ 20975573779856L;
        class_638 class_638Var = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2648177620633790614L, j2) /* invoke-custom */;
        try {
            try {
                class_638Var = class_638Var;
                if (class_638Var != null) {
                    try {
                        class_638Var = zf.F(j3).field_1687;
                        if (class_638Var != null && (j2 <= 0 || zf.F(j3).field_1724 != null)) {
                            Object objG = this;
                            uj ujVar = objG;
                            if (class_638Var != null) {
                                try {
                                    try {
                                        objG = objG.G(j5);
                                        if (objG != 0) {
                                            ujVar = this;
                                            ujVar.l(j4);
                                        }
                                    } catch (NumberFormatException unused) {
                                        objG = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, 2629673847421734548L, j2) /* invoke-custom */;
                                        throw objG;
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, 2629673847421734548L, j2) /* invoke-custom */;
                                }
                            } else {
                                ujVar.l(j4);
                            }
                            Object obj = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                            if (obj > 0) {
                                try {
                                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2620972475537570510L, j2) /* invoke-custom */ == null) {
                                        return;
                                    }
                                    obj = "QiAzj";
                                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("QiAzj", 2615097924116087437L, j2) /* invoke-custom */;
                                } catch (NumberFormatException unused3) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2629673847421734548L, j2) /* invoke-custom */;
                                }
                            }
                            return;
                        }
                        d(j6);
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_638Var, 2629673847421734548L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_638Var, 2629673847421734548L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_638Var, 2629673847421734548L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.uj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [su.catlean.uj] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // su.catlean._g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r9) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.b(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [float] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private final float z(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b;
        long j4 = j3 ^ 89951480617303L;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8739165071906272530L, j3) /* invoke-custom */;
        try {
            obj = S;
            Object objZ = obj;
            if (obj != 0) {
                objZ = obj == 0 ? 1 : 0;
            }
            try {
                S = objZ;
                if (!S) {
                    return -Z(j4);
                }
                objZ = Z(j4);
                return objZ;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -8789211974082253588L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8789211974082253588L, j3) /* invoke-custom */;
        }
    }

    private final void v(class_2833 class_2833Var, long j2) {
        long j3 = (b ^ j2) ^ 21003018458806L;
        A.add(class_2833Var);
        _r.a(j3, (class_2596) class_2833Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    private final void s(int i2, class_1297 class_1297Var, short s, short s2) {
        Object objMethod_45474;
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ b;
        int i3 = (int) (j2 >>> 56);
        long j3 = ((j2 ^ 127554874375971L) << 8) >>> 8;
        long j4 = j2 ^ 109161481831295L;
        long j5 = j2 ^ 23471386673541L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5943874545287913003L, j2) /* invoke-custom */;
        class_2338 class_2338VarMethod_49638 = class_2338.method_49638(J((byte) i3, j3, class_1297Var));
        Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49638, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27798, 8573782770535631591L ^ j2) /* invoke-custom */);
        class_2338 class_2338Var = class_2338VarMethod_49638;
        int iL = (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8754, 3309878353149473970L ^ j2) /* invoke-custom */;
        int i4 = 0;
        while (i4 < iL && (objMethod_45474 = str) != 0) {
            try {
                try {
                    objMethod_45474 = zf.z(j5).method_8320(class_2338Var).method_45474();
                    if (objMethod_45474 != 0) {
                        objMethod_45474 = s2;
                        if (objMethod_45474 >= 0) {
                            try {
                                if (zf.z(j5).method_8320(class_2338Var).method_26204() != class_2246.field_10382) {
                                    class_2338 class_2338VarMethod_10074 = class_2338Var.method_10074();
                                    Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_10074, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18142, 7265645038437441679L ^ j2) /* invoke-custom */);
                                    class_2338Var = class_2338VarMethod_10074;
                                    i4++;
                                }
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, -5963521845577545769L, j2) /* invoke-custom */;
                            }
                        }
                        if (str == null) {
                            return;
                        }
                    }
                    class_1297Var.method_5814(class_1297Var.method_23317(), class_2338Var.method_10264() + 1, class_1297Var.method_23321());
                    uj ujVar = D;
                    class_2833 class_2833VarMethod_65307 = class_2833.method_65307(class_1297Var);
                    Intrinsics.checkNotNullExpressionValue(class_2833VarMethod_65307, (String) b(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27395, 1386775343904197990L ^ j2) /* invoke-custom */);
                    ujVar.v(class_2833VarMethod_65307, j4);
                    class_1297Var.method_5814(class_1297Var.method_23317(), class_1297Var.method_23318(), class_1297Var.method_23321());
                    return;
                } catch (NumberFormatException unused2) {
                    objMethod_45474 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, -5963521845577545769L, j2) /* invoke-custom */;
                    throw objMethod_45474;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_45474, -5963521845577545769L, j2) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00c3: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void l(long r9) {
        /*
            r8 = this;
            long r0 = su.catlean.uj.b
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 60746949807563(0x373fc05d4dcb, double:3.00129809895594E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 58798110394153(0x357a007bc729, double:2.9050126386132E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 58449378440044(0x3528ce70736c, double:2.8877829908E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = -6787698759974802021(0xa1cd3ff0c957ad9b, double:-7.320058221397772E-146)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = r11
            net.minecraft.class_638 r1 = su.catlean.zf.z(r1)
            java.lang.Iterable r1 = r1.method_18112()
            java.util.Iterator r1 = r1.iterator()
            r18 = r1
            r17 = r0
        L35:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc7
            r0 = r18
            java.lang.Object r0 = r0.next()
            r1 = r0
            r2 = 22986(0x59ca, float:3.221E-41)
            r3 = 76524500067333058(0x10fdea09b20b3c2, double:1.4522838780599996E-303)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uj;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "a"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            net.minecraft.class_1297 r0 = (net.minecraft.class_1297) r0
            r19 = r0
            r0 = r19
            boolean r0 = r0 instanceof net.minecraft.class_1690     // Catch: java.lang.NumberFormatException -> L6c
            r1 = r17
            if (r1 == 0) goto L9c
            if (r0 == 0) goto L35
            goto L76
        L6c:
            r1 = -6812976340859974759(0xa173721d5be68b99, double:-1.5207823568421875E-147)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L76:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc6
            r0 = r15
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L92
            r1 = r17
            if (r1 == 0) goto La4
            r1 = r19
            double r0 = r0.method_5858(r1)     // Catch: java.lang.NumberFormatException -> L92
            r1 = 4627730092099895296(0x4039000000000000, double:25.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto L9c
        L92:
            r1 = -6812976340859974759(0xa173721d5be68b99, double:-1.5207823568421875E-147)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9c:
            if (r0 <= 0) goto La2
            goto L35
        La2:
            r0 = r19
        La4:
            r1 = 0
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5808
            net.minecraft.class_2824 r0 = net.minecraft.class_2824.method_34207(r0, r1, r2)
            r1 = r0
            r2 = 25296(0x62d0, float:3.5447E-41)
            r3 = 1406984552348453054(0x13869cfeef3108be, double:1.3119472460219814E-214)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/uj;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "a"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
        Lc6:
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.l(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.player.ShouldDismountEvent] */
    @Flow
    private final void Z(ShouldDismountEvent shouldDismountEvent) {
        long j2 = b ^ 112606052018011L;
        Object obj = j2;
        try {
            if (W((short) (obj >>> 48), (short) ((r1 << 16) >>> 48), (int) (((obj ^ 7429068535592L) << 32) >>> 32))) {
                obj = shouldDismountEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8684483128717431407L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:214:0x05e6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void g(su.catlean.api.event.events.player.EventPlayerTravel r15) {
        /*
            Method dump skipped, instruction units count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.g(su.catlean.api.event.events.player.EventPlayerTravel):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:74:0x0155
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void X(su.catlean.api.event.events.network.ReceivePacket r8) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.X(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void v(su.catlean.api.event.events.network.SendPacket r9) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.v(su.catlean.api.event.events.network.SendPacket):void");
    }

    private static final boolean Y() {
        return D.E((char) (r0 >>> 48), (int) ((((b ^ 39948022510574L) ^ 93021773547983L) << 16) >>> 32), (short) ((r1 << 48) >>> 48));
    }

    private static final boolean R() {
        return D.V((b ^ 116299915847952L) ^ 67011523537449L);
    }

    private static final boolean t() {
        return D.V((b ^ 92748254000197L) ^ 1575642609532L);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 18990;
        if (t[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) u.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                t[i3] = b(((Cipher) objArr[0]).doFinal(i[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uj", e2);
            }
        }
        return t[i3];
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/uj"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 15067;
        if (x[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) w[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) C.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    C.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/uj", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            x[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return x[i3].intValue();
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/uj"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uj.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
