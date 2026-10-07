package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3089vu extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C3380yu m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1084o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3089vu(C3380yu c3380yu, String str, int i, long j, long j2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c3380yu;
        this.n = str;
        this.f1084o = i;
        this.p = j;
        this.q = j2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3089vu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3089vu(this.m, this.n, this.f1084o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String strW;
        Jp0.O(obj);
        C2701ru c2701ru = C3380yu.e;
        C3380yu c3380yu = this.m;
        String strH = c3380yu.h();
        Iterator it = c3380yu.t().iterator();
        while (it.hasNext()) {
            C1101bX c1101bXV = this.m.v((String) it.next(), this.n, this.f1084o, this.p, this.q, strH);
            if (c1101bXV != null) {
                String str = (String) c1101bXV.l;
                String str2 = (String) c1101bXV.m;
                if (str2 != null && (strW = c3380yu.w(str, str2)) != null) {
                    str = strW;
                }
                return c3380yu.g(str);
            }
        }
        throw new Exception("Fctv33: el server no está disponible o el evento no está en vivo");
    }
}
