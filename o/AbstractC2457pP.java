package o;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: o.pP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2457pP {
    public static /* synthetic */ NetworkEvent.Builder c() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder e() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder j(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
