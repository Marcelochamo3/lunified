package o;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class V extends P implements SortedSet {
    public final /* synthetic */ Y n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y, SortedMap sortedMap) {
        super(y, sortedMap);
        this.n = y;
    }

    public SortedMap a() {
        return (SortedMap) this.l;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new V(this.n, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new V(this.n, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new V(this.n, a().tailMap(obj));
    }
}
