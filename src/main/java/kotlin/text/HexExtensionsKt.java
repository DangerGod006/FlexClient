package kotlin.text;

import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.KotlinVersion;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexExtensionsKt.class */
public final class HexExtensionsKt {

    @NotNull
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";

    @NotNull
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    @NotNull
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;

    @NotNull
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;

    @NotNull
    private static final int[] HEX_DIGITS_TO_DECIMAL;

    @NotNull
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;

    @NotNull
    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            iArr[i2] = (LOWER_CASE_HEX_DIGITS.charAt(i2 >> 4) << '\b') | LOWER_CASE_HEX_DIGITS.charAt(i2 & 15);
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = i3;
            iArr2[i4] = (UPPER_CASE_HEX_DIGITS.charAt(i4 >> 4) << '\b') | UPPER_CASE_HEX_DIGITS.charAt(i4 & 15);
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[i5] = -1;
        }
        int index$iv = 0;
        for (int i6 = 0; i6 < $this$forEachIndexed$iv.length(); i6++) {
            char item$iv = $this$forEachIndexed$iv.charAt(i6);
            int index = index$iv;
            index$iv++;
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv] = index;
        }
        int index$iv2 = 0;
        for (int i7 = 0; i7 < $this$forEachIndexed$iv.length(); i7++) {
            char item$iv2 = $this$forEachIndexed$iv.charAt(i7);
            int index2 = index$iv2;
            index$iv2++;
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[item$iv2] = index2;
        }
        HEX_DIGITS_TO_DECIMAL = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
        long[] $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245 = new long[256];
        for (int i8 = 0; i8 < 256; i8++) {
            $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[i8] = -1;
        }
        int index$iv3 = 0;
        for (int i9 = 0; i9 < $this$forEachIndexed$iv.length(); i9++) {
            char item$iv3 = $this$forEachIndexed$iv.charAt(i9);
            int index3 = index$iv3;
            index$iv3++;
            $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv3] = index3;
        }
        int index$iv4 = 0;
        for (int i10 = 0; i10 < $this$forEachIndexed$iv.length(); i10++) {
            char item$iv4 = $this$forEachIndexed$iv.charAt(i10);
            int index4 = index$iv4;
            index$iv4++;
            $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245[item$iv4] = index4;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = $this$HEX_DIGITS_TO_LONG_DECIMAL_u24lambda_u245;
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(@NotNull byte[] $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString($this$toHexString, 0, $this$toHexString.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(@NotNull byte[] $this$toHexString, int startIndex, int endIndex, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toHexString.length);
        if (startIndex == endIndex) {
            return "";
        }
        int[] byteToDigits = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        if (bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib()) {
            return toHexStringNoLineAndGroupSeparator($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits);
        }
        return toHexStringSlowPath($this$toHexString, startIndex, endIndex, bytesFormat, byteToDigits);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] $this$toHexStringNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        if (bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()) {
            return toHexStringShortByteSeparatorNoPrefixAndSuffix($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits);
        }
        return toHexStringNoLineAndGroupSeparatorSlowPath($this$toHexStringNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat, byteToDigits);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] $this$toHexStringShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        int byteSeparatorLength = bytesFormat.getByteSeparator().length();
        if (!(byteSeparatorLength <= 1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int numberOfBytes = endIndex - startIndex;
        int charIndex = 0;
        if (byteSeparatorLength == 0) {
            char[] charArray = new char[checkFormatLength(2 * ((long) numberOfBytes))];
            for (int byteIndex = startIndex; byteIndex < endIndex; byteIndex++) {
                charIndex = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex, byteToDigits, charArray, charIndex);
            }
            return StringsKt.concatToString(charArray);
        }
        char[] charArray2 = new char[checkFormatLength((3 * ((long) numberOfBytes)) - 1)];
        char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
        int charIndex2 = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, startIndex, byteToDigits, charArray2, 0);
        for (int byteIndex2 = startIndex + 1; byteIndex2 < endIndex; byteIndex2++) {
            charArray2[charIndex2] = byteSeparatorChar;
            charIndex2 = formatByteAt($this$toHexStringShortByteSeparatorNoPrefixAndSuffix, byteIndex2, byteToDigits, charArray2, charIndex2 + 1);
        }
        return StringsKt.concatToString(charArray2);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] $this$toHexStringNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        int formatLength = formattedStringLength(endIndex - startIndex, byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] charArray = new char[formatLength];
        int charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, startIndex, bytePrefix, byteSuffix, byteToDigits, charArray, 0);
        for (int byteIndex = startIndex + 1; byteIndex < endIndex; byteIndex++) {
            charIndex = formatByteAt($this$toHexStringNoLineAndGroupSeparatorSlowPath, byteIndex, bytePrefix, byteSuffix, byteToDigits, charArray, toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex));
        }
        return StringsKt.concatToString(charArray);
    }

    private static final String toHexStringSlowPath(byte[] $this$toHexStringSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat, int[] byteToDigits) {
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        int formatLength = formattedStringLength(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] charArray = new char[formatLength];
        int charIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
        for (int byteIndex = startIndex; byteIndex < endIndex; byteIndex++) {
            if (indexInLine == bytesPerLine) {
                int i = charIndex;
                charIndex++;
                charArray[i] = '\n';
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup == bytesPerGroup) {
                charIndex = toCharArrayIfNotEmpty(groupSeparator, charArray, charIndex);
                indexInGroup = 0;
            }
            if (indexInGroup != 0) {
                charIndex = toCharArrayIfNotEmpty(byteSeparator, charArray, charIndex);
            }
            charIndex = formatByteAt($this$toHexStringSlowPath, byteIndex, bytePrefix, byteSuffix, byteToDigits, charArray, charIndex);
            indexInGroup++;
            indexInLine++;
        }
        if (charIndex == formatLength) {
            return StringsKt.concatToString(charArray);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final int formatByteAt(byte[] $this$formatByteAt, int index, String bytePrefix, String byteSuffix, int[] byteToDigits, char[] destination, int destinationOffset) {
        int offset = toCharArrayIfNotEmpty(bytePrefix, destination, destinationOffset);
        return toCharArrayIfNotEmpty(byteSuffix, destination, formatByteAt($this$formatByteAt, index, byteToDigits, destination, offset));
    }

    private static final int formatByteAt(byte[] $this$formatByteAt, int index, int[] byteToDigits, char[] destination, int destinationOffset) {
        int byteDigits = byteToDigits[$this$formatByteAt[index] & KotlinVersion.MAX_COMPONENT_VALUE];
        destination[destinationOffset] = (char) (byteDigits >> 8);
        destination[destinationOffset + 1] = (char) (byteDigits & KotlinVersion.MAX_COMPONENT_VALUE);
        return destinationOffset + 2;
    }

    private static final int formattedStringLength(int numberOfBytes, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        if (!(numberOfBytes > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long charsPerByte = 2 + ((long) bytePrefixLength) + ((long) byteSuffixLength) + ((long) byteSeparatorLength);
        long formatLength = (((long) numberOfBytes) * charsPerByte) - ((long) byteSeparatorLength);
        return checkFormatLength(formatLength);
    }

    public static final int formattedStringLength(int numberOfBytes, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        if (!(numberOfBytes > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int lineSeparators = (numberOfBytes - 1) / bytesPerLine;
        int groupSeparatorsPerLine = (bytesPerLine - 1) / bytesPerGroup;
        int it = numberOfBytes % bytesPerLine;
        int bytesInLastLine = it == 0 ? bytesPerLine : it;
        int groupSeparatorsInLastLine = (bytesInLastLine - 1) / bytesPerGroup;
        int groupSeparators = (lineSeparators * groupSeparatorsPerLine) + groupSeparatorsInLastLine;
        int byteSeparators = ((numberOfBytes - 1) - lineSeparators) - groupSeparators;
        long formatLength = ((long) lineSeparators) + (((long) groupSeparators) * ((long) groupSeparatorLength)) + (((long) byteSeparators) * ((long) byteSeparatorLength)) + (((long) numberOfBytes) * (((long) bytePrefixLength) + 2 + ((long) byteSuffixLength)));
        return checkFormatLength(formatLength);
    }

    private static final int checkFormatLength(long formatLength) {
        boolean z = 0 <= formatLength && formatLength <= 2147483647L;
        if (!z) {
            throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m403toStringimpl(ULong.m406constructorimpl(formatLength))));
        }
        return (int) formatLength;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final byte[] hexToByteArray(@NotNull String $this$hexToByteArray, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray($this$hexToByteArray, 0, $this$hexToByteArray.length(), format);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    private static final byte[] hexToByteArray(String $this$hexToByteArray, int startIndex, int endIndex, HexFormat format) {
        byte[] it;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToByteArray.length());
        if (startIndex == endIndex) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        if (bytesFormat.getNoLineAndGroupSeparator$kotlin_stdlib() && (it = hexToByteArrayNoLineAndGroupSeparator($this$hexToByteArray, startIndex, endIndex, bytesFormat)) != null) {
            return it;
        }
        return hexToByteArraySlowPath($this$hexToByteArray, startIndex, endIndex, bytesFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String $this$hexToByteArrayNoLineAndGroupSeparator, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        if (bytesFormat.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()) {
            return hexToByteArrayShortByteSeparatorNoPrefixAndSuffix($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat);
        }
        return hexToByteArrayNoLineAndGroupSeparatorSlowPath($this$hexToByteArrayNoLineAndGroupSeparator, startIndex, endIndex, bytesFormat);
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        int byteSeparatorLength = bytesFormat.getByteSeparator().length();
        if (!(byteSeparatorLength <= 1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int numberOfChars = endIndex - startIndex;
        int charIndex = 0;
        if (byteSeparatorLength == 0) {
            if ((numberOfChars & 1) != 0) {
                return null;
            }
            int numberOfBytes = numberOfChars >> 1;
            byte[] byteArray = new byte[numberOfBytes];
            for (int byteIndex = 0; byteIndex < numberOfBytes; byteIndex++) {
                byteArray[byteIndex] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex);
                charIndex += 2;
            }
            return byteArray;
        }
        if (numberOfChars % 3 != 2) {
            return null;
        }
        int numberOfBytes2 = (numberOfChars / 3) + 1;
        byte[] byteArray2 = new byte[numberOfBytes2];
        char byteSeparatorChar = bytesFormat.getByteSeparator().charAt(0);
        byteArray2[0] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, 0);
        int charIndex2 = 0 + 2;
        for (int byteIndex2 = 1; byteIndex2 < numberOfBytes2; byteIndex2++) {
            if ($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix.charAt(charIndex2) != byteSeparatorChar) {
                String part$iv = bytesFormat.getByteSeparator();
                boolean ignoreCase$iv = bytesFormat.getIgnoreCase$kotlin_stdlib();
                if (!(part$iv.length() == 0)) {
                    int length = part$iv.length();
                    for (int i$iv = 0; i$iv < length; i$iv++) {
                        if (!CharsKt.equals(part$iv.charAt(i$iv), $this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix.charAt(charIndex2 + i$iv), ignoreCase$iv)) {
                            throwNotContainedAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex2, endIndex, part$iv, "byte separator");
                        }
                    }
                    int length2 = charIndex2 + part$iv.length();
                }
            }
            byteArray2[byteIndex2] = parseByteAt($this$hexToByteArrayShortByteSeparatorNoPrefixAndSuffix, charIndex2 + 1);
            charIndex2 += 3;
        }
        return byteArray2;
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        int length;
        int length2;
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        int byteSeparatorLength = byteSeparator.length();
        long charsPerByte = 2 + ((long) bytePrefix.length()) + ((long) byteSuffix.length()) + ((long) byteSeparatorLength);
        long numberOfChars = endIndex - startIndex;
        int numberOfBytes = (int) ((numberOfChars + ((long) byteSeparatorLength)) / charsPerByte);
        if ((((long) numberOfBytes) * charsPerByte) - ((long) byteSeparatorLength) != numberOfChars) {
            return null;
        }
        boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
        byte[] byteArray = new byte[numberOfBytes];
        if (bytePrefix.length() == 0) {
            length = startIndex;
        } else {
            int length3 = bytePrefix.length();
            for (int i$iv = 0; i$iv < length3; i$iv++) {
                if (!CharsKt.equals(bytePrefix.charAt(i$iv), $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath.charAt(startIndex + i$iv), ignoreCase)) {
                    throwNotContainedAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, startIndex, endIndex, bytePrefix, "byte prefix");
                }
            }
            length = startIndex + bytePrefix.length();
        }
        int charIndex = length;
        String between = byteSuffix + byteSeparator + bytePrefix;
        int i = numberOfBytes - 1;
        for (int byteIndex = 0; byteIndex < i; byteIndex++) {
            byteArray[byteIndex] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, charIndex);
            int index$iv = charIndex + 2;
            if (between.length() == 0) {
                length2 = index$iv;
            } else {
                int length4 = between.length();
                for (int i$iv2 = 0; i$iv2 < length4; i$iv2++) {
                    if (!CharsKt.equals(between.charAt(i$iv2), $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath.charAt(index$iv + i$iv2), ignoreCase)) {
                        throwNotContainedAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, index$iv, endIndex, between, "byte suffix + byte separator + byte prefix");
                    }
                }
                length2 = index$iv + between.length();
            }
            charIndex = length2;
        }
        byteArray[numberOfBytes - 1] = parseByteAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, charIndex);
        int index$iv2 = charIndex + 2;
        if (!(byteSuffix.length() == 0)) {
            int length5 = byteSuffix.length();
            for (int i$iv3 = 0; i$iv3 < length5; i$iv3++) {
                if (!CharsKt.equals(byteSuffix.charAt(i$iv3), $this$hexToByteArrayNoLineAndGroupSeparatorSlowPath.charAt(index$iv2 + i$iv3), ignoreCase)) {
                    throwNotContainedAt($this$hexToByteArrayNoLineAndGroupSeparatorSlowPath, index$iv2, endIndex, byteSuffix, "byte suffix");
                }
            }
            int length6 = index$iv2 + byteSuffix.length();
        }
        return byteArray;
    }

    private static final byte[] hexToByteArraySlowPath(String $this$hexToByteArraySlowPath, int startIndex, int endIndex, HexFormat.BytesHexFormat bytesFormat) {
        int length;
        int length2;
        int length3;
        int length4;
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        boolean ignoreCase = bytesFormat.getIgnoreCase$kotlin_stdlib();
        int parseMaxSize = parsedByteArrayMaxSize(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] byteArray = new byte[parseMaxSize];
        int charIndex = startIndex;
        int byteIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
        while (charIndex < endIndex) {
            if (indexInLine == bytesPerLine) {
                charIndex = checkNewLineAt($this$hexToByteArraySlowPath, charIndex, endIndex);
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup != bytesPerGroup) {
                if (indexInGroup != 0) {
                    if (byteSeparator.length() == 0) {
                        length = charIndex;
                    } else {
                        int length5 = byteSeparator.length();
                        for (int i$iv = 0; i$iv < length5; i$iv++) {
                            if (!CharsKt.equals(byteSeparator.charAt(i$iv), $this$hexToByteArraySlowPath.charAt(charIndex + i$iv), ignoreCase)) {
                                throwNotContainedAt($this$hexToByteArraySlowPath, charIndex, endIndex, byteSeparator, "byte separator");
                            }
                        }
                        length = charIndex + byteSeparator.length();
                    }
                    charIndex = length;
                }
            } else {
                if (groupSeparator.length() == 0) {
                    length2 = charIndex;
                } else {
                    int length6 = groupSeparator.length();
                    for (int i$iv2 = 0; i$iv2 < length6; i$iv2++) {
                        if (!CharsKt.equals(groupSeparator.charAt(i$iv2), $this$hexToByteArraySlowPath.charAt(charIndex + i$iv2), ignoreCase)) {
                            throwNotContainedAt($this$hexToByteArraySlowPath, charIndex, endIndex, groupSeparator, "group separator");
                        }
                    }
                    length2 = charIndex + groupSeparator.length();
                }
                charIndex = length2;
                indexInGroup = 0;
            }
            indexInLine++;
            indexInGroup++;
            if (bytePrefix.length() == 0) {
                length3 = charIndex;
            } else {
                int length7 = bytePrefix.length();
                for (int i$iv3 = 0; i$iv3 < length7; i$iv3++) {
                    if (!CharsKt.equals(bytePrefix.charAt(i$iv3), $this$hexToByteArraySlowPath.charAt(charIndex + i$iv3), ignoreCase)) {
                        throwNotContainedAt($this$hexToByteArraySlowPath, charIndex, endIndex, bytePrefix, "byte prefix");
                    }
                }
                length3 = charIndex + bytePrefix.length();
            }
            int charIndex2 = length3;
            if (endIndex - 2 < charIndex2) {
                throwInvalidNumberOfDigits($this$hexToByteArraySlowPath, charIndex2, endIndex, "exactly", 2);
            }
            int i = byteIndex;
            byteIndex++;
            byteArray[i] = parseByteAt($this$hexToByteArraySlowPath, charIndex2);
            int index$iv = charIndex2 + 2;
            if (byteSuffix.length() == 0) {
                length4 = index$iv;
            } else {
                int length8 = byteSuffix.length();
                for (int i$iv4 = 0; i$iv4 < length8; i$iv4++) {
                    if (!CharsKt.equals(byteSuffix.charAt(i$iv4), $this$hexToByteArraySlowPath.charAt(index$iv + i$iv4), ignoreCase)) {
                        throwNotContainedAt($this$hexToByteArraySlowPath, index$iv, endIndex, byteSuffix, "byte suffix");
                    }
                }
                length4 = index$iv + byteSuffix.length();
            }
            charIndex = length4;
        }
        if (byteIndex == byteArray.length) {
            return byteArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteIndex);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    private static final byte parseByteAt(String $this$parseByteAt, int index) {
        int code$iv = $this$parseByteAt.charAt(index);
        if ((code$iv >>> 8) == 0 && HEX_DIGITS_TO_DECIMAL[code$iv] >= 0) {
            int high = HEX_DIGITS_TO_DECIMAL[code$iv];
            int index$iv = index + 1;
            int code$iv2 = $this$parseByteAt.charAt(index$iv);
            if ((code$iv2 >>> 8) == 0 && HEX_DIGITS_TO_DECIMAL[code$iv2] >= 0) {
                int low = HEX_DIGITS_TO_DECIMAL[code$iv2];
                return (byte) ((high << 4) | low);
            }
            throwInvalidDigitAt($this$parseByteAt, index$iv);
            throw new KotlinNothingValueException();
        }
        throwInvalidDigitAt($this$parseByteAt, index);
        throw new KotlinNothingValueException();
    }

    public static final int parsedByteArrayMaxSize(int stringLength, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        long jCharsPerSet;
        if (!(stringLength > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long charsPerByte = ((long) bytePrefixLength) + 2 + ((long) byteSuffixLength);
        long charsPerGroup = charsPerSet(charsPerByte, bytesPerGroup, byteSeparatorLength);
        if (bytesPerLine <= bytesPerGroup) {
            jCharsPerSet = charsPerSet(charsPerByte, bytesPerLine, byteSeparatorLength);
        } else {
            int groupsPerLine = bytesPerLine / bytesPerGroup;
            long result = charsPerSet(charsPerGroup, groupsPerLine, groupSeparatorLength);
            int bytesPerLastGroupInLine = bytesPerLine % bytesPerGroup;
            if (bytesPerLastGroupInLine != 0) {
                result = result + ((long) groupSeparatorLength) + charsPerSet(charsPerByte, bytesPerLastGroupInLine, byteSeparatorLength);
            }
            jCharsPerSet = result;
        }
        long charsPerLine = jCharsPerSet;
        long numberOfChars = stringLength;
        long wholeLines = wholeElementsPerSet(numberOfChars, charsPerLine, 1);
        long numberOfChars2 = numberOfChars - (wholeLines * (charsPerLine + 1));
        long wholeGroupsInLastLine = wholeElementsPerSet(numberOfChars2, charsPerGroup, groupSeparatorLength);
        long numberOfChars3 = numberOfChars2 - (wholeGroupsInLastLine * (charsPerGroup + ((long) groupSeparatorLength)));
        long wholeBytesInLastGroup = wholeElementsPerSet(numberOfChars3, charsPerByte, byteSeparatorLength);
        int spare = numberOfChars3 - (wholeBytesInLastGroup * (charsPerByte + ((long) byteSeparatorLength))) > 0 ? 1 : 0;
        return (int) ((wholeLines * ((long) bytesPerLine)) + (wholeGroupsInLastLine * ((long) bytesPerGroup)) + wholeBytesInLastGroup + ((long) spare));
    }

    private static final long charsPerSet(long charsPerElement, int elementsPerSet, int elementSeparatorLength) {
        if (elementsPerSet > 0) {
            return (charsPerElement * ((long) elementsPerSet)) + (((long) elementSeparatorLength) * (((long) elementsPerSet) - 1));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long wholeElementsPerSet(long charsPerSet, long charsPerElement, int elementSeparatorLength) {
        if (charsPerSet <= 0 || charsPerElement <= 0) {
            return 0L;
        }
        return (charsPerSet + ((long) elementSeparatorLength)) / (charsPerElement + ((long) elementSeparatorLength));
    }

    private static final int checkNewLineAt(String $this$checkNewLineAt, int index, int endIndex) {
        if ($this$checkNewLineAt.charAt(index) == '\r') {
            return (index + 1 >= endIndex || $this$checkNewLineAt.charAt(index + 1) != '\n') ? index + 1 : index + 2;
        }
        if ($this$checkNewLineAt.charAt(index) == '\n') {
            return index + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + index + ", but was " + $this$checkNewLineAt.charAt(index));
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(byte $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] charArray = {digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
            if (numberFormat.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros($this$toHexString & 255) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt.concatToString(charArray);
        }
        return toHexStringImpl($this$toHexString, numberFormat, digits, 8);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte hexToByte(@NotNull String $this$hexToByte, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte($this$hexToByte, 0, $this$hexToByte.length(), format);
    }

    static /* synthetic */ byte hexToByte$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    private static final byte hexToByte(String $this$hexToByte, int startIndex, int endIndex, HexFormat format) {
        return (byte) hexToIntImpl($this$hexToByte, startIndex, endIndex, format, 2);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(short $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] charArray = {digits.charAt(($this$toHexString >> 12) & 15), digits.charAt(($this$toHexString >> 8) & 15), digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
            if (numberFormat.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros($this$toHexString & 65535) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt.concatToString(charArray);
        }
        return toHexStringImpl($this$toHexString, numberFormat, digits, 16);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short hexToShort(@NotNull String $this$hexToShort, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort($this$hexToShort, 0, $this$hexToShort.length(), format);
    }

    static /* synthetic */ short hexToShort$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    private static final short hexToShort(String $this$hexToShort, int startIndex, int endIndex, HexFormat format) {
        return (short) hexToIntImpl($this$hexToShort, startIndex, endIndex, format, 4);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(int $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] charArray = {digits.charAt(($this$toHexString >> 28) & 15), digits.charAt(($this$toHexString >> 24) & 15), digits.charAt(($this$toHexString >> 20) & 15), digits.charAt(($this$toHexString >> 16) & 15), digits.charAt(($this$toHexString >> 12) & 15), digits.charAt(($this$toHexString >> 8) & 15), digits.charAt(($this$toHexString >> 4) & 15), digits.charAt($this$toHexString & 15)};
            if (numberFormat.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros($this$toHexString) >> 2, 7), 0, 2, null);
            }
            return StringsKt.concatToString(charArray);
        }
        return toHexStringImpl($this$toHexString, numberFormat, digits, 32);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int hexToInt(@NotNull String $this$hexToInt, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt($this$hexToInt, 0, $this$hexToInt.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    public static final int hexToInt(@NotNull String $this$hexToInt, int startIndex, int endIndex, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl($this$hexToInt, startIndex, endIndex, format, 8);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final String toHexString(long $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] charArray = {digits.charAt((int) (($this$toHexString >> 60) & 15)), digits.charAt((int) (($this$toHexString >> 56) & 15)), digits.charAt((int) (($this$toHexString >> 52) & 15)), digits.charAt((int) (($this$toHexString >> 48) & 15)), digits.charAt((int) (($this$toHexString >> 44) & 15)), digits.charAt((int) (($this$toHexString >> 40) & 15)), digits.charAt((int) (($this$toHexString >> 36) & 15)), digits.charAt((int) (($this$toHexString >> 32) & 15)), digits.charAt((int) (($this$toHexString >> 28) & 15)), digits.charAt((int) (($this$toHexString >> 24) & 15)), digits.charAt((int) (($this$toHexString >> 20) & 15)), digits.charAt((int) (($this$toHexString >> 16) & 15)), digits.charAt((int) (($this$toHexString >> 12) & 15)), digits.charAt((int) (($this$toHexString >> 8) & 15)), digits.charAt((int) (($this$toHexString >> 4) & 15)), digits.charAt((int) ($this$toHexString & 15))};
            if (numberFormat.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(charArray, RangesKt.coerceAtMost(Long.numberOfLeadingZeros($this$toHexString) >> 2, 15), 0, 2, null);
            }
            return StringsKt.concatToString(charArray);
        }
        return toHexStringImpl($this$toHexString, numberFormat, digits, 64);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final long hexToLong(@NotNull String $this$hexToLong, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong($this$hexToLong, 0, $this$hexToLong.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    public static final long hexToLong(@NotNull String $this$hexToLong, int startIndex, int endIndex, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl($this$hexToLong, startIndex, endIndex, format, 16);
    }

    private static final String toHexStringImpl(long $this$toHexStringImpl, HexFormat.NumberHexFormat numberFormat, String digits, int bits) {
        if (!((bits & 3) == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int typeHexLength = bits >> 2;
        int minLength = numberFormat.getMinLength();
        int pads = RangesKt.coerceAtLeast(minLength - typeHexLength, 0);
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        boolean removeZeros = numberFormat.getRemoveLeadingZeros();
        long formatLength = ((long) prefix.length()) + ((long) pads) + ((long) typeHexLength) + ((long) suffix.length());
        char[] charArray = new char[checkFormatLength(formatLength)];
        int charIndex = toCharArrayIfNotEmpty(prefix, charArray, 0);
        if (pads > 0) {
            ArraysKt.fill(charArray, digits.charAt(0), charIndex, charIndex + pads);
            charIndex += pads;
        }
        int shift = bits;
        for (int i = 0; i < typeHexLength; i++) {
            shift -= 4;
            int decimal = (int) (($this$toHexStringImpl >> shift) & 15);
            removeZeros = removeZeros && decimal == 0 && (shift >> 2) >= minLength;
            if (!removeZeros) {
                int i2 = charIndex;
                charIndex = i2 + 1;
                charArray[i2] = digits.charAt(decimal);
            }
        }
        int charIndex2 = toCharArrayIfNotEmpty(suffix, charArray, charIndex);
        return charIndex2 == charArray.length ? StringsKt.concatToString(charArray) : StringsKt.concatToString$default(charArray, 0, charIndex2, 1, null);
    }

    private static final int toCharArrayIfNotEmpty(String $this$toCharArrayIfNotEmpty, char[] destination, int destinationOffset) {
        switch ($this$toCharArrayIfNotEmpty.length()) {
            case 0:
                break;
            case 1:
                destination[destinationOffset] = $this$toCharArrayIfNotEmpty.charAt(0);
                break;
            default:
                int length = $this$toCharArrayIfNotEmpty.length();
                Intrinsics.checkNotNull($this$toCharArrayIfNotEmpty, "null cannot be cast to non-null type java.lang.String");
                $this$toCharArrayIfNotEmpty.getChars(0, length, destination, destinationOffset);
                break;
        }
        return destinationOffset + $this$toCharArrayIfNotEmpty.length();
    }

    private static final int hexToIntImpl(String $this$hexToIntImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToIntImpl.length());
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, typeHexLength);
            return parseInt($this$hexToIntImpl, startIndex, endIndex);
        }
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        checkPrefixSuffixNumberOfDigits($this$hexToIntImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
        return parseInt($this$hexToIntImpl, startIndex + prefix.length(), endIndex - suffix.length());
    }

    private static final long hexToLongImpl(String $this$hexToLongImpl, int startIndex, int endIndex, HexFormat format, int typeHexLength) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToLongImpl.length());
        HexFormat.NumberHexFormat numberFormat = format.getNumber();
        if (numberFormat.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, typeHexLength);
            return parseLong($this$hexToLongImpl, startIndex, endIndex);
        }
        String prefix = numberFormat.getPrefix();
        String suffix = numberFormat.getSuffix();
        checkPrefixSuffixNumberOfDigits($this$hexToLongImpl, startIndex, endIndex, prefix, suffix, numberFormat.getIgnoreCase$kotlin_stdlib(), typeHexLength);
        return parseLong($this$hexToLongImpl, startIndex + prefix.length(), endIndex - suffix.length());
    }

    private static final void checkPrefixSuffixNumberOfDigits(String $this$checkPrefixSuffixNumberOfDigits, int startIndex, int endIndex, String prefix, String suffix, boolean ignoreCase, int typeHexLength) {
        int length;
        if ((endIndex - startIndex) - prefix.length() <= suffix.length()) {
            throwInvalidPrefixSuffix($this$checkPrefixSuffixNumberOfDigits, startIndex, endIndex, prefix, suffix);
        }
        if (prefix.length() == 0) {
            length = startIndex;
        } else {
            int length2 = prefix.length();
            for (int i$iv = 0; i$iv < length2; i$iv++) {
                if (!CharsKt.equals(prefix.charAt(i$iv), $this$checkPrefixSuffixNumberOfDigits.charAt(startIndex + i$iv), ignoreCase)) {
                    throwNotContainedAt($this$checkPrefixSuffixNumberOfDigits, startIndex, endIndex, prefix, "prefix");
                }
            }
            length = startIndex + prefix.length();
        }
        int digitsStartIndex = length;
        int digitsEndIndex = endIndex - suffix.length();
        if (!(suffix.length() == 0)) {
            int length3 = suffix.length();
            for (int i$iv2 = 0; i$iv2 < length3; i$iv2++) {
                if (!CharsKt.equals(suffix.charAt(i$iv2), $this$checkPrefixSuffixNumberOfDigits.charAt(digitsEndIndex + i$iv2), ignoreCase)) {
                    throwNotContainedAt($this$checkPrefixSuffixNumberOfDigits, digitsEndIndex, endIndex, suffix, "suffix");
                }
            }
            int length4 = digitsEndIndex + suffix.length();
        }
        checkNumberOfDigits($this$checkPrefixSuffixNumberOfDigits, digitsStartIndex, digitsEndIndex, typeHexLength);
    }

    private static final void checkNumberOfDigits(String $this$checkNumberOfDigits, int startIndex, int endIndex, int typeHexLength) {
        int digits = endIndex - startIndex;
        if (digits < 1) {
            throwInvalidNumberOfDigits($this$checkNumberOfDigits, startIndex, endIndex, "at least", 1);
        } else if (digits > typeHexLength) {
            checkZeroDigits($this$checkNumberOfDigits, startIndex, (startIndex + digits) - typeHexLength);
        }
    }

    private static final void checkZeroDigits(String $this$checkZeroDigits, int startIndex, int endIndex) {
        for (int index = startIndex; index < endIndex; index++) {
            if ($this$checkZeroDigits.charAt(index) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + index + ", but was '" + $this$checkZeroDigits.charAt(index) + "'.\nThe result won't fit the type being parsed.");
            }
        }
    }

    private static final int parseInt(String $this$parseInt, int startIndex, int endIndex) {
        int result = 0;
        for (int i = startIndex; i < endIndex; i++) {
            int i2 = result << 4;
            int code$iv = $this$parseInt.charAt(i);
            if ((code$iv >>> 8) == 0 && HEX_DIGITS_TO_DECIMAL[code$iv] >= 0) {
                result = i2 | HEX_DIGITS_TO_DECIMAL[code$iv];
            } else {
                throwInvalidDigitAt($this$parseInt, i);
                throw new KotlinNothingValueException();
            }
        }
        return result;
    }

    private static final long parseLong(String $this$parseLong, int startIndex, int endIndex) {
        long result = 0;
        for (int i = startIndex; i < endIndex; i++) {
            long j = result << 4;
            int code$iv = $this$parseLong.charAt(i);
            if ((code$iv >>> 8) == 0 && HEX_DIGITS_TO_LONG_DECIMAL[code$iv] >= 0) {
                result = j | HEX_DIGITS_TO_LONG_DECIMAL[code$iv];
            } else {
                throwInvalidDigitAt($this$parseLong, i);
                throw new KotlinNothingValueException();
            }
        }
        return result;
    }

    private static final int checkContainsAt(String $this$checkContainsAt, int index, int endIndex, String part, boolean ignoreCase, String partName) {
        if (part.length() == 0) {
            return index;
        }
        int length = part.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.equals(part.charAt(i), $this$checkContainsAt.charAt(index + i), ignoreCase)) {
                throwNotContainedAt($this$checkContainsAt, index, endIndex, part, partName);
            }
        }
        return index + part.length();
    }

    private static final int decimalFromHexDigitAt(String $this$decimalFromHexDigitAt, int index) {
        int code = $this$decimalFromHexDigitAt.charAt(index);
        if ((code >>> 8) == 0 && HEX_DIGITS_TO_DECIMAL[code] >= 0) {
            return HEX_DIGITS_TO_DECIMAL[code];
        }
        throwInvalidDigitAt($this$decimalFromHexDigitAt, index);
        throw new KotlinNothingValueException();
    }

    private static final long longDecimalFromHexDigitAt(String $this$longDecimalFromHexDigitAt, int index) {
        int code = $this$longDecimalFromHexDigitAt.charAt(index);
        if ((code >>> 8) == 0 && HEX_DIGITS_TO_LONG_DECIMAL[code] >= 0) {
            return HEX_DIGITS_TO_LONG_DECIMAL[code];
        }
        throwInvalidDigitAt($this$longDecimalFromHexDigitAt, index);
        throw new KotlinNothingValueException();
    }

    private static final void throwInvalidNumberOfDigits(String $this$throwInvalidNumberOfDigits, int startIndex, int endIndex, String specifier, int expected) {
        Intrinsics.checkNotNull($this$throwInvalidNumberOfDigits, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwInvalidNumberOfDigits.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + specifier + ' ' + expected + " hexadecimal digits at index " + startIndex + ", but was \"" + substring + "\" of length " + (endIndex - startIndex));
    }

    private static final void throwNotContainedAt(String $this$throwNotContainedAt, int index, int endIndex, String part, String partName) {
        int iCoerceAtMost = RangesKt.coerceAtMost(index + part.length(), endIndex);
        Intrinsics.checkNotNull($this$throwNotContainedAt, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwNotContainedAt.substring(index, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + partName + " \"" + part + "\" at index " + index + ", but was " + substring);
    }

    private static final void throwInvalidPrefixSuffix(String $this$throwInvalidPrefixSuffix, int startIndex, int endIndex, String prefix, String suffix) {
        Intrinsics.checkNotNull($this$throwInvalidPrefixSuffix, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$throwInvalidPrefixSuffix.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + prefix + "\" and suffix \"" + suffix + "\", but was " + substring);
    }

    private static final Void throwInvalidDigitAt(String $this$throwInvalidDigitAt, int index) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + index + ", but was " + $this$throwInvalidDigitAt.charAt(index));
    }
}
