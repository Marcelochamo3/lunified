package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0171d2 extends AbstractC0216m2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;
    final /* synthetic */ AbstractC0158b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171d2(A a, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.e = a;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.d = new C0242s(interfaceC0236q3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171d2(Y y, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.e = y;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.d = new W(interfaceC0236q3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171d2(C0199j0 c0199j0, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.e = c0199j0;
        InterfaceC0236q2 interfaceC0236q3 = this.a;
        Objects.requireNonNull(interfaceC0236q3);
        this.d = new C0179f0(interfaceC0236q3);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                InterfaceC0229p0 interfaceC0229p0 = (InterfaceC0229p0) ((Function) ((C0199j0) this.e).n).apply(obj);
                if (interfaceC0229p0 != null) {
                    try {
                        boolean z = this.c;
                        C0179f0 c0179f0 = (C0179f0) this.d;
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
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC0229p0 != null) {
                    interfaceC0229p0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((Function) ((Y) this.e).n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        W w = (W) this.d;
                        if (z2) {
                            j$.util.H hSpliterator = intStream.sequential().spliterator();
                            while (!this.a.n() && hSpliterator.tryAdvance((IntConsumer) w)) {
                            }
                        } else {
                            intStream.sequential().forEach(w);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                G g = (G) ((Function) ((A) this.e).n).apply(obj);
                if (g != null) {
                    try {
                        boolean z3 = this.c;
                        C0242s c0242s = (C0242s) this.d;
                        if (z3) {
                            j$.util.E eSpliterator = g.sequential().spliterator();
                            while (!this.a.n() && eSpliterator.tryAdvance((DoubleConsumer) c0242s)) {
                            }
                        } else {
                            g.sequential().forEach(c0242s);
                        }
                    } catch (Throwable th5) {
                        try {
                            g.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (g != null) {
                    g.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.n();
    }
}
