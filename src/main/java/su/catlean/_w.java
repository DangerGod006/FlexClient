package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_w.class */
public final class _w {

    @NotNull
    public static final ye W;
    private float e;
    private float r;
    private boolean B;

    @NotNull
    private z3 V;
    private static boolean w;
    private static final long a = yz.a(-2844651197561317818L, 6619009265279355071L, MethodHandles.lookup().lookupClass()).a(77942568895954L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public _w(long a2, float yaw, float pitch, boolean grim, @NotNull z3 moveFix) {
        Intrinsics.checkNotNullParameter(moveFix, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14449, 5979634937853002010L ^ (a ^ a2)) /* invoke-custom */);
        this.e = yaw;
        this.r = pitch;
        this.B = grim;
        this.V = moveFix;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public _w(float f2, long j, float f3, boolean z, z3 z3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = a ^ j;
        this(j2 ^ 68252415187438L, f2, f3, (i & 4) != 0 ? false : z, (i & (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20191, 7537785091283714446L ^ j2) /* invoke-custom */) != 0 ? z3.NONE : z3Var);
    }

    public final float q() {
        return this.e;
    }

    public final void c(float f2) {
        this.e = f2;
    }

    public final float N() {
        return this.r;
    }

    public final void A(float f2) {
        this.r = f2;
    }

    public final boolean R() {
        return this.B;
    }

    public final void g(boolean z) {
        this.B = z;
    }

    @NotNull
    public final z3 n() {
        return this.V;
    }

    public final void b(long a2, @NotNull z3 z3Var) {
        Intrinsics.checkNotNullParameter(z3Var, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6168, 8819174042140235780L ^ (a ^ a2)) /* invoke-custom */);
        this.V = z3Var;
    }

