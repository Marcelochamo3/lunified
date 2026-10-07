package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class WS extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ YS n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ XS f595o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WS(YS ys, XS xs, int i) {
        super(1);
        this.m = i;
        this.n = ys;
        this.f595o = xs;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                this.n.e(this.f595o.m);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = YS.h;
                XS xs = this.f595o;
                Object obj2 = xs.m;
                YS ys = this.n;
                atomicReferenceFieldUpdater.set(ys, obj2);
                ys.e(xs.m);
                break;
        }
        return C2985uq0.a;
    }
}
