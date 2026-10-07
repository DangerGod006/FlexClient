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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/og.class */
public final class og {
    public static final og Fade;
    public static final og Hover;
    public static final og Decrease;
    public static final og Static;
    public static final og Flash;
    public static final og Grow;
    public static final og FILL;
    public static final og TNT;
    public static final og Pull;
    private static final /* synthetic */ og[] H;
    private static final /* synthetic */ EnumEntries V;
    private static final long a = yz.a(1227855188693642107L, 3946986171911208265L, MethodHandles.lookup().lookupClass()).a(230187653829232L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    private og(String str, int i) {
    }

    public static og[] values() {
        return (og[]) H.clone();
    }

    public static og valueOf(String value) {
        return (og) Enum.valueOf(og.class, value);
    }

    @NotNull
    public static EnumEntries f() {
        return V;
    }

    private static final /* synthetic */ og[] q(int i, int i2, short s) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        og[] ogVarArr = new og[(int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26415, 3394833872534084754L ^ j) /* invoke-custom */];
        ogVarArr[0] = Fade;
        ogVarArr[1] = Hover;
        ogVarArr[2] = Decrease;
        ogVarArr[3] = Static;
        ogVarArr[4] = Flash;
        ogVarArr[5] = Grow;
        ogVarArr[(int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4605, 5461539793270893123L ^ j) /* invoke-custom */] = FILL;
        ogVarArr[(int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(943, 4296300353350957077L ^ j) /* invoke-custom */] = TNT;
        ogVarArr[(int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6651, 7718716365513712199L ^ j) /* invoke-custom */] = Pull;
        return ogVarArr;
    }

    static {
        int i;
        long j = a ^ 33395059979564L;
        long j2 = j ^ 26567221285378L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i6 = 0;
        String str = "]\u0080Í\u00070A>ü\bÒS\u000f\u00ad6O\u009d\u008c\b»ýÿñÄ\u00047¸\bbb4[Ù\u0001 Ù\b\u0010f6Èrþôü\bdDÀ±a\u0092\u009fk\u0010\u009aÂ\u008f÷\u0006û\u0006¡\u001f\u008a\u0014â\u007f\u0086Ô-";
        int length = "]\u0080Í\u00070A>ü\bÒS\u000f\u00ad6O\u009d\u008c\b»ýÿñÄ\u00047¸\bbb4[Ù\u0001 Ù\b\u0010f6Èrþôü\bdDÀ±a\u0092\u009fk\u0010\u009aÂ\u008f÷\u0006û\u0006¡\u001f\u008a\u0014â\u007f\u0086Ô-".length();
        char cCharAt = '\b';
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            d = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i12 = 0;
                            String str3 = "&²´\u0015·ëõ\u0096>i\u009c\u0016à\u0091\u009dÒßÐ0\u0095z;4Þx\u001c¢\u001cºd\u007fqH\u0004å©òö\u009bæ";
                            int length2 = "&²´\u0015·ëõ\u0096>i\u009c\u0016à\u0091\u009dÒßÐ0\u0095z;4Þx\u001c¢\u001cºd\u007fqH\u0004å©òö\u009bæ".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i13 >= length2) {
                                                b = jArr;
                                                c = new Integer[7];
                                                Fade = new og(strArr[5], 0);
                                                Hover = new og(strArr[7], 1);
                                                Decrease = new og(strArr[6], 2);
                                                Static = new og(strArr[1], 3);
                                                Flash = new og(strArr[8], 4);
                                                Grow = new og(strArr[2], 5);
                                                FILL = new og(strArr[0], (int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25875, 7740227726314431071L ^ j) /* invoke-custom */);
                                                TNT = new og(strArr[4], (int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3520, 7680867348599343752L ^ j) /* invoke-custom */);
                                                Pull = new og(strArr[3], (int) a(MethodHandles.lookup(), "a", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7868, 134110559937993207L ^ j) /* invoke-custom */);
                                                H = q(i2, i3, (short) i4);
                                                V = EnumEntriesKt.enumEntries(H);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i13 >= length2) {
                                                str3 = "+2õr\u0097À.¡\u0007÷\u0090\u001f×z\u008dË";
                                                length2 = "+2õr\u0097À.¡\u0007÷\u0090\u001f×z\u008dË".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "¬\u0007Õ\u0010Ï\u00925\u008c\b´ÖU\u0018#\u000e O";
                        length = "¬\u0007Õ\u0010Ï\u00925\u008c\b´ÖU\u0018#\u000e O".length();
                        cCharAt = '\b';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 7312;
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
                    throw new RuntimeException("su/catlean/og", e);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/og"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.og.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
