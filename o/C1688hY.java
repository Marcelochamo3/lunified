package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.hY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1688hY implements InterfaceC3106w3 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public EnumC3203x3 e;

    public C1688hY(String str, String str2, String str3, List list) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        AbstractC1474fG.j(list, "filmography");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public static C1688hY a(C1688hY c1688hY, ArrayList arrayList) {
        String str = c1688hY.a;
        String str2 = c1688hY.b;
        String str3 = c1688hY.c;
        c1688hY.getClass();
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        return new C1688hY(str, str2, str3, arrayList);
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.e;
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
        if (!AbstractC1474fG.b(C1688hY.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.People");
        C1688hY c1688hY = (C1688hY) obj;
        return AbstractC1474fG.b(this.a, c1688hY.a) && AbstractC1474fG.b(this.b, c1688hY.b) && AbstractC1474fG.b(this.c, c1688hY.c) && AbstractC1474fG.b(this.d, c1688hY.d) && this.e != null && c1688hY.e != null && c() == c1688hY.c();
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return AbstractC1674hK.j(this.d, (i + (str != null ? str.hashCode() : 0)) * 31, 31) + (this.e != null ? c().hashCode() : 0);
    }

    public /* synthetic */ C1688hY(String str, String str2, String str3, List list, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C1233cq.l : list);
    }
}
