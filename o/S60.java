package o;

/* JADX INFO: loaded from: classes.dex */
public final class S60 extends AbstractC1571gF {
    public static final Object[] t;
    public static final S60 u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f506o;
    public final transient int p;
    public final transient Object[] q;
    public final transient int r;
    public final transient int s;

    static {
        Object[] objArr = new Object[0];
        t = objArr;
        u = new S60(0, 0, 0, objArr, objArr);
    }

    public S60(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f506o = objArr;
        this.p = i;
        this.q = objArr2;
        this.r = i2;
        this.s = i3;
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.q;
            if (objArr.length != 0) {
                int iQ = AbstractC1370eA.Q(obj);
                while (true) {
                    int i = iQ & this.r;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iQ = i + 1;
                }
            }
        }
        return false;
    }

    @Override // o.UE
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.f506o;
        int i2 = this.s;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // o.UE
    public final Object[] e() {
        return this.f506o;
    }

    @Override // o.UE
    public final int f() {
        return this.s;
    }

    @Override // o.UE
    public final int g() {
        return 0;
    }

    @Override // o.UE
    public final boolean h() {
        return false;
    }

    @Override // o.AbstractC1571gF, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.p;
    }

    @Override // o.UE
    /* JADX INFO: renamed from: i */
    public final Aq0 iterator() {
        return a().listIterator(0);
    }

    @Override // o.AbstractC1571gF
    public final AbstractC0985aF m() {
        return AbstractC0985aF.j(this.s, this.f506o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s;
    }
}
