package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.or0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2406or0 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ JSONObject f956o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2406or0(String str, JSONObject jSONObject, int i) {
        super(1);
        this.m = i;
        this.n = str;
        this.f956o = jSONObject;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        JSONObject jSONObject = this.f956o;
        String str = this.n;
        switch (this.m) {
            case 0:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "base");
                C3084vr0 c3084vr0 = C3084vr0.a;
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u(str2.concat("/security/tokens/accs-proxy"));
                C3084vr0.M(c0560Kq);
                c0560Kq.j("Authorization", "Bearer " + str);
                String string = jSONObject.toString();
                AbstractC1474fG.i(string, "toString(...)");
                c0560Kq.m("POST", C2743sL.k(string, C3084vr0.d));
                return c0560Kq.c();
            default:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "base");
                C3084vr0 c3084vr1 = C3084vr0.a;
                C0560Kq c0560Kq2 = new C0560Kq();
                c0560Kq2.u(str3.concat("/security/tokens/accs"));
                C3084vr0.M(c0560Kq2);
                c0560Kq2.j("Authorization", "Bearer " + str);
                String string2 = jSONObject.toString();
                AbstractC1474fG.i(string2, "toString(...)");
                c0560Kq2.m("POST", C2743sL.k(string2, C3084vr0.d));
                return c0560Kq2.c();
        }
    }
}
