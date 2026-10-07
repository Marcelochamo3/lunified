package o;

import java.util.List;

/* JADX INFO: renamed from: o.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0989aJ {
    private final C1575gJ pagination;
    private final List<C1867jJ> posts;

    public final List a() {
        return this.posts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0989aJ)) {
            return false;
        }
        C0989aJ c0989aJ = (C0989aJ) obj;
        return AbstractC1474fG.b(this.posts, c0989aJ.posts) && AbstractC1474fG.b(this.pagination, c0989aJ.pagination);
    }

    public final int hashCode() {
        List<C1867jJ> list = this.posts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C1575gJ c1575gJ = this.pagination;
        return iHashCode + (c1575gJ != null ? c1575gJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieDataList(posts=" + this.posts + ", pagination=" + this.pagination + ")";
    }
}
