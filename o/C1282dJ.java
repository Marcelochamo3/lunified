package o;

/* JADX INFO: renamed from: o.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1282dJ {
    private final C1184cJ data;
    private final Boolean error;

    public final C1184cJ a() {
        return this.data;
    }

    public final Boolean b() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1282dJ)) {
            return false;
        }
        C1282dJ c1282dJ = (C1282dJ) obj;
        return AbstractC1474fG.b(this.error, c1282dJ.error) && AbstractC1474fG.b(this.data, c1282dJ.data);
    }

    public final int hashCode() {
        Boolean bool = this.error;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C1184cJ c1184cJ = this.data;
        return iHashCode + (c1184cJ != null ? c1184cJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieEpisodesResponse(error=" + this.error + ", data=" + this.data + ")";
    }
}
