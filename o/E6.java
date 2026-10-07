package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class E6 implements Iterator {
    public int l;
    public int m = 0;
    public final /* synthetic */ F6 n;

    public E6(F6 f6) {
        this.n = f6;
        this.l = f6.l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        F6 f6 = this.n;
        if (f6.l != this.l) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        while (true) {
            int i = this.m;
            if (i >= f6.l || !F6.q(f6.m[i])) {
                break;
            }
            this.m++;
        }
        return this.m < f6.l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        F6 f6 = this.n;
        int i = f6.l;
        if (i != this.l) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        if (this.m >= i) {
            throw new NoSuchElementException();
        }
        String[] strArr = f6.m;
        int i2 = this.m;
        D6 d6 = new D6(strArr[i2], (String) f6.n[i2], f6);
        this.m++;
        return d6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.m - 1;
        this.m = i;
        this.n.t(i);
        this.l--;
    }
}
