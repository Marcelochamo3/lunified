package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2420oz implements InterfaceC3106w3 {
    public final String a;
    public final String b;
    public final List c;
    public EnumC3203x3 d;

    public C2420oz(String str, String str2, List list) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        AbstractC1474fG.j(list, "shows");
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static C2420oz a(C2420oz c2420oz, ArrayList arrayList, int i) {
        String str = c2420oz.a;
        String str2 = c2420oz.b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = c2420oz.c;
        }
        c2420oz.getClass();
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        AbstractC1474fG.j(list, "shows");
        return new C2420oz(str, str2, list);
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.d;
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
        if (!AbstractC1474fG.b(C2420oz.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type com.skidush.clonex.models.Genre");
        C2420oz c2420oz = (C2420oz) obj;
        return AbstractC1474fG.b(this.a, c2420oz.a) && AbstractC1474fG.b(this.b, c2420oz.b) && AbstractC1474fG.b(this.c, c2420oz.c) && this.d != null && c2420oz.d != null && c() == c2420oz.c();
    }

    public final int hashCode() {
        return AbstractC1674hK.j(this.c, AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), 31) + (this.d != null ? c().hashCode() : 0);
    }

    public /* synthetic */ C2420oz(String str, String str2) {
        this(str, str2, C1233cq.l);
    }
}
