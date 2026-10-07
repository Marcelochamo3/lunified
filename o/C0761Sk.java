package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761Sk implements Map {
    public final Map l;

    public C0761Sk(Map map) {
        this.l = map;
    }

    public final boolean a(Object obj) {
        Iterator it = entrySet().iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final void clear() {
        this.l.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.l.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC2506pt.o(this.l.entrySet(), new C0735Rk(1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && Ou0.g(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.l.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2506pt.v(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.l;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC2506pt.o(this.l.keySet(), new C0735Rk(0));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.l.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.l.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.l.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.l;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.l.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.l.values();
    }
}
