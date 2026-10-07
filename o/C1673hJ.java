package o;

import java.util.List;

/* JADX INFO: renamed from: o.hJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1673hJ {
    private final List<C2935uJ> downloads;
    private final List<C2935uJ> embeds;
    private final Boolean error;
    private final String message;

    public final List a() {
        return this.embeds;
    }

    public final Boolean b() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673hJ)) {
            return false;
        }
        C1673hJ c1673hJ = (C1673hJ) obj;
        return AbstractC1474fG.b(this.error, c1673hJ.error) && AbstractC1474fG.b(this.message, c1673hJ.message) && AbstractC1474fG.b(this.embeds, c1673hJ.embeds) && AbstractC1474fG.b(this.downloads, c1673hJ.downloads);
    }

    public final int hashCode() {
        Boolean bool = this.error;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<C2935uJ> list = this.embeds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<C2935uJ> list2 = this.downloads;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "LaMoviePlayerData(error=" + this.error + ", message=" + this.message + ", embeds=" + this.embeds + ", downloads=" + this.downloads + ")";
    }
}
