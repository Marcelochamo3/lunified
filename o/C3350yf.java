package o;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: o.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3350yf extends AbstractSet {
    public final /* synthetic */ int l;
    public final /* synthetic */ Map m;

    public /* synthetic */ C3350yf(int i, Map map) {
        this.l = i;
        this.m = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.l) {
            case 0:
                ((C0289Af) this.m).clear();
                break;
            case 1:
                ((C0289Af) this.m).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.l) {
            case 0:
                C0289Af c0289Af = (C0289Af) this.m;
                Map mapB = c0289Af.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = c0289Af.d(entry.getKey());
                    if (iD != -1 && AbstractC1459f50.p(c0289Af.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C0289Af) this.m).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.l) {
            case 0:
                C0289Af c0289Af = (C0289Af) this.m;
                Map mapB = c0289Af.b();
                return mapB != null ? mapB.entrySet().iterator() : new C3253xf(c0289Af, 1);
            case 1:
                C0289Af c0289Af2 = (C0289Af) this.m;
                Map mapB2 = c0289Af2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new C3253xf(c0289Af2, 0);
            default:
                return new Q5((S5) this.m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.l) {
            case 0:
                C0289Af c0289Af = (C0289Af) this.m;
                Map mapB = c0289Af.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0289Af.f()) {
                        int iC = c0289Af.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0289Af.l;
                        Objects.requireNonNull(obj2);
                        int iA = AbstractC1468fA.A(key, value, iC, obj2, c0289Af.h(), c0289Af.i(), c0289Af.j());
                        if (iA != -1) {
                            c0289Af.e(iA, iC);
                            c0289Af.q--;
                            c0289Af.p += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C0289Af c0289Af2 = (C0289Af) this.m;
                Map mapB2 = c0289Af2.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return c0289Af2.g(obj) != C0289Af.u;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.l) {
            case 0:
                return ((C0289Af) this.m).size();
            case 1:
                return ((C0289Af) this.m).size();
            default:
                return ((S5) this.m).n;
        }
    }
}
