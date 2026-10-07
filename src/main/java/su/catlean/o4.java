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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/o4.class */
public final class o4 extends o3 {

    @NotNull
    private final mx d;

    @NotNull
    private final File N;
    public List J;
    public o_ R;
    private static final long a = 0;
    private static final String[] c = null;
    private static final String[] h = null;
    private static final Map i = null;
    private static final long m = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o4(@NotNull Json json, @NotNull mx sharedSource, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 24081682798801L;
        Intrinsics.checkNotNullParameter(json, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25293, 4694936139505973827L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(sharedSource, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18542, 1018306007998140647L ^ j) /* invoke-custom */);
        super((int) (j >>> 32), (short) ((j2 << 32) >>> 48), (char) ((j2 << 48) >>> 48), json);
        this.d = sharedSource;
        this.N = new File(mj.v(), (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14502, 3441522919587438637L ^ j) /* invoke-custom */);
    }

    @Override // su.catlean.o3
    @NotNull
    public File U() {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @NotNull
    public final List Z(long j, byte b) throws Exception {
        long j2 = ((j << 8) | ((((long) b) << 56) >>> 56)) ^ a;
        Object obj = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4620883916760142597L, j2) /* invoke-custom */;
        if (obj != 0) {
            return null;
        }
        try {
            try {
                obj = this.J;
                if (obj != 0) {
                    return obj;
                }
                Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23521, 6242293795020695492L ^ j2) /* invoke-custom */);
                return null;
            } catch (NumberFormatException unused) {
                obj = (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4636219579035785652L, j2) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4636219579035785652L, j2) /* invoke-custom */;
        }
    }

    public final void I(@NotNull List list, long a2) {
        Intrinsics.checkNotNullParameter(list, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30343, 7410571354657902964L ^ (a ^ a2)) /* invoke-custom */);
        this.J = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.o_] */
    @NotNull
    public final o_ k(long j) throws Exception {
        Object obj = a ^ j;
        try {
            obj = this.R;
            if (obj != 0) {
                return obj;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27763, 566169858078179445L ^ obj) /* invoke-custom */);
            return null;
        } catch (NumberFormatException unused) {
            throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1187103526604949918L, obj) /* invoke-custom */;
        }
    }

    public final void W(long a2, @NotNull o_ o_Var) {
        Intrinsics.checkNotNullParameter(o_Var, (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30857, 7330643387750197864L ^ (a ^ a2)) /* invoke-custom */);
        this.R = o_Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:3:0x0042, B:4:0x0050, B:10:0x006d, B:15:0x0084, B:24:0x00b3, B:84:0x0254, B:32:0x00d1, B:35:0x00f9, B:36:0x0107, B:49:0x014a, B:50:0x0153, B:46:0x012f, B:51:0x0154, B:54:0x016b, B:52:0x0161, B:53:0x016a, B:44:0x0125, B:45:0x012e, B:57:0x0173, B:59:0x01a4, B:60:0x01ad, B:62:0x01b7, B:63:0x01e7, B:73:0x0220, B:74:0x0229, B:75:0x022a, B:80:0x0245, B:81:0x024e, B:29:0x00c5, B:30:0x00ce, B:16:0x008a, B:17:0x0093, B:19:0x0097, B:23:0x00ae, B:21:0x00a7, B:22:0x00ad, B:13:0x007a, B:14:0x0083, B:8:0x0063, B:9:0x006c), top: B:120:0x0042, inners: #0, #2, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[Catch: Exception -> 0x0267, PHI: r0
  0x00d1: PHI (r0v58 java.io.File[]) = (r0v57 java.io.File[]), (r0v133 java.io.File[]) binds: [B:26:0x00bc, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {Exception -> 0x0267, blocks: (B:3:0x0042, B:4:0x0050, B:10:0x006d, B:15:0x0084, B:24:0x00b3, B:84:0x0254, B:32:0x00d1, B:35:0x00f9, B:36:0x0107, B:49:0x014a, B:50:0x0153, B:46:0x012f, B:51:0x0154, B:54:0x016b, B:52:0x0161, B:53:0x016a, B:44:0x0125, B:45:0x012e, B:57:0x0173, B:59:0x01a4, B:60:0x01ad, B:62:0x01b7, B:63:0x01e7, B:73:0x0220, B:74:0x0229, B:75:0x022a, B:80:0x0245, B:81:0x024e, B:29:0x00c5, B:30:0x00ce, B:16:0x008a, B:17:0x0093, B:19:0x0097, B:23:0x00ae, B:21:0x00a7, B:22:0x00ad, B:13:0x007a, B:14:0x0083, B:8:0x0063, B:9:0x006c), top: B:120:0x0042, inners: #0, #2, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9 A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:3:0x0042, B:4:0x0050, B:10:0x006d, B:15:0x0084, B:24:0x00b3, B:84:0x0254, B:32:0x00d1, B:35:0x00f9, B:36:0x0107, B:49:0x014a, B:50:0x0153, B:46:0x012f, B:51:0x0154, B:54:0x016b, B:52:0x0161, B:53:0x016a, B:44:0x0125, B:45:0x012e, B:57:0x0173, B:59:0x01a4, B:60:0x01ad, B:62:0x01b7, B:63:0x01e7, B:73:0x0220, B:74:0x0229, B:75:0x022a, B:80:0x0245, B:81:0x024e, B:29:0x00c5, B:30:0x00ce, B:16:0x008a, B:17:0x0093, B:19:0x0097, B:23:0x00ae, B:21:0x00a7, B:22:0x00ad, B:13:0x007a, B:14:0x0083, B:8:0x0063, B:9:0x006c), top: B:120:0x0042, inners: #0, #2, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4 A[Catch: Exception -> 0x0267, TryCatch #5 {Exception -> 0x0267, blocks: (B:3:0x0042, B:4:0x0050, B:10:0x006d, B:15:0x0084, B:24:0x00b3, B:84:0x0254, B:32:0x00d1, B:35:0x00f9, B:36:0x0107, B:49:0x014a, B:50:0x0153, B:46:0x012f, B:51:0x0154, B:54:0x016b, B:52:0x0161, B:53:0x016a, B:44:0x0125, B:45:0x012e, B:57:0x0173, B:59:0x01a4, B:60:0x01ad, B:62:0x01b7, B:63:0x01e7, B:73:0x0220, B:74:0x0229, B:75:0x022a, B:80:0x0245, B:81:0x024e, B:29:0x00c5, B:30:0x00ce, B:16:0x008a, B:17:0x0093, B:19:0x0097, B:23:0x00ae, B:21:0x00a7, B:22:0x00ad, B:13:0x007a, B:14:0x0083, B:8:0x0063, B:9:0x006c), top: B:120:0x0042, inners: #0, #2, #8, #10 }] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.o4] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.o4] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o4.w(long):void");
    }

    @Override // su.catlean.co
    public void h(int i2, int i3, byte b) throws Exception {
        long j = (((long) i2) << 32) | ((((long) i3) << 40) >>> 32) | ((((long) b) << 56) >>> 56);
        List<o_> listZ = Z(j >>> 8, (byte) (((j ^ 19920229037783L) << 56) >>> 56));
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7463364205943846071L, j) /* invoke-custom */;
        for (o_ o_Var : listZ) {
            File file = new File(U(), o_Var.z() + (String) b(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30037, 1459823514126422326L ^ j) /* invoke-custom */);
            file.createNewFile();
            Json jsonV = V();
            try {
                jsonV.getSerializersModule();
                FilesKt.writeText$default(file, jsonV.encodeToString(o_.q.U(), o_Var), null, 2, null);
                do {
                    String str2 = str;
                    if (i3 >= 0) {
                        if (str2 != null) {
                            return;
                        } else {
                            str2 = str;
                        }
                    }
                    if (str2 != null) {
                    }
                } while (i2 < 0);
                return;
            } catch (NumberFormatException unused) {
                throw (Exception) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Exception.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(file, 7486309037438123520L, j) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 516;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(c[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/o4", e);
            }
        }
        return h[i3];
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/o4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.o4.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
