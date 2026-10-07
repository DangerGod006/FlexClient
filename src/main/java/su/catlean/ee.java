package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.FinishUsingItemEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ee.class */
public final class ee extends _g {

    @NotNull
    public static final ee o;
    static final KProperty[] u;

    @NotNull
    private static final av G;

    @NotNull
    private static final cs X;
    private static boolean K;

    @NotNull
    private static final LinkedList Y;
    private static final long a = yz.a(3855373869780569882L, 5193921050610321478L, MethodHandles.lookup().lookupClass()).a(49281075266532L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private ee(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29139, 8819972174869243347L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 53329548348603L);
    }

    private final lj i(long j) {
        return (lj) G.E(this, (a ^ j) ^ 14934371911469L, u[0]);
    }

    private final Color I(long j) {
        return (Color) X.E(this, (a ^ j) ^ 74452812219915L, u[1]);
    }

    @Override // su.catlean._g
    public void O(long j) {
        Y.clear();
        K = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.ee] */
    @Override // su.catlean._g
    public void b(long j) {
        Object obj = j;
        long j2 = j ^ 97978716797187L;
        int i = (int) (obj >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        try {
            if (K) {
                obj = this;
                obj.h(i, (short) i2, (short) i3);
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1401980626803683625L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Flow
    public final void o(@NotNull Render3DEvent e) {
        long j = a ^ 13485493834413L;
        long j2 = j ^ 16722683287714L;
        long j3 = j ^ 38172580794783L;
        ?? IsEmpty = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3070698200773366783L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            IsEmpty = Y.isEmpty();
            ?? r0 = IsEmpty;
            if (IsEmpty == 0) {
                r0 = IsEmpty == 0 ? 1 : 0;
            }
            if (r0 != 0) {
                zi ziVar = zi.v;
                class_243 class_243VarComp_3148 = ((class_2708) CollectionsKt.first((List) Y)).comp_3228().comp_3148();
                Intrinsics.checkNotNull(class_243VarComp_3148);
                class_243 class_243VarMethod_1031 = class_243VarComp_3148.method_1031(-0.27d, 0.0d, -0.27d);
                class_243 class_243VarComp_31482 = ((class_2708) CollectionsKt.first((List) Y)).comp_3228().comp_3148();
                Intrinsics.checkNotNull(class_243VarComp_31482);
                zi.x(ziVar, j3, new class_238(class_243VarMethod_1031, class_243VarComp_31482.method_1031(0.27d, 1.8d, 0.27d)), I(j2), null, 4, null);
            }
            ?? r02 = IsEmpty;
            if (r02 != 0) {
                try {
                    r02 = new _g[4];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3066705957216919731L, j) /* invoke-custom */;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3069313788259911878L, j) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, -3069313788259911878L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: NumberFormatException -> 0x008b, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x008b, blocks: (B:13:0x0073, B:15:0x007c), top: B:27:0x0073 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.ee] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.client.InputEvent r9) {
        /*
            r8 = this;
            long r0 = su.catlean.ee.a
            r1 = 23184888415853(0x15162709c66d, double:1.14548568689356E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 16377307458512(0xee52397ebd0, double:8.0914649866304E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r1 = r0; r3 = r0; 
            r2 = 97047806135620(0x5843b402cd44, double:4.7947987015871E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = -4493843572593723199(0xc1a2a9148360f8c1, double:-1.5653536168939784E8)
            r1 = r10
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r1 = r9
            java.lang.String r2 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r17 = r0
            r0 = r9
            r1 = r17
            if (r1 != 0) goto L73
            int r0 = r0.getKey()     // Catch: java.lang.NumberFormatException -> L5b java.lang.NumberFormatException -> L69
            r1 = r8
            r2 = r15
            su.catlean.lj r1 = r1.i(r2)     // Catch: java.lang.NumberFormatException -> L5b java.lang.NumberFormatException -> L69
            int r1 = r1.X()     // Catch: java.lang.NumberFormatException -> L5b java.lang.NumberFormatException -> L69
            if (r0 != r1) goto L95
            goto L65
        L5b:
            r1 = -4492479119864945670(0xc1a7820aeb9723fa, double:-1.9719922179519635E8)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L69
            throw r0     // Catch: java.lang.NumberFormatException -> L69
        L65:
            r0 = r9
            goto L73
        L69:
            r1 = -4492479119864945670(0xc1a7820aeb9723fa, double:-1.9719922179519635E8)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            su.catlean.api.event.events.client.InputEvent$Action r0 = r0.getAction()     // Catch: java.lang.NumberFormatException -> L8b
            su.catlean.api.event.events.client.InputEvent$Action r1 = su.catlean.api.event.events.client.InputEvent.Action.Release     // Catch: java.lang.NumberFormatException -> L8b
            if (r0 != r1) goto L95
            r0 = r8
            r1 = r12
            r2 = r13
            short r2 = (short) r2     // Catch: java.lang.NumberFormatException -> L8b
            r3 = r14
            short r3 = (short) r3     // Catch: java.lang.NumberFormatException -> L8b
            r0.h(r1, r2, r3)     // Catch: java.lang.NumberFormatException -> L8b
            goto L95
        L8b:
            r1 = -4492479119864945670(0xc1a7820aeb9723fa, double:-1.9719922179519635E8)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L95:
            r0 = -4483649263495749801(0xc1c6e0c00fe4df57, double:-7.676559677880658E8)
            r1 = r10
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)     // Catch: java.lang.NumberFormatException -> Lb0
            if (r0 == 0) goto Lba
            r0 = 1
            int[] r0 = new int[r0]     // Catch: java.lang.NumberFormatException -> Lb0
            r1 = -4499968607460577096(0xc18ce664b3e730b8, double:-6.060763848788589E7)
            r2 = r10
            call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)V}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> Lb0
            goto Lba
        Lb0:
            r1 = -4492479119864945670(0xc1a7820aeb9723fa, double:-1.9719922179519635E8)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ee.R(su.catlean.api.event.events.client.InputEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    public final void v(@NotNull ReceivePacket e) {
        long j = a ^ 131016876087546L;
        long j2 = j ^ 51887632747887L;
        ?? r0 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2362759047797348778L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            r0 = e.getPacket() instanceof class_2708;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 == 0) {
                    return;
                } else {
                    r02 = K;
                }
            }
            try {
                try {
                    try {
                        if (r0 == 0) {
                            if (r02 == 0) {
                                boolean zAreEqual = Intrinsics.areEqual(zf.v(j2).method_6030().method_7909(), class_1802.field_8233);
                                if (r0 == 0) {
                                    if (!zAreEqual) {
                                        return;
                                    }
                                    LinkedList linkedList = Y;
                                    class_2708 packet = e.getPacket();
                                    Intrinsics.checkNotNull(packet, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29337, 2996962573500392697L ^ j) /* invoke-custom */);
                                    linkedList.add(packet);
                                }
                            } else {
                                LinkedList linkedList2 = Y;
                                class_2708 packet2 = e.getPacket();
                                Intrinsics.checkNotNull(packet2, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29337, 2996962573500392697L ^ j) /* invoke-custom */);
                                linkedList2.add(packet2);
                            }
                        }
                        e.cancel();
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -2364143288501060243L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -2364143288501060243L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -2364143288501060243L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -2364143288501060243L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_1799] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    @Flow
    private final void B(FinishUsingItemEvent finishUsingItemEvent) {
        long j = a ^ 17962469907751L;
        Object item = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6550675137250354059L, j) /* invoke-custom */;
        try {
            try {
                item = finishUsingItemEvent.getItem();
                Object objAreEqual = item;
                if (item == null) {
                    if (item == null) {
                        return;
                    }
                    class_1799 item2 = finishUsingItemEvent.getItem();
                    Intrinsics.checkNotNull(item2);
                    objAreEqual = item2;
                }
                try {
                    objAreEqual = Intrinsics.areEqual(objAreEqual.method_7909(), class_1802.field_8233);
                    boolean z = objAreEqual;
                    if (item == null) {
                        if (objAreEqual == 0) {
                            return;
                        } else {
                            z = 1;
                        }
                    }
                    K = z;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 6552041788989618352L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(item, 6552041788989618352L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(item, 6552041788989618352L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[LOOP:0: B:3:0x0037->B:12:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:6:0x0054). Please report as a decompilation issue!!! */
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
    private final void h(int r8, short r9, short r10) {
        /*
            r7 = this;
            r0 = r8
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r10
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.ee.a
            long r0 = r0 ^ r1
            r11 = r0
            r0 = r11
            r1 = r0; r1 = r0; 
            r2 = 109283714005366(0x636498f3f976, double:5.3993328739991E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 3209028710239376875(0x2c88c29c1bd915eb, double:3.7094149527420854E-94)
            r1 = r11
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r1 = 0
            su.catlean.ee.K = r1
            r15 = r0
        L37:
            java.util.LinkedList r0 = su.catlean.ee.Y
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            java.util.LinkedList r0 = su.catlean.ee.Y
            java.lang.Object r0 = r0.poll()
            net.minecraft.class_2708 r0 = (net.minecraft.class_2708) r0
            r1 = r13
            net.minecraft.class_634 r1 = su.catlean.zf.k(r1)
            net.minecraft.class_2602 r1 = (net.minecraft.class_2602) r1
            r0.method_11740(r1)
        L54:
            r0 = r15
            if (r0 == 0) goto L37
        L59:
            r0 = r9
            if (r0 >= 0) goto L54
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ee.h(int, short, short):void");
    }

    static {
        int i;
        long j = a ^ 31422838536311L;
        long j2 = j ^ 25625898703981L;
        int i2 = (int) (j >>> 48);
        long j3 = ((j ^ 54120437314250L) << 16) >>> 16;
        long j4 = j ^ 55469232766846L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j4 << 32) >>> 48);
        int i5 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 14437647492117L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i7 = 0;
        String str = "b~+àÂÐ¡þ@Óø\u0016a&o(\n·(|q\u001b\u00159ß9?Ó½ï\u0086³Ñ\u008f¢ÒÊàùí±\u009eè\u001eþ¾ã\u0093\u0010ÑYÒÐ\u0003(§Ê'g¯\u0004©\u0099ôQ\u0010\u009d\u009aziW\u009cgAGÐ\u0012é\u0090#©ê\u0010ÿ4\u000eE\u0095\u0003+© 5¶Y°\u009c\u0002®\u00102à]]¥\u0005×\u0092U¦¨\u0093\u0018¢\"é \u008e\u0000?\u00010ûuõ*\u009a@/¶\u008a\u0086D;CÖ°\u009fé\u0011oM;<;\u0082\u009aZE";
        int length = "b~+àÂÐ¡þ@Óø\u0016a&o(\n·(|q\u001b\u00159ß9?Ó½ï\u0086³Ñ\u008f¢ÒÊàùí±\u009eè\u001eþ¾ã\u0093\u0010ÑYÒÐ\u0003(§Ê'g¯\u0004©\u0099ôQ\u0010\u009d\u009aziW\u009cgAGÐ\u0012é\u0090#©ê\u0010ÿ4\u000eE\u0095\u0003+© 5¶Y°\u009c\u0002®\u00102à]]¥\u0005×\u0092U¦¨\u0093\u0018¢\"é \u008e\u0000?\u00010ûuõ*\u009a@/¶\u008a\u0086D;CÖ°\u009fé\u0011oM;<;\u0082\u009aZE".length();
        char cCharAt = '0';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[8];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[5];
                            int i13 = 0;
                            String str3 = "vKÏ$kñ7\u0001\u0091$'|b\u008e¦J!Z\u0084BCö;¹";
                            int length2 = "vKÏ$kñ7\u0001\u0091$'|b\u008e¦J!Z\u0084BCö;¹".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                u = new KProperty[]{Reflection.property1(new PropertyReference1Impl(ee.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15159, 7500945798174100958L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29658, 850112652827198768L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ee.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30706, 3532753749033746716L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26800, 848669137851358812L ^ j) /* invoke-custom */, 0))};
                                                o = new ee(j5);
                                                G = yp.J(o, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10138, 2891221764025700721L ^ j) /* invoke-custom */, new lj((int) jArr[0], false, j2, false, (int) jArr[3], null), null, i3, null, i4, (char) i5, (int) jArr[2], null);
                                                X = yp.b(o, (short) i2, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8447, 6497257476844574231L ^ j) /* invoke-custom */, new Color((int) jArr[4]), null, null, (int) jArr[1], null, j3);
                                                Y = new LinkedList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                str3 = "Âò\n;\\\u00073ÚK÷z\fxë\u0088Ë";
                                                length2 = "Âò\n;\\\u00073ÚK÷z\fxë\u0088Ë".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "¬ý\u0015D\u0088\u001bvÀö\u0015ÓIî\u008f\u008fD\u0090@\u008f\u0089£\u0000\u0090Uw)\u00909ûr÷Qc3\u0081s_hª{£ \u008f\u0017Üí\u001c,\u008e{ö\u009b1_Ë}¨xÉ\u0097:\u001c÷DQ½þ\u001aU@I\u0082\u001b\u009a\u0010\u0004%7TA\u0097¥[AØ\u0018®I\u001c9¿\u0081\u0085Øôl\u0005]+2¿\u0082'@\u0083\u0093\nOK,/~s*ï¶Ã#\u0017úé.}HÅÊòI\u0080C\\útð\u0092¹<ºYy\u0011\u0086\bÚ\u00132^ðX*\u0019\nPýî\u008e}t\u0086ñ\u0017£\u0096FÐ´E\b/b,1×\u0099'ÔBpýØ\u0004\u0003\u008bÃ$¶\u0093ñ¡0H\u009bÙ½,¼\u0001ì\u0085IÂ~//2\u0003ñaÆ\u009eGî7HGÏéÛdêA¤Oü(";
                        length = "¬ý\u0015D\u0088\u001bvÀö\u0015ÓIî\u008f\u008fD\u0090@\u008f\u0089£\u0000\u0090Uw)\u00909ûr÷Qc3\u0081s_hª{£ \u008f\u0017Üí\u001c,\u008e{ö\u009b1_Ë}¨xÉ\u0097:\u001c÷DQ½þ\u001aU@I\u0082\u001b\u009a\u0010\u0004%7TA\u0097¥[AØ\u0018®I\u001c9¿\u0081\u0085Øôl\u0005]+2¿\u0082'@\u0083\u0093\nOK,/~s*ï¶Ã#\u0017úé.}HÅÊòI\u0080C\\útð\u0092¹<ºYy\u0011\u0086\bÚ\u00132^ðX*\u0019\nPýî\u008e}t\u0086ñ\u0017£\u0096FÐ´E\b/b,1×\u0099'ÔBpýØ\u0004\u0003\u008bÃ$¶\u0093ñ¡0H\u009bÙ½,¼\u0001ì\u0085IÂ~//2\u0003ñaÆ\u009eGî7HGÏéÛdêA¤Oü(".length();
                        cCharAt = '8';
                        i = -1;
                        break;
                        break;
                }
                i9 = i + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 2151;
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
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ee", e);
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/ee"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ee.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
