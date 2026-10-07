package o;

import android.os.SystemClock;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2182mc0 implements X509TrustManager {
    public final X509TrustManager a;
    public final boolean b;
    public final Rh0 c;

    public C2182mc0(X509TrustManager x509TrustManager, boolean z) {
        AbstractC1474fG.j(x509TrustManager, "delegate");
        this.a = x509TrustManager;
        this.b = z;
        this.c = new Rh0(new io.sentry.android.replay.f(21, this));
    }

    public final void a(X509Certificate[] x509CertificateArr, InterfaceC0360Cy interfaceC0360Cy) throws CertificateException {
        long jLongValue;
        AbstractC1474fG.j(x509CertificateArr, "chain");
        try {
            interfaceC0360Cy.c();
        } catch (CertificateException e) {
            if (x509CertificateArr.length != 0) {
                Date date = new Date();
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    try {
                        x509Certificate.checkValidity(date);
                    } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                        Object obj = AbstractC1889jc0.a;
                        Long lB = AbstractC1889jc0.b(SystemClock.elapsedRealtime(), false);
                        if (lB != null) {
                            jLongValue = lB.longValue();
                        } else {
                            if (x509CertificateArr.length == 0) {
                                throw new NoSuchElementException();
                            }
                            long time = x509CertificateArr[0].getNotBefore().getTime();
                            YF it = new ZF(1, x509CertificateArr.length - 1, 1).iterator();
                            while (it.n) {
                                long time2 = x509CertificateArr[it.a()].getNotBefore().getTime();
                                if (time < time2) {
                                    time = time2;
                                }
                            }
                            if (x509CertificateArr.length == 0) {
                                throw new NoSuchElementException();
                            }
                            long time3 = x509CertificateArr[0].getNotAfter().getTime();
                            YF it2 = new ZF(1, x509CertificateArr.length - 1, 1).iterator();
                            while (it2.n) {
                                long time4 = x509CertificateArr[it2.a()].getNotAfter().getTime();
                                if (time3 > time4) {
                                    time3 = time4;
                                }
                            }
                            Long lValueOf = this.b ? time >= time3 ? null : Long.valueOf(((time3 - time) / 2) + time) : null;
                            if (lValueOf == null) {
                                throw e;
                            }
                            jLongValue = lValueOf.longValue();
                        }
                        try {
                            b(x509CertificateArr, jLongValue);
                            return;
                        } catch (Exception e2) {
                            AbstractC3409z9.a(e, e2);
                            throw e;
                        }
                    }
                }
            }
            throw e;
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, long j) throws CertificateException, CertPathValidatorException, InvalidAlgorithmParameterException {
        Rh0 rh0 = this.c;
        if (((Set) rh0.getValue()).isEmpty()) {
            throw new CertificateException("Sin anclas TLS del sistema");
        }
        ArrayList arrayListB0 = X5.b0(x509CertificateArr);
        X509Certificate x509Certificate = (X509Certificate) AbstractC0911Ye.i0(arrayListB0);
        if (AbstractC1474fG.b(x509Certificate.getSubjectX500Principal(), x509Certificate.getIssuerX500Principal())) {
            Set set = (Set) rh0.getValue();
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    X509Certificate trustedCert = ((TrustAnchor) it.next()).getTrustedCert();
                    if (trustedCert != null && AbstractC1474fG.b(trustedCert.getSubjectX500Principal(), x509Certificate.getSubjectX500Principal()) && AbstractC1474fG.b(trustedCert.getPublicKey(), x509Certificate.getPublicKey())) {
                        arrayListB0.remove(AbstractC0937Ze.J(arrayListB0));
                        break;
                    }
                }
            }
        }
        if (arrayListB0.isEmpty()) {
            throw new CertificateException("Cadena TLS vacía");
        }
        CertPath certPathGenerateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(arrayListB0);
        PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) rh0.getValue());
        pKIXParameters.setRevocationEnabled(false);
        pKIXParameters.setDate(new Date(j));
        CertPathValidator.getInstance("PKIX").validate(certPathGenerateCertPath, pKIXParameters);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        a(x509CertificateArr, new C3053vc(this, x509CertificateArr, str, 6));
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
        AbstractC1474fG.i(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }
}
