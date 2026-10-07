package o;

/* JADX INFO: renamed from: o.vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3087vt {
    public final String a;
    public final int b;

    public C3087vt(String str, int i) {
        AbstractC1474fG.j(str, "id");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3087vt)) {
            return false;
        }
        C3087vt c3087vt = (C3087vt) obj;
        return AbstractC1474fG.b(this.a, c3087vt.a) && this.b == c3087vt.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PlaylistKey(id=" + this.a + ", page=" + this.b + ")";
    }
}
