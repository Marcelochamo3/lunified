package o;

/* JADX INFO: loaded from: classes.dex */
public final class JC extends MC {
    public final Exception a;

    public JC(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JC) && AbstractC1474fG.b(this.a, ((JC) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
