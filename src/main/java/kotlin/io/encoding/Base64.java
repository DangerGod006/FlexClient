package kotlin.io.encoding;

import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/Base64.class */
@SinceKotlin(version = "2.2")
@WasExperimental(markerClass = {ExperimentalEncodingApi.class})
public class Base64 {
    private final boolean isUrlSafe;
    private final boolean isMimeScheme;
    private final int mimeLineLength;

    @NotNull
    private final PaddingOption paddingOption;
    private final int mimeGroupsPerLine;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    public static final int symbolsPerGroup = 4;
    public static final byte padSymbol = 61;
    private static final int lineLengthPem = 64;

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};

    @NotNull
    private static final Base64 UrlSafe = new Base64(true, false, -1, PaddingOption.PRESENT);
    private static final int lineLengthMime = 76;

    @NotNull
    private static final Base64 Mime = new Base64(false, true, lineLengthMime, PaddingOption.PRESENT);

    @NotNull
    private static final Base64 Pem = new Base64(false, true, 64, PaddingOption.PRESENT);

    /* JADX INFO: compiled from: Base64.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/Base64$PaddingOption.class */
    @SinceKotlin(version = "2.0")
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        @NotNull
        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ Base64(boolean isUrlSafe, boolean isMimeScheme, int mimeLineLength, PaddingOption paddingOption, DefaultConstructorMarker $constructor_marker) {
        this(isUrlSafe, isMimeScheme, mimeLineLength, paddingOption);
    }

    private Base64(boolean isUrlSafe, boolean isMimeScheme, int mimeLineLength, PaddingOption paddingOption) {
        this.isUrlSafe = isUrlSafe;
        this.isMimeScheme = isMimeScheme;
        this.mimeLineLength = mimeLineLength;
        this.paddingOption = paddingOption;
        if (!((this.isUrlSafe && this.isMimeScheme) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.mimeGroupsPerLine = this.mimeLineLength / 4;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final int getMimeLineLength$kotlin_stdlib() {
        return this.mimeLineLength;
    }

    @NotNull
    public final PaddingOption getPaddingOption$kotlin_stdlib() {
        return this.paddingOption;
    }

    @SinceKotlin(version = "2.0")
    @NotNull
    public final Base64 withPadding(@NotNull PaddingOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return this.paddingOption == option ? this : new Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i, i2);
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i, i2, i3);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encode(bArr, i, i2);
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i, i2);
    }

    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int startIndex, int endIndex) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        String stringResult = new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
        destination.append(stringResult);
        return destination;
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.decode(bArr, i, i2);
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize = decodeSize$kotlin_stdlib(source, startIndex, endIndex);
        byte[] destination = new byte[decodeSize];
        int bytesWritten = decodeImpl(source, destination, 0, startIndex, endIndex);
        if (bytesWritten == destination.length) {
            return destination;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i, i2, i3);
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize$kotlin_stdlib(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return base64.decode(charSequence, i, i2);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
            String strSubstring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        byte[] byteSource = bArrCharsToBytesImpl$kotlin_stdlib;
        return decode$default(this, byteSource, 0, 0, 6, (Object) null);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i, i2, i3);
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
            String strSubstring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        byte[] byteSource = bArrCharsToBytesImpl$kotlin_stdlib;
        return decodeIntoByteArray$default(this, byteSource, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int encodeSize = encodeSize$kotlin_stdlib(endIndex - startIndex);
        byte[] destination = new byte[encodeSize];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, 0, startIndex, endIndex);
        return destination;
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize$kotlin_stdlib(endIndex - startIndex));
        byte[] encodeMap = this.isUrlSafe ? Base64Kt.base64UrlEncodeMap : Base64Kt.base64EncodeMap;
        int sourceIndex = startIndex;
        int destinationIndex = destinationOffset;
        int groupsPerLine = this.isMimeScheme ? this.mimeGroupsPerLine : IntCompanionObject.MAX_VALUE;
        while (sourceIndex + 2 < endIndex) {
            int groups = Math.min((endIndex - sourceIndex) / 3, groupsPerLine);
            for (int i = 0; i < groups; i++) {
                int i2 = sourceIndex;
                int sourceIndex2 = sourceIndex + 1;
                int byte1 = source[i2] & 255;
                int sourceIndex3 = sourceIndex2 + 1;
                int byte2 = source[sourceIndex2] & 255;
                sourceIndex = sourceIndex3 + 1;
                int byte3 = source[sourceIndex3] & 255;
                int bits = (byte1 << 16) | (byte2 << 8) | byte3;
                int i3 = destinationIndex;
                int destinationIndex2 = destinationIndex + 1;
                destination[i3] = encodeMap[bits >>> 18];
                int destinationIndex3 = destinationIndex2 + 1;
                destination[destinationIndex2] = encodeMap[(bits >>> 12) & 63];
                int destinationIndex4 = destinationIndex3 + 1;
                destination[destinationIndex3] = encodeMap[(bits >>> 6) & 63];
                destinationIndex = destinationIndex4 + 1;
                destination[destinationIndex4] = encodeMap[bits & 63];
            }
            if (groups == groupsPerLine && sourceIndex != endIndex) {
                int i4 = destinationIndex;
                int destinationIndex5 = destinationIndex + 1;
                destination[i4] = mimeLineSeparatorSymbols[0];
                destinationIndex = destinationIndex5 + 1;
                destination[destinationIndex5] = mimeLineSeparatorSymbols[1];
            }
        }
        switch (endIndex - sourceIndex) {
            case 1:
                int i5 = sourceIndex;
                sourceIndex++;
                int byte12 = source[i5] & 255;
                int bits2 = byte12 << 4;
                int i6 = destinationIndex;
                int destinationIndex6 = destinationIndex + 1;
                destination[i6] = encodeMap[bits2 >>> 6];
                destinationIndex = destinationIndex6 + 1;
                destination[destinationIndex6] = encodeMap[bits2 & 63];
                if (shouldPadOnEncode()) {
                    int destinationIndex7 = destinationIndex + 1;
                    destination[destinationIndex] = 61;
                    destinationIndex = destinationIndex7 + 1;
                    destination[destinationIndex7] = 61;
                }
                break;
            case 2:
                int i7 = sourceIndex;
                int sourceIndex4 = sourceIndex + 1;
                int byte13 = source[i7] & 255;
                sourceIndex = sourceIndex4 + 1;
                int byte22 = source[sourceIndex4] & 255;
                int bits3 = (byte13 << 10) | (byte22 << 2);
                int i8 = destinationIndex;
                int destinationIndex8 = destinationIndex + 1;
                destination[i8] = encodeMap[bits3 >>> 12];
                int destinationIndex9 = destinationIndex8 + 1;
                destination[destinationIndex8] = encodeMap[(bits3 >>> 6) & 63];
                destinationIndex = destinationIndex9 + 1;
                destination[destinationIndex9] = encodeMap[bits3 & 63];
                if (shouldPadOnEncode()) {
                    destinationIndex++;
                    destination[destinationIndex] = 61;
                }
                break;
        }
        if (sourceIndex == endIndex) {
            return destinationIndex - destinationOffset;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int sourceSize) {
        int groups = sourceSize / 3;
        int trailingBytes = sourceSize % 3;
        int size = groups * 4;
        if (trailingBytes != 0) {
            size += shouldPadOnEncode() ? 4 : trailingBytes + 1;
        }
        if (size < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.isMimeScheme) {
            size += ((size - 1) / this.mimeLineLength) * 2;
        }
        if (size < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        return size;
    }

    private final boolean shouldPadOnEncode() {
        return this.paddingOption == PaddingOption.PRESENT || this.paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0176, code lost:
    
        if (r15 != (-2)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        if (r15 == (-8)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018d, code lost:
    
        if (r18 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0197, code lost:
    
        if (r7.paddingOption != kotlin.io.encoding.Base64.PaddingOption.PRESENT) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a4, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a7, code lost:
    
        if (r14 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b4, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b5, code lost:
    
        r0 = skipIllegalSymbolsIfMime(r8, r16, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c4, code lost:
    
        if (r0 >= r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c7, code lost:
    
        r0 = r8[r0] & 255;
        r2 = new java.lang.StringBuilder().append("Symbol '").append((char) r0).append("'(");
        r3 = java.lang.Integer.toString(r0, kotlin.text.CharsKt.checkRadix(8));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021b, code lost:
    
        throw new java.lang.IllegalArgumentException(r2.append(r3).append(") at index ").append(r0 - 1).append(" is prohibited after the pad character").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0220, code lost:
    
        return r17 - r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int decodeImpl(byte[] r8, byte[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.decodeImpl(byte[], byte[], int, int, int):int");
    }

    public final int decodeSize$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        int symbols = endIndex - startIndex;
        if (symbols == 0) {
            return 0;
        }
        if (symbols == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            int index = startIndex;
            while (true) {
                if (index >= endIndex) {
                    break;
                }
                int symbol = source[index] & KotlinVersion.MAX_COMPONENT_VALUE;
                int symbolBits = Base64Kt.base64DecodeMap[symbol];
                if (symbolBits < 0) {
                    if (symbolBits == -2) {
                        symbols -= endIndex - index;
                        break;
                    }
                    symbols--;
                }
                index++;
            }
        } else if (source[endIndex - 1] == 61) {
            symbols--;
            if (source[endIndex - 2] == 61) {
                symbols--;
            }
        }
        return (int) ((((long) symbols) * ((long) 6)) / ((long) 8));
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] byteArray = new byte[endIndex - startIndex];
        int length = 0;
        for (int index = startIndex; index < endIndex; index++) {
            int symbol = source.charAt(index);
            if (symbol <= 255) {
                int i = length;
                length++;
                byteArray[i] = (byte) symbol;
            } else {
                int i2 = length;
                length++;
                byteArray[i2] = 63;
            }
        }
        return byteArray;
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder stringBuilder = new StringBuilder(source.length);
        for (byte b : source) {
            stringBuilder.append((char) b);
        }
        return stringBuilder.toString();
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        switch (byteStart) {
            case -8:
                throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
            case -7:
            case -5:
            case -3:
            default:
                throw new IllegalStateException("Unreachable".toString());
            case -6:
                checkPaddingIsAllowed(padIndex);
                return padIndex + 1;
            case -4:
                checkPaddingIsAllowed(padIndex);
                int secondPadIndex = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
                if (secondPadIndex == endIndex || source[secondPadIndex] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + secondPadIndex);
                }
                return secondPadIndex + 1;
            case -2:
                return padIndex + 1;
        }
    }

    private final void checkPaddingIsAllowed(int padIndex) {
        if (this.paddingOption == PaddingOption.ABSENT) {
            throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
        }
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        int sourceIndex = startIndex;
        while (sourceIndex < endIndex) {
            int symbol = source[sourceIndex] & KotlinVersion.MAX_COMPONENT_VALUE;
            if (Base64Kt.base64DecodeMap[symbol] != -1) {
                return sourceIndex;
            }
            sourceIndex++;
        }
        return sourceIndex;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
        }
        int destinationEndIndex = destinationOffset + capacityNeeded;
        if (destinationEndIndex < 0 || destinationEndIndex > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/encoding/Base64$Default.class */
    public static final class Default extends Base64 {
        public /* synthetic */ Default(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Default() {
            super(false, false, -1, PaddingOption.PRESENT, null);
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.Mime;
        }

        @NotNull
        public final Base64 getPem() {
            return Base64.Pem;
        }
    }
}
