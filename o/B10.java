package o;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B10 implements InterfaceC2176mZ, View.OnLayoutChangeListener, View.OnClickListener, InterfaceC2854tZ {
    public final Dj0 l = new Dj0();
    public Object m;
    public final /* synthetic */ PlayerView n;

    public B10(PlayerView playerView) {
        this.n = playerView;
    }

    @Override // o.InterfaceC2176mZ
    public final void A(int i) {
        int i2 = PlayerView.K;
        PlayerView playerView = this.n;
        playerView.j();
        playerView.l();
        if (!playerView.c() || !playerView.H) {
            playerView.d(false);
            return;
        }
        C2951uZ c2951uZ = playerView.u;
        if (c2951uZ != null) {
            c2951uZ.b();
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void E(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void F(Lr lr) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void G(int i, int i2) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void H(C1981kZ c1981kZ) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void I(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void J(C1971kP c1971kP, int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void M(CQ cq) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void N(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void a(int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void b(C2263nP c2263nP) {
    }

    @Override // o.InterfaceC2854tZ
    public final void c(int i) {
        int i2 = PlayerView.K;
        this.n.k();
    }

    @Override // o.InterfaceC2176mZ
    public final void d(C1045at0 c1045at0) {
        int i = PlayerView.K;
        this.n.i();
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void e(int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final void f(C2105lm0 c2105lm0) {
        PlayerView playerView = this.n;
        InterfaceC2370oZ interfaceC2370oZ = playerView.x;
        interfaceC2370oZ.getClass();
        C1042as c1042as = (C1042as) interfaceC2370oZ;
        Fj0 fj0E = c1042as.E();
        if (fj0E.q()) {
            this.m = null;
        } else {
            boolean zIsEmpty = c1042as.F().l.isEmpty();
            Dj0 dj0 = this.l;
            if (zIsEmpty) {
                Object obj = this.m;
                if (obj != null) {
                    int iB = fj0E.b(obj);
                    if (iB != -1) {
                        if (c1042as.A() == fj0E.g(iB, dj0, false).n) {
                            return;
                        }
                    }
                    this.m = null;
                }
            } else {
                this.m = fj0E.g(c1042as.B(), dj0, true).m;
            }
        }
        playerView.m(false);
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void h(Lr lr) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void i(I6 i6) {
    }

    @Override // o.InterfaceC2176mZ
    public final void l(C3259xi c3259xi) {
        SubtitleView subtitleView = this.n.r;
        if (subtitleView != null) {
            subtitleView.setCues(c3259xi.l);
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void m(C2263nP c2263nP) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void n(int i) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.K;
        this.n.h();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PlayerView.a((TextureView) view, this.n.J);
    }

    @Override // o.InterfaceC2176mZ
    public final void p(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
        C2951uZ c2951uZ;
        int i2 = PlayerView.K;
        PlayerView playerView = this.n;
        if (playerView.c() && playerView.H && (c2951uZ = playerView.u) != null) {
            c2951uZ.b();
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final void r() {
        View view = this.n.n;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void s(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void t(List list) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void u(C1591gZ c1591gZ) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void v(int i, boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final void w(int i, boolean z) {
        int i2 = PlayerView.K;
        PlayerView playerView = this.n;
        playerView.j();
        if (!playerView.c() || !playerView.H) {
            playerView.d(false);
            return;
        }
        C2951uZ c2951uZ = playerView.u;
        if (c2951uZ != null) {
            c2951uZ.b();
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void z(C1715hm0 c1715hm0) {
    }
}
