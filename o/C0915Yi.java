package o;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: o.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0915Yi implements InterfaceC1284dL, InterfaceC1773iL {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1122bj m;

    public /* synthetic */ C0915Yi(C1122bj c1122bj, int i) {
        this.l = i;
        this.m = c1122bj;
    }

    @Override // o.InterfaceC1773iL
    public void a() throws IOException {
        C1122bj c1122bj = this.m;
        c1122bj.B.a();
        C0811Ui c0811Ui = c1122bj.D;
        if (c0811Ui != null) {
            throw c0811Ui;
        }
    }

    public void b() {
        long j;
        C1122bj c1122bj = this.m;
        synchronized (Jp0.d) {
            try {
                j = Jp0.e ? Jp0.f : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        c1122bj.M = j;
        c1122bj.u(true);
    }

    @Override // o.InterfaceC1284dL
    public void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
        switch (this.l) {
            case 2:
                C3143wX c3143wX = (C3143wX) interfaceC1479fL;
                C1122bj c1122bj = this.m;
                c1122bj.getClass();
                long j3 = c3143wX.l;
                Uri uri = c3143wX.f1093o.n;
                C0991aL c0991aL = new C0991aL();
                c1122bj.n.getClass();
                c1122bj.r.x(c0991aL, c3143wX.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                break;
            default:
                C3143wX c3143wX2 = (C3143wX) interfaceC1479fL;
                C1122bj c1122bj2 = this.m;
                c1122bj2.getClass();
                long j4 = c3143wX2.l;
                Uri uri2 = c3143wX2.f1093o.n;
                C0991aL c0991aL2 = new C0991aL();
                c1122bj2.n.getClass();
                c1122bj2.r.x(c0991aL2, c3143wX2.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                break;
        }
    }

    @Override // o.InterfaceC1284dL
    public ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        long jMin;
        C1122bj c1122bj = this.m;
        switch (this.l) {
            case 2:
                C3143wX c3143wX = (C3143wX) interfaceC1479fL;
                c1122bj.getClass();
                long j = c3143wX.l;
                Uri uri = c3143wX.f1093o.n;
                C0991aL c0991aL = new C0991aL();
                c1122bj.n.getClass();
                if ((iOException instanceof C2949uX) || (iOException instanceof FileNotFoundException) || (iOException instanceof C1179cE) || (iOException instanceof C1675hL)) {
                    jMin = -9223372036854775807L;
                } else {
                    int i2 = C2679rj.m;
                    Throwable cause = iOException;
                    while (true) {
                        if (cause == null) {
                            jMin = Math.min((i - 1) * 1000, 5000);
                        } else if ((cause instanceof C2679rj) && ((C2679rj) cause).l == 2008) {
                            jMin = -9223372036854775807L;
                        } else {
                            cause = cause.getCause();
                        }
                    }
                }
                ZK zk = jMin == -9223372036854775807L ? Na0.u : new ZK(0, jMin, false);
                c1122bj.r.D(c0991aL, c3143wX.n, iOException, !zk.a());
                return zk;
            default:
                C3143wX c3143wX2 = (C3143wX) interfaceC1479fL;
                c1122bj.getClass();
                long j2 = c3143wX2.l;
                Uri uri2 = c3143wX2.f1093o.n;
                c1122bj.r.D(new C0991aL(), c3143wX2.n, iOException, true);
                c1122bj.n.getClass();
                AP.g("Failed to resolve time offset.", iOException);
                c1122bj.u(true);
                return Na0.t;
        }
    }

    @Override // o.InterfaceC1284dL
    public void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        switch (this.l) {
            case 2:
                C3143wX c3143wX = (C3143wX) interfaceC1479fL;
                C1122bj c1122bj = this.m;
                c1122bj.getClass();
                long j3 = c3143wX.l;
                Uri uri = c3143wX.f1093o.n;
                C0991aL c0991aL = new C0991aL();
                c1122bj.n.getClass();
                c1122bj.r.A(c0991aL, c3143wX.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                C0733Ri c0733Ri = (C0733Ri) c3143wX.q;
                C0733Ri c0733Ri2 = c1122bj.I;
                int size = c0733Ri2 == null ? 0 : c0733Ri2.m.size();
                long j4 = c0733Ri.b(0).b;
                int i = 0;
                while (i < size && c1122bj.I.b(i).b < j4) {
                    i++;
                }
                if (c0733Ri.d) {
                    if (size - i > c0733Ri.m.size()) {
                        AP.z();
                    } else {
                        long j5 = c1122bj.O;
                        if (j5 == -9223372036854775807L || c0733Ri.h * 1000 > j5) {
                            c1122bj.N = 0;
                        } else {
                            AP.z();
                        }
                    }
                    int i2 = c1122bj.N;
                    c1122bj.N = i2 + 1;
                    if (i2 < c1122bj.n.v(c3143wX.n)) {
                        c1122bj.E.postDelayed(c1122bj.w, Math.min((c1122bj.N - 1) * 1000, 5000));
                        return;
                    } else {
                        c1122bj.D = new C0811Ui();
                        return;
                    }
                }
                c1122bj.I = c0733Ri;
                c1122bj.J = c0733Ri.d & c1122bj.J;
                c1122bj.K = j - j2;
                c1122bj.L = j;
                synchronized (c1122bj.u) {
                    try {
                        if (c3143wX.m.a == c1122bj.G) {
                            Uri uri2 = c1122bj.I.k;
                            if (uri2 == null) {
                                uri2 = c3143wX.f1093o.n;
                            }
                            c1122bj.G = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (size != 0) {
                    c1122bj.P += i;
                    c1122bj.u(true);
                    return;
                }
                C0733Ri c0733Ri3 = c1122bj.I;
                if (!c0733Ri3.d) {
                    c1122bj.u(true);
                    return;
                }
                C2658rX c2658rX = c0733Ri3.i;
                if (c2658rX == null) {
                    c1122bj.t();
                    return;
                }
                String str = c2658rX.b;
                if (Lr0.a(str, "urn:mpeg:dash:utc:direct:2014") || Lr0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        c1122bj.M = Lr0.N(c2658rX.c) - c1122bj.L;
                        c1122bj.u(true);
                        return;
                    } catch (C2949uX e) {
                        AP.g("Failed to resolve time offset.", e);
                        c1122bj.u(true);
                        return;
                    }
                }
                if (Lr0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || Lr0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    C3143wX c3143wX2 = new C3143wX(c1122bj.A, Uri.parse(c2658rX.c), 5, new C1024aj());
                    c1122bj.B.S(c3143wX2, new C0915Yi(c1122bj, 4), 1);
                    c1122bj.r.G(new C0991aL(c3143wX2.m), c3143wX2.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (Lr0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Lr0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    C3143wX c3143wX3 = new C3143wX(c1122bj.A, Uri.parse(c2658rX.c), 5, new C0622Nb(7));
                    c1122bj.B.S(c3143wX3, new C0915Yi(c1122bj, 4), 1);
                    c1122bj.r.G(new C0991aL(c3143wX3.m), c3143wX3.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (Lr0.a(str, "urn:mpeg:dash:utc:ntp:2014") || Lr0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    c1122bj.t();
                    return;
                } else {
                    AP.g("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                    c1122bj.u(true);
                    return;
                }
            default:
                C3143wX c3143wX4 = (C3143wX) interfaceC1479fL;
                C1122bj c1122bj2 = this.m;
                c1122bj2.getClass();
                long j6 = c3143wX4.l;
                Uri uri3 = c3143wX4.f1093o.n;
                C0991aL c0991aL2 = new C0991aL();
                c1122bj2.n.getClass();
                c1122bj2.r.A(c0991aL2, c3143wX4.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                c1122bj2.M = ((Long) c3143wX4.q).longValue() - j;
                c1122bj2.u(true);
                return;
        }
    }
}
