package o;

/* JADX INFO: renamed from: o.wJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3129wJ {
    private final C1867jJ data;
    private final Boolean error;

    public final C1867jJ a() {
        return this.data;
    }

    public final Boolean b() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3129wJ)) {
            return false;
        }
        C3129wJ c3129wJ = (C3129wJ) obj;
        return AbstractC1474fG.b(this.error, c3129wJ.error) && AbstractC1474fG.b(this.data, c3129wJ.data);
    }

    public final int hashCode() {
        Boolean bool = this.error;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C1867jJ c1867jJ = this.data;
        return iHashCode + (c1867jJ != null ? c1867jJ.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieSingleResponse(error=" + this.error + ", data=" + this.data + ")";
    }
}
