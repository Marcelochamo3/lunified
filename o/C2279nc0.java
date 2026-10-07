package o;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.nc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2279nc0 {
    public final X509TrustManager a;
    public final SSLSocketFactory b;

    public C2279nc0(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
        this.b = sSLSocketFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2279nc0)) {
            return false;
        }
        C2279nc0 c2279nc0 = (C2279nc0) obj;
        return AbstractC1474fG.b(this.a, c2279nc0.a) && AbstractC1474fG.b(this.b, c2279nc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TlsMode(trustManager=" + this.a + ", socketFactory=" + this.b + ")";
    }
}
