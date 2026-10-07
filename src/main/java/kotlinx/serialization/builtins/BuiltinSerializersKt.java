package kotlinx.serialization.builtins;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;
import kotlin.uuid.ExperimentalUuidApi;
import kotlin.uuid.Uuid;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.InstantSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/builtins/BuiltinSerializersKt.class */
public final class BuiltinSerializersKt {
    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }

    @NotNull
    public static final <T> KSerializer<T> getNullable(@NotNull KSerializer<T> $this$nullable) {
        Intrinsics.checkNotNullParameter($this$nullable, "<this>");
        return $this$nullable.getDescriptor().isNullable() ? $this$nullable : new NullableSerializer($this$nullable);
    }

    @NotNull
    public static final <K, V> KSerializer<Pair<K, V>> PairSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <A, B, C> KSerializer<Triple<A, B, C>> TripleSerializer(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    @NotNull
    public static final KSerializer<Character> serializer(@NotNull CharCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return CharSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Byte> serializer(@NotNull ByteCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UByteArray> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Short> serializer(@NotNull ShortCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UShortArray> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Integer> serializer(@NotNull IntCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return IntSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UIntArray> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Long> serializer(@NotNull LongCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return LongSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<ULongArray> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Float> serializer(@NotNull FloatCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return FloatSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Double> serializer(@NotNull DoubleCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Boolean> serializer(@NotNull BooleanCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Unit> serializer(@NotNull Unit $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UnitSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<String> serializer(@NotNull StringCompanionObject $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return StringSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        return ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), elementSerializer);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(@NotNull KClass<T> kClass, @NotNull KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, elementSerializer);
    }

    @NotNull
    public static final <T> KSerializer<List<T>> ListSerializer(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    @NotNull
    public static final <T> KSerializer<Set<T>> SetSerializer(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new LinkedHashSetSerializer(elementSerializer);
    }

    @NotNull
    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    @NotNull
    public static final KSerializer<UInt> serializer(@NotNull UInt.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UIntSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<ULong> serializer(@NotNull ULong.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return ULongSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<UByte> serializer(@NotNull UByte.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<UShort> serializer(@NotNull UShort.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Duration> serializer(@NotNull Duration.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return DurationSerializer.INSTANCE;
    }

    @ExperimentalTime
    @NotNull
    public static final KSerializer<Instant> serializer(@NotNull Instant.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return InstantSerializer.INSTANCE;
    }

    @ExperimentalUuidApi
    @NotNull
    public static final KSerializer<Uuid> serializer(@NotNull Uuid.Companion $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        return UuidSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }
}
