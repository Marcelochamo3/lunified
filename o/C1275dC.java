package o;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: o.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1275dC extends AbstractC1464f8 implements InterfaceC2153mC {
    public final UB h;
    public final C1483fP i;
    public final C2681rk j;
    public final C0622Nb k;
    public final InterfaceC0428Fo l;
    public final C0622Nb m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f734o;
    public final boolean p;
    public final C0683Pk q;
    public final long r;
    public final C1971kP s;
    public final long t;
    public C1385eP u;
    public InterfaceC2590qm0 v;

    static {
        AbstractC1726hs.a("goog.exo.hls");
    }

    public C1275dC(C1971kP c1971kP, C2681rk c2681rk, O9 o9, C0622Nb c0622Nb, InterfaceC0428Fo interfaceC0428Fo, C0622Nb c0622Nb2, C0683Pk c0683Pk, long j, boolean z, int i) {
        C1483fP c1483fP = c1971kP.m;
        c1483fP.getClass();
        this.i = c1483fP;
        this.s = c1971kP;
        this.u = c1971kP.n;
        this.j = c2681rk;
        this.h = o9;
        this.k = c0622Nb;
        this.l = interfaceC0428Fo;
        this.m = c0622Nb2;
        this.q = c0683Pk;
        this.r = j;
        this.n = z;
        this.f734o = i;
        this.p = false;
        this.t = 0L;
    }

    public static XB s(AbstractC0985aF abstractC0985aF, long j) {
        XB xb = null;
        for (int i = 0; i < abstractC0985aF.size(); i++) {
            XB xb2 = (XB) abstractC0985aF.get(i);
            long j2 = xb2.p;
            if (j2 > j || !xb2.w) {
                if (j2 > j) {
                    break;
                }
            } else {
                xb = xb2;
            }
        }
        return xb;
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        C2613qy c2613qyA = a(cp);
        C0350Co c0350Co = new C0350Co(this.d.c, 0, cp);
        InterfaceC2590qm0 interfaceC2590qm0 = this.v;
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        return new WB(this.h, this.q, this.j, interfaceC2590qm0, this.l, c0350Co, this.m, c2613qyA, c1562g8, this.k, this.n, this.f734o, this.p, c3436zZ, this.t);
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        return this.s;
    }

    @Override // o.AbstractC1464f8
    public final void j() throws IOException {
        C0683Pk c0683Pk = this.q;
        Na0 na0 = c0683Pk.r;
        if (na0 != null) {
            na0.a();
        }
        Uri uri = c0683Pk.v;
        if (uri != null) {
            C0657Ok c0657Ok = (C0657Ok) c0683Pk.f461o.get(uri);
            c0657Ok.m.a();
            IOException iOException = c0657Ok.u;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.v = interfaceC2590qm0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        InterfaceC0428Fo interfaceC0428Fo = this.l;
        interfaceC0428Fo.d(looperMyLooper, c3436zZ);
        interfaceC0428Fo.r();
        C2613qy c2613qyA = a(null);
        Uri uri = this.i.l;
        C0683Pk c0683Pk = this.q;
        c0683Pk.getClass();
        c0683Pk.s = Lr0.n(null);
        c0683Pk.q = c2613qyA;
        c0683Pk.t = this;
        C3143wX c3143wX = new C3143wX(c0683Pk.l.a.H(), uri, 4, c0683Pk.m.P());
        AbstractC0397Ej.f(c0683Pk.r == null);
        Na0 na0 = new Na0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c0683Pk.r = na0;
        C0622Nb c0622Nb = c0683Pk.n;
        int i = c3143wX.n;
        na0.S(c3143wX, c0683Pk, c0622Nb.v(i));
        c2613qyA.G(new C0991aL(c3143wX.m), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        WB wb = (WB) interfaceC2941uP;
        wb.m.p.remove(wb);
        for (C2637rC c2637rC : wb.G) {
            if (c2637rC.O) {
                for (C2541qC c2541qC : c2637rC.G) {
                    c2541qC.i();
                    InterfaceC3465zo interfaceC3465zo = c2541qC.h;
                    if (interfaceC3465zo != null) {
                        interfaceC3465zo.d(c2541qC.e);
                        c2541qC.h = null;
                        c2541qC.g = null;
                    }
                }
            }
            c2637rC.u.Q(c2637rC);
            c2637rC.C.removeCallbacksAndMessages(null);
            c2637rC.S = true;
            c2637rC.D.clear();
        }
        wb.D = null;
    }

    @Override // o.AbstractC1464f8
    public final void p() {
        C0683Pk c0683Pk = this.q;
        c0683Pk.v = null;
        c0683Pk.w = null;
        c0683Pk.u = null;
        c0683Pk.y = -9223372036854775807L;
        c0683Pk.r.Q(null);
        c0683Pk.r = null;
        HashMap map = c0683Pk.f461o;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0657Ok) it.next()).m.Q(null);
        }
        c0683Pk.s.removeCallbacksAndMessages(null);
        c0683Pk.s = null;
        map.clear();
        this.l.a();
    }

    public final void t(C1177cC c1177cC) {
        long j;
        Vd0 vd0;
        long j2;
        long jK;
        long j3;
        boolean z = c1177cC.p;
        long j4 = c1177cC.h;
        long jX = z ? Lr0.X(j4) : -9223372036854775807L;
        int i = c1177cC.d;
        long j5 = (i == 2 || i == 1) ? jX : -9223372036854775807L;
        C0683Pk c0683Pk = this.q;
        c0683Pk.u.getClass();
        C0519Jb c0519Jb = new C0519Jb(27);
        boolean z2 = c0683Pk.x;
        long j6 = c1177cC.u;
        AbstractC0985aF abstractC0985aF = c1177cC.r;
        boolean z3 = c1177cC.g;
        long j7 = jX;
        long jK2 = c1177cC.e;
        if (z2) {
            long j8 = j5;
            long j9 = j4 - c0683Pk.y;
            boolean z4 = c1177cC.f710o;
            long j10 = z4 ? j9 + j6 : -9223372036854775807L;
            long jK3 = z ? Lr0.K(Lr0.w(this.r)) - (j4 + j6) : 0L;
            long j11 = this.u.l;
            C1080bC c1080bC = c1177cC.v;
            if (j11 != -9223372036854775807L) {
                jK = Lr0.K(j11);
            } else {
                if (jK2 != -9223372036854775807L) {
                    j2 = j6 - jK2;
                } else {
                    long j12 = c1080bC.d;
                    if (j12 == -9223372036854775807L || c1177cC.n == -9223372036854775807L) {
                        j2 = c1080bC.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c1177cC.m;
                        }
                    } else {
                        j2 = j12;
                    }
                }
                jK = j2 + jK3;
            }
            long j13 = j6 + jK3;
            long jK4 = Lr0.k(jK, jK3, j13);
            C1385eP c1385eP = this.s.n;
            boolean z5 = c1385eP.f752o == -3.4028235E38f && c1385eP.p == -3.4028235E38f && c1080bC.c == -9223372036854775807L && c1080bC.d == -9223372036854775807L;
            long jX2 = Lr0.X(jK4);
            this.u = new C1385eP(jX2, -9223372036854775807L, -9223372036854775807L, z5 ? 1.0f : this.u.f752o, z5 ? 1.0f : this.u.p);
            if (jK2 == -9223372036854775807L) {
                jK2 = j13 - Lr0.K(jX2);
            }
            if (z3) {
                j3 = jK2;
            } else {
                XB xbS = s(c1177cC.s, jK2);
                if (xbS != null) {
                    j3 = xbS.p;
                } else if (abstractC0985aF.isEmpty()) {
                    j3 = 0;
                } else {
                    ZB zb = (ZB) abstractC0985aF.get(Lr0.c(abstractC0985aF, Long.valueOf(jK2), true));
                    XB xbS2 = s(zb.x, jK2);
                    j3 = xbS2 != null ? xbS2.p : zb.p;
                }
            }
            boolean z6 = i == 2 && c1177cC.f;
            long j14 = j10;
            vd0 = new Vd0(j8, j7, j14, c1177cC.u, j9, j3, true, !z4, z6, c0519Jb, this.s, this.u);
        } else {
            long j15 = j5;
            if (jK2 == -9223372036854775807L || abstractC0985aF.isEmpty()) {
                j = 0;
            } else {
                j = (z3 || jK2 == j6) ? jK2 : ((ZB) abstractC0985aF.get(Lr0.c(abstractC0985aF, Long.valueOf(jK2), true))).p;
            }
            C1971kP c1971kP = this.s;
            long j16 = c1177cC.u;
            vd0 = new Vd0(j15, j7, j16, j16, 0L, j, true, false, true, c0519Jb, c1971kP, null);
        }
        m(vd0);
    }
}
