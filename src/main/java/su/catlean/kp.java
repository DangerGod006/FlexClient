package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10691;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2673;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kp.class */
public final class kp extends _g {

    @NotNull
    public static final kp G;

    @NotNull
    private static final List A;
    private static int Y;
    private static final long a = yz.a(1935642746144268048L, 7250887553497893412L, MethodHandles.lookup().lookupClass()).a(133675555345181L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private kp(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30777, 6269690347546151704L ^ j2) /* invoke-custom */, jt.F(), null, 4, null, j2 ^ 12190063978904L);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0314: MOVE_MULTI in method: su.catlean.kp.w(su.catlean.api.event.events.render.Render3DEvent):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kp.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0314: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[15]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @su.catlean.gofra.Flow
    private final void w(su.catlean.api.event.events.render.Render3DEvent r1) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kp.w(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    @Flow
    private final void j(TickEvent tickEvent) {
        List list = A;
        Function1 function1 = kp::m;
        list.removeIf((v1) -> {
            return D(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.awt.Color] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    @Flow
    private final void m(ReceivePacket receivePacket) {
        long j = a ^ 47593621114420L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1132329731242479037L, j) /* invoke-custom */;
        try {
            try {
                r0 = receivePacket.getPacket() instanceof class_2673;
                ?? Method_11534 = r0;
                if (r0 != 0) {
                    if (r0 == 0) {
                        return;
                    } else {
                        Method_11534 = receivePacket.getPacket().method_11532();
                    }
                }
                try {
                    try {
                        if (r0 != 0) {
                            try {
                                try {
                                    if (Method_11534 != (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16993, 6881766232239930240L ^ j) /* invoke-custom */) {
                                        Method_11534 = receivePacket.getPacket().method_11532();
                                        if (r0 != 0) {
                                            if (Method_11534 != (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(846, 7544621928158411438L ^ j) /* invoke-custom */) {
                                                return;
                                            } else {
                                                Method_11534 = receivePacket.getPacket().method_11534();
                                            }
                                        }
                                    } else {
                                        Method_11534 = receivePacket.getPacket().method_11534();
                                    }
                                } catch (NumberFormatException unused) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11534, -1087724916450116526L, j) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused2) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11534, -1087724916450116526L, j) /* invoke-custom */;
                            }
                        }
                        ?? r12 = Method_11534;
                        ?? color = new Color((((r12 == true ? 1 : 0) >> (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11583, 4850998509001381077L ^ j) /* invoke-custom */) & (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25724, 4863345789000113554L ^ j) /* invoke-custom */) / 255.0f, (((r12 == true ? 1 : 0) >> (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4035, 7181724671737574958L ^ j) /* invoke-custom */) & (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(120, 120663448924109207L ^ j) /* invoke-custom */) / 255.0f, (((r12 == true ? 1 : 0) >> 0) & (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(120, 120663448924109207L ^ j) /* invoke-custom */) / 255.0f);
                        try {
                            try {
                                color = color.getRGB();
                                ?? rgb = color;
                                if (r0 != 0) {
                                    if (color == (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30074, 4196913941606616223L ^ j) /* invoke-custom */) {
                                        return;
                                    } else {
                                        rgb = color.getRGB();
                                    }
                                }
                                Y = rgb;
                            } catch (NumberFormatException unused3) {
                                color = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(color, -1087724916450116526L, j) /* invoke-custom */;
                                throw color;
                            }
                        } catch (NumberFormatException unused4) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(color, -1087724916450116526L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused5) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11534, -1087724916450116526L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused6) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_11534, -1087724916450116526L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused7) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1087724916450116526L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused8) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1087724916450116526L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Flow
    private final void P(EntityRemove entityRemove) {
        long j = a ^ 62127086857363L;
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 82241758003424L) << 8) >>> 8;
        long j3 = j ^ 124725371767640L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3247592501468622620L, j) /* invoke-custom */;
        try {
            try {
                class_1297 entity = entityRemove.getEntity();
                if (obj != 0) {
                    obj = entity instanceof class_10691;
                    if (obj == 0) {
                        return;
                    }
                    entity = entityRemove.getEntity();
                    Intrinsics.checkNotNull(entity, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32644, 3684419553303225957L ^ j) /* invoke-custom */);
                }
                class_2338 class_2338VarMethod_49638 = class_2338.method_49638(J((byte) i, j2, (class_1297) ((class_10691) entity)));
                Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49638, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11279, 6726354388218197477L ^ j) /* invoke-custom */);
                List list = A;
                class_243 class_243VarMethod_1031 = class_2338VarMethod_49638.method_46558().method_1031(0.0d, -0.5d, 0.0d);
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12814, 7802149851465296866L ^ j) /* invoke-custom */);
                list.add(new w_(class_243VarMethod_1031, Y, 0, 4, null, j3));
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3296480738920751371L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3296480738920751371L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    private static final boolean m(w_ w_Var) {
        ?? Y2;
        long j = a ^ 100982366599264L;
        long j2 = j ^ 131039734958086L;
        long j3 = j ^ 77552905960056L;
        long j4 = j ^ 127501667706119L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j4 << 16) >>> 32);
        int i3 = (int) ((j4 << 48) >>> 48);
        ?? J = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5052291686615090199L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(w_Var, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15929, 7530183841265267496L ^ j) /* invoke-custom */);
        try {
            J = w_Var.J();
            ?? J2 = J;
            if (J == 0) {
                Y2 = J2;
                w_Var.a((Y2 == true ? 1 : 0) + 1);
            } else {
                if (J == 3) {
                    Y2 = (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2792, 8179692628637484376L ^ j) /* invoke-custom */;
                    int i4 = 0;
                    while (i4 < Y2) {
                        ?? r0 = 0;
                        try {
                            dh dhVar = dh.S;
                            gi giVar = gi.FIREFLY;
                            class_243 class_243VarMethod_1031 = w_Var.R().method_1031(mf.a(j2, -3.0d, 3.0d, false, 4, null), 0.0d, mf.a(j2, -3.0d, 3.0d, false, 4, null));
                            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18652, 5325465194643441103L ^ j) /* invoke-custom */);
                            dhVar.a(new bk(giVar, class_243VarMethod_1031, 0.0f, j3, 0.25f, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22755, 5973666219128674133L ^ j) /* invoke-custom */, new class_243((Math.random() / ((double) 2.0f)) - ((double) 0.25f), Math.random() / ((double) 4.0f), (Math.random() / ((double) 2.0f)) - ((double) 0.25f)), new Color(w_Var.m()), 0.0f, 0.0f, false, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22955, 3496378699357017620L ^ j) /* invoke-custom */, null));
                            i4++;
                            r0 = J;
                            if (r0 == 0) {
                                break;
                            }
                            if (J == 0) {
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5094678855442074118L, j) /* invoke-custom */;
                        }
                    }
                    Y2 = 5;
                    int i5 = 0;
                    while (i5 < (Y2 == true ? 1 : 0)) {
                        int i6 = i5;
                        ?? r02 = 0;
                        try {
                            dh dhVar2 = dh.S;
                            gi giVar2 = gi.FIREFLY;
                            class_243 class_243VarMethod_10312 = w_Var.R().method_1031(0.0d, -0.3d, 0.0d);
                            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_10312, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18652, 5325465194643441103L ^ j) /* invoke-custom */);
                            dhVar2.a(new bk(giVar2, class_243VarMethod_10312, 0.0f, j3, 6.0f, 4, new class_243(0.0d, ((double) i6) * 0.15d, 0.0d), jl.y.p(new Color(w_Var.m()), (char) i, i2, 0.5f, (short) i3), 0.0f, 0.0f, false, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8057, 3571367794945069262L ^ j) /* invoke-custom */, null));
                            i5++;
                            r02 = J;
                            if (r02 == 0) {
                                break;
                            }
                            if (J == 0) {
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5094678855442074118L, j) /* invoke-custom */;
                        }
                    }
                }
                J2 = w_Var.J();
                Y2 = J2;
                w_Var.a((Y2 == true ? 1 : 0) + 1);
            }
            ?? r03 = Y2;
            try {
                if (J == 0) {
                    return r03;
                }
                try {
                    return r03 > (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3540, 952599462844007014L ^ j) /* invoke-custom */;
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, 5094678855442074118L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, 5094678855442074118L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(J, 5094678855442074118L, j) /* invoke-custom */;
        }
    }

    private static final boolean D(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = (a ^ 2705839345856L) ^ 44346842376577L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((r0 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[12];
        int i3 = 0;
        String str = "~Þ\u009dµ\u0080¹\u0002»ñk§£«¯\u008buE®*îí®\u00adV&óN¦ÀÅC\u001dduM_ZÝ\u001fï jYÄ\u0085RTä0\u0098[ñXìõs\"¢~:»«\"ì\u001ad-buû}Bï(\u0087\u0088/80/|}\u0003n£Cé\u000fV@\u0090\u001eÏ^¦ñåáPx\u0014ü\u009eÌMèY\u0005j4\u0018ûÀs Û`SlÑ\u0099=\u001e%²\u0092Á\u0089\u0082Ú)8bGU-ïÒó N1ÒÞ(mU â\bÁÐý\u000eI\u001a¾Q\u009d\rWÝ\u0095~\u000f£WÒþÙ±Æ)ÉÇ\u0098aTSV\u0018\u0002¯ý «\nnÚÖ,1âúl½¦CQm\u0088\u009f\u0015ÞÊ(¾5¡\u0004\u00adó\u008bRwÉ\u0013\u0085ð´|U8\u0086¥pÙn»Ñ:T\u0018ò\u008aJ' \u0005¤^Õ\u0086ýT<\u0018,o¼\u0002\u0090\u00811\bQ<¸\u0006 ¾b\u0001ÛÉÎ\"u\u0018R\u008a(ÎÎ¼ì»\rÊ\u0094¿\u0094©kV\u009e\u0093¥ÇËrä\u008b\u009añ\u0010\u0002³n{\u0086\u009dðÈWÈ® \u0084¸ª\u008b\u0010KÐ\u0016-\u0086Â9\u0094é\tña©\u001a;÷";
        int length = "~Þ\u009dµ\u0080¹\u0002»ñk§£«¯\u008buE®*îí®\u00adV&óN¦ÀÅC\u001dduM_ZÝ\u001fï jYÄ\u0085RTä0\u0098[ñXìõs\"¢~:»«\"ì\u001ad-buû}Bï(\u0087\u0088/80/|}\u0003n£Cé\u000fV@\u0090\u001eÏ^¦ñåáPx\u0014ü\u009eÌMèY\u0005j4\u0018ûÀs Û`SlÑ\u0099=\u001e%²\u0092Á\u0089\u0082Ú)8bGU-ïÒó N1ÒÞ(mU â\bÁÐý\u000eI\u001a¾Q\u009d\rWÝ\u0095~\u000f£WÒþÙ±Æ)ÉÇ\u0098aTSV\u0018\u0002¯ý «\nnÚÖ,1âúl½¦CQm\u0088\u009f\u0015ÞÊ(¾5¡\u0004\u00adó\u008bRwÉ\u0013\u0085ð´|U8\u0086¥pÙn»Ñ:T\u0018ò\u008aJ' \u0005¤^Õ\u0086ýT<\u0018,o¼\u0002\u0090\u00811\bQ<¸\u0006 ¾b\u0001ÛÉÎ\"u\u0018R\u008a(ÎÎ¼ì»\rÊ\u0094¿\u0094©kV\u009e\u0093¥ÇËrä\u008b\u009añ\u0010\u0002³n{\u0086\u009dðÈWÈ® \u0084¸ª\u008b\u0010KÐ\u0016-\u0086Â9\u0094é\tña©\u001a;÷".length();
        char cCharAt = '(';
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[12];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (r0 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((r0 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[14];
                            int i9 = 0;
                            String str3 = "\u0003nÎßÒ\u0088\u0093\u0090\u0087\u0087Á±bjÄº-\u0005BúBA¡ãp.-å\u0011\u0018AÛjé\râà¼w\\8í\u0001ËýQl\u0087\u000fZî&\u008cH:O\u000e@¥mARÆËBÜ\u00ad4Ç\u0007ÑØ`^\u0005Ýÿ\u009dk\u009fI2¼Ìåh\u009d«!·ËS/(\u0003K";
                            int length2 = "\u0003nÎßÒ\u0088\u0093\u0090\u0087\u0087Á±bjÄº-\u0005BúBA¡ãp.-å\u0011\u0018AÛjé\râà¼w\\8í\u0001ËýQl\u0087\u000fZî&\u008cH:O\u000e@¥mARÆËBÜ\u00ad4Ç\u0007ÑØ`^\u0005Ýÿ\u009dk\u009fI2¼Ìåh\u009d«!·ËS/(\u0003K".length();
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
                                                f = new Integer[14];
                                                G = new kp(j);
                                                A = new ArrayList();
                                                Y = -1;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0089Ïü\u0014<[Çd\u001e\u0090Ù¸\u0015Æ\u009b¬";
                                                length2 = "\u0089Ïü\u0014<[Çd\u001e\u0090Ù¸\u0015Æ\u009b¬".length();
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
                        str = "bpÙ!0\u001b\u009a\u001aÏ?\r@Ë·\u001eüc\u0092ecë®\u0084±} ìÔ\f0Pa\u0084þÿ\u0015¼¾4:\u0088}\r\u0080×\u0092nà6\u0013³L(mUaz)û\u0001ð\u009cIE\u000e>2ÿzêìê¦å¦[ÅÑ£nI}oÜ\f\u001bÕ®ÄôNâõÌì2è\u0016j\u0010{«÷ÐTÁ©Û\u0004UÙ\u001f\u0094\tût\u0084ç\n\u001c\u0092û\\ì lqâõ0\u0080,\u0013@m\u0011-T4Jq6R\u0010Ø\u0095k\u0094¹qìäÅÞ¼47n§#\u0097É2él5¼\u0018\u0007¸\u0081N\u008cy\u008b9\u000bXÓ\u000bø¹øV ÔSÝ«Ýn{\u0097\u009d·%\u0096\u0010\u0096f8C{$û¼æwþ\u0097¥nÛ^t´\u0084";
                        length = "bpÙ!0\u001b\u009a\u001aÏ?\r@Ë·\u001eüc\u0092ecë®\u0084±} ìÔ\f0Pa\u0084þÿ\u0015¼¾4:\u0088}\r\u0080×\u0092nà6\u0013³L(mUaz)û\u0001ð\u009cIE\u000e>2ÿzêìê¦å¦[ÅÑ£nI}oÜ\f\u001bÕ®ÄôNâõÌì2è\u0016j\u0010{«÷ÐTÁ©Û\u0004UÙ\u001f\u0094\tût\u0084ç\n\u001c\u0092û\\ì lqâõ0\u0080,\u0013@m\u0011-T4Jq6R\u0010Ø\u0095k\u0094¹qìäÅÞ¼47n§#\u0097É2él5¼\u0018\u0007¸\u0081N\u008cy\u008b9\u000bXÓ\u000bø¹øV ÔSÝ«Ýn{\u0097\u009d·%\u0096\u0010\u0096f8C{$û¼æwþ\u0097¥nÛ^t´\u0084".length();
                        cCharAt = 184;
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

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 19045;
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
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kp", e2);
            }
        }
        return c[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r0 = "su/catlean/kp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kp.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 18638;
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
                    throw new RuntimeException("su/catlean/kp", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r0 = "su/catlean/kp"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kp.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
