package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0200j1 extends V2 implements H0, B0 {
    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final H0 a() {
        return this;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.V2, java.util.function.IntConsumer
    public final void accept(int i) {
        super.accept(i);
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final void d(Object obj, int i) {
        super.d((int[]) obj, i);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final Object e() {
        return (int[]) super.e();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final void f(Object obj) {
        super.f((IntConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        clear();
        u(j);
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC0274z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.N spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.V2
    /* JADX INFO: renamed from: x */
    public final j$.util.H spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        AbstractC0274z0.o(this, numArr, i);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.u(this, j, j2);
    }
}
