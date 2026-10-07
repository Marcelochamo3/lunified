package o;

import android.os.Build;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2376oc0 {
    public static final Rh0 a = new Rh0(C1693hb0.p);
    public static final Rh0 b = new Rh0(C1693hb0.q);
    public static final Rh0 c = new Rh0(C1693hb0.f814o);

    public static final C2279nc0 a(boolean z) throws NoSuchAlgorithmException, KeyManagementException {
        int i = Build.VERSION.SDK_INT;
        Rh0 rh0 = a;
        X509TrustManager c2085lc0 = i >= 24 ? new C2085lc0((X509TrustManager) rh0.getValue(), z) : new C2182mc0((X509TrustManager) rh0.getValue(), z);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new X509TrustManager[]{c2085lc0}, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        AbstractC1474fG.g(socketFactory);
        return new C2279nc0(socketFactory, c2085lc0);
    }

    public static void b(NV nv, boolean z) {
        C2279nc0 c2279nc0 = z ? (C2279nc0) c.getValue() : (C2279nc0) b.getValue();
        nv.j(c2279nc0.b, c2279nc0.a);
        nv.d.add(new C2480pg(16));
    }
}
