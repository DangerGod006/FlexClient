package su.catlean.mixins.client;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_243;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_745;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import su.catlean.interfaces.Resolvable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/client/RemotePlayerMixin.class */
@Mixin({class_745.class})
public class RemotePlayerMixin extends class_742 implements Resolvable {

    @Unique
    private class_243 cachePosition;

    public RemotePlayerMixin(class_638 world, GameProfile profile) {
        super(world, profile);
        this.cachePosition = class_243.field_1353;
    }

    @Override // su.catlean.interfaces.Resolvable
    public void savePosition(class_243 position) {
        this.cachePosition = position;
    }

    @Override // su.catlean.interfaces.Resolvable
    public class_243 getSavedPosition() {
        return this.cachePosition;
    }
}
