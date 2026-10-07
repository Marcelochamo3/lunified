package o;

/* JADX INFO: renamed from: o.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1087bJ {
    private final Integer episode_number;

    @InterfaceC1695hc0("_id")
    private final long id;
    private final String overview;
    private final String runtime;
    private final Integer season_number;
    private final String slug;
    private final String still_path;
    private final String title;
    private final String vote_average;

    public final Integer a() {
        return this.episode_number;
    }

    public final long b() {
        return this.id;
    }

    public final String c() {
        return this.slug;
    }

    public final String d() {
        return this.still_path;
    }

    public final String e() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087bJ)) {
            return false;
        }
        C1087bJ c1087bJ = (C1087bJ) obj;
        return this.id == c1087bJ.id && AbstractC1474fG.b(this.title, c1087bJ.title) && AbstractC1474fG.b(this.slug, c1087bJ.slug) && AbstractC1474fG.b(this.overview, c1087bJ.overview) && AbstractC1474fG.b(this.runtime, c1087bJ.runtime) && AbstractC1474fG.b(this.still_path, c1087bJ.still_path) && AbstractC1474fG.b(this.vote_average, c1087bJ.vote_average) && AbstractC1474fG.b(this.season_number, c1087bJ.season_number) && AbstractC1474fG.b(this.episode_number, c1087bJ.episode_number);
    }

    public final int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.title;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slug;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.overview;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.runtime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.still_path;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.vote_average;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.season_number;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.episode_number;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.id;
        String str = this.title;
        String str2 = this.slug;
        String str3 = this.overview;
        String str4 = this.runtime;
        String str5 = this.still_path;
        String str6 = this.vote_average;
        Integer num = this.season_number;
        Integer num2 = this.episode_number;
        StringBuilder sb = new StringBuilder("LaMovieEpisodePost(id=");
        sb.append(j);
        sb.append(", title=");
        sb.append(str);
        AbstractC1701hf0.r(sb, ", slug=", str2, ", overview=", str3);
        AbstractC1701hf0.r(sb, ", runtime=", str4, ", still_path=", str5);
        sb.append(", vote_average=");
        sb.append(str6);
        sb.append(", season_number=");
        sb.append(num);
        sb.append(", episode_number=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
