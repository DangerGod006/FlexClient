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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zm.class */
public final class zm {
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(6788125218847003900L, -7433906626263918650L, MethodHandles.lookup().lookupClass()).a(8335460878030L);
    private static final Map d = new HashMap(13);

    @NotNull
    public static final class_5250 F(@NotNull class_5250 $this$applyFormatting, @NotNull String addition, @NotNull class_124 formatting, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$applyFormatting, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291889312372872035L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619622382762212798L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(formatting, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16223, 3482245934731883683L ^ j) /* invoke-custom */);
        class_5250 class_5250VarMethod_10852 = $this$applyFormatting.method_10852(class_2561.method_43470(addition).method_27692(formatting));
        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_10852, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10842, 2869827753165611425L ^ j) /* invoke-custom */);
        return class_5250VarMethod_10852;
    }

    @NotNull
    public static final class_5250 M(long a2, @NotNull class_5250 $this$black, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$black, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291904522911669779L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619562813523833038L ^ j) /* invoke-custom */);
        return F($this$black, addition, class_124.field_1074, j ^ 41490996341612L);
    }

    @NotNull
    public static final class_5250 D(@NotNull class_5250 $this$green, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$green, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291848878612501681L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619652579735943788L ^ j) /* invoke-custom */);
        return F($this$green, addition, class_124.field_1060, j ^ 129846313787854L);
    }

    @NotNull
    public static final class_5250 F(@NotNull class_5250 $this$white, @NotNull String addition, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$white, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291837876376949295L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619637192341863666L ^ j) /* invoke-custom */);
        return F($this$white, addition, class_124.field_1068, j ^ 105667386943312L);
    }

    @NotNull
    public static final class_5250 E(long a2, @NotNull class_5250 $this$gray, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$gray, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291914372252840570L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619577086867004583L ^ j) /* invoke-custom */);
        return F($this$gray, addition, class_124.field_1080, j ^ 46966097954565L);
    }

    @NotNull
    public static final class_5250 q(@NotNull class_5250 $this$aqua, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$aqua, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291898269206746080L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619631601684675901L ^ j) /* invoke-custom */);
        return F($this$aqua, addition, class_124.field_1075, j ^ 100108947252895L);
    }

    @NotNull
    public static final class_5250 X(@NotNull class_5250 $this$darkBlue, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$darkBlue, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291899290640791773L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619627971603256832L ^ j) /* invoke-custom */);
        return F($this$darkBlue, addition, class_124.field_1058, j ^ 97855401807266L);
    }

    @NotNull
    public static final class_5250 k(long a2, @NotNull class_5250 $this$darkGreen, @NotNull String addition, byte a3) {
        long j = ((a2 << 8) | ((((long) a3) << 56) >>> 56)) ^ a;
        Intrinsics.checkNotNullParameter($this$darkGreen, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291876337473091124L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619609691465914601L ^ j) /* invoke-custom */);
        return F($this$darkGreen, addition, class_124.field_1077, j ^ 86996962706251L);
    }

    @NotNull
    public static final class_5250 a(@NotNull class_5250 $this$darkAqua, @NotNull String addition, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$darkAqua, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291941107222855920L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619533719375556141L ^ j) /* invoke-custom */);
        return F($this$darkAqua, addition, class_124.field_1062, j ^ 2226638140815L);
    }

    @NotNull
    public static final class_5250 S(int a2, int a3, @NotNull class_5250 $this$darkRed, short a4, @NotNull String addition) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$darkRed, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291968175092006367L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619560769965003522L ^ j) /* invoke-custom */);
        return F($this$darkRed, addition, class_124.field_1079, j ^ 30339962505376L);
    }

    @NotNull
    public static final class_5250 v(@NotNull class_5250 $this$darkPurple, char a2, int a3, char a4, @NotNull String addition) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$darkPurple, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27722, 6368274723861469810L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19, 4720806136028460586L ^ j) /* invoke-custom */);
        return F($this$darkPurple, addition, class_124.field_1064, j ^ 11807139666909L);
    }

    @NotNull
    public static final class_5250 o(long a2, @NotNull class_5250 $this$gold, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$gold, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291850188236547463L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619653915266485082L ^ j) /* invoke-custom */);
        return F($this$gold, addition, class_124.field_1065, j ^ 131216201978104L);
    }

    @NotNull
    public static final class_5250 T(int a2, @NotNull class_5250 $this$darkGray, short a3, @NotNull String addition, int a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$darkGray, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291900783011705770L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619629743130140023L ^ j) /* invoke-custom */);
        return F($this$darkGray, addition, class_124.field_1063, j ^ 98213616010965L);
    }

    @NotNull
    public static final class_5250 m(@NotNull class_5250 $this$blue, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$blue, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291842661158351397L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619641684967169272L ^ j) /* invoke-custom */);
        return F($this$blue, addition, class_124.field_1078, j ^ 119230712645466L);
    }

    @NotNull
    public static final class_5250 z(@NotNull class_5250 $this$red, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$red, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291870826866629963L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619604172067877782L ^ j) /* invoke-custom */);
        return F($this$red, addition, class_124.field_1061, j ^ 72649259395124L);
    }

    @NotNull
    public static final class_5250 i(int a2, @NotNull class_5250 $this$lightPurple, @NotNull String addition, byte a3, int a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 56) >>> 32)) | ((((long) a4) << 40) >>> 40)) ^ a;
        Intrinsics.checkNotNullParameter($this$lightPurple, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291958477691260783L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619551085520511410L ^ j) /* invoke-custom */);
        return F($this$lightPurple, addition, class_124.field_1076, j ^ 20662224714256L);
    }

    @NotNull
    public static final class_5250 J(@NotNull class_5250 $this$yellow, int a2, int a3, @NotNull String addition) {
        long j = ((((long) a2) << 32) | ((((long) a3) << 32) >>> 32)) ^ a;
        Intrinsics.checkNotNullParameter($this$yellow, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291889323125179322L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619622406360722791L ^ j) /* invoke-custom */);
        return F($this$yellow, addition, class_124.field_1054, j ^ 92288012842693L);
    }

    @NotNull
    public static final class_5250 Q(@NotNull class_5250 $this$obf, @NotNull String addition, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$obf, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291892941309175574L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619626003193825739L ^ j) /* invoke-custom */);
        return F($this$obf, addition, class_124.field_1051, j ^ 103585716015721L);
    }

    @NotNull
    public static final class_5250 y(char a2, @NotNull class_5250 $this$bold, int a3, @NotNull String addition, int a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$bold, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291862347522269830L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619666048584223835L ^ j) /* invoke-custom */);
        return F($this$bold, addition, class_124.field_1067, j ^ 134519332247545L);
    }

    @NotNull
    public static final class_5250 Z(@NotNull class_5250 $this$strikethrough, int a2, short a3, @NotNull String addition, short a4) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter($this$strikethrough, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291932971373103000L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619595939324160325L ^ j) /* invoke-custom */);
        return F($this$strikethrough, addition, class_124.field_1055, j ^ 65547971130087L);
    }

    @NotNull
    public static final class_5250 s(@NotNull class_5250 $this$underline, long a2, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$underline, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291919553038369021L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619582246223621664L ^ j) /* invoke-custom */);
        return F($this$underline, addition, class_124.field_1073, j ^ 59794122880386L);
    }

    @NotNull
    public static final class_5250 t(long a2, @NotNull class_5250 $this$italic, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$italic, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291920550536291681L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619583518615391164L ^ j) /* invoke-custom */);
        return F($this$italic, addition, class_124.field_1056, j ^ 60789490307102L);
    }

    @NotNull
    public static final class_5250 R(long a2, @NotNull class_5250 $this$reset, @NotNull String addition) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$reset, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291871295362229999L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(addition, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30273, 619604632089987122L ^ j) /* invoke-custom */);
        return F($this$reset, addition, class_124.field_1070, j ^ 74240738005904L);
    }

    @NotNull
    public static final class_5250 B(long j) {
        long j2 = a ^ j;
        class_5250 class_5250VarMethod_43473 = class_2561.method_43473();
        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_43473, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25805, 6590722283598214677L ^ j2) /* invoke-custom */);
        return class_5250VarMethod_43473;
    }

    @NotNull
    public static final class_2561 G(long a2, @NotNull String $this$text) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$text, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6301, 8291942303054863198L ^ j) /* invoke-custom */);
        class_2561 class_2561VarMethod_30163 = class_2561.method_30163($this$text);
        Intrinsics.checkNotNullExpressionValue(class_2561VarMethod_30163, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1319, 1543628995099526887L ^ j) /* invoke-custom */);
        return class_2561VarMethod_30163;
    }

    static {
        int i;
        long j = a ^ 25100464840929L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i3 = 0;
        String str = "úÁ;ª\u0080¶\u0081\u000e3\u0084Â\u0005U2\u00adö \u001dí\u00063\u0089J\u001b345\u000f\u0018\u0001»õ\u0095Ê¼5ÏÆÀ\u0019Â^Ã¾\u0095ò\u0004r[\u0018\u0013\u0003w\u008dONÔÌ\u0003K6\u001f\u0011;3UÊ`/q©:\u0080ß ©\u009bxk\u0007±{çMjn\u001cÜ\u0090¬-@?µ'§0¢XÕ,¬\u0090Ì\\\u0017D(\u0097\u008d\u0014j<ZÓo\u008e§f\u0000)Ö(\ts¾ÒU©¶«bÉ\u0013\u0096\u009a[a&:\u0017eÆJ\u000eíøï \u000eaºÚ\u009ehiúiED½\u0083\u0013Õª\u008c\u0015\u008aPÎÀ\u0006=g|Ý¨ïsM\b";
        int length = "úÁ;ª\u0080¶\u0081\u000e3\u0084Â\u0005U2\u00adö \u001dí\u00063\u0089J\u001b345\u000f\u0018\u0001»õ\u0095Ê¼5ÏÆÀ\u0019Â^Ã¾\u0095ò\u0004r[\u0018\u0013\u0003w\u008dONÔÌ\u0003K6\u001f\u0011;3UÊ`/q©:\u0080ß ©\u009bxk\u0007±{çMjn\u001cÜ\u0090¬-@?µ'§0¢XÕ,¬\u0090Ì\\\u0017D(\u0097\u008d\u0014j<ZÓo\u008e§f\u0000)Ö(\ts¾ÒU©¶«bÉ\u0013\u0096\u009a[a&:\u0017eÆJ\u000eíøï \u000eaºÚ\u009ehiúiED½\u0083\u0013Õª\u008c\u0015\u008aPÎÀ\u0006=g|Ý¨ïsM\b".length();
        char cCharAt = 16;
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[8];
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "V;\u00913me\u007fç¶à\u008cuü\u001cË\n\u0012!\" ÈßÛ\u008axlxq´\u0085)\u001b\u0010û\u009aQ\u0084>®dÄ\u0005\u0089\u000e_\nYü9";
                        length = "V;\u00913me\u007fç¶à\u008cuü\u001cË\n\u0012!\" ÈßÛ\u008axlxq´\u0085)\u001b\u0010û\u009aQ\u0084>®dÄ\u0005\u0089\u000e_\nYü9".length();
                        cCharAt = ' ';
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 25447;
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
                throw new RuntimeException("su/catlean/zm", e);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
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
            java.lang.String r1 = "su/catlean/zm"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zm.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
