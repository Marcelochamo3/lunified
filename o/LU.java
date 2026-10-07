package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class LU extends BroadcastReceiver {
    public final InterfaceC0360Cy a;
    public final InterfaceC0360Cy b;

    public LU(NU nu, NU nu2) {
        this.a = nu;
        this.b = nu2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        NetworkCapabilities networkCapabilities;
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(intent, "intent");
        Object systemService = context.getSystemService("connectivity");
        AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT < 24 ? (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() : (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || !(networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
            this.b.c();
        } else {
            this.a.c();
        }
    }
}
