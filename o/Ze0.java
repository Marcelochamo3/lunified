package o;

import android.util.Log;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ze0 extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f659o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ze0(String str, String str2, String str3, List list, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f659o = str;
        this.p = str2;
        this.q = str3;
        this.r = list;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ze0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ze0(this.f659o, this.p, this.q, this.r, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        List list;
        List list2;
        String str = this.q;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C0560Kq c0560Kq = new C0560Kq();
                C1603gf0 c1603gf0 = C1603gf0.b;
                c0560Kq.u("https://sololatino.net/api/player-url/" + this.f659o + "/" + this.p);
                c0560Kq.j("Referer", str);
                c0560Kq.j("X-Requested-With", "XMLHttpRequest");
                C1855j80 c1855j80G = C1603gf0.c.c(c0560Kq.c()).g();
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                String strOptString = new JSONObject(abstractC2051l80 != null ? abstractC2051l80.q() : "{}").optString("url");
                c1855j80G.close();
                List list3 = this.r;
                AbstractC1474fG.g(strOptString);
                if (strOptString.length() > 0) {
                    this.m = list3;
                    this.n = 1;
                    Object objY = c1603gf0.y(strOptString, str, this);
                    if (objY == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = list3;
                    obj = objY;
                } else {
                    list = list3;
                    list2 = C1233cq.l;
                }
                AbstractC1406ef.Q(list, list2);
                return C2985uq0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.m;
            Jp0.O(obj);
            list2 = (List) obj;
            AbstractC1406ef.Q(list, list2);
            return C2985uq0.a;
        } catch (Exception e) {
            return new Integer(Log.w("SoloLatinoProvider", "playerId error: " + e.getMessage()));
        }
    }
}
