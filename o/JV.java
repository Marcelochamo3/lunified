package o;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class JV implements HostnameVerifier {
    public static final JV a = new JV();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        C1233cq c1233cq = C1233cq.l;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c1233cq;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC1474fG.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c1233cq;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean zB;
        int length;
        AbstractC1474fG.j(str, "host");
        byte[] bArr = Mr0.a;
        if (Mr0.f.d(str)) {
            String strG = AbstractC1376eG.G(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (AbstractC1474fG.b(strG, AbstractC1376eG.G((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (str.length() == ((int) Jp0.K(str))) {
                Locale locale = Locale.US;
                str = AbstractC1701hf0.i(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!listA2.isEmpty()) {
                for (String strI : listA2) {
                    if (str.length() == 0 || AbstractC1899jh0.U(str, ".", false) || AbstractC1899jh0.L(str, "..", false) || strI == null || strI.length() == 0 || AbstractC1899jh0.U(strI, ".", false) || AbstractC1899jh0.L(strI, "..", false)) {
                        zB = false;
                    } else {
                        String strConcat = !AbstractC1899jh0.L(str, ".", false) ? str.concat(".") : str;
                        if (!AbstractC1899jh0.L(strI, ".", false)) {
                            strI = strI.concat(".");
                        }
                        if (strI.length() == ((int) Jp0.K(strI))) {
                            Locale locale2 = Locale.US;
                            strI = AbstractC1701hf0.i(locale2, "US", strI, locale2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!AbstractC1119bh0.W(strI, "*", false)) {
                            zB = AbstractC1474fG.b(strConcat, strI);
                        } else if (!AbstractC1899jh0.U(strI, "*.", false) || AbstractC1119bh0.d0(strI, '*', 1, false, 4) != -1 || strConcat.length() < strI.length() || AbstractC1474fG.b("*.", strI)) {
                            zB = false;
                        } else {
                            String strSubstring = strI.substring(1);
                            AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (AbstractC1899jh0.L(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC1119bh0.g0(strConcat, '.', length - 1, 4) == -1)) {
                                zB = true;
                            } else {
                                zB = false;
                            }
                        }
                    }
                    if (zB) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC1474fG.j(str, "host");
        AbstractC1474fG.j(sSLSession, "session");
        if (!(str.length() == ((int) Jp0.K(str)))) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            AbstractC1474fG.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return b(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
