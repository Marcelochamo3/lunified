package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class B1 extends AbstractC0274z0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(EnumC0182f3 enumC0182f3, LongBinaryOperator longBinaryOperator, long j) {
        super(enumC0182f3);
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        return new T1(this.i, this.h);
    }
}
