package dev.redstones.mediaplayerinfo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MediaInfo.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/MediaInfo.class */
@Serializable
public final class MediaInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String title;

    @NotNull
    private final String artist;

    @NotNull
    private final byte[] artworkPng;
    private final long position;
    private final long duration;
    private final boolean playing;

    @NotNull
    private final Lazy artwork$delegate;

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.artist;
    }

    @NotNull
    public final byte[] component3() {
        return this.artworkPng;
    }

    public final long component4() {
        return this.position;
    }

    public final long component5() {
        return this.duration;
    }

    public final boolean component6() {
        return this.playing;
    }

    @NotNull
    public final MediaInfo copy(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        return new MediaInfo(title, artist, artworkPng, position, duration, playing);
    }

    public static /* synthetic */ MediaInfo copy$default(MediaInfo mediaInfo, String str, String str2, byte[] bArr, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = mediaInfo.artist;
        }
        if ((i & 4) != 0) {
            bArr = mediaInfo.artworkPng;
        }
        if ((i & 8) != 0) {
            j = mediaInfo.position;
        }
        if ((i & 16) != 0) {
            j2 = mediaInfo.duration;
        }
        if ((i & 32) != 0) {
            z = mediaInfo.playing;
        }
        return mediaInfo.copy(str, str2, bArr, j, j2, z);
    }

    /* JADX INFO: compiled from: MediaInfo.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:dev/redstones/mediaplayerinfo/MediaInfo$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final KSerializer<MediaInfo> serializer() {
            return MediaInfo$$serializer.INSTANCE;
        }
    }

    public MediaInfo(@NotNull String title, @NotNull String artist, @NotNull byte[] artworkPng, long position, long duration, boolean playing) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(artworkPng, "artworkPng");
        this.title = title;
        this.artist = artist;
        this.artworkPng = artworkPng;
        this.position = position;
        this.duration = duration;
        this.playing = playing;
        this.artwork$delegate = LazyKt.lazy(new Function0<BufferedImage>() { // from class: dev.redstones.mediaplayerinfo.MediaInfo.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final BufferedImage invoke() {
                BufferedImage bufferedImage;
                System.currentTimeMillis();
                try {
                    bufferedImage = ImageIO.read(new ByteArrayInputStream(MediaInfo.this.getArtworkPng()));
                } catch (Exception e) {
                    bufferedImage = null;
                }
                return bufferedImage;
            }
        });
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$MediaPlayerInfo(MediaInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.artist);
        output.encodeSerializableElement(serialDesc, 2, ByteArraySerializer.INSTANCE, self.artworkPng);
        output.encodeLongElement(serialDesc, 3, self.position);
        output.encodeLongElement(serialDesc, 4, self.duration);
        output.encodeBooleanElement(serialDesc, 5, self.playing);
    }

    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    public /* synthetic */ MediaInfo(int seen1, String title, String artist, byte[] artworkPng, long position, long duration, boolean playing, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (63 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 63, MediaInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.title = title;
        this.artist = artist;
        this.artworkPng = artworkPng;
        this.position = position;
        this.duration = duration;
        this.playing = playing;
        this.artwork$delegate = LazyKt.lazy(new Function0<BufferedImage>() { // from class: dev.redstones.mediaplayerinfo.MediaInfo.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final BufferedImage invoke() {
                BufferedImage bufferedImage;
                System.currentTimeMillis();
                try {
                    bufferedImage = ImageIO.read(new ByteArrayInputStream(MediaInfo.this.getArtworkPng()));
                } catch (Exception e) {
                    bufferedImage = null;
                }
                return bufferedImage;
            }
        });
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    public final byte[] getArtworkPng() {
        return this.artworkPng;
    }

    public final long getPosition() {
        return this.position;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    @Nullable
    public final BufferedImage getArtwork() {
        return (BufferedImage) this.artwork$delegate.getValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type dev.redstones.mediaplayerinfo.MediaInfo");
        return Intrinsics.areEqual(this.title, ((MediaInfo) other).title) && Intrinsics.areEqual(this.artist, ((MediaInfo) other).artist) && Arrays.equals(this.artworkPng, ((MediaInfo) other).artworkPng) && this.position == ((MediaInfo) other).position && this.duration == ((MediaInfo) other).duration && this.playing == ((MediaInfo) other).playing;
    }

    public int hashCode() {
        int result = this.title.hashCode();
        return (31 * ((31 * ((31 * ((31 * ((31 * result) + this.artist.hashCode())) + Arrays.hashCode(this.artworkPng))) + Long.hashCode(this.position))) + Long.hashCode(this.duration))) + Boolean.hashCode(this.playing);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.artist;
        long j = this.position;
        long j2 = this.duration;
        boolean z = this.playing;
        return "MediaInfo(title='" + str + "', artist='" + str2 + "', position=" + j + ", duration=" + str + ", playing=" + j2 + ")";
    }
}
