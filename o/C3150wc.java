package o;

import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: o.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3150wc {
    public static final C3150wc c = new C3150wc(AbstractC0911Ye.B0(new ArrayList()), null);
    public final Set a;
    public final AbstractC1923jt0 b;

    public C3150wc(Set set, AbstractC1923jt0 abstractC1923jt0) {
        AbstractC1474fG.j(set, "pins");
        this.a = set;
        this.b = abstractC1923jt0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    public final void a(String str, InterfaceC0360Cy interfaceC0360Cy) throws NoSuchAlgorithmException, SSLPeerUnverifiedException {
        AbstractC1474fG.j(str, "hostname");
        C1233cq c1233cq = C1233cq.l;
        List<C2956uc> arrayList = c1233cq;
        for (Object obj : this.a) {
            C2956uc c2956uc = (C2956uc) obj;
            c2956uc.getClass();
            String str2 = c2956uc.a;
            boolean zB = false;
            if (AbstractC1899jh0.U(str2, "**.", false)) {
                int length = str2.length() - 3;
                int length2 = str.length() - length;
                if (AbstractC1899jh0.P(str.length() - length, 3, length, str, c2956uc.a, false) && (length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    zB = true;
                }
            } else if (AbstractC1899jh0.U(str2, "*.", false)) {
                int length3 = str2.length() - 1;
                int length4 = str.length() - length3;
                if (AbstractC1899jh0.P(str.length() - length3, 1, length3, str, c2956uc.a, false) && AbstractC1119bh0.g0(str, '.', length4 - 1, 4) == -1) {
                    zB = true;
                }
            } else {
                zB = AbstractC1474fG.b(str, str2);
            }
            if (zB) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                if ((arrayList instanceof InterfaceC1770iI) && !(arrayList instanceof InterfaceC1964kI)) {
                    Jp0.N(arrayList, "kotlin.collections.MutableList");
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC0360Cy.c();
        for (X509Certificate x509Certificate : list) {
            C2468pa c2468paZ = null;
            C2468pa c2468paC = null;
            for (C2956uc c2956uc2 : arrayList) {
                String str3 = c2956uc2.b;
                boolean zB2 = AbstractC1474fG.b(str3, "sha256");
                C2468pa c2468pa = c2956uc2.c;
                if (zB2) {
                    if (c2468paZ == null) {
                        c2468paZ = Ou0.z(x509Certificate);
                    }
                    if (AbstractC1474fG.b(c2468pa, c2468paZ)) {
                        return;
                    }
                } else {
                    if (!AbstractC1474fG.b(str3, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + c2956uc2.b);
                    }
                    if (c2468paC == null) {
                        AbstractC1474fG.j(x509Certificate, "<this>");
                        C2468pa c2468pa2 = C2468pa.f972o;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        AbstractC1474fG.i(encoded, "publicKey.encoded");
                        c2468paC = C2691rp.y(encoded).c("SHA-1");
                    }
                    if (AbstractC1474fG.b(c2468pa, c2468paC)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Ou0.w(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (C2956uc c2956uc3 : arrayList) {
            sb.append("\n    ");
            sb.append(c2956uc3);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3150wc) {
            C3150wc c3150wc = (C3150wc) obj;
            if (AbstractC1474fG.b(c3150wc.a, this.a) && AbstractC1474fG.b(c3150wc.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        AbstractC1923jt0 abstractC1923jt0 = this.b;
        return iHashCode + (abstractC1923jt0 != null ? abstractC1923jt0.hashCode() : 0);
    }
}
