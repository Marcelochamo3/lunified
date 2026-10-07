package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class R3 extends AbstractC0173e {
    private final AbstractC0158b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    R3(R3 r3, Spliterator spliterator) {
        super(r3, spliterator);
        this.h = r3.h;
        this.i = r3.i;
        this.j = r3.j;
    }

    R3(AbstractC0158b abstractC0158b, AbstractC0158b abstractC0158b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0158b2, spliterator);
        this.h = abstractC0158b;
        this.i = intFunction;
        this.j = EnumC0177e3.ORDERED.u(abstractC0158b2.G());
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        boolean z = !d();
        D0 d0J = this.a.J((z && this.j && EnumC0177e3.SIZED.x(this.h.c)) ? this.h.C(this.b) : -1L, this.i);
        Q3 q3 = (Q3) this.h;
        boolean z2 = this.j && z;
        q3.getClass();
        P3 p3 = new P3(q3, d0J, z2);
        this.a.R(this.b, p3);
        L0 l0A = d0J.a();
        this.k = l0A.count();
        this.l = p3.b;
        return l0A;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l0I;
        Object objC;
        L0 l0H;
        AbstractC0173e abstractC0173e = this.d;
        if (abstractC0173e != null) {
            if (this.j) {
                R3 r3 = (R3) abstractC0173e;
                long j = r3.l;
                this.l = j;
                if (j == r3.k) {
                    this.l = j + ((R3) this.e).l;
                }
            }
            R3 r4 = (R3) abstractC0173e;
            long j2 = r4.k;
            R3 r5 = (R3) this.e;
            this.k = j2 + r5.k;
            if (r4.k == 0) {
                objC = r5.c();
            } else {
                if (r5.k == 0) {
                    objC = r4.c();
                } else {
                    l0I = AbstractC0274z0.I(this.h.E(), (L0) ((R3) this.d).c(), (L0) ((R3) this.e).c());
                }
                l0H = l0I;
                if (d() && this.j) {
                    l0H = l0H.h(this.l, l0H.count(), this.i);
                }
                f(l0H);
            }
            l0I = (L0) objC;
            l0H = l0I;
            if (d()) {
                l0H = l0H.h(this.l, l0H.count(), this.i);
            }
            f(l0H);
        }
        super.onCompletion(countedCompleter);
    }
}
