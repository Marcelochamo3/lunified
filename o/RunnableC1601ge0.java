package o;

import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: renamed from: o.ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1601ge0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1699he0 m;

    public /* synthetic */ RunnableC1601ge0(C1699he0 c1699he0, int i) {
        this.l = i;
        this.m = c1699he0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C1699he0 c1699he0 = this.m;
                c1699he0.d = c1699he0.b();
                try {
                    C1699he0 c1699he1 = this.m;
                    c1699he1.a.registerReceiver(c1699he1.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.m.e = true;
                } catch (SecurityException unused) {
                    Log.isLoggable("ConnectivityMonitor", 5);
                    this.m.e = false;
                    return;
                }
                break;
            case 1:
                if (this.m.e) {
                    this.m.e = false;
                    C1699he0 c1699he2 = this.m;
                    c1699he2.a.unregisterReceiver(c1699he2.f);
                    break;
                }
                break;
            default:
                boolean z = this.m.d;
                C1699he0 c1699he3 = this.m;
                c1699he3.d = c1699he3.b();
                if (z != this.m.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z2 = this.m.d;
                    }
                    C1699he0 c1699he4 = this.m;
                    Kr0.f().post(new RunnableC0972a6(3, c1699he4, c1699he4.d));
                }
                break;
        }
    }
}
