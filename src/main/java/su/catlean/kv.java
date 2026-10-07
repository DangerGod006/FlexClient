package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kv.class */
public final class kv extends _g {

    @NotNull
    public static final kv K;
    static final KProperty[] l;

    @NotNull
    private static final cw G;

    @NotNull
    private static final cq C;

    @NotNull
    private static final cq g;

    @NotNull
    private static final cs j;

    @NotNull
    private static final cq Y;
    private static float S;

    @NotNull
    private static fd i;

    @NotNull
    private static fd L;
    private static final long a = yz.a(-3758588209181816700L, -6937648329684696947L, MethodHandles.lookup().lookupClass()).a(265804390775478L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private kv(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21713, 4775167907988611657L ^ j3) /* invoke-custom */, jt.z(), null, 4, null, j3 ^ 138351437911970L);
    }

    @NotNull
    public final sj T(long j2) {
        return (sj) G.E(this, (a ^ j2) ^ 6302305502454L, l[0]);
    }

    private final boolean g(long j2) {
        return ((Boolean) C.E(this, (a ^ j2) ^ 4810010473949L, l[1])).booleanValue();
    }

    private final boolean a(int i2, char c2, short s) {
        return ((Boolean) g.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 82275954761155L, l[2])).booleanValue();
    }

    private final Color I(long j2) {
        return (Color) j.E(this, (a ^ j2) ^ 122736322472963L, l[3]);
    }

    private final boolean Z(long j2) {
        return ((Boolean) Y.E(this, (a ^ j2) ^ 19131401456541L, l[4])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0164: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    public final void e(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.render.Render2DEvent r11) {
        /*
            Method dump skipped, instruction units count: 1163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kv.e(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, org.joml.Matrix4f] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void L(int a2, int a3, @NotNull class_4587 matrices, float x, byte a4, float y, float size, @NotNull Color color) throws Throwable {
        long j2 = (((((long) a2) << 32) | ((((long) a3) << 40) >>> 32)) | ((((long) a4) << 56) >>> 56)) ^ a;
        long j3 = j2 ^ 134766337387867L;
        long j4 = j2 ^ 70822950114837L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(884504647741160890L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(matrices, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8949, 7396387562898660874L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14445, 3570928038631113872L ^ j2) /* invoke-custom */);
        Object objMethod_23761 = matrices.method_23760().method_23761();
        Intrinsics.checkNotNullExpressionValue(objMethod_23761, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30942, 8045163065952355368L ^ j2) /* invoke-custom */);
        try {
            jl.y.D(objMethod_23761, n1.o(), x, y, size, size, color, color, color, color, true, T(j4).e().o(), T(j4).e().v(), T(j4).e().L(), j3, T(j4).e().w());
            if (i2 != 0) {
                objMethod_23761 = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_23761, 877224977503421969L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_23761, 1001453862294590019L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, net.minecraft.class_742] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.minecraft.class_268] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean.sj] */
    @Flow
    public final void P(@NotNull Render3DEvent e2) {
        long j2 = a ^ 115160037065566L;
        long j3 = j2 ^ 71499364814331L;
        long j4 = j2 ^ 62784228066503L;
        long j5 = j2 ^ 26879563778255L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 32);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 79013189591897L;
        long j7 = j2 ^ 20175436223327L;
        long j8 = j2 ^ 109632154959226L;
        long j9 = j2 ^ 23631702628727L;
        long j10 = j2 ^ 106525315292543L;
        long j11 = j2 ^ 50333414951852L;
        long j12 = j2 ^ 107351491986397L;
        ?? T = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1296766095169036291L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            T = T(j11);
            if (T != sj.LINES) {
                return;
            }
            Iterator it = zf.z(j8).method_18456().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ?? r0 = zHasNext;
                if (zHasNext) {
                    ?? AreEqual = (class_742) it.next();
                    try {
                        AreEqual = Intrinsics.areEqual((Object) AreEqual, zf.v(j12));
                        if (AreEqual == 0 || T != 0) {
                            zi ziVar = zi.v;
                            Intrinsics.checkNotNull(AreEqual);
                            class_238 class_238VarS = ziVar.S((class_1297) AreEqual, j9);
                            ?? Method_1019 = new class_243(0.0d, 0.0d, 75.0d).method_1037(-((float) Math.toRadians(zf.F(j3).field_1773.method_19418().method_19329()))).method_1024(-((float) Math.toRadians(zf.F(j3).field_1773.method_19418().method_19330()))).method_1019(zf.F(j3).field_1773.method_19418().method_71156());
                            Intrinsics.checkNotNullExpressionValue(Method_1019, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22448, 8803533369935230718L ^ j2) /* invoke-custom */);
                            try {
                                Method_1019 = zv.a((class_1657) AreEqual, j10);
                                Color colorI = Method_1019 != 0 ? I(j6) : jh.f.Z(j7, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18936, 8941211034496436579L ^ j2) /* invoke-custom */);
                                ?? Method_5781 = T;
                                if (Method_5781 == 0) {
                                    try {
                                        try {
                                            Method_5781 = AreEqual.method_5781();
                                            if (Method_5781 != 0) {
                                                try {
                                                    boolean Z = Z(j4);
                                                    if (T == 0) {
                                                        if (Z) {
                                                            colorI = new Color(AreEqual.method_22861());
                                                        }
                                                    }
                                                } catch (NumberFormatException unused) {
                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_5781, 1178972601638850554L, j2) /* invoke-custom */;
                                                }
                                            }
                                            class_243 class_243VarMethod_1005 = class_238VarS.method_1005();
                                            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1005, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12438, 280298392205398485L ^ j2) /* invoke-custom */);
                                            zi.L(zi.v, (short) i2, Method_1019, class_243VarMethod_1005, colorI, null, true, i3, (char) i4, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17693, 6132778516238009732L ^ j2) /* invoke-custom */, null);
                                        } catch (NumberFormatException unused2) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_5781, 1178972601638850554L, j2) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        Method_5781 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_5781, 1178972601638850554L, j2) /* invoke-custom */;
                                        throw Method_5781;
                                    }
                                }
                                ?? r02 = T;
                                r0 = r02;
                                if (r02 == 0) {
                                }
                            } catch (NumberFormatException unused4) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1019, 1178972601638850554L, j2) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused5) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 1178972601638850554L, j2) /* invoke-custom */;
                    }
                }
                try {
                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1289098687533158258L, j2) /* invoke-custom */ != null) {
                        r0 = T + 1;
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1296143582988290026L, j2) /* invoke-custom */;
                        return;
                    }
                    return;
                } catch (NumberFormatException unused6) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1178972601638850554L, j2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused7) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 1178972601638850554L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v15, types: [float] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [float] */
    private final float c(float f2, float f3, float f4, long j2) {
        ?? r0;
        ?? D = a ^ j2;
        try {
            if (nk.f.D() > 5) {
                D = 1.0f / nk.f.D();
                r0 = D;
            } else {
                r0 = 1015222895;
            }
            float fClamp = Math.clamp(r0 * f4, 0.0f, 1.0f);
            return ((1.0f - fClamp) * f2) + (fClamp * f3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(D, 1813731253809710733L, D) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 33993758539278L;
        long j3 = j2 ^ 18033674726192L;
        long j4 = j2 ^ 88287787240998L;
        int i3 = (int) (j2 >>> 48);
        long j5 = ((j2 ^ 108034946228645L) << 16) >>> 16;
        long j6 = j2 ^ 72618377558389L;
        long j7 = j2 ^ 89178360222084L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i5 = 0;
        String str = "ïEGù´\t$~U\u0081£[\u0002§¶W\u0010ê\u0093åb\u001cÜ`¼ý\n\u008cg\u0099·'\u0093\u00189(»HQ¼èÑ.wdÂ\u001dï\u0090\u000b\u0092è\u001dqâO\u000exH»@´¢@\u0080;Õ_P\u0093\u001eÃ\u0085\u0085©zë¥vpÚ¶ËðÊïÇ\u0080Ù:V)Xè¢Q¦4éY\u0013g£4\u0096u¶Ô® D£üE\u0093lÉðÃ\u000f\u0096\"wAÍ¢\u009b¢«¿¡\u0010:Ï®}§\u0015Ôê\u0081ú\r\u009cº\u0001ñM\u0010£\u0080\u009e2µ\u001dfI\\\béèÅ\u001f\u0087\u0011\u0010¨ÆR\u009b §5À`ª\u0016kL\u0017hR {Çyf\\\u0011PYÿ©óIÐ©Ó#c§»í&Ü\u0019û\u00979l\u0084\fìD) ¡§Ïd\u0015L\u0013Aþ(bR«VËÄ\u007f\u0014ñ\u0007/ò-\rÂ\u000b\u0006\u008fÃýDº Ù\u0093\u0099[\u001e¼=I\u0081¶[Õ\u008b%h3,a!Î¬\u008aXü¶;V\u0003ø\u0011F± \"RV \u0011Y}\u0088\u0098\u0005\\\u009b#Àuìò½E¡¡\u0084 Wúd\u0092\u0084íá3\u001f\u0018,W\n·ß\\Ôâ^Qß|\u00922% \u009c!ÂÈÃ\u009bÅx AÂ¡ÿñ?8ß\u0003\u0098&i¶ãBÙÿàÁf_p¤\"@\u0087»°Ê|\u009fº\u0018\u0095#Ö\ne\u009c\n\u009bÏ:D+\u0003\u0003\r\u0090¨þç\u0092ît\u00ad0\u0010õC%Òí`Ûô\u009cïx©\u0092\u0096Á\u00830Ý[³Ãbª^#J|fj+«\u0005h=\u00919-\n«\r4·\u0003ÑÜ:\u009fÔF\u0003Óò(àM\u001e'¡Z\u0000ÞrÓ\u00ad, vó\u0014È\u0086R\u009f\u000e\u0088\u008e\u000e¡\u0007þAôª¥±`¹õ´,©ÒmSt`$\u009d\u0010âe£m;ÿô½1zå{N Ñ_ \u001dyçÄ/@G(\u0096Ý\u008c§\u0080\"\u0019v\u0001O\u008fDJ°^\u0081\u0001Ù¡i\u0094Ë}\u0000(\f\u00997 \u0081\u0005\u009d\b\u009a\u009b#Aüï\u0095\u009e7?¤½âôéý¨n<ù¸R½\u0000ã\u0085\u000e\fO:£*";
        int length = "ïEGù´\t$~U\u0081£[\u0002§¶W\u0010ê\u0093åb\u001cÜ`¼ý\n\u008cg\u0099·'\u0093\u00189(»HQ¼èÑ.wdÂ\u001dï\u0090\u000b\u0092è\u001dqâO\u000exH»@´¢@\u0080;Õ_P\u0093\u001eÃ\u0085\u0085©zë¥vpÚ¶ËðÊïÇ\u0080Ù:V)Xè¢Q¦4éY\u0013g£4\u0096u¶Ô® D£üE\u0093lÉðÃ\u000f\u0096\"wAÍ¢\u009b¢«¿¡\u0010:Ï®}§\u0015Ôê\u0081ú\r\u009cº\u0001ñM\u0010£\u0080\u009e2µ\u001dfI\\\béèÅ\u001f\u0087\u0011\u0010¨ÆR\u009b §5À`ª\u0016kL\u0017hR {Çyf\\\u0011PYÿ©óIÐ©Ó#c§»í&Ü\u0019û\u00979l\u0084\fìD) ¡§Ïd\u0015L\u0013Aþ(bR«VËÄ\u007f\u0014ñ\u0007/ò-\rÂ\u000b\u0006\u008fÃýDº Ù\u0093\u0099[\u001e¼=I\u0081¶[Õ\u008b%h3,a!Î¬\u008aXü¶;V\u0003ø\u0011F± \"RV \u0011Y}\u0088\u0098\u0005\\\u009b#Àuìò½E¡¡\u0084 Wúd\u0092\u0084íá3\u001f\u0018,W\n·ß\\Ôâ^Qß|\u00922% \u009c!ÂÈÃ\u009bÅx AÂ¡ÿñ?8ß\u0003\u0098&i¶ãBÙÿàÁf_p¤\"@\u0087»°Ê|\u009fº\u0018\u0095#Ö\ne\u009c\n\u009bÏ:D+\u0003\u0003\r\u0090¨þç\u0092ît\u00ad0\u0010õC%Òí`Ûô\u009cïx©\u0092\u0096Á\u00830Ý[³Ãbª^#J|fj+«\u0005h=\u00919-\n«\r4·\u0003ÑÜ:\u009fÔF\u0003Óò(àM\u001e'¡Z\u0000ÞrÓ\u00ad, vó\u0014È\u0086R\u009f\u000e\u0088\u008e\u000e¡\u0007þAôª¥±`¹õ´,©ÒmSt`$\u009d\u0010âe£m;ÿô½1zå{N Ñ_ \u001dyçÄ/@G(\u0096Ý\u008c§\u0080\"\u0019v\u0001O\u008fDJ°^\u0081\u0001Ù¡i\u0094Ë}\u0000(\f\u00997 \u0081\u0005\u009d\b\u009a\u009b#Aüï\u0095\u009e7?¤½âôéý¨n<ù¸R½\u0000ã\u0085\u000e\fO:£*".length();
        char cCharAt = 16;
        int i6 = -1;
        while (true) {
            int i7 = i6 + 1;
            String strSubstring = str.substring(i7, i7 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i8 = i5;
                        i5++;
                        strArr[i8] = strIntern;
                        int i9 = i7 + cCharAt;
                        i2 = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[22];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j2 << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i11 = 0;
                            String str3 = "\u00954|X8\u009dß\u0099\t±«rº\u001dÁ5,ð8ò¹,ì²¦ª\u0011ÿ2 !7";
                            int length2 = "\u00954|X8\u009dß\u0099\t±«rº\u001dÁ5,ð8ò¹,ì²¦ª\u0011ÿ2 !7".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i12 >= length2) {
                                                e = jArr;
                                                f = new Integer[6];
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j2 >>> 56);
                                                for (int i16 = 1; i16 < 8; i16++) {
                                                    bArr3[i16] = (byte) ((j2 << (i16 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[2];
                                                int i17 = 0;
                                                int length3 = "<½\u000eCãÿì\u0014<½\u000eCãÿì\u0014".length();
                                                int i18 = 0;
                                                do {
                                                    int i19 = i18;
                                                    i18 += 8;
                                                    byte[] bytes2 = "<½\u000eCãÿì\u0014<½\u000eCãÿì\u0014".substring(i19, i18).getBytes("ISO-8859-1");
                                                    i17++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i18 < length3);
                                                l = new KProperty[]{Reflection.property1(new PropertyReference1Impl(kv.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31242, 958839599716247067L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22896, 6551996817358062955L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kv.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9313, 1153766046123718772L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25967, 2119950527475726711L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kv.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9385, 939097306743568557L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18582, 1291271618072056977L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kv.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8153, 6217198835576030175L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4354, 8739435246574226709L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kv.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20053, 1668564071457788492L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18688, 1127122599262164252L ^ j2) /* invoke-custom */, 0))};
                                                K = new kv(j6);
                                                G = yp.L(K, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10375, 7426496909683324053L ^ j2) /* invoke-custom */, sj.ARROWS_1, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12219, 3215074507085845105L ^ j2) /* invoke-custom */, null, j7);
                                                C = yp.t(K, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7411, 5008389903487058147L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6308, 2632935190085739883L ^ j2) /* invoke-custom */, null);
                                                g = yp.t(K, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15322, 5306948929065183175L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6308, 2632935190085739883L ^ j2) /* invoke-custom */, null);
                                                kv kvVar = K;
                                                short s = (short) i3;
                                                String strJ = (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2274, 5953083468842063079L ^ j2) /* invoke-custom */;
                                                Color color = Color.GREEN;
                                                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24360, 5644724285194765106L ^ j2) /* invoke-custom */);
                                                j = yp.b(kvVar, s, strJ, color, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6308, 2632935190085739883L ^ j2) /* invoke-custom */, null, j5);
                                                Y = yp.t(K, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27957, 8446612958355468597L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6308, 2632935190085739883L ^ j2) /* invoke-custom */, null);
                                                i = new fd(_s.OUT_QUINT, jArr3[1], j4);
                                                L = new fd(_s.OUT_QUINT, jArr3[0], j4);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i12 >= length2) {
                                                str3 = "6O¼9³¸\u008bW%3)7n\u0018àþ";
                                                length2 = "6O¼9³¸\u008bW%3)7n\u0018àþ".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i20 = i12;
                                    i12 += 8;
                                    byte[] bytes3 = str3.substring(i20, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j8 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i21 = i5;
                        i5++;
                        strArr[i21] = strIntern;
                        int i22 = i7 + cCharAt;
                        i6 = i22;
                        if (i22 < length) {
                        }
                        str = "\u008bm\u0087«¡¸À©\u0082ê\u0091\u001b¿O\u0017o:~\u009f\n\u009c\u0018m\u0002)²-$%Yè\u000e\u0010\u009f\u0096\u001dKrÕìÿÝJ(õ\fs\u009c\u0016";
                        length = "\u008bm\u0087«¡¸À©\u0082ê\u0091\u001b¿O\u0017o:~\u009f\n\u009c\u0018m\u0002)²-$%Yè\u000e\u0010\u009f\u0096\u001dKrÕìÿÝJ(õ\fs\u009c\u0016".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i7 = i2 + 1;
                strSubstring = str.substring(i7, i7 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i6);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 12790;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kv", e2);
            }
        }
        return c[i3];
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
            r1 = 44
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
            java.lang.String r0 = "su/catlean/kv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kv.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 20520;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kv", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 44
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
            java.lang.String r0 = "su/catlean/kv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kv.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
