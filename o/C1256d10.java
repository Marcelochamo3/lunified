package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.models.Video$Type;

/* JADX INFO: renamed from: o.d10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1256d10 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerTvFragment m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f730o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256d10(PlayerTvFragment playerTvFragment, boolean z, boolean z2, long j, long j2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerTvFragment;
        this.n = z;
        this.f730o = z2;
        this.p = j;
        this.q = j2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) throws Throwable {
        C1256d10 c1256d10 = (C1256d10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        c1256d10.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1256d10(this.m, this.n, this.f730o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC2220mv0 interfaceC2220mv0F;
        Jp0.O(obj);
        PlayerTvFragment playerTvFragment = this.m;
        Video$Type video$Type = playerTvFragment.i0().d;
        AbstractC1474fG.h(video$Type, "null cannot be cast to non-null type com.skidush.clonex.models.Video.Type");
        boolean z = video$Type instanceof Is0;
        if (z) {
            interfaceC2220mv0F = playerTvFragment.k0().p().u(((Is0) video$Type).l);
        } else {
            if (!(video$Type instanceof Hs0)) {
                throw new C0730Rf();
            }
            interfaceC2220mv0F = playerTvFragment.k0().o().f(((Hs0) video$Type).l);
        }
        boolean z2 = this.n;
        boolean z3 = this.f730o;
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
                interfaceC2220mv0F.a(null);
            }
            if (interfaceC2220mv0F != null) {
                interfaceC2220mv0F.d(null);
            }
        }
        if (z) {
            if (interfaceC2220mv0F != null) {
                playerTvFragment.k0().p().I((C1387eR) interfaceC2220mv0F);
            }
        } else if ((video$Type instanceof Hs0) && interfaceC2220mv0F != null) {
            if (z3) {
                playerTvFragment.k0().o().o(((Hs0) video$Type).l);
            }
            playerTvFragment.k0().o().s((C0456Gq) interfaceC2220mv0F);
        }
        return C2985uq0.a;
    }
}
