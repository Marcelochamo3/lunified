package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import androidx.leanback.widget.HorizontalGridView;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2278nc implements QK, InterfaceC1391eV, I8, InterfaceC0671Oy, NO, InterfaceC2849tU, J1, V7, Rt0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C2278nc() {
        this.l = 25;
        this.m = C2691rp.r;
    }

    @Override // o.InterfaceC2849tU
    public boolean a(MenuItem menuItem) {
        YT yt = (YT) this.m;
        AbstractC1474fG.j(yt, "$navController");
        AbstractC1474fG.j(menuItem, "item");
        return AbstractC0397Ej.C(menuItem, yt);
    }

    @Override // o.InterfaceC0671Oy
    public Object apply(Object obj) {
        Wl0 wl0 = (Wl0) obj;
        ((C1932jy) this.m).getClass();
        return wl0;
    }

    @Override // o.QK
    public void b(Object obj) {
        switch (this.l) {
            case 1:
                C2747sP c2747sP = (C2747sP) obj;
                c2747sP.getClass();
                c2747sP.v = ((C2069lP) this.m).a;
                break;
            case 2:
                ((C2747sP) obj).n = (AbstractC1200cZ) this.m;
                break;
            case 3:
                C2747sP c2747sP2 = (C2747sP) obj;
                int i = c2747sP2.x;
                C0579Lj c0579Lj = (C0579Lj) this.m;
                c2747sP2.x = i + c0579Lj.g;
                c2747sP2.y += c0579Lj.e;
                break;
            case 4:
                ((C2747sP) obj).getClass();
                break;
            case 5:
            case 6:
            case 7:
            default:
                ((InterfaceC2176mZ) obj).M((CQ) this.m);
                break;
            case 8:
                ((InterfaceC2176mZ) obj).b((C2263nP) this.m);
                break;
            case 9:
                ((InterfaceC2176mZ) obj).i((I6) this.m);
                break;
            case 10:
                ((InterfaceC2176mZ) obj).z((C1715hm0) this.m);
                break;
            case 11:
                ((InterfaceC2176mZ) obj).t((List) this.m);
                break;
            case 12:
                ((InterfaceC2176mZ) obj).l((C3259xi) this.m);
                break;
            case 13:
                ((InterfaceC2176mZ) obj).b(((SurfaceHolderCallbackC0898Xr) this.m).l.N);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    @Override // o.J1
    public void c(Object obj) {
        C1483fP c1483fP;
        C1483fP c1483fP2;
        AbstractC0985aF<C1873jP> abstractC0985aF;
        C2263nP c2263nP;
        C1971kP c1971kPA;
        C1483fP c1483fP3;
        C1971kP c1971kPA2;
        C1483fP c1483fP4;
        AbstractC0985aF<C1873jP> abstractC0985aF2;
        boolean z = true;
        ?? arrayList = C1233cq.l;
        Object obj2 = this.m;
        switch (this.l) {
            case 20:
                Uri uri = (Uri) obj;
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) obj2;
                AbstractC1474fG.j(playerMobileFragment, "this$0");
                if (uri == null) {
                    return;
                }
                playerMobileFragment.Q().getContentResolver().takePersistableUriPermission(uri, 3);
                String strP = AbstractC0397Ej.p(playerMobileFragment.Q(), uri);
                if (strP == null) {
                    strP = uri.toString();
                    AbstractC1474fG.i(strP, "toString(...)");
                }
                C1042as c1042as = playerMobileFragment.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                long jC = c1042as.C();
                C1042as c1042as2 = playerMobileFragment.y0;
                if (c1042as2 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                C1971kP c1971kPA3 = c1042as2.a();
                if (c1971kPA3 != null && (c1483fP2 = c1971kPA3.m) != null && (abstractC0985aF = c1483fP2.r) != null) {
                    arrayList = new ArrayList(AbstractC1016af.O(abstractC0985aF, 10));
                    for (C1873jP c1873jP : abstractC0985aF) {
                        C1777iP c1777iP = new C1777iP(c1873jP.l);
                        c1777iP.b = c1873jP.m;
                        c1777iP.f = c1873jP.q;
                        c1777iP.c = c1873jP.n;
                        c1777iP.d = 0;
                        arrayList.add(new C1873jP(c1777iP));
                    }
                }
                C1042as c1042as3 = playerMobileFragment.y0;
                if (c1042as3 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                YO yo = new YO();
                C1093bP c1093bP = new C1093bP();
                List listEmptyList = Collections.emptyList();
                M60 m60 = M60.p;
                C1581gP c1581gP = C1581gP.n;
                C1042as c1042as4 = playerMobileFragment.y0;
                if (c1042as4 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                C1971kP c1971kPA4 = c1042as4.a();
                Uri uri2 = (c1971kPA4 == null || (c1483fP = c1971kPA4.m) == null) ? null : c1483fP.l;
                C1777iP c1777iP2 = new C1777iP(uri);
                c1777iP2.b = AbstractC0397Ej.M(strP);
                c1777iP2.f = strP;
                c1777iP2.d = 1;
                AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(AbstractC0911Ye.n0(arrayList, new C1873jP(c1777iP2)));
                C1042as c1042as5 = playerMobileFragment.y0;
                if (c1042as5 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                c1042as5.i0();
                C2263nP c2263nP2 = c1042as5.N;
                if (c1093bP.b != null && c1093bP.a == null) {
                    z = false;
                }
                AbstractC0397Ej.f(z);
                C1483fP c1483fP5 = uri2 != null ? new C1483fP(uri2, null, c1093bP.a != null ? new C1190cP(c1093bP) : null, null, listEmptyList, null, abstractC0985aFL, null) : null;
                C0995aP c0995aP = new C0995aP(yo);
                C1385eP c1385eP = new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
                if (c2263nP2 == null) {
                    c2263nP2 = C2263nP.T;
                }
                c1042as3.q(new C1971kP("", c0995aP, c1483fP5, c1385eP, c2263nP2, c1581gP));
                C1042as c1042as6 = playerMobileFragment.y0;
                if (c1042as6 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                c1042as6.l(5, jC);
                C1042as c1042as7 = playerMobileFragment.y0;
                if (c1042as7 != null) {
                    c1042as7.j();
                    return;
                } else {
                    AbstractC1474fG.U("player");
                    throw null;
                }
            default:
                Uri uri3 = (Uri) obj;
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj2;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                if (uri3 == null) {
                    return;
                }
                playerTvFragment.Q().getContentResolver().takePersistableUriPermission(uri3, 3);
                String strP2 = AbstractC0397Ej.p(playerTvFragment.Q(), uri3);
                if (strP2 == null) {
                    strP2 = uri3.toString();
                    AbstractC1474fG.i(strP2, "toString(...)");
                }
                C1042as c1042as8 = playerTvFragment.D0;
                long jC2 = c1042as8 != null ? c1042as8.C() : 0L;
                C1042as c1042as9 = playerTvFragment.D0;
                if (c1042as9 != null && (c1971kPA2 = c1042as9.a()) != null && (c1483fP4 = c1971kPA2.m) != null && (abstractC0985aF2 = c1483fP4.r) != null) {
                    arrayList = new ArrayList(AbstractC1016af.O(abstractC0985aF2, 10));
                    for (C1873jP c1873jP2 : abstractC0985aF2) {
                        C1777iP c1777iP3 = new C1777iP(c1873jP2.l);
                        c1777iP3.b = c1873jP2.m;
                        c1777iP3.f = c1873jP2.q;
                        c1777iP3.c = c1873jP2.n;
                        c1777iP3.d = 0;
                        arrayList.add(new C1873jP(c1777iP3));
                    }
                }
                C1042as c1042as10 = playerTvFragment.D0;
                if (c1042as10 != null) {
                    YO yo2 = new YO();
                    C1093bP c1093bP2 = new C1093bP();
                    List listEmptyList2 = Collections.emptyList();
                    M60 m61 = M60.p;
                    C1581gP c1581gP2 = C1581gP.n;
                    C1042as c1042as11 = playerTvFragment.D0;
                    Uri uri4 = (c1042as11 == null || (c1971kPA = c1042as11.a()) == null || (c1483fP3 = c1971kPA.m) == null) ? null : c1483fP3.l;
                    C1777iP c1777iP4 = new C1777iP(uri3);
                    c1777iP4.b = AbstractC0397Ej.M(strP2);
                    c1777iP4.f = strP2;
                    c1777iP4.d = 1;
                    AbstractC0985aF abstractC0985aFL2 = AbstractC0985aF.l(AbstractC0911Ye.n0(arrayList, new C1873jP(c1777iP4)));
                    C1042as c1042as12 = playerTvFragment.D0;
                    if (c1042as12 != null) {
                        c1042as12.i0();
                        c2263nP = c1042as12.N;
                        if (c2263nP == null) {
                            c2263nP = C2263nP.T;
                        }
                    } else {
                        c2263nP = C2263nP.T;
                    }
                    if (c1093bP2.b != null && c1093bP2.a == null) {
                        z = false;
                    }
                    AbstractC0397Ej.f(z);
                    C1483fP c1483fP6 = uri4 != null ? new C1483fP(uri4, null, c1093bP2.a != null ? new C1190cP(c1093bP2) : null, null, listEmptyList2, null, abstractC0985aFL2, null) : null;
                    C0995aP c0995aP2 = new C0995aP(yo2);
                    C1385eP c1385eP2 = new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
                    if (c2263nP == null) {
                        c2263nP = C2263nP.T;
                    }
                    c1042as10.q(new C1971kP("", c0995aP2, c1483fP6, c1385eP2, c2263nP, c1581gP2));
                }
                C1042as c1042as13 = playerTvFragment.D0;
                if (c1042as13 != null) {
                    c1042as13.l(5, jC2);
                }
                C1042as c1042as14 = playerTvFragment.D0;
                if (c1042as14 != null) {
                    c1042as14.j();
                    return;
                }
                return;
        }
    }

    @Override // o.Rt0
    public void d(AbstractC2144m60 abstractC2144m60) {
        if (abstractC2144m60.a.requestFocus()) {
            return;
        }
        ((HorizontalGridView) this.m).requestFocus();
    }

    @Override // o.NO
    public int e(Object obj) {
        EO eo = (EO) obj;
        eo.getClass();
        C0643Nw c0643Nw = (C0643Nw) this.m;
        String str = c0643Nw.w;
        String str2 = eo.b;
        return ((str2.equals(str) || str2.equals(OO.b(c0643Nw))) && eo.c(c0643Nw, false)) ? 1 : 0;
    }

    @Override // o.I8
    public long f(long j) {
        C3091vv c3091vv = (C3091vv) this.m;
        return Lr0.k((j * ((long) c3091vv.e)) / 1000000, 0L, c3091vv.j - 1);
    }

    public boolean g(C0334By c0334By, int i, Bundle bundle) {
        InterfaceC1410eh c2133m1;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((PF) c0334By.m).k();
                Parcelable parcelable = (Parcelable) ((PF) c0334By.m).f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription description = ((PF) c0334By.m).getDescription();
        PF pf = (PF) c0334By.m;
        ClipData clipData = new ClipData(description, new ClipData.Item(pf.i()));
        if (i2 >= 31) {
            c2133m1 = new C2133m1(clipData, 2);
        } else {
            C1508fh c1508fh = new C1508fh();
            c1508fh.m = clipData;
            c1508fh.n = 2;
            c2133m1 = c1508fh;
        }
        c2133m1.D(pf.l());
        c2133m1.k(bundle);
        return It0.l((View) this.m, c2133m1.f()) == null;
    }

    public void h(Display display) {
        Xs0 xs0 = (Xs0) this.m;
        xs0.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            xs0.k = refreshRate;
            xs0.l = (refreshRate * 80) / 100;
        } else {
            AP.z();
            xs0.k = -9223372036854775807L;
            xs0.l = -9223372036854775807L;
        }
    }

    @Override // o.InterfaceC1391eV
    public /* synthetic */ void m(AbstractC1099bV abstractC1099bV, int i) {
    }

    @Override // o.InterfaceC1391eV
    public void n(AbstractC1099bV abstractC1099bV, int i) {
        boolean z = abstractC1099bV instanceof C1902jj;
        StringBuilder sb = (StringBuilder) this.m;
        if (z) {
            sb.append(((C1902jj) abstractC1099bV).I());
        } else if (abstractC1099bV instanceof C3059vf) {
            sb.append(((C3059vf) abstractC1099bV).I());
        } else if (abstractC1099bV instanceof C3049va) {
            sb.append(((C3049va) abstractC1099bV).I());
        }
    }

    public /* synthetic */ C2278nc(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    public /* synthetic */ C2278nc(C3201x2 c3201x2, Object obj, int i) {
        this.l = i;
        this.m = obj;
    }

    public /* synthetic */ C2278nc(C3201x2 c3201x2, Object obj, long j) {
        this.l = 4;
        this.m = obj;
    }

    public /* synthetic */ C2278nc(C3201x2 c3201x2, C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z) {
        this.l = 1;
        this.m = c2069lP;
    }
}
