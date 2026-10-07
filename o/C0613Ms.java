package o;

import java.util.List;

/* JADX INFO: renamed from: o.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613Ms {
    public final String a;
    public final EnumC0639Ns b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final C0769Ss i;
    public final C0769Ss j;
    public final C0769Ss k;
    public final C2893tt l;
    public final C2893tt m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f403o;
    public final String p;

    public C0613Ms(String str, EnumC0639Ns enumC0639Ns, String str2, String str3, String str4, String str5, String str6, boolean z, C0769Ss c0769Ss, C0769Ss c0769Ss2, C0769Ss c0769Ss3, C2893tt c2893tt, C2893tt c2893tt2, String str7, List list, String str8) {
        this.a = str;
        this.b = enumC0639Ns;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = c0769Ss;
        this.j = c0769Ss2;
        this.k = c0769Ss3;
        this.l = c2893tt;
        this.m = c2893tt2;
        this.n = str7;
        this.f403o = list;
        this.p = str8;
    }

    public static C0613Ms a(C0613Ms c0613Ms, String str, String str2, String str3, String str4, boolean z, C0769Ss c0769Ss, C0769Ss c0769Ss2, C0769Ss c0769Ss3, C2893tt c2893tt, C2893tt c2893tt2, String str5, List list, String str6, int i) {
        String str7 = c0613Ms.a;
        EnumC0639Ns enumC0639Ns = c0613Ms.b;
        String str8 = c0613Ms.c;
        String str9 = (i & 8) != 0 ? c0613Ms.d : str;
        String str10 = (i & 16) != 0 ? c0613Ms.e : str2;
        String str11 = (i & 32) != 0 ? c0613Ms.f : str3;
        String str12 = (i & 64) != 0 ? c0613Ms.g : str4;
        boolean z2 = (i & 128) != 0 ? c0613Ms.h : z;
        C0769Ss c0769Ss4 = (i & 256) != 0 ? c0613Ms.i : c0769Ss;
        C0769Ss c0769Ss5 = (i & 512) != 0 ? c0613Ms.j : c0769Ss2;
        C0769Ss c0769Ss6 = (i & 1024) != 0 ? c0613Ms.k : c0769Ss3;
        C2893tt c2893tt3 = (i & C1672hI.a.g) != 0 ? c0613Ms.l : c2893tt;
        C2893tt c2893tt4 = (i & C1672hI.a.f) != 0 ? c0613Ms.m : c2893tt2;
        String str13 = (i & C1672hI.a.e) != 0 ? c0613Ms.n : str5;
        List list2 = (i & 16384) != 0 ? c0613Ms.f403o : list;
        String str14 = (i & 32768) != 0 ? c0613Ms.p : str6;
        c0613Ms.getClass();
        AbstractC1474fG.j(str7, "id");
        AbstractC1474fG.j(enumC0639Ns, "kind");
        AbstractC1474fG.j(str8, "title");
        AbstractC1474fG.j(list2, "videos");
        return new C0613Ms(str7, enumC0639Ns, str8, str9, str10, str11, str12, z2, c0769Ss4, c0769Ss5, c0769Ss6, c2893tt3, c2893tt4, str13, list2, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613Ms)) {
            return false;
        }
        C0613Ms c0613Ms = (C0613Ms) obj;
        return AbstractC1474fG.b(this.a, c0613Ms.a) && this.b == c0613Ms.b && AbstractC1474fG.b(this.c, c0613Ms.c) && AbstractC1474fG.b(this.d, c0613Ms.d) && AbstractC1474fG.b(this.e, c0613Ms.e) && AbstractC1474fG.b(this.f, c0613Ms.f) && AbstractC1474fG.b(this.g, c0613Ms.g) && this.h == c0613Ms.h && AbstractC1474fG.b(this.i, c0613Ms.i) && AbstractC1474fG.b(this.j, c0613Ms.j) && AbstractC1474fG.b(this.k, c0613Ms.k) && AbstractC1474fG.b(this.l, c0613Ms.l) && AbstractC1474fG.b(this.m, c0613Ms.m) && AbstractC1474fG.b(this.n, c0613Ms.n) && AbstractC1474fG.b(this.f403o, c0613Ms.f403o) && AbstractC1474fG.b(this.p, c0613Ms.p);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        String str = this.d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        C0769Ss c0769Ss = this.i;
        int iHashCode5 = (iHashCode4 + (c0769Ss == null ? 0 : c0769Ss.hashCode())) * 31;
        C0769Ss c0769Ss2 = this.j;
        int iHashCode6 = (iHashCode5 + (c0769Ss2 == null ? 0 : c0769Ss2.hashCode())) * 31;
        C0769Ss c0769Ss3 = this.k;
        int iHashCode7 = (iHashCode6 + (c0769Ss3 == null ? 0 : c0769Ss3.hashCode())) * 31;
        C2893tt c2893tt = this.l;
        int iHashCode8 = (iHashCode7 + (c2893tt == null ? 0 : c2893tt.hashCode())) * 31;
        C2893tt c2893tt2 = this.m;
        int iHashCode9 = (iHashCode8 + (c2893tt2 == null ? 0 : c2893tt2.hashCode())) * 31;
        String str5 = this.n;
        int iJ = AbstractC1674hK.j(this.f403o, (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.p;
        return iJ + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FanaCard(id=");
        sb.append(this.a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", overview=");
        sb.append(this.d);
        sb.append(", league=");
        sb.append(this.e);
        sb.append(", startDate=");
        sb.append(this.f);
        sb.append(", status=");
        sb.append(this.g);
        sb.append(", isLive=");
        sb.append(this.h);
        sb.append(", poster=");
        sb.append(this.i);
        sb.append(", banner=");
        sb.append(this.j);
        sb.append(", logo=");
        sb.append(this.k);
        sb.append(", homeTeam=");
        sb.append(this.l);
        sb.append(", awayTeam=");
        sb.append(this.m);
        sb.append(", parentContentId=");
        sb.append(this.n);
        sb.append(", videos=");
        sb.append(this.f403o);
        sb.append(", displayCut=");
        return AbstractC1701hf0.h(sb, this.p, ")");
    }
}
