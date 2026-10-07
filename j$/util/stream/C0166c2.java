package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0166c2 extends AbstractC0173e {
    private final AbstractC0274z0 h;

    C0166c2(C0166c2 c0166c2, Spliterator spliterator) {
        super(c0166c2, spliterator);
        this.h = c0166c2.h;
    }

    C0166c2(AbstractC0274z0 abstractC0274z0, AbstractC0158b abstractC0158b, Spliterator spliterator) {
        super(abstractC0158b, spliterator);
        this.h = abstractC0274z0;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        AbstractC0158b abstractC0158b = this.a;
        V1 v1C0 = this.h.c0();
        abstractC0158b.R(this.b, v1C0);
        return v1C0;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new C0166c2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0173e abstractC0173e = this.d;
        if (abstractC0173e != null) {
            V1 v1 = (V1) ((C0166c2) abstractC0173e).c();
            v1.g((V1) ((C0166c2) this.e).c());
            f(v1);
        }
        super.onCompletion(countedCompleter);
    }
}
