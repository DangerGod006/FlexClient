package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.ULong;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/Uuid.class */
@SinceKotlin(version = "2.0")
@ExperimentalUuidApi
public final class Uuid implements Comparable<Uuid>, Serializable {
    private final long mostSignificantBits;
    private final long leastSignificantBits;
    public static final int SIZE_BYTES = 16;
    public static final int SIZE_BITS = 128;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Uuid NIL = new Uuid(0, 0);

    @PublishedApi
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public /* synthetic */ Uuid(long mostSignificantBits, long leastSignificantBits, DefaultConstructorMarker $constructor_marker) {
        this(mostSignificantBits, leastSignificantBits);
    }

    private Uuid(long mostSignificantBits, long leastSignificantBits) {
        this.mostSignificantBits = mostSignificantBits;
        this.leastSignificantBits = leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    @InlineOnly
    private final <T> T toLongs(Function2<? super Long, ? super Long, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    @InlineOnly
    private final <T> T toULongs(Function2<? super ULong, ? super ULong, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(ULong.m407boximpl(ULong.m406constructorimpl(getMostSignificantBits())), ULong.m407boximpl(ULong.m406constructorimpl(getLeastSignificantBits())));
    }

    @NotNull
    public String toString() {
        return toHexDashString();
    }

    @SinceKotlin(version = "2.1")
    @NotNull
    public final String toHexDashString() {
        byte[] bytes = new byte[36];
        UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 0, 0, 4);
        bytes[8] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 9, 4, 6);
        bytes[13] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 14, 6, 8);
        bytes[18] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 19, 0, 2);
        bytes[23] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 24, 2, 8);
        return StringsKt.decodeToString(bytes);
    }

    @NotNull
    public final String toHexString() {
        byte[] bytes = new byte[32];
        UuidKt.formatBytesInto(this.mostSignificantBits, bytes, 0, 0, 8);
        UuidKt.formatBytesInto(this.leastSignificantBits, bytes, 16, 0, 8);
        return StringsKt.decodeToString(bytes);
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bytes = new byte[16];
        UuidKt.setLongAt(bytes, 0, this.mostSignificantBits);
        UuidKt.setLongAt(bytes, 8, this.leastSignificantBits);
        return bytes;
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m1782toUByteArrayTcUX1vc() {
        return UByteArray.m264constructorimpl(toByteArray());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Uuid) && this.mostSignificantBits == ((Uuid) other).mostSignificantBits && this.leastSignificantBits == ((Uuid) other).leastSignificantBits;
    }

    @Override // java.lang.Comparable
    @SinceKotlin(version = "2.1")
    public int compareTo(@NotNull Uuid other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.mostSignificantBits != other.mostSignificantBits) {
            return Long.compareUnsigned(ULong.m406constructorimpl(this.mostSignificantBits), ULong.m406constructorimpl(other.mostSignificantBits));
        }
        return Long.compareUnsigned(ULong.m406constructorimpl(this.leastSignificantBits), ULong.m406constructorimpl(other.leastSignificantBits));
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    private final Object writeReplace() {
        return UuidKt.serializedUuid(this);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: compiled from: Uuid.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/Uuid$Companion.class */
    public static final class Companion {
        @Deprecated(message = "Use naturalOrder<Uuid>() instead", replaceWith = @ReplaceWith(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @DeprecatedSinceKotlin(warningSince = "2.1")
        public static /* synthetic */ void getLEXICAL_ORDER$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Uuid getNIL() {
            return Uuid.NIL;
        }

        @NotNull
        public final Uuid fromLongs(long mostSignificantBits, long leastSignificantBits) {
            if (mostSignificantBits == 0 && leastSignificantBits == 0) {
                return getNIL();
            }
            return new Uuid(mostSignificantBits, leastSignificantBits, null);
        }

        @NotNull
        /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final Uuid m1784fromULongseb3DHEI(long mostSignificantBits, long leastSignificantBits) {
            return fromLongs(mostSignificantBits, leastSignificantBits);
        }

        @NotNull
        public final Uuid fromByteArray(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (!(byteArray.length == 16)) {
                throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(byteArray, 32) + " of size " + byteArray.length).toString());
            }
            return fromLongs(UuidKt.getLongAt(byteArray, 0), UuidKt.getLongAt(byteArray, 8));
        }

        @SinceKotlin(version = "2.1")
        @ExperimentalUnsignedTypes
        @NotNull
        /* JADX INFO: renamed from: fromUByteArray-GBYM_sE, reason: not valid java name */
        public final Uuid m1785fromUByteArrayGBYM_sE(@NotNull byte[] ubyteArray) {
            Intrinsics.checkNotNullParameter(ubyteArray, "ubyteArray");
            return fromByteArray(ubyteArray);
        }

        @NotNull
        public final Uuid parse(@NotNull String uuidString) {
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            switch (uuidString.length()) {
                case 32:
                    return UuidKt.uuidParseHex(uuidString);
                case Typography.dollar /* 36 */:
                    return UuidKt.uuidParseHexDash(uuidString);
                default:
                    throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(uuidString, 64) + "\" of length " + uuidString.length());
            }
        }

        @SinceKotlin(version = "2.1")
        @NotNull
        public final Uuid parseHexDash(@NotNull String hexDashString) {
            Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
            if (hexDashString.length() == 36) {
                return UuidKt.uuidParseHexDash(hexDashString);
            }
            throw new IllegalArgumentException(("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(hexDashString, 64) + "\" of length " + hexDashString.length()).toString());
        }

        @NotNull
        public final Uuid parseHex(@NotNull String hexString) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            if (hexString.length() == 32) {
                return UuidKt.uuidParseHex(hexString);
            }
            throw new IllegalArgumentException(("Expected a 32-char hexadecimal string, but was \"" + UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(hexString, 64) + "\" of length " + hexString.length()).toString());
        }

        @NotNull
        public final Uuid random() {
            return UuidKt.secureRandomUuid();
        }

        @NotNull
        public final Comparator<Uuid> getLEXICAL_ORDER() {
            return ComparisonsKt.naturalOrder();
        }
    }
}
