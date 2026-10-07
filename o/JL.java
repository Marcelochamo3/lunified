package o;

/* JADX INFO: loaded from: classes.dex */
public final class JL {
    public final String a;
    public final int b;
    public final Throwable c;

    public JL(int i, String str, Throwable th) {
        this.a = str;
        this.b = i;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JL)) {
            return false;
        }
        JL jl = (JL) obj;
        return AbstractC1474fG.b(this.a, jl.a) && this.b == jl.b && AbstractC1474fG.b(this.c, jl.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        Throwable th = this.c;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "LoginRequestResult(body=" + this.a + ", httpCode=" + this.b + ", error=" + this.c + ")";
    }
}
