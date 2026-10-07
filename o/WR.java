package o;

/* JADX INFO: loaded from: classes.dex */
public final class WR extends ZR {
    public final Exception a;

    public WR(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WR) && AbstractC1474fG.b(this.a, ((WR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoading(error=" + this.a + ")";
    }
}
