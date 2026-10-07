package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class XE extends Aq0 implements ListIterator {
    public final int l;
    public int m;
    public final AbstractC0985aF n;

    public XE(AbstractC0985aF abstractC0985aF, int i) {
        int size = abstractC0985aF.size();
        AbstractC1459f50.i(i, size);
        this.l = size;
        this.m = i;
        this.n = abstractC0985aF;
    }

    public final Object a(int i) {
        return this.n.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.m < this.l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.m > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.m;
        this.m = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.m - 1;
        this.m = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
