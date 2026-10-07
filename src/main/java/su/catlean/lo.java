package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.DisconnectEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lo.class */
public final class lo implements ym {

    @NotNull
    public static final lo k;
    public static final double c = -0.0784d;
    public static final double g = 0.2837d;
    public static final double V = 0.08511d;
    public static final double U = 0.45392000000000005d;
    public static final double i = 0.056740000000000006d;

    @NotNull
    private static final Map h;
    private static int[] d;
    private static final long a = yz.a(7221140810902236983L, -1285106618695161538L, MethodHandles.lookup().lookupClass()).a(240828536777126L);
    private static final String[] b;
    private static final String[] e;
    private static final Map f;

    private lo() {
    }

    @NotNull
    public final Map K() {
        return h;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_742 */
    @Flow(priority = 20)
    private final void B(PlayerUpdateEvent playerUpdateEvent) throws class_742 {
        long j = a ^ 81719459507646L;
        long j2 = j ^ 38387994452230L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 48849611375705L;
        long j4 = j ^ 32903569154660L;
        class_742 class_742Var = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2985381796023462471L, j) /* invoke-custom */;
        h.clear();
        for (class_742 class_742Var2 : zf.z(j3).method_18456()) {
            try {
                Map map = h;
                Integer numValueOf = Integer.valueOf(class_742Var2.method_5628());
                Intrinsics.checkNotNull(class_742Var2);
                map.put(numValueOf, new x4(j4, (class_1657) class_742Var2));
                class_742Var2 = class_742Var;
                if (class_742Var2 != null) {
                    try {
                        x4 x4Var = (x4) h.get(Integer.valueOf(class_742Var2.method_5628()));
                        if (x4Var != null) {
                            x4Var.q(i2, (char) i3, (short) i4);
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_742Var2, 2885162231906114063L, j) /* invoke-custom */;
                    }
                }
                if (class_742Var == null) {
                    return;
                }
            } catch (NumberFormatException unused2) {
                class_742Var2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_742Var2, 2885162231906114063L, j) /* invoke-custom */;
                throw class_742Var2;
            }
        }
    }

    @Flow
    private final void I(EntityRemove entityRemove) {
        long j = a ^ 35406166327886L;
        if (entityRemove.getEntity() != null) {
            synchronized (h) {
                lo loVar = k;
                Map map = h;
                class_1297 entity = entityRemove.getEntity();
                Intrinsics.checkNotNull(entity);
            }
        }
    }

    @Flow
    private final void P(DisconnectEvent disconnectEvent) {
        h.clear();
    }

    @NotNull
    public final synchronized class_243 w(long a2, @NotNull class_1657 player, int ticks) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(player, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(244, 4850489899064876172L ^ j) /* invoke-custom */);
        class_243 class_243VarMethod_1031 = F(j ^ 135629322262816L, player, ticks).method_1005().method_1031(0.0d, (-player.method_5829().method_17940()) / 2.0d, 0.0d);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32036, 5369782660885258590L ^ j) /* invoke-custom */);
        return class_243VarMethod_1031;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (r1 != 0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb A[EXC_TOP_SPLITTER, PHI: r0
  0x00eb: PHI (r0v45 ??) = (r0v17 ??), (r0v26 ??), (r0v28 ??), (r0v27 ??) binds: [B:23:0x0084, B:25:0x009a, B:45:0x00e7, B:35:0x00bf] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.x4] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v33 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized net.minecraft.class_238 F(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_1657 r11, int r12) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lo.F(long, net.minecraft.class_1657, int):net.minecraft.class_238");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00af, code lost:
    
        r0 = -0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        r33 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b7, code lost:
    
        if (r30 <= 0.0d) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        r0 = 0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ca, code lost:
    
        r0 = -0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
    
        r34 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d0, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r0 = su.catlean.zf.z(r1).method_22347(net.minecraft.class_2338.method_49638(r25.method_1031(r26 + ((double) r33), 0.25d, r30 + ((double) r34))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fb, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -7661747307958655063L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0105, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r16 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
    
        if (su.catlean.zf.z(r1).method_22347(net.minecraft.class_2338.method_49638(r25.method_1031(r26 + ((double) r33), 1.0d, r30 + ((double) r34)))) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013b, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -7661747307958655063L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        r26 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        r30 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0142, code lost:
    
        r0 = r25.method_1031(r26, 0.0d, r30);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/lo;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "q"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(688, 3104515862528752838L ^ r0));
        r25 = r0;
        r32 = r32 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0165, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016a, code lost:
    
        if (r16 <= 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016f, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0095, code lost:
    
        if (r32 < r14) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009c, code lost:
    
        if (r26 <= 0.0d) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009f, code lost:
    
        r0 = 0.3f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:5:0x0098, B:40:0x0168], limit reached: 43 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x016a -> B:5:0x0098). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_243 c(byte r12, @org.jetbrains.annotations.NotNull net.minecraft.class_1657 r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lo.c(byte, net.minecraft.class_1657, int, int, int):net.minecraft.class_243");
    }

    static {
        int i2;
        long j = a ^ 2786623441804L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -8172311132936504766L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i4 = 0;
        String str = "442qS;B\u008b¾\u0000Ò\nØð¢\u0001»¢Ø\u00033EÚ\u0001\fLé¡Fv\u0094+\n±+J±aj\u0099\u0010õE}\u008cV\u0085\u009c46(L¯tèEA(3b|w\u001f.{V\u0006¨Ô¶/WÆ,\u0011«ôC\u008aP$_m÷vcØ¶3ú\u009a\u0000\u001b¡G1QI\u0018/\u0004v\u0087>\u008e5º$q\u0019Æ\u009dO\u001fYD\u001f\u0096d\u001auî(\u0018nÆb5\u009dÒ\u009e±¬§ªmèß\t DeåüÛ©OÛ(Í%®°M í \u009a\u00adSÀ\u0006w1å\u0016#ð\u0007ïr\u0098P\u001e\u0018FÁ\u00027ëüÎ\u00adïJY\u0083Ôg";
        int length = "442qS;B\u008b¾\u0000Ò\nØð¢\u0001»¢Ø\u00033EÚ\u0001\fLé¡Fv\u0094+\n±+J±aj\u0099\u0010õE}\u008cV\u0085\u009c46(L¯tèEA(3b|w\u001f.{V\u0006¨Ô¶/WÆ,\u0011«ôC\u008aP$_m÷vcØ¶3ú\u009a\u0000\u001b¡G1QI\u0018/\u0004v\u0087>\u008e5º$q\u0019Æ\u009dO\u001fYD\u001f\u0096d\u001auî(\u0018nÆb5\u009dÒ\u009e±¬§ªmèß\t DeåüÛ©OÛ(Í%®°M í \u009a\u00adSÀ\u0006w1å\u0016#ð\u0007ïr\u0098P\u001e\u0018FÁ\u00027ëüÎ\u00adïJY\u0083Ôg".length();
        char cCharAt = '(';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            b = strArr;
                            e = new String[8];
                            k = new lo();
                            Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
                            Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20852, 1433425502799377552L ^ j) /* invoke-custom */);
                            h = mapSynchronizedMap;
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i9 = i4;
                        i4++;
                        strArr[i9] = strIntern;
                        int i10 = i6 + cCharAt;
                        i5 = i10;
                        if (i10 < length) {
                        }
                        str = "´\u0091\u0000ß\u0094è}.\u0017¦5ÐN\u0000 _\u0010úç¸Z«\f'Dn\u0013ª\u0082ìæÎL";
                        length = "´\u0091\u0000ß\u0094è}.\u0017¦5ÐN\u0000 _\u0010úç¸Z«\f'Dn\u0013ª\u0082ìæÎL".length();
                        cCharAt = 16;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    public static void c(int[] iArr) {
        d = iArr;
    }

    public static int[] E() {
        return d;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 27202;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/lo", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/lo"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lo.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
