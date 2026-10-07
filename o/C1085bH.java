package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.bH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085bH {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final List h;
    public final List i;

    public C1085bH(String str, int i, String str2, String str3, String str4, Integer num, String str5, List list, ArrayList arrayList) {
        AbstractC1474fG.j(str, "slug");
        AbstractC1474fG.j(str2, "title");
        AbstractC1474fG.j(list, "genres");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = list;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1085bH)) {
            return false;
        }
        C1085bH c1085bH = (C1085bH) obj;
        return AbstractC1474fG.b(this.a, c1085bH.a) && this.b == c1085bH.b && AbstractC1474fG.b(this.c, c1085bH.c) && AbstractC1474fG.b(this.d, c1085bH.d) && AbstractC1474fG.b(this.e, c1085bH.e) && AbstractC1474fG.b(this.f, c1085bH.f) && AbstractC1474fG.b(this.g, c1085bH.g) && AbstractC1474fG.b(this.h, c1085bH.h) && AbstractC1474fG.b(this.i, c1085bH.i);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(((this.a.hashCode() * 31) + this.b) * 31, this.c, 31);
        String str = this.d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.g;
        return this.i.hashCode() + AbstractC1674hK.j(this.h, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "MediaData(slug=" + this.a + ", numericId=" + this.b + ", title=" + this.c + ", overview=" + this.d + ", released=" + this.e + ", runtime=" + this.f + ", poster=" + this.g + ", genres=" + this.h + ", episodes=" + this.i + ")";
    }
}
