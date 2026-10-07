package su.catlean;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10789;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3298;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.ShaderApplyEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/b6.class */
public final class b6 {

    @NotNull
    public static final b6 R;

    @NotNull
    private static final List x;
    private static boolean U;

    @NotNull
    private static final RenderPipeline.Snippet J;

    @NotNull
    private static final RenderPipeline I;

    @NotNull
    private static final RenderPipeline V;

    @NotNull
    private static final RenderPipeline c;

    @NotNull
    private static final RenderPipeline Y;

    @NotNull
    private static final RenderPipeline W;

    @NotNull
    private static final RenderPipeline H;

    @NotNull
    private static final RenderPipeline z;

    @NotNull
    private static final RenderPipeline l;

    @NotNull
    private static final RenderPipeline y;

    @NotNull
    private static final RenderPipeline T;

    @NotNull
    private static final RenderPipeline u;

    @NotNull
    private static final RenderPipeline Z;

    @NotNull
    private static final RenderPipeline w;

    @NotNull
    private static final RenderPipeline a;

    @NotNull
    private static final RenderPipeline m;

    @NotNull
    private static final RenderPipeline P;

    @NotNull
    private static final RenderPipeline q;

    @NotNull
    private static final RenderPipeline A;

    @NotNull
    private static final RenderPipeline S;

    @NotNull
    private static final RenderPipeline t;

    @NotNull
    private static final RenderPipeline j;

    @NotNull
    private static final RenderPipeline B;

    @NotNull
    private static final RenderPipeline i;

    @NotNull
    private static final RenderPipeline D;

    @NotNull
    private static final RenderPipeline C;

    @NotNull
    private static final RenderPipeline e;
    private static String[] Q;
    private static final long b = yz.a(6007596052786547178L, -6155363886240531148L, MethodHandles.lookup().lookupClass()).a(251360559628631L);
    private static final String[] d;
    private static final String[] f;
    private static final Map g;

    private b6() {
    }

    public final boolean Y() {
        return U;
    }

    public final void P(boolean z2) {
        U = z2;
    }

    @NotNull
    public final RenderPipeline p() {
        return I;
    }

    @NotNull
    public final RenderPipeline G() {
        return V;
    }

    @NotNull
    public final RenderPipeline n() {
        return c;
    }

    @NotNull
    public final RenderPipeline N() {
        return Y;
    }

    @NotNull
    public final RenderPipeline A() {
        return W;
    }

    @NotNull
    public final RenderPipeline z() {
        return H;
    }

    @NotNull
    public final RenderPipeline X() {
        return z;
    }

    @NotNull
    public final RenderPipeline r() {
        return l;
    }

    @NotNull
    public final RenderPipeline I() {
        return y;
    }

    @NotNull
    public final RenderPipeline g() {
        return T;
    }

    @NotNull
    public final RenderPipeline U() {
        return u;
    }

    @NotNull
    public final RenderPipeline b() {
        return Z;
    }

    @NotNull
    public final RenderPipeline H() {
        return w;
    }

    @NotNull
    public final RenderPipeline O() {
        return a;
    }

    @NotNull
    public final RenderPipeline h() {
        return m;
    }

    @NotNull
    public final RenderPipeline J() {
        return P;
    }

    @NotNull
    public final RenderPipeline m() {
        return q;
    }

    @NotNull
    public final RenderPipeline S() {
        return A;
    }

    @NotNull
    public final RenderPipeline B() {
        return S;
    }

    @NotNull
    public final RenderPipeline j() {
        return t;
    }

    @NotNull
    public final RenderPipeline C() {
        return j;
    }

    @NotNull
    public final RenderPipeline Z() {
        return B;
    }

    @NotNull
    public final RenderPipeline Q() {
        return i;
    }

    @NotNull
    public final RenderPipeline d() {
        return D;
    }

    @NotNull
    public final RenderPipeline w() {
        return C;
    }

    @NotNull
    public final RenderPipeline V() {
        return e;
    }

