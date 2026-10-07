package o;

/* JADX INFO: renamed from: o.ep0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1427ep0 extends AbstractC1818ip0 {
    public final Exception a;

    public C1427ep0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1427ep0) && AbstractC1474fG.b(this.a, ((C1427ep0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
