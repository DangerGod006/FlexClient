package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.nodes.SVGNode;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/Container.class */
public interface Container<E> {
    @ApiStatus.Internal
    void addChild(@Nullable String str, @NotNull SVGNode sVGNode);

    List<? extends E> children();

    default <T extends E> List<T> childrenOfType(Class<T> type) {
        Stream<? extends E> stream = children().stream();
        Objects.requireNonNull(type);
        Stream<? extends E> streamFilter = stream.filter(type::isInstance);
        Objects.requireNonNull(type);
        return (List) streamFilter.map(type::cast).collect(Collectors.toList());
    }
}
