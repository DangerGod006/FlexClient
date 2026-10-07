package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/LinkFollowing.class */
public final class LinkFollowing {

    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();

    @NotNull
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};

    @NotNull
    private static final LinkOption[] followLinkOption = new LinkOption[0];

    @NotNull
    private static final Set<FileVisitOption> nofollowVisitOption = SetsKt.emptySet();

    @NotNull
    private static final Set<FileVisitOption> followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    @NotNull
    public final LinkOption[] toLinkOptions(boolean followLinks) {
        return followLinks ? followLinkOption : nofollowLinkOption;
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean followLinks) {
        return followLinks ? followVisitOption : nofollowVisitOption;
    }
}
