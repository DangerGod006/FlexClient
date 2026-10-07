package su.catlean;

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/uf.class */
public final class uf extends _g {

    @NotNull
    public static final uf b;
    static final KProperty[] x;

    @NotNull
    private static final cq U;

    @NotNull
    private static final cw L;

    @NotNull
    private static final c8 m;

    @NotNull
    private static final cq X;

    @NotNull
    private static final cq y;
    private static final long a = yz.a(717985874428662954L, 7631229677846113430L, MethodHandles.lookup().lookupClass()).a(157918839428978L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private uf(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6030, 6590697908409607948L ^ j2) /* invoke-custom */, jt.Q(), null, 4, null, j2 ^ 70335785214513L);
    }

    private final boolean T(long j) {
        return ((Boolean) U.E(this, (a ^ j) ^ 84959231686147L, x[0])).booleanValue();
    }

    private final void a(boolean z, long j) {
        U.b(this, (a ^ j) ^ 89260169392546L, x[0], Boolean.valueOf(z));
    }

    private final ar G(long j) {
        return (ar) L.E(this, (a ^ j) ^ 114506704185485L, x[1]);
    }

    private final void Q(long j, ar arVar) {
        L.b(this, (a ^ j) ^ 4122620757662L, x[1], arVar);
    }

    private final int s(long j) {
        return ((Number) m.E(this, (a ^ j) ^ 56229471815548L, x[2])).intValue();
    }

    private final void v(int i, long j) {
        m.b(this, (a ^ j) ^ 115505600967723L, x[2], Integer.valueOf(i));
    }

    private final boolean j(long j) {
        return ((Boolean) X.E(this, (a ^ j) ^ 21600977666982L, x[3])).booleanValue();
    }

    private final void E(boolean z, long j) {
        X.b(this, (a ^ j) ^ 34157413764600L, x[3], Boolean.valueOf(z));
    }

    private final boolean Y(long j) {
        return ((Boolean) y.E(this, (a ^ j) ^ 84288660339292L, x[4])).booleanValue();
    }

    private final void j(boolean z, long j) {
        y.b(this, (a ^ j) ^ 54028105910181L, x[4], Boolean.valueOf(z));
    }

    @Flow
    private final void q(SendPacket sendPacket) {
        System.out.println((Object) sendPacket.getPacket().getClass().getSimpleName());
    }

    @Flow
    private final void Z(ReceivePacket receivePacket) {
        System.out.println((Object) receivePacket.getPacket().getClass().getSimpleName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.lo] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.lo] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r35v0, types: [net.minecraft.class_243] */
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
    @Flow
    private final void w(PlayerUpdateEvent playerUpdateEvent) {
        ?? J;
        long j = a ^ 106909107873817L;
        long j2 = j ^ 83970205507022L;
        int i = (int) (j >>> 56);
        long j3 = ((j ^ 133783140942911L) << 8) >>> 8;
        long j4 = j ^ 81224859995280L;
        long j5 = j ^ 55380769630139L;
        long j6 = j ^ 137517337969469L;
        long j7 = j ^ 120207312444993L;
        long j8 = j ^ 20723086238561L;
        long j9 = j ^ 6271116945127L;
        long j10 = j ^ 35531777467714L;
        ?? T = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7584717406688139100L, j) /* invoke-custom */;
        if (T == 0) {
            try {
                try {
                    T = dx.K.t(j9, 256.0f, w2.FOV, j(j5), Y(j7));
                    if (T == 0) {
                        return;
                    }
                    try {
                        switch (so.U[G(j4).ordinal()]) {
                            case 1:
                                T = lo.k.w(j10, T, s(j8));
                                J = T;
                                class_243 class_243VarMethod_1031 = J.method_1031(0.0d, 0.9d, 0.0d);
                                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20457, 5181006043549637321L ^ j) /* invoke-custom */);
                                _8.C(j2, _8.P, _w.W.I(class_243VarMethod_1031, j6), 0, 2, null);
                                return;
                            case 2:
                                J = lo.k.w(j10, T, s(j8));
                                class_243 class_243VarMethod_10312 = J.method_1031(0.0d, 0.9d, 0.0d);
                                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_10312, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20457, 5181006043549637321L ^ j) /* invoke-custom */);
                                _8.C(j2, _8.P, _w.W.I(class_243VarMethod_10312, j6), 0, 2, null);
                                return;
                            case 3:
                                J = J((byte) i, j3, (class_1297) T);
                                class_243 class_243VarMethod_103122 = J.method_1031(0.0d, 0.9d, 0.0d);
                                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_103122, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20457, 5181006043549637321L ^ j) /* invoke-custom */);
                                _8.C(j2, _8.P, _w.W.I(class_243VarMethod_103122, j6), 0, 2, null);
                                return;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, -7594785853427375344L, j) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused2) {
                    T = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, -7594785853427375344L, j) /* invoke-custom */;
                    throw T;
                }
            } catch (NoWhenBranchMatchedException unused3) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, -7594785853427375344L, j) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void z(char r16, @org.jetbrains.annotations.NotNull net.minecraft.class_1792 r17, int r18, float r19, short r20) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uf.z(char, net.minecraft.class_1792, int, float, short):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.ar] */
    private static final boolean w() {
        long j = a ^ 85430841672723L;
        Object objG = j;
        try {
            objG = b.G(objG ^ 111424327131290L);
            return objG == ar.CUSTOM;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objG, -390746606794584294L, j) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 70002917144546L;
        long j2 = j ^ 36730380748042L;
        long j3 = j ^ 74640932163192L;
        long j4 = j ^ 119044096639774L;
        long j5 = j ^ 2882132931788L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i3 = 0;
        String str = "¾ÛG£\u009d\u0085áÏ¤\u008d3¶\u008a¯æ×Ñ&\u0015w,Å¡yþ\u0091üwýÀiO\u0010ß\u0010-nkÑÙ\u0010\f\u0086í\u0083\u008d\u0010»\u008dv0Ü4!åþT(yFHæòj\u0004*\u0090\u0095~Ó\u0090ÙÑ\u0016\u0092k]käÇþÂ¶§4\u0018GÑÿ\u008d9ç)w&:ùÜ qbé¾U\n3\u009e\u0005.'óú]Uôh\u0085IµËo.\u001fßd´ñð}±\u0081(d\u0087±Ød0\u009d¢\nä\u009fSÊØÉõ\u009fú°þA\u0004´\u0006\u0013M¿¯ò¬\u0094úÚ\u0096 <\tr[³ B\u0014x¤!ä`\tWg\rf`J²tç\u008eOÃ\u009a7\u00951ÚôÌG8[¹è\u0018.\u001c[NÐ\u009a9MpÃz~j<Íì%öô¼\u0096u3ó\u0010zÁQb\u008aó\u0011;ËÆ=\u001d=\u0010\n\u009e hÕhÎ(ßÐ\u0017Ú±J1C\u0088\u000bc1C\u0010\u0000õEÚ¤éÕgùyuÜ\u009f\u0018Å\u0094¹|nïq¶k\u008c\u008fÿàY\u0090i~\u0019\u000b\u0001¼\u0098E\u009487Ù\\±/9§â\u001cõæí=\u0095ËG¸UúÅDÐ{\u0090\n\u0010\u0080d\u0005©è\u0090\u0084fý\u009dL©jÝ/\u0012ð¹b\u001eFìNgg\u0010\u0007\u0083\u0083\u0001 ºdý¨;\u0013\u001d1h÷±ÿ\u0082ègi¹ì§ø°=\u0089C/\u0007×ÒJ.Ç\u0081 ¸\u008cñ°îF\u000fä\n\u001e\u001e\u00870\"\u008c\u0094Ý]\u009eõ°¸\u0094*»Í°\u0094»OLç\u0010\u001cÙØÞ¬Ó£\u000eï tê\u001cxÖv\u0010c\u001b\u001eãqaÚE\u0092/£\u0087!1ËI /¨:©\u0092\u007fÉ[FQø\u001dÈÕüE\u0096M^h+f\u0011¢l\u000fX?[0áï\u0018ÿ¾`\u0005ú\u0018o*{1ÂÍî_\u0099Þ¶H\u000bï³LAe ]è\u0006~2zyRW\u0090D1èì\u001al\u008c\"/\u0091è\u0087×\u0016:Ø¼<\b ñ\u008d\u0010I¯={îR\u009aH¨¾Y\u0018²§rô\u0018\fW\u009eûðÒ«ë?\u0091´ò²\u0004Å\u00163\u000fZ*\u0098\u0092-£";
        int length = "¾ÛG£\u009d\u0085áÏ¤\u008d3¶\u008a¯æ×Ñ&\u0015w,Å¡yþ\u0091üwýÀiO\u0010ß\u0010-nkÑÙ\u0010\f\u0086í\u0083\u008d\u0010»\u008dv0Ü4!åþT(yFHæòj\u0004*\u0090\u0095~Ó\u0090ÙÑ\u0016\u0092k]käÇþÂ¶§4\u0018GÑÿ\u008d9ç)w&:ùÜ qbé¾U\n3\u009e\u0005.'óú]Uôh\u0085IµËo.\u001fßd´ñð}±\u0081(d\u0087±Ød0\u009d¢\nä\u009fSÊØÉõ\u009fú°þA\u0004´\u0006\u0013M¿¯ò¬\u0094úÚ\u0096 <\tr[³ B\u0014x¤!ä`\tWg\rf`J²tç\u008eOÃ\u009a7\u00951ÚôÌG8[¹è\u0018.\u001c[NÐ\u009a9MpÃz~j<Íì%öô¼\u0096u3ó\u0010zÁQb\u008aó\u0011;ËÆ=\u001d=\u0010\n\u009e hÕhÎ(ßÐ\u0017Ú±J1C\u0088\u000bc1C\u0010\u0000õEÚ¤éÕgùyuÜ\u009f\u0018Å\u0094¹|nïq¶k\u008c\u008fÿàY\u0090i~\u0019\u000b\u0001¼\u0098E\u009487Ù\\±/9§â\u001cõæí=\u0095ËG¸UúÅDÐ{\u0090\n\u0010\u0080d\u0005©è\u0090\u0084fý\u009dL©jÝ/\u0012ð¹b\u001eFìNgg\u0010\u0007\u0083\u0083\u0001 ºdý¨;\u0013\u001d1h÷±ÿ\u0082ègi¹ì§ø°=\u0089C/\u0007×ÒJ.Ç\u0081 ¸\u008cñ°îF\u000fä\n\u001e\u001e\u00870\"\u008c\u0094Ý]\u009eõ°¸\u0094*»Í°\u0094»OLç\u0010\u001cÙØÞ¬Ó£\u000eï tê\u001cxÖv\u0010c\u001b\u001eãqaÚE\u0092/£\u0087!1ËI /¨:©\u0092\u007fÉ[FQø\u001dÈÕüE\u0096M^h+f\u0011¢l\u000fX?[0áï\u0018ÿ¾`\u0005ú\u0018o*{1ÂÍî_\u0099Þ¶H\u000bï³LAe ]è\u0006~2zyRW\u0090D1èì\u001al\u008c\"/\u0091è\u0087×\u0016:Ø¼<\b ñ\u008d\u0010I¯={îR\u009aH¨¾Y\u0018²§rô\u0018\fW\u009eûðÒ«ë?\u0091´ò²\u0004Å\u00163\u000fZ*\u0098\u0092-£".length();
        char cCharAt = '(';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = strArr;
                            d = new String[22];
                            h = new HashMap(13);
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
                            String str3 = "Þ\u001aá\u0099'¼\u008a\\Ñ·ä`þò¶¿\u0096ÍOR6\u0015cßj¾(´\tó^\u009c";
                            int length2 = "Þ\u001aá\u0099'¼\u008a\\Ñ·ä`þò¶¿\u0096ÍOR6\u0015cßj¾(´\tó^\u009c".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i10 >= length2) {
                                                f = jArr;
                                                g = new Integer[6];
                                                x = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(uf.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16253, 6965492069255509436L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6165, 2038581326763578070L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(uf.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9834, 2772048816913673406L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19900, 7991405560985454437L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(uf.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1012, 6755830653799975202L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23097, 3288382909824110826L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(uf.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7678, 6061694943129098020L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13769, 6203398842492911390L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(uf.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25550, 2238980382145816850L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25865, 4731683335481831384L ^ j) /* invoke-custom */, 0))};
                                                b = new uf(j2);
                                                U = yp.t(b, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30503, 4996989648889527797L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30764, 4624211136615855466L ^ j) /* invoke-custom */, null);
                                                L = yp.L(b, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10392, 7295022376204165701L ^ j) /* invoke-custom */, ar.SMART, null, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28316, 8562262120689214430L ^ j) /* invoke-custom */, null, j5);
                                                m = yp.L(b, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29189, 6692848328455076061L ^ j) /* invoke-custom */, 1, new IntRange(1, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3035, 2501891580660303516L ^ j) /* invoke-custom */), j4, null, uf::w, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1048, 4339037536461441372L ^ j) /* invoke-custom */, null);
                                                X = yp.t(b, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27463, 2023606666886914455L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28316, 8562262120689214430L ^ j) /* invoke-custom */, null);
                                                y = yp.t(b, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6297, 6061998659096007244L ^ j) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28316, 8562262120689214430L ^ j) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i10 >= length2) {
                                                str3 = "<DcG8é¥G?ùim\u00adN7g";
                                                length2 = "<DcG8é¥G?ùim\u00adN7g".length();
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
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u0006\bW¨Óûná uM(Ü²²mïé\u0082dÿçhØ\u009bû\f\u001e¥G\u0090\u0095\u00949b½YsPÉ8m|æN\\\u0000u¥OgXn\u001e±\u008es(\u0002'¢\u00893â\u0016\u0001U¾È\u009cIà¢6Ë4'\f}°Ú8\u009dtªe@-ü5Ëi\bð!¦å";
                        length = "\u0006\bW¨Óûná uM(Ü²²mïé\u0082dÿçhØ\u009bû\f\u001e¥G\u0090\u0095\u00949b½YsPÉ8m|æN\\\u0000u¥OgXn\u001e±\u008es(\u0002'¢\u00893â\u0016\u0001U¾È\u009cIà¢6Ë4'\f}°Ú8\u009dtªe@-ü5Ëi\bð!¦å".length();
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 17017;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/uf", e2);
            }
        }
        return d[i2];
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/uf"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uf.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 17900;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/uf", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            r1 = r52
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/uf"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.uf.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
