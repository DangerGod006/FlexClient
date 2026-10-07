package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xr.class */
@Deprecated(message = "This synthesized declaration should not be used directly", level = DeprecationLevel.HIDDEN)
public final /* synthetic */ class xr implements GeneratedSerializer {

    @NotNull
    public static final xr N;

    @NotNull
    private static final SerialDescriptor y;
    private static final long a = yz.a(-4667064007167709103L, -441685530707106909L, MethodHandles.lookup().lookupClass()).a(259281605923610L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    private xr() {
    }

    public final void F(long a2, @NotNull Encoder encoder, @NotNull f4 value) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(encoder, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2288, 1071354830039329631L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(value, (String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5586, 5899096650452481659L ^ j) /* invoke-custom */);
        SerialDescriptor serialDescriptor = y;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        f4.C(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:29:0x011b, B:37:0x0153], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3 A[PHI: r0 r18 r20 r21 r22 r23
  0x01b3: PHI (r0v33 java.lang.String[]) = (r0v39 java.lang.String[]), (r0v40 java.lang.String[]) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r18v6 ??) = (r18v15 ??), (r18v16 ??) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r20v7 int) = (r20v10 int), (r20v11 int) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r21v5 su.catlean.d1) = (r21v7 su.catlean.d1), (r21v8 su.catlean.d1) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r22v6 su.catlean.aw) = (r22v9 su.catlean.aw), (r22v10 su.catlean.aw) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r23v7 su.catlean.y9) = (r23v9 su.catlean.y9), (r23v10 su.catlean.y9) binds: [B:45:0x018e, B:43:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01db A[PHI: r0 r18 r20 r21 r22 r23
  0x01db: PHI (r0v26 java.lang.String[]) = (r0v32 java.lang.String[]), (r0v33 java.lang.String[]) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r18v4 ??) = (r18v17 ??), (r18v18 ??) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r20v4 int) = (r20v6 int), (r20v7 int) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r21v3 su.catlean.d1) = (r21v4 su.catlean.d1), (r21v5 su.catlean.d1) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r22v4 su.catlean.aw) = (r22v5 su.catlean.aw), (r22v6 su.catlean.aw) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r23v4 su.catlean.y9) = (r23v6 su.catlean.y9), (r23v7 su.catlean.y9) binds: [B:49:0x01bc, B:47:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.serialization.encoding.CompositeDecoder] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01ea -> B:41:0x0178). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.f4 l(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r11, long r12) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.xr.l(kotlinx.serialization.encoding.Decoder, long):su.catlean.f4");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return y;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArrW = f4.w();
        return new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer) lazyArrW[0].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArrW[1].getValue()), zb.K};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object value) {
        F((a ^ 50202912419571L) ^ 75266351206362L, encoder, (f4) value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: deserialize */
    public Object mo1886deserialize(Decoder decoder) {
        return l(decoder, (a ^ 47603986060283L) ^ 40112645193009L);
    }

    static {
        int i;
        long j = a ^ 26602687243173L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[7];
        int i3 = 0;
        String str = "Ò\u0003Ñ6ÙüzÔÔs·Ízßi\u0003\u0010,ðaK\u0088\u001e\u0019ïA½\u008f\bðf\u0098F\u00102f\u001bC\u000fV\rV\r²>[êÂ\n¶\u0010û\u009cï#õß\u001aYþå\u0085÷\u009cá`n\u0010\u0004#ö\u0088\u0085ÂÛèý*¤\r^g\u001d\u0007";
        int length = "Ò\u0003Ñ6ÙüzÔÔs·Ízßi\u0003\u0010,ðaK\u0088\u001e\u0019ïA½\u008f\bðf\u0098F\u00102f\u001bC\u000fV\rV\r²>[êÂ\n¶\u0010û\u009cï#õß\u001aYþå\u0085÷\u009cá`n\u0010\u0004#ö\u0088\u0085ÂÛèý*¤\r^g\u001d\u0007".length();
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[7];
                            N = new xr();
                            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor((String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13104, 7930846958679069993L ^ j) /* invoke-custom */, N, 3);
                            pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8435, 7820581636972545768L ^ j) /* invoke-custom */, false);
                            pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13272, 3126375460323759557L ^ j) /* invoke-custom */, false);
                            pluginGeneratedSerialDescriptor.addElement((String) a(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12892, 2710263703583233091L ^ j) /* invoke-custom */, false);
                            y = pluginGeneratedSerialDescriptor;
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "¯m\u0092AÙ\u0088ÁÔhh\u001bW6¡4) îò@\u001d\u001e¼\u0083Úÿd\u001aé^x\u0088àå`ÅíýêËÄ§\"\u009a&n\u0086`%";
                        length = "¯m\u0092AÙ\u0088ÁÔhh\u001bW6¡4) îò@\u001d\u001e¼\u0083Úÿd\u001aé^x\u0088àå`ÅíýêËÄ§\"\u009a&n\u0086`%".length();
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

    private static UnknownFieldException a(UnknownFieldException unknownFieldException) {
        return unknownFieldException;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 17027;
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
                throw new RuntimeException("su/catlean/xr", e);
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
            java.lang.String r1 = "su/catlean/xr"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.xr.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
