package su.catlean;

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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2386;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3609;
import net.minecraft.class_3611;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.EntityPushEvent;
import su.catlean.api.event.events.player.PushOutOfBlocksEvent;
import su.catlean.api.event.events.world.WaterPushEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_1.class */
public final class _1 extends _g {

    @NotNull
    public static final _1 g;
    static final KProperty[] c;

    @NotNull
    private static final cq N;

    @NotNull
    private static final cq m;

    @NotNull
    private static final cq i;

    @NotNull
    private static final cq A;
    private static final long a = yz.a(-2209060970001580517L, -4265645779473533937L, MethodHandles.lookup().lookupClass()).a(147079701834060L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map j;

    /* JADX WARN: Illegal instructions before constructor call */
    private _1(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1730, 990159431446474362L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 66128145277397L);
    }

    private final boolean L(long j2) {
        return ((Boolean) N.E(this, (a ^ j2) ^ 77673158085343L, c[0])).booleanValue();
    }

    private final void g(long j2, boolean z) {
        N.b(this, (a ^ j2) ^ 135319005421740L, c[0], Boolean.valueOf(z));
    }

    private final boolean Q(long j2) {
        return ((Boolean) m.E(this, (a ^ j2) ^ 124680145376065L, c[1])).booleanValue();
    }

