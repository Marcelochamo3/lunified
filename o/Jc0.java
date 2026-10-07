package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class Jc0 extends Ic0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.l).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.l.iterator();
        it.getClass();
        I20 i20 = this.m;
        i20.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (i20.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new Jc0(((SortedSet) this.l).headSet(obj), this.m);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.l;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.m.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new Jc0(((SortedSet) this.l).subSet(obj, obj2), this.m);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new Jc0(((SortedSet) this.l).tailSet(obj), this.m);
    }
}
