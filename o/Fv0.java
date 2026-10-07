package o;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Fv0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Map f266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fv0(String str, Map map, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f266o = map;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Fv0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Fv0 fv0 = new Fv0(this.n, this.f266o, interfaceC0473Hh);
        fv0.m = obj;
        return fv0;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        String host;
        ?? r3;
        C1855j80 c1855j80;
        String str;
        Throwable th;
        ?? r4;
        String str2;
        String str3 = "Origin";
        String str4 = this.n;
        Jp0.O(obj);
        try {
            objK = Uri.parse(str4);
        } catch (Throwable th2) {
            objK = Jp0.k(th2);
        }
        Object objK2 = null;
        if (objK instanceof C2439p80) {
            objK = null;
        }
        Uri uri = (Uri) objK;
        if (uri != null && (host = uri.getHost()) != null) {
            String lowerCase = host.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            if (!AbstractC1474fG.b(lowerCase, "kick.com") && !AbstractC1474fG.b(lowerCase, "www.kick.com")) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            AbstractC1474fG.i(pathSegments, "getPathSegments(...)");
            String str5 = (String) AbstractC0911Ye.d0(pathSegments);
            if (str5 != null) {
                if (!(!AbstractC1899jh0.O(str5)) || Lc0.T("api", "category", "categories", "video").contains(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    String strT = AbstractC1701hf0.t("https://kick.com/api/v2/channels/", Uri.encode(str5));
                    Map map = this.f266o;
                    try {
                        C0560Kq c0560Kq = new C0560Kq();
                        c0560Kq.u(strT);
                        c0560Kq.j("Accept", "application/json");
                        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                        c0560Kq.j("Referer", str4);
                        c0560Kq.j("Origin", "https://kick.com");
                        for (Map.Entry entry : AbstractC1468fA.a(str4, strT, map).entrySet()) {
                            String str6 = (String) entry.getKey();
                            String str7 = (String) entry.getValue();
                            if (!AbstractC1899jh0.U(str6, "_channel_", false)) {
                                c0560Kq.j(str6, str7);
                            }
                        }
                        try {
                            C1855j80 c1855j80G = ((OV) Hv0.c.getValue()).c(c0560Kq.c()).g();
                            try {
                                if (c1855j80G.p()) {
                                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                                    if (abstractC2051l80 != null) {
                                        String strQ = abstractC2051l80.q();
                                        if (!(!AbstractC1899jh0.O(strQ))) {
                                            strQ = null;
                                        }
                                        if (strQ != null) {
                                            JSONObject jSONObject = new JSONObject(strQ);
                                            String strOptString = jSONObject.optString("playback_url");
                                            if (!(!AbstractC1899jh0.O(strOptString))) {
                                                strOptString = null;
                                            }
                                            if (strOptString != null) {
                                                I60 i60 = SB.a;
                                                String strE = SB.e(strOptString, str4);
                                                if (strE != null) {
                                                    if (!AbstractC1468fA.s(strE)) {
                                                        strE = null;
                                                    }
                                                    if (strE != null) {
                                                        if (!SB.b(14, strE, null, null)) {
                                                            strE = null;
                                                        }
                                                        if (strE != null) {
                                                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("livestream");
                                                            if (jSONObjectOptJSONObject != null) {
                                                                try {
                                                                    String strOptString2 = jSONObjectOptJSONObject.optString("session_title");
                                                                    if (strOptString2 == null || !(!AbstractC1899jh0.O(strOptString2))) {
                                                                        str2 = null;
                                                                    } else {
                                                                        str2 = strOptString2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    c1855j80 = c1855j80G;
                                                                    str3 = null;
                                                                    try {
                                                                        throw th;
                                                                    } catch (Throwable th4) {
                                                                        AbstractC3409z9.g(c1855j80, th);
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            LinkedHashMap linkedHashMapD = AbstractC3327yN.D(AbstractC1468fA.a(str4, strE, map));
                                                            linkedHashMapD.put("Accept", "*/*");
                                                            linkedHashMapD.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                                                            linkedHashMapD.put("Referer", str4);
                                                            linkedHashMapD.put("Origin", "https://kick.com");
                                                            c1855j80 = c1855j80G;
                                                            str = null;
                                                            try {
                                                                objK2 = new Js0(strE, (Map) linkedHashMapD, "hls", (String) null, (String) null, (byte[]) null, str2, str4, (String) null, (List) null, false, 3896);
                                                                r4 = str;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                th = th;
                                                                str3 = str;
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c1855j80 = c1855j80G;
                                        r4 = 0;
                                        objK2 = null;
                                    } else {
                                        c1855j80 = c1855j80G;
                                        r4 = 0;
                                        objK2 = null;
                                    }
                                } else {
                                    c1855j80 = c1855j80G;
                                    r4 = 0;
                                }
                                AbstractC3409z9.g(c1855j80, r4);
                                r3 = r4;
                            } catch (Throwable th6) {
                                th = th6;
                                c1855j80 = c1855j80G;
                                str = null;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            objK2 = Jp0.k(th);
                            r3 = str3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str3 = null;
                    }
                    if (C2536q80.a(objK2) == null) {
                        return objK2;
                    }
                    System.out.getClass();
                    return r3;
                }
            }
            return null;
        }
        return null;
    }
}
