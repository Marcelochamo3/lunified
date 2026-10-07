package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3096vx0 extends Ph0 implements InterfaceC0775Sy {
    public Jb0 m;
    public C2999ux0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1085o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Jb0 q;
    public final /* synthetic */ C2999ux0 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3096vx0(Jb0 jb0, C2999ux0 c2999ux0, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = jb0;
        this.r = c2999ux0;
        this.s = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3096vx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3096vx0 c3096vx0 = new C3096vx0(this.q, this.r, this.s, interfaceC0473Hh);
        c3096vx0.p = obj;
        return c3096vx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C2999ux0 c2999ux0;
        Jb0 jb0;
        Object objK;
        ArrayList arrayList;
        Cd0 cd0U;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f1085o;
        if (i == 0) {
            Jp0.O(obj);
            this.p = (InterfaceC1608gi) this.p;
            Jb0 jb1 = this.q;
            this.m = jb1;
            C2999ux0 c2999ux1 = this.r;
            this.n = c2999ux1;
            this.f1085o = 1;
            Mb0 mb0 = (Mb0) jb1;
            if (mb0.a(this) == enumC1706hi) {
                return enumC1706hi;
            }
            c2999ux0 = c2999ux1;
            jb0 = mb0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2999ux0 = this.n;
            jb0 = this.m;
            Jp0.O(obj);
        }
        try {
            SystemClock.elapsedRealtime();
            try {
                Integer num = c2999ux0.e;
                String str = c2999ux0.a;
                if (num != null) {
                    Lx0 lx0 = Lx0.b;
                    List listL = Lx0.L(num.intValue(), 1, 30);
                    arrayList = new ArrayList();
                    Iterator it = listL.iterator();
                    while (it.hasNext()) {
                        Cd0 cd0S = Lx0.S((JSONObject) it.next());
                        if (cd0S != null) {
                            arrayList.add(cd0S);
                        }
                    }
                } else {
                    Lx0 lx1 = Lx0.b;
                    String str2 = c2999ux0.b;
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str3 = c2999ux0.c;
                    if (str3 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str4 = c2999ux0.d;
                    if (str4 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    List<JSONObject> list = Lx0.C(1, 30, str2, str3, str4, "2026").a;
                    ArrayList arrayList2 = new ArrayList();
                    for (JSONObject jSONObject : list) {
                        if (AbstractC1474fG.b(str2, "series")) {
                            Lx0 lx2 = Lx0.b;
                            cd0U = Lx0.T(jSONObject);
                        } else {
                            Lx0 lx3 = Lx0.b;
                            cd0U = Lx0.U(jSONObject);
                        }
                        if (cd0U != null) {
                            arrayList2.add(cd0U);
                        }
                    }
                    arrayList = arrayList2;
                }
                C0882Xb c0882Xb = new C0882Xb(str, arrayList);
                Integer num2 = c2999ux0.e;
                objK = c0882Xb;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    c0882Xb.f = "xuper-section|" + iIntValue + "|" + str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("xuper-section-");
                    sb.append(iIntValue);
                    c0882Xb.g = sb.toString();
                    objK = c0882Xb;
                }
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (C2536q80.a(objK) != null) {
                SystemClock.elapsedRealtime();
            }
            boolean z = objK instanceof C2439p80;
            Object obj2 = objK;
            if (z) {
                obj2 = null;
            }
            C0882Xb c0882Xb2 = (C0882Xb) obj2;
            ((Mb0) jb0).c();
            return c0882Xb2;
        } catch (Throwable th2) {
            ((Mb0) jb0).c();
            throw th2;
        }
    }
}
