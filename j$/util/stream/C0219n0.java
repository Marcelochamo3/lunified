package j$.util.stream;

import j$.util.C0145k;
import j$.util.C0146l;
import j$.util.C0147m;
import j$.util.C0280w;
import j$.util.InterfaceC0282y;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0219n0 implements InterfaceC0229p0 {
    public final /* synthetic */ LongStream a;

    private /* synthetic */ C0219n0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC0229p0 w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0224o0 ? ((C0224o0) longStream).a : new C0219n0(longStream);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 a() {
        return w(this.a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ G asDoubleStream() {
        return E.w(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0146l average() {
        return j$.util.B.j(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 b() {
        return w(this.a.map(null));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ Stream boxed() {
        return C0162b3.w(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 c(C0153a c0153a) {
        LongStream longStream = this.a;
        C0153a c0153a2 = new C0153a(9);
        c0153a2.b = c0153a;
        return w(longStream.flatMap(c0153a2));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 distinct() {
        return w(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C0219n0) {
            obj = ((C0219n0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0147m findAny() {
        return j$.util.B.l(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0147m findFirst() {
        return j$.util.B.l(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ G h() {
        return E.w(this.a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC0229p0, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ InterfaceC0282y iterator() {
        return C0280w.a(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ boolean j() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 limit(long j) {
        return w(this.a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C0162b3.w(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0147m max() {
        return j$.util.B.l(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0147m min() {
        return j$.util.B.l(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ boolean n() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0178f.w(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream parallel() {
        return C0178f.w(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0229p0, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ InterfaceC0229p0 parallel() {
        return w(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 peek(LongConsumer longConsumer) {
        return w(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ C0147m reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.B.l(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ boolean s() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream sequential() {
        return C0178f.w(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0229p0, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ InterfaceC0229p0 sequential() {
        return w(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 skip(long j) {
        return w(this.a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ InterfaceC0229p0 sorted() {
        return w(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC0229p0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.K spliterator() {
        return j$.util.I.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0145k summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0178f.w(this.a.unordered());
    }
}
