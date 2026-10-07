package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class VT implements Iterator, InterfaceC1770iI {
    public int l = -1;
    public boolean m;
    public final /* synthetic */ WT n;

    public VT(WT wt) {
        this.n = wt;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l + 1 < this.n.w.h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.m = true;
        C2866tf0 c2866tf0 = this.n.w;
        int i = this.l + 1;
        this.l = i;
        return (TT) c2866tf0.j(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.m) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        C2866tf0 c2866tf0 = this.n.w;
        ((TT) c2866tf0.j(this.l)).m = null;
        int i = this.l;
        Object[] objArr = c2866tf0.n;
        Object obj = objArr[i];
        Object obj2 = Nr0.g;
        if (obj != obj2) {
            objArr[i] = obj2;
            c2866tf0.l = true;
        }
        this.l = i - 1;
        this.m = false;
    }
}
