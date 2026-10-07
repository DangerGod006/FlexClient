package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/wi.class */
public final class wi {

    @NotNull
    public static final wi t;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(-1305285687398579513L, -289758182078537564L, MethodHandles.lookup().lookupClass()).a(151652320121607L);
    private static final Map d = new HashMap(13);

    private wi() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @NotNull
    public final class_1799 H(int i, long j) {
        List listListOf;
        class_2561 class_2561Var;
        long j2 = a ^ j;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2278523567640763576L, j2) /* invoke-custom */;
        ?? r0 = i;
        int i2 = r0;
        if (str != null) {
            try {
                switch (r0) {
                    case -16711936:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5914, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 1), new class_1293(class_1294.field_5905, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2451, 3342536449208897509L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5924, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19140, 7971858064000060604L ^ j2) /* invoke-custom */, 1), new class_1293(class_1294.field_5907, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31649, 6250025462118923733L ^ j2) /* invoke-custom */, 0)});
                        class_5250 class_5250VarMethod_43470 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6545, 9118044784610894886L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_43470, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_43470;
                        break;
                    case -16711681:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5913, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5904, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 2)});
                        class_5250 class_5250VarMethod_434702 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30804, 2515039967205295597L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434702, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434702;
                        break;
                    case -6684877:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5899, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(35, 249256857608046170L ^ j2) /* invoke-custom */, 1), new class_1293(class_1294.field_5909, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28151, 9095652356731317122L ^ j2) /* invoke-custom */, 3), new class_1293(class_1294.field_5911, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28151, 9095652356731317122L ^ j2) /* invoke-custom */, 2), new class_1293(class_1294.field_5920, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31029, 9206431216692936523L ^ j2) /* invoke-custom */, 4)});
                        class_5250 class_5250VarMethod_434703 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29399, 2475899356950138727L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434703, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434703;
                        break;
                    case -3407872:
                        i2 = 2;
                        class_1293[] class_1293VarArr = new class_1293[i2];
                        class_1293VarArr[0] = new class_1293(class_1294.field_5907, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16955, 6424283156625622097L ^ j2) /* invoke-custom */, 0);
                        class_1293VarArr[1] = new class_1293(class_1294.field_5910, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23235, 1598030335199190206L ^ j2) /* invoke-custom */, 3);
                        listListOf = CollectionsKt.listOf((Object[]) class_1293VarArr);
                        class_5250 class_5250VarMethod_434704 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2372, 6628157978688648437L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434704, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28006, 3586134144787845328L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434704;
                        break;
                    case -65281:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5914, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9712, 3489684365502145435L ^ j2) /* invoke-custom */, 2), new class_1293(class_1294.field_5924, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1792, 9172722794830381439L ^ j2) /* invoke-custom */, 2)});
                        class_5250 class_5250VarMethod_434705 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30608, 6660188277053917739L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434705, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434705;
                        break;
                    case -39424:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5919, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5874, 7928450835633295491L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5912, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5903, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28151, 9095652356731317122L ^ j2) /* invoke-custom */, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2930, 6870323072679726345L ^ j2) /* invoke-custom */), new class_1293(class_1294.field_5909, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 2), new class_1293(class_1294.field_5920, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16755, 5101891222748301065L ^ j2) /* invoke-custom */, 4)});
                        class_5250 class_5250VarMethod_434706 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29545, 492953725971042012L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434706, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434706;
                        break;
                    case -256:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5918, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15537, 3204601174458563270L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5917, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18560, 4796324471462825712L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5905, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2451, 3342536449208897509L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5904, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2451, 3342536449208897509L ^ j2) /* invoke-custom */, 2), new class_1293(class_1294.field_5910, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10696, 396150227391147963L ^ j2) /* invoke-custom */, 2)});
                        class_5250 class_5250VarMethod_434707 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14128, 6084082100562840195L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_434707, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = (class_2561) class_5250VarMethod_434707;
                        break;
                    case -1:
                        listListOf = CollectionsKt.listOf((Object[]) new class_1293[]{new class_1293(class_1294.field_5919, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30102, 8682407165786502122L ^ j2) /* invoke-custom */, 0), new class_1293(class_1294.field_5912, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(525, 6757572739741336703L ^ j2) /* invoke-custom */, 0)});
                        class_2561 class_2561VarMethod_43470 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29122, 2365455358012034160L ^ j2) /* invoke-custom */);
                        Intrinsics.checkNotNullExpressionValue(class_2561VarMethod_43470, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29241, 8064860336154611597L ^ j2) /* invoke-custom */);
                        class_2561Var = class_2561VarMethod_43470;
                        break;
                    default:
                        class_1799 class_1799Var = new class_1799(class_1802.field_8436);
                        class_1799Var.method_57379(class_9334.field_49631, class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6979, 2123945972670424827L ^ j2) /* invoke-custom */));
                        return class_1799Var;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2171677480222928402L, j2) /* invoke-custom */;
            }
        } else {
            class_1293[] class_1293VarArr2 = new class_1293[i2];
            class_1293VarArr2[0] = new class_1293(class_1294.field_5907, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16955, 6424283156625622097L ^ j2) /* invoke-custom */, 0);
            class_1293VarArr2[1] = new class_1293(class_1294.field_5910, (int) b(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23235, 1598030335199190206L ^ j2) /* invoke-custom */, 3);
            listListOf = CollectionsKt.listOf((Object[]) class_1293VarArr2);
            class_5250 class_5250VarMethod_4347042 = class_2561.method_43470((String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2372, 6628157978688648437L ^ j2) /* invoke-custom */);
            Intrinsics.checkNotNullExpressionValue(class_5250VarMethod_4347042, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28006, 3586134144787845328L ^ j2) /* invoke-custom */);
            class_2561Var = (class_2561) class_5250VarMethod_4347042;
        }
        class_1799 class_1799Var2 = new class_1799(class_1802.field_8436);
        class_1799Var2.method_57379(class_9334.field_49651, new class_1844(Optional.empty(), Optional.empty(), listListOf, Optional.empty()));
        class_1799Var2.method_57379(class_9334.field_49631, class_2561Var);
        return class_1799Var2;
    }

    static {
        int i;
        long j = a ^ 121706793940229L;
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
        String str = "Ûµ£yc9E\u001e\u008ev\u0004a\u00adÿkþ\u0004¸[¯\u000b9\u0016$íUÌà\u001b~YmÿØ¸\u008bÓ®Ú\u0098ù=Îá¬\u0099\u0017yR\f3 ¨Áâ\u0092Í\u0094¥S\u001câ/X\u0092\u0014\u007fª\u0001=t\u0094b ôº\u0099\u008ahw¹F:\u000eÇ\u0088\f\u0013X6\u00051\n¹\u0095%3\t¾-Õ\u0012\u0097\"¼ý=JDa\u008d\u0015l\u0093|Û\u009aV_&\u000bÕßî2írCU\u0005Ä\u0097\u000e\u000b¾2}à{\u0089¶êÜ<7¾3\u0016\u0097í\u0092l;ªû\u0011§7±cÇÖq¯\u009c\u0093@ê\u008bSï,Ô\u0010_O\u0088Hqy'ý9úO¬\u000e§\u0090\u0003\u0093_D\u0087ÉÞf\u008e\u0085\u0087qÜ.FÏZUÞù«Vy%\u0084Z'Í\bjRFéoök\u0011p\u0082U\u0092Ö×1ÙÄZ{`®ez%VQ'½\u001c\u0015Z\u0082@WÈøK¯ô(Æö\u001a·¼\u0090ÍÏw\u008cÇË\u0093\u0007\u0080eZ®rîF¡\u001c¬Ð»j`BwÁb\u0010w-\u0014=\bÐÂ¬\u000eF\u007f«\u000fò·\u00ad9W\u0086ûþ\u000b®Â`\t)\u009dM\u000ex\f\u008dóPæÿ\u0011¥/<\u000fq\n\u001a¾_ `\u0000Óò|ç5Å¨¼j~´f\u0084ÍÑx\u008c\u0089/E\u0099ª^ñ>ñ]\u0004ã\u009bx¬Ô\u008bÅ¡Ì¸\u0094\nZ[?\u0003¼w\u0084M\u0084\u008bíx\u0094¿7?ÎÁõn»hFU$gEa\u0083´¸ \np\u008f²èÆEw§Î ï\u0001§={LÕ#\u0098ðoS).:\u0080°lù.È`V¹\u009câ\u0087_\u008bù¼\u008e\u0090ä\u0092\u000bÛjï\u001at¬ðÒÕlª5Ëýò©w(9\r@,5b¹ÿ?áW\u0018Ö\u0098Ä»Áèdä\u0090×(´õ[\u009bd+æ\u0093ªeW^Ì\u0004\u0015\u001f\u0019àºüH:\u0081û\u008f1ÿ~\u0006\rXÝ¿MjÆÆ\u001bÑ¬f Î)o\u008e]Úûì\u009a\u00ad\u0011\u001fÙË\u0084Våäµ«q\u0087¯`LL3\u0083\u008cûÙÌHdqê)\u0012i\u000e\u0007¬P\\üqÿÀP\u0019\u009a®U\u0093â\tO`f\u001e\u009fn\u0093«\u0012.É¿¿r\u001eÊQ®\u009cnÔû¾&8íÝ\u000ef)Â>©3%\u007f¢4êø\u0080$\u0004Ó\u009eÉT±§";
        int length = "Ûµ£yc9E\u001e\u008ev\u0004a\u00adÿkþ\u0004¸[¯\u000b9\u0016$íUÌà\u001b~YmÿØ¸\u008bÓ®Ú\u0098ù=Îá¬\u0099\u0017yR\f3 ¨Áâ\u0092Í\u0094¥S\u001câ/X\u0092\u0014\u007fª\u0001=t\u0094b ôº\u0099\u008ahw¹F:\u000eÇ\u0088\f\u0013X6\u00051\n¹\u0095%3\t¾-Õ\u0012\u0097\"¼ý=JDa\u008d\u0015l\u0093|Û\u009aV_&\u000bÕßî2írCU\u0005Ä\u0097\u000e\u000b¾2}à{\u0089¶êÜ<7¾3\u0016\u0097í\u0092l;ªû\u0011§7±cÇÖq¯\u009c\u0093@ê\u008bSï,Ô\u0010_O\u0088Hqy'ý9úO¬\u000e§\u0090\u0003\u0093_D\u0087ÉÞf\u008e\u0085\u0087qÜ.FÏZUÞù«Vy%\u0084Z'Í\bjRFéoök\u0011p\u0082U\u0092Ö×1ÙÄZ{`®ez%VQ'½\u001c\u0015Z\u0082@WÈøK¯ô(Æö\u001a·¼\u0090ÍÏw\u008cÇË\u0093\u0007\u0080eZ®rîF¡\u001c¬Ð»j`BwÁb\u0010w-\u0014=\bÐÂ¬\u000eF\u007f«\u000fò·\u00ad9W\u0086ûþ\u000b®Â`\t)\u009dM\u000ex\f\u008dóPæÿ\u0011¥/<\u000fq\n\u001a¾_ `\u0000Óò|ç5Å¨¼j~´f\u0084ÍÑx\u008c\u0089/E\u0099ª^ñ>ñ]\u0004ã\u009bx¬Ô\u008bÅ¡Ì¸\u0094\nZ[?\u0003¼w\u0084M\u0084\u008bíx\u0094¿7?ÎÁõn»hFU$gEa\u0083´¸ \np\u008f²èÆEw§Î ï\u0001§={LÕ#\u0098ðoS).:\u0080°lù.È`V¹\u009câ\u0087_\u008bù¼\u008e\u0090ä\u0092\u000bÛjï\u001at¬ðÒÕlª5Ëýò©w(9\r@,5b¹ÿ?áW\u0018Ö\u0098Ä»Áèdä\u0090×(´õ[\u009bd+æ\u0093ªeW^Ì\u0004\u0015\u001f\u0019àºüH:\u0081û\u008f1ÿ~\u0006\rXÝ¿MjÆÆ\u001bÑ¬f Î)o\u008e]Úûì\u009a\u00ad\u0011\u001fÙË\u0084Våäµ«q\u0087¯`LL3\u0083\u008cûÙÌHdqê)\u0012i\u000e\u0007¬P\\üqÿÀP\u0019\u009a®U\u0093â\tO`f\u001e\u009fn\u0093«\u0012.É¿¿r\u001eÊQ®\u009cnÔû¾&8íÝ\u000ef)Â>©3%\u007f¢4êø\u0080$\u0004Ó\u009eÉT±§".length();
        char cCharAt = 'X';
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
                            c = new String[11];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[18];
                            int i9 = 0;
                            String str3 = "øîã¦Q©\u001a.\u0098Ý\u001eqgô\u0095Æ\u0097j>ÈWë\r4\u0014YFz\u0018ºÍH/,ýOØ|ñÕk(Ö\u008e·Óµ\u0087ý\u000bQXæßAí±\u001dÃ&Y\u009a\u0090\u009eLÉ\u0010æc=~l\u008c\tuSõ?¸\u001a\u0019éã\u0010âÉµnYTÌFNô¬\u0084£¤¤\u0099Ð \u009em\u001fMÖð\u0091\u0093sÐ\u0014#h\u008a¥\u0003ªdÃW9tfV¦2";
                            int length2 = "øîã¦Q©\u001a.\u0098Ý\u001eqgô\u0095Æ\u0097j>ÈWë\r4\u0014YFz\u0018ºÍH/,ýOØ|ñÕk(Ö\u008e·Óµ\u0087ý\u000bQXæßAí±\u001dÃ&Y\u009a\u0090\u009eLÉ\u0010æc=~l\u008c\tuSõ?¸\u001a\u0019éã\u0010âÉµnYTÌFNô¬\u0084£¤¤\u0099Ð \u009em\u001fMÖð\u0091\u0093sÐ\u0014#h\u008a¥\u0003ªdÃW9tfV¦2".length();
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
                                                e = jArr;
                                                f = new Integer[18];
                                                t = new wi();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "!æwé%©àÚ[M1|aÇw^";
                                                length2 = "!æwé%©àÚ[M1|aÇw^".length();
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
                        str = "¹\u0090ÆÌÍý\u0002løç¼°;n#\u0098ï¢yõÔ7míðo\u0000ËOi®(\u0011LÉ[\u0093$ü;â3\u008d\u0092|MZ\fg\u0002dª\u0019e0\u001aU\t:R9bÈ_Hc\u009f=ÀçP0m¬\nÃóÞÇ\u0086\u008aõ£\u0099y\u008c\u0092\t\u0097QïÒÄ|\"\u001a¢¢\u0096\u001129k\u001eê+\u000e\tI²3.Ôý·R\u0019h\u0082ß[\u00143\u0004°|¥î£\u0084<e&\u008c¥ìj";
                        length = "¹\u0090ÆÌÍý\u0002løç¼°;n#\u0098ï¢yõÔ7míðo\u0000ËOi®(\u0011LÉ[\u0093$ü;â3\u008d\u0092|MZ\fg\u0002dª\u0019e0\u001aU\t:R9bÈ_Hc\u009f=ÀçP0m¬\nÃóÞÇ\u0086\u008aõ£\u0099y\u008c\u0092\t\u0097QïÒÄ|\"\u001a¢¢\u0096\u001129k\u001eê+\u000e\tI²3.Ôý·R\u0019h\u0082ß[\u00143\u0004°|¥î£\u0084<e&\u008c¥ìj".length();
                        cCharAt = '@';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 7471;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/wi", e2);
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
            java.lang.String r1 = "su/catlean/wi"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wi.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 9957;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/wi", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i2].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
            java.lang.String r1 = "su/catlean/wi"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.wi.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
