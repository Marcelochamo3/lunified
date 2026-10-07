package o;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E30 implements InterfaceC2941uP, InterfaceC0354Cs, InterfaceC1284dL, InterfaceC1577gL, B90 {
    public static final Map X;
    public static final C0643Nw Y;
    public InterfaceC2844tP B;
    public JE C;
    public boolean F;
    public boolean G;
    public boolean H;
    public C2303no0 I;
    public InterfaceC2664rb0 J;
    public boolean L;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public long R;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Uri l;
    public final InterfaceC2583qj m;
    public final InterfaceC0428Fo n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0622Nb f228o;
    public final C2613qy p;
    public final C0350Co q;
    public final H30 r;
    public final C1562g8 s;
    public final String t;
    public final long u;
    public final Na0 w;
    public final Na0 v = new Na0("ProgressiveMediaPeriod");
    public final io.sentry.X1 x = new io.sentry.X1();
    public final A30 y = new A30(this, 0);
    public final A30 z = new A30(this, 1);
    public final Handler A = Lr0.n(null);
    public D30[] E = new D30[0];
    public C90[] D = new C90[0];
    public long S = -9223372036854775807L;
    public long K = -9223372036854775807L;
    public int M = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        X = Collections.unmodifiableMap(map);
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.a = "icy";
        c0617Mw.k = "application/x-icy";
        Y = c0617Mw.a();
    }

    public E30(Uri uri, InterfaceC2583qj interfaceC2583qj, Na0 na0, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, C0622Nb c0622Nb, C2613qy c2613qy, H30 h30, C1562g8 c1562g8, String str, int i) {
        this.l = uri;
        this.m = interfaceC2583qj;
        this.n = interfaceC0428Fo;
        this.q = c0350Co;
        this.f228o = c0622Nb;
        this.p = c2613qy;
        this.r = h30;
        this.s = c1562g8;
        this.t = str;
        this.u = i;
        this.w = na0;
    }

    @Override // o.Ub0
    public final long A() {
        long j;
        boolean z;
        e();
        if (this.V || this.P == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.S;
        }
        if (this.H) {
            int length = this.D.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C2303no0 c2303no0 = this.I;
                if (((boolean[]) c2303no0.n)[i] && ((boolean[]) c2303no0.f941o)[i]) {
                    C90 c90 = this.D[i];
                    synchronized (c90) {
                        z = c90.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.D[i].n());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.R : j;
    }

    @Override // o.InterfaceC2941uP
    public final void B() throws IOException {
        int iV = this.f228o.v(this.M);
        Na0 na0 = this.v;
        IOException iOException = (IOException) na0.f414o;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1381eL handlerC1381eL = (HandlerC1381eL) na0.n;
        if (handlerC1381eL != null) {
            if (iV == Integer.MIN_VALUE) {
                iV = handlerC1381eL.l;
            }
            IOException iOException2 = handlerC1381eL.p;
            if (iOException2 != null && handlerC1381eL.q > iV) {
                throw iOException2;
            }
        }
        if (this.V && !this.G) {
            throw C2949uX.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        e();
        if (m()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.I.f941o;
        int length = this.D.length;
        for (int i = 0; i < length; i++) {
            this.D[i].h(j, z, zArr[i]);
        }
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        InterfaceC1920js interfaceC1920js;
        e();
        C2303no0 c2303no0 = this.I;
        C1031am0 c1031am0 = (C1031am0) c2303no0.m;
        int i = this.P;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = interfaceC1920jsArr.length;
            zArr3 = (boolean[]) c2303no0.f941o;
            if (i3 >= length) {
                break;
            }
            D90 d90 = d90Arr[i3];
            if (d90 != null && (interfaceC1920jsArr[i3] == null || !zArr[i3])) {
                int i4 = ((C30) d90).l;
                AbstractC0397Ej.f(zArr3[i4]);
                this.P--;
                zArr3[i4] = false;
                d90Arr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.N ? j == 0 : i != 0;
        for (int i5 = 0; i5 < interfaceC1920jsArr.length; i5++) {
            if (d90Arr[i5] == null && (interfaceC1920js = interfaceC1920jsArr[i5]) != null) {
                AbstractC0397Ej.f(interfaceC1920js.length() == 1);
                AbstractC0397Ej.f(interfaceC1920js.f(0) == 0);
                int iB = c1031am0.b(interfaceC1920js.j());
                AbstractC0397Ej.f(!zArr3[iB]);
                this.P++;
                zArr3[iB] = true;
                d90Arr[i5] = new C30(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    C90 c90 = this.D[iB];
                    z = (c90.E(j, true) || c90.q() == 0) ? false : true;
                }
            }
        }
        if (this.P == 0) {
            this.T = false;
            this.O = false;
            Na0 na0 = this.v;
            if (na0.M()) {
                C90[] c90Arr = this.D;
                int length2 = c90Arr.length;
                while (i2 < length2) {
                    c90Arr[i2].i();
                    i2++;
                }
                na0.r();
            } else {
                for (C90 c91 : this.D) {
                    c91.B(false);
                }
            }
        } else if (z) {
            j = I(j);
            while (i2 < d90Arr.length) {
                if (d90Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.N = true;
        return j;
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        e();
        boolean[] zArr = (boolean[]) this.I.n;
        if (!this.J.g()) {
            j = 0;
        }
        this.O = false;
        this.R = j;
        if (m()) {
            this.S = j;
            return j;
        }
        if (this.M != 7) {
            int length = this.D.length;
            for (int i = 0; i < length; i++) {
                if (this.D[i].E(j, false) || (!zArr[i] && this.H)) {
                }
            }
            return j;
        }
        this.T = false;
        this.S = j;
        this.V = false;
        Na0 na0 = this.v;
        if (na0.M()) {
            for (C90 c90 : this.D) {
                c90.i();
            }
            na0.r();
        } else {
            na0.f414o = null;
            for (C90 c91 : this.D) {
                c91.B(false);
            }
        }
        return j;
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        if (this.V) {
            return false;
        }
        Na0 na0 = this.v;
        if (na0.F() || this.T) {
            return false;
        }
        if (this.G && this.P == 0) {
            return false;
        }
        boolean zB = this.x.b();
        if (na0.M()) {
            return zB;
        }
        v();
        return true;
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        e();
        if (!this.J.g()) {
            return 0L;
        }
        C2568qb0 c2568qb0I = this.J.i(j);
        return c2761sb0.a(j, c2568qb0I.a.a, c2568qb0I.b.a);
    }

    @Override // o.B90
    public final void a() {
        this.A.post(this.y);
    }

    @Override // o.Ub0
    public final boolean b() {
        boolean z;
        if (this.v.M()) {
            io.sentry.X1 x1 = this.x;
            synchronized (x1) {
                z = x1.a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.B = interfaceC2844tP;
        this.x.b();
        v();
    }

    @Override // o.InterfaceC1577gL
    public final void d() {
        for (C90 c90 : this.D) {
            c90.B(true);
            InterfaceC3465zo interfaceC3465zo = c90.h;
            if (interfaceC3465zo != null) {
                interfaceC3465zo.d(c90.e);
                c90.h = null;
                c90.g = null;
            }
        }
        Na0 na0 = this.w;
        InterfaceC0302As interfaceC0302As = (InterfaceC0302As) na0.n;
        if (interfaceC0302As != null) {
            interfaceC0302As.a();
            na0.n = null;
        }
        na0.f414o = null;
    }

    public final void e() {
        AbstractC0397Ej.f(this.G);
        this.I.getClass();
        this.J.getClass();
    }

    @Override // o.InterfaceC0354Cs
    public final void f() {
        this.F = true;
        this.A.post(this.y);
    }

    public final int g() {
        int i = 0;
        for (C90 c90 : this.D) {
            i += c90.q + c90.p;
        }
        return i;
    }

    @Override // o.InterfaceC1284dL
    public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
        B30 b30 = (B30) interfaceC1479fL;
        Uri uri = b30.m.n;
        C0991aL c0991aL = new C0991aL();
        this.f228o.getClass();
        this.p.x(c0991aL, 1, -1, null, 0, null, b30.t, this.K);
        if (z) {
            return;
        }
        for (C90 c90 : this.D) {
            c90.B(false);
        }
        if (this.P > 0) {
            InterfaceC2844tP interfaceC2844tP = this.B;
            interfaceC2844tP.getClass();
            interfaceC2844tP.e(this);
        }
    }

    @Override // o.InterfaceC0354Cs
    public final void i(InterfaceC2664rb0 interfaceC2664rb0) {
        this.A.post(new O3(this, 14, interfaceC2664rb0));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long j(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.D.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.D[i].n());
            } else {
                C2303no0 c2303no0 = this.I;
                c2303no0.getClass();
                if (((boolean[]) c2303no0.f941o)[i]) {
                    jMax = Math.max(jMax, this.D[i].n());
                }
            }
        }
        return jMax;
    }

    @Override // o.InterfaceC1284dL
    public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        long jMin;
        ZK zk;
        InterfaceC2664rb0 interfaceC2664rb0;
        B30 b30 = (B30) interfaceC1479fL;
        Uri uri = b30.m.n;
        C0991aL c0991aL = new C0991aL();
        int i2 = Lr0.a;
        this.f228o.getClass();
        if ((iOException instanceof C2949uX) || (iOException instanceof FileNotFoundException) || (iOException instanceof C1179cE) || (iOException instanceof C1675hL)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = C2679rj.m;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C2679rj) && ((C2679rj) cause).l == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zk = Na0.u;
        } else {
            int iG = g();
            int i4 = iG > this.U ? 1 : 0;
            if (this.Q || !((interfaceC2664rb0 = this.J) == null || interfaceC2664rb0.j() == -9223372036854775807L)) {
                this.U = iG;
            } else if (!this.G || w()) {
                this.O = this.G;
                this.R = 0L;
                this.U = 0;
                for (C90 c90 : this.D) {
                    c90.B(false);
                }
                b30.q.a = 0L;
                b30.t = 0L;
                b30.s = true;
                b30.w = false;
            } else {
                this.T = true;
                zk = Na0.t;
            }
            zk = new ZK(i4, jMin, false);
        }
        ZK zk2 = zk;
        this.p.C(c0991aL, 1, -1, null, 0, null, b30.t, this.K, iOException, !zk2.a());
        return zk2;
    }

    @Override // o.InterfaceC1284dL
    public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        InterfaceC2664rb0 interfaceC2664rb0;
        B30 b30 = (B30) interfaceC1479fL;
        if (this.K == -9223372036854775807L && (interfaceC2664rb0 = this.J) != null) {
            boolean zG = interfaceC2664rb0.g();
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + 10000;
            this.K = j4;
            this.r.t(j4, zG, this.L);
        }
        Uri uri = b30.m.n;
        C0991aL c0991aL = new C0991aL();
        this.f228o.getClass();
        this.p.A(c0991aL, 1, -1, null, 0, null, b30.t, this.K);
        this.V = true;
        InterfaceC2844tP interfaceC2844tP = this.B;
        interfaceC2844tP.getClass();
        interfaceC2844tP.e(this);
    }

    public final boolean m() {
        return this.S != -9223372036854775807L;
    }

    public final void n() {
        int i;
        if (this.W || this.G || !this.F || this.J == null) {
            return;
        }
        for (C90 c90 : this.D) {
            if (c90.t() == null) {
                return;
            }
        }
        this.x.a();
        int length = this.D.length;
        Zl0[] zl0Arr = new Zl0[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            C0643Nw c0643NwT = this.D[i2].t();
            c0643NwT.getClass();
            String str = c0643NwT.w;
            boolean zK = IQ.k(str);
            boolean z = zK || IQ.m(str);
            zArr[i2] = z;
            this.H = z | this.H;
            JE je = this.C;
            if (je != null) {
                if (zK || this.E[i2].b) {
                    CQ cq = c0643NwT.u;
                    CQ cq2 = cq == null ? new CQ(je) : cq.a(je);
                    C0617Mw c0617MwA = c0643NwT.a();
                    c0617MwA.i = cq2;
                    c0643NwT = new C0643Nw(c0617MwA);
                }
                if (zK && c0643NwT.q == -1 && c0643NwT.r == -1 && (i = je.l) != -1) {
                    C0617Mw c0617MwA2 = c0643NwT.a();
                    c0617MwA2.f = i;
                    c0643NwT = new C0643Nw(c0617MwA2);
                }
            }
            int iO = this.n.o(c0643NwT);
            C0617Mw c0617MwA3 = c0643NwT.a();
            c0617MwA3.F = iO;
            zl0Arr[i2] = new Zl0(Integer.toString(i2), c0617MwA3.a());
        }
        this.I = new C2303no0(new C1031am0(zl0Arr), zArr);
        this.G = true;
        InterfaceC2844tP interfaceC2844tP = this.B;
        interfaceC2844tP.getClass();
        interfaceC2844tP.d(this);
    }

    @Override // o.Ub0
    public final long o() {
        return A();
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        if (!this.O) {
            return -9223372036854775807L;
        }
        if (!this.V && g() <= this.U) {
            return -9223372036854775807L;
        }
        this.O = false;
        return this.R;
    }

    public final void q(int i) {
        e();
        C2303no0 c2303no0 = this.I;
        boolean[] zArr = (boolean[]) c2303no0.p;
        if (zArr[i]) {
            return;
        }
        C0643Nw c0643Nw = ((C1031am0) c2303no0.m).a(i).f665o[0];
        this.p.m(IQ.i(c0643Nw.w), c0643Nw, 0, null, this.R);
        zArr[i] = true;
    }

    public final void r(int i) {
        e();
        boolean[] zArr = (boolean[]) this.I.n;
        if (this.T && zArr[i] && !this.D[i].v(false)) {
            this.S = 0L;
            this.T = false;
            this.O = true;
            this.R = 0L;
            this.U = 0;
            for (C90 c90 : this.D) {
                c90.B(false);
            }
            InterfaceC2844tP interfaceC2844tP = this.B;
            interfaceC2844tP.getClass();
            interfaceC2844tP.e(this);
        }
    }

    @Override // o.InterfaceC0354Cs
    public final InterfaceC1324dm0 s(int i, int i2) {
        return u(new D30(i, false));
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        e();
        return (C1031am0) this.I.m;
    }

    public final C90 u(D30 d30) {
        int length = this.D.length;
        for (int i = 0; i < length; i++) {
            if (d30.equals(this.E[i])) {
                return this.D[i];
            }
        }
        InterfaceC0428Fo interfaceC0428Fo = this.n;
        interfaceC0428Fo.getClass();
        C0350Co c0350Co = this.q;
        c0350Co.getClass();
        C90 c90 = new C90(this.s, interfaceC0428Fo, c0350Co);
        c90.f = this;
        int i2 = length + 1;
        D30[] d30Arr = (D30[]) Arrays.copyOf(this.E, i2);
        d30Arr[length] = d30;
        this.E = d30Arr;
        C90[] c90Arr = (C90[]) Arrays.copyOf(this.D, i2);
        c90Arr[length] = c90;
        this.D = c90Arr;
        return c90;
    }

    public final void v() {
        B30 b30 = new B30(this, this.l, this.m, this.w, this, this.x);
        if (this.G) {
            AbstractC0397Ej.f(m());
            long j = this.K;
            if (j != -9223372036854775807L && this.S > j) {
                this.V = true;
                this.S = -9223372036854775807L;
                return;
            }
            InterfaceC2664rb0 interfaceC2664rb0 = this.J;
            interfaceC2664rb0.getClass();
            long j2 = interfaceC2664rb0.i(this.S).a.b;
            long j3 = this.S;
            b30.q.a = j2;
            b30.t = j3;
            b30.s = true;
            b30.w = false;
            for (C90 c90 : this.D) {
                c90.t = this.S;
            }
            this.S = -9223372036854775807L;
        }
        this.U = g();
        this.v.S(b30, this, this.f228o.v(this.M));
        this.p.G(new C0991aL(b30.u), 1, -1, null, 0, null, b30.t, this.K);
    }

    public final boolean w() {
        return this.O || m();
    }

    @Override // o.Ub0
    public final void O(long j) {
    }
}
