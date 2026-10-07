package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1210ce0 extends AbstractC1464f8 {
    public final C2970uj h;
    public final InterfaceC2486pj i;
    public final C0643Nw j;
    public final C0622Nb l;
    public final Vd0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1971kP f720o;
    public InterfaceC2590qm0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public C1210ce0(C1873jP c1873jP, InterfaceC2486pj interfaceC2486pj, C0622Nb c0622Nb) {
        C1483fP c1483fP;
        this.i = interfaceC2486pj;
        this.l = c0622Nb;
        boolean z = true;
        YO yo = new YO();
        C1093bP c1093bP = new C1093bP();
        List listEmptyList = Collections.emptyList();
        M60 m60 = M60.p;
        C1581gP c1581gP = C1581gP.n;
        Uri uri = Uri.EMPTY;
        String string = c1873jP.l.toString();
        string.getClass();
        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(AbstractC0985aF.q(c1873jP));
        if (c1093bP.b != null && c1093bP.a == null) {
            z = false;
        }
        AbstractC0397Ej.f(z);
        if (uri != null) {
            c1483fP = new C1483fP(uri, null, c1093bP.a != null ? new C1190cP(c1093bP) : null, null, listEmptyList, null, abstractC0985aFL, null);
        } else {
            c1483fP = null;
        }
        C1971kP c1971kP = new C1971kP(string, new C0995aP(yo), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C2263nP.T, c1581gP);
        this.f720o = c1971kP;
        C0617Mw c0617Mw = new C0617Mw();
        String str = c1873jP.m;
        c0617Mw.k = str == null ? "text/x-unknown" : str;
        c0617Mw.c = c1873jP.n;
        c0617Mw.d = c1873jP.f844o;
        c0617Mw.e = c1873jP.p;
        c0617Mw.b = c1873jP.q;
        String str2 = c1873jP.r;
        c0617Mw.a = str2 != null ? str2 : null;
        this.j = new C0643Nw(c0617Mw);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri2 = c1873jP.l;
        AbstractC0397Ej.h(uri2, "The uri must be set.");
        this.h = new C2970uj(uri2, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.n = new Vd0(-9223372036854775807L, true, false, c1971kP);
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        InterfaceC2590qm0 interfaceC2590qm0 = this.p;
        C2613qy c2613qyA = a(cp);
        return new C1113be0(this.h, this.i, interfaceC2590qm0, this.j, this.k, this.l, c2613qyA, this.m);
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        return this.f720o;
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.p = interfaceC2590qm0;
        m(this.n);
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        ((C1113be0) interfaceC2941uP).t.Q(null);
    }

    @Override // o.AbstractC1464f8
    public final void j() {
    }

    @Override // o.AbstractC1464f8
    public final void p() {
    }
}
