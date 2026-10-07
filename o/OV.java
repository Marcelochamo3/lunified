package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class OV implements Cloneable, InterfaceC0595Ma {
    public static final List P = Mr0.l(O30.HTTP_2, O30.HTTP_1_1);
    public static final List Q = Mr0.l(C2770sg.e, C2770sg.f);
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public final X509TrustManager C;
    public final List D;
    public final List E;
    public final HostnameVerifier F;
    public final C3150wc G;
    public final AbstractC1923jt0 H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final L80 O;
    public final C1813in l;
    public final C2133m1 m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f433o;
    public final C2278nc p;
    public final boolean q;
    public final InterfaceC2339o7 r;
    public final boolean s;
    public final boolean t;
    public final InterfaceC0654Oh u;
    public final C0362Da v;
    public final InterfaceC2784sn w;
    public final Proxy x;
    public final ProxySelector y;
    public final InterfaceC2339o7 z;

    public OV(NV nv) {
        ProxySelector proxySelector;
        AbstractC1474fG.j(nv, "builder");
        this.l = nv.a;
        this.m = nv.b;
        this.n = Mr0.x(nv.c);
        this.f433o = Mr0.x(nv.d);
        this.p = nv.e;
        this.q = nv.f;
        this.r = nv.g;
        this.s = nv.h;
        this.t = nv.i;
        this.u = nv.j;
        this.v = nv.k;
        this.w = nv.l;
        Proxy proxy = nv.m;
        this.x = proxy;
        if (proxy != null) {
            proxySelector = C2366oV.a;
        } else {
            proxySelector = nv.n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C2366oV.a;
            }
        }
        this.y = proxySelector;
        this.z = nv.f412o;
        this.A = nv.p;
        List list = nv.s;
        this.D = list;
        this.E = nv.t;
        this.F = nv.u;
        this.I = nv.x;
        this.J = nv.y;
        this.K = nv.z;
        this.L = nv.A;
        this.M = nv.B;
        this.N = nv.C;
        L80 l80 = nv.D;
        this.O = l80 == null ? new L80(0) : l80;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.B = null;
                    this.H = null;
                    this.C = null;
                    this.G = C3150wc.c;
                    break;
                }
                if (((C2770sg) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = nv.q;
                    if (sSLSocketFactory == null) {
                        VY vy = VY.a;
                        X509TrustManager x509TrustManagerN = VY.a.n();
                        this.C = x509TrustManagerN;
                        this.B = VY.a.m(x509TrustManagerN);
                        AbstractC1923jt0 abstractC1923jt0B = VY.a.b(x509TrustManagerN);
                        this.H = abstractC1923jt0B;
                        C3150wc c3150wc = nv.v;
                        this.G = AbstractC1474fG.b(c3150wc.b, abstractC1923jt0B) ? c3150wc : new C3150wc(c3150wc.a, abstractC1923jt0B);
                        break;
                    }
                    this.B = sSLSocketFactory;
                    AbstractC1923jt0 abstractC1923jt0 = nv.w;
                    AbstractC1474fG.g(abstractC1923jt0);
                    this.H = abstractC1923jt0;
                    X509TrustManager x509TrustManager = nv.r;
                    AbstractC1474fG.g(x509TrustManager);
                    this.C = x509TrustManager;
                    C3150wc c3150wc2 = nv.v;
                    this.G = AbstractC1474fG.b(c3150wc2.b, abstractC1923jt0) ? c3150wc2 : new C3150wc(c3150wc2.a, abstractC1923jt0);
                    break;
                }
            }
        } else {
            this.B = null;
            this.H = null;
            this.C = null;
            this.G = C3150wc.c;
            break;
        }
        List list2 = this.n;
        AbstractC1474fG.h(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f433o;
        AbstractC1474fG.h(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list4 = this.D;
        boolean z = list4 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.C;
        AbstractC1923jt0 abstractC1923jt1 = this.H;
        SSLSocketFactory sSLSocketFactory2 = this.B;
        if (!z || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C2770sg) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (abstractC1923jt1 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (abstractC1923jt1 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!AbstractC1474fG.b(this.G, C3150wc.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final NV b() {
        NV nv = new NV();
        nv.a = this.l;
        nv.b = this.m;
        AbstractC1406ef.Q(nv.c, this.n);
        AbstractC1406ef.Q(nv.d, this.f433o);
        nv.e = this.p;
        nv.f = this.q;
        nv.g = this.r;
        nv.h = this.s;
        nv.i = this.t;
        nv.j = this.u;
        nv.k = this.v;
        nv.l = this.w;
        nv.m = this.x;
        nv.n = this.y;
        nv.f412o = this.z;
        nv.p = this.A;
        nv.q = this.B;
        nv.r = this.C;
        nv.s = this.D;
        nv.t = this.E;
        nv.u = this.F;
        nv.v = this.G;
        nv.w = this.H;
        nv.x = this.I;
        nv.y = this.J;
        nv.z = this.K;
        nv.A = this.L;
        nv.B = this.M;
        nv.C = this.N;
        nv.D = this.O;
        return nv;
    }

    public final A50 c(C1951k70 c1951k70) {
        AbstractC1474fG.j(c1951k70, "request");
        return new A50(this, c1951k70, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public OV() {
        this(new NV());
    }
}
