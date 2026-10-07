package o;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: renamed from: o.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0872Wr {
    public static C3436zZ a(Context context, C1042as c1042as, boolean z) {
        MediaMetricsManager mediaMetricsManagerA = AbstractC2360oP.a(context.getSystemService("media_metrics"));
        C2747sP c2747sP = mediaMetricsManagerA == null ? null : new C2747sP(context, mediaMetricsManagerA.createPlaybackSession());
        if (c2747sP == null) {
            AP.z();
            return new C3436zZ(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            c1042as.getClass();
            C0942Zj c0942Zj = c1042as.r;
            c0942Zj.getClass();
            c0942Zj.q.a(c2747sP);
        }
        return new C3436zZ(c2747sP.c.getSessionId());
    }
}
