package o;

import android.graphics.drawable.ColorStateListDrawable;
import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D0 {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable c(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }
}
