package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3283xu extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C3380yu m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1126o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3283xu(C3380yu c3380yu, String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c3380yu;
        this.n = str;
        this.f1126o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3283xu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3283xu(this.m, this.n, this.f1126o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C2701ru c2701ru = C3380yu.e;
        C3380yu c3380yu = this.m;
        String strH = c3380yu.h();
        Iterator it = c3380yu.t().iterator();
        while (it.hasNext()) {
            StringBuilder sbS = AbstractC1674hK.s((String) it.next(), "/api/match/detail?matchId=");
            sbS.append(this.n);
            sbS.append("&sportType=");
            sbS.append(this.f1126o);
            sbS.append("&language=4&stream=true");
            byte[] bArrJ = c3380yu.j(sbS.toString(), strH);
            if (bArrJ != null) {
                ArrayList arrayListP = C3380yu.p(bArrJ);
                if (!arrayListP.isEmpty()) {
                    arrayListP.size();
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListP, 10));
                    Iterator it2 = arrayListP.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C2798su) it2.next()).c);
                    }
                    arrayList.toString();
                    return arrayListP;
                }
            }
        }
        return C1233cq.l;
    }
}
