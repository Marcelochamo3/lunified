package o;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0350Co {
    public final int a;
    public final CP b;
    public final CopyOnWriteArrayList c;

    public C0350Co(CopyOnWriteArrayList copyOnWriteArrayList, int i, CP cp) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = cp;
    }

    public final void a() {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC0298Ao(this, c0324Bo.b, 3));
        }
    }

    public final void b() {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC0298Ao(this, c0324Bo.b, 1));
        }
    }

    public final void c() {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC0298Ao(this, c0324Bo.b, 2));
        }
    }

    public final void d(int i) {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC2976um(this, c0324Bo.b, i, 1));
        }
    }

    public final void e(Exception exc) {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC1169c7(this, c0324Bo.b, exc, 4));
        }
    }

    public final void f() {
        for (C0324Bo c0324Bo : this.c) {
            Lr0.O(c0324Bo.a, new RunnableC0298Ao(this, c0324Bo.b, 0));
        }
    }
}
