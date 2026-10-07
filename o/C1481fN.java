package o;

/* JADX INFO: renamed from: o.fN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1481fN extends AbstractC1677hN {
    public final C1767iF a;

    public C1481fN(C1767iF c1767iF) {
        this.a = c1767iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1481fN) && AbstractC1474fG.b(this.a, ((C1481fN) obj).a);
    }

    public final int hashCode() {
        C1767iF c1767iF = this.a;
        if (c1767iF == null) {
            return 0;
        }
        return c1767iF.hashCode();
    }

    public final String toString() {
        return "SuccessCheckingUpdate(release=" + this.a + ")";
    }
}
