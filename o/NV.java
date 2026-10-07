package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class NV {
    public int A;
    public int B;
    public long C;
    public L80 D;
    public C1813in a = new C1813in();
    public C2133m1 b = new C2133m1(11);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public C2278nc e = new C2278nc();
    public boolean f = true;
    public InterfaceC2339o7 g;
    public boolean h;
    public boolean i;
    public InterfaceC0654Oh j;
    public C0362Da k;
    public InterfaceC2784sn l;
    public Proxy m;
    public ProxySelector n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC2339o7 f412o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public C3150wc v;
    public AbstractC1923jt0 w;
    public int x;
    public int y;
    public int z;

    public NV() {
        C2691rp c2691rp = InterfaceC2339o7.a;
        this.g = c2691rp;
        this.h = true;
        this.i = true;
        this.j = InterfaceC0654Oh.d;
        this.l = InterfaceC2784sn.a;
        this.f412o = c2691rp;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1474fG.i(socketFactory, "getDefault()");
        this.p = socketFactory;
        this.s = OV.Q;
        this.t = OV.P;
        this.u = JV.a;
        this.v = C3150wc.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.C = 1024L;
    }

    public final void a(InterfaceC1181cG interfaceC1181cG) {
        this.c.add(interfaceC1181cG);
    }

    public final void b(InterfaceC1181cG interfaceC1181cG) {
        this.d.add(interfaceC1181cG);
    }

    public final void c(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        this.x = Mr0.b(j, timeUnit);
    }

    public final void d(C3150wc c3150wc) {
        AbstractC1474fG.j(c3150wc, "certificatePinner");
        if (!AbstractC1474fG.b(c3150wc, this.v)) {
            this.D = null;
        }
        this.v = c3150wc;
    }

    public final void e(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        this.y = Mr0.b(j, timeUnit);
    }

    public final void f(InterfaceC2784sn interfaceC2784sn) {
        AbstractC1474fG.j(interfaceC2784sn, "dns");
        if (!AbstractC1474fG.b(interfaceC2784sn, this.l)) {
            this.D = null;
        }
        this.l = interfaceC2784sn;
    }

    public final void g(Proxy proxy) {
        if (!AbstractC1474fG.b(proxy, this.m)) {
            this.D = null;
        }
        this.m = proxy;
    }

    public final void h(InterfaceC2339o7 interfaceC2339o7) {
        AbstractC1474fG.j(interfaceC2339o7, "proxyAuthenticator");
        if (!AbstractC1474fG.b(interfaceC2339o7, this.f412o)) {
            this.D = null;
        }
        this.f412o = interfaceC2339o7;
    }

    public final void i(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        this.z = Mr0.b(j, timeUnit);
    }

    public final void j(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        AbstractC1474fG.j(sSLSocketFactory, "sslSocketFactory");
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        if (!AbstractC1474fG.b(sSLSocketFactory, this.q) || !AbstractC1474fG.b(x509TrustManager, this.r)) {
            this.D = null;
        }
        this.q = sSLSocketFactory;
        VY vy = VY.a;
        this.w = VY.a.b(x509TrustManager);
        this.r = x509TrustManager;
    }

    public final void k(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        this.A = Mr0.b(j, timeUnit);
    }
}
