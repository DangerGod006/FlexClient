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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s4.class */
@Serializable
public final class s4 {

    @NotNull
    public static final aa s;

    @NotNull
    private String a;
    private int o;
    private int Q;
    private int J;

    @NotNull
    private String q;
    private int j;
    private boolean m;
    private static String U;
    private static final long b = yz.a(5657386671542807604L, -4264056233285571399L, MethodHandles.lookup().lookupClass()).a(236359970585003L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public s4(@NotNull String id, int x, int y, int a, int a2, byte a3, int z, @NotNull String server, int dimension, boolean visible) {
        long j = (((((long) a) << 32) | ((((long) a2) << 40) >>> 32)) | ((((long) a3) << 56) >>> 56)) ^ b;
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8435, 6488559782010904028L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(server, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19178, 2850455465472440263L ^ j) /* invoke-custom */);
        this.a = id;
        this.o = x;
        this.Q = y;
        this.J = z;
        this.q = server;
        this.j = dimension;
        this.m = visible;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s4(String str, int i, int i2, int i3, String str2, int i4, boolean z, long j, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = b ^ j;
        this(str, i, i2, (int) (j2 >>> 32), (int) (((j2 ^ 23668220001189L) << 32) >>> 40), (byte) ((r1 << 56) >>> 56), i3, (i5 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3885, 7449673803232819039L ^ j2) /* invoke-custom */) != 0 ? (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10550, 3836921083661305568L ^ j2) /* invoke-custom */ : str2, (i5 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29100, 198577880525294034L ^ j2) /* invoke-custom */) != 0 ? 0 : i4, (i5 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3705, 3941078856734193154L ^ j2) /* invoke-custom */) != 0 ? true : z);
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public final void z(int a, @NotNull String str, int a2, byte a3) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1787, 2192552580277844124L ^ ((((((long) a) << 32) | ((((long) a2) << 40) >>> 32)) | ((((long) a3) << 56) >>> 56)) ^ b)) /* invoke-custom */);
        this.a = str;
    }

    public final int I() {
        return this.o;
    }

    public final void K(int i) {
        this.o = i;
    }

    public final int r() {
        return this.Q;
    }

    public final void p(int i) {
        this.Q = i;
    }

    public final int u() {
        return this.J;
    }

    public final void B(int i) {
        this.J = i;
    }

    @NotNull
    public final String h() {
        return this.q;
    }

    public final void A(@NotNull String str, long a) {
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(297, 3299704143048938798L ^ (b ^ a)) /* invoke-custom */);
        this.q = str;
    }

    public final int W() {
        return this.j;
    }

    public final void a(int i) {
        this.j = i;
    }

    public final boolean g() {
        return this.m;
    }

    public final void K(boolean z) {
        this.m = z;
    }

    @NotNull
    public final String E() {
        return this.a;
    }

    public final int S() {
        return this.o;
    }

    public final int a() {
        return this.Q;
    }

    public final int M() {
        return this.J;
    }

    @NotNull
    public final String D() {
        return this.q;
    }

    public final int k() {
        return this.j;
    }

    public final boolean m() {
        return this.m;
    }

    @NotNull
    public final s4 i(@NotNull String id, int x, int y, int z, @NotNull String server, int dimension, boolean visible, long a) {
        long j = b ^ a;
        long j2 = j ^ 57054780737780L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 40);
        int i3 = (int) ((j2 << 56) >>> 56);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28304, 5298913007108108819L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(server, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29683, 9088031659784318841L ^ j) /* invoke-custom */);
        return new s4(id, x, y, i, i2, (byte) i3, z, server, dimension, visible);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x0141
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.s4 I(su.catlean.s4 r11, java.lang.String r12, int r13, int r14, long r15, int r17, java.lang.String r18, int r19, boolean r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s4.I(su.catlean.s4, java.lang.String, int, int, long, int, java.lang.String, int, boolean, int, java.lang.Object):su.catlean.s4");
    }

    @NotNull
    public String toString() {
        long j = b ^ 58050314465373L;
        return (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21025, 6777180846467243420L ^ j) /* invoke-custom */ + this.a + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20786, 8315903404336864909L ^ j) /* invoke-custom */ + this.o + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19334, 59451413623620663L ^ j) /* invoke-custom */ + this.Q + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10588, 1467397539105908456L ^ j) /* invoke-custom */ + this.J + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5468, 7236822692563262185L ^ j) /* invoke-custom */ + this.q + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14442, 3273776261698074582L ^ j) /* invoke-custom */ + this.j + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27845, 3603239016149083007L ^ j) /* invoke-custom */ + this.m + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public int hashCode() {
        long j = b ^ 25277827849709L;
        (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-784460968967296659L, j) /* invoke-custom */;
        Object objHashCode = (((((((((((this.a.hashCode() * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27901, 5357903824227850583L ^ j) /* invoke-custom */) + Integer.hashCode(this.o)) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1784, 3117281635044799319L ^ j) /* invoke-custom */) + Integer.hashCode(this.Q)) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1784, 3117281635044799319L ^ j) /* invoke-custom */) + Integer.hashCode(this.J)) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1784, 3117281635044799319L ^ j) /* invoke-custom */) + this.q.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1784, 3117281635044799319L ^ j) /* invoke-custom */) + Integer.hashCode(this.j)) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1784, 3117281635044799319L ^ j) /* invoke-custom */) + Boolean.hashCode(this.m);
        try {
            objHashCode = objHashCode;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-728544405770212494L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("uaCYjc", -724206526371944496L, j) /* invoke-custom */;
            }
            return objHashCode;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHashCode, -779320069110805838L, j) /* invoke-custom */;
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
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s4.equals(java.lang.Object):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @kotlin.jvm.JvmStatic
    public static final void G(su.catlean.s4 r8, long r9, kotlinx.serialization.encoding.CompositeEncoder r11, kotlinx.serialization.descriptors.SerialDescriptor r12) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s4.G(su.catlean.s4, long, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    public s4(int seen0, String id, int x, long a, int y, int z, String server, int dimension, boolean visible, SerializationConstructorMarker serializationConstructorMarker) {
        long j = b ^ a;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2425004522078895575L, j) /* invoke-custom */;
        if ((int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9549, 884136695349134419L ^ j) /* invoke-custom */ != ((int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24783, 5089810187753488857L ^ j) /* invoke-custom */ & seen0)) {
            PluginExceptionsKt.throwMissingFieldException(seen0, (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24783, 5089810187753488857L ^ j) /* invoke-custom */, lm.v.getDescriptor());
        }
        this.a = id;
        this.o = x;
        this.Q = y;
        s4 s4Var = this;
        String str2 = str;
        if (j >= 0) {
            try {
                if (str2 != null) {
                    try {
                        s4Var.J = z;
                        if (j < 0) {
                            s4Var = (j > 0 && str == null) ? this : s4Var;
                        } else {
                            if ((seen0 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6736, 8746152137288579906L ^ j) /* invoke-custom */) == 0) {
                                s4Var = this;
                                s4Var.q = (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(880, 3880036635279275468L ^ j) /* invoke-custom */;
                                if (j > 0) {
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(s4Var, 2419871859641196040L, j) /* invoke-custom */;
                    }
                }
                str2 = server;
                s4Var.q = str2;
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(s4Var, 2419871859641196040L, j) /* invoke-custom */;
            }
        } else {
            s4Var.q = str2;
        }
        Object obj = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        try {
            if (obj >= 0) {
                try {
                    if ((seen0 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26929, 223964617374337062L ^ j) /* invoke-custom */) == 0) {
                        this.j = 0;
                        obj = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (obj > 0 && str == null) {
                        }
                    }
                    this.j = dimension;
                } catch (NumberFormatException unused3) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2419871859641196040L, j) /* invoke-custom */;
                }
            }
            Object obj2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            try {
                if (obj2 > 0) {
                    try {
                        if ((seen0 & (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4975, 3022632007098659443L ^ j) /* invoke-custom */) == 0) {
                            this.m = true;
                            obj2 = str;
                            if (obj2 != 0) {
                                return;
                            }
                        }
                        this.m = visible;
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2419871859641196040L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2419871859641196040L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2419871859641196040L, j) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = b ^ 118253021840231L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("YM31G", -6090723282569660070L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i3 = 0;
        String str = "\u008dSS;\u0015\u0015ÀNÏgR\u000b\u0001CLÊ \u0003øLB[Ã4*\u0082Ý§ÎmK1z'8\u0086\u001dÃ¸\u0002â\"mc+\u0018bÂÁ Æ=^\u0087yÌ\u0015âw\u008b\u009e\\{\u0001\u0010£Åd\u007f\u0082\u009aFh\u0098S*cÊ\u0003Â'ð\u0010\u0013/?\u0015o\b\u009d\u0007¨ài-\u007f\u000f6\u0019 \u008f [¬Gù [æ]9At:÷\u008edõ\u0011\u009d\u0007\u001bQüþg °¯$æç\u0010±Î-Î\u009d\u0086[Þ¦ø\u0018\u0004B\u000b\u009c©\u0010~\u008fâ\u0092oÒ^2ËãV)0úÒf\u0010Öx\u008e\u0000oî»½v(@7\u009dkÌH\u0010·\u0006¬½\u009cÓBaoimà¨Ê3¿\u0010Êöx\fô3R£t8\u009aXÿ\u0090á\u007f $(®>\u0083H¨Ñ©zá®)\u008d\u0086¦£gº/G°·n\u0004\tÿ¼Ë8çN \u0006\u009b4Æ\u00ad6RïU\u001d\u0090ÒçÞ\u0083\f²]ìRX\\ö ´\u0002§Å¸%O\u0098\u0010¨Ë°¯C\\\u008bP¹qã0£¸\u0096>";
        int length = "\u008dSS;\u0015\u0015ÀNÏgR\u000b\u0001CLÊ \u0003øLB[Ã4*\u0082Ý§ÎmK1z'8\u0086\u001dÃ¸\u0002â\"mc+\u0018bÂÁ Æ=^\u0087yÌ\u0015âw\u008b\u009e\\{\u0001\u0010£Åd\u007f\u0082\u009aFh\u0098S*cÊ\u0003Â'ð\u0010\u0013/?\u0015o\b\u009d\u0007¨ài-\u007f\u000f6\u0019 \u008f [¬Gù [æ]9At:÷\u008edõ\u0011\u009d\u0007\u001bQüþg °¯$æç\u0010±Î-Î\u009d\u0086[Þ¦ø\u0018\u0004B\u000b\u009c©\u0010~\u008fâ\u0092oÒ^2ËãV)0úÒf\u0010Öx\u008e\u0000oî»½v(@7\u009dkÌH\u0010·\u0006¬½\u009cÓBaoimà¨Ê3¿\u0010Êöx\fô3R£t8\u009aXÿ\u0090á\u007f $(®>\u0083H¨Ñ©zá®)\u008d\u0086¦£gº/G°·n\u0004\tÿ¼Ë8çN \u0006\u009b4Æ\u00ad6RïU\u001d\u0090ÒçÞ\u0083\f²]ìRX\\ö ´\u0002§Å¸%O\u0098\u0010¨Ë°¯C\\\u008bP¹qã0£¸\u0096>".length();
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
                            c = strArr;
                            d = new String[15];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[13];
                            int i9 = 0;
                            String str3 = "ZdÖàwÆé\u0085\u0081Á¥±2]Gî;\u0015ÙbÌøC;\u0097\u0015\u001cQé\u00134£\u0090\u008f\u0099¨hßz\u008e\bñ\u0012\u0083\u0007\u009a\u0091\u001eC1\u0082øÐnrÀ®\u0085h\u009dp\u0003k\u0081\u009f~Óûå{\u0087\u0015èü`\u0080\"Â4D+m \u009c\u0092_\u0083ü";
                            int length2 = "ZdÖàwÆé\u0085\u0081Á¥±2]Gî;\u0015ÙbÌøC;\u0097\u0015\u001cQé\u00134£\u0090\u008f\u0099¨hßz\u008e\bñ\u0012\u0083\u0007\u009a\u0091\u001eC1\u0082øÐnrÀ®\u0085h\u009dp\u0003k\u0081\u009f~Óûå{\u0087\u0015èü`\u0080\"Â4D+m \u009c\u0092_\u0083ü".length();
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
                                                g = new Integer[13];
                                                s = new aa(null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Ó÷´Vð¦\u0019ÍC\u00965\u0097d*#]";
                                                length2 = "Ó÷´Vð¦\u0019ÍC\u00965\u0097d*#]".length();
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
                        str = "¢\u0099Nf\u001d¾¨)Aè\u001f\u0092¥\u0005\u001eyêÌêêò\u00892/íi:¼HKÔ\u00ad\u0010\u000e±\u0016\u0015zC\u0093\u009ewÙÙ\u0019\u0093q\u00ad\u0091";
                        length = "¢\u0099Nf\u001d¾¨)Aè\u001f\u0092¥\u0005\u001eyêÌêêò\u00892/íi:¼HKÔ\u00ad\u0010\u000e±\u0016\u0015zC\u0093\u009ewÙÙ\u0019\u0093q\u00ad\u0091".length();
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

    public static void L(String str) {
        U = str;
    }

    public static String Q() {
        return U;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 5813;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/s4", e2);
            }
        }
        return d[i2];
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
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/s4"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s4.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 16669;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/s4", e2);
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
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/s4"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.s4.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
