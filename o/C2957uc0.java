package o;

/* JADX INFO: renamed from: o.uc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2957uc0 extends AbstractC3151wc0 {
    public final String a;
    public final Throwable b;

    public C2957uc0(String str, Throwable th) {
        AbstractC1474fG.j(str, "message");
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2957uc0)) {
            return false;
        }
        C2957uc0 c2957uc0 = (C2957uc0) obj;
        return AbstractC1474fG.b(this.a, c2957uc0.a) && AbstractC1474fG.b(this.b, c2957uc0.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Error(message=" + this.a + ", cause=" + this.b + ")";
    }
}
