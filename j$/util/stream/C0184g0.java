package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0184g0 extends AbstractC0211l2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0158b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0184g0(AbstractC0158b abstractC0158b, InterfaceC0236q2 interfaceC0236q2, int i) {
        super(interfaceC0236q2);
        this.b = i;
        this.c = abstractC0158b;
    }

    @Override // j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((LongFunction) ((C0257v) this.c).n).apply(j));
                return;
            case 1:
                ((C0269y) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C0265x) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C0261w) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C0269y) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C0199j0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
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
