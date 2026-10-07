package o;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackErrorEvent;

/* JADX INFO: renamed from: o.oP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2360oP {
    public static /* bridge */ /* synthetic */ MediaMetricsManager a(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder d() {
        return new PlaybackErrorEvent.Builder();
    }
}
