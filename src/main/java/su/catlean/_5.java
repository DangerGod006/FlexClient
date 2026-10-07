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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_5.class */
public final class _5 extends _3 {

    @NotNull
    public static final _5 t;
    static final KProperty[] B;

    @NotNull
    private static final cq c;

    @NotNull
    private static final c8 w;

    @NotNull
    private static final cq l;

    @NotNull
    private static final i9 i;

    @NotNull
    private static final i9 h;

    @Nullable
    private static class_3965 o;

    @Nullable
    private static class_2338 F;
    private static final long m = yz.a(4274978275322558135L, -3186876596970392574L, MethodHandles.lookup().lookupClass()).a(39814049665642L);
    private static final String[] n;
    private static final String[] y;
    private static final Map I;
    private static final long[] O;
    private static final Integer[] S;
    private static final Map W;

    /* JADX WARN: Illegal instructions before constructor call */
    private _5(long j, short s) {
        long j2 = ((j << 16) | ((((long) s) << 48) >>> 48)) ^ m;
        short s2 = (short) (j2 >>> 48);
        super((String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12149, 5413010199518729933L ^ j2) /* invoke-custom */, s2, jt.Q(), 0, false, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27735, 1564662309941339812L ^ j2) /* invoke-custom */, (short) ((r1 << 16) >>> 48), (int) (((j2 ^ 97648748101088L) << 32) >>> 32), null);
    }

    private final boolean V(long j) {
        return ((Boolean) c.E(this, (m ^ j) ^ 135456054777281L, B[0])).booleanValue();
    }

    private final int F(long j) {
        return ((Number) w.E(this, (m ^ j) ^ 57804833727989L, B[1])).intValue();
    }

    private final boolean I(long j) {
        return ((Boolean) l.E(this, (m ^ j) ^ 127693292177633L, B[2])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029f A[PHI: r0
  0x029f: PHI (r0v111 ??) = (r0v162 ??), (r0v60 ??), (r0v163 ??) binds: [B:69:0x024d, B:89:0x029d, B:76:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b0  */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.ux] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v129, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v146, types: [su.catlean.gg] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.minecraft.class_2338] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r36v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._5.c(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final boolean Z(@NotNull class_2338 pos, long a) {
        long j = m ^ a;
        long j2 = j ^ 98233007476900L;
        long j3 = j ^ 31929281025002L;
        long j4 = j ^ 140504035357680L;
        long j5 = j ^ 37849231510766L;
        Object objX = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1227882484445034119L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(pos, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30774, 1187805762528652894L ^ j) /* invoke-custom */);
        try {
            objX = gw.Y.x(pos, w(j4), j5, s(), Y(j3), Q(j2));
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1246073311966990299L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[3], 1266694993546075837L, j) /* invoke-custom */;
            }
            return objX;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objX, 1249271645417401872L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean._3
    @NotNull
    protected List R(long j) {
        return CollectionsKt.listOf(class_2246.field_10540);
    }

    private static final boolean t() {
        return t.V((m ^ 113764767281836L) ^ 101726307249001L);
    }

    public static final void E(class_3965 class_3965Var) {
        o = class_3965Var;
    }

    public static final boolean S(long a, _5 $this) {
        return $this.I((m ^ a) ^ 73333792933509L);
    }

    static {
        int i2;
        long j = m ^ 5415785378670L;
        long j2 = j ^ 53215017358335L;
        long j3 = j ^ 37917171139369L;
        long j4 = j ^ 15238152638031L;
        long j5 = j >>> 16;
        int i3 = (int) (((j ^ 139663835008160L) << 48) >>> 48);
        I = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i5 = 0;
        String str = "¢\u0080 Ágso \u0095¯.@\u001a\u009dP¸\u0015\u0097î9Nm\u000ba\u0018\u009eö`Ev\u0001P9¼\u0093\u0014Î\u0099\u0017Þ\flù(ýëæýõ ÎÂªóy\u008d\u0089\\ÃÁM*ª\u0018\u0086\t\u0098óJ?ÇÀXµ'\u0014\u0012ê7©K+\u0010\u001aR\fÐ>.A\u009e¸¦x[\u0012\u0091\u0087\u0094\u0010=»ù\u0002º\u0098G\u0004[ú6\u001cÚ\u0081ì^\u0010ë\u0086J.)\u00ad³@\u0082\u0090Ió\u001a¥D\u009d LÕËeJÈY\u007ft\u0082&ìÌÎ\u0010\u0094Ä\u0082ã§7vbâ¯\u0015¤\u009e'Ã×O(\u009c9Æó_|¯\u0011¬x·(ýª\"\u009d#ë»\u0089\u0084àF,ú\u0096Î«\u009eÌLøÑ\u0005%[Gð°[ 'kK\u009cÜÉc&û\"\u009a,Í\u0014\u0099m\u0098\u00819<¦fN×Þé(Ñ²}d\u001f\u0018í 99\u0098vs±\u001f\u009c+\u007f9Ï\u000bSü]´)9zæ\u0091\u0010¼1¹\u001d\u009aÐý£ú\u000e\u0086VS)8¬(F8Õ\u0011y\u0010\u009d5gæß\u0088\u0094\u008d\u001cA~ì\u0084hËþ\f5\tÛo\u001f¶\u001epZMv¨¢\u0083y\u0001j";
        int length = "¢\u0080 Ágso \u0095¯.@\u001a\u009dP¸\u0015\u0097î9Nm\u000ba\u0018\u009eö`Ev\u0001P9¼\u0093\u0014Î\u0099\u0017Þ\flù(ýëæýõ ÎÂªóy\u008d\u0089\\ÃÁM*ª\u0018\u0086\t\u0098óJ?ÇÀXµ'\u0014\u0012ê7©K+\u0010\u001aR\fÐ>.A\u009e¸¦x[\u0012\u0091\u0087\u0094\u0010=»ù\u0002º\u0098G\u0004[ú6\u001cÚ\u0081ì^\u0010ë\u0086J.)\u00ad³@\u0082\u0090Ió\u001a¥D\u009d LÕËeJÈY\u007ft\u0082&ìÌÎ\u0010\u0094Ä\u0082ã§7vbâ¯\u0015¤\u009e'Ã×O(\u009c9Æó_|¯\u0011¬x·(ýª\"\u009d#ë»\u0089\u0084àF,ú\u0096Î«\u009eÌLøÑ\u0005%[Gð°[ 'kK\u009cÜÉc&û\"\u009a,Í\u0014\u0099m\u0098\u00819<¦fN×Þé(Ñ²}d\u001f\u0018í 99\u0098vs±\u001f\u009c+\u007f9Ï\u000bSü]´)9zæ\u0091\u0010¼1¹\u001d\u009aÐý£ú\u000e\u0086VS)8¬(F8Õ\u0011y\u0010\u009d5gæß\u0088\u0094\u008d\u001cA~ì\u0084hËþ\f5\tÛo\u001f¶\u001epZMv¨¢\u0083y\u0001j".length();
        char cCharAt = 24;
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = c(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            n = strArr;
                            y = new String[14];
                            W = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i11 = 0;
                            String str3 = "Å\u0001hÌ\f3\u0087÷[0ø\u008eúG×1X«]H\u0080\u008aëE\t\u007f¨\r\u0015ôi`ú\u008f\u00992\u0005Å]qÍbþ\u009föúÔ!";
                            int length2 = "Å\u0001hÌ\f3\u0087÷[0ø\u008eúG×1X«]H\u0080\u008aëE\t\u007f¨\r\u0015ôi`ú\u008f\u00992\u0005Å]qÍbþ\u009föúÔ!".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j7 = j6;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b4] = j8;
                                            if (i12 >= length2) {
                                                O = jArr;
                                                S = new Integer[8];
                                                B = new KProperty[]{Reflection.property1(new PropertyReference1Impl(_5.class, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24190, 5720239050643774960L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5369, 2364600599587018618L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(_5.class, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9611, 1029477084455986697L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8955, 4195260064322675069L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(_5.class, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12618, 5657583513104970435L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10905, 8141619688878532889L ^ j) /* invoke-custom */, 0))};
                                                t = new _5(j5, (short) i3);
                                                c = yp.t(t, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15689, 3529007234858090182L ^ j) /* invoke-custom */, false, j3, null, null, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26805, 651141677993416816L ^ j) /* invoke-custom */, null);
                                                w = yp.L(t, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13040, 5554760336999936379L ^ j) /* invoke-custom */, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7600, 24734994357988723L ^ j) /* invoke-custom */, new IntRange(0, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13017, 1170309910791914008L ^ j) /* invoke-custom */), j4, null, _5::t, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8154, 5107525964100808478L ^ j) /* invoke-custom */, null);
                                                l = yp.t(t, (String) c(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24314, 1541765563209850237L ^ j) /* invoke-custom */, false, j3, null, null, (int) f(MethodHandles.lookup(), "c", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26805, 651141677993416816L ^ j) /* invoke-custom */, null);
                                                i = new i9(j2);
                                                h = new i9(j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j8;
                                            if (i12 >= length2) {
                                                str3 = "\u001a\u0085ùË\u0086\u0091\u0093\u0093«*#nóÛùÅ";
                                                length2 = "\u001a\u0085ùË\u0086\u0091\u0093\u0093«*#nóÛùÅ".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i16 = i12;
                                    i12 += 8;
                                    byte[] bytes2 = str3.substring(i16, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i17 = i5;
                        i5++;
                        strArr[i17] = strIntern;
                        int i18 = i7 + cCharAt;
                        i6 = i18;
                        if (i18 < length) {
                        }
                        str = "¡\u0010;ms|\u000b¨¸(F²\u007fèE\u0080@]\u007f):\u0080CßÐt»ó¸\u001e\u0083ø}üÅjQâJ7DàñÝºçÁ\u0095(dJ©hu\u0094Á\u0099#í\\Dîì4aÀç\n\u0015æiµZO&üºN?\u009e\u0098=\u001ea;\\ÎèÎ";
                        length = "¡\u0010;ms|\u000b¨¸(F²\u007fèE\u0080@]\u007f):\u0080CßÐt»ó¸\u001e\u0083ø}üÅjQâJ7DàñÝºçÁ\u0095(dJ©hu\u0094Á\u0099#í\\Dîì4aÀç\n\u0015æiµZO&üºN?\u009e\u0098=\u001ea;\\ÎèÎ".length();
                        cCharAt = '0';
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i6);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String c(byte[] bArr) {
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

    private static String c(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18032;
        if (y[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) I.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    I.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                y[i3] = c(((Cipher) objArr[0]).doFinal(n[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_5", e);
            }
        }
        return y[i3];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strC), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strC;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._5.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int f(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 13628;
        if (S[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) O[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) W.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    W.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_5", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            S[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return S[i3].intValue();
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iF = f(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iF)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iF;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._5.f(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
