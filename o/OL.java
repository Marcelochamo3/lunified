package o;

/* JADX INFO: loaded from: classes.dex */
public final class OL implements PL {
    public final C1767iF a;

    public OL(C1767iF c1767iF) {
        this.a = c1767iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OL) && AbstractC1474fG.b(this.a, ((OL) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Required(release=" + this.a + ")";
    }
}
