package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i4.class */
public final class i4 {

    @NotNull
    public static final i4 h = null;

    @NotNull
    private static of l;
    private static String D;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map d = null;
    private static final long e = 0;

    private i4() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        r0 = (su.catlean.of) r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        r0 = su.catlean.of.EN;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
        ).invoke(r0, -89904009803065226L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        su.catlean.i4.l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(su.catlean.api.event.events.client.ScreenEvent r8) throws java.lang.Throwable {
        /*
            r7 = this;
            long r0 = su.catlean.i4.a
            r1 = 80024007182031(0x48c80a8586cf, double:3.95371127911947E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 28968058167906(0x1a58a6d12262, double:1.43121223674933E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -139720241072347492(0xfe0f9d2e56f3669c, double:-1.6540361626243623E299)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r13 = r0
            r0 = r11
            net.minecraft.class_310 r0 = su.catlean.zf.F(r0)
            net.minecraft.class_315 r0 = r0.field_1690
            java.lang.String r0 = r0.field_1883
            su.catlean.of r1 = su.catlean.i4.l
            java.lang.String r1 = r1.i()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto La0
            kotlin.enums.EnumEntries r0 = su.catlean.of.b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L47:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L84
            r0 = r16
            java.lang.Object r0 = r0.next()
            r17 = r0
            r0 = r17
        L5c:
            su.catlean.of r0 = (su.catlean.of) r0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r18
            java.lang.String r0 = r0.i()
            r1 = r11
            net.minecraft.class_310 r1 = su.catlean.zf.F(r1)
            net.minecraft.class_315 r1 = r1.field_1690
            java.lang.String r1 = r1.field_1883
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L47
            r0 = r17
            r1 = r13
            if (r1 == 0) goto L5c
            goto L85
        L84:
            r0 = 0
        L85:
            su.catlean.of r0 = (su.catlean.of) r0     // Catch: java.util.IllegalFormatException -> L93
            r1 = r0
            if (r1 != 0) goto L9d
        L8d:
            su.catlean.of r0 = su.catlean.of.EN     // Catch: java.util.IllegalFormatException -> L93
            goto L9d
        L93:
            r1 = -89904009803065226(0xfec098c787ce1876, double:-3.5567216517566625E302)
            r2 = r9
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L9d:
            su.catlean.i4.l = r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i4.w(su.catlean.api.event.events.client.ScreenEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:5:0x0056
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String E(int r9, @org.jetbrains.annotations.NotNull java.lang.String r10, int r11, @org.jetbrains.annotations.NotNull java.lang.Object[] r12, int r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i4.E(int, java.lang.String, int, java.lang.Object[], int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0045, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124 A[Catch: Throwable -> 0x01bd, PHI: r0
  0x0124: PHI (r0v39 ??) = (r0v64 ??), (r0v38 ??) binds: [B:19:0x0107, B:26:0x0122] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Throwable -> 0x01bd, blocks: (B:3:0x002c, B:4:0x0045, B:6:0x004f, B:7:0x0056, B:8:0x00a4, B:10:0x00d1, B:16:0x00ed, B:17:0x00f8, B:20:0x010a, B:27:0x0124, B:28:0x0133, B:30:0x013d, B:46:0x01a3, B:44:0x0198, B:45:0x01a2, B:24:0x0117, B:25:0x0121, B:15:0x00e7, B:13:0x00dc, B:14:0x00e6, B:47:0x01b1), top: B:53:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d A[Catch: Throwable -> 0x01bd, TryCatch #0 {Throwable -> 0x01bd, blocks: (B:3:0x002c, B:4:0x0045, B:6:0x004f, B:7:0x0056, B:8:0x00a4, B:10:0x00d1, B:16:0x00ed, B:17:0x00f8, B:20:0x010a, B:27:0x0124, B:28:0x0133, B:30:0x013d, B:46:0x01a3, B:44:0x0198, B:45:0x01a2, B:24:0x0117, B:25:0x0121, B:15:0x00e7, B:13:0x00dc, B:14:0x00e6, B:47:0x01b1), top: B:53:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(short r10, char r11, int r12) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i4.y(short, char, int):void");
    }

    public static void m(String str) {
        D = str;
    }

    public static String w() {
        return D;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 242;
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
                throw new RuntimeException("su/catlean/i4", e2);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/i4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i4.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
