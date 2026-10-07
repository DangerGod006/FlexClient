package su.catlean;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/c.class */
public final class c implements Runnable {
    final int d;
    final Function0 T;

    public c(int $delay, Function0 $runnable) {
        this.d = $delay;
        this.T = $runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Thread.sleep(this.d);
        this.T.invoke();
    }
}
