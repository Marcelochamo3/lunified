package o;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class I extends J implements RandomAccess {
    public final J m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f316o;

    public I(J j, int i, int i2) {
        AbstractC1474fG.j(j, "list");
        this.m = j;
        this.n = i;
        AbstractC1468fA.d(i, i2, j.a());
        this.f316o = i2 - i;
    }

    @Override // o.Vp0
    public final int a() {
        return this.f316o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f316o;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        return this.m.get(this.n + i);
    }
}
