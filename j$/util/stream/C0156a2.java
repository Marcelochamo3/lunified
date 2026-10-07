package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0156a2 extends AbstractC0161b2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b += ((AbstractC0161b2) v1).b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }
}
