package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kb.class */
public final class kb extends _g {

    @NotNull
    public static final kb D;
    static final KProperty[] G;

    @NotNull
    private static final cq o;

    @NotNull
    private static final cs b;

    @NotNull
    private static final c8 i;

    @NotNull
    private static final cq e;

    @NotNull
    private static final cs J;

    @NotNull
    private static final class_2960 l;

    @Nullable
    private static class_243 n;

    @Nullable
    private static class_243 t;

    @NotNull
    private static final List N;
    private static final long a = yz.a(-7427343753510430064L, -7004497900810951094L, MethodHandles.lookup().lookupClass()).a(173270329073630L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private kb(int i2, long j2) {
        long j3 = ((((long) i2) << 32) | ((j2 << 32) >>> 32)) ^ a;
        super((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9399, 1459828498679743725L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 114566792996742L);
    }

    private final boolean Y(long j2) {
        return ((Boolean) o.E(this, (a ^ j2) ^ 100520922466533L, G[0])).booleanValue();
    }

    private final Color Q(long j2) {
        return (Color) b.E(this, (a ^ j2) ^ 68873439562450L, G[1]);
    }

    private final int D(byte b2, long j2) {
        return ((Number) i.E(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ a) ^ 39809495494906L, G[2])).intValue();
    }

    private final boolean z(long j2) {
        return ((Boolean) e.E(this, (a ^ j2) ^ 120086381716640L, G[3])).booleanValue();
    }

    private final Color g(long j2) {
        return (Color) J.E(this, (a ^ j2) ^ 9596307010105L, G[4]);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:35:0x0180
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void s(su.catlean.api.event.events.render.Render2DEvent r14) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kb.s(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    public final void S(@NotNull class_4587 matrices, float x, float y, int a2, float size, int a3, char a4, @NotNull Color color) throws Throwable {
        long j2 = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        long j3 = j2 ^ 116847651515481L;
        Intrinsics.checkNotNullParameter(matrices, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26338, 5298416795602009597L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30269, 1994492766155943205L ^ j2) /* invoke-custom */);
        Matrix4f matrix4fMethod_23761 = matrices.method_23760().method_23761();
        Intrinsics.checkNotNullExpressionValue(matrix4fMethod_23761, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32231, 2125741238283740919L ^ j2) /* invoke-custom */);
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(945398401511223511L, j2) /* invoke-custom */;
        jl.y.D(matrix4fMethod_23761, n1.o(), x, y, size, size, color, color, color, color, true, gi.HALO.o(), gi.HALO.v(), gi.HALO.L(), j3, gi.HALO.w());
        try {
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(961713236043305929L, j2) /* invoke-custom */ != null) {
                strArr = new String[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(strArr, 974028557493057320L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(strArr, 1003891904905091168L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01d6: MOVE (r58 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r-1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void U(long r16, float r18, float r19, short r20) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kb.U(long, float, float, short):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: NumberFormatException -> 0x0147, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0147, blocks: (B:46:0x0138, B:48:0x0141), top: B:60:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(su.catlean.api.event.events.network.ReceivePacket r10) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kb.r(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    private static final boolean G() {
        return D.Y((a ^ 117669721356635L) ^ 123875362127290L);
    }

    private static final boolean p() {
        return D.Y((a ^ 70492390176383L) ^ 100812259177118L);
    }

    private static final boolean L() {
        return D.z((a ^ 17513032134060L) ^ 37498939311368L);
    }

    private static final boolean n(m3 m3Var) {
        Intrinsics.checkNotNullParameter(m3Var, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26540, 5014472604008583260L ^ (a ^ 113406969890095L)) /* invoke-custom */);
        return m3Var.n().x();
    }

    private static final boolean T(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j2 = a ^ 126034206619642L;
        int i3 = (int) (j2 >>> 32);
        long j3 = ((j2 ^ 65590556541093L) << 32) >>> 32;
        long j4 = j2 ^ 86269550777588L;
        long j5 = j2 ^ 107552939792786L;
        int i4 = (int) (j2 >>> 48);
        long j6 = ((j2 ^ 66319189581409L) << 16) >>> 16;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j2 << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[27];
        int i6 = 0;
        String str = "RFR\u0011\u0017¾\u001e!uÁ\u0093ªÚÕ?;\u0098£®\u0004°ø|Á\u0081iv\u001cE\u0088T¬ PÙ~fª|B\u0001\u0089xXÄ\u0012;i\u008fþ\u001c\u0096\u0083BDc\u0005è\n³Õ\u008cH\u0019ó «ý\u008bÚÀ{*\u001c3\u0085ÿ5pÞ\u0013b\u0006\u001f{\u00ad\u0006/\u009e\u009eÝ\u0098U\u0011öogD Í\u0001xZµa7U\u0086êqqåÈÜ,Û/©Ò\u001c\u0083_\u0090RÀY¨ÿí\u0091ö8\u0082\u0007\u0080ô?\u0095^¥ù\u0019l\u0099\u0019`\u0086\u0094ÿ\n\u0016\u000bO¬\u008fµdð;¡§M[ù¾\u0013þ3d\t©AÒ`}^ÀwmNQC\u00936\u0019ÁG\u008a\u0018\u0098:p²\u000f.àìÖ©s©\u0090îÿ\u0005×çìÍ¦\u008a©;(£`r\u0017\u0098ÓK\u0085{-Z\u0095ã\u009e}N\\UÒò¶ç\u008d0¹5Ê/V·DJà«Éà\u0007pÒ'\u0010aÐØ\u008bçï\"\u0010¢ô\b±Fà\u0088ü8c\u0007×\u008b?\u0013¹ºÍ]öY\u008b_äJaw÷CôªáQ\u009c^øÔÉ¼S\u008b\u0089hëoÙ{ô\u0095Õ\u0098Bò\u0089»é¡d\u0081bÑ25\u0007Ú(gì\u0016vJ¶,c\u0016\u001bXg©\u0093\u0088dU:|º?Æî«wÿaÕ\u001eE»>Ý\u0084¤\u009c®xËÿ\u0010e\u0011®ã=i\u0017\u0010\u001ac\u00899\u000fd\u009az \bSP+\u0080èGi7[d'1¾Þ7R¥*\u0005éÆ\u000býRhfÃ\th¯\u009c\u0018Í\u0019\u0096P°_\u0002;=\u00017U\u0015r´¯qÊ\b\u009c<kts(\u008aù°~\nà\u0097)\u000fb;\u0095Ë£¤B £¶AxM¢8£\n\u009cÞ!ÂÍtr{ÈåN`\u0005\u0013\u00107á\\¤¥HÓ@2»õ\u001bØJ+| @º¥\u001dÔöñ¶ Ue½.SW\u0091\u001cû½\u001b¿êh\u0000i\u0089\u007f\u0086a[ý\u001e\u0018\u0090wÆw;/&ÇS\u0006ûÒV\u0006\u000bR\u009b=\u0000¼ïT\u0011ü\u0010\u0081M·\u009a\u009bD\u0080\u0019}P±\u008aàí\u0082q@xø+ô=\"9Ö\u0016ÝÞ\u0080ï×\u0000Ôw÷\r\u0083{c¬R¬\u0091à{«©&\u008f*\u0012\u0085Ü\u0090\u0006È\u0095\u009bóÕ9x\u0087O\u0080OeÈY|\u0012\u001fßBÛû\b ùï  \u008fÒ*ÊY\u0015\u0011\u008eRÂ¡\u0098È\u001fL0.µ\t\u009c×¼\u008e]\u0011Ù*o<)³\u00188\u001e,d÷åù \u0091\u009aïd\t\u0089Ë\u0090ÉÕ\u0012\rÕÿ©üEÙ\u0001\u009fPI$5¹Ú\u0013úÒ\nb®¤P÷C(\foÛ«\u0017NzË%i¡À\u0010XÍF\u0095Â\u000fUªþà¤øc\u0002\u0094Ù\u0010snå\u001a\u0007\u0003\u0018ðÃg vRÕÔy\u0010ñ\u009c\u0000Ä±=Éh.¦^|]ó¡Õ ÂÉp,\u009d\u00052çæÝû\r]¢¿Ò,àHèßM\u0089\u0014\u0085\u0091\u001d¹\u000e\u009cÊ+";
        int length = "RFR\u0011\u0017¾\u001e!uÁ\u0093ªÚÕ?;\u0098£®\u0004°ø|Á\u0081iv\u001cE\u0088T¬ PÙ~fª|B\u0001\u0089xXÄ\u0012;i\u008fþ\u001c\u0096\u0083BDc\u0005è\n³Õ\u008cH\u0019ó «ý\u008bÚÀ{*\u001c3\u0085ÿ5pÞ\u0013b\u0006\u001f{\u00ad\u0006/\u009e\u009eÝ\u0098U\u0011öogD Í\u0001xZµa7U\u0086êqqåÈÜ,Û/©Ò\u001c\u0083_\u0090RÀY¨ÿí\u0091ö8\u0082\u0007\u0080ô?\u0095^¥ù\u0019l\u0099\u0019`\u0086\u0094ÿ\n\u0016\u000bO¬\u008fµdð;¡§M[ù¾\u0013þ3d\t©AÒ`}^ÀwmNQC\u00936\u0019ÁG\u008a\u0018\u0098:p²\u000f.àìÖ©s©\u0090îÿ\u0005×çìÍ¦\u008a©;(£`r\u0017\u0098ÓK\u0085{-Z\u0095ã\u009e}N\\UÒò¶ç\u008d0¹5Ê/V·DJà«Éà\u0007pÒ'\u0010aÐØ\u008bçï\"\u0010¢ô\b±Fà\u0088ü8c\u0007×\u008b?\u0013¹ºÍ]öY\u008b_äJaw÷CôªáQ\u009c^øÔÉ¼S\u008b\u0089hëoÙ{ô\u0095Õ\u0098Bò\u0089»é¡d\u0081bÑ25\u0007Ú(gì\u0016vJ¶,c\u0016\u001bXg©\u0093\u0088dU:|º?Æî«wÿaÕ\u001eE»>Ý\u0084¤\u009c®xËÿ\u0010e\u0011®ã=i\u0017\u0010\u001ac\u00899\u000fd\u009az \bSP+\u0080èGi7[d'1¾Þ7R¥*\u0005éÆ\u000býRhfÃ\th¯\u009c\u0018Í\u0019\u0096P°_\u0002;=\u00017U\u0015r´¯qÊ\b\u009c<kts(\u008aù°~\nà\u0097)\u000fb;\u0095Ë£¤B £¶AxM¢8£\n\u009cÞ!ÂÍtr{ÈåN`\u0005\u0013\u00107á\\¤¥HÓ@2»õ\u001bØJ+| @º¥\u001dÔöñ¶ Ue½.SW\u0091\u001cû½\u001b¿êh\u0000i\u0089\u007f\u0086a[ý\u001e\u0018\u0090wÆw;/&ÇS\u0006ûÒV\u0006\u000bR\u009b=\u0000¼ïT\u0011ü\u0010\u0081M·\u009a\u009bD\u0080\u0019}P±\u008aàí\u0082q@xø+ô=\"9Ö\u0016ÝÞ\u0080ï×\u0000Ôw÷\r\u0083{c¬R¬\u0091à{«©&\u008f*\u0012\u0085Ü\u0090\u0006È\u0095\u009bóÕ9x\u0087O\u0080OeÈY|\u0012\u001fßBÛû\b ùï  \u008fÒ*ÊY\u0015\u0011\u008eRÂ¡\u0098È\u001fL0.µ\t\u009c×¼\u008e]\u0011Ù*o<)³\u00188\u001e,d÷åù \u0091\u009aïd\t\u0089Ë\u0090ÉÕ\u0012\rÕÿ©üEÙ\u0001\u009fPI$5¹Ú\u0013úÒ\nb®¤P÷C(\foÛ«\u0017NzË%i¡À\u0010XÍF\u0095Â\u000fUªþà¤øc\u0002\u0094Ù\u0010snå\u001a\u0007\u0003\u0018ðÃg vRÕÔy\u0010ñ\u009c\u0000Ä±=Éh.¦^|]ó¡Õ ÂÉp,\u009d\u00052çæÝû\r]¢¿Ò,àHèßM\u0089\u0014\u0085\u0091\u001d¹\u000e\u009cÊ+".length();
        char cCharAt = ' ';
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i2 = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            d = new String[27];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j2 << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i12 = 0;
                            String str3 = "Z\u0005ùãá<\u0080½{\u0012¿øÚ\f\u0094\u008a\u0084Ecû~ÜK\u001dµG>_ÿU\u009a\u0089}8~\tw\u0010\u009eMM!ÇeÈç\u0011¥½F\u0010ánRÓnE0ìjËG\u008c!";
                            int length2 = "Z\u0005ùãá<\u0080½{\u0012¿øÚ\f\u0094\u008a\u0084Ecû~ÜK\u001dµG>_ÿU\u009a\u0089}8~\tw\u0010\u009eMM!ÇeÈç\u0011¥½F\u0010ánRÓnE0ìjËG\u008c!".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i13 >= length2) {
                                                g = jArr;
                                                h = new Integer[10];
                                                G = new KProperty[]{Reflection.property1(new PropertyReference1Impl(kb.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26322, 2193341291248231412L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30625, 7465017612577223312L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kb.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12384, 3107766543312385362L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1520, 9133675629754958034L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kb.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14912, 2512533809971625851L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13982, 2637296629917479843L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kb.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1394, 4381626167703453781L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24724, 8933862073779529127L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kb.class, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28501, 170192899698961001L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30419, 7646596105376936935L ^ j2) /* invoke-custom */, 0))};
                                                D = new kb(i3, j3);
                                                o = yp.t(D, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9109, 2623898225514211007L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11064, 7073873676322556368L ^ j2) /* invoke-custom */, null);
                                                kb kbVar = D;
                                                short s = (short) i4;
                                                String strT = (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9679, 5396361466211164391L ^ j2) /* invoke-custom */;
                                                Color color = Color.RED;
                                                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14852, 298889748669660986L ^ j2) /* invoke-custom */);
                                                b = yp.b(kbVar, s, strT, color, null, kb::G, 4, null, j6);
                                                i = yp.L(D, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3405, 4198628273268836461L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20677, 5440885154072539682L ^ j2) /* invoke-custom */, new IntRange((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18840, 318077064403692403L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4280, 5500327925953884758L ^ j2) /* invoke-custom */), j5, null, kb::p, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9017, 7876412259519873488L ^ j2) /* invoke-custom */, null);
                                                e = yp.t(D, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28055, 1681087430199355565L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30982, 7693572567289175008L ^ j2) /* invoke-custom */, null);
                                                kb kbVar2 = D;
                                                short s2 = (short) i4;
                                                String strT2 = (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13431, 4092625271633473886L ^ j2) /* invoke-custom */;
                                                Color color2 = Color.RED;
                                                Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6467, 2289388937046514786L ^ j2) /* invoke-custom */);
                                                J = yp.b(kbVar2, s2, strT2, color2, null, kb::L, 4, null, j6);
                                                class_2960 class_2960VarMethod_60656 = class_2960.method_60656((String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10846, 1946517400982810490L ^ j2) /* invoke-custom */);
                                                Intrinsics.checkNotNullExpressionValue(class_2960VarMethod_60656, (String) b(MethodHandles.lookup(), "t", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1895, 418577816208720479L ^ j2) /* invoke-custom */);
                                                l = class_2960VarMethod_60656;
                                                N = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i13 >= length2) {
                                                str3 = "îPP=Õ£ÇõmÚÚç\u001c\u009f\u0095ö";
                                                length2 = "îPP=Õ£ÇõmÚÚç\u001c\u009f\u0095ö".length();
                                                i13 = 0;
                                            }
                                            break;
                                    }
                                    int i17 = i13;
                                    i13 += 8;
                                    byte[] bytes2 = str3.substring(i17, i13).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i15 = i12;
                                    i12++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = i6;
                        i6++;
                        strArr[i18] = strIntern;
                        int i19 = i8 + cCharAt;
                        i7 = i19;
                        if (i19 < length) {
                        }
                        str = "Ì\nåú\u0005BQ ±Á¨®GÚkªNa~&E\u0093â=\u0010ÕÉ£ð\u0004ÅÃ\u001e\u0082\u009db\u0086p&Ïc";
                        length = "Ì\nåú\u0005BQ ±Á¨®GÚkªNa~&E\u0093â=\u0010ÕÉ£ð\u0004ÅÃ\u001e\u0082\u009db\u0086p&Ïc".length();
                        cCharAt = 24;
                        i2 = -1;
                        break;
                        break;
                }
                i8 = i2 + 1;
                strSubstring = str.substring(i8, i8 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i7);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22294;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kb", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/kb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 28872;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kb", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "su/catlean/kb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kb.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
