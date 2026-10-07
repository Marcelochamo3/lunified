package o;

/* JADX INFO: renamed from: o.rV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2656rV {
    public final String a;
    public final String b;
    public final C0660On c;

    public C2656rV(String str, String str2, C0660On c0660On) {
        AbstractC1474fG.j(str2, "finalUrl");
        this.a = str;
        this.b = str2;
        this.c = c0660On;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2656rV)) {
            return false;
        }
        C2656rV c2656rV = (C2656rV) obj;
        return AbstractC1474fG.b(this.a, c2656rV.a) && AbstractC1474fG.b(this.b, c2656rV.b) && AbstractC1474fG.b(this.c, c2656rV.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "FetchedPage(html=" + this.a + ", finalUrl=" + this.b + ", document=" + this.c + ")";
    }
}
