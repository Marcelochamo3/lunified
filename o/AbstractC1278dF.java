package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: o.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1278dF implements Map, Serializable, j$.util.Map {
    public transient O60 l;
    public transient P60 m;
    public transient Q60 n;

    public static C2613qy a() {
        return new C2613qy(4, 5);
    }

    public static AbstractC1278dF b(Map map) {
        if ((map instanceof AbstractC1278dF) && !(map instanceof SortedMap)) {
            AbstractC1278dF abstractC1278dF = (AbstractC1278dF) map;
            abstractC1278dF.getClass();
            return abstractC1278dF;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        C2613qy c2613qy = new C2613qy(z ? setEntrySet.size() : 4, 5);
        if (z) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) c2613qy.n;
            if (size > objArr.length) {
                c2613qy.n = Arrays.copyOf(objArr, TE.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c2613qy.I(entry.getKey(), entry.getValue());
        }
        return c2613qy.c();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC1571gF entrySet() {
        O60 o60 = this.l;
        if (o60 != null) {
            return o60;
        }
        R60 r60 = (R60) this;
        O60 o61 = new O60(r60, r60.p, r60.q);
        this.l = o61;
        return o61;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final UE values() {
        Q60 q60 = this.n;
        if (q60 != null) {
            return q60;
        }
        R60 r60 = (R60) this;
        Q60 q61 = new Q60(r60.p, 1, r60.q);
        this.n = q61;
        return q61;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Ou0.g(this, obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2506pt.v(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((R60) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        P60 p60 = this.m;
        if (p60 != null) {
            return p60;
        }
        R60 r60 = (R60) this;
        P60 p61 = new P60(r60, new Q60(r60.p, 0, r60.q));
        this.m = p61;
        return p61;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i = ((R60) this).q;
        U9.d(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new C1180cF(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
