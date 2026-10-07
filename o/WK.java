package o;

/* JADX INFO: loaded from: classes.dex */
public final class WK extends XK implements ZJ {
    public final InterfaceC1283dK p;
    public final /* synthetic */ TS q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WK(TS ts, InterfaceC1283dK interfaceC1283dK, C0541Jx c0541Jx) {
        super(ts, c0541Jx);
        this.q = ts;
        this.p = interfaceC1283dK;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        InterfaceC1283dK interfaceC1283dK2 = this.p;
        TJ tj = interfaceC1283dK2.f().d;
        if (tj != TJ.l) {
            TJ tj2 = null;
            while (tj2 != tj) {
                b(e());
                tj2 = tj;
                tj = interfaceC1283dK2.f().d;
            }
            return;
        }
        TS ts = this.q;
        ts.getClass();
        TS.a("removeObserver");
        XK xk = (XK) ts.b.d(this.l);
        if (xk == null) {
            return;
        }
        xk.c();
        xk.b(false);
    }

    @Override // o.XK
    public final void c() {
        this.p.f().f(this);
    }

    @Override // o.XK
    public final boolean d(InterfaceC1283dK interfaceC1283dK) {
        return this.p == interfaceC1283dK;
    }

    @Override // o.XK
    public final boolean e() {
        return this.p.f().d.compareTo(TJ.f532o) >= 0;
    }
}
