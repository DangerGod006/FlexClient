package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/PathRelativizer.class */
final class PathRelativizer {

    @NotNull
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath = Paths.get("", new String[0]);
    private static final Path parentPath = Paths.get("..", new String[0]);

    private PathRelativizer() {
    }

    @NotNull
    public final Path tryRelativeTo(@NotNull Path path, @NotNull Path base) {
        Path path2;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path bn = base.normalize();
        Path pn = path.normalize();
        Path rn = bn.relativize(pn);
        int iMin = Math.min(bn.getNameCount(), pn.getNameCount());
        for (int i = 0; i < iMin && Intrinsics.areEqual(bn.getName(i), parentPath); i++) {
            if (!Intrinsics.areEqual(pn.getName(i), parentPath)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (!Intrinsics.areEqual(pn, bn) && Intrinsics.areEqual(bn, emptyPath)) {
            path2 = pn;
        } else {
            String rnString = rn.toString();
            String separator = rn.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            if (StringsKt.endsWith$default(rnString, separator, false, 2, (Object) null)) {
                path2 = rn.getFileSystem().getPath(StringsKt.dropLast(rnString, rn.getFileSystem().getSeparator().length()), new String[0]);
            } else {
                path2 = rn;
            }
        }
        Path r = path2;
        Intrinsics.checkNotNull(r);
        return r;
    }
}
