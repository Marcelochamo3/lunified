package o;

/* JADX INFO: renamed from: o.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3362yl extends Q90 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3362yl f1136o = new C3362yl(Bi0.c, Bi0.d, Bi0.e, Bi0.a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o.AbstractC1217ci
    public final String toString() {
        return "Dispatchers.Default";
    }
}
