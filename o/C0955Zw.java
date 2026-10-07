package o;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0955Zw extends AbstractC1150bx {
    public final /* synthetic */ C2133m1 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ AbstractC3045vW c;
    public final /* synthetic */ J1 d;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx e;

    public C0955Zw(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, C2133m1 c2133m1, AtomicReference atomicReference, K1 k1, J1 j1) {
        this.e = abstractComponentCallbacksC1247cx;
        this.a = c2133m1;
        this.b = atomicReference;
        this.c = k1;
        this.d = j1;
    }

    @Override // o.AbstractC1150bx
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.e;
        sb.append(abstractComponentCallbacksC1247cx.p);
        sb.append("_rq#");
        sb.append(abstractComponentCallbacksC1247cx.h0.getAndIncrement());
        String string = sb.toString();
        C2133m1 c2133m1 = this.a;
        c2133m1.getClass();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) c2133m1.m;
        C1442ex c1442ex = abstractComponentCallbacksC1247cx2.G;
        C0834Vf c0834Vf = c1442ex instanceof Q1 ? c1442ex.s.v : abstractComponentCallbacksC1247cx2.P().v;
        c0834Vf.getClass();
        C1478fK c1478fK = abstractComponentCallbacksC1247cx.b0;
        if (c1478fK.d.compareTo(TJ.f532o) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + abstractComponentCallbacksC1247cx + " is attempting to register while current state is " + c1478fK.d + ". LifecycleOwners must call register before they are STARTED.");
        }
        c0834Vf.d(string);
        HashMap map = c0834Vf.c;
        P1 p1 = (P1) map.get(string);
        if (p1 == null) {
            p1 = new P1(c1478fK);
        }
        J1 j1 = this.d;
        AbstractC3045vW abstractC3045vW = this.c;
        M1 m1 = new M1(c0834Vf, string, j1, abstractC3045vW);
        p1.a.a(m1);
        p1.b.add(m1);
        map.put(string, p1);
        this.b.set(new N1(c0834Vf, string, abstractC3045vW, 0));
    }
}
