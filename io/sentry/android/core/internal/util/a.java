package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import io.sentry.G;
import io.sentry.e2;
import o.AbstractC1474fG;
import o.C1583gR;
import o.MU;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public a(C1583gR c1583gR) {
        this.a = 1;
        this.c = c1583gR;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                ((e2) this.c).a();
                ((G) this.b).a();
                break;
            default:
                AbstractC1474fG.j(network, "network");
                ((Handler) this.b).post(new MU((C1583gR) this.c, 0));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        switch (this.a) {
            case 0:
                ((e2) this.c).a();
                ((G) this.b).a();
                break;
            default:
                super.onLosing(network, i);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                ((e2) this.c).a();
                ((G) this.b).a();
                break;
            default:
                AbstractC1474fG.j(network, "network");
                ((Handler) this.b).post(new MU((C1583gR) this.c, 1));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 0:
                ((e2) this.c).a();
                ((G) this.b).a();
                break;
            default:
                super.onUnavailable();
                break;
        }
    }

    public a(e2 e2Var, G g) {
        this.a = 0;
        this.c = e2Var;
        this.b = g;
    }
}
