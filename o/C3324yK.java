package o;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3324yK implements ListIterator, InterfaceC1770iI {
    public final C3421zK l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1132o;

    public C3324yK(C3421zK c3421zK, int i) {
        AbstractC1474fG.j(c3421zK, "list");
        this.l = c3421zK;
        this.m = i;
        this.n = -1;
        this.f1132o = ((AbstractList) c3421zK).modCount;
    }

    public final void a() {
        if (((AbstractList) this.l).modCount != this.f1132o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.m;
        this.m = i + 1;
        C3421zK c3421zK = this.l;
        c3421zK.add(i, obj);
        this.n = -1;
        this.f1132o = ((AbstractList) c3421zK).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.l.n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.m > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.m;
        C3421zK c3421zK = this.l;
        if (i >= c3421zK.n) {
            throw new NoSuchElementException();
        }
        this.m = i + 1;
        this.n = i;
        return c3421zK.l[c3421zK.m + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.m;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.m = i2;
        this.n = i2;
        C3421zK c3421zK = this.l;
        return c3421zK.l[c3421zK.m + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.m - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.n;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        C3421zK c3421zK = this.l;
        c3421zK.d(i);
        this.m = this.n;
        this.n = -1;
        this.f1132o = ((AbstractList) c3421zK).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.n;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.l.set(i, obj);
    }
}
