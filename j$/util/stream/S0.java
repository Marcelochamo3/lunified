package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
class S0 extends AbstractC0173e {
    protected final AbstractC0158b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    S0(S0 s0, Spliterator spliterator) {
        super(s0, spliterator);
        this.h = s0.h;
        this.i = s0.i;
        this.j = s0.j;
    }

    S0(AbstractC0158b abstractC0158b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0158b, spliterator);
        this.h = abstractC0158b;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected AbstractC0173e e(Spliterator spliterator) {
        return new S0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0173e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final L0 a() {
        D0 d0 = (D0) this.i.apply(this.h.C(this.b));
        this.h.R(this.b, d0);
        return d0.a();
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0173e abstractC0173e = this.d;
        if (abstractC0173e != null) {
            f((L0) this.j.apply((L0) ((S0) abstractC0173e).c(), (L0) ((S0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
