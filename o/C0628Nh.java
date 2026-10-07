package o;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628Nh {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C0628Nh(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean a(C2446pE c2446pE) {
        AbstractC1474fG.j(c2446pE, "url");
        boolean z = this.i;
        String str = this.d;
        String str2 = c2446pE.d;
        if (!(z ? AbstractC1474fG.b(str2, str) : Jp0.n(str2, str))) {
            return false;
        }
        String strB = c2446pE.b();
        String str3 = this.e;
        if (!AbstractC1474fG.b(strB, str3)) {
            if (!AbstractC1899jh0.U(strB, str3, false)) {
                return false;
            }
            if (!AbstractC1899jh0.L(str3, "/", false) && strB.charAt(str3.length()) != '/') {
                return false;
            }
        }
        return !this.f || c2446pE.j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0628Nh) {
            C0628Nh c0628Nh = (C0628Nh) obj;
            if (AbstractC1474fG.b(c0628Nh.a, this.a) && AbstractC1474fG.b(c0628Nh.b, this.b) && c0628Nh.c == this.c && AbstractC1474fG.b(c0628Nh.d, this.d) && AbstractC1474fG.b(c0628Nh.e, this.e) && c0628Nh.f == this.f && c0628Nh.g == this.g && c0628Nh.h == this.h && c0628Nh.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(527, this.a, 31), this.b, 31);
        long j2 = this.c;
        return ((((((AbstractC1674hK.i(AbstractC1674hK.i((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, this.d, 31), this.e, 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC0319Bj.a.get()).format(new Date(j2));
                AbstractC1474fG.i(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString()");
        return string;
    }
}
