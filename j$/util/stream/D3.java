package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class D3 extends G3 implements j$.util.N {
    protected abstract void e(Object obj);

    protected abstract AbstractC0207k3 f(int i);

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0207k3 abstractC0207k3F = null;
        while (true) {
            F3 f3D = d();
            if (f3D == F3.NO_MORE) {
                return;
            }
            F3 f3 = F3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (f3D != f3) {
                ((j$.util.N) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (abstractC0207k3F == null) {
                abstractC0207k3F = f(i);
            } else {
                abstractC0207k3F.b = 0;
            }
            long j = 0;
            while (((j$.util.N) spliterator).tryAdvance(abstractC0207k3F)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                abstractC0207k3F.b(obj, b(j));
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != F3.NO_MORE && ((j$.util.N) this.a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
