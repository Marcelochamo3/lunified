package o;

/* JADX INFO: renamed from: o.uJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2935uJ {
    private final String lang;
    private final String quality;
    private final String server;
    private final String url;

    public final String a() {
        return this.lang;
    }

    public final String b() {
        return this.quality;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2935uJ)) {
            return false;
        }
        C2935uJ c2935uJ = (C2935uJ) obj;
        return AbstractC1474fG.b(this.url, c2935uJ.url) && AbstractC1474fG.b(this.server, c2935uJ.server) && AbstractC1474fG.b(this.lang, c2935uJ.lang) && AbstractC1474fG.b(this.quality, c2935uJ.quality);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.server;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lang;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quality;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "LaMovieServerInfo(url=" + this.url + ", server=" + this.server + ", lang=" + this.lang + ", quality=" + this.quality + ")";
    }
}
