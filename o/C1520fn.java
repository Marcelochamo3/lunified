package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1520fn extends AbstractC1716hn implements InterfaceC1803ii, InterfaceC0473Hh {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(C1520fn.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1217ci f783o;
    public final InterfaceC0473Hh p;
    public Object q;
    public final Object r;

    public C1520fn(AbstractC1217ci abstractC1217ci, InterfaceC0473Hh interfaceC0473Hh) {
        super(-1);
        this.f783o = abstractC1217ci;
        this.p = interfaceC0473Hh;
        this.q = Pu0.a;
        this.r = Ou0.G(interfaceC0473Hh.g());
    }

    @Override // o.AbstractC1716hn
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0704Qf) {
            ((C0704Qf) obj).b.b(cancellationException);
        }
    }

    @Override // o.InterfaceC1803ii
    public final InterfaceC1803ii d() {
        InterfaceC0473Hh interfaceC0473Hh = this.p;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return this.p.g();
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = this.p;
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
        Throwable thA = C2536q80.a(obj);
        Object c0678Pf = thA == null ? obj : new C0678Pf(thA, false);
        AbstractC1217ci abstractC1217ci = this.f783o;
        if (abstractC1217ci.Y()) {
            this.q = c0678Pf;
            this.n = 0;
            abstractC1217ci.W(interfaceC1022aiG, this);
            return;
        }
        AbstractC1918jr abstractC1918jrA = AbstractC1415ej0.a();
        if (abstractC1918jrA.d0()) {
            this.q = c0678Pf;
            this.n = 0;
            abstractC1918jrA.a0(this);
            return;
        }
        abstractC1918jrA.c0(true);
        try {
            InterfaceC1022ai interfaceC1022aiG2 = interfaceC0473Hh.g();
            Object objI = Ou0.I(interfaceC1022aiG2, this.r);
            try {
                interfaceC0473Hh.j(obj);
                Ou0.y(interfaceC1022aiG2, objI);
                while (abstractC1918jrA.f0()) {
                }
            } catch (Throwable th) {
                Ou0.y(interfaceC1022aiG2, objI);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                l(th2, null);
            } finally {
                abstractC1918jrA.Z(true);
            }
        }
    }

    @Override // o.AbstractC1716hn
    public final Object n() {
        Object obj = this.q;
        this.q = Pu0.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f783o + ", " + AbstractC0397Ej.L(this.p) + ']';
    }

    @Override // o.AbstractC1716hn
    public final InterfaceC0473Hh e() {
        return this;
    }
}
