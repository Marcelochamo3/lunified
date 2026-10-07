package o;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class H30 extends AbstractC1464f8 {
    public final C1971kP h;
    public final C1483fP i;
    public final InterfaceC2486pj j;
    public final C2278nc k;
    public final InterfaceC0428Fo l;
    public final C0622Nb m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f293o;
    public long p;
    public boolean q;
    public boolean r;
    public InterfaceC2590qm0 s;

    public H30(C1971kP c1971kP, InterfaceC2486pj interfaceC2486pj, C2278nc c2278nc, InterfaceC0428Fo interfaceC0428Fo, C0622Nb c0622Nb, int i) {
        C1483fP c1483fP = c1971kP.m;
        c1483fP.getClass();
        this.i = c1483fP;
        this.h = c1971kP;
        this.j = interfaceC2486pj;
        this.k = c2278nc;
        this.l = interfaceC0428Fo;
        this.m = c0622Nb;
        this.n = i;
        this.f293o = true;
        this.p = -9223372036854775807L;
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        InterfaceC2583qj interfaceC2583qjH = this.j.H();
        InterfaceC2590qm0 interfaceC2590qm0 = this.s;
        if (interfaceC2590qm0 != null) {
            interfaceC2583qjH.k(interfaceC2590qm0);
        }
        C1483fP c1483fP = this.i;
        Uri uri = c1483fP.l;
        AbstractC0397Ej.g(this.g);
        return new E30(uri, interfaceC2583qjH, new Na0((InterfaceC0380Ds) this.k.m), this.l, new C0350Co(this.d.c, 0, cp), this.m, a(cp), this, c1562g8, c1483fP.q, this.n);
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        return this.h;
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.s = interfaceC2590qm0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        InterfaceC0428Fo interfaceC0428Fo = this.l;
        interfaceC0428Fo.d(looperMyLooper, c3436zZ);
        interfaceC0428Fo.r();
        s();
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        E30 e30 = (E30) interfaceC2941uP;
        if (e30.G) {
            for (C90 c90 : e30.D) {
                c90.i();
                InterfaceC3465zo interfaceC3465zo = c90.h;
                if (interfaceC3465zo != null) {
                    interfaceC3465zo.d(c90.e);
                    c90.h = null;
                    c90.g = null;
                }
            }
        }
        e30.v.Q(e30);
        e30.A.removeCallbacksAndMessages(null);
        e30.B = null;
        e30.W = true;
    }

    @Override // o.AbstractC1464f8
    public final void p() {
        this.l.a();
    }

    public final void s() {
        Fj0 vd0 = new Vd0(this.p, this.q, this.r, this.h);
        if (this.f293o) {
            vd0 = new F30(vd0);
        }
        m(vd0);
    }

    public final void t(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.p;
        }
        if (!this.f293o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.f293o = false;
        s();
    }

    @Override // o.AbstractC1464f8
    public final void j() {
    }
}
