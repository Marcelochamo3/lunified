package o;

/* JADX INFO: loaded from: classes.dex */
public final class P60 extends AbstractC1571gF {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient AbstractC1278dF f448o;
    public final transient AbstractC0985aF p;

    public P60(AbstractC1278dF abstractC1278dF, Q60 q60) {
        this.f448o = abstractC1278dF;
        this.p = q60;
    }

    @Override // o.AbstractC1571gF, o.UE
    public final AbstractC0985aF a() {
        return this.p;
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f448o.get(obj) != null;
    }

    @Override // o.UE
    public final int d(int i, Object[] objArr) {
        return this.p.d(i, objArr);
    }

    @Override // o.UE
    public final boolean h() {
        return true;
    }

    @Override // o.UE
    /* JADX INFO: renamed from: i */
    public final Aq0 iterator() {
        return this.p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((R60) this.f448o).q;
    }
}
