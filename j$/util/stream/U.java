package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class U extends CountedCompleter {
    private final AbstractC0158b a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final InterfaceC0236q2 e;
    private final U f;
    private L0 g;

    U(U u, Spliterator spliterator, U u2) {
        super(u);
        this.a = u.a;
        this.b = spliterator;
        this.c = u.c;
        this.d = u.d;
        this.e = u.e;
        this.f = u2;
    }

    protected U(AbstractC0158b abstractC0158b, Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        super(null);
        this.a = abstractC0158b;
        this.b = spliterator;
        this.c = AbstractC0173e.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0173e.b() << 1), 1);
        this.e = interfaceC0236q2;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        U u = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            U u2 = new U(u, spliteratorTrySplit, u.f);
            U u3 = new U(u, spliterator, u2);
            u.addToPendingCount(1);
            u3.addToPendingCount(1);
            u.d.put(u2, u3);
            if (u.f != null) {
                u2.addToPendingCount(1);
                if (u.d.replace(u.f, u, u2)) {
                    u.addToPendingCount(-1);
                } else {
                    u2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                u = u2;
                u2 = u3;
            } else {
                u = u3;
            }
            z = !z;
            u2.fork();
        }
        if (u.getPendingCount() > 0) {
            C0223o c0223o = new C0223o(16);
            AbstractC0158b abstractC0158b = u.a;
            D0 d0J = abstractC0158b.J(abstractC0158b.C(spliterator), c0223o);
            u.a.R(spliterator, d0J);
            u.g = d0J.a();
            u.b = null;
        }
        u.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l0 = this.g;
        if (l0 != null) {
            l0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.R(spliterator, this.e);
                this.b = null;
            }
        }
        U u = (U) this.d.remove(this);
        if (u != null) {
            u.tryComplete();
        }
    }
}
