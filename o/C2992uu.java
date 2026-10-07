package o;

import java.util.List;

/* JADX INFO: renamed from: o.uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2992uu extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C3380yu m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2992uu(C3380yu c3380yu, String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c3380yu;
        this.n = str;
        this.f1064o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2992uu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2992uu(this.m, this.n, this.f1064o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Jp0.O(obj);
        C2701ru c2701ru = C3380yu.e;
        C3380yu c3380yu = this.m;
        List listT = c3380yu.t();
        String strH = c3380yu.h();
        Js0 js0S = c3380yu.s(this.f1064o, this.n, strH, listT);
        if (js0S != null) {
            return js0S;
        }
        throw new Exception("Fctv33: el evento no está en vivo o no tiene stream disponible");
    }
}
