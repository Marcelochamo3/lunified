package o;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: renamed from: o.Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928Yv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0928Yv) o((String) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0928Yv c0928Yv = new C0928Yv(2, interfaceC0473Hh);
        c0928Yv.n = obj;
        return c0928Yv;
    }

    @Override // o.R7
    public final Object r(Object obj) throws UnsupportedEncodingException {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            String strEncode = URLEncoder.encode((String) this.n, "UTF-8");
            InterfaceC0305Av interfaceC0305Av = C0954Zv.d;
            String strT = AbstractC1701hf0.t("https://flixlatam.com/search?s=", strEncode);
            this.m = 1;
            obj = interfaceC0305Av.a(strT, "https://flixlatam.com", this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        C0954Zv c0954Zv = C0954Zv.b;
        C3370yp c3370ypW = ((C0660On) obj).W(".items article.item");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        return C0954Zv.A(c3370ypW);
    }
}
