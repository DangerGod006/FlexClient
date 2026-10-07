package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/SerialDescriptorImpl.class */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    @NotNull
    private final String serialName;

    @NotNull
    private final SerialKind kind;
    private final int elementsCount;

    @NotNull
    private final List<Annotation> annotations;

    @NotNull
    private final Set<String> serialNames;

    @NotNull
    private final String[] elementNames;

    @NotNull
    private final SerialDescriptor[] elementDescriptors;

    @NotNull
    private final List<Annotation>[] elementAnnotations;

    @NotNull
    private final boolean[] elementOptionality;

    @NotNull
    private final Map<String, Integer> name2Index;

    @NotNull
    private final SerialDescriptor[] typeParametersDescriptors;

    @NotNull
    private final Lazy _hashCode$delegate;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return super.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return super.isInline();
    }

    public SerialDescriptorImpl(@NotNull String serialName, @NotNull SerialKind kind, int elementsCount, @NotNull List<? extends SerialDescriptor> typeParameters, @NotNull ClassSerialDescriptorBuilder builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = elementsCount;
        this.annotations = builder.getAnnotations();
        this.serialNames = CollectionsKt.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        Collection $this$toTypedArray$iv = builder.getElementNames$kotlinx_serialization_core();
        this.elementNames = (String[]) $this$toTypedArray$iv.toArray(new String[0]);
        this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        Collection $this$toTypedArray$iv2 = builder.getElementAnnotations$kotlinx_serialization_core();
        this.elementAnnotations = (List[]) $this$toTypedArray$iv2.toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
        Iterable $this$map$iv = ArraysKt.withIndex(this.elementNames);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            IndexedValue it = (IndexedValue) item$iv$iv;
            destination$iv$iv.add(TuplesKt.to(it.getValue(), Integer.valueOf(it.getIndex())));
        }
        this.name2Index = MapsKt.toMap((List) destination$iv$iv);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
        this._hashCode$delegate = LazyKt.lazy(() -> {
            return _hashCode_delegate$lambda$1(r1);
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    private static final int _hashCode_delegate$lambda$1(SerialDescriptorImpl this$0) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this$0, this$0.typeParametersDescriptors);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int index) {
        return this.elementNames[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        return this.elementAnnotations[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return this.elementDescriptors[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        boolean[] $this$getChecked$iv = this.elementOptionality;
        return $this$getChecked$iv[index];
    }

    public boolean equals(@Nullable Object other) {
        SerialDescriptorImpl $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv == other) {
            return true;
        }
        if (!(other instanceof SerialDescriptorImpl) || !Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor) other).getSerialName())) {
            return false;
        }
        SerialDescriptorImpl otherDescriptor = (SerialDescriptorImpl) other;
        if (!Arrays.equals(this.typeParametersDescriptors, otherDescriptor.typeParametersDescriptors) || $this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
            return false;
        }
        int elementsCount = $this$equalsImpl$iv.getElementsCount();
        for (int index$iv = 0; index$iv < elementsCount; index$iv++) {
            if (!Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), ((SerialDescriptor) other).getElementDescriptor(index$iv).getSerialName()) || !Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), ((SerialDescriptor) other).getElementDescriptor(index$iv).getKind())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return get_hashCode();
    }

    @NotNull
    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
