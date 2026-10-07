package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0442Gc extends AbstractC0520Jc {
    public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(C0442Gc.class, "consumed");
    private volatile int consumed;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G50 f282o;
    public final boolean p;

    public C0442Gc(I9 i9) {
        super(C1038aq.l, -3, 1);
        this.f282o = i9;
        this.p = false;
        this.consumed = 0;
    }

    @Override // o.AbstractC0520Jc, o.InterfaceC1538fw
    public final Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        C2985uq0 c2985uq0 = C2985uq0.a;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (this.m != -3) {
            Object objA = super.a(interfaceC1734hw, interfaceC0473Hh);
            return objA == enumC1706hi ? objA : c2985uq0;
        }
        boolean z = this.p;
        if (z && q.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object objF = Sr0.f(interfaceC1734hw, this.f282o, z, interfaceC0473Hh);
        return objF == enumC1706hi ? objF : c2985uq0;
    }

    @Override // o.AbstractC0520Jc
    public final String b() {
        return "channel=" + this.f282o;
    }

    @Override // o.AbstractC0520Jc
    public final Object c(InterfaceC2622r30 interfaceC2622r30, InterfaceC0473Hh interfaceC0473Hh) {
        Object objF = Sr0.f(new Qb0(interfaceC2622r30), this.f282o, this.p, interfaceC0473Hh);
        return objF == EnumC1706hi.l ? objF : C2985uq0.a;
    }

    @Override // o.AbstractC0520Jc
    public final G50 d(InterfaceC1608gi interfaceC1608gi) {
        if (!this.p || q.getAndSet(this, 1) == 0) {
            return this.m == -3 ? this.f282o : super.d(interfaceC1608gi);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }
}
