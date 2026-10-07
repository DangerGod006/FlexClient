package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat.class */
@SinceKotlin(version = "2.2")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public final class HexFormat {
    private final boolean upperCase;

    @NotNull
    private final BytesHexFormat bytes;

    @NotNull
    private final NumberHexFormat number;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HexFormat Default = new HexFormat(false, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());

    @NotNull
    private static final HexFormat UpperCase = new HexFormat(true, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());

    public HexFormat(boolean upperCase, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = upperCase;
        this.bytes = bytes;
        this.number = number;
    }

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    @NotNull
    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
        $this$toString_u24lambda_u240.append("HexFormat(").append('\n');
        $this$toString_u24lambda_u240.append("    upperCase = ").append(this.upperCase).append(",").append('\n');
        $this$toString_u24lambda_u240.append("    bytes = BytesHexFormat(").append('\n');
        this.bytes.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "        ").append('\n');
        $this$toString_u24lambda_u240.append("    ),").append('\n');
        $this$toString_u24lambda_u240.append("    number = NumberHexFormat(").append('\n');
        this.number.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "        ").append('\n');
        $this$toString_u24lambda_u240.append("    )").append('\n');
        $this$toString_u24lambda_u240.append(")");
        return $this$toString_u24lambda_u240.toString();
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$BytesHexFormat.class */
    public static final class BytesHexFormat {
        private final int bytesPerLine;
        private final int bytesPerGroup;

        @NotNull
        private final String groupSeparator;

        @NotNull
        private final String byteSeparator;

        @NotNull
        private final String bytePrefix;

        @NotNull
        private final String byteSuffix;
        private final boolean noLineAndGroupSeparator;
        private final boolean shortByteSeparatorNoPrefixAndSuffix;
        private final boolean ignoreCase;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final BytesHexFormat Default = new BytesHexFormat(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, "  ", "", "", "");

        /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BytesHexFormat(int r5, int r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexFormat.BytesHexFormat.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
            return this.noLineAndGroupSeparator;
        }

        public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
            return this.shortByteSeparatorNoPrefixAndSuffix;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.ignoreCase;
        }

        @NotNull
        public String toString() {
            StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
            $this$toString_u24lambda_u240.append("BytesHexFormat(").append('\n');
            appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "    ").append('\n');
            $this$toString_u24lambda_u240.append(")");
            return $this$toString_u24lambda_u240.toString();
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent).append("bytesPerLine = ").append(this.bytesPerLine).append(",").append('\n');
            sb.append(indent).append("bytesPerGroup = ").append(this.bytesPerGroup).append(",").append('\n');
            sb.append(indent).append("groupSeparator = \"").append(this.groupSeparator).append("\",").append('\n');
            sb.append(indent).append("byteSeparator = \"").append(this.byteSeparator).append("\",").append('\n');
            sb.append(indent).append("bytePrefix = \"").append(this.bytePrefix).append("\",").append('\n');
            sb.append(indent).append("byteSuffix = \"").append(this.byteSuffix).append("\"");
            return sb;
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$BytesHexFormat$Builder.class */
        public static final class Builder {
            private int bytesPerLine = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerLine();
            private int bytesPerGroup = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerGroup();

            @NotNull
            private String groupSeparator = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getGroupSeparator();

            @NotNull
            private String byteSeparator = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSeparator();

            @NotNull
            private String bytePrefix = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytePrefix();

            @NotNull
            private String byteSuffix = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSuffix();

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            public final void setBytesPerLine(int value) {
                if (value <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + value);
                }
                this.bytesPerLine = value;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final void setBytesPerGroup(int value) {
                if (value <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + value);
                }
                this.bytesPerGroup = value;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setGroupSeparator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.groupSeparator = str;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            public final void setByteSeparator(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
                }
                this.byteSeparator = value;
            }

            @NotNull
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            public final void setBytePrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
                }
                this.bytePrefix = value;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final void setByteSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
                }
                this.byteSuffix = value;
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$BytesHexFormat$Companion.class */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.Default;
            }
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$NumberHexFormat.class */
    public static final class NumberHexFormat {

        @NotNull
        private final String prefix;

        @NotNull
        private final String suffix;
        private final boolean removeLeadingZeros;
        private final int minLength;
        private final boolean isDigitsOnly;
        private final boolean isDigitsOnlyAndNoPadding;
        private final boolean ignoreCase;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final NumberHexFormat Default = new NumberHexFormat("", "", false, 1);

        @SinceKotlin(version = "2.0")
        public static /* synthetic */ void getMinLength$annotations() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public NumberHexFormat(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, boolean r7, int r8) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r1 = "prefix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r0 = r6
                java.lang.String r1 = "suffix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.prefix = r1
                r0 = r4
                r1 = r6
                r0.suffix = r1
                r0 = r4
                r1 = r7
                r0.removeLeadingZeros = r1
                r0 = r4
                r1 = r8
                r0.minLength = r1
                r0 = r4
                r1 = r4
                java.lang.String r1 = r1.prefix
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L39
                r1 = 1
                goto L3a
            L39:
                r1 = 0
            L3a:
                if (r1 == 0) goto L58
                r1 = r4
                java.lang.String r1 = r1.suffix
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L50
                r1 = 1
                goto L51
            L50:
                r1 = 0
            L51:
                if (r1 == 0) goto L58
                r1 = 1
                goto L59
            L58:
                r1 = 0
            L59:
                r0.isDigitsOnly = r1
                r0 = r4
                r1 = r4
                boolean r1 = r1.isDigitsOnly
                if (r1 == 0) goto L70
                r1 = r4
                int r1 = r1.minLength
                r2 = 1
                if (r1 != r2) goto L70
                r1 = 1
                goto L71
            L70:
                r1 = 0
            L71:
                r0.isDigitsOnlyAndNoPadding = r1
                r0 = r4
                r1 = r4
                java.lang.String r1 = r1.prefix
                boolean r1 = kotlin.text.HexFormatKt.access$isCaseSensitive(r1)
                if (r1 != 0) goto L89
                r1 = r4
                java.lang.String r1 = r1.suffix
                boolean r1 = kotlin.text.HexFormatKt.access$isCaseSensitive(r1)
                if (r1 == 0) goto L8d
            L89:
                r1 = 1
                goto L8e
            L8d:
                r1 = 0
            L8e:
                r0.ignoreCase = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexFormat.NumberHexFormat.<init>(java.lang.String, java.lang.String, boolean, int):void");
        }

        @NotNull
        public final String getPrefix() {
            return this.prefix;
        }

        @NotNull
        public final String getSuffix() {
            return this.suffix;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        public final int getMinLength() {
            return this.minLength;
        }

        public final boolean isDigitsOnly$kotlin_stdlib() {
            return this.isDigitsOnly;
        }

        public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
            return this.isDigitsOnlyAndNoPadding;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.ignoreCase;
        }

        @NotNull
        public String toString() {
            StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
            $this$toString_u24lambda_u240.append("NumberHexFormat(").append('\n');
            appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "    ").append('\n');
            $this$toString_u24lambda_u240.append(")");
            return $this$toString_u24lambda_u240.toString();
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent).append("prefix = \"").append(this.prefix).append("\",").append('\n');
            sb.append(indent).append("suffix = \"").append(this.suffix).append("\",").append('\n');
            sb.append(indent).append("removeLeadingZeros = ").append(this.removeLeadingZeros).append(',').append('\n');
            sb.append(indent).append("minLength = ").append(this.minLength);
            return sb;
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$NumberHexFormat$Builder.class */
        public static final class Builder {

            @NotNull
            private String prefix = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getPrefix();

            @NotNull
            private String suffix = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getSuffix();
            private boolean removeLeadingZeros = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            private int minLength = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getMinLength();

            @SinceKotlin(version = "2.0")
            public static /* synthetic */ void getMinLength$annotations() {
            }

            @NotNull
            public final String getPrefix() {
                return this.prefix;
            }

            public final void setPrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
                }
                this.prefix = value;
            }

            @NotNull
            public final String getSuffix() {
                return this.suffix;
            }

            public final void setSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
                }
                this.suffix = value;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.removeLeadingZeros = z;
            }

            public final int getMinLength() {
                return this.minLength;
            }

            public final void setMinLength(int value) {
                if (!(value > 0)) {
                    throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + value).toString());
                }
                this.minLength = value;
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros, this.minLength);
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$NumberHexFormat$Companion.class */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.Default;
            }
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$Builder.class */
    public static final class Builder {
        private boolean upperCase = HexFormat.Companion.getDefault().getUpperCase();

        @Nullable
        private BytesHexFormat.Builder _bytes;

        @Nullable
        private NumberHexFormat.Builder _number;

        @PublishedApi
        public Builder() {
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z) {
            this.upperCase = z;
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this._bytes == null) {
                this._bytes = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this._bytes;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this._number == null) {
                this._number = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this._number;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @InlineOnly
        private final void bytes(Function1<? super BytesHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(getBytes());
        }

        @InlineOnly
        private final void number(Function1<? super NumberHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(getNumber());
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        @kotlin.PublishedApi
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.text.HexFormat build() {
            /*
                r7 = this;
                kotlin.text.HexFormat r0 = new kotlin.text.HexFormat
                r1 = r0
                r2 = r7
                boolean r2 = r2.upperCase
                r3 = r7
                kotlin.text.HexFormat$BytesHexFormat$Builder r3 = r3._bytes
                r4 = r3
                if (r4 == 0) goto L17
                kotlin.text.HexFormat$BytesHexFormat r3 = r3.build$kotlin_stdlib()
                r4 = r3
                if (r4 != 0) goto L1e
            L17:
            L18:
                kotlin.text.HexFormat$BytesHexFormat$Companion r3 = kotlin.text.HexFormat.BytesHexFormat.Companion
                kotlin.text.HexFormat$BytesHexFormat r3 = r3.getDefault$kotlin_stdlib()
            L1e:
                r4 = r7
                kotlin.text.HexFormat$NumberHexFormat$Builder r4 = r4._number
                r5 = r4
                if (r5 == 0) goto L2d
                kotlin.text.HexFormat$NumberHexFormat r4 = r4.build$kotlin_stdlib()
                r5 = r4
                if (r5 != 0) goto L34
            L2d:
            L2e:
                kotlin.text.HexFormat$NumberHexFormat$Companion r4 = kotlin.text.HexFormat.NumberHexFormat.Companion
                kotlin.text.HexFormat$NumberHexFormat r4 = r4.getDefault$kotlin_stdlib()
            L34:
                r1.<init>(r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexFormat.Builder.build():kotlin.text.HexFormat");
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/HexFormat$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final HexFormat getDefault() {
            return HexFormat.Default;
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return HexFormat.UpperCase;
        }
    }
}
