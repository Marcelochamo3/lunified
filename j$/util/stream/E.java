package j$.util.stream;

import j$.util.C0142h;
import j$.util.C0146l;
import j$.util.C0149o;
import j$.util.InterfaceC0151q;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ G w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G a() {
        return w(this.a.filter(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l average() {
        return j$.util.B.j(this.a.average());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G b() {
        return w(this.a.map(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return C0162b3.w(this.a.boxed());
    }

    @Override // j$.util.stream.G
    public final G c(C0153a c0153a) {
        DoubleStream doubleStream = this.a;
        C0153a c0153a2 = new C0153a(7);
        c0153a2.b = c0153a;
        return w(doubleStream.flatMap(c0153a2));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return w(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean f() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l findAny() {
        return j$.util.B.j(this.a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l findFirst() {
        return j$.util.B.j(this.a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC0229p0 g() {
        return C0219n0.w(this.a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC0151q iterator() {
        return C0149o.a(this.a.iterator());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean l() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j) {
        return w(this.a.limit(j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C0162b3.w(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l max() {
        return j$.util.B.j(this.a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l min() {
        return j$.util.B.j(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0178f.w(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream parallel() {
        return C0178f.w(this.a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return w(this.a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G peek(DoubleConsumer doubleConsumer) {
        return w(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream q() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0146l reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.B.j(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream sequential() {
        return C0178f.w(this.a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return w(this.a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j) {
        return w(this.a.skip(j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return w(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.G, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.E spliterator() {
        return j$.util.C.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.G
    public final C0142h summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean u() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0178f.w(this.a.unordered());
    }
}
