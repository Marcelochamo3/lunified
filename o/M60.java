package o;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class M60 extends AbstractC0985aF {
    public static final M60 p = new M60(0, new Object[0]);
    public final transient Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f392o;

    public M60(int i, Object[] objArr) {
        this.n = objArr;
        this.f392o = i;
    }

    @Override // o.AbstractC0985aF, o.UE
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.n;
        int i2 = this.f392o;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // o.UE
    public final Object[] e() {
        return this.n;
    }

    @Override // o.UE
    public final int f() {
        return this.f392o;
    }

    @Override // o.UE
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1459f50.h(i, this.f392o);
        Object obj = this.n[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o.UE
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f392o;
    }
}
