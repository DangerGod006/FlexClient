package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ef.class */
public final class ef extends _g {

    @NotNull
    public static final ef V;
    static final /* synthetic */ KProperty[] E;

    @NotNull
    private static final cl g;

    @NotNull
    private static final cl e;

    @NotNull
    private static final cl x;

    @NotNull
    private static final cl T;

    @NotNull
    private static final cl b;

    @NotNull
    private static final cq a;
    private static final long c = yz.a(6421587437488320030L, -3118933473525214565L, MethodHandles.lookup().lookupClass()).a(67492385117281L);
    private static final String[] d;
    private static final String[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private ef(long j) {
        long j2 = c ^ j;
        super((String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6818, 7021643909277202847L ^ j2) /* invoke-custom */, jt.y(), null, 4, null, j2 ^ 25442226523241L);
    }

    private final String G(int i, int i2, char c2) {
        return (String) g.E(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ c) ^ 110888955979299L, E[0]);
    }

    private final String s(int i, int i2, short s) {
        return (String) e.E(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ c) ^ 104424633454007L, E[1]);
    }

    private final String v(long j, byte b2) {
        return (String) x.E(this, (((j << 8) | ((((long) b2) << 56) >>> 56)) ^ c) ^ 6687165358718L, E[2]);
    }

    private final String K(long j) {
        return (String) T.E(this, (c ^ j) ^ 18950611330908L, E[3]);
    }

    private final String w(long j) {
        return (String) b.E(this, (c ^ j) ^ 1223997141928L, E[4]);
    }

    private final boolean W(long j) {
        return ((Boolean) a.E(this, (c ^ j) ^ 61431838043714L, E[5])).booleanValue();
    }

    /*  JADX ERROR: Failed to decode insn: 0x0370: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[13]
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
    @su.catlean.gofra.Flow
    public final void V(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.client.ScreenEvent r14) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ef.V(su.catlean.api.event.events.client.ScreenEvent):void");
    }

    private final String l(int i, String str, int i2, short s) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ c;
        long j2 = j ^ 106591291595048L;
        long j3 = j ^ 20980240414006L;
        long j4 = j ^ 23459857270399L;
        String strR = (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16667, 5483672212690786046L ^ j) /* invoke-custom */;
        try {
            String str2 = new SimpleDateFormat(w(j2)).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str2, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2254, 5276290891380432680L ^ j) /* invoke-custom */);
            strR = str2;
        } catch (Exception e2) {
            o2.S(this, class_124.field_1061 + (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8733, 6596448401227691502L ^ j) /* invoke-custom */, false, 2, null, j4);
        }
        String strR2 = (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25938, 4157856695058002617L ^ j) /* invoke-custom */;
        String strMethod_1676 = zf.F(j3).method_1548().method_1676();
        Intrinsics.checkNotNullExpressionValue(strMethod_1676, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3407, 5419879613654571700L ^ j) /* invoke-custom */);
        return StringsKt.replace$default(StringsKt.replace$default(str, strR2, strMethod_1676, false, 4, (Object) null), (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25173, 3617027582386795967L ^ j) /* invoke-custom */, strR, false, 4, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    private final boolean I(long j) {
        long j2 = c ^ j;
        long j3 = j2 >>> 8;
        int i = (int) (((j2 ^ 73183631377362L) << 56) >>> 56);
        long j4 = j2 ^ 35466876487567L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 29011957345307L;
        int i5 = (int) (j2 >>> 32);
        int i6 = (int) ((j5 << 32) >>> 48);
        int i7 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 94179341584112L;
        Object objContains$default = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2146838991344797692L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    try {
                        objContains$default = StringsKt.contains$default((CharSequence) G(i2, i3, (char) i4), (CharSequence) (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7597, 3410922029064634728L ^ j2) /* invoke-custom */, false, 2, (Object) null);
                        if (objContains$default != 0) {
                            return objContains$default;
                        }
                        if (objContains$default == 0) {
                            try {
                                try {
                                    objContains$default = StringsKt.contains$default((CharSequence) s(i5, i6, (short) i7), (CharSequence) (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25173, 3617065715863633555L ^ j2) /* invoke-custom */, false, 2, (Object) null);
                                    if (objContains$default != 0) {
                                        return objContains$default;
                                    }
                                    if (objContains$default == 0) {
                                        try {
                                            boolean zContains$default = StringsKt.contains$default((CharSequence) v(j3, (byte) i), (CharSequence) (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25173, 3617065715863633555L ^ j2) /* invoke-custom */, false, 2, (Object) null);
                                            if (objContains$default != 0) {
                                                return zContains$default;
                                            }
                                            if (!zContains$default) {
                                                boolean zContains$default2 = StringsKt.contains$default((CharSequence) K(j6), (CharSequence) (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25173, 3617065715863633555L ^ j2) /* invoke-custom */, false, 2, (Object) null);
                                                if (objContains$default != 0) {
                                                    return zContains$default2;
                                                }
                                                if (!zContains$default2) {
                                                    return false;
                                                }
                                            }
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
                            }
                        }
                        return true;
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, -2149187481347189833L, j2) /* invoke-custom */;
        }
    }

    private static final boolean A() {
        return V.I((c ^ 52016354038128L) ^ 5482544624163L);
    }

    static {
        int i;
        long j = c ^ 78263619134787L;
        long j2 = j ^ 124489171483123L;
        long j3 = j ^ 90301518277994L;
        long j4 = j ^ 83463275993775L;
        h = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[32];
        int i3 = 0;
        String str = "Ýn3\u001b\u0007\u0004\u0088|Ã\u00914L«LM`ãË\u0001\"\u0080õÑ<W\u009d\t6\u0012\u000e&\u0090\u0016}\u0098\fe¬üHUúKÇhmÑë\u001dKU¦,\r-å\u0010g±ï©ó\u001ehj×69\u008f<\u0015ÑÄ\u0018B\u008c` ø\f¡Zê\u008aó1'\u0015×rÞÊa}\u008f.HÈ8]\u009b{br\u0095[\u0098¢\u0098W#(\u001aTãä\u008eÐfq\u0084ï-0Z\u0096Í\u0011\u0086(\u0007\u0005H2\u0089g\t';\u000e|^\u0084\u008d\u0099\u0084\u00ad1kû¼¬¯Cñ \u0010\u0095C&\nîÎünÞ\u008fn³\u0097\nÝ\u0096ßd\u0004\u001c\u0013\u0006\u0091\u0095êÓ\u0010Jß\r\u0083 \u0006¹\u0083\u0013O3xe\u0081ºù\u0016Á\u008bÕ\u0096`4\u0086ª¾\u008e=Ñ\u0089§Ø\u0091L\u0093\u0005¥\u00185øy1v÷3à7{\u0017\u0099ÂF£©@ã<w;â¼s0½Æ²ú»\u0088IäÞü\u0080\u0083\u009c\u0096ú£\u001eMé\u0005\u00147P\u0099\u008aL\u001e\u009d-\u0089<>y«O_`Äk)÷\u0092Ígqdú\u0000 }\u008dU¸\u0004M»(×*pH\\v\u007f%ÿµK\u009f\u0096t\fD±ð\r!`ä&\u0081\u0010'³P\u0010|&ý\u008faÆ¤\u0090t\u0091z\u009d\u00106\u0016Ñ\u0019p\"\u008fmárTaÛ\u008bÈú Dn\u008fC£\u0098uKU{òE]\u009b\u009av+Z[áÔq\u0015Z\u009d¯\u0090\u0011E~ï\u001b %zÞH9\u0087«ùPqØüý'p±ðn\u009e\u0011\u000e©\u009b\u009bTU\u000ec`¿H\b\u0010Çþü/Ð\u009a\u000fÞÖp\u0081\u008eº\u009f/\u00ad\u0010Ì(¾Æ\u0082\u000bGB\u009dMSá¦`õN8k¬\u0089\u0099£Ôm\"j\u009bXM»×A¹aúá¯Àb[øã8ü\u0005\u000e\t\u008e\u008e¬ÊNÞ¿õ7no\u001c2ËWoÁuX\u008ew\n\u0086w\u0095x8Ç\u001e\u0090Ûé¬_\u0096ÎIU\u0081É¥¶sD´s\u0016\u009ejûä>M¬cÈ´.lyù:m\f\u0099õà\u00ad\u0015\u0098ÉNÔ?ÚÅ£{Ø\u001f\u0083´\u0002\u0018\u0018wß ®\u000e¯\u0098ø\u0017\u009b²ãÁ\u008au¨¤y\u009aÓeab\u0010RËì\u000e\u0090\u0001sÓ\u0000rÄ\u0080ä³\u0090\u0080 \u000f\u0097\fö\n§E[\u001aèþm1ÕGÈ´°\u000eÖÙ¨êÍ_÷lüÑ\u009f\u0095Ü\u0010ËÁ _+^\u0089]'\u001e\n\u008a\u0017}å²\u0010RÉöûþ\u0006X\u000b\u008fZØ»\u008ee$\u0007 \r¿JOýi\u0005\u0002\fa¨¾§\u0090^ÑíUÐ ,²ÙK£f9[ûkbD\u0010\u008fÝ\u0089Ó:hF\\Ôh\u0092AWÄôK \u0098ºs\u00adÏþÿ¶;Ï7ß$\u009eàà\u008aáá\u001cK~\u0099s\u0086ôÐf[v¦P\u0010£ZªgÊ\u001c.¡C©\u0006\b\u0088\u001a>æ@¤8\u0011$G´\ræM\u000f\"$3\u008býáà>ìÂ\u001aýD[¸}#z Ú\u0002Toõ\u0084\u0082l\u0013Á\u009f\\ÑC(óÐ\u0019d¯sPÁ¥\u0080<uã\fWN<ûè\u0086\u0010\u009dn\u0019DcyþÊ`\u0080µ\u001bæ\u0087ÈO þ\u0094É\u0090Þ\u0017ÉhëA°\u0083©6¬Ï¬ÛÐÉöWaÑ<Æês\u0015kË¯\u0010\u0088\u0080\u009dé\b\u0083\\Û\u0094°]ßvi\u0011\u00ad";
        int length = "Ýn3\u001b\u0007\u0004\u0088|Ã\u00914L«LM`ãË\u0001\"\u0080õÑ<W\u009d\t6\u0012\u000e&\u0090\u0016}\u0098\fe¬üHUúKÇhmÑë\u001dKU¦,\r-å\u0010g±ï©ó\u001ehj×69\u008f<\u0015ÑÄ\u0018B\u008c` ø\f¡Zê\u008aó1'\u0015×rÞÊa}\u008f.HÈ8]\u009b{br\u0095[\u0098¢\u0098W#(\u001aTãä\u008eÐfq\u0084ï-0Z\u0096Í\u0011\u0086(\u0007\u0005H2\u0089g\t';\u000e|^\u0084\u008d\u0099\u0084\u00ad1kû¼¬¯Cñ \u0010\u0095C&\nîÎünÞ\u008fn³\u0097\nÝ\u0096ßd\u0004\u001c\u0013\u0006\u0091\u0095êÓ\u0010Jß\r\u0083 \u0006¹\u0083\u0013O3xe\u0081ºù\u0016Á\u008bÕ\u0096`4\u0086ª¾\u008e=Ñ\u0089§Ø\u0091L\u0093\u0005¥\u00185øy1v÷3à7{\u0017\u0099ÂF£©@ã<w;â¼s0½Æ²ú»\u0088IäÞü\u0080\u0083\u009c\u0096ú£\u001eMé\u0005\u00147P\u0099\u008aL\u001e\u009d-\u0089<>y«O_`Äk)÷\u0092Ígqdú\u0000 }\u008dU¸\u0004M»(×*pH\\v\u007f%ÿµK\u009f\u0096t\fD±ð\r!`ä&\u0081\u0010'³P\u0010|&ý\u008faÆ¤\u0090t\u0091z\u009d\u00106\u0016Ñ\u0019p\"\u008fmárTaÛ\u008bÈú Dn\u008fC£\u0098uKU{òE]\u009b\u009av+Z[áÔq\u0015Z\u009d¯\u0090\u0011E~ï\u001b %zÞH9\u0087«ùPqØüý'p±ðn\u009e\u0011\u000e©\u009b\u009bTU\u000ec`¿H\b\u0010Çþü/Ð\u009a\u000fÞÖp\u0081\u008eº\u009f/\u00ad\u0010Ì(¾Æ\u0082\u000bGB\u009dMSá¦`õN8k¬\u0089\u0099£Ôm\"j\u009bXM»×A¹aúá¯Àb[øã8ü\u0005\u000e\t\u008e\u008e¬ÊNÞ¿õ7no\u001c2ËWoÁuX\u008ew\n\u0086w\u0095x8Ç\u001e\u0090Ûé¬_\u0096ÎIU\u0081É¥¶sD´s\u0016\u009ejûä>M¬cÈ´.lyù:m\f\u0099õà\u00ad\u0015\u0098ÉNÔ?ÚÅ£{Ø\u001f\u0083´\u0002\u0018\u0018wß ®\u000e¯\u0098ø\u0017\u009b²ãÁ\u008au¨¤y\u009aÓeab\u0010RËì\u000e\u0090\u0001sÓ\u0000rÄ\u0080ä³\u0090\u0080 \u000f\u0097\fö\n§E[\u001aèþm1ÕGÈ´°\u000eÖÙ¨êÍ_÷lüÑ\u009f\u0095Ü\u0010ËÁ _+^\u0089]'\u001e\n\u008a\u0017}å²\u0010RÉöûþ\u0006X\u000b\u008fZØ»\u008ee$\u0007 \r¿JOýi\u0005\u0002\fa¨¾§\u0090^ÑíUÐ ,²ÙK£f9[ûkbD\u0010\u008fÝ\u0089Ó:hF\\Ôh\u0092AWÄôK \u0098ºs\u00adÏþÿ¶;Ï7ß$\u009eàà\u008aáá\u001cK~\u0099s\u0086ôÐf[v¦P\u0010£ZªgÊ\u001c.¡C©\u0006\b\u0088\u001a>æ@¤8\u0011$G´\ræM\u000f\"$3\u008býáà>ìÂ\u001aýD[¸}#z Ú\u0002Toõ\u0084\u0082l\u0013Á\u009f\\ÑC(óÐ\u0019d¯sPÁ¥\u0080<uã\fWN<ûè\u0086\u0010\u009dn\u0019DcyþÊ`\u0080µ\u001bæ\u0087ÈO þ\u0094É\u0090Þ\u0017ÉhëA°\u0083©6¬Ï¬ÛÐÉöWaÑ<Æês\u0015kË¯\u0010\u0088\u0080\u009dé\b\u0083\\Û\u0094°]ßvi\u0011\u00ad".length();
        char cCharAt = '8';
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
                        if (i7 >= length) {
                            d = strArr;
                            f = new String[32];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i9 = 0;
                            int length2 = "\\«;{±Øô7\u0017\u0016\u0084e3Ê2\u0012$\u0088Ê®M\u0097\nô".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "\\«;{±Øô7\u0017\u0016\u0084e3Ê2\u0012$\u0088Ê®M\u0097\nô".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            KProperty[] kPropertyArr = new KProperty[(int) jArr[0]];
                            kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28907, 994474853289583828L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31518, 3718689092785762101L ^ j) /* invoke-custom */, 0));
                            kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24181, 1983183080546290252L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6220, 5832502913483705448L ^ j) /* invoke-custom */, 0));
                            kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23229, 1501459303904431744L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10644, 3656503951633071539L ^ j) /* invoke-custom */, 0));
                            kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31627, 7084019212843872184L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8831, 1375631587665360476L ^ j) /* invoke-custom */, 0));
                            kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1875, 6967607851604120444L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31524, 6172319407038951194L ^ j) /* invoke-custom */, 0));
                            kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(ef.class, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13072, 8767279911148693306L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(706, 3897094153926088418L ^ j) /* invoke-custom */, 0));
                            E = kPropertyArr;
                            V = new ef(j2);
                            g = yp.x(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7543, 8898815429475895634L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8259, 42833890935911537L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) jArr[1], j4, (Object) null);
                            e = yp.x(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22382, 7600654787663315800L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6931, 3944145639602884388L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) jArr[2], j4, (Object) null);
                            x = yp.x(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22648, 5903339102448766033L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22142, 6949758768827908696L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) jArr[2], j4, (Object) null);
                            T = yp.x(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1856, 2409292710538875761L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25173, 3616994612773549688L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) jArr[2], j4, (Object) null);
                            b = yp.x(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22313, 5017828611767943937L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7770, 1175237006074317410L ^ j) /* invoke-custom */, (h) null, ef::A, 4, j4, (Object) null);
                            a = yp.t(V, (String) b(MethodHandles.lookup(), "r", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19828, 847166882909411652L ^ j) /* invoke-custom */, false, j3, null, null, (int) jArr[2], null);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "U(îç\u0004)U\u0007\u0087wp:Ä\u0081\u000fÓ}æ£\u001dö@j:ëé\u0094u³g\u007f\u0084-hÇ×²RùÜÝ~X\u00adNP7&Ñòw\u0083\u0012\u0093\u008aÊ\u0012\u0016¡«Ø\u0016yCßÆnkHNrÇ=\n³ 4x\u007fËmB_\u008f\u0085Ý\u0002¡Òs5yé Í×Q\u0085ºÿæ¥5Æ\u009càW\u001a\u009dJ\u001d¼§¨dÇ\u0003\u0099)\u008bWdÿÖ\u009a´\u001aÐ/ÄÉá<BÛc\u0018\u00032PdQÚ\u0019ÄuØ¬]\u008fEð]\r\u0099\u0081í\u0084\u008e\u0087å";
                        length = "U(îç\u0004)U\u0007\u0087wp:Ä\u0081\u000fÓ}æ£\u001dö@j:ëé\u0094u³g\u007f\u0084-hÇ×²RùÜÝ~X\u00adNP7&Ñòw\u0083\u0012\u0093\u008aÊ\u0012\u0016¡«Ø\u0016yCßÆnkHNrÇ=\n³ 4x\u007fËmB_\u008f\u0085Ý\u0002¡Òs5yé Í×Q\u0085ºÿæ¥5Æ\u009càW\u001a\u009dJ\u001d¼§¨dÇ\u0003\u0099)\u008bWdÿÖ\u009a´\u001aÐ/ÄÉá<BÛc\u0018\u00032PdQÚ\u0019ÄuØ¬]\u008fEð]\r\u0099\u0081í\u0084\u008e\u0087å".length();
                        cCharAt = 136;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 16284;
        if (f[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i2] = b(((Cipher) objArr[0]).doFinal(d[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ef", e2);
            }
        }
        return f[i2];
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
            java.lang.String r1 = "su/catlean/ef"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ef.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
