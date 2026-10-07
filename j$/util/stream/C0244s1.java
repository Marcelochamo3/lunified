package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0244s1 extends X2 implements J0, C0 {
    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final J0 a() {
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

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.X2, java.util.function.LongConsumer
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
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
        super.d((long[]) obj, i);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final Object e() {
        return (long[]) super.e();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final void f(Object obj) {
        super.f((LongConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        clear();
        u(j);
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

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.N spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.X2, j$.util.stream.Z2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.X2
    /* JADX INFO: renamed from: x */
    public final j$.util.K spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        AbstractC0274z0.p(this, lArr, i);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ J0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.v(this, j, j2);
    }
}
