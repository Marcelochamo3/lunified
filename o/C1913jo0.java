package o;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.jo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1913jo0 {
    public final X509TrustManager a;
    public final SSLSocketFactory b;

    public C1913jo0(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
        this.b = sSLSocketFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1913jo0)) {
            return false;
        }
        C1913jo0 c1913jo0 = (C1913jo0) obj;
        return AbstractC1474fG.b(this.a, c1913jo0.a) && AbstractC1474fG.b(this.b, c1913jo0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Mode(trustManager=" + this.a + ", socketFactory=" + this.b + ")";
    }
}
