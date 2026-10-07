package o;

/* JADX INFO: renamed from: o.sc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2763sc0 {
    public final String a;
    public final int b;
    public final Throwable c;
    public final String d;

    public C2763sc0(String str, int i, Exception exc, String str2, int i2) {
        exc = (i2 & 4) != 0 ? null : exc;
        str2 = (i2 & 8) != 0 ? null : str2;
        this.a = str;
        this.b = i;
        this.c = exc;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2763sc0)) {
            return false;
        }
        C2763sc0 c2763sc0 = (C2763sc0) obj;
        return AbstractC1474fG.b(this.a, c2763sc0.a) && this.b == c2763sc0.b && AbstractC1474fG.b(this.c, c2763sc0.c) && AbstractC1474fG.b(this.d, c2763sc0.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        Throwable th = this.c;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ValidationRequestResult(body=" + this.a + ", httpCode=" + this.b + ", error=" + this.c + ", cookieHeader=" + this.d + ")";
    }
}
