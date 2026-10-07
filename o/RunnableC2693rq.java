package o;

/* JADX INFO: renamed from: o.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2693rq implements Runnable {
    public final /* synthetic */ int l;
    public final P70 m;
    public final /* synthetic */ C2984uq n;

    public /* synthetic */ RunnableC2693rq(C2984uq c2984uq, P70 p70, int i) {
        this.l = i;
        this.n = c2984uq;
        this.m = p70;
    }

    private final void a() {
        Wd0 wd0 = (Wd0) this.m;
        wd0.a.a();
        synchronized (wd0.b) {
            synchronized (this.n) {
                try {
                    C2887tq c2887tq = this.n.l;
                    P70 p70 = this.m;
                    c2887tq.getClass();
                    if (c2887tq.l.contains(new C2790sq(p70, AbstractC0397Ej.h))) {
                        C2984uq c2984uq = this.n;
                        P70 p71 = this.m;
                        c2984uq.getClass();
                        try {
                            ((Wd0) p71).e(c2984uq.E, 5);
                        } catch (Throwable th) {
                            throw new C0829Va(th);
                        }
                    }
                    this.n.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                a();
                return;
            default:
                Wd0 wd0 = (Wd0) this.m;
                wd0.a.a();
                synchronized (wd0.b) {
                    synchronized (this.n) {
                        try {
                            C2887tq c2887tq = this.n.l;
                            P70 p70 = this.m;
                            c2887tq.getClass();
                            if (c2887tq.l.contains(new C2790sq(p70, AbstractC0397Ej.h))) {
                                this.n.G.a();
                                C2984uq c2984uq = this.n;
                                P70 p71 = this.m;
                                c2984uq.getClass();
                                try {
                                    ((Wd0) p71).h(c2984uq.G, c2984uq.C, c2984uq.J);
                                    this.n.j(this.m);
                                } catch (Throwable th) {
                                    throw new C0829Va(th);
                                }
                            }
                            this.n.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
