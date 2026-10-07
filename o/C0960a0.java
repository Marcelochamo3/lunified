package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: o.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0960a0 extends AbstractCollection {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ C0960a0(int i, Serializable serializable) {
        this.l = i;
        this.m = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.l) {
            case 0:
                ((Y) ((AbstractC1058b0) this.m)).b();
                break;
            case 1:
                ((C0289Af) this.m).clear();
                break;
            default:
                ((Map) this.m).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.l) {
            case 0:
                Iterator it = ((C0960a0) ((AbstractC1058b0) this.m).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Map) this.m).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.l) {
            case 2:
                return ((Map) this.m).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.l) {
            case 0:
                Y y = (Y) ((AbstractC1058b0) this.m);
                y.getClass();
                return new L(y);
            case 1:
                C0289Af c0289Af = (C0289Af) this.m;
                Map mapB = c0289Af.b();
                return mapB != null ? mapB.values().iterator() : new C3253xf(c0289Af, 2);
            default:
                return new C3230xN(((Map) this.m).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.l) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = (Map) this.m;
                    for (Map.Entry entry : map.entrySet()) {
                        if (AbstractC1459f50.p(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.l) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.m;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.l) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.m;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.l) {
            case 0:
                return ((Y) ((AbstractC1058b0) this.m)).p;
            case 1:
                return ((C0289Af) this.m).size();
            default:
                return ((Map) this.m).size();
        }
    }

    public C0960a0(Map map) {
        this.l = 2;
        map.getClass();
        this.m = map;
    }
}
