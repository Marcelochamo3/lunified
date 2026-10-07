package o;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: o.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2569qc implements InterfaceC3064vh0 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public C2375oc d;
    public long e;
    public long f;

    public AbstractC2569qc() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new C2375oc(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            C2278nc c2278nc = new C2278nc(0, this);
            C2472pc c2472pc = new C2472pc();
            c2472pc.r = c2278nc;
            arrayDeque.add(c2472pc);
        }
        this.c = new PriorityQueue();
    }

    @Override // o.InterfaceC0553Kj
    public final void b(C3258xh0 c3258xh0) {
        AbstractC0397Ej.c(c3258xh0 == this.d);
        C2375oc c2375oc = (C2375oc) c3258xh0;
        if (c2375oc.j(Integer.MIN_VALUE)) {
            c2375oc.E();
            this.a.add(c2375oc);
        } else {
            long j = this.f;
            this.f = 1 + j;
            c2375oc.v = j;
            this.c.add(c2375oc);
        }
        this.d = null;
    }

    @Override // o.InterfaceC3064vh0
    public final void c(long j) {
        this.e = j;
    }

    @Override // o.InterfaceC0553Kj
    public final Object e() {
        AbstractC0397Ej.f(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C2375oc c2375oc = (C2375oc) arrayDeque.pollFirst();
        this.d = c2375oc;
        return c2375oc;
    }

    public abstract C2665rc f();

    @Override // o.InterfaceC0553Kj
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            C2375oc c2375oc = (C2375oc) priorityQueue.poll();
            int i = Lr0.a;
            c2375oc.E();
            arrayDeque.add(c2375oc);
        }
        C2375oc c2375oc2 = this.d;
        if (c2375oc2 != null) {
            c2375oc2.E();
            arrayDeque.add(c2375oc2);
            this.d = null;
        }
    }

    public abstract void g(C2375oc c2375oc);

    @Override // o.InterfaceC0553Kj
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2472pc d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (!priorityQueue.isEmpty()) {
                C2375oc c2375oc = (C2375oc) priorityQueue.peek();
                int i = Lr0.a;
                if (c2375oc.q > this.e) {
                    break;
                }
                C2375oc c2375oc2 = (C2375oc) priorityQueue.poll();
                boolean zJ = c2375oc2.j(4);
                ArrayDeque arrayDeque2 = this.a;
                if (zJ) {
                    C2472pc c2472pc = (C2472pc) arrayDeque.pollFirst();
                    c2472pc.b(4);
                    c2375oc2.E();
                    arrayDeque2.add(c2375oc2);
                    return c2472pc;
                }
                g(c2375oc2);
                if (i()) {
                    C2665rc c2665rcF = f();
                    C2472pc c2472pc2 = (C2472pc) arrayDeque.pollFirst();
                    c2472pc2.F(c2375oc2.q, c2665rcF, Long.MAX_VALUE);
                    c2375oc2.E();
                    arrayDeque2.add(c2375oc2);
                    return c2472pc2;
                }
                c2375oc2.E();
                arrayDeque2.add(c2375oc2);
            } else {
                break;
            }
        }
        return null;
    }

    public abstract boolean i();

    @Override // o.InterfaceC0553Kj
    public void a() {
    }
}
