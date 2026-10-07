package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yp.class */
public final class yp {
    private static boolean u;
    private static final long a = yz.a(7745827321901281846L, -8212081676556772172L, MethodHandles.lookup().lookupClass()).a(138592831165454L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    @NotNull
    public static final cq l(long a2, @NotNull jk $this$setting, @NotNull String id, boolean defaultValue, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559094746345239176L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853748602038063914L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512294924876925509L ^ j) /* invoke-custom */);
        cq cqVar = new cq(id, defaultValue, group, j ^ 5366632560493L, visible);
        $this$setting.c().add(cqVar);
        return cqVar;
    }

    public static /* synthetic */ cq t(jk jkVar, String str, boolean z, long j, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 17812017968747L;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398715331037152123L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::o;
        }
        return l(j3, jkVar, str, z, hVar, function0);
    }

    @NotNull
    public static final c8 O(long a2, @NotNull jk $this$setting, @NotNull String id, int defaultValue, @NotNull IntRange range, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559000155293715991L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853636484298534837L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31027, 1984123690326713983L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512270632373466842L ^ j) /* invoke-custom */);
        c8 c8Var = new c8(id, defaultValue, j ^ 108090389813476L, range, group, visible);
        $this$setting.c().add(c8Var);
        return c8Var;
    }

    public static /* synthetic */ c8 L(jk jkVar, String str, int i, IntRange intRange, long j, h hVar, Function0 function0, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 94063913207698L;
        if ((i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398753115287866909L ^ j2) /* invoke-custom */) != 0) {
            hVar = null;
        }
        if ((i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10930, 6516985904309535965L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::K;
        }
        return O(j3, jkVar, str, i, intRange, hVar, function0);
    }

    @NotNull
    public static final ct Y(@NotNull jk $this$setting, @NotNull String id, float defaultValue, @NotNull ClosedFloatingPointRange range, long a2, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9665, 3581283408127352042L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853767639660071386L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31027, 1984256418451587088L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512313820765540533L ^ j) /* invoke-custom */);
        ct ctVar = new ct(id, defaultValue, j ^ 34951118472208L, range, group, visible);
        $this$setting.c().add(ctVar);
        return ctVar;
    }

    public static /* synthetic */ ct k(jk jkVar, String str, float f2, long j, ClosedFloatingPointRange closedFloatingPointRange, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 54322777645781L;
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398732894678011189L ^ j2) /* invoke-custom */) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10930, 6516958845907142645L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::q;
        }
        return Y(jkVar, str, f2, closedFloatingPointRange, j3, hVar, function0);
    }

    @NotNull
    public static final cl g(@NotNull jk $this$setting, @NotNull String id, @NotNull String defaultValue, char a2, @Nullable h group, @NotNull Function0 visible, int a3, char a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559030759455621065L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853685079325580907L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030244600825772477L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512231419999274756L ^ j) /* invoke-custom */);
        cl clVar = new cl(id, defaultValue, group, visible, j ^ 59671125517896L);
        $this$setting.c().add(clVar);
        return clVar;
    }

    public static /* synthetic */ cl x(jk jkVar, String str, String str2, h hVar, Function0 function0, int i, long j, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 87639006301423L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398706775076467902L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::E;
        }
        return g(jkVar, str, str2, (char) i2, hVar, function0, i3, (char) i4);
    }

    @NotNull
    public static final av T(@NotNull jk $this$setting, @NotNull String id, @NotNull lj defaultValue, @Nullable h group, long a2, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3558980864870030169L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853656092622158587L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030224401478196525L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512290102045975444L ^ j) /* invoke-custom */);
        av avVar = new av(id, defaultValue, visible, j ^ 51647492874152L);
        avVar.i(group);
        $this$setting.c().add(avVar);
        return avVar;
    }

    public static /* synthetic */ av J(jk jkVar, String str, lj ljVar, h hVar, int i, Function0 function0, int i2, char c2, int i3, Object obj) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 29356888627355L;
        if ((i3 & 4) != 0) {
            hVar = null;
        }
        if ((i3 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398803923448841306L ^ j) /* invoke-custom */) != 0) {
            function0 = yp::a;
        }
        return T(jkVar, str, ljVar, hVar, j2, function0);
    }

    @NotNull
    public static final cw j(@NotNull jk $this$setting, long a2, @NotNull String id, @NotNull Enum defaultValue, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559023697651289617L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853679187578924979L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030247537514268773L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512225248957986524L ^ j) /* invoke-custom */);
        cw cwVar = new cw(id, defaultValue, group, j ^ 46458041542386L, visible);
        $this$setting.c().add(cwVar);
        return cwVar;
    }

    public static /* synthetic */ cw L(jk jkVar, String str, Enum r10, h hVar, Function0 function0, int i, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 19431536455750L;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398786264123177423L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::t;
        }
        return j(jkVar, j3, str, r10, hVar, function0);
    }

    @NotNull
    public static final ch j(@NotNull jk $this$setting, @NotNull String id, @NotNull d_ defaultValue, @Nullable h group, long a2, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3558972860161530721L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853664097389378243L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030232958157364501L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512280514610373548L ^ j) /* invoke-custom */);
        ch chVar = new ch(id, defaultValue, group, visible, j ^ 100410574687531L);
        $this$setting.c().add(chVar);
        return chVar;
    }

    public static /* synthetic */ ch x(jk jkVar, String str, d_ d_Var, long j, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 95262016573291L;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398728849527034770L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::G;
        }
        return j(jkVar, str, d_Var, hVar, j3, function0);
    }

    @NotNull
    public static final cs u(@NotNull jk $this$setting, @NotNull String id, @NotNull Color defaultValue, long a2, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559052463824203716L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853724922379406950L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030293818715007408L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512359224516007689L ^ j) /* invoke-custom */);
        cs csVar = new cs(id, defaultValue, j ^ 88404531980126L, group, visible);
        $this$setting.c().add(csVar);
        return csVar;
    }

    public static /* synthetic */ cs b(jk jkVar, short s, String str, Color color, h hVar, Function0 function0, int i, Object obj, long j) {
        long j2 = ((((long) s) << 48) | ((j << 16) >>> 16)) ^ a;
        long j3 = j2 ^ 97441327358386L;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398800942919158254L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::U;
        }
        return u(jkVar, str, color, j3, hVar, function0);
    }

    @NotNull
    public static final az W(@NotNull jk $this$setting, char a2, @NotNull String id, @NotNull dg defaultValue, @Nullable h group, long a3, @NotNull Function0 visible) {
        long j = ((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559108856049698454L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853748003628967732L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030307518946705634L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512311507008732763L ^ j) /* invoke-custom */);
        az azVar = new az(id, defaultValue, j ^ 105173490257422L, group, visible);
        $this$setting.c().add(azVar);
        return azVar;
    }

    public static /* synthetic */ az y(jk jkVar, String str, long j, dg dgVar, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        int i2 = (int) (j2 >>> 48);
        long j3 = ((j2 ^ 133913366903812L) << 16) >>> 16;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398813680526818570L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::e;
        }
        return W(jkVar, (char) i2, str, dgVar, hVar, j3, function0);
    }

    @NotNull
    public static final cj A(long a2, char a3, @NotNull jk $this$setting, @NotNull String id, @NotNull d4 defaultValue, @Nullable h group, @NotNull Function0 visible) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559072843754435660L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853709249263572462L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27647, 3816815384019046127L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512343116954160257L ^ j) /* invoke-custom */);
        cj cjVar = new cj(id, defaultValue, group, j ^ 130695703853677L, visible);
        $this$setting.c().add(cjVar);
        return cjVar;
    }

    public static /* synthetic */ cj I(jk jkVar, String str, char c2, d4 d4Var, h hVar, Function0 function0, int i, Object obj, char c3, int i2) {
        long j = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j2 = j >>> 16;
        int i3 = (int) (((j ^ 19782305873979L) << 48) >>> 48);
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398754951203238895L ^ j) /* invoke-custom */) != 0) {
            function0 = yp::P;
        }
        return A(j2, (char) i3, jkVar, str, d4Var, hVar, function0);
    }

    @NotNull
    public static final cr A(int a2, @NotNull jk $this$setting, @NotNull String id, @NotNull nv defaultValue, @Nullable h group, @NotNull Function0 visible, char a3, char a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559103663619671075L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853739994000221569L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030308863353946711L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512303496708242670L ^ j) /* invoke-custom */);
        cr crVar = new cr(id, j ^ 88611340321452L, defaultValue, group, visible);
        $this$setting.c().add(crVar);
        return crVar;
    }

    public static /* synthetic */ cr j(long j, jk jkVar, String str, nv nvVar, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 71829611858713L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        if ((i & 4) != 0) {
            hVar = null;
        }
        int iM = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398777628391475362L ^ j2) /* invoke-custom */;
        if (j2 > 0) {
            if (iM != 0) {
                function0 = yp::h;
            }
            iM = i2;
        }
        return A(iM, jkVar, str, nvVar, hVar, function0, (char) i3, (char) i4);
    }

    @NotNull
    public static final a6 X(char a2, @NotNull jk $this$setting, @NotNull String id, @NotNull Function0 defaultValue, @Nullable h group, @NotNull Function0 visible, int a3, int a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559005976203244651L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853696669041874377L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030264983279612447L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512242988642831526L ^ j) /* invoke-custom */);
        a6 a6Var = new a6(id, new id(defaultValue, j ^ 106855675157941L), group, (char) (j >>> 48), ((j ^ 39862824545436L) << 16) >>> 16, visible);
        $this$setting.c().add(a6Var);
        return a6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a6 y(jk jkVar, String str, Function0 function0, long j, h hVar, Function0 function02, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 52301438408198L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        if ((i & 4) != 0) {
            hVar = null;
        }
        int iM = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398823762261943797L ^ j2) /* invoke-custom */;
        char c2 = iM;
        if (j2 > 0) {
            if (iM != 0) {
                function02 = yp::j;
            }
            c2 = (char) i2;
        }
        return X(c2, jkVar, str, function0, hVar, function02, i3, i4);
    }

    @NotNull
    public static final cb R(@NotNull jk $this$setting, @NotNull String id, @NotNull oi defaultValue, @Nullable h group, long a2, @NotNull Function0 visible) {
        long j = a ^ a2;
        long j2 = j ^ 5775646330650L;
        Intrinsics.checkNotNullParameter($this$setting, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559003821497922515L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853641648676983409L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030201170038470055L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512275950158711582L ^ j) /* invoke-custom */);
        cb cbVar = new cb(id, (byte) (j >>> 56), defaultValue, group, (int) ((j2 << 8) >>> 32), visible, (int) ((j2 << 40) >>> 40));
        $this$setting.c().add(cbVar);
        return cbVar;
    }

    public static /* synthetic */ cb X(jk jkVar, String str, long j, oi oiVar, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 138676011261872L;
        if ((i & 4) != 0) {
            hVar = null;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398714381615115259L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::S;
        }
        return R(jkVar, str, oiVar, hVar, j3, function0);
    }

    @NotNull
    public static final cp h(@NotNull jk $this$group, @NotNull String id, long a2, @NotNull w7 type, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$group, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4433, 3559032695427817376L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853670198334668290L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(type, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13222, 3447813279028084056L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512233697415161709L ^ j) /* invoke-custom */);
        cp cpVar = new cp(id, j ^ 126689361860468L, new h(j ^ 32497430765521L, false, type), visible);
        $this$group.c().add(cpVar);
        return cpVar;
    }

    public static /* synthetic */ cp B(jk jkVar, String str, short s, w7 w7Var, Function0 function0, int i, int i2, Object obj, char c2) {
        long j = ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 103425023233649L;
        if ((i & 2) != 0) {
            w7Var = w7.DEFAULT;
        }
        if ((i & 4) != 0) {
            function0 = yp::d;
        }
        return h(jkVar, str, j, w7Var, function0);
    }

    @NotNull
    public static final cp T(@NotNull _g parent, char a2, @NotNull String id, char a3, @NotNull w7 type, int a4, @NotNull Function0 visible) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a;
        Intrinsics.checkNotNullParameter(parent, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10704, 5389584637261575800L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8445, 5832530802880413533L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(type, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1417, 1346333136123517487L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1364, 2243697868136078067L ^ j) /* invoke-custom */);
        cp cpVar = new cp(id, j ^ 27158880486955L, new h(j ^ 129760169856654L, false, type), visible);
        parent.c().add(cpVar);
        return cpVar;
    }

    public static /* synthetic */ cp r(_g _gVar, String str, w7 w7Var, Function0 function0, long j, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 20150737449240L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        if ((i & 4) != 0) {
            w7Var = w7.DEFAULT;
        }
        if ((i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398751241180395647L ^ j2) /* invoke-custom */) != 0) {
            function0 = yp::A;
        }
        return T(_gVar, (char) i2, str, (char) i3, w7Var, i4, function0);
    }

    @NotNull
    public static final ct P(@NotNull _g parent, @NotNull String id, float defaultValue, @NotNull ClosedFloatingPointRange range, long a2, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(parent, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2379, 5144128183750146851L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853753747965756058L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32302, 7046770450113350724L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512299672430255093L ^ j) /* invoke-custom */);
        ct ctVar = new ct(id, defaultValue, j ^ 11183482572624L, range, group, visible);
        parent.c().add(ctVar);
        return ctVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.ct] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.ct] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function0] */
    public static /* synthetic */ ct c(_g _gVar, String str, float f2, ClosedFloatingPointRange closedFloatingPointRange, h hVar, Function0 function0, int i, long j, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 90007423517605L;
        ?? M = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2616338169930728824L, j2) /* invoke-custom */;
        try {
            M = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10930, 6516874536032382405L ^ j2) /* invoke-custom */;
            ?? P = M;
            if (M != 0) {
                if (M != 0) {
                    hVar = null;
                }
                P = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25544, 4559787776819553466L ^ j2) /* invoke-custom */;
            }
            if (P != 0) {
                P = yp::k;
                function0 = P;
            }
            try {
                P = P(_gVar, str, f2, closedFloatingPointRange, j3, hVar, function0);
                if (j2 > 0) {
                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2654730403481860679L, j2) /* invoke-custom */ != null) {
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M + 1, -2619738758166871938L, j2) /* invoke-custom */;
                    }
                }
                return P;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -2606512134069036097L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -2606512134069036097L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public static final c8 o(@NotNull _g parent, @NotNull String id, int defaultValue, long a2, @NotNull IntRange range, @Nullable h group, @NotNull Function0 visible) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(parent, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2379, 5144142286470940228L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853735135383814141L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(range, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31027, 1984218415878075959L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512351828708107922L ^ j) /* invoke-custom */);
        c8 c8Var = new c8(id, defaultValue, j ^ 65522983422124L, range, group, visible);
        parent.c().add(c8Var);
        return c8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.c8] */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.c8] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function0] */
    public static /* synthetic */ c8 v(long j, _g _gVar, String str, int i, IntRange intRange, h hVar, Function0 function0, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 112438968092578L;
        ?? M = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2131571484830970839L, j2) /* invoke-custom */;
        try {
            M = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10930, 6516873793725830309L ^ j2) /* invoke-custom */;
            ?? O = M;
            if (M == 0) {
                if (M != 0) {
                    hVar = null;
                }
                O = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19312, 715460093223662950L ^ j2) /* invoke-custom */;
            }
            if (O != 0) {
                O = yp::p;
                function0 = O;
            }
            try {
                O = o(_gVar, str, i, j3, intRange, hVar, function0);
                ?? r1 = M;
                int i3 = r1;
                if (j2 < 0) {
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[i3], -2144093216627103741L, j2) /* invoke-custom */;
                } else if (r1 != 0) {
                    i3 = 3;
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[i3], -2144093216627103741L, j2) /* invoke-custom */;
                }
                return O;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, -2111115192233696545L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -2111115192233696545L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public static final cq z(char a2, @NotNull _g parent, int a3, @NotNull String id, boolean defaultValue, @Nullable h group, int a4, @NotNull Function0 visible) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(parent, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2379, 5144145265856016554L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853736676558768403L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512352969784250492L ^ j) /* invoke-custom */);
        cq cqVar = new cq(id, defaultValue, group, j ^ 54813013257556L, visible);
        parent.c().add(cqVar);
        return cqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static /* synthetic */ cq K(_g _gVar, String str, boolean z, h hVar, long j, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 5566872850054L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        ?? M = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7126239359965397982L, j2) /* invoke-custom */;
        try {
            M = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15145, 7650253880098978551L ^ j2) /* invoke-custom */;
            ?? M2 = M;
            if (M != 0) {
                if (M != 0) {
                    hVar = null;
                }
                M2 = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13629, 5714956205272495330L ^ j2) /* invoke-custom */;
            }
            if (M2 != 0) {
                function0 = yp::v;
            }
            return z((char) i2, _gVar, i3, str, z, hVar, i4, function0);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -7099456131789972203L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public static final cw M(@NotNull _g parent, int a2, @NotNull String id, byte a3, int a4, @NotNull Enum defaultValue, @Nullable h group, @NotNull Function0 visible) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a;
        Intrinsics.checkNotNullParameter(parent, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2379, 5144183379726828565L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28927, 6853702841405996460L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(defaultValue, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5934, 1030262384380713594L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(visible, (String) a(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10651, 1512248885206295747L ^ j) /* invoke-custom */);
        cw cwVar = new cw(id, defaultValue, group, j ^ 66810450277613L, visible);
        parent.c().add(cwVar);
        return cwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static /* synthetic */ cw U(_g _gVar, long j, String str, Enum r13, h hVar, Function0 function0, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 136119178107999L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 56);
        int i4 = (int) ((j3 << 40) >>> 40);
        ?? M = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-304174221360999035L, j2) /* invoke-custom */;
        try {
            M = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24694, 5398737759591974857L ^ j2) /* invoke-custom */;
            ?? M2 = M;
            if (M == 0) {
                if (M != 0) {
                    hVar = null;
                }
                M2 = i & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10930, 6516970479623507209L ^ j2) /* invoke-custom */;
            }
            if (M2 != 0) {
                function0 = yp::F;
            }
            return M(_gVar, i2, str, (byte) i3, i4, r13, hVar, function0);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(M, -351360186922501261L, j2) /* invoke-custom */;
        }
    }

    private static final boolean o() {
        return true;
    }

    private static final boolean K() {
        return true;
    }

    private static final boolean q() {
        return true;
    }

    private static final boolean E() {
        return true;
    }

    private static final boolean a() {
        return true;
    }

    private static final boolean t() {
        return true;
    }

    private static final boolean G() {
        return true;
    }

    private static final boolean U() {
        return true;
    }

    private static final boolean e() {
        return true;
    }

    private static final boolean P() {
        return true;
    }

    private static final boolean h() {
        return true;
    }

    private static final boolean j() {
        return true;
    }

    private static final boolean S() {
        return true;
    }

    private static final boolean d() {
        return true;
    }

    private static final boolean A() {
        return true;
    }

    private static final boolean k() {
        return true;
    }

    private static final boolean p() {
        return true;
    }

    private static final boolean v() {
        return true;
    }

    private static final boolean F() {
        return true;
    }

    public static void S(boolean z) {
        u = z;
    }

    public static boolean H() {
        return u;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean V() {
        return !H();
    }

    static {
        int i;
        long j = a ^ 52168955847623L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(false, 6528884058973853121L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i3 = 0;
        String str = "$béÐ\u0018¾\u0094\r·\u0012\u0010ÇÅ\u0089\fB¿B2)Ï=ù\u001c\u0010%n\u0004JTðõ\u0001\u0088\u0098¬\u0016\u0001ÚÕu\u0010úÆpþyÈ\u0002f§ùæUe²Ü\u0092\u0010¥/Xc¥µÉò\u0005\u0005ª2\u0083`2\u0098\u0010\t¡\u0085ùR\u009eB\u001fæñÌ¡\u0085Æ\u001f\u0004\u0010/\u0004Õs=\u000f\u0012ÝWÐ\b!óPíó\u0018³8±\u0092Ìl\u0018\u0098(Â\u0087¼ëW9û{uV\u00024ßÁ\u0003\u0010Ý`\u0002=öÁãLäªr\tðÝ>ß\u0010Ô¶Æ¯\u0000\u0087VCkT\u0095£¦=x\u0090\u0010{J\u009f\u009d5y;\u0086\u001d\u001bT×\u0098\u0092\u0017É\u0010´\u001c\u0099×ïö\u0005&ö\u0091ÊU9\u001b¥\u0097\u0010\u0013_Â¤(Ëä¢r\u0088\u0093\u0086sÁ\u0010=";
        int length = "$béÐ\u0018¾\u0094\r·\u0012\u0010ÇÅ\u0089\fB¿B2)Ï=ù\u001c\u0010%n\u0004JTðõ\u0001\u0088\u0098¬\u0016\u0001ÚÕu\u0010úÆpþyÈ\u0002f§ùæUe²Ü\u0092\u0010¥/Xc¥µÉò\u0005\u0005ª2\u0083`2\u0098\u0010\t¡\u0085ùR\u009eB\u001fæñÌ¡\u0085Æ\u001f\u0004\u0010/\u0004Õs=\u000f\u0012ÝWÐ\b!óPíó\u0018³8±\u0092Ìl\u0018\u0098(Â\u0087¼ëW9û{uV\u00024ßÁ\u0003\u0010Ý`\u0002=öÁãLäªr\tðÝ>ß\u0010Ô¶Æ¯\u0000\u0087VCkT\u0095£¦=x\u0090\u0010{J\u009f\u009d5y;\u0086\u001d\u001bT×\u0098\u0092\u0017É\u0010´\u001c\u0099×ïö\u0005&ö\u0091ÊU9\u001b¥\u0097\u0010\u0013_Â¤(Ëä¢r\u0088\u0093\u0086sÁ\u0010=".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[14];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i9 = 0;
                            String str3 = "¦Ø^\u000b\u008ejÏ(\u00ad\u0098\t\u001e;'¥\u0080\u0090üO¹\u009eMª¥OÉo-RR \u0013";
                            int length2 = "¦Ø^\u000b\u008ejÏ(\u00ad\u0098\t\u001e;'¥\u0080\u0090üO¹\u009eMª¥OÉo-RR \u0013".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[6];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "¾\u0088ºAºkTé\u009dp\r¸½\u0005ðõ";
                                                length2 = "¾\u0088ºAºkTé\u009dp\r¸½\u0005ðõ".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i14 = i10;
                                    i10 += 8;
                                    byte[] bytes2 = str3.substring(i14, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i15 = i3;
                        i3++;
                        strArr[i15] = strIntern;
                        int i16 = i5 + cCharAt;
                        i4 = i16;
                        if (i16 < length) {
                        }
                        str = "À=8tZ\u009dl#\u0097\u0088(«ñ¸¿*\u0010¦Q¯p¥\u008a;õûi(¤Zë©\u008d";
                        length = "À=8tZ\u009dl#\u0097\u0088(«ñ¸¿*\u0010¦Q¯p¥\u008a;õûi(¤Zë©\u008d".length();
                        cCharAt = 16;
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21355;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/yp", e2);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
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
        	at jadx.core.ProcessClass.forceProcess(ProcessClass.java:146)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:67)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/yp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yp.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 23823;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/yp", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i2].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
        	at jadx.core.ProcessClass.forceProcess(ProcessClass.java:146)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:67)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
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
            java.lang.String r1 = "su/catlean/yp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yp.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
