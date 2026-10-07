package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public U(NetworkCapabilities networkCapabilities, G g, long j) {
        String str;
        io.sentry.config.a.C(networkCapabilities, "NetworkCapabilities is required");
        io.sentry.config.a.C(g, "BuildInfoProvider is required");
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength <= -100 ? 0 : signalStrength;
        this.e = networkCapabilities.hasTransport(4);
        if (networkCapabilities.hasTransport(3)) {
            str = "ethernet";
        } else if (networkCapabilities.hasTransport(1)) {
            str = "wifi";
        } else {
            str = networkCapabilities.hasTransport(0) ? "cellular" : null;
        }
        this.f = str == null ? "" : str;
        this.d = j;
    }
}
