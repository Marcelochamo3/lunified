package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0183g implements java.util.stream.BaseStream {
    public final /* synthetic */ BaseStream a;

    private /* synthetic */ C0183g(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ java.util.stream.BaseStream w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C0178f) {
            return ((C0178f) baseStream).a;
        }
        if (baseStream instanceof G) {
            return F.w((G) baseStream);
        }
        if (baseStream instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) baseStream);
        }
        if (baseStream instanceof InterfaceC0229p0) {
            return C0224o0.w((InterfaceC0229p0) baseStream);
        }
        return baseStream instanceof Stream ? Stream.Wrapper.convert((Stream) baseStream) : new C0183g(baseStream);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C0183g) {
            obj = ((C0183g) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return w(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return w(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return w(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return w(this.a.unordered());
    }
}
