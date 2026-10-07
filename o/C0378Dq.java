package o;

/* JADX INFO: renamed from: o.Dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378Dq extends AbstractC1258d20 {
    public final C1551g20 l;
    public final Rh0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0378Dq(String str, int i) {
        super(str, null, i);
        AbstractC1474fG.j(str, "name");
        this.l = C1551g20.l;
        this.m = new Rh0(new C0352Cq(i, str, this));
    }

    @Override // o.AbstractC1258d20, o.Zb0
    public final U9 b() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Zb0)) {
            return false;
        }
        Zb0 zb0 = (Zb0) obj;
        if (zb0.b() != C1551g20.l) {
            return false;
        }
        return AbstractC1474fG.b(this.a, zb0.a()) && AbstractC1474fG.b(UK.b(this), UK.b(zb0));
    }

    @Override // o.AbstractC1258d20, o.Zb0
    public final Zb0 f(int i) {
        return ((Zb0[]) this.m.getValue())[i];
    }

    @Override // o.AbstractC1258d20
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        C1109bc0 c1109bc0 = new C1109bc0(this, 1);
        int iHashCode2 = 1;
        while (c1109bc0.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c1109bc0.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // o.AbstractC1258d20
    public final String toString() {
        return AbstractC0911Ye.h0(new AF(2, this), ", ", this.a + '(', ")", null, 56);
    }
}
