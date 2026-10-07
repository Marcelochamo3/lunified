package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0263w1 extends AbstractC0267x1 {
    private final Object[] h;

    C0263w1(Spliterator spliterator, AbstractC0158b abstractC0158b, Object[] objArr) {
        super(spliterator, abstractC0158b, objArr.length);
        this.h = objArr;
    }

    C0263w1(C0263w1 c0263w1, Spliterator spliterator, long j, long j2) {
        super(c0263w1, spliterator, j, j2, c0263w1.h.length);
        this.h = c0263w1.h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC0267x1
    final AbstractC0267x1 b(Spliterator spliterator, long j, long j2) {
        return new C0263w1(this, spliterator, j, j2);
    }
}
