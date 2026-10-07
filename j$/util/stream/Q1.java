package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class Q1 extends AbstractC0274z0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q1(EnumC0182f3 enumC0182f3, IntBinaryOperator intBinaryOperator, int i) {
        super(enumC0182f3);
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        return new P1(this.i, this.h);
    }
}
