package o;

import j$.time.Duration;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public class yy0 {

    @Generated
    private static final CL r = DL.d(yy0.class);
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 4;
    private static final int x = 5;
    private static final int y = 6;
    private static final int z = 7;
    private final C2848tT a;
    private int b;
    private int c;
    private final long d;
    private final boolean e;
    private d f;
    private SocketAddress g;
    private final SocketAddress h;
    private Wh0 i;
    private final C1511fi0 j;
    private C1511fi0.b k;
    private Duration l = Duration.ofMinutes(15);
    private int m;
    private long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f1142o;
    private H50 p;
    private int q;

    public static class b implements d {
        private List<H50> a;
        private List<c> b;

        private b() {
        }

        @Override // o.yy0.d
        public void a() {
            this.a = new ArrayList();
        }

        @Override // o.yy0.d
        public void b() {
            this.b = new ArrayList();
        }

        @Override // o.yy0.d
        public void c(H50 h50) {
            List<c> list = this.b;
            c cVar = list.get(list.size() - 1);
            cVar.c.add(h50);
            cVar.b = yy0.k(h50);
        }

        @Override // o.yy0.d
        public void d(H50 h50) {
            c cVar = new c();
            cVar.d.add(h50);
            cVar.a = yy0.k(h50);
            this.b.add(cVar);
        }

        @Override // o.yy0.d
        public void e(H50 h50) {
            List<c> list = this.b;
            if (list == null) {
                this.a.add(h50);
                return;
            }
            c cVar = list.get(list.size() - 1);
            if (cVar.c.isEmpty()) {
                cVar.d.add(h50);
            } else {
                cVar.c.add(h50);
            }
        }
    }

    public static class c {
        public long a;
        public long b;
        public List<H50> c;
        public List<H50> d;

        private c() {
            this.c = new ArrayList();
            this.d = new ArrayList();
        }
    }

    public interface d {
        void a();

        void b();

        void c(H50 h50);

        void d(H50 h50);

        void e(H50 h50);
    }

    public yy0(C2848tT c2848tT, int i, long j, boolean z2, SocketAddress socketAddress, C1511fi0 c1511fi0) {
        this.h = socketAddress;
        this.j = c1511fi0;
        if (c2848tT.q()) {
            this.a = c2848tT;
        } else {
            try {
                this.a = C2848tT.h(c2848tT, C2848tT.v);
            } catch (C2945uT unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.b = i;
        this.c = 1;
        this.d = j;
        this.e = z2;
        this.m = 0;
    }

    private void B() {
        H50 h50Z = H50.z(this.a, this.b, this.c);
        AQ aq = new AQ();
        aq.k().v(0);
        aq.b(h50Z, 0);
        if (this.b == 251) {
            C2848tT c2848tT = this.a;
            int i = this.c;
            C2848tT c2848tT2 = C2848tT.v;
            aq.b(new C1467f90(c2848tT, i, 0L, c2848tT2, c2848tT2, this.d, 0L, 0L, 0L, 0L), 2);
        }
        C1511fi0 c1511fi0 = this.j;
        if (c1511fi0 != null) {
            c1511fi0.m(aq, null);
            this.k = new C1511fi0.b(this.j, aq.t());
        }
        this.i.q(aq.M(AQ.w));
    }

    private void b() {
        try {
            Wh0 wh0 = this.i;
            if (wh0 != null) {
                wh0.close();
            }
        } catch (IOException unused) {
        }
    }

    private void d() throws xy0, Rw0 {
        C1511fi0.b bVar;
        B();
        while (this.m != 7) {
            byte[] bArrP = this.i.p();
            AQ aqX = x(bArrP);
            List<H50> listQ = aqX.q(1);
            if (aqX.k().n() == 0 && (bVar = this.k) != null) {
                int iD = bVar.d(aqX, bArrP, listQ.get(listQ.size() - 1).y() == 6);
                if (iD != 0) {
                    if (this.k.b() != null) {
                        e("TSIG failure: " + C2820t50.a(iD) + " (" + this.k.b() + ")");
                    } else {
                        e("TSIG failure: " + C2820t50.a(iD));
                    }
                }
            }
            if (this.m == 0) {
                int iO = aqX.o();
                if (iO != 0) {
                    if (this.b == 251 && iO == 4) {
                        f();
                        d();
                        return;
                    }
                    e(C2820t50.b(iO));
                }
                H50 h50N = aqX.n();
                if (h50N != null && h50N.y() != this.b) {
                    e("invalid question section");
                }
                if (listQ.isEmpty() && this.b == 251) {
                    f();
                    d();
                    return;
                }
            }
            Iterator<H50> it = listQ.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    private void e(String str) throws xy0 {
        throw new xy0(str);
    }

    private void f() throws xy0 {
        if (!this.e) {
            e("server doesn't support IXFR");
        }
        p("falling back to AXFR");
        this.b = 252;
        this.m = 0;
    }

    private b h() {
        d dVar = this.f;
        if (dVar instanceof b) {
            return (b) dVar;
        }
        throw new IllegalArgumentException("ZoneTransferIn used callback interface");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long k(H50 h50) {
        return ((C1467f90) h50).a0();
    }

    private void p(String str) {
        r.R(this.a, str, "{}: {}");
    }

    public static yy0 q(C2848tT c2848tT, String str, int i, C1511fi0 c1511fi0) {
        if (i == 0) {
            i = 53;
        }
        return s(c2848tT, new InetSocketAddress(str, i), c1511fi0);
    }

    public static yy0 r(C2848tT c2848tT, String str, C1511fi0 c1511fi0) {
        return q(c2848tT, str, 0, c1511fi0);
    }

    public static yy0 s(C2848tT c2848tT, SocketAddress socketAddress, C1511fi0 c1511fi0) {
        return new yy0(c2848tT, 252, 0L, false, socketAddress, c1511fi0);
    }

    public static yy0 t(C2848tT c2848tT, long j, boolean z2, String str, int i, C1511fi0 c1511fi0) {
        if (i == 0) {
            i = 53;
        }
        return v(c2848tT, j, z2, new InetSocketAddress(str, i), c1511fi0);
    }

    public static yy0 u(C2848tT c2848tT, long j, boolean z2, String str, C1511fi0 c1511fi0) {
        return t(c2848tT, j, z2, str, 0, c1511fi0);
    }

    public static yy0 v(C2848tT c2848tT, long j, boolean z2, SocketAddress socketAddress, C1511fi0 c1511fi0) {
        return new yy0(c2848tT, C3080vp0.z0, j, z2, socketAddress, c1511fi0);
    }

    private void w() throws IOException {
        Wh0 wh0C = c(this.l);
        this.i = wh0C;
        SocketAddress socketAddress = this.g;
        if (socketAddress != null) {
            wh0C.f(socketAddress);
        }
        this.i.l(this.h);
    }

    private AQ x(byte[] bArr) throws Rw0 {
        try {
            return new AQ(bArr);
        } catch (IOException e) {
            if (e instanceof Rw0) {
                throw ((Rw0) e);
            }
            throw new Rw0("Error parsing message", e);
        }
    }

    private void y(H50 h50) throws xy0 {
        int iY = h50.y();
        switch (this.m) {
            case 0:
                if (iY != 6) {
                    e("missing initial SOA");
                }
                this.p = h50;
                long jK = k(h50);
                this.n = jK;
                if (this.b == 251 && Yb0.a(jK, this.d) <= 0) {
                    p("up to date");
                    this.m = 7;
                } else {
                    this.m = 1;
                }
                break;
            case 1:
                if (this.b == 251 && iY == 6 && k(h50) == this.d) {
                    this.q = C3080vp0.z0;
                    this.f.b();
                    p("got incremental response");
                    this.m = 2;
                } else {
                    this.q = 252;
                    this.f.a();
                    this.f.e(this.p);
                    p("got nonincremental response");
                    this.m = 6;
                }
                y(h50);
                break;
            case 2:
                this.f.d(h50);
                this.m = 3;
                break;
            case 3:
                if (iY != 6) {
                    this.f.e(h50);
                } else {
                    this.f1142o = k(h50);
                    this.m = 4;
                    y(h50);
                }
                break;
            case 4:
                this.f.c(h50);
                this.m = 5;
                break;
            case 5:
                if (iY == 6) {
                    long jK2 = k(h50);
                    if (jK2 == this.n) {
                        this.m = 7;
                    } else if (jK2 == this.f1142o) {
                        this.m = 2;
                        y(h50);
                    } else {
                        e("IXFR out of sync: expected serial " + this.f1142o + " , got " + jK2);
                    }
                }
                this.f.e(h50);
                break;
            case 6:
                if (iY != 1 || h50.t() == this.c) {
                    this.f.e(h50);
                    if (iY == 6) {
                        this.m = 7;
                    }
                }
                break;
            case 7:
                e("extra data");
                break;
            default:
                e("invalid state");
                break;
        }
    }

    public void A(d dVar) {
        this.f = dVar;
        try {
            w();
            d();
        } finally {
            b();
        }
    }

    public void C(int i) {
        C0344Ci.a(i);
        this.c = i;
    }

    public void D(SocketAddress socketAddress) {
        this.g = socketAddress;
    }

    @Deprecated
    public void E(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout cannot be negative");
        }
        this.l = Duration.ofSeconds(i);
    }

    public void F(Duration duration) {
        this.l = duration;
    }

    public Wh0 c(Duration duration) {
        return new Wh0(duration);
    }

    public List<H50> g() {
        return h().a;
    }

    public List<c> i() {
        return h().b;
    }

    public C2848tT j() {
        return this.a;
    }

    public int l() {
        return this.b;
    }

    public boolean m() {
        return this.q == 252;
    }

    public boolean n() {
        b bVarH = h();
        return bVarH.a == null && bVarH.b == null;
    }

    public boolean o() {
        return this.q == 251;
    }

    public void z() {
        A(new b());
    }
}
