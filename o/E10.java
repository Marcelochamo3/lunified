package o;

/* JADX INFO: loaded from: classes.dex */
public final class E10 extends O10 {
    public final Exception a;

    public E10(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E10) && AbstractC1474fG.b(this.a, ((E10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoadingServers(error=" + this.a + ")";
    }
}
