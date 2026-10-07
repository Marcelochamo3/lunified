package o;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class SX extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SX(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f512o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((SX) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new SX(this.f512o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        Object objP;
        String str2;
        Object next;
        String strM;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C1233cq c1233cq = C1233cq.l;
        String str3 = this.f512o;
        try {
            if (i == 0) {
                Jp0.O(obj);
                int iG0 = AbstractC1119bh0.g0(str3, '/', 0, 6);
                if (iG0 == -1) {
                    return c1233cq;
                }
                String strSubstring = str3.substring(0, iG0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                String strSubstring2 = str3.substring(iG0 + 1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                if (AbstractC1899jh0.U(strSubstring, "anime/", false)) {
                    C1590gY c1590gY = C1590gY.b;
                    str = "https://pelisplus.to/";
                } else {
                    C1590gY c1590gY2 = C1590gY.b;
                    str = "https://pelisplus.to/serie/";
                }
                String strConcat = str.concat(strSubstring);
                C1590gY c1590gY3 = C1590gY.b;
                this.m = strSubstring2;
                this.n = 1;
                objP = C1590gY.p(strConcat, this);
                if (objP == enumC1706hi) {
                    return enumC1706hi;
                }
                str2 = strSubstring2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.m;
                Jp0.O(obj);
                objP = obj;
            }
            C3370yp c3370ypW = ((C0660On) objP).W("script");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            Iterator it = c3370ypW.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strM = ((C3176wp) next).M();
                AbstractC1474fG.i(strM, "data(...)");
            } while (!AbstractC1119bh0.W(strM, "seasonsJson", false));
            C3176wp c3176wp = (C3176wp) next;
            String strM2 = c3176wp != null ? c3176wp.M() : null;
            if (strM2 == null) {
                strM2 = "";
            }
            JSONArray jSONArray = new JSONObject(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strM2, "const seasonsJson = ", strM2), ";")).getJSONArray(str2);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                arrayList.add(new C0456Gq(str3 + "/" + jSONObject.getInt("episode"), jSONObject.getInt("episode"), jSONObject.getString("title"), null, "https://image.tmdb.org/t/p/w300" + jSONObject.getString("image"), null, null, 104));
            }
            return AbstractC0911Ye.r0(arrayList, new N2(23));
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }
}
