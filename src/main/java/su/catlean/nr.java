package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nr.class */
public final class nr {

    @NotNull
    private gr I;
    private float A;
    private float n;

    @NotNull
    private String y;

    @NotNull
    private i0 U;

    @NotNull
    private final List r;
    private float e;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final long a = yz.a(6372192607014350181L, -6895057981393438557L, MethodHandles.lookup().lookupClass()).a(221304856914690L);
    private static final Map d = new HashMap(13);

    public nr(@NotNull gr type, long a2, float x, float y, @NotNull String elementId, @NotNull i0 configType) {
        long j = a ^ a2;
        long j2 = j ^ 110539022780616L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 127823536951603L;
        int i4 = (int) (j >>> 32);
        int i5 = (int) ((j3 << 32) >>> 48);
        int i6 = (int) ((j3 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(type, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10309, 1026402216618380740L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(elementId, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1321, 3690868323821445293L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(configType, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9374, 5882898770664145171L ^ j) /* invoke-custom */);
        this.I = type;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2854480520690051578L, j) /* invoke-custom */;
        this.A = x;
        this.n = y;
        this.y = elementId;
        this.U = configType;
        try {
            this.r = new ArrayList();
            this.e = 62.0f;
            nr nrVar = this;
            if (obj != null) {
                obj = nrVar.I;
                if (obj == gr.Config) {
                    this.r.addAll(CollectionsKt.listOf((Object[]) new tv[]{new tv(i4, i5, i4.h.E(i, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20877, 3051544121437697034L ^ j) /* invoke-custom */, i2, new Object[0], i3), (v1) -> {
                        return K(r8, v1);
                    }, i6), new tv(i4, i5, i4.h.E(i, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25591, 6205587977953379954L ^ j) /* invoke-custom */, i2, new Object[0], i3), (v1) -> {
                        return E(r8, v1);
                    }, i6), new tv(i4, i5, i4.h.E(i, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11131, 4239722450089594616L ^ j) /* invoke-custom */, i2, new Object[0], i3), (v1) -> {
                        return e(r8, v1);
                    }, i6)}));
                    return;
                }
                nrVar = this;
            }
            nrVar.r.add(new tv(i4, i5, i4.h.E(i, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8887, 2744773768454522677L ^ j) /* invoke-custom */, i2, new Object[0], i3), (v1) -> {
                return q(r6, v1);
            }, i6));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2776781237330490069L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nr(gr grVar, float f2, long j, float f3, String str, i0 i0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = a ^ j;
        this(grVar, j2 ^ 96890278734619L, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2222, 5067967104275878064L ^ j2) /* invoke-custom */) != 0 ? "" : str, (i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3700, 1097159615780722284L ^ j2) /* invoke-custom */) != 0 ? i0.MODULES : i0Var);
    }

    @NotNull
    public final gr B() {
        return this.I;
    }

    public final void i(long a2, @NotNull gr grVar) {
        Intrinsics.checkNotNullParameter(grVar, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8271, 4994605043767423306L ^ (a ^ a2)) /* invoke-custom */);
        this.I = grVar;
    }

    public final float T() {
        return this.A;
    }

    public final void s(float f2) {
        this.A = f2;
    }

    public final float K() {
        return this.n;
    }

    public final void f(float f2) {
        this.n = f2;
    }

    @NotNull
    public final i0 n() {
        return this.U;
    }

    public final void S(long a2, @NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2817, 5455319230584399392L ^ (a ^ a2)) /* invoke-custom */);
        this.U = i0Var;
    }

    public final float I() {
        return this.e;
    }

    public final void r(float f2) {
        this.e = f2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void O(int r24, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nr.O(int, net.minecraft.class_332, int, int, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void q(int r10, float r11, float r12, short r13, int r14, short r15) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nr.q(int, float, float, short, int, short):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    private static final Unit K(nr nrVar, String str) {
        long j = a ^ 115509538969584L;
        long j2 = j ^ 17811440729410L;
        long j3 = j ^ 29993031702272L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        Object objIsBlank = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1026102306210742362L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27258, 5664476159684322896L ^ j) /* invoke-custom */);
        try {
            objIsBlank = StringsKt.isBlank(nrVar.y);
            String str2 = objIsBlank;
            if (objIsBlank != 0) {
                str2 = objIsBlank == 0 ? 1 : 0;
            }
            if (str2 != 0) {
                try {
                    str2 = nrVar.y;
                    io.D(str2, nrVar.U, i, (short) i2, i3);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(str2, 1092491960086403957L, j) /* invoke-custom */;
                }
            }
            d2.O.c().L(j2);
            return Unit.INSTANCE;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsBlank, 1092491960086403957L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.i0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.Unit E(su.catlean.nr r8, java.lang.String r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nr.E(su.catlean.nr, java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.ir] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
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
    private static final Unit e(nr nrVar, String str) {
        long j = a ^ 78370454728613L;
        long j2 = j ^ 104689664284285L;
        long j3 = j ^ 36447584158200L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j3 << 32) >>> 56);
        int i3 = (int) ((j3 << 40) >>> 40);
        ?? IsBlank = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5302886490073581553L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6236, 7643573225691278368L ^ j) /* invoke-custom */);
        try {
            IsBlank = StringsKt.isBlank(nrVar.y);
            ?? r0 = IsBlank;
            if (IsBlank != 0) {
                r0 = IsBlank == 0 ? 1 : 0;
            }
            if (r0 != 0) {
                try {
                    io.g(i, (byte) i2, str, nrVar.U, i3);
                    ir.r.l(null);
                    r0 = ir.r;
                    r0.Y(j2);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5225193786870652128L, j) /* invoke-custom */;
                }
            }
            return Unit.INSTANCE;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsBlank, -5225193786870652128L, j) /* invoke-custom */;
        }
    }

    private static final Unit q(nr nrVar, String str) {
        long j = a ^ 134084731449793L;
        Intrinsics.checkNotNullParameter(str, (String) a(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6236, 7643545274108293700L ^ j) /* invoke-custom */);
        ir.r.f(null);
        ir.r.l(new p9(nrVar.U, (char) (j >>> 48), (int) (((j ^ 112922364142067L) << 16) >>> 32), (char) ((r1 << 48) >>> 48)));
        return Unit.INSTANCE;
    }

    static {
        int i;
        long j = a ^ 15286683413929L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[16];
        int i3 = 0;
        String str = "\u0013ÞÐU%´¾GuQG ²\u0094´\u0019 ¾\u0089»\u008cÓ©Z¬`¡\u0086ÜÖ\u009e&\u0096®#¾/|¸ßWTÂ\u0004\u0093n#ö\u001f(\b\"Û\u008a\u00ad p÷Û\u00ad\u001eq\u0005LF¡³Ea\týF4\u0089Û¶ÌeÌX0\u008aúQë=ÀàK¬(\u000e\u008b\u0095P¸,Ü%¿Æ\u0092ú4¯W.\u0019\u008d¼~+f\u0098\u000f\u0006Eþ³eû\u001a\u0080Êºw\"Ñfr\u007f8g¬Z\u0015\u000b\u0083ìÿ\u0092\u008eP¼\u0005\u0015\u000e\u0017/¢ýÝáÎØ\u0094Ï°Î\u0017i{6\u0006\u008e;\u009ea\u00adBEVÅ3í¾³Ó<º?C$Xp)s¾ Iâoâøo)L©¯\u008då±oÆw*TEµW\u001cJÍÑE\u0099òwët\u008d(Ñ\u000e*¿J\u007f\u000bÌ\b@\u000e\u00ad\u0085¼½\u0012\u008cû ]åÜ¢O}RU\u009d00'\u001f\u0000©ä\u001caçl½ \u000bÇ÷n\u009f?\u0007S¯W[øD+õ8\u008dGA\u0099Ó\u00974\nõòÒoãe\"¡\u0010\u0007I/Î©øÍ\tþ\u008bÓ{Íº§Ü +³¬eÞéï~JÕ\u001c\"&H½PÞ5gK|¯Ó\u0018}[\u0015¤Ýó\u0005¦ ±9\u000fïÏÙ|Võ¶©ÏØç-í\u0016ºíPA®ÍÕ\u009cu¤\u000eN\"ý^\u0010\u008b÷â\u00adA\u001dÀ\u009f¹ÝØwÇ\u0017Ûÿ\u0018\u0012\u009bö9£\\\u0084¼¾[|íK\u0096chµÜ\fó[Ñ\u0081\u0088\u0010\n«Ü\u0011å»Ëí$ÊMt\u000f¨\u0096½";
        int length = "\u0013ÞÐU%´¾GuQG ²\u0094´\u0019 ¾\u0089»\u008cÓ©Z¬`¡\u0086ÜÖ\u009e&\u0096®#¾/|¸ßWTÂ\u0004\u0093n#ö\u001f(\b\"Û\u008a\u00ad p÷Û\u00ad\u001eq\u0005LF¡³Ea\týF4\u0089Û¶ÌeÌX0\u008aúQë=ÀàK¬(\u000e\u008b\u0095P¸,Ü%¿Æ\u0092ú4¯W.\u0019\u008d¼~+f\u0098\u000f\u0006Eþ³eû\u001a\u0080Êºw\"Ñfr\u007f8g¬Z\u0015\u000b\u0083ìÿ\u0092\u008eP¼\u0005\u0015\u000e\u0017/¢ýÝáÎØ\u0094Ï°Î\u0017i{6\u0006\u008e;\u009ea\u00adBEVÅ3í¾³Ó<º?C$Xp)s¾ Iâoâøo)L©¯\u008då±oÆw*TEµW\u001cJÍÑE\u0099òwët\u008d(Ñ\u000e*¿J\u007f\u000bÌ\b@\u000e\u00ad\u0085¼½\u0012\u008cû ]åÜ¢O}RU\u009d00'\u001f\u0000©ä\u001caçl½ \u000bÇ÷n\u009f?\u0007S¯W[øD+õ8\u008dGA\u0099Ó\u00974\nõòÒoãe\"¡\u0010\u0007I/Î©øÍ\tþ\u008bÓ{Íº§Ü +³¬eÞéï~JÕ\u001c\"&H½PÞ5gK|¯Ó\u0018}[\u0015¤Ýó\u0005¦ ±9\u000fïÏÙ|Võ¶©ÏØç-í\u0016ºíPA®ÍÕ\u009cu¤\u000eN\"ý^\u0010\u008b÷â\u00adA\u001dÀ\u009f¹ÝØwÇ\u0017Ûÿ\u0018\u0012\u009bö9£\\\u0084¼¾[|íK\u0096chµÜ\fó[Ñ\u0081\u0088\u0010\n«Ü\u0011å»Ëí$ÊMt\u000f¨\u0096½".length();
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
                            c = new String[16];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i9 = 0;
                            String str3 = "Ò\u0084&\f@6 \u0092ù@2]@iKJaìjãAÁ)àñKæ\bü\u007f{Eù~\u0083\u0001\u0018h~Ó\u001d9áp\u0012\n»·";
                            int length2 = "Ò\u0084&\f@6 \u0092ù@2]@iKJaìjãAÁ)àñKæ\bü\u007f{Eù~\u0083\u0001\u0018h~Ó\u001d9áp\u0012\n»·".length();
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
                                                g = new Integer[8];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = ")\u0000f\u001b7¿#Ö\u008b~#\u0088ÔGO\u000e";
                                                length2 = ")\u0000f\u001b7¿#Ö\u008b~#\u0088ÔGO\u000e".length();
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
                        str = "3\"\u008c\u001fº\t-îP\u0097õD÷i¾ \u0010\få\u009a\u0002{\u0090¸±\u0002;Ý,Ax*\u0014";
                        length = "3\"\u008c\u001fº\t-îP\u0097õD÷i¾ \u0010\få\u009a\u0002{\u0090¸±\u0002;Ý,Ax*\u0014".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 17407;
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
                throw new RuntimeException("su/catlean/nr", e);
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
            java.lang.String r1 = "su/catlean/nr"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nr.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 3410;
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
                    throw new RuntimeException("su/catlean/nr", e);
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
            java.lang.String r1 = "su/catlean/nr"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nr.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
