package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantParseResult.class */
@ExperimentalTime
interface InstantParseResult {
    @NotNull
    Instant toInstant();

    @Nullable
    Instant toInstantOrNull();

    /* JADX INFO: compiled from: Instant.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantParseResult$Success.class */
    public static final class Success implements InstantParseResult {
        private final long epochSeconds;
        private final int nanosecondsOfSecond;

        public Success(long epochSeconds, int nanosecondsOfSecond) {
            this.epochSeconds = epochSeconds;
            this.nanosecondsOfSecond = nanosecondsOfSecond;
        }

        public final long getEpochSeconds() {
            return this.epochSeconds;
        }

        public final int getNanosecondsOfSecond() {
            return this.nanosecondsOfSecond;
        }

        @Override // kotlin.time.InstantParseResult
        @NotNull
        public Instant toInstant() {
            if (this.epochSeconds < Instant.Companion.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > Instant.Companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + this.epochSeconds + ')');
            }
            return Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }

        @Override // kotlin.time.InstantParseResult
        @Nullable
        public Instant toInstantOrNull() {
            if (this.epochSeconds < Instant.Companion.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > Instant.Companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                return null;
            }
            return Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }
    }

    /* JADX INFO: compiled from: Instant.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantParseResult$Failure.class */
    public static final class Failure implements InstantParseResult {

        @NotNull
        private final String error;

        @NotNull
        private final CharSequence input;

        public Failure(@NotNull String error, @NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(input, "input");
            this.error = error;
            this.input = input;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final CharSequence getInput() {
            return this.input;
        }

        @Override // kotlin.time.InstantParseResult
        @NotNull
        public Instant toInstant() {
            throw new InstantFormatException(this.error + " when parsing an Instant from \"" + InstantKt.truncateForErrorMessage(this.input, 64) + '\"');
        }

        @Override // kotlin.time.InstantParseResult
        @Nullable
        public Instant toInstantOrNull() {
            return null;
        }
    }
}
