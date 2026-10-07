package o;

/* JADX INFO: loaded from: classes.dex */
public final class D10 extends O10 {
    public final Exception a;
    public final C3336yW b;

    public D10(Exception exc, C3336yW c3336yW) {
        AbstractC1474fG.j(c3336yW, "subtitle");
        this.a = exc;
        this.b = c3336yW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D10)) {
            return false;
        }
        D10 d10 = (D10) obj;
        return AbstractC1474fG.b(this.a, d10.a) && AbstractC1474fG.b(this.b, d10.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FailedDownloadingOpenSubtitle(error=" + this.a + ", subtitle=" + this.b + ")";
    }
}
