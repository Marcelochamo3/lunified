package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class E3 extends G3 implements Spliterator, Consumer {
    Object f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0212l3 c0212l3 = null;
        while (true) {
            F3 f3D = d();
            if (f3D == F3.NO_MORE) {
                return;
            }
            F3 f3 = F3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (f3D != f3) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (c0212l3 == null) {
                c0212l3 = new C0212l3(i);
            } else {
                c0212l3.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c0212l3)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jB = b(j);
            for (int i2 = 0; i2 < jB; i2++) {
                consumer.accept(c0212l3.b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.B.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.B.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != F3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
