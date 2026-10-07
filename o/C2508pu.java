package o;

/* JADX INFO: renamed from: o.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2508pu {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final boolean j;

    public C2508pu(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Long l, boolean z) {
        AbstractC1474fG.j(str, "matchId");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2508pu)) {
            return false;
        }
        C2508pu c2508pu = (C2508pu) obj;
        return AbstractC1474fG.b(this.a, c2508pu.a) && this.b == c2508pu.b && AbstractC1474fG.b(this.c, c2508pu.c) && AbstractC1474fG.b(this.d, c2508pu.d) && AbstractC1474fG.b(this.e, c2508pu.e) && AbstractC1474fG.b(this.f, c2508pu.f) && AbstractC1474fG.b(this.g, c2508pu.g) && AbstractC1474fG.b(this.h, c2508pu.h) && AbstractC1474fG.b(this.i, c2508pu.i) && this.j == c2508pu.j;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(((this.a.hashCode() * 31) + this.b) * 31, this.c, 31), this.d, 31), this.e, 31);
        String str = this.f;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.i;
        return ((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        return "LiveEvent(matchId=" + this.a + ", sportType=" + this.b + ", name=" + this.c + ", leagueSlug=" + this.d + ", leagueName=" + this.e + ", logo=" + this.f + ", homeLogo=" + this.g + ", awayLogo=" + this.h + ", startMs=" + this.i + ", isLive=" + this.j + ")";
    }
}
