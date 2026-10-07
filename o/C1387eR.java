package o;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.eR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1387eR implements Cd0, InterfaceC2220mv0, InterfaceC3106w3 {
    public String a;
    public String b;
    public String c;
    public Integer d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final Map n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Calendar f754o;
    public boolean p;
    public boolean q;
    public Calendar r;
    public C2123lv0 s;
    public String t;
    public EnumC3203x3 u;

    public C1387eR() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public static C1387eR f(C1387eR c1387eR, String str, List list, int i) {
        String str2 = c1387eR.a;
        String str3 = c1387eR.b;
        String str4 = c1387eR.c;
        Calendar calendar = c1387eR.f754o;
        String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy-MM-dd") : null;
        Integer num = c1387eR.d;
        String str5 = c1387eR.e;
        String str6 = c1387eR.f;
        Double d = c1387eR.g;
        String str7 = c1387eR.h;
        String str8 = (i & 512) != 0 ? c1387eR.i : str;
        List list2 = c1387eR.j;
        List list3 = c1387eR.k;
        List list4 = c1387eR.l;
        List list5 = (i & C1672hI.a.e) != 0 ? c1387eR.m : list;
        Map map = c1387eR.n;
        c1387eR.getClass();
        AbstractC1474fG.j(str2, "id");
        AbstractC1474fG.j(str3, "title");
        AbstractC1474fG.j(list2, "genres");
        AbstractC1474fG.j(list3, "directors");
        AbstractC1474fG.j(list4, "cast");
        AbstractC1474fG.j(list5, "recommendations");
        AbstractC1474fG.j(map, "extra");
        C1387eR c1387eR2 = new C1387eR(str2, str3, str4, strM, num, str5, str6, d, str7, str8, list2, list3, list4, list5, map);
        c1387eR2.t = c1387eR.t;
        return c1387eR2;
    }

    @Override // o.InterfaceC2220mv0
    public final void a(Calendar calendar) {
        this.r = calendar;
    }

    @Override // o.InterfaceC2220mv0
    public final C2123lv0 b() {
        return this.s;
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.u;
        if (enumC3203x3 != null) {
            return enumC3203x3;
        }
        AbstractC1474fG.U("itemType");
        throw null;
    }

    @Override // o.InterfaceC2220mv0
    public final void d(C2123lv0 c2123lv0) {
        this.s = c2123lv0;
    }

    @Override // o.InterfaceC2220mv0
    public final void e(boolean z) {
        this.q = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1474fG.b(C1387eR.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Movie");
        C1387eR c1387eR = (C1387eR) obj;
        if (!AbstractC1474fG.b(this.a, c1387eR.a) || !AbstractC1474fG.b(this.b, c1387eR.b) || !AbstractC1474fG.b(this.c, c1387eR.c) || !AbstractC1474fG.b(this.d, c1387eR.d) || !AbstractC1474fG.b(this.e, c1387eR.e) || !AbstractC1474fG.b(this.f, c1387eR.f)) {
            return false;
        }
        Double d = this.g;
        Double d2 = c1387eR.g;
        if (d != null ? !(d2 == null || d.doubleValue() != d2.doubleValue()) : d2 == null) {
            return AbstractC1474fG.b(this.h, c1387eR.h) && AbstractC1474fG.b(this.i, c1387eR.i) && AbstractC1474fG.b(this.j, c1387eR.j) && AbstractC1474fG.b(this.k, c1387eR.k) && AbstractC1474fG.b(this.l, c1387eR.l) && AbstractC1474fG.b(this.m, c1387eR.m) && AbstractC1474fG.b(this.f754o, c1387eR.f754o) && this.p == c1387eR.p && this.q == c1387eR.q && AbstractC1474fG.b(this.r, c1387eR.r) && AbstractC1474fG.b(this.s, c1387eR.s) && this.u != null && c1387eR.u != null && AbstractC1474fG.b(this.n, c1387eR.n) && c() == c1387eR.c();
        }
        return false;
    }

    public final boolean g(C1387eR c1387eR) {
        return this.p == c1387eR.p && this.q == c1387eR.q && AbstractC1474fG.b(this.r, c1387eR.r) && AbstractC1474fG.b(this.s, c1387eR.s);
    }

    public final void h(C1387eR c1387eR) {
        AbstractC1474fG.j(c1387eR, "movie");
        this.p = c1387eR.p;
        this.q = c1387eR.q;
        this.r = c1387eR.r;
        this.s = c1387eR.s;
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
        int iJ = AbstractC1674hK.j(this.m, AbstractC1674hK.j(this.l, AbstractC1674hK.j(this.k, AbstractC1674hK.j(this.j, (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31), 31), 31), 31);
        Calendar calendar = this.f754o;
        int iHashCode6 = (((((iJ + (calendar != null ? calendar.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31;
        Calendar calendar2 = this.r;
        int iHashCode7 = (iHashCode6 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        C2123lv0 c2123lv0 = this.s;
        return this.n.hashCode() + ((((iHashCode7 + (c2123lv0 != null ? c2123lv0.hashCode() : 0)) * 31) + (this.u != null ? c().hashCode() : 0)) * 31);
    }

    public C1387eR(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Double d, String str7, String str8, List list, List list2, List list3, List list4, Map map) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "title");
        AbstractC1474fG.j(list, "genres");
        AbstractC1474fG.j(list2, "directors");
        AbstractC1474fG.j(list3, "cast");
        AbstractC1474fG.j(list4, "recommendations");
        AbstractC1474fG.j(map, "extra");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str5;
        this.f = str6;
        this.g = d;
        this.h = str7;
        this.i = str8;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = list4;
        this.n = map;
        this.f754o = str4 != null ? AbstractC0397Ej.K(str4) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1387eR(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Double d, String str7, String str8, List list, List list2, List list3, List list4, Map map, int i) {
        String str9 = (i & 1) != 0 ? "" : str;
        String str10 = (i & 2) == 0 ? str2 : "";
        String str11 = (i & 4) != 0 ? null : str3;
        String str12 = (i & 8) != 0 ? null : str4;
        Integer num2 = (i & 16) != 0 ? null : num;
        String str13 = (i & 32) != 0 ? null : str5;
        String str14 = (i & 64) != 0 ? null : str6;
        Double d2 = (i & 128) != 0 ? null : d;
        String str15 = (i & 256) != 0 ? null : str7;
        String str16 = (i & 512) == 0 ? str8 : null;
        int i2 = i & 1024;
        List list5 = C1233cq.l;
        this(str9, str10, str11, str12, num2, str13, str14, d2, str15, str16, i2 != 0 ? list5 : list, (i & C1672hI.a.g) != 0 ? list5 : list2, (i & C1672hI.a.f) != 0 ? list5 : list3, (i & C1672hI.a.e) == 0 ? list4 : list5, (i & 16384) != 0 ? C1330dq.l : map);
    }
}
