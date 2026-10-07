package o;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class CO {
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
