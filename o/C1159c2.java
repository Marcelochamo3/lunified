package o;

import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1159c2 {
    public final InterfaceC2784sn a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final C3150wc e;
    public final InterfaceC2339o7 f;
    public final Proxy g;
    public final ProxySelector h;
    public final C2446pE i;
    public final List j;
    public final List k;

    public C1159c2(String str, int i, InterfaceC2784sn interfaceC2784sn, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3150wc c3150wc, InterfaceC2339o7 interfaceC2339o7, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        AbstractC1474fG.j(str, "uriHost");
        AbstractC1474fG.j(interfaceC2784sn, "dns");
        AbstractC1474fG.j(socketFactory, "socketFactory");
        AbstractC1474fG.j(interfaceC2339o7, "proxyAuthenticator");
        AbstractC1474fG.j(list, "protocols");
        AbstractC1474fG.j(list2, "connectionSpecs");
        AbstractC1474fG.j(proxySelector, "proxySelector");
        this.a = interfaceC2784sn;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c3150wc;
        this.f = interfaceC2339o7;
        this.g = proxy;
        this.h = proxySelector;
        C2349oE c2349oE = new C2349oE();
        c2349oE.j(sSLSocketFactory != null ? "https" : "http");
        String strG = AbstractC1376eG.G(C0622Nb.A(str, 0, 0, false, 7));
        if (strG == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c2349oE.g = strG;
        c2349oE.h(i);
        this.i = c2349oE.b();
        this.j = Mr0.x(list);
        this.k = Mr0.x(list2);
    }

    public final boolean a(C1159c2 c1159c2) {
        AbstractC1474fG.j(c1159c2, "that");
        return AbstractC1474fG.b(this.a, c1159c2.a) && AbstractC1474fG.b(this.f, c1159c2.f) && AbstractC1474fG.b(this.j, c1159c2.j) && AbstractC1474fG.b(this.k, c1159c2.k) && AbstractC1474fG.b(this.h, c1159c2.h) && AbstractC1474fG.b(this.g, c1159c2.g) && AbstractC1474fG.b(this.c, c1159c2.c) && AbstractC1474fG.b(this.d, c1159c2.d) && AbstractC1474fG.b(this.e, c1159c2.e) && this.i.e == c1159c2.i.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1159c2) {
            C1159c2 c1159c2 = (C1159c2) obj;
            if (AbstractC1474fG.b(this.i, c1159c2.i) && a(c1159c2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + AbstractC1674hK.j(this.k, AbstractC1674hK.j(this.j, (this.f.hashCode() + ((this.a.hashCode() + AbstractC1674hK.i(527, this.i.i, 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        C2446pE c2446pE = this.i;
        sb.append(c2446pE.d);
        sb.append(':');
        sb.append(c2446pE.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
