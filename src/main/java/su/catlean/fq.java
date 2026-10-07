package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.LightMapUpdateEvent;
import su.catlean.api.event.events.render.XRayBlockEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fq.class */
public final class fq extends _g {

    @NotNull
    public static final fq x;
    static final /* synthetic */ KProperty[] B;

    @NotNull
    private static final az X;

    @NotNull
    private static final cq C;

    @NotNull
    private static final cq D;

    @NotNull
    private static final c8 T;

    @NotNull
    private static final c8 U;

    @NotNull
    private static final c8 k;

    @NotNull
    private static final c8 O;

    @NotNull
    private static final bg J;

    @NotNull
    private static final ArrayList I;

    @Nullable
    private static class_2338 b;

    @NotNull
    private static class_238 G;
    private static boolean g;
    private static final long a = yz.a(8638636948636311576L, -2532462535733190466L, MethodHandles.lookup().lookupClass()).a(34211223239199L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private fq(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18746, 8551031192135591857L ^ j2) /* invoke-custom */, jt.z(), null, 4, null, j2 ^ 7195338082922L);
    }

    private final dg h(int i2, long j) {
        return (dg) X.E(this, (((((long) i2) << 32) | ((j << 32) >>> 32)) ^ a) ^ 28877451538459L, B[0]);
    }

    private final void O(int i2, char c2, short s, dg dgVar) {
        X.b(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a) ^ 98702957594840L, B[0], dgVar);
    }

    private final boolean V(char c2, char c3, int i2) {
        return ((Boolean) C.E(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 57359946156790L, B[1])).booleanValue();
    }

    private final boolean q(long j) {
        return ((Boolean) D.E(this, (a ^ j) ^ 89907656542523L, B[2])).booleanValue();
    }

    private final int p(long j) {
        return ((Number) T.E(this, (a ^ j) ^ 16599647923203L, B[3])).intValue();
    }

    private final int A(long j) {
        return ((Number) U.E(this, (a ^ j) ^ 9259974795711L, B[4])).intValue();
    }

    private final int E(byte b2, long j) {
        return ((Number) k.E(this, (((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a) ^ 134720568822864L, B[5])).intValue();
    }

    private final int D(long j) {
        long j2 = a ^ j;
        return ((Number) O.E(this, j2 ^ 126911659349179L, B[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4460, 6286503209937631342L ^ j2) /* invoke-custom */])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    @Flow
    private final void l(PlayerUpdateEvent playerUpdateEvent) {
        long j = a ^ 103663274982854L;
        long j2 = j ^ 58167787767931L;
        long j3 = j >>> 16;
        int i2 = (int) (((j ^ 92652245957744L) << 48) >>> 48);
        long j4 = j ^ 46919925414708L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j4 << 16) >>> 48);
        int i5 = (int) ((j4 << 32) >>> 32);
        boolean zV = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7626343959329491319L, j) /* invoke-custom */;
        GofraState.INSTANCE.setXray(true);
        try {
            try {
                try {
                    zV = V((char) i3, (char) i4, i5);
                    try {
                        if (zV == 0) {
                            if (zV != 0) {
                                zV = g;
                                if (zV == 0) {
                                    if (zV == 0) {
                                        I.clear();
                                        I.addAll(W(j3, (short) i2));
                                        G = v(j2);
                                    }
                                    zV = V((char) i3, (char) i4, i5);
                                }
                            } else {
                                zV = V((char) i3, (char) i4, i5);
                            }
                        }
                        g = zV;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(zV, -7635710767077183222L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(zV, -7635710767077183222L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(zV, -7635710767077183222L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(zV, -7635710767077183222L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.api.event.events.render.XRayBlockEvent] */
    @Flow
    private final void E(XRayBlockEvent xRayBlockEvent) {
        long j = a ^ 65319033024065L;
        Object obj = j;
        try {
            if (h((int) (obj >>> 32), ((obj ^ 107663909900894L) << 32) >>> 32).e().contains(xRayBlockEvent.getBlock())) {
                obj = xRayBlockEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5012476341460787853L, j) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_310 */
    @Override // su.catlean._g
    public void O(long j) throws class_310 {
        long j2 = j ^ 32978412894279L;
        long j3 = j >>> 16;
        int i2 = (int) (((j ^ 42464098356882L) << 48) >>> 48);
        class_746 class_746Var = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2651417630488036459L, j) /* invoke-custom */;
        try {
            try {
                class_310 class_310VarF = zf.F(j2);
                if (class_746Var == null) {
                    class_746Var = class_310VarF.field_1724;
                    if (class_746Var == null) {
                        return;
                    } else {
                        class_310VarF = zf.F(j2);
                    }
                }
                if (class_746Var == null) {
                    try {
                        try {
                            class_310VarF = class_310VarF.field_1687;
                            if (class_310VarF == null) {
                                return;
                            }
                            I.clear();
                            I.addAll(W(j3, (short) i2));
                            GofraState.INSTANCE.setXray(true);
                            class_310VarF = zf.F(j2);
                        } catch (NumberFormatException unused) {
                            class_310VarF = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 2660206097284432872L, j) /* invoke-custom */;
                            throw class_310VarF;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 2660206097284432872L, j) /* invoke-custom */;
                    }
                }
                class_310VarF.field_1769.method_3279();
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 2660206097284432872L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 2660206097284432872L, j) /* invoke-custom */;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_310 */
    @Override // su.catlean._g
    public void b(long j) throws class_310 {
        long j2 = j ^ 64129331416845L;
        class_746 class_746Var = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1405578164060795681L, j) /* invoke-custom */;
        try {
            try {
                class_310 class_310VarF = zf.F(j2);
                if (class_746Var == null) {
                    class_746Var = class_310VarF.field_1724;
                    if (class_746Var == null) {
                        return;
                    } else {
                        class_310VarF = zf.F(j2);
                    }
                }
                if (class_746Var == null) {
                    try {
                        try {
                            class_310VarF = class_310VarF.field_1687;
                            if (class_310VarF == null) {
                                return;
                            } else {
                                class_310VarF = zf.F(j2);
                            }
                        } catch (NumberFormatException unused) {
                            class_310VarF = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 1414364430743286946L, j) /* invoke-custom */;
                            throw class_310VarF;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 1414364430743286946L, j) /* invoke-custom */;
                    }
                }
                class_310VarF.field_1769.method_3279();
                GofraState.INSTANCE.setXray(false);
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 1414364430743286946L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 1414364430743286946L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.api.event.events.player.MoveEvent] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void s(MoveEvent moveEvent) {
        long j = a ^ 97238540863777L;
        long j2 = j ^ 49046471118803L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j2 << 16) >>> 48);
        int i4 = (int) ((j2 << 32) >>> 32);
        ?? V = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2508169249906328174L, j) /* invoke-custom */;
        try {
            try {
                V = V((char) i2, (char) i3, i4);
                ?? IsEmpty = V;
                if (V == 0) {
                    if (V == 0) {
                        return;
                    } else {
                        IsEmpty = I.isEmpty();
                    }
                }
                ?? r0 = IsEmpty;
                if (V == 0) {
                    r0 = IsEmpty == 0 ? 1 : 0;
                }
                if (r0 != 0) {
                    try {
                        moveEvent.setZ(0.0d);
                        moveEvent.setX(0.0d);
                        r0 = moveEvent;
                        r0.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2517379926986622445L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, 2517379926986622445L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, 2517379926986622445L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x026d: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void o(su.catlean.api.event.events.render.Render3DEvent r10) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fq.o(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    @Flow
    private final void f(LightMapUpdateEvent lightMapUpdateEvent) {
        lightMapUpdateEvent.cancel();
    }

    private final class_238 v(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 16212725838380L;
        long j4 = j2 ^ 96571272423122L;
        return new class_238(zf.v(j4).method_23317() - ((double) A(j3)), zf.v(j4).method_23318() - ((double) D(j2 ^ 129459912836904L)), zf.v(j4).method_23321() - ((double) A(j3)), zf.v(j4).method_23317() + ((double) A(j3)), zf.v(j4).method_23318() + ((double) E((byte) (j2 >>> 56), ((j2 ^ 136707800801219L) << 8) >>> 8)), zf.v(j4).method_23321() + ((double) A(j3)));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x00d3
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final java.util.ArrayList W(long r10, short r12) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fq.W(long, short):java.util.ArrayList");
    }

    private static final boolean l() {
        return x.V((char) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 7118055784217L) ^ 125974964173291L) << 32) >>> 32));
    }

    private static final boolean P() {
        return x.V((char) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 43988557729605L) ^ 102162164697527L) << 32) >>> 32));
    }

    private static final boolean Q() {
        return x.V((char) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 20212403678196L) ^ 112740894436614L) << 32) >>> 32));
    }

    private static final boolean C() {
        return x.V((char) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 67722152285480L) ^ 80798317695962L) << 32) >>> 32));
    }

    private static final boolean s() {
        return x.V((char) (r0 >>> 48), (char) ((r1 << 16) >>> 48), (int) ((((a ^ 72724804738272L) ^ 60262853237266L) << 32) >>> 32));
    }

    static {
        int i2;
        long j = a ^ 32887122775773L;
        long j2 = j ^ 12910440210981L;
        long j3 = j ^ 39695649828675L;
        long j4 = j ^ 103363343039440L;
        long j5 = j ^ 120055804124244L;
        long j6 = j ^ 64145871803502L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[27];
        int i4 = 0;
        String str = "s¹½®\u0086Lª\u0085\u00914'¢ö\u0001\u0012\u0087\u00ad§\b\u0086g\u0014õ\u0080\u0018-ö4ûI\u0088¤¿ØÓ\u008f\u0014oëêtFë\u0014\u001eïZ\u0081\u0082\u0010LU²X\u0089`g%BdßýÛ*û'\u0018æ¨Þµ·\u0085²\u001c£$Ú?0\u001e\u009eâ¦Ü+Y\u009fÂr¬\u0010¾\u0005?1¾3!t?\u009a0\u0002àoÆ|\u0010âÿ\u0093\u009aÆ\u0080F\u001efÆ\u0010?\u0007ÀA\u009b\u0018:\u000eP0\u0094æê\u001f]O$u\u000f\u0090÷å\u0090\u0087ÖÙ)iù%\u0018¼ª\u000eÆ\u008bx\nH[ÎF¶öÄÕ0\u0086Ìªh\u000fÏ\u0007¦\u0010ö%ÍJ\u0019¾|û\fî\u0090K\u001b¨\nã\u0018AZ dÁ¶\u0081Ýð:\u0098Ì\u0004Ç\u008d¤µa\u008f³û¨»ó(\u0004\u009e\u00005+\u0015ä\u0088ÑÀÀ<¤æs\u0013¤mQ4Ì\u0089M\f\u008b\n{Õ#SxyÉÆþí\u008f·}\u0099\u0010\u009bó¤ì\u0088\u001dA]«¶»Ò\u0007üÖ& N9ÌJ\u0094]\u0094®^)\u009bÍ\u001f+ï'Ô\u0012§\u009eÅ³@z÷\u000f~\r\u0017ýõi\u0010\\\u0082&\u0002Wðé\t\u0097\u0080Qã,\u0088»l\u0018Rï\u009d\u001e[[\u008b\u0017ºà-\u0083\u0001²0ÍºqÈ\u0011\u001b\fªG àÃÒ|\u0007\u0088\u0001ñ¹T(Ë\u0083ªÇ¦\u000b±\u0083\u0093\u0092\u0016FPmD©xâ%R¥\u0018Ì¶ë\náü\u0012ªWc\u009en\u0080\u0010|õ\u0010\u008f\f\u000f\u0096¤ìÎ\u0010¦\u0085e  ¶W<@/\rR\u0091¬®Å\u0010ÀH3Kî\u008bl\u0080\u0087tÏ{S\u009dø}\u0010%wòÄ+\u0014%ÉK´årù\u0016l@\u0018\u00ad\u0093Ung\u0084\u0084'UÑ(mÚ8¶\u009b½Ýàî/ëi.\u0018\u0089ÖýEa\u009c}q4\u0094Ì\u000bn\\\u0007èy\u0082ðÈ7y¤^\u0010\u0098l?¢\u001eHÜ³¦ì&ÀÑo\u0085¹\u0010]¢\u0016=\u001dl\u0007ªg\u009a\u0012)ÈÓ8\u001aH\t\u008e\u0004X\u0012Ô¬9¬ð·{l ¼«`;S-À¤à(C\u0097tãØ6Sh\u0080ñhg3\u008c)ÐÔF:JGò²\u0002x\u001e_ÚïO\u0096\u0016õ\u009eçÎö'ùTÎk\u001eX;Êlq";
        int length = "s¹½®\u0086Lª\u0085\u00914'¢ö\u0001\u0012\u0087\u00ad§\b\u0086g\u0014õ\u0080\u0018-ö4ûI\u0088¤¿ØÓ\u008f\u0014oëêtFë\u0014\u001eïZ\u0081\u0082\u0010LU²X\u0089`g%BdßýÛ*û'\u0018æ¨Þµ·\u0085²\u001c£$Ú?0\u001e\u009eâ¦Ü+Y\u009fÂr¬\u0010¾\u0005?1¾3!t?\u009a0\u0002àoÆ|\u0010âÿ\u0093\u009aÆ\u0080F\u001efÆ\u0010?\u0007ÀA\u009b\u0018:\u000eP0\u0094æê\u001f]O$u\u000f\u0090÷å\u0090\u0087ÖÙ)iù%\u0018¼ª\u000eÆ\u008bx\nH[ÎF¶öÄÕ0\u0086Ìªh\u000fÏ\u0007¦\u0010ö%ÍJ\u0019¾|û\fî\u0090K\u001b¨\nã\u0018AZ dÁ¶\u0081Ýð:\u0098Ì\u0004Ç\u008d¤µa\u008f³û¨»ó(\u0004\u009e\u00005+\u0015ä\u0088ÑÀÀ<¤æs\u0013¤mQ4Ì\u0089M\f\u008b\n{Õ#SxyÉÆþí\u008f·}\u0099\u0010\u009bó¤ì\u0088\u001dA]«¶»Ò\u0007üÖ& N9ÌJ\u0094]\u0094®^)\u009bÍ\u001f+ï'Ô\u0012§\u009eÅ³@z÷\u000f~\r\u0017ýõi\u0010\\\u0082&\u0002Wðé\t\u0097\u0080Qã,\u0088»l\u0018Rï\u009d\u001e[[\u008b\u0017ºà-\u0083\u0001²0ÍºqÈ\u0011\u001b\fªG àÃÒ|\u0007\u0088\u0001ñ¹T(Ë\u0083ªÇ¦\u000b±\u0083\u0093\u0092\u0016FPmD©xâ%R¥\u0018Ì¶ë\náü\u0012ªWc\u009en\u0080\u0010|õ\u0010\u008f\f\u000f\u0096¤ìÎ\u0010¦\u0085e  ¶W<@/\rR\u0091¬®Å\u0010ÀH3Kî\u008bl\u0080\u0087tÏ{S\u009dø}\u0010%wòÄ+\u0014%ÉK´årù\u0016l@\u0018\u00ad\u0093Ung\u0084\u0084'UÑ(mÚ8¶\u009b½Ýàî/ëi.\u0018\u0089ÖýEa\u009c}q4\u0094Ì\u000bn\\\u0007èy\u0082ðÈ7y¤^\u0010\u0098l?¢\u001eHÜ³¦ì&ÀÑo\u0085¹\u0010]¢\u0016=\u001dl\u0007ªg\u009a\u0012)ÈÓ8\u001aH\t\u008e\u0004X\u0012Ô¬9¬ð·{l ¼«`;S-À¤à(C\u0097tãØ6Sh\u0080ñhg3\u008c)ÐÔF:JGò²\u0002x\u001e_ÚïO\u0096\u0016õ\u009eçÎö'ùTÎk\u001eX;Êlq".length();
        char cCharAt = 24;
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
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            c = strArr;
                            d = new String[27];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[12];
                            int i10 = 0;
                            String str3 = "Q¥¸RÔ\u0084\u0083#<V=\u0010\u001f8\u009d\u0087Æv>f÷£ò\u008ap`¢\u0087\u009fý`ç36f¹]¸Sâ\u0000\u0007\u0081õÝì$¤¥\u0098ñcë¡\u0007NÐS/ùÍ\u001b<ØW1Ó@\t\u000eW\u009c\u008f%6ç±Lðe";
                            int length2 = "Q¥¸RÔ\u0084\u0083#<V=\u0010\u001f8\u009d\u0087Æv>f÷£ò\u008ap`¢\u0087\u009fý`ç36f¹]¸Sâ\u0000\u0007\u0081õÝì$¤¥\u0098ñcë¡\u0007NÐS/ùÍ\u001b<ØW1Ó@\t\u000eW\u009c\u008f%6ç±Lðe".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                f = jArr;
                                                h = new Integer[12];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18659, 3840904799376629160L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1181, 3850757092999058516L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14604, 3783179242514311646L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5964, 4495394227789875094L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31453, 3735896686291397123L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30200, 1778620108998649124L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14074, 3551735034058008119L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28502, 5834491343403007902L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24310, 7051134589750939187L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27464, 8661812117544647562L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24363, 6953153930046148596L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27264, 5004676606729337433L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29288, 5706170640764314276L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5578, 4246605127518257285L ^ j) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(fq.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30786, 8552426159090215065L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14551, 1973367702372968476L ^ j) /* invoke-custom */, 0));
                                                B = kPropertyArr;
                                                x = new fq(j6);
                                                fq fqVar = x;
                                                String strB = (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8704, 4699933540071600861L ^ j) /* invoke-custom */;
                                                class_2248 class_2248Var = class_2246.field_10442;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2018, 186152428555687720L ^ j) /* invoke-custom */);
                                                class_2248 class_2248Var2 = class_2246.field_29029;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22984, 5954121368190290184L ^ j) /* invoke-custom */);
                                                class_2248 class_2248Var3 = class_2246.field_22109;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var3, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14518, 1247010816007628917L ^ j) /* invoke-custom */);
                                                X = yp.y(fqVar, strB, j5, new dg(CollectionsKt.mutableListOf(class_2248Var, class_2248Var2, class_2248Var3), j4), (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(281, 5190741574649648213L ^ j) /* invoke-custom */, (Object) null);
                                                C = yp.t(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30175, 5284850062993761551L ^ j) /* invoke-custom */, false, j2, null, null, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18397, 3768028086598980245L ^ j) /* invoke-custom */, null);
                                                D = yp.t(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28290, 8742256793164627546L ^ j) /* invoke-custom */, false, j2, null, fq::l, 4, null);
                                                T = yp.L(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12880, 220317337914008209L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9781, 3928624101021791094L ^ j) /* invoke-custom */, new IntRange(1, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13048, 6446646237876332474L ^ j) /* invoke-custom */), j3, null, fq::P, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7414, 6873343710238673343L ^ j) /* invoke-custom */, null);
                                                U = yp.L(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12890, 3187900673602773661L ^ j) /* invoke-custom */, 5, new IntRange(1, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7531, 6123251894524938283L ^ j) /* invoke-custom */), j3, null, fq::Q, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7414, 6873343710238673343L ^ j) /* invoke-custom */, null);
                                                k = yp.L(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12890, 3187900673602773661L ^ j) /* invoke-custom */, 5, new IntRange(1, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12619, 1282159430179726341L ^ j) /* invoke-custom */), j3, null, fq::C, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7414, 6873343710238673343L ^ j) /* invoke-custom */, null);
                                                O = yp.L(x, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24826, 6950988002066903092L ^ j) /* invoke-custom */, 5, new IntRange(1, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22306, 2610599718603014755L ^ j) /* invoke-custom */), j3, null, fq::s, (int) c(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7414, 6873343710238673343L ^ j) /* invoke-custom */, null);
                                                J = new bg();
                                                I = new ArrayList();
                                                G = new class_238(class_2338.field_10980);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "\b_\u0085DÊË\u009céãâ\u0082¾&`a@";
                                                length2 = "\b_\u0085DÊË\u009céãâ\u0082¾&`a@".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "\u0006ì\u000bm\u0098\u008fÝzÝO\u0094±'1ùq^e\u0000zTB\u001e\u0010U'gÐ.{¹¯\u0005\u001d«;òûgMÚC\u001b  \n\u0006â s\u0007O\u008e\u0003Lû\u0000Çî\u00adÕ\u008aV¸Jéü\u0098¢  µÔ\u0017wq_\u0012\u0092\u001cÄ";
                        length = "\u0006ì\u000bm\u0098\u008fÝzÝO\u0094±'1ùq^e\u0000zTB\u001e\u0010U'gÐ.{¹¯\u0005\u001d«;òûgMÚC\u001b  \n\u0006â s\u0007O\u008e\u0003Lû\u0000Çî\u00adÕ\u008aV¸Jéü\u0098¢  µÔ\u0017wq_\u0012\u0092\u001cÄ".length();
                        cCharAt = '0';
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 29757;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/fq", e2);
            }
        }
        return d[i3];
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
            java.lang.String r1 = "su/catlean/fq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 12733;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/fq", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
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
            java.lang.String r1 = "su/catlean/fq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.fq.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
