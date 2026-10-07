package o;

/* JADX INFO: renamed from: o.dr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1333dr0 {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public C1333dr0(String str, int i, String str2, long j, String str3, String str4) {
        AbstractC1474fG.j(str4, "selectionCode");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1333dr0)) {
            return false;
        }
        C1333dr0 c1333dr0 = (C1333dr0) obj;
        return AbstractC1474fG.b(this.a, c1333dr0.a) && this.b == c1333dr0.b && AbstractC1474fG.b(this.c, c1333dr0.c) && this.d == c1333dr0.d && AbstractC1474fG.b(this.e, c1333dr0.e) && AbstractC1474fG.b(this.f, c1333dr0.f);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(((this.a.hashCode() * 31) + this.b) * 31, this.c, 31);
        long j = this.d;
        return this.f.hashCode() + AbstractC1674hK.i((i + ((int) (j ^ (j >>> 32)))) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerSelection(host=");
        sb.append(this.a);
        sb.append(", port=");
        sb.append(this.b);
        sb.append(", signature=");
        sb.append(this.c);
        sb.append(", expiresAt=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.e);
        sb.append(", selectionCode=");
        return AbstractC1701hf0.h(sb, this.f, ")");
    }
}
