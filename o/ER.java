package o;

/* JADX INFO: loaded from: classes.dex */
public final class ER extends HR {
    public final Exception a;

    public ER(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ER) && AbstractC1474fG.b(this.a, ((ER) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
