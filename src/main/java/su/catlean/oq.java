package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.management.ManagementFactory;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.time.Instant;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/oq.class */
public class oq {

    @NotNull
    private final String[] L;

    @Nullable
    private n9 V;
    private boolean h;

    @Nullable
    private yq I;
    private final long R;

    @NotNull
    private final f0 r;

    @NotNull
    private f0 c;
    private static _g[] j;
    private static final long a = 0;
    private static final String[] d = null;
    private static final String[] e = null;
    private static final Map f = null;
    private static final long[] g = null;
    private static final Integer[] k = null;
    private static final Map l = null;
    private static final long q = 0;

    public oq(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 121521957490219L;
        this.L = new String[]{(String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27282, 7080302837422532404L ^ j3) /* invoke-custom */, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29892, 3984127056131275104L ^ j3) /* invoke-custom */, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16735, 3466750274912029927L ^ j3) /* invoke-custom */, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10434, 8340642892523660648L ^ j3) /* invoke-custom */};
        this.R = Instant.now().getEpochSecond();
        this.r = new f0(null, null, null, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4524, 6549264439343075908L ^ j3) /* invoke-custom */, null, (byte) (j3 >>> 56), (int) ((j4 << 8) >>> 32), (int) ((j4 << 40) >>> 40));
        this.c = this.r;
    }

    public final long O() {
        return this.R;
    }

    @NotNull
    public final f0 G() {
        return this.r;
    }

    @NotNull
    public final f0 Q() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.n9] */
    public final boolean F(long j2) throws Throwable {
        Object obj = a ^ j2;
        try {
            obj = this.V;
            return obj != 0;
        } catch (NumberFormatException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3402354878186061566L, obj) /* invoke-custom */;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    private final int L(long j2) {
        long j3 = a ^ j2;
        String name = ManagementFactory.getRuntimeMXBean().getName();
        Intrinsics.checkNotNullExpressionValue(name, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18712, 6527299537792247324L ^ j3) /* invoke-custom */);
        return Integer.parseInt(StringsKt.substringBefore$default(name, (char) (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(222, 3336586367169585560L ^ j3) /* invoke-custom */, (String) null, 2, (Object) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.catlean.oq] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.oq] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    protected final void J(long j2) throws Throwable {
        long j3 = a ^ j2;
        long j4 = j3 ^ 92722465318724L;
        int i = (int) (j3 >>> 48);
        int i2 = (int) ((j4 << 16) >>> 32);
        int i3 = (int) ((j4 << 48) >>> 48);
        long j5 = j3 ^ 108972968291224L;
        ?? r0 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2838237705030950327L, j3) /* invoke-custom */;
        try {
            r0 = this;
            ?? r02 = r0;
            if (r0 != 0) {
                try {
                    r0 = r0.h;
                    if (r0 == 0) {
                        return;
                    } else {
                        r02 = this;
                    }
                } catch (NumberFormatException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2836946415395665559L, j3) /* invoke-custom */;
                }
            }
            r02.k((short) i, i2, i3);
            o.G.D(j5);
        } catch (NumberFormatException unused2) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2836946415395665559L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.oq] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.oq] */
    /* JADX WARN: Type inference failed for: r0v23, types: [su.catlean.n9] */
    /* JADX WARN: Type inference failed for: r0v24 */
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
    protected final void w(int i, int i2, byte b, long j2) throws Throwable {
        long j3 = (((((long) i) << 32) | ((((long) i2) << 40) >>> 32)) | ((((long) b) << 56) >>> 56)) ^ a;
        long j4 = j3 ^ 94706565026286L;
        long j5 = j3 ^ 97815461265053L;
        long j6 = j3 ^ 84595350553321L;
        long j7 = j3 ^ 126096183550808L;
        long j8 = j3 ^ 62114491478050L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7503785629215757047L, j3) /* invoke-custom */;
        Object obj = _gVarArr;
        if (obj != null) {
            try {
                obj = this.V;
                if (obj != null) {
                    s(j7);
                }
            } catch (NumberFormatException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7502826390481451479L, j3) /* invoke-custom */;
            }
        }
        ?? r0 = this;
        ?? r02 = r0;
        if (i > 0) {
            try {
                r0.V = E(j6);
                if (_gVarArr == null) {
                    return;
                } else {
                    r02 = this;
                }
            } catch (NumberFormatException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -7502826390481451479L, j3) /* invoke-custom */;
            }
        }
        r0 = r02.V;
        if (r0 != 0) {
            b2 b2Var = b2.HANDSHAKE;
            Json jsonD = op.d();
            j9 j9Var = new j9(j4, 1, String.valueOf(j2));
            jsonD.getSerializersModule();
            r0.v(j8, b2Var, jsonD.encodeToJsonElement(j9.G.J(), j9Var));
            X(j5);
        }
    }

    protected final void A(long a2, @NotNull yq presence) {
        Intrinsics.checkNotNullParameter(presence, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16400, 7813826035816065954L ^ (a ^ a2)) /* invoke-custom */);
        this.I = presence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Unit s(long j2) throws Throwable {
        long j3 = a ^ j2;
        n9 n9Var = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5649017589642376369L, j3) /* invoke-custom */;
        if (n9Var != 0) {
            try {
                n9Var = this.V;
                if (n9Var != 0) {
                    n9Var.Q();
                    this.V = null;
                    this.h = false;
                    this.I = null;
                    this.c = this.r;
                    return Unit.INSTANCE;
                }
            } catch (NumberFormatException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(n9Var, 5645541465579167633L, j3) /* invoke-custom */;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final void k(short s, int i, int i2) throws Throwable {
        yq yqVar;
        long j2 = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) i2) << 48) >>> 48)) ^ a;
        long j3 = j2 ^ 111995610311113L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j3 << 32) >>> 48);
        int i5 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 16007221252470L;
        long j5 = j2 ^ 122391233851624L;
        int i6 = (int) (j2 >>> 48);
        int i7 = (int) ((j5 << 16) >>> 32);
        int i8 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 65091764395320L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4235408913247518739L, j2) /* invoke-custom */;
        n9 n9Var = _gVarArr;
        if (n9Var != 0) {
            try {
                n9Var = this.V;
                if (n9Var != 0 && (yqVar = _gVarArr) != 0) {
                    try {
                        yqVar = this.I;
                        if (yqVar != 0) {
                            b2 b2Var = b2.FRAME;
                            Json jsonD = op.d();
                            f8 f8Var = new f8((short) i6, aw.SET_ACTIVITY, i7, (short) i8, new dn(L(j4), i3, (char) i4, (char) i5, yqVar));
                            jsonD.getSerializersModule();
                            n9Var.v(j6, b2Var, jsonD.encodeToJsonElement(f8.L.f(), f8Var));
                        }
                    } catch (NumberFormatException unused) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(yqVar, 4249876784589368115L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(n9Var, 4249876784589368115L, j2) /* invoke-custom */;
            }
        }
        this.I = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.gk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v46, types: [su.catlean.d1] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.gk] */
    @Nullable
    public final Unit M(long j2, @NotNull gk gkVar) throws Throwable {
        long j3 = a ^ j2;
        long j4 = j3 ^ 64533528261199L;
        int i = (int) (j3 >>> 48);
        int i2 = (int) ((j4 << 16) >>> 32);
        int i3 = (int) ((j4 << 48) >>> 48);
        long j5 = j3 ^ 102080135186157L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5591187315819951940L, j3) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(gkVar, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(692, 1273271710400499330L ^ j3) /* invoke-custom */);
        try {
            obj = gkVar;
            Object objA = obj;
            if (obj != 0) {
                try {
                    obj = dc.y[obj.F().ordinal()];
                    switch (obj) {
                        case 1:
                            objA = gkVar;
                            break;
                        case 2:
                            System.out.println((Object) ((String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28019, 5639345604441055579L ^ j3) /* invoke-custom */ + gkVar.b().J().A() + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21742, 4511395772648429781L ^ j3) /* invoke-custom */ + gkVar.b().J().F()));
                            return s(j5);
                        default:
                            return Unit.INSTANCE;
                    }
                } catch (NumberFormatException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5596367545869966436L, j3) /* invoke-custom */;
                }
            }
            try {
                try {
                    f4 f4VarB = objA.b();
                    f4 f4VarB2 = f4VarB;
                    if (j3 >= 0) {
                        f4VarB2 = f4VarB;
                        if (obj != 0) {
                            objA = f4VarB.a();
                            if (objA == d1.ERROR) {
                                System.out.println((Object) ((String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(794, 3910823864998940459L ^ j3) /* invoke-custom */ + gkVar.b().J().A() + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11362, 1577413703659020368L ^ j3) /* invoke-custom */ + gkVar.b().J().F()));
                                return Unit.INSTANCE;
                            }
                            f4VarB2 = gkVar.b();
                        }
                    }
                    try {
                        try {
                            if (f4VarB2.Z() != aw.DISPATCH) {
                                return Unit.INSTANCE;
                            }
                            this.h = true;
                            f0 f0VarX = gkVar.b().J().X();
                            Intrinsics.checkNotNull(f0VarX);
                            this.c = f0VarX;
                            f4VarB2 = obj;
                            if (f4VarB2 == 0 || this.I == null) {
                                return null;
                            }
                            k((short) i, i2, i3);
                            return Unit.INSTANCE;
                        } catch (NumberFormatException unused2) {
                            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(f4VarB2, -5596367545869966436L, j3) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused3) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(f4VarB2, -5596367545869966436L, j3) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused4) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, -5596367545869966436L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused5) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, -5596367545869966436L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5596367545869966436L, j3) /* invoke-custom */;
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
    private final su.catlean.n9 E(long r11) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oq.E(long):su.catlean.n9");
    }

    private final void X(long j2) {
        long j3 = a ^ j2;
        ThreadsKt.thread$default(true, true, null, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32235, 8517008854125629459L ^ j3) /* invoke-custom */, 0, () -> {
            return E(r5);
        }, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28096, 6639847639535341172L ^ j3) /* invoke-custom */, null);
    }

    private static final Unit E(oq oqVar) throws InterruptedException {
        Unit unit;
        long j2 = a ^ 46230171319287L;
        long j3 = j2 ^ 77851565710843L;
        long j4 = j2 ^ 11862306084242L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4577870066072896852L, j2) /* invoke-custom */;
        while (oqVar.F(j4)) {
            try {
                Result.Companion companion = Result.Companion;
                oqVar.J(j3);
                unit = Unit.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m185constructorimpl(ResultKt.createFailure(th));
            }
            if (_gVarArr == null) {
                return unit;
            }
            Result.m185constructorimpl(unit);
            Thread.sleep(q);
            if (_gVarArr == null) {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    public static void X(_g[] _gVarArr) {
        j = _gVarArr;
    }

    public static _g[] c() {
        return j;
    }

    private static Throwable a(Throwable th) {
        return th;
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

    private static String a(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 32574;
        if (e[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i2] = a(((Cipher) objArr[0]).doFinal(d[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/oq", e2);
            }
        }
        return e[i2];
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
            java.lang.String r1 = "su/catlean/oq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oq.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j2) {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 29048;
        if (k[i2] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/oq", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i2].intValue();
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
            java.lang.String r1 = "su/catlean/oq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.oq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
