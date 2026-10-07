package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class W extends N implements ListIterator {
    public final /* synthetic */ X p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x) {
        super(x);
        this.p = x;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        X x = this.p;
        boolean zIsEmpty = x.isEmpty();
        b().add(obj);
        x.q.p++;
        if (zIsEmpty) {
            x.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x, int i) {
        super(x, ((List) x.m).listIterator(i));
        this.p = x;
    }
}
