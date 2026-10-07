package o;

import java.util.List;

/* JADX INFO: renamed from: o.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3443zd {
    public final String a;
    public final String b;
    public final Double c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;

    public C3443zd(String str, String str2, Double d, String str3, String str4, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3443zd)) {
            return false;
        }
        C3443zd c3443zd = (C3443zd) obj;
        return AbstractC1474fG.b(this.a, c3443zd.a) && AbstractC1474fG.b(this.b, c3443zd.b) && AbstractC1474fG.b(this.c, c3443zd.c) && AbstractC1474fG.b(this.d, c3443zd.d) && AbstractC1474fG.b(this.e, c3443zd.e) && AbstractC1474fG.b(this.f, c3443zd.f) && AbstractC1474fG.b(this.g, c3443zd.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.g.hashCode() + AbstractC1674hK.j(this.f, (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Details(title=" + this.a + ", overview=" + this.b + ", rating=" + this.c + ", poster=" + this.d + ", banner=" + this.e + ", genres=" + this.f + ", cast=" + this.g + ")";
    }
}
