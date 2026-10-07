package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0220n1 extends AbstractC0230p1 implements j$.util.N {
    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.N) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            K0 k0 = (K0) AbstractC0230p1.a(arrayDequeB);
            if (k0 == null) {
                this.a = null;
                return;
            }
            k0.f(obj);
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

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        K0 k0;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.N) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (k0 = (K0) AbstractC0230p1.a(this.e)) != null) {
                j$.util.N nSpliterator = k0.spliterator();
                this.d = nSpliterator;
                return nSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
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
