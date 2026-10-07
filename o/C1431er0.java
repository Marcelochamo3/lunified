package o;

/* JADX INFO: renamed from: o.er0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1431er0 extends AbstractC1822ir0 {
    public final EnumC1139br0 a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final boolean g;

    public C1431er0(EnumC1139br0 enumC1139br0, String str, String str2, String str3, Boolean bool, long j, boolean z) {
        AbstractC1474fG.j(enumC1139br0, "provider");
        AbstractC1474fG.j(str, "country");
        AbstractC1474fG.j(str2, "exitIp");
        AbstractC1474fG.j(str3, "isp");
        this.a = enumC1139br0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = j;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431er0)) {
            return false;
        }
        C1431er0 c1431er0 = (C1431er0) obj;
        return this.a == c1431er0.a && AbstractC1474fG.b(this.b, c1431er0.b) && AbstractC1474fG.b(this.c, c1431er0.c) && AbstractC1474fG.b(this.d, c1431er0.d) && AbstractC1474fG.b(this.e, c1431er0.e) && this.f == c1431er0.f && this.g == c1431er0.g;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
        Boolean bool = this.e;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        long j = this.f;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "Active(provider=" + this.a + ", country=" + this.b + ", exitIp=" + this.c + ", isp=" + this.d + ", hosting=" + this.e + ", expiresAt=" + this.f + ", refreshing=" + this.g + ")";
    }
}
