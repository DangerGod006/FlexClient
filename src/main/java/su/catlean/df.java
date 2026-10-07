package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/df.class */
final class df {
    public static final df Default;
    public static final df Bonk;
    public static final df Rubber;
    public static final df Akrien;
    public static final df Flip;
    public static final df Snap;
    public static final df Hook;
    public static final df Swipe;
    public static final df Tap;
    public static final df Inject;
    public static final df Slap;
    private static final df[] o;
    private static final EnumEntries N;
    private static final long a = yz.a(4373514013005079342L, -3002697738789848869L, MethodHandles.lookup().lookupClass()).a(128408058988668L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    private df(String str, int i) {
    }

    public static df[] values() {
        return (df[]) o.clone();
    }

    public static df valueOf(String value) {
        return (df) Enum.valueOf(df.class, value);
    }

    @NotNull
    public static EnumEntries S() {
        return N;
    }

    private static final df[] U(long j) {
        long j2 = a ^ j;
        df[] dfVarArr = new df[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23647, 76171680790873185L ^ j2) /* invoke-custom */];
        dfVarArr[0] = Default;
        dfVarArr[1] = Bonk;
        dfVarArr[2] = Rubber;
        dfVarArr[3] = Akrien;
        dfVarArr[4] = Flip;
        dfVarArr[5] = Snap;
        dfVarArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8796, 6482128928589773409L ^ j2) /* invoke-custom */] = Hook;
        dfVarArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32000, 4256156799528707382L ^ j2) /* invoke-custom */] = Swipe;
        dfVarArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26781, 8744158665978065063L ^ j2) /* invoke-custom */] = Tap;
        dfVarArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5557, 5797765332589464972L ^ j2) /* invoke-custom */] = Inject;
        dfVarArr[(int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32110, 1225398741551424853L ^ j2) /* invoke-custom */] = Slap;
        return dfVarArr;
    }

    static {
        int i;
        long j = a ^ 137957882997376L;
        long j2 = j ^ 32596857650501L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i3 = 0;
        String str = "¯Ùî½\u000b¿\u001d%\b*U¨on&\u008d\u0001\bQ¡\u0007£Æè1\u0001\bÀÙKq»\u0098\u000fC\bs¦Ã~U\b)-\b?\te\u0099_\\¾\u0007\bÒØ\u0097d<s\u0089\u009f\b\u0013káþS\u0092\u0015G\b\u0013N\u007fÙ\u0094àå¼";
        int length = "¯Ùî½\u000b¿\u001d%\b*U¨on&\u008d\u0001\bQ¡\u0007£Æè1\u0001\bÀÙKq»\u0098\u000fC\bs¦Ã~U\b)-\b?\te\u0099_\\¾\u0007\bÒØ\u0097d<s\u0089\u009f\b\u0013káþS\u0092\u0015G\b\u0013N\u007fÙ\u0094àå¼".length();
        char cCharAt = '\b';
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
                            d = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i9 = 0;
                            String str3 = "F\u009aW\u009c8¥\u001bÏ@ö©ßORh3-ú\f cö\u001eN´w¶Îu\u0004ý\u008dü´\u0015h±wÂ; 5Á\u001cè\u009b\u000eË;ïO¾\u009b=(w\u0087Ð\u001eyBÃÈ½.0\u000bè\u008cGÚô";
                            int length2 = "F\u009aW\u009c8¥\u001bÏ@ö©ßORh3-ú\f cö\u001eN´w¶Îu\u0004ý\u008dü´\u0015h±wÂ; 5Á\u001cè\u009b\u000eË;ïO¾\u009b=(w\u0087Ð\u001eyBÃÈ½.0\u000bè\u008cGÚô".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                b = jArr;
                                                c = new Integer[11];
                                                Default = new df(strArr[8], 0);
                                                Bonk = new df(strArr[1], 1);
                                                Rubber = new df(strArr[7], 2);
                                                Akrien = new df(strArr[2], 3);
                                                Flip = new df(strArr[4], 4);
                                                Snap = new df(strArr[9], 5);
                                                Hook = new df(strArr[3], (int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8922, 5781650983913027882L ^ j) /* invoke-custom */);
                                                Swipe = new df(strArr[10], (int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18257, 229605847436500140L ^ j) /* invoke-custom */);
                                                Tap = new df(strArr[0], (int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9567, 4494937190528188069L ^ j) /* invoke-custom */);
                                                Inject = new df(strArr[6], (int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10862, 1623209985401418140L ^ j) /* invoke-custom */);
                                                Slap = new df(strArr[5], (int) a(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25883, 2095327104620576482L ^ j) /* invoke-custom */);
                                                o = U(j2);
                                                N = EnumEntriesKt.enumEntries(o);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                str3 = "¤\u0094@§ê\u001fn¬]ò\u00adíHZª¸";
                                                length2 = "¤\u0094@§ê\u001fn¬]ò\u00adíHZª¸".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "Ë\u0095$T=\b\r\u007f\bÊüa\u009bÕ/\u0094\u0019";
                        length = "Ë\u0095$T=\b\r\u007f\bÊüa\u009bÕ/\u0094\u0019".length();
                        cCharAt = '\b';
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

    private static int a(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 4090;
        if (c[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) b[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) d.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/df", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            c[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return c[i2].intValue();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iA)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iA;
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
            java.lang.String r1 = "su/catlean/df"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.df.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
