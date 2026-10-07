package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class G2 implements Tm0 {
    public final X509TrustManager a;
    public final Method b;

    public G2(X509TrustManager x509TrustManager, Method method) {
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // o.Tm0
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.b.invoke(this.a, x509Certificate);
            AbstractC1474fG.h(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2)) {
            return false;
        }
        G2 g2 = (G2) obj;
        return AbstractC1474fG.b(this.a, g2.a) && AbstractC1474fG.b(this.b, g2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
