package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class H extends G implements ListIterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f292o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j, int i) {
        super(0, j);
        this.f292o = j;
        int iA = j.a();
        if (i < 0 || i > iA) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, iA, "index: ", ", size: "));
        }
        this.m = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.m > 0;
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
        return this.f292o.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
