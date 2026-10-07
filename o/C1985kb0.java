package o;

/* JADX INFO: renamed from: o.kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1985kb0 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public C1985kb0(String str, long j, String str2, String str3, int i, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
    }

    public final String a() {
        return this.a + "; time=" + this.b + "; app=" + this.c + "; device=" + this.d + "; sdk=" + this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1985kb0)) {
            return false;
        }
        C1985kb0 c1985kb0 = (C1985kb0) obj;
        return AbstractC1474fG.b(this.a, c1985kb0.a) && this.b == c1985kb0.b && AbstractC1474fG.b(this.c, c1985kb0.c) && AbstractC1474fG.b(this.d, c1985kb0.d) && this.e == c1985kb0.e && this.f == c1985kb0.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((AbstractC1674hK.i(AbstractC1674hK.i((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, this.c, 31), this.d, 31) + this.e) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "Record(reason=" + this.a + ", timestampMs=" + this.b + ", appVersion=" + this.c + ", device=" + this.d + ", sdk=" + this.e + ", reported=" + this.f + ")";
    }
}
