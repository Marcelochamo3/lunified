package o;

/* JADX INFO: loaded from: classes.dex */
public final class KL {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final boolean f;

    public KL(boolean z, String str, String str2, String str3, Boolean bool, boolean z2) {
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
        if (!(obj instanceof KL)) {
            return false;
        }
        KL kl = (KL) obj;
        return this.a == kl.a && AbstractC1474fG.b(this.b, kl.b) && AbstractC1474fG.b(this.c, kl.c) && AbstractC1474fG.b(this.d, kl.d) && AbstractC1474fG.b(this.e, kl.e) && this.f == kl.f;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i((this.a ? 1231 : 1237) * 31, this.b, 31), this.c, 31), this.d, 31);
        Boolean bool = this.e;
        return ((i + (bool == null ? 0 : bool.hashCode())) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "LoginResponseFlags(success=" + this.a + ", message=" + this.b + ", sessionStatus=" + this.c + ", reasonCode=" + this.d + ", accountActive=" + this.e + ", forceLogout=" + this.f + ")";
    }
}
