package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ya0 extends AbstractC1107bb0 {
    public final Exception a;

    public Ya0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ya0) && AbstractC1474fG.b(this.a, ((Ya0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoadingEpisodes(error=" + this.a + ")";
    }
}
