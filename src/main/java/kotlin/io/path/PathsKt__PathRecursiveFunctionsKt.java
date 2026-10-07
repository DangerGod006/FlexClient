package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/PathsKt__PathRecursiveFunctionsKt.class */
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/path/PathsKt__PathRecursiveFunctionsKt$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.1
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) throws Exception {
                    Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return PathsKt.copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z, z2);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path $this$copyToRecursively, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean followLinks, boolean overwrite) {
        Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (overwrite) {
            return PathsKt.copyToRecursively($this$copyToRecursively, target, onError, followLinks, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) (v1, v2, v3) -> {
                return copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(r4, v1, v2, v3);
            });
        }
        return PathsKt.copyToRecursively$default($this$copyToRecursively, target, onError, followLinks, (Function3) null, 8, (Object) null);
    }

    private static final CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext copyToRecursively, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        LinkOption[] options = LinkFollowing.INSTANCE.toLinkOptions($followLinks);
        LinkOption[] linkOptionArr = {LinkOption.NOFOLLOW_LINKS};
        boolean dstIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(options, options.length);
        boolean srcIsDirectory = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
        if (!srcIsDirectory || !dstIsDirectory) {
            if (dstIsDirectory) {
                PathsKt.deleteRecursively(dst);
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(options);
            spreadBuilder.add(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z, Function3 function32, int i, Object obj) {
        if ((i & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.3
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) throws Exception {
                    Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i & 8) != 0) {
            function32 = (v1, v2, v3) -> {
                return copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(r0, v1, v2, v3);
            };
        }
        return PathsKt.copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) function32);
    }

    private static final CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext copyActionContext, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(copyActionContext, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return copyActionContext.copyToIgnoringExistingDirectory(src, dst, $followLinks);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path $this$copyToRecursively, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean followLinks, @NotNull Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) throws FileSystemException {
        boolean zStartsWith;
        Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(followLinks);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.exists($this$copyToRecursively, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException($this$copyToRecursively.toString(), target.toString(), "The source file doesn't exist.");
        }
        LinkOption[] linkOptionArr2 = new LinkOption[0];
        if (Files.exists($this$copyToRecursively, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length)) && (followLinks || !Files.isSymbolicLink($this$copyToRecursively))) {
            LinkOption[] linkOptionArr3 = new LinkOption[0];
            boolean targetExistsAndNotSymlink = Files.exists(target, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length)) && !Files.isSymbolicLink(target);
            if (!targetExistsAndNotSymlink || !Files.isSameFile($this$copyToRecursively, target)) {
                if (!Intrinsics.areEqual($this$copyToRecursively.getFileSystem(), target.getFileSystem())) {
                    zStartsWith = false;
                } else if (targetExistsAndNotSymlink) {
                    zStartsWith = target.toRealPath(new LinkOption[0]).startsWith($this$copyToRecursively.toRealPath(new LinkOption[0]));
                } else {
                    Path it = target.getParent();
                    if (it != null) {
                        LinkOption[] linkOptionArr4 = new LinkOption[0];
                        zStartsWith = Files.exists(it, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length)) && it.toRealPath(new LinkOption[0]).startsWith($this$copyToRecursively.toRealPath(new LinkOption[0]));
                    } else {
                        zStartsWith = false;
                    }
                }
                boolean isSubdirectory = zStartsWith;
                if (isSubdirectory) {
                    throw new FileSystemException($this$copyToRecursively.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        Path normalizedTarget = target.normalize();
        ArrayList stack = new ArrayList();
        PathsKt.visitFileTree$default($this$copyToRecursively, 0, followLinks, (v6) -> {
            return copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(r3, r4, r5, r6, r7, r8, v6);
        }, 1, (Object) null);
        return target;
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source) throws IllegalFileNameException {
        Path relativePath = PathsKt.relativeTo(source, $this_copyToRecursively);
        Path destination = $target.resolve(relativePath.toString());
        if (!destination.normalize().startsWith(normalizedTarget)) {
            throw new IllegalFileNameException(source, destination, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        Intrinsics.checkNotNull(destination);
        return destination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> $onError, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source, Exception exception) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt($onError.invoke(source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source), exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(ArrayList<Path> stack, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> $copyAction, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> $onError, Path source, BasicFileAttributes attributes) {
        FileVisitResult fileVisitResultCopyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
        try {
            if (!stack.isEmpty()) {
                PathsKt.checkFileName(source);
                Object objLast = CollectionsKt.last((List<? extends Object>) stack);
                Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(source, (Path) objLast);
            }
            fileVisitResultCopyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt($copyAction.invoke(DefaultCopyActionContext.INSTANCE, source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source)));
        } catch (Exception exception) {
            fileVisitResultCopyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, normalizedTarget, source, exception);
        }
        return fileVisitResultCopyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
    }

    private static final Unit copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Function3 $onError, FileVisitorBuilder visitFileTree) {
        Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
        visitFileTree.onPreVisitDirectory((v6, v7) -> {
            return copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, r6, v6, v7);
        });
        visitFileTree.onVisitFile(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError));
        visitFileTree.onVisitFileFailed(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3($onError, $this_copyToRecursively, $target, $normalizedTarget));
        visitFileTree.onPostVisitDirectory((v5, v6) -> {
            return copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, v5, v6);
        });
        return Unit.INSTANCE;
    }

    private static final FileVisitResult copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Function3 $onError, Path directory, BasicFileAttributes attributes) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        FileVisitResult it = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError, directory, attributes);
        if (it == FileVisitResult.CONTINUE) {
            $stack.add(directory);
        }
        return it;
    }

    private static final FileVisitResult copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $onError, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Path directory, IOException exception) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        CollectionsKt.removeLast($stack);
        if (exception == null) {
            return FileVisitResult.CONTINUE;
        }
        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, $normalizedTarget, directory, exception);
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult $this$toFileVisitResult) {
        switch (WhenMappings.$EnumSwitchMapping$0[$this$toFileVisitResult.ordinal()]) {
            case 1:
                return FileVisitResult.CONTINUE;
            case 2:
                return FileVisitResult.TERMINATE;
            case 3:
                return FileVisitResult.SKIP_SUBTREE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult $this$toFileVisitResult) {
        switch (WhenMappings.$EnumSwitchMapping$1[$this$toFileVisitResult.ordinal()]) {
            case 1:
                return FileVisitResult.TERMINATE;
            case 2:
                return FileVisitResult.SKIP_SUBTREE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(@NotNull Path $this$deleteRecursively) throws FileSystemException {
        Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
        Iterable iterableDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursively);
        if (!((Collection) iterableDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt).isEmpty()) {
            FileSystemException $this$deleteRecursively_u24lambda_u248 = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterable $this$forEach$iv = iterableDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt;
            for (Object element$iv : $this$forEach$iv) {
                Exception it = (Exception) element$iv;
                ExceptionsKt.addSuppressed($this$deleteRecursively_u24lambda_u248, it);
            }
            throw $this$deleteRecursively_u24lambda_u248;
        }
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path $this$deleteRecursivelyImpl) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        ExceptionsCollector collector = new ExceptionsCollector(0, 1, null);
        boolean useInsecure = true;
        Path fileName = $this$deleteRecursivelyImpl.getFileName();
        if (fileName != null) {
            Path parent = $this$deleteRecursivelyImpl.getParent();
            if (parent == null) {
                parent = $this$deleteRecursivelyImpl.getFileSystem().getPath("", new String[0]);
            }
            Path parent2 = parent;
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent2);
            } catch (Throwable th) {
                directoryStreamNewDirectoryStream = null;
            }
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            if (directoryStream != null) {
                DirectoryStream<Path> directoryStream2 = directoryStream;
                Throwable th2 = null;
                try {
                    try {
                        DirectoryStream<Path> stream = directoryStream2;
                        if (stream instanceof SecureDirectoryStream) {
                            useInsecure = false;
                            collector.setPath(parent2);
                            handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream) stream, fileName, null, collector);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(directoryStream2, null);
                    } finally {
                    }
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(directoryStream2, th2);
                    throw th3;
                }
            }
        }
        if (useInsecure) {
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursivelyImpl, null, collector);
        }
        return collector.getCollectedExceptions();
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector collector, Function0<Unit> function) {
        try {
            function.invoke();
        } catch (Exception exception) {
            collector.collect(exception);
        }
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> function) {
        R rInvoke;
        try {
            rInvoke = function.invoke();
        } catch (NoSuchFileException e) {
            rInvoke = null;
        }
        return rInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:5:0x0010, B:6:0x0025, B:8:0x003c, B:11:0x0054, B:15:0x0072), top: B:23:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r6, java.nio.file.Path r7, java.nio.file.Path r8, kotlin.io.path.ExceptionsCollector r9) {
        /*
            r0 = r9
            r1 = r7
            r0.enterEntry(r1)
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L25
            r0 = r9
            java.nio.file.Path r0 = r0.getPath()     // Catch: java.lang.Exception -> L8e
            r1 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L8e
            r12 = r0
            r0 = r12
            kotlin.io.path.PathsKt.checkFileName(r0)     // Catch: java.lang.Exception -> L8e
            r0 = r12
            r1 = r8
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(r0, r1)     // Catch: java.lang.Exception -> L8e
        L25:
            r0 = r6
            r1 = r7
            r2 = 1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]     // Catch: java.lang.Exception -> L8e
            r12 = r2
            r2 = r12
            r3 = 0
            java.nio.file.LinkOption r4 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L8e
            r2[r3] = r4     // Catch: java.lang.Exception -> L8e
            r2 = r12
            boolean r0 = isDirectory$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2)     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L6f
            r0 = r9
            int r0 = r0.getTotalExceptions()     // Catch: java.lang.Exception -> L8e
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2)     // Catch: java.lang.Exception -> L8e
            r0 = r12
            r1 = r9
            int r1 = r1.getTotalExceptions()     // Catch: java.lang.Exception -> L8e
            if (r0 != r1) goto L8a
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r6
            r1 = r7
            r0.deleteDirectory(r1)     // Catch: java.nio.file.NoSuchFileException -> L67 java.lang.Exception -> L8e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L67 java.lang.Exception -> L8e
            r15 = r0
            goto L8a
        L67:
            r16 = move-exception
            r0 = 0
            r15 = r0
            goto L8a
        L6f:
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r6
            r1 = r7
            r0.deleteFile(r1)     // Catch: java.nio.file.NoSuchFileException -> L85 java.lang.Exception -> L8e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L85 java.lang.Exception -> L8e
            r14 = r0
            goto L8a
        L85:
            r15 = move-exception
            r0 = 0
            r14 = r0
        L8a:
            goto L96
        L8e:
            r17 = move-exception
            r0 = r9
            r1 = r17
            r0.collect(r1)
        L96:
            r0 = r9
            r1 = r7
            r0.exitEntry(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream, java.nio.file.Path, java.nio.file.Path, kotlin.io.path.ExceptionsCollector):void");
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> $this$enterDirectory, Path name, ExceptionsCollector collector) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = $this$enterDirectory.newDirectoryStream(name, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception exception$iv) {
                collector.collect(exception$iv);
                return;
            }
        } catch (NoSuchFileException e) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        SecureDirectoryStream<Path> secureDirectoryStream = secureDirectoryStreamNewDirectoryStream;
        if (secureDirectoryStream != null) {
            SecureDirectoryStream<Path> secureDirectoryStream2 = secureDirectoryStream;
            Throwable th = null;
            try {
                try {
                    SecureDirectoryStream<Path> secureDirectoryStream3 = secureDirectoryStream2;
                    Iterator<Path> it = secureDirectoryStream3.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        Path entry = it.next();
                        Path fileName = entry.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream3, fileName, collector.getPath(), collector);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(secureDirectoryStream2, null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th2;
                }
            } catch (Throwable th3) {
                CloseableKt.closeFinally(secureDirectoryStream2, th);
                throw th3;
            }
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> $this$isDirectory, Path entryName, LinkOption... options) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) $this$isDirectory.getFileAttributeView(entryName, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException e) {
            boolValueOf = null;
        }
        Boolean bool = boolValueOf;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path entry, Path parent, ExceptionsCollector collector) {
        if (parent != null) {
            try {
                PathsKt.checkFileName(entry);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(entry, parent);
            } catch (Exception exception$iv) {
                collector.collect(exception$iv);
                return;
            }
        }
        LinkOption[] linkOptionArr = {LinkOption.NOFOLLOW_LINKS};
        if (Files.isDirectory(entry, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            int preEnterTotalExceptions = collector.getTotalExceptions();
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(entry, collector);
            if (preEnterTotalExceptions == collector.getTotalExceptions()) {
                Files.deleteIfExists(entry);
            }
        } else {
            Files.deleteIfExists(entry);
        }
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector collector) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception exception$iv) {
                collector.collect(exception$iv);
                return;
            }
        } catch (NoSuchFileException e) {
            directoryStreamNewDirectoryStream = null;
        }
        DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
        if (directoryStream != null) {
            DirectoryStream<Path> directoryStream2 = directoryStream;
            Throwable th = null;
            try {
                try {
                    DirectoryStream<Path> directoryStream3 = directoryStream2;
                    Iterator it = directoryStream3.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        Path entry = (Path) it.next();
                        Intrinsics.checkNotNull(entry);
                        insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(entry, path, collector);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream2, null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th2;
                }
            } catch (Throwable th3) {
                CloseableKt.closeFinally(directoryStream2, th);
                throw th3;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void checkFileName(@NotNull Path $this$checkFileName) throws IllegalFileNameException {
        Intrinsics.checkNotNullParameter($this$checkFileName, "<this>");
        String fileName = PathsKt.getName($this$checkFileName);
        switch (fileName.hashCode()) {
            case 46:
                if (!fileName.equals(".")) {
                    return;
                }
                break;
            case 1472:
                if (!fileName.equals("..")) {
                    return;
                }
                break;
            case 1473:
                if (!fileName.equals("./")) {
                    return;
                }
                break;
            case 1518:
                if (!fileName.equals(".\\")) {
                    return;
                }
                break;
            case 45679:
                if (!fileName.equals("../")) {
                    return;
                }
                break;
            case 45724:
                if (!fileName.equals("..\\")) {
                    return;
                }
                break;
            default:
                return;
        }
        throw new IllegalFileNameException($this$checkFileName);
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(Path $this$checkNotSameAs, Path parent) throws FileSystemLoopException {
        if (!Files.isSymbolicLink($this$checkNotSameAs) && Files.isSameFile($this$checkNotSameAs, parent)) {
            throw new FileSystemLoopException($this$checkNotSameAs.toString());
        }
    }
}
