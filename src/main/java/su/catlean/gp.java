package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gp.class */
public final class gp {

    @NotNull
    private final List k;

    @NotNull
    private final class_1657 I;
    private final float Q;
    private final float L;
    private final float e;
    private final float V;
    private final boolean H;
    private final float G;
    private final float N;
    private final boolean K;
    private final float h;
    private final boolean F;

    @NotNull
    private final sv p;
    private final boolean D;
    private final boolean R;
    private final int E;
    private final boolean o;
    private final float i;
    private final boolean s;
    private final boolean f;
    private final boolean c;
    private final boolean v;
    private final boolean j;
    private final boolean C;
    private final boolean A;
    private static final String[] b;
    private static final String[] d;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final long a = yz.a(9169581523206441333L, -170958280359002345L, MethodHandles.lookup().lookupClass()).a(102733960513791L);
    private static final Map g = new HashMap(13);

    public gp(@NotNull List entities, @NotNull class_1657 target, float placeRange, float explodeRange, float maxSelfDamage, float minDamage, boolean oldVer, float armorScale, float facePlaceHp, boolean overrideSelfDamage, float efficiencyFactor, long a2, boolean rayTrace, @NotNull sv friendProtection, boolean breakFire, boolean ignoreTerrain, int lethalMultiplier, boolean minimizeSelfDamage, float maxDamageReduction, boolean calcShields, boolean stringWaterRemove, boolean grimBreakRange, boolean explodeEChestFarm, boolean antiPortal, boolean antiQuiver, boolean overrideMinDamage) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(entities, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30741, 6745636020303484372L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(target, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20538, 6650592532087045625L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(friendProtection, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23267, 9096390029976205099L ^ j) /* invoke-custom */);
        this.k = entities;
        this.I = target;
        this.Q = placeRange;
        this.L = explodeRange;
        this.e = maxSelfDamage;
        this.V = minDamage;
        this.H = oldVer;
        this.G = armorScale;
        this.N = facePlaceHp;
        this.K = overrideSelfDamage;
        this.h = efficiencyFactor;
        this.F = rayTrace;
        this.p = friendProtection;
        this.D = breakFire;
        this.R = ignoreTerrain;
        this.E = lethalMultiplier;
        this.o = minimizeSelfDamage;
        this.i = maxDamageReduction;
        this.s = calcShields;
        this.f = stringWaterRemove;
        this.c = grimBreakRange;
        this.v = explodeEChestFarm;
        this.j = antiPortal;
        this.C = antiQuiver;
        this.A = overrideMinDamage;
    }

    @NotNull
    public final List I() {
        return this.k;
    }

    @NotNull
    public final class_1657 t() {
        return this.I;
    }

    public final float M() {
        return this.Q;
    }

    public final float U() {
        return this.L;
    }

    public final float X() {
        return this.e;
    }

    public final float a() {
        return this.V;
    }

    public final boolean e() {
        return this.H;
    }

    public final float W() {
        return this.G;
    }

    public final float v() {
        return this.N;
    }

    public final boolean u() {
        return this.K;
    }

    public final float E() {
        return this.h;
    }

    public final boolean r() {
        return this.F;
    }

    @NotNull
    public final sv b() {
        return this.p;
    }

    public final boolean T() {
        return this.D;
    }

    public final boolean Q() {
        return this.R;
    }

    public final int m() {
        return this.E;
    }

    public final boolean K() {
        return this.o;
    }

    public final float h() {
        return this.i;
    }

    public final boolean n() {
        return this.s;
    }

    public final boolean O() {
        return this.f;
    }

    public final boolean F() {
        return this.c;
    }

    public final boolean V() {
        return this.v;
    }

    public final boolean C() {
        return this.j;
    }

    public final boolean H() {
        return this.C;
    }

    public final boolean o() {
        return this.A;
    }

    @NotNull
    public final List z() {
        return this.k;
    }

    @NotNull
    public final class_1657 p() {
        return this.I;
    }

