package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
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
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/un.class */
public final class un extends _g {

    @NotNull
    public static final un d;
    static final KProperty[] E;

    @NotNull
    private static final av z;

    @NotNull
    private static final av f;

    @NotNull
    private static final cq P;

    @NotNull
    private static final cq c;

    @NotNull
    private static bg Y;

    @NotNull
    private static bg t;
    private static boolean A;

    @NotNull
    private static List N;
    private static final long a = yz.a(835664927788733921L, 4280059109689286568L, MethodHandles.lookup().lookupClass()).a(43011627313028L);
    private static final String[] b;
    private static final String[] e;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private un(char c2, char c3, int i2) {
        long j2 = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20493, 450712093966141731L ^ j2) /* invoke-custom */, jt.Q(), null, 4, null, j2 ^ 75958821934422L);
    }

    private final lj G(int i2, char c2, int i3) {
        return (lj) z.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ a) ^ 48677715575643L, E[0]);
    }

    private final lj j(long j2) {
        return (lj) f.E(this, (a ^ j2) ^ 108217929041857L, E[1]);
    }

    private final boolean R(byte b2, long j2) {
        return ((Boolean) P.E(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ a) ^ 133076846230481L, E[2])).booleanValue();
    }

    private final boolean t(long j2) {
        return ((Boolean) c.E(this, (a ^ j2) ^ 63323484429481L, E[3])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.minecraft.class_437] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [su.catlean.un] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void l(InputEvent inputEvent) {
        long j2 = a ^ 59630268194234L;
        long j3 = j2 ^ 10620332044742L;
        long j4 = j2 ^ 17498882507407L;
        long j5 = j2 ^ 73362016178675L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 98862259644370L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j6 << 16) >>> 32);
        int i7 = (int) ((j6 << 48) >>> 48);
        long j7 = j2 ^ 22638993462911L;
        long j8 = j2 ^ 87328963579159L;
        long j9 = j2 ^ 7180929657871L;
        int i8 = (int) (j2 >>> 32);
        long j10 = ((j2 ^ 85712998626041L) << 32) >>> 32;
        long j11 = j2 ^ 96889214862896L;
        long j12 = j2 ^ 99775712318181L;
        int i9 = (int) (j2 >>> 32);
        int i10 = (int) ((j12 << 32) >>> 48);
        int i11 = (int) ((j12 << 48) >>> 48);
        ?? key = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5967380817434995343L, j2) /* invoke-custom */;
        try {
            try {
                key = inputEvent;
                ?? C = key;
                if (key != 0) {
                    try {
                        try {
                            key = key.getKey();
                            if (key != G(i9, (char) i10, i11).X()) {
                                InputEvent inputEvent2 = inputEvent;
                                C = inputEvent2;
                                if (key != 0) {
                                    if (inputEvent2.getKey() != j(j7).X()) {
                                        return;
                                    } else {
                                        C = inputEvent;
                                    }
                                }
                            } else {
                                C = inputEvent;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, -5928486889509146345L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, -5928486889509146345L, j2) /* invoke-custom */;
                    }
                }
                try {
                    try {
                        if (C.getAction() == InputEvent.Action.Press) {
                            C = zf.F(j3).field_1755;
                            if (C != 0) {
                                return;
                            }
                            try {
                                try {
                                    C = Y.c((int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20499, 7038207185173261234L ^ j2) /* invoke-custom */, j11);
                                    ?? key2 = C;
                                    if (key != 0) {
                                        if (C == 0) {
                                            o2.S(this, o2.Z(i2, this, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3422, 9003137047114349940L ^ j2) /* invoke-custom */, new Object[0], (char) i3, false, 4, null, (short) i4), false, 2, null, j4);
                                            return;
                                        }
                                        key2 = t(j8);
                                    }
                                    try {
                                        try {
                                            if (key != 0) {
                                                if (key2 != 0 && dx.Y((char) i5, dx.K, 1.5f, w2.DISTANCE, false, false, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8251, 325363590294297490L ^ j2) /* invoke-custom */, i6, (char) i7, null) == null) {
                                                    o2.S(this, o2.Z(i2, this, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13037, 3365724595585237710L ^ j2) /* invoke-custom */, new Object[0], (char) i3, false, 4, null, (short) i4), false, 2, null, j4);
                                                    return;
                                                }
                                                key2 = inputEvent.getKey();
                                            }
                                            try {
                                                try {
                                                    int iX = G(i9, (char) i10, i11).X();
                                                    ?? r0 = key2;
                                                    if (key != 0) {
                                                        if (key2 == iX) {
                                                            P(j9);
                                                        }
                                                        int key3 = inputEvent.getKey();
                                                        iX = j(j7).X();
                                                        r0 = key3;
                                                    }
                                                    if (r0 == iX) {
                                                        try {
                                                            r0 = this;
                                                            r0.i(i8, j10);
                                                        } catch (NumberFormatException unused3) {
                                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5928486889509146345L, j2) /* invoke-custom */;
                                                        }
                                                    }
                                                } catch (NumberFormatException unused4) {
                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key2, -5928486889509146345L, j2) /* invoke-custom */;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key2, -5928486889509146345L, j2) /* invoke-custom */;
                                            }
                                        } catch (NumberFormatException unused6) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key2, -5928486889509146345L, j2) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused7) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key2, -5928486889509146345L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused8) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, -5928486889509146345L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused9) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, -5928486889509146345L, j2) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused10) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, -5928486889509146345L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused11) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(C, -5928486889509146345L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused12) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, -5928486889509146345L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused13) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(key, -5928486889509146345L, j2) /* invoke-custom */;
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
    @su.catlean.gofra.Flow
    private final void K(su.catlean.api.event.events.player.PlayerUpdateEvent r21) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.un.K(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    private final int V(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 140236828383498L;
        int i2 = (int) (j3 >>> 56);
        Object objR = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4925617146628701190L, j3) /* invoke-custom */;
        fg fgVarR = gg.P.r((byte) i2, (int) ((j4 << 8) >>> 32), N, (int) ((j4 << 40) >>> 40));
        try {
            try {
                objR = fgVarR.R();
                if (objR == 0) {
                    return objR;
                }
                if (objR != 0) {
                    return fgVarR.a();
                }
                return -1;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -4957650532028242020L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objR, -4957650532028242020L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private final boolean v(long j2) {
        String str;
        long j3 = a ^ j2;
        long j4 = j3 ^ 9091669110543L;
        long j5 = j3 ^ 11355349848488L;
        String str2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4366317226756736199L, j3) /* invoke-custom */;
        class_2338 class_2338VarMethod_10084 = class_2338.method_49638(zf.v(j5).method_33571()).method_10084();
        Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_10084, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17940, 5304997072204191840L ^ j3) /* invoke-custom */);
        int iM = (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13287, 1483509787982112261L ^ j3) /* invoke-custom */;
        loop0: do {
            ?? M = iM;
            while (M < (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15065, 163411285846044478L ^ j3) /* invoke-custom */) {
                ?? M2 = (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25837, 452423504022335751L ^ j3) /* invoke-custom */;
                if (str2 == null) {
                    return M2;
                }
                ?? r19 = M2;
                do {
                    M = r19;
                    while (M < (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15065, 163411285846044478L ^ j3) /* invoke-custom */) {
                        M = (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25837, 452423504022335751L ^ j3) /* invoke-custom */;
                        String str3 = str2;
                        while (str3 != null) {
                            int i2 = M == true ? 1 : 0;
                            while (i2 < (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15065, 163411285846044478L ^ j3) /* invoke-custom */) {
                                M = N.contains(zf.z(j4).method_8320(class_2338VarMethod_10084.method_10069(iM, r19 == true ? 1 : 0, i2 == true ? 1 : 0)).method_26204());
                                if (str2 != null) {
                                    str3 = str2;
                                    if (j3 >= 0) {
                                        if (str3 == null) {
                                            return M;
                                        }
                                        if (M != 0) {
                                            return true;
                                        }
                                        i2++;
                                        if (str2 == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            r19++;
                            str = str2;
                            if (j3 < 0) {
                                break;
                            }
                        }
                    }
                    break;
                } while (str != null);
                iM++;
                if (j3 <= 0) {
                    break;
                }
                str = str2;
            }
            break loop0;
        } while (str != null);
        return false;
    }

    private final void P(long j2) {
        long j3 = a ^ j2;
        i((int) (j3 >>> 32), ((j3 ^ 115661772009411L) << 32) >>> 32);
        A = true;
        o8.p(o8.g, j3 ^ 26482950494015L, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23352, 8814794133501345188L ^ j3) /* invoke-custom */, (byte) 0, false, un::a, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16034, 7626053231956006963L ^ j3) /* invoke-custom */, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00a5: INVOKE (r-1 I:su.catlean.gg), (r0 I:long), (r1 I:int) VIRTUAL call: su.catlean.gg.B(long, int):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void i(int r13, long r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.un.i(int, long):void");
    }

    private static final void a() {
        un unVar = d;
        A = false;
    }

    private static final boolean x(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13566, 909582751550113774L ^ (a ^ 74530379882113L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_22021);
    }

    private static final boolean h(class_1799 class_1799Var) {
        Intrinsics.checkNotNullParameter(class_1799Var, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20141, 1086660692645528702L ^ (a ^ 93157990426448L)) /* invoke-custom */);
        return Intrinsics.areEqual(class_1799Var.method_7909(), class_1802.field_22021);
    }

    static {
        int i2;
        long j2 = a ^ 470489601031L;
        long j3 = j2 ^ 27251612607456L;
        long j4 = j2 ^ 110283837444488L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j4 << 16) >>> 48);
        int i5 = (int) ((j4 << 32) >>> 32);
        long j5 = j2 ^ 84218051233746L;
        long j6 = j2 ^ 116153539880129L;
        int i6 = (int) (j2 >>> 32);
        int i7 = (int) ((j6 << 32) >>> 48);
        int i8 = (int) ((j6 << 48) >>> 48);
        g = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i9 = 1; i9 < 8; i9++) {
            bArr[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[24];
        int i10 = 0;
        String str = "w2Fx'ü=<|V\\\u0098ô\\ü`XN\u0015<\u0019\u001aª|\u0095æ\n#VFPã \u0002Ðu\n\u009b\u000fñ7\u001e1\u008b%\u0082â\u0004Lâ&çëÓ°õóÓñ Ç´ïÒ\u0094\u0010*\u009dÏë\u0084#\u001bMh.DGÉ\u0012¨\u0094\u0010©BoíQ Ä>íQç¨éµ\u0087À(7\u0091×Øæäçµè\u0006d\u008c*\u001f\u0011\u0092\\¥¤û¦\u009f²Bk\u0018\u0013Rç±Â×\u0096\u008el\u0019H\u000f<¤(õË\\P£Ï\u008f\u0012Ñ3\u0018\u009b×hï\u00038zô\u001d\u000f+¸¾p\bFF\u0005\u009dný3,õG{ÚÚ}\u0018ð\u0082uQÒÿI÷\u0003Ôãê.\u008c\u00804J±Ësk]Õ®(35Ë1AÆ0\rN`½Xw\u001en\b¼³õÒ\u00adÞ\u0087Ä7\u0000D¬ú\u0098M\u001eÔR±Á\u008c9Ø\u0005\u0018ãÄ\u0018iìU\u008b\u0093_\u001d¸8à\u0001¡Á\u000b#  â¡\u000eB \u0092^ÛòÄ>è\u0099\u008bmù\u001e\u008fk\u001eàÁ\u0011\fcL=\u0016»~W<RÍ6¬ã\u0018^ò^M\u001a=\u008dq\u009c\u0018ú\u0016TÓ´^Ábê\u0094³Æs^($B&\u000bÎú\u0093¦)Âø\u0093\u008aGJ«MÁß²²&Õ´Is\u008c[A\u0088t×X\u0093~«\u0080R?p\u0018\u0016à@\u00939X\u0000(;ÌUÒ½Þ7\u0089§DvJc^\u0011\u0082\u0018\u0016\u009bRåÍ¶l\u0083P\n\u009e\u001f\u009ebí²ù4m-v2\u0019g ~¨oE\u009aPÌt\u0003¸C;EWnÍ\u0001\u0082M}Ë/ÓZå\u001eò\u008e3^XÌ aIl@\u0002üo\u007f\u001aë0¢ò^º\u0089Z\u008aP®[µ\n\u001fF\u0091Ö\u0012c\u009a\u0099¥\u0010\u0090\u0090vû³gL8\u0019«\u0080H'w2c £''xº_mÓ2ø²¦\u0082\u0018\u0084\u0019ÀÅS\u001ekK\u009c¤Ó\u008få\u008f\u0017Ä³\u00840Ò\u0089@½Bs\u0090äzÈSe\u0015¾w*\u0081,Éìl\u008d0¨\u0088e\\äW\u009a\u00ad\u000b$<ç\fhþý²u=@\u000b±7Ü\n Â¡éc\u008e¢Þq®sÎ)n5\u009a¶#©÷VTÁïÆEà@·ÌÑ\u000ey\u0018\u0003¸Ú\u0000ýâ¯gaV\u008d«úã\fN¾?ë\u001fV?ýþ\u0018(R³WQ\u0089áþ`óh\u00975èfåïAÞµk\u0011\u0004!";
        int length = "w2Fx'ü=<|V\\\u0098ô\\ü`XN\u0015<\u0019\u001aª|\u0095æ\n#VFPã \u0002Ðu\n\u009b\u000fñ7\u001e1\u008b%\u0082â\u0004Lâ&çëÓ°õóÓñ Ç´ïÒ\u0094\u0010*\u009dÏë\u0084#\u001bMh.DGÉ\u0012¨\u0094\u0010©BoíQ Ä>íQç¨éµ\u0087À(7\u0091×Øæäçµè\u0006d\u008c*\u001f\u0011\u0092\\¥¤û¦\u009f²Bk\u0018\u0013Rç±Â×\u0096\u008el\u0019H\u000f<¤(õË\\P£Ï\u008f\u0012Ñ3\u0018\u009b×hï\u00038zô\u001d\u000f+¸¾p\bFF\u0005\u009dný3,õG{ÚÚ}\u0018ð\u0082uQÒÿI÷\u0003Ôãê.\u008c\u00804J±Ësk]Õ®(35Ë1AÆ0\rN`½Xw\u001en\b¼³õÒ\u00adÞ\u0087Ä7\u0000D¬ú\u0098M\u001eÔR±Á\u008c9Ø\u0005\u0018ãÄ\u0018iìU\u008b\u0093_\u001d¸8à\u0001¡Á\u000b#  â¡\u000eB \u0092^ÛòÄ>è\u0099\u008bmù\u001e\u008fk\u001eàÁ\u0011\fcL=\u0016»~W<RÍ6¬ã\u0018^ò^M\u001a=\u008dq\u009c\u0018ú\u0016TÓ´^Ábê\u0094³Æs^($B&\u000bÎú\u0093¦)Âø\u0093\u008aGJ«MÁß²²&Õ´Is\u008c[A\u0088t×X\u0093~«\u0080R?p\u0018\u0016à@\u00939X\u0000(;ÌUÒ½Þ7\u0089§DvJc^\u0011\u0082\u0018\u0016\u009bRåÍ¶l\u0083P\n\u009e\u001f\u009ebí²ù4m-v2\u0019g ~¨oE\u009aPÌt\u0003¸C;EWnÍ\u0001\u0082M}Ë/ÓZå\u001eò\u008e3^XÌ aIl@\u0002üo\u007f\u001aë0¢ò^º\u0089Z\u008aP®[µ\n\u001fF\u0091Ö\u0012c\u009a\u0099¥\u0010\u0090\u0090vû³gL8\u0019«\u0080H'w2c £''xº_mÓ2ø²¦\u0082\u0018\u0084\u0019ÀÅS\u001ekK\u009c¤Ó\u008få\u008f\u0017Ä³\u00840Ò\u0089@½Bs\u0090äzÈSe\u0015¾w*\u0081,Éìl\u008d0¨\u0088e\\äW\u009a\u00ad\u000b$<ç\fhþý²u=@\u000b±7Ü\n Â¡éc\u008e¢Þq®sÎ)n5\u009a¶#©÷VTÁïÆEà@·ÌÑ\u000ey\u0018\u0003¸Ú\u0000ýâ¯gaV\u008d«úã\fN¾?ë\u001fV?ýþ\u0018(R³WQ\u0089áþ`óh\u00975èfåïAÞµk\u0011\u0004!".length();
        char cCharAt = ' ';
        int i11 = -1;
        while (true) {
            int i12 = i11 + 1;
            String strSubstring = str.substring(i12, i12 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i13 = i10;
                        i10++;
                        strArr[i13] = strIntern;
                        int i14 = i12 + cCharAt;
                        i2 = i14;
                        if (i14 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            e = new String[24];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i15 = 1; i15 < 8; i15++) {
                                bArr2[i15] = (byte) ((j2 << (i15 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[15];
                            int i16 = 0;
                            String str3 = "EÈSu?L\u009cK\u0001åÚã¸r©nÍ½\u0000ce\u0095þÓ0Ð+\u0014z.¢¢²b½%p\u008c-&^ý®¢K>\bì±g5Þí\u008b9yc0kÁ©\u009b\u0089T\u00897ä\u000eim¾û««ã\n\u0003\u0007\r\u0012d/Ø\u000f\u0096!AðEí»«ê)\u0091\u0010K\\M\u0094\u009cïÝp";
                            int length2 = "EÈSu?L\u009cK\u0001åÚã¸r©nÍ½\u0000ce\u0095þÓ0Ð+\u0014z.¢¢²b½%p\u008c-&^ý®¢K>\bì±g5Þí\u008b9yc0kÁ©\u009b\u0089T\u00897ä\u000eim¾û««ã\n\u0003\u0007\r\u0012d/Ø\u000f\u0096!AðEí»«ê)\u0091\u0010K\\M\u0094\u009cïÝp".length();
                            int i17 = 0;
                            while (true) {
                                int i18 = i17;
                                i17 += 8;
                                byte[] bytes = str3.substring(i18, i17).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i19 = i16;
                                i16++;
                                long j7 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j8 = j7;
                                    int i20 = i19;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j8 >>> 56), (byte) (j8 >>> 48), (byte) (j8 >>> 40), (byte) (j8 >>> 32), (byte) (j8 >>> 24), (byte) (j8 >>> 16), (byte) (j8 >>> 8), (byte) j8});
                                    long j9 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i20) {
                                        case 0:
                                            jArr2[b5] = j9;
                                            if (i17 >= length2) {
                                                h = jArr;
                                                i = new Integer[15];
                                                E = new KProperty[]{Reflection.property1(new PropertyReference1Impl(un.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31773, 1146052049739777437L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31800, 6127574839726704059L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(un.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24775, 2981623798329284930L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12978, 6684077681384377140L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(un.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31880, 5702964857162499354L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5030, 735692119103695414L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(un.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28508, 8857493855173416667L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15536, 7087974834582537519L ^ j2) /* invoke-custom */, 0))};
                                                d = new un((char) i3, (char) i4, i5);
                                                z = yp.J(d, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16154, 6363446865747789451L ^ j2) /* invoke-custom */, new lj(0, false, j5, false, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32333, 7170981595123059800L ^ j2) /* invoke-custom */, null), null, i6, null, i7, (char) i8, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15291, 1618593689705662888L ^ j2) /* invoke-custom */, null);
                                                f = yp.J(d, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4855, 3600606840326712181L ^ j2) /* invoke-custom */, new lj(0, false, j5, false, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(380, 3087077730729849700L ^ j2) /* invoke-custom */, null), null, i6, null, i7, (char) i8, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15291, 1618593689705662888L ^ j2) /* invoke-custom */, null);
                                                P = yp.t(d, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21205, 1427457449340218190L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15291, 1618593689705662888L ^ j2) /* invoke-custom */, null);
                                                c = yp.t(d, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26535, 8465693356271377982L ^ j2) /* invoke-custom */, false, j3, null, null, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15291, 1618593689705662888L ^ j2) /* invoke-custom */, null);
                                                Y = new bg();
                                                t = new bg();
                                                class_2248 class_2248Var = class_2246.field_10381;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29909, 7766895918631488833L ^ j2) /* invoke-custom */);
                                                class_2248 class_2248Var2 = class_2246.field_10442;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var2, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27873, 7484234417226716540L ^ j2) /* invoke-custom */);
                                                class_2248 class_2248Var3 = class_2246.field_10201;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var3, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9356, 8377749357562387737L ^ j2) /* invoke-custom */);
                                                class_2248 class_2248Var4 = class_2246.field_10013;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var4, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9450, 2318646618220846450L ^ j2) /* invoke-custom */);
                                                class_2248 class_2248Var5 = class_2246.field_22109;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var5, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26653, 8524719616907972999L ^ j2) /* invoke-custom */);
                                                N = CollectionsKt.listOf((Object[]) new class_2248[]{class_2248Var, class_2248Var2, class_2248Var3, class_2248Var4, class_2248Var5});
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i17 >= length2) {
                                                str3 = "[oýrx\u0081=»\u0085PKä(cä\u000f";
                                                length2 = "[oýrx\u0081=»\u0085PKä(cä\u000f".length();
                                                i17 = 0;
                                            }
                                            break;
                                    }
                                    int i21 = i17;
                                    i17 += 8;
                                    byte[] bytes2 = str3.substring(i21, i17).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i19 = i16;
                                    i16++;
                                    j7 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i22 = i10;
                        i10++;
                        strArr[i22] = strIntern;
                        int i23 = i12 + cCharAt;
                        i11 = i23;
                        if (i23 < length) {
                        }
                        str = "|7¹\\Èç½CÍÿ\u0097Z!¾,ùAÊN\u008c\u0090\u0096\u008e/\u008bÑ(\u0097ÌÆ¦\u0016H+}·\u0084\u0001_õÖÎvÃ\u0005·¯jÙ¾iög(b\u0005oqB\u008aR=þõº`i.þB)Púã\u0014 N\u000bþl,B\u0087QÝ¹`Úð«J{øÇ{D\u001b,4ÝÍ£\u0004\u001fï";
                        length = "|7¹\\Èç½CÍÿ\u0097Z!¾,ùAÊN\u008c\u0090\u0096\u008e/\u008bÑ(\u0097ÌÆ¦\u0016H+}·\u0084\u0001_õÖÎvÃ\u0005·¯jÙ¾iög(b\u0005oqB\u008aR=þõº`i.þB)Púã\u0014 N\u000bþl,B\u0087QÝ¹`Úð«J{øÇ{D\u001b,4ÝÍ£\u0004\u001fï".length();
                        cCharAt = ' ';
                        i2 = -1;
                        break;
                        break;
                }
                i12 = i2 + 1;
                strSubstring = str.substring(i12, i12 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i11);
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 23718;
        if (e[i3] == null) {
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
                e[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/un", e2);
            }
        }
        return e[i3];
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/un"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.un.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 22311;
        if (i[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/un", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            i[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return i[i3].intValue();
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/un"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.un.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
