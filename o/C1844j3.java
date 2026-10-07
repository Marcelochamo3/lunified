package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1844j3 extends Ph0 implements InterfaceC0775Sy {
    public int m;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1844j3) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1844j3(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C2525q3 c2525q3 = C2525q3.b;
                this.m = 1;
                obj = C0856Wb.a.c("xAdultos página", false, new C1650h3(1, null, 0), new C1650h3(1, null, 1), this);
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
                return new C0882Xb("Trending", arrayListP);
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
