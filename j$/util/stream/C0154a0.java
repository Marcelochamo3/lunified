package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0154a0 extends AbstractC0206k2 {
    boolean b;
    W c;
    final /* synthetic */ Y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0154a0(Y y, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = y;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.c = new W(interfaceC0236q3);
    }

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((IntFunction) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                W w = this.c;
                if (z) {
                    j$.util.H hSpliterator = intStream.sequential().spliterator();
                    while (!this.a.n() && hSpliterator.tryAdvance((IntConsumer) w)) {
                    }
                } else {
                    intStream.sequential().forEach(w);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
