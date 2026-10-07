package o;

import java.util.List;

/* JADX INFO: renamed from: o.cJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1184cJ {
    private final C1575gJ pagination;
    private final List<C1087bJ> posts;
    private final List<String> seasons;

    public final C1575gJ a() {
        return this.pagination;
    }

    public final List b() {
        return this.posts;
    }

    public final List c() {
        return this.seasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184cJ)) {
            return false;
        }
        C1184cJ c1184cJ = (C1184cJ) obj;
        return AbstractC1474fG.b(this.posts, c1184cJ.posts) && AbstractC1474fG.b(this.seasons, c1184cJ.seasons) && AbstractC1474fG.b(this.pagination, c1184cJ.pagination);
    }

    public final int hashCode() {
        List<C1087bJ> list = this.posts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.seasons;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        C1575gJ c1575gJ = this.pagination;
        return iHashCode2 + (c1575gJ != null ? c1575gJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieEpisodesData(posts=" + this.posts + ", seasons=" + this.seasons + ", pagination=" + this.pagination + ")";
    }
}
