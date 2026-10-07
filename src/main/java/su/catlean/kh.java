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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kh.class */
public final class kh extends _g {

    @NotNull
    public static final kh W;
    static final KProperty[] V;

    @NotNull
    private static final cq u;

    @NotNull
    private static final c8 h;

    @NotNull
    private static final List X;

    @NotNull
    private static final List D;
    private static final long a = yz.a(6224377949498687200L, 7658337560409827342L, MethodHandles.lookup().lookupClass()).a(1835574540851L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private kh(int i, int i2) {
        long j = ((((long) i) << 32) | ((((long) i2) << 32) >>> 32)) ^ a;
        super((String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28524, 5004588559004176170L ^ j) /* invoke-custom */, jt.F(), null, 4, null, j ^ 107718506010454L);
    }

    public final boolean p(long j) {
        return ((Boolean) u.E(this, (a ^ j) ^ 114200560854688L, V[0])).booleanValue();
    }

    public final int E(long j) {
        return ((Number) h.E(this, (a ^ j) ^ 88702157561732L, V[1])).intValue();
    }

    @NotNull
    public final List e() {
        return X;
    }

    @NotNull
    public final List H() {
        return D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [net.minecraft.class_746] */
    @Override // su.catlean._g
    public void O(long j) {
        ?? r0 = j;
        try {
            r0 = zf.F(j ^ 32978412894279L).field_1724;
            if (r0 == 0) {
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2642381454120090059L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    @Flow
    private final void p(Render3DEvent render3DEvent) {
        long j = a ^ 11999133950717L;
        long j2 = j ^ 67748250823368L;
        ?? IsEmpty = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8051244801183833797L, j) /* invoke-custom */;
        try {
            try {
                List<j1> list = X;
                if (IsEmpty == 0) {
                    IsEmpty = list.isEmpty();
                    if (IsEmpty != 0) {
                        return;
                    } else {
                        list = X;
                    }
                }
                for (j1 j1Var : list) {
                    ?? r0 = 0;
                    try {
                        j1Var.N(render3DEvent.getStack(), j2);
                        r0 = IsEmpty;
                        if (r0 == 0 && IsEmpty == 0) {
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8052570497748382369L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                IsEmpty = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, -8052570497748382369L, j) /* invoke-custom */;
                throw IsEmpty;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, -8052570497748382369L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    @Flow
    private final void B(PlayerUpdateEvent playerUpdateEvent) {
        long j = a ^ 103779985829531L;
        List listMethod_18456 = zf.z(j ^ 125220931317812L).method_18456();
        Intrinsics.checkNotNullExpressionValue(listMethod_18456, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5195, 8835238266068151920L ^ j) /* invoke-custom */);
        List<class_742> list = listMethod_18456;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2584381154587611811L, j) /* invoke-custom */;
        for (class_742 class_742Var : list) {
            ?? Contains = 0;
            Contains = 0;
            Contains = 0;
            try {
                kh khVar = W;
                Contains = str;
                if (Contains == 0) {
                    try {
                        Contains = D.contains(class_742Var);
                        if (str != null) {
                            return;
                        }
                        if (Contains == 0) {
                            try {
                                kh khVar2 = W;
                                List list2 = D;
                                Intrinsics.checkNotNull(class_742Var);
                                list2.add(class_742Var);
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -2568792034835463879L, j) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        Contains = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -2568792034835463879L, j) /* invoke-custom */;
                        throw Contains;
                    }
                }
                if (str != null) {
                    break;
                }
            } catch (NumberFormatException unused3) {
                Contains = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Contains, -2568792034835463879L, j) /* invoke-custom */;
                throw Contains;
            }
        }
        List list3 = D;
        Function1 function1 = kh::t;
        list3.removeIf((v1) -> {
            return L(r1, v1);
        });
        List list4 = X;
        Function1 function12 = kh::U;
        list4.removeIf((v1) -> {
            return P(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1 A[PHI: r0
  0x01b1: PHI (r0v86 ??) = (r0v49 ??), (r0v53 ??), (r0v55 java.util.List) binds: [B:26:0x015f, B:46:0x01af, B:33:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [su.catlean.lp] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r6v2, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r6v4, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r6v6, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r6v8, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r7v11, types: [double, int] */
    /* JADX WARN: Type inference failed for: r7v14, types: [double, int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [double, int] */
    /* JADX WARN: Type inference failed for: r7v8, types: [double, int] */
    /* JADX WARN: Type inference failed for: r8v11, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r8v17, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r8v23, types: [short, su.catlean.ce] */
    /* JADX WARN: Type inference failed for: r8v5, types: [short, su.catlean.ce] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(long r17, net.minecraft.class_1657 r19) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kh.y(long, net.minecraft.class_1657):void");
    }

    public final void E(@NotNull class_4587 stack, long a2, @NotNull class_591 model, @NotNull g7 polygon, double posX, double posY, double posZ, double rotX, double rotY, double rotZ, @NotNull ce part, @NotNull Color color) {
        long j = a ^ a2;
        long j2 = j ^ 100209331889545L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(stack, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13376, 4821201546183347955L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(model, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10487, 2257131922391143007L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(polygon, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17994, 7519320150623026427L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(part, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19328, 1312479071993917733L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19641, 3424314035686110739L ^ j) /* invoke-custom */);
        stack.method_22903();
        stack.method_22904(posX, posY, posZ);
        stack.method_22905(0.0555f, 0.0555f, 0.0555f);
        stack.method_22907(class_7833.field_40714.rotationDegrees((float) rotX));
        stack.method_22907(class_7833.field_40716.rotationDegrees((float) rotY));
        stack.method_22907(class_7833.field_40718.rotationDegrees((float) rotZ));
        Matrix4f matrix4fMethod_23761 = stack.method_23760().method_23761();
        kh khVar = W;
        short s = (short) i;
        class_630 class_630Var = (class_630) part.T().invoke(model);
        Intrinsics.checkNotNull(matrix4fMethod_23761);
        khVar.h(s, class_630Var, polygon, i2, i3, color, matrix4fMethod_23761);
        W.h((short) i, (class_630) part.s().invoke(model), polygon, i2, i3, color, matrix4fMethod_23761);
        stack.method_22909();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x01EB: MOVE_MULTI in method: su.catlean.kh.h(short, net.minecraft.class_630, su.catlean.g7, int, int, java.awt.Color, org.joml.Matrix4f):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kh.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x01EB: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[9]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    public final void h(short r1, @org.jetbrains.annotations.NotNull net.minecraft.class_630 r2, @org.jetbrains.annotations.NotNull su.catlean.g7 r3, int r4, int r5, @org.jetbrains.annotations.NotNull java.awt.Color r6, @org.jetbrains.annotations.NotNull org.joml.Matrix4f r7) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kh.h(short, net.minecraft.class_630, su.catlean.g7, int, int, java.awt.Color, org.joml.Matrix4f):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    private static final boolean t(class_1657 class_1657Var) {
        long j = a ^ 131960045000665L;
        long j2 = j ^ 96558268934393L;
        long j3 = j ^ 96225446250870L;
        Object objContains = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2693233318966367263L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1657Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7165, 8467802746207262874L ^ j) /* invoke-custom */);
        try {
            try {
                List listMethod_18456 = zf.z(j3).method_18456();
                Intrinsics.checkNotNullExpressionValue(listMethod_18456, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17681, 3299402517194573410L ^ j) /* invoke-custom */);
                objContains = CollectionsKt.contains(listMethod_18456, class_1657Var);
                if (objContains != 0) {
                    return objContains;
                }
                if (objContains != 0) {
                    return false;
                }
                W.y(j2, class_1657Var);
                return true;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, 2674002548023392379L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains, 2674002548023392379L, j) /* invoke-custom */;
        }
    }

    private static final boolean L(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean U(j1 j1Var) {
        long j = a ^ 90778306589187L;
        long j2 = j ^ 117032748715238L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(j1Var, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8457, 2590415403385128866L ^ j) /* invoke-custom */);
        return j1Var.m((char) i, i2, i3);
    }

    private static final boolean P(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = a ^ 105534204672388L;
        long j2 = j ^ 129736051969073L;
        long j3 = j ^ 99338976117079L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) (((j ^ 34320123100683L) << 32) >>> 32);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i4 = 1; i4 < 8; i4++) {
            bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[26];
        int i5 = 0;
        String str = "Æ\u0000^\u0081\u008cX6ºÛÁ]._-Ó% G§»LÜÞ<¦\u0094b±¤°\u0000¢\u0018n\u0088\u0096\u0087e@\u0091¾]oCÊûYØ¤\\9Qrp\u008cþeí\u0006=\u000e\u0085ÿ\u008f°âr\u000eÞ}\u0096\u0016\u0004ÿx=Uh\r\u001dzêU\u008aà°\u0019\u007fÚÄ\u0080ÿ\u0083â»¢Ë\u0007Ñ\u0014\"\u0084I^[I\u0095\u0015]æ\u0003Ð\u0099\u0010²¶\u008aøÌÍ\u0082q \u000f.\u0000àßð\u008füÁz7ExĀë©\u0094[y\u0088I@ð¤ \u0010²\u0000\u001crÁQ*\u0091\u0010Õ\u0014`¨\b\u000b³\fj9Ñ°ë\u000fQ\râ[.\u0085.ã¿«\u0000n\u0083;Ì\u001e\u0003\u0015\"\u0084ÿæU~'\u0005¥t9~\u009e¥L=Q\u009e\u009bwâ&iæ\u007fßN¨Qü\u0095\u0093Ww\u0000yîÇ-ÁFÆhR\n\u0014\u009f¶\u001bµUw¿fwWø²Á=oÂ\u008c\u008f-¡k7H\u0082\u0094t\u0087Å\u000bç\u007f×7Àèöý\fNB\u0080Óµ/&ç©n\u009bÿD\u0095½9@ñpR¿`Q$ÈNFÜÅ1\u0099Õ\u0084\u0000ÁÞ0\u009cê\u0081\u009d\u0019XÈ¯ÒÆN Í4®#µ÷y´I\u008d\u0011\u0083·Ø\"\u0091Wýýg´\u008d)*]\u0015\u0096Ha\u001cK\u0095\u0087\tÈî#×á4\u009e\u0087s\u0018\u0096\u008c\u009f\u008e\u0019/Wbxq\u0018Àa\u0011\u0010\u0001±\u0002òã¬9\u001b<\u0083Á \u0089ST\u0084Jle\u0010_í7Õf\u009bß¼\u0081\u0012`\f\u000e«²\u00001\\ß_§öñ\u0087 \u00069\u00ad\u001fÝ5\u0006ýÿ|$\u0093Î\u0092P\u0010¸0\u009f\u0088L5¦ê´\u008a\u009a'~Ù\u0086H wà\u009fÈô¼Î\u00aduvØk\u008d\u001a\u001e$ÒÜ¯µ`0¾UC÷?c\u009dØÁ^\u001058¯\u0089\u001dÖ\u0011\u0080z[w\u0087ã*Yy\u0010ºïÁª+³íé\t\u0014\u0091\u008d¹S%T\u0010EÆGk0[{\tEO\u0095A®Òù§\u0018\fv9\u0091ûÝÐ#[c\bóç<ø\u009cÊè\u0084)Edã\u0016\u0010|SU¤½\u000b=\u0015\u0015a¸\u009a9Qáp\u0010ÔJ½\u0014\u0019\n\u0091b«ÛürÁ¿Ëd\u0010$\u0088\u009dÐ\u0085(`÷.1Ê/o5\u0005±\u0010\u001eì\n9òZt¨eç=\u0001Æ¸Q×\u00108â*\f'w=Kk\tÞ\u0098§] \u008f(\u001eßF\u0087\u0089óV\u0018ë¹\u0018\u0092¾\u0003\u0094VzÊ¶\u0081{Á\u0014A¦9\u0001\u009c\u008d\u0014\u001b+±«fa\u0016j\u0093( \u008f²Ê¢\u009eeªF\u0085bÙØU\u0011À4\u0095jðvÕÕûÛ[\u0010\u008d/\n]+4\u0010\"ù\"±ÄÑJ)&\u0084Bf&\u0089\u0003\u0004\u0010\u00106A\n\u0017e\u0012u×¶;5\u0095ÛC\u0086\u0010?\u0080~X\u0096º!\u008d\u0003.\u009f\u0019ý]\u009ew g\u0010úÚ+Öcv\ræ¡Kß\u0017f4l\fp\t\u0010c%\u0082§ÏDùd¸\u008dê \u009eÚ.\u001b5¹î/QDRW{Üipþ\u008aóç6g\u0019\u0001Òÿêþô\u009e\u001f9\u0010;S>@Æ\u0002D\u0004\u0007\u0096dÇ]\\,¯\u0010)\u0099Y²(I\u009b Ã>©®Ï7\u0097\u0000\u0018¿Râ\tÈ¿\u0018î\f\u0000ÿÉEcbï\u0006$ÂB\u000fJ[j";
        int length = "Æ\u0000^\u0081\u008cX6ºÛÁ]._-Ó% G§»LÜÞ<¦\u0094b±¤°\u0000¢\u0018n\u0088\u0096\u0087e@\u0091¾]oCÊûYØ¤\\9Qrp\u008cþeí\u0006=\u000e\u0085ÿ\u008f°âr\u000eÞ}\u0096\u0016\u0004ÿx=Uh\r\u001dzêU\u008aà°\u0019\u007fÚÄ\u0080ÿ\u0083â»¢Ë\u0007Ñ\u0014\"\u0084I^[I\u0095\u0015]æ\u0003Ð\u0099\u0010²¶\u008aøÌÍ\u0082q \u000f.\u0000àßð\u008füÁz7ExĀë©\u0094[y\u0088I@ð¤ \u0010²\u0000\u001crÁQ*\u0091\u0010Õ\u0014`¨\b\u000b³\fj9Ñ°ë\u000fQ\râ[.\u0085.ã¿«\u0000n\u0083;Ì\u001e\u0003\u0015\"\u0084ÿæU~'\u0005¥t9~\u009e¥L=Q\u009e\u009bwâ&iæ\u007fßN¨Qü\u0095\u0093Ww\u0000yîÇ-ÁFÆhR\n\u0014\u009f¶\u001bµUw¿fwWø²Á=oÂ\u008c\u008f-¡k7H\u0082\u0094t\u0087Å\u000bç\u007f×7Àèöý\fNB\u0080Óµ/&ç©n\u009bÿD\u0095½9@ñpR¿`Q$ÈNFÜÅ1\u0099Õ\u0084\u0000ÁÞ0\u009cê\u0081\u009d\u0019XÈ¯ÒÆN Í4®#µ÷y´I\u008d\u0011\u0083·Ø\"\u0091Wýýg´\u008d)*]\u0015\u0096Ha\u001cK\u0095\u0087\tÈî#×á4\u009e\u0087s\u0018\u0096\u008c\u009f\u008e\u0019/Wbxq\u0018Àa\u0011\u0010\u0001±\u0002òã¬9\u001b<\u0083Á \u0089ST\u0084Jle\u0010_í7Õf\u009bß¼\u0081\u0012`\f\u000e«²\u00001\\ß_§öñ\u0087 \u00069\u00ad\u001fÝ5\u0006ýÿ|$\u0093Î\u0092P\u0010¸0\u009f\u0088L5¦ê´\u008a\u009a'~Ù\u0086H wà\u009fÈô¼Î\u00aduvØk\u008d\u001a\u001e$ÒÜ¯µ`0¾UC÷?c\u009dØÁ^\u001058¯\u0089\u001dÖ\u0011\u0080z[w\u0087ã*Yy\u0010ºïÁª+³íé\t\u0014\u0091\u008d¹S%T\u0010EÆGk0[{\tEO\u0095A®Òù§\u0018\fv9\u0091ûÝÐ#[c\bóç<ø\u009cÊè\u0084)Edã\u0016\u0010|SU¤½\u000b=\u0015\u0015a¸\u009a9Qáp\u0010ÔJ½\u0014\u0019\n\u0091b«ÛürÁ¿Ëd\u0010$\u0088\u009dÐ\u0085(`÷.1Ê/o5\u0005±\u0010\u001eì\n9òZt¨eç=\u0001Æ¸Q×\u00108â*\f'w=Kk\tÞ\u0098§] \u008f(\u001eßF\u0087\u0089óV\u0018ë¹\u0018\u0092¾\u0003\u0094VzÊ¶\u0081{Á\u0014A¦9\u0001\u009c\u008d\u0014\u001b+±«fa\u0016j\u0093( \u008f²Ê¢\u009eeªF\u0085bÙØU\u0011À4\u0095jðvÕÕûÛ[\u0010\u008d/\n]+4\u0010\"ù\"±ÄÑJ)&\u0084Bf&\u0089\u0003\u0004\u0010\u00106A\n\u0017e\u0012u×¶;5\u0095ÛC\u0086\u0010?\u0080~X\u0096º!\u008d\u0003.\u009f\u0019ý]\u009ew g\u0010úÚ+Öcv\ræ¡Kß\u0017f4l\fp\t\u0010c%\u0082§ÏDùd¸\u008dê \u009eÚ.\u001b5¹î/QDRW{Üipþ\u008aóç6g\u0019\u0001Òÿêþô\u009e\u001f9\u0010;S>@Æ\u0002D\u0004\u0007\u0096dÇ]\\,¯\u0010)\u0099Y²(I\u009b Ã>©®Ï7\u0097\u0000\u0018¿Râ\tÈ¿\u0018î\f\u0000ÿÉEcbï\u0006$ÂB\u000fJ[j".length();
        char cCharAt = 136;
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
                        i = i9;
                        if (i9 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[26];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i10 = 1; i10 < 8; i10++) {
                                bArr2[i10] = (byte) ((j << (i10 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[5];
                            int i11 = 0;
                            String str3 = "\u0091Åì\u001dT·\u00ad\r~¿æõwÞv\u008c<WÈÔ{²\u008a\u0097";
                            int length2 = "\u0091Åì\u001dT·\u00ad\r~¿æõwÞv\u008c<WÈÔ{²\u008a\u0097".length();
                            int i12 = 0;
                            while (true) {
                                int i13 = i12;
                                i12 += 8;
                                byte[] bytes = str3.substring(i13, i12).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i14 = i11;
                                i11++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i15 = i14;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i15) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i12 >= length2) {
                                                e = jArr;
                                                f = new Integer[5];
                                                V = new KProperty[]{Reflection.property1(new PropertyReference1Impl(kh.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15268, 6084424441559602828L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6554, 847541045264086195L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(kh.class, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3298, 7779797182063075803L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21866, 3668423499521079381L ^ j) /* invoke-custom */, 0))};
                                                W = new kh(i2, i3);
                                                u = yp.t(W, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28375, 3423461722283607023L ^ j) /* invoke-custom */, true, j2, null, null, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22872, 85320088587407629L ^ j) /* invoke-custom */, null);
                                                h = yp.L(W, (String) b(MethodHandles.lookup(), "p", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3378, 7590327053201268743L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3054, 2211877371539047356L ^ j) /* invoke-custom */, new IntRange(3, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2152, 5626907184099999804L ^ j) /* invoke-custom */), j3, null, null, (int) c(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22674, 6603971722440118468L ^ j) /* invoke-custom */, null);
                                                X = new ArrayList();
                                                D = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i12 >= length2) {
                                                str3 = "ó¨\u000e\u001e\u009b^ìì×Q½\bCà\u00016";
                                                length2 = "ó¨\u000e\u001e\u009b^ìì×Q½\bCà\u00016".length();
                                                i12 = 0;
                                            }
                                            break;
                                    }
                                    int i16 = i12;
                                    i12 += 8;
                                    byte[] bytes2 = str3.substring(i16, i12).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i14 = i11;
                                    i11++;
                                    j4 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i17 = i5;
                        i5++;
                        strArr[i17] = strIntern;
                        int i18 = i7 + cCharAt;
                        i6 = i18;
                        if (i18 < length) {
                        }
                        str = "V>\u0010\u00840\u001b¬öÍ-\u0095\rrØ\u000ex1Á\u0093v\u0014ÍÖsÝ]áA)âÍ\u0085ãó\u001co[òÃ  a¢b-\u001fP^úï]M(\u0012¤ªObÜãj\u0010:×É\u0003\u0093r\\§ô+\u009f";
                        length = "V>\u0010\u00840\u001b¬öÍ-\u0095\rrØ\u000ex1Á\u0093v\u0014ÍÖsÝ]áA)âÍ\u0085ãó\u001co[òÃ  a¢b-\u001fP^úï]M(\u0012¤ªObÜãj\u0010:×É\u0003\u0093r\\§ô+\u009f".length();
                        cCharAt = '(';
                        i = -1;
                        break;
                        break;
                }
                i7 = i + 1;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 26590;
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
                throw new RuntimeException("su/catlean/kh", e2);
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
            java.lang.String r1 = "su/catlean/kh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kh.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 17077;
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
                    throw new RuntimeException("su/catlean/kh", e2);
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
            java.lang.String r1 = "su/catlean/kh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kh.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
