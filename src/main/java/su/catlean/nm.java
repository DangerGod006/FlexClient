package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nm.class */
public final class nm extends n9 {
    private final Selector M;
    private final SocketChannel F;

    @Nullable
    private b2 W;

    @Nullable
    private Integer e;

    @Nullable
    private ByteBuffer f;
    private final ByteBuffer h;
    private static final long b = 0;
    private static final String[] i = null;
    private static final String[] j = null;
    private static final Map k = null;
    private static final long m = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public nm(@NotNull String name, long a) throws Throwable {
        long j2 = b ^ a;
        Intrinsics.checkNotNullParameter(name, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28446, 4070149813632478835L ^ j2) /* invoke-custom */);
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1606936794379522032L, j2) /* invoke-custom */;
        this.M = Selector.open();
        this.F = SocketChannel.open(UnixDomainSocketAddress.of(name));
        this.h = ByteBuffer.allocate(4);
        try {
            this.F.configureBlocking(false);
            this.F.register(this.M, 1);
            ThreadsKt.thread$default(true, false, null, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1603, 1412147378877122345L ^ j2) /* invoke-custom */, 0, () -> {
                return q(r5);
            }, (int) m, null);
            if (obj == 0) {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1607073002967473265L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1639208898693828165L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private final void P(long j2) {
        long j3 = b ^ j2;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5914691694892604220L, j3) /* invoke-custom */;
        try {
            Result.Companion companion = Result.Companion;
            nm nmVar = this;
            loop0: while (true) {
                Object objSelect = nmVar.M.select();
                if (objSelect <= 0) {
                    break;
                }
                Set<SelectionKey> setSelectedKeys = nmVar.M.selectedKeys();
                Function1 function1 = (v1) -> {
                    return k(r1, v1);
                };
                objSelect = setSelectedKeys.removeIf((v1) -> {
                    return z(r1, v1);
                });
                do {
                    boolean z2 = z;
                    if (j3 >= 0) {
                        if (z2) {
                            break loop0;
                        } else {
                            z2 = z;
                        }
                    }
                    if (z2) {
                    }
                } while (j3 <= 0);
            }
            Result.m185constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // su.catlean.n9
    protected void P(long a, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25520, 6788748264161835259L ^ a) /* invoke-custom */);
        try {
            Result.Companion companion = Result.Companion;
            Result.m185constructorimpl(Integer.valueOf(this.F.write(buffer)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // su.catlean.n9
    public void Q() {
        try {
            Result.Companion companion = Result.Companion;
            nm nmVar = this;
            nmVar.F.close();
            nmVar.M.close();
            Result.m185constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean.b2] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.nm] */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.nm] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [su.catlean.nm] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final gk y(ReadableByteChannel readableByteChannel, long j2) throws Throwable {
        long j3 = b ^ j2;
        long j4 = j3 ^ 99428935292475L;
        int i2 = (int) (j3 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j3 ^ 132417311904855L;
        int i5 = (int) (j3 >>> 48);
        int i6 = (int) ((j5 << 16) >>> 32);
        int i7 = (int) ((j5 << 48) >>> 48);
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1347335036985477906L, j3) /* invoke-custom */;
        try {
            try {
                r0 = this;
                ?? HasRemaining = r0;
                if (r0 != 0) {
                    try {
                        try {
                            r0 = r0.W;
                            if (r0 == 0) {
                                nm nmVar = this;
                                nm nmVar2 = nmVar;
                                if (j3 > 0) {
                                    ReadableByteChannel readableByteChannel2 = readableByteChannel;
                                    nm nmVar3 = nmVar;
                                    Object orNull = readableByteChannel2;
                                    if (r0 != 0) {
                                        if (!nmVar.d(readableByteChannel2, (char) i5, i6, i7)) {
                                            return null;
                                        }
                                        nmVar3 = this;
                                        orNull = CollectionsKt.getOrNull(b2.w(), jw.c(this.h.getInt(0)));
                                    }
                                    nmVar3.W = (b2) orNull;
                                    nmVar2 = this;
                                }
                                nmVar2.h.clear();
                            }
                            HasRemaining = this;
                        } catch (NumberFormatException unused) {
                            r0 = (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1315593550708345531L, j3) /* invoke-custom */;
                            throw r0;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1315593550708345531L, j3) /* invoke-custom */;
                    }
                }
                if (j3 >= 0) {
                    try {
                        if (r0 != 0) {
                            try {
                                try {
                                    try {
                                        HasRemaining = HasRemaining.e;
                                        if (HasRemaining == 0) {
                                            nm nmVar4 = this;
                                            if (r0 != 0) {
                                                if (j3 >= 0) {
                                                    if (!nmVar4.d(readableByteChannel, (char) i5, i6, i7)) {
                                                        return null;
                                                    }
                                                    this.e = Integer.valueOf(jw.c(this.h.getInt(0)));
                                                    nmVar4 = this;
                                                }
                                                Integer num = this.e;
                                                Intrinsics.checkNotNull(num);
                                                nmVar4.f = ByteBuffer.allocate(num.intValue());
                                                nmVar4 = this;
                                            }
                                            nmVar4.h.clear();
                                        }
                                        ByteBuffer byteBuffer = this.f;
                                        Intrinsics.checkNotNull(byteBuffer);
                                        readableByteChannel.read(byteBuffer);
                                        HasRemaining = this;
                                    } catch (NumberFormatException unused3) {
                                        HasRemaining = (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                                        throw HasRemaining;
                                    }
                                } catch (NumberFormatException unused4) {
                                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                                }
                            } catch (NumberFormatException unused5) {
                                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                            }
                        }
                    } catch (NumberFormatException unused6) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                    }
                }
                try {
                    try {
                        ByteBuffer byteBuffer2 = HasRemaining.f;
                        Intrinsics.checkNotNull(byteBuffer2);
                        ?? r1 = r0;
                        try {
                            if (j3 >= 0) {
                                if (r1 != 0) {
                                    HasRemaining = byteBuffer2.hasRemaining();
                                    if (HasRemaining != 0) {
                                        return null;
                                    }
                                    byteBuffer2 = this.f;
                                }
                                r1 = r0;
                            }
                            if (r1 != 0 && byteBuffer2 != null) {
                                byteBuffer2.flip();
                            }
                            b2 b2Var = this.W;
                            Intrinsics.checkNotNull(b2Var);
                            Json jsonD = op.d();
                            Charset charset = Charsets.UTF_8;
                            ByteBuffer byteBuffer3 = this.f;
                            Intrinsics.checkNotNull(byteBuffer3);
                            String string = charset.decode(byteBuffer3).toString();
                            Intrinsics.checkNotNullExpressionValue(string, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28661, 7846788290628364898L ^ j3) /* invoke-custom */);
                            jsonD.getSerializersModule();
                            gk gkVar = new gk(i2, (short) i3, (char) i4, b2Var, (f4) jsonD.decodeFromString(f4.i.v(), string));
                            this.W = null;
                            this.e = null;
                            this.f = null;
                            return gkVar;
                        } catch (NumberFormatException unused7) {
                            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(byteBuffer2, -1315593550708345531L, j3) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused8) {
                        HasRemaining = (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                        throw HasRemaining;
                    }
                } catch (NumberFormatException unused9) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasRemaining, -1315593550708345531L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused10) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1315593550708345531L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused11) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1315593550708345531L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private final boolean d(ReadableByteChannel readableByteChannel, char c, int i2, int i3) throws Throwable {
        long j2 = (((((long) c) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ b;
        Object objHasRemaining = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7644717831475327924L, j2) /* invoke-custom */;
        readableByteChannel.read(this.h);
        try {
            try {
                objHasRemaining = this.h.hasRemaining();
                if (objHasRemaining == 0) {
                    return objHasRemaining;
                }
                if (objHasRemaining != 0) {
                    return false;
                }
                this.h.flip();
                return true;
            } catch (NumberFormatException unused) {
                objHasRemaining = (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHasRemaining, 7702317630666797599L, j2) /* invoke-custom */;
                throw objHasRemaining;
            }
        } catch (NumberFormatException unused2) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objHasRemaining, 7702317630666797599L, j2) /* invoke-custom */;
        }
    }

    private static final Unit q(nm nmVar) {
        nmVar.P((b ^ 105665812718406L) ^ 132163486298213L);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final boolean k(nm nmVar, SelectionKey selectionKey) throws Throwable {
        long j2 = b ^ 95245202620986L;
        long j3 = j2 ^ 9740319922384L;
        long j4 = j2 ^ 45827021074001L;
        Object objIsReadable = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1157758936484874674L, j2) /* invoke-custom */;
        try {
            objIsReadable = selectionKey.isReadable();
            if (objIsReadable == 0) {
                return objIsReadable;
            }
            if (objIsReadable == 0) {
                return false;
            }
            SocketChannel socketChannel = nmVar.F;
            Intrinsics.checkNotNullExpressionValue(socketChannel, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28967, 6883300746374400494L ^ j2) /* invoke-custom */);
            gk gkVarY = nmVar.y(socketChannel, j4);
            gk gkVar = gkVarY;
            if (objIsReadable != 0) {
                if (gkVar == null) {
                    return false;
                }
                gkVar = gkVarY;
            }
            os.D.M(j3, gkVar);
            return true;
        } catch (NumberFormatException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objIsReadable, 1216658890994092057L, j2) /* invoke-custom */;
        }
    }

    private static final boolean z(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static Throwable a(Throwable th) {
        return th;
    }

    private static String b(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 10748;
        if (j[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) k.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                j[i3] = b(((Cipher) objArr[0]).doFinal(i[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/nm", e);
            }
        }
        return j[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 4
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/nm"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nm.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
