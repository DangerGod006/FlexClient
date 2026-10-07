package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import net.minecraft.class_156;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ac.class */
public final class ac extends a3 {

    @NotNull
    public static final ac P;
    private static final long b = yz.a(-39453276538997297L, 1984806815644247958L, MethodHandles.lookup().lookupClass()).a(78635923953557L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private ac(long j) {
        long j2 = b ^ j;
        super(j2 ^ 16879188498166L, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5786, 8820687711153329814L ^ j2) /* invoke-custom */);
    }

    @Override // su.catlean.a3
    public void l(@NotNull LiteralArgumentBuilder builder, long a) throws Exception {
        long j = a ^ 131983109906692L;
        long j2 = a ^ 61473902788714L;
        Intrinsics.checkNotNullParameter(builder, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2988, 905037341048816256L ^ a) /* invoke-custom */);
        builder.then(c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1920, 2577082276363226795L ^ a) /* invoke-custom */).executes(ac::V));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22136, 7550560090439098194L ^ a) /* invoke-custom */).executes(ac::Y));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(957, 8545617742359775900L ^ a) /* invoke-custom */).executes(ac::I));
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3718159434087536429L, a) /* invoke-custom */;
        LiteralArgumentBuilder literalArgumentBuilderC = c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1979, 4619991137248562845L ^ a) /* invoke-custom */);
        String strN = (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(531, 4347464218898844467L ^ a) /* invoke-custom */;
        StringArgumentType stringArgumentTypeWord = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentTypeWord, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29758, 5809976791870455057L ^ a) /* invoke-custom */);
        builder.then(literalArgumentBuilderC.then(j(strN, (ArgumentType) stringArgumentTypeWord, j2).executes(ac::T)));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10606, 5250496695585988684L ^ a) /* invoke-custom */).then(j((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32367, 3776424001453111112L ^ a) /* invoke-custom */, n.I.H(), j2).executes(ac::o)));
        builder.then(c(j, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3123, 48633694368122112L ^ a) /* invoke-custom */).then(j((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32367, 3776424001453111112L ^ a) /* invoke-custom */, n.I.H(), j2).executes(ac::B)));
        try {
            builder.executes(ac::n);
            if (obj != null) {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3687380158444812562L, a) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3686642148952809045L, a) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.StringBuilder] */
    private static final int V(CommandContext commandContext) throws Exception {
        long j = b ^ 84655450791494L;
        long j2 = j ^ 48261372947757L;
        long j3 = j ^ 3999588644618L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 121813035834967L;
        long j5 = j ^ 33921579190994L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7481020265642148709L, j) /* invoke-custom */;
        StringBuilder sb = new StringBuilder(i4.h.E(i2, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4726, 8136352403958664983L ^ j) /* invoke-custom */, i3, new Object[0], i4));
        for (y_ y_Var : yl.g.l().F(j2)) {
            Object obj = iArr;
            if (obj != 0) {
                return 1;
            }
            try {
                try {
                    obj = sb;
                    class_124 class_124Var = class_124.field_1070;
                    StringBuilder sb2 = obj;
                    if (iArr == null) {
                        try {
                            StringBuilder sbAppend = obj.append(class_124Var);
                            if (Intrinsics.areEqual(y_Var, yl.g.l().i(j5))) {
                                class_124Var = class_124.field_1060;
                                sb2 = sbAppend;
                            } else {
                                class_124Var = "";
                                sb2 = sbAppend;
                            }
                        } catch (NumberFormatException unused) {
                            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7449507413180795421L, j) /* invoke-custom */;
                        }
                    }
                    sb2.append("\n" + class_124Var).append(y_Var.q()).append(class_124.field_1070);
                    if (iArr != null) {
                        break;
                    }
                } catch (NumberFormatException unused2) {
                    obj = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7449507413180795421L, j) /* invoke-custom */;
                    throw obj;
                }
            } catch (NumberFormatException unused3) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7449507413180795421L, j) /* invoke-custom */;
            }
        }
        ac acVar = P;
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4362, 8176617340615593057L ^ j) /* invoke-custom */);
        acVar.a(string, j4);
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private static final int Y(CommandContext commandContext) {
        long j = b ^ 56919802187027L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(827374316149747662L, j) /* invoke-custom */;
        try {
            try {
                class_156.class_158 class_158VarMethod_668 = class_156.method_668();
                File fileU = yl.g.l().U();
                Object objExists = iArr;
                if (objExists == 0) {
                    try {
                        objExists = fileU.exists();
                        if (objExists == 0) {
                            fileU.createNewFile();
                        }
                        class_158VarMethod_668.method_672(fileU);
                    } catch (Exception unused) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, 849904075129333430L, j) /* invoke-custom */;
                    }
                }
                return 1;
            } catch (Exception unused2) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, 849904075129333430L, j) /* invoke-custom */;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final int I(CommandContext commandContext) throws Exception {
        long j = b ^ 4873399084170L;
        long j2 = j ^ 75734562391022L;
        long j3 = j ^ 10550238799169L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6709700282172012969L, j) /* invoke-custom */;
        Iterator it = iq.a.L().iterator();
        Intrinsics.checkNotNullExpressionValue(it, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9522, 4459341419750720158L ^ j) /* invoke-custom */);
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9943, 4329841334911664481L ^ j) /* invoke-custom */);
            _g _gVar = (_g) next;
            while (true) {
                ?? F = _gVar;
                ?? r0 = F;
                if (iArr == null) {
                    try {
                        F = F.f(j3);
                        if (F != 0) {
                            _gVar.d(j2);
                        }
                        r0 = _gVar;
                    } catch (NumberFormatException unused) {
                        throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -6750261514041422033L, j) /* invoke-custom */;
                    }
                }
                Iterator it2 = r0.c().iterator();
                while (it2.hasNext()) {
                    ((a1) it2.next()).A();
                    if (iArr == null) {
                        if (iArr == null && iArr == null) {
                        }
                        return 1;
                    }
                }
            }
        }
        return 1;
    }

    private static final int T(CommandContext commandContext) {
        long j = b ^ 74798542299647L;
        long j2 = j ^ 135191098282891L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 32);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 12482191476915L;
        int i5 = (int) (j >>> 32);
        int i6 = (int) ((j3 << 32) >>> 48);
        int i7 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 112359702225390L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32367, 3776522697477053625L ^ j) /* invoke-custom */, String.class);
        Intrinsics.checkNotNull(str);
        io.p(str, i0.MODULES, (char) i2, i3, (short) i4);
        P.a(i4.h.E(i5, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20944, 3077405209636401935L ^ j) /* invoke-custom */, i6, new Object[]{str}, i7), j4);
        return 1;
    }

    private static final int o(CommandContext commandContext) {
        long j = b ^ 78245639561400L;
        long j2 = j ^ 9297053403636L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 111180985491625L;
        long j4 = j ^ 39375024504732L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32367, 3776519306684653054L ^ j) /* invoke-custom */, String.class);
        Intrinsics.checkNotNull(str);
        io.D(str, i0.MODULES, (int) (j >>> 32), (short) ((j4 << 32) >>> 48), (int) ((j4 << 48) >>> 48));
        P.a(i4.h.E(i2, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12297, 4671259857392440218L ^ j) /* invoke-custom */, i3, new Object[]{str}, i4), j3);
        return 1;
    }

    private static final int B(CommandContext commandContext) {
        long j = b ^ 121802339360889L;
        long j2 = j ^ 36945463232821L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j2 << 32) >>> 48);
        int i4 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 84597929140328L;
        long j4 = j ^ 33025876660720L;
        String str = (String) commandContext.getArgument((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32367, 3776494384710769983L ^ j) /* invoke-custom */, String.class);
        Intrinsics.checkNotNull(str);
        io.g((int) (j >>> 32), (byte) ((j4 << 32) >>> 56), str, i0.MODULES, (int) ((j4 << 40) >>> 40));
        P.a(i4.h.E(i2, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17538, 8059536645493450712L ^ j) /* invoke-custom */, i3, new Object[]{str}, i4), j3);
        return 1;
    }

    private static final int n(CommandContext commandContext) {
        long j = b ^ 13544659655923L;
        P.a(class_124.field_1061 + (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2517, 4381681075538171404L ^ j) /* invoke-custom */, j ^ 51016427429090L);
        return 1;
    }

    static {
        int i2;
        long j = (b ^ 124459526698068L) ^ 81754259992733L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((r0 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[19];
        int i4 = 0;
        String str = "É\fÚÄïëp\u0087nØ¸/¢m¦Ö¡Ï\u0010ø-¸\\À\u0081Ja8²Ûù©\u0010êý9\u0011SÄ\u001fjºäfs\u0099 \u001d\u001f\u0010S,\u0004[×Áª\u001b\u0015ÔJja\u0006W\u0095\u0010\u009fqXë÷\u0083ær \u0087ã>\u000bx»Y\u0010ß?ÖÓøh\u001cøn¸ø.h\\\u0085%\u0010Ü!zwwxSÂZ\u0004P\u001dOø\u0011i(2ô\u009b¹¬\u001eéò\u0091 ÞìlÏZz\u008fR6Kè5&V0\u009d\u0003#´øDÇ\u0013æ\u0081\nì\u0099{J@ \rÝ\u009eæ8Ìªd+XÀ(w>¨D<¶\u0001jñ\u0000¤Á3ê\u0099ù\u0098ý\u001e@÷!|«*c\u008e¯\u0085\fnñ\u0000`ñµ)\u008csàñ\u0005Ìãì\u0001\u0083r\u001d\u0016\u0096\u0010ÖÛ«Ï/úÊ7Ii\u001aîÖ¹Ñ\u000e\u0010ÝqþYEý:(n½þÓ±¦¹»(ùÔo/Y\u009c\u0082ôP¨¾[\fÙ-Ö.\u0014\u009c©±s°[î©×0ýðé\u0002ö\u0017¢j\u0097ìBF Â\u00ad\u009f\t\u009cEù\u0097¥«\u0010¶\u008c\u0089¨%¯v'Ð\u0080\u009b\u009dmnoî§\u001aevÞ\u0018gy\u009a\u0094+qtí\u0007Ýõÿ\u009e\u0015üò¢|\u0095\u0083W\\\u009b\u0098([ªjéÒ\u0011*Û\u008c1\tÎëS·\u008b¼%pd\u009dÐ®U1Õ\u0090¶Êº¦!\u009a\u00045[\\Å4²(\u0015\u001eÇ\u0017ü\u008fz°Æ£\u0082IµÞ\u0019Ñ¥oÌ©\u008c[¦\u0005Ê0\u0095\u0015ôóWS0ïrñ\u0096¹\u0084ª\u0010§+æ×0.\u008c\u0016U@ÅèF³j\u0004\u0010<u\u000f\u0089\u0093ÜþÖ=±¶÷°\u008a¶\f";
        int length = "É\fÚÄïëp\u0087nØ¸/¢m¦Ö¡Ï\u0010ø-¸\\À\u0081Ja8²Ûù©\u0010êý9\u0011SÄ\u001fjºäfs\u0099 \u001d\u001f\u0010S,\u0004[×Áª\u001b\u0015ÔJja\u0006W\u0095\u0010\u009fqXë÷\u0083ær \u0087ã>\u000bx»Y\u0010ß?ÖÓøh\u001cøn¸ø.h\\\u0085%\u0010Ü!zwwxSÂZ\u0004P\u001dOø\u0011i(2ô\u009b¹¬\u001eéò\u0091 ÞìlÏZz\u008fR6Kè5&V0\u009d\u0003#´øDÇ\u0013æ\u0081\nì\u0099{J@ \rÝ\u009eæ8Ìªd+XÀ(w>¨D<¶\u0001jñ\u0000¤Á3ê\u0099ù\u0098ý\u001e@÷!|«*c\u008e¯\u0085\fnñ\u0000`ñµ)\u008csàñ\u0005Ìãì\u0001\u0083r\u001d\u0016\u0096\u0010ÖÛ«Ï/úÊ7Ii\u001aîÖ¹Ñ\u000e\u0010ÝqþYEý:(n½þÓ±¦¹»(ùÔo/Y\u009c\u0082ôP¨¾[\fÙ-Ö.\u0014\u009c©±s°[î©×0ýðé\u0002ö\u0017¢j\u0097ìBF Â\u00ad\u009f\t\u009cEù\u0097¥«\u0010¶\u008c\u0089¨%¯v'Ð\u0080\u009b\u009dmnoî§\u001aevÞ\u0018gy\u009a\u0094+qtí\u0007Ýõÿ\u009e\u0015üò¢|\u0095\u0083W\\\u009b\u0098([ªjéÒ\u0011*Û\u008c1\tÎëS·\u008b¼%pd\u009dÐ®U1Õ\u0090¶Êº¦!\u009a\u00045[\\Å4²(\u0015\u001eÇ\u0017ü\u008fz°Æ£\u0082IµÞ\u0019Ñ¥oÌ©\u008c[¦\u0005Ê0\u0095\u0015ôóWS0ïrñ\u0096¹\u0084ª\u0010§+æ×0.\u008c\u0016U@ÅèF³j\u0004\u0010<u\u000f\u0089\u0093ÜþÖ=±¶÷°\u008a¶\f".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            g = strArr;
                            h = new String[19];
                            P = new ac(j);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i9 = i4;
                        i4++;
                        strArr[i9] = strIntern;
                        int i10 = i6 + cCharAt;
                        i5 = i10;
                        if (i10 < length) {
                        }
                        str = "j\u0091ìÐí\u001f\u0002\ro\u0016\u0091þ¬\u0086r\u009a[W\u001c´\u0084\u007f\u0000>w\u000b\u009füzv@\u000e\u0010\u0099±\n½Îká§ª\u0085ñÁTõ\rê";
                        length = "j\u0091ìÐí\u001f\u0002\ro\u0016\u0091þ¬\u0086r\u009a[W\u001c´\u0084\u007f\u0000>w\u000b\u009füzv@\u000e\u0010\u0099±\n½Îká§ª\u0085ñÁTõ\rê".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 1239;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(g[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ac", e);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/ac"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ac.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
