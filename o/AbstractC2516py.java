package o;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: o.py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2516py {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, C3436zZ c3436zZ) {
        C3339yZ c3339yZ = c3436zZ.a;
        c3339yZ.getClass();
        LogSessionId logSessionId = c3339yZ.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        AbstractC1954k9.f(playbackComponent).setLogSessionId(logSessionId);
    }
}
