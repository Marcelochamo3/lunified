package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ko0 extends AbstractC2506pt {
    public final Exception m;

    public Ko0(Exception exc) {
        this.m = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ko0) && AbstractC1474fG.b(this.m, ((Ko0) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.m + ")";
    }
}
