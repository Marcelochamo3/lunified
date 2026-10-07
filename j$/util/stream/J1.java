package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class J1 extends AbstractC0274z0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(EnumC0182f3 enumC0182f3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        super(enumC0182f3);
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        return new E1(this.i, this.h);
    }
}
