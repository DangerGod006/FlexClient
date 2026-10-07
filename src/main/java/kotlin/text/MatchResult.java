package kotlin.text;

import java.util.List;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/MatchResult.class */
public interface MatchResult {
    @NotNull
    IntRange getRange();

    @NotNull
    String getValue();

    @NotNull
    MatchGroupCollection getGroups();

    @NotNull
    List<String> getGroupValues();

    @NotNull
    Destructured getDestructured();

    @Nullable
    MatchResult next();

    /* JADX INFO: compiled from: MatchResult.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/MatchResult$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        public static Destructured getDestructured(@NotNull MatchResult $this) {
            return new Destructured($this);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/MatchResult$Destructured.class */
    public static final class Destructured {

        @NotNull
        private final MatchResult match;

        public Destructured(@NotNull MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.match = match;
        }

        @NotNull
        public final MatchResult getMatch() {
            return this.match;
        }

        @InlineOnly
        private final String component1() {
            return getMatch().getGroupValues().get(1);
        }

        @InlineOnly
        private final String component2() {
            return getMatch().getGroupValues().get(2);
        }

        @InlineOnly
        private final String component3() {
            return getMatch().getGroupValues().get(3);
        }

        @InlineOnly
        private final String component4() {
            return getMatch().getGroupValues().get(4);
        }

        @InlineOnly
        private final String component5() {
            return getMatch().getGroupValues().get(5);
        }

        @InlineOnly
        private final String component6() {
            return getMatch().getGroupValues().get(6);
        }

        @InlineOnly
        private final String component7() {
            return getMatch().getGroupValues().get(7);
        }

        @InlineOnly
        private final String component8() {
            return getMatch().getGroupValues().get(8);
        }

        @InlineOnly
        private final String component9() {
            return getMatch().getGroupValues().get(9);
        }

        @InlineOnly
        private final String component10() {
            return getMatch().getGroupValues().get(10);
        }

        @NotNull
        public final List<String> toList() {
            return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
        }
    }
}
