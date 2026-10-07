package o;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends AbstractC1923jt0 {
    public final X509TrustManager e;
    public final X509TrustManagerExtensions f;

    public A2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        this.e = x509TrustManager;
        this.f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A2) && ((A2) obj).e == this.e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.e);
    }

    @Override // o.AbstractC1923jt0
    public final List k(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC1474fG.j(list, "chain");
        AbstractC1474fG.j(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC1474fG.i(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
