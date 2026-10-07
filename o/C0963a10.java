package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.a10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963a10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f669o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963a10(PlayerTvFragment playerTvFragment, String str, long j, long j2, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
        this.f669o = str;
        this.p = j;
        this.q = j2;
        this.r = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0963a10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0963a10(this.n, this.f669o, this.p, this.q, this.r, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    @Override // o.R7
    public final Object r(Object obj) {
        boolean z;
        C1042as c1042as;
        Ds0 ds0;
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        String str2 = this.f669o;
        boolean z2 = false;
        PlayerTvFragment playerTvFragment = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            c1042as = playerTvFragment.D0;
            if (c1042as != null && c1042as.J() == 2 && c1042as.I()) {
                ds0 = playerTvFragment.o0;
                if (ds0 != null) {
                    str = ds0.l;
                } else {
                    str = null;
                }
                if (AbstractC1474fG.b(str, str2) && playerTvFragment.v0() && !playerTvFragment.W0) {
                    z2 = true;
                }
            }
            z = z2;
            if (z) {
                PlayerTvFragment.b0(playerTvFragment, this.r, "sustained_buffering");
            }
            playerTvFragment.Y0 = null;
            return C2985uq0.a;
        }
        Jp0.O(obj);
        this.m = 1;
        if (AbstractC1376eG.q(12000L, this) == enumC1706hi) {
            return enumC1706hi;
        }
        C1042as c1042as2 = playerTvFragment.D0;
        if (c1042as2 != null && c1042as2.J() == 2 && c1042as2.I()) {
            Ds0 ds1 = playerTvFragment.o0;
            if (AbstractC1474fG.b(ds1 != null ? ds1.l : null, str2) && playerTvFragment.v0() && !playerTvFragment.W0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z && c1042as2 != null) {
            long jC = c1042as2.C();
            long jV = c1042as2.v();
            if (jC - this.p >= 1000 || jV - this.q >= 1000) {
                this.m = 2;
                if (AbstractC1376eG.q(5000L, this) == enumC1706hi) {
                    return enumC1706hi;
                }
                c1042as = playerTvFragment.D0;
                if (c1042as != null) {
                    ds0 = playerTvFragment.o0;
                    if (ds0 != null) {
                        str = ds0.l;
                    } else {
                        str = null;
                    }
                    if (AbstractC1474fG.b(str, str2)) {
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        if (z) {
            PlayerTvFragment.b0(playerTvFragment, this.r, "sustained_buffering");
        }
        playerTvFragment.Y0 = null;
        return C2985uq0.a;
    }
}
