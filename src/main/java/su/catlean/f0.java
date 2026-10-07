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
import kotlin.text.StringsKt;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/f0.class */
@Serializable
public final class f0 {

    @NotNull
    public static final xv D;

    @NotNull
    private String V;

    @NotNull
    private String H;

    @NotNull
    private String E;
    private static String[] y;
    private static final long a = yz.a(5140828051802494958L, -3215160988240386815L, MethodHandles.lookup().lookupClass()).a(214153308615503L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public f0(int a2, @NotNull String id, @NotNull String username, short a3, short a4, @NotNull String avatar) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12419, 7925853652400772889L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(username, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12680, 2474836380300842512L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(avatar, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26260, 4624211797043167501L ^ j) /* invoke-custom */);
        this.V = id;
        this.H = username;
        this.E = avatar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker, byte b2, int i2, int i3) {
        long j = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ a;
        long j2 = j ^ 31516905103384L;
        this((int) (j >>> 32), (i & 1) != 0 ? (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1794, 2978914718841958711L ^ j) /* invoke-custom */ : str, (i & 2) != 0 ? (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24849, 4835470816118445858L ^ j) /* invoke-custom */ : str2, (short) ((j2 << 32) >>> 48), (short) ((j2 << 48) >>> 48), (i & 4) != 0 ? (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24849, 4835470816118445858L ^ j) /* invoke-custom */ : str3);
    }

    @NotNull
    public final String M() {
        return this.V;
    }

