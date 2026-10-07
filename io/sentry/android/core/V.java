package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.InterfaceC0052i1;

/* JADX INFO: loaded from: classes.dex */
public final class V extends ConnectivityManager.NetworkCallback {
    public final io.sentry.K a;
    public final G b;
    public Network c;
    public NetworkCapabilities d;
    public long e;
    public final InterfaceC0052i1 f;

    public V(G g, InterfaceC0052i1 interfaceC0052i1) {
        io.sentry.E e = io.sentry.E.a;
        this.c = null;
        this.d = null;
        this.e = 0L;
        this.a = e;
        io.sentry.config.a.C(g, "BuildInfoProvider is required");
        this.b = g;
        io.sentry.config.a.C(interfaceC0052i1, "SentryDateProvider is required");
        this.f = interfaceC0052i1;
    }

    public static C0041f a(String str) {
        C0041f c0041f = new C0041f();
        c0041f.n = "system";
        c0041f.p = "network.event";
        c0041f.b(str, "action");
        c0041f.q = EnumC0094u1.INFO;
        return c0041f;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network.equals(this.c)) {
            return;
        }
        this.a.f(a("NETWORK_AVAILABLE"));
        this.c = network;
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        long j;
        boolean z;
        boolean z2;
        U u;
        if (network.equals(this.c)) {
            long jD = this.f.y().d();
            NetworkCapabilities networkCapabilities2 = this.d;
            long j2 = this.e;
            G g = this.b;
            if (networkCapabilities2 == null) {
                u = new U(networkCapabilities, g, jD);
                j = jD;
            } else {
                io.sentry.config.a.C(g, "BuildInfoProvider is required");
                int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
                int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
                int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
                if (signalStrength <= -100) {
                    signalStrength = 0;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(4);
                if (networkCapabilities2.hasTransport(3)) {
                    str = "ethernet";
                } else if (networkCapabilities2.hasTransport(1)) {
                    str = "wifi";
                } else {
                    str = networkCapabilities2.hasTransport(0) ? "cellular" : null;
                }
                if (str == null) {
                    str = "";
                }
                U u2 = new U(networkCapabilities, g, jD);
                int iAbs = Math.abs(signalStrength - u2.c);
                int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - u2.a);
                int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - u2.b);
                boolean z3 = ((double) Math.abs(j2 - u2.d)) / 1000000.0d < 5000.0d;
                boolean z4 = z3 || iAbs <= 5;
                if (z3) {
                    j = jD;
                } else {
                    j = jD;
                    if (iAbs2 > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
                        z = false;
                    }
                    if (!z3 || iAbs3 <= Math.max(1000.0d, ((double) Math.abs(linkUpstreamBandwidthKbps)) * 0.1d)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (zHasTransport != u2.e && str.equals(u2.f) && z4 && z && z2) {
                        u = null;
                    } else {
                        u = u2;
                    }
                }
                z = true;
                if (z3) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (zHasTransport != u2.e) {
                    u = u2;
                } else {
                    u = u2;
                }
            }
            if (u == null) {
                return;
            }
            this.d = networkCapabilities;
            this.e = j;
            C0041f c0041fA = a("NETWORK_CAPABILITIES_CHANGED");
            c0041fA.b(Integer.valueOf(u.a), "download_bandwidth");
            c0041fA.b(Integer.valueOf(u.b), "upload_bandwidth");
            c0041fA.b(Boolean.valueOf(u.e), "vpn_active");
            c0041fA.b(u.f, "network_type");
            int i = u.c;
            if (i != 0) {
                c0041fA.b(Integer.valueOf(i), "signal_strength");
            }
            C0104y c0104y = new C0104y();
            c0104y.c(u, "android:networkCapabilities");
            this.a.c(c0041fA, c0104y);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.c)) {
            this.a.f(a("NETWORK_LOST"));
            this.c = null;
            this.d = null;
        }
    }
}
