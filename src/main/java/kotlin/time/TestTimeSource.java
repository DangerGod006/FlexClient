package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TestTimeSource.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1749plusAssignLRDsOJo(long duration) {
        long longDelta = Duration.m1658toLongimpl(duration, getUnit());
        if (!(((longDelta - 1) | 1) == LongCompanionObject.MAX_VALUE)) {
            long newReading = this.reading + longDelta;
            if ((this.reading ^ longDelta) >= 0 && (this.reading ^ newReading) < 0) {
                m1750overflowLRDsOJo(duration);
            }
            this.reading = newReading;
            return;
        }
        long half = Duration.m1638divUwyO8pc(duration, 2);
        long $this$isSaturated$iv = Duration.m1658toLongimpl(half, getUnit());
        if (!((($this$isSaturated$iv - 1) | 1) == LongCompanionObject.MAX_VALUE)) {
            long readingBefore = this.reading;
            try {
                m1749plusAssignLRDsOJo(half);
                m1749plusAssignLRDsOJo(Duration.m1635minusLRDsOJo(duration, half));
                return;
            } catch (IllegalStateException e) {
                this.reading = readingBefore;
                throw e;
            }
        }
        m1750overflowLRDsOJo(duration);
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1750overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m1667toStringimpl(duration)) + '.');
    }
}
