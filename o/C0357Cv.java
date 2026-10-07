package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0357Cv {
    public final String a;
    public final String b;
    public final String c;
    public final Double d;
    public final String e;
    public final List f;

    public C0357Cv(String str, String str2, String str3, Double d, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = str4;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0357Cv)) {
            return false;
        }
        C0357Cv c0357Cv = (C0357Cv) obj;
        if (!AbstractC1474fG.b(this.a, c0357Cv.a) || !AbstractC1474fG.b(this.b, c0357Cv.b) || !AbstractC1474fG.b(this.c, c0357Cv.c) || !AbstractC1474fG.b(this.d, c0357Cv.d) || !AbstractC1474fG.b(this.e, c0357Cv.e) || !AbstractC1474fG.b(this.f, c0357Cv.f)) {
            return false;
        }
        C1233cq c1233cq = C1233cq.l;
        return AbstractC1474fG.b(c1233cq, c1233cq);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.e;
        return ((this.f.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31) + 1;
    }

    public final String toString() {
        return "ShowDetails(poster=" + this.a + ", banner=" + this.b + ", overview=" + this.c + ", rating=" + this.d + ", released=" + this.e + ", genres=" + this.f + ", cast=" + C1233cq.l + ")";
    }
}
