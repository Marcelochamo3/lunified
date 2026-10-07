package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.skidush.clonex.utils.RuntimeSecurityGuard;

/* JADX INFO: loaded from: classes.dex */
public final class X80 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC1474fG.j(network, "network");
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        C0856Wb.b = 0L;
        RuntimeSecurityGuard.d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC1474fG.j(network, "network");
        AbstractC1474fG.j(networkCapabilities, "capabilities");
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        C0856Wb.b = 0L;
        RuntimeSecurityGuard.d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC1474fG.j(network, "network");
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        C0856Wb.b = 0L;
        RuntimeSecurityGuard.d();
    }
}
