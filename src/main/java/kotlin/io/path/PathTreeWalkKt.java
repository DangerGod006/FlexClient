package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/PathTreeWalkKt.class */
public final class PathTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object keyOf(Path path, LinkOption[] linkOptions) {
        Object objFileKey;
        try {
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(attributes, "readAttributes(...)");
            objFileKey = attributes.fileKey();
        } catch (Throwable th) {
            objFileKey = null;
        }
        return objFileKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createsCycle(PathNode $this$createsCycle) {
        PathNode parent = $this$createsCycle.getParent();
        while (true) {
            PathNode ancestor = parent;
            if (ancestor != null) {
                if (ancestor.getKey() != null && $this$createsCycle.getKey() != null) {
                    if (Intrinsics.areEqual(ancestor.getKey(), $this$createsCycle.getKey())) {
                        return true;
                    }
                } else {
                    try {
                        if (Files.isSameFile(ancestor.getPath(), $this$createsCycle.getPath())) {
                            return true;
                        }
                    } catch (IOException e) {
                    } catch (SecurityException e2) {
                    }
                }
                parent = ancestor.getParent();
            } else {
                return false;
            }
        }
    }
}
