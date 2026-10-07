package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.models.Video$Type;

/* JADX INFO: loaded from: classes.dex */
public final class Y10 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Z10 m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f630o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y10(Z10 z10, long j, long j2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = z10;
        this.n = j;
        this.f630o = j2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Y10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Y10(this.m, this.n, this.f630o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        String str;
        Jp0.O(obj);
        Z10 z10 = this.m;
        Video$Type video$Type = z10.b;
        boolean z = video$Type instanceof Is0;
        if (z) {
            str = ((Is0) video$Type).l;
        } else {
            if (!(video$Type instanceof Hs0)) {
                throw new C0730Rf();
            }
            str = ((Hs0) video$Type).l;
        }
        boolean zF = UK.F(str);
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (zF) {
            return c2985uq0;
        }
        z10.g = this.n;
        C2123lv0 c2123lv0 = new C2123lv0(System.currentTimeMillis(), this.n, this.f630o);
        AppDatabase appDatabase = z10.d;
        if (z) {
            Is0 is0 = (Is0) video$Type;
            C1387eR c1387eRU = appDatabase.p().u(is0.l);
            if (c1387eRU == null) {
                c1387eRU = new C1387eR(is0.l, is0.m, null, is0.n, null, null, null, null, is0.f332o, null, null, null, null, null, null, 32500);
            }
            c1387eRU.s = c2123lv0;
            appDatabase.p().F(c1387eRU);
        } else if (video$Type instanceof Hs0) {
            Hs0 hs0 = (Hs0) video$Type;
            C0456Gq c0456GqF = appDatabase.o().f(hs0.l);
            if (c0456GqF == null) {
                Gs0 gs0 = hs0.p;
                C2109lo0 c2109lo0 = new C2109lo0(gs0.l, gs0.m, null, null, null, null, null, null, gs0.n, gs0.f288o, null, null, null, null, null, null, 64764);
                String str2 = gs0.l;
                Fs0 fs0 = hs0.q;
                c0456GqF = new C0456Gq(hs0.l, hs0.m, hs0.n, null, hs0.f312o, c2109lo0, new Ma0(str2 + "-season-" + fs0.l, fs0.l, fs0.m, null, null, null, 56), 8);
            }
            c0456GqF.j = c2123lv0;
            appDatabase.o().q(c0456GqF);
        }
        return c2985uq0;
    }
}
