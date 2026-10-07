package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/ExceptionsCollector.class */
final class ExceptionsCollector {
    private final int limit;
    private int totalExceptions;

    @NotNull
    private final List<Exception> collectedExceptions;

    @Nullable
    private Path path;

    public ExceptionsCollector() {
        this(0, 1, null);
    }

    public ExceptionsCollector(int limit) {
        this.limit = limit;
        this.collectedExceptions = new ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    @NotNull
    public final List<Exception> getCollectedExceptions() {
        return this.collectedExceptions;
    }

    @Nullable
    public final Path getPath() {
        return this.path;
    }

    public final void setPath(@Nullable Path path) {
        this.path = path;
    }

    public final void enterEntry(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.path;
        this.path = path != null ? path.resolve(name) : null;
    }

    public final void exitEntry(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.path;
        if (!Intrinsics.areEqual(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path2 = this.path;
        this.path = path2 != null ? path2.getParent() : null;
    }

    public final void collect(@NotNull Exception exception) {
        FileSystemException fileSystemException;
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.totalExceptions++;
        boolean shouldCollect = this.collectedExceptions.size() < this.limit;
        if (shouldCollect) {
            if (this.path != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.path)).initCause(exception);
                Intrinsics.checkNotNull(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                fileSystemException = (FileSystemException) thInitCause;
            } else {
                fileSystemException = exception;
            }
            Exception restoredException = fileSystemException;
            this.collectedExceptions.add(restoredException);
        }
    }
}
