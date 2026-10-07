package o;

/* JADX INFO: renamed from: o.jJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1867jJ {

    @InterfaceC1695hc0("_id")
    private final long id;
    private final C1379eJ images;
    private final String overview;
    private final String rating;
    private final String release_date;
    private final String slug;
    private final String title;
    private final String type;

    public final long a() {
        return this.id;
    }

    public final C1379eJ b() {
        return this.images;
    }

    public final String c() {
        return this.overview;
    }

    public final String d() {
        return this.rating;
    }

    public final String e() {
        return this.release_date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867jJ)) {
            return false;
        }
        C1867jJ c1867jJ = (C1867jJ) obj;
        return this.id == c1867jJ.id && AbstractC1474fG.b(this.title, c1867jJ.title) && AbstractC1474fG.b(this.overview, c1867jJ.overview) && AbstractC1474fG.b(this.slug, c1867jJ.slug) && AbstractC1474fG.b(this.images, c1867jJ.images) && AbstractC1474fG.b(this.rating, c1867jJ.rating) && AbstractC1474fG.b(this.release_date, c1867jJ.release_date) && AbstractC1474fG.b(this.type, c1867jJ.type);
    }

    public final String f() {
        return this.slug;
    }

    public final String g() {
        return this.title;
    }

    public final String h() {
        return this.type;
    }

    public final int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.title;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overview;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slug;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1379eJ c1379eJ = this.images;
        int iHashCode4 = (iHashCode3 + (c1379eJ == null ? 0 : c1379eJ.hashCode())) * 31;
        String str4 = this.rating;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.release_date;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        long j = this.id;
        String str = this.title;
        String str2 = this.overview;
        String str3 = this.slug;
        C1379eJ c1379eJ = this.images;
        String str4 = this.rating;
        String str5 = this.release_date;
        String str6 = this.type;
        StringBuilder sb = new StringBuilder("LaMoviePost(id=");
        sb.append(j);
        sb.append(", title=");
        sb.append(str);
        AbstractC1701hf0.r(sb, ", overview=", str2, ", slug=", str3);
        sb.append(", images=");
        sb.append(c1379eJ);
        sb.append(", rating=");
        sb.append(str4);
        AbstractC1701hf0.r(sb, ", release_date=", str5, ", type=", str6);
        sb.append(")");
        return sb.toString();
    }
}
