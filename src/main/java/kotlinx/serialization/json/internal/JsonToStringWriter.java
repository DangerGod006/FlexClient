package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonToStringWriter.class */
public final class JsonToStringWriter implements InternalJsonWriter {

    @NotNull
    private char[] array = CharArrayPool.INSTANCE.take();
    private int size;

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureAdditionalCapacity(text.length() + 2);
        char[] arr = this.array;
        int sz = this.size;
        int sz2 = sz + 1;
        arr[sz] = '\"';
        int length = text.length();
        text.getChars(0, length, arr, sz2);
        int i = sz2 + length;
        for (int i2 = sz2; i2 < i; i2++) {
            char c = arr[i2];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i2 - sz2, i2, text);
                return;
            }
        }
        int sz3 = sz2 + length;
        arr[sz3] = '\"';
        this.size = sz3 + 1;
    }

    private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
        int sz = currentSize;
        int length = string.length();
        for (int i = firstEscapedChar; i < length; i++) {
            int sz2 = ensureTotalCapacity(sz, 2);
            int ch = string.charAt(i);
            if (ch < StringOpsKt.getESCAPE_MARKERS().length) {
                byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
                if (marker == 0) {
                    sz = sz2 + 1;
                    this.array[sz2] = (char) ch;
                } else if (marker == 1) {
                    String escapedString = StringOpsKt.getESCAPE_STRINGS()[ch];
                    Intrinsics.checkNotNull(escapedString);
                    int sz3 = ensureTotalCapacity(sz2, escapedString.length());
                    escapedString.getChars(0, escapedString.length(), this.array, sz3);
                    sz = sz3 + escapedString.length();
                    this.size = sz;
                } else {
                    this.array[sz2] = '\\';
                    this.array[sz2 + 1] = (char) marker;
                    sz = sz2 + 2;
                    this.size = sz;
                }
            } else {
                sz = sz2 + 1;
                this.array[sz2] = (char) ch;
            }
        }
        int sz4 = ensureTotalCapacity(sz, 1);
        this.array[sz4] = '\"';
        this.size = sz4 + 1;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    @NotNull
    public String toString() {
        return new String(this.array, 0, this.size);
    }

    private final void ensureAdditionalCapacity(int expected) {
        ensureTotalCapacity(this.size, expected);
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int newSize = oldSize + additional;
        if (this.array.length <= newSize) {
            char[] cArrCopyOf = Arrays.copyOf(this.array, RangesKt.coerceAtLeast(newSize, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }
}
