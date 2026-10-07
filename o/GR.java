package o;

/* JADX INFO: loaded from: classes.dex */
public final class GR extends HR {
    public final C1387eR a;

    public GR(C1387eR c1387eR) {
        AbstractC1474fG.j(c1387eR, "movie");
        this.a = c1387eR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GR) && AbstractC1474fG.b(this.a, ((GR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoading(movie=" + this.a + ")";
    }
}
