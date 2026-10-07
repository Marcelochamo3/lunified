package o;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681Pi extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ C0707Qi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681Pi(String str, C0707Qi c0707Qi, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = c0707Qi;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0681Pi) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0681Pi(this.m, this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d A[PHI: r1
  0x003d: PHI (r1v19 java.lang.String) = (r1v8 java.lang.String), (r1v22 java.lang.String) binds: [B:16:0x0053, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String str;
        String strF;
        String str2;
        String strOptString;
        Jp0.O(obj);
        String str3 = this.m;
        boolean zW = AbstractC1119bh0.W(str3, ".m3u8", true);
        C0707Qi c0707Qi = this.n;
        if (zW) {
            I60 i60 = C0707Qi.d;
            c0707Qi.getClass();
            return C0707Qi.g(str3, null, null);
        }
        I60 i61 = C0707Qi.d;
        String string = AbstractC1119bh0.E0(str3).toString();
        JN jnB = C0707Qi.e.b(string, 0);
        if (jnB == null || (str = (String) AbstractC0911Ye.e0(1, jnB.a())) == null) {
            JN jnB2 = C0707Qi.d.b(string, 0);
            str = jnB2 != null ? (String) AbstractC0911Ye.e0(1, jnB2.a()) : null;
            if (str != null) {
                string = str;
            } else if (!C0707Qi.f.d(string)) {
                string = null;
            }
        } else {
            string = str;
        }
        if (string == null) {
            throw new Exception("Dailymotion: identificador de video inválido");
        }
        String strConcat = "https://www.dailymotion.com/video/".concat(string);
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://www.dailymotion.com/player/metadata/video/".concat(string));
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Mobile Safari/537.36");
        c0560Kq.j("Accept", "application/json");
        c0560Kq.j("Accept-Language", "es-419,es;q=0.9,en;q=0.7");
        c0560Kq.j("Referer", strConcat);
        C1855j80 c1855j80G = c0707Qi.c.c(c0560Kq.c()).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (!c1855j80G.p()) {
                throw new Exception("Dailymotion: metadata HTTP " + c1855j80G.f840o);
            }
            if (AbstractC1899jh0.O(strQ)) {
                throw new Exception("Dailymotion: metadata vacía");
            }
            JSONObject jSONObject = new JSONObject(strQ);
            AbstractC3409z9.g(c1855j80G, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("qualities");
            if (jSONObjectOptJSONObject == null) {
                strF = null;
                break;
            }
            strF = C0707Qi.f(jSONObjectOptJSONObject.optJSONArray("auto"));
            if (strF == null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (true) {
                    if (!itKeys.hasNext()) {
                        strF = null;
                        break;
                    }
                    String strF2 = C0707Qi.f(jSONObjectOptJSONObject.optJSONArray(itKeys.next()));
                    if (strF2 != null) {
                        strF = strF2;
                        break;
                    }
                }
            }
            if (strF != null) {
                String strOptString2 = jSONObject.optString("title");
                AbstractC1474fG.g(strOptString2);
                return C0707Qi.g(strF, strConcat, AbstractC1899jh0.O(strOptString2) ^ true ? strOptString2 : null);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("error");
            if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("message")) == null) {
                str2 = "Dailymotion: el video no ofrece un stream HLS disponible";
            } else {
                str2 = AbstractC1899jh0.O(strOptString) ^ true ? strOptString : null;
                if (str2 == null) {
                    str2 = "Dailymotion: el video no ofrece un stream HLS disponible";
                }
            }
            throw new Exception(str2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }
}
