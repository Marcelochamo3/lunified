package o;

/* JADX INFO: renamed from: o.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144bu implements InterfaceC1436eu {
    public final Throwable a;

    public C1144bu(Throwable th) {
        AbstractC1474fG.j(th, "cause");
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1144bu) && AbstractC1474fG.b(this.a, ((C1144bu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
