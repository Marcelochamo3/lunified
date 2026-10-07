package o;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Yx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Jb0 f647o;
    public int p;
    public final /* synthetic */ JSONObject q;
    public final /* synthetic */ Jb0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yx0(InterfaceC0473Hh interfaceC0473Hh, Jb0 jb0, JSONObject jSONObject) {
        super(2, interfaceC0473Hh);
        this.q = jSONObject;
        this.r = jb0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Yx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Yx0(interfaceC0473Hh, this.r, this.q);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        int i;
        Jb0 jb0;
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.p;
        if (i2 == 0) {
            Jp0.O(obj);
            JSONObject jSONObject = this.q;
            int iOptInt = jSONObject.optInt("id", -1);
            if (iOptInt <= 0) {
                return null;
            }
            String strOptString = jSONObject.optString("name");
            if (AbstractC1899jh0.O(strOptString)) {
                strOptString = "Canales";
            }
            this.n = strOptString;
            Jb0 jb1 = this.r;
            this.f647o = jb1;
            this.m = iOptInt;
            this.p = 1;
            Mb0 mb0 = (Mb0) jb1;
            if (mb0.a(this) == enumC1706hi) {
                return enumC1706hi;
            }
            i = iOptInt;
            jb0 = mb0;
            str = strOptString;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.m;
            jb0 = this.f647o;
            str = this.n;
            Jp0.O(obj);
        }
        try {
            AbstractC1474fG.g(str);
            return new Px0(i, str, C1152by0.p(i));
        } finally {
            ((Mb0) jb0).c();
        }
    }
}
