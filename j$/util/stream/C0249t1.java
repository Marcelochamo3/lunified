package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0249t1 extends AbstractC0267x1 implements InterfaceC0221n2 {
    private final double[] h;

    C0249t1(Spliterator spliterator, AbstractC0158b abstractC0158b, double[] dArr) {
        super(spliterator, abstractC0158b, dArr.length);
        this.h = dArr;
    }

    C0249t1(C0249t1 c0249t1, Spliterator spliterator, long j, long j2) {
        super(c0249t1, spliterator, j, j2, c0249t1.h.length);
        this.h = c0249t1.h;
    }

    @Override // j$.util.stream.AbstractC0267x1, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC0267x1
    final AbstractC0267x1 b(Spliterator spliterator, long j, long j2) {
        return new C0249t1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0221n2
    public final /* synthetic */ void p(Double d) {
        AbstractC0274z0.e(this, d);
    }
}
