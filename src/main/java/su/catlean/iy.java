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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/iy.class */
public final class iy {
    public static final iy AM;
    public static final iy AR;
    public static final iy EU;
    public static final iy BN;
    public static final iy BG;
    public static final iy CA;
    public static final iy CHR;
    public static final iy HR;
    public static final iy CS;
    public static final iy DA;
    public static final iy NL;
    public static final iy EN;
    public static final iy ET;
    public static final iy FIL;
    public static final iy FI;
    public static final iy FR;
    public static final iy DE;
    public static final iy EL;
    public static final iy GU;
    public static final iy IW;
    public static final iy HI;
    public static final iy HU;
    public static final iy IS;
    public static final iy ID;
    public static final iy IT;
    public static final iy JA;
    public static final iy KN;
    public static final iy KO;
    public static final iy LV;
    public static final iy LT;
    public static final iy MS;
    public static final iy ML;
    public static final iy MR;
    public static final iy NO;
    public static final iy PL;
    public static final iy RO;
    public static final iy RU;
    public static final iy SR;
    public static final iy SK;
    public static final iy SL;
    public static final iy ES;
    public static final iy SW;
    public static final iy SV;
    public static final iy TA;
    public static final iy TE;
    public static final iy TH;
    public static final iy TR;
    public static final iy UR;
    public static final iy UK;
    public static final iy VI;
    public static final iy CY;
    public static final iy CN;
    private static final iy[] E;
    private static final EnumEntries p;
    private static String[] B;
    private static final long a = yz.a(-5835851797119798213L, -7030252788014220648L, MethodHandles.lookup().lookupClass()).a(7043315162525L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    private iy(String str, int i) {
    }

    public static iy[] values() {
        return (iy[]) E.clone();
    }

    public static iy valueOf(String value) {
        return (iy) Enum.valueOf(iy.class, value);
    }

    @NotNull
    public static EnumEntries W() {
        return p;
    }

    private static final iy[] E(long j) {
        long j2 = a ^ j;
        iy[] iyVarArr = new iy[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30770, 4089337064024471709L ^ j2) /* invoke-custom */];
        iyVarArr[0] = AM;
        iyVarArr[1] = AR;
        iyVarArr[2] = EU;
        iyVarArr[3] = BN;
        iyVarArr[4] = BG;
        iyVarArr[5] = CA;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30182, 7823692354079978855L ^ j2) /* invoke-custom */] = CHR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22427, 401503058931963747L ^ j2) /* invoke-custom */] = HR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3917, 2324285927111331818L ^ j2) /* invoke-custom */] = CS;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13079, 7894428884190114812L ^ j2) /* invoke-custom */] = DA;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20038, 4752727714280001268L ^ j2) /* invoke-custom */] = NL;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29488, 6974978978504111012L ^ j2) /* invoke-custom */] = EN;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9223, 5473938221483271406L ^ j2) /* invoke-custom */] = ET;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(850, 2471543861882258410L ^ j2) /* invoke-custom */] = FIL;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9496, 6504720440549320117L ^ j2) /* invoke-custom */] = FI;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17802, 7494284405358314876L ^ j2) /* invoke-custom */] = FR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27532, 4604455876593478517L ^ j2) /* invoke-custom */] = DE;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22184, 3460261784676914747L ^ j2) /* invoke-custom */] = EL;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9771, 4641159925984339679L ^ j2) /* invoke-custom */] = GU;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21713, 6685399025528460367L ^ j2) /* invoke-custom */] = IW;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19387, 363252607357569887L ^ j2) /* invoke-custom */] = HI;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24410, 4182329117415301062L ^ j2) /* invoke-custom */] = HU;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25886, 576512241804961169L ^ j2) /* invoke-custom */] = IS;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18859, 8199485042665900306L ^ j2) /* invoke-custom */] = ID;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25623, 3285404310891357424L ^ j2) /* invoke-custom */] = IT;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5019, 8404580063726736164L ^ j2) /* invoke-custom */] = JA;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2499, 8766047009949583690L ^ j2) /* invoke-custom */] = KN;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15811, 6468409083770027315L ^ j2) /* invoke-custom */] = KO;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13926, 7631458086431667916L ^ j2) /* invoke-custom */] = LV;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2286, 5533623678085662739L ^ j2) /* invoke-custom */] = LT;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16293, 3625543647501958959L ^ j2) /* invoke-custom */] = MS;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1123, 1115657979364967555L ^ j2) /* invoke-custom */] = ML;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2105, 3090297236201375904L ^ j2) /* invoke-custom */] = MR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26130, 1748641696367142633L ^ j2) /* invoke-custom */] = NO;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1422, 2977846663083066656L ^ j2) /* invoke-custom */] = PL;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26775, 5850917432397621366L ^ j2) /* invoke-custom */] = RO;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17398, 6021167970572354416L ^ j2) /* invoke-custom */] = RU;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26817, 6593857197477455949L ^ j2) /* invoke-custom */] = SR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10208, 4277803032555857771L ^ j2) /* invoke-custom */] = SK;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27059, 5055688201068898622L ^ j2) /* invoke-custom */] = SL;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4454, 5081330896492958162L ^ j2) /* invoke-custom */] = ES;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29783, 8535890076900947169L ^ j2) /* invoke-custom */] = SW;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11849, 8467957574073102078L ^ j2) /* invoke-custom */] = SV;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16235, 1704760909208600462L ^ j2) /* invoke-custom */] = TA;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7105, 8284325142095600509L ^ j2) /* invoke-custom */] = TE;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25473, 1305802471152444177L ^ j2) /* invoke-custom */] = TH;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26160, 3558071678015596227L ^ j2) /* invoke-custom */] = TR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32083, 196649714213879225L ^ j2) /* invoke-custom */] = UR;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23613, 326463116728655034L ^ j2) /* invoke-custom */] = UK;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31116, 4129545604240406898L ^ j2) /* invoke-custom */] = VI;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22941, 2558819376391936296L ^ j2) /* invoke-custom */] = CY;
        iyVarArr[(int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2626, 1510486053294279357L ^ j2) /* invoke-custom */] = CN;
        return iyVarArr;
    }

    static {
        int i;
        long j = a ^ 47501660206718L;
        long j2 = j ^ 46861313223991L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-147445303080228985L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], -188302821515899873L, j) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[52];
        int i3 = 0;
        String str = "³§ð\u0095sk],\b)ÇÞÖb?ën\b\u0099NqÍ\u0004¡*È\bt\u008dÑ\u0088\u000fÝèÅ\b\u009bá;¥\u008dÑÞ$\b£\u0092ZÄQ\u008aER\b@ñ´âtÇ,D\b*²àÊ\u008ffúî\b]SÞ\u0089ÖóÄÁ\b\u0005Àò\u0091úÊ»B\b\tç\u001bJ:ò´\u0010\bõVNÉ¹Åßö\b±Ë\u001eR\u00804ET\b\u0095ßSZ]¢¼R\b\u00824è\u0007¿)·g\bz\u0095\u0007³ +Ö¶\b\u0083£\u0080,Ãñ\u008d²\b\r\u0090.ö\u000e\u0018\u000eá\bÀÐ\u0015\u0096á~;®\b\u00876z¤ÍÄ´\u0015\b\"\u001e\u00adé\u009c\fb\u009c\bY»BI\u0095$è1\bV\u00051FíUb\u0094\b¨ìÆÛz)\t«\bØ\u0005,A]_üÁ\b\u0081Å\bJF/ÓÈ\bj\r\u000eÖ\u0005\n\u009e÷\bR§®Î\u0002IÕs\bõ=\u001eà>õZÆ\b\u0082\u001arqð\u008f0f\b\u0085\u0096Y±\u0006@f#\bi \u0097w\" \u0007\u009a\bXÜ·\u0000a\u009519\bÁãÑûa\u0019ê\"\b\u0007JD|P0\u0000û\b\u0000!ø\u0019#Æä3\bkèÏ\u0004NªÆ\u0007\b\u009c\u001aª²#£Ò/\b~ÍÔc¸aqê\b\u0098\u000e!èU;¢3\bO\u0003\u0012UDLùa\b\u009etÆÚRöµ\u0011\b\u008bÓp5,f\u0004\u0000\b£-£\u0089þ¤»Z\bA¨\u0016Áè¯/à\b=CÄë¾Qi%\b+$P;³OÝÄ\bBM\f\u0015°%é\u0004\bU\u001fÓ¤¯óNK\bdÃY½\u009e\u009bC\u008c";
        int length = "³§ð\u0095sk],\b)ÇÞÖb?ën\b\u0099NqÍ\u0004¡*È\bt\u008dÑ\u0088\u000fÝèÅ\b\u009bá;¥\u008dÑÞ$\b£\u0092ZÄQ\u008aER\b@ñ´âtÇ,D\b*²àÊ\u008ffúî\b]SÞ\u0089ÖóÄÁ\b\u0005Àò\u0091úÊ»B\b\tç\u001bJ:ò´\u0010\bõVNÉ¹Åßö\b±Ë\u001eR\u00804ET\b\u0095ßSZ]¢¼R\b\u00824è\u0007¿)·g\bz\u0095\u0007³ +Ö¶\b\u0083£\u0080,Ãñ\u008d²\b\r\u0090.ö\u000e\u0018\u000eá\bÀÐ\u0015\u0096á~;®\b\u00876z¤ÍÄ´\u0015\b\"\u001e\u00adé\u009c\fb\u009c\bY»BI\u0095$è1\bV\u00051FíUb\u0094\b¨ìÆÛz)\t«\bØ\u0005,A]_üÁ\b\u0081Å\bJF/ÓÈ\bj\r\u000eÖ\u0005\n\u009e÷\bR§®Î\u0002IÕs\bõ=\u001eà>õZÆ\b\u0082\u001arqð\u008f0f\b\u0085\u0096Y±\u0006@f#\bi \u0097w\" \u0007\u009a\bXÜ·\u0000a\u009519\bÁãÑûa\u0019ê\"\b\u0007JD|P0\u0000û\b\u0000!ø\u0019#Æä3\bkèÏ\u0004NªÆ\u0007\b\u009c\u001aª²#£Ò/\b~ÍÔc¸aqê\b\u0098\u000e!èU;¢3\bO\u0003\u0012UDLùa\b\u009etÆÚRöµ\u0011\b\u008bÓp5,f\u0004\u0000\b£-£\u0089þ¤»Z\bA¨\u0016Áè¯/à\b=CÄë¾Qi%\b+$P;³OÝÄ\bBM\f\u0015°%é\u0004\bU\u001fÓ¤¯óNK\bdÃY½\u009e\u009bC\u008c".length();
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
                            long[] jArr = new long[93];
                            int i9 = 0;
                            String str3 = "zÊ\u0090Å÷\u0002Æ\u001a·'Yªá\u000f×\u001elÛ´Ñ~%(\u0088 \u0012ò°5Þ\u0094\u0000ý\u0018\u0017:\u0096\u0003\u001f\u001d¡Å\u008ew\u009f\u0017\u007f6v\u0096!\u0082\r5\u008bÓ>\t»Î\u0006çUÚRy\u008f%J|á¬¸º\u0000\u0010\u009cÝ\u007fÇ\u0014^\t\u0084\u008bä!\f\u0080.¬o\u0094>5\u008e\u009d·\u0003Ztôï¡¨G>~e\u0093\u0093Ï¤\u008bAÍ\u0084\u0005Ñ\t\u009avpt\"ïN\u0011%\u009cT\u008aüE\u008a¤\u0012^ï¯Ù<Z@^dß\u0095Ð,-\u001bàÐ\u0012Ùá:ÌVô4lÜ\u001b\u001a\u0083@\u007f\u0011opè*\u00979G%ÿ\u0094ÚïÇ\u0095óm¹?:ëÎ!@×¸v<µgÂï¬\u000f\u0098'\u001bým\u008b\u0010æ\u008d\u0095\u0005.[\u0085Ü\u008c¢ôB¤øÊ\u0086ý¡´d\u0017D==ã¾n]µ]Í\u0000®\u0014\u0091 ¨ãî8àY»k\u00987ß7óªÞ¿\u0097hGÔÖ\"I:Æ\u0014r¹#\u009fi\u001aD\u001b±Inç©-ÔõFIo¸\u000bO·º\u0003Ä\u00ad§ÊÌ\u0087°ü2Ñ%º\u0089X\u009f\u0003;pºëb;Ðõ\u0017Í<¶c\u0083\u0099\u0010`\"8Eä·î¤\u0095t\u000f\u0092 >;.0?q\u001a\u000fØ^7\u0082\u0018»XàAM^;Ì¼xÀðæ\u008fú\u008caj\u0019£ª¨<¢!\u008f<\u008fetê´ô\u008d\u000eÃW1æ\t\u001beã\u0005vÀ)±\"[$\u0014\u0083\u008f8Ý\"è,\u0015Iy\u0018çs÷\u0081~\u0018È;z§Ø\u008cø¬4×í÷g 6Û*Òc¼p\u000f\u0087Þ\u0099¼ûJ\u0096NÇ)1Ùñ²g+ËÀA\u001aÉ\u000bùa«W\u007f\u0096Á\u0018\u009e\u001d\u00078I/w{Æª3ã2Ó¼í\u0007k];R\u0081àÛi\u009d¹`\n±KÄy«NÇ\u008ceä8(¡]X\u0016\u009fiEã`qÈ~Æ²´¯ë\u0005¸\u0007¤\u008aÇ/ä3\u0085£\u0095qï\u008bÆ\u0084¬«ÿ¹;\u008eJ\u009cì¦æÀ|\u0016lYÕ}\u0000·lr\u008dÔK{C\u0017Ûhün5¬2øÆN\u0085`)z¶\u0083³PqQé\t\u0005CÑ=Á?d;½jÏ\u0084¥àó{»3\\X×íOz»`\u009b\u0016 }þÁ\u0098\u009eeX\u0013\u0000\u007fß»V|\fQ\u0003\u0003Q\u001bYµD;¶Þ0#No'WAVÁr2/¾oN\u0016\u0019\u009c\u0014v,l\u000fúÕÕº\u001bZ\u0015ãÒû5ÙÆf\b°K 9wè{ß\u0095Ä\u0001Ûÿ`(ò>Þl\u0097\u009bA\u009dþ\u0013Ù\\G·â\u009c\u0092¨\u008f";
                            int length2 = "zÊ\u0090Å÷\u0002Æ\u001a·'Yªá\u000f×\u001elÛ´Ñ~%(\u0088 \u0012ò°5Þ\u0094\u0000ý\u0018\u0017:\u0096\u0003\u001f\u001d¡Å\u008ew\u009f\u0017\u007f6v\u0096!\u0082\r5\u008bÓ>\t»Î\u0006çUÚRy\u008f%J|á¬¸º\u0000\u0010\u009cÝ\u007fÇ\u0014^\t\u0084\u008bä!\f\u0080.¬o\u0094>5\u008e\u009d·\u0003Ztôï¡¨G>~e\u0093\u0093Ï¤\u008bAÍ\u0084\u0005Ñ\t\u009avpt\"ïN\u0011%\u009cT\u008aüE\u008a¤\u0012^ï¯Ù<Z@^dß\u0095Ð,-\u001bàÐ\u0012Ùá:ÌVô4lÜ\u001b\u001a\u0083@\u007f\u0011opè*\u00979G%ÿ\u0094ÚïÇ\u0095óm¹?:ëÎ!@×¸v<µgÂï¬\u000f\u0098'\u001bým\u008b\u0010æ\u008d\u0095\u0005.[\u0085Ü\u008c¢ôB¤øÊ\u0086ý¡´d\u0017D==ã¾n]µ]Í\u0000®\u0014\u0091 ¨ãî8àY»k\u00987ß7óªÞ¿\u0097hGÔÖ\"I:Æ\u0014r¹#\u009fi\u001aD\u001b±Inç©-ÔõFIo¸\u000bO·º\u0003Ä\u00ad§ÊÌ\u0087°ü2Ñ%º\u0089X\u009f\u0003;pºëb;Ðõ\u0017Í<¶c\u0083\u0099\u0010`\"8Eä·î¤\u0095t\u000f\u0092 >;.0?q\u001a\u000fØ^7\u0082\u0018»XàAM^;Ì¼xÀðæ\u008fú\u008caj\u0019£ª¨<¢!\u008f<\u008fetê´ô\u008d\u000eÃW1æ\t\u001beã\u0005vÀ)±\"[$\u0014\u0083\u008f8Ý\"è,\u0015Iy\u0018çs÷\u0081~\u0018È;z§Ø\u008cø¬4×í÷g 6Û*Òc¼p\u000f\u0087Þ\u0099¼ûJ\u0096NÇ)1Ùñ²g+ËÀA\u001aÉ\u000bùa«W\u007f\u0096Á\u0018\u009e\u001d\u00078I/w{Æª3ã2Ó¼í\u0007k];R\u0081àÛi\u009d¹`\n±KÄy«NÇ\u008ceä8(¡]X\u0016\u009fiEã`qÈ~Æ²´¯ë\u0005¸\u0007¤\u008aÇ/ä3\u0085£\u0095qï\u008bÆ\u0084¬«ÿ¹;\u008eJ\u009cì¦æÀ|\u0016lYÕ}\u0000·lr\u008dÔK{C\u0017Ûhün5¬2øÆN\u0085`)z¶\u0083³PqQé\t\u0005CÑ=Á?d;½jÏ\u0084¥àó{»3\\X×íOz»`\u009b\u0016 }þÁ\u0098\u009eeX\u0013\u0000\u007fß»V|\fQ\u0003\u0003Q\u001bYµD;¶Þ0#No'WAVÁr2/¾oN\u0016\u0019\u009c\u0014v,l\u000fúÕÕº\u001bZ\u0015ãÒû5ÙÆf\b°K 9wè{ß\u0095Ä\u0001Ûÿ`(ò>Þl\u0097\u009bA\u009dþ\u0013Ù\\G·â\u009c\u0092¨\u008f".length();
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
                                                c = new Integer[93];
                                                AM = new iy(strArr[13], 0);
                                                AR = new iy(strArr[39], 1);
                                                EU = new iy(strArr[2], 2);
                                                BN = new iy(strArr[10], 3);
                                                BG = new iy(strArr[16], 4);
                                                CA = new iy(strArr[25], 5);
                                                CHR = new iy(strArr[48], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13942, 8419547227883557196L ^ j) /* invoke-custom */);
                                                HR = new iy(strArr[47], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8353, 5092889293213517721L ^ j) /* invoke-custom */);
                                                CS = new iy(strArr[35], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2083, 1619030359169068808L ^ j) /* invoke-custom */);
                                                DA = new iy(strArr[3], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30173, 588885256102646407L ^ j) /* invoke-custom */);
                                                NL = new iy(strArr[1], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5490, 3464178533227065889L ^ j) /* invoke-custom */);
                                                EN = new iy(strArr[30], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17974, 3205563583522513169L ^ j) /* invoke-custom */);
                                                ET = new iy(strArr[42], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19114, 8679889433479490967L ^ j) /* invoke-custom */);
                                                FIL = new iy(strArr[51], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12730, 2133267334670964400L ^ j) /* invoke-custom */);
                                                FI = new iy(strArr[34], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3480, 6693237688552516228L ^ j) /* invoke-custom */);
                                                FR = new iy(strArr[29], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15024, 1331940698701422053L ^ j) /* invoke-custom */);
                                                DE = new iy(strArr[24], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21849, 3721726109333336694L ^ j) /* invoke-custom */);
                                                EL = new iy(strArr[23], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17586, 861049914419946392L ^ j) /* invoke-custom */);
                                                GU = new iy(strArr[28], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5076, 1302151560085894367L ^ j) /* invoke-custom */);
                                                IW = new iy(strArr[43], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(338, 8753682892523988550L ^ j) /* invoke-custom */);
                                                HI = new iy(strArr[0], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22519, 4134681661965971685L ^ j) /* invoke-custom */);
                                                HU = new iy(strArr[19], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32725, 4986820906614003943L ^ j) /* invoke-custom */);
                                                IS = new iy(strArr[20], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1650, 7212668597997363580L ^ j) /* invoke-custom */);
                                                ID = new iy(strArr[9], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19231, 7772891824073092138L ^ j) /* invoke-custom */);
                                                IT = new iy(strArr[41], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19408, 3018424802254990559L ^ j) /* invoke-custom */);
                                                JA = new iy(strArr[31], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28933, 7585252003628553748L ^ j) /* invoke-custom */);
                                                KN = new iy(strArr[6], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22663, 3132434136442486666L ^ j) /* invoke-custom */);
                                                KO = new iy(strArr[32], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11990, 7618322698195683739L ^ j) /* invoke-custom */);
                                                LV = new iy(strArr[17], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19758, 5915969735926884982L ^ j) /* invoke-custom */);
                                                LT = new iy(strArr[38], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30135, 3278409533402288817L ^ j) /* invoke-custom */);
                                                MS = new iy(strArr[50], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8038, 1046476982652172399L ^ j) /* invoke-custom */);
                                                ML = new iy(strArr[45], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26695, 1770749547151789906L ^ j) /* invoke-custom */);
                                                MR = new iy(strArr[7], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9244, 7194610921815360300L ^ j) /* invoke-custom */);
                                                NO = new iy(strArr[40], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13157, 314687515450201180L ^ j) /* invoke-custom */);
                                                PL = new iy(strArr[5], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31408, 2047097820934118788L ^ j) /* invoke-custom */);
                                                RO = new iy(strArr[46], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26834, 8944356207283113983L ^ j) /* invoke-custom */);
                                                RU = new iy(strArr[14], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11478, 5831322579517918097L ^ j) /* invoke-custom */);
                                                SR = new iy(strArr[22], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26951, 3731923619881913882L ^ j) /* invoke-custom */);
                                                SK = new iy(strArr[11], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26571, 8261143115915264204L ^ j) /* invoke-custom */);
                                                SL = new iy(strArr[4], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(839, 4720770333162267769L ^ j) /* invoke-custom */);
                                                ES = new iy(strArr[33], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30689, 4038796426068660438L ^ j) /* invoke-custom */);
                                                SW = new iy(strArr[36], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16042, 1568127453939784105L ^ j) /* invoke-custom */);
                                                SV = new iy(strArr[37], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16680, 511301670485763593L ^ j) /* invoke-custom */);
                                                TA = new iy(strArr[18], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23097, 7573066429949033840L ^ j) /* invoke-custom */);
                                                TE = new iy(strArr[26], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21824, 1372900989203133036L ^ j) /* invoke-custom */);
                                                TH = new iy(strArr[27], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14742, 4270992825550823130L ^ j) /* invoke-custom */);
                                                TR = new iy(strArr[44], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8948, 2840698119795197418L ^ j) /* invoke-custom */);
                                                UR = new iy(strArr[21], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27829, 5376435061360954297L ^ j) /* invoke-custom */);
                                                UK = new iy(strArr[49], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1618, 7555190156415099213L ^ j) /* invoke-custom */);
                                                VI = new iy(strArr[8], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8104, 4119307183886235881L ^ j) /* invoke-custom */);
                                                CY = new iy(strArr[12], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14567, 7135833710387257273L ^ j) /* invoke-custom */);
                                                CN = new iy(strArr[15], (int) a(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6168, 5999669679843147548L ^ j) /* invoke-custom */);
                                                E = E(j2);
                                                p = EnumEntriesKt.enumEntries(E);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i10 >= length2) {
                                                str3 = "´ÿXÉ@\t\u0099#\\\u0080#T#\u0006\u0007\u0088";
                                                length2 = "´ÿXÉ@\t\u0099#\\\u0080#T#\u0006\u0007\u0088".length();
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
                        str = "¿CN\u0011%\\=\u009c\b\u008an{\u0090\u008f\u008dq[";
                        length = "¿CN\u0011%\\=\u009c\b\u008an{\u0090\u008f\u008dq[".length();
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

    public static void f(String[] strArr) {
        B = strArr;
    }

    public static String[] q() {
        return B;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 7163;
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
                    throw new RuntimeException("su/catlean/iy", e);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/iy"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iy.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
