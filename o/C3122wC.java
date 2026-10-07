package o;

/* JADX INFO: renamed from: o.wC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3122wC {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    public C3122wC(String str, int i, String str2, String str3, String str4, long j, String str5) {
        AbstractC1474fG.j(str, "host");
        AbstractC1474fG.j(str2, "username");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3122wC)) {
            return false;
        }
        C3122wC c3122wC = (C3122wC) obj;
        return AbstractC1474fG.b(this.a, c3122wC.a) && this.b == c3122wC.b && AbstractC1474fG.b(this.c, c3122wC.c) && AbstractC1474fG.b(this.d, c3122wC.d) && AbstractC1474fG.b(this.e, c3122wC.e) && this.f == c3122wC.f && AbstractC1474fG.b(this.g, c3122wC.g);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(((this.a.hashCode() * 31) + this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
        long j = this.f;
        return this.g.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Candidate(host=");
        sb.append(this.a);
        sb.append(", port=");
        sb.append(this.b);
        sb.append(", username=");
        sb.append(this.c);
        sb.append(", password=");
        sb.append(this.d);
        sb.append(", countryCode=");
        sb.append(this.e);
        sb.append(", expiresAt=");
        sb.append(this.f);
        sb.append(", vendor=");
        return AbstractC1701hf0.h(sb, this.g, ")");
    }
}
