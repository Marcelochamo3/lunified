package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Q5 implements Iterator, Map.Entry {
    public int l;
    public int m = -1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S5 f467o;

    public Q5(S5 s5) {
        this.f467o = s5;
        this.l = s5.n - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.m;
        S5 s5 = this.f467o;
        return AbstractC1474fG.b(key, s5.f(i)) && AbstractC1474fG.b(entry.getValue(), s5.j(this.m));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.n) {
            return this.f467o.f(this.m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.n) {
            return this.f467o.j(this.m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.m;
        S5 s5 = this.f467o;
        Object objF = s5.f(i);
        Object objJ = s5.j(this.m);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.m++;
        this.n = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.n) {
            throw new IllegalStateException();
        }
        this.f467o.h(this.m);
        this.m--;
        this.l--;
        this.n = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.n) {
            return this.f467o.i(this.m, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
