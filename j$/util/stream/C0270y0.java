package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0270y0 extends AbstractC0163c {
    private final C0266x0 j;

    C0270y0(C0266x0 c0266x0, AbstractC0158b abstractC0158b, Spliterator spliterator) {
        super(abstractC0158b, spliterator);
        this.j = c0266x0;
    }

    C0270y0(C0270y0 c0270y0, Spliterator spliterator) {
        super(c0270y0, spliterator);
        this.j = c0270y0.j;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        AbstractC0158b abstractC0158b = this.a;
        AbstractC0258v0 abstractC0258v0 = (AbstractC0258v0) this.j.b.get();
        abstractC0158b.R(this.b, abstractC0258v0);
        boolean z = abstractC0258v0.b;
        if (z == this.j.a.b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new C0270y0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final Object j() {
        return Boolean.valueOf(!this.j.a.b);
    }
}
