package o;

/* JADX INFO: loaded from: classes.dex */
public final class No0 extends Qo0 {
    public final Exception a;

    public No0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof No0) && AbstractC1474fG.b(this.a, ((No0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
