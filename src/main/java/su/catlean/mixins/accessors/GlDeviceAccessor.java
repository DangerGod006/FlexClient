package su.catlean.mixins.accessors;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.class_10865;
import net.minecraft.class_10867;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/GlDeviceAccessor.class */
@Mixin({class_10865.class})
public interface GlDeviceAccessor {
    @Invoker("method_68381")
    class_10867 compilePipelineCachedCatlean(RenderPipeline renderPipeline);
}
