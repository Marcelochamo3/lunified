package o;

/* JADX INFO: renamed from: o.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0335Bz extends AbstractC0439Fz {
    public final Exception a;

    public C0335Bz(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0335Bz) && AbstractC1474fG.b(this.a, ((C0335Bz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
