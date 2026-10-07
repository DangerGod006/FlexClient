package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1753;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1779;
import net.minecraft.class_1792;
import net.minecraft.class_1803;
import net.minecraft.class_1823;
import net.minecraft.class_1828;
import net.minecraft.class_1835;
import net.minecraft.class_243;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kk.class */
public final class kk extends _g {

    @NotNull
    public static final kk a = null;
    static final KProperty[] o = null;

    @NotNull
    private static final av e = null;

    @NotNull
    private static final cq i = null;

    @Nullable
    private static class_243 x;

    @NotNull
    private static final fd E = null;

    @NotNull
    private static class_243 u;
    private static final long b = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] h = null;
    private static final Map j = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private kk(long j2) {
        long j3 = b ^ j2;
        super((String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20903, 6315031951243677710L ^ j3) /* invoke-custom */, jt.F(), null, 4, null, j3 ^ 53247024532257L);
    }

    private final lj A(long j2) {
        return (lj) e.E(this, (b ^ j2) ^ 27383087936351L, o[0]);
    }

    private final void q(long j2, lj ljVar) {
        e.b(this, (b ^ j2) ^ 70593674084285L, o[0], ljVar);
    }

    private final boolean r(long j2) {
        return ((Boolean) i.E(this, (b ^ j2) ^ 62337159488096L, o[1])).booleanValue();
    }

    private final void w(long j2, boolean z) {
        i.b(this, (b ^ j2) ^ 70699802282029L, o[1], Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private final boolean J(long j2, class_1792 class_1792Var) {
        long j3 = b ^ j2;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6906579106332220824L, j3) /* invoke-custom */;
        try {
            try {
                try {
                    try {
                        obj = class_1792Var instanceof class_1776;
                        if (obj == 0) {
                            return obj;
                        }
                        if (obj == 0) {
                            try {
                                try {
                                    obj = class_1792Var instanceof class_1835;
                                    if (obj == 0) {
                                        return obj;
                                    }
                                    if (obj == 0) {
                                        try {
                                            try {
                                                try {
                                                    boolean z = class_1792Var instanceof class_1779;
                                                    if (obj == 0) {
                                                        return z;
                                                    }
                                                    if (!z) {
                                                        obj = class_1792Var instanceof class_1823;
                                                        if (obj == 0) {
                                                            return obj;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (obj == 0) {
                                                                        obj = class_1792Var instanceof class_1771;
                                                                        if (obj == 0) {
                                                                            return obj;
                                                                        }
                                                                        if (obj == 0) {
                                                                            try {
                                                                                boolean z2 = class_1792Var instanceof class_1828;
                                                                                if (obj == 0) {
                                                                                    return z2;
                                                                                }
                                                                                if (!z2) {
                                                                                    boolean z3 = class_1792Var instanceof class_1803;
                                                                                    if (obj == 0) {
                                                                                        return z3;
                                                                                    }
                                                                                    if (!z3) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                            } catch (NoWhenBranchMatchedException unused) {
                                                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (NoWhenBranchMatchedException unused2) {
                                                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                                                }
                                                            } catch (NoWhenBranchMatchedException unused3) {
                                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                                            }
                                                        } catch (NoWhenBranchMatchedException unused4) {
                                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                                        }
                                                    }
                                                } catch (NoWhenBranchMatchedException unused5) {
                                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                                }
                                            } catch (NoWhenBranchMatchedException unused6) {
                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                            }
                                        } catch (NoWhenBranchMatchedException unused7) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                        }
                                    }
                                } catch (NoWhenBranchMatchedException unused8) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                                }
                            } catch (NoWhenBranchMatchedException unused9) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                            }
                        }
                        return true;
                    } catch (NoWhenBranchMatchedException unused10) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused11) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused12) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused13) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 6851723044900839231L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private final float W(long j2, class_1792 class_1792Var) {
        Object obj = b ^ j2;
        try {
            obj = class_1792Var instanceof class_1753;
            return obj != 0 ? 1.0f : 0.4f;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2412210322373304657L, obj) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float B(long r8, net.minecraft.class_1792 r10) {
        /*
            r7 = this;
            long r0 = su.catlean.kk.b
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -987650937386848246(0xf24b28b48af9b00a, double:-3.6219327285304554E242)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r11 = r0
            r0 = r10
            boolean r0 = r0 instanceof net.minecraft.class_1828     // Catch: kotlin.NoWhenBranchMatchedException -> L20
            r1 = r11
            if (r1 == 0) goto L3b
            if (r0 != 0) goto L56
            goto L2a
        L20:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L31
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L31
        L2a:
            r0 = r10
            boolean r0 = r0 instanceof net.minecraft.class_1803     // Catch: kotlin.NoWhenBranchMatchedException -> L31
            goto L3b
        L31:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L3b:
            r1 = r11
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L6f
            if (r1 == 0) goto L67
            if (r0 == 0) goto L63
            goto L56
        L4c:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L59
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L59
        L56:
            r0 = 1053273620(0x3ec7ae14, float:0.39)
            return r0
        L59:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L63:
            r0 = r10
            boolean r0 = r0 instanceof net.minecraft.class_1779
        L67:
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L93
            r1 = r11
        L6f:
            if (r1 == 0) goto L93
            if (r0 == 0) goto L8f
            goto L82
        L78:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L85
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L85
        L82:
            r0 = 1058474557(0x3f170a3d, float:0.59)
            return r0
        L85:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8f:
            r0 = r10
            boolean r0 = r0 instanceof net.minecraft.class_1835
        L93:
            if (r0 == 0) goto La2
            r0 = 1073741824(0x40000000, float:2.0)
            return r0
        L98:
            r1 = -971646805445659987(0xf2840460e244b2ad, double:-4.271178685168618E243)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        La2:
            r0 = 1069547520(0x3fc00000, float:1.5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.B(long, net.minecraft.class_1792):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    private final int S(class_1792 class_1792Var, long j2) {
        ?? r0;
        long j3 = b ^ j2;
        ?? r02 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5848003303812174697L, j3) /* invoke-custom */;
        try {
            try {
                try {
                    r02 = class_1792Var instanceof class_1828;
                    try {
                        if (r02 == 0) {
                            return r02;
                        }
                        if (r02 == 0) {
                            try {
                                ?? r03 = class_1792Var instanceof class_1803;
                                if (r02 == 0) {
                                    return r03;
                                }
                                r0 = r03;
                                if (j3 > 0) {
                                    if (r03 == 0) {
                                        boolean z = class_1792Var instanceof class_1779;
                                        if (r02 == 0) {
                                            return z ? 1 : 0;
                                        }
                                        if (!z) {
                                            return 0;
                                        }
                                    }
                                    r0 = 4664;
                                }
                            } catch (NoWhenBranchMatchedException unused) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5901796686471369166L, j3) /* invoke-custom */;
                            }
                        } else {
                            r0 = 4664;
                        }
                        return (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5755177463584573668L ^ j3) /* invoke-custom */;
                    } catch (NoWhenBranchMatchedException unused2) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5901796686471369166L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5901796686471369166L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused4) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5901796686471369166L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused5) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5901796686471369166L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[PHI: r0
  0x0067: PHI (r0v12 ??) = (r0v10 ??), (r0v10 ??), (r0v15 ??) binds: [B:13:0x003e, B:15:0x0043, B:20:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float n(net.minecraft.class_1792 r7, long r8) {
        /*
            r6 = this;
            long r0 = su.catlean.kk.b
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = -7387272683649836230(0x997b22a2381adb3a, double:-6.2364453351254304E-186)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r10 = r0
            r0 = r7
            boolean r0 = r0 instanceof net.minecraft.class_1828     // Catch: kotlin.NoWhenBranchMatchedException -> L20
            r1 = r10
            if (r1 == 0) goto L3b
            if (r0 != 0) goto L6a
            goto L2a
        L20:
            r1 = -7371250788776552035(0x99b40e7650a7d99d, double:-7.375265583862737E-185)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L31
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L31
        L2a:
            r0 = r7
            boolean r0 = r0 instanceof net.minecraft.class_1803     // Catch: kotlin.NoWhenBranchMatchedException -> L31
            goto L3b
        L31:
            r1 = -7371250788776552035(0x99b40e7650a7d99d, double:-7.375265583862737E-185)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L3b:
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L67
            r1 = r10
            if (r1 == 0) goto L67
            if (r0 != 0) goto L6a
            goto L56
        L4c:
            r1 = -7371250788776552035(0x99b40e7650a7d99d, double:-7.375265583862737E-185)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
        L56:
            r0 = r7
            boolean r0 = r0 instanceof net.minecraft.class_1779     // Catch: kotlin.NoWhenBranchMatchedException -> L5d
            goto L67
        L5d:
            r1 = -7371250788776552035(0x99b40e7650a7d99d, double:-7.375265583862737E-185)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L67:
            if (r0 == 0) goto L79
        L6a:
            r0 = 1082130432(0x40800000, float:4.0)
            goto L7b
        L6f:
            r1 = -7371250788776552035(0x99b40e7650a7d99d, double:-7.375265583862737E-185)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L79:
            r0 = 1056964608(0x3f000000, float:0.5)
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.n(net.minecraft.class_1792, long):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Flow
    private final void v(FreecamStateEvent freecamStateEvent) {
        long j2 = b ^ 61226656166478L;
        long j3 = j2 ^ 122631261523221L;
        long j4 = j2 ^ 15717260121808L;
        long j5 = j2 ^ 10529201567923L;
        long j6 = j2 ^ 30870431795450L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j6 << 16) >>> 32);
        int i4 = (int) ((j6 << 48) >>> 48);
        long j7 = j2 ^ 51603965139190L;
        ?? X = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(721458711366944834L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    if (x != null) {
                        X = A(j3).X();
                        ?? Method_1560 = X;
                        if (X != 0) {
                            if (X == -1) {
                                return;
                            }
                            Method_1560 = bx.k((short) i2, i3, (char) i4, A(j3).X());
                        }
                        if (Method_1560 != 0) {
                            try {
                                try {
                                    Method_1560 = zf.F(j4).method_1560();
                                    if (Method_1560 == 0) {
                                        return;
                                    }
                                    freecamStateEvent.cancel();
                                    zi ziVar = zi.v;
                                    class_243 class_243VarMethod_33571 = zf.v(j7).method_33571();
                                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_33571, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18996, 6039720347198315501L ^ j2) /* invoke-custom */);
                                    class_243 class_243Var = x;
                                    Intrinsics.checkNotNull(class_243Var);
                                    class_243 class_243VarMethod_1031 = class_243Var.method_1031(0.0d, zf.v(j7).method_18381(zf.v(j7).method_18376()), 0.0d);
                                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22509, 567023875520349731L ^ j2) /* invoke-custom */);
                                    class_243 class_243VarQ = ziVar.q(j5, class_243VarMethod_33571, class_243VarMethod_1031, E.a());
                                    freecamStateEvent.setX(class_243VarQ.field_1352);
                                    freecamStateEvent.setY(class_243VarQ.field_1351);
                                    freecamStateEvent.setZ(class_243VarQ.field_1350);
                                    class_1297 class_1297VarMethod_1560 = zf.F(j4).method_1560();
                                    Intrinsics.checkNotNull(class_1297VarMethod_1560);
                                    freecamStateEvent.setYaw(class_1297VarMethod_1560.method_36454());
                                    freecamStateEvent.setPitch(0.0f);
                                } catch (NoWhenBranchMatchedException unused) {
                                    Method_1560 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1560, 778012453398006501L, j2) /* invoke-custom */;
                                    throw Method_1560;
                                }
                            } catch (NoWhenBranchMatchedException unused2) {
                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_1560, 778012453398006501L, j2) /* invoke-custom */;
                            }
                        }
                    }
                } catch (NoWhenBranchMatchedException unused3) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(X, 778012453398006501L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused4) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(X, 778012453398006501L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused5) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(X, 778012453398006501L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Flow
    private final void N(TickEvent tickEvent) {
        long j2 = b ^ 92277336064835L;
        long j3 = j2 ^ 116586777536477L;
        class_746 class_746Var = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4255416366756165967L, j2) /* invoke-custom */;
        if (class_746Var != 0) {
            try {
                class_746Var = zf.F(j3).field_1724;
                if (class_746Var != 0) {
                    kk kkVar = a;
                    class_243 class_243VarMethod_18798 = class_746Var.method_18798();
                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_18798, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23203, 3222370596104632954L ^ j2) /* invoke-custom */);
                    u = class_243VarMethod_18798;
                }
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746Var, 4305839781421480936L, j2) /* invoke-custom */;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x009e: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void E(su.catlean.api.event.events.render.Render3DEvent r13) {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.E(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void K(long r16, @org.jetbrains.annotations.NotNull net.minecraft.class_1657 r18, @org.jetbrains.annotations.NotNull net.minecraft.class_1792 r19, float r20) {
        /*
            Method dump skipped, instruction units count: 3012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.K(long, net.minecraft.class_1657, net.minecraft.class_1792, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:35:0x025d->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55, types: [double] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x02aa -> B:38:0x02a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(int r16, net.minecraft.class_243 r17, short r18, float r19, short r20, net.minecraft.class_2350 r21, java.awt.Color r22) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.W(int, net.minecraft.class_243, short, float, short, net.minecraft.class_2350, java.awt.Color):void");
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 6720;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kk", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/kk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 2663;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kk", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/kk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kk.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
