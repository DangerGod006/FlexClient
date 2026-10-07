package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/op.class */
public final class op {

    @NotNull
    private static final Json O;
    private static int[] E;
    private static final long a = yz.a(-4736635959034706142L, -5031677942863051632L, MethodHandles.lookup().lookupClass()).a(200207185930461L);
    private static final String b;

    @NotNull
    public static final Json d() {
        return O;
    }

    public static void H() {
    }

    private static final Unit q(JsonBuilder jsonBuilder) {
        long j = a ^ 62467263332300L;
        Intrinsics.checkNotNullParameter(jsonBuilder, b);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setNamingStrategy(JsonNamingStrategy.Builtins.getSnakeCase());
        return Unit.INSTANCE;
    }

    static {
        long j = a ^ 132987648724679L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1835261948800857743L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], 1853671601706333110L, j) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("Àîà \u0090\u0088Rq¬¼Å\u000fØ\b³¸".getBytes("ISO-8859-1"))).intern();
        O = JsonKt.Json$default(null, op::q, 1, null);
    }

    public static void y(int[] iArr) {
        E = iArr;
    }

    public static int[] v() {
        return E;
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
