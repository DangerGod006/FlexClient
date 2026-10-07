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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nu.class */
public final class nu {

    @NotNull
    private final class_243 h;
    private final float T;
    private final float O;

    @NotNull
    private final bg a;
    private static _g[] d;
    private static final long b = yz.a(-6889127401910834784L, -6310379068711708749L, MethodHandles.lookup().lookupClass()).a(264696519164811L);
    private static final String[] c;
    private static final String[] e;
    private static final Map f;

    public nu(@NotNull class_243 vec, float yaw, float pitch, long a, @NotNull bg life) {
        long j = b ^ a;
        Intrinsics.checkNotNullParameter(vec, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29531, 5636188417964100539L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(life, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30661, 9017283570512187172L ^ j) /* invoke-custom */);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3425563735433408849L, j) /* invoke-custom */;
        try {
            this.h = vec;
            this.T = yaw;
            this.O = pitch;
            this.a = life;
            if (_gVarArr == null) {
                _gVarArr = new _g[1];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -3390971610375071027L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -3401463448414842303L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_243 U() {
        return this.h;
    }

    public final float G() {
        return this.T;
    }

    public final float v() {
        return this.O;
    }

    @NotNull
    public final bg m() {
        return this.a;
    }

    public static void o(_g[] _gVarArr) {
        d = _gVarArr;
    }

    public static _g[] E() {
        return d;
    }

    static {
        long j = b ^ 84548380629788L;
        f = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], 1286767681041154547L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i2 = 0;
        int length = "]^\u0015å×æU©qó\"êºî\u0016\u008b\u0010Í¦úÌÐú\u0091í/\u000e\u0013ã°fÙô".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("]^\u0015å×æU©qó\"êºî\u0016\u008b\u0010Í¦úÌÐú\u0091í/\u000e\u0013ã°fÙô".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                c = strArr;
                e = new String[2];
                return;
            }
            cCharAt = "]^\u0015å×æU©qó\"êºî\u0016\u008b\u0010Í¦úÌÐú\u0091í/\u000e\u0013ã°fÙô".charAt(i3);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 26935;
        if (e[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/nu", e2);
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
            java.lang.String r1 = "su/catlean/nu"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nu.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
