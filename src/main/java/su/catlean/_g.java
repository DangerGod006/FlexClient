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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.gofra.Gofra;
import su.catlean.interfaces.IEntity;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_g.class */
public abstract class _g implements jk, ap {
    static final /* synthetic */ KProperty[] Q;

    @NotNull
    private final String H;

    @NotNull
    private final fu Z;

    @NotNull
    private final List R;

    @NotNull
    private final List s;

    @NotNull
    private final List M;

    @NotNull
    private final String r;

    @NotNull
    private final cq p;

    @NotNull
    private final av q;
    private static _g[] v;
    private static final long bb = yz.a(-3043674970192207614L, 1371597856073184348L, MethodHandles.lookup().lookupClass()).a(107184716577853L);
    private static final String[] cb;
    private static final String[] db;
    private static final Map eb;
    private static final long[] ib;
    private static final Integer[] jb;
    private static final Map kb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01dd A[EDGE_INSN: B:29:0x01dd->B:23:0x01dd BREAK  A[LOOP:0: B:3:0x00e9->B:30:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:3:0x00e9->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v46, types: [char, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public _g(@org.jetbrains.annotations.NotNull java.lang.String r17, long r18, @org.jetbrains.annotations.NotNull su.catlean.fu r20, @org.jetbrains.annotations.NotNull java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._g.<init>(java.lang.String, long, su.catlean.fu, java.util.List):void");
    }

    public /* synthetic */ _g(String str, fu fuVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker, long j) {
        this(str, (bb ^ j) ^ 131338971641388L, fuVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final String U() {
        return this.H;
    }

    @NotNull
    public final fu N() {
        return this.Z;
    }

    @NotNull
    public final List y() {
        return this.R;
    }

    @Override // su.catlean.jk
    @NotNull
    public List c() {
        return this.s;
    }

    @Override // su.catlean.jk
    @NotNull
    public List u() {
        return this.M;
    }

    @NotNull
    public final String k() {
        return this.r;
    }

    public boolean f(long j) {
        return ((Boolean) this.p.E(this, (bb ^ j) ^ 128914247344321L, Q[0])).booleanValue();
    }

    public void D(boolean z, long a) {
        this.p.b(this, (bb ^ a) ^ 118458727976576L, Q[0], Boolean.valueOf(z));
    }

    @NotNull
    public lj m(long j) {
        return (lj) this.q.E(this, (bb ^ j) ^ 52953970470808L, Q[1]);
    }

    public void N(@NotNull lj ljVar, long a) {
        long j = bb ^ a;
        Intrinsics.checkNotNullParameter(ljVar, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17006, 6702514856746684029L ^ j) /* invoke-custom */);
        this.q.b(this, j ^ 72853237704863L, Q[1], ljVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_638] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    public final boolean S(long j) {
        long j2 = bb ^ j;
        Object obj = j2;
        long j3 = obj ^ 117379517128771L;
        try {
            try {
                if (zf.F(j3).field_1724 != null) {
                    obj = zf.F(j3).field_1687;
                    if (obj != 0) {
                        return true;
                    }
                }
                return false;
            } catch (NumberFormatException unused) {
                obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -152707972514290327L, j2) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -152707972514290327L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // su.catlean.ap
    public void J(long j) {
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 67469537118988L) << 8) >>> 8;
        long j3 = j ^ 65469789313429L;
        long j4 = j ^ 130783482560314L;
        ?? F = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-530648882990635844L, j) /* invoke-custom */;
        try {
            F = this;
            ?? r0 = F;
            if (F == 0) {
                try {
                    try {
                        F = F.f(j4);
                        if (F != 0) {
                            d(j3);
                            if (F == 0) {
                                return;
                            }
                        }
                        r0 = this;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -441309543108615832L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -441309543108615832L, j) /* invoke-custom */;
                }
            }
            r0.o((byte) i, j2);
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, -441309543108615832L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.ap
    public void o(byte b, long j) {
        long j2 = (((long) b) << 56) | ((j << 8) >>> 8);
        long j3 = j2 ^ 39325524053189L;
        int i = (int) ((j3 << 32) >>> 40);
        int i2 = (int) ((j3 << 56) >>> 56);
        D(true, j2 ^ 106488220257691L);
        Gofra.INSTANCE.unplug(this);
        Gofra.INSTANCE.plug(this);
        O(j2 ^ 23933300365065L);
        sg.J((int) (j2 >>> 32), sg.H, this.r, o2.f(this, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(112, 8599995219845205255L ^ j2) /* invoke-custom */, new Object[0], true, j2 ^ 81931170417796L), i, (byte) i2, 1, ys.ENABLED, null, (int) d(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31161, 5824726422589335603L ^ j2) /* invoke-custom */, null);
    }

    public final void F(@NotNull String message, long a) {
        long j = bb ^ a;
        Intrinsics.checkNotNullParameter(message, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23736, 4000527845647439966L ^ j) /* invoke-custom */);
        d(j ^ 1651841063680L);
        o2.S(this, message, false, 2, null, j ^ 10100720735646L);
    }

    @Override // su.catlean.ap
    public void d(long j) {
        long j2 = j ^ 40765843988060L;
        int i = (int) ((j2 << 32) >>> 40);
        int i2 = (int) ((j2 << 56) >>> 56);
        D(false, j ^ 112210832039682L);
        Gofra.INSTANCE.unplug(this);
        b(j ^ 57994491392730L);
        sg.J((int) (j >>> 32), sg.H, this.r, o2.f(this, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6082, 1027342145644513318L ^ j) /* invoke-custom */, new Object[0], true, j ^ 83922319646237L), i, (byte) i2, 1, ys.DISABLED, null, (int) d(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2105, 4591448349418162991L ^ j) /* invoke-custom */, null);
    }

    public void O(long j) {
    }

    public void b(long j) {
    }

    @NotNull
    public final class_243 J(byte a, long a2, @NotNull class_1297 $this$pos) {
        long j = ((((long) a) << 56) | ((a2 << 8) >>> 8)) ^ bb;
        Intrinsics.checkNotNullParameter($this$pos, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22417, 2317743060261917053L ^ j) /* invoke-custom */);
        class_243 class_243VarCatLean$getPosition = ((IEntity) $this$pos).catLean$getPosition();
        Intrinsics.checkNotNullExpressionValue(class_243VarCatLean$getPosition, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8148, 4989746937950542128L ^ j) /* invoke-custom */);
        return class_243VarCatLean$getPosition;
    }

    static {
        int i;
        long j = bb ^ 115016563258759L;
        eb = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 2185570875078087785L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[18];
        int i3 = 0;
        String str = "H<µ'Îð\u0097\u000b]¥aù\u009bnÍ² P«\u008a\u001e\u0005x\n\u0095ç\u001dºlÜ\u007f\bH\u0014kä\u00ad\u0097Õê\u001f\u0007\u0083§/*&ëR\u0018\u001e\u0019¢P(M8©\u0088)\u0004|m}qv¨fS\u0085À,`\u000e\u0010_{K\t«+É}VË5cÆÆ\u0091!(h,Dÿ>#ìy\u0006áZÙ)åÐ¸R\n:ZÝµý¯½-áJhÀ\u0012Næè¤©j·\u0011ð\u0010k\u0097\u0006ª\u0013ÒÙ´¾¬¯ÌXR4Ý\u0010Ç¡\u001c\u009fè¹h%2jMÎ9eb{\u0010 ·\u00066º_Ü'´ÉJÕ\u0018,]ó ÈÙ±\u0013ù|Ð-H>GC\u0018±Å\u0085\u001c±!YIqJpVÐü\u001fV\u008a¬Ô\u0010¶\u001d\u007f\u008fZ\u0019\u001a/ \u0019\u0017¤m\u000b\u0081!8Ð¿û\u0011jk\u0005<!-f2Ä\u0002øx\u0010\u009aÏÁÁ\u00198)smòÁ]±æVÂ\u0005Óð½\u0006#\u001a<\u008b°ýc\u0086<ôÉ3@ñ\nJ_ä8é\u0086xU½6û\u001a¥\u0087ÌI\u001e/l\u001a×TC\u009b)\u0015\u0087\u0005ÿ\u0096rùQx\u0084H\u0001\u0007Ï\u0090ü¡òSLª³µjj\u008a^Í\u001b¬ec¶\u0015æXÂåYi\u0082¢Anr\u0080J\u0002\u0088ý\u009aµ\\\u0004:\f\u001bÏ«\u0085\u009cF}ûÉ18?%\u0081PcvO¸CPÊfwG\u009a´«\u0005ï0\u001aò)\u0017E\u0085oÊJ+ÐP\u001dqÂ¿BñìÀSçØ-èû\u0089É\u0089\u0088¡ÞWç¬(q\u0010õ¬AÖ\u0007Yf\u000bR Ô\u001b0Ä¥ð\u0010¨óØa\u0080\u001cT4©\u0094üx\u0089ÿ\u001f\u008b\u0010\u0083Éðt\u0088Ó¼\u001dq\u0099YR!JK\u0085";
        int length = "H<µ'Îð\u0097\u000b]¥aù\u009bnÍ² P«\u008a\u001e\u0005x\n\u0095ç\u001dºlÜ\u007f\bH\u0014kä\u00ad\u0097Õê\u001f\u0007\u0083§/*&ëR\u0018\u001e\u0019¢P(M8©\u0088)\u0004|m}qv¨fS\u0085À,`\u000e\u0010_{K\t«+É}VË5cÆÆ\u0091!(h,Dÿ>#ìy\u0006áZÙ)åÐ¸R\n:ZÝµý¯½-áJhÀ\u0012Næè¤©j·\u0011ð\u0010k\u0097\u0006ª\u0013ÒÙ´¾¬¯ÌXR4Ý\u0010Ç¡\u001c\u009fè¹h%2jMÎ9eb{\u0010 ·\u00066º_Ü'´ÉJÕ\u0018,]ó ÈÙ±\u0013ù|Ð-H>GC\u0018±Å\u0085\u001c±!YIqJpVÐü\u001fV\u008a¬Ô\u0010¶\u001d\u007f\u008fZ\u0019\u001a/ \u0019\u0017¤m\u000b\u0081!8Ð¿û\u0011jk\u0005<!-f2Ä\u0002øx\u0010\u009aÏÁÁ\u00198)smòÁ]±æVÂ\u0005Óð½\u0006#\u001a<\u008b°ýc\u0086<ôÉ3@ñ\nJ_ä8é\u0086xU½6û\u001a¥\u0087ÌI\u001e/l\u001a×TC\u009b)\u0015\u0087\u0005ÿ\u0096rùQx\u0084H\u0001\u0007Ï\u0090ü¡òSLª³µjj\u008a^Í\u001b¬ec¶\u0015æXÂåYi\u0082¢Anr\u0080J\u0002\u0088ý\u009aµ\\\u0004:\f\u001bÏ«\u0085\u009cF}ûÉ18?%\u0081PcvO¸CPÊfwG\u009a´«\u0005ï0\u001aò)\u0017E\u0085oÊJ+ÐP\u001dqÂ¿BñìÀSçØ-èû\u0089É\u0089\u0088¡ÞWç¬(q\u0010õ¬AÖ\u0007Yf\u000bR Ô\u001b0Ä¥ð\u0010¨óØa\u0080\u001cT4©\u0094üx\u0089ÿ\u001f\u008b\u0010\u0083Éðt\u0088Ó¼\u001dq\u0099YR!JK\u0085".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            cb = strArr;
                            db = new String[18];
                            kb = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i9 = 0;
                            String str3 = "¸kb \u0084Ðé®¨\u0012-K\u008e!\u008eîûjq\u008c\u0082)¨i-3\n&\u0083µ\u001e\u009fNãàîãËÍ\"";
                            int length2 = "¸kb \u0084Ðé®¨\u0012-K\u008e!\u008eîûjq\u008c\u0082)¨i-3\n&\u0083µ\u001e\u009fNãàîãËÍ\"".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                ib = jArr;
                                                jb = new Integer[7];
                                                Q = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(_g.class, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15224, 561622115098434423L ^ j) /* invoke-custom */, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12178, 1872429915383664534L ^ j) /* invoke-custom */, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(_g.class, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1161, 3947316920325645449L ^ j) /* invoke-custom */, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8099, 8941560251010465711L ^ j) /* invoke-custom */, 0))};
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j4;
                                            if (i10 >= length2) {
                                                str3 = "¦à¿Ø\u0094¬\u0082FEB½3Aç÷\u0015";
                                                length2 = "¦à¿Ø\u0094¬\u0082FEB½3Aç÷\u0015".length();
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
                                    b3 = 0;
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
                        str = "\u008f3\u0005m\u0010ô¬ï²%\u009e\u008e\u0084M\u0007\u009c\u0010\u000ep\u0012Õ¬T·µ\u0011\bY+üSk\u0012";
                        length = "\u008f3\u0005m\u0010ô¬ï²%\u009e\u008e\u0084M\u0007\u009c\u0010\u000ep\u0012Õ¬T·µ\u0011\bY+üSk\u0012".length();
                        cCharAt = 16;
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
        }
    }

    public static void c(_g[] _gVarArr) {
        v = _gVarArr;
    }

    public static _g[] X() {
        return v;
    }

    private static NumberFormatException b(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(byte[] bArr) {
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
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16245;
        if (db[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) eb.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                db[i2] = a(((Cipher) objArr[0]).doFinal(cb[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_g", e);
            }
        }
        return db[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
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
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/_g"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._g.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 25485;
        if (jb[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) ib[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) kb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    kb.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_g", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            jb[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return jb[i2].intValue();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iD;
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
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/_g"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._g.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
