package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonTreeReader.class */
public final class JsonTreeReader {

    @NotNull
    private final AbstractJsonLexer lexer;
    private final boolean isLenient;
    private final boolean trailingCommaAllowed;
    private int stackDepth;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readObject$2, reason: invalid class name */
    /* JADX INFO: compiled from: JsonTreeReader.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonTreeReader$readObject$2.class */
    static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int I$0;
        int I$1;
        byte B$0;
        /* synthetic */ Object result;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> $completion) {
            super($completion);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.result = $result;
            this.label |= IntCompanionObject.MIN_VALUE;
            return JsonTreeReader.this.readObject(null, this);
        }
    }

    public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.isLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    private final JsonElement readObject() {
        byte lastToken$iv = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap result$iv = new LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            String key$iv = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            JsonElement element$iv = read();
            result$iv.put(key$iv, element$iv);
            lastToken$iv = this.lexer.consumeNextToken();
            if (lastToken$iv != 4) {
                if (lastToken$iv != 7) {
                    AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (lastToken$iv == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (lastToken$iv == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new JsonObject(result$iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[PHI: r8 r10 r11 r12 r13
  0x0098: PHI (r8v3 '$this$readObject' kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>) = 
  (r8v2 '$this$readObject' kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>)
  (r8v0 '$this$readObject' kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>)
 binds: [B:27:0x0175, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r10v3 'this_$iv' kotlinx.serialization.json.internal.JsonTreeReader) = 
  (r10v2 'this_$iv' kotlinx.serialization.json.internal.JsonTreeReader)
  (r10v4 'this_$iv' kotlinx.serialization.json.internal.JsonTreeReader)
 binds: [B:27:0x0175, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r11v2 '$i$f$readObjectImpl' int) = (r11v1 '$i$f$readObjectImpl' int), (r11v3 '$i$f$readObjectImpl' int) binds: [B:27:0x0175, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r12v3 'lastToken$iv' byte) = (r12v2 'lastToken$iv' byte), (r12v4 'lastToken$iv' byte) binds: [B:27:0x0175, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r13v3 'result$iv' java.util.LinkedHashMap) = (r13v2 'result$iv' java.util.LinkedHashMap), (r13v4 'result$iv' java.util.LinkedHashMap) binds: [B:27:0x0175, B:14:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0175 -> B:15:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readObject(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> r8, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final JsonObject readObjectImpl(Function0<? extends JsonElement> reader) {
        byte lastToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap result = new LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            String key = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            JsonElement element = reader.invoke();
            result.put(key, element);
            lastToken = this.lexer.consumeNextToken();
            if (lastToken != 4) {
                if (lastToken != 7) {
                    AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (lastToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (lastToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new JsonObject(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte lastToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList result = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            JsonElement element = read();
            result.add(element);
            lastToken = this.lexer.consumeNextToken();
            if (lastToken != 4) {
                AbstractJsonLexer $this$iv = this.lexer;
                boolean condition$iv = lastToken == 9;
                int position$iv = $this$iv.currentPosition;
                if (!condition$iv) {
                    AbstractJsonLexer.fail$default($this$iv, "Expected end of the array or comma", position$iv, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (lastToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (lastToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new JsonArray(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean isString) {
        String strConsumeStringLenient;
        if (this.isLenient || !isString) {
            strConsumeStringLenient = this.lexer.consumeStringLenient();
        } else {
            strConsumeStringLenient = this.lexer.consumeString();
        }
        String string = strConsumeStringLenient;
        return (isString || !Intrinsics.areEqual(string, AbstractJsonLexerKt.NULL)) ? new JsonLiteral(string, isString, null, 4, null) : JsonNull.INSTANCE;
    }

    @NotNull
    public final JsonElement read() {
        JsonElement object;
        byte token = this.lexer.peekNextToken();
        if (token == 1) {
            return readValue(true);
        }
        if (token == 0) {
            return readValue(false);
        }
        if (token == 6) {
            this.stackDepth++;
            if (this.stackDepth == 200) {
                object = readDeepRecursive();
            } else {
                object = readObject();
            }
            JsonElement result = object;
            this.stackDepth--;
            int i = this.stackDepth;
            return result;
        }
        if (token == 8) {
            return readArray();
        }
        AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(token), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1, reason: invalid class name */
    /* JADX INFO: compiled from: JsonTreeReader.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonTreeReader$readDeepRecursive$1.class */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
        int label;
        private /* synthetic */ Object L$0;

        AnonymousClass1(Continuation<? super AnonymousClass1> $completion) {
            super(3, $completion);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(DeepRecursiveScope<Unit, JsonElement> p1, Unit p2, Continuation<? super JsonElement> p3) {
            AnonymousClass1 anonymousClass1 = JsonTreeReader.this.new AnonymousClass1(p3);
            anonymousClass1.L$0 = p1;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Object object;
            DeepRecursiveScope $this$DeepRecursiveFunction = (DeepRecursiveScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    byte bPeekNextToken = JsonTreeReader.this.lexer.peekNextToken();
                    if (bPeekNextToken == 1) {
                        return JsonTreeReader.this.readValue(true);
                    }
                    if (bPeekNextToken == 0) {
                        return JsonTreeReader.this.readValue(false);
                    }
                    if (bPeekNextToken == 6) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable($this$DeepRecursiveFunction);
                        this.label = 1;
                        object = JsonTreeReader.this.readObject($this$DeepRecursiveFunction, this);
                        if (object == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (bPeekNextToken == 8) {
                            return JsonTreeReader.this.readArray();
                        }
                        AbstractJsonLexer.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    object = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (JsonElement) object;
        }
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new AnonymousClass1(null)), Unit.INSTANCE);
    }
}
