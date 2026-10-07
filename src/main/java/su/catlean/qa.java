package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.StringDecomposerEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qa.class */
public final class qa extends _g {

    @NotNull
    public static final qa d;
    static final KProperty[] P;

    @NotNull
    private static final cl j;

    @NotNull
    private static final cw C;
    private static final long a = yz.a(2878155593475320591L, -336301487634253425L, MethodHandles.lookup().lookupClass()).a(82147503996816L);
    private static final String[] b;
    private static final String[] c;
    private static final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    private qa(int i, byte b2, int i2) {
        long j2 = (((((long) i) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i2) << 40) >>> 40)) ^ a;
        super((String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27945, 2141124084379579986L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 72662292435668L);
    }

    @NotNull
    public final String r(short s, char c2, int i) {
        return (String) j.E(this, ((((((long) s) << 48) | ((((long) c2) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a) ^ 117353789119071L, P[0]);
    }

    @NotNull
    public final b9 h(int i, long j2) {
        return (b9) C.E(this, (((((long) i) << 32) | ((j2 << 32) >>> 32)) ^ a) ^ 102399300628256L, P[1]);
    }

    @Flow
    private final void G(StringDecomposerEvent stringDecomposerEvent) {
        char c2 = (char) (r0 >>> 48);
        stringDecomposerEvent.setString(M(c2, (int) ((((a ^ 102134121407627L) ^ 129491939148333L) << 16) >>> 32), (short) ((r1 << 48) >>> 48), stringDecomposerEvent.getString()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x017c: INVOKE (r-1 I:su.catlean.c7), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.c7.Y(long, java.lang.String):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String M(char r10, int r11, short r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qa.M(char, int, short, java.lang.String):java.lang.String");
    }

    static {
        int i;
        long j2 = a ^ 125678748250339L;
        long j3 = j2 ^ 19166999638766L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 56);
        int i4 = (int) ((j3 << 40) >>> 40);
        long j4 = j2 ^ 89567463672031L;
        long j5 = j2 ^ 10735428535726L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j2 << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[12];
        int i6 = 0;
        String str = "¡\u0000{.ìÂ+W\u0018\\Î\u0084Ñ\u0089e\u001a\u0018ÿ±Ý\u0011>(\u0094\u008b0º\u0082T\u001a\u0007è1í\u0090(^W9µ1\u0018\u0010\tç`|à\u009a\u0013\u0091>Û1!\u0092\u0082ñ\u000bª\u0096¬l\u0096f\u009e\u0010Eí\u008bÊ#U.\u0013]Üª¡ÐGÕæ\u0010Ã\u00014\u009aUûà\u0007MIl6Ó#µ÷(4\u0099\u0092\u0015Oo\u0092¿k)\u001cl\u0007sJ&Ýï\u000bVECê{|~Îcc\u009b²×¯\u008e\u0092èv`sæ &?^\u0091é HÌW3½ÿÊÔUa\u0095G)OêÌ£^;ê\u0091÷¨\u0083\u0081\u00980¯\u0094.;\u0098É\u0010?\u0017ÑËÉupí$îÅÄ6òk=Æ\u0085\u009c£mÍåy²a6×\u001cb\u0017tËí°\u008aÆ\u0099\u0089Y\u00840d×\u0084Mý¥øþÜ\u00ad\u009dWG\u0087\u0011ï\u001c<ÿmÓÕ|¬qé\u0017\u00921þ±þá4Jú½\u0006Ì}¯è0CþíÿM\u0010R\u009dJòòñS\u0089\u0098?¹AaA\u0002&";
        int length = "¡\u0000{.ìÂ+W\u0018\\Î\u0084Ñ\u0089e\u001a\u0018ÿ±Ý\u0011>(\u0094\u008b0º\u0082T\u001a\u0007è1í\u0090(^W9µ1\u0018\u0010\tç`|à\u009a\u0013\u0091>Û1!\u0092\u0082ñ\u000bª\u0096¬l\u0096f\u009e\u0010Eí\u008bÊ#U.\u0013]Üª¡ÐGÕæ\u0010Ã\u00014\u009aUûà\u0007MIl6Ó#µ÷(4\u0099\u0092\u0015Oo\u0092¿k)\u001cl\u0007sJ&Ýï\u000bVECê{|~Îcc\u009b²×¯\u008e\u0092èv`sæ &?^\u0091é HÌW3½ÿÊÔUa\u0095G)OêÌ£^;ê\u0091÷¨\u0083\u0081\u00980¯\u0094.;\u0098É\u0010?\u0017ÑËÉupí$îÅÄ6òk=Æ\u0085\u009c£mÍåy²a6×\u001cb\u0017tËí°\u008aÆ\u0099\u0089Y\u00840d×\u0084Mý¥øþÜ\u00ad\u009dWG\u0087\u0011ï\u001c<ÿmÓÕ|¬qé\u0017\u00921þ±þá4Jú½\u0006Ì}¯è0CþíÿM\u0010R\u009dJòòñS\u0089\u0098?¹AaA\u0002&".length();
        char cCharAt = 16;
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
                        i = i10;
                        if (i10 >= length) {
                            b = strArr;
                            c = new String[12];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j2 << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i12 = 0;
                            int length2 = ",\u0082\u0000\u0083\u00862\u0015°´V&\u0087\u008c\u0012±Ú".length();
                            int i13 = 0;
                            do {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = ",\u0082\u0000\u0083\u00862\u0015°´V&\u0087\u008c\u0012±Ú".substring(i14, i13).getBytes("ISO-8859-1");
                                i12++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i13 < length2);
                            P = new KProperty[]{Reflection.property1(new PropertyReference1Impl(qa.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5828, 7435107025347262068L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9036, 876771218501108735L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(qa.class, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20642, 8461468456897441823L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23109, 4813965052739844857L ^ j2) /* invoke-custom */, 0))};
                            d = new qa(i2, (byte) i3, i4);
                            j = yp.x(d, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25088, 1267666089292612287L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31209, 5068276673388796251L ^ j2) /* invoke-custom */, (h) null, (Function0) null, (int) jArr[1], j4, (Object) null);
                            C = yp.L(d, (String) b(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15141, 8589488042117798801L ^ j2) /* invoke-custom */, b9.FRIENDS, null, null, (int) jArr[0], null, j5);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i15 = i6;
                        i6++;
                        strArr[i15] = strIntern;
                        int i16 = i8 + cCharAt;
                        i7 = i16;
                        if (i16 < length) {
                        }
                        str = "Ä.\u008d«Ç\u009b[£Ácc»ù.\"õtµës\u0002ê\u001e±>AÆ©\u0083Ø\u008dÄ\u0010\r\u00162\u0017lGöm\u009fË·Û\u0016@ÈP";
                        length = "Ä.\u008d«Ç\u009b[£Ácc»ù.\"õtµës\u0002ê\u001e±>AÆ©\u0083Ø\u008dÄ\u0010\r\u00162\u0017lGöm\u009fË·Û\u0016@ÈP".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i8 = i + 1;
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 22908;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/qa", e2);
            }
        }
        return c[i2];
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/qa"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qa.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