    public final float i() {
        return this.Q;
    }

    public final float d() {
        return this.L;
    }

    public final float P() {
        return this.e;
    }

    public final float q() {
        return this.V;
    }

    public final boolean N() {
        return this.H;
    }

    public final float R() {
        return this.G;
    }

    public final float x() {
        return this.N;
    }

    public final boolean A() {
        return this.K;
    }

    public final float f() {
        return this.h;
    }

    public final boolean y() {
        return this.F;
    }

    @NotNull
    public final sv g() {
        return this.p;
    }

    public final boolean L() {
        return this.D;
    }

    public final boolean S() {
        return this.R;
    }

    public final int c() {
        return this.E;
    }

    public final boolean Y() {
        return this.o;
    }

    public final float k() {
        return this.i;
    }

    public final boolean s() {
        return this.s;
    }

    public final boolean j() {
        return this.f;
    }

    public final boolean G() {
        return this.c;
    }

    public final boolean w() {
        return this.v;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean B() {
        return this.C;
    }

    public final boolean D() {
        return this.A;
    }

    @NotNull
    public final gp p(@NotNull List entities, @NotNull class_1657 target, float placeRange, float explodeRange, float maxSelfDamage, long a2, float minDamage, boolean oldVer, float armorScale, float facePlaceHp, boolean overrideSelfDamage, float efficiencyFactor, boolean rayTrace, @NotNull sv friendProtection, boolean breakFire, boolean ignoreTerrain, int lethalMultiplier, boolean minimizeSelfDamage, float maxDamageReduction, boolean calcShields, boolean stringWaterRemove, boolean grimBreakRange, boolean explodeEChestFarm, boolean antiPortal, boolean antiQuiver, boolean overrideMinDamage) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(entities, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15966, 850761253993823436L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(target, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7766, 1821809290820197598L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(friendProtection, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17288, 4113526771297632530L ^ j) /* invoke-custom */);
        return new gp(entities, target, placeRange, explodeRange, maxSelfDamage, minDamage, oldVer, armorScale, facePlaceHp, overrideSelfDamage, efficiencyFactor, j ^ 15090699591847L, rayTrace, friendProtection, breakFire, ignoreTerrain, lethalMultiplier, minimizeSelfDamage, maxDamageReduction, calcShields, stringWaterRemove, grimBreakRange, explodeEChestFarm, antiPortal, antiQuiver, overrideMinDamage);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:86:0x01b0
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.gp m(su.catlean.gp r29, java.util.List r30, net.minecraft.class_1657 r31, float r32, float r33, float r34, float r35, boolean r36, float r37, float r38, boolean r39, float r40, boolean r41, su.catlean.sv r42, boolean r43, boolean r44, int r45, boolean r46, float r47, long r48, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gp.m(su.catlean.gp, java.util.List, net.minecraft.class_1657, float, float, float, float, boolean, float, float, boolean, float, boolean, su.catlean.sv, boolean, boolean, int, boolean, float, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, java.lang.Object):su.catlean.gp");
    }

    @NotNull
    public String toString() {
        long j = a ^ 117465219528494L;
        return (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11742, 9028496657022202690L ^ j) /* invoke-custom */ + this.k + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10173, 9202148519849507122L ^ j) /* invoke-custom */ + this.I + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8095, 934308236028313862L ^ j) /* invoke-custom */ + this.Q + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23676, 4193502081899053819L ^ j) /* invoke-custom */ + this.L + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6499, 6270120486955845625L ^ j) /* invoke-custom */ + this.e + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26003, 8470346452685060881L ^ j) /* invoke-custom */ + this.V + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3475, 4964772412022821643L ^ j) /* invoke-custom */ + this.H + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8698, 1038696833266597737L ^ j) /* invoke-custom */ + this.G + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9134, 1321927615197199675L ^ j) /* invoke-custom */ + this.N + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29306, 8640043430731738352L ^ j) /* invoke-custom */ + this.K + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6645, 3289192233241151331L ^ j) /* invoke-custom */ + this.h + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20812, 8305376096871534536L ^ j) /* invoke-custom */ + this.F + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23380, 8889711531357652426L ^ j) /* invoke-custom */ + this.p + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10294, 8132852654568912567L ^ j) /* invoke-custom */ + this.D + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18624, 7149959690072839761L ^ j) /* invoke-custom */ + this.R + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6691, 1801438549843477669L ^ j) /* invoke-custom */ + this.E + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24965, 75279033822641934L ^ j) /* invoke-custom */ + this.o + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9670, 4763265677153286994L ^ j) /* invoke-custom */ + this.i + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30092, 943722676791307020L ^ j) /* invoke-custom */ + this.s + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25634, 1838233987951426239L ^ j) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8460, 8870447359418384271L ^ j) /* invoke-custom */ + this.c + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7253, 7577811804216459996L ^ j) /* invoke-custom */ + this.v + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17671, 1833407327082503051L ^ j) /* invoke-custom */ + this.j + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8864, 6760903714660203566L ^ j) /* invoke-custom */ + this.C + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29193, 5366088269265267841L ^ j) /* invoke-custom */ + this.A + ")";
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [int, java.lang.Object] */
    public int hashCode() {
        long j = a ^ 93601647090811L;
        int iHashCode = (((((((this.k.hashCode() * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27599, 8898793843073371735L ^ j) /* invoke-custom */) + this.I.hashCode()) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.Q)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.L)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.e);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1301238158434297128L, j) /* invoke-custom */;
        ?? C = (((((((((((((((((((((((((((((((((((((((iHashCode * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.V)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.H)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.G)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.N)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.K)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.h)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.F)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + this.p.hashCode()) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.D)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.R)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Integer.hashCode(this.E)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.o)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Float.hashCode(this.i)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.s)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.f)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.c)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.v)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.j)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.C)) * (int) b(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21410, 2064940633742931517L ^ j) /* invoke-custom */) + Boolean.hashCode(this.A);
        if (str != null) {
            try {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], 1348750973227571338L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, 1396371300451284746L, j) /* invoke-custom */;
            }
        }
        return C;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 1179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gp.equals(java.lang.Object):boolean");
    }

    static {
        int i;
        long j = a ^ 111439005571833L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[31];
        int i3 = 0;
        String str = "\u0086\fýç»1êW\u0010\u00adñ43×ï(1z\u0000_L\u0097G\u0000\u0018\u001e\u0012¯ ñ¾0\u009fÈÑÇëDúULô\r\u001b*\u0098\u0000vÍ \u001dD,\u008cª£¨ÎGê\u0098\u0080uÕ1\u000eæ¶ \t*\u009aë´u0bí\u009a\u0017\u0086\u0086(\u0088)H\nO\u0013\u001bØ\u0095\u009es>\u0084Øá'Ò7\u0093½\u0019\u0080[-\u0015¨K\u009b¨Éüê\u001b\u0014ù®G\nP\u0085\u0018\u00adÃÀ\u0014\u008c\fú\u000eUU\u000e½ÿ#à\u0098\u0011(\u008cwîçÁ.(\bÜ.]Fá{JÒj#¯`wQó\u0006å}\u009d¶|\u001d5ï*)áY\u009c)\b\u007f½¹W¿Ì\u009d=(]\b\u001e \u009bî\u0011®\u0089a8>ï2ñ\u0081\bNïß\u0000þ\u0086Ô\u009by¼\t*÷¬Ë\u0088ø¥Ãç}\u008b4 \u008e\u0085\u001dC£Í\u0019J(B\u0086Ì\u000fée\u0013't¸\u0014£\u0017º¬<`2MÂT¤\u008b0Øíè,0M\u0017|§\u000f}\u0010_Ë\u0007aÅ\u00ad\u009d£Â\u0010Òc¶yº\u0015²\u008f\u0002\u00814:â\u0090\nã@\u0004H\u009c\u0011\u0083WÝQd(¾S\u0089%\\\u0088\u0013&YS[\u00adè!Ï\u0019È- }\u0017ìZ±-g\u009dj¦6d\u0091Q_êÀÅ¸ÙL(Y\u000f®©$\u0005JÛ\u0011i{\u0091 q$Ç$\fHNÅ\u00adOhL\u0013öÔµs°I¼w\u0085fÂ{Oh(ð·í\u008eÉ\u0086¦H\u0005îf\u0092<üÍ÷\u0016ôf\u0002&M\u009b~\u0016à·\u008c\u008e¿hÊ\u0089s9\u009ecûüR GÐõIìx\u009a\u008f»kÙ\u0015që½\u0010VM -¿dö\u0005w÷OÏ\u000eXð\u007f\u0018ù\u0085kÆ\u0016lQ\u0099ÌÅÎ\\áMª\u0086äe\u0005½\u009f±Õþ \u0005Jñ¾áÚ\u001bLê©v\u008eV\u0096ÿõ\u0005þI\u000e\u008bZR5O¾Èû\u0000E\"« Âêàµ×Ï¶\u0006°å«9Ó*Ì\u0011\u0019\u009f\t\u0084}\u008c\u001cF\u001f\u00863MùRÍa\u0010oaZv\u008e\u0088yýð¬Ì5ðµ«ÿ(\t\u0010}ª\u0001ø:\u008aùt\u0005\u008c4\u0018\u009fÚ-r'4e\u001cr\u009aôzgþ#\u001fÇ\u0011\u009aL!\\=\u009e^x ùW\u001cÓÁ[ow\u001aM\u008a\u001a®¢n2$*Q\u009e«æ}\u0085\u0097\u008aC>]ä\u0002p Ä\u001e\n¼z`Ì0\u009e\u008bï\r}Ú\nÀ¨}·>\u0089ö$Ì\u0086\u000b\u0014[tð\u0093/(*ë@qñO>b\u009aÖ\u008d¥Ü:|\u00878³º\u0005\u0098gb*phK\u0087\u008a\u001a#:å½3ñÂ\\Ó8 è·{ö]Îó£\u0000São]-\u0002ºÐ\u001a\u009f\u0082ÓXãÒÿ«973üìX(èMæ)9\u000bô\u0015v\u008e\u0016Ö\u000b\u0011n\u001bÀBÛ\u008dÿsÛQ$÷{¸\u007f#8ÁÎÁÙV\\2òð\u0010Ü\u0085Å¦Û$uçù9\u0006Ú´÷\u0086k ãpé(\u0080\f\u008dh\u009fK>\u009aYG)Ò\u0093u!\u0015Ë`Í~\tÇ³\u001eÍJ~c 1}3í\u0011z.#à/°çW³'Ê\u001d\u0017\u008b/ô\u0001&\u0083ÆÞ&\u0003ð«RÉ(\u0019\u0098Äaj;\u0082bbùùÂ%\rU\u00ad¹p\u001c\u008a³aki\u0010\u007f\u0090\u00ad÷¿Ã!1 °Q~©Ö\u0097(f¨Ü\u000fÚ\u001a\u0012PÍ5\u000e\u001c2ÇØ:\u0087õ\u0098D\u001f\u0004rÐ\u00194Á\u0080Ð\u0019e\u0084h\u0087A\u0088G}\u0094Ã(\u001e\u000fN\u0083\u001dË\u008f\nÕ\u0090½ÔT$Ô}*ÁhÅv\u0019&k\u0097F7Ðûª\u0001È\u0087Üò²Ê\u0097í'";
        int length = "\u0086\fýç»1êW\u0010\u00adñ43×ï(1z\u0000_L\u0097G\u0000\u0018\u001e\u0012¯ ñ¾0\u009fÈÑÇëDúULô\r\u001b*\u0098\u0000vÍ \u001dD,\u008cª£¨ÎGê\u0098\u0080uÕ1\u000eæ¶ \t*\u009aë´u0bí\u009a\u0017\u0086\u0086(\u0088)H\nO\u0013\u001bØ\u0095\u009es>\u0084Øá'Ò7\u0093½\u0019\u0080[-\u0015¨K\u009b¨Éüê\u001b\u0014ù®G\nP\u0085\u0018\u00adÃÀ\u0014\u008c\fú\u000eUU\u000e½ÿ#à\u0098\u0011(\u008cwîçÁ.(\bÜ.]Fá{JÒj#¯`wQó\u0006å}\u009d¶|\u001d5ï*)áY\u009c)\b\u007f½¹W¿Ì\u009d=(]\b\u001e \u009bî\u0011®\u0089a8>ï2ñ\u0081\bNïß\u0000þ\u0086Ô\u009by¼\t*÷¬Ë\u0088ø¥Ãç}\u008b4 \u008e\u0085\u001dC£Í\u0019J(B\u0086Ì\u000fée\u0013't¸\u0014£\u0017º¬<`2MÂT¤\u008b0Øíè,0M\u0017|§\u000f}\u0010_Ë\u0007aÅ\u00ad\u009d£Â\u0010Òc¶yº\u0015²\u008f\u0002\u00814:â\u0090\nã@\u0004H\u009c\u0011\u0083WÝQd(¾S\u0089%\\\u0088\u0013&YS[\u00adè!Ï\u0019È- }\u0017ìZ±-g\u009dj¦6d\u0091Q_êÀÅ¸ÙL(Y\u000f®©$\u0005JÛ\u0011i{\u0091 q$Ç$\fHNÅ\u00adOhL\u0013öÔµs°I¼w\u0085fÂ{Oh(ð·í\u008eÉ\u0086¦H\u0005îf\u0092<üÍ÷\u0016ôf\u0002&M\u009b~\u0016à·\u008c\u008e¿hÊ\u0089s9\u009ecûüR GÐõIìx\u009a\u008f»kÙ\u0015që½\u0010VM -¿dö\u0005w÷OÏ\u000eXð\u007f\u0018ù\u0085kÆ\u0016lQ\u0099ÌÅÎ\\áMª\u0086äe\u0005½\u009f±Õþ \u0005Jñ¾áÚ\u001bLê©v\u008eV\u0096ÿõ\u0005þI\u000e\u008bZR5O¾Èû\u0000E\"« Âêàµ×Ï¶\u0006°å«9Ó*Ì\u0011\u0019\u009f\t\u0084}\u008c\u001cF\u001f\u00863MùRÍa\u0010oaZv\u008e\u0088yýð¬Ì5ðµ«ÿ(\t\u0010}ª\u0001ø:\u008aùt\u0005\u008c4\u0018\u009fÚ-r'4e\u001cr\u009aôzgþ#\u001fÇ\u0011\u009aL!\\=\u009e^x ùW\u001cÓÁ[ow\u001aM\u008a\u001a®¢n2$*Q\u009e«æ}\u0085\u0097\u008aC>]ä\u0002p Ä\u001e\n¼z`Ì0\u009e\u008bï\r}Ú\nÀ¨}·>\u0089ö$Ì\u0086\u000b\u0014[tð\u0093/(*ë@qñO>b\u009aÖ\u008d¥Ü:|\u00878³º\u0005\u0098gb*phK\u0087\u008a\u001a#:å½3ñÂ\\Ó8 è·{ö]Îó£\u0000São]-\u0002ºÐ\u001a\u009f\u0082ÓXãÒÿ«973üìX(èMæ)9\u000bô\u0015v\u008e\u0016Ö\u000b\u0011n\u001bÀBÛ\u008dÿsÛQ$÷{¸\u007f#8ÁÎÁÙV\\2òð\u0010Ü\u0085Å¦Û$uçù9\u0006Ú´÷\u0086k ãpé(\u0080\f\u008dh\u009fK>\u009aYG)Ò\u0093u!\u0015Ë`Í~\tÇ³\u001eÍJ~c 1}3í\u0011z.#à/°çW³'Ê\u001d\u0017\u008b/ô\u0001&\u0083ÆÞ&\u0003ð«RÉ(\u0019\u0098Äaj;\u0082bbùùÂ%\rU\u00ad¹p\u001c\u008a³aki\u0010\u007f\u0090\u00ad÷¿Ã!1 °Q~©Ö\u0097(f¨Ü\u000fÚ\u001a\u0012PÍ5\u000e\u001c2ÇØ:\u0087õ\u0098D\u001f\u0004rÐ\u00194Á\u0080Ð\u0019e\u0084h\u0087A\u0088G}\u0094Ã(\u001e\u000fN\u0083\u001dË\u008f\nÕ\u0090½ÔT$Ô}*ÁhÅv\u0019&k\u0097F7Ðûª\u0001È\u0087Üò²Ê\u0097í'".length();
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
                            d = new String[31];
                            n = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[24];
                            int i9 = 0;
                            String str3 = "\u008eAT\u0082îx{\u008f»Z?$\u0006zø¹À%i\u009a+×tw\u0011V@ \u0095Ù\u008f\u001c\u000enÏ\u0095 {¸¨ù«\u009b'ù^ý+\u0097K=^r©%¢}\u007fu\rh\u0098¤Óµ\u0080E\u009e)á×º¢×:Ea÷¡¦¤kÙ\u00838hOkWh¼^÷ÚÌ°Ãä\u0000êæÉã\u00193Ùê¬ñ}¿³\u0010¶ì\u0004\u0088è¿\u001aÁ+w \u00809à\u009bÉ¼¤ÈwåþD\u0014Î×lË{\u009e:ê¬Ì:\u008d\b\u0002Uu2í,\u000f»$\u0081õCR\fêK \u0081Å.Á¸(\\Ûx";
                            int length2 = "\u008eAT\u0082îx{\u008f»Z?$\u0006zø¹À%i\u009a+×tw\u0011V@ \u0095Ù\u008f\u001c\u000enÏ\u0095 {¸¨ù«\u009b'ù^ý+\u0097K=^r©%¢}\u007fu\rh\u0098¤Óµ\u0080E\u009e)á×º¢×:Ea÷¡¦¤kÙ\u00838hOkWh¼^÷ÚÌ°Ãä\u0000êæÉã\u00193Ùê¬ñ}¿³\u0010¶ì\u0004\u0088è¿\u001aÁ+w \u00809à\u009bÉ¼¤ÈwåþD\u0014Î×lË{\u009e:ê¬Ì:\u008d\b\u0002Uu2í,\u000f»$\u0081õCR\fêK \u0081Å.Á¸(\\Ûx".length();
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
                                                l = jArr;
                                                m = new Integer[24];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Ù\u0017[ÐÍ\u0098\u0082bÕøf²§ý\u00882";
                                                length2 = "Ù\u0017[ÐÍ\u0098\u0082bÕøf²§ý\u00882".length();
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
                        str = "\\Ýf4êH\u0082^ ²aËá \u0002\u0093Ü¸-\u000e.»ÑÓ\u000b¶\u0006ò´{Ù7Ê¨è[f÷¯à(uß÷,Zmõ\u0005ìñûý»S¬ú`Æ¥ÿP\u0003ÜÀdÏêË°6\u00887\u008cô\u0097ßJ\u008eox";
                        length = "\\Ýf4êH\u0082^ ²aËá \u0002\u0093Ü¸-\u000e.»ÑÓ\u000b¶\u0006ò´{Ù7Ê¨è[f÷¯à(uß÷,Zmõ\u0005ìñûý»S¬ú`Æ¥ÿP\u0003ÜÀdÏêË°6\u00887\u008cô\u0097ßJ\u008eox".length();
                        cCharAt = '(';
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
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 9797;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/gp", e);
            }
        }
        return d[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
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
            java.lang.String r1 = "su/catlean/gp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gp.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 13852;
        if (m[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) l[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) n.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/gp", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            m[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return m[i2].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/gp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gp.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
