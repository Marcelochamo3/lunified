package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class XS implements InterfaceC1594gb, InterfaceC1927jv0 {
    public final C1692hb l;
    public final Object m;
    public final /* synthetic */ YS n;

    public XS(YS ys, C1692hb c1692hb, Object obj) {
        this.n = ys;
        this.l = c1692hb;
        this.m = obj;
    }

    @Override // o.InterfaceC1594gb
    public final boolean a() {
        return this.l.a();
    }

    @Override // o.InterfaceC1927jv0
    public final void b(AbstractC3440zb0 abstractC3440zb0, int i) {
        this.l.b(abstractC3440zb0, i);
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return this.l.p;
    }

    @Override // o.InterfaceC1594gb
    public final void h(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        C2985uq0 c2985uq0 = C2985uq0.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = YS.h;
        Object obj2 = this.m;
        YS ys = this.n;
        atomicReferenceFieldUpdater.set(ys, obj2);
        this.l.h(c2985uq0, new WS(ys, this, 0));
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        this.l.j(obj);
    }

    @Override // o.InterfaceC1594gb
    public final J2 k(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        YS ys = this.n;
        WS ws = new WS(ys, this, 1);
        J2 j2I = this.l.I((C2985uq0) obj, ws);
        if (j2I != null) {
            YS.h.set(ys, this.m);
        }
        return j2I;
    }

    @Override // o.InterfaceC1594gb
    public final void m(AbstractC1217ci abstractC1217ci) {
        this.l.m(abstractC1217ci);
    }

    @Override // o.InterfaceC1594gb
    public final J2 s(Throwable th) {
        return this.l.s(th);
    }

    @Override // o.InterfaceC1594gb
    public final void u(Object obj) {
        this.l.u(obj);
    }
}
