package o;

/* JADX INFO: renamed from: o.nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2293nj0 {
    public final int a;
    public final String b;

    public C2293nj0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2293nj0)) {
            return false;
        }
        C2293nj0 c2293nj0 = (C2293nj0) obj;
        return this.a == c2293nj0.a && AbstractC1474fG.b(this.b, c2293nj0.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StreamProbe(code=" + this.a + ", manifest=" + this.b + ")";
    }
}
