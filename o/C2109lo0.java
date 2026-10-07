package o;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: renamed from: o.lo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2109lo0 implements Cd0, InterfaceC3106w3 {
    public String a;
    public String b;
    public String c;
    public Integer d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public String j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f900o;
    public Calendar p;
    public boolean q;
    public String r;
    public EnumC3203x3 s;

    public C2109lo0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AQ.w);
    }

    public static C2109lo0 a(C2109lo0 c2109lo0, String str, String str2, String str3, String str4, List list, List list2, int i) {
        String str5 = (i & 1) != 0 ? c2109lo0.a : str;
        String str6 = (i & 2) != 0 ? c2109lo0.b : str2;
        String str7 = (i & 4) != 0 ? c2109lo0.c : str3;
        Calendar calendar = c2109lo0.p;
        String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy-MM-dd") : null;
        Integer num = c2109lo0.d;
        String str8 = c2109lo0.e;
        String str9 = c2109lo0.f;
        Double d = c2109lo0.g;
        String str10 = c2109lo0.h;
        String str11 = (i & 512) != 0 ? c2109lo0.i : str4;
        String str12 = c2109lo0.j;
        List list3 = (i & C1672hI.a.g) != 0 ? c2109lo0.k : list;
        List list4 = c2109lo0.l;
        List list5 = c2109lo0.m;
        List list6 = c2109lo0.n;
        List list7 = (i & 32768) != 0 ? c2109lo0.f900o : list2;
        c2109lo0.getClass();
        AbstractC1474fG.j(str5, "id");
        AbstractC1474fG.j(str6, "title");
        AbstractC1474fG.j(list3, "seasons");
        AbstractC1474fG.j(list4, "genres");
        AbstractC1474fG.j(list5, "directors");
        AbstractC1474fG.j(list6, "cast");
        AbstractC1474fG.j(list7, "recommendations");
        C2109lo0 c2109lo1 = new C2109lo0(str5, str6, str7, strM, num, str8, str9, d, str10, str11, str12, list3, list4, list5, list6, list7);
        c2109lo1.r = c2109lo0.r;
        return c2109lo1;
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.s;
        if (enumC3203x3 != null) {
            return enumC3203x3;
        }
        AbstractC1474fG.U("itemType");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1474fG.b(C2109lo0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.TvShow");
        C2109lo0 c2109lo0 = (C2109lo0) obj;
        if (!AbstractC1474fG.b(this.a, c2109lo0.a) || !AbstractC1474fG.b(this.b, c2109lo0.b) || !AbstractC1474fG.b(this.c, c2109lo0.c) || !AbstractC1474fG.b(this.d, c2109lo0.d) || !AbstractC1474fG.b(this.e, c2109lo0.e) || !AbstractC1474fG.b(this.f, c2109lo0.f)) {
            return false;
        }
        Double d = this.g;
        Double d2 = c2109lo0.g;
        if (d != null ? !(d2 == null || d.doubleValue() != d2.doubleValue()) : d2 == null) {
            return AbstractC1474fG.b(this.h, c2109lo0.h) && AbstractC1474fG.b(this.i, c2109lo0.i) && AbstractC1474fG.b(this.k, c2109lo0.k) && AbstractC1474fG.b(this.l, c2109lo0.l) && AbstractC1474fG.b(this.m, c2109lo0.m) && AbstractC1474fG.b(this.n, c2109lo0.n) && AbstractC1474fG.b(this.f900o, c2109lo0.f900o) && AbstractC1474fG.b(this.p, c2109lo0.p) && this.q == c2109lo0.q && this.s != null && c2109lo0.s != null && c() == c2109lo0.c();
        }
        return false;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.d;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.e;
        int iHashCode2 = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Double d = this.g;
        int iHashCode4 = (iHashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        int iJ = AbstractC1674hK.j(this.f900o, AbstractC1674hK.j(this.n, AbstractC1674hK.j(this.m, AbstractC1674hK.j(this.l, AbstractC1674hK.j(this.k, (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        Calendar calendar = this.p;
        return ((((iJ + (calendar != null ? calendar.hashCode() : 0)) * 31) + (this.q ? 1231 : 1237)) * 31) + (this.s != null ? c().hashCode() : 0);
    }

    public C2109lo0(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Double d, String str7, String str8, String str9, List list, List list2, List list3, List list4, List list5) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "title");
        AbstractC1474fG.j(list, "seasons");
        AbstractC1474fG.j(list2, "genres");
        AbstractC1474fG.j(list3, "directors");
        AbstractC1474fG.j(list4, "cast");
        AbstractC1474fG.j(list5, "recommendations");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str5;
        this.f = str6;
        this.g = d;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.f900o = list5;
        this.p = str4 != null ? AbstractC0397Ej.K(str4) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2109lo0(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Double d, String str7, String str8, String str9, List list, List list2, ArrayList arrayList, List list3, List list4, int i) {
        String str10 = (i & 1) != 0 ? "" : str;
        String str11 = (i & 2) == 0 ? str2 : "";
        String str12 = (i & 4) != 0 ? null : str3;
        String str13 = (i & 8) != 0 ? null : str4;
        Integer num2 = (i & 16) != 0 ? null : num;
        String str14 = (i & 32) != 0 ? null : str5;
        String str15 = (i & 64) != 0 ? null : str6;
        Double d2 = (i & 128) != 0 ? null : d;
        String str16 = (i & 256) != 0 ? null : str7;
        String str17 = (i & 512) != 0 ? null : str8;
        String str18 = (i & 1024) == 0 ? str9 : null;
        int i2 = i & C1672hI.a.g;
        C1233cq c1233cq = C1233cq.l;
        this(str10, str11, str12, str13, num2, str14, str15, d2, str16, str17, str18, i2 != 0 ? c1233cq : list, (i & C1672hI.a.f) != 0 ? c1233cq : list2, (i & C1672hI.a.e) != 0 ? c1233cq : arrayList, (i & 16384) != 0 ? c1233cq : list3, (i & 32768) != 0 ? c1233cq : list4);
    }
}
