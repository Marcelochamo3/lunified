package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public class O extends AbstractMap {
    public transient M l;
    public transient C0960a0 m;
    public final transient Map n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y f423o;

    public O(Y y, Map map) {
        this.f423o = y;
        this.n = map;
    }

    public final VE a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        K k = (K) this.f423o;
        k.getClass();
        List list = (List) collection;
        return new VE(key, list instanceof RandomAccess ? new T(k, key, list, null) : new X(k, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Y y = this.f423o;
        if (this.n == y.f629o) {
            y.b();
            return;
        }
        N n = new N(this);
        while (n.hasNext()) {
            n.next();
            n.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.n;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        M m = this.l;
        if (m != null) {
            return m;
        }
        M m2 = new M(this);
        this.l = m2;
        return m2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.n.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.n;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        K k = (K) this.f423o;
        k.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new T(k, obj, list, null) : new X(k, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        P v;
        Y y = this.f423o;
        P p = y.l;
        if (p == null) {
            OS os = (OS) y;
            Map map = os.f629o;
            if (map instanceof NavigableMap) {
                v = new S(os, (NavigableMap) os.f629o);
            } else {
                v = map instanceof SortedMap ? new V(os, (SortedMap) os.f629o) : new P(os, os.f629o);
            }
            p = v;
            y.l = p;
        }
        return p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.n.remove(obj);
        if (collection == null) {
            return null;
        }
        Y y = this.f423o;
        List list = (List) ((OS) y).q.get();
        list.addAll(collection);
        y.p -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.n.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.n.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0960a0 c0960a0 = this.m;
        if (c0960a0 != null) {
            return c0960a0;
        }
        C0960a0 c0960a1 = new C0960a0(this);
        this.m = c0960a1;
        return c0960a1;
    }
}
