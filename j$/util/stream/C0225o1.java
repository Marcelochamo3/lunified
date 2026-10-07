package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0225o1 extends AbstractC0230p1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            L0 l0A = AbstractC0230p1.a(arrayDequeB);
            if (l0A == null) {
                this.a = null;
                return;
            }
            l0A.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        L0 l0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (l0A = AbstractC0230p1.a(this.e)) != null) {
                Spliterator spliterator = l0A.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }
}
