package o;

import android.util.Base64;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1229co extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f724o;
    public final /* synthetic */ Ds0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229co(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1229co) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1229co(this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String str;
        Object objJ;
        String str2;
        String str3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f724o;
        Ds0 ds0 = this.p;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
                return obj;
            }
            if (i == 2) {
                str = this.m;
                Jp0.O(obj);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = this.n;
                str3 = this.m;
                Jp0.O(obj);
                objJ = obj;
                str2 = str4;
            }
            String str5 = ((C0858Wd) objJ).a;
            C1424eo c1424eo = C1424eo.b;
            String str6 = (String) AbstractC1119bh0.t0(str3, new String[]{":"}, 0, 6).get(0);
            Map mapZ = AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"), new C1101bX("Origin", "https://www.clarovideo.com"), new C1101bX("Referer", "https://www.clarovideo.com/"));
            List listT0 = AbstractC1119bh0.t0(str3, new String[]{":"}, 0, 6);
            String str7 = (String) listT0.get(0);
            String str8 = (String) listT0.get(1);
            String strEncodeToString = Base64.encodeToString(C1424eo.r(str7), 11);
            byte[] bytes = ("{\"keys\":[{\"kty\":\"oct\",\"k\":\"" + Base64.encodeToString(C1424eo.r(str8), 11) + "\",\"kid\":\"" + strEncodeToString + "\"}],\"type\":\"temporary\"}").getBytes(AbstractC1305dd.a);
            AbstractC1474fG.i(bytes, "getBytes(...)");
            return new Js0(str5, mapZ, "dash", "clearkey", (String) null, bytes, str2, (String) null, str6, (List) null, false, 3728);
        }
        Jp0.O(obj);
        boolean zU = AbstractC1899jh0.U(ds0.l, "tigo-", false);
        String str9 = ds0.l;
        if (zU) {
            String strL0 = AbstractC1119bh0.l0(str9, "tigo-");
            String str10 = C3068vj0.a;
            this.f724o = 1;
            Object objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C2680rj0(strL0, null), this);
            return objJ2 == enumC1706hi ? enumC1706hi : objJ2;
        }
        C1424eo c1424eo2 = C1424eo.b;
        this.m = str9;
        this.f724o = 2;
        if (c1424eo2.o(str9, this) == enumC1706hi) {
            return enumC1706hi;
        }
        str = str9;
        Integer num = (Integer) C1424eo.f.get(str);
        if (num == null) {
            throw new Exception(AbstractC1701hf0.t("group_id no encontrado para ", str));
        }
        int iIntValue = num.intValue();
        String str11 = (String) C1424eo.g.get(str);
        if (str11 == null) {
            throw new Exception(AbstractC1701hf0.t("key_pair no encontrado para ", str));
        }
        String str12 = (String) C1424eo.e.get(str);
        if (str12 == null) {
            str12 = ds0.m;
        }
        C1600ge c1600ge = C1600ge.a;
        this.m = str11;
        this.n = str12;
        this.f724o = 3;
        objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1209ce(iIntValue, null), this);
        if (objJ == enumC1706hi) {
            return enumC1706hi;
        }
        str2 = str12;
        str3 = str11;
        String str13 = ((C0858Wd) objJ).a;
        C1424eo c1424eo3 = C1424eo.b;
        String str14 = (String) AbstractC1119bh0.t0(str3, new String[]{":"}, 0, 6).get(0);
        Map mapZ2 = AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"), new C1101bX("Origin", "https://www.clarovideo.com"), new C1101bX("Referer", "https://www.clarovideo.com/"));
        List listT1 = AbstractC1119bh0.t0(str3, new String[]{":"}, 0, 6);
        String str15 = (String) listT1.get(0);
        String str16 = (String) listT1.get(1);
        String strEncodeToString2 = Base64.encodeToString(C1424eo.r(str15), 11);
        byte[] bytes2 = ("{\"keys\":[{\"kty\":\"oct\",\"k\":\"" + Base64.encodeToString(C1424eo.r(str16), 11) + "\",\"kid\":\"" + strEncodeToString2 + "\"}],\"type\":\"temporary\"}").getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes2, "getBytes(...)");
        return new Js0(str13, mapZ2, "dash", "clearkey", (String) null, bytes2, str2, (String) null, str14, (List) null, false, 3728);
    }
}
