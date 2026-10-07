package com.github.weisj.jsvg.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/DataUri.class */
final class DataUri {
    private static final String CHARSET_OPTION_NAME = "charset";
    private static final String FILENAME_OPTION_NAME = "filename";
    private static final String CONTENT_DISPOSITION_OPTION_NAME = "content-disposition";

    @NotNull
    private final String mime;

    @Nullable
    private final Charset charset;

    @Nullable
    private final String filename;

    @Nullable
    private final String contentDisposition;
    private final byte[] data;
    private static final Pattern PLUS = Pattern.compile("+", 16);

    public DataUri(String mime, Charset charset, byte[] data) {
        this(mime, charset, null, null, data);
    }

    public DataUri(@NotNull String mime, @Nullable Charset charset, @Nullable String filename, @Nullable String contentDisposition, byte[] data) {
        this.mime = mime;
        this.charset = charset;
        this.filename = filename;
        this.contentDisposition = contentDisposition;
        this.data = data;
    }

    @NotNull
    public String mime() {
        return this.mime;
    }

    public byte[] data() {
        return this.data;
    }

    @Nullable
    public Charset charset() {
        return this.charset;
    }

    @Nullable
    public String contentDisposition() {
        return this.contentDisposition;
    }

    @Nullable
    public String filename() {
        return this.filename;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataUri)) {
            return false;
        }
        DataUri dataUri = (DataUri) o;
        return this.mime.equals(dataUri.mime) && Objects.equals(this.charset, dataUri.charset) && Objects.equals(this.filename, dataUri.filename) && Objects.equals(this.contentDisposition, dataUri.contentDisposition) && Arrays.equals(this.data, dataUri.data);
    }

    public int hashCode() {
        int result = Objects.hash(this.mime, this.charset, this.filename, this.contentDisposition);
        return (31 * result) + Arrays.hashCode(this.data);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/DataUri$MalformedDataUriException.class */
    static final class MalformedDataUriException extends IOException {
        MalformedDataUriException(@NotNull String reason) {
            super(reason);
        }

        MalformedDataUriException(@NotNull Exception reason) {
            super(reason);
        }
    }

    public static DataUri parse(@NotNull String uri, Charset charset) throws MalformedDataUriException {
        Charset charsetForName;
        String str;
        String str2;
        byte[] bytes;
        String name;
        if (!uri.toLowerCase().startsWith("data:")) {
            throw new MalformedDataUriException("URI must start with a case-insensitive `data:'");
        }
        if (-1 == uri.indexOf(44)) {
            throw new MalformedDataUriException("URI must contain a `,'");
        }
        Collection<String> supportedContentEncodings = Collections.singletonList("base64");
        String mimeType = "text/plain";
        String contentEncoding = "";
        boolean contentEncodingAlreadySet = false;
        Map<String, String> supportedValues = new HashMap<>();
        supportedValues.put(CHARSET_OPTION_NAME, "");
        supportedValues.put(FILENAME_OPTION_NAME, "");
        supportedValues.put(CONTENT_DISPOSITION_OPTION_NAME, "");
        Map<String, Boolean> supportedValueSetBits = new HashMap<>();
        for (String key : supportedValues.keySet()) {
            supportedValueSetBits.put(key, false);
        }
        int comma = uri.indexOf(44);
        String temp = uri.substring("data:".length(), comma);
        String[] headers = temp.split(";");
        for (int header = 0; header < headers.length; header++) {
            String s = headers[header].toLowerCase();
            int eq = s.indexOf(61);
            String value = "";
            if (-1 == eq) {
                String name2 = percentDecode(s, charset);
                name = name2.trim();
            } else {
                String name3 = s.substring(0, eq);
                name = percentDecode(name3, charset).trim();
                String value2 = s.substring(eq + 1);
                value = percentDecode(value2, charset).trim();
            }
            if (0 == header && -1 == eq && !name.isEmpty()) {
                mimeType = name;
            } else if (-1 == eq) {
                if (supportedContentEncodings.contains(name.toLowerCase()) && !contentEncodingAlreadySet) {
                    contentEncoding = name;
                    contentEncodingAlreadySet = true;
                }
            } else {
                String nameCaseInsensitive = name.toLowerCase();
                if (!value.isEmpty() && supportedValues.containsKey(nameCaseInsensitive)) {
                    boolean valueSet = supportedValueSetBits.get(nameCaseInsensitive).booleanValue();
                    if (!valueSet) {
                        supportedValues.put(nameCaseInsensitive, value);
                        supportedValueSetBits.put(nameCaseInsensitive, true);
                    }
                }
            }
        }
        String data = percentDecode(uri.substring(comma + 1), charset);
        String finalMimeType = mimeType;
        if (supportedValues.get(CHARSET_OPTION_NAME).isEmpty()) {
            charsetForName = null;
        } else {
            charsetForName = Charset.forName(supportedValues.get(CHARSET_OPTION_NAME));
        }
        Charset finalCharset = charsetForName;
        if (supportedValues.get(FILENAME_OPTION_NAME).isEmpty()) {
            str = null;
        } else {
            str = supportedValues.get(FILENAME_OPTION_NAME);
        }
        String finalFilename = str;
        if (supportedValues.get(CONTENT_DISPOSITION_OPTION_NAME).isEmpty()) {
            str2 = null;
        } else {
            str2 = supportedValues.get(CONTENT_DISPOSITION_OPTION_NAME);
        }
        String finalContentDisposition = str2;
        try {
            if ("base64".equalsIgnoreCase(contentEncoding)) {
                bytes = Base64.getMimeDecoder().decode(data);
            } else {
                bytes = data.getBytes(charset);
            }
            byte[] finalData = bytes;
            return new DataUri(finalMimeType, finalCharset, finalFilename, finalContentDisposition, finalData);
        } catch (RuntimeException e) {
            throw new MalformedDataUriException(e);
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("data:").append(mime()).append(";");
        if (this.charset != null) {
            s.append("charset=").append(this.charset.name()).append(";");
        }
        if (this.contentDisposition != null) {
            s.append("content-disposition=").append(this.contentDisposition).append(";");
        }
        if (this.filename != null) {
            s.append("filename=").append(this.filename).append(";");
        }
        s.append("base64,").append(new String(Base64.getEncoder().encode(data()), StandardCharsets.UTF_8));
        return s.toString();
    }

    private static String percentDecode(String s, Charset cs) {
        try {
            return URLDecoder.decode(PLUS.matcher(s).replaceAll("%2B"), cs.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Charset `" + cs.name() + "' not supported", e);
        }
    }
}
