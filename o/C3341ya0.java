package o;

/* JADX INFO: renamed from: o.ya0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3341ya0 extends Ea0 {
    public final Exception a;

    public C3341ya0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3341ya0) && AbstractC1474fG.b(this.a, ((C3341ya0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedSearching(error=" + this.a + ")";
    }
}