    @NotNull
    public final _w s(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 104589818388316L;
        double dPow = Math.pow((((Number) zf.F(j2 ^ 140437902774650L).field_1690.method_42495().method_41753()).doubleValue() * 0.6d) + 0.2d, 3) * 8.0d * ((double) 0.15f);
        float f2 = this.e;
        LocalPlayerAccessor localPlayerAccessorV = zf.v(j3);
        Intrinsics.checkNotNull(localPlayerAccessorV, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15708, 7087160791424241697L ^ j2) /* invoke-custom */);
        float fMethod_15393 = class_3532.method_15393(f2 - localPlayerAccessorV.getLastYaw());
        float f3 = this.r;
        LocalPlayerAccessor localPlayerAccessorV2 = zf.v(j3);
        Intrinsics.checkNotNull(localPlayerAccessorV2, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31016, 3550096427037807700L ^ j2) /* invoke-custom */);
        float fMethod_153932 = class_3532.method_15393(f3 - localPlayerAccessorV2.getLastPitch());
        double dRoundToInt = ((double) MathKt.roundToInt(((double) fMethod_15393) / dPow)) * dPow;
        double dRoundToInt2 = ((double) MathKt.roundToInt(((double) fMethod_153932) / dPow)) * dPow;
        LocalPlayerAccessor localPlayerAccessorV3 = zf.v(j3);
        Intrinsics.checkNotNull(localPlayerAccessorV3, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31016, 3550096427037807700L ^ j2) /* invoke-custom */);
        this.e = localPlayerAccessorV3.getLastYaw() + ((float) dRoundToInt);
        LocalPlayerAccessor localPlayerAccessorV4 = zf.v(j3);
        Intrinsics.checkNotNull(localPlayerAccessorV4, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31016, 3550096427037807700L ^ j2) /* invoke-custom */);
        this.r = RangesKt.coerceIn(localPlayerAccessorV4.getLastPitch() + ((float) dRoundToInt2), -90.0f, 90.0f);
        return this;
    }

    @NotNull
    public final _w n(@NotNull z3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.V = v;
        return this;
    }

    @NotNull
    public final _w b(boolean v) {
        this.B = v;
        return this;
    }

    public final float r() {
        return this.e;
    }

    public final float G() {
        return this.r;
    }

    public final boolean f() {
        return this.B;
    }

    @NotNull
    public final z3 p() {
        return this.V;
    }

    @NotNull
    public final _w G(float yaw, float pitch, long a2, short a3, boolean grim, @NotNull z3 moveFix) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(moveFix, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18945, 3854725268786684004L ^ j) /* invoke-custom */);
        return new _w(j ^ 121320114812262L, yaw, pitch, grim, moveFix);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x005c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean._w H(long r9, su.catlean._w r11, float r12, float r13, boolean r14, su.catlean.z3 r15, int r16, java.lang.Object r17) {
        /*
            long r0 = su.catlean._w.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 116514477306676(0x69f82407f334, double:5.7565800480378E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 16
            long r2 = r2 >>> r3
            r18 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r20 = r2
            r0 = 6861740000058126017(0x5f39cc2ccc8daec1, double:5.277842872457939E150)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r21 = r0
            r0 = r16
            r1 = 1
            r0 = r0 & r1
            r1 = r21
            if (r1 != 0) goto L4b
            if (r0 == 0) goto L47
            goto L42
        L38:
            r1 = 6906065106171677675(0x5fd7459fc9154beb, double:4.875407744345921E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L42:
            r0 = r11
            float r0 = r0.e
            r12 = r0
        L47:
            r0 = r16
            r1 = 2
            r0 = r0 & r1
        L4b:
            r1 = r21
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L72
            if (r1 != 0) goto L70
            if (r0 == 0) goto L6c
            goto L66
        L5c:
            r1 = 6906065106171677675(0x5fd7459fc9154beb, double:4.875407744345921E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L66:
            r0 = r11
            float r0 = r0.r
            r13 = r0
        L6c:
            r0 = r16
            r1 = 4
            r0 = r0 & r1
        L70:
            r1 = r21
        L72:
            if (r1 != 0) goto L9b
            if (r0 == 0) goto L8b
            goto L85
        L7b:
            r1 = 6906065106171677675(0x5fd7459fc9154beb, double:4.875407744345921E153)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r0 = r11
            boolean r0 = r0.B
            r14 = r0
        L8b:
            r0 = r16
            r1 = 17976(0x4638, float:2.519E-41)
            r2 = 1246078993710231738(0x114af63e262cb0ba, double:2.2762686733020993E-225)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_w;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "g"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            r0 = r0 & r1
        L9b:
            if (r0 == 0) goto La4
            r0 = r11
            su.catlean.z3 r0 = r0.V
            r15 = r0
        La4:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r18
            r4 = r20
            short r4 = (short) r4
            r5 = r14
            r6 = r15
            su.catlean._w r0 = r0.G(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._w.H(long, su.catlean._w, float, float, boolean, su.catlean.z3, int, java.lang.Object):su.catlean._w");
    }

    @NotNull
    public String toString() {
        long j = a ^ 26739439727375L;
        return (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6351, 7048279859377155303L ^ j) /* invoke-custom */ + this.e + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(275, 4605035036709860665L ^ j) /* invoke-custom */ + this.r + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27233, 3471297460346576455L ^ j) /* invoke-custom */ + this.B + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21526, 8598814507501936697L ^ j) /* invoke-custom */ + this.V + ")";
    }

    public int hashCode() {
        long j = a ^ 135796301025733L;
        return (((((Float.hashCode(this.e) * (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18682, 3962182843220744099L ^ j) /* invoke-custom */) + Float.hashCode(this.r)) * (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6928, 2635882726709494859L ^ j) /* invoke-custom */) + Boolean.hashCode(this.B)) * (int) b(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6928, 2635882726709494859L ^ j) /* invoke-custom */) + this.V.hashCode();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._w.equals(java.lang.Object):boolean");
    }

    static {
        int i;
        long j = a ^ 28292539799969L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -4750504390999757608L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[9];
        int i3 = 0;
        String str = "\u0098ü·!\u0019ht\u001aÏßÍ\u0019þ~\n¦ \u0016ý\u0097 >:\u0087øZ¥m¿=rakWWþ¹1\u000e\u0090`^\fø ©\u0093óS\u0088òkk|jb\u0080\u0014\u009b\u0082´\u0099æQ\u0083Bh\u001duLÇÄ\u001b1\u0005\\T\u009d\u009cB\u0094¾\u001f\u0003\"]ù\u009b«;PU\u0080Ã\u001fl\u008d.3{R,\u008cH+é¢ çv\u009fvtt7\u0089\u0016Å\u0005ÛP]ì\u009e__\u007fª4Ýg&\u0014àú|\u0086nN\u0012B]\u009e¸\u000b\u001c\u0000 \u0016þ{\u00066\u0095×°Ña\u009cp\u0096Q1\u007fã\u0003ë\u001b\u001e¦E\u0007\\e\u0013\u0001\u0017ä_ý\u0010D}\u001cy½\u0090Y\u0087©Uò>þ\u00adÈ\f\\¤Î\u0013 ïB\u0097\u0013Cò^«\u008e5Ø±·÷(V\u0081ãA9÷iKvs\u0096´fá\u009b[æ\u008c\u009a\\ÜS0ÑnÙ3\u00146·U1\u0018\u0003\u0099\u0014\u001bÜ\u0088\bÊÚ\u007f\u0086\u0017\u0003g\u0095¬®bißwÿØ¸\u0016\rà\n\u008bV±¡\u009d¯Z®.\u009ejM\u008bJGäó5ª\u0086/\u001d¾Hã\u0004ÑäekÂ·f\fh'@\u00adsK\f-\n¡¦\u008bò\u000e\u0089¤'\u008e£\u0018Z:ÆÀ6<\u0010\tß\u0088j;\u0019\u0089b\u0003È\u001bØ\u0016\u0000s¼¡\u0010\u008c\u00990öP\u0089\u009a\u000bê\u0080v>Çz`;\u0018Ñ\u0082T\u0098\u0094ü`ááÛ1\u007fª\nºéÊ\u001bqZJéWÜ";
        int length = "\u0098ü·!\u0019ht\u001aÏßÍ\u0019þ~\n¦ \u0016ý\u0097 >:\u0087øZ¥m¿=rakWWþ¹1\u000e\u0090`^\fø ©\u0093óS\u0088òkk|jb\u0080\u0014\u009b\u0082´\u0099æQ\u0083Bh\u001duLÇÄ\u001b1\u0005\\T\u009d\u009cB\u0094¾\u001f\u0003\"]ù\u009b«;PU\u0080Ã\u001fl\u008d.3{R,\u008cH+é¢ çv\u009fvtt7\u0089\u0016Å\u0005ÛP]ì\u009e__\u007fª4Ýg&\u0014àú|\u0086nN\u0012B]\u009e¸\u000b\u001c\u0000 \u0016þ{\u00066\u0095×°Ña\u009cp\u0096Q1\u007fã\u0003ë\u001b\u001e¦E\u0007\\e\u0013\u0001\u0017ä_ý\u0010D}\u001cy½\u0090Y\u0087©Uò>þ\u00adÈ\f\\¤Î\u0013 ïB\u0097\u0013Cò^«\u008e5Ø±·÷(V\u0081ãA9÷iKvs\u0096´fá\u009b[æ\u008c\u009a\\ÜS0ÑnÙ3\u00146·U1\u0018\u0003\u0099\u0014\u001bÜ\u0088\bÊÚ\u007f\u0086\u0017\u0003g\u0095¬®bißwÿØ¸\u0016\rà\n\u008bV±¡\u009d¯Z®.\u009ejM\u008bJGäó5ª\u0086/\u001d¾Hã\u0004ÑäekÂ·f\fh'@\u00adsK\f-\n¡¦\u008bò\u000e\u0089¤'\u008e£\u0018Z:ÆÀ6<\u0010\tß\u0088j;\u0019\u0089b\u0003È\u001bØ\u0016\u0000s¼¡\u0010\u008c\u00990öP\u0089\u009a\u000bê\u0080v>Çz`;\u0018Ñ\u0082T\u0098\u0094ü`ááÛ1\u007fª\nºéÊ\u001bqZJéWÜ".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[9];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "\u00064÷;¶Q×\u001a\u0002b\u007fùhlì×";
                            int length2 = "\u00064÷;¶Q×\u001a\u0002b\u007fùhlì×".length();
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
                                                f = jArr;
                                                g = new Integer[4];
                                                W = new ye(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Eâ(Õ_\u008b\u0097\u008b¢\u0090©ü\u0011Á\u00ad\u0087";
                                                length2 = "Eâ(Õ_\u008b\u0097\u008b¢\u0090©ü\u0011Á\u00ad\u0087".length();
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
                        str = "^{Ã\u0089ÆD\u009cQ¶\u008d¦Z5æÁ¯\u00106S\u0000\u0017Ô\u0012Éx\u001b\u001d×\u0017\u008c¿\u0095b";
                        length = "^{Ã\u0089ÆD\u009cQ¶\u008d¦Z5æÁ¯\u00106S\u0000\u0017Ô\u0012Éx\u001b\u001d×\u0017\u008c¿\u0095b".length();
                        cCharAt = 16;
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

    public static void i(boolean z) {
        w = z;
    }

    public static boolean i() {
        return w;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean O() {
        return !i();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 8524;
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
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_w", e);
            }
        }
        return c[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/_w"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._w.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 10480;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_w", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
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
            java.lang.String r1 = "su/catlean/_w"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._w.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
