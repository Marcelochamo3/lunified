package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.home.MoviesHomeMobileFragment;
import com.skidush.clonex.fragments.home.MoviesHomeTvFragment;
import com.skidush.clonex.fragments.movies.MoviesMobileFragment;
import com.skidush.clonex.fragments.movies.MoviesTvFragment;
import com.skidush.clonex.fragments.people.PeopleMobileFragment;
import com.skidush.clonex.fragments.people.PeopleTvFragment;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsMobileView;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;
import com.skidush.clonex.fragments.providers.ProvidersMobileFragment;
import com.skidush.clonex.fragments.providers.ProvidersTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;
import com.skidush.clonex.fragments.season.SeasonMobileFragment;
import com.skidush.clonex.fragments.season.SeasonTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsMobileFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1632gu implements InterfaceC1734hw {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C1632gu(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    private final Object a(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        ZR zr = (ZR) obj;
        boolean zB = AbstractC1474fG.b(zr, XR.a);
        MoviesHomeMobileFragment moviesHomeMobileFragment = (MoviesHomeMobileFragment) this.m;
        if (zB) {
            C1930jx c1930jx = moviesHomeMobileFragment.l0;
            AbstractC1474fG.g(c1930jx);
            C1583gR c1583gR = c1930jx.n;
            ((ConstraintLayout) c1583gR.m).setVisibility(0);
            ((ProgressBar) c1583gR.p).setVisibility(0);
            ((Group) c1583gR.f793o).setVisibility(8);
        } else if (zr instanceof YR) {
            List list = ((YR) zr).a;
            moviesHomeMobileFragment.getClass();
            ArrayList<C0882Xb> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!((C0882Xb) obj2).b.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            for (C0882Xb c0882Xb : arrayList) {
                List list2 = c0882Xb.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!(((InterfaceC3106w3) obj3) instanceof C2420oz)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList<InterfaceC3106w3> arrayListY0 = AbstractC0911Ye.y0(arrayList2);
                for (InterfaceC3106w3 interfaceC3106w3 : arrayListY0) {
                    if (interfaceC3106w3 instanceof C1387eR) {
                        EnumC3203x3 enumC3203x3 = EnumC3203x3.w;
                        C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                        c1387eR.getClass();
                        c1387eR.u = enumC3203x3;
                    } else if (interfaceC3106w3 instanceof C2109lo0) {
                        EnumC3203x3 enumC3203x4 = EnumC3203x3.T;
                        C2109lo0 c2109lo0 = (C2109lo0) interfaceC3106w3;
                        c2109lo0.getClass();
                        c2109lo0.s = enumC3203x4;
                    }
                }
                String str = c0882Xb.f;
                if (str == null) {
                    str = c0882Xb.a;
                }
                C2420oz c2420oz = new C2420oz(str, c0882Xb.a);
                c2420oz.d = EnumC3203x3.v;
                arrayListY0.add(c2420oz);
                c0882Xb.b = arrayListY0;
                c0882Xb.d = AbstractC0397Ej.k(moviesHomeMobileFragment.Q(), 10);
                c0882Xb.h = EnumC3203x3.l;
            }
            moviesHomeMobileFragment.n0.m(arrayList);
            C1930jx c1930jx2 = moviesHomeMobileFragment.l0;
            AbstractC1474fG.g(c1930jx2);
            c1930jx2.p.setVisibility(0);
            C1930jx c1930jx3 = moviesHomeMobileFragment.l0;
            AbstractC1474fG.g(c1930jx3);
            ((ConstraintLayout) c1930jx3.n.m).setVisibility(8);
        } else if (zr instanceof WR) {
            Context contextQ = moviesHomeMobileFragment.Q();
            String message = ((WR) zr).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C1930jx c1930jx4 = moviesHomeMobileFragment.l0;
            AbstractC1474fG.g(c1930jx4);
            C1583gR c1583gR2 = c1930jx4.n;
            ((ProgressBar) c1583gR2.p).setVisibility(8);
            ((Group) c1583gR2.f793o).setVisibility(0);
            ((TextView) c1583gR2.n).setOnClickListener(new ViewOnClickListenerC3251xe(11, moviesHomeMobileFragment));
            C1930jx c1930jx5 = moviesHomeMobileFragment.l0;
            AbstractC1474fG.g(c1930jx5);
            c1930jx5.p.setVisibility(8);
        }
        return C2985uq0.a;
    }

    private final Object b(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        ZR zr = (ZR) obj;
        boolean zB = AbstractC1474fG.b(zr, XR.a);
        MoviesHomeTvFragment moviesHomeTvFragment = (MoviesHomeTvFragment) this.m;
        if (zB) {
            C2028kx c2028kx = moviesHomeTvFragment.l0;
            AbstractC1474fG.g(c2028kx);
            C2303no0 c2303no0 = c2028kx.n;
            ((ConstraintLayout) c2303no0.m).setVisibility(0);
            ((ProgressBar) c2303no0.p).setVisibility(0);
            ((Group) c2303no0.f941o).setVisibility(8);
        } else if (zr instanceof YR) {
            List list = ((YR) zr).a;
            moviesHomeTvFragment.getClass();
            ArrayList<C0882Xb> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!((C0882Xb) obj2).b.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            for (C0882Xb c0882Xb : arrayList) {
                List list2 = c0882Xb.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!(((InterfaceC3106w3) obj3) instanceof C2420oz)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList<InterfaceC3106w3> arrayListY0 = AbstractC0911Ye.y0(arrayList2);
                for (InterfaceC3106w3 interfaceC3106w3 : arrayListY0) {
                    if (interfaceC3106w3 instanceof C1387eR) {
                        EnumC3203x3 enumC3203x3 = EnumC3203x3.x;
                        C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                        c1387eR.getClass();
                        c1387eR.u = enumC3203x3;
                    } else if (interfaceC3106w3 instanceof C2109lo0) {
                        EnumC3203x3 enumC3203x4 = EnumC3203x3.U;
                        C2109lo0 c2109lo0 = (C2109lo0) interfaceC3106w3;
                        c2109lo0.getClass();
                        c2109lo0.s = enumC3203x4;
                    }
                }
                String str = c0882Xb.f;
                if (str == null) {
                    str = c0882Xb.a;
                }
                C2420oz c2420oz = new C2420oz(str, c0882Xb.a);
                c2420oz.d = EnumC3203x3.v;
                arrayListY0.add(c2420oz);
                c0882Xb.b = arrayListY0;
                c0882Xb.d = (int) moviesHomeTvFragment.m().getDimension(R.dimen.home_spacing);
                c0882Xb.h = EnumC3203x3.m;
            }
            moviesHomeTvFragment.n0.m(arrayList);
            C2028kx c2028kx2 = moviesHomeTvFragment.l0;
            AbstractC1474fG.g(c2028kx2);
            c2028kx2.p.setVisibility(0);
            C2028kx c2028kx3 = moviesHomeTvFragment.l0;
            AbstractC1474fG.g(c2028kx3);
            ((ConstraintLayout) c2028kx3.n.m).setVisibility(8);
        } else if (zr instanceof WR) {
            Context contextQ = moviesHomeTvFragment.Q();
            String message = ((WR) zr).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C2028kx c2028kx4 = moviesHomeTvFragment.l0;
            AbstractC1474fG.g(c2028kx4);
            C2303no0 c2303no1 = c2028kx4.n;
            ((ProgressBar) c2303no1.p).setVisibility(8);
            ((Group) c2303no1.f941o).setVisibility(0);
            ((TextView) c2303no1.n).setOnClickListener(new ViewOnClickListenerC3251xe(12, moviesHomeTvFragment));
            C2028kx c2028kx5 = moviesHomeTvFragment.l0;
            AbstractC1474fG.g(c2028kx5);
            c2028kx5.p.setVisibility(8);
        }
        return C2985uq0.a;
    }

    private final Object c(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC2169mS abstractC2169mS = (AbstractC2169mS) obj;
        boolean zB = AbstractC1474fG.b(abstractC2169mS, C1876jS.a);
        MoviesMobileFragment moviesMobileFragment = (MoviesMobileFragment) this.m;
        if (zB) {
            C0333Bx c0333Bx = moviesMobileFragment.l0;
            AbstractC1474fG.g(c0333Bx);
            C1583gR c1583gR = c0333Bx.n;
            ((ConstraintLayout) c1583gR.m).setVisibility(0);
            ((ProgressBar) c1583gR.p).setVisibility(0);
            ((Group) c1583gR.f793o).setVisibility(8);
        } else if (AbstractC1474fG.b(abstractC2169mS, C1974kS.a)) {
            moviesMobileFragment.o0.f = true;
        } else if (abstractC2169mS instanceof C2072lS) {
            C2072lS c2072lS = (C2072lS) abstractC2169mS;
            List<C1387eR> list = c2072lS.a;
            moviesMobileFragment.getClass();
            for (C1387eR c1387eR : list) {
                c1387eR.u = AbstractC1474fG.b(c1387eR.n.get("is_tv_channel"), Boolean.TRUE) ? EnumC3203x3.R : EnumC3203x3.A;
            }
            C3300y3 c3300y3 = moviesMobileFragment.o0;
            c3300y3.m(list);
            if (c2072lS.b) {
                c3300y3.l(new C1193cS(moviesMobileFragment, 1));
            } else {
                c3300y3.l(null);
            }
            c3300y3.f = false;
            C0333Bx c0333Bx2 = moviesMobileFragment.l0;
            AbstractC1474fG.g(c0333Bx2);
            ((ConstraintLayout) c0333Bx2.n.m).setVisibility(8);
        } else if (abstractC2169mS instanceof C1780iS) {
            Context contextQ = moviesMobileFragment.Q();
            String message = ((C1780iS) abstractC2169mS).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C3300y3 c3300y4 = moviesMobileFragment.o0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C0333Bx c0333Bx3 = moviesMobileFragment.l0;
                AbstractC1474fG.g(c0333Bx3);
                C1583gR c1583gR2 = c0333Bx3.n;
                ((ProgressBar) c1583gR2.p).setVisibility(8);
                ((Group) c1583gR2.f793o).setVisibility(0);
                ((TextView) c1583gR2.n).setOnClickListener(new ViewOnClickListenerC3251xe(13, moviesMobileFragment));
            }
        }
        return C2985uq0.a;
    }

    private final Object d(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC2169mS abstractC2169mS = (AbstractC2169mS) obj;
        boolean zB = AbstractC1474fG.b(abstractC2169mS, C1876jS.a);
        MoviesTvFragment moviesTvFragment = (MoviesTvFragment) this.m;
        if (zB) {
            C0359Cx c0359Cx = moviesTvFragment.l0;
            AbstractC1474fG.g(c0359Cx);
            C2303no0 c2303no0 = c0359Cx.n;
            ((ConstraintLayout) c2303no0.m).setVisibility(0);
            ((ProgressBar) c2303no0.p).setVisibility(0);
            ((Group) c2303no0.f941o).setVisibility(8);
        } else if (AbstractC1474fG.b(abstractC2169mS, C1974kS.a)) {
            moviesTvFragment.o0.f = true;
        } else if (abstractC2169mS instanceof C2072lS) {
            C2072lS c2072lS = (C2072lS) abstractC2169mS;
            List<C1387eR> list = c2072lS.a;
            moviesTvFragment.getClass();
            for (C1387eR c1387eR : list) {
                c1387eR.u = AbstractC1474fG.b(c1387eR.n.get("is_tv_channel"), Boolean.TRUE) ? EnumC3203x3.S : EnumC3203x3.B;
            }
            C3300y3 c3300y3 = moviesTvFragment.o0;
            c3300y3.m(list);
            if (c2072lS.b) {
                c3300y3.l(new C1486fS(moviesTvFragment, 1));
            } else {
                c3300y3.l(null);
            }
            c3300y3.f = false;
            C0359Cx c0359Cx2 = moviesTvFragment.l0;
            AbstractC1474fG.g(c0359Cx2);
            c0359Cx2.f208o.setVisibility(0);
            C0359Cx c0359Cx3 = moviesTvFragment.l0;
            AbstractC1474fG.g(c0359Cx3);
            ((ConstraintLayout) c0359Cx3.n.m).setVisibility(8);
        } else if (abstractC2169mS instanceof C1780iS) {
            Context contextQ = moviesTvFragment.Q();
            String message = ((C1780iS) abstractC2169mS).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C3300y3 c3300y4 = moviesTvFragment.o0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C0359Cx c0359Cx4 = moviesTvFragment.l0;
                AbstractC1474fG.g(c0359Cx4);
                C2303no0 c2303no1 = c0359Cx4.n;
                ((ProgressBar) c2303no1.p).setVisibility(8);
                ((Group) c2303no1.f941o).setVisibility(0);
                ((TextView) c2303no1.n).setOnClickListener(new ViewOnClickListenerC3251xe(14, moviesTvFragment));
                C0359Cx c0359Cx5 = moviesTvFragment.l0;
                AbstractC1474fG.g(c0359Cx5);
                c0359Cx5.f208o.setVisibility(8);
            }
        }
        return C2985uq0.a;
    }

    private final Object e(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC3338yY abstractC3338yY = (AbstractC3338yY) obj;
        boolean zB = AbstractC1474fG.b(abstractC3338yY, C3047vY.a);
        PeopleMobileFragment peopleMobileFragment = (PeopleMobileFragment) this.m;
        if (zB) {
            C0560Kq c0560Kq = peopleMobileFragment.l0;
            AbstractC1474fG.g(c0560Kq);
            C1583gR c1583gR = (C1583gR) c0560Kq.n;
            ((ConstraintLayout) c1583gR.m).setVisibility(0);
            ((ProgressBar) c1583gR.p).setVisibility(0);
            ((Group) c1583gR.f793o).setVisibility(8);
        } else if (AbstractC1474fG.b(abstractC3338yY, C3144wY.a)) {
            peopleMobileFragment.p0.f = true;
        } else if (abstractC3338yY instanceof C3241xY) {
            C3241xY c3241xY = (C3241xY) abstractC3338yY;
            C1688hY c1688hY = c3241xY.a;
            C0560Kq c0560Kq2 = peopleMobileFragment.l0;
            AbstractC1474fG.g(c0560Kq2);
            ((TextView) c0560Kq2.q).setText(c1688hY.b);
            C0560Kq c0560Kq3 = peopleMobileFragment.l0;
            AbstractC1474fG.g(c0560Kq3);
            ImageView imageView = (ImageView) c0560Kq3.f370o;
            imageView.setClipToOutline(true);
            ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(imageView.getContext()).n(c1688hY.c).q(R.drawable.ic_person_placeholder)).c()).H(imageView);
            List<Cd0> list = c1688hY.d;
            for (Cd0 cd0 : list) {
                if (cd0 instanceof C1387eR) {
                    EnumC3203x3 enumC3203x3 = EnumC3203x3.A;
                    C1387eR c1387eR = (C1387eR) cd0;
                    c1387eR.getClass();
                    c1387eR.u = enumC3203x3;
                } else if (cd0 instanceof C2109lo0) {
                    EnumC3203x3 enumC3203x4 = EnumC3203x3.V;
                    C2109lo0 c2109lo0 = (C2109lo0) cd0;
                    c2109lo0.getClass();
                    c2109lo0.s = enumC3203x4;
                }
            }
            C3300y3 c3300y3 = peopleMobileFragment.p0;
            c3300y3.m(list);
            if (c3241xY.b) {
                c3300y3.l(new C1786iY(peopleMobileFragment, 1));
            } else {
                c3300y3.l(null);
            }
            c3300y3.f = false;
            C0560Kq c0560Kq4 = peopleMobileFragment.l0;
            AbstractC1474fG.g(c0560Kq4);
            ((ConstraintLayout) ((C1583gR) c0560Kq4.n).m).setVisibility(8);
        } else if (abstractC3338yY instanceof C2950uY) {
            Context contextQ = peopleMobileFragment.Q();
            String message = ((C2950uY) abstractC3338yY).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C3300y3 c3300y4 = peopleMobileFragment.p0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C0560Kq c0560Kq5 = peopleMobileFragment.l0;
                AbstractC1474fG.g(c0560Kq5);
                C1583gR c1583gR2 = (C1583gR) c0560Kq5.n;
                ((ProgressBar) c1583gR2.p).setVisibility(8);
                ((Group) c1583gR2.f793o).setVisibility(0);
                ((TextView) c1583gR2.n).setOnClickListener(new ViewOnClickListenerC3251xe(16, peopleMobileFragment));
            }
        }
        return C2985uq0.a;
    }

    private final Object f(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC3338yY abstractC3338yY = (AbstractC3338yY) obj;
        boolean zB = AbstractC1474fG.b(abstractC3338yY, C3047vY.a);
        PeopleTvFragment peopleTvFragment = (PeopleTvFragment) this.m;
        if (zB) {
            C0560Kq c0560Kq = peopleTvFragment.l0;
            AbstractC1474fG.g(c0560Kq);
            C2303no0 c2303no0 = (C2303no0) c0560Kq.n;
            ((ConstraintLayout) c2303no0.m).setVisibility(0);
            ((ProgressBar) c2303no0.p).setVisibility(0);
            ((Group) c2303no0.f941o).setVisibility(8);
        } else if (AbstractC1474fG.b(abstractC3338yY, C3144wY.a)) {
            peopleTvFragment.p0.f = true;
        } else if (abstractC3338yY instanceof C3241xY) {
            C3241xY c3241xY = (C3241xY) abstractC3338yY;
            C1688hY c1688hY = c3241xY.a;
            C0560Kq c0560Kq2 = peopleTvFragment.l0;
            AbstractC1474fG.g(c0560Kq2);
            ((TextView) c0560Kq2.p).setText(c1688hY.b);
            C0560Kq c0560Kq3 = peopleTvFragment.l0;
            AbstractC1474fG.g(c0560Kq3);
            ImageView imageView = (ImageView) c0560Kq3.f370o;
            imageView.setClipToOutline(true);
            ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(imageView.getContext()).n(c1688hY.c).q(R.drawable.ic_person_placeholder)).c()).H(imageView);
            List<Cd0> list = c1688hY.d;
            for (Cd0 cd0 : list) {
                if (cd0 instanceof C1387eR) {
                    EnumC3203x3 enumC3203x3 = EnumC3203x3.B;
                    C1387eR c1387eR = (C1387eR) cd0;
                    c1387eR.getClass();
                    c1387eR.u = enumC3203x3;
                } else if (cd0 instanceof C2109lo0) {
                    EnumC3203x3 enumC3203x4 = EnumC3203x3.W;
                    C2109lo0 c2109lo0 = (C2109lo0) cd0;
                    c2109lo0.getClass();
                    c2109lo0.s = enumC3203x4;
                }
            }
            C3300y3 c3300y3 = peopleTvFragment.p0;
            c3300y3.m(list);
            if (c3241xY.b) {
                c3300y3.l(new C2272nY(peopleTvFragment, 1));
            } else {
                c3300y3.l(null);
            }
            c3300y3.f = false;
            C0560Kq c0560Kq4 = peopleTvFragment.l0;
            AbstractC1474fG.g(c0560Kq4);
            ((ConstraintLayout) ((C2303no0) c0560Kq4.n).m).setVisibility(8);
        } else if (abstractC3338yY instanceof C2950uY) {
            Context contextQ = peopleTvFragment.Q();
            String message = ((C2950uY) abstractC3338yY).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C3300y3 c3300y4 = peopleTvFragment.p0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C0560Kq c0560Kq5 = peopleTvFragment.l0;
                AbstractC1474fG.g(c0560Kq5);
                C2303no0 c2303no1 = (C2303no0) c0560Kq5.n;
                ((ProgressBar) c2303no1.p).setVisibility(8);
                ((Group) c2303no1.f941o).setVisibility(0);
                ViewOnClickListenerC3251xe viewOnClickListenerC3251xe = new ViewOnClickListenerC3251xe(17, peopleTvFragment);
                TextView textView = (TextView) c2303no1.n;
                textView.setOnClickListener(viewOnClickListenerC3251xe);
                textView.requestFocus();
            }
        }
        return C2985uq0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    private final Object g(Object obj, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        ?? arrayList;
        Uri uri;
        C1483fP c1483fP;
        C1483fP c1483fP2;
        AbstractC0985aF<C1873jP> abstractC0985aF;
        Ds0 ds0;
        Object next;
        Q30 q30;
        boolean z = true;
        z = true;
        O10 o10 = (O10) obj;
        boolean zB = AbstractC1474fG.b(o10, H10.a);
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (!zB) {
            boolean z2 = o10 instanceof L10;
            Boolean boolValueOf = null;
            PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.m;
            if (z2) {
                String strB = Cr0.m.b();
                if (AbstractC1474fG.b(strB, "PPV.TO")) {
                    q30 = QW.b;
                } else {
                    Q30.a.getClass();
                    Iterator it = P30.b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                    Q30 q31 = (Q30) next;
                    q30 = q31 == null ? C1816io0.b : q31;
                }
                playerMobileFragment.A0 = (q30 != C1816io0.b || UK.F(playerMobileFragment.h0().a)) ? ((L10) o10).a : C1816io0.F(((L10) o10).a);
                playerMobileFragment.s0();
                playerMobileFragment.d0();
                C2303no0 c2303no0 = playerMobileFragment.u0;
                AbstractC1474fG.g(c2303no0);
                ((PlayerSettingsMobileView) c2303no0.p).setOnServerSelectedListener(new QZ(playerMobileFragment, z ? 1 : 0));
                playerMobileFragment.k0().h(((L10) o10).a, null);
            } else if (o10 instanceof E10) {
                if (!playerMobileFragment.n0() || (playerMobileFragment.p0 == null && playerMobileFragment.C0 <= 0)) {
                    Context contextQ = playerMobileFragment.Q();
                    String message = ((E10) o10).a.getMessage();
                    if (message == null) {
                        message = "Error cargando servidores";
                    }
                    Toast.makeText(contextQ, message, 1).show();
                    Pu0.j(playerMobileFragment).q();
                } else {
                    String message2 = ((E10) o10).a.getMessage();
                    if (message2 == null) {
                        message2 = "Error actualizando datos del canal";
                    }
                    PlayerMobileFragment.a0(playerMobileFragment, message2);
                }
            } else if (o10 instanceof J10) {
                playerMobileFragment.W0 = false;
                playerMobileFragment.Y0 = 0;
                playerMobileFragment.X0 = -1L;
                if (!playerMobileFragment.R0) {
                    playerMobileFragment.o0 = ((J10) o10).a;
                }
                playerMobileFragment.B0 = 0;
                C1042as c1042as = playerMobileFragment.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                c1042as.c0();
            } else if (o10 instanceof N10) {
                N10 n10 = (N10) o10;
                playerMobileFragment.o0 = n10.b;
                Js0 js0 = n10.a;
                playerMobileFragment.p0 = js0;
                if (!(!AbstractC1899jh0.N(js0.n, "webview", true))) {
                    playerMobileFragment.R0 = false;
                }
                String str = js0.n;
                boolean z3 = !AbstractC1899jh0.N(str, "webview", true);
                CJ cj = playerMobileFragment.l0;
                C1005aZ c1005aZM = U9.m((EnumC1103bZ) cj.getValue(), true);
                C1005aZ c1005aZM2 = U9.m((EnumC1103bZ) cj.getValue(), false);
                C2229n00 c2229n00 = AbstractC2520q00.a;
                Boolean bool = playerMobileFragment.s0;
                boolean z4 = js0.v;
                AbstractC2520q00.b = z4;
                AbstractC2520q00.c = bool;
                AbstractC2520q00.e = c1005aZM;
                AbstractC2520q00.f = c1005aZM2;
                AbstractC2520q00.d = z3;
                AbstractC2520q00.g = null;
                SharedPreferences sharedPreferences = AbstractC1459f50.n;
                if (sharedPreferences == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
                    SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
                    if (sharedPreferences2 == null) {
                        AbstractC1474fG.U("prefs");
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
                }
                boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
                Boolean bool2 = playerMobileFragment.s0;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : z4 || zBooleanValue;
                if (!(true ^ AbstractC1899jh0.N(str, "webview", true)) || zBooleanValue2 == playerMobileFragment.r0) {
                    playerMobileFragment.g0(js0, n10.b, n10.c);
                } else {
                    playerMobileFragment.q0(zBooleanValue2, n10.a, n10.b, n10.c, false);
                }
            } else if (o10 instanceof G10) {
                if (!playerMobileFragment.n0() || (playerMobileFragment.p0 == null && playerMobileFragment.C0 <= 0)) {
                    if (UK.F(playerMobileFragment.h0().a) || playerMobileFragment.A0.size() <= 1) {
                        List list = playerMobileFragment.A0;
                        ds0 = (Ds0) AbstractC0911Ye.e0(list.indexOf(((G10) o10).b) + 1, list);
                    } else {
                        if (!playerMobileFragment.R0) {
                            playerMobileFragment.o0 = ((G10) o10).b;
                        }
                        playerMobileFragment.P0.addAll(((G10) o10).c);
                        ds0 = (Ds0) AbstractC0911Ye.d0(playerMobileFragment.l0(false));
                    }
                    if (ds0 != null) {
                        Context contextQ2 = playerMobileFragment.Q();
                        StringBuilder sbS = AbstractC1674hK.s(((G10) o10).b.m, " no disponible, probando ");
                        sbS.append(ds0.m);
                        sbS.append("...");
                        Toast.makeText(contextQ2, sbS.toString(), 0).show();
                        Z10 z10K0 = playerMobileFragment.k0();
                        C1042as c1042as2 = playerMobileFragment.y0;
                        if (c1042as2 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        long jC = c1042as2.C();
                        C1042as c1042as3 = playerMobileFragment.y0;
                        if (c1042as3 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        z10K0.k(jC, c1042as3.H());
                        C1042as c1042as4 = playerMobileFragment.y0;
                        if (c1042as4 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        long jF = U9.f(c1042as4.C(), 0L);
                        if (playerMobileFragment.o0()) {
                            playerMobileFragment.k0().h(AbstractC2506pt.A(ds0), new Long(jF));
                        } else {
                            playerMobileFragment.k0().g(ds0, new Long(jF));
                        }
                    } else {
                        playerMobileFragment.R0 = false;
                        Toast.makeText(playerMobileFragment.Q(), "Error: " + ((G10) o10).a.getMessage(), 1).show();
                        playerMobileFragment.t0();
                    }
                } else {
                    String message3 = ((G10) o10).a.getMessage();
                    if (message3 == null) {
                        message3 = "Error extrayendo la URL del canal";
                    }
                    PlayerMobileFragment.a0(playerMobileFragment, message3);
                }
            } else if (!AbstractC1474fG.b(o10, I10.a)) {
                if (o10 instanceof M10) {
                    C2303no0 c2303no1 = playerMobileFragment.u0;
                    AbstractC1474fG.g(c2303no1);
                    ((PlayerSettingsMobileView) c2303no1.p).setOpenSubtitles(((M10) o10).a);
                } else if (!(o10 instanceof F10) && !AbstractC1474fG.b(o10, C10.a)) {
                    if (o10 instanceof K10) {
                        K10 k10 = (K10) o10;
                        String strP = AbstractC0397Ej.p(playerMobileFragment.Q(), k10.b);
                        Uri uri2 = k10.b;
                        if (strP == null) {
                            strP = uri2.toString();
                            AbstractC1474fG.i(strP, "toString(...)");
                        }
                        C1042as c1042as5 = playerMobileFragment.y0;
                        if (c1042as5 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        long jC2 = c1042as5.C();
                        C1042as c1042as6 = playerMobileFragment.y0;
                        if (c1042as6 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        C1971kP c1971kPA = c1042as6.a();
                        if (c1971kPA == null || (c1483fP2 = c1971kPA.m) == null || (abstractC0985aF = c1483fP2.r) == null) {
                            arrayList = C1233cq.l;
                        } else {
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
                        C1042as c1042as7 = playerMobileFragment.y0;
                        if (c1042as7 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        YO yo = new YO();
                        C1093bP c1093bP = new C1093bP();
                        List listEmptyList = Collections.emptyList();
                        M60 m60 = M60.p;
                        C1581gP c1581gP = C1581gP.n;
                        C1042as c1042as8 = playerMobileFragment.y0;
                        if (c1042as8 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        C1971kP c1971kPA2 = c1042as8.a();
                        if (c1971kPA2 == null || (c1483fP = c1971kPA2.m) == null || (uri = c1483fP.l) == null) {
                            uri = Uri.EMPTY;
                        }
                        Uri uri3 = uri;
                        C1777iP c1777iP2 = new C1777iP(uri2);
                        c1777iP2.b = AbstractC0397Ej.M(strP);
                        c1777iP2.f = strP;
                        C3336yW c3336yW = k10.a;
                        c1777iP2.c = c3336yW.q0();
                        c1777iP2.d = 1;
                        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(AbstractC0911Ye.n0(arrayList, new C1873jP(c1777iP2)));
                        C1042as c1042as9 = playerMobileFragment.y0;
                        if (c1042as9 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        c1042as9.i0();
                        C2263nP c2263nP = c1042as9.N;
                        if (c1093bP.b != null && c1093bP.a == null) {
                            z = false;
                        }
                        AbstractC0397Ej.f(z);
                        C1483fP c1483fP3 = uri3 != null ? new C1483fP(uri3, null, c1093bP.a != null ? new C1190cP(c1093bP) : null, null, listEmptyList, null, abstractC0985aFL, null) : null;
                        C0995aP c0995aP = new C0995aP(yo);
                        C1385eP c1385eP = new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
                        if (c2263nP == null) {
                            c2263nP = C2263nP.T;
                        }
                        c1042as7.q(new C1971kP("", c0995aP, c1483fP3, c1385eP, c2263nP, c1581gP));
                        String strQ0 = c3336yW.q0();
                        if (strQ0 != null) {
                            strP = strQ0;
                        }
                        Cr0.w.f(AbstractC1119bh0.B0(strP, " "));
                        C1042as c1042as10 = playerMobileFragment.y0;
                        if (c1042as10 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        c1042as10.l(5, jC2);
                        C1042as c1042as11 = playerMobileFragment.y0;
                        if (c1042as11 == null) {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                        c1042as11.j();
                    } else if (o10 instanceof D10) {
                        D10 d10 = (D10) o10;
                        Toast.makeText(playerMobileFragment.Q(), d10.b.S0() + ": " + d10.a.getMessage(), 1).show();
                    }
                }
            }
        }
        return c2985uq0;
    }

    private final Object h(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        long jC;
        Ds0 ds0;
        boolean zBooleanValue;
        Object next;
        Q30 q30;
        int i = 1;
        O10 o10 = (O10) obj;
        boolean zB = AbstractC1474fG.b(o10, H10.a);
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (!zB) {
            boolean z = o10 instanceof L10;
            Boolean boolValueOf = null;
            PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.m;
            if (z) {
                String strB = Cr0.m.b();
                if (AbstractC1474fG.b(strB, "PPV.TO")) {
                    q30 = QW.b;
                } else {
                    Q30.a.getClass();
                    Iterator it = P30.b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                    Q30 q31 = (Q30) next;
                    q30 = q31 == null ? C1816io0.b : q31;
                }
                playerTvFragment.F0 = (q30 != C1816io0.b || UK.F(playerTvFragment.i0().a)) ? ((L10) o10).a : C1816io0.F(((L10) o10).a);
                PlayerTvFragment.Y(playerTvFragment);
                playerTvFragment.e0();
                C0560Kq c0560Kq = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq);
                ((PlayerSettingsTvView) c0560Kq.q).setOnServerSelectedListener(new C1158c10(playerTvFragment, i));
                playerTvFragment.n0().h(((L10) o10).a, null);
            } else if (o10 instanceof E10) {
                if (!playerTvFragment.t0() || (playerTvFragment.p0 == null && playerTvFragment.H0 <= 0)) {
                    Context contextQ = playerTvFragment.Q();
                    String message = ((E10) o10).a.getMessage();
                    if (message == null) {
                        message = "Error cargando servidores";
                    }
                    Toast.makeText(contextQ, message, 1).show();
                    Pu0.j(playerTvFragment).q();
                } else {
                    String message2 = ((E10) o10).a.getMessage();
                    if (message2 == null) {
                        message2 = "Error actualizando datos del canal";
                    }
                    PlayerTvFragment.Z(playerTvFragment, message2);
                }
            } else if (o10 instanceof J10) {
                playerTvFragment.v0 = false;
                playerTvFragment.b1 = false;
                playerTvFragment.d1 = 0;
                playerTvFragment.c1 = -1L;
                playerTvFragment.w0 = -9223372036854775807L;
                C0560Kq c0560Kq2 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq2);
                ((FrameLayout) c0560Kq2.n).setVisibility(0);
                C0560Kq c0560Kq3 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq3);
                ((FrameLayout) c0560Kq3.n).requestFocus();
                if (!playerTvFragment.W0) {
                    playerTvFragment.o0 = ((J10) o10).a;
                }
                playerTvFragment.G0 = 0;
                C1042as c1042as = playerTvFragment.D0;
                if (c1042as != null) {
                    c1042as.c0();
                }
            } else if (o10 instanceof N10) {
                N10 n10 = (N10) o10;
                playerTvFragment.o0 = n10.b;
                Js0 js0 = n10.a;
                playerTvFragment.p0 = js0;
                if (!(!AbstractC1899jh0.N(js0.n, "webview", true))) {
                    playerTvFragment.W0 = false;
                }
                String str = js0.n;
                boolean z2 = !AbstractC1899jh0.N(str, "webview", true);
                C1005aZ c1005aZM = U9.m(playerTvFragment.m0(), true);
                C1005aZ c1005aZM2 = U9.m(playerTvFragment.m0(), false);
                C2229n00 c2229n00 = AbstractC2520q00.a;
                Boolean bool = playerTvFragment.s0;
                boolean z3 = js0.v;
                AbstractC2520q00.b = z3;
                AbstractC2520q00.c = bool;
                AbstractC2520q00.e = c1005aZM;
                AbstractC2520q00.f = c1005aZM2;
                AbstractC2520q00.d = z2;
                AbstractC2520q00.g = null;
                SharedPreferences sharedPreferences = AbstractC1459f50.n;
                if (sharedPreferences == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
                    SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
                    if (sharedPreferences2 == null) {
                        AbstractC1474fG.U("prefs");
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
                }
                boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : true;
                Boolean bool2 = playerTvFragment.s0;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = z3 || zBooleanValue2;
                }
                if (!(true ^ AbstractC1899jh0.N(str, "webview", true)) || zBooleanValue == playerTvFragment.r0) {
                    playerTvFragment.h0(js0, n10.b, n10.c);
                } else {
                    playerTvFragment.x0(zBooleanValue, n10.a, n10.b, n10.c, false);
                }
            } else {
                if (o10 instanceof G10) {
                    if (!playerTvFragment.t0() || (playerTvFragment.p0 == null && playerTvFragment.H0 <= 0)) {
                        if (UK.F(playerTvFragment.i0().a) || playerTvFragment.F0.size() <= 1) {
                            List list = playerTvFragment.F0;
                            ds0 = (Ds0) AbstractC0911Ye.e0(list.indexOf(((G10) o10).b) + 1, list);
                        } else {
                            if (!playerTvFragment.W0) {
                                playerTvFragment.o0 = ((G10) o10).b;
                            }
                            playerTvFragment.U0.addAll(((G10) o10).c);
                            ds0 = (Ds0) AbstractC0911Ye.d0(playerTvFragment.o0(false));
                        }
                        if (ds0 != null) {
                            Context contextQ2 = playerTvFragment.Q();
                            StringBuilder sbS = AbstractC1674hK.s(((G10) o10).b.m, " no disponible, probando ");
                            sbS.append(ds0.m);
                            sbS.append("...");
                            Toast.makeText(contextQ2, sbS.toString(), 0).show();
                            C1042as c1042as2 = playerTvFragment.D0;
                            if (c1042as2 != null) {
                                playerTvFragment.n0().k(c1042as2.C(), c1042as2.H());
                            }
                            C1042as c1042as3 = playerTvFragment.D0;
                            jC = c1042as3 != null ? U9.f(c1042as3.C(), 0L) : 0L;
                            if (playerTvFragment.u0()) {
                                playerTvFragment.n0().h(AbstractC2506pt.A(ds0), new Long(jC));
                            } else {
                                playerTvFragment.n0().g(ds0, new Long(jC));
                            }
                        } else {
                            playerTvFragment.W0 = false;
                            C0560Kq c0560Kq4 = playerTvFragment.z0;
                            AbstractC1474fG.g(c0560Kq4);
                            ((FrameLayout) c0560Kq4.n).setVisibility(8);
                            Toast.makeText(playerTvFragment.Q(), "Error: " + ((G10) o10).a.getMessage(), 1).show();
                        }
                    } else {
                        String message3 = ((G10) o10).a.getMessage();
                        if (message3 == null) {
                            message3 = "Error extrayendo la URL del canal";
                        }
                        PlayerTvFragment.Z(playerTvFragment, message3);
                    }
                } else if (!AbstractC1474fG.b(o10, I10.a)) {
                    if (o10 instanceof M10) {
                        C0560Kq c0560Kq5 = playerTvFragment.z0;
                        AbstractC1474fG.g(c0560Kq5);
                        ((PlayerSettingsTvView) c0560Kq5.q).setOpenSubtitles(((M10) o10).a);
                    } else if (!(o10 instanceof F10) && !AbstractC1474fG.b(o10, C10.a)) {
                        if (o10 instanceof K10) {
                            K10 k10 = (K10) o10;
                            String strP = AbstractC0397Ej.p(playerTvFragment.Q(), k10.b);
                            Uri uri = k10.b;
                            if (strP == null) {
                                strP = uri.toString();
                                AbstractC1474fG.i(strP, "toString(...)");
                            }
                            String strQ0 = k10.a.q0();
                            if (strQ0 != null) {
                                strP = strQ0;
                            }
                            String string = uri.toString();
                            AbstractC1474fG.i(string, "toString(...)");
                            Es0 es0 = new Es0(strP, string, true, null, 8);
                            Cr0.w.f(AbstractC1119bh0.B0(strP, " "));
                            Js0 js1 = playerTvFragment.p0;
                            if (js1 != null) {
                                ArrayList arrayListY0 = AbstractC0911Ye.y0(js1.u);
                                arrayListY0.add(es0);
                                Js0 js0A = Js0.a(js1, null, null, null, null, null, arrayListY0, false, 3583);
                                playerTvFragment.p0 = js0A;
                                C1042as c1042as4 = playerTvFragment.D0;
                                jC = c1042as4 != null ? c1042as4.C() : 0L;
                                Ds0 ds1 = playerTvFragment.o0;
                                if (ds1 != null) {
                                    playerTvFragment.h0(js0A, ds1, jC);
                                }
                            }
                        } else if (o10 instanceof D10) {
                            D10 d10 = (D10) o10;
                            Toast.makeText(playerTvFragment.Q(), d10.b.S0() + ": " + d10.a.getMessage(), 1).show();
                        }
                    }
                }
            }
        }
        return c2985uq0;
    }

    private final Object i(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC1945k40 abstractC1945k40 = (AbstractC1945k40) obj;
        boolean zB = AbstractC1474fG.b(abstractC1945k40, C1653h40.a);
        ProvidersMobileFragment providersMobileFragment = (ProvidersMobileFragment) this.m;
        if (zB) {
            C1583gR c1583gR = providersMobileFragment.l0;
            AbstractC1474fG.g(c1583gR);
            C1583gR c1583gR2 = (C1583gR) c1583gR.n;
            ((ConstraintLayout) c1583gR2.m).setVisibility(0);
            ((ProgressBar) c1583gR2.p).setVisibility(0);
            ((Group) c1583gR2.f793o).setVisibility(8);
        } else if (abstractC1945k40 instanceof C1847j40) {
            List<R30> list = ((C1847j40) abstractC1945k40).a;
            providersMobileFragment.getClass();
            for (R30 r30 : list) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.N;
                r30.getClass();
                r30.d = enumC3203x3;
            }
            providersMobileFragment.n0.m(list);
            C1583gR c1583gR3 = providersMobileFragment.l0;
            AbstractC1474fG.g(c1583gR3);
            ((ConstraintLayout) ((C1583gR) c1583gR3.n).m).setVisibility(8);
        } else if (abstractC1945k40 instanceof C1555g40) {
            Context contextQ = providersMobileFragment.Q();
            String message = ((C1555g40) abstractC1945k40).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C1583gR c1583gR4 = providersMobileFragment.l0;
            AbstractC1474fG.g(c1583gR4);
            C1583gR c1583gR5 = (C1583gR) c1583gR4.n;
            ((ProgressBar) c1583gR5.p).setVisibility(8);
            ((Group) c1583gR5.f793o).setVisibility(0);
            ((TextView) c1583gR5.n).setOnClickListener(new ViewOnClickListenerC3251xe(19, providersMobileFragment));
        } else if (abstractC1945k40 instanceof C1751i40) {
            Ec0 ec0 = Ec0.a;
            Ec0.g(providersMobileFragment.P(), ((C1751i40) abstractC1945k40).a);
        }
        return C2985uq0.a;
    }

    private final Object j(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC1945k40 abstractC1945k40 = (AbstractC1945k40) obj;
        boolean zB = AbstractC1474fG.b(abstractC1945k40, C1653h40.a);
        ProvidersTvFragment providersTvFragment = (ProvidersTvFragment) this.m;
        if (zB) {
            C2303no0 c2303no0 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no0);
            C2303no0 c2303no1 = (C2303no0) c2303no0.n;
            ((ConstraintLayout) c2303no1.m).setVisibility(0);
            ((ProgressBar) c2303no1.p).setVisibility(0);
            ((Group) c2303no1.f941o).setVisibility(8);
        } else if (abstractC1945k40 instanceof C1847j40) {
            List<R30> list = ((C1847j40) abstractC1945k40).a;
            providersTvFragment.getClass();
            for (R30 r30 : list) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.O;
                r30.getClass();
                r30.d = enumC3203x3;
            }
            providersTvFragment.n0.m(list);
            C2303no0 c2303no2 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no2);
            RecyclerView recyclerView = (RecyclerView) c2303no2.f941o;
            recyclerView.post(new RunnableC2812t10(1, recyclerView));
            C2303no0 c2303no3 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no3);
            ((RecyclerView) c2303no3.f941o).setVisibility(0);
            C2303no0 c2303no4 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no4);
            ((ConstraintLayout) ((C2303no0) c2303no4.n).m).setVisibility(8);
        } else if (abstractC1945k40 instanceof C1555g40) {
            Context contextQ = providersTvFragment.Q();
            String message = ((C1555g40) abstractC1945k40).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C2303no0 c2303no5 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no5);
            C2303no0 c2303no6 = (C2303no0) c2303no5.n;
            ((ProgressBar) c2303no6.p).setVisibility(8);
            ((Group) c2303no6.f941o).setVisibility(0);
            ((TextView) c2303no6.n).setOnClickListener(new ViewOnClickListenerC3251xe(20, providersTvFragment));
            C2303no0 c2303no7 = providersTvFragment.l0;
            AbstractC1474fG.g(c2303no7);
            ((RecyclerView) c2303no7.f941o).setVisibility(8);
        } else if (abstractC1945k40 instanceof C1751i40) {
            Ec0 ec0 = Ec0.a;
            Ec0.g(providersTvFragment.P(), ((C1751i40) abstractC1945k40).a);
        }
        return C2985uq0.a;
    }

    private final Object k(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        String strE;
        List<InterfaceC3106w3> list;
        Ea0 ea0 = (Ea0) obj;
        boolean zB = AbstractC1474fG.b(ea0, Aa0.a);
        SearchMobileFragment searchMobileFragment = (SearchMobileFragment) this.m;
        if (zB) {
            SearchMobileFragment.W(searchMobileFragment, false);
        } else if (AbstractC1474fG.b(ea0, C3438za0.a)) {
            SearchMobileFragment.W(searchMobileFragment, true);
        } else if (AbstractC1474fG.b(ea0, Ba0.a)) {
            searchMobileFragment.o0.f = true;
        } else if (ea0 instanceof Da0) {
            Da0 da0 = (Da0) ea0;
            List<InterfaceC3106w3> list2 = da0.a;
            C3300y3 c3300y3 = searchMobileFragment.o0;
            for (InterfaceC3106w3 interfaceC3106w3 : list2) {
                if (interfaceC3106w3 instanceof C2420oz) {
                    EnumC3203x3 enumC3203x3 = EnumC3203x3.t;
                    C2420oz c2420oz = (C2420oz) interfaceC3106w3;
                    c2420oz.getClass();
                    c2420oz.d = enumC3203x3;
                } else if (interfaceC3106w3 instanceof C1387eR) {
                    C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                    Object obj2 = c1387eR.n.get("dual_team_event");
                    Boolean bool = Boolean.TRUE;
                    EnumC3203x3 enumC3203x4 = AbstractC1474fG.b(obj2, bool) ? EnumC3203x3.D : (AbstractC1474fG.b(c1387eR.n.get("is_tv_channel"), bool) || AbstractC1899jh0.U(c1387eR.a, "tv-", false) || AbstractC1899jh0.U(c1387eR.a, "claro-", false)) ? EnumC3203x3.R : EnumC3203x3.A;
                    C1387eR c1387eR2 = (C1387eR) interfaceC3106w3;
                    c1387eR2.getClass();
                    c1387eR2.u = enumC3203x4;
                } else if (interfaceC3106w3 instanceof C0456Gq) {
                    EnumC3203x3 enumC3203x5 = EnumC3203x3.p;
                    C0456Gq c0456Gq = (C0456Gq) interfaceC3106w3;
                    c0456Gq.getClass();
                    c0456Gq.l = enumC3203x5;
                } else if (interfaceC3106w3 instanceof C2109lo0) {
                    EnumC3203x3 enumC3203x6 = EnumC3203x3.V;
                    C2109lo0 c2109lo0 = (C2109lo0) interfaceC3106w3;
                    c2109lo0.getClass();
                    c2109lo0.s = enumC3203x6;
                }
            }
            c3300y3.m(list2);
            if (!da0.b || AbstractC1474fG.b(searchMobileFragment.X().d, "")) {
                searchMobileFragment.o0.l(null);
            } else {
                searchMobileFragment.o0.l(new C1691ha0(searchMobileFragment, 1));
            }
            searchMobileFragment.o0.f = false;
            C1750i4 c1750i4 = searchMobileFragment.l0;
            AbstractC1474fG.g(c1750i4);
            ((ConstraintLayout) ((C1583gR) c1750i4.p).m).setVisibility(8);
        } else if (ea0 instanceof Ca0) {
            List<X30> list3 = ((Ca0) ea0).a;
            searchMobileFragment.getClass();
            ArrayList arrayList = new ArrayList();
            for (X30 x30 : list3) {
                zy0 zy0Var = x30.b;
                boolean zB2 = AbstractC1474fG.b(zy0Var, V30.f565o);
                Q30 q30 = x30.a;
                if (zB2) {
                    strE = AbstractC1701hf0.e(q30.getName(), " - ", searchMobileFragment.n(R.string.global_search_searching));
                } else if (zy0Var instanceof U30) {
                    strE = AbstractC1701hf0.e(q30.getName(), " - ", searchMobileFragment.n(R.string.global_search_error));
                } else {
                    if (!(zy0Var instanceof W30)) {
                        throw new C0730Rf();
                    }
                    int size = ((W30) zy0Var).f587o.size();
                    String strN = searchMobileFragment.n(size == 1 ? R.string.global_search_result : R.string.global_search_results);
                    AbstractC1474fG.i(strN, "getString(...)");
                    strE = q30.getName() + " - " + size + " " + strN;
                }
                C0882Xb c0882Xb = new C0882Xb(strE, C1233cq.l);
                c0882Xb.g = AbstractC1701hf0.t("global-search:", q30.getName());
                c0882Xb.h = EnumC3203x3.l;
                arrayList.add(c0882Xb);
                zy0 zy0Var2 = x30.b;
                W30 w30 = zy0Var2 instanceof W30 ? (W30) zy0Var2 : null;
                if (w30 != null && (list = w30.f587o) != null) {
                    for (InterfaceC3106w3 interfaceC3106w4 : list) {
                        if (interfaceC3106w4 instanceof C1387eR) {
                            EnumC3203x3 enumC3203x7 = EnumC3203x3.A;
                            C1387eR c1387eR3 = (C1387eR) interfaceC3106w4;
                            c1387eR3.getClass();
                            c1387eR3.u = enumC3203x7;
                        } else if (interfaceC3106w4 instanceof C2109lo0) {
                            EnumC3203x3 enumC3203x8 = EnumC3203x3.V;
                            C2109lo0 c2109lo1 = (C2109lo0) interfaceC3106w4;
                            c2109lo1.getClass();
                            c2109lo1.s = enumC3203x8;
                        }
                    }
                    arrayList.addAll(list);
                }
            }
            searchMobileFragment.o0.m(arrayList);
            searchMobileFragment.o0.l(null);
            if (searchMobileFragment.p0) {
                searchMobileFragment.p0 = false;
                C1750i4 c1750i5 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i5);
                ((RecyclerView) c1750i5.q).post(new Jj0(25, searchMobileFragment));
            }
            searchMobileFragment.o0.f = false;
            C1750i4 c1750i6 = searchMobileFragment.l0;
            AbstractC1474fG.g(c1750i6);
            ((ConstraintLayout) ((C1583gR) c1750i6.p).m).setVisibility(8);
        } else if (ea0 instanceof C3341ya0) {
            Context contextQ = searchMobileFragment.Q();
            String message = ((C3341ya0) ea0).a.getMessage();
            Toast.makeText(contextQ, message != null ? message : "", 0).show();
            C3300y3 c3300y4 = searchMobileFragment.o0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C1750i4 c1750i7 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i7);
                C1583gR c1583gR = (C1583gR) c1750i7.p;
                ((ProgressBar) c1583gR.p).setVisibility(8);
                ((Group) c1583gR.f793o).setVisibility(0);
                ((TextView) c1583gR.n).setOnClickListener(new ViewOnClickListenerC1593ga0(searchMobileFragment, 1));
            }
        }
        return C2985uq0.a;
    }

    private final Object m(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        String strE;
        List<InterfaceC3106w3> list;
        Ea0 ea0 = (Ea0) obj;
        boolean zB = AbstractC1474fG.b(ea0, Aa0.a);
        SearchTvFragment searchTvFragment = (SearchTvFragment) this.m;
        if (zB) {
            SearchTvFragment.W(searchTvFragment, false);
        } else if (AbstractC1474fG.b(ea0, C3438za0.a)) {
            SearchTvFragment.W(searchTvFragment, true);
        } else if (AbstractC1474fG.b(ea0, Ba0.a)) {
            searchTvFragment.o0.f = true;
        } else {
            Object obj2 = null;
            if (ea0 instanceof Da0) {
                Da0 da0 = (Da0) ea0;
                List<InterfaceC3106w3> list2 = da0.a;
                Tl0 tl0 = searchTvFragment.l0;
                AbstractC1474fG.g(tl0);
                ((VerticalGridView) tl0.r).setNumColumns(AbstractC1474fG.b(searchTvFragment.X().d, "") ? 5 : 6);
                C3300y3 c3300y3 = searchTvFragment.o0;
                for (InterfaceC3106w3 interfaceC3106w3 : list2) {
                    if (interfaceC3106w3 instanceof C2420oz) {
                        EnumC3203x3 enumC3203x3 = EnumC3203x3.u;
                        C2420oz c2420oz = (C2420oz) interfaceC3106w3;
                        c2420oz.getClass();
                        c2420oz.d = enumC3203x3;
                    } else if (interfaceC3106w3 instanceof C1387eR) {
                        C1387eR c1387eR = (C1387eR) interfaceC3106w3;
                        Object obj3 = c1387eR.n.get("dual_team_event");
                        Boolean bool = Boolean.TRUE;
                        EnumC3203x3 enumC3203x4 = AbstractC1474fG.b(obj3, bool) ? EnumC3203x3.E : (AbstractC1474fG.b(c1387eR.n.get("is_tv_channel"), bool) || AbstractC1899jh0.U(c1387eR.a, "tv-", false) || AbstractC1899jh0.U(c1387eR.a, "claro-", false)) ? EnumC3203x3.S : EnumC3203x3.B;
                        C1387eR c1387eR2 = (C1387eR) interfaceC3106w3;
                        c1387eR2.getClass();
                        c1387eR2.u = enumC3203x4;
                    } else if (interfaceC3106w3 instanceof C0456Gq) {
                        EnumC3203x3 enumC3203x5 = EnumC3203x3.q;
                        C0456Gq c0456Gq = (C0456Gq) interfaceC3106w3;
                        c0456Gq.getClass();
                        c0456Gq.l = enumC3203x5;
                    } else if (interfaceC3106w3 instanceof C2109lo0) {
                        EnumC3203x3 enumC3203x6 = EnumC3203x3.W;
                        C2109lo0 c2109lo0 = (C2109lo0) interfaceC3106w3;
                        c2109lo0.getClass();
                        c2109lo0.s = enumC3203x6;
                    }
                }
                c3300y3.m(list2);
                if (!da0.b || AbstractC1474fG.b(searchTvFragment.X().d, "")) {
                    searchTvFragment.o0.l(null);
                } else {
                    searchTvFragment.o0.l(new C2662ra0(searchTvFragment, 1));
                }
                searchTvFragment.o0.f = false;
                Tl0 tl1 = searchTvFragment.l0;
                AbstractC1474fG.g(tl1);
                Tl0 tl2 = searchTvFragment.l0;
                AbstractC1474fG.g(tl2);
                ((SearchEditText) tl1.n).setNextFocusDownId(((VerticalGridView) tl2.r).getId());
                Tl0 tl3 = searchTvFragment.l0;
                AbstractC1474fG.g(tl3);
                ((VerticalGridView) tl3.r).setVisibility(0);
                Tl0 tl4 = searchTvFragment.l0;
                AbstractC1474fG.g(tl4);
                ((ConstraintLayout) ((C2303no0) tl4.f542o).m).setVisibility(8);
            } else if (ea0 instanceof Ca0) {
                List<X30> list3 = ((Ca0) ea0).a;
                searchTvFragment.getClass();
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(list3, 10));
                for (X30 x30 : list3) {
                    zy0 zy0Var = x30.b;
                    boolean zB2 = AbstractC1474fG.b(zy0Var, V30.f565o);
                    Q30 q30 = x30.a;
                    if (zB2) {
                        strE = AbstractC1701hf0.e(q30.getName(), " - ", searchTvFragment.n(R.string.global_search_searching));
                    } else if (zy0Var instanceof U30) {
                        strE = AbstractC1701hf0.e(q30.getName(), " - ", searchTvFragment.n(R.string.global_search_error));
                    } else {
                        if (!(zy0Var instanceof W30)) {
                            throw new C0730Rf();
                        }
                        int size = ((W30) zy0Var).f587o.size();
                        String strN = searchTvFragment.n(size == 1 ? R.string.global_search_result : R.string.global_search_results);
                        AbstractC1474fG.i(strN, "getString(...)");
                        strE = q30.getName() + " - " + size + " " + strN;
                    }
                    zy0 zy0Var2 = x30.b;
                    W30 w30 = zy0Var2 instanceof W30 ? (W30) zy0Var2 : null;
                    if (w30 == null || (list = w30.f587o) == null) {
                        list = null;
                    } else {
                        for (InterfaceC3106w3 interfaceC3106w4 : list) {
                            if (interfaceC3106w4 instanceof C1387eR) {
                                EnumC3203x3 enumC3203x7 = EnumC3203x3.x;
                                C1387eR c1387eR3 = (C1387eR) interfaceC3106w4;
                                c1387eR3.getClass();
                                c1387eR3.u = enumC3203x7;
                            } else if (interfaceC3106w4 instanceof C2109lo0) {
                                EnumC3203x3 enumC3203x8 = EnumC3203x3.U;
                                C2109lo0 c2109lo1 = (C2109lo0) interfaceC3106w4;
                                c2109lo1.getClass();
                                c2109lo1.s = enumC3203x8;
                            }
                        }
                    }
                    if (list == null) {
                        list = C1233cq.l;
                    }
                    C0882Xb c0882Xb = new C0882Xb(strE, list);
                    c0882Xb.g = AbstractC1701hf0.t("global-search:", q30.getName());
                    c0882Xb.h = EnumC3203x3.m;
                    c0882Xb.d = (int) searchTvFragment.m().getDimension(R.dimen.search_spacing);
                    arrayList.add(c0882Xb);
                }
                Tl0 tl5 = searchTvFragment.l0;
                AbstractC1474fG.g(tl5);
                ((VerticalGridView) tl5.r).setNumColumns(1);
                searchTvFragment.o0.m(arrayList);
                searchTvFragment.o0.l(null);
                if (searchTvFragment.q0) {
                    YF it = AbstractC0937Ze.I(searchTvFragment.o0.d).iterator();
                    while (it.n) {
                        Object next = it.next();
                        if (searchTvFragment.Y(((Number) next).intValue())) {
                            obj2 = next;
                            break;
                        }
                    }
                    Integer num = (Integer) obj2;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        searchTvFragment.q0 = false;
                        Tl0 tl6 = searchTvFragment.l0;
                        AbstractC1474fG.g(tl6);
                        ((VerticalGridView) tl6.r).post(new R6(iIntValue, 2, searchTvFragment));
                    }
                }
                searchTvFragment.o0.f = false;
                Tl0 tl7 = searchTvFragment.l0;
                AbstractC1474fG.g(tl7);
                Tl0 tl8 = searchTvFragment.l0;
                AbstractC1474fG.g(tl8);
                ((SearchEditText) tl7.n).setNextFocusDownId(((LinearLayout) tl8.q).getId());
                Tl0 tl9 = searchTvFragment.l0;
                AbstractC1474fG.g(tl9);
                ((VerticalGridView) tl9.r).setVisibility(0);
                Tl0 tl10 = searchTvFragment.l0;
                AbstractC1474fG.g(tl10);
                ((ConstraintLayout) ((C2303no0) tl10.f542o).m).setVisibility(8);
            } else if (ea0 instanceof C3341ya0) {
                Context contextQ = searchTvFragment.Q();
                String message = ((C3341ya0) ea0).a.getMessage();
                Toast.makeText(contextQ, message != null ? message : "", 0).show();
                C3300y3 c3300y4 = searchTvFragment.o0;
                if (c3300y4.f) {
                    c3300y4.f = false;
                } else {
                    Tl0 tl11 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl11);
                    C2303no0 c2303no0 = (C2303no0) tl11.f542o;
                    ((ProgressBar) c2303no0.p).setVisibility(8);
                    ((Group) c2303no0.f941o).setVisibility(0);
                    ((TextView) c2303no0.n).setOnClickListener(new ViewOnClickListenerC2566qa0(searchTvFragment, 2));
                    Tl0 tl12 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl12);
                    ((VerticalGridView) tl12.r).setVisibility(4);
                    Tl0 tl13 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl13);
                    Tl0 tl14 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl14);
                    ((SearchEditText) tl13.n).setNextFocusDownId(((TextView) ((C2303no0) tl14.f542o).n).getId());
                    Tl0 tl15 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl15);
                    TextView textView = (TextView) ((C2303no0) tl15.f542o).n;
                    Tl0 tl16 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl16);
                    textView.setNextFocusUpId(((SearchEditText) tl16.n).getId());
                }
            }
        }
        return C2985uq0.a;
    }

    private final Object n(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Object next;
        int iNextIndex;
        Integer numValueOf;
        AbstractC1107bb0 abstractC1107bb0 = (AbstractC1107bb0) obj;
        boolean zB = AbstractC1474fG.b(abstractC1107bb0, Za0.a);
        SeasonMobileFragment seasonMobileFragment = (SeasonMobileFragment) this.m;
        if (zB) {
            C1583gR c1583gR = seasonMobileFragment.l0;
            AbstractC1474fG.g(c1583gR);
            C1583gR c1583gR2 = (C1583gR) c1583gR.n;
            ((ConstraintLayout) c1583gR2.m).setVisibility(0);
            ((ProgressBar) c1583gR2.p).setVisibility(0);
            ((Group) c1583gR2.f793o).setVisibility(8);
        } else if (abstractC1107bb0 instanceof C1009ab0) {
            List<C0456Gq> list = ((C1009ab0) abstractC1107bb0).a;
            seasonMobileFragment.getClass();
            for (C0456Gq c0456Gq : list) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.p;
                c0456Gq.getClass();
                c0456Gq.l = enumC3203x3;
            }
            seasonMobileFragment.p0.m(list);
            Iterator it = AbstractC0911Ye.r0(list, new C1749i30(4)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C0456Gq) next).j == null);
            C0456Gq c0456Gq2 = (C0456Gq) next;
            if (c0456Gq2 != null) {
                numValueOf = Integer.valueOf(list.indexOf(c0456Gq2));
            } else {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (((C0456Gq) listIterator.previous()).h) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(iNextIndex);
                if (iNextIndex == -1 || iNextIndex + 1 >= list.size()) {
                    numValueOf2 = null;
                }
                numValueOf = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + 1) : null;
            }
            if (numValueOf != null) {
                C1583gR c1583gR3 = seasonMobileFragment.l0;
                AbstractC1474fG.g(c1583gR3);
                X50 layoutManager = ((RecyclerView) c1583gR3.f793o).getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int iIntValue = numValueOf.intValue();
                    C1583gR c1583gR4 = seasonMobileFragment.l0;
                    AbstractC1474fG.g(c1583gR4);
                    int height = (((RecyclerView) c1583gR4.f793o).getHeight() / 2) - AbstractC0397Ej.k(seasonMobileFragment.Q(), 100);
                    linearLayoutManager.x = iIntValue;
                    linearLayoutManager.y = height;
                    C2549qK c2549qK = linearLayoutManager.z;
                    if (c2549qK != null) {
                        c2549qK.l = -1;
                    }
                    linearLayoutManager.E0();
                }
            }
            C1583gR c1583gR5 = seasonMobileFragment.l0;
            AbstractC1474fG.g(c1583gR5);
            ((ConstraintLayout) ((C1583gR) c1583gR5.n).m).setVisibility(8);
        } else if (abstractC1107bb0 instanceof Ya0) {
            Context contextQ = seasonMobileFragment.Q();
            String message = ((Ya0) abstractC1107bb0).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C1583gR c1583gR6 = seasonMobileFragment.l0;
            AbstractC1474fG.g(c1583gR6);
            C1583gR c1583gR7 = (C1583gR) c1583gR6.n;
            ((ProgressBar) c1583gR7.p).setVisibility(8);
            ((Group) c1583gR7.f793o).setVisibility(0);
            ((TextView) c1583gR7.n).setOnClickListener(new ViewOnClickListenerC3251xe(21, seasonMobileFragment));
        }
        return C2985uq0.a;
    }

    private final Object o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Integer numValueOf;
        Object next;
        int iNextIndex;
        AbstractC1107bb0 abstractC1107bb0 = (AbstractC1107bb0) obj;
        boolean zB = AbstractC1474fG.b(abstractC1107bb0, Za0.a);
        SeasonTvFragment seasonTvFragment = (SeasonTvFragment) this.m;
        if (zB) {
            C2303no0 c2303no0 = seasonTvFragment.l0;
            AbstractC1474fG.g(c2303no0);
            C2303no0 c2303no1 = (C2303no0) c2303no0.f941o;
            ((ConstraintLayout) c2303no1.m).setVisibility(0);
            ((ProgressBar) c2303no1.p).setVisibility(0);
            ((Group) c2303no1.f941o).setVisibility(8);
        } else if (abstractC1107bb0 instanceof C1009ab0) {
            List<C0456Gq> list = ((C1009ab0) abstractC1107bb0).a;
            seasonTvFragment.getClass();
            for (C0456Gq c0456Gq : list) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.q;
                c0456Gq.getClass();
                c0456Gq.l = enumC3203x3;
            }
            seasonTvFragment.p0.m(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((C0456Gq) obj2).j != null) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = AbstractC0911Ye.r0(arrayList, new C1749i30(5)).iterator();
            do {
                numValueOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C0456Gq) next).j == null);
            C0456Gq c0456Gq2 = (C0456Gq) next;
            if (c0456Gq2 != null) {
                numValueOf = Integer.valueOf(list.indexOf(c0456Gq2));
            } else {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (((C0456Gq) listIterator.previous()).h) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(iNextIndex);
                if (iNextIndex == -1 || iNextIndex + 1 >= list.size()) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    numValueOf = Integer.valueOf(numValueOf2.intValue() + 1);
                }
            }
            if (numValueOf != null) {
                C2303no0 c2303no2 = seasonTvFragment.l0;
                AbstractC1474fG.g(c2303no2);
                ((HorizontalGridView) c2303no2.n).g0(numValueOf.intValue());
            }
            C2303no0 c2303no3 = seasonTvFragment.l0;
            AbstractC1474fG.g(c2303no3);
            ((ConstraintLayout) ((C2303no0) c2303no3.f941o).m).setVisibility(8);
        } else if (abstractC1107bb0 instanceof Ya0) {
            Context contextQ = seasonTvFragment.Q();
            String message = ((Ya0) abstractC1107bb0).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C2303no0 c2303no4 = seasonTvFragment.l0;
            AbstractC1474fG.g(c2303no4);
            C2303no0 c2303no5 = (C2303no0) c2303no4.f941o;
            ((ProgressBar) c2303no5.p).setVisibility(8);
            ((Group) c2303no5.f941o).setVisibility(0);
            ViewOnClickListenerC3251xe viewOnClickListenerC3251xe = new ViewOnClickListenerC3251xe(22, seasonTvFragment);
            TextView textView = (TextView) c2303no5.n;
            textView.setOnClickListener(viewOnClickListenerC3251xe);
            textView.requestFocus();
        }
        return C2985uq0.a;
    }

    private final Object p(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2109lo0 c2109lo0A;
        C2109lo0 c2109lo0A2;
        Qo0 qo0 = (Qo0) obj;
        boolean zB = AbstractC1474fG.b(qo0, Oo0.a);
        TvShowMobileFragment tvShowMobileFragment = (TvShowMobileFragment) this.m;
        if (zB) {
            C1930jx c1930jx = tvShowMobileFragment.l0;
            AbstractC1474fG.g(c1930jx);
            C1583gR c1583gR = c1930jx.n;
            ((ConstraintLayout) c1583gR.m).setVisibility(0);
            ((ProgressBar) c1583gR.p).setVisibility(0);
            ((Group) c1583gR.f793o).setVisibility(8);
        } else if (qo0 instanceof Po0) {
            C2109lo0 c2109lo0 = ((Po0) qo0).a;
            Context contextQ = tvShowMobileFragment.Q();
            C2630r70 c2630r70N = com.bumptech.glide.a.b(contextQ).b(contextQ).n(c2109lo0.i);
            C1930jx c1930jx2 = tvShowMobileFragment.l0;
            AbstractC1474fG.g(c1930jx2);
            c2630r70N.H(c1930jx2.f858o);
            c2109lo0.s = EnumC3203x3.Y;
            C2109lo0 c2109lo0A3 = null;
            C2109lo0 c2109lo1 = c2109lo0.k.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo1 != null) {
                c2109lo0A = C2109lo0.a(c2109lo1, null, null, null, null, null, null, AQ.w);
                c2109lo0A.s = EnumC3203x3.a0;
            } else {
                c2109lo0A = null;
            }
            C2109lo0 c2109lo2 = c2109lo0.n.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo2 != null) {
                c2109lo0A2 = C2109lo0.a(c2109lo2, null, null, null, null, null, null, AQ.w);
                c2109lo0A2.s = EnumC3203x3.c0;
            } else {
                c2109lo0A2 = null;
            }
            C2109lo0 c2109lo3 = c2109lo0.f900o.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo3 != null) {
                c2109lo0A3 = C2109lo0.a(c2109lo3, null, null, null, null, null, null, AQ.w);
                c2109lo0A3.s = EnumC3203x3.e0;
            }
            tvShowMobileFragment.p0.m(X5.P(new C2109lo0[]{c2109lo0, c2109lo0A, c2109lo0A2, c2109lo0A3}));
            C1930jx c1930jx3 = tvShowMobileFragment.l0;
            AbstractC1474fG.g(c1930jx3);
            ((ConstraintLayout) c1930jx3.n.m).setVisibility(8);
        } else if (qo0 instanceof No0) {
            Context contextQ2 = tvShowMobileFragment.Q();
            String message = ((No0) qo0).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ2, message, 0).show();
            C1930jx c1930jx4 = tvShowMobileFragment.l0;
            AbstractC1474fG.g(c1930jx4);
            C1583gR c1583gR2 = c1930jx4.n;
            ((ProgressBar) c1583gR2.p).setVisibility(8);
            ((Group) c1583gR2.f793o).setVisibility(0);
            ((TextView) c1583gR2.n).setOnClickListener(new ViewOnClickListenerC3251xe(27, tvShowMobileFragment));
        }
        return C2985uq0.a;
    }

    private final Object q(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2109lo0 c2109lo0A;
        C2109lo0 c2109lo0A2;
        Qo0 qo0 = (Qo0) obj;
        boolean zB = AbstractC1474fG.b(qo0, Oo0.a);
        TvShowTvFragment tvShowTvFragment = (TvShowTvFragment) this.m;
        if (zB) {
            C2028kx c2028kx = tvShowTvFragment.l0;
            AbstractC1474fG.g(c2028kx);
            C2303no0 c2303no0 = c2028kx.n;
            ((ConstraintLayout) c2303no0.m).setVisibility(0);
            ((ProgressBar) c2303no0.p).setVisibility(0);
            ((Group) c2303no0.f941o).setVisibility(8);
        } else if (qo0 instanceof Po0) {
            C2109lo0 c2109lo0 = ((Po0) qo0).a;
            Context contextQ = tvShowTvFragment.Q();
            C2630r70 c2630r70N = com.bumptech.glide.a.b(contextQ).b(contextQ).n(c2109lo0.i);
            C2028kx c2028kx2 = tvShowTvFragment.l0;
            AbstractC1474fG.g(c2028kx2);
            c2630r70N.H(c2028kx2.f882o);
            c2109lo0.s = EnumC3203x3.Z;
            C2109lo0 c2109lo0A3 = null;
            C2109lo0 c2109lo1 = c2109lo0.k.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo1 != null) {
                c2109lo0A = C2109lo0.a(c2109lo1, null, null, null, null, null, null, AQ.w);
                c2109lo0A.s = EnumC3203x3.b0;
            } else {
                c2109lo0A = null;
            }
            C2109lo0 c2109lo2 = c2109lo0.n.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo2 != null) {
                c2109lo0A2 = C2109lo0.a(c2109lo2, null, null, null, null, null, null, AQ.w);
                c2109lo0A2.s = EnumC3203x3.d0;
            } else {
                c2109lo0A2 = null;
            }
            C2109lo0 c2109lo3 = c2109lo0.f900o.isEmpty() ^ true ? c2109lo0 : null;
            if (c2109lo3 != null) {
                c2109lo0A3 = C2109lo0.a(c2109lo3, null, null, null, null, null, null, AQ.w);
                c2109lo0A3.s = EnumC3203x3.f0;
            }
            tvShowTvFragment.p0.m(X5.P(new C2109lo0[]{c2109lo0, c2109lo0A, c2109lo0A2, c2109lo0A3}));
            C2028kx c2028kx3 = tvShowTvFragment.l0;
            AbstractC1474fG.g(c2028kx3);
            ((ConstraintLayout) c2028kx3.n.m).setVisibility(8);
        } else if (qo0 instanceof No0) {
            Context contextQ2 = tvShowTvFragment.Q();
            String message = ((No0) qo0).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ2, message, 0).show();
            C2028kx c2028kx4 = tvShowTvFragment.l0;
            AbstractC1474fG.g(c2028kx4);
            C2303no0 c2303no1 = c2028kx4.n;
            ((ProgressBar) c2303no1.p).setVisibility(8);
            ((Group) c2303no1.f941o).setVisibility(0);
            ViewOnClickListenerC3251xe viewOnClickListenerC3251xe = new ViewOnClickListenerC3251xe(28, tvShowTvFragment);
            TextView textView = (TextView) c2303no1.n;
            textView.setOnClickListener(viewOnClickListenerC3251xe);
            textView.requestFocus();
        }
        return C2985uq0.a;
    }

    private final Object r(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC1818ip0 abstractC1818ip0 = (AbstractC1818ip0) obj;
        boolean zB = AbstractC1474fG.b(abstractC1818ip0, C1525fp0.a);
        TvShowsMobileFragment tvShowsMobileFragment = (TvShowsMobileFragment) this.m;
        if (zB) {
            C0333Bx c0333Bx = tvShowsMobileFragment.l0;
            AbstractC1474fG.g(c0333Bx);
            C1583gR c1583gR = c0333Bx.n;
            ((ConstraintLayout) c1583gR.m).setVisibility(0);
            ((ProgressBar) c1583gR.p).setVisibility(0);
            ((Group) c1583gR.f793o).setVisibility(8);
        } else if (AbstractC1474fG.b(abstractC1818ip0, C1623gp0.a)) {
            tvShowsMobileFragment.o0.f = true;
        } else if (abstractC1818ip0 instanceof C1721hp0) {
            C1721hp0 c1721hp0 = (C1721hp0) abstractC1818ip0;
            List<C2109lo0> list = c1721hp0.a;
            tvShowsMobileFragment.getClass();
            for (C2109lo0 c2109lo0 : list) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.V;
                c2109lo0.getClass();
                c2109lo0.s = enumC3203x3;
            }
            C3300y3 c3300y3 = tvShowsMobileFragment.o0;
            c3300y3.m(list);
            if (c1721hp0.b) {
                c3300y3.l(new Xo0(tvShowsMobileFragment, 1));
            } else {
                c3300y3.l(null);
            }
            c3300y3.f = false;
            C0333Bx c0333Bx2 = tvShowsMobileFragment.l0;
            AbstractC1474fG.g(c0333Bx2);
            ((ConstraintLayout) c0333Bx2.n.m).setVisibility(8);
        } else if (abstractC1818ip0 instanceof C1427ep0) {
            Context contextQ = tvShowsMobileFragment.Q();
            String message = ((C1427ep0) abstractC1818ip0).a.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(contextQ, message, 0).show();
            C3300y3 c3300y4 = tvShowsMobileFragment.o0;
            if (c3300y4.f) {
                c3300y4.f = false;
            } else {
                C0333Bx c0333Bx3 = tvShowsMobileFragment.l0;
                AbstractC1474fG.g(c0333Bx3);
                C1583gR c1583gR2 = c0333Bx3.n;
                ((ProgressBar) c1583gR2.p).setVisibility(8);
                ((Group) c1583gR2.f793o).setVisibility(0);
                ((TextView) c1583gR2.n).setOnClickListener(new ViewOnClickListenerC3251xe(29, tvShowsMobileFragment));
            }
        }
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x04db  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:208:0x0502  */
    /* JADX WARN: Code duplicated, block: B:214:0x0517  */
    /* JADX WARN: Code duplicated, block: B:215:0x051a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0539  */
    /* JADX WARN: Code duplicated, block: B:226:0x054e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0566  */
    /* JADX WARN: Code duplicated, block: B:238:0x0592  */
    /* JADX WARN: Code duplicated, block: B:244:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:248:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:258:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:264:0x0604  */
    /* JADX WARN: Code duplicated, block: B:268:0x0617  */
    /* JADX WARN: Code duplicated, block: B:274:0x0635  */
    /* JADX WARN: Code duplicated, block: B:276:0x064a  */
    /* JADX WARN: Code duplicated, block: B:279:0x0656  */
    /* JADX WARN: Code duplicated, block: B:283:0x066a  */
    /* JADX WARN: Code duplicated, block: B:286:0x067e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0684  */
    /* JADX WARN: Code duplicated, block: B:292:0x0692  */
    /* JADX WARN: Code duplicated, block: B:293:0x0695  */
    /* JADX WARN: Code duplicated, block: B:303:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:304:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0790  */
    /* JADX WARN: Code duplicated, block: B:331:0x079c  */
    /* JADX WARN: Code duplicated, block: B:340:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:346:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:349:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:358:0x0821  */
    /* JADX WARN: Code duplicated, block: B:364:0x0838  */
    /* JADX WARN: Code duplicated, block: B:368:0x084e  */
    /* JADX WARN: Code duplicated, block: B:374:0x0865  */
    /* JADX WARN: Code duplicated, block: B:378:0x087b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0893  */
    /* JADX WARN: Code duplicated, block: B:388:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:394:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:396:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:401:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:405:0x0901  */
    /* JADX WARN: Code duplicated, block: B:409:0x090e  */
    /* JADX WARN: Code duplicated, block: B:412:0x0919  */
    /* JADX WARN: Code duplicated, block: B:415:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x0933 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x0939  */
    /* JADX WARN: Code duplicated, block: B:421:0x093c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0962 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:432:0x0979  */
    /* JADX WARN: Code duplicated, block: B:433:0x097c  */
    /* JADX WARN: Code duplicated, block: B:522:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0549 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[LOOP:8: B:256:0x05e6->B:548:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x06ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0660 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x06b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x07b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x07a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x07b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x080d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x07ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0860 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x088c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[LOOP:18: B:376:0x0875->B:598:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x08a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0946 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x08f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0954 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x094a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0958 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x08e7 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v30 java.lang.Object, still in use, count: 2, list:
          (r7v30 java.lang.Object) from 0x078c: PHI (r7 I:??) = (r7v2 java.lang.Object), (r7v30 java.lang.Object) binds: [B:325:0x078b, B:569:0x078c] A[DONT_GENERATE, DONT_INLINE]
          (r7v30 java.lang.Object) from 0x0780: CHECK_CAST (o.Xb) (r7v30 java.lang.Object)
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
    @Override // o.InterfaceC1734hw
    public final java.lang.Object l(java.lang.Object r19, o.InterfaceC0473Hh r20) {
        /*
            Method dump skipped, instruction units count: 3088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1632gu.l(java.lang.Object, o.Hh):java.lang.Object");
    }
}
