package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/PluginExceptionsKt.class */
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwMissingFieldException(int seen, int goldenMask, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        List missingFields = new ArrayList();
        int missingFieldsBits = goldenMask & (seen ^ (-1));
        for (int i = 0; i < 32; i++) {
            if ((missingFieldsBits & 1) != 0) {
                missingFields.add(descriptor.getElementName(i));
            }
            missingFieldsBits >>>= 1;
        }
        throw new MissingFieldException((List<String>) missingFields, descriptor.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(@NotNull int[] seenArray, @NotNull int[] goldenMaskArray, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        List missingFields = new ArrayList();
        int length = goldenMaskArray.length;
        for (int maskSlot = 0; maskSlot < length; maskSlot++) {
            int missingFieldsBits = goldenMaskArray[maskSlot] & (seenArray[maskSlot] ^ (-1));
            if (missingFieldsBits != 0) {
                for (int i = 0; i < 32; i++) {
                    if ((missingFieldsBits & 1) != 0) {
                        missingFields.add(descriptor.getElementName((maskSlot * 32) + i));
                    }
                    missingFieldsBits >>>= 1;
                }
            }
        }
        throw new MissingFieldException((List<String>) missingFields, descriptor.getSerialName());
    }
}
