package o;

/* JADX INFO: renamed from: o.tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2893tt {
    public final String a;
    public final String b;
    public final C0769Ss c;

    public C2893tt(String str, String str2, C0769Ss c0769Ss) {
        this.a = str;
        this.b = str2;
        this.c = c0769Ss;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2893tt)) {
            return false;
        }
        C2893tt c2893tt = (C2893tt) obj;
        return AbstractC1474fG.b(this.a, c2893tt.a) && AbstractC1474fG.b(this.b, c2893tt.b) && AbstractC1474fG.b(this.c, c2893tt.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0769Ss c0769Ss = this.c;
        return iHashCode2 + (c0769Ss != null ? c0769Ss.hashCode() : 0);
    }

    public final String toString() {
        return "FanaTeam(name=" + this.a + ", shortName=" + this.b + ", flag=" + this.c + ")";
    }
}
