package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0254u1 extends AbstractC0267x1 implements InterfaceC0226o2 {
    private final int[] h;

    C0254u1(Spliterator spliterator, AbstractC0158b abstractC0158b, int[] iArr) {
        super(spliterator, abstractC0158b, iArr.length);
        this.h = iArr;
    }

    C0254u1(C0254u1 c0254u1, Spliterator spliterator, long j, long j2) {
        super(c0254u1, spliterator, j, j2, c0254u1.h.length);
        this.h = c0254u1.h;
    }

    @Override // j$.util.stream.AbstractC0267x1, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC0267x1
    final AbstractC0267x1 b(Spliterator spliterator, long j, long j2) {
        return new C0254u1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }
}
