package o;

import android.net.ConnectivityManager;
import android.net.Network;
import io.sentry.C0032c;

/* JADX INFO: renamed from: o.fe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1503fe0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0032c a;

    public C1503fe0(C0032c c0032c) {
        this.a = c0032c;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Kr0.f().post(new RunnableC0972a6(2, this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Kr0.f().post(new RunnableC0972a6(2, this, false));
    }
}
