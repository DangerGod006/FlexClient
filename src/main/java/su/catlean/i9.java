package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_746;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i9.class */
public final class i9 {
    private int E;
    private static String[] I;
    private static final long a = yz.a(6433273369730990850L, 2705423016150637613L, MethodHandles.lookup().lookupClass()).a(150567668461993L);

    public i9(long j) {
        X((a ^ j) ^ 15893487044679L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final boolean g(short r8, int r9, short r10, int r11) {
        /*
            r7 = this;
            r0 = r8
            long r0 = (long) r0
            r1 = 48
            long r0 = r0 << r1
            r1 = r9
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            r2 = 16
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r10
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.i9.a
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 41283299875683(0x258c046c9b63, double:2.0396660215537E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 100343817961727(0x5b431da000ff, double:4.9576433227437E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r0 = 3706855040034566590(0x33716504e72071be, double:6.765431204522738E-61)
            r1 = r12
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r18 = r0
            r0 = r7
            r1 = r14
            int r0 = r0.s(r1)     // Catch: java.lang.NumberFormatException -> L4b
            r1 = r18
            if (r1 != 0) goto L70
            if (r0 >= 0) goto L6a
            goto L56
        L4b:
            r1 = 3653517261569148158(0x32b3e6979c9644fe, double:1.889689284617674E-64)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L5f
            throw r0     // Catch: java.lang.NumberFormatException -> L5f
        L56:
            r0 = r7
            r1 = r16
            r0.X(r1)     // Catch: java.lang.NumberFormatException -> L5f
            goto L6a
        L5f:
            r1 = 3653517261569148158(0x32b3e6979c9644fe, double:1.889689284617674E-64)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            r0 = r7
            r1 = r14
            int r0 = r0.s(r1)
        L70:
            r1 = r18
            r2 = r8
            if (r2 < 0) goto L7b
            if (r1 != 0) goto L9b
            r1 = r11
        L7b:
            if (r0 < r1) goto L9e
            goto L8c
        L81:
            r1 = 3653517261569148158(0x32b3e6979c9644fe, double:1.889689284617674E-64)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L90
            throw r0     // Catch: java.lang.NumberFormatException -> L90
        L8c:
            r0 = 1
            goto L9b
        L90:
            r1 = 3653517261569148158(0x32b3e6979c9644fe, double:1.889689284617674E-64)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L9b:
            goto L9f
        L9e:
            r0 = 0
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i9.g(short, int, short, int):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final boolean e(int r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.i9.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 103262132863010(0x5dea96bf8022, double:5.10182723639076E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 38644227447742(0x23258f731bbe, double:1.90927851920047E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = 3023445923891709817(0x29f5700c832b0779, double:1.4604932322496585E-106)
            r1 = r9
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r15 = r0
            r0 = r7
            r1 = r11
            int r0 = r0.s(r1)     // Catch: java.lang.NumberFormatException -> L32
            r1 = r15
            if (r1 == 0) goto L55
            if (r0 >= 0) goto L4f
            goto L3c
        L32:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L45
            throw r0     // Catch: java.lang.NumberFormatException -> L45
        L3c:
            r0 = r7
            r1 = r13
            r0.X(r1)     // Catch: java.lang.NumberFormatException -> L45
            goto L4f
        L45:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4f:
            r0 = r7
            r1 = r11
            int r0 = r0.s(r1)
        L55:
            r1 = r15
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L61
            if (r1 == 0) goto L7f
            r1 = r8
        L61:
            if (r0 < r1) goto L82
            goto L71
        L67:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L75
            throw r0     // Catch: java.lang.NumberFormatException -> L75
        L71:
            r0 = 1
            goto L7f
        L75:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L7f:
            goto L83
        L82:
            r0 = 0
        L83:
            r16 = r0
            r0 = r16
            r1 = r15
            if (r1 == 0) goto Lb1
            if (r0 == 0) goto Laf
            goto L9c
        L92:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> La5
            throw r0     // Catch: java.lang.NumberFormatException -> La5
        L9c:
            r0 = r7
            r1 = r13
            r0.X(r1)     // Catch: java.lang.NumberFormatException -> La5
            goto Laf
        La5:
            r1 = 3022653058082758591(0x29f29ef10e455fbf, double:1.268590374668097E-106)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Laf:
            r0 = r16
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i9.e(int, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.i9] */
    public final void v(long a2, int t) {
        int i;
        long j = a ^ a2;
        long j2 = j ^ 90723426486589L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1540064822927440851L, j) /* invoke-custom */;
        try {
            try {
                obj = this;
                class_746 class_746Var = zf.F(j2).field_1724;
                if (obj == 0) {
                    i = class_746Var.field_6012;
                } else if (class_746Var == null) {
                    i = 0;
                } else {
                    class_746Var = zf.F(j2).field_1724;
                    Intrinsics.checkNotNull(class_746Var);
                    i = class_746Var.field_6012;
                }
                obj.E = i + t;
            } catch (NumberFormatException unused) {
                obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1538126841125298965L, j) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1538126841125298965L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.i9] */
    public final void X(long j) {
        int i;
        long j2 = a ^ j;
        Object obj = j2;
        long j3 = obj ^ 65257063138058L;
        try {
            obj = this;
            if (zf.F(j3).field_1724 == null) {
                i = 0;
            } else {
                class_746 class_746Var = zf.F(j3).field_1724;
                Intrinsics.checkNotNull(class_746Var);
                i = class_746Var.field_6012;
            }
            obj.E = i;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6958079099800721118L, j2) /* invoke-custom */;
        }
    }

    public final int C(long j) {
        return s((a ^ j) ^ 70065417435163L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    private final int s(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 76513799952534L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(357050862162160248L, j2) /* invoke-custom */;
        try {
            try {
                obj = zf.F(j3).field_1724;
                class_746 class_746Var = obj;
                if (obj != 0) {
                    if (obj == 0) {
                        return 0;
                    }
                    class_746 class_746Var2 = zf.F(j3).field_1724;
                    Intrinsics.checkNotNull(class_746Var2);
                    class_746Var = class_746Var2;
                }
                return class_746Var.field_6012 - this.E;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 356788377158316734L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 356788377158316734L, j2) /* invoke-custom */;
            throw obj;
        }
    }

    public static void t(String[] strArr) {
        I = strArr;
    }

    public static String[] q() {
        return I;
    }

    static {
        long j = a ^ 83161279537374L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(921758998210811693L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[3], 897111046590818100L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
