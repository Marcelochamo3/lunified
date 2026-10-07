package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class X extends AbstractC0206k2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0158b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC0158b abstractC0158b, InterfaceC0236q2 interfaceC0236q2, int i) {
        super(interfaceC0236q2);
        this.b = i;
        this.c = abstractC0158b;
    }

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((IntFunction) ((C0257v) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((Y) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                this.a.accept(((IntUnaryOperator) ((Y) this.c).n).applyAsInt(i));
                return;
            case 3:
                ((C0269y) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((C0261w) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((C0265x) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public void l(long j) {
        switch (this.b) {
            case 5:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }
}
