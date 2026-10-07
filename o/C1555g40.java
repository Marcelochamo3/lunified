package o;

/* JADX INFO: renamed from: o.g40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1555g40 extends AbstractC1945k40 {
    public final Exception a;

    public C1555g40(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555g40) && AbstractC1474fG.b(this.a, ((C1555g40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
