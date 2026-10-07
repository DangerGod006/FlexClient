package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j0.class */
public final class j0 {

    @NotNull
    private final List V;
    private static final long a = yz.a(5029942605386981333L, -4741181842543453637L, MethodHandles.lookup().lookupClass()).a(90150293233075L);
    private static final String b;

    public j0(@NotNull List suggestions, long a2) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(suggestions, b);
        this.V = suggestions;
    }

    @Nullable
    public final String X(@NotNull String s, long a2) {
        Object next;
        long j = a ^ a2;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6749216828452542325L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(s, "s");
        Iterator it = this.V.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            while (true) {
                Object obj = next;
                next = obj;
                while (StringsKt.startsWith$default((String) next, s, false, 2, (Object) null)) {
                    next = obj;
                    if (j >= 0) {
                        if (str != null) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (String) next;
    }

    static {
        long j = a ^ 27894210637048L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal(")M\u0017\u0099Þ:\u0011\u0005ê>â¥Øö/Û".getBytes("ISO-8859-1"))).intern();
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
}
