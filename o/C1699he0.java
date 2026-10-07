package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.he0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1699he0 implements InterfaceC1405ee0 {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;
    public final InterfaceC2964ug b;
    public final InterfaceC2054lA c;
    public volatile boolean d;
    public volatile boolean e;
    public final C1066b4 f = new C1066b4(3, this);

    public C1699he0(Context context, C3257xh c3257xh, C1308de0 c1308de0) {
        this.a = context.getApplicationContext();
        this.c = c3257xh;
        this.b = c1308de0;
    }

    @Override // o.InterfaceC1405ee0
    public final void a() {
        g.execute(new RunnableC1601ge0(this, 1));
    }

    public final boolean b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // o.InterfaceC1405ee0
    public final boolean d() {
        g.execute(new RunnableC1601ge0(this, 0));
        return true;
    }
}
