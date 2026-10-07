package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: o.v30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3010v30 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
