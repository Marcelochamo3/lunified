package o;

import android.widget.TextView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.favorites.FavoritesMobileFragment;
import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;
import com.skidush.clonex.fragments.history.HistoryMobileFragment;
import com.skidush.clonex.fragments.history.HistoryTvFragment;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.Pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0692Pt implements InterfaceC1734hw, InterfaceC0957Zy {
    public final /* synthetic */ int l;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx m;

    public /* synthetic */ C0692Pt(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.l = i;
        this.m = abstractComponentCallbacksC1247cx;
    }

    @Override // o.InterfaceC0957Zy
    public final InterfaceC0801Ty a() {
        switch (this.l) {
            case 0:
                return new W1((FavoritesMobileFragment) this.m, FavoritesMobileFragment.class, "render(Lcom/skidush/clonex/fragments/favorites/FavoritesViewModel$State;)V");
            case 1:
                return new W1((FavoritesTvFragment) this.m, FavoritesTvFragment.class, "render(Lcom/skidush/clonex/fragments/favorites/FavoritesViewModel$State;)V");
            case 2:
                return new W1((HistoryMobileFragment) this.m, HistoryMobileFragment.class, "render(Lcom/skidush/clonex/fragments/history/HistoryViewModel$State;)V");
            default:
                return new W1((HistoryTvFragment) this.m, HistoryTvFragment.class, "render(Lcom/skidush/clonex/fragments/history/HistoryViewModel$State;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.l) {
            case 0:
                if ((obj instanceof InterfaceC1734hw) && (obj instanceof InterfaceC0957Zy)) {
                    return AbstractC1474fG.b(a(), ((InterfaceC0957Zy) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC1734hw) && (obj instanceof InterfaceC0957Zy)) {
                    return AbstractC1474fG.b(a(), ((InterfaceC0957Zy) obj).a());
                }
                return false;
            case 2:
                if ((obj instanceof InterfaceC1734hw) && (obj instanceof InterfaceC0957Zy)) {
                    return AbstractC1474fG.b(a(), ((InterfaceC0957Zy) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC1734hw) && (obj instanceof InterfaceC0957Zy)) {
                    return AbstractC1474fG.b(a(), ((InterfaceC0957Zy) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return a().hashCode();
    }

    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        switch (this.l) {
            case 0:
                InterfaceC1436eu interfaceC1436eu = (InterfaceC1436eu) obj;
                FavoritesMobileFragment favoritesMobileFragment = (FavoritesMobileFragment) this.m;
                favoritesMobileFragment.getClass();
                boolean zB = AbstractC1474fG.b(interfaceC1436eu, C1241cu.a);
                C3300y3 c3300y3 = favoritesMobileFragment.m0;
                if (zB) {
                    c3300y3.m(C1233cq.l);
                    C1736hx c1736hx = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx);
                    c1736hx.n.setVisibility(0);
                    C1736hx c1736hx2 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx2);
                    c1736hx2.p.setVisibility(8);
                    C1736hx c1736hx3 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx3);
                    c1736hx3.f821o.setVisibility(8);
                } else if (interfaceC1436eu instanceof C1338du) {
                    C1736hx c1736hx4 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx4);
                    c1736hx4.n.setVisibility(8);
                    C1338du c1338du = (C1338du) interfaceC1436eu;
                    C3421zK c3421zK = new C3421zK();
                    String strN = favoritesMobileFragment.n(R.string.favorites_channels);
                    AbstractC1474fG.i(strN, "getString(...)");
                    List<C1387eR> list = c1338du.a;
                    for (C1387eR c1387eR : list) {
                        EnumC3203x3 enumC3203x3 = EnumC3203x3.R;
                        c1387eR.getClass();
                        c1387eR.u = enumC3203x3;
                    }
                    FavoritesMobileFragment.W(c3421zK, strN, "favorites_channels_mobile", list);
                    String strN2 = favoritesMobileFragment.n(R.string.favorites_movies);
                    AbstractC1474fG.i(strN2, "getString(...)");
                    List<C1387eR> list2 = c1338du.b;
                    for (C1387eR c1387eR2 : list2) {
                        EnumC3203x3 enumC3203x4 = EnumC3203x3.w;
                        c1387eR2.getClass();
                        c1387eR2.u = enumC3203x4;
                    }
                    FavoritesMobileFragment.W(c3421zK, strN2, "favorites_movies_mobile", list2);
                    String strN3 = favoritesMobileFragment.n(R.string.favorites_series);
                    AbstractC1474fG.i(strN3, "getString(...)");
                    List<C2109lo0> list3 = c1338du.c;
                    for (C2109lo0 c2109lo0 : list3) {
                        EnumC3203x3 enumC3203x5 = EnumC3203x3.T;
                        c2109lo0.getClass();
                        c2109lo0.s = enumC3203x5;
                    }
                    FavoritesMobileFragment.W(c3421zK, strN3, "favorites_series_mobile", list3);
                    C3421zK c3421zKH = AbstractC2506pt.h(c3421zK);
                    ListIterator listIterator = c3421zKH.listIterator(0);
                    while (true) {
                        C3324yK c3324yK = (C3324yK) listIterator;
                        if (c3324yK.hasNext()) {
                            C0882Xb c0882Xb = (C0882Xb) c3324yK.next();
                            c0882Xb.d = AbstractC0397Ej.k(favoritesMobileFragment.Q(), 10);
                            c0882Xb.h = EnumC3203x3.l;
                        } else {
                            boolean zIsEmpty = c3421zKH.isEmpty();
                            C1736hx c1736hx5 = favoritesMobileFragment.l0;
                            AbstractC1474fG.g(c1736hx5);
                            String strN4 = favoritesMobileFragment.n(R.string.favorites_empty);
                            TextView textView = c1736hx5.p;
                            textView.setText(strN4);
                            textView.setVisibility(zIsEmpty ? 0 : 8);
                            C1736hx c1736hx6 = favoritesMobileFragment.l0;
                            AbstractC1474fG.g(c1736hx6);
                            c1736hx6.f821o.setVisibility(zIsEmpty ? 8 : 0);
                            c3300y3.m(c3421zKH);
                        }
                    }
                } else if (interfaceC1436eu instanceof C1144bu) {
                    C1736hx c1736hx7 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx7);
                    c1736hx7.n.setVisibility(8);
                    C1736hx c1736hx8 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx8);
                    c1736hx8.f821o.setVisibility(8);
                    C1736hx c1736hx9 = favoritesMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx9);
                    String strN5 = favoritesMobileFragment.n(R.string.favorites_error);
                    TextView textView2 = c1736hx9.p;
                    textView2.setText(strN5);
                    textView2.setVisibility(0);
                }
                break;
            case 1:
                InterfaceC1436eu interfaceC1436eu2 = (InterfaceC1436eu) obj;
                FavoritesTvFragment favoritesTvFragment = (FavoritesTvFragment) this.m;
                favoritesTvFragment.getClass();
                boolean zB2 = AbstractC1474fG.b(interfaceC1436eu2, C1241cu.a);
                C3300y3 c3300y4 = favoritesTvFragment.m0;
                if (zB2) {
                    c3300y4.m(C1233cq.l);
                    C1832ix c1832ix = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix);
                    c1832ix.n.setVisibility(0);
                    C1832ix c1832ix2 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix2);
                    c1832ix2.f837o.setVisibility(8);
                    C1832ix c1832ix3 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix3);
                    c1832ix3.p.setVisibility(8);
                } else if (interfaceC1436eu2 instanceof C1338du) {
                    C1832ix c1832ix4 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix4);
                    c1832ix4.n.setVisibility(8);
                    C1338du c1338du2 = (C1338du) interfaceC1436eu2;
                    C3421zK c3421zK2 = new C3421zK();
                    String strN6 = favoritesTvFragment.n(R.string.favorites_channels);
                    AbstractC1474fG.i(strN6, "getString(...)");
                    List<C1387eR> list4 = c1338du2.a;
                    for (C1387eR c1387eR3 : list4) {
                        EnumC3203x3 enumC3203x6 = EnumC3203x3.S;
                        c1387eR3.getClass();
                        c1387eR3.u = enumC3203x6;
                    }
                    FavoritesTvFragment.W(c3421zK2, strN6, "favorites_channels_tv", list4);
                    String strN7 = favoritesTvFragment.n(R.string.favorites_movies);
                    AbstractC1474fG.i(strN7, "getString(...)");
                    List<C1387eR> list5 = c1338du2.b;
                    for (C1387eR c1387eR4 : list5) {
                        EnumC3203x3 enumC3203x7 = EnumC3203x3.x;
                        c1387eR4.getClass();
                        c1387eR4.u = enumC3203x7;
                    }
                    FavoritesTvFragment.W(c3421zK2, strN7, "favorites_movies_tv", list5);
                    String strN8 = favoritesTvFragment.n(R.string.favorites_series);
                    AbstractC1474fG.i(strN8, "getString(...)");
                    List<C2109lo0> list6 = c1338du2.c;
                    for (C2109lo0 c2109lo1 : list6) {
                        EnumC3203x3 enumC3203x8 = EnumC3203x3.U;
                        c2109lo1.getClass();
                        c2109lo1.s = enumC3203x8;
                    }
                    FavoritesTvFragment.W(c3421zK2, strN8, "favorites_series_tv", list6);
                    C3421zK c3421zKH2 = AbstractC2506pt.h(c3421zK2);
                    ListIterator listIterator2 = c3421zKH2.listIterator(0);
                    while (true) {
                        C3324yK c3324yK2 = (C3324yK) listIterator2;
                        if (c3324yK2.hasNext()) {
                            C0882Xb c0882Xb2 = (C0882Xb) c3324yK2.next();
                            c0882Xb2.d = (int) favoritesTvFragment.m().getDimension(R.dimen.home_spacing);
                            c0882Xb2.h = EnumC3203x3.m;
                        } else {
                            boolean zIsEmpty2 = c3421zKH2.isEmpty();
                            C1832ix c1832ix5 = favoritesTvFragment.l0;
                            AbstractC1474fG.g(c1832ix5);
                            String strN9 = favoritesTvFragment.n(R.string.favorites_empty);
                            TextView textView3 = c1832ix5.f837o;
                            textView3.setText(strN9);
                            textView3.setVisibility(zIsEmpty2 ? 0 : 8);
                            C1832ix c1832ix6 = favoritesTvFragment.l0;
                            AbstractC1474fG.g(c1832ix6);
                            c1832ix6.p.setVisibility(zIsEmpty2 ? 8 : 0);
                            c3300y4.m(c3421zKH2);
                            if (!zIsEmpty2) {
                                C1832ix c1832ix7 = favoritesTvFragment.l0;
                                AbstractC1474fG.g(c1832ix7);
                                c1832ix7.p.requestFocus();
                            }
                        }
                    }
                } else if (interfaceC1436eu2 instanceof C1144bu) {
                    C1832ix c1832ix8 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix8);
                    c1832ix8.n.setVisibility(8);
                    C1832ix c1832ix9 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix9);
                    c1832ix9.p.setVisibility(8);
                    C1832ix c1832ix10 = favoritesTvFragment.l0;
                    AbstractC1474fG.g(c1832ix10);
                    String strN10 = favoritesTvFragment.n(R.string.favorites_error);
                    TextView textView4 = c1832ix10.f837o;
                    textView4.setText(strN10);
                    textView4.setVisibility(0);
                }
                break;
            case 2:
                EB eb = (EB) obj;
                HistoryMobileFragment historyMobileFragment = (HistoryMobileFragment) this.m;
                historyMobileFragment.getClass();
                boolean zB3 = AbstractC1474fG.b(eb, CB.a);
                C3300y3 c3300y5 = historyMobileFragment.m0;
                if (zB3) {
                    c3300y5.m(C1233cq.l);
                    C1736hx c1736hx10 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx10);
                    c1736hx10.n.setVisibility(0);
                    C1736hx c1736hx11 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx11);
                    c1736hx11.p.setVisibility(8);
                    C1736hx c1736hx12 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx12);
                    c1736hx12.f821o.setVisibility(8);
                } else if (eb instanceof DB) {
                    C1736hx c1736hx13 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx13);
                    c1736hx13.n.setVisibility(8);
                    DB db = (DB) eb;
                    C3421zK c3421zK3 = new C3421zK();
                    if (!db.a.isEmpty()) {
                        List<C1387eR> list7 = db.a;
                        for (C1387eR c1387eR5 : list7) {
                            EnumC3203x3 enumC3203x9 = EnumC3203x3.y;
                            c1387eR5.getClass();
                            c1387eR5.u = enumC3203x9;
                        }
                        String strN11 = historyMobileFragment.n(R.string.history_movies);
                        AbstractC1474fG.i(strN11, "getString(...)");
                        C0882Xb c0882Xb3 = new C0882Xb(strN11, list7);
                        c0882Xb3.g = "history_movies_mobile";
                        c3421zK3.add(c0882Xb3);
                    }
                    List<C0456Gq> list8 = db.b;
                    if (!list8.isEmpty()) {
                        for (C0456Gq c0456Gq : list8) {
                            EnumC3203x3 enumC3203x10 = EnumC3203x3.r;
                            c0456Gq.getClass();
                            c0456Gq.l = enumC3203x10;
                        }
                        String strN12 = historyMobileFragment.n(R.string.history_series);
                        AbstractC1474fG.i(strN12, "getString(...)");
                        C0882Xb c0882Xb4 = new C0882Xb(strN12, list8);
                        c0882Xb4.g = "history_series_mobile";
                        c3421zK3.add(c0882Xb4);
                    }
                    C3421zK c3421zKH3 = AbstractC2506pt.h(c3421zK3);
                    ListIterator listIterator3 = c3421zKH3.listIterator(0);
                    while (true) {
                        C3324yK c3324yK3 = (C3324yK) listIterator3;
                        if (c3324yK3.hasNext()) {
                            C0882Xb c0882Xb5 = (C0882Xb) c3324yK3.next();
                            c0882Xb5.d = AbstractC0397Ej.k(historyMobileFragment.Q(), 10);
                            c0882Xb5.h = EnumC3203x3.l;
                        } else {
                            boolean zIsEmpty3 = c3421zKH3.isEmpty();
                            C1736hx c1736hx14 = historyMobileFragment.l0;
                            AbstractC1474fG.g(c1736hx14);
                            String strN13 = historyMobileFragment.n(R.string.history_empty);
                            TextView textView5 = c1736hx14.p;
                            textView5.setText(strN13);
                            textView5.setVisibility(zIsEmpty3 ? 0 : 8);
                            C1736hx c1736hx15 = historyMobileFragment.l0;
                            AbstractC1474fG.g(c1736hx15);
                            c1736hx15.f821o.setVisibility(zIsEmpty3 ? 8 : 0);
                            c3300y5.m(c3421zKH3);
                        }
                    }
                } else if (eb instanceof BB) {
                    C1736hx c1736hx16 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx16);
                    c1736hx16.n.setVisibility(8);
                    C1736hx c1736hx17 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx17);
                    c1736hx17.f821o.setVisibility(8);
                    C1736hx c1736hx18 = historyMobileFragment.l0;
                    AbstractC1474fG.g(c1736hx18);
                    String strN14 = historyMobileFragment.n(R.string.history_error);
                    TextView textView6 = c1736hx18.p;
                    textView6.setText(strN14);
                    textView6.setVisibility(0);
                }
                break;
            default:
                EB eb2 = (EB) obj;
                HistoryTvFragment historyTvFragment = (HistoryTvFragment) this.m;
                historyTvFragment.getClass();
                boolean zB4 = AbstractC1474fG.b(eb2, CB.a);
                C3300y3 c3300y6 = historyTvFragment.m0;
                if (zB4) {
                    c3300y6.m(C1233cq.l);
                    C1832ix c1832ix11 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix11);
                    c1832ix11.n.setVisibility(0);
                    C1832ix c1832ix12 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix12);
                    c1832ix12.f837o.setVisibility(8);
                    C1832ix c1832ix13 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix13);
                    c1832ix13.p.setVisibility(8);
                } else if (eb2 instanceof DB) {
                    C1832ix c1832ix14 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix14);
                    c1832ix14.n.setVisibility(8);
                    DB db2 = (DB) eb2;
                    C3421zK c3421zK4 = new C3421zK();
                    if (!db2.a.isEmpty()) {
                        List<C1387eR> list9 = db2.a;
                        for (C1387eR c1387eR6 : list9) {
                            EnumC3203x3 enumC3203x11 = EnumC3203x3.z;
                            c1387eR6.getClass();
                            c1387eR6.u = enumC3203x11;
                        }
                        String strN15 = historyTvFragment.n(R.string.history_movies);
                        AbstractC1474fG.i(strN15, "getString(...)");
                        C0882Xb c0882Xb6 = new C0882Xb(strN15, list9);
                        c0882Xb6.g = "history_movies";
                        c3421zK4.add(c0882Xb6);
                    }
                    List<C0456Gq> list10 = db2.b;
                    if (!list10.isEmpty()) {
                        for (C0456Gq c0456Gq2 : list10) {
                            EnumC3203x3 enumC3203x12 = EnumC3203x3.s;
                            c0456Gq2.getClass();
                            c0456Gq2.l = enumC3203x12;
                        }
                        String strN16 = historyTvFragment.n(R.string.history_series);
                        AbstractC1474fG.i(strN16, "getString(...)");
                        C0882Xb c0882Xb7 = new C0882Xb(strN16, list10);
                        c0882Xb7.g = "history_series";
                        c3421zK4.add(c0882Xb7);
                    }
                    C3421zK c3421zKH4 = AbstractC2506pt.h(c3421zK4);
                    ListIterator listIterator4 = c3421zKH4.listIterator(0);
                    while (true) {
                        C3324yK c3324yK4 = (C3324yK) listIterator4;
                        if (c3324yK4.hasNext()) {
                            C0882Xb c0882Xb8 = (C0882Xb) c3324yK4.next();
                            c0882Xb8.d = (int) historyTvFragment.m().getDimension(R.dimen.home_spacing);
                            c0882Xb8.h = EnumC3203x3.m;
                        } else {
                            boolean zIsEmpty4 = c3421zKH4.isEmpty();
                            C1832ix c1832ix15 = historyTvFragment.l0;
                            AbstractC1474fG.g(c1832ix15);
                            String strN17 = historyTvFragment.n(R.string.history_empty);
                            TextView textView7 = c1832ix15.f837o;
                            textView7.setText(strN17);
                            textView7.setVisibility(zIsEmpty4 ? 0 : 8);
                            C1832ix c1832ix16 = historyTvFragment.l0;
                            AbstractC1474fG.g(c1832ix16);
                            c1832ix16.p.setVisibility(zIsEmpty4 ? 8 : 0);
                            c3300y6.m(c3421zKH4);
                            if (!zIsEmpty4) {
                                C1832ix c1832ix17 = historyTvFragment.l0;
                                AbstractC1474fG.g(c1832ix17);
                                c1832ix17.p.requestFocus();
                            }
                        }
                    }
                } else if (eb2 instanceof BB) {
                    C1832ix c1832ix18 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix18);
                    c1832ix18.n.setVisibility(8);
                    C1832ix c1832ix19 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix19);
                    c1832ix19.p.setVisibility(8);
                    C1832ix c1832ix20 = historyTvFragment.l0;
                    AbstractC1474fG.g(c1832ix20);
                    String strN18 = historyTvFragment.n(R.string.history_error);
                    TextView textView8 = c1832ix20.f837o;
                    textView8.setText(strN18);
                    textView8.setVisibility(0);
                }
                break;
        }
        return C2985uq0.a;
    }
}
