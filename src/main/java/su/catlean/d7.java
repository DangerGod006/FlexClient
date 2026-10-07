package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import net.minecraft.class_11909;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d7.class */
public final class d7 extends class_437 {

    @NotNull
    private final bj Y;

    @NotNull
    private final n7 q;

    @NotNull
    private final n7 e;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final long a = yz.a(3256825738675468887L, -3497458798806108626L, MethodHandles.lookup().lookupClass()).a(255241071892958L);
    private static final Map d = new HashMap(13);

    /* JADX WARN: Illegal instructions before constructor call */
    public d7(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 48574764299947L;
        int i = (int) (j2 >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 17938430133175L;
        super(class_2561.method_30163((String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17922, 1954989496001627718L ^ j2) /* invoke-custom */));
        this.Y = new bj((String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2690, 4706517248622381761L ^ j2) /* invoke-custom */, (int) b(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11885, 1567199079207354426L ^ j2) /* invoke-custom */, (int) b(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15241, 3562357085917369810L ^ j2) /* invoke-custom */, j2 ^ 25737399224030L);
        this.q = new n7(0.0f, 0.0f, 100.0f, 25.0f, i4.h.E(i, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(Typography.lowDoubleQuote, 5985555179602436180L ^ j2) /* invoke-custom */, i2, new Object[0], i3), d7::e, 0, j4, null, null, 0.0f, 0.0f, (int) b(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19575, 3419479846473015855L ^ j2) /* invoke-custom */, null);
        this.e = new n7(0.0f, 0.0f, 100.0f, 25.0f, i4.h.E(i, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30625, 3977616597909780451L ^ j2) /* invoke-custom */, i2, new Object[0], i3), d7::C, 0, j4, null, null, 0.0f, 0.0f, (int) b(MethodHandles.lookup(), "z", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23146, 8805891643699541040L ^ j2) /* invoke-custom */, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02ae: INVOKE 
          (r-1 I:su.catlean.n7)
          (r0 I:float)
          (r1 I:float)
          (r2 I:float)
          (r3 I:long)
          (r4 I:float)
          (r5 I:net.minecraft.class_332)
         VIRTUAL call: su.catlean.n7.k(float, float, float, long, float, net.minecraft.class_332):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_25394(@org.jetbrains.annotations.NotNull net.minecraft.class_332 r18, int r19, int r20, float r21) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d7.method_25394(net.minecraft.class_332, int, int, float):void");
    }

    public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
        long j = a ^ 8753031455867L;
        long j2 = j ^ 17646716526476L;
        Intrinsics.checkNotNullParameter(click, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16313, 4817419113726942448L ^ j) /* invoke-custom */);
        double dComp_4798 = click.comp_4798();
        double dComp_4799 = click.comp_4799();
        this.q.P((float) dComp_4798, (float) dComp_4799, j2);
        this.e.P((float) dComp_4798, (float) dComp_4799, j2);
        return super.method_25402(click, doubled);
    }

    public void method_25419() {
    }

    private static final Unit e() {
        class_156.method_668().method_673(URI.create((String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22636, 437985818706348440L ^ (a ^ 8822183909057L)) /* invoke-custom */));
        return Unit.INSTANCE;
    }

    private static final Unit C() {
        zf.F((a ^ 107833916092623L) ^ 123993558823657L).close();
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 76377555746698L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i3 = 0;
        String str = "\b¬\u0090Þ×p\u0016^u=\u0000é_¢\nå\u000fm#Æh/=é\u0010ö¿ðV÷àKº\u0092\u000f\u0014Í:\u0015N\u009c\u0010!m|\u0015'\u007fbÊ\u0017\u0004\u00993\u0088è`\u008a\u0018 K\u007f\u000fq{É\u000fö*Ðµ\u0013ÂÆÃ\u0002Z|\u0001y)'\u0089(P&:ïÝ2ÕOe\u0089¸\u0014!ô¾6\u0095C¿\\e\b\u0018\u0097ÓØðvämdóë\u0002kü\u0096+V²(múÅ\u0016zX\u0013#Bfé\u0096\u009d\u0007\bÂ\u009c\u0001\u0006\u0099F,\u009d§\u0013Q\u008179Ý\u0000\u008a¶\u0013À»\u0010jÃQ0\u008co+3ß\u0090&\u000eêÇô¡j\u0018\"\u0082évl±²Fben\u0095,Pþç\u0080\u0001ÉJ\u00adC\u0017f°oà\u0088\u0098õ?)\u0096\u001a\u0010\u0018;Aî(>0\u008d\u009c\u000bzsB\u0002g/\u0018a\t\u00186Ý%R4¸ü|îfLÔÎP\u0089¦¯1ád²\u0010!\u00900\u0002ïuú\u008f3fmêà}gû\u0010 8\u0094q³ÄÎA\u0015\rÑS%Y»E\u0010\u009eÌàU×ð<)¦\u0081\u0080HñT\u0098ß";
        int length = "\b¬\u0090Þ×p\u0016^u=\u0000é_¢\nå\u000fm#Æh/=é\u0010ö¿ðV÷àKº\u0092\u000f\u0014Í:\u0015N\u009c\u0010!m|\u0015'\u007fbÊ\u0017\u0004\u00993\u0088è`\u008a\u0018 K\u007f\u000fq{É\u000fö*Ðµ\u0013ÂÆÃ\u0002Z|\u0001y)'\u0089(P&:ïÝ2ÕOe\u0089¸\u0014!ô¾6\u0095C¿\\e\b\u0018\u0097ÓØðvämdóë\u0002kü\u0096+V²(múÅ\u0016zX\u0013#Bfé\u0096\u009d\u0007\bÂ\u009c\u0001\u0006\u0099F,\u009d§\u0013Q\u008179Ý\u0000\u008a¶\u0013À»\u0010jÃQ0\u008co+3ß\u0090&\u000eêÇô¡j\u0018\"\u0082évl±²Fben\u0095,Pþç\u0080\u0001ÉJ\u00adC\u0017f°oà\u0088\u0098õ?)\u0096\u001a\u0010\u0018;Aî(>0\u008d\u009c\u000bzsB\u0002g/\u0018a\t\u00186Ý%R4¸ü|îfLÔÎP\u0089¦¯1ád²\u0010!\u00900\u0002ïuú\u008f3fmêà}gû\u0010 8\u0094q³ÄÎA\u0015\rÑS%Y»E\u0010\u009eÌàU×ð<)¦\u0081\u0080HñT\u0098ß".length();
        char cCharAt = 24;
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
                            b = strArr;
                            c = new String[14];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i9 = 0;
                            String str3 = "Jß\u0003!-¡Ù\u001bÊ\u0013\u0095\u009e\u0085'\u0011\u001f âkè\u0007©ô\u0088·öâ)\u0003\u00adQ½K \u0089Ñ'}\u0007¤}\u0084p\u0091\u009a3*Pé\u009ah\u0016WÄ\u0019OmHg}\r·Á\u0011";
                            int length2 = "Jß\u0003!-¡Ù\u001bÊ\u0013\u0095\u009e\u0085'\u0011\u001f âkè\u0007©ô\u0088·öâ)\u0003\u00adQ½K \u0089Ñ'}\u0007¤}\u0084p\u0091\u009a3*Pé\u009ah\u0016WÄ\u0019OmHg}\r·Á\u0011".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                f = jArr;
                                                g = new Integer[10];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "óho3»]¡°\u0096âw7{ôÿ\u0096";
                                                length2 = "óho3»]¡°\u0096âw7{ôÿ\u0096".length();
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
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
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
                        str = "\rÿ\u0003Ð+\u0083Ñ^é\u009dù\u001d\u0099\u009fàe\u0018vÇG½÷ÁK\u008fêä.\u0019?B\u0097¬\u0088üî\u0087W\u0014\u0089\u009f";
                        length = "\rÿ\u0003Ð+\u0083Ñ^é\u009dù\u001d\u0099\u009fàe\u0018vÇG½÷ÁK\u008fêä.\u0019?B\u0097¬\u0088üî\u0087W\u0014\u0089\u009f".length();
                        cCharAt = 16;
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 6239;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/d7", e);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.d7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d7.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.d7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d7.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d7.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 13891;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/d7", e);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.d7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d7.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.d7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d7.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.d7.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
