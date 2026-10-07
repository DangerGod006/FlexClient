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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gi.class */
public final class gi {
    private final float C;
    private final float B;
    private final float w;
    private final float U;
    public static final gi SMOKE;
    public static final gi CIRCLE;
    public static final gi CRACK;
    public static final gi CLOUD;
    public static final gi DOLLAR;
    public static final gi DROP;
    public static final gi FIREFLY;
    public static final gi FIREFLY_ALT;
    public static final gi HEART;
    public static final gi SNOWFLAKE;
    public static final gi STAR;
    public static final gi TRIANGLE1;
    public static final gi TRIANGLE2;
    public static final gi TRIANGLE3;
    public static final gi TRIANGLE4;
    public static final gi HALO;
    public static final gi TRIANGLE5;
    private static final /* synthetic */ gi[] q;
    private static final /* synthetic */ EnumEntries i;
    private static int[] r;
    private static final long a = yz.a(-3732756354189874883L, -8004455321125896098L, MethodHandles.lookup().lookupClass()).a(30233294075805L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    private gi(String str, int i2, float f, float f2, float f3, float f4) {
        this.C = f;
        this.B = f2;
        this.w = f3;
        this.U = f4;
    }

    public final float o() {
        return this.C;
    }

    public final float v() {
        return this.B;
    }

    public final float L() {
        return this.w;
    }

    public final float w() {
        return this.U;
    }

    public static gi[] values() {
        return (gi[]) q.clone();
    }

    public static gi valueOf(String value) {
        return (gi) Enum.valueOf(gi.class, value);
    }

    @NotNull
    public static EnumEntries G() {
        return i;
    }

    private static final /* synthetic */ gi[] P(char c2, short s, int i2) {
        long j = (((((long) c2) << 48) | ((((long) s) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        gi[] giVarArr = new gi[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22677, 7959549750298615544L ^ j) /* invoke-custom */];
        giVarArr[0] = SMOKE;
        giVarArr[1] = CIRCLE;
        giVarArr[2] = CRACK;
        giVarArr[3] = CLOUD;
        giVarArr[4] = DOLLAR;
        giVarArr[5] = DROP;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7499, 4676933608592923426L ^ j) /* invoke-custom */] = FIREFLY;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16975, 6018689681168761891L ^ j) /* invoke-custom */] = FIREFLY_ALT;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9687, 4458782892632302517L ^ j) /* invoke-custom */] = HEART;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10819, 8442887649577069607L ^ j) /* invoke-custom */] = SNOWFLAKE;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16310, 8142479863788763584L ^ j) /* invoke-custom */] = STAR;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20672, 7447651699794843297L ^ j) /* invoke-custom */] = TRIANGLE1;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25375, 7661858277281277300L ^ j) /* invoke-custom */] = TRIANGLE2;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29556, 576522594947511578L ^ j) /* invoke-custom */] = TRIANGLE3;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28795, 8740829977214006796L ^ j) /* invoke-custom */] = TRIANGLE4;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7190, 3065794231475559033L ^ j) /* invoke-custom */] = HALO;
        giVarArr[(int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9490, 7758243387765908346L ^ j) /* invoke-custom */] = TRIANGLE5;
        return giVarArr;
    }

    static {
        int i2;
        long j = a ^ 112704465528274L;
        long j2 = j ^ 51706774436743L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j2 << 16) >>> 48);
        int i5 = (int) ((j2 << 32) >>> 32);
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8650270298860573595L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], 8646954499518587504L, j) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[17];
        int i7 = 0;
        String str = "ðð\rè\u0012u\u009fü\u0010\u0099\t¢YÈé¨×\u001a1$\u0002\u00808qf\bÛS+\u008fÐ|k\u0005\bøü2\u0084¬ö\u000e(\bkìÉ¸çÊõT\b\u0089{wDwîºÑ\u0010\u0099\t¢YÈé¨×Îg\u0083¥ÇU±u\bv\u00853@\u0003\u008aÄW\b.\u0089\f-x\u00983\u0004\b\u0091\u001d\u009aGsï\u008f|\u0010\u0099\t¢YÈé¨×ùaÌV(\u0011Ôa\bÍ¯¹®µ\u008fª¦\b$\u0097\u0093\u0089\u0082OI4\u0010T&Z\u00914Cz\u009a\u0093ôG\u001fg5V¹\u0010\u0099\t¢YÈé¨×\u0013\u001aö¼\u0089ª÷e";
        int length = "ðð\rè\u0012u\u009fü\u0010\u0099\t¢YÈé¨×\u001a1$\u0002\u00808qf\bÛS+\u008fÐ|k\u0005\bøü2\u0084¬ö\u000e(\bkìÉ¸çÊõT\b\u0089{wDwîºÑ\u0010\u0099\t¢YÈé¨×Îg\u0083¥ÇU±u\bv\u00853@\u0003\u008aÄW\b.\u0089\f-x\u00983\u0004\b\u0091\u001d\u009aGsï\u008f|\u0010\u0099\t¢YÈé¨×ùaÌV(\u0011Ôa\bÍ¯¹®µ\u008fª¦\b$\u0097\u0093\u0089\u0082OI4\u0010T&Z\u00914Cz\u009a\u0093ôG\u001fg5V¹\u0010\u0099\t¢YÈé¨×\u0013\u001aö¼\u0089ª÷e".length();
        char cCharAt = '\b';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            d = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[23];
                            int i13 = 0;
                            String str3 = "sÙ\t\u001c°\u00059Å@²Ñ\u001epì*\u0086}.ªZWÔtÀìì\u001eÇaÏN¬ëÐÝ¸Çîç4ØËä\u0080W\f\u0016\u00adcTÙÄ+ÿ¯Ì\u009bøRÿ\u0093AJÒúÅ\u0089\u000b\u000b |§xèHVçÅ\u007fñm;\u0011Z>uý\u0082ö#\u000eùíÏÀ=&W®Ù\u0089bÝIô\u0000pvH\u0018Wáa\u0098Ø2d½|M\b\u0010ø\u001c¾VDVTAG¶\u0098\u0006\u001bÐ'\u0088¢=\bN¾Õ\b\u009c×\u0091!o²n·\u009fQë\f\u0001!à\u0082ôY\u0007§&\u0091è";
                            int length2 = "sÙ\t\u001c°\u00059Å@²Ñ\u001epì*\u0086}.ªZWÔtÀìì\u001eÇaÏN¬ëÐÝ¸Çîç4ØËä\u0080W\f\u0016\u00adcTÙÄ+ÿ¯Ì\u009bøRÿ\u0093AJÒúÅ\u0089\u000b\u000b |§xèHVçÅ\u007fñm;\u0011Z>uý\u0082ö#\u000eùíÏÀ=&W®Ù\u0089bÝIô\u0000pvH\u0018Wáa\u0098Ø2d½|M\b\u0010ø\u001c¾VDVTAG¶\u0098\u0006\u001bÐ'\u0088¢=\bN¾Õ\b\u009c×\u0091!o²n·\u009fQë\f\u0001!à\u0082ôY\u0007§&\u0091è".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i14 >= length2) {
                                                b = jArr;
                                                c = new Integer[23];
                                                SMOKE = new gi(strArr[9], 0, 0.0f, 0.0f, 0.3906f, 0.3906f);
                                                CIRCLE = new gi(strArr[5], 1, 0.3906f, 0.0f, 0.6406f, 0.25f);
                                                CRACK = new gi(strArr[2], 2, 0.6406f, 0.0f, 0.8906f, 0.25f);
                                                CLOUD = new gi(strArr[0], 3, 0.8906f, 0.0f, 0.9531f, 0.0625f);
                                                DOLLAR = new gi(strArr[7], 4, 0.8906f, 0.0625f, 0.9531f, 0.125f);
                                                DROP = new gi(strArr[3], 5, 0.8906f, 0.125f, 0.9531f, 0.1875f);
                                                FIREFLY = new gi(strArr[4], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18202, 7733790118132065830L ^ j) /* invoke-custom */, 0.8906f, 0.1875f, 0.9531f, 0.25f);
                                                FIREFLY_ALT = new gi(strArr[13], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30496, 8471437531602261526L ^ j) /* invoke-custom */, 0.3906f, 0.25f, 0.4531f, 0.3125f);
                                                HEART = new gi(strArr[11], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8644, 6589038006904897768L ^ j) /* invoke-custom */, 0.4531f, 0.25f, 0.5156f, 0.3125f);
                                                SNOWFLAKE = new gi(strArr[15], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29727, 583608065814992164L ^ j) /* invoke-custom */, 0.5156f, 0.25f, 0.5781f, 0.3125f);
                                                STAR = new gi(strArr[12], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32671, 8539386467118227122L ^ j) /* invoke-custom */, 0.5781f, 0.25f, 0.6406f, 0.3125f);
                                                TRIANGLE1 = new gi(strArr[14], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6946, 2155355980178684443L ^ j) /* invoke-custom */, 0.6406f, 0.25f, 0.7031f, 0.3125f);
                                                TRIANGLE2 = new gi(strArr[16], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7805, 4453861788571598658L ^ j) /* invoke-custom */, 0.7031f, 0.25f, 0.7656f, 0.3125f);
                                                TRIANGLE3 = new gi(strArr[6], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7608, 8451539356053404802L ^ j) /* invoke-custom */, 0.7656f, 0.25f, 0.8281f, 0.3125f);
                                                TRIANGLE4 = new gi(strArr[1], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27089, 9216091608343152895L ^ j) /* invoke-custom */, 0.8281f, 0.25f, 0.8906f, 0.3125f);
                                                HALO = new gi(strArr[8], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30832, 792068631014742361L ^ j) /* invoke-custom */, 0.8906f, 0.25f, 0.9531f, 0.3096f);
                                                TRIANGLE5 = new gi(strArr[10], (int) a(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9973, 5242439570090837981L ^ j) /* invoke-custom */, 0.3906f, 0.3125f, 0.4531f, 0.3701f);
                                                q = P((char) i3, (short) i4, i5);
                                                i = EnumEntriesKt.enumEntries(q);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i14 >= length2) {
                                                str3 = "& \u0086`£\u008f\u0000\u0018Çc½!Ñ\u0007ñ!";
                                                length2 = "& \u0086`£\u008f\u0000\u0018Çc½!Ñ\u0007ñ!".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "\u0011\b#»\u008b(\u0089\u0081ê\u009d\u0004úáÇ\u0010<\u0010\u0099\t¢YÈé¨×]ï\u009f[÷>\nG";
                        length = "\u0011\b#»\u008b(\u0089\u0081ê\u009d\u0004úáÇ\u0010<\u0010\u0099\t¢YÈé¨×]ï\u009f[÷>\nG".length();
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

    public static void S(int[] iArr) {
        r = iArr;
    }

    public static int[] I() {
        return r;
    }

    private static String a(byte[] bArr) {
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

    private static int a(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 6193;
        if (c[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) b[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) d.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/gi", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            c[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return c[i3].intValue();
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
            java.lang.String r0 = "su/catlean/gi"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.gi.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
