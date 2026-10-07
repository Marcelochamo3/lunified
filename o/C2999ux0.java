package o;

/* JADX INFO: renamed from: o.ux0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2999ux0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public C2999ux0(String str, String str2, String str3, String str4, Integer num, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        num = (i & 16) != 0 ? null : num;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2999ux0)) {
            return false;
        }
        C2999ux0 c2999ux0 = (C2999ux0) obj;
        return AbstractC1474fG.b(this.a, c2999ux0.a) && AbstractC1474fG.b(this.b, c2999ux0.b) && AbstractC1474fG.b(this.c, c2999ux0.c) && AbstractC1474fG.b(this.d, c2999ux0.d) && AbstractC1474fG.b(this.e, c2999ux0.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "HomeSection(title=" + this.a + ", section=" + this.b + ", field=" + this.c + ", value=" + this.d + ", officialColumnId=" + this.e + ")";
    }
}
