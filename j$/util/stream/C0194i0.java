package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0194i0 extends AbstractC0211l2 {
    boolean b;
    C0179f0 c;
    final /* synthetic */ C0199j0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0194i0(C0199j0 c0199j0, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = c0199j0;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.c = new C0179f0(interfaceC0236q3);
    }

    @Override // j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) throws Exception {
        InterfaceC0229p0 interfaceC0229p0 = (InterfaceC0229p0) ((LongFunction) this.d.n).apply(j);
        if (interfaceC0229p0 != null) {
            try {
                boolean z = this.b;
                C0179f0 c0179f0 = this.c;
                if (z) {
                    j$.util.K kSpliterator = interfaceC0229p0.sequential().spliterator();
                    while (!this.a.n() && kSpliterator.tryAdvance((LongConsumer) c0179f0)) {
                    }
                } else {
                    interfaceC0229p0.sequential().forEach(c0179f0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC0229p0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC0229p0 != null) {
            interfaceC0229p0.close();
        }
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
