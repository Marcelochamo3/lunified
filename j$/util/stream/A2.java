package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class A2 extends AbstractC0163c {
    private final AbstractC0158b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f159o;

    A2(A2 a2, Spliterator spliterator) {
        super(a2, spliterator);
        this.j = a2.j;
        this.k = a2.k;
        this.l = a2.l;
        this.m = a2.m;
    }

    A2(AbstractC0158b abstractC0158b, AbstractC0158b abstractC0158b2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC0158b2, spliterator);
        this.j = abstractC0158b;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    private long k(long j) {
        if (this.f159o) {
            return this.n;
        }
        A2 a2 = (A2) this.d;
        A2 a3 = (A2) this.e;
        if (a2 == null || a3 == null) {
            return this.n;
        }
        long jK = a2.k(j);
        return jK >= j ? jK : jK + a3.k(j);
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        if (d()) {
            D0 d0J = this.j.J(EnumC0177e3.SIZED.x(this.j.c) ? this.j.C(this.b) : -1L, this.k);
            InterfaceC0236q2 interfaceC0236q2N = this.j.N(this.a.G(), d0J);
            AbstractC0158b abstractC0158b = this.a;
            abstractC0158b.x(this.b, abstractC0158b.S(interfaceC0236q2N));
            return d0J.a();
        }
        D0 d0J2 = this.j.J(-1L, this.k);
        if (this.l == 0) {
            InterfaceC0236q2 interfaceC0236q2N2 = this.j.N(this.a.G(), d0J2);
            AbstractC0158b abstractC0158b2 = this.a;
            abstractC0158b2.x(this.b, abstractC0158b2.S(interfaceC0236q2N2));
        } else {
            this.a.R(this.b, d0J2);
        }
        L0 l0A = d0J2.a();
        this.n = l0A.count();
        this.f159o = true;
        this.b = null;
        return l0A;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final void h() {
        this.i = true;
        if (this.f159o) {
            f(AbstractC0274z0.K(this.j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final Object j() {
        return AbstractC0274z0.K(this.j.E());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        A2 a2;
        L0 l0I;
        L0 l0H;
        long jMin;
        AbstractC0173e abstractC0173e = this.d;
        if (!(abstractC0173e == null)) {
            this.n = ((A2) abstractC0173e).n + ((A2) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else {
                if (this.n != 0) {
                    l0I = ((A2) this.d).n == 0 ? (L0) ((A2) this.e).c() : AbstractC0274z0.I(this.j.E(), (L0) ((A2) this.d).c(), (L0) ((A2) this.e).c());
                }
                l0H = l0I;
                if (d()) {
                    if (this.m >= 0) {
                        jMin = Math.min(l0H.count(), this.l + this.m);
                    } else {
                        jMin = this.n;
                    }
                    l0H = l0H.h(this.l, jMin, this.k);
                }
                f(l0H);
                this.f159o = true;
            }
            l0I = AbstractC0274z0.K(this.j.E());
            l0H = l0I;
            if (d()) {
                if (this.m >= 0) {
                    jMin = Math.min(l0H.count(), this.l + this.m);
                } else {
                    jMin = this.n;
                }
                l0H = l0H.h(this.l, jMin, this.k);
            }
            f(l0H);
            this.f159o = true;
        }
        if (this.m >= 0 && !d()) {
            long j = this.l + this.m;
            long jK = this.f159o ? this.n : k(j);
            if (jK >= j) {
                i();
            } else {
                A2 a3 = (A2) ((AbstractC0173e) getCompleter());
                Object obj = this;
                while (true) {
                    if (a3 == null) {
                        if (jK >= j) {
                            break;
                        }
                    } else {
                        if (obj == a3.e && (a2 = (A2) a3.d) != null) {
                            jK += a2.k(j);
                            if (jK >= j) {
                                break;
                            }
                        }
                        obj = a3;
                        a3 = (A2) ((AbstractC0173e) a3.getCompleter());
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }
}
