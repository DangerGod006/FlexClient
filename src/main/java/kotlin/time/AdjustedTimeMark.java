package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/AdjustedTimeMark.class */
final class AdjustedTimeMark implements TimeMark {

    @NotNull
    private final TimeMark mark;
    private final long adjustment;

    public /* synthetic */ AdjustedTimeMark(TimeMark mark, long adjustment, DefaultConstructorMarker $constructor_marker) {
        this(mark, adjustment);
    }

    private AdjustedTimeMark(TimeMark mark, long adjustment) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = adjustment;
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m1622getAdjustmentUwyO8pc() {
        return this.adjustment;
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public TimeMark mo1621minusLRDsOJo(long duration) {
        return TimeMark.DefaultImpls.m1752minusLRDsOJo(this, duration);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo1618elapsedNowUwyO8pc() {
        return Duration.m1635minusLRDsOJo(this.mark.mo1618elapsedNowUwyO8pc(), this.adjustment);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo1619plusLRDsOJo(long duration) {
        return new AdjustedTimeMark(this.mark, Duration.m1633plusLRDsOJo(this.adjustment, duration), null);
    }
}
