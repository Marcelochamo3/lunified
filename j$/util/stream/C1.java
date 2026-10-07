package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class C1 extends W1 implements V1, InterfaceC0231p2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjLongConsumer c;
    final /* synthetic */ BinaryOperator d;

    C1(Supplier supplier, ObjLongConsumer objLongConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.a = this.d.apply(this.a, ((C1) v1).a);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
