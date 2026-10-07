package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ox0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2418ox0 extends Ph0 implements InterfaceC0775Sy {
    public Jb0 m;
    public JSONObject n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f960o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Jb0 q;
    public final /* synthetic */ JSONObject r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2418ox0(InterfaceC0473Hh interfaceC0473Hh, Jb0 jb0, JSONObject jSONObject) {
        super(2, interfaceC0473Hh);
        this.q = jb0;
        this.r = jSONObject;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2418ox0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2418ox0 c2418ox0 = new C2418ox0(interfaceC0473Hh, this.q, this.r);
        c2418ox0.p = obj;
        return c2418ox0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        JSONObject jSONObject;
        Jb0 jb0;
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f960o;
        if (i == 0) {
            Jp0.O(obj);
            this.p = (InterfaceC1608gi) this.p;
            Jb0 jb1 = this.q;
            this.m = jb1;
            JSONObject jSONObject2 = this.r;
            this.n = jSONObject2;
            this.f960o = 1;
            Mb0 mb0 = (Mb0) jb1;
            if (mb0.a(this) == enumC1706hi) {
                return enumC1706hi;
            }
            jSONObject = jSONObject2;
            jb0 = mb0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONObject = this.n;
            jb0 = this.m;
            Jp0.O(obj);
        }
        Object obj2 = null;
        try {
            try {
                int iOptInt = jSONObject.optInt("id");
                if (iOptInt <= 0) {
                    objK = null;
                } else {
                    Lx0 lx0 = Lx0.b;
                    String strJ = Lx0.J(jSONObject.optString("name"));
                    if (strJ != null || (strJ = Lx0.J(jSONObject.optString("alias"))) != null) {
                        List listX = Lx0.x(iOptInt, 1, 10);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listX.iterator();
                        while (it.hasNext()) {
                            Cd0 cd0S = Lx0.S((JSONObject) it.next());
                            if (cd0S != null) {
                                arrayList.add(cd0S);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C0882Xb c0882Xb = new C0882Xb(strJ, arrayList);
                            c0882Xb.f = "xuper-explore|" + iOptInt + "|" + strJ;
                            StringBuilder sb = new StringBuilder();
                            sb.append("xuper-explore-");
                            sb.append(iOptInt);
                            c0882Xb.g = sb.toString();
                            objK = c0882Xb;
                        }
                    }
                    objK = null;
                }
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (!(objK instanceof C2439p80)) {
                obj2 = objK;
            }
            return (C0882Xb) obj2;
        } finally {
            ((Mb0) jb0).c();
        }
    }
}
