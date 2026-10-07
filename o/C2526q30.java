package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.q30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2526q30 extends AbstractC2518q implements InterfaceC2622r30, InterfaceC0416Fc {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0416Fc f986o;

    public C2526q30(InterfaceC1022ai interfaceC1022ai, I9 i9) {
        super(interfaceC1022ai, true);
        this.f986o = i9;
    }

    @Override // o.JH
    public final void A(CancellationException cancellationException) {
        this.f986o.f(cancellationException);
        z(cancellationException);
    }

    @Override // o.AbstractC2518q, o.JH, o.AH
    public final boolean a() {
        return super.a();
    }

    @Override // o.Pb0
    public final boolean b(Throwable th) {
        return this.f986o.b(th);
    }

    @Override // o.G50
    public final Object c(InterfaceC0473Hh interfaceC0473Hh) {
        return this.f986o.c(interfaceC0473Hh);
    }

    @Override // o.Pb0
    public final Object e(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return this.f986o.e(obj, interfaceC0473Hh);
    }

    @Override // o.JH, o.AH
    public final void f(CancellationException cancellationException) {
        Object objO = O();
        if (objO instanceof C0678Pf) {
            return;
        }
        if ((objO instanceof HH) && ((HH) objO).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new BH(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // o.AbstractC2518q
    public final void i0(Throwable th, boolean z) {
        if (this.f986o.b(th) || z) {
            return;
        }
        Pu0.m(this.n, th);
    }

    @Override // o.G50
    public final F9 iterator() {
        return this.f986o.iterator();
    }

    @Override // o.AbstractC2518q
    public final void j0(Object obj) {
        this.f986o.b(null);
    }

    @Override // o.G50
    public final Object n() {
        return this.f986o.n();
    }

    @Override // o.Pb0
    public final Object o(Object obj) {
        return this.f986o.o(obj);
    }

    @Override // o.Pb0
    public final boolean r() {
        return this.f986o.r();
    }
}
