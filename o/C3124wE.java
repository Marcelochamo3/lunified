package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.wE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3124wE {
    public static final C3124wE b;
    public final JSONObject a;

    static {
        C0334By c0334By = new C0334By(4);
        c0334By.h(1, "controls");
        b = new C3124wE((JSONObject) c0334By.m);
    }

    public C3124wE(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String toString() {
        String string = this.a.toString();
        AbstractC1474fG.i(string, "playerOptions.toString()");
        return string;
    }
}
