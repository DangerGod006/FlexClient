package com.github.weisj.jsvg.util;

import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/LazyProvider.class */
public final class LazyProvider<T> implements Provider<T> {

    @NotNull
    private final Supplier<T> supplier;
    private T t;

    public LazyProvider(@NotNull Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override // com.github.weisj.jsvg.util.Provider
    @NotNull
    public T get() {
        if (this.t == null) {
            this.t = this.supplier.get();
        }
        return this.t;
    }
}
