package com.bumptech.glide.load;

import o.OE;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    public final boolean l;

    ImageHeaderParser$ImageType(boolean z) {
        this.l = z;
    }

    public boolean hasAlpha() {
        return this.l;
    }

    public boolean isWebp() {
        int i = OE.a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
