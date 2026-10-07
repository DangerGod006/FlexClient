package su.catlean;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import net.minecraft.class_156;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qz.class */
public final class qz extends _g {

    @NotNull
    public static final qz D = null;
    static final KProperty[] x = null;

    @NotNull
    private static final a6 o = null;

    @NotNull
    private static final cw B = null;

    @NotNull
    private static final cl O = null;

    @NotNull
    private static final cq t = null;

    @NotNull
    private static final ct P = null;

    @NotNull
    private static final bg y = null;

    @NotNull
    private static List U;
    private static long f;

    @NotNull
    private static final File m = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long[] e = null;
    private static final Integer[] g = null;
    private static final Map h = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private qz(short s, int i, short s2) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27602, 2252592867458426674L ^ j) /* invoke-custom */, jt.d(), null, 4, null, j ^ 135655062064271L);
    }

    private final id L(long j) {
        return (id) o.E(this, (a ^ j) ^ 129082412494142L, x[0]);
    }

    private final void r(long j, id idVar) {
        o.b(this, (a ^ j) ^ 18399346235947L, x[0], idVar);
    }

    private final lw h(long j) {
        return (lw) B.E(this, (a ^ j) ^ 58171725307269L, x[1]);
    }

    private final void O(int i, int i2, lw lwVar) {
        B.b(this, (((((long) i) << 32) | ((((long) i2) << 32) >>> 32)) ^ a) ^ 37694418063156L, x[1], lwVar);
    }

    private final String A(long j) {
        return (String) O.E(this, (a ^ j) ^ 105274745241990L, x[2]);
    }

    private final void O(String str, long j) {
        O.b(this, (a ^ j) ^ 73158664716794L, x[2], str);
    }

    private final boolean t(long j) {
        return ((Boolean) t.E(this, (a ^ j) ^ 90439092328432L, x[3])).booleanValue();
    }

    private final void j(boolean z, byte b2, int i, int i2) {
        t.b(this, ((((((long) b2) << 56) | ((((long) i) << 32) >>> 8)) | ((((long) i2) << 40) >>> 40)) ^ a) ^ 67127622530863L, x[3], Boolean.valueOf(z));
    }

    private final float q(long j) {
        return ((Number) P.E(this, (a ^ j) ^ 45273411762050L, x[4])).floatValue();
    }

    private final void a(int i, int i2, char c2, float f2) {
        P.b(this, ((((((long) i) << 32) | ((((long) i2) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 3103647599513L, x[4], Float.valueOf(f2));
    }

    @Override // su.catlean._g
    public void O(long j) {
        long j2 = j ^ 80685729543634L;
        U = n((int) (j >>> 32), (char) ((j2 << 32) >>> 48), (short) ((j2 << 48) >>> 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x038d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029c A[EXC_TOP_SPLITTER, PHI: r0 r43
  0x029c: PHI (r0v50 ??) = (r0v110 ??), (r0v111 ??) binds: [B:67:0x0237, B:78:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x029c: PHI (r43v1 ??) = (r43v6 ??), (r43v7 ??) binds: [B:67:0x0237, B:78:0x028e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b8 A[Catch: NoWhenBranchMatchedException -> 0x02cf, NoWhenBranchMatchedException -> 0x02eb, TRY_ENTER, TryCatch #1 {NoWhenBranchMatchedException -> 0x02cf, blocks: (B:79:0x029c, B:80:0x02b8), top: B:111:0x029c, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d9 A[Catch: NoWhenBranchMatchedException -> 0x02eb, NoWhenBranchMatchedException -> 0x0318, FALL_THROUGH, TRY_ENTER, TryCatch #3 {NoWhenBranchMatchedException -> 0x02eb, blocks: (B:80:0x02b8, B:85:0x02d9, B:83:0x02cf, B:84:0x02d8, B:79:0x029c), top: B:111:0x029c, outer: #17, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f5 A[Catch: NoWhenBranchMatchedException -> 0x0318, NoWhenBranchMatchedException -> 0x032a, FALL_THROUGH, TRY_ENTER, TryCatch #17 {NoWhenBranchMatchedException -> 0x0318, blocks: (B:85:0x02d9, B:90:0x02f5, B:88:0x02eb, B:89:0x02f4, B:80:0x02b8, B:83:0x02cf, B:84:0x02d8, B:79:0x029c), top: B:111:0x029c, outer: #4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0322 A[Catch: NoWhenBranchMatchedException -> 0x032a, FALL_THROUGH, TryCatch #4 {NoWhenBranchMatchedException -> 0x032a, blocks: (B:93:0x0318, B:94:0x0321, B:90:0x02f5, B:95:0x0322, B:96:0x0329, B:85:0x02d9, B:88:0x02eb, B:89:0x02f4), top: B:111:0x029c, inners: #17 }] */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [su.catlean.qz] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v4 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v6 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r12) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qz.R(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    private final String s(long j) {
        long j2 = a ^ j;
        Collection collectionMethod_2880 = zf.k(j2 ^ 113126182702178L).method_2880();
        Intrinsics.checkNotNullExpressionValue(collectionMethod_2880, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20170, 6759888767380424391L ^ j2) /* invoke-custom */);
        return (String) CollectionsKt.randomOrNull(SequencesKt.toList(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(collectionMethod_2880), qz::V), qz::s)), Random.Default);
    }

    private final String V(short s, int i, int i2) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) i2) << 48) >>> 48)) ^ a;
        return "[" + ((char) (Random.Default.nextInt((int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11654, 1078486762861150441L ^ j) /* invoke-custom */) + (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(860, 2782880173529787953L ^ j) /* invoke-custom */)) + Random.Default.nextInt((int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16900, 7290821094000176996L ^ j) /* invoke-custom */) + ((char) (Random.Default.nextInt((int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11730, 6101702365929685168L ^ j) /* invoke-custom */) + (int) c(MethodHandles.lookup(), "e", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3654, 153733694150501159L ^ j) /* invoke-custom */)) + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0 A[PHI: r0
  0x01c0: PHI (r0v53 ??) = (r0v94 ??), (r0v54 ??) binds: [B:61:0x019b, B:69:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01ca -> B:50:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List n(int r10, char r11, short r12) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qz.n(int, char, short):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static final Unit i() throws IOException {
        long j = a ^ 129350980758233L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4354310146579013687L, j) /* invoke-custom */;
        class_156.class_158 class_158VarMethod_668 = class_156.method_668();
        File file = m;
        Object objExists = z;
        if (objExists != 0) {
            try {
                try {
                    objExists = file.exists();
                    if (objExists == 0) {
                        file.createNewFile();
                    }
                    class_158VarMethod_668.method_672(file);
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -4377008830728432413L, j) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objExists, -4377008830728432413L, j) /* invoke-custom */;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.lw] */
    private static final boolean g() {
        long j = a ^ 42833674149777L;
        Object objH = j;
        try {
            objH = D.h(objH ^ 91106625621520L);
            return objH == lw.WHISPERS;
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3893906104090091947L, j) /* invoke-custom */;
        }
    }

    private static final String V(class_640 class_640Var) {
        Intrinsics.checkNotNullParameter(class_640Var, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1470, 1356799562519592171L ^ (a ^ 102537847718200L)) /* invoke-custom */);
        return class_640Var.method_2966().name();
    }

    private static final boolean s(String str) {
        return Pattern.matches((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15185, 6854877885851089232L ^ (a ^ 59820121946726L)) /* invoke-custom */, str);
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 20660;
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
                throw new RuntimeException("su/catlean/qz", e2);
            }
        }
        return c[i2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qz.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qz.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 6130;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/qz", e2);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qz.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qz.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x000C: CONST
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: JadxRuntimeException: Failed to decode insn: 0x000C: CONST in method: su.catlean.qz.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/qz.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.qz.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
