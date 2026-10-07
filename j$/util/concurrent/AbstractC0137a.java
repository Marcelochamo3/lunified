package j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0137a extends p {
    final ConcurrentHashMap i;
    l j;

    AbstractC0137a(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(lVar.b, null, null);
    }
}
