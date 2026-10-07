package com.github.weisj.jsvg.attributes.filter;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/filter/FilterChannelKey.class */
public interface FilterChannelKey {
    @NotNull
    Object key();

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/filter/FilterChannelKey$StringKey.class */
    public static class StringKey implements FilterChannelKey {

        @NotNull
        private final String key;

        public StringKey(@NotNull String key) {
            this.key = key;
        }

        @Override // com.github.weisj.jsvg.attributes.filter.FilterChannelKey
        @NotNull
        public Object key() {
            return this.key;
        }

        public String toString() {
            return "StringKey{key='" + this.key + "'}";
        }
    }
}
