package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.InteractionManagerAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k_.class */
public final class k_ extends _g {

    @NotNull
    public static final k_ C;
    static final KProperty[] B;

    @NotNull
    private static final cq N;

    @NotNull
    private static final cw w;

    @NotNull
    private static final cs E;

    @NotNull
    private static final cs c;

    @NotNull
    private static final cs b;
    private static float K;
    private static float a;

    @NotNull
    private static final CopyOnWriteArrayList O;
    private static final long d = yz.a(-5936121614274688790L, 8831190321826685800L, MethodHandles.lookup().lookupClass()).a(173938899466364L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private k_(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ d;
        super((String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30362, 8680621514720457655L ^ j2) /* invoke-custom */, jt.z(), null, 4, null, j2 ^ 18147761758241L);
    }

    private final boolean h(char c2, char c3, int i2) {
        return ((Boolean) N.E(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ d) ^ 7159247741152L, B[0])).booleanValue();
    }

    private final c4 F(long j2, char c2) {
        return (c4) w.E(this, (((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ d) ^ 87771718720229L, B[1]);
    }

    private final Color e(long j2) {
        return (Color) E.E(this, (d ^ j2) ^ 116950563733063L, B[2]);
    }

    private final Color W(int i2, int i3, char c2) {
        return (Color) c.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ d) ^ 111021921789008L, B[3]);
    }

