package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ad.class */
public final class ad extends a3 {

    @NotNull
    public static final ad x;
    private static final long b = yz.a(1810444873986116528L, 5457010188984326827L, MethodHandles.lookup().lookupClass()).a(193093427466040L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;

    /* JADX WARN: Illegal instructions before constructor call */
    private ad(short s, int i2, short s2) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ b;
        super(j2 ^ 52603683965620L, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5506, 2540885444772456630L ^ j2) /* invoke-custom */);
    }

    @Override // su.catlean.a3
    public void l(@NotNull LiteralArgumentBuilder builder, long a) {
        long j2 = a ^ 131983109906692L;
        long j3 = a ^ 61473902788714L;
        Intrinsics.checkNotNullParameter(builder, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13695, 7682762403982826803L ^ a) /* invoke-custom */);
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3718159434087536429L, a) /* invoke-custom */;
        RequiredArgumentBuilder requiredArgumentBuilderJ = j((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26465, 1184475487971282720L ^ a) /* invoke-custom */, fk.V.w(), j3);
        String strQ = (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30005, 6644101910978076012L ^ a) /* invoke-custom */;
        StringArgumentType stringArgumentTypeWord = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentTypeWord, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24006, 6463520778905793945L ^ a) /* invoke-custom */);
        builder.then(requiredArgumentBuilderJ.then(j(strQ, (ArgumentType) stringArgumentTypeWord, j3).executes(ad::O)));
        builder.then(c(j2, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12012, 2559730132403701418L ^ a) /* invoke-custom */).executes(ad::V));
        builder.then(c(j2, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8054, 2347159517818844982L ^ a) /* invoke-custom */).executes(ad::Z));
        try {
            builder.then(c(j2, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(374, 2558282705916553528L ^ a) /* invoke-custom */).executes(ad::S));
            builder.executes(ad::p);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3700289887737687500L, a) /* invoke-custom */ != null) {
                iArr = new int[5];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, -3712031413769589025L, a) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, -3727052612592391245L, a) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x028d: INVOKE (r-1 I:su.catlean.ad), (r0 I:net.minecraft.class_2561), (r1 I:long) VIRTUAL call: su.catlean.ad.C(net.minecraft.class_2561, long):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final int O(com.mojang.brigadier.context.CommandContext r12) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ad.O(com.mojang.brigadier.context.CommandContext):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ec, code lost:
    
        if (r0 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
    
        r0 = r0.append("\n" + r0.k()).append(call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ad;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "q"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(26902, 317877017632326262L ^ r0));
        r1 = su.catlean.rj.B.o(r0.m(r1).X(), r1);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0121, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0124, code lost:
    
        r0 = r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0130, code lost:
    
        if (r0.m(r1).e() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0136, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -8110777301367363451L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0140, code lost:
    
        r1 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ad;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "q"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(8120, 7511068057574814933L ^ r0);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0159, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -8110777301367363451L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x015d, code lost:
    
        r1 = "";
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015f, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0165, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int V(com.mojang.brigadier.context.CommandContext r10) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ad.V(com.mojang.brigadier.context.CommandContext):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r23v1 */
    private static final int Z(CommandContext commandContext) {
        ?? AreEqual;
        long j2 = b ^ 9890647187309L;
        long j3 = j2 ^ 42139211802947L;
        long j4 = j2 ^ 22162728423968L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3554033237334955495L, j2) /* invoke-custom */;
        ArrayList<_g> arrayListL = iq.a.L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            _g _gVar = (_g) obj;
            AreEqual = 0;
            NumberFormatException numberFormatException = null;
            try {
                try {
                    AreEqual = Intrinsics.areEqual(_gVar, ew.O);
                    if (iArr != null) {
                        break;
                    }
                    ?? r0 = AreEqual;
                    if (iArr == null) {
                        r0 = AreEqual == 0 ? 1 : 0;
                    }
                    if (r0 != 0) {
                        arrayList.add(obj);
                        if (iArr != null) {
                            break;
                        }
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(numberFormatException, 3563155114250524295L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                numberFormatException = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 3563155114250524295L, j2) /* invoke-custom */;
                throw numberFormatException;
            }
        }
        arrayListL = arrayList;
        AreEqual = 0;
        for (_g _gVar2 : arrayListL) {
            int[] iArr2 = null;
            try {
                _gVar2.N(new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9511, 2096197695097482105L ^ j2) /* invoke-custom */, null), j3);
                iArr2 = iArr;
                if (iArr2 == null && iArr == null) {
                }
                return 1;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, 3563155114250524295L, j2) /* invoke-custom */;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r23v1 */
    private static final int S(CommandContext commandContext) {
        ?? AreEqual;
        long j2 = b ^ 89919701405895L;
        long j3 = j2 ^ 140074379339497L;
        long j4 = j2 ^ 84795519491466L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9149114667406678605L, j2) /* invoke-custom */;
        ArrayList<_g> arrayListL = iq.a.L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            _g _gVar = (_g) obj;
            AreEqual = 0;
            NumberFormatException numberFormatException = null;
            try {
                try {
                    AreEqual = Intrinsics.areEqual(_gVar, ew.O);
                    if (iArr != null) {
                        break;
                    }
                    ?? r0 = AreEqual;
                    if (iArr == null) {
                        r0 = AreEqual == 0 ? 1 : 0;
                    }
                    if (r0 != 0) {
                        arrayList.add(obj);
                        if (iArr != null) {
                            break;
                        }
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(numberFormatException, 9140204446496299309L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                numberFormatException = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 9140204446496299309L, j2) /* invoke-custom */;
                throw numberFormatException;
            }
        }
        arrayListL = arrayList;
        AreEqual = 0;
        for (_g _gVar2 : arrayListL) {
            int[] iArr2 = null;
            try {
                _gVar2.N(new lj(0, false, j4, false, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17930, 6556967243019192319L ^ j2) /* invoke-custom */, null), j3);
                iArr2 = iArr;
                if (iArr2 == null && iArr == null) {
                }
                return 1;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr2, 9140204446496299309L, j2) /* invoke-custom */;
            }
        }
        return 1;
    }

    private static final int p(CommandContext commandContext) {
        long j2 = b ^ 53682088081107L;
        x.a(class_124.field_1061 + (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29336, 3757635158713208400L ^ j2) /* invoke-custom */, j2 ^ 56314140892821L);
        return 1;
    }

    static {
        int i2;
        long j2 = b ^ 117398014637924L;
        long j3 = j2 ^ 124384456503279L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j3 << 16) >>> 32);
        int i5 = (int) ((j3 << 48) >>> 48);
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[26];
        int i7 = 0;
        String str = "ûÈ¤Ö\b\u009f÷ÓÐ\u0091\u0005\u001c\u009cR½û(æ\u009b\u0019iìp\n\u008d9ÃE³zAÛÔzé¡Ë¦¡\u0016A¶êx\u0016\u0011®ÂJLÁêe÷\u0094\u0080\u0004\u0010ÑéÊ\u0089j=Iù¢FG{\u001fm\f½(2FsnvùÍåWz?ý\u0084©\u000fÂà\u008f\u008e\u0001L×\u008c\u00176Î\u0003ÕÉ\"KT}Ø\u001cv?\u008fé\u0003 8ÛÂ\u0087\u000f\u001eØ\u008bt\u0018÷³k2\u009dâ&\r¼\u009cªû\"-¸NÙ.äà\u00049\u0010ð\u0003Á29\u00adï\u0094ã\u008dã\u0093s,\u0081\u00928\u009fë\u001fúYÄ2eîSÇJÿm°\u0096)\u0098Í`V\u0096InieÄý\u0095uA\u0016F\u0012ñ>ÄS-\u0005½\u007f\u009bKh\u009dD\u009aë\u0011ÅÜbì\u0006;\u00108;ºa¸¤Ì\u009e%tFú\u009f\u0094e\u0080\u0010ªÐsõ~O!\nÝ£ÊR\u009dúÈ@\u0010\u009fÄ>,£ XËxq\u0015+r®]D\u0010£Í\u001cùÜD¨e=\u0087Ë\u0089\u0091e\u0081\u00068\u00132ìÓ\bÜr\tv\u001b\u0082oëVçpÂÌ\u0086R¸M£JÒÛJ\u0099\u0099\u0099[Ë,¼¹ë×Â\u0013û\u0004Õ\u0017\u001b\u0014\u0015Q=z\u0000\n|\u0011TÎªHó\u009bÄËÜþZãó(\u00060å×Ûu[,\u0089x Ãtä\u0013\u008a\u008eVÝ\u009fM^±üÚ÷\u0010\u009a\u0094\u0001hùN\u0016«ªÍ2Ô,´n ø'\nïÉà\u000fÎg%\u0015Ê\u0090Í'ñ\u00934\u0003\u0010\u009c\fa´4Þ®Ø'.Ù\u009b\u0003ó¿Z\u0010ËVo±ôeÍdJñ\u0086|dk¦)\u0010¹i\u0082uÝ\fí\u008diéd\u0014ä\t _ ª\u0010\u0018ª\u0087o\t\u0099E Ö3å\u00adz¡Àu\u008e6E\"dë\r±£º¥x\u0004Ê A\u000b@Y \u008eIòèJë\\ \"Ëò¹Î\u009f³FG\u0017\u001cøFà\u0006Y®°~\u0010d\u0098µ³w©_)C'wò¶è§\u0015(\u008dÒ\u0013ù^Âzi¶T¬_n\u000eê }pü<p·\u000fo¿=»\u009d5àòe« \u0013ã\u0007FãÙ >~d-A\u0094iöÄ\u001dúÐm÷Õü´~¥\u0098x1½z\u0019\u009f\u0018\u00ad\u0017\u00998ù\u0010\u0091\u001ewã\u0003t\u0080Ú9ëp\u0000Ã\u009d0U(%\u0016ºÒ=ôr\u000eÍ\u0000\u0013\u0010ßÄð ã\u0003<ÈG\u008bÐÃN\u009a\u008bý|K³bþ¡\u0012\u008dõ\u0010ò\u0084\u0010\u0094\u0007\u000b.kíÕ\tð;Á©Ç¦t\u0092";
        int length = "ûÈ¤Ö\b\u009f÷ÓÐ\u0091\u0005\u001c\u009cR½û(æ\u009b\u0019iìp\n\u008d9ÃE³zAÛÔzé¡Ë¦¡\u0016A¶êx\u0016\u0011®ÂJLÁêe÷\u0094\u0080\u0004\u0010ÑéÊ\u0089j=Iù¢FG{\u001fm\f½(2FsnvùÍåWz?ý\u0084©\u000fÂà\u008f\u008e\u0001L×\u008c\u00176Î\u0003ÕÉ\"KT}Ø\u001cv?\u008fé\u0003 8ÛÂ\u0087\u000f\u001eØ\u008bt\u0018÷³k2\u009dâ&\r¼\u009cªû\"-¸NÙ.äà\u00049\u0010ð\u0003Á29\u00adï\u0094ã\u008dã\u0093s,\u0081\u00928\u009fë\u001fúYÄ2eîSÇJÿm°\u0096)\u0098Í`V\u0096InieÄý\u0095uA\u0016F\u0012ñ>ÄS-\u0005½\u007f\u009bKh\u009dD\u009aë\u0011ÅÜbì\u0006;\u00108;ºa¸¤Ì\u009e%tFú\u009f\u0094e\u0080\u0010ªÐsõ~O!\nÝ£ÊR\u009dúÈ@\u0010\u009fÄ>,£ XËxq\u0015+r®]D\u0010£Í\u001cùÜD¨e=\u0087Ë\u0089\u0091e\u0081\u00068\u00132ìÓ\bÜr\tv\u001b\u0082oëVçpÂÌ\u0086R¸M£JÒÛJ\u0099\u0099\u0099[Ë,¼¹ë×Â\u0013û\u0004Õ\u0017\u001b\u0014\u0015Q=z\u0000\n|\u0011TÎªHó\u009bÄËÜþZãó(\u00060å×Ûu[,\u0089x Ãtä\u0013\u008a\u008eVÝ\u009fM^±üÚ÷\u0010\u009a\u0094\u0001hùN\u0016«ªÍ2Ô,´n ø'\nïÉà\u000fÎg%\u0015Ê\u0090Í'ñ\u00934\u0003\u0010\u009c\fa´4Þ®Ø'.Ù\u009b\u0003ó¿Z\u0010ËVo±ôeÍdJñ\u0086|dk¦)\u0010¹i\u0082uÝ\fí\u008diéd\u0014ä\t _ ª\u0010\u0018ª\u0087o\t\u0099E Ö3å\u00adz¡Àu\u008e6E\"dë\r±£º¥x\u0004Ê A\u000b@Y \u008eIòèJë\\ \"Ëò¹Î\u009f³FG\u0017\u001cøFà\u0006Y®°~\u0010d\u0098µ³w©_)C'wò¶è§\u0015(\u008dÒ\u0013ù^Âzi¶T¬_n\u000eê }pü<p·\u000fo¿=»\u009d5àòe« \u0013ã\u0007FãÙ >~d-A\u0094iöÄ\u001dúÐm÷Õü´~¥\u0098x1½z\u0019\u009f\u0018\u00ad\u0017\u00998ù\u0010\u0091\u001ewã\u0003t\u0080Ú9ëp\u0000Ã\u009d0U(%\u0016ºÒ=ôr\u000eÍ\u0000\u0013\u0010ßÄð ã\u0003<ÈG\u008bÐÃN\u009a\u008bý|K³bþ¡\u0012\u008dõ\u0010ò\u0084\u0010\u0094\u0007\u000b.kíÕ\tð;Á©Ç¦t\u0092".length();
        char cCharAt = 16;
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
                        if (i11 >= length) {
                            g = strArr;
                            h = new String[26];
                            l = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i13 = 0;
                            int length2 = "e\u001c;!¤\u0000Ûë\\8A\u0090\u000fVI¿".length();
                            int i14 = 0;
                            do {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = "e\u001c;!¤\u0000Ûë\\8A\u0090\u000fVI¿".substring(i15, i14).getBytes("ISO-8859-1");
                                i13++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i14 < length2);
                            j = jArr;
                            k = new Integer[2];
                            x = new ad((short) i3, i4, (short) i5);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i16 = i7;
                        i7++;
                        strArr[i16] = strIntern;
                        int i17 = i9 + cCharAt;
                        i8 = i17;
                        if (i17 < length) {
                        }
                        str = "Í\u0097\u0092\u008c;±ý\u008aÎ\u0014\u0004Ü\u0002Ý]Ï ºFF\"Ìt¡\u0010ñ\r\tmÔÀÊ_\u001dÜN\u0090zÞÀî`U\u000e'!ÒÐ8";
                        length = "Í\u0097\u0092\u008c;±ý\u008aÎ\u0014\u0004Ü\u0002Ý]Ï ºFF\"Ìt¡\u0010ñ\r\tmÔÀÊ_\u001dÜN\u0090zÞÀî`U\u000e'!ÒÐ8".length();
                        cCharAt = 16;
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
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 9658;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(g[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ad", e);
            }
        }
        return h[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/ad"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ad.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 16031;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) j[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/ad", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i3].intValue();
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/ad"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ad.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
