package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0178f implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    private /* synthetic */ C0178f(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream w(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C0183g) {
            return ((C0183g) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return E.w((DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C0219n0.w((LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? C0162b3.w((java.util.stream.Stream) baseStream) : new C0178f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof C0178f) {
            obj = ((C0178f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return w(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream parallel() {
        return w(this.a.parallel());
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final /* synthetic */ BaseStream sequential() {
        return w(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return w(this.a.unordered());
    }
}
