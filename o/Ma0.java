package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ma0 implements InterfaceC3106w3 {
    public String a;
    public int b;
    public String c;
    public String d;
    public C2109lo0 e;
    public List f;
    public EnumC3203x3 g;

    public Ma0() {
        this(null, 0, null, null, null, null, 63);
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.g;
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
        if (!AbstractC1474fG.b(Ma0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Season");
        Ma0 ma0 = (Ma0) obj;
        return AbstractC1474fG.b(this.a, ma0.a) && this.b == ma0.b && AbstractC1474fG.b(this.c, ma0.c) && AbstractC1474fG.b(this.d, ma0.d) && AbstractC1474fG.b(this.e, ma0.e) && AbstractC1474fG.b(this.f, ma0.f) && this.g != null && ma0.g != null && c() == ma0.c();
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C2109lo0 c2109lo0 = this.e;
        return AbstractC1674hK.j(this.f, (iHashCode3 + (c2109lo0 != null ? c2109lo0.hashCode() : 0)) * 31, 31) + (this.g != null ? c().hashCode() : 0);
    }

    public Ma0(String str, int i, String str2, String str3, C2109lo0 c2109lo0, List list) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(list, "episodes");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = c2109lo0;
        this.f = list;
    }

    public /* synthetic */ Ma0(String str, int i, String str2, String str3, C2109lo0 c2109lo0, List list, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : c2109lo0, (i2 & 32) != 0 ? C1233cq.l : list);
    }
}
