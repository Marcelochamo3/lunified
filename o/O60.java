package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O60 extends AbstractC1571gF {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient AbstractC1278dF f426o;
    public final transient Object[] p;
    public final transient int q = 0;
    public final transient int r;

    public O60(AbstractC1278dF abstractC1278dF, Object[] objArr, int i) {
        this.f426o = abstractC1278dF;
        this.p = objArr;
        this.r = i;
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f426o.get(key));
    }

    @Override // o.UE
    public final int d(int i, Object[] objArr) {
        return a().d(i, objArr);
    }

    @Override // o.UE
    public final boolean h() {
        return true;
    }

    @Override // o.UE
    /* JADX INFO: renamed from: i */
    public final Aq0 iterator() {
        return a().listIterator(0);
    }

    @Override // o.AbstractC1571gF
    public final AbstractC0985aF m() {
        return new N60(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r;
    }
}
