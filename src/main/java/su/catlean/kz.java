package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kz.class */
public final class kz extends _g {

    @NotNull
    public static final kz e;
    static final KProperty[] C;

    @NotNull
    private static final cw X;

    @NotNull
    private static final cs h;

    @NotNull
    private static final c8 t;
    private static int G;

    @NotNull
    private static List m;
    private static final long a = yz.a(6680345788288045339L, 5452596865731013714L, MethodHandles.lookup().lookupClass()).a(216175532279012L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private kz(int i2, short s, char c2) {
        long j = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26194, 5034510585594246300L ^ j) /* invoke-custom */, jt.z(), null, 4, null, j ^ 94412641402865L);
    }

    private final xn T(long j) {
        return (xn) X.E(this, (a ^ j) ^ 36767806932219L, C[0]);
    }

    private final Color Y(byte b2, long j) {
        return (Color) h.E(this, (((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a) ^ 33841796604001L, C[1]);
    }

    private final int H(long j) {
        return ((Number) t.E(this, (a ^ j) ^ 106719522404832L, C[2])).intValue();
    }

    private final void N(int i2, int i3, byte b2, int i4) {
        t.b(this, ((((((long) i3) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i4) << 40) >>> 40)) ^ a) ^ 56838713178993L, C[2], Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v24 */
    @Flow
    private final void H(Render3DEvent render3DEvent) {
        long j = a ^ 5386926709730L;
        long j2 = j ^ 105494621833672L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 32);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 72259046360113L;
        long j4 = j ^ 111420833125149L;
        int i5 = (int) (j >>> 56);
        long j5 = ((j ^ 99926364944263L) << 8) >>> 8;
        long j6 = j ^ 34098800751567L;
        int i6 = (int) (j >>> 48);
        int i7 = (int) ((j6 << 16) >>> 32);
        int i8 = (int) ((j6 << 48) >>> 48);
        long j7 = j ^ 88851676173437L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1186078642140302116L, j) /* invoke-custom */;
        Iterator it = m.iterator();
        while (it.hasNext()) {
            class_238 class_238Var = new class_238((class_2338) it.next());
            Object obj = z;
            if (obj == 0) {
                return;
            }
            try {
                try {
                    obj = rv.u[e.T(j4).ordinal()];
                    if (z) {
                        switch (obj) {
                            case 1:
                                zi ziVar = zi.v;
                                class_238 class_238VarMethod_35578 = class_238Var.method_35578(r0.method_10264());
                                Intrinsics.checkNotNullExpressionValue(class_238VarMethod_35578, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15070, 7794043912300041857L ^ j) /* invoke-custom */);
                                zi.E(j3, ziVar, class_238VarMethod_35578, e.Y((byte) i5, j5), null, 4, null);
                                zi ziVar2 = zi.v;
                                class_238 class_238VarMethod_355782 = class_238Var.method_35578(r0.method_10264());
                                Intrinsics.checkNotNullExpressionValue(class_238VarMethod_355782, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1043, 5889136382244825166L ^ j) /* invoke-custom */);
                                zi.x(ziVar2, j7, class_238VarMethod_355782, jl.y.p(e.Y((byte) i5, j5), (char) i6, i7, 1.0f, (short) i8), null, 4, null);
                                break;
                            case 2:
                                zi.E(j3, zi.v, class_238Var, e.Y((byte) i5, j5), null, 4, null);
                                zi.x(zi.v, j7, class_238Var, jl.y.p(e.Y((byte) i5, j5), (char) i6, i7, 1.0f, (short) i8), null, 4, null);
                                break;
                            case 3:
                                zi.x(zi.v, j7, class_238Var, jl.y.p(e.Y((byte) i5, j5), (char) i6, i7, 1.0f, (short) i8), null, 4, null);
                                break;
                            case 4:
                                zi.L(zi.v, (short) i2, new class_243(class_238Var.field_1323, class_238Var.field_1322, class_238Var.field_1324), new class_243(class_238Var.field_1320, class_238Var.field_1322, class_238Var.field_1321), e.Y((byte) i5, j5), null, true, i3, (char) i4, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14827, 1167930398573502100L ^ j) /* invoke-custom */, null);
                                zi.L(zi.v, (short) i2, new class_243(class_238Var.field_1320, class_238Var.field_1322, class_238Var.field_1324), new class_243(class_238Var.field_1323, class_238Var.field_1322, class_238Var.field_1321), e.Y((byte) i5, j5), null, true, i3, (char) i4, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29089, 1523962774952236763L ^ j) /* invoke-custom */, null);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (!z) {
                        return;
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    obj = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1178722747331759617L, j) /* invoke-custom */;
                    throw obj;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1178722747331759617L, j) /* invoke-custom */;
            }
        }
    }

    @Flow
    private final void b(PlayerUpdateEvent playerUpdateEvent) {
        m = s((a ^ 8560657640362L) ^ 11142842453395L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0086, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0088, code lost:
    
        r0 = net.minecraft.class_2338.method_49637((double) r0, su.catlean.zf.z(r1).method_31607(), r21);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/kz;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "k"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(4550, 3943051180462803487L ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ab, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b0, code lost:
    
        if (r0 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        if (r0 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        r0 = kotlin.jvm.internal.Intrinsics.areEqual(su.catlean.zf.z(r1).method_8320(r0).method_26204(), net.minecraft.class_2246.field_9987);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cb, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        if (r0 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, -6352401310816962163L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
    
        if (r0 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        if (r0 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        r0 = r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fe, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, -6352401310816962163L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        r21 = r21 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0102, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        if (r0 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        r19 = r19 + 1;
        r0 = r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (r0 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        if (r0 <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0120, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
    
        if (r0 < r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005b, code lost:
    
        r21 = (int) (su.catlean.zf.v(r1).method_23321() - ((double) H(r1)));
        r0 = (int) (su.catlean.zf.v(r1).method_23321() + ((double) H(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0083, code lost:
    
        if (r21 >= r22) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:6:0x005b, B:36:0x0115], limit reached: 51 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010f -> B:11:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0118 -> B:6:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List s(long r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kz.s(long):java.util.List");
    }

    static {
        int i2;
        long j = a ^ 97045749215361L;
        long j2 = j ^ 90926102622562L;
        int i3 = (int) (j >>> 48);
        long j3 = ((j ^ 16711171831441L) << 16) >>> 16;
        long j4 = j ^ 66419313706672L;
        long j5 = j ^ 49101872504745L;
        int i4 = (int) (j >>> 32);
        int i5 = (int) ((j5 << 32) >>> 48);
        int i6 = (int) ((j5 << 48) >>> 48);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i7 = 1; i7 < 8; i7++) {
            bArr[i7] = (byte) ((j << (i7 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i8 = 0;
        String str = "ïó~\u0005Á\u001dmæöÛrE\u000e\u000e¥·U\u0084ÌD3Ó\u008a\u009f\u008d\u009c¶£/ÄGy8Éö}b\u007fu>DÉ5ûÉæy5ZÝ\ní\u0084\u0095o0\u009dÈº¬F\u008fÑ\u0092âX\u0018\u0087Ë@:ÜòEóW\u0092-Í\u0006uP7\u0005ë\u0018ß\u008c¯\u0010=>\u008aËk_éÈu_\u0001qª\u0001_Æ\u0010Ä[Z\u0006=~\u008ecT\u0082ÌWN\u0087Ån\u0010zä\u0003:Ðl©\u001d&é¦ègÂýK\u0010NjÝI\u000bh\u0010_o½\u009d!î\tùH ÞQ\u0004Û\u0089úf\u0018\u009f.íú¯³\u0088\u009eV1v\u0011\u008fqM]&Õ#Ìü\u0015\u001cç\u0010¥8\bB\u0083/SËñ\r²\u009cYÙ\u0018\r QOµf\u000e|\u00adKõïÒ§ØB£cSò3÷\u0081ä\u0098\u0001º»³~\u001f¬'Q\u0010F\f7\u0080$É9üP\u0085\u0014ÓÏbVj\u0018·CëW_\u0099\u009c\u001fýÀ$cÁìNÈ¥X0Ùª\u0099¼\u008288ÎAêeî¤Û\u0089e\u0013ô5/ \u001c/J×\u0011B\u0017\u0087¦\u0003E\u0098\u000b0\u009f\u001b\"Ó¬3º\u00041ÒET\u0013\u009f¤´jº¼é£\u0091ÁX\u0015]Å";
        int length = "ïó~\u0005Á\u001dmæöÛrE\u000e\u000e¥·U\u0084ÌD3Ó\u008a\u009f\u008d\u009c¶£/ÄGy8Éö}b\u007fu>DÉ5ûÉæy5ZÝ\ní\u0084\u0095o0\u009dÈº¬F\u008fÑ\u0092âX\u0018\u0087Ë@:ÜòEóW\u0092-Í\u0006uP7\u0005ë\u0018ß\u008c¯\u0010=>\u008aËk_éÈu_\u0001qª\u0001_Æ\u0010Ä[Z\u0006=~\u008ecT\u0082ÌWN\u0087Ån\u0010zä\u0003:Ðl©\u001d&é¦ègÂýK\u0010NjÝI\u000bh\u0010_o½\u009d!î\tùH ÞQ\u0004Û\u0089úf\u0018\u009f.íú¯³\u0088\u009eV1v\u0011\u008fqM]&Õ#Ìü\u0015\u001cç\u0010¥8\bB\u0083/SËñ\r²\u009cYÙ\u0018\r QOµf\u000e|\u00adKõïÒ§ØB£cSò3÷\u0081ä\u0098\u0001º»³~\u001f¬'Q\u0010F\f7\u0080$É9üP\u0085\u0014ÓÏbVj\u0018·CëW_\u0099\u009c\u001fýÀ$cÁìNÈ¥X0Ùª\u0099¼\u008288ÎAêeî¤Û\u0089e\u0013ô5/ \u001c/J×\u0011B\u0017\u0087¦\u0003E\u0098\u000b0\u009f\u001b\"Ó¬3º\u00041ÒET\u0013\u009f¤´jº¼é£\u0091ÁX\u0015]Å".length();
        char cCharAt = ' ';
        int i9 = -1;
        while (true) {
            int i10 = i9 + 1;
            String strSubstring = str.substring(i10, i10 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i11 = i8;
                        i8++;
                        strArr[i11] = strIntern;
                        int i12 = i10 + cCharAt;
                        i2 = i12;
                        if (i12 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[14];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i13 = 1; i13 < 8; i13++) {
                                bArr2[i13] = (byte) ((j << (i13 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i14 = 0;
                            String str3 = "\u0010OÅ¸ß ìÖÝ\u009faL}jð\u009e6\u007f7\u0087kB»Â¥Wåî\u009aä©¢<y·,<=#z";
                            int length2 = "\u0010OÅ¸ß ìÖÝ\u009faL}jð\u009e6\u007f7\u0087kB»Â¥Wåî\u009aä©¢<y·,<=#z".length();
                            int i15 = 0;
                            while (true) {
                                int i16 = i15;
                                i15 += 8;
                                byte[] bytes = str3.substring(i16, i15).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i17 = i14;
                                i14++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i18 = i17;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i18) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i15 >= length2) {
                                                f = jArr;
                                                g = new Integer[7];
                                                C = new KProperty[]{Reflection.property1(new PropertyReference1Impl(kz.class, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32173, 1186427514750122642L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17272, 4700643265643414597L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kz.class, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2487, 8518819102230171268L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3328, 3800732760406018615L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(kz.class, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10242, 2990225100736556851L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23490, 9019532152803859704L ^ j) /* invoke-custom */, 0))};
                                                e = new kz(i4, (short) i5, (char) i6);
                                                X = yp.L(e, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19753, 6466427584446958107L ^ j) /* invoke-custom */, xn.CROSS, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17345, 4114591831613312987L ^ j) /* invoke-custom */, null, j4);
                                                kz kzVar = e;
                                                short s = (short) i3;
                                                String strK = (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11012, 4613437855165115441L ^ j) /* invoke-custom */;
                                                Color color = Color.WHITE;
                                                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11313, 300387444207872773L ^ j) /* invoke-custom */);
                                                h = yp.b(kzVar, s, strK, color, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19613, 4400962590507925637L ^ j) /* invoke-custom */, null, j3);
                                                t = yp.L(e, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19573, 4462735316334447438L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7823, 9041372182328365712L ^ j) /* invoke-custom */, new IntRange(1, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(282, 4517607872492719361L ^ j) /* invoke-custom */), j2, null, null, (int) c(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17533, 3474003619399403616L ^ j) /* invoke-custom */, null);
                                                m = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i15 >= length2) {
                                                str3 = "ý\u0085åÈ±\u007fØV§í1ì 97/";
                                                length2 = "ý\u0085åÈ±\u007fØV§í1ì 97/".length();
                                                i15 = 0;
                                            }
                                            break;
                                    }
                                    int i19 = i15;
                                    i15 += 8;
                                    byte[] bytes2 = str3.substring(i19, i15).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i17 = i14;
                                    i14++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i20 = i8;
                        i8++;
                        strArr[i20] = strIntern;
                        int i21 = i10 + cCharAt;
                        i9 = i21;
                        if (i21 < length) {
                        }
                        str = "Fi\u0093!\u009d×\u001ekÜ$bü\u0010Â:\u008eô\u008f\u0005\u0018\u00ad\u0094\u0014pûè\u0094º2d}^\u0010A¯V\u001a\u001e¾¨\u0088>\f +u[ÛZ";
                        length = "Fi\u0093!\u009d×\u001ekÜ$bü\u0010Â:\u008eô\u008f\u0005\u0018\u00ad\u0094\u0014pûè\u0094º2d}^\u0010A¯V\u001a\u001e¾¨\u0088>\f +u[ÛZ".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i10 = i2 + 1;
                strSubstring = str.substring(i10, i10 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i9);
        }
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 15840;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kz", e2);
            }
        }
        return c[i3];
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
            java.lang.String r1 = "su/catlean/kz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 14031;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kz", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
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
            java.lang.String r1 = "su/catlean/kz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kz.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
