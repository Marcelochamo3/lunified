package o;

/* JADX INFO: loaded from: classes.dex */
public final class BB implements EB {
    public final Throwable a;

    public BB(Throwable th) {
        AbstractC1474fG.j(th, "cause");
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BB) && AbstractC1474fG.b(this.a, ((BB) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
