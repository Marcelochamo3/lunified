package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class HZ extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f303o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ(PlayerMobileFragment playerMobileFragment, String str, long j, long j2, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerMobileFragment;
        this.f303o = str;
        this.p = j;
        this.q = j2;
        this.r = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((HZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new HZ(this.n, this.f303o, this.p, this.q, this.r, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    @Override // o.R7
    public final Object r(Object obj) {
        boolean z;
        C1042as c1042as;
        C1042as c1042as2;
        Ds0 ds0;
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        String str2 = this.f303o;
        boolean z2 = false;
        PlayerMobileFragment playerMobileFragment = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            c1042as = playerMobileFragment.y0;
            if (c1042as != null && c1042as.J() == 2) {
                c1042as2 = playerMobileFragment.y0;
                if (c1042as2 != null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                if (c1042as2.I()) {
                    ds0 = playerMobileFragment.o0;
                    if (ds0 != null) {
                        str = ds0.l;
                    } else {
                        str = null;
                    }
                    if (AbstractC1474fG.b(str, str2) && playerMobileFragment.p0() && !playerMobileFragment.R0) {
                        z2 = true;
                    }
                }
            }
            z = z2;
            if (z) {
                PlayerMobileFragment.b0(playerMobileFragment, this.r, "sustained_buffering");
            }
            playerMobileFragment.T0 = null;
            return C2985uq0.a;
        }
        Jp0.O(obj);
        this.m = 1;
        if (AbstractC1376eG.q(12000L, this) == enumC1706hi) {
            return enumC1706hi;
        }
        C1042as c1042as3 = playerMobileFragment.y0;
        if (c1042as3 == null || c1042as3.J() != 2) {
            z = false;
        } else {
            C1042as c1042as4 = playerMobileFragment.y0;
            if (c1042as4 == null) {
                AbstractC1474fG.U("player");
                throw null;
            }
            if (c1042as4.I()) {
                Ds0 ds1 = playerMobileFragment.o0;
                if (AbstractC1474fG.b(ds1 != null ? ds1.l : null, str2) && playerMobileFragment.p0() && !playerMobileFragment.R0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            C1042as c1042as5 = playerMobileFragment.y0;
            if (c1042as5 == null) {
                AbstractC1474fG.U("player");
                throw null;
            }
            long jC = c1042as5.C();
            C1042as c1042as6 = playerMobileFragment.y0;
            if (c1042as6 == null) {
                AbstractC1474fG.U("player");
                throw null;
            }
            long jV = c1042as6.v();
            if (jC - this.p >= 1000 || jV - this.q >= 1000) {
                this.m = 2;
                if (AbstractC1376eG.q(5000L, this) == enumC1706hi) {
                    return enumC1706hi;
                }
                c1042as = playerMobileFragment.y0;
                if (c1042as != null) {
                    c1042as2 = playerMobileFragment.y0;
                    if (c1042as2 != null) {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                    if (c1042as2.I()) {
                        ds0 = playerMobileFragment.o0;
                        if (ds0 != null) {
                            str = ds0.l;
                        } else {
                            str = null;
                        }
                        if (AbstractC1474fG.b(str, str2)) {
                            z2 = true;
                        }
                    }
                }
                z = z2;
            }
        }
        if (z) {
            PlayerMobileFragment.b0(playerMobileFragment, this.r, "sustained_buffering");
        }
        playerMobileFragment.T0 = null;
        return C2985uq0.a;
    }
}
