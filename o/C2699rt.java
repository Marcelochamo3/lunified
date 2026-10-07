package o;

import java.util.List;

/* JADX INFO: renamed from: o.rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2699rt {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    public C2699rt(String str, String str2, int i, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2699rt)) {
            return false;
        }
        C2699rt c2699rt = (C2699rt) obj;
        return AbstractC1474fG.b(this.a, c2699rt.a) && AbstractC1474fG.b(this.b, c2699rt.b) && this.c == c2699rt.c && AbstractC1474fG.b(this.d, c2699rt.d) && AbstractC1474fG.b(this.e, c2699rt.e) && AbstractC1474fG.b(this.f, c2699rt.f) && AbstractC1474fG.b(this.g, c2699rt.g);
    }

    public final int hashCode() {
        int i = (AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31) + this.c) * 31;
        String str = this.d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FanaSeriesEpisode(id=" + this.a + ", title=" + this.b + ", number=" + this.c + ", released=" + this.d + ", posterImageId=" + this.e + ", bannerImageId=" + this.f + ", videos=" + this.g + ")";
    }
}
