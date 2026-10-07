package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.models.Video$Type;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class SZ extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerMobileFragment m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f513o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZ(PlayerMobileFragment playerMobileFragment, boolean z, boolean z2, long j, long j2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerMobileFragment;
        this.n = z;
        this.f513o = z2;
        this.p = j;
        this.q = j2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) throws Throwable {
        SZ sz = (SZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        sz.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new SZ(this.m, this.n, this.f513o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC2220mv0 interfaceC2220mv0F;
        Jp0.O(obj);
        PlayerMobileFragment playerMobileFragment = this.m;
        Video$Type video$Type = playerMobileFragment.h0().d;
        AbstractC1474fG.h(video$Type, "null cannot be cast to non-null type com.skidush.clonex.models.Video.Type");
        boolean z = video$Type instanceof Is0;
        Rh0 rh0 = playerMobileFragment.w0;
        if (z) {
            interfaceC2220mv0F = ((AppDatabase) rh0.getValue()).p().u(((Is0) video$Type).l);
        } else {
            if (!(video$Type instanceof Hs0)) {
                throw new C0730Rf();
            }
            interfaceC2220mv0F = ((AppDatabase) rh0.getValue()).o().f(((Hs0) video$Type).l);
        }
        boolean z2 = this.n;
        boolean z3 = this.f513o;
        if (z2 && !z3) {
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.e(false);
            }
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.a(null);
            }
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.d(new C2123lv0(System.currentTimeMillis(), this.p, this.q));
            }
        } else if (z3) {
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.e(true);
            }
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.a(Calendar.getInstance());
            }
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.d(null);
            }
        }
        if (z) {
            if (interfaceC2220mv0F != null) {
                ((AppDatabase) rh0.getValue()).p().I((C1387eR) interfaceC2220mv0F);
            }
        } else if ((video$Type instanceof Hs0) && interfaceC2220mv0F != null) {
            if (z3) {
                ((AppDatabase) rh0.getValue()).o().o(((Hs0) video$Type).l);
            }
            ((AppDatabase) rh0.getValue()).o().s((C0456Gq) interfaceC2220mv0F);
        }
        return C2985uq0.a;
    }
}
