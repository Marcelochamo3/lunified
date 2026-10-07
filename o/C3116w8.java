package o;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: o.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3116w8 extends AbstractC1923jt0 {
    public final Tm0 e;

    public C3116w8(Tm0 tm0) {
        AbstractC1474fG.j(tm0, "trustRootIndex");
        this.e = tm0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3116w8) && AbstractC1474fG.b(((C3116w8) obj).e, this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // o.AbstractC1923jt0
    public final List k(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC1474fG.j(list, "chain");
        AbstractC1474fG.j(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC1474fG.i(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.e.a(x509Certificate);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !AbstractC1474fG.b(x509Certificate, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (AbstractC1474fG.b(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC1474fG.i(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                    }
                    Object next = it.next();
                    AbstractC1474fG.h(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC1474fG.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
