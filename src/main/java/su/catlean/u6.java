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
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.MinecraftAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u6.class */
public final class u6 extends _g {

    @NotNull
    public static final u6 k;
    static final KProperty[] F;

    @NotNull
    private static final c8 T;

    @NotNull
    private static final cq N;

    @NotNull
    private static final av h;

    @NotNull
    private static i9 A;
    private static final long a = yz.a(650419375391998831L, -521477186697016015L, MethodHandles.lookup().lookupClass()).a(138568193974860L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    private u6(int i, int i2, short s) {
        long j = (((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) s) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26854, 6379841145742596305L ^ j) /* invoke-custom */, jt.A(), null, 4, null, j ^ 89232876250065L);
    }

    private final int F(char c2, int i, char c3) {
        return ((Number) T.E(this, ((((((long) c2) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c3) << 48) >>> 48)) ^ a) ^ 122935761616424L, F[0])).intValue();
    }

    private final boolean Y(long j) {
        return ((Boolean) N.E(this, (a ^ j) ^ 31228902253090L, F[1])).booleanValue();
    }

    private final lj v(long j) {
        return (lj) h.E(this, (a ^ j) ^ 23181496776205L, F[2]);
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
    private final void p(su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u6.p(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private final void N(int[] iArr, long j) {
        long j2 = a ^ j;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2977355732048952880L, j2) /* invoke-custom */;
        Function0 function0 = u6::e;
        Iterator<T> it = ArraysKt.reversed(iArr).iterator();
        loop0: while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Function0 function02 = function0;
            function0 = () -> {
                return Z(r0, r1);
            };
            do {
                String str2 = str;
                if (j2 >= 0) {
                    if (str2 == null) {
                        return;
                    } else {
                        str2 = str;
                    }
                }
                if (str2 == null) {
                }
            } while (j2 < 0);
        }
        function0.invoke();
    }

    private static final Unit e() {
        return Unit.INSTANCE;
    }

    private static final void T(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, su.catlean.o8] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void R(Function0 function0) {
        long j = a ^ 102991771884301L;
        long j2 = j ^ 14863753408774L;
        long j3 = j ^ 36547416558001L;
        long j4 = j ^ 108614061307532L;
        long j5 = j ^ 1151432897835L;
        long j6 = j ^ 126049429563681L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j6 << 16) >>> 32);
        int i3 = (int) ((j6 << 48) >>> 48);
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3274500283062696463L, j) /* invoke-custom */;
        MinecraftAccessor minecraftAccessorF = zf.F(j2);
        Intrinsics.checkNotNull(minecraftAccessorF, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25220, 7557974859748232703L ^ j) /* invoke-custom */);
        minecraftAccessorF.idoItemUse();
        try {
            try {
                r0 = o8.g;
                int iF = k.F((char) i, i2, (char) i3) - 2;
                boolean zY = k.Y(j5);
                ?? F2 = zY;
                if (r0 != 0) {
                    F2 = zY ? mf.f(new IntRange(-1, 1), false, j4, 2, null) : 0;
                }
                try {
                    int i4 = iF + F2;
                    ?? I = (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22614, 7589258720284551677L ^ j) /* invoke-custom */;
                    int iF2 = k.F((char) i, i2, (char) i3);
                    ?? r3 = iF2;
                    if (r0 != 0) {
                        r3 = iF2 > 0 ? 1 : 0;
                    }
                    r0.X(i4, I, r3, () -> {
                        T(r4);
                    }, j3);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3243898923893522781L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3243898923893522781L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 3243898923893522781L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, su.catlean.o8] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final Unit Z(int i, Function0 function0) {
        long j = a ^ 134497963594202L;
        long j2 = j ^ 110333534658685L;
        long j3 = j ^ 7446523642726L;
        long j4 = j ^ 76073302178907L;
        long j5 = j ^ 42831730327548L;
        long j6 = j ^ 93856709518326L;
        int i2 = (int) (j >>> 48);
        int i3 = (int) ((j6 << 16) >>> 32);
        int i4 = (int) ((j6 << 48) >>> 48);
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6366265439437999912L, j) /* invoke-custom */;
        gg.P.f(i, j2);
        try {
            try {
                r0 = o8.g;
                int iF = k.F((char) i2, i3, (char) i4) - 2;
                boolean zY = k.Y(j5);
                ?? F2 = zY;
                if (r0 != 0) {
                    F2 = zY ? mf.f(new IntRange(-1, 1), false, j4, 2, null) : 0;
                }
                try {
                    int i5 = iF + F2;
                    ?? I = (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(590, 5790990351789521207L ^ j) /* invoke-custom */;
                    int iF2 = k.F((char) i2, i3, (char) i4);
                    ?? r3 = iF2;
                    if (r0 != 0) {
                        r3 = iF2 > 0 ? 1 : 0;
                    }
                    r0.X(i5, I, r3, () -> {
                        R(r4);
                    }, j3);
                    return Unit.INSTANCE;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6353590497413461110L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6353590497413461110L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6353590497413461110L, j) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 55550742311905L;
        long j2 = j ^ 96238686147239L;
        long j3 = j ^ 116800262737687L;
        long j4 = j ^ 76540629156465L;
        long j5 = j ^ 19570164524611L;
        long j6 = j ^ 58205829367120L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j6 << 32) >>> 48);
        int i4 = (int) ((j6 << 48) >>> 48);
        long j7 = j ^ 73223732936937L;
        int i5 = (int) (j >>> 32);
        int i6 = (int) ((j7 << 32) >>> 48);
        int i7 = (int) ((j7 << 48) >>> 48);
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i8 = 1; i8 < 8; i8++) {
            bArr[i8] = (byte) ((j << (i8 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[14];
        int i9 = 0;
        String str = "W\bóþCdó7\u0086-;~2í\u0087Jï¢½\u0083Ï\u0014\f|èÎØ1nhCt ÕÍ*#a\u008e\u0012\u00934{\u0085Üó\u008b+\u0016Wöïî´h¶v\u0095ìI\u009e\u0086@<u\u0090Y\u0081E6µ&Ü_p9¹õó¬\u0016@¸0@\u0019d\u000fÑz¾Sñ\n\u0083\u0097u×FÂ5\b\u0080¾1Uñ\u001b»\u001bq\u009b\u0085ü\u009e'\u0014ß0ª\rBã(í\u0007\u0018[yå\u001cý\bz\u0099\u0018éõ$Õ+\u0090\f\t'L\"DC\u0081ÐW\u0007\u001c\u008a/þS@\u0016âùÌt«8<i\u007fùN\u001a§^\u008aZù¨z§Ïvç)ÓéñßvÑ©á\u0016â.9=0}0ý\u000f\u0018M\u0089^\u000e\u001b\u001bÉ\u0018#\b$r¬[\u0007«|¾\u009aô±IBïvãÐá\u008a\u009a¯\u008d 8 1O{õJT\r¶+Á\u000fY\u0016_\u0093É\u0010\u0014\u0093\u0010tûU?\u000bG\u009cç+W\u0010;\"¦\u001fó\u0019\u009e\u0087§Â©I\u0012Eûé ÊP%?\u001dþ»è;tç$Ð\u0016å\u00911\u00ad\u001fTjÁ.¥\u0012Ú\u009f3ïÏ\u009c¯\u00187ÿI¹®\u0013®Ì_Ø)¨¹¹#%£jxZN\u0080\u008c/(®S¤9ú\u0091S\u0006ó4ëmí\u0010Ú×jþ¢øw»\u0093XºZò\u0093j%qÒB$\u0016\u0019WñKs \u0094B\u000eÁ\u001bÉþ\u0012Ñ®¶\r@\u0097t8(È÷X¡Îª/WoÞÃ\u001d<\u0083\u009d8p\u0001\u000b#\u009dk\u0003í7OõáËål ñ\u0006f\u009b»±,êÒ\u0003%Ò3\u0018¹µgdáÖU~#\u0096Ôk4ø\u0003d7+ò\r\u0080\u001a\u008bÍÉT(%w2\\I¨\u007f4%\u0091¹¶À(\u0090\u0012³Ü\u0092?\u0086¸\u0090\u0097\u0081\u0012²0%Þ\u008ff\u0089u\u0088²:^a=";
        int length = "W\bóþCdó7\u0086-;~2í\u0087Jï¢½\u0083Ï\u0014\f|èÎØ1nhCt ÕÍ*#a\u008e\u0012\u00934{\u0085Üó\u008b+\u0016Wöïî´h¶v\u0095ìI\u009e\u0086@<u\u0090Y\u0081E6µ&Ü_p9¹õó¬\u0016@¸0@\u0019d\u000fÑz¾Sñ\n\u0083\u0097u×FÂ5\b\u0080¾1Uñ\u001b»\u001bq\u009b\u0085ü\u009e'\u0014ß0ª\rBã(í\u0007\u0018[yå\u001cý\bz\u0099\u0018éõ$Õ+\u0090\f\t'L\"DC\u0081ÐW\u0007\u001c\u008a/þS@\u0016âùÌt«8<i\u007fùN\u001a§^\u008aZù¨z§Ïvç)ÓéñßvÑ©á\u0016â.9=0}0ý\u000f\u0018M\u0089^\u000e\u001b\u001bÉ\u0018#\b$r¬[\u0007«|¾\u009aô±IBïvãÐá\u008a\u009a¯\u008d 8 1O{õJT\r¶+Á\u000fY\u0016_\u0093É\u0010\u0014\u0093\u0010tûU?\u000bG\u009cç+W\u0010;\"¦\u001fó\u0019\u009e\u0087§Â©I\u0012Eûé ÊP%?\u001dþ»è;tç$Ð\u0016å\u00911\u00ad\u001fTjÁ.¥\u0012Ú\u009f3ïÏ\u009c¯\u00187ÿI¹®\u0013®Ì_Ø)¨¹¹#%£jxZN\u0080\u008c/(®S¤9ú\u0091S\u0006ó4ëmí\u0010Ú×jþ¢øw»\u0093XºZò\u0093j%qÒB$\u0016\u0019WñKs \u0094B\u000eÁ\u001bÉþ\u0012Ñ®¶\r@\u0097t8(È÷X¡Îª/WoÞÃ\u001d<\u0083\u009d8p\u0001\u000b#\u009dk\u0003í7OõáËål ñ\u0006f\u009b»±,êÒ\u0003%Ò3\u0018¹µgdáÖU~#\u0096Ôk4ø\u0003d7+ò\r\u0080\u001a\u008bÍÉT(%w2\\I¨\u007f4%\u0091¹¶À(\u0090\u0012³Ü\u0092?\u0086¸\u0090\u0097\u0081\u0012²0%Þ\u008ff\u0089u\u0088²:^a=".length();
        char cCharAt = ' ';
        int i10 = -1;
        while (true) {
            int i11 = i10 + 1;
            String strSubstring = str.substring(i11, i11 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i12 = i9;
                        i9++;
                        strArr[i12] = strIntern;
                        int i13 = i11 + cCharAt;
                        i = i13;
                        if (i13 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[14];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i14 = 1; i14 < 8; i14++) {
                                bArr2[i14] = (byte) ((j << (i14 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i15 = 0;
                            String str3 = "MÌÑ2¡¼Z\u008f\u008bçò\u0007õÝ|\u007f4]$ÙÐËl\u000f\u0012Ï\u008b\u0001á'7æ\u00123¤\u0080X\f¸\u009e";
                            int length2 = "MÌÑ2¡¼Z\u008f\u008bçò\u0007õÝ|\u007f4]$ÙÐËl\u000f\u0012Ï\u008b\u0001á'7æ\u00123¤\u0080X\f¸\u009e".length();
                            int i16 = 0;
                            while (true) {
                                int i17 = i16;
                                i16 += 8;
                                byte[] bytes = str3.substring(i17, i16).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i18 = i15;
                                i15++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j9 = j8;
                                    int i19 = i18;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i19) {
                                        case 0:
                                            jArr2[b5] = j10;
                                            if (i16 >= length2) {
                                                e = jArr;
                                                f = new Integer[7];
                                                F = new KProperty[]{Reflection.property1(new PropertyReference1Impl(u6.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7242, 6988506346768096222L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12667, 3037305254370277093L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(u6.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27744, 5272456769414409206L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30090, 3145034606648013335L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(u6.class, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20089, 5886289351885490656L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15125, 3037428443343715466L ^ j) /* invoke-custom */, 0))};
                                                k = new u6(i5, i6, (short) i7);
                                                T = yp.L(k, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17169, 4683614899633063041L ^ j) /* invoke-custom */, 1, new IntRange(0, 5), j3, null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14918, 2507407704079442693L ^ j) /* invoke-custom */, null);
                                                N = yp.t(k, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29702, 4860987491551228821L ^ j) /* invoke-custom */, false, j4, null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29082, 6143440115882354906L ^ j) /* invoke-custom */, null);
                                                h = yp.J(k, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3572, 6344529176944298598L ^ j) /* invoke-custom */, new lj(0, false, j5, false, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10364, 4327255120303108410L ^ j) /* invoke-custom */, null), null, i2, null, i3, (char) i4, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11108, 6993713510590100000L ^ j) /* invoke-custom */, null);
                                                A = new i9(j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j10;
                                            if (i16 >= length2) {
                                                str3 = "(ÆÃ\u008c:ç$\u0000Tl\u0095wYAdW";
                                                length2 = "(ÆÃ\u008c:ç$\u0000Tl\u0095wYAdW".length();
                                                i16 = 0;
                                            }
                                            break;
                                    }
                                    int i20 = i16;
                                    i16 += 8;
                                    byte[] bytes2 = str3.substring(i20, i16).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i18 = i15;
                                    i15++;
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i21 = i9;
                        i9++;
                        strArr[i21] = strIntern;
                        int i22 = i11 + cCharAt;
                        i10 = i22;
                        if (i22 < length) {
                        }
                        str = "\u0001Ï\u0081@?3¸\u0090$2ÉÂV\u0012\u0007fVúØ\u0089XO¯²t3\u0093Ö0õ\u001b¾\u0080Ã$ÊókP\rw\u009a Æ\u0086kë\u0099î \u0002Âõ\u0099\u0095jÕïÝÜ\u009f\u0019q»ëF)\u0018\u0090(>\u0004ë¾\u0011\u00ad=\u0011¶«³Ïÿîk6V¤þ\u008d÷\rvóP6|»WâS9\u001e»\u001apê^±\u0084mzG¹ø\u008d \u000by¼\u009e¸\u009bË2/»2$Ý\u008e\u00adEq¢¯¦Þ\u0081ð'\u008fþ\u0007¶¼Æ\u001c\u0084Ü\u0084Ëlf\u008cE?Hß¹Q";
                        length = "\u0001Ï\u0081@?3¸\u0090$2ÉÂV\u0012\u0007fVúØ\u0089XO¯²t3\u0093Ö0õ\u001b¾\u0080Ã$ÊókP\rw\u009a Æ\u0086kë\u0099î \u0002Âõ\u0099\u0095jÕïÝÜ\u009f\u0019q»ëF)\u0018\u0090(>\u0004ë¾\u0011\u00ad=\u0011¶«³Ïÿîk6V¤þ\u008d÷\rvóP6|»WâS9\u001e»\u001apê^±\u0084mzG¹ø\u008d \u000by¼\u009e¸\u009bË2/»2$Ý\u008e\u00adEq¢¯¦Þ\u0081ð'\u008fþ\u0007¶¼Æ\u001c\u0084Ü\u0084Ëlf\u008cE?Hß¹Q".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i11 = i + 1;
                strSubstring = str.substring(i11, i11 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i10);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 822;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u6", e2);
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
            java.lang.String r1 = "su/catlean/u6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24037;
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
                    throw new RuntimeException("su/catlean/u6", e2);
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
            java.lang.String r1 = "su/catlean/u6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u6.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
