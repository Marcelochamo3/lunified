package o;

import java.util.List;

/* JADX INFO: renamed from: o.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0951Zs extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f666o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0951Zs(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f666o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0951Zs) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0951Zs(this.n, this.f666o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        String str2 = this.n;
        if (i == 0) {
            Jp0.O(obj);
            List list = (List) C2409ot.g.get(str2);
            if (list != null) {
                return list;
            }
            String str3 = null;
            String str4 = this.f666o;
            if (str4 != null) {
                String strL0 = AbstractC1119bh0.l0(str4, "fana-show|");
                if (!(!AbstractC1899jh0.O(strL0))) {
                    strL0 = null;
                }
                if (strL0 != null) {
                    str3 = strL0;
                } else {
                    str = (String) AbstractC0911Ye.e0(1, AbstractC1119bh0.s0(str2, new char[]{'|'}, 0, 6));
                    if (str != null && (!AbstractC1899jh0.O(str))) {
                        str3 = str;
                    }
                }
            } else {
                str = (String) AbstractC0911Ye.e0(1, AbstractC1119bh0.s0(str2, new char[]{'|'}, 0, 6));
                if (str != null) {
                    str3 = str;
                }
            }
            if (str3 != null) {
                C2409ot c2409ot = C2409ot.b;
                String strConcat = "fana-show|".concat(str3);
                this.m = 1;
                if (c2409ot.z(strConcat, this) == enumC1706hi) {
                    return enumC1706hi;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        List list2 = (List) C2409ot.g.get(str2);
        return list2 == null ? C1233cq.l : list2;
    }
}
