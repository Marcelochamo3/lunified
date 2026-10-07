package o;

import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329Bt {
    public static final C0329Bt a = new C0329Bt();
    public static final String b = AbstractC3238xV.a("1wyfWd7hFYxjuGrkSHWArwk/B9sPJZJd");
    public static final I60 c = new I60("^[a-fA-F0-9]{24}$");
    public static final Set d = Lc0.T("sortByAsc", "sortByDesc", "filterBy-appCode", "filterBy-__belong.Tournament", "paginate");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3475zt c3475zt;
        if (interfaceC0473Hh instanceof C3475zt) {
            c3475zt = (C3475zt) interfaceC0473Hh;
            int i = c3475zt.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3475zt.n = i - Integer.MIN_VALUE;
            } else {
                c3475zt = new C3475zt(this, interfaceC0473Hh);
            }
        } else {
            c3475zt = new C3475zt(this, interfaceC0473Hh);
        }
        Object objN = c3475zt.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3475zt.n;
        if (i2 == 0) {
            Jp0.O(objN);
            JSONObject jSONObjectPut = new JSONObject().put("contract", 1).put("series_id", str);
            AbstractC1474fG.i(jSONObjectPut, "put(...)");
            c3475zt.n = 1;
            objN = Ec0.a.n(new C0303At(jSONObjectPut, null), c3475zt);
            if (objN == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objN);
        }
        String string = ((JSONObject) objN).toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }
}
