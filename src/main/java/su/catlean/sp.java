package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sp.class */
public final class sp implements class_4588 {

    @NotNull
    private final g7 a;

    @NotNull
    private final Color D;

    @NotNull
    private final float[] h;

    @NotNull
    private final float[] k;

    @NotNull
    private final float[] x;

    @NotNull
    private final float[] g;

    @NotNull
    private final float[] J;
    private int A;
    private static final long b = yz.a(-7434242412849004936L, 781587174107891465L, MethodHandles.lookup().lookupClass()).a(204322601711376L);
    private static final String c;

    public sp(@NotNull g7 polygon, @NotNull Color c2, long a) {
        long j = b ^ a;
        Intrinsics.checkNotNullParameter(polygon, c);
        Intrinsics.checkNotNullParameter(c2, "c");
        this.a = polygon;
        this.D = c2;
        this.h = new float[4];
        this.k = new float[4];
        this.x = new float[4];
        this.g = new float[4];
        this.J = new float[4];
    }

    @NotNull
    public final g7 E() {
        return this.a;
    }

    @NotNull
    public final Color v() {
        return this.D;
    }

    @NotNull
    public class_4588 method_22912(float x, float y, float z) {
        this.h[this.A] = x;
        this.k[this.A] = y;
        this.x[this.A] = z;
        return this;
    }

    @NotNull
    public sp S(int red, int green, int blue, int alpha) {
        return this;
    }

    @NotNull
    public sp U(int argb) {
        return this;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x00FB: MOVE_MULTI in method: su.catlean.sp.method_22913(float, float):net.minecraft.class_4588, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/sp.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x00FB: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[8]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @org.jetbrains.annotations.NotNull
    public net.minecraft.class_4588 method_22913(float r1, float r2) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.sp.method_22913(float, float):net.minecraft.class_4588");
    }

    @NotNull
    public sp L(int u, int v) {
        return this;
    }

    @NotNull
    public sp q(int u, int v) {
        return this;
    }

    @NotNull
    public sp A(float x, float y, float z) {
        return this;
    }

    @NotNull
    public sp Q(float width) {
        return this;
    }

    public class_4588 method_1336(int i, int j, int k, int l) {
        return S(i, j, k, l);
    }

    public class_4588 method_39415(int i) {
        return U(i);
    }

    public class_4588 method_60796(int i, int j) {
        return L(i, j);
    }

    public class_4588 method_22921(int i, int j) {
        return q(i, j);
    }

    public class_4588 method_22914(float f, float g, float h) {
        return A(f, g, h);
    }

    public class_4588 method_75298(float f) {
        return Q(f);
    }

    static {
        long j = b ^ 25267156858201L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        c = a(cipher.doFinal("J\u000bÈ½æC÷\u0010".getBytes("ISO-8859-1"))).intern();
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
}
