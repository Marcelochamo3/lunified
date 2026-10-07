package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Cn0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f203o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f203o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Cn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Cn0 cn0 = new Cn0(this.n, this.f203o, interfaceC0473Hh);
        cn0.m = obj;
        return cn0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // o.R7
    public final Object r(Object obj) {
        String string;
        String string2;
        ?? arrayList;
        Object objK;
        ?? arrayList2;
        Object objK2;
        C1233cq c1233cq = C1233cq.l;
        int i = this.f203o;
        String str = this.n;
        Jp0.O(obj);
        try {
            String strY = C1816io0.y(str);
            ArrayList arrayList3 = new ArrayList();
            try {
                JSONArray jSONArrayOptJSONArray = C1816io0.x("/pages/movies/" + strY + "/" + i + ".json").optJSONArray("data");
                if (jSONArrayOptJSONArray == null) {
                    arrayList2 = c1233cq;
                } else {
                    ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                    arrayList2 = new ArrayList();
                    YF it = zfL.iterator();
                    while (it.n) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
                        if (jSONObjectOptJSONObject != null) {
                            arrayList2.add(jSONObjectOptJSONObject);
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        objK2 = C1816io0.s((JSONObject) it2.next());
                    } catch (Throwable th) {
                        objK2 = Jp0.k(th);
                    }
                    if (objK2 instanceof C2439p80) {
                        objK2 = null;
                    }
                    Cd0 cd0 = (Cd0) objK2;
                    if (cd0 != null) {
                        arrayList3.add(cd0);
                    }
                }
            } catch (Exception unused) {
            }
            try {
                C1816io0 c1816io0 = C1816io0.b;
                JSONArray jSONArrayOptJSONArray2 = C1816io0.x("/pages/series/" + strY + "/" + i + ".json").optJSONArray("data");
                if (jSONArrayOptJSONArray2 == null) {
                    arrayList = c1233cq;
                } else {
                    ZF zfL2 = U9.L(0, jSONArrayOptJSONArray2.length());
                    arrayList = new ArrayList();
                    YF it3 = zfL2.iterator();
                    while (it3.n) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(it3.a());
                        if (jSONObjectOptJSONObject2 != null) {
                            arrayList.add(jSONObjectOptJSONObject2);
                        }
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    try {
                        objK = C1816io0.u((JSONObject) it4.next());
                    } catch (Throwable th2) {
                        objK = Jp0.k(th2);
                    }
                    if (objK instanceof C2439p80) {
                        objK = null;
                    }
                    Cd0 cd1 = (Cd0) objK;
                    if (cd1 != null) {
                        arrayList3.add(cd1);
                    }
                }
            } catch (Exception unused2) {
            }
            if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str.charAt(0));
                AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                sb.append((Object) upperCase);
                String strSubstring = str.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb.append(strSubstring);
                string2 = sb.toString();
            } else {
                string2 = str;
            }
            return new C2420oz(str, string2, arrayList3);
        } catch (Exception unused3) {
            if (str.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String strValueOf2 = String.valueOf(str.charAt(0));
                AbstractC1474fG.h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase2, "toUpperCase(...)");
                sb2.append((Object) upperCase2);
                String strSubstring2 = str.substring(1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                sb2.append(strSubstring2);
                string = sb2.toString();
            } else {
                string = str;
            }
            return new C2420oz(str, string, c1233cq);
        }
    }
}
