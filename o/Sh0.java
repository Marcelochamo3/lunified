package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class Sh0 {
    public static final Sh0 a = new Sh0();

    public final Uh0 a(Looper looper, Handler.Callback callback) {
        return new Uh0(new Handler(looper, callback));
    }
}
