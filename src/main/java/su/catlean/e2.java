package su.catlean;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_638;
import net.minecraft.class_745;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e2.class */
public final class e2 extends _g {

    @NotNull
    public static final e2 g;
    static final KProperty[] e;

    @NotNull
    private static final a6 i;

    @NotNull
    private static final a6 f;

    @NotNull
    private static final cq A;

    @NotNull
    private static final cl S;

    @Nullable
    private static class_745 J;

    @NotNull
    private static final List X;
    private static int C;
    private static boolean U;
    private static boolean n;
    private static final long a = yz.a(-9034549554807465080L, -4840536040974324175L, MethodHandles.lookup().lookupClass()).a(228462466825021L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] h;
    private static final Integer[] j;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private e2(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14063, 5280325835598188136L ^ j3) /* invoke-custom */, jt.y(), null, 4, null, j3 ^ 61752383896617L);
    }

    private final id p(long j2) {
        return (id) i.E(this, (a ^ j2) ^ 129718085410181L, e[0]);
    }

    private final id Q(int i2, byte b2, int i3) {
        return (id) f.E(this, ((((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a) ^ 8984027829632L, e[1]);
    }

    private final boolean L(long j2) {
        return ((Boolean) A.E(this, (a ^ j2) ^ 118075573104697L, e[2])).booleanValue();
    }

    private final String C(long j2) {
        return (String) S.E(this, (a ^ j2) ^ 105336545859114L, e[3]);
    }

    @Nullable
    public final class_745 e() {
        return J;
    }

    public final void t(@Nullable class_745 class_745Var) {
        J = class_745Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 124491995633628L;
        long j5 = j2 ^ 76517038092751L;
        long j6 = j2 ^ 69599493015750L;
        long j7 = j2 ^ 67464996320865L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2655994253185492954L, j2) /* invoke-custom */;
        ?? r0 = strArr;
        if (r0 == 0) {
            try {
                try {
                    r0 = zf.F(j3).field_1724;
                    if (r0 == 0) {
                        return;
                    }
                    J = new class_745(zf.z(j6), new GameProfile(UUID.fromString((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31811, 732368285685747006L ^ j2) /* invoke-custom */), C(j5)));
                    class_745 class_745Var = J;
                    Intrinsics.checkNotNull(class_745Var);
                    class_745Var.method_5719(zf.v(j7));
                } catch (NumberFormatException unused) {
                    r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2660523433319944309L, j2) /* invoke-custom */;
                    throw r0;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2660523433319944309L, j2) /* invoke-custom */;
            }
        }
        ?? L = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (L > 0) {
            try {
                L = L(j4);
                if (strArr == null) {
                    if (L != 0) {
                        class_745 class_745Var2 = J;
                        Intrinsics.checkNotNull(class_745Var2);
                        class_745Var2.method_6122(class_1268.field_5808, zf.v(j7).method_6047().method_7972());
                        class_745 class_745Var3 = J;
                        Intrinsics.checkNotNull(class_745Var3);
                        class_745Var3.method_6122(class_1268.field_5810, zf.v(j7).method_6079().method_7972());
                        int i2 = 0;
                        loop0: while (i2 < 4) {
                            int i3 = i2;
                            class_1661 class_1661VarMethod_31548 = null;
                            try {
                                e2 e2Var = g;
                                class_745 class_745Var4 = J;
                                Intrinsics.checkNotNull(class_745Var4);
                                class_1661VarMethod_31548 = class_745Var4.method_31548();
                                class_1661VarMethod_31548.method_5447((int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8794, 3548890955224255543L ^ j2) /* invoke-custom */ + i3, zf.v(j7).method_31548().method_5438((int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30330, 6137421998532155409L ^ j2) /* invoke-custom */ + i3).method_7972());
                                i2++;
                                do {
                                    String[] strArr2 = strArr;
                                    if (j2 > 0) {
                                        if (strArr2 != null) {
                                            return;
                                        } else {
                                            strArr2 = strArr;
                                        }
                                    }
                                    if (strArr2 != null) {
                                    }
                                } while (j2 < 0);
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_1661VarMethod_31548, 2660523433319944309L, j2) /* invoke-custom */;
                            }
                        }
                        class_745 class_745Var5 = J;
                        Intrinsics.checkNotNull(class_745Var5);
                        class_745Var5.method_6127().method_26846(zf.v(j7).method_6127());
                    }
                    class_638 class_638VarZ = zf.z(j6);
                    class_1297 class_1297Var = J;
                    Intrinsics.checkNotNull(class_1297Var);
                    class_638VarZ.method_53875(class_1297Var);
                    class_745 class_745Var6 = J;
                    Intrinsics.checkNotNull(class_745Var6);
                    class_745Var6.method_6092(new class_1293(class_1294.field_5924, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6192, 4701970610517456476L ^ j2) /* invoke-custom */, 2));
                    class_745 class_745Var7 = J;
                    Intrinsics.checkNotNull(class_745Var7);
                    class_745Var7.method_6092(new class_1293(class_1294.field_5898, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8671, 6793165377497075633L ^ j2) /* invoke-custom */, 4));
                    class_745 class_745Var8 = J;
                    Intrinsics.checkNotNull(class_745Var8);
                    class_745Var8.method_6092(new class_1293(class_1294.field_5907, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8671, 6793165377497075633L ^ j2) /* invoke-custom */, 1));
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L, 2660523433319944309L, j2) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [net.minecraft.class_745] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte, int] */
    @Flow
    private final void K(ReceivePacket receivePacket) {
        long j2 = a ^ 21844564130210L;
        long j3 = j2 ^ 129778328607365L;
        long j4 = j2 ^ 39392071880832L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-677591670505966183L, j2) /* invoke-custom */;
        class_1657 class_1657Var = J;
        ?? r0 = 0;
        NumberFormatException numberFormatException = null;
        try {
            try {
                r0 = strArr;
                if (r0 == 0) {
                    try {
                        r0 = receivePacket.getPacket() instanceof class_2664;
                        if (r0 != 0) {
                            class_1657 class_1657Var2 = class_1657Var;
                            ?? r02 = class_1657Var2;
                            if (strArr == null) {
                                if (class_1657Var2 == null) {
                                    return;
                                } else {
                                    r02 = class_1657Var;
                                }
                            }
                            try {
                                try {
                                    try {
                                        r02 = ((class_745) r02).field_6235;
                                        ?? Method_29504 = r02;
                                        if (strArr == null) {
                                            if (r02 != 0) {
                                                return;
                                            }
                                            class_1657Var.method_48922(zf.z(j3).method_48963().method_48830());
                                            float fMethod_6032 = class_1657Var.method_6032();
                                            float fMethod_6067 = class_1657Var.method_6067();
                                            la laVar = la.l;
                                            class_243 class_243VarComp_2883 = receivePacket.getPacket().comp_2883();
                                            Intrinsics.checkNotNullExpressionValue(class_243VarComp_2883, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13076, 6785110490718998560L ^ j2) /* invoke-custom */);
                                            class_1657Var.method_6033(fMethod_6032 + (fMethod_6067 - la.K(laVar, class_243VarComp_2883, class_1657Var, 0, false, null, false, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21892, 2603204433647741352L ^ j2) /* invoke-custom */, null, j4)));
                                            if (strArr != null) {
                                                return;
                                            } else {
                                                Method_29504 = class_1657Var.method_29504();
                                            }
                                        }
                                        if (Method_29504 != 0) {
                                            class_1657Var.method_6033(10.0f);
                                            e2 e2Var = g;
                                            class_1297 class_1297Var = J;
                                            Intrinsics.checkNotNull(class_1297Var);
                                            new ReceivePacket(new class_2663(class_1297Var, (byte) (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30330, 6137502007965944402L ^ j2) /* invoke-custom */)).call();
                                            return;
                                        }
                                        return;
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -671218091027299786L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused2) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -671218091027299786L, j2) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -671218091027299786L, j2) /* invoke-custom */;
                            }
                        }
                        return;
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -671218091027299786L, j2) /* invoke-custom */;
                    }
                }
                return;
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(numberFormatException, -671218091027299786L, j2) /* invoke-custom */;
            }
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(numberFormatException, -671218091027299786L, j2) /* invoke-custom */;
        } catch (NumberFormatException unused6) {
            numberFormatException = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -671218091027299786L, j2) /* invoke-custom */;
            throw numberFormatException;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:35:0x013c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void x(su.catlean.api.event.events.player.PreSyncEvent r14) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e2.x(su.catlean.api.event.events.player.PreSyncEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [net.minecraft.class_745] */
    @Override // su.catlean._g
    public void b(long j2) {
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1410149083024756880L, j2) /* invoke-custom */;
        Object obj = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (obj > 0) {
            try {
                obj = J;
                class_745 class_745Var = obj;
                if (strArr == null) {
                    if (obj == 0) {
                        return;
                    }
                    class_745 class_745Var2 = J;
                    Intrinsics.checkNotNull(class_745Var2);
                    class_745Var2.method_31745(class_1297.class_5529.field_26998);
                    class_745 class_745Var3 = J;
                    Intrinsics.checkNotNull(class_745Var3);
                    class_745Var = class_745Var3;
                }
                class_745Var.method_36209();
                J = null;
                X.clear();
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1415876695267895103L, j2) /* invoke-custom */;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final Unit n() {
        long j2 = a ^ 90408226716806L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3728122944937439421L, j2) /* invoke-custom */;
        e2 e2Var = g;
        try {
            obj = U;
            boolean z = obj;
            if (obj == 0) {
                z = obj == 0 ? 1 : 0;
            }
            U = z;
            return Unit.INSTANCE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3714092365535790866L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final boolean K() {
        long j2 = a ^ 30407924776797L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3487964857365148518L, j2) /* invoke-custom */;
        try {
            obj = n;
            return obj == 0 ? obj == 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3481373540122445001L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final Unit v() {
        long j2 = a ^ 126645766465740L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1731962784156326665L, j2) /* invoke-custom */;
        e2 e2Var = g;
        try {
            obj = n;
            boolean z = obj;
            if (obj == 0) {
                z = obj == 0 ? 1 : 0;
            }
            n = z;
            return Unit.INSTANCE;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1747051122028145832L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static final boolean x() {
        long j2 = a ^ 116706682169063L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6206580351858169124L, j2) /* invoke-custom */;
        try {
            obj = U;
            return obj == 0 ? obj == 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6203106739694740109L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 102903668308766L;
        long j3 = j2 ^ 67912447947555L;
        long j4 = j2 ^ 75366161962990L;
        long j5 = j2 ^ 39634534155494L;
        long j6 = j2 ^ 90860003169709L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[16];
        int i4 = 0;
        String str = "Qé\u0005þæ¿7\u0086]{út\u000f¥2§¿ `sÿ°È¹\u0010\u0096üÈp;õÃÀ W7fº¦>m(6û,~\u0019A\u0081\u0000oô\u0012\u0081r\u008fÀA\u00176µ=¡bÕ*\u0004Íå#Æ\u0091P\u0092#W¿\u0012\u0083\u008f¸\u0002 >ð[¡\u0085µé\u0081\u0086Ð\u00033?\u0017\u009aHí\u0018ÆÚtÏ¸ðæ\u008b(©ðîì¢\u0018äf¼ÿèÏ¾Àv\u0002V\u008bûx\u0093\u008b\u0082{ÝÒ\u00ad=ÄD\u0018ÃyÞ\u008c\u0085!3þ\u0081\u0014r@õk\u008d\u0018Ä\u0090[\u0099ÝÅKt ªé}\u0084/\u009fx÷x1ãÐÎ\u0012\u0017P\u0081y^dM}¸\u0085tëò\u0010H:ZÀ@£\u001bôý\u0098àRÆì>Ô]\u0082µ\u009a\u0084!i\f\u0084ÁÊ\u0083\"£\u001d\u0019\fHo,\u000bö\u001bI?\na\u000b-2$^Î\u0006è\u008dyx0Bµ´}f¯ó`äsæÛ\u008bÍ8\u008a¥\u0004¿@\u0017ôßÊ|\u0015\u0087\u000b([!e\u001e]\u000f\u0019|\u001fe0¾¸&£\u00139Ò\u0004¥\u009e\u0090nX§'úX ^/\u001fÖh8·\u0000å£´ø#\u0010lCö¤ó?@mÙD\u001f\u0019ê\u001f\u0089Ý0\u0016\u0080jb\u0091ð³îÈjÆ]ð\u000e8\u00ad=\u0086x»tkûFU«nú¦á°f®\u0016#Ì¡N£c\u001d¼\u001b.R¥x\u0088\u0010`êQ#\u00adÁ9\u0087\u008f¥¤»\u0091z\u0085>@U×±>ºþ)âNsãÖlj÷kd\u0018ñ]\u008f\u0082\u0010µV»û\u0093þ÷#ë2-é&(;\u009d©m&jú\u001aCØF@{í»9µÆ\u009fÂ::l\u0087Æõê h¹ëÅ®ê n\u008fG´r\u0093ÚâUG\u0019É\t<Ð*\u0099óè\u008b_\u0085¶\u0000r";
        int length = "Qé\u0005þæ¿7\u0086]{út\u000f¥2§¿ `sÿ°È¹\u0010\u0096üÈp;õÃÀ W7fº¦>m(6û,~\u0019A\u0081\u0000oô\u0012\u0081r\u008fÀA\u00176µ=¡bÕ*\u0004Íå#Æ\u0091P\u0092#W¿\u0012\u0083\u008f¸\u0002 >ð[¡\u0085µé\u0081\u0086Ð\u00033?\u0017\u009aHí\u0018ÆÚtÏ¸ðæ\u008b(©ðîì¢\u0018äf¼ÿèÏ¾Àv\u0002V\u008bûx\u0093\u008b\u0082{ÝÒ\u00ad=ÄD\u0018ÃyÞ\u008c\u0085!3þ\u0081\u0014r@õk\u008d\u0018Ä\u0090[\u0099ÝÅKt ªé}\u0084/\u009fx÷x1ãÐÎ\u0012\u0017P\u0081y^dM}¸\u0085tëò\u0010H:ZÀ@£\u001bôý\u0098àRÆì>Ô]\u0082µ\u009a\u0084!i\f\u0084ÁÊ\u0083\"£\u001d\u0019\fHo,\u000bö\u001bI?\na\u000b-2$^Î\u0006è\u008dyx0Bµ´}f¯ó`äsæÛ\u008bÍ8\u008a¥\u0004¿@\u0017ôßÊ|\u0015\u0087\u000b([!e\u001e]\u000f\u0019|\u001fe0¾¸&£\u00139Ò\u0004¥\u009e\u0090nX§'úX ^/\u001fÖh8·\u0000å£´ø#\u0010lCö¤ó?@mÙD\u001f\u0019ê\u001f\u0089Ý0\u0016\u0080jb\u0091ð³îÈjÆ]ð\u000e8\u00ad=\u0086x»tkûFU«nú¦á°f®\u0016#Ì¡N£c\u001d¼\u001b.R¥x\u0088\u0010`êQ#\u00adÁ9\u0087\u008f¥¤»\u0091z\u0085>@U×±>ºþ)âNsãÖlj÷kd\u0018ñ]\u008f\u0082\u0010µV»û\u0093þ÷#ë2-é&(;\u009d©m&jú\u001aCØF@{í»9µÆ\u009fÂ::l\u0087Æõê h¹ëÅ®ê n\u008fG´r\u0093ÚâUG\u0019É\t<Ð*\u0099óè\u008b_\u0085¶\u0000r".length();
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
                            b = strArr;
                            c = new String[16];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i10 = 0;
                            String str3 = "!¹5¹/L°Y¦\u0096\u0086·Â|\u008d\u0095\u0001\u008aÛMtâ\u0082\u0084lü¾sÖ!²\u0086Ãb{CoÎ¨'ý\u0002Ñ\u0010©¬\\\u0099";
                            int length2 = "!¹5¹/L°Y¦\u0096\u0086·Â|\u008d\u0095\u0001\u008aÛMtâ\u0082\u0084lü¾sÖ!²\u0086Ãb{CoÎ¨'ý\u0002Ñ\u0010©¬\\\u0099".length();
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
                                                h = jArr;
                                                j = new Integer[8];
                                                e = new KProperty[]{Reflection.property1(new PropertyReference1Impl(e2.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13993, 7822679504312555298L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6379, 3510318399540525410L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e2.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7611, 5079378093071596593L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24655, 2816698455304176064L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e2.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25161, 2678042125202129866L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18239, 7845660326704850616L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(e2.class, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20467, 4585669082078686845L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10293, 1025265783823583672L ^ j2) /* invoke-custom */, 0))};
                                                g = new e2(j4);
                                                i = yp.y(g, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11316, 6206286359769533876L ^ j2) /* invoke-custom */, e2::n, j6, (h) null, e2::K, 4, (Object) null);
                                                f = yp.y(g, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1322, 6806273388931081391L ^ j2) /* invoke-custom */, e2::v, j6, (h) null, e2::x, 4, (Object) null);
                                                A = yp.t(g, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3852, 5753714272846343821L ^ j2) /* invoke-custom */, true, j3, null, null, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10201, 4948276381284702540L ^ j2) /* invoke-custom */, null);
                                                S = yp.x(g, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23412, 6770287728127195888L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7538, 3938394458424081662L ^ j2) /* invoke-custom */, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20824, 8093110620276453326L ^ j2) /* invoke-custom */, j5, (Object) null);
                                                X = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j9;
                                            if (i11 >= length2) {
                                                str3 = "}sðî\u0088¸\u000e°{\u0004ò\u0006\u0081ryï";
                                                length2 = "}sðî\u0088¸\u000e°{\u0004ò\u0006\u0081ryï".length();
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
                        str = "¹Ç\u001cï\u001e`Yó'\u0095»\u0012^x½jÈÓq&¬4º^í=\\Ìk\u0019T©\u0010¯\u0004WÔm\u0097´\u0007:Ø4ü\u001bf,q";
                        length = "¹Ç\u001cï\u001e`Yó'\u0095»\u0012^x½jÈÓq&¬4º^í=\\Ìk\u0019T©\u0010¯\u0004WÔm\u0097´\u0007:Ø4ü\u001bf,q".length();
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 21620;
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
                throw new RuntimeException("su/catlean/e2", e2);
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
            java.lang.String r1 = "su/catlean/e2"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 2916;
        if (j[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) h[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/e2", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            j[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return j[i3].intValue();
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
            java.lang.String r1 = "su/catlean/e2"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e2.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
