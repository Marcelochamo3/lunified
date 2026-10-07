package o;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ye0 extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f640o;
    public final /* synthetic */ List p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye0(String str, List list, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f640o = str;
        this.p = list;
        this.q = str2;
    }

    public static final C1951k70 w(C2243n70 c2243n70, String str) throws UnsupportedEncodingException {
        String str2;
        C0560Kq c0560Kq = new C0560Kq();
        C1603gf0 c1603gf0 = C1603gf0.b;
        c0560Kq.u("https://sololatino.net/api/player-url");
        c0560Kq.m("POST", c2243n70);
        c0560Kq.j("Referer", str);
        c0560Kq.j("X-Requested-With", "XMLHttpRequest");
        c0560Kq.j("Content-Type", "application/json");
        c0560Kq.j("Accept", "application/json");
        InterfaceC0654Oh interfaceC0654Oh = C1603gf0.c.u;
        C2349oE c2349oE = new C2349oE();
        Object obj = null;
        c2349oE.g(null, "https://sololatino.net");
        for (Object obj2 : interfaceC0654Oh.h(c2349oE.b())) {
            if (AbstractC1474fG.b(((C0628Nh) obj2).a, "XSRF-TOKEN")) {
                obj = obj2;
                break;
            }
        }
        C0628Nh c0628Nh = (C0628Nh) obj;
        if (c0628Nh != null && (str2 = c0628Nh.b) != null) {
            String strDecode = URLDecoder.decode(str2, "UTF-8");
            AbstractC1474fG.i(strDecode, "decode(...)");
            c0560Kq.j("X-XSRF-TOKEN", strDecode);
        }
        return c0560Kq.c();
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ye0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ye0(this.f640o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        List list;
        Iterable iterable;
        List list2;
        String str = this.q;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                String string = new JSONObject().put("t", this.f640o).toString();
                AbstractC1474fG.i(string, "toString(...)");
                Pattern pattern = TP.e;
                C2243n70 c2243n70K = C2743sL.k(string, AbstractC1474fG.o("application/json"));
                OV ov = C1603gf0.c;
                C1855j80 c1855j80G = ov.c(w(c2243n70K, str)).g();
                int i2 = c1855j80G.f840o;
                if (i2 == 419 || i2 == 403) {
                    c1855j80G.close();
                    C0560Kq c0560Kq = new C0560Kq();
                    c0560Kq.u("https://sololatino.net/sanctum/csrf-cookie");
                    ov.c(c0560Kq.c()).g().close();
                    c1855j80G = ov.c(w(c2243n70K, str)).g();
                }
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : "";
                c1855j80G.close();
                String strOptString = new JSONObject(strQ).optString("url");
                list = this.p;
                AbstractC1474fG.g(strOptString);
                if (strOptString.length() > 0) {
                    C1603gf0 c1603gf0 = C1603gf0.b;
                    this.m = list;
                    this.n = 1;
                    obj = c1603gf0.y(strOptString, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list2 = list;
                } else {
                    iterable = C1233cq.l;
                }
                AbstractC1406ef.Q(list, iterable);
                return C2985uq0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = this.m;
            Jp0.O(obj);
            iterable = (List) obj;
            list = list2;
            AbstractC1406ef.Q(list, iterable);
            return C2985uq0.a;
        } catch (Exception e) {
            return new Integer(Log.w("SoloLatinoProvider", "playerToken error: " + e.getMessage()));
        }
    }
}
