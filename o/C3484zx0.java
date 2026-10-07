package o;

import android.os.SystemClock;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.zx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3484zx0 extends Ph0 implements InterfaceC0775Sy {
    public C1420em m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1164o;
    public /* synthetic */ Object p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3484zx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3484zx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3484zx0 c3484zx0 = new C3484zx0(this.q, interfaceC0473Hh);
        c3484zx0.p = obj;
        return c3484zx0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC1608gi interfaceC1608gi;
        long j;
        String strL0;
        C1420em c1420emC;
        Object objY;
        JSONObject jSONObject;
        C1387eR c1387eR;
        Object objK;
        C1387eR c1387eR2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f1164o;
        if (i != 0) {
            if (i == 1) {
                j = this.n;
                interfaceC1608gi = (InterfaceC1608gi) this.p;
                Jp0.O(obj);
            } else if (i == 2) {
                j = this.n;
                c1420emC = this.m;
                String str = (String) this.p;
                Jp0.O(obj);
                strL0 = str;
                objY = obj;
                jSONObject = (JSONObject) objY;
                if (jSONObject == null) {
                    jSONObject = (JSONObject) Lx0.j.get(strL0);
                }
                if (jSONObject != null) {
                    Lx0 lx0 = Lx0.b;
                    c1387eR = Lx0.H(jSONObject);
                } else {
                    c1387eR = new C1387eR(this.q, "Película", null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
                    Lx0 lx1 = Lx0.b;
                    c1387eR.t = "RECOMENDADO PARA PELÍCULAS Y SERIES";
                }
                this.p = c1387eR;
                this.m = null;
                this.n = j;
                this.f1164o = 3;
                objK = c1420emC.K(this);
                if (objK == enumC1706hi) {
                    return enumC1706hi;
                }
                c1387eR2 = c1387eR;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1387eR2 = (C1387eR) this.p;
                Jp0.O(obj);
                objK = obj;
            }
            C1387eR c1387eRF = C1387eR.f(c1387eR2, null, (List) objK, 24575);
            Lx0 lx2 = Lx0.b;
            c1387eRF.t = "RECOMENDADO PARA PELÍCULAS Y SERIES";
            SystemClock.elapsedRealtime();
            return c1387eRF;
        }
        Jp0.O(obj);
        interfaceC1608gi = (InterfaceC1608gi) this.p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Lx0 lx3 = Lx0.b;
        this.p = interfaceC1608gi;
        this.n = jElapsedRealtime;
        this.f1164o = 1;
        if (lx3.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        j = jElapsedRealtime;
        strL0 = AbstractC1119bh0.l0(this.q, "xuper-movie:");
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        C1420em c1420emC2 = AbstractC1376eG.c(interfaceC1608gi, executorC0891Xk, 0, new C3290xx0(strL0, null), 2);
        c1420emC = AbstractC1376eG.c(interfaceC1608gi, executorC0891Xk, 0, new C3387yx0(strL0, null), 2);
        this.p = strL0;
        this.m = c1420emC;
        this.n = j;
        this.f1164o = 2;
        objY = c1420emC2.y(this);
        if (objY == enumC1706hi) {
            return enumC1706hi;
        }
        jSONObject = (JSONObject) objY;
        if (jSONObject == null) {
            jSONObject = (JSONObject) Lx0.j.get(strL0);
        }
        if (jSONObject != null) {
            Lx0 lx4 = Lx0.b;
            c1387eR = Lx0.H(jSONObject);
        } else {
            c1387eR = new C1387eR(this.q, "Película", null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
            Lx0 lx5 = Lx0.b;
            c1387eR.t = "RECOMENDADO PARA PELÍCULAS Y SERIES";
        }
        this.p = c1387eR;
        this.m = null;
        this.n = j;
        this.f1164o = 3;
        objK = c1420emC.K(this);
        if (objK == enumC1706hi) {
            return enumC1706hi;
        }
        c1387eR2 = c1387eR;
        C1387eR c1387eRF2 = C1387eR.f(c1387eR2, null, (List) objK, 24575);
        Lx0 lx6 = Lx0.b;
        c1387eRF2.t = "RECOMENDADO PARA PELÍCULAS Y SERIES";
        SystemClock.elapsedRealtime();
        return c1387eRF2;
    }
}
