package o;

/* JADX INFO: renamed from: o.je0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1893je0 extends AbstractC1571gF {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object f847o;

    public C1893je0(Object obj) {
        obj.getClass();
        this.f847o = obj;
    }

    @Override // o.AbstractC1571gF, o.UE
    public final AbstractC0985aF a() {
        return AbstractC0985aF.q(this.f847o);
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f847o.equals(obj);
    }

    @Override // o.UE
    public final int d(int i, Object[] objArr) {
        objArr[i] = this.f847o;
        return i + 1;
    }

    @Override // o.UE
    public final boolean h() {
        return false;
    }

    @Override // o.AbstractC1571gF, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f847o.hashCode();
    }

    @Override // o.UE
    /* JADX INFO: renamed from: i */
    public final Aq0 iterator() {
        return new XG(this.f847o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f847o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
