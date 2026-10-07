package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class I1 extends W1 implements V1, InterfaceC0221n2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjDoubleConsumer c;
    final /* synthetic */ BinaryOperator d;

    I1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.a = this.d.apply(this.a, ((I1) v1).a);
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

    @Override // j$.util.stream.InterfaceC0221n2
    public final /* synthetic */ void p(Double d) {
        AbstractC0274z0.e(this, d);
    }
}
