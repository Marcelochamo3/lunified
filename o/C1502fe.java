package o;

import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502fe extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Map f776o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502fe(int i, Map map, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
        this.f776o = map;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1502fe) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1502fe(this.n, this.f776o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Object obj2 = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new V60(2, null), this);
            if (objJ != obj2) {
                objJ = C2985uq0.a;
            }
            if (objJ == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        StringBuilder sb = new StringBuilder(C1600ge.c());
        sb.append("?");
        Map map = this.f776o;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(((String) entry.getKey()) + "=" + URLEncoder.encode((String) entry.getValue(), "UTF-8") + "&");
        }
        if (!map.containsKey("group_id")) {
            sb.append("group_id=" + this.n);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        JSONObject jSONObject = new JSONObject(C1600ge.b(AbstractC1119bh0.G0(string, '&')));
        if (jSONObject.optInt("status") == 200) {
            return jSONObject.getJSONObject("response").getJSONObject("media").getString("video_url");
        }
        throw new Exception(AbstractC1674hK.n(jSONObject.optInt("status"), "Claro API status: "));
    }
}
