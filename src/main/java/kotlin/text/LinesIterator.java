package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/LinesIterator.class */
final class LinesIterator implements Iterator<String>, KMappedMarker {

    @NotNull
    private static final State State = new State(null);

    @NotNull
    private final CharSequence string;
    private int state;
    private int tokenStartIndex;
    private int delimiterStartIndex;
    private int delimiterLength;

    @Deprecated
    public static final int UNKNOWN = 0;

    @Deprecated
    public static final int HAS_NEXT = 1;

    @Deprecated
    public static final int EXHAUSTED = 2;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: compiled from: Strings.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/LinesIterator$State.class */
    private static final class State {
        public /* synthetic */ State(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private State() {
        }
    }

    public LinesIterator(@NotNull CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.string = string;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.state != 0) {
            return this.state == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        int _delimiterLength = -1;
        int _delimiterStartIndex = this.string.length();
        int idx = this.tokenStartIndex;
        int length = this.string.length();
        while (true) {
            if (idx < length) {
                char c = this.string.charAt(idx);
                switch (c) {
                    case '\n':
                    case '\r':
                        _delimiterLength = (c == '\r' && idx + 1 < this.string.length() && this.string.charAt(idx + 1) == '\n') ? 2 : 1;
                        _delimiterStartIndex = idx;
                        break;
                    case 11:
                    case '\f':
                    default:
                        idx++;
                        break;
                }
            }
        }
        this.state = 1;
        this.delimiterLength = _delimiterLength;
        this.delimiterStartIndex = _delimiterStartIndex;
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        int lastIndex = this.delimiterStartIndex;
        int firstIndex = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterStartIndex + this.delimiterLength;
        return this.string.subSequence(firstIndex, lastIndex).toString();
    }
}
