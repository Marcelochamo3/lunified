package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.tj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2874tj0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2874tj0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2874tj0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2874tj0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        C2390oj0 c2390oj0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = this.n;
            if (str == null && (c2390oj0 = C3068vj0.c) != null) {
                if (jCurrentTimeMillis - C3068vj0.d >= 60000) {
                    c2390oj0 = null;
                }
                if (c2390oj0 != null) {
                    return c2390oj0;
                }
            }
            Ec0 ec0 = Ec0.a;
            C2777sj0 c2777sj0 = new C2777sj0(str, null);
            this.m = 1;
            obj = ec0.n(c2777sj0, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        JSONObject jSONObject = new JSONObject((String) obj);
        String strOptString = jSONObject.getJSONObject("tokens").optString("ts_b");
        AbstractC1474fG.g(strOptString);
        if (strOptString.length() == 0) {
            throw new Exception("ts_b vacío en renovar_tokens.php");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("account");
        String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("uuid") : null;
        if (strOptString2 == null) {
            strOptString2 = "";
        }
        C2390oj0 c2390oj1 = new C2390oj0(strOptString, strOptString2);
        C3068vj0.c = c2390oj1;
        C3068vj0.d = System.currentTimeMillis();
        return c2390oj1;
    }
}
