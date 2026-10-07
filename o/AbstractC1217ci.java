package o;

/* JADX INFO: renamed from: o.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1217ci extends r implements InterfaceC0525Jh {
    public static final C1120bi m = new C1120bi(C2691rp.p, E1.s);

    public AbstractC1217ci() {
        super(C2691rp.p);
    }

    public abstract void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable);

    public void X(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        W(interfaceC1022ai, runnable);
    }

    public boolean Y() {
        return !(this instanceof C2501pq0);
    }

    @Override // o.r, o.InterfaceC1022ai
    public final InterfaceC1022ai p(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        boolean z = interfaceC0940Zh instanceof C1120bi;
        C1038aq c1038aq = C1038aq.l;
        if (z) {
            C1120bi c1120bi = (C1120bi) interfaceC0940Zh;
            InterfaceC0940Zh interfaceC0940Zh2 = this.l;
            AbstractC1474fG.j(interfaceC0940Zh2, "key");
            if ((interfaceC0940Zh2 == c1120bi || c1120bi.m == interfaceC0940Zh2) && ((InterfaceC0914Yh) c1120bi.l.b(this)) != null) {
                return c1038aq;
            }
        } else if (C2691rp.p == interfaceC0940Zh) {
            return c1038aq;
        }
        return this;
    }

    @Override // o.r, o.InterfaceC1022ai
    public final InterfaceC0914Yh q(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        if (!(interfaceC0940Zh instanceof C1120bi)) {
            if (C2691rp.p == interfaceC0940Zh) {
                return this;
            }
            return null;
        }
        C1120bi c1120bi = (C1120bi) interfaceC0940Zh;
        InterfaceC0940Zh interfaceC0940Zh2 = this.l;
        AbstractC1474fG.j(interfaceC0940Zh2, "key");
        if (interfaceC0940Zh2 != c1120bi && c1120bi.m != interfaceC0940Zh2) {
            return null;
        }
        InterfaceC0914Yh interfaceC0914Yh = (InterfaceC0914Yh) c1120bi.l.b(this);
        if (interfaceC0914Yh instanceof InterfaceC0914Yh) {
            return interfaceC0914Yh;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0397Ej.r(this);
    }
}
