package o;

/* JADX INFO: renamed from: o.b30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1065b30 implements Zb0 {
    public final Zb0 a;
    public final String b;

    public C1065b30(Zb0 zb0) {
        AbstractC1474fG.j(zb0, "primitive");
        this.a = zb0;
        this.b = zb0.a() + "Array";
    }

    @Override // o.Zb0
    public final String a() {
        return this.b;
    }

    @Override // o.Zb0
    public final U9 b() {
        return C2386oh0.k;
    }

    @Override // o.Zb0
    public final int c() {
        return 1;
    }

    @Override // o.Zb0
    public final String d(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1065b30)) {
            return false;
        }
        C1065b30 c1065b30 = (C1065b30) obj;
        if (AbstractC1474fG.b(this.a, c1065b30.a)) {
            if (AbstractC1474fG.b(this.b, c1065b30.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.Zb0
    public final Zb0 f(int i) {
        if (i >= 0) {
            return this.a;
        }
        throw new IllegalArgumentException(AbstractC1701hf0.h(AbstractC1674hK.r("Illegal index ", i, ", "), this.b, " expects only non-negative indices").toString());
    }

    @Override // o.Zb0
    public final boolean g(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC1701hf0.h(AbstractC1674hK.r("Illegal index ", i, ", "), this.b, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b + '(' + this.a + ')';
    }
}