    @Flow
    private final void k(ShaderApplyEvent shaderApplyEvent) {
        long j2 = b ^ 15043038628302L;
        List list = x;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7271191051653384937L, j2) /* invoke-custom */;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            _g[] _gVarArr2 = null;
            try {
                RenderSystem.getDevice().precompilePipeline((RenderPipeline) it.next(), b6::d);
                _gVarArr2 = _gVarArr;
                if (_gVarArr2 != null) {
                    return;
                }
                if (_gVarArr != null) {
                    break;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, 7231529135023870012L, j2) /* invoke-custom */;
            }
        }
        U = true;
    }

    private final RenderPipeline M(RenderPipeline renderPipeline) {
        x.add(renderPipeline);
        return renderPipeline;
    }

    private static final String d(class_2960 class_2960Var, ShaderType shaderType) {
        long j2 = b ^ 48246340937249L;
        Intrinsics.checkNotNullParameter(class_2960Var, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3976, 6835225623760851770L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(shaderType, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29647, 665019457325379439L ^ j2) /* invoke-custom */);
        InputStream inputStreamMethod_14482 = ((class_3298) zf.F(j2 ^ 82812370130693L).method_1478().method_14486(class_2960Var).get()).method_14482();
        Throwable th = null;
        try {
            try {
                String string = IOUtils.toString(inputStreamMethod_14482, StandardCharsets.UTF_8);
                CloseableKt.closeFinally(inputStreamMethod_14482, null);
                return string;
            } finally {
            }
        } catch (Throwable th2) {
            CloseableKt.closeFinally(inputStreamMethod_14482, th);
            throw th2;
        }
    }

    static {
        int i2;
        long j2 = b ^ 65444301903581L;
        long j3 = j2 ^ 60256441897395L;
        g = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], 4277487888167957449L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[69];
        int i4 = 0;
        String str = "\u001f\u0085xNRí\bB\tâ^Á·\u0083¢Z\u0016\u0001@àE>ó =¸\u0010û\u00946ÇÄ\u0019m\r\b¡¶Í^±íÁÍjb\u0094Û\b\u00ad§®M\u009c®èå: +îêö\u00ad8<;zQ±\u001a\u0007¨Ì±\u0000\u0088gTÒê~\u009dt\u0081\u0094eiÎTûz¬\u008f\u00adºd\u0087|\u0091&v·Ò\u0017\u0084Ûw=W6}æEKqú M#\u00168,GI©{\u0082Má\u0018\u009d\u0019^|gDÝ\u0081z`9ô}\u009a\u001bSºÁÆpP\u0006u§\u0088@V*\u0004ï!Ú\u001bàg\u007fÁÈR\ty+[)×&G \u008e\u00058w_¶;i\u0085×R\u0013ÿ¬1ì*K\bÅñ´ÛÛûåôY\u001c\u0017Õ{@I\u0013\u0087êutFXfè¼æ\u0093®\r\u0012D\u0010W\u001b\nÏÞÏþ®\u0098»æ/½\u00adï@\bU«ù¡¥Ø^\u0005ø`\u0088\u001eü?\u0092z©¢gª\u0000Ù\u0014\u001cuV\u008fË\u0092@\u0019d´|\u0001)\u0010\u0087¶\u0097\u0001â\u0011õóP}«\u0091\u0099p6\u0003*è\u007fiAPÍ\u0010\u009alq%ù\u0087LÕ£ÿ\u0099\u008dWTLòUµqÝ.\u001a\u0092nnQ8µà\u0080öá\u008c@ò²\u001fÛë²/\u000b\u0007\u0087Â\b\u0010\u0018îË\u0006slá¾W(\u0017\u008e\u009c÷HË\u008a%\u001bQ.¹«'jçø\u0095ð\fÁÞ\u001bz¯\u0084o0CÈ\u0093©T\u00828\u00adµË'ßbPÌäIÆè\u0091*7r!cA«\u009f\u001a`>\u0096B¯:\u00169\\Å\u0014\u0089\u0017\u0090\u0007\u0097°¶S\u0014åf\u008e5ÍÞÎÓ¿\b\u0098<;ã\u000bq\u0088\u0087#ë\u008dBÂ2\u008fA\u0094¼\u009852B\u0011\u0096·\u0017ïH\u000fÍ¾°Ð\u0085% öü½\u0002_,Í·RãìùÅVAß%r¨Cb§\u001bö¦s\fÊ'BÅ©X¨Ûm\u009d³À%àÉ\u0086\u008a¹\u0097ÓÉuÆ>]Ó¿ÃK\b\u0012\u009b\u009e\u0001ÁR\u000e\u0007³\u0099a\tÓs\u0090«Ò\u0093SÀ^¦@ \u0007*/ÑÑ\u0091¿}_\u0081\u001abðHùø\u0093¥L¬\u009cÉF\u009cAº\u008f²³¡,\u0081EÕhµ©×.º(gx\u0093¤å\u0090¹\u0098\u0080\u0082Á&-¡æ»ñ(1x¹Û\u008aI\u000e-ü\u0012 ¢¶Gà-¬iÐÁ\r¥@RÅ\u0004³ú+é\u0083Ì\u0082ñ¬\u00843[«Æ¡\u001a\f\u00adµ\u0082*ÂLÕ\u0019³ÈÄ¶üªP\u0018^\u0093\u008dq¥\u0099\u0092\t\u0091f\u009d\u0083+±%ÆÉm+Z;YV\u0003\u0089s\u0084\u009f@åÒu\u0082«\u0007q«ær\u001a\u0094\u008d)´þé6\u0004C^\u0097HYÒ\u009e\u0091\u0082gãbÚ¾\u0086ÆSOÌ\u0089Þ\u001a8®@UT¹?þ)Ð8 »y«\u0081;KEï\u0090\"\u0080Pñ\u0000gx=½}\u001d!9¡ªø¨8\u0015øñîø6wg\u008d\u000eZru{ÒnÌ\u008dëâ\u009f\u0011\\_\u001c®Ù\u0084¯Ý¥Ç\u001fí\u0098\u001cPQgS\u0090u#§¶¦<s\u0017¯\u0093Ì\u0005+\u001c>U±ñÐÊä\u0085\u0019Ú(6\u007f¦%\u0003U*Ið5\u0002Qa°ð?ý½,\u0084îþjø\u00007¾\u009fbl\u001f,'\u00ad\u008fÅ2\u00ad\"ê æt\u00823a¸V\u0085pP\u0084\u0016\u009a\u000fRÇ\u001e\u0002¿F\rQs[\u0006ÙÐBäGµÖ(\u0006<ÖåÐjt1Z[¨R«Sõ\u0084W\u0005T³ÚÍÈ\u0099&\u008bÁáÕ>ÞC³\u001f\u009en[\u007f9È@\u0091.¥\u001a\u0018\u0001\u0096â¨¸9Ñ\u0097Å!XMkk]!#\u0015\u000fÐn¶\u0087°ýù\bFµÀ\u009b^sBg-\u0085Eñ\u008d Î\u001eCý\u0018ÇpS\u009dH\u009e\"\f½óç¾Ñ\u00108¢\u001aoÊ~xS\"\u001eÈ\u0086ÐS$`(v¨zç>ò\u001fÁé\u00ado¯Í\u000fTà\u0001øiÆÚ\u008c´°\nÏÙ[xærÚ \u0094d\u0086¤§\u001dt@Ú¤Öns48í\u0019Ý8\u0085\u0085\u000f_vB2ú\u008d%P']ÿ&q?üê\u0085f,¿²n\u001b\u008a|m\"À\u001ep36Ô\u009dÍîØ\u001a=Æëd±£T \u000eôoý@csïü²¤þ\u0097\u0002æTv\\÷\u009eÎ\u007f\u0010&BÌ`\u000e`¡\u0010\u0093Þ\u0094ß@*\u000ey¤^G-\u008f¤P\u0014m\u008f\"\u0092 \u0018ÐèÑ´¸ØaÌá@*\u0085ãÓ|ñ îhÙ\u009a\u000bÃQn\u0017/Dí\u0095\u0098Çi2\r¨N\u0017XÏãÚkí?Rk\u0098ö8ãÿU&¨êôôÜ³¶#Ý\u0014Â\u0006\u001d¨oúÑ\u001c·\u0084¨ÌEËd®\u000bßË½\u0016!½\u009dX]t\u009eªa5ù>üðK×S\u001axNKP\u0082¥Ëß\u0085\u0000\u001fLìK|\u009cuë¢'mW\u0090\u0099¥#G|\rF\u0088C<:\u008d\u0080\u0090\"rf¬k\u0003RSè§\u001f=\u008c\u000f&\u008eþ\u0092\u0004\u0011\u0088:ÙZ#\u007fÌJG\u0010\u0094×\u00002\u0012M8â\b\u0015?-\u0081fleÉ(p£xB\u0019±D±\u0018T\u001b\u0097\r\u0000¥ \u0015\u009b\u009f\u009d\u0095\u0086~\u0086Ó®7,ÂnM\u0086\u009fö`ß5â\u0016¬8ÛE*®X\u0097\u0086\u0097ÿ'â&Â¼×\u007f\u0099\u0005_i¦Ë\u0099h\u000e ½w\u00958¤²\u0019dªï\u001d\u0087\u0003öt\u0091Ä8zà\u0087\nQhÏË÷\u0001\u0005x0êçzñ\u001fFÔ¾Þá¶s\u0017 ©\u0013A¡AÈ\u0084\u0086Ò\u0084ÁÉèI¿\u0011Â*÷V\tNº-J\nJ{ØÑ\u0090C¢í@\u001d\u008e\u00ad®\u0000£Ãõ\u000f\u001fØ\u0084Gëáe$ÊNjª_õz8¬tÐ\"Ìë/ët/A¤\u0017\u00adg\u0090\u0006c¦düBÉæ\u0007\u0085w 8\u0086Îb\u0001B¹Ô´7ë8é7`\u0090\u008dÔ\u0007\"Ýç,8½³~]Í;\u009e3F¨Ã³ç¼fP\u001e \u0094\u0017Çù²\u000fZEÞÕ'>û\u0012\u0016:\u0080BÍMs¥Ò\u0003·b0\u0013ÒkÝ®UõÛ\u0099vT\u0082þÚ\u0006êÚ¢Ó¡°á¯FÝÎ±\u009dÆ*ÀF¶÷T'ÔmE\u0084\u009dÆ\u0088\u000e\u0081Ud\t@Ë\ftL!³.\r{\u00143\u009eØÐqæ?\u0091á«\u0014ãj`Ê¿P.æ4bé\u0011ú\u001eÞl,=BDiÅ¤ëÿ° \\ür\u0002Cî\u001bBgl\u0000§é©RL\u0010º\u0004Fø3\u0015\u0019`ãs\u0098=gï\u001fXPä\u0098Å7E~Ñ»\u0099S5º(7XNÝS ZtãäFÎ\u0088ÑôÅ\u0010Ó¥@YÎo\u0097%ÖóÔØ-½JmÖHÀ\u0005©|\u0089M\u0017\u0085\u001bTf!4 ²aç EfÂ·O;\u008b<K\u009dZû\u0089æ8°Ñ\u001dH§i\u001a\u0082É×®=àEÊ¯Rë°â\u0092 ôìÞØ9®\u00ad=\u008b¿\u0095ã_ Ù]Ö\u0000ÏÑç.)Ô¬9Tèú¢\u007f¤h+\u0010¾%Ã?Ñã\u000f(Ãc\u0087]`\u0090Î0Hä\u008eT3?bÌNöÐ0b¤¡pÑK\u001e&¥cÓ#ag\u001d$\n\u0083ï%¤a\u0007\u0015\u008aÕ\u0001AJkO\u0005Õ\u0081Ù4®Ê>\u0004K\u001dsB©µåØc\u001a&öØ*À$ã\u0082\u009f'|H03úb¦RfêØS\\´á{ø@¾}\u0014å§.hÚ:?ûéñÔ©¶¤\u0095Ê\u000b¶\u0095 7\u009cí\u0004q\u0016¼\u0095A~\u0014\u009e\u0091\u0007#²ø°¿Ù\u009e1MÖ\u008c×Õt\u0002áÁd9\u0010xÅ\u0011G\u00138\u0083W\u0089\u0095Ô$æ\u0091BÏ(\r5\u0081Ü`¸è·\u008b×·&aáÓ½\fíÙX<\u0003\u0098¿³\u001f\na\u0094Dý_©Ü\u001eÆ\u0095ª¹{ w\u009dºàÿÂ\u0092\u000fRãÈë\u0091k\u0005b]÷5\"$¡\u009a:²\u0091tyÇÏA÷84¼â°T\u001c&z\u007f\u0002³\u009b¿¢\u0005,L6æ%\u0086\u0095¬æf\u000b\u0085ù\rB2¨º»\u00020á\u007f~¿PÌ~\u0018Iv\u0097Ç0ÈÖ¬ÔW\u0090 H=Åk£éF¡\u000eÄ\u008c\u0081\\\u0084\u009e®8?\u0085¸\u00948ô°;ðW\u009e\"\fg\u001a\u009e\u0012^óÍ\u009e\u0092`\u008a:\u0091\u0000Õ\u0017¡\u0095¹û\u0092àKbmAð\u0081:C(Èý\u0080\u009d\u0085²jz.ã\u0001Ë(\u0097ï£\t¡d\u0093G¸\u0095ö4gý\u0018\u0090\u0080Âð \u0002F]O\u009dµg\u0006ã|\u008b\u008cÎ:÷%.\u0007Û\u0012\u0010 5\u0088\u0010õ$w\u0001K\b3\u0089Õ\u008b@k8\u0015\u0092^,w\u0002\u0094QYV9IÚ\u001f\r\u0083vÅ\u0084AÝ:\u00922Ó\u0082\u0093Û\u001f\u0098îë2\u00192Â®\u0097&EìÙ¦\u0090Zíhþ\u009a²\u0010\u001cÐ\u008bQy0½nâí)e.Ó)w\u0005»\"Ð¹ Ò$YPßn7\u0083ýñj\u009aYðP\\\u0082\u001fS\u0004Vz\u009eÛz¤g\u000e\u008a\u0097¿«(Õ]þ\u0098@\u0019W¼\u0012%S\u0085ev;:ùðåÊm\u000e\u0010\u008e÷\u0091\u000bÕãL7ÖÙ\u0081\u0011\u0019ò\u0096Ð\r(ÌÎ?\u0093RõÔ\u0011z7\u0017{gÙ\u0096\u0013\u0081¤\u008c\u0082\u009f+TÎ\u001aó\u0006kª\u0086!\u0096µ; õ:\u0096ú\u007fXæº)\u0096a{ÏÀ²µkfjx</\u0094z\u0087WTì#Z\u007f\u0015\u000eß\u0019NW\u0091ç\u0087î\u0082ü\u009eÀE¹\u0087ÚG\u007fÐ~\u00adX\u009bkn\u009fÿ0o\u0014\u008f\u0092ÍÛø$jJ\u00adûËâü\u0012w]9,\u0093Üy\u000eû\u0094\u000f<\u001c-¼\u0083Ü\u0018óyÿ\u001a\t\u0096\b|NîHí®¥LïMÂ\u009c\u000ex^d\u00860D<\u008d!©\u0097ùa\u00135%è§V¼¯`Ð»U\u000f\u00ady2ÌÓòiì0Lõ92\u0091=>çã\u0096°\u0012È\u0088¢>ôt88\u001eP\u0013Ù\"¼z\u0019¨ÉõÝ\nòî\u0004óÑ\u0006©}®2¢·\u0002ÐNæª8>O0rºmë³j\u009f\u0086'L@]\u007frY.o\u0082\u0090\u0002SHÑ%ìø\u0089ÿ\u0003Ý\u009c\u009a\u001fQQjFg´wýþÌèGà7\u0010\rOô\u008c¾e.N\u009f£ª\u0090½q\u0084\\\u0019\u0092ìÆ\u00ad\\2Ã÷\\QYM¶pE4¼\u0018^\u001f¸6'D,@£ÌhPi1\u0002vçYê4\u000e½Ë\u0096\u0006qùz¯Ü\u009c?ØÄz_Ì\u0002úÞ£Î4\u0019V=\u00adSüÆ\u0083ÇHDa\u009dDÃö\u009fº*0èæÞÝ²ØF\u0003üoÄ,¥ê\u009aÀ\u009b'm(Ââ×\u0090SÂC3h8P±Âc<Å|:Q\u0092\u008e7\u0011/°\u0097Ï'±ß¥»ñ!\u0083=¨ÞKà\u008bYk¡q6\u0099@\u008bæ?\u0006õ.»O{»Ì§q,OR\u001f?Pv¼ËM\u00864¯Si*\u0080»\u0080xE\u0086ã\u0081d¤Ìý\u0084ÞG£(\u0084Ðºn\u008eùûîº\u0015Ô\u0087¨Ö\u008b\u008a\b|\u0090\u00951\u001cL\u0094?!i\u0019@\u0087Z\u00884×¹E^\u0003ÏïyË\u0093Ñî&hJd}¹tâ@´j^g.r\u000f\u000b£kcL½H3fY\u0098é?\u001fÍK*úDÎÝZò½µPÔ%ÿéïH\u0015\"´P·\u001d\u0087L;Jªù!Î:\u0003y[ÅJm+öÓ\u0089(Fã·í¸\u0007½\u001d<¿û\\\u0093Øy\u000béÁ\bÁX~ü<ømLw\u001d,j{5óâì;hý°@e\u0096\u008aITÕ\u0019õ=Õw\u001a\u000e\u0087\u0007F\u0001UM°Î¾Á\u000bA\u0014¿Gsö&ö©\u009e\u0005\u0014\u0018¼Ûë3¢\u009d\u0080_nÚL'-Ð\u001cÆß§©W$Ë\u008c(¯\r=(\u0007é\u0098\u0004\u0083\u0002é-\u0018ae0\u0006mÕ\u001d\tz¶êâ\u00196ò\u001eßÂ\"XÁ\u0088»Hî\u009c³öG¯\u0082 ¢íãc\u0011Yü,3âUÕ{\u000b})\u001d)\u0097Â\u0095â\u001c\u0098U\u0081×&Ùý\u001dÁ8ÝCÈ\u0084k\b$,\u0090?ú¼Ó!_CZ çæ\u000fÛVBàí¦§7SxÂY\u0092¬Pè.\u001b\u0094\u0098\u0081pk\u0084\u009c+þ/b¡N~\u00ad=¦\u0018®n1.´7ÃÐnB*µªe¤d¾©6j\u008f\fümHã\\r\u0004ó\u009e\u0098J]á(×  Y³w½ëì\u001d¾'¨æ\u0091\\ä¢Ë\u0018\u007f\u0018åR\u0093ò\u009a\u0004\\T!®7Ã [\\i\u0018\u0010v=\u0007_Fõ\u000b[)kcOF\u008a\u0002~ZÙ\u008b\u0085\u0016(\u001e-À\u0013E\u0091\u00158í<p%º®ß®\u0012î\u0006/ÀU+?ÄÆ¯'ûÍM\u007f$s,Xc\fj¶\u0018/¼,1'p÷\u0096Û`h\u0007\u001e\u0014©\u008fêó4°\u0010I±\u000e";
        int length = "\u001f\u0085xNRí\bB\tâ^Á·\u0083¢Z\u0016\u0001@àE>ó =¸\u0010û\u00946ÇÄ\u0019m\r\b¡¶Í^±íÁÍjb\u0094Û\b\u00ad§®M\u009c®èå: +îêö\u00ad8<;zQ±\u001a\u0007¨Ì±\u0000\u0088gTÒê~\u009dt\u0081\u0094eiÎTûz¬\u008f\u00adºd\u0087|\u0091&v·Ò\u0017\u0084Ûw=W6}æEKqú M#\u00168,GI©{\u0082Má\u0018\u009d\u0019^|gDÝ\u0081z`9ô}\u009a\u001bSºÁÆpP\u0006u§\u0088@V*\u0004ï!Ú\u001bàg\u007fÁÈR\ty+[)×&G \u008e\u00058w_¶;i\u0085×R\u0013ÿ¬1ì*K\bÅñ´ÛÛûåôY\u001c\u0017Õ{@I\u0013\u0087êutFXfè¼æ\u0093®\r\u0012D\u0010W\u001b\nÏÞÏþ®\u0098»æ/½\u00adï@\bU«ù¡¥Ø^\u0005ø`\u0088\u001eü?\u0092z©¢gª\u0000Ù\u0014\u001cuV\u008fË\u0092@\u0019d´|\u0001)\u0010\u0087¶\u0097\u0001â\u0011õóP}«\u0091\u0099p6\u0003*è\u007fiAPÍ\u0010\u009alq%ù\u0087LÕ£ÿ\u0099\u008dWTLòUµqÝ.\u001a\u0092nnQ8µà\u0080öá\u008c@ò²\u001fÛë²/\u000b\u0007\u0087Â\b\u0010\u0018îË\u0006slá¾W(\u0017\u008e\u009c÷HË\u008a%\u001bQ.¹«'jçø\u0095ð\fÁÞ\u001bz¯\u0084o0CÈ\u0093©T\u00828\u00adµË'ßbPÌäIÆè\u0091*7r!cA«\u009f\u001a`>\u0096B¯:\u00169\\Å\u0014\u0089\u0017\u0090\u0007\u0097°¶S\u0014åf\u008e5ÍÞÎÓ¿\b\u0098<;ã\u000bq\u0088\u0087#ë\u008dBÂ2\u008fA\u0094¼\u009852B\u0011\u0096·\u0017ïH\u000fÍ¾°Ð\u0085% öü½\u0002_,Í·RãìùÅVAß%r¨Cb§\u001bö¦s\fÊ'BÅ©X¨Ûm\u009d³À%àÉ\u0086\u008a¹\u0097ÓÉuÆ>]Ó¿ÃK\b\u0012\u009b\u009e\u0001ÁR\u000e\u0007³\u0099a\tÓs\u0090«Ò\u0093SÀ^¦@ \u0007*/ÑÑ\u0091¿}_\u0081\u001abðHùø\u0093¥L¬\u009cÉF\u009cAº\u008f²³¡,\u0081EÕhµ©×.º(gx\u0093¤å\u0090¹\u0098\u0080\u0082Á&-¡æ»ñ(1x¹Û\u008aI\u000e-ü\u0012 ¢¶Gà-¬iÐÁ\r¥@RÅ\u0004³ú+é\u0083Ì\u0082ñ¬\u00843[«Æ¡\u001a\f\u00adµ\u0082*ÂLÕ\u0019³ÈÄ¶üªP\u0018^\u0093\u008dq¥\u0099\u0092\t\u0091f\u009d\u0083+±%ÆÉm+Z;YV\u0003\u0089s\u0084\u009f@åÒu\u0082«\u0007q«ær\u001a\u0094\u008d)´þé6\u0004C^\u0097HYÒ\u009e\u0091\u0082gãbÚ¾\u0086ÆSOÌ\u0089Þ\u001a8®@UT¹?þ)Ð8 »y«\u0081;KEï\u0090\"\u0080Pñ\u0000gx=½}\u001d!9¡ªø¨8\u0015øñîø6wg\u008d\u000eZru{ÒnÌ\u008dëâ\u009f\u0011\\_\u001c®Ù\u0084¯Ý¥Ç\u001fí\u0098\u001cPQgS\u0090u#§¶¦<s\u0017¯\u0093Ì\u0005+\u001c>U±ñÐÊä\u0085\u0019Ú(6\u007f¦%\u0003U*Ið5\u0002Qa°ð?ý½,\u0084îþjø\u00007¾\u009fbl\u001f,'\u00ad\u008fÅ2\u00ad\"ê æt\u00823a¸V\u0085pP\u0084\u0016\u009a\u000fRÇ\u001e\u0002¿F\rQs[\u0006ÙÐBäGµÖ(\u0006<ÖåÐjt1Z[¨R«Sõ\u0084W\u0005T³ÚÍÈ\u0099&\u008bÁáÕ>ÞC³\u001f\u009en[\u007f9È@\u0091.¥\u001a\u0018\u0001\u0096â¨¸9Ñ\u0097Å!XMkk]!#\u0015\u000fÐn¶\u0087°ýù\bFµÀ\u009b^sBg-\u0085Eñ\u008d Î\u001eCý\u0018ÇpS\u009dH\u009e\"\f½óç¾Ñ\u00108¢\u001aoÊ~xS\"\u001eÈ\u0086ÐS$`(v¨zç>ò\u001fÁé\u00ado¯Í\u000fTà\u0001øiÆÚ\u008c´°\nÏÙ[xærÚ \u0094d\u0086¤§\u001dt@Ú¤Öns48í\u0019Ý8\u0085\u0085\u000f_vB2ú\u008d%P']ÿ&q?üê\u0085f,¿²n\u001b\u008a|m\"À\u001ep36Ô\u009dÍîØ\u001a=Æëd±£T \u000eôoý@csïü²¤þ\u0097\u0002æTv\\÷\u009eÎ\u007f\u0010&BÌ`\u000e`¡\u0010\u0093Þ\u0094ß@*\u000ey¤^G-\u008f¤P\u0014m\u008f\"\u0092 \u0018ÐèÑ´¸ØaÌá@*\u0085ãÓ|ñ îhÙ\u009a\u000bÃQn\u0017/Dí\u0095\u0098Çi2\r¨N\u0017XÏãÚkí?Rk\u0098ö8ãÿU&¨êôôÜ³¶#Ý\u0014Â\u0006\u001d¨oúÑ\u001c·\u0084¨ÌEËd®\u000bßË½\u0016!½\u009dX]t\u009eªa5ù>üðK×S\u001axNKP\u0082¥Ëß\u0085\u0000\u001fLìK|\u009cuë¢'mW\u0090\u0099¥#G|\rF\u0088C<:\u008d\u0080\u0090\"rf¬k\u0003RSè§\u001f=\u008c\u000f&\u008eþ\u0092\u0004\u0011\u0088:ÙZ#\u007fÌJG\u0010\u0094×\u00002\u0012M8â\b\u0015?-\u0081fleÉ(p£xB\u0019±D±\u0018T\u001b\u0097\r\u0000¥ \u0015\u009b\u009f\u009d\u0095\u0086~\u0086Ó®7,ÂnM\u0086\u009fö`ß5â\u0016¬8ÛE*®X\u0097\u0086\u0097ÿ'â&Â¼×\u007f\u0099\u0005_i¦Ë\u0099h\u000e ½w\u00958¤²\u0019dªï\u001d\u0087\u0003öt\u0091Ä8zà\u0087\nQhÏË÷\u0001\u0005x0êçzñ\u001fFÔ¾Þá¶s\u0017 ©\u0013A¡AÈ\u0084\u0086Ò\u0084ÁÉèI¿\u0011Â*÷V\tNº-J\nJ{ØÑ\u0090C¢í@\u001d\u008e\u00ad®\u0000£Ãõ\u000f\u001fØ\u0084Gëáe$ÊNjª_õz8¬tÐ\"Ìë/ët/A¤\u0017\u00adg\u0090\u0006c¦düBÉæ\u0007\u0085w 8\u0086Îb\u0001B¹Ô´7ë8é7`\u0090\u008dÔ\u0007\"Ýç,8½³~]Í;\u009e3F¨Ã³ç¼fP\u001e \u0094\u0017Çù²\u000fZEÞÕ'>û\u0012\u0016:\u0080BÍMs¥Ò\u0003·b0\u0013ÒkÝ®UõÛ\u0099vT\u0082þÚ\u0006êÚ¢Ó¡°á¯FÝÎ±\u009dÆ*ÀF¶÷T'ÔmE\u0084\u009dÆ\u0088\u000e\u0081Ud\t@Ë\ftL!³.\r{\u00143\u009eØÐqæ?\u0091á«\u0014ãj`Ê¿P.æ4bé\u0011ú\u001eÞl,=BDiÅ¤ëÿ° \\ür\u0002Cî\u001bBgl\u0000§é©RL\u0010º\u0004Fø3\u0015\u0019`ãs\u0098=gï\u001fXPä\u0098Å7E~Ñ»\u0099S5º(7XNÝS ZtãäFÎ\u0088ÑôÅ\u0010Ó¥@YÎo\u0097%ÖóÔØ-½JmÖHÀ\u0005©|\u0089M\u0017\u0085\u001bTf!4 ²aç EfÂ·O;\u008b<K\u009dZû\u0089æ8°Ñ\u001dH§i\u001a\u0082É×®=àEÊ¯Rë°â\u0092 ôìÞØ9®\u00ad=\u008b¿\u0095ã_ Ù]Ö\u0000ÏÑç.)Ô¬9Tèú¢\u007f¤h+\u0010¾%Ã?Ñã\u000f(Ãc\u0087]`\u0090Î0Hä\u008eT3?bÌNöÐ0b¤¡pÑK\u001e&¥cÓ#ag\u001d$\n\u0083ï%¤a\u0007\u0015\u008aÕ\u0001AJkO\u0005Õ\u0081Ù4®Ê>\u0004K\u001dsB©µåØc\u001a&öØ*À$ã\u0082\u009f'|H03úb¦RfêØS\\´á{ø@¾}\u0014å§.hÚ:?ûéñÔ©¶¤\u0095Ê\u000b¶\u0095 7\u009cí\u0004q\u0016¼\u0095A~\u0014\u009e\u0091\u0007#²ø°¿Ù\u009e1MÖ\u008c×Õt\u0002áÁd9\u0010xÅ\u0011G\u00138\u0083W\u0089\u0095Ô$æ\u0091BÏ(\r5\u0081Ü`¸è·\u008b×·&aáÓ½\fíÙX<\u0003\u0098¿³\u001f\na\u0094Dý_©Ü\u001eÆ\u0095ª¹{ w\u009dºàÿÂ\u0092\u000fRãÈë\u0091k\u0005b]÷5\"$¡\u009a:²\u0091tyÇÏA÷84¼â°T\u001c&z\u007f\u0002³\u009b¿¢\u0005,L6æ%\u0086\u0095¬æf\u000b\u0085ù\rB2¨º»\u00020á\u007f~¿PÌ~\u0018Iv\u0097Ç0ÈÖ¬ÔW\u0090 H=Åk£éF¡\u000eÄ\u008c\u0081\\\u0084\u009e®8?\u0085¸\u00948ô°;ðW\u009e\"\fg\u001a\u009e\u0012^óÍ\u009e\u0092`\u008a:\u0091\u0000Õ\u0017¡\u0095¹û\u0092àKbmAð\u0081:C(Èý\u0080\u009d\u0085²jz.ã\u0001Ë(\u0097ï£\t¡d\u0093G¸\u0095ö4gý\u0018\u0090\u0080Âð \u0002F]O\u009dµg\u0006ã|\u008b\u008cÎ:÷%.\u0007Û\u0012\u0010 5\u0088\u0010õ$w\u0001K\b3\u0089Õ\u008b@k8\u0015\u0092^,w\u0002\u0094QYV9IÚ\u001f\r\u0083vÅ\u0084AÝ:\u00922Ó\u0082\u0093Û\u001f\u0098îë2\u00192Â®\u0097&EìÙ¦\u0090Zíhþ\u009a²\u0010\u001cÐ\u008bQy0½nâí)e.Ó)w\u0005»\"Ð¹ Ò$YPßn7\u0083ýñj\u009aYðP\\\u0082\u001fS\u0004Vz\u009eÛz¤g\u000e\u008a\u0097¿«(Õ]þ\u0098@\u0019W¼\u0012%S\u0085ev;:ùðåÊm\u000e\u0010\u008e÷\u0091\u000bÕãL7ÖÙ\u0081\u0011\u0019ò\u0096Ð\r(ÌÎ?\u0093RõÔ\u0011z7\u0017{gÙ\u0096\u0013\u0081¤\u008c\u0082\u009f+TÎ\u001aó\u0006kª\u0086!\u0096µ; õ:\u0096ú\u007fXæº)\u0096a{ÏÀ²µkfjx</\u0094z\u0087WTì#Z\u007f\u0015\u000eß\u0019NW\u0091ç\u0087î\u0082ü\u009eÀE¹\u0087ÚG\u007fÐ~\u00adX\u009bkn\u009fÿ0o\u0014\u008f\u0092ÍÛø$jJ\u00adûËâü\u0012w]9,\u0093Üy\u000eû\u0094\u000f<\u001c-¼\u0083Ü\u0018óyÿ\u001a\t\u0096\b|NîHí®¥LïMÂ\u009c\u000ex^d\u00860D<\u008d!©\u0097ùa\u00135%è§V¼¯`Ð»U\u000f\u00ady2ÌÓòiì0Lõ92\u0091=>çã\u0096°\u0012È\u0088¢>ôt88\u001eP\u0013Ù\"¼z\u0019¨ÉõÝ\nòî\u0004óÑ\u0006©}®2¢·\u0002ÐNæª8>O0rºmë³j\u009f\u0086'L@]\u007frY.o\u0082\u0090\u0002SHÑ%ìø\u0089ÿ\u0003Ý\u009c\u009a\u001fQQjFg´wýþÌèGà7\u0010\rOô\u008c¾e.N\u009f£ª\u0090½q\u0084\\\u0019\u0092ìÆ\u00ad\\2Ã÷\\QYM¶pE4¼\u0018^\u001f¸6'D,@£ÌhPi1\u0002vçYê4\u000e½Ë\u0096\u0006qùz¯Ü\u009c?ØÄz_Ì\u0002úÞ£Î4\u0019V=\u00adSüÆ\u0083ÇHDa\u009dDÃö\u009fº*0èæÞÝ²ØF\u0003üoÄ,¥ê\u009aÀ\u009b'm(Ââ×\u0090SÂC3h8P±Âc<Å|:Q\u0092\u008e7\u0011/°\u0097Ï'±ß¥»ñ!\u0083=¨ÞKà\u008bYk¡q6\u0099@\u008bæ?\u0006õ.»O{»Ì§q,OR\u001f?Pv¼ËM\u00864¯Si*\u0080»\u0080xE\u0086ã\u0081d¤Ìý\u0084ÞG£(\u0084Ðºn\u008eùûîº\u0015Ô\u0087¨Ö\u008b\u008a\b|\u0090\u00951\u001cL\u0094?!i\u0019@\u0087Z\u00884×¹E^\u0003ÏïyË\u0093Ñî&hJd}¹tâ@´j^g.r\u000f\u000b£kcL½H3fY\u0098é?\u001fÍK*úDÎÝZò½µPÔ%ÿéïH\u0015\"´P·\u001d\u0087L;Jªù!Î:\u0003y[ÅJm+öÓ\u0089(Fã·í¸\u0007½\u001d<¿û\\\u0093Øy\u000béÁ\bÁX~ü<ømLw\u001d,j{5óâì;hý°@e\u0096\u008aITÕ\u0019õ=Õw\u001a\u000e\u0087\u0007F\u0001UM°Î¾Á\u000bA\u0014¿Gsö&ö©\u009e\u0005\u0014\u0018¼Ûë3¢\u009d\u0080_nÚL'-Ð\u001cÆß§©W$Ë\u008c(¯\r=(\u0007é\u0098\u0004\u0083\u0002é-\u0018ae0\u0006mÕ\u001d\tz¶êâ\u00196ò\u001eßÂ\"XÁ\u0088»Hî\u009c³öG¯\u0082 ¢íãc\u0011Yü,3âUÕ{\u000b})\u001d)\u0097Â\u0095â\u001c\u0098U\u0081×&Ùý\u001dÁ8ÝCÈ\u0084k\b$,\u0090?ú¼Ó!_CZ çæ\u000fÛVBàí¦§7SxÂY\u0092¬Pè.\u001b\u0094\u0098\u0081pk\u0084\u009c+þ/b¡N~\u00ad=¦\u0018®n1.´7ÃÐnB*µªe¤d¾©6j\u008f\fümHã\\r\u0004ó\u009e\u0098J]á(×  Y³w½ëì\u001d¾'¨æ\u0091\\ä¢Ë\u0018\u007f\u0018åR\u0093ò\u009a\u0004\\T!®7Ã [\\i\u0018\u0010v=\u0007_Fõ\u000b[)kcOF\u008a\u0002~ZÙ\u008b\u0085\u0016(\u001e-À\u0013E\u0091\u00158í<p%º®ß®\u0012î\u0006/ÀU+?ÄÆ¯'ûÍM\u007f$s,Xc\fj¶\u0018/¼,1'p÷\u0096Û`h\u0007\u001e\u0014©\u008fêó4°\u0010I±\u000e".length();
        char cCharAt = '@';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 >= length) {
                            d = strArr;
                            f = new String[69];
                            R = new b6();
                            x = new ArrayList();
                            RenderPipeline.Snippet snippetBuildSnippet = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(151, 8449768719259643076L ^ j2) /* invoke-custom */, class_10789.field_60031).buildSnippet();
                            Intrinsics.checkNotNullExpressionValue(snippetBuildSnippet, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30661, 8637671184316455914L ^ j2) /* invoke-custom */);
                            J = snippetBuildSnippet;
                            b6 b6Var = R;
                            RenderPipeline renderPipelineBuild = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10956, 4760586857011906224L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19618, 1019524537211019487L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15765, 6707256447255515595L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29050, 8697985635158940973L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3676, 3481984475596595725L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17366, 8988154329098907550L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14777, 3254746164863768031L ^ j2) /* invoke-custom */);
                            I = b6Var.M(renderPipelineBuild);
                            b6 b6Var2 = R;
                            RenderPipeline renderPipelineBuild2 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22992, 7176537638504101250L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15109, 2714083305561134928L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild2, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            V = b6Var2.M(renderPipelineBuild2);
                            b6 b6Var3 = R;
                            RenderPipeline renderPipelineBuild3 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21437, 4393357100740018122L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29194, 1441263827612229217L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild3, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            c = b6Var3.M(renderPipelineBuild3);
                            b6 b6Var4 = R;
                            RenderPipeline renderPipelineBuild4 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4506, 5215719576000413156L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20972, 7141747733878898092L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12889, 5152239672123006581L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild4, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            Y = b6Var4.M(renderPipelineBuild4);
                            b6 b6Var5 = R;
                            RenderPipeline renderPipelineBuild5 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26956, 5598905834948248872L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15883, 4627719316203934334L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30302, 4444106152842910271L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild5, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            W = b6Var5.M(renderPipelineBuild5);
                            b6 b6Var6 = R;
                            RenderPipeline renderPipelineBuild6 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12947, 4096359599411437241L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1986, 3372592550217329549L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17773, 7718992393827182889L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild6, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            H = b6Var6.M(renderPipelineBuild6);
                            b6 b6Var7 = R;
                            RenderPipeline renderPipelineBuild7 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18255, 1257729040333335306L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17972, 3839859582025656903L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14937, 4413309748577605123L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild7, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            z = b6Var7.M(renderPipelineBuild7);
                            b6 b6Var8 = R;
                            RenderPipeline renderPipelineBuild8 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5649, 9109064770555329089L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30448, 8330197456686701202L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild8, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            l = b6Var8.M(renderPipelineBuild8);
                            b6 b6Var9 = R;
                            RenderPipeline renderPipelineBuild9 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11785, 6428253350168199792L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19761, 3447142543524716892L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26424, 7064013527553657701L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild9, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            y = b6Var9.M(renderPipelineBuild9);
                            b6 b6Var10 = R;
                            RenderPipeline renderPipelineBuild10 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3027, 1983658236671371187L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1592, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23529, 5759191272825976711L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24847, 6736417964433821053L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild10, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            T = b6Var10.M(renderPipelineBuild10);
                            b6 b6Var11 = R;
                            RenderPipeline renderPipelineBuild11 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(36, 3127429276335516773L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2728, 8509518799077254873L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12338, 2601183898043358280L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild11, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            u = b6Var11.M(renderPipelineBuild11);
                            b6 b6Var12 = R;
                            RenderPipeline renderPipelineBuild12 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23250, 5905992194578183835L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26420, 7656531511472868211L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32104, 6134216735757291811L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(true).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild12, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            Z = b6Var12.M(renderPipelineBuild12);
                            b6 b6Var13 = R;
                            RenderPipeline renderPipelineBuild13 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7511, 7558300022079402243L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10286, 141755423737119863L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7125, 5321405868789413797L ^ j2) /* invoke-custom */, j3)).withUniform((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15172, 2530418300277593865L ^ j2) /* invoke-custom */, class_10789.field_60031).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild13, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            w = b6Var13.M(renderPipelineBuild13);
                            b6 b6Var14 = R;
                            RenderPipeline renderPipelineBuild14 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13175, 7695345790212415322L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5592, 6544635000783845809L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6429, 2114904187244885355L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild14, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            a = b6Var14.M(renderPipelineBuild14);
                            b6 b6Var15 = R;
                            RenderPipeline renderPipelineBuild15 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24529, 7582885331497776018L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild15, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            m = b6Var15.M(renderPipelineBuild15);
                            b6 b6Var16 = R;
                            RenderPipeline renderPipelineBuild16 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13720, 991148489611319747L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(true).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild16, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            P = b6Var16.M(renderPipelineBuild16);
                            b6 b6Var17 = R;
                            RenderPipeline renderPipelineBuild17 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10255, 1163014590323655749L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.LESS_DEPTH_TEST).withDepthWrite(true).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild17, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            q = b6Var17.M(renderPipelineBuild17);
                            b6 b6Var18 = R;
                            RenderPipeline renderPipelineBuild18 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10361, 336754288306029655L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.LIGHTNING).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild18, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            A = b6Var18.M(renderPipelineBuild18);
                            b6 b6Var19 = R;
                            RenderPipeline renderPipelineBuild19 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14918, 8070947567347668505L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.LIGHTNING).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild19, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            S = b6Var19.M(renderPipelineBuild19);
                            b6 b6Var20 = R;
                            RenderPipeline renderPipelineBuild20 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8655, 8750766425860214188L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1575, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25423, 5249125561616879400L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13307, 2786613247585886115L ^ j2) /* invoke-custom */, j3)).withSampler((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22646, 6128646486136976432L ^ j2) /* invoke-custom */).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(new BlendFunction(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO)).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild20, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            t = b6Var20.M(renderPipelineBuild20);
                            b6 b6Var21 = R;
                            RenderPipeline renderPipelineBuild21 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4130, 480130289568562292L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15116, 5152677655287371635L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29368, 1186998967319322356L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.LESS_DEPTH_TEST).withDepthWrite(true).withBlend(BlendFunction.LIGHTNING).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild21, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            j = b6Var21.M(renderPipelineBuild21);
                            b6 b6Var22 = R;
                            RenderPipeline renderPipelineBuild22 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13048, 8076202153680739991L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4469, 8740782676457602335L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 8271652735463215142L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild22, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            B = b6Var22.M(renderPipelineBuild22);
                            b6 b6Var23 = R;
                            RenderPipeline renderPipelineBuild23 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22281, 1832732132238228325L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4469, 8740782676457602335L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 8271652735463215142L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.LESS_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild23, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            i = b6Var23.M(renderPipelineBuild23);
                            b6 b6Var24 = R;
                            RenderPipeline renderPipelineBuild24 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17478, 8093102314493569070L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_27379).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4469, 8740782676457602335L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 8271652735463215142L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withoutBlend().withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild24, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            D = b6Var24.M(renderPipelineBuild24);
                            b6 b6Var25 = R;
                            RenderPipeline renderPipelineBuild25 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29417, 1214106849897275037L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_29344).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4469, 8740782676457602335L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 8271652735463215142L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild25, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            C = b6Var25.M(renderPipelineBuild25);
                            b6 b6Var26 = R;
                            RenderPipeline renderPipelineBuild26 = RenderPipeline.builder(new RenderPipeline.Snippet[]{J}).withLocation(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20392, 6084536341808866259L ^ j2) /* invoke-custom */, j3)).withVertexFormat(class_290.field_1576, VertexFormat.class_5596.field_29344).withVertexShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4469, 8740782676457602335L ^ j2) /* invoke-custom */, j3)).withFragmentShader(l6.J((String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3657, 6703662092376809995L ^ j2) /* invoke-custom */, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 8271652735463215142L ^ j2) /* invoke-custom */, j3)).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false).withBlend(BlendFunction.LIGHTNING).withCull(false).build();
                            Intrinsics.checkNotNullExpressionValue(renderPipelineBuild26, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4822, 6825368129003208366L ^ j2) /* invoke-custom */);
                            e = b6Var26.M(renderPipelineBuild26);
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
                        str = "æáÁâ%\u001dËðh\u001d»\u0092}ù\u00adu)uôúê\u0092Ï\u001dx,|WWí.t·²ÙM\u0097o/îsu\u00ad(¡\bP\u008d\u0090õ\u0084=¬\u0091\u008a\u001c0_ç£\u0081b_\u0098Ìîkz;þã!\tzørL\u0016\u0097\\Ú\u0018qØÃ\n\u008bn}7\u009el®\u0011Ù¦à\u0093|\u008d)\u0010\u008bF\u009b";
                        length = "æáÁâ%\u001dËðh\u001d»\u0092}ù\u00adu)uôúê\u0092Ï\u001dx,|WWí.t·²ÙM\u0097o/îsu\u00ad(¡\bP\u008d\u0090õ\u0084=¬\u0091\u008a\u001c0_ç£\u0081b_\u0098Ìîkz;þã!\tzørL\u0016\u0097\\Ú\u0018qØÃ\n\u008bn}7\u009el®\u0011Ù¦à\u0093|\u008d)\u0010\u008bF\u009b".length();
                        cCharAt = '8';
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

    public static void M(String[] strArr) {
        Q = strArr;
    }

    public static String[] l() {
        return Q;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static String a(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 5854;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = a(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/b6", e2);
            }
        }
        return f[i3];
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/b6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.b6.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
