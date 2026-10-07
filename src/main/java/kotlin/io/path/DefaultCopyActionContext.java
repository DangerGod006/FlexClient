package kotlin.io.path;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/DefaultCopyActionContext.class */
@ExperimentalPathApi
final class DefaultCopyActionContext implements CopyActionContext {

    @NotNull
    public static final DefaultCopyActionContext INSTANCE = new DefaultCopyActionContext();

    private DefaultCopyActionContext() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    @Override // kotlin.io.path.CopyActionContext
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.io.path.CopyActionResult copyToIgnoringExistingDirectory(@org.jetbrains.annotations.NotNull java.nio.file.Path r6, @org.jetbrains.annotations.NotNull java.nio.file.Path r7, boolean r8) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            java.lang.String r1 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            r1 = r8
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r1)
            r9 = r0
            r0 = r6
            r1 = r9
            r2 = r9
            int r2 = r2.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            r2 = r1
            int r2 = r2.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto L5c
            r0 = r7
            r10 = r0
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            r11 = r0
            r0 = r11
            r1 = 0
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r1] = r2
            r0 = r11
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r11
            int r2 = r2.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto L5c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L7a
        L5c:
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r9
            int r3 = r3.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            r3 = r2
            int r3 = r3.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            java.nio.file.Path r0 = java.nio.file.Files.copy(r0, r1, r2)
            r1 = r0
            java.lang.String r2 = "copy(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L7a:
            kotlin.io.path.CopyActionResult r0 = kotlin.io.path.CopyActionResult.CONTINUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.DefaultCopyActionContext.copyToIgnoringExistingDirectory(java.nio.file.Path, java.nio.file.Path, boolean):kotlin.io.path.CopyActionResult");
    }
}
