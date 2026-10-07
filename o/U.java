package o;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class U extends O implements SortedMap {
    public SortedSet p;
    public final /* synthetic */ Y q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Y y, SortedMap sortedMap) {
        super(y, sortedMap);
        this.q = y;
    }

    public SortedSet b() {
        return new V(this.q, d());
    }

    @Override // o.O, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.p;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.p = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.n;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new U(this.q, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new U(this.q, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new U(this.q, d().tailMap(obj));
    }
}
