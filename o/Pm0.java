package o;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class Pm0 extends AbstractC1304dc0 {
    public final PH a;
    public final BA b;
    public final Kp0 c;
    public final InterfaceC3274xp0 d;
    public final boolean e;
    public volatile AbstractC3177wp0 f;

    public Pm0(PH ph, BA ba, Kp0 kp0, InterfaceC3274xp0 interfaceC3274xp0, boolean z) {
        this.a = ph;
        this.b = ba;
        this.c = kp0;
        this.d = interfaceC3274xp0;
        this.e = z;
    }

    public static InterfaceC3274xp0 e(Kp0 kp0, PH ph) {
        return new Om0(ph, kp0, kp0.b == kp0.a);
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) {
        PH ph = this.a;
        if (ph == null) {
            return d().a(wh);
        }
        QH qhQ = Pu0.q(wh);
        if (this.e) {
            qhQ.getClass();
            if (qhQ instanceof SH) {
                return null;
            }
        }
        Type type = this.c.b;
        ph.a(qhQ);
        return null;
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) {
        d().b(c1183cI, obj);
    }

    @Override // o.AbstractC1304dc0
    public final AbstractC3177wp0 c() {
        return d();
    }

    public final AbstractC3177wp0 d() {
        AbstractC3177wp0 abstractC3177wp0 = this.f;
        if (abstractC3177wp0 != null) {
            return abstractC3177wp0;
        }
        AbstractC3177wp0 abstractC3177wp0F = this.b.f(this.d, this.c);
        this.f = abstractC3177wp0F;
        return abstractC3177wp0F;
    }
}
