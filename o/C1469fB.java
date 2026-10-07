package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1469fB {
    public final Xj0 a;
    public final C0676Pd b;
    public final List c;
    public final Rh0 d;

    public C1469fB(Xj0 xj0, C0676Pd c0676Pd, List list, InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC1474fG.j(xj0, "tlsVersion");
        AbstractC1474fG.j(c0676Pd, "cipherSuite");
        AbstractC1474fG.j(list, "localCertificates");
        this.a = xj0;
        this.b = c0676Pd;
        this.c = list;
        this.d = new Rh0(new C3279xs(interfaceC0360Cy, 1));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1469fB) {
            C1469fB c1469fB = (C1469fB) obj;
            if (c1469fB.a == this.a && AbstractC1474fG.b(c1469fB.b, this.b) && AbstractC1474fG.b(c1469fB.a(), a()) && AbstractC1474fG.b(c1469fB.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1474fG.i(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1474fG.i(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
