package o;

/* JADX INFO: loaded from: classes.dex */
public final class X30 {
    public final Q30 a;
    public final zy0 b;

    public X30(Q30 q30, zy0 zy0Var) {
        AbstractC1474fG.j(q30, "provider");
        this.a = q30;
        this.b = zy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X30)) {
            return false;
        }
        X30 x30 = (X30) obj;
        return AbstractC1474fG.b(this.a, x30.a) && AbstractC1474fG.b(this.b, x30.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderResult(provider=" + this.a + ", state=" + this.b + ")";
    }
}
