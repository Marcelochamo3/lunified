package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: o.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1994kg {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
