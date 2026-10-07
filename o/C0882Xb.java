package o;

import java.util.List;

/* JADX INFO: renamed from: o.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0882Xb implements InterfaceC3106w3 {
    public String a;
    public List b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public EnumC3203x3 h;

    public C0882Xb(String str, List list) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(list, "list");
        this.a = str;
        this.b = list;
        this.e = list.size();
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.h;
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
        if (!AbstractC1474fG.b(C0882Xb.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Category");
        C0882Xb c0882Xb = (C0882Xb) obj;
        return AbstractC1474fG.b(this.a, c0882Xb.a) && AbstractC1474fG.b(this.b, c0882Xb.b) && this.c == c0882Xb.c && this.d == c0882Xb.d && this.e == c0882Xb.e && AbstractC1474fG.b(this.g, c0882Xb.g) && this.h != null && c0882Xb.h != null && c() == c0882Xb.c();
    }

    public final int hashCode() {
        int iJ = (((((AbstractC1674hK.j(this.b, this.a.hashCode() * 31, 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        String str = this.g;
        return ((iJ + (str != null ? str.hashCode() : 0)) * 31) + (this.h != null ? c().hashCode() : 0);
    }
}