    private final Color V(long j2) {
        return (Color) b.E(this, (d ^ j2) ^ 139233484844715L, B[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[PHI: r0
  0x013d: PHI (r0v35 ??) = (r0v23 ??), (r0v27 ??), (r0v29 java.util.concurrent.CopyOnWriteArrayList) binds: [B:24:0x00eb, B:44:0x013b, B:31:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M(su.catlean.api.event.events.network.ReceivePacket r13) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k_.M(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    @Flow
    private final void a(PlayerUpdateEvent playerUpdateEvent) {
        long j2 = d ^ 88406448231622L;
        int i2 = (int) (j2 >>> 32);
        long j3 = ((j2 ^ 66210402305722L) << 32) >>> 32;
        CopyOnWriteArrayList copyOnWriteArrayList = O;
        Function1 function1 = k_::E;
        copyOnWriteArrayList.removeIf((v1) -> {
            return x(r1, v1);
        });
        a = K;
        InteractionManagerAccessor interactionManagerAccessorZ = zf.Z(i2, j3);
        Intrinsics.checkNotNull(interactionManagerAccessorZ, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18838, 4210128563284793485L ^ j2) /* invoke-custom */);
        K = interactionManagerAccessorZ.getCurBlockDamageMP();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x012f: INVOKE (r-1 I:su.catlean.k_), (r0 I:net.minecraft.class_2338), (r1 I:long), (r2 I:float) DIRECT call: su.catlean.k_.s(net.minecraft.class_2338, long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void k(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.render.Render3DEvent r10) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k_.k(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: Failed to decode insn: 0x0107: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[16]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
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
    private final void s(net.minecraft.class_2338 r17, long r18, float r20) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k_.s(net.minecraft.class_2338, long, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.minecraft.class_238] */
    private final class_238 c(long j2, class_2338 class_2338Var, float f2) {
        long j3 = d ^ j2;
        Object class_238Var = j3;
        try {
            switch (ij.a[F(class_238Var >>> 16, (char) (((class_238Var ^ 30412801688472L) << 48) >>> 48)).ordinal()]) {
                case 1:
                    class_238Var = new class_238(class_2338Var);
                    return class_238Var;
                case 2:
                    float f3 = 1.0f - f2;
                    class_238 class_238VarMethod_989 = new class_238(class_2338Var).method_1002(f3, f3, f3).method_989(((double) f3) / ((double) 2.0f), ((double) f3) / ((double) 2.0f), ((double) f3) / ((double) 2.0f));
                    Intrinsics.checkNotNull(class_238VarMethod_989);
                    return class_238VarMethod_989;
                case 3:
                    class_238 class_238VarMethod_9892 = new class_238(class_2338Var).method_1002(f2, f2, f2).method_989(((double) f2) / ((double) 2.0f), ((double) f2) / ((double) 2.0f), ((double) f2) / ((double) 2.0f));
                    Intrinsics.checkNotNull(class_238VarMethod_9892);
                    return class_238VarMethod_9892;
                case 4:
                    class_238 class_238VarMethod_35578 = new class_238(class_2338Var).method_35578(((double) class_2338Var.method_10264()) + ((double) f2));
                    Intrinsics.checkNotNull(class_238VarMethod_35578);
                    return class_238VarMethod_35578;
                case AbstractJsonLexerKt.TC_COLON /* 5 */:
                    class_238 class_238VarMethod_355782 = new class_238(class_2338Var).method_35578(((double) class_2338Var.method_10264()) + ((double) (1.0f - f2)));
                    Intrinsics.checkNotNull(class_238VarMethod_355782);
                    return class_238VarMethod_355782;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_238Var, 7277509409736958379L, j3) /* invoke-custom */;
        }
        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_238Var, 7277509409736958379L, j3) /* invoke-custom */;
    }

    private static final boolean E(zo zoVar) {
        return zoVar.o((d ^ 55599873926959L) ^ 93805927299327L);
    }

    private static final boolean x(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j2 = d ^ 136273210810720L;
        long j3 = j2 ^ 15048723863470L;
        int i3 = (int) (j2 >>> 48);
        long j4 = ((j2 ^ 140225842404667L) << 16) >>> 16;
        long j5 = j2 ^ 81659064373656L;
        int i4 = (int) (j2 >>> 32);
        int i5 = (int) ((j5 << 32) >>> 48);
        int i6 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 84466763181338L;
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i7 = 1; i7 < 8; i7++) {
            bArr[i7] = (byte) ((j2 << (i7 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[21];
        int i8 = 0;
        String str = "\u0087ñücF¢s¸\u0000¬ÀA\u000fgóy\u0088ÉD\u0091\u0089õHèÅÓ\u0014\u0084m7áò1\bzÌf/î\t)\u0090ï\u0014iüñ\u0097Ëpû\u0096\u00adM&\u0097g\u0093_\u001fF]\u0016ÿ»\u001c¡R\u0093ÏW\u0088 ¼¯\u008cw Y}\u0016Ä²Cu\u0005üÿ©)?\u0004\u001fþ\u0005\u0006\u008c´\u0089\u000e®Ç)F.2\u009cçË·å4 ?qèÔöæí\u0003\u009a¥O!r\u0011r\rÂA\\\u0095\u00adòõ\u0010¾\u001cCð¼\u000e¯\u0080ä\u000eÖ\u0085\u0013ß\u000f\u0092\u0010¨I:\u0096\u008c\u0090o\u008b]´fªnÁ\u007fÆ(·&´\t\u0003-qx5×\u0098\rÍÜ£\r¸ýY¦ZtUñ7Z\u0017[Àý\u001eõr@oÜÀ\u0092\u0092Ö\u0098\u000fL>o{.\u0093dc\u0093¿Á`Ë¬\u001cL/+k\u0096dÚ\u001eÁstÓUa\u007fÞù\u0098Ð\u0091oDZÂ×Ð®\u0017HbCÍ\u001fÓ\u009eZçµk\u0002Â&ÈVÉ*KÃ$öWé.ºe¢âÈA\u001f\u0012£ø]E\\]\u0005»+ctã\u00109\u0080ñ),\u0015\u001c\u0002þö¦\u0092ýe»1÷\u001d\u00ad+O¿ÉO¹¥\u00ad==Âãö¨fÁ\u000e@(\u0095·\u007f[6½å¬±ìf}ê\u0096]à*\u0014h\u00ad\u007fÄv\u009e S\u0001\u000b/[ñNa3úr_\u008cÊNãtY`9âÎ'QBÓýXÐûc \u0018\u0096ÓØ\u00ad.ßf\u0013e=\r7Ý\u009e¤÷íÑ-ûÑð\u0080¬ \u0089Ù\u00ad\u0096ç18\u0094^¹²mW¬M\u0094\u0084¹ø Ñ+äa\u001dÌQøx°¦k0õ\u0001þV\u008f\u009aK´p\u0089Îè{î\u0007Õµæ\u0094wÆ'¼,»>¬V\u000e±7v\u0095%\u0011TT²õ)zp0Â\u001a\u0001Ö}\u0010È^æ¯6\u0083.sÃ 8ÕJh9`8 D°\u008bvv\u0017\u0087 ß^_LYr\u009c\u008dE3Á±\u007fè\u0018ÄÂ\u000b\u001eÙ\u007f.æ<ÑETKö8``\u0010Ï\u0098-=ÄmzoÒ\u0005Èù\u0087á\u0018J¾\u001e\u00ad·ý3PÇc#l<³%\u000båp\u0084àÄ\u0014\u009dd8Ürë,d\u00adq\u0090\u0093hªdSê\u000fr\u001do>\u000b@ëÊbÇÎ]Ä\u007fy\u009a\u001a×à\u0005üÝ|Á\u009f\u0093\u0007ÑµS\u000e\u009a}OgKP9Ò®x\u0010§M©\u0086[aõÈUÇ\b\u001e÷µØü 7²*\u0085ÑQ<°\u001a\u0096\u0000\u00195\u0015\u0006ý\u0015`Ò`rÇü]\u009båÎn\u001b½þ\u008e Î96çºY»Ôº«Þ\u0016týr(á\u0000©\u008d\u0098jÅ ?ë\\x\u0000\u0003õB \u0080[\u001d££±\tL\\dð\n±WaLÒ\u0087]ùÂ<\u0010c\u0086\u0082~:\u0081\u0099\u0005ó8\u008eÃ8SI½`X\u0007\u0092ÑcÙæJÅdÛ\u0084?\u001b\u0005\u000bÙS!\u0099ÍêL¾\u0081¯æëÂô\u0085\u0016\fú\u0012@µA4êH\u0081\u009chü\u0019*«±\u0010cz·÷V-»MíQ;¹=6ÛÅ";
        int length = "\u0087ñücF¢s¸\u0000¬ÀA\u000fgóy\u0088ÉD\u0091\u0089õHèÅÓ\u0014\u0084m7áò1\bzÌf/î\t)\u0090ï\u0014iüñ\u0097Ëpû\u0096\u00adM&\u0097g\u0093_\u001fF]\u0016ÿ»\u001c¡R\u0093ÏW\u0088 ¼¯\u008cw Y}\u0016Ä²Cu\u0005üÿ©)?\u0004\u001fþ\u0005\u0006\u008c´\u0089\u000e®Ç)F.2\u009cçË·å4 ?qèÔöæí\u0003\u009a¥O!r\u0011r\rÂA\\\u0095\u00adòõ\u0010¾\u001cCð¼\u000e¯\u0080ä\u000eÖ\u0085\u0013ß\u000f\u0092\u0010¨I:\u0096\u008c\u0090o\u008b]´fªnÁ\u007fÆ(·&´\t\u0003-qx5×\u0098\rÍÜ£\r¸ýY¦ZtUñ7Z\u0017[Àý\u001eõr@oÜÀ\u0092\u0092Ö\u0098\u000fL>o{.\u0093dc\u0093¿Á`Ë¬\u001cL/+k\u0096dÚ\u001eÁstÓUa\u007fÞù\u0098Ð\u0091oDZÂ×Ð®\u0017HbCÍ\u001fÓ\u009eZçµk\u0002Â&ÈVÉ*KÃ$öWé.ºe¢âÈA\u001f\u0012£ø]E\\]\u0005»+ctã\u00109\u0080ñ),\u0015\u001c\u0002þö¦\u0092ýe»1÷\u001d\u00ad+O¿ÉO¹¥\u00ad==Âãö¨fÁ\u000e@(\u0095·\u007f[6½å¬±ìf}ê\u0096]à*\u0014h\u00ad\u007fÄv\u009e S\u0001\u000b/[ñNa3úr_\u008cÊNãtY`9âÎ'QBÓýXÐûc \u0018\u0096ÓØ\u00ad.ßf\u0013e=\r7Ý\u009e¤÷íÑ-ûÑð\u0080¬ \u0089Ù\u00ad\u0096ç18\u0094^¹²mW¬M\u0094\u0084¹ø Ñ+äa\u001dÌQøx°¦k0õ\u0001þV\u008f\u009aK´p\u0089Îè{î\u0007Õµæ\u0094wÆ'¼,»>¬V\u000e±7v\u0095%\u0011TT²õ)zp0Â\u001a\u0001Ö}\u0010È^æ¯6\u0083.sÃ 8ÕJh9`8 D°\u008bvv\u0017\u0087 ß^_LYr\u009c\u008dE3Á±\u007fè\u0018ÄÂ\u000b\u001eÙ\u007f.æ<ÑETKö8``\u0010Ï\u0098-=ÄmzoÒ\u0005Èù\u0087á\u0018J¾\u001e\u00ad·ý3PÇc#l<³%\u000båp\u0084àÄ\u0014\u009dd8Ürë,d\u00adq\u0090\u0093hªdSê\u000fr\u001do>\u000b@ëÊbÇÎ]Ä\u007fy\u009a\u001a×à\u0005üÝ|Á\u009f\u0093\u0007ÑµS\u000e\u009a}OgKP9Ò®x\u0010§M©\u0086[aõÈUÇ\b\u001e÷µØü 7²*\u0085ÑQ<°\u001a\u0096\u0000\u00195\u0015\u0006ý\u0015`Ò`rÇü]\u009båÎn\u001b½þ\u008e Î96çºY»Ôº«Þ\u0016týr(á\u0000©\u008d\u0098jÅ ?ë\\x\u0000\u0003õB \u0080[\u001d££±\tL\\dð\n±WaLÒ\u0087]ùÂ<\u0010c\u0086\u0082~:\u0081\u0099\u0005ó8\u008eÃ8SI½`X\u0007\u0092ÑcÙæJÅdÛ\u0084?\u001b\u0005\u000bÙS!\u0099ÍêL¾\u0081¯æëÂô\u0085\u0016\fú\u0012@µA4êH\u0081\u009chü\u0019*«±\u0010cz·÷V-»MíQ;¹=6ÛÅ".length();
        char cCharAt = 136;
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
                            e = strArr;
                            f = new String[21];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i13 = 1; i13 < 8; i13++) {
                                bArr2[i13] = (byte) ((j2 << (i13 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i14 = 0;
                            String str3 = "àNzZN{\u0089\u0002ç\u0083µ _J\u00942cmãX\u001d=ä\n\u0085£b%\u007fÛå\u001c\u0093õì\u0085UÂã´Eo\u0010\u001fâ¢$×";
                            int length2 = "àNzZN{\u0089\u0002ç\u0083µ _J\u00942cmãX\u001d=ä\n\u0085£b%\u007fÛå\u001c\u0093õì\u0085UÂã´Eo\u0010\u001fâ¢$×".length();
                            int i15 = 0;
                            while (true) {
                                int i16 = i15;
                                i15 += 8;
                                byte[] bytes = str3.substring(i16, i15).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i17 = i14;
                                i14++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i18 = i17;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i18) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i15 >= length2) {
                                                h = jArr;
                                                i = new Integer[8];
                                                B = new KProperty[]{Reflection.property1(new PropertyReference1Impl(k_.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29109, 4569932958531785986L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26887, 8692435658449882545L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(k_.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22213, 2567852324405850750L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11897, 2382542617070226124L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(k_.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19105, 5863985827080252949L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7199, 5744606568537520300L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(k_.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9792, 5615791270232408818L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27105, 4029464007496469840L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(k_.class, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20023, 3804353494254955151L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4760, 937419629777647152L ^ j2) /* invoke-custom */, 0))};
                                                C = new k_(i4, (short) i5, (char) i6);
                                                N = yp.t(C, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16077, 2423154785095408241L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8857, 931881092526738019L ^ j2) /* invoke-custom */, null);
                                                w = yp.L(C, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14431, 513430941310180591L ^ j2) /* invoke-custom */, c4.SHRINK, null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16181, 5294474952358598602L ^ j2) /* invoke-custom */, null, j6);
                                                E = yp.b(C, (short) i3, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21767, 8308105953811935658L ^ j2) /* invoke-custom */, new Color((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13118, 4036794070594853824L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13589, 5666405119347006956L ^ j2) /* invoke-custom */), null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16181, 5294474952358598602L ^ j2) /* invoke-custom */, null, j4);
                                                c = yp.b(C, (short) i3, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3823, 5560261268976757328L ^ j2) /* invoke-custom */, new Color((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13589, 5666405119347006956L ^ j2) /* invoke-custom */), null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16181, 5294474952358598602L ^ j2) /* invoke-custom */, null, j4);
                                                b = yp.b(C, (short) i3, (String) b(MethodHandles.lookup(), "w", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29568, 3654958114972702507L ^ j2) /* invoke-custom */, new Color((int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2731, 6805974910323368534L ^ j2) /* invoke-custom */), null, null, (int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16181, 5294474952358598602L ^ j2) /* invoke-custom */, null, j4);
                                                O = new CopyOnWriteArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i15 >= length2) {
                                                str3 = "XcÄwIÇÌ\u009a6üÓr#ó\fO";
                                                length2 = "XcÄwIÇÌ\u009a6üÓr#ó\fO".length();
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
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\u001bW\u0010 J÷!Ç\u009dV-*aÞÛux¾\u007fý÷°Îï'íÃYVÀ{\u0013\u0010VÈ\u0015çÕð¤üÝ\u0005\u001f±z\u0014Sý";
                        length = "\u001bW\u0010 J÷!Ç\u009dV-*aÞÛux¾\u007fý÷°Îï'íÃYVÀ{\u0013\u0010VÈ\u0015çÕð¤üÝ\u0005\u001f±z\u0014Sý".length();
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 13765;
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
                f[i3] = b(((Cipher) objArr[0]).doFinal(e[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k_", e2);
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
            java.lang.String r1 = "su/catlean/k_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k_.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 31111;
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
                    throw new RuntimeException("su/catlean/k_", e2);
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
            java.lang.String r1 = "su/catlean/k_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k_.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
