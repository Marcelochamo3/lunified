package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public enum L1 {
    LOW(0.8f, 50000),
    MEDIUM(1.0f, 75000),
    HIGH(1.0f, 100000);

    public final int bitRate;
    public final float sizeScale;

    L1(float f, int i) {
        this.sizeScale = f;
        this.bitRate = i;
    }
}
