package o;

/* JADX INFO: renamed from: o.fJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1477fJ {
    private final C0989aJ data;
    private final Boolean error;

    public final C0989aJ a() {
        return this.data;
    }

    public final Boolean b() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1477fJ)) {
            return false;
        }
        C1477fJ c1477fJ = (C1477fJ) obj;
        return AbstractC1474fG.b(this.error, c1477fJ.error) && AbstractC1474fG.b(this.data, c1477fJ.data);
    }

    public final int hashCode() {
        Boolean bool = this.error;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C0989aJ c0989aJ = this.data;
        return iHashCode + (c0989aJ != null ? c0989aJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieListResponse(error=" + this.error + ", data=" + this.data + ")";
    }
}
