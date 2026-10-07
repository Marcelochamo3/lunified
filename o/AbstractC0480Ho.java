package o;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* JADX INFO: renamed from: o.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480Ho {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
