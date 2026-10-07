package o;

/* JADX INFO: renamed from: o.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1286dN extends AbstractC1677hN {
    public final Exception a;

    public C1286dN(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1286dN) && AbstractC1474fG.b(this.a, ((C1286dN) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedUpdate(error=" + this.a + ")";
    }
}
