package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/PluginGeneratedSerialDescriptor.class */
@PublishedApi
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    @NotNull
    private final String serialName;

    @Nullable
    private final GeneratedSerializer<?> generatedSerializer;
    private final int elementsCount;
    private int added;

    @NotNull
    private final String[] names;

    @NotNull
    private final List<Annotation>[] propertiesAnnotations;

    @Nullable
    private List<Annotation> classAnnotations;

    @NotNull
    private final boolean[] elementsOptionality;

    @NotNull
    private Map<String, Integer> indices;

    @NotNull
    private final Lazy childSerializers$delegate;

    @NotNull
    private final Lazy typeParameterDescriptors$delegate;

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

    public PluginGeneratedSerialDescriptor(@NotNull String serialName, @Nullable GeneratedSerializer<?> generatedSerializer, int elementsCount) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = elementsCount;
        this.added = -1;
        int i = this.elementsCount;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        this.propertiesAnnotations = new List[this.elementsCount];
        this.elementsOptionality = new boolean[this.elementsCount];
        this.indices = MapsKt.emptyMap();
        this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> {
            return childSerializers_delegate$lambda$0(r2);
        });
        this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> {
            return typeParameterDescriptors_delegate$lambda$2(r2);
        });
        this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> {
            return _hashCode_delegate$lambda$3(r2);
        });
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer, i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    private static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor this$0) {
        GeneratedSerializer<?> generatedSerializer = this$0.generatedSerializer;
        if (generatedSerializer != null) {
            KSerializer<?>[] kSerializerArrChildSerializers = generatedSerializer.childSerializers();
            if (kSerializerArrChildSerializers != null) {
                return kSerializerArrChildSerializers;
            }
        }
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }

    @NotNull
    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    private static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor this$0) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        GeneratedSerializer<?> generatedSerializer = this$0.generatedSerializer;
        if (generatedSerializer == null || (kSerializerArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            Collection destination$iv$iv = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                destination$iv$iv.add(kSerializer.getDescriptor());
            }
            arrayList = (List) destination$iv$iv;
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    private static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor this$0) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this$0, this$0.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z);
    }

    public final void addElement(@NotNull String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        this.added++;
        strArr[this.added] = name;
        this.elementsOptionality[this.added] = isOptional;
        this.propertiesAnnotations[this.added] = null;
        if (this.added == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public final void pushAnnotation(@NotNull Annotation annotation) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> list = this.propertiesAnnotations[this.added];
        if (list == null) {
            ArrayList result = new ArrayList(1);
            this.propertiesAnnotations[this.added] = result;
            arrayList = result;
        } else {
            arrayList = list;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(@NotNull Annotation a) {
        Intrinsics.checkNotNullParameter(a, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        boolean[] $this$getChecked$iv = this.elementsOptionality;
        return $this$getChecked$iv[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map<String, Integer> buildIndices() {
        HashMap indices = new HashMap();
        int length = this.names.length;
        for (int i = 0; i < length; i++) {
            indices.put(this.names[i], Integer.valueOf(i));
        }
        return indices;
    }

    public boolean equals(@Nullable Object other) {
        PluginGeneratedSerialDescriptor $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv == other) {
            return true;
        }
        if (!(other instanceof PluginGeneratedSerialDescriptor) || !Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor) other).getSerialName())) {
            return false;
        }
        PluginGeneratedSerialDescriptor otherDescriptor = (PluginGeneratedSerialDescriptor) other;
        if (!Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()) || $this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
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
