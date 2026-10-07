package o;

/* JADX INFO: renamed from: o.iS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1780iS extends AbstractC2169mS {
    public final Exception a;

    public C1780iS(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1780iS) && AbstractC1474fG.b(this.a, ((C1780iS) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
