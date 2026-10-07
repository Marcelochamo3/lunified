package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.sr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2793sr0 extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        C3084vr0 c3084vr0 = C3084vr0.a;
        if (C3084vr0.s()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C3084vr0.C >= 30000) {
                C3084vr0.C = jCurrentTimeMillis;
                C3084vr0.F(true);
                return;
            }
            return;
        }
        try {
            ProxySelector proxySelector = C3084vr0.y;
            if (proxySelector != null) {
                proxySelector.connectFailed(uri, socketAddress, iOException);
            }
        } catch (Throwable th) {
            Jp0.k(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        Proxy proxyA;
        String host;
        String string;
        C3084vr0 c3084vr0 = C3084vr0.a;
        if (uri != null && (host = uri.getHost()) != null && (string = AbstractC1119bh0.E0(host).toString()) != null) {
            Locale locale = Locale.ROOT;
            String strI = AbstractC1701hf0.i(locale, "ROOT", string, locale, "toLowerCase(...)");
            if (AbstractC1474fG.b(strI, "localhost") || AbstractC1474fG.b(strI, "127.0.0.1") || AbstractC1474fG.b(strI, "::1") || AbstractC1474fG.b(strI, "[::1]")) {
                return AbstractC2506pt.A(Proxy.NO_PROXY);
            }
        }
        if (!C3084vr0.s()) {
            return AbstractC2506pt.A(Proxy.NO_PROXY);
        }
        if (C3084vr0.p == null && (C3084vr0.E.getValue() instanceof C1725hr0)) {
            C3084vr0.F(true);
        }
        C1041ar0 c1041ar0 = C3084vr0.p;
        if (c1041ar0 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 45000;
            synchronized (C3084vr0.B) {
                while (true) {
                    C3084vr0 c3084vr1 = C3084vr0.a;
                    if (!C3084vr0.s() || C3084vr0.p != null || !(C3084vr0.E.getValue() instanceof C1529fr0)) {
                        break;
                    }
                    long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
                    if (jCurrentTimeMillis2 <= 0) {
                        break;
                    }
                    try {
                        C3084vr0.B.wait(jCurrentTimeMillis2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        c1041ar0 = C3084vr0.p;
                        if (c1041ar0 != null) {
                            proxyA = c1041ar0.a();
                        } else {
                            proxyA = C3084vr0.G;
                        }
                        return AbstractC2506pt.A(proxyA);
                    }
                }
            }
            c1041ar0 = C3084vr0.p;
        }
        if (c1041ar0 != null) {
            proxyA = c1041ar0.a();
        } else {
            proxyA = C3084vr0.G;
        }
        return AbstractC2506pt.A(proxyA);
    }
}
