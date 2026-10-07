package o;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: renamed from: o.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1492fY extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1492fY) o((String) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1492fY c1492fY = new C1492fY(2, interfaceC0473Hh);
        c1492fY.n = obj;
        return c1492fY;
    }

    @Override // o.R7
    public final Object r(Object obj) throws UnsupportedEncodingException {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            String strEncode = URLEncoder.encode((String) this.n, "UTF-8");
            C1590gY c1590gY = C1590gY.b;
            String strT = AbstractC1701hf0.t("https://pelisplus.to/search/", strEncode);
            this.m = 1;
            obj = C1590gY.p(strT, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        C1590gY c1590gY2 = C1590gY.b;
        return C1590gY.r((C0660On) obj);
    }
}
