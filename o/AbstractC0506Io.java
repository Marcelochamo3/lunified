package o;

import android.media.MediaDrm;

/* JADX INFO: renamed from: o.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506Io {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return Lr0.t(Lr0.u(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
