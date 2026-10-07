package o;

/* JADX INFO: renamed from: o.iJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1771iJ {
    private final C1673hJ data;
    private final Boolean error;

    public final C1673hJ a() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1771iJ)) {
            return false;
        }
        C1771iJ c1771iJ = (C1771iJ) obj;
        return AbstractC1474fG.b(this.error, c1771iJ.error) && AbstractC1474fG.b(this.data, c1771iJ.data);
    }

    public final int hashCode() {
        Boolean bool = this.error;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C1673hJ c1673hJ = this.data;
        return iHashCode + (c1673hJ != null ? c1673hJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMoviePlayerResponse(error=" + this.error + ", data=" + this.data + ")";
    }
}
