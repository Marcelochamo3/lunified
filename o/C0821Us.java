package o;

import java.util.Map;

/* JADX INFO: renamed from: o.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0821Us {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;
    public final boolean g;

    public C0821Us(String str, String str2, String str3, String str4, String str5, Map map, boolean z) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "type");
        AbstractC1474fG.j(map, "params");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = map;
        this.g = z;
    }

    public final String a() {
        String str = this.e;
        if (str != null && !AbstractC1899jh0.O(str)) {
            return str;
        }
        if (AbstractC1899jh0.N(this.d, "VerticalCard", true)) {
            return "mediumv";
        }
        AbstractC1899jh0.N(this.b, "TopBannerPlaylist", true);
        return "backdrop";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0821Us)) {
            return false;
        }
        C0821Us c0821Us = (C0821Us) obj;
        return AbstractC1474fG.b(this.a, c0821Us.a) && AbstractC1474fG.b(this.b, c0821Us.b) && AbstractC1474fG.b(this.c, c0821Us.c) && AbstractC1474fG.b(this.d, c0821Us.d) && AbstractC1474fG.b(this.e, c0821Us.e) && AbstractC1474fG.b(this.f, c0821Us.f) && this.g == c0821Us.g;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return ((this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "FanaPlaylistSpec(id=" + this.a + ", type=" + this.b + ", customTitle=" + this.c + ", cardType=" + this.d + ", imageCut=" + this.e + ", params=" + this.f + ", hidden=" + this.g + ")";
    }
}
