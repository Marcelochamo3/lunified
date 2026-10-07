package o;

import java.net.URL;

/* JADX INFO: renamed from: o.yn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3367yn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3367yn0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3367yn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3367yn0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        String strConcat;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            URL url = new URL(this.n);
            String path = url.getPath();
            String query = url.getQuery();
            if (query == null || (strConcat = "?".concat(query)) == null) {
                strConcat = "";
            }
            String strD = AbstractC1701hf0.d(path, strConcat);
            C1816io0 c1816io0 = C1816io0.b;
            this.m = 1;
            obj = AbstractC1376eG.J(AbstractC1910jn.b, new C1719ho0(false, strD, new byte[0], this.n, null), this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C1816io0.v((String) obj);
    }
}
