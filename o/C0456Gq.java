package o;

import java.util.Calendar;

/* JADX INFO: renamed from: o.Gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0456Gq implements InterfaceC2220mv0, InterfaceC3106w3 {
    public String a;
    public int b;
    public String c;
    public String d;
    public C2109lo0 e;
    public Ma0 f;
    public Calendar g;
    public boolean h;
    public Calendar i;
    public C2123lv0 j;
    public String k;
    public EnumC3203x3 l;

    public C0456Gq() {
        this(null, 0, null, null, null, null, null, Yu0.b.k0);
    }

    public static C0456Gq f(C0456Gq c0456Gq) {
        String str = c0456Gq.a;
        int i = c0456Gq.b;
        String str2 = c0456Gq.c;
        Calendar calendar = c0456Gq.g;
        String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy-MM-dd") : null;
        String str3 = c0456Gq.d;
        C2109lo0 c2109lo0 = c0456Gq.e;
        Ma0 ma0 = c0456Gq.f;
        AbstractC1474fG.j(str, "id");
        C0456Gq c0456Gq2 = new C0456Gq(str, i, str2, strM, str3, c2109lo0, ma0);
        c0456Gq2.k = c0456Gq.k;
        return c0456Gq2;
    }

    @Override // o.InterfaceC2220mv0
    public final void a(Calendar calendar) {
        this.i = calendar;
    }

    @Override // o.InterfaceC2220mv0
    public final C2123lv0 b() {
        return this.j;
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.l;
        if (enumC3203x3 != null) {
            return enumC3203x3;
        }
        AbstractC1474fG.U("itemType");
        throw null;
    }

    @Override // o.InterfaceC2220mv0
    public final void d(C2123lv0 c2123lv0) {
        this.j = c2123lv0;
    }

    @Override // o.InterfaceC2220mv0
    public final void e(boolean z) {
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1474fG.b(C0456Gq.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Episode");
        C0456Gq c0456Gq = (C0456Gq) obj;
        return AbstractC1474fG.b(this.a, c0456Gq.a) && this.b == c0456Gq.b && AbstractC1474fG.b(this.c, c0456Gq.c) && AbstractC1474fG.b(this.d, c0456Gq.d) && AbstractC1474fG.b(this.e, c0456Gq.e) && AbstractC1474fG.b(this.f, c0456Gq.f) && AbstractC1474fG.b(this.g, c0456Gq.g) && this.h == c0456Gq.h && AbstractC1474fG.b(this.i, c0456Gq.i) && AbstractC1474fG.b(this.j, c0456Gq.j) && AbstractC1474fG.b(this.k, c0456Gq.k) && this.l != null && c0456Gq.l != null && c() == c0456Gq.c();
    }

    public final void g(C0456Gq c0456Gq) {
        AbstractC1474fG.j(c0456Gq, "episode");
        this.h = c0456Gq.h;
        this.i = c0456Gq.i;
        this.j = c0456Gq.j;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C2109lo0 c2109lo0 = this.e;
        int iHashCode4 = (iHashCode3 + (c2109lo0 != null ? c2109lo0.hashCode() : 0)) * 31;
        Ma0 ma0 = this.f;
        int iHashCode5 = (iHashCode4 + (ma0 != null ? ma0.hashCode() : 0)) * 31;
        Calendar calendar = this.g;
        int iHashCode6 = (((iHashCode5 + (calendar != null ? calendar.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237)) * 31;
        Calendar calendar2 = this.i;
        int iHashCode7 = (iHashCode6 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        C2123lv0 c2123lv0 = this.j;
        int iHashCode8 = (iHashCode7 + (c2123lv0 != null ? c2123lv0.hashCode() : 0)) * 31;
        String str3 = this.k;
        return ((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.l != null ? c().hashCode() : 0);
    }

    public C0456Gq(String str, int i, String str2, String str3, String str4, C2109lo0 c2109lo0, Ma0 ma0) {
        AbstractC1474fG.j(str, "id");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str4;
        this.e = c2109lo0;
        this.f = ma0;
        this.g = str3 != null ? AbstractC0397Ej.K(str3) : null;
    }

    public /* synthetic */ C0456Gq(String str, int i, String str2, String str3, String str4, C2109lo0 c2109lo0, Ma0 ma0, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : c2109lo0, (i2 & 64) == 0 ? ma0 : null);
    }
}
