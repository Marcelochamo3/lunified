package o;

/* JADX INFO: renamed from: o.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2397on extends EH {
    public final /* synthetic */ int p;
    public final Object q;

    public /* synthetic */ C2397on(int i, Object obj) {
        this.p = i;
        this.q = obj;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        switch (this.p) {
            case 0:
                q((Throwable) obj);
                break;
            case 1:
                q((Throwable) obj);
                break;
            case 2:
                q((Throwable) obj);
                break;
            default:
                q((Throwable) obj);
                break;
        }
        return C2985uq0.a;
    }

    @Override // o.EH
    public final void q(Throwable th) {
        switch (this.p) {
            case 0:
                ((InterfaceC2300nn) this.q).d();
                break;
            case 1:
                ((InterfaceC0412Ey) this.q).b(th);
                break;
            case 2:
                Object objO = p().O();
                boolean z = objO instanceof C0678Pf;
                C1692hb c1692hb = (C1692hb) this.q;
                if (!z) {
                    c1692hb.j(AbstractC1376eG.I(objO));
                } else {
                    c1692hb.j(Jp0.k(((C0678Pf) objO).a));
                }
                break;
            default:
                ((InterfaceC0473Hh) this.q).j(C2985uq0.a);
                break;
        }
    }
}
