package o;

/* JADX INFO: renamed from: o.iF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1767iF {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public C1767iF(int i, String str, String str2, String str3, String str4, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1767iF)) {
            return false;
        }
        C1767iF c1767iF = (C1767iF) obj;
        return this.a == c1767iF.a && AbstractC1474fG.b(this.b, c1767iF.b) && AbstractC1474fG.b(this.c, c1767iF.c) && AbstractC1474fG.b(this.d, c1767iF.d) && AbstractC1474fG.b(this.e, c1767iF.e) && this.f == c1767iF.f;
    }

    public final int hashCode() {
        return AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(this.a * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "Release(versionCode=" + this.a + ", versionName=" + this.b + ", apkUrl=" + this.c + ", sha256=" + this.d + ", notes=" + this.e + ", mandatory=" + this.f + ")";
    }
}
