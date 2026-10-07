package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.y80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3311y80 implements ListIterator, InterfaceC1770iI {
    public final ListIterator l;
    public final /* synthetic */ HN m;

    public C3311y80(HN hn, int i) {
        this.m = hn;
        List list = (List) hn.n;
        ZF zf = new ZF(0, hn.a(), 1);
        if (i >= 0 && i <= zf.m) {
            this.l = list.listIterator(hn.a() - i);
            return;
        }
        StringBuilder sbR = AbstractC1674hK.r("Position index ", i, " must be in range [");
        sbR.append(new ZF(0, hn.a(), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.l.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.l.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.l.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC0937Ze.J(this.m) - this.l.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.l.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC0937Ze.J(this.m) - this.l.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
