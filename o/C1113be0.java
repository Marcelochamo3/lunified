package o;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1113be0 implements InterfaceC2941uP, InterfaceC1284dL {
    public final C2970uj l;
    public final InterfaceC2486pj m;
    public final InterfaceC2590qm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0622Nb f700o;
    public final C2613qy p;
    public final C1031am0 q;
    public final long s;
    public final C0643Nw u;
    public final boolean v;
    public boolean w;
    public byte[] x;
    public int y;
    public final ArrayList r = new ArrayList();
    public final Na0 t = new Na0("SingleSampleMediaPeriod");

    public C1113be0(C2970uj c2970uj, InterfaceC2486pj interfaceC2486pj, InterfaceC2590qm0 interfaceC2590qm0, C0643Nw c0643Nw, long j, C0622Nb c0622Nb, C2613qy c2613qy, boolean z) {
        this.l = c2970uj;
        this.m = interfaceC2486pj;
        this.n = interfaceC2590qm0;
        this.u = c0643Nw;
        this.s = j;
        this.f700o = c0622Nb;
        this.p = c2613qy;
        this.v = z;
        this.q = new C1031am0(new Zl0("", c0643Nw));
    }

    @Override // o.Ub0
    public final long A() {
        return this.w ? Long.MIN_VALUE : 0L;
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC1920jsArr.length; i++) {
            D90 d90 = d90Arr[i];
            ArrayList arrayList = this.r;
            if (d90 != null && (interfaceC1920jsArr[i] == null || !zArr[i])) {
                arrayList.remove(d90);
                d90Arr[i] = null;
            }
            if (d90Arr[i] == null && interfaceC1920jsArr[i] != null) {
                Zd0 zd0 = new Zd0(this);
                arrayList.add(zd0);
                d90Arr[i] = zd0;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                return j;
            }
            Zd0 zd0 = (Zd0) arrayList.get(i);
            if (zd0.l == 2) {
                zd0.l = 1;
            }
            i++;
        }
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        if (this.w) {
            return false;
        }
        Na0 na0 = this.t;
        if (na0.M() || na0.F()) {
            return false;
        }
        InterfaceC2583qj interfaceC2583qjH = this.m.H();
        InterfaceC2590qm0 interfaceC2590qm0 = this.n;
        if (interfaceC2590qm0 != null) {
            interfaceC2583qjH.k(interfaceC2590qm0);
        }
        C2970uj c2970uj = this.l;
        na0.S(new C1015ae0(interfaceC2583qjH, c2970uj), this, this.f700o.v(1));
        this.p.G(new C0991aL(c2970uj), 1, -1, this.u, 0, null, 0L, this.s);
        return true;
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.t.M();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        interfaceC2844tP.d(this);
    }

    @Override // o.InterfaceC1284dL
    public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
        Uri uri = ((C1015ae0) interfaceC1479fL).m.n;
        C0991aL c0991aL = new C0991aL();
        this.f700o.getClass();
        this.p.x(c0991aL, 1, -1, null, 0, null, 0L, this.s);
    }

    @Override // o.InterfaceC1284dL
    public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        long jMin;
        ZK zk;
        Uri uri = ((C1015ae0) interfaceC1479fL).m.n;
        C0991aL c0991aL = new C0991aL();
        int i2 = Lr0.a;
        C0622Nb c0622Nb = this.f700o;
        c0622Nb.getClass();
        if (!(iOException instanceof C2949uX) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1179cE) && !(iOException instanceof C1675hL)) {
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
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z = jMin == -9223372036854775807L || i >= c0622Nb.v(1);
        if (this.v && z) {
            AP.A("Loading failed, treating as end-of-stream.", iOException);
            this.w = true;
            zk = Na0.t;
        } else {
            zk = jMin != -9223372036854775807L ? new ZK(0, jMin, false) : Na0.u;
        }
        ZK zk2 = zk;
        this.p.C(c0991aL, 1, -1, this.u, 0, null, 0L, this.s, iOException, !zk2.a());
        return zk2;
    }

    @Override // o.InterfaceC1284dL
    public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        C1015ae0 c1015ae0 = (C1015ae0) interfaceC1479fL;
        this.y = (int) c1015ae0.m.m;
        byte[] bArr = c1015ae0.n;
        bArr.getClass();
        this.x = bArr;
        this.w = true;
        Uri uri = c1015ae0.m.n;
        C0991aL c0991aL = new C0991aL();
        this.f700o.getClass();
        this.p.A(c0991aL, 1, -1, this.u, 0, null, 0L, this.s);
    }

    @Override // o.Ub0
    public final long o() {
        return (this.w || this.t.M()) ? Long.MIN_VALUE : 0L;
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        return this.q;
    }

    @Override // o.InterfaceC2941uP
    public final void B() {
    }

    @Override // o.Ub0
    public final void O(long j) {
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        return j;
    }
}
