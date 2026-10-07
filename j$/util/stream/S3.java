package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class S3 extends AbstractC0163c {
    private final AbstractC0158b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f160o;

    S3(S3 s3, Spliterator spliterator) {
        super(s3, spliterator);
        this.j = s3.j;
        this.k = s3.k;
        this.l = s3.l;
    }

    S3(AbstractC0158b abstractC0158b, AbstractC0158b abstractC0158b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0158b2, spliterator);
        this.j = abstractC0158b;
        this.k = intFunction;
        this.l = EnumC0177e3.ORDERED.u(abstractC0158b2.G());
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        D0 d0J = this.a.J(-1L, this.k);
        InterfaceC0236q2 interfaceC0236q2N = this.j.N(this.a.G(), d0J);
        AbstractC0158b abstractC0158b = this.a;
        boolean zX = abstractC0158b.x(this.b, abstractC0158b.S(interfaceC0236q2N));
        this.n = zX;
        if (zX) {
            i();
        }
        L0 l0A = d0J.a();
        this.m = l0A.count();
        return l0A;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final void h() {
        this.i = true;
        if (this.l && this.f160o) {
            f(AbstractC0274z0.K(this.j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final Object j() {
        return AbstractC0274z0.K(this.j.E());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        S3 s3;
        S3 s4;
        Object objI;
        Object objC;
        AbstractC0173e abstractC0173e = this.d;
        if (abstractC0173e != null) {
            this.n = ((S3) abstractC0173e).n | ((S3) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                objI = AbstractC0274z0.K(this.j.E());
            } else if (this.l) {
                S3 s5 = (S3) this.d;
                if (s5.n) {
                    this.m = s5.m;
                    objI = (L0) s5.c();
                } else {
                    s3 = (S3) this.d;
                    long j = s3.m;
                    s4 = (S3) this.e;
                    this.m = j + s4.m;
                    if (s3.m == 0) {
                        objC = s4.c();
                    } else if (s4.m == 0) {
                        objC = s3.c();
                    } else {
                        objI = AbstractC0274z0.I(this.j.E(), (L0) ((S3) this.d).c(), (L0) ((S3) this.e).c());
                    }
                    objI = (L0) objC;
                }
            } else {
                s3 = (S3) this.d;
                long j2 = s3.m;
                s4 = (S3) this.e;
                this.m = j2 + s4.m;
                if (s3.m == 0) {
                    objC = s4.c();
                } else if (s4.m == 0) {
                    objC = s3.c();
                } else {
                    objI = AbstractC0274z0.I(this.j.E(), (L0) ((S3) this.d).c(), (L0) ((S3) this.e).c());
                }
                objI = (L0) objC;
            }
            f(objI);
        }
        this.f160o = true;
        super.onCompletion(countedCompleter);
    }
}
