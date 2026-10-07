package o;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
public final class YI extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((YI) o((String) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        YI yi = new YI(2, interfaceC0473Hh);
        yi.n = obj;
        return yi;
    }

    @Override // o.R7
    public final Object r(Object obj) throws UnsupportedEncodingException {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            String strEncode = URLEncoder.encode((String) this.n, "UTF-8");
            ZI zi = ZI.b;
            String strT = AbstractC1701hf0.t("https://www.lacartoons.com/?utf8=%E2%9C%93&Titulo=", strEncode);
            PI pi = ZI.c;
            this.m = 1;
            obj = pi.a(strT, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        ZI zi2 = ZI.b;
        return ZI.p((C0660On) obj);
    }
}
