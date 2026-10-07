package o;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3219xC extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ JSONObject n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3219xC(int i, JSONObject jSONObject) {
        super(1);
        this.m = i;
        this.n = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        String str = "";
        ?? Opt = this.n;
        switch (this.m) {
            case 0:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "it");
                return Opt.optString(str2);
            case 1:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "key");
                C20 c20 = C20.b;
                return AbstractC0911Ye.U(C20.w(Opt.optJSONArray(str3)));
            case 2:
                String str4 = (String) obj;
                AbstractC1474fG.j(str4, "it");
                AbstractC1474fG.j(Opt, "<this>");
                Iterator it = AbstractC1119bh0.s0(str4, new char[]{'.'}, 0, 6).iterator();
                do {
                    if (it.hasNext()) {
                        String str5 = (String) it.next();
                        JSONObject jSONObject = Opt instanceof JSONObject ? (JSONObject) Opt : null;
                        Opt = jSONObject != null ? jSONObject.opt(str5) : 0;
                        if (Opt == 0) {
                        }
                    } else {
                        String str6 = Opt instanceof String ? (String) Opt : null;
                        if (str6 == null) {
                            String string = Opt.toString();
                            String str7 = AbstractC1474fG.b(string, "null") ? null : string;
                            if (str7 != null) {
                                str = str7;
                            }
                        } else {
                            str = str6;
                        }
                    }
                    return AbstractC1119bh0.E0(str).toString();
                } while (Opt != JSONObject.NULL);
                return AbstractC1119bh0.E0(str).toString();
            case 3:
                String str8 = (String) obj;
                AbstractC1474fG.j(str8, "it");
                return Opt.optString(str8, "");
            default:
                String str9 = (String) obj;
                AbstractC1474fG.j(str9, "it");
                String strOptString = Opt.optString(str9);
                AbstractC1474fG.i(strOptString, "optString(...)");
                return strOptString;
        }
    }
}
