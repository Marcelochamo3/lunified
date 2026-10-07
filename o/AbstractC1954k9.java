package o;

import android.content.ClipData;
import android.media.MediaDrm;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.view.ContentInfo;

/* JADX INFO: renamed from: o.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1954k9 {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder h(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder i() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }
}
