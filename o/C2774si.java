package o;

/* JADX INFO: renamed from: o.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2774si {
    public final String a;
    public final String b;
    public final int c;

    public C2774si(String str, int i, String str2) {
        AbstractC1474fG.j(str, "scheme");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2774si)) {
            return false;
        }
        C2774si c2774si = (C2774si) obj;
        return AbstractC1474fG.b(this.a, c2774si.a) && AbstractC1474fG.b(this.b, c2774si.b) && this.c == c2774si.c;
    }

    public final int hashCode() {
        return AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOrigin(scheme=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", port=");
        return AbstractC1701hf0.g(sb, this.c, ")");
    }
}
