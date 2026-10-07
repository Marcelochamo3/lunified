package o;

/* JADX INFO: renamed from: o.z30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3398z30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public C3398z30(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3398z30)) {
            return false;
        }
        C3398z30 c3398z30 = (C3398z30) obj;
        return Lr0.a(this.a, c3398z30.a) && Lr0.a(this.b, c3398z30.b) && Lr0.a(this.c, c3398z30.c) && Lr0.a(this.d, c3398z30.d) && Lr0.a(this.e, c3398z30.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
