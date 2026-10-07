package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.qG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2545qG extends CH {
    public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(C2545qG.class, "_invoked");
    private volatile int _invoked;
    public final InterfaceC0412Ey p;

    public C2545qG(InterfaceC0412Ey interfaceC0412Ey) {
        this.p = interfaceC0412Ey;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        q((Throwable) obj);
        return C2985uq0.a;
    }

    @Override // o.EH
    public final void q(Throwable th) {
        if (q.compareAndSet(this, 0, 1)) {
            this.p.b(th);
        }
    }
}