    private final void o(int i2, int i3, int i4, boolean z) {
        m.b(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) i4) << 48) >>> 48)) ^ a) ^ 105419778863522L, c[1], Boolean.valueOf(z));
    }

    private final boolean e(long j2) {
        return ((Boolean) i.E(this, (a ^ j2) ^ 42296362282973L, c[2])).booleanValue();
    }

    private final void L(boolean z, long j2) {
        i.b(this, (a ^ j2) ^ 106435389063337L, c[2], Boolean.valueOf(z));
    }

    private final boolean G(int i2, int i3, char c2) {
        return ((Boolean) A.E(this, ((((((long) i2) << 32) | ((((long) i3) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 88686020013261L, c[3])).booleanValue();
    }

    private final void t(long j2, boolean z) {
        A.b(this, (a ^ j2) ^ 131717699178825L, c[3], Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(su.catlean.api.event.events.network.ReceivePacket r9) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._1.L(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean.api.event.events.world.WaterPushEvent] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.minecraft.class_2350] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [su.catlean.api.event.events.world.WaterPushEvent] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [su.catlean._1] */
    @Flow
    private final void d(WaterPushEvent waterPushEvent) {
        long j2 = a ^ 83205700170259L;
        long j3 = j2 ^ 129245270466616L;
        long j4 = j2 ^ 137619621491082L;
        long j5 = j2 ^ 49596326760906L;
        ?? F = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4892152475661065331L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    if (e(j5)) {
                        F = zf.F(j3);
                        ?? F2 = F;
                        if (F == 0) {
                            if (((class_310) F).field_1687 == null) {
                                return;
                            } else {
                                F2 = zf.F(j3);
                            }
                        }
                        try {
                            F2 = ((class_310) F2).field_1724;
                            if (F2 == 0) {
                                return;
                            }
                            class_2338 class_2339Var = new class_2338.class_2339();
                            class_243 class_243Var = class_243.field_1353;
                            Intrinsics.checkNotNullExpressionValue(class_243Var, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32010, 4202410909043972557L ^ j2) /* invoke-custom */);
                            class_243 class_243Var2 = class_243Var;
                            ?? BooleanValue = waterPushEvent;
                            ?? r0 = BooleanValue;
                            if (F == 0) {
                                try {
                                    BooleanValue = ((Boolean) BooleanValue.getState().method_11654(class_3609.field_15902)).booleanValue();
                                    if (BooleanValue != 0) {
                                        Iterator it = class_2350.class_2353.field_11062.iterator();
                                        Intrinsics.checkNotNullExpressionValue(it, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22288, 675941113682850765L ^ j2) /* invoke-custom */);
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            Intrinsics.checkNotNullExpressionValue(next, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11351, 2408297107224168580L ^ j2) /* invoke-custom */);
                                            ?? V = (class_2350) next;
                                            try {
                                                class_2339Var.method_25505(waterPushEvent.getPos(), (class_2350) V);
                                                V = F;
                                                if (V == 0) {
                                                    V = F;
                                                    if (V != 0) {
                                                        break;
                                                    }
                                                    try {
                                                        try {
                                                            V = V(waterPushEvent.getFluid(), j4, class_2339Var, V);
                                                            if (V == 0) {
                                                                try {
                                                                    class_3611 fluid = waterPushEvent.getFluid();
                                                                    class_2338 class_2338VarMethod_10084 = class_2339Var.method_10084();
                                                                    Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_10084, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3268, 1135265763238914069L ^ j2) /* invoke-custom */);
                                                                    if (!V(fluid, j4, class_2338VarMethod_10084, V) && F == 0) {
                                                                    }
                                                                } catch (NumberFormatException unused) {
                                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -4861440270998371988L, j2) /* invoke-custom */;
                                                                }
                                                            }
                                                            class_243 class_243VarMethod_1031 = class_243Var2.method_1029().method_1031(0.0d, -6.0d, 0.0d);
                                                            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13838, 2659408317385151186L ^ j2) /* invoke-custom */);
                                                            class_243Var2 = class_243VarMethod_1031;
                                                            break;
                                                        } catch (NumberFormatException unused2) {
                                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -4861440270998371988L, j2) /* invoke-custom */;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -4861440270998371988L, j2) /* invoke-custom */;
                                                    }
                                                }
                                                return;
                                            } catch (NumberFormatException unused4) {
                                                V = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -4861440270998371988L, j2) /* invoke-custom */;
                                                throw V;
                                            }
                                        }
                                    }
                                    class_243 class_243VarMethod_1029 = class_243Var2.method_1029();
                                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1029, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7909, 3162540429958003248L ^ j2) /* invoke-custom */);
                                    waterPushEvent.setVec(class_243VarMethod_1029);
                                    r0 = waterPushEvent;
                                } catch (NumberFormatException unused5) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(BooleanValue, -4861440270998371988L, j2) /* invoke-custom */;
                                }
                            }
                            r0.cancel();
                        } catch (NumberFormatException unused6) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, -4861440270998371988L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused7) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -4861440270998371988L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused8) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -4861440270998371988L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused9) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -4861440270998371988L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.player.PushOutOfBlocksEvent] */
    @Flow
    private final void z(PushOutOfBlocksEvent pushOutOfBlocksEvent) {
        long j2 = a ^ 51772737616010L;
        Object obj = j2;
        try {
            if (L(obj ^ 45570839854673L)) {
                obj = pushOutOfBlocksEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8507815839767776245L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.player.EntityPushEvent] */
    @Flow
    private final void n(EntityPushEvent entityPushEvent) {
        long j2 = a ^ 67970580743122L;
        Object obj = j2;
        try {
            if (Q(obj ^ 13693554351255L)) {
                obj = entityPushEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 957515928386187437L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private final boolean V(class_3611 class_3611Var, long j2, class_2338 class_2338Var, class_2350 class_2350Var) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 10882543742545L;
        int i2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-9010634244174668443L, j3) /* invoke-custom */;
        class_2680 class_2680VarMethod_8320 = zf.z(j4).method_8320(class_2338Var);
        Object objMethod_15780 = 0;
        try {
            objMethod_15780 = zf.z(j4).method_8316(class_2338Var).method_15772().method_15780(class_3611Var);
            if (i2 != 0) {
                return objMethod_15780;
            }
            if (objMethod_15780 != 0) {
                return false;
            }
            Object obj = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (obj >= 0) {
                try {
                    obj = class_2350Var;
                    if (obj == class_2350.field_11036) {
                        return true;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -9051972400869130364L, j3) /* invoke-custom */;
                }
            }
            Object obj2 = class_2680VarMethod_8320;
            class_2680 class_2680Var = obj2;
            if (i2 == 0) {
                try {
                    try {
                        obj2 = obj2.method_26204() instanceof class_2386;
                        if (obj2 != 0) {
                            return false;
                        }
                        class_2680Var = class_2680VarMethod_8320;
                    } catch (NumberFormatException unused2) {
                        obj2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -9051972400869130364L, j3) /* invoke-custom */;
                        throw obj2;
                    }
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -9051972400869130364L, j3) /* invoke-custom */;
                }
            }
            return class_2680Var.method_26206(zf.z(j4), class_2338Var, class_2350Var);
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_15780, -9051972400869130364L, j3) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 131770210362494L;
        long j3 = j2 ^ 117415702631794L;
        long j4 = j2 ^ 121836491763150L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[20];
        int i4 = 0;
        String str = "\u0093\u001f\u0013¶W'\u0003R\u0013tA¦\u0086\u001b4C\u0003#v\u0017\u00859\u0013·\u009a\u0003\u009a\u009c®\u0095'b\u0010d\u0097²#ÆM×m¥öÔv\u009a\u0018o[ í¹TÓA\u0012,¡\u0015\bÿ\u0003þ0¼I\u008b\nNLZUWè\u009cV\u0013\u008c\u008cü¨Ó O\u00ad\u0019\u0002Gµ5\bï}i\u00193PÙhDã/-¬ìà\u0088}\u000eÅ·o¾1\u000e\u00187UÁ7¡é³J\u0098-\u008d|]ûóoÅfð\u0098\u0093\"\u0096)\u0010òõ\u0003ý}©\u0095[+\u000f\u0083X©4:\u0012 m\u0011ßk\u001e,´I\u00adR\u007f×KXÒÌuLd\u0095\u0007~NÑ\u0019\u0007n\u0007%p/¸\u0010\u0016(y\u001fJ?ó4%ÓÑ3\u0006\u008d\u008c\u001f \u008eiôS{ÉÉÛà\u007fa\u0095=ü\u0090*µ`¯)S¢1ä\u0086Vô\u009c\u008a\u0091RÝ\u0018D]]\u008cÑO9ø*\u0004\u008b\u0013\u0005w©¾%ßÓØ©\u0096E3\u0090î;C\u000fÄ%ÅCñ³L)Ã£é\u0004\u008aÁ\u009e\u0081Þ\u0018X\u0092Pâ\u001cK¬#ÃT\r·q¢\u0095¿¼\u001b\u008dÂèWw^~ÆHÔ\u008e\u0015¡çSC\"ÕX\"\u0015T\u00994öØÛ;ñ\u0018\u0095M©ÎÃùö\u008dÿ5Ù£'µÝÄ&\u009b«<E\u008dä¹Ä\r\u001f@\u0085Ñ\u000f'\u0097x\u0018\u007f\u008c\u00057P\u00ad WÙÝ¸'\u008fî)\u0007ñ]dësìÙ\u000b>\u008f¢2SÛ°³e\u000f\t\u0002¦pK\u0018k.j\u0082\u00052\u0093åbWôjT\u0005\u00846¹ïñ\u009b\u009d\u0087×a ÜäCP\u0092\u0085S\u0012Ñ´FÏ|\u008eÜ\u0094Ò}ª¿Üº\u001béÌº\u008eý\u0006(8´ 8q\u000fÖ\u0084=2\u0003«vC\u0087%´\u001cF[\u0011\\\u0089°ØØh\u008bª¤¸ÒlE\u009a(åa\u001c\u009b:Þ\u009b´ =É\u0084fª¦«pÓÊ²_\n÷.rt\u009d\u0080¸\u009aLÄÀæêàRÑÎñ VdYu\u0088\u0015_ÝÑS~ó«ØÚ!l\u008f\r\u008bM\u001dP·å-ôNið\u008e¹\u0010ñ¯õïe[Â*¿à\u0018À\u0087\u0017ôO\u0010\u0090iv\u009cÉZ\r¦&\u009cKÃÊ\u0014s(";
        int length = "\u0093\u001f\u0013¶W'\u0003R\u0013tA¦\u0086\u001b4C\u0003#v\u0017\u00859\u0013·\u009a\u0003\u009a\u009c®\u0095'b\u0010d\u0097²#ÆM×m¥öÔv\u009a\u0018o[ í¹TÓA\u0012,¡\u0015\bÿ\u0003þ0¼I\u008b\nNLZUWè\u009cV\u0013\u008c\u008cü¨Ó O\u00ad\u0019\u0002Gµ5\bï}i\u00193PÙhDã/-¬ìà\u0088}\u000eÅ·o¾1\u000e\u00187UÁ7¡é³J\u0098-\u008d|]ûóoÅfð\u0098\u0093\"\u0096)\u0010òõ\u0003ý}©\u0095[+\u000f\u0083X©4:\u0012 m\u0011ßk\u001e,´I\u00adR\u007f×KXÒÌuLd\u0095\u0007~NÑ\u0019\u0007n\u0007%p/¸\u0010\u0016(y\u001fJ?ó4%ÓÑ3\u0006\u008d\u008c\u001f \u008eiôS{ÉÉÛà\u007fa\u0095=ü\u0090*µ`¯)S¢1ä\u0086Vô\u009c\u008a\u0091RÝ\u0018D]]\u008cÑO9ø*\u0004\u008b\u0013\u0005w©¾%ßÓØ©\u0096E3\u0090î;C\u000fÄ%ÅCñ³L)Ã£é\u0004\u008aÁ\u009e\u0081Þ\u0018X\u0092Pâ\u001cK¬#ÃT\r·q¢\u0095¿¼\u001b\u008dÂèWw^~ÆHÔ\u008e\u0015¡çSC\"ÕX\"\u0015T\u00994öØÛ;ñ\u0018\u0095M©ÎÃùö\u008dÿ5Ù£'µÝÄ&\u009b«<E\u008dä¹Ä\r\u001f@\u0085Ñ\u000f'\u0097x\u0018\u007f\u008c\u00057P\u00ad WÙÝ¸'\u008fî)\u0007ñ]dësìÙ\u000b>\u008f¢2SÛ°³e\u000f\t\u0002¦pK\u0018k.j\u0082\u00052\u0093åbWôjT\u0005\u00846¹ïñ\u009b\u009d\u0087×a ÜäCP\u0092\u0085S\u0012Ñ´FÏ|\u008eÜ\u0094Ò}ª¿Üº\u001béÌº\u008eý\u0006(8´ 8q\u000fÖ\u0084=2\u0003«vC\u0087%´\u001cF[\u0011\\\u0089°ØØh\u008bª¤¸ÒlE\u009a(åa\u001c\u009b:Þ\u009b´ =É\u0084fª¦«pÓÊ²_\n÷.rt\u009d\u0080¸\u009aLÄÀæêàRÑÎñ VdYu\u0088\u0015_ÝÑS~ó«ØÚ!l\u008f\r\u008bM\u001dP·å-ôNið\u008e¹\u0010ñ¯õïe[Â*¿à\u0018À\u0087\u0017ôO\u0010\u0090iv\u009cÉZ\r¦&\u009cKÃÊ\u0014s(".length();
        char cCharAt = ' ';
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
                        if (i8 >= length) {
                            b = strArr;
                            d = new String[20];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i10 = 0;
                            int length2 = "á¦\u0014_¹\u009f§ËH|\u008eÕ\u0083}~\u0096ú\u000f\u000fV7þ:Ã".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "á¦\u0014_¹\u009f§ËH|\u008eÕ\u0083}~\u0096ú\u000f\u000fV7þ:Ã".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            f = jArr;
                            h = new Integer[3];
                            c = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(_1.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3313, 3563646441975725646L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14465, 6345284691472157226L ^ j2) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(_1.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27982, 8373832937811369981L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(798, 7812305098873581993L ^ j2) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(_1.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27870, 1916222348266036839L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14512, 6850098776963844618L ^ j2) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(_1.class, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24088, 4717752314815409325L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30652, 6770761294597637386L ^ j2) /* invoke-custom */, 0))};
                            g = new _1(j3);
                            N = yp.t(g, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16414, 4669064217150845603L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5720, 5222427651712553604L ^ j2) /* invoke-custom */, null);
                            m = yp.t(g, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(106, 7699396804236358366L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30009, 4302029489181651428L ^ j2) /* invoke-custom */, null);
                            i = yp.t(g, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15991, 6599351871984241886L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30009, 4302029489181651428L ^ j2) /* invoke-custom */, null);
                            A = yp.t(g, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29620, 7585937895126712591L ^ j2) /* invoke-custom */, true, j4, null, null, (int) c(MethodHandles.lookup(), "h", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30009, 4302029489181651428L ^ j2) /* invoke-custom */, null);
                            return;
                        }
                        cCharAt = str.charAt(i2);
                        break;
                        break;
                    default:
                        int i13 = i4;
                        i4++;
                        strArr[i13] = strIntern;
                        int i14 = i6 + cCharAt;
                        i5 = i14;
                        if (i14 < length) {
                        }
                        str = "ØBCô4£($\u001a,%3tæ\u008ez\u0018R¾å~ó\u0001!\b²3Ô¼\u0002\u0092\u0080\u009cØTÝßÀ\u007füÈ";
                        length = "ØBCô4£($\u001a,%3tæ\u008ez\u0018R¾å~ó\u0001!\b²3Ô¼\u0002\u0092\u0080\u009cØTÝßÀ\u007füÈ".length();
                        cCharAt = 16;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 6564;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/_1", e2);
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 12224;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_1", e2);
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._1.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
