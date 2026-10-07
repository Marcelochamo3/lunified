package o;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class FO {
    public static void a(C3134wO c3134wO, C3436zZ c3436zZ) {
        C3339yZ c3339yZ = c3436zZ.a;
        c3339yZ.getClass();
        LogSessionId logSessionId = c3339yZ.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c3134wO.b.setString("log-session-id", logSessionId.getStringId());
    }
}
