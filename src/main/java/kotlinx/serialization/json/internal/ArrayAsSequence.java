package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ArrayAsSequence.class */
public final class ArrayAsSequence implements CharSequence {

    @NotNull
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(@NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.length = this.buffer.length;
    }

    @NotNull
    public final char[] getBuffer$kotlinx_serialization_json() {
        return this.buffer;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int index) {
        return get(index);
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public char get(int index) {
        return this.buffer[index];
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int startIndex, int endIndex) {
        return StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
    }

    @NotNull
    public final String substring(int startIndex, int endIndex) {
        return StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, length()));
    }

    public final void trim(int newSize) {
        setLength(Math.min(this.buffer.length, newSize));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return substring(0, length());
    }
}
