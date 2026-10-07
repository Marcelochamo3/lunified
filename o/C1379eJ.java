package o;

/* JADX INFO: renamed from: o.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1379eJ {
    private final String backdrop;
    private final String poster;

    public final String a() {
        return this.backdrop;
    }

    public final String b() {
        return this.poster;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1379eJ)) {
            return false;
        }
        C1379eJ c1379eJ = (C1379eJ) obj;
        return AbstractC1474fG.b(this.poster, c1379eJ.poster) && AbstractC1474fG.b(this.backdrop, c1379eJ.backdrop);
    }

    public final int hashCode() {
        String str = this.poster;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backdrop;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieImages(poster=" + this.poster + ", backdrop=" + this.backdrop + ")";
    }
}
