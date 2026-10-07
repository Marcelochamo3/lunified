package o;

import android.net.Uri;

/* JADX INFO: renamed from: o.p50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2433p50 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public C2433p50(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final C2433p50 a(C2433p50 c2433p50, String str) {
        long j;
        String strC = AbstractC3045vW.C(str, this.c);
        if (c2433p50 == null || !strC.equals(AbstractC3045vW.C(str, c2433p50.c))) {
            return null;
        }
        long j2 = c2433p50.b;
        long j3 = this.b;
        if (j3 != -1) {
            long j4 = this.a;
            if (j4 + j3 == c2433p50.a) {
                return new C2433p50(j4, j2 == -1 ? -1L : j3 + j2, strC);
            }
            j = -1;
        } else {
            j = -1;
        }
        if (j2 != j) {
            long j5 = c2433p50.a;
            if (j5 + j2 == this.a) {
                return new C2433p50(j5, j3 == -1 ? -1L : j2 + j3, strC);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return AbstractC3045vW.F(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2433p50.class != obj.getClass()) {
            return false;
        }
        C2433p50 c2433p50 = (C2433p50) obj;
        return this.a == c2433p50.a && this.b == c2433p50.b && this.c.equals(c2433p50.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return AbstractC1674hK.q(sb, this.b, ")");
    }
}
