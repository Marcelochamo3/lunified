package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.sN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2745sN extends AbstractCollection implements Collection, InterfaceC1866jI {
    public final C2552qN l;

    public C2745sN(C2552qN c2552qN) {
        AbstractC1474fG.j(c2552qN, "backing");
        this.l = c2552qN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.l.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2552qN c2552qN = this.l;
        c2552qN.getClass();
        return new C2261nN(c2552qN, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C2552qN c2552qN = this.l;
        c2552qN.c();
        int iH = c2552qN.h(obj);
        if (iH < 0) {
            return false;
        }
        c2552qN.k(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        this.l.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        this.l.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.l.t;
    }
}
