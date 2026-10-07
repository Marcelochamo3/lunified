package o;

/* JADX INFO: renamed from: o.rc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2666rc0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final boolean f;

    public C2666rc0(boolean z, String str, String str2, String str3, Boolean bool, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2666rc0)) {
            return false;
        }
        C2666rc0 c2666rc0 = (C2666rc0) obj;
        return this.a == c2666rc0.a && AbstractC1474fG.b(this.b, c2666rc0.b) && AbstractC1474fG.b(this.c, c2666rc0.c) && AbstractC1474fG.b(this.d, c2666rc0.d) && AbstractC1474fG.b(this.e, c2666rc0.e) && this.f == c2666rc0.f;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i((this.a ? 1231 : 1237) * 31, this.b, 31), this.c, 31), this.d, 31);
        Boolean bool = this.e;
        return ((i + (bool == null ? 0 : bool.hashCode())) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "SessionResponseFlags(success=" + this.a + ", message=" + this.b + ", sessionStatus=" + this.c + ", reasonCode=" + this.d + ", accountActive=" + this.e + ", forceLogout=" + this.f + ")";
    }
}
