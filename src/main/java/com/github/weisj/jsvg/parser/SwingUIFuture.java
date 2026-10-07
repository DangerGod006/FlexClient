package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.swing.SwingWorker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/SwingUIFuture.class */
public final class SwingUIFuture<T> implements UIFuture<T> {

    @NotNull
    private final AtomicReference<SwingWorker<Void, Void>> swingWorker;

    @Nullable
    private T value;

    public SwingUIFuture(@NotNull final Supplier<T> supplier) {
        this.swingWorker = new AtomicReference<>(new SwingWorker<Void, Void>() { // from class: com.github.weisj.jsvg.parser.SwingUIFuture.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX INFO: renamed from: doInBackground, reason: merged with bridge method [inline-methods] */
            public Void m82doInBackground() {
                SwingUIFuture.this.value = supplier.get();
                synchronized (SwingUIFuture.this) {
                    SwingUIFuture.this.swingWorker.set(null);
                }
                return null;
            }
        });
        this.swingWorker.get().execute();
    }

    @Override // com.github.weisj.jsvg.parser.UIFuture
    public boolean checkIfReady(@NotNull PlatformSupport platformSupport) {
        SwingWorker<?, ?> worker = this.swingWorker.get();
        if (worker == null || worker.isDone()) {
            return true;
        }
        PlatformSupport.TargetSurface targetSurface = platformSupport.targetSurface();
        if (targetSurface != null) {
            synchronized (this) {
                worker.addPropertyChangeListener(e -> {
                    if (worker.isDone()) {
                        targetSurface.repaint();
                    }
                });
            }
            return false;
        }
        return false;
    }

    @Override // com.github.weisj.jsvg.parser.UIFuture
    public T get() {
        return this.value;
    }
}
