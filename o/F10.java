package o;

/* JADX INFO: loaded from: classes.dex */
public final class F10 extends O10 {
    public final Exception a;

    public F10(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F10) && AbstractC1474fG.b(this.a, ((F10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedLoadingSubtitles(error=" + this.a + ")";
    }
}
