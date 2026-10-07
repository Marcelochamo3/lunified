package o;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class VZ implements InterfaceC2176mZ {
    public final /* synthetic */ int l;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx m;

    public /* synthetic */ VZ(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.l = i;
        this.m = abstractComponentCallbacksC1247cx;
    }

    private final /* synthetic */ void B(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }

    private final /* synthetic */ void C(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }

    private final /* synthetic */ void D(boolean z) {
    }

    private final /* synthetic */ void K(boolean z) {
    }

    private final /* synthetic */ void L(C1971kP c1971kP, int i) {
    }

    private final /* synthetic */ void O(C1971kP c1971kP, int i) {
    }

    private final /* synthetic */ void P(C2263nP c2263nP) {
    }

    private final /* synthetic */ void Q(C2263nP c2263nP) {
    }

    private final /* synthetic */ void R(CQ cq) {
    }

    private final /* synthetic */ void S(CQ cq) {
    }

    private final /* synthetic */ void T(int i, boolean z) {
    }

    private final /* synthetic */ void U(int i, boolean z) {
    }

    private final /* synthetic */ void V(C1591gZ c1591gZ) {
    }

    private final /* synthetic */ void W(C1591gZ c1591gZ) {
    }

    private final /* synthetic */ void X(int i) {
    }

    private final /* synthetic */ void Y(int i) {
    }

    private final /* synthetic */ void Z(Lr lr) {
    }

    private final /* synthetic */ void a0(Lr lr) {
    }

    private final /* synthetic */ void b0(int i, boolean z) {
    }

    private final /* synthetic */ void c(I6 i6) {
    }

    private final /* synthetic */ void c0(int i, boolean z) {
    }

    private final /* synthetic */ void d0(C2263nP c2263nP) {
    }

    private final /* synthetic */ void e0(C2263nP c2263nP) {
    }

    private final /* synthetic */ void f0() {
    }

    private final /* synthetic */ void g(I6 i6) {
    }

    private final /* synthetic */ void g0() {
    }

    private final /* synthetic */ void h0(int i) {
    }

    private final /* synthetic */ void i0(int i) {
    }

    private final /* synthetic */ void j(C1981kZ c1981kZ) {
    }

    private final /* synthetic */ void j0(boolean z) {
    }

    private final /* synthetic */ void k(C1981kZ c1981kZ) {
    }

    private final /* synthetic */ void k0(boolean z) {
    }

    private final /* synthetic */ void l0(boolean z) {
    }

    private final /* synthetic */ void m0(boolean z) {
    }

    private final /* synthetic */ void n0(int i, int i2) {
    }

    private final /* synthetic */ void o(List list) {
    }

    private final /* synthetic */ void o0(int i, int i2) {
    }

    private final /* synthetic */ void p0(int i) {
    }

    private final /* synthetic */ void q0(int i) {
    }

    private final /* synthetic */ void r0(C1715hm0 c1715hm0) {
    }

    private final /* synthetic */ void s0(C1715hm0 c1715hm0) {
    }

    private final /* synthetic */ void t0(C2105lm0 c2105lm0) {
    }

    private final /* synthetic */ void u0(C1045at0 c1045at0) {
    }

    private final /* synthetic */ void v0(C1045at0 c1045at0) {
    }

    private final /* synthetic */ void x(C3259xi c3259xi) {
    }

    private final /* synthetic */ void y(List list) {
    }

    @Override // o.InterfaceC2176mZ
    public final void A(int i) {
        Ds0 ds0;
        Map map;
        switch (this.l) {
            case 0:
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.m;
                if (i == 1) {
                    AH ah = playerMobileFragment.T0;
                    if (ah != null) {
                        ah.f(null);
                    }
                    playerMobileFragment.T0 = null;
                    return;
                }
                if (i != 2) {
                    if (i == 3) {
                        AH ah2 = playerMobileFragment.T0;
                        if (ah2 != null) {
                            ah2.f(null);
                        }
                        playerMobileFragment.T0 = null;
                        playerMobileFragment.B0 = 0;
                        if (playerMobileFragment.p0()) {
                            playerMobileFragment.R0 = false;
                            playerMobileFragment.O0.n = Long.valueOf(SystemClock.elapsedRealtime());
                            return;
                        }
                        return;
                    }
                    if (i != 4) {
                        return;
                    }
                    AH ah3 = playerMobileFragment.T0;
                    if (ah3 != null) {
                        ah3.f(null);
                    }
                    playerMobileFragment.T0 = null;
                    if (!(playerMobileFragment.h0().d instanceof Hs0) || playerMobileFragment.N0) {
                        return;
                    }
                    playerMobileFragment.N0 = true;
                    AbstractC1376eG.w(AbstractC1459f50.y(playerMobileFragment.q()), null, 0, new ZZ(playerMobileFragment, null), 3);
                    return;
                }
                if (playerMobileFragment.y0 == null || !playerMobileFragment.p0() || playerMobileFragment.R0) {
                    return;
                }
                C1042as c1042as = playerMobileFragment.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                if (c1042as.I()) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = playerMobileFragment.S0;
                    C2295nk0 c2295nk0 = playerMobileFragment.O0;
                    if (jElapsedRealtime < j) {
                        c2295nk0.n = null;
                        return;
                    }
                    int i2 = c2295nk0.s(jElapsedRealtime).a;
                    if (i2 > 0) {
                        AH ah4 = playerMobileFragment.T0;
                        if (ah4 != null) {
                            ah4.f(null);
                        }
                        Ds0 ds1 = playerMobileFragment.o0;
                        String str = ds1 != null ? ds1.l : null;
                        C1042as c1042as2 = playerMobileFragment.y0;
                        long jC = c1042as2 != null ? c1042as2.C() : 0L;
                        C1042as c1042as3 = playerMobileFragment.y0;
                        playerMobileFragment.T0 = AbstractC1376eG.w(AbstractC1459f50.y(playerMobileFragment.q()), null, 0, new HZ(playerMobileFragment, str, jC, c1042as3 != null ? c1042as3.v() : 0L, i2, null), 3);
                        return;
                    }
                    return;
                }
                return;
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.m;
                if (playerTvFragment.z0 == null) {
                    return;
                }
                if (i == 1) {
                    AH ah5 = playerTvFragment.Y0;
                    if (ah5 != null) {
                        ah5.f(null);
                    }
                    playerTvFragment.Y0 = null;
                    return;
                }
                C2295nk0 c2295nk1 = playerTvFragment.T0;
                if (i != 2) {
                    if (i == 3) {
                        AH ah6 = playerTvFragment.Y0;
                        if (ah6 != null) {
                            ah6.f(null);
                        }
                        playerTvFragment.Y0 = null;
                        playerTvFragment.G0 = 0;
                        if (playerTvFragment.v0()) {
                            playerTvFragment.W0 = false;
                            c2295nk1.n = Long.valueOf(SystemClock.elapsedRealtime());
                            return;
                        }
                        return;
                    }
                    if (i != 4) {
                        return;
                    }
                    AH ah7 = playerTvFragment.Y0;
                    if (ah7 != null) {
                        ah7.f(null);
                    }
                    playerTvFragment.Y0 = null;
                    if (!(playerTvFragment.i0().d instanceof Hs0) || playerTvFragment.S0) {
                        return;
                    }
                    playerTvFragment.S0 = true;
                    AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C2909u10(playerTvFragment, null), 3);
                    return;
                }
                C1042as c1042as4 = playerTvFragment.D0;
                if (c1042as4 != null && playerTvFragment.v0() && !playerTvFragment.W0 && playerTvFragment.v0 && c1042as4.I()) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (jElapsedRealtime2 < playerTvFragment.X0) {
                        c2295nk1.n = null;
                        return;
                    }
                    C1787iZ c1787iZS = c2295nk1.s(jElapsedRealtime2);
                    if (c1787iZS.a > 0 && (ds0 = playerTvFragment.o0) != null && (map = ds0.f223o) != null) {
                    }
                    int i3 = c1787iZS.a;
                    if (i3 > 0) {
                        AH ah8 = playerTvFragment.Y0;
                        if (ah8 != null) {
                            ah8.f(null);
                        }
                        Ds0 ds2 = playerTvFragment.o0;
                        String str2 = ds2 != null ? ds2.l : null;
                        C1042as c1042as5 = playerTvFragment.D0;
                        long jC2 = c1042as5 != null ? c1042as5.C() : 0L;
                        C1042as c1042as6 = playerTvFragment.D0;
                        playerTvFragment.Y0 = AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C0963a10(playerTvFragment, str2, jC2, c1042as6 != null ? c1042as6.v() : 0L, i3, null), 3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void E(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void F(Lr lr) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void G(int i, int i2) {
        int i3 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void H(C1981kZ c1981kZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void I(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void J(C1971kP c1971kP, int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void M(CQ cq) {
        int i = this.l;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    @Override // o.InterfaceC2176mZ
    public final void N(boolean z) {
        boolean z2;
        C1483fP c1483fP;
        Uri uri;
        String string;
        C1042as c1042as;
        boolean z3;
        C1971kP c1971kPA;
        C1483fP c1483fP2;
        Uri uri2;
        String string2;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.m;
        switch (this.l) {
            case 0:
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) abstractComponentCallbacksC1247cx;
                C2303no0 c2303no0 = playerMobileFragment.u0;
                AbstractC1474fG.g(c2303no0);
                ((PlayerView) c2303no0.f941o).setKeepScreenOn(z);
                PlayerMobileFragment.c0(playerMobileFragment, z);
                C1042as c1042as2 = playerMobileFragment.y0;
                if (c1042as2 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                C1971kP c1971kPA2 = c1042as2.a();
                boolean z4 = (c1971kPA2 == null || (c1483fP = c1971kPA2.m) == null || (uri = c1483fP.l) == null || (string = uri.toString()) == null || string.length() <= 0) ? false : true;
                boolean zF = UK.F(playerMobileFragment.h0().a);
                if (z || !z4 || zF) {
                    return;
                }
                C1042as c1042as3 = playerMobileFragment.y0;
                if (c1042as3 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                if (c1042as3.C() <= c1042as3.H() * 0.03d) {
                    long jC = c1042as3.C();
                    int i = AbstractC0947Zo.n;
                    if (jC > AbstractC0947Zo.a(Nr0.G(2, EnumC1231cp.MINUTES))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                C1042as c1042as4 = playerMobileFragment.y0;
                if (c1042as4 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                boolean z5 = ((double) c1042as4.C()) > ((double) c1042as4.H()) * 0.9d;
                C1042as c1042as5 = playerMobileFragment.y0;
                if (c1042as5 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                long jC2 = c1042as5.C();
                C1042as c1042as6 = playerMobileFragment.y0;
                if (c1042as6 != null) {
                    AbstractC1376eG.w(AbstractC1459f50.y(playerMobileFragment.q()), AbstractC1910jn.b, 0, new SZ((PlayerMobileFragment) abstractComponentCallbacksC1247cx, z2, z5, jC2, c1042as6.H(), null), 2);
                    return;
                } else {
                    AbstractC1474fG.U("player");
                    throw null;
                }
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) abstractComponentCallbacksC1247cx;
                C0560Kq c0560Kq = playerTvFragment.z0;
                if (c0560Kq == null) {
                    return;
                }
                ((PlayerView) c0560Kq.p).setKeepScreenOn(z);
                PlayerTvFragment.c0(playerTvFragment, z);
                C1042as c1042as7 = playerTvFragment.D0;
                boolean z6 = (c1042as7 == null || (c1971kPA = c1042as7.a()) == null || (c1483fP2 = c1971kPA.m) == null || (uri2 = c1483fP2.l) == null || (string2 = uri2.toString()) == null || string2.length() <= 0) ? false : true;
                if (z || !z6 || (c1042as = playerTvFragment.D0) == null) {
                    return;
                }
                if (c1042as.C() <= c1042as.H() * 0.03d) {
                    long jC3 = c1042as.C();
                    int i2 = AbstractC0947Zo.n;
                    if (jC3 > AbstractC0947Zo.a(Nr0.G(2, EnumC1231cp.MINUTES))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = true;
                }
                boolean z7 = ((double) c1042as.C()) > ((double) c1042as.H()) * 0.9d;
                long jC4 = c1042as.C();
                long jH = c1042as.H();
                if (UK.F(playerTvFragment.i0().a)) {
                    String str = playerTvFragment.i0().a;
                    return;
                } else {
                    AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), AbstractC1910jn.b, 0, new C1256d10((PlayerTvFragment) abstractComponentCallbacksC1247cx, z3, z7, jC4, jH, null), 2);
                    return;
                }
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void a(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void b(C2263nP c2263nP) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void d(C1045at0 c1045at0) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void e(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final void f(C2105lm0 c2105lm0) {
        switch (this.l) {
            case 0:
                break;
            default:
                AbstractC1474fG.j(c2105lm0, "tracks");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x022e  */
    /* JADX WARN: Code duplicated, block: B:107:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0242  */
    /* JADX WARN: Code duplicated, block: B:113:0x024c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0259  */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:122:0x026a  */
    /* JADX WARN: Code duplicated, block: B:127:0x027d A[PHI: r6
  0x027d: PHI (r6v12 java.lang.String) = (r6v0 java.lang.String), (r6v9 java.lang.String) binds: [B:126:0x027b, B:519:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x028a  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a8 A[LOOP:9: B:129:0x0284->B:134:0x02a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02be  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02de  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:178:0x033e  */
    /* JADX WARN: Code duplicated, block: B:237:0x049b  */
    /* JADX WARN: Code duplicated, block: B:243:0x04b1 A[PHI: r3
  0x04b1: PHI (r3v44 int) = (r3v43 int), (r3v48 int) binds: [B:242:0x04af, B:235:0x0498] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:247:0x04be  */
    /* JADX WARN: Code duplicated, block: B:249:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:271:0x0509  */
    /* JADX WARN: Code duplicated, block: B:279:0x0520  */
    /* JADX WARN: Code duplicated, block: B:282:0x0527  */
    /* JADX WARN: Code duplicated, block: B:287:0x0536  */
    /* JADX WARN: Code duplicated, block: B:293:0x054a  */
    /* JADX WARN: Code duplicated, block: B:296:0x054f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0552  */
    /* JADX WARN: Code duplicated, block: B:299:0x0556  */
    /* JADX WARN: Code duplicated, block: B:300:0x0559  */
    /* JADX WARN: Code duplicated, block: B:302:0x055d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0560  */
    /* JADX WARN: Code duplicated, block: B:305:0x0564  */
    /* JADX WARN: Code duplicated, block: B:306:0x0567  */
    /* JADX WARN: Code duplicated, block: B:308:0x056b  */
    /* JADX WARN: Code duplicated, block: B:309:0x056e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0578 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x0581  */
    /* JADX WARN: Code duplicated, block: B:317:0x058d  */
    /* JADX WARN: Code duplicated, block: B:320:0x059e  */
    /* JADX WARN: Code duplicated, block: B:322:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:324:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:326:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:328:0x0601  */
    /* JADX WARN: Code duplicated, block: B:336:0x062c  */
    /* JADX WARN: Code duplicated, block: B:338:0x062f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:340:0x0633  */
    /* JADX WARN: Code duplicated, block: B:342:0x0636 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:348:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:351:0x06b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:352:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:353:0x06be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:354:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:355:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:448:0x084d  */
    /* JADX WARN: Code duplicated, block: B:500:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:? A[LOOP:3: B:93:0x020a->B:502:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:? A[LOOP:4: B:102:0x0228->B:505:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[LOOP:5: B:111:0x0246->B:508:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:? A[LOOP:6: B:120:0x0264->B:511:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:? A[LOOP:8: B:152:0x02e9->B:518:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v18 java.lang.Object, still in use, count: 2, list:
          (r3v18 java.lang.Object) from 0x01a6: PHI (r3 I:??) = (r3v15 java.lang.Object), (r3v18 java.lang.Object) binds: [B:61:0x01a5, B:522:0x01a6] A[DONT_GENERATE, DONT_INLINE]
          (r3v18 java.lang.Object) from 0x0198: CHECK_CAST (o.Q30) (r3v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.InterfaceC2176mZ
    public final void h(o.Lr r32) {
        /*
            Method dump skipped, instruction units count: 2338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.VZ.h(o.Lr):void");
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void i(I6 i6) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final void l(C3259xi c3259xi) {
        switch (this.l) {
            case 0:
                break;
            default:
                AbstractC1474fG.j(c3259xi, "cueGroup");
                break;
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void m(C2263nP c2263nP) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void n(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final void p(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(c2273nZ, "oldPosition");
                AbstractC1474fG.j(c2273nZ2, "newPosition");
                if (i == 1) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                    PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.m;
                    playerMobileFragment.S0 = jElapsedRealtime;
                    playerMobileFragment.O0.n = null;
                    playerMobileFragment.W0 = false;
                    playerMobileFragment.Y0 = 0;
                    playerMobileFragment.X0 = -1L;
                }
                break;
            default:
                AbstractC1474fG.j(c2273nZ, "oldPosition");
                AbstractC1474fG.j(c2273nZ2, "newPosition");
                if (i == 1) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 10000;
                    PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.m;
                    playerTvFragment.X0 = jElapsedRealtime2;
                    playerTvFragment.T0.n = null;
                    playerTvFragment.b1 = false;
                    playerTvFragment.d1 = 0;
                    playerTvFragment.c1 = -1L;
                }
                break;
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void q(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void r() {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void s(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void t(List list) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void u(C1591gZ c1591gZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void v(int i, boolean z) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void w(int i, boolean z) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void z(C1715hm0 c1715hm0) {
        int i = this.l;
    }
}
