package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class I3 extends AbstractC0187g3 {
    @Override // j$.util.stream.AbstractC0187g3
    final void d() {
        C0157a3 c0157a3 = new C0157a3();
        this.h = c0157a3;
        Objects.requireNonNull(c0157a3);
        this.e = this.b.S(new H3(c0157a3, 0));
        this.f = new C0153a(this, 5);
    }

    @Override // j$.util.stream.AbstractC0187g3
    final AbstractC0187g3 e(Spliterator spliterator) {
        return new I3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        H3 h3 = new H3(consumer, 1);
        this.b.R(this.d, h3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            C0157a3 c0157a3 = (C0157a3) this.h;
            long j = this.g;
            if (c0157a3.c != 0) {
                if (j >= c0157a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= c0157a3.c; i++) {
                    long j2 = c0157a3.d[i];
                    Object[] objArr = c0157a3.f[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j >= c0157a3.b) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            obj = c0157a3.e[(int) j];
            consumer.p(obj);
        }
        return zA;
    }
}
