package o;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1209ce extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209ce(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1209ce) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1209ce(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
        }
        Jp0.O(obj);
        String str = C0754Sd.a;
        this.m = 1;
        if (AbstractC1376eG.J(AbstractC1910jn.b, new C0728Rd(2, null), this) == enumC1706hi) {
            return enumC1706hi;
        }
        String str2 = C0754Sd.a;
        Map map = C0754Sd.g;
        if (map.isEmpty()) {
            throw new Exception("ClaroAndina config no disponible");
        }
        C1600ge c1600ge = C1600ge.a;
        int i2 = this.n;
        ArrayList arrayList = AbstractC2573qe.a;
        JSONObject jSONObject = C0754Sd.f;
        String strA = AbstractC2573qe.a(jSONObject != null ? jSONObject.optString("getmedia") : null, C0754Sd.c, EnumC2476pe.l);
        this.m = 2;
        obj = C1600ge.e(map, i2, strA, "resolveAndinaV2", null, this, 48);
        return obj == enumC1706hi ? enumC1706hi : obj;
    }
}
