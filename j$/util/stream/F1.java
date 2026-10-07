package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class F1 extends AbstractC0274z0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(EnumC0182f3 enumC0182f3, Object obj, Object obj2, Object obj3, int i) {
        super(enumC0182f3);
        this.h = i;
        this.i = obj;
        this.k = obj2;
        this.j = obj3;
    }

    public /* synthetic */ F1(EnumC0182f3 enumC0182f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i) {
        this.h = i;
        this.i = binaryOperator;
        this.k = obj;
        this.j = supplier;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        switch (this.h) {
            case 0:
                return new C1((Supplier) this.j, (ObjLongConsumer) this.k, (BinaryOperator) this.i);
            case 1:
                return new I1((Supplier) this.j, (ObjDoubleConsumer) this.k, (BinaryOperator) this.i);
            case 2:
                return new K1(this.j, (BiFunction) this.k, (BinaryOperator) this.i);
            case 3:
                return new O1((Supplier) this.j, (BiConsumer) this.k, (BiConsumer) this.i);
            default:
                return new S1((Supplier) this.j, (ObjIntConsumer) this.k, (BinaryOperator) this.i);
        }
    }
}
