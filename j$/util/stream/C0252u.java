package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0252u extends AbstractC0201j2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0158b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0252u(AbstractC0158b abstractC0158b, InterfaceC0236q2 interfaceC0236q2, int i) {
        super(interfaceC0236q2);
        this.b = i;
        this.c = abstractC0158b;
    }

    @Override // j$.util.stream.InterfaceC0221n2, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept(((DoubleFunction) ((C0257v) this.c).n).apply(d));
                return;
            case 1:
                ((C0261w) this.c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 2:
                ((C0265x) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C0269y) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                ((C0261w) this.c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                ((DoubleConsumer) ((A) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0201j2, j$.util.stream.InterfaceC0236q2
    public void l(long j) {
        switch (this.b) {
            case 4:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }
}
