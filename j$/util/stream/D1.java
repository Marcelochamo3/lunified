package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class D1 extends AbstractC0274z0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(EnumC0182f3 enumC0182f3, Object obj, int i) {
        super(enumC0182f3);
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        switch (this.h) {
            case 0:
                return new U1((LongBinaryOperator) this.i);
            case 1:
                return new G1((DoubleBinaryOperator) this.i);
            case 2:
                return new L1((BinaryOperator) this.i);
            default:
                return new R1((IntBinaryOperator) this.i);
        }
    }
}
