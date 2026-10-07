package o;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: o.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1221ck {
    public static void a(AudioTrack audioTrack, C3436zZ c3436zZ) {
        C3339yZ c3339yZ = c3436zZ.a;
        c3339yZ.getClass();
        LogSessionId logSessionId = c3339yZ.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
