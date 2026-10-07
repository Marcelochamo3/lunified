package o;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q60 extends AbstractC0985aF {
    public final transient Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f468o;
    public final transient int p;

    public Q60(Object[] objArr, int i, int i2) {
        this.n = objArr;
        this.f468o = i;
        this.p = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1459f50.h(i, this.p);
        Object obj = this.n[(i * 2) + this.f468o];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o.UE
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
