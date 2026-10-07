package o;

/* JADX INFO: loaded from: classes.dex */
public final class U30 extends zy0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Exception f549o;

    public U30(Exception exc) {
        this.f549o = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U30) && AbstractC1474fG.b(this.f549o, ((U30) obj).f549o);
    }

    public final int hashCode() {
        return this.f549o.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f549o + ")";
    }
}
