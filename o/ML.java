package o;

/* JADX INFO: loaded from: classes.dex */
public final class ML implements PL {
    public final Throwable a;

    public ML(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ML) && AbstractC1474fG.b(this.a, ((ML) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.a + ")";
    }
}
