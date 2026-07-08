package dev.lvstrng.argon.utils;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/TimerUtils.class */
public final class TimerUtils {
    private long lastMS;

    public TimerUtils() {
        reset();
    }

    public long getCurrentMS() {
        return System.nanoTime() / 1000000;
    }

    public boolean hasReached(double milliseconds) {
        return ((double) (getCurrentMS() - this.lastMS)) >= milliseconds;
    }

    public void reset() {
        this.lastMS = getCurrentMS();
    }

    public boolean delay(float milliSec) {
        return ((float) (getTime() - this.lastMS)) >= milliSec;
    }

    public long getTime() {
        return System.nanoTime() / 1000000;
    }
}