    public final void K(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20781, 4821200486810880111L ^ (a ^ a2)) /* invoke-custom */);
        this.V = str;
    }

    @NotNull
    public final String W() {
        return this.H;
    }

    public final void x(@NotNull String str, long a2) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27312, 2855702941701345235L ^ (a ^ a2)) /* invoke-custom */);
        this.H = str;
    }

    @NotNull
    public final String v() {
        return this.E;
    }

    public final void B(@NotNull String str, long a2, byte a3) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27312, 2855640933499422545L ^ (((a2 << 8) | ((((long) a3) << 56) >>> 56)) ^ a)) /* invoke-custom */);
        this.E = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    @NotNull
    public final String u(int size, boolean forcePng, long a2) {
        long j = a ^ a2;
        Object objStartsWith$default = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8035975481736414628L, j) /* invoke-custom */;
        try {
            try {
                String str = this.E;
                String strH = (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32522, 997427929506436398L ^ j) /* invoke-custom */;
                int i = 0;
                if (objStartsWith$default == 0) {
                    objStartsWith$default = StringsKt.startsWith$default(str, strH, false, 2, (Object) null);
                    if (objStartsWith$default != 0 && !forcePng) {
                        return (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25397, 8925969111497984277L ^ j) /* invoke-custom */ + this.V + "/" + this.E + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3664, 1760721594962551933L ^ j) /* invoke-custom */ + size;
                    }
                    str = this.V;
                    strH = this.E;
                    i = size;
                }
                String str2 = strH;
                String str3 = str;
                return (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21919, 3504134121385295800L ^ j) /* invoke-custom */ + str3 + "/" + str2 + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23244, 544068922876129507L ^ j) /* invoke-custom */ + i;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objStartsWith$default, -8043552299611770268L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objStartsWith$default, -8043552299611770268L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [su.catlean.f0] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static String Q(f0 f0Var, long j, int i, boolean z, int i2, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 27581140819062L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9060218101120948122L, j2) /* invoke-custom */;
        try {
            r0 = i2 & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    i = (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28797, 7855124530970601942L ^ j2) /* invoke-custom */;
                }
                r02 = i2 & 2;
            }
            ?? r11 = z;
            ?? r03 = r02;
            if (r0 != 0) {
                r11 = r03;
            } else if (r02 != 0) {
                r03 = 0;
                r11 = r03;
            }
            return f0Var.u(i, r11, j3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 9050451227949129634L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public final String A() {
        return this.V;
    }

    @NotNull
    public final String o() {
        return this.H;
    }

    @NotNull
    public final String U() {
        return this.E;
    }

    @NotNull
    public final f0 J(char a2, @NotNull String id, short a3, @NotNull String username, int a4, @NotNull String avatar) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a;
        long j2 = j ^ 15597356455550L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26991, 8253888558593796389L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(username, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19716, 660675011966586191L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(avatar, (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22999, 4459692881560590732L ^ j) /* invoke-custom */);
        return new f0(i, id, username, (short) i2, (short) i3, avatar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static f0 m(long j, f0 f0Var, String str, String str2, String str3, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 37456692256469L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7682463066896974012L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    str = f0Var.V;
                }
                r02 = i & 2;
            }
            ?? r03 = r02;
            if (r0 == 0) {
                if (r02 != 0) {
                    str2 = f0Var.H;
                }
                r03 = i & 4;
            }
            if (r03 != 0) {
                str3 = f0Var.E;
            }
            return f0Var.J((char) i2, str, (short) i3, str2, i4, str3);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -7690004495248705668L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 81986222870229L;
        return (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10075, 2877941847792870159L ^ j) /* invoke-custom */ + this.V + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28410, 1504687976732797610L ^ j) /* invoke-custom */ + this.H + (String) a(MethodHandles.lookup(), "h", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20867, 3475219143142184400L ^ j) /* invoke-custom */ + this.E + ")";
    }

    public int hashCode() {
        long j = a ^ 22853931227057L;
        return (((this.V.hashCode() * (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6735, 4559536974063884597L ^ j) /* invoke-custom */) + this.H.hashCode()) * (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15548, 5333293303594155973L ^ j) /* invoke-custom */) + this.E.hashCode();
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
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.f0.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x00df
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @kotlin.jvm.JvmStatic
    public static final void j(long r7, su.catlean.f0 r9, kotlinx.serialization.encoding.CompositeEncoder r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.f0.j(long, su.catlean.f0, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060 A[EXC_TOP_SPLITTER, PHI: r0
  0x0060: PHI (r0v9 ??) = (r0v8 ??), (r0v40 ??) binds: [B:16:0x005d, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.f0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [su.catlean.f0] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f0(int r8, long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlinx.serialization.internal.SerializationConstructorMarker r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.f0.<init>(int, long, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(long j, short s) {
        long j2 = ((j << 16) | ((((long) s) << 48) >>> 48)) ^ a;
        long j3 = j2 ^ 87069188827651L;
        this(null, null, null, (int) b(MethodHandles.lookup(), "d", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27254, 9089644634584488368L ^ j2) /* invoke-custom */, null, (byte) (j2 >>> 56), (int) ((j3 << 8) >>> 32), (int) ((j3 << 40) >>> 40));
    }

    static {
        int i;
        long j = a ^ 61417325037449L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -5241480639568928532L, j) /* invoke-custom */;
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
        String str = "\u008cTùº\u009b\u008aù]vCÔV¸Ç¼^@Ì\u0018M\u008eh\u008f\" Ô\u0090Ñnà\u009bX\u008d|µpbNbÓÖ*ý]/\u001bzÅÑ\"G\u0019¯4!åçÎ«Úõ0\f\u001aèéâiið\u008d\u008bà¼XÑ9Í{x¾\u0010w\u0003\u001c.vSÀíô¥\u0005ºÓ!ø®\u0018\u001aIø\fû\u0019(5±\n¨æ\u007f\u0015\u008ar!k}>\u0001\u0098@M \u0019á¤\u008fýWî\u009e\"\"3\u001dS30ð9âï²\u009eÍP\u0088úö\u0000\u0080\u0019Õ\u0004\u0000\u0010>\u000bYHÿ\u000b\u001eÈ³0´\u0087>®\u000eÛ@\u0086PK#à\u0084Å\u001b¿¾j$7\u001a\t@Æ\u008dñ,\u0098¼:©Èjd§CÔ\u0016?®\u007fóÌ+@A}\u007fé,Æ\u000fúãs(9\u008fbð·¥¸JîþGÝ\f0\u0017 ¹\r/N\u0012×\u0000\u0012\u009d~Å6k\u0004Æ>ÅûÔ,JÑ=%=}²\u008fKSµ¤\u0010ñ>{Ù\u007fÅöG\\ù\u009aÎH>xt «\u009eE\u0088Ð6\u0096\b)\u0015_\u0082\u0012\rE¨Üéï\u009b\u001bB¹_\u0005Ê:çèsy2\u0010{\u000eH8\u000e\u00adÎÑ\u0088Ç\rÎ\u0018TÅç Q\u0095\u008f×ìP\u0094«\u000e\u0084Ü¬x*\u008dÑ+{ üA\u009a¥ó\u009e\tÇ\u0019¥\u0002µÖ\u0010\u008c\u008d \n'5±\u0012\u000e\u0013]\u0006\u00ad°)÷\u0018xÿ\u0089îbtäGÿÔëÓ\u001a\u0012Ô\u0019x&É<ßþµç\u0010\u0005Lµ\u000eç'5Ì\u0083e\"DòÓr \u0010Î\u0005Zø!â¸X³\u000b=BÚdj\u0097";
        int length = "\u008cTùº\u009b\u008aù]vCÔV¸Ç¼^@Ì\u0018M\u008eh\u008f\" Ô\u0090Ñnà\u009bX\u008d|µpbNbÓÖ*ý]/\u001bzÅÑ\"G\u0019¯4!åçÎ«Úõ0\f\u001aèéâiið\u008d\u008bà¼XÑ9Í{x¾\u0010w\u0003\u001c.vSÀíô¥\u0005ºÓ!ø®\u0018\u001aIø\fû\u0019(5±\n¨æ\u007f\u0015\u008ar!k}>\u0001\u0098@M \u0019á¤\u008fýWî\u009e\"\"3\u001dS30ð9âï²\u009eÍP\u0088úö\u0000\u0080\u0019Õ\u0004\u0000\u0010>\u000bYHÿ\u000b\u001eÈ³0´\u0087>®\u000eÛ@\u0086PK#à\u0084Å\u001b¿¾j$7\u001a\t@Æ\u008dñ,\u0098¼:©Èjd§CÔ\u0016?®\u007fóÌ+@A}\u007fé,Æ\u000fúãs(9\u008fbð·¥¸JîþGÝ\f0\u0017 ¹\r/N\u0012×\u0000\u0012\u009d~Å6k\u0004Æ>ÅûÔ,JÑ=%=}²\u008fKSµ¤\u0010ñ>{Ù\u007fÅöG\\ù\u009aÎH>xt «\u009eE\u0088Ð6\u0096\b)\u0015_\u0082\u0012\rE¨Üéï\u009b\u001bB¹_\u0005Ê:çèsy2\u0010{\u000eH8\u000e\u00adÎÑ\u0088Ç\rÎ\u0018TÅç Q\u0095\u008f×ìP\u0094«\u000e\u0084Ü¬x*\u008dÑ+{ üA\u009a¥ó\u009e\tÇ\u0019¥\u0002µÖ\u0010\u008c\u008d \n'5±\u0012\u000e\u0013]\u0006\u00ad°)÷\u0018xÿ\u0089îbtäGÿÔëÓ\u001a\u0012Ô\u0019x&É<ßþµç\u0010\u0005Lµ\u000eç'5Ì\u0083e\"DòÓr \u0010Î\u0005Zø!â¸X³\u000b=BÚdj\u0097".length();
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
                            c = new String[18];
                            g = new HashMap(13);
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
                            String str3 = "þ£\u0006Ñ;±äÙ¿\u009fô\u009d§)\u001eé";
                            int length2 = "þ£\u0006Ñ;±äÙ¿\u009fô\u009d§)\u001eé".length();
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
                                                e = jArr;
                                                f = new Integer[4];
                                                D = new xv(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "õ«?\u009b\u008d\u001ema\u001a(Ö DHx*";
                                                length2 = "õ«?\u009b\u008d\u001ema\u001a(Ö DHx*".length();
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
                        str = "\u0014\u008bå5\u0088\u008bÒ¥¹·\u0018\u0010\u0016 d§e\u009f\u001b²Ô\u0097\u0016µÛ#»\u0086q¶EÒ\u0010\u0093\u0095\u008ct`p°¡9Çñ\u001c\u0003ÄVù";
                        length = "\u0014\u008bå5\u0088\u008bÒ¥¹·\u0018\u0010\u0016 d§e\u009f\u001b²Ô\u0097\u0016µÛ#»\u0086q¶EÒ\u0010\u0093\u0095\u008ct`p°¡9Çñ\u001c\u0003ÄVù".length();
                        cCharAt = ' ';
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

    public static void N(String[] strArr) {
        y = strArr;
    }

    public static String[] L() {
        return y;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 15154;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/f0", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/f0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.f0.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 9595;
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
                    throw new RuntimeException("su/catlean/f0", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/f0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.f0.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
