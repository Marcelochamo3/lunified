package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0273z extends AbstractC0201j2 {
    boolean b;
    C0242s c;
    final /* synthetic */ A d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0273z(A a, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = a;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.c = new C0242s(interfaceC0236q3);
    }

    @Override // j$.util.stream.InterfaceC0221n2, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) throws Exception {
        G g = (G) ((DoubleFunction) this.d.n).apply(d);
        if (g != null) {
            try {
                boolean z = this.b;
                C0242s c0242s = this.c;
                if (z) {
                    j$.util.E eSpliterator = g.sequential().spliterator();
                    while (!this.a.n() && eSpliterator.tryAdvance((DoubleConsumer) c0242s)) {
                    }
                } else {
                    g.sequential().forEach(c0242s);
                }
            } catch (Throwable th) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (g != null) {
            g.close();
        }
    }

    @Override // j$.util.stream.AbstractC0201j2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0201j2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
