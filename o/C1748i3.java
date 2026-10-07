package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1748i3 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f823o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748i3(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f823o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1748i3) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1748i3(this.n, this.f823o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C2525q3 c2525q3 = C2525q3.b;
                String str = this.n;
                this.m = 1;
                obj = C0856Wb.a.c("xAdultos categoría", false, new C1454f3(1, 0, str, null), new C1454f3(1, 1, str, null), this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            ArrayList arrayListP = C2525q3.p((C0660On) obj);
            if (true ^ arrayListP.isEmpty()) {
                return new C0882Xb(this.f823o, arrayListP);
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
