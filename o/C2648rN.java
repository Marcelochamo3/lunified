package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: o.rN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2648rN extends AbstractC1253d0 {
    public final /* synthetic */ int l;
    public final C2552qN m;

    public C2648rN(C2552qN c2552qN, int i) {
        this.l = i;
        switch (i) {
            case 1:
                AbstractC1474fG.j(c2552qN, "backing");
                this.m = c2552qN;
                break;
            default:
                AbstractC1474fG.j(c2552qN, "backing");
                this.m = c2552qN;
                break;
        }
    }

    @Override // o.AbstractC1253d0
    public final int a() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m.t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC1474fG.j(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.l) {
            case 0:
                this.m.clear();
                break;
            default:
                this.m.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1474fG.j(entry, "element");
                return this.m.e(entry);
            default:
                return this.m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(collection, "elements");
                return this.m.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.l) {
            case 0:
                C2552qN c2552qN = this.m;
                c2552qN.getClass();
                return new C2261nN(c2552qN, 0);
            default:
                C2552qN c2552qN2 = this.m;
                c2552qN2.getClass();
                return new C2261nN(c2552qN2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1474fG.j(entry, "element");
                C2552qN c2552qN = this.m;
                c2552qN.getClass();
                c2552qN.c();
                int iG = c2552qN.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = c2552qN.m;
                AbstractC1474fG.g(objArr);
                if (!AbstractC1474fG.b(objArr[iG], entry.getValue())) {
                    return false;
                }
                c2552qN.k(iG);
                return true;
            default:
                C2552qN c2552qN2 = this.m;
                c2552qN2.c();
                int iG2 = c2552qN2.g(obj);
                if (iG2 < 0) {
                    iG2 = -1;
                } else {
                    c2552qN2.k(iG2);
                }
                return iG2 >= 0;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(collection, "elements");
                this.m.c();
                break;
            default:
                AbstractC1474fG.j(collection, "elements");
                this.m.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(collection, "elements");
                this.m.c();
                break;
            default:
                AbstractC1474fG.j(collection, "elements");
                this.m.c();
                break;
        }
        return super.retainAll(collection);
    }
}
