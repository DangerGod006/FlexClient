package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/od.class */
public final class od extends o3 {

    @NotNull
    private final mx A;

    @NotNull
    private final File B;
    public mh v;
    public List R;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] d = null;
    private static final Map h = null;
    private static final long i = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public od(@NotNull Json json, long a2, @NotNull mx sharedSource) {
        long j = a ^ a2;
        long j2 = j ^ 25989931992274L;
        Intrinsics.checkNotNullParameter(json, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24079, 4967813457087259496L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(sharedSource, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23644, 6434847837270991161L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48), json);
        this.A = sharedSource;
        this.B = new File(mj.v(), (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5629, 7090191004775065756L ^ j) /* invoke-custom */);
    }

    @Override // su.catlean.o3
    @NotNull
    public File U() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [su.catlean.mh] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Exception, java.lang.Throwable] */
    @NotNull
    public final mh H(long j) throws Exception {
        long j2 = a ^ j;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(305224229301229336L, j2) /* invoke-custom */;
        if (obj != 0) {
            return null;
        }
        try {
            try {
                obj = this.v;
                if (obj != 0) {
                    return obj;
                }
                Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13827, 5823748663478470693L ^ j2) /* invoke-custom */);
                return null;
            } catch (NumberFormatException unused) {
                obj = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 295289444154371828L, j2) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 295289444154371828L, j2) /* invoke-custom */;
        }
    }

    public final void m(long a2, @NotNull mh mhVar) {
        Intrinsics.checkNotNullParameter(mhVar, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26757, 8852366646895449579L ^ (a ^ a2)) /* invoke-custom */);
        this.v = mhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Exception, java.lang.Throwable] */
    @NotNull
    public final List s(long j) {
        long j2 = a ^ j;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-191634515149558157L, j2) /* invoke-custom */;
        if (obj != 0) {
            return null;
        }
        try {
            try {
                obj = this.R;
                if (obj != 0) {
                    return obj;
                }
                Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(127, 5905243560313882419L ^ j2) /* invoke-custom */);
                return null;
            } catch (NumberFormatException unused) {
                obj = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -183971853740042337L, j2) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -183971853740042337L, j2) /* invoke-custom */;
        }
    }

    public final void v(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21507, 3001033825287427130L ^ (a ^ a2)) /* invoke-custom */);
        this.R = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6 A[Catch: Exception -> 0x025f, TryCatch #0 {Exception -> 0x025f, blocks: (B:3:0x003a, B:4:0x0048, B:10:0x0065, B:15:0x007c, B:24:0x00ab, B:84:0x024c, B:32:0x00c9, B:35:0x00f1, B:36:0x00ff, B:49:0x0142, B:50:0x014b, B:46:0x0127, B:51:0x014c, B:54:0x0163, B:52:0x0159, B:53:0x0162, B:44:0x011d, B:45:0x0126, B:57:0x016b, B:59:0x019c, B:60:0x01a5, B:62:0x01af, B:63:0x01df, B:73:0x0218, B:74:0x0221, B:75:0x0222, B:80:0x023d, B:81:0x0246, B:29:0x00bd, B:30:0x00c6, B:16:0x0082, B:17:0x008b, B:19:0x008f, B:23:0x00a6, B:21:0x009f, B:22:0x00a5, B:13:0x0072, B:14:0x007b, B:8:0x005b, B:9:0x0064), top: B:115:0x003a, inners: #2, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[Catch: Exception -> 0x025f, PHI: r0
  0x00c9: PHI (r0v59 java.io.File[]) = (r0v58 java.io.File[]), (r0v134 java.io.File[]) binds: [B:26:0x00b4, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x025f, blocks: (B:3:0x003a, B:4:0x0048, B:10:0x0065, B:15:0x007c, B:24:0x00ab, B:84:0x024c, B:32:0x00c9, B:35:0x00f1, B:36:0x00ff, B:49:0x0142, B:50:0x014b, B:46:0x0127, B:51:0x014c, B:54:0x0163, B:52:0x0159, B:53:0x0162, B:44:0x011d, B:45:0x0126, B:57:0x016b, B:59:0x019c, B:60:0x01a5, B:62:0x01af, B:63:0x01df, B:73:0x0218, B:74:0x0221, B:75:0x0222, B:80:0x023d, B:81:0x0246, B:29:0x00bd, B:30:0x00c6, B:16:0x0082, B:17:0x008b, B:19:0x008f, B:23:0x00a6, B:21:0x009f, B:22:0x00a5, B:13:0x0072, B:14:0x007b, B:8:0x005b, B:9:0x0064), top: B:115:0x003a, inners: #2, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1 A[Catch: Exception -> 0x025f, TryCatch #0 {Exception -> 0x025f, blocks: (B:3:0x003a, B:4:0x0048, B:10:0x0065, B:15:0x007c, B:24:0x00ab, B:84:0x024c, B:32:0x00c9, B:35:0x00f1, B:36:0x00ff, B:49:0x0142, B:50:0x014b, B:46:0x0127, B:51:0x014c, B:54:0x0163, B:52:0x0159, B:53:0x0162, B:44:0x011d, B:45:0x0126, B:57:0x016b, B:59:0x019c, B:60:0x01a5, B:62:0x01af, B:63:0x01df, B:73:0x0218, B:74:0x0221, B:75:0x0222, B:80:0x023d, B:81:0x0246, B:29:0x00bd, B:30:0x00c6, B:16:0x0082, B:17:0x008b, B:19:0x008f, B:23:0x00a6, B:21:0x009f, B:22:0x00a5, B:13:0x0072, B:14:0x007b, B:8:0x005b, B:9:0x0064), top: B:115:0x003a, inners: #2, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c A[Catch: Exception -> 0x025f, TryCatch #0 {Exception -> 0x025f, blocks: (B:3:0x003a, B:4:0x0048, B:10:0x0065, B:15:0x007c, B:24:0x00ab, B:84:0x024c, B:32:0x00c9, B:35:0x00f1, B:36:0x00ff, B:49:0x0142, B:50:0x014b, B:46:0x0127, B:51:0x014c, B:54:0x0163, B:52:0x0159, B:53:0x0162, B:44:0x011d, B:45:0x0126, B:57:0x016b, B:59:0x019c, B:60:0x01a5, B:62:0x01af, B:63:0x01df, B:73:0x0218, B:74:0x0221, B:75:0x0222, B:80:0x023d, B:81:0x0246, B:29:0x00bd, B:30:0x00c6, B:16:0x0082, B:17:0x008b, B:19:0x008f, B:23:0x00a6, B:21:0x009f, B:22:0x00a5, B:13:0x0072, B:14:0x007b, B:8:0x005b, B:9:0x0064), top: B:115:0x003a, inners: #2, #5, #6, #9 }] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.od] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.od] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.od.w(long):void");
    }

    @Override // su.catlean.co
    public void h(int i2, int i3, byte b) throws Exception {
        long j = (((long) i2) << 32) | ((((long) i3) << 40) >>> 32) | ((((long) b) << 56) >>> 56);
        long j2 = j ^ 19986762959814L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7463364205943846071L, j) /* invoke-custom */;
        for (mh mhVar : s(j2)) {
            File file = new File(U(), mhVar.R() + (String) b(MethodHandles.lookup(), "m", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10192, 8599713368336677456L ^ j) /* invoke-custom */);
            file.createNewFile();
            Json jsonV = V();
            try {
                jsonV.getSerializersModule();
                FilesKt.writeText$default(file, jsonV.encodeToString(mh.F.v(), mhVar), null, 2, null);
                do {
                    String str2 = str;
                    if (i3 > 0) {
                        if (str2 != null) {
                            return;
                        } else {
                            str2 = str;
                        }
                    }
                    if (str2 != null) {
                    }
                } while (i3 < 0);
                return;
            } catch (NumberFormatException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, 7473294555061423451L, j) /* invoke-custom */;
            }
        }
    }

    private static Exception a(Exception exc) {
        return exc;
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

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 31725;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) h.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/od", e);
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
            java.lang.String r1 = "su/catlean/od"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.od.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
