package o;

/* JADX INFO: renamed from: o.uY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2950uY extends AbstractC3338yY {
    public final Exception a;

    public C2950uY(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2950uY) && AbstractC1474fG.b(this.a, ((C2950uY) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
