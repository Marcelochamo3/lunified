package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3253xf implements Iterator {
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0289Af f1121o;
    public final /* synthetic */ int p;
    public final /* synthetic */ C0289Af q;

    public C3253xf(C0289Af c0289Af, int i) {
        this.p = i;
        this.q = c0289Af;
        this.f1121o = c0289Af;
        this.l = c0289Af.p;
        this.m = c0289Af.isEmpty() ? -1 : 0;
        this.n = -1;
    }

    public final Object a(int i) {
        switch (this.p) {
            case 0:
                return this.q.i()[i];
            case 1:
                return new C3447zf(this.q, i);
            default:
                return this.q.j()[i];
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0289Af c0289Af = this.f1121o;
        if (c0289Af.p != this.l) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.m;
        this.n = i;
        Object objA = a(i);
        int i2 = this.m + 1;
        if (i2 >= c0289Af.q) {
            i2 = -1;
        }
        this.m = i2;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0289Af c0289Af = this.f1121o;
        int i = c0289Af.p;
        int i2 = this.l;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.n;
        if (i3 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.l = i2 + 32;
        c0289Af.remove(c0289Af.i()[i3]);
        this.m--;
        this.n = -1;
    }
}
