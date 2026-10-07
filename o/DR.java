package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.favorites.FavoritesMobileFragment;
import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;
import com.skidush.clonex.fragments.genre.GenreMobileFragment;
import com.skidush.clonex.fragments.genre.GenreTvFragment;
import com.skidush.clonex.fragments.history.HistoryMobileFragment;
import com.skidush.clonex.fragments.history.HistoryTvFragment;
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import com.skidush.clonex.fragments.home.MoviesHomeMobileFragment;
import com.skidush.clonex.fragments.home.MoviesHomeTvFragment;
import com.skidush.clonex.fragments.movie.MovieMobileFragment;
import com.skidush.clonex.fragments.movie.MovieTvFragment;
import com.skidush.clonex.fragments.movies.MoviesMobileFragment;
import com.skidush.clonex.fragments.movies.MoviesTvFragment;
import com.skidush.clonex.fragments.people.PeopleMobileFragment;
import com.skidush.clonex.fragments.people.PeopleTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import j$.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DR extends AbstractC2144m60 {
    public final InterfaceC2604qt0 u;
    public final Context v;
    public C1387eR w;

    /* JADX WARN: Illegal instructions before constructor call */
    public DR(InterfaceC2604qt0 interfaceC2604qt0) {
        View viewB = interfaceC2604qt0.b();
        super(viewB);
        this.u = interfaceC2604qt0;
        this.v = viewB.getContext();
    }

    public final void u(C1387eR c1387eR) {
        String string;
        String string2;
        String str;
        final int i = 5;
        final int i2 = 4;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        this.w = c1387eR;
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        boolean z = interfaceC2604qt0 instanceof GG;
        C0789Tm c0789Tm = C0789Tm.b;
        Context context = this.v;
        if (z) {
            GG gg = (GG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout = gg.l;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM;
                    UT hc;
                    UT bc;
                    String strM2;
                    UT cc;
                    String strM3;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    switch (i2) {
                        case 0:
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout2.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR2 = dr.w;
                            if (c1387eR2 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR2.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR3 = dr.w;
                                    if (c1387eR3 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str2 = c1387eR3.a;
                                    AbstractC1474fG.j(str2, "id");
                                    gc = new C2953ua0(str2);
                                } else {
                                    C1387eR c1387eR4 = dr.w;
                                    if (c1387eR4 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str3 = c1387eR4.a;
                                    AbstractC1474fG.j(str3, "id");
                                    gc = new GC(str3);
                                }
                                AbstractC0397Ej.z(constraintLayout2, gc);
                                return;
                            }
                            C1387eR c1387eR5 = dr.w;
                            if (c1387eR5 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str4 = c1387eR5.a;
                            String str5 = c1387eR5.b;
                            Calendar calendar = c1387eR5.f754o;
                            if (calendar == null || (strM = AbstractC0397Ej.m(calendar, "yyyy-MM-dd")) == null) {
                                strM = "";
                            }
                            C1387eR c1387eR6 = dr.w;
                            if (c1387eR6 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str6 = c1387eR6.h;
                            if (str6 == null) {
                                str6 = "";
                            }
                            Is0 is0 = new Is0(str4, str5, strM, str6);
                            if (z2) {
                                C1387eR c1387eR7 = dr.w;
                                if (c1387eR7 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str7 = c1387eR7.a;
                                String str8 = c1387eR7.b;
                                AbstractC1474fG.j(str7, "id");
                                AbstractC1474fG.j(str8, "title");
                                hc = new C3050va0(str7, str8, "", is0);
                            } else {
                                C1387eR c1387eR8 = dr.w;
                                if (c1387eR8 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str9 = c1387eR8.a;
                                String str10 = c1387eR8.b;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC1474fG.j(str10, "title");
                                hc = new HC(str9, str10, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout2, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout3 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout3.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR9 = dr2.w;
                            if (c1387eR9 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR9.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR10 = dr2.w;
                                    if (c1387eR10 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str11 = c1387eR10.a;
                                    AbstractC1474fG.j(str11, "id");
                                    bc = new C2081la0(str11);
                                } else {
                                    C1387eR c1387eR11 = dr2.w;
                                    if (c1387eR11 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str12 = c1387eR11.a;
                                    AbstractC1474fG.j(str12, "id");
                                    bc = new BC(str12);
                                }
                                AbstractC0397Ej.z(constraintLayout3, bc);
                                return;
                            }
                            C1387eR c1387eR12 = dr2.w;
                            if (c1387eR12 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str13 = c1387eR12.a;
                            String str14 = c1387eR12.b;
                            Calendar calendar2 = c1387eR12.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR13 = dr2.w;
                            if (c1387eR13 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str15 = c1387eR13.h;
                            if (str15 == null) {
                                str15 = "";
                            }
                            Is0 is1 = new Is0(str13, str14, strM2, str15);
                            if (z3) {
                                C1387eR c1387eR14 = dr2.w;
                                if (c1387eR14 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str16 = c1387eR14.a;
                                String str17 = c1387eR14.b;
                                AbstractC1474fG.j(str16, "id");
                                AbstractC1474fG.j(str17, "title");
                                cc = new C2178ma0(str16, str17, "", is1);
                            } else {
                                C1387eR c1387eR15 = dr2.w;
                                if (c1387eR15 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str18 = c1387eR15.a;
                                String str19 = c1387eR15.b;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC1474fG.j(str19, "title");
                                cc = new CC(str18, str19, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout3, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout4 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR16 = dr3.w;
                                if (c1387eR16 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR16.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR17 = dr3.w;
                                if (c1387eR17 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR17.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR18 = dr3.w;
                                if (c1387eR18 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR18.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR19 = dr3.w;
                                if (c1387eR19 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR19.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout5 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR20 = dr4.w;
                                if (c1387eR20 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR20.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR21 = dr4.w;
                                if (c1387eR21 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR21.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR22 = dr4.w;
                                if (c1387eR22 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR22.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR23 = dr4.w;
                                if (c1387eR23 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR23.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout6 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR24 = dr5.w;
                                if (c1387eR24 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR24.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR25 = dr5.w;
                                if (c1387eR25 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR25.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR26 = dr5.w;
                                    if (c1387eR26 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR26.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout6, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR27 = dr5.w;
                                    if (c1387eR27 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR27.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout6, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR28 = dr5.w;
                                    if (c1387eR28 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR28.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout6, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR29 = dr5.w;
                            if (c1387eR29 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR29.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout6, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar3 = c1387eR33.f754o;
                                        if (calendar3 == null || (strM5 = AbstractC0397Ej.m(calendar3, "yyyy")) == null) {
                                            strM5 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar4 = c1387eR34.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy-MM-dd")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM6, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout6, new C2168mR(str34, str35, strM5, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar5 = c1387eR36.f754o;
                            if (calendar5 == null || (strM3 = AbstractC0397Ej.m(calendar5, "yyyy")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar6 = c1387eR37.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy-MM-dd")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM4, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout6, new CC(str39, str40, strM3, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout7 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout7, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar7 = c1387eR49.f754o;
                                        if (calendar7 == null || (strM9 = AbstractC0397Ej.m(calendar7, "yyyy")) == null) {
                                            strM9 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar8 = c1387eR50.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy-MM-dd")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM10, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout7, new C2846tR(str51, str52, strM9, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar9 = c1387eR52.f754o;
                            if (calendar9 == null || (strM7 = AbstractC0397Ej.m(calendar9, "yyyy")) == null) {
                                strM7 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar10 = c1387eR53.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy-MM-dd")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM8, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout7, new HC(str56, str57, strM7, is5));
                            return;
                    }
                }
            });
            constraintLayout.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(constraintLayout, this, i2));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(context);
            C1387eR c1387eR2 = this.w;
            if (c1387eR2 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E.n(c1387eR2.h).g(c0789Tm)).p(300, 450)).c()).H(gg.m);
            C1387eR c1387eR3 = this.w;
            if (c1387eR3 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str2 = c1387eR3.f;
            str = str2 != null ? str2 : "";
            TextView textView = gg.f275o;
            textView.setText(str);
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            gg.p.setText(y());
            C1387eR c1387eR4 = this.w;
            if (c1387eR4 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv0 = c1387eR4.s;
            int i6 = c2123lv0 != null ? (int) ((c2123lv0.b * ((long) 100)) / c2123lv0.c) : 0;
            ProgressBar progressBar = gg.n;
            progressBar.setProgress(i6);
            progressBar.setVisibility(c2123lv0 != null ? 0 : 8);
            C1387eR c1387eR5 = this.w;
            if (c1387eR5 != null) {
                gg.q.setText(c1387eR5.b);
                return;
            } else {
                AbstractC1474fG.U("movie");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof HG) {
            HG hg = (HG) interfaceC2604qt0;
            AbstractC1474fG.i(context, "context");
            AbstractActivityC1540fx abstractActivityC1540fx = context instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context : null;
            if ((abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null) instanceof MoviesHomeTvFragment) {
                ConstraintLayout constraintLayout2 = hg.l;
                AbstractC1474fG.i(constraintLayout2, "getRoot(...)");
                CardView cardView = hg.m;
                AbstractC1474fG.i(cardView, "cvMoviePoster");
                AbstractC0397Ej.y(constraintLayout2, cardView);
            }
            final ConstraintLayout constraintLayout3 = hg.l;
            constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM;
                    UT hc;
                    UT bc;
                    String strM2;
                    UT cc;
                    String strM3;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    switch (i) {
                        case 0:
                            ConstraintLayout constraintLayout4 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR6 = dr.w;
                            if (c1387eR6 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR6.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR7 = dr.w;
                                    if (c1387eR7 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str3 = c1387eR7.a;
                                    AbstractC1474fG.j(str3, "id");
                                    gc = new C2953ua0(str3);
                                } else {
                                    C1387eR c1387eR8 = dr.w;
                                    if (c1387eR8 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str4 = c1387eR8.a;
                                    AbstractC1474fG.j(str4, "id");
                                    gc = new GC(str4);
                                }
                                AbstractC0397Ej.z(constraintLayout4, gc);
                                return;
                            }
                            C1387eR c1387eR9 = dr.w;
                            if (c1387eR9 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str5 = c1387eR9.a;
                            String str6 = c1387eR9.b;
                            Calendar calendar = c1387eR9.f754o;
                            if (calendar == null || (strM = AbstractC0397Ej.m(calendar, "yyyy-MM-dd")) == null) {
                                strM = "";
                            }
                            C1387eR c1387eR10 = dr.w;
                            if (c1387eR10 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str7 = c1387eR10.h;
                            if (str7 == null) {
                                str7 = "";
                            }
                            Is0 is0 = new Is0(str5, str6, strM, str7);
                            if (z2) {
                                C1387eR c1387eR11 = dr.w;
                                if (c1387eR11 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str8 = c1387eR11.a;
                                String str9 = c1387eR11.b;
                                AbstractC1474fG.j(str8, "id");
                                AbstractC1474fG.j(str9, "title");
                                hc = new C3050va0(str8, str9, "", is0);
                            } else {
                                C1387eR c1387eR12 = dr.w;
                                if (c1387eR12 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str10 = c1387eR12.a;
                                String str11 = c1387eR12.b;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC1474fG.j(str11, "title");
                                hc = new HC(str10, str11, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout4, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout5 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR13 = dr2.w;
                            if (c1387eR13 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR13.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR14 = dr2.w;
                                    if (c1387eR14 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str12 = c1387eR14.a;
                                    AbstractC1474fG.j(str12, "id");
                                    bc = new C2081la0(str12);
                                } else {
                                    C1387eR c1387eR15 = dr2.w;
                                    if (c1387eR15 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str13 = c1387eR15.a;
                                    AbstractC1474fG.j(str13, "id");
                                    bc = new BC(str13);
                                }
                                AbstractC0397Ej.z(constraintLayout5, bc);
                                return;
                            }
                            C1387eR c1387eR16 = dr2.w;
                            if (c1387eR16 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str14 = c1387eR16.a;
                            String str15 = c1387eR16.b;
                            Calendar calendar2 = c1387eR16.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR17 = dr2.w;
                            if (c1387eR17 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str16 = c1387eR17.h;
                            if (str16 == null) {
                                str16 = "";
                            }
                            Is0 is1 = new Is0(str14, str15, strM2, str16);
                            if (z3) {
                                C1387eR c1387eR18 = dr2.w;
                                if (c1387eR18 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str17 = c1387eR18.a;
                                String str18 = c1387eR18.b;
                                AbstractC1474fG.j(str17, "id");
                                AbstractC1474fG.j(str18, "title");
                                cc = new C2178ma0(str17, str18, "", is1);
                            } else {
                                C1387eR c1387eR19 = dr2.w;
                                if (c1387eR19 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str19 = c1387eR19.a;
                                String str110 = c1387eR19.b;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC1474fG.j(str110, "title");
                                cc = new CC(str19, str110, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout5, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout6 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR110 = dr3.w;
                                if (c1387eR110 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR110.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR111 = dr3.w;
                                if (c1387eR111 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR111.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR112 = dr3.w;
                                if (c1387eR112 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR112.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR113 = dr3.w;
                                if (c1387eR113 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR113.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout7 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR20 = dr4.w;
                                if (c1387eR20 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR20.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR21 = dr4.w;
                                if (c1387eR21 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR21.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR22 = dr4.w;
                                if (c1387eR22 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR22.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR23 = dr4.w;
                                if (c1387eR23 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR23.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout8 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR24 = dr5.w;
                                if (c1387eR24 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR24.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR25 = dr5.w;
                                if (c1387eR25 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR25.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR26 = dr5.w;
                                    if (c1387eR26 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR26.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout8, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR27 = dr5.w;
                                    if (c1387eR27 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR27.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout8, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR28 = dr5.w;
                                    if (c1387eR28 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR28.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout8, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR29 = dr5.w;
                            if (c1387eR29 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR29.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout8, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar3 = c1387eR33.f754o;
                                        if (calendar3 == null || (strM5 = AbstractC0397Ej.m(calendar3, "yyyy")) == null) {
                                            strM5 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar4 = c1387eR34.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy-MM-dd")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM6, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout8, new C2168mR(str34, str35, strM5, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar5 = c1387eR36.f754o;
                            if (calendar5 == null || (strM3 = AbstractC0397Ej.m(calendar5, "yyyy")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar6 = c1387eR37.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy-MM-dd")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM4, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout8, new CC(str39, str40, strM3, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout9 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar7 = c1387eR49.f754o;
                                        if (calendar7 == null || (strM9 = AbstractC0397Ej.m(calendar7, "yyyy")) == null) {
                                            strM9 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar8 = c1387eR50.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy-MM-dd")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM10, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout9, new C2846tR(str51, str52, strM9, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar9 = c1387eR52.f754o;
                            if (calendar9 == null || (strM7 = AbstractC0397Ej.m(calendar9, "yyyy")) == null) {
                                strM7 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar10 = c1387eR53.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy-MM-dd")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM8, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout9, new HC(str56, str57, strM7, is5));
                            return;
                    }
                }
            });
            constraintLayout3.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(this, constraintLayout3, i));
            constraintLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0637Nq(constraintLayout3, hg, this, i5));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70B = com.bumptech.glide.a.b(context).b(context);
            C1387eR c1387eR6 = this.w;
            if (c1387eR6 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70B.n(c1387eR6.h).g(c0789Tm)).p(300, 450)).j(R.drawable.glide_fallback_cover)).c()).H(hg.n);
            C1387eR c1387eR7 = this.w;
            if (c1387eR7 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv1 = c1387eR7.s;
            int i7 = c2123lv1 != null ? (int) ((c2123lv1.b * ((long) 100)) / c2123lv1.c) : 0;
            ProgressBar progressBar2 = hg.f297o;
            progressBar2.setProgress(i7);
            progressBar2.setVisibility(c2123lv1 != null ? 0 : 8);
            C1387eR c1387eR8 = this.w;
            if (c1387eR8 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str3 = c1387eR8.f;
            str = str3 != null ? str3 : "";
            TextView textView2 = hg.p;
            textView2.setText(str);
            CharSequence text2 = textView2.getText();
            textView2.setVisibility((text2 == null || text2.length() == 0) ? 8 : 0);
            hg.q.setText(y());
            C1387eR c1387eR9 = this.w;
            if (c1387eR9 != null) {
                hg.r.setText(c1387eR9.b);
                return;
            } else {
                AbstractC1474fG.U("movie");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof EG) {
            EG eg = (EG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout4 = eg.l;
            constraintLayout4.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM;
                    UT hc;
                    UT bc;
                    String strM2;
                    UT cc;
                    String strM3;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    switch (i3) {
                        case 0:
                            ConstraintLayout constraintLayout5 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR10 = dr.w;
                            if (c1387eR10 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR10.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR11 = dr.w;
                                    if (c1387eR11 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str4 = c1387eR11.a;
                                    AbstractC1474fG.j(str4, "id");
                                    gc = new C2953ua0(str4);
                                } else {
                                    C1387eR c1387eR12 = dr.w;
                                    if (c1387eR12 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str5 = c1387eR12.a;
                                    AbstractC1474fG.j(str5, "id");
                                    gc = new GC(str5);
                                }
                                AbstractC0397Ej.z(constraintLayout5, gc);
                                return;
                            }
                            C1387eR c1387eR13 = dr.w;
                            if (c1387eR13 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str6 = c1387eR13.a;
                            String str7 = c1387eR13.b;
                            Calendar calendar = c1387eR13.f754o;
                            if (calendar == null || (strM = AbstractC0397Ej.m(calendar, "yyyy-MM-dd")) == null) {
                                strM = "";
                            }
                            C1387eR c1387eR14 = dr.w;
                            if (c1387eR14 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str8 = c1387eR14.h;
                            if (str8 == null) {
                                str8 = "";
                            }
                            Is0 is0 = new Is0(str6, str7, strM, str8);
                            if (z2) {
                                C1387eR c1387eR15 = dr.w;
                                if (c1387eR15 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str9 = c1387eR15.a;
                                String str10 = c1387eR15.b;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC1474fG.j(str10, "title");
                                hc = new C3050va0(str9, str10, "", is0);
                            } else {
                                C1387eR c1387eR16 = dr.w;
                                if (c1387eR16 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str11 = c1387eR16.a;
                                String str12 = c1387eR16.b;
                                AbstractC1474fG.j(str11, "id");
                                AbstractC1474fG.j(str12, "title");
                                hc = new HC(str11, str12, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout5, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout6 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR17 = dr2.w;
                            if (c1387eR17 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR17.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR18 = dr2.w;
                                    if (c1387eR18 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str13 = c1387eR18.a;
                                    AbstractC1474fG.j(str13, "id");
                                    bc = new C2081la0(str13);
                                } else {
                                    C1387eR c1387eR19 = dr2.w;
                                    if (c1387eR19 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str14 = c1387eR19.a;
                                    AbstractC1474fG.j(str14, "id");
                                    bc = new BC(str14);
                                }
                                AbstractC0397Ej.z(constraintLayout6, bc);
                                return;
                            }
                            C1387eR c1387eR110 = dr2.w;
                            if (c1387eR110 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str15 = c1387eR110.a;
                            String str16 = c1387eR110.b;
                            Calendar calendar2 = c1387eR110.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR111 = dr2.w;
                            if (c1387eR111 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str17 = c1387eR111.h;
                            if (str17 == null) {
                                str17 = "";
                            }
                            Is0 is1 = new Is0(str15, str16, strM2, str17);
                            if (z3) {
                                C1387eR c1387eR112 = dr2.w;
                                if (c1387eR112 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str18 = c1387eR112.a;
                                String str19 = c1387eR112.b;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC1474fG.j(str19, "title");
                                cc = new C2178ma0(str18, str19, "", is1);
                            } else {
                                C1387eR c1387eR113 = dr2.w;
                                if (c1387eR113 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str110 = c1387eR113.a;
                                String str111 = c1387eR113.b;
                                AbstractC1474fG.j(str110, "id");
                                AbstractC1474fG.j(str111, "title");
                                cc = new CC(str110, str111, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout6, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout7 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR114 = dr3.w;
                                if (c1387eR114 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR114.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR115 = dr3.w;
                                if (c1387eR115 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR115.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR116 = dr3.w;
                                if (c1387eR116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR116.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR117 = dr3.w;
                                if (c1387eR117 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR117.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout8 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR20 = dr4.w;
                                if (c1387eR20 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR20.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR21 = dr4.w;
                                if (c1387eR21 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR21.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR22 = dr4.w;
                                if (c1387eR22 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR22.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR23 = dr4.w;
                                if (c1387eR23 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR23.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout9 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR24 = dr5.w;
                                if (c1387eR24 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR24.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR25 = dr5.w;
                                if (c1387eR25 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR25.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR26 = dr5.w;
                                    if (c1387eR26 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR26.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR27 = dr5.w;
                                    if (c1387eR27 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR27.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR28 = dr5.w;
                                    if (c1387eR28 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR28.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR29 = dr5.w;
                            if (c1387eR29 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR29.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout9, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar3 = c1387eR33.f754o;
                                        if (calendar3 == null || (strM5 = AbstractC0397Ej.m(calendar3, "yyyy")) == null) {
                                            strM5 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar4 = c1387eR34.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy-MM-dd")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM6, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout9, new C2168mR(str34, str35, strM5, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar5 = c1387eR36.f754o;
                            if (calendar5 == null || (strM3 = AbstractC0397Ej.m(calendar5, "yyyy")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar6 = c1387eR37.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy-MM-dd")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM4, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout9, new CC(str39, str40, strM3, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout10 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout10, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout10.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar7 = c1387eR49.f754o;
                                        if (calendar7 == null || (strM9 = AbstractC0397Ej.m(calendar7, "yyyy")) == null) {
                                            strM9 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar8 = c1387eR50.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy-MM-dd")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM10, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout10, new C2846tR(str51, str52, strM9, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar9 = c1387eR52.f754o;
                            if (calendar9 == null || (strM7 = AbstractC0397Ej.m(calendar9, "yyyy")) == null) {
                                strM7 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar10 = c1387eR53.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy-MM-dd")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM8, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout10, new HC(str56, str57, strM7, is5));
                            return;
                    }
                }
            });
            constraintLayout4.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(this, constraintLayout4, i3));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E2 = com.bumptech.glide.a.e(context);
            C1387eR c1387eR10 = this.w;
            if (c1387eR10 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E2.n(c1387eR10.h).g(c0789Tm)).p(300, 450)).c()).H(eg.m);
            C1387eR c1387eR11 = this.w;
            if (c1387eR11 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str4 = c1387eR11.f;
            str = str4 != null ? str4 : "";
            TextView textView3 = eg.f234o;
            textView3.setText(str);
            CharSequence text3 = textView3.getText();
            textView3.setVisibility((text3 == null || text3.length() == 0) ? 8 : 0);
            eg.p.setText(y());
            C1387eR c1387eR12 = this.w;
            if (c1387eR12 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv2 = c1387eR12.s;
            int i8 = c2123lv2 != null ? (int) ((c2123lv2.b * ((long) 100)) / c2123lv2.c) : 0;
            ProgressBar progressBar3 = eg.n;
            progressBar3.setProgress(i8);
            progressBar3.setVisibility(c2123lv2 != null ? 0 : 8);
            C1387eR c1387eR13 = this.w;
            if (c1387eR13 != null) {
                eg.q.setText(c1387eR13.b);
                return;
            } else {
                AbstractC1474fG.U("movie");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof FG) {
            FG fg = (FG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout5 = fg.l;
            constraintLayout5.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM;
                    UT hc;
                    UT bc;
                    String strM2;
                    UT cc;
                    String strM3;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    switch (i4) {
                        case 0:
                            ConstraintLayout constraintLayout6 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR14 = dr.w;
                            if (c1387eR14 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR14.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR15 = dr.w;
                                    if (c1387eR15 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str5 = c1387eR15.a;
                                    AbstractC1474fG.j(str5, "id");
                                    gc = new C2953ua0(str5);
                                } else {
                                    C1387eR c1387eR16 = dr.w;
                                    if (c1387eR16 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str6 = c1387eR16.a;
                                    AbstractC1474fG.j(str6, "id");
                                    gc = new GC(str6);
                                }
                                AbstractC0397Ej.z(constraintLayout6, gc);
                                return;
                            }
                            C1387eR c1387eR17 = dr.w;
                            if (c1387eR17 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str7 = c1387eR17.a;
                            String str8 = c1387eR17.b;
                            Calendar calendar = c1387eR17.f754o;
                            if (calendar == null || (strM = AbstractC0397Ej.m(calendar, "yyyy-MM-dd")) == null) {
                                strM = "";
                            }
                            C1387eR c1387eR18 = dr.w;
                            if (c1387eR18 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str9 = c1387eR18.h;
                            if (str9 == null) {
                                str9 = "";
                            }
                            Is0 is0 = new Is0(str7, str8, strM, str9);
                            if (z2) {
                                C1387eR c1387eR19 = dr.w;
                                if (c1387eR19 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str10 = c1387eR19.a;
                                String str11 = c1387eR19.b;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC1474fG.j(str11, "title");
                                hc = new C3050va0(str10, str11, "", is0);
                            } else {
                                C1387eR c1387eR110 = dr.w;
                                if (c1387eR110 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str12 = c1387eR110.a;
                                String str13 = c1387eR110.b;
                                AbstractC1474fG.j(str12, "id");
                                AbstractC1474fG.j(str13, "title");
                                hc = new HC(str12, str13, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout6, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout7 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR111 = dr2.w;
                            if (c1387eR111 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR111.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR112 = dr2.w;
                                    if (c1387eR112 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str14 = c1387eR112.a;
                                    AbstractC1474fG.j(str14, "id");
                                    bc = new C2081la0(str14);
                                } else {
                                    C1387eR c1387eR113 = dr2.w;
                                    if (c1387eR113 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str15 = c1387eR113.a;
                                    AbstractC1474fG.j(str15, "id");
                                    bc = new BC(str15);
                                }
                                AbstractC0397Ej.z(constraintLayout7, bc);
                                return;
                            }
                            C1387eR c1387eR114 = dr2.w;
                            if (c1387eR114 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str16 = c1387eR114.a;
                            String str17 = c1387eR114.b;
                            Calendar calendar2 = c1387eR114.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR115 = dr2.w;
                            if (c1387eR115 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str18 = c1387eR115.h;
                            if (str18 == null) {
                                str18 = "";
                            }
                            Is0 is1 = new Is0(str16, str17, strM2, str18);
                            if (z3) {
                                C1387eR c1387eR116 = dr2.w;
                                if (c1387eR116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str19 = c1387eR116.a;
                                String str110 = c1387eR116.b;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC1474fG.j(str110, "title");
                                cc = new C2178ma0(str19, str110, "", is1);
                            } else {
                                C1387eR c1387eR117 = dr2.w;
                                if (c1387eR117 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str111 = c1387eR117.a;
                                String str112 = c1387eR117.b;
                                AbstractC1474fG.j(str111, "id");
                                AbstractC1474fG.j(str112, "title");
                                cc = new CC(str111, str112, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout7, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout8 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR118 = dr3.w;
                                if (c1387eR118 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR118.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR119 = dr3.w;
                                if (c1387eR119 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR119.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR1110 = dr3.w;
                                if (c1387eR1110 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR1110.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR1111 = dr3.w;
                                if (c1387eR1111 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR1111.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout9 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR20 = dr4.w;
                                if (c1387eR20 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR20.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR21 = dr4.w;
                                if (c1387eR21 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR21.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR22 = dr4.w;
                                if (c1387eR22 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR22.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR23 = dr4.w;
                                if (c1387eR23 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR23.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout10 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout10, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout10.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR24 = dr5.w;
                                if (c1387eR24 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR24.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR25 = dr5.w;
                                if (c1387eR25 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR25.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR26 = dr5.w;
                                    if (c1387eR26 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR26.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR27 = dr5.w;
                                    if (c1387eR27 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR27.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR28 = dr5.w;
                                    if (c1387eR28 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR28.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR29 = dr5.w;
                            if (c1387eR29 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR29.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout10, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar3 = c1387eR33.f754o;
                                        if (calendar3 == null || (strM5 = AbstractC0397Ej.m(calendar3, "yyyy")) == null) {
                                            strM5 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar4 = c1387eR34.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy-MM-dd")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM6, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout10, new C2168mR(str34, str35, strM5, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar5 = c1387eR36.f754o;
                            if (calendar5 == null || (strM3 = AbstractC0397Ej.m(calendar5, "yyyy")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar6 = c1387eR37.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy-MM-dd")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM4, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout10, new CC(str39, str40, strM3, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout11 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout11, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout11.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar7 = c1387eR49.f754o;
                                        if (calendar7 == null || (strM9 = AbstractC0397Ej.m(calendar7, "yyyy")) == null) {
                                            strM9 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar8 = c1387eR50.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy-MM-dd")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM10, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout11, new C2846tR(str51, str52, strM9, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar9 = c1387eR52.f754o;
                            if (calendar9 == null || (strM7 = AbstractC0397Ej.m(calendar9, "yyyy")) == null) {
                                strM7 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar10 = c1387eR53.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy-MM-dd")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM8, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout11, new HC(str56, str57, strM7, is5));
                            return;
                    }
                }
            });
            constraintLayout5.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(this, constraintLayout5, i4));
            constraintLayout5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout5, i2, fg));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E3 = com.bumptech.glide.a.e(context);
            C1387eR c1387eR14 = this.w;
            if (c1387eR14 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E3.n(c1387eR14.h).L().r(EnumC1651h30.m)).g(c0789Tm)).p(300, 450)).j(R.drawable.glide_fallback_cover)).c()).H(fg.m);
            C1387eR c1387eR15 = this.w;
            if (c1387eR15 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv3 = c1387eR15.s;
            int i9 = c2123lv3 != null ? (int) ((c2123lv3.b * ((long) 100)) / c2123lv3.c) : 0;
            ProgressBar progressBar4 = fg.n;
            progressBar4.setProgress(i9);
            progressBar4.setVisibility(c2123lv3 != null ? 0 : 8);
            C1387eR c1387eR16 = this.w;
            if (c1387eR16 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str5 = c1387eR16.f;
            str = str5 != null ? str5 : "";
            TextView textView4 = fg.f256o;
            textView4.setText(str);
            CharSequence text4 = textView4.getText();
            textView4.setVisibility((text4 == null || text4.length() == 0) ? 8 : 0);
            fg.p.setText(y());
            C1387eR c1387eR17 = this.w;
            if (c1387eR17 != null) {
                fg.q.setText(c1387eR17.b);
                return;
            } else {
                AbstractC1474fG.U("movie");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof C2932uG) {
            C2932uG c2932uG = (C2932uG) interfaceC2604qt0;
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E4 = com.bumptech.glide.a.e(context);
            C1387eR c1387eR18 = this.w;
            if (c1387eR18 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ((C2630r70) componentCallbacks2C3406z70E4.n(c1387eR18.i).c()).H(c2932uG.n);
            C1387eR c1387eR19 = this.w;
            if (c1387eR19 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            c2932uG.u.setText(c1387eR19.b);
            c2932uG.v.setText(context.getString(R.string.movie_item_type));
            C1387eR c1387eR20 = this.w;
            if (c1387eR20 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str6 = c1387eR20.f;
            TextView textView5 = c2932uG.r;
            textView5.setText(str6);
            CharSequence text5 = textView5.getText();
            textView5.setVisibility((text5 == null || text5.length() == 0) ? 8 : 0);
            C1387eR c1387eR21 = this.w;
            if (c1387eR21 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            Calendar calendar = c1387eR21.f754o;
            String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy") : null;
            TextView textView6 = c2932uG.t;
            textView6.setText(strM);
            CharSequence text6 = textView6.getText();
            textView6.setVisibility((text6 == null || text6.length() == 0) ? 8 : 0);
            C1387eR c1387eR22 = this.w;
            if (c1387eR22 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            Double d = c1387eR22.g;
            String str7 = d != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1)) : "N/A";
            TextView textView7 = c2932uG.s;
            textView7.setText(str7);
            CharSequence text7 = textView7.getText();
            textView7.setVisibility((text7 == null || text7.length() == 0) ? 8 : 0);
            c2932uG.f1053o.setVisibility(textView7.getVisibility());
            TextView textView8 = c2932uG.q;
            textView8.setOnClickListener(new AR(textView8, 0));
            C1387eR c1387eR23 = this.w;
            if (c1387eR23 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            textView8.setText(c1387eR23.c);
            final TextView textView9 = c2932uG.m;
            textView9.setOnClickListener(new View.OnClickListener() { // from class: o.vR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String strM2;
                    String strM3;
                    String strM4;
                    String strM5;
                    switch (i4) {
                        case 0:
                            TextView textView10 = textView9;
                            AbstractC1474fG.j(textView10, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            C1387eR c1387eR24 = dr.w;
                            if (c1387eR24 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str8 = c1387eR24.a;
                            String str9 = c1387eR24.b;
                            Calendar calendar2 = c1387eR24.f754o;
                            String str10 = "";
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR25 = dr.w;
                            if (c1387eR25 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str11 = c1387eR25.a;
                            String str12 = c1387eR25.b;
                            Calendar calendar3 = c1387eR25.f754o;
                            if (calendar3 == null || (strM3 = AbstractC0397Ej.m(calendar3, "yyyy-MM-dd")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR26 = dr.w;
                            if (c1387eR26 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str13 = c1387eR26.h;
                            if (str13 == null) {
                                String str14 = c1387eR26.i;
                                if (str14 != null) {
                                    str10 = str14;
                                }
                            } else {
                                str10 = str13;
                            }
                            Is0 is0 = new Is0(str11, str12, strM3, str10);
                            AbstractC1474fG.j(str8, "id");
                            AbstractC1474fG.j(str9, "title");
                            AbstractC0397Ej.z(textView10, new C2846tR(str8, str9, strM2, is0));
                            return;
                        case 1:
                            TextView textView11 = textView9;
                            AbstractC1474fG.j(textView11, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            C1387eR c1387eR27 = dr2.w;
                            if (c1387eR27 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str15 = c1387eR27.a;
                            String str16 = c1387eR27.b;
                            Calendar calendar4 = c1387eR27.f754o;
                            String str17 = "";
                            if (calendar4 == null || (strM4 = AbstractC0397Ej.m(calendar4, "yyyy")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR28 = dr2.w;
                            if (c1387eR28 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str18 = c1387eR28.a;
                            String str19 = c1387eR28.b;
                            Calendar calendar5 = c1387eR28.f754o;
                            if (calendar5 == null || (strM5 = AbstractC0397Ej.m(calendar5, "yyyy-MM-dd")) == null) {
                                strM5 = "";
                            }
                            C1387eR c1387eR29 = dr2.w;
                            if (c1387eR29 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str20 = c1387eR29.h;
                            if (str20 == null) {
                                String str21 = c1387eR29.i;
                                if (str21 != null) {
                                    str17 = str21;
                                }
                            } else {
                                str17 = str20;
                            }
                            Is0 is1 = new Is0(str18, str19, strM5, str17);
                            AbstractC1474fG.j(str15, "id");
                            AbstractC1474fG.j(str16, "title");
                            AbstractC0397Ej.z(textView11, new C2168mR(str15, str16, strM4, is1));
                            return;
                        default:
                            TextView textView12 = textView9;
                            AbstractC1474fG.j(textView12, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            C1387eR c1387eR30 = dr3.w;
                            if (c1387eR30 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str22 = c1387eR30.a;
                            AbstractC1474fG.j(str22, "id");
                            AbstractC0397Ej.z(textView12, new BC(str22));
                            return;
                    }
                }
            });
            C1387eR c1387eR24 = this.w;
            if (c1387eR24 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv4 = c1387eR24.s;
            int i10 = c2123lv4 != null ? (int) ((c2123lv4.b * ((long) 100)) / c2123lv4.c) : 0;
            ProgressBar progressBar5 = c2932uG.p;
            progressBar5.setProgress(i10);
            progressBar5.setVisibility(c2123lv4 != null ? 0 : 8);
            return;
        }
        if (interfaceC2604qt0 instanceof AG) {
            AG ag = (AG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout6 = ag.l;
            constraintLayout6.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM2;
                    UT hc;
                    UT bc;
                    String strM3;
                    UT cc;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    String strM11;
                    switch (i5) {
                        case 0:
                            ConstraintLayout constraintLayout7 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR110 = dr.w;
                            if (c1387eR110 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR110.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR111 = dr.w;
                                    if (c1387eR111 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str8 = c1387eR111.a;
                                    AbstractC1474fG.j(str8, "id");
                                    gc = new C2953ua0(str8);
                                } else {
                                    C1387eR c1387eR112 = dr.w;
                                    if (c1387eR112 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str9 = c1387eR112.a;
                                    AbstractC1474fG.j(str9, "id");
                                    gc = new GC(str9);
                                }
                                AbstractC0397Ej.z(constraintLayout7, gc);
                                return;
                            }
                            C1387eR c1387eR113 = dr.w;
                            if (c1387eR113 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str10 = c1387eR113.a;
                            String str11 = c1387eR113.b;
                            Calendar calendar2 = c1387eR113.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR114 = dr.w;
                            if (c1387eR114 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str12 = c1387eR114.h;
                            if (str12 == null) {
                                str12 = "";
                            }
                            Is0 is0 = new Is0(str10, str11, strM2, str12);
                            if (z2) {
                                C1387eR c1387eR115 = dr.w;
                                if (c1387eR115 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str13 = c1387eR115.a;
                                String str14 = c1387eR115.b;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC1474fG.j(str14, "title");
                                hc = new C3050va0(str13, str14, "", is0);
                            } else {
                                C1387eR c1387eR116 = dr.w;
                                if (c1387eR116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str15 = c1387eR116.a;
                                String str16 = c1387eR116.b;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC1474fG.j(str16, "title");
                                hc = new HC(str15, str16, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout7, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout8 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR117 = dr2.w;
                            if (c1387eR117 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR117.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR118 = dr2.w;
                                    if (c1387eR118 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str17 = c1387eR118.a;
                                    AbstractC1474fG.j(str17, "id");
                                    bc = new C2081la0(str17);
                                } else {
                                    C1387eR c1387eR119 = dr2.w;
                                    if (c1387eR119 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str18 = c1387eR119.a;
                                    AbstractC1474fG.j(str18, "id");
                                    bc = new BC(str18);
                                }
                                AbstractC0397Ej.z(constraintLayout8, bc);
                                return;
                            }
                            C1387eR c1387eR1110 = dr2.w;
                            if (c1387eR1110 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str19 = c1387eR1110.a;
                            String str110 = c1387eR1110.b;
                            Calendar calendar3 = c1387eR1110.f754o;
                            if (calendar3 == null || (strM3 = AbstractC0397Ej.m(calendar3, "yyyy-MM-dd")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR1111 = dr2.w;
                            if (c1387eR1111 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str111 = c1387eR1111.h;
                            if (str111 == null) {
                                str111 = "";
                            }
                            Is0 is1 = new Is0(str19, str110, strM3, str111);
                            if (z3) {
                                C1387eR c1387eR1112 = dr2.w;
                                if (c1387eR1112 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str112 = c1387eR1112.a;
                                String str113 = c1387eR1112.b;
                                AbstractC1474fG.j(str112, "id");
                                AbstractC1474fG.j(str113, "title");
                                cc = new C2178ma0(str112, str113, "", is1);
                            } else {
                                C1387eR c1387eR1113 = dr2.w;
                                if (c1387eR1113 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str114 = c1387eR1113.a;
                                String str115 = c1387eR1113.b;
                                AbstractC1474fG.j(str114, "id");
                                AbstractC1474fG.j(str115, "title");
                                cc = new CC(str114, str115, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout8, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout9 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR1114 = dr3.w;
                                if (c1387eR1114 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR1114.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR1115 = dr3.w;
                                if (c1387eR1115 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR1115.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR1116 = dr3.w;
                                if (c1387eR1116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR1116.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR1117 = dr3.w;
                                if (c1387eR1117 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR1117.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout10 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout10, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout10.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR25 = dr4.w;
                                if (c1387eR25 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR25.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR26 = dr4.w;
                                if (c1387eR26 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR26.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR27 = dr4.w;
                                if (c1387eR27 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR27.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR28 = dr4.w;
                                if (c1387eR28 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR28.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout11 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout11, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout11.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR29 = dr5.w;
                                if (c1387eR29 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR29.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR210 = dr5.w;
                                if (c1387eR210 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR210.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR211 = dr5.w;
                                    if (c1387eR211 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR211.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR212 = dr5.w;
                                    if (c1387eR212 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR212.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR213 = dr5.w;
                                    if (c1387eR213 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR213.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR214 = dr5.w;
                            if (c1387eR214 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR214.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout11, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar4 = c1387eR33.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar5 = c1387eR34.f754o;
                                        if (calendar5 == null || (strM7 = AbstractC0397Ej.m(calendar5, "yyyy-MM-dd")) == null) {
                                            strM7 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM7, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout11, new C2168mR(str34, str35, strM6, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar6 = c1387eR36.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar7 = c1387eR37.f754o;
                            if (calendar7 == null || (strM5 = AbstractC0397Ej.m(calendar7, "yyyy-MM-dd")) == null) {
                                strM5 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM5, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout11, new CC(str39, str40, strM4, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout12 = constraintLayout6;
                            AbstractC1474fG.j(constraintLayout12, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout12.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout12, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar8 = c1387eR49.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar9 = c1387eR50.f754o;
                                        if (calendar9 == null || (strM11 = AbstractC0397Ej.m(calendar9, "yyyy-MM-dd")) == null) {
                                            strM11 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM11, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout12, new C2846tR(str51, str52, strM10, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar10 = c1387eR52.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar11 = c1387eR53.f754o;
                            if (calendar11 == null || (strM9 = AbstractC0397Ej.m(calendar11, "yyyy-MM-dd")) == null) {
                                strM9 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM9, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout12, new HC(str56, str57, strM8, is5));
                            return;
                    }
                }
            });
            constraintLayout6.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(constraintLayout6, this, i5));
            C1387eR c1387eR25 = this.w;
            if (c1387eR25 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            ag.f170o.setVisibility(AbstractC1474fG.b(c1387eR25.n.get("is_live_channel"), Boolean.TRUE) ? 0 : 8);
            ImageView imageView = ag.n;
            AbstractC1474fG.i(imageView, "ivHomeLogo");
            ImageView imageView2 = ag.m;
            AbstractC1474fG.i(imageView2, "ivAwayLogo");
            v(imageView, imageView2, new BR(ag, 0), new BR(ag, 1), new BR(ag, 2), new BR(ag, 3));
            return;
        }
        if (interfaceC2604qt0 instanceof BG) {
            BG bg = (BG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout7 = bg.l;
            final int i11 = 0;
            constraintLayout7.setOnClickListener(new View.OnClickListener() { // from class: o.wR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UT gc;
                    String strM2;
                    UT hc;
                    UT bc;
                    String strM3;
                    UT cc;
                    String strM4;
                    String strM5;
                    String strM6;
                    String strM7;
                    String strM8;
                    String strM9;
                    String strM10;
                    String strM11;
                    switch (i11) {
                        case 0:
                            ConstraintLayout constraintLayout8 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            Context context2 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            boolean z2 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof SearchTvFragment;
                            C1387eR c1387eR110 = dr.w;
                            if (c1387eR110 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR110.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z2) {
                                    C1387eR c1387eR111 = dr.w;
                                    if (c1387eR111 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str8 = c1387eR111.a;
                                    AbstractC1474fG.j(str8, "id");
                                    gc = new C2953ua0(str8);
                                } else {
                                    C1387eR c1387eR112 = dr.w;
                                    if (c1387eR112 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str9 = c1387eR112.a;
                                    AbstractC1474fG.j(str9, "id");
                                    gc = new GC(str9);
                                }
                                AbstractC0397Ej.z(constraintLayout8, gc);
                                return;
                            }
                            C1387eR c1387eR113 = dr.w;
                            if (c1387eR113 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str10 = c1387eR113.a;
                            String str11 = c1387eR113.b;
                            Calendar calendar2 = c1387eR113.f754o;
                            if (calendar2 == null || (strM2 = AbstractC0397Ej.m(calendar2, "yyyy-MM-dd")) == null) {
                                strM2 = "";
                            }
                            C1387eR c1387eR114 = dr.w;
                            if (c1387eR114 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str12 = c1387eR114.h;
                            if (str12 == null) {
                                str12 = "";
                            }
                            Is0 is0 = new Is0(str10, str11, strM2, str12);
                            if (z2) {
                                C1387eR c1387eR115 = dr.w;
                                if (c1387eR115 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str13 = c1387eR115.a;
                                String str14 = c1387eR115.b;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC1474fG.j(str14, "title");
                                hc = new C3050va0(str13, str14, "", is0);
                            } else {
                                C1387eR c1387eR116 = dr.w;
                                if (c1387eR116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str15 = c1387eR116.a;
                                String str16 = c1387eR116.b;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC1474fG.j(str16, "title");
                                hc = new HC(str15, str16, "", is0);
                            }
                            AbstractC0397Ej.z(constraintLayout8, hc);
                            return;
                        case 1:
                            ConstraintLayout constraintLayout9 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            Context context3 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            boolean z3 = (abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null) instanceof SearchMobileFragment;
                            C1387eR c1387eR117 = dr2.w;
                            if (c1387eR117 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR117.n.get("is_tv_channel"), Boolean.TRUE)) {
                                if (z3) {
                                    C1387eR c1387eR118 = dr2.w;
                                    if (c1387eR118 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str17 = c1387eR118.a;
                                    AbstractC1474fG.j(str17, "id");
                                    bc = new C2081la0(str17);
                                } else {
                                    C1387eR c1387eR119 = dr2.w;
                                    if (c1387eR119 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str18 = c1387eR119.a;
                                    AbstractC1474fG.j(str18, "id");
                                    bc = new BC(str18);
                                }
                                AbstractC0397Ej.z(constraintLayout9, bc);
                                return;
                            }
                            C1387eR c1387eR1110 = dr2.w;
                            if (c1387eR1110 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str19 = c1387eR1110.a;
                            String str110 = c1387eR1110.b;
                            Calendar calendar3 = c1387eR1110.f754o;
                            if (calendar3 == null || (strM3 = AbstractC0397Ej.m(calendar3, "yyyy-MM-dd")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR1111 = dr2.w;
                            if (c1387eR1111 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str111 = c1387eR1111.h;
                            if (str111 == null) {
                                str111 = "";
                            }
                            Is0 is1 = new Is0(str19, str110, strM3, str111);
                            if (z3) {
                                C1387eR c1387eR1112 = dr2.w;
                                if (c1387eR1112 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str112 = c1387eR1112.a;
                                String str113 = c1387eR1112.b;
                                AbstractC1474fG.j(str112, "id");
                                AbstractC1474fG.j(str113, "title");
                                cc = new C2178ma0(str112, str113, "", is1);
                            } else {
                                C1387eR c1387eR1113 = dr2.w;
                                if (c1387eR1113 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str114 = c1387eR1113.a;
                                String str115 = c1387eR1113.b;
                                AbstractC1474fG.j(str114, "id");
                                AbstractC1474fG.j(str115, "title");
                                cc = new CC(str114, str115, "", is1);
                            }
                            AbstractC0397Ej.z(constraintLayout9, cc);
                            return;
                        case 2:
                            ConstraintLayout constraintLayout10 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout10, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            Context context4 = constraintLayout10.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof GenreTvFragment) {
                                C1387eR c1387eR1114 = dr3.w;
                                if (c1387eR1114 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str20 = c1387eR1114.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C3292xz(str20));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesTvFragment) {
                                C1387eR c1387eR1115 = dr3.w;
                                if (c1387eR1115 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str21 = c1387eR1115.a;
                                AbstractC1474fG.j(str21, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C1682hS(str21));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof PeopleTvFragment) {
                                C1387eR c1387eR1116 = dr3.w;
                                if (c1387eR1116 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str22 = c1387eR1116.a;
                                AbstractC1474fG.j(str22, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2563qY(str22));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                dr3.z();
                                C1387eR c1387eR1117 = dr3.w;
                                if (c1387eR1117 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str23 = c1387eR1117.a;
                                AbstractC1474fG.j(str23, "id");
                                AbstractC0397Ej.z(constraintLayout10, new C2953ua0(str23));
                                return;
                            }
                            return;
                        case 3:
                            ConstraintLayout constraintLayout11 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout11, "$this_apply");
                            DR dr4 = this;
                            AbstractC1474fG.j(dr4, "this$0");
                            Context context5 = constraintLayout11.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C1387eR c1387eR26 = dr4.w;
                                if (c1387eR26 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str24 = c1387eR26.a;
                                AbstractC1474fG.j(str24, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C2807sz(str24));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof MoviesMobileFragment) {
                                C1387eR c1387eR27 = dr4.w;
                                if (c1387eR27 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str25 = c1387eR27.a;
                                AbstractC1474fG.j(str25, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C1388eS(str25));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C1387eR c1387eR28 = dr4.w;
                                if (c1387eR28 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str26 = c1387eR28.a;
                                AbstractC1474fG.j(str26, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C2078lY(str26));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                dr4.z();
                                C1387eR c1387eR29 = dr4.w;
                                if (c1387eR29 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str27 = c1387eR29.a;
                                AbstractC1474fG.j(str27, "id");
                                AbstractC0397Ej.z(constraintLayout11, new C2081la0(str27));
                                return;
                            }
                            return;
                        case 4:
                            ConstraintLayout constraintLayout12 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout12, "$this_apply");
                            DR dr5 = this;
                            AbstractC1474fG.j(dr5, "this$0");
                            Context context6 = constraintLayout12.getContext();
                            AbstractC1474fG.i(context6, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR210 = dr5.w;
                                if (c1387eR210 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str28 = c1387eR210.a;
                                AbstractC1474fG.j(str28, "id");
                                AbstractC0397Ej.z(constraintLayout12, new C0770St(str28));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HistoryMobileFragment) {
                                dr5.z();
                                C1387eR c1387eR211 = dr5.w;
                                if (c1387eR211 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str29 = c1387eR211.a;
                                AbstractC1474fG.j(str29, "id");
                                AbstractC0397Ej.z(constraintLayout12, new C2927uB(str29));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment)) {
                                if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                    C1387eR c1387eR212 = dr5.w;
                                    if (c1387eR212 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str30 = c1387eR212.a;
                                    AbstractC1474fG.j(str30, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new QR(str30));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                    C1387eR c1387eR213 = dr5.w;
                                    if (c1387eR213 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str31 = c1387eR213.a;
                                    AbstractC1474fG.j(str31, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C1973kR(str31));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                    C1387eR c1387eR214 = dr5.w;
                                    if (c1387eR214 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str32 = c1387eR214.a;
                                    AbstractC1474fG.j(str32, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new C2690ro0(str32));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR215 = dr5.w;
                            if (c1387eR215 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR215.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR30 = dr5.w;
                                if (c1387eR30 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR30.a, "tv-", false)) {
                                    C1387eR c1387eR31 = dr5.w;
                                    if (c1387eR31 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str33 = c1387eR31.a;
                                    AbstractC1474fG.j(str33, "id");
                                    AbstractC0397Ej.z(constraintLayout12, new BC(str33));
                                    C1387eR c1387eR32 = dr5.w;
                                    if (c1387eR32 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR32.c() == EnumC3203x3.y) {
                                        C1387eR c1387eR33 = dr5.w;
                                        if (c1387eR33 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str34 = c1387eR33.a;
                                        String str35 = c1387eR33.b;
                                        Calendar calendar4 = c1387eR33.f754o;
                                        if (calendar4 == null || (strM6 = AbstractC0397Ej.m(calendar4, "yyyy")) == null) {
                                            strM6 = "";
                                        }
                                        C1387eR c1387eR34 = dr5.w;
                                        if (c1387eR34 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str36 = c1387eR34.a;
                                        String str37 = c1387eR34.b;
                                        Calendar calendar5 = c1387eR34.f754o;
                                        if (calendar5 == null || (strM7 = AbstractC0397Ej.m(calendar5, "yyyy-MM-dd")) == null) {
                                            strM7 = "";
                                        }
                                        C1387eR c1387eR35 = dr5.w;
                                        if (c1387eR35 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str38 = c1387eR35.h;
                                        Is0 is2 = new Is0(str36, str37, strM7, str38 != null ? str38 : "");
                                        AbstractC1474fG.j(str34, "id");
                                        AbstractC1474fG.j(str35, "title");
                                        AbstractC0397Ej.z(constraintLayout12, new C2168mR(str34, str35, strM6, is2));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR36 = dr5.w;
                            if (c1387eR36 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str39 = c1387eR36.a;
                            String str40 = c1387eR36.b;
                            Calendar calendar6 = c1387eR36.f754o;
                            if (calendar6 == null || (strM4 = AbstractC0397Ej.m(calendar6, "yyyy")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR37 = dr5.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str41 = c1387eR37.a;
                            String str42 = c1387eR37.b;
                            Calendar calendar7 = c1387eR37.f754o;
                            if (calendar7 == null || (strM5 = AbstractC0397Ej.m(calendar7, "yyyy-MM-dd")) == null) {
                                strM5 = "";
                            }
                            C1387eR c1387eR38 = dr5.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str43 = c1387eR38.h;
                            Is0 is3 = new Is0(str41, str42, strM5, str43 != null ? str43 : "");
                            AbstractC1474fG.j(str39, "id");
                            AbstractC1474fG.j(str40, "title");
                            AbstractC0397Ej.z(constraintLayout12, new CC(str39, str40, strM4, is3));
                            return;
                        default:
                            ConstraintLayout constraintLayout13 = constraintLayout7;
                            AbstractC1474fG.j(constraintLayout13, "$this_apply");
                            DR dr6 = this;
                            AbstractC1474fG.j(dr6, "this$0");
                            Context context7 = constraintLayout13.getContext();
                            AbstractC1474fG.i(context7, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof FavoritesTvFragment) {
                                dr6.z();
                                C1387eR c1387eR39 = dr6.w;
                                if (c1387eR39 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                String str44 = c1387eR39.a;
                                AbstractC1474fG.j(str44, "id");
                                AbstractC0397Ej.z(constraintLayout13, new C0874Wt(str44));
                                return;
                            }
                            if (!(abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment)) {
                                if (abstractComponentCallbacksC1247cxO4 instanceof MoviesHomeTvFragment) {
                                    C1387eR c1387eR40 = dr6.w;
                                    if (c1387eR40 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str45 = c1387eR40.a;
                                    AbstractC1474fG.j(str45, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new UR(str45));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof MovieTvFragment) {
                                    C1387eR c1387eR41 = dr6.w;
                                    if (c1387eR41 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str46 = c1387eR41.a;
                                    AbstractC1474fG.j(str46, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new C2652rR(str46));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof TvShowTvFragment) {
                                    C1387eR c1387eR42 = dr6.w;
                                    if (c1387eR42 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str47 = c1387eR42.a;
                                    AbstractC1474fG.j(str47, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new C3466zo0(str47));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR43 = dr6.w;
                                    if (c1387eR43 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str48 = c1387eR43.a;
                                    AbstractC1474fG.j(str48, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new C2953ua0(str48));
                                    return;
                                }
                                if (abstractComponentCallbacksC1247cxO4 instanceof HistoryTvFragment) {
                                    dr6.z();
                                    C1387eR c1387eR44 = dr6.w;
                                    if (c1387eR44 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str49 = c1387eR44.a;
                                    AbstractC1474fG.j(str49, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new C3218xB(str49));
                                    return;
                                }
                                return;
                            }
                            C1387eR c1387eR45 = dr6.w;
                            if (c1387eR45 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            if (!AbstractC1474fG.b(c1387eR45.n.get("is_tv_channel"), Boolean.TRUE)) {
                                C1387eR c1387eR46 = dr6.w;
                                if (c1387eR46 == null) {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                                if (!AbstractC1899jh0.U(c1387eR46.a, "tv-", false)) {
                                    C1387eR c1387eR47 = dr6.w;
                                    if (c1387eR47 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    String str50 = c1387eR47.a;
                                    AbstractC1474fG.j(str50, "id");
                                    AbstractC0397Ej.z(constraintLayout13, new GC(str50));
                                    C1387eR c1387eR48 = dr6.w;
                                    if (c1387eR48 == null) {
                                        AbstractC1474fG.U("movie");
                                        throw null;
                                    }
                                    if (c1387eR48.c() == EnumC3203x3.z) {
                                        C1387eR c1387eR49 = dr6.w;
                                        if (c1387eR49 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str51 = c1387eR49.a;
                                        String str52 = c1387eR49.b;
                                        Calendar calendar8 = c1387eR49.f754o;
                                        if (calendar8 == null || (strM10 = AbstractC0397Ej.m(calendar8, "yyyy")) == null) {
                                            strM10 = "";
                                        }
                                        C1387eR c1387eR50 = dr6.w;
                                        if (c1387eR50 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str53 = c1387eR50.a;
                                        String str54 = c1387eR50.b;
                                        Calendar calendar9 = c1387eR50.f754o;
                                        if (calendar9 == null || (strM11 = AbstractC0397Ej.m(calendar9, "yyyy-MM-dd")) == null) {
                                            strM11 = "";
                                        }
                                        C1387eR c1387eR51 = dr6.w;
                                        if (c1387eR51 == null) {
                                            AbstractC1474fG.U("movie");
                                            throw null;
                                        }
                                        String str55 = c1387eR51.h;
                                        Is0 is4 = new Is0(str53, str54, strM11, str55 != null ? str55 : "");
                                        AbstractC1474fG.j(str51, "id");
                                        AbstractC1474fG.j(str52, "title");
                                        AbstractC0397Ej.z(constraintLayout13, new C2846tR(str51, str52, strM10, is4));
                                        return;
                                    }
                                    return;
                                }
                            }
                            C1387eR c1387eR52 = dr6.w;
                            if (c1387eR52 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str56 = c1387eR52.a;
                            String str57 = c1387eR52.b;
                            Calendar calendar10 = c1387eR52.f754o;
                            if (calendar10 == null || (strM8 = AbstractC0397Ej.m(calendar10, "yyyy")) == null) {
                                strM8 = "";
                            }
                            C1387eR c1387eR53 = dr6.w;
                            if (c1387eR53 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str58 = c1387eR53.a;
                            String str59 = c1387eR53.b;
                            Calendar calendar11 = c1387eR53.f754o;
                            if (calendar11 == null || (strM9 = AbstractC0397Ej.m(calendar11, "yyyy-MM-dd")) == null) {
                                strM9 = "";
                            }
                            C1387eR c1387eR54 = dr6.w;
                            if (c1387eR54 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str60 = c1387eR54.h;
                            Is0 is5 = new Is0(str58, str59, strM9, str60 != null ? str60 : "");
                            AbstractC1474fG.j(str56, "id");
                            AbstractC1474fG.j(str57, "title");
                            AbstractC0397Ej.z(constraintLayout13, new HC(str56, str57, strM8, is5));
                            return;
                    }
                }
            });
            constraintLayout7.setOnLongClickListener(new ViewOnLongClickListenerC3234xR(constraintLayout7, this, i11));
            constraintLayout7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout7, i3, this));
            C1387eR c1387eR26 = this.w;
            if (c1387eR26 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            bg.f183o.setVisibility(AbstractC1474fG.b(c1387eR26.n.get("is_live_channel"), Boolean.TRUE) ? 0 : 8);
            ImageView imageView3 = bg.n;
            AbstractC1474fG.i(imageView3, "ivHomeLogo");
            ImageView imageView4 = bg.m;
            AbstractC1474fG.i(imageView4, "ivAwayLogo");
            v(imageView3, imageView4, new CR(bg, 0), new CR(bg, 1), new CR(bg, 2), new CR(bg, 3));
            return;
        }
        boolean z2 = interfaceC2604qt0 instanceof C2094lh;
        int i12 = R.drawable.ic_favorite_disable;
        if (z2) {
            C2094lh c2094lh = (C2094lh) interfaceC2604qt0;
            ImageView imageView5 = c2094lh.p;
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E5 = com.bumptech.glide.a.e(imageView5.getContext());
            C1387eR c1387eR27 = this.w;
            if (c1387eR27 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            componentCallbacks2C3406z70E5.n(c1387eR27.h).H(imageView5);
            C1387eR c1387eR28 = this.w;
            if (c1387eR28 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str8 = c1387eR28.h;
            imageView5.setVisibility((str8 == null || str8.length() == 0) ? 8 : 0);
            C1387eR c1387eR29 = this.w;
            if (c1387eR29 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            c2094lh.x.setText(c1387eR29.b);
            C1387eR c1387eR30 = this.w;
            if (c1387eR30 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            Double d2 = c1387eR30.g;
            c2094lh.u.setText(d2 != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2.doubleValue())}, 1)) : "N/A");
            C1387eR c1387eR31 = this.w;
            if (c1387eR31 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String str9 = c1387eR31.f;
            TextView textView10 = c2094lh.t;
            textView10.setText(str9);
            CharSequence text8 = textView10.getText();
            textView10.setVisibility((text8 == null || text8.length() == 0) ? 8 : 0);
            C1387eR c1387eR32 = this.w;
            if (c1387eR32 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            Calendar calendar2 = c1387eR32.f754o;
            String strM2 = calendar2 != null ? AbstractC0397Ej.m(calendar2, "yyyy") : null;
            TextView textView11 = c2094lh.v;
            textView11.setText(strM2);
            CharSequence text9 = textView11.getText();
            textView11.setVisibility((text9 == null || text9.length() == 0) ? 8 : 0);
            C1387eR c1387eR33 = this.w;
            if (c1387eR33 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            Integer num = c1387eR33.d;
            TextView textView12 = c2094lh.w;
            if (num != null) {
                int iIntValue = num.intValue();
                int i13 = iIntValue / 60;
                int i14 = iIntValue % 60;
                string2 = i13 > 0 ? textView12.getContext().getString(R.string.movie_runtime_hours_minutes, Integer.valueOf(i13), Integer.valueOf(i14)) : textView12.getContext().getString(R.string.movie_runtime_minutes, Integer.valueOf(i14));
            } else {
                string2 = null;
            }
            textView12.setText(string2);
            CharSequence text10 = textView12.getText();
            textView12.setVisibility((text10 == null || text10.length() == 0) ? 8 : 0);
            C1387eR c1387eR34 = this.w;
            if (c1387eR34 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            String strH0 = AbstractC0911Ye.h0(c1387eR34.j, ", ", null, null, C1182cH.r, 30);
            TextView textView13 = c2094lh.r;
            textView13.setText(strH0);
            C1387eR c1387eR35 = this.w;
            if (c1387eR35 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            textView13.setVisibility(c1387eR35.j.isEmpty() ? 8 : 0);
            C1387eR c1387eR36 = this.w;
            if (c1387eR36 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            c2094lh.s.setText(c1387eR36.c);
            final TextView textView14 = c2094lh.f898o;
            textView14.setOnClickListener(new View.OnClickListener() { // from class: o.vR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String strM3;
                    String strM4;
                    String strM5;
                    String strM6;
                    switch (i5) {
                        case 0:
                            TextView textView15 = textView14;
                            AbstractC1474fG.j(textView15, "$this_apply");
                            DR dr = this;
                            AbstractC1474fG.j(dr, "this$0");
                            C1387eR c1387eR210 = dr.w;
                            if (c1387eR210 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str10 = c1387eR210.a;
                            String str11 = c1387eR210.b;
                            Calendar calendar3 = c1387eR210.f754o;
                            String str12 = "";
                            if (calendar3 == null || (strM3 = AbstractC0397Ej.m(calendar3, "yyyy")) == null) {
                                strM3 = "";
                            }
                            C1387eR c1387eR211 = dr.w;
                            if (c1387eR211 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str13 = c1387eR211.a;
                            String str14 = c1387eR211.b;
                            Calendar calendar4 = c1387eR211.f754o;
                            if (calendar4 == null || (strM4 = AbstractC0397Ej.m(calendar4, "yyyy-MM-dd")) == null) {
                                strM4 = "";
                            }
                            C1387eR c1387eR212 = dr.w;
                            if (c1387eR212 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str15 = c1387eR212.h;
                            if (str15 == null) {
                                String str16 = c1387eR212.i;
                                if (str16 != null) {
                                    str12 = str16;
                                }
                            } else {
                                str12 = str15;
                            }
                            Is0 is0 = new Is0(str13, str14, strM4, str12);
                            AbstractC1474fG.j(str10, "id");
                            AbstractC1474fG.j(str11, "title");
                            AbstractC0397Ej.z(textView15, new C2846tR(str10, str11, strM3, is0));
                            return;
                        case 1:
                            TextView textView16 = textView14;
                            AbstractC1474fG.j(textView16, "$this_apply");
                            DR dr2 = this;
                            AbstractC1474fG.j(dr2, "this$0");
                            C1387eR c1387eR213 = dr2.w;
                            if (c1387eR213 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str17 = c1387eR213.a;
                            String str18 = c1387eR213.b;
                            Calendar calendar5 = c1387eR213.f754o;
                            String str19 = "";
                            if (calendar5 == null || (strM5 = AbstractC0397Ej.m(calendar5, "yyyy")) == null) {
                                strM5 = "";
                            }
                            C1387eR c1387eR214 = dr2.w;
                            if (c1387eR214 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str110 = c1387eR214.a;
                            String str111 = c1387eR214.b;
                            Calendar calendar6 = c1387eR214.f754o;
                            if (calendar6 == null || (strM6 = AbstractC0397Ej.m(calendar6, "yyyy-MM-dd")) == null) {
                                strM6 = "";
                            }
                            C1387eR c1387eR215 = dr2.w;
                            if (c1387eR215 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str20 = c1387eR215.h;
                            if (str20 == null) {
                                String str21 = c1387eR215.i;
                                if (str21 != null) {
                                    str19 = str21;
                                }
                            } else {
                                str19 = str20;
                            }
                            Is0 is1 = new Is0(str110, str111, strM6, str19);
                            AbstractC1474fG.j(str17, "id");
                            AbstractC1474fG.j(str18, "title");
                            AbstractC0397Ej.z(textView16, new C2168mR(str17, str18, strM5, is1));
                            return;
                        default:
                            TextView textView17 = textView14;
                            AbstractC1474fG.j(textView17, "$this_apply");
                            DR dr3 = this;
                            AbstractC1474fG.j(dr3, "this$0");
                            C1387eR c1387eR37 = dr3.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str22 = c1387eR37.a;
                            AbstractC1474fG.j(str22, "id");
                            AbstractC0397Ej.z(textView17, new BC(str22));
                            return;
                    }
                }
            });
            final int i15 = 0;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: o.yR
                public final /* synthetic */ DR m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3289xx c3289xxU;
                    C3289xx c3289xxU2;
                    switch (i15) {
                        case 0:
                            DR dr = this.m;
                            AbstractC1474fG.j(dr, "this$0");
                            C1387eR c1387eR37 = dr.w;
                            if (c1387eR37 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str10 = c1387eR37.e;
                            Context context2 = dr.v;
                            if (str10 == null) {
                                Toast.makeText(context2, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                            if (abstractActivityC1540fx2 == null || (c3289xxU = abstractActivityC1540fx2.u()) == null) {
                                return;
                            }
                            C1387eR c1387eR38 = dr.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str11 = c1387eR38.e;
                            AbstractC1474fG.g(str11);
                            C2299nm0 c2299nm0 = new C2299nm0();
                            Bundle bundle = new Bundle();
                            bundle.putString("trailer_url", str11);
                            c2299nm0.U(bundle);
                            c2299nm0.Z(c3289xxU, "TrailerFragment");
                            return;
                        case 1:
                            DR dr2 = this.m;
                            AbstractC1474fG.j(dr2, "this$0");
                            C1387eR c1387eR39 = dr2.w;
                            if (c1387eR39 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str12 = c1387eR39.e;
                            Context context3 = dr2.v;
                            if (str12 == null) {
                                Toast.makeText(context3, "Trailer no disponible para esta película", 0).show();
                                return;
                            }
                            try {
                                C1387eR c1387eR40 = dr2.w;
                                if (c1387eR40 != null) {
                                    context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c1387eR40.e)));
                                    return;
                                } else {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(context3, "No hay una aplicación para abrir este enlace", 0).show();
                                return;
                            }
                        default:
                            DR dr3 = this.m;
                            AbstractC1474fG.j(dr3, "this$0");
                            C1387eR c1387eR41 = dr3.w;
                            if (c1387eR41 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str13 = c1387eR41.e;
                            Context context4 = dr3.v;
                            if (str13 == null) {
                                Toast.makeText(context4, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context4 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context4 : null;
                            if (abstractActivityC1540fx3 == null || (c3289xxU2 = abstractActivityC1540fx3.u()) == null) {
                                return;
                            }
                            C1387eR c1387eR42 = dr3.w;
                            if (c1387eR42 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str14 = c1387eR42.e;
                            AbstractC1474fG.g(str14);
                            C2299nm0 c2299nm1 = new C2299nm0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("trailer_url", str14);
                            c2299nm1.U(bundle2);
                            c2299nm1.Z(c3289xxU2, "TrailerFragment");
                            return;
                    }
                }
            };
            TextView textView15 = c2094lh.n;
            textView15.setOnClickListener(onClickListener);
            C1387eR c1387eR37 = this.w;
            if (c1387eR37 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            C2123lv0 c2123lv5 = c1387eR37.s;
            int i16 = c2123lv5 != null ? (int) ((c2123lv5.b * ((long) 100)) / c2123lv5.c) : 0;
            ProgressBar progressBar6 = c2094lh.q;
            progressBar6.setProgress(i16);
            progressBar6.setVisibility(c2123lv5 != null ? 0 : 8);
            textView15.setOnClickListener(new View.OnClickListener(this) { // from class: o.yR
                public final /* synthetic */ DR m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3289xx c3289xxU;
                    C3289xx c3289xxU2;
                    switch (i5) {
                        case 0:
                            DR dr = this.m;
                            AbstractC1474fG.j(dr, "this$0");
                            C1387eR c1387eR38 = dr.w;
                            if (c1387eR38 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str10 = c1387eR38.e;
                            Context context2 = dr.v;
                            if (str10 == null) {
                                Toast.makeText(context2, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                            if (abstractActivityC1540fx2 == null || (c3289xxU = abstractActivityC1540fx2.u()) == null) {
                                return;
                            }
                            C1387eR c1387eR39 = dr.w;
                            if (c1387eR39 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str11 = c1387eR39.e;
                            AbstractC1474fG.g(str11);
                            C2299nm0 c2299nm0 = new C2299nm0();
                            Bundle bundle = new Bundle();
                            bundle.putString("trailer_url", str11);
                            c2299nm0.U(bundle);
                            c2299nm0.Z(c3289xxU, "TrailerFragment");
                            return;
                        case 1:
                            DR dr2 = this.m;
                            AbstractC1474fG.j(dr2, "this$0");
                            C1387eR c1387eR310 = dr2.w;
                            if (c1387eR310 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str12 = c1387eR310.e;
                            Context context3 = dr2.v;
                            if (str12 == null) {
                                Toast.makeText(context3, "Trailer no disponible para esta película", 0).show();
                                return;
                            }
                            try {
                                C1387eR c1387eR40 = dr2.w;
                                if (c1387eR40 != null) {
                                    context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c1387eR40.e)));
                                    return;
                                } else {
                                    AbstractC1474fG.U("movie");
                                    throw null;
                                }
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(context3, "No hay una aplicación para abrir este enlace", 0).show();
                                return;
                            }
                        default:
                            DR dr3 = this.m;
                            AbstractC1474fG.j(dr3, "this$0");
                            C1387eR c1387eR41 = dr3.w;
                            if (c1387eR41 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str13 = c1387eR41.e;
                            Context context4 = dr3.v;
                            if (str13 == null) {
                                Toast.makeText(context4, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context4 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context4 : null;
                            if (abstractActivityC1540fx3 == null || (c3289xxU2 = abstractActivityC1540fx3.u()) == null) {
                                return;
                            }
                            C1387eR c1387eR42 = dr3.w;
                            if (c1387eR42 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            String str14 = c1387eR42.e;
                            AbstractC1474fG.g(str14);
                            C2299nm0 c2299nm1 = new C2299nm0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("trailer_url", str14);
                            c2299nm1.U(bundle2);
                            c2299nm1.Z(c3289xxU2, "TrailerFragment");
                            return;
                    }
                }
            });
            C1387eR c1387eR38 = this.w;
            if (c1387eR38 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            textView15.setVisibility(c1387eR38.e != null ? 0 : 8);
            final ImageView imageView6 = c2094lh.m;
            final int i17 = 0;
            imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: o.zR
                public final /* synthetic */ DR m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i18;
                    int i19;
                    switch (i17) {
                        case 0:
                            DR dr = this.m;
                            AbstractC1474fG.j(dr, "this$0");
                            ImageView imageView7 = imageView6;
                            AbstractC1474fG.j(imageView7, "$this_apply");
                            C1387eR c1387eR39 = dr.w;
                            if (c1387eR39 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            c1387eR39.p = !c1387eR39.p;
                            O9 o9 = AppDatabase.m;
                            Context context2 = dr.v;
                            AbstractC1474fG.i(context2, "context");
                            C1583gR c1583gRP = o9.w(context2).p();
                            C1387eR c1387eR40 = dr.w;
                            if (c1387eR40 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            c1583gRP.I(c1387eR40);
                            Context context3 = imageView7.getContext();
                            C1387eR c1387eR41 = dr.w;
                            if (c1387eR41 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            boolean z3 = c1387eR41.p;
                            if (z3) {
                                i18 = R.drawable.ic_favorite_enable;
                            } else {
                                if (z3) {
                                    throw new C0730Rf();
                                }
                                i18 = R.drawable.ic_favorite_disable;
                            }
                            imageView7.setImageDrawable(AbstractC3354yh.b(context3, i18));
                            return;
                        default:
                            DR dr2 = this.m;
                            AbstractC1474fG.j(dr2, "this$0");
                            ImageView imageView8 = imageView6;
                            AbstractC1474fG.j(imageView8, "$this_apply");
                            C1387eR c1387eR42 = dr2.w;
                            if (c1387eR42 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            c1387eR42.p = !c1387eR42.p;
                            O9 o10 = AppDatabase.m;
                            Context context4 = dr2.v;
                            AbstractC1474fG.i(context4, "context");
                            C1583gR c1583gRP2 = o10.w(context4).p();
                            C1387eR c1387eR43 = dr2.w;
                            if (c1387eR43 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            c1583gRP2.I(c1387eR43);
                            Context context5 = imageView8.getContext();
                            C1387eR c1387eR44 = dr2.w;
                            if (c1387eR44 == null) {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                            boolean z4 = c1387eR44.p;
                            if (z4) {
                                i19 = R.drawable.ic_favorite_enable;
                            } else {
                                if (z4) {
                                    throw new C0730Rf();
                                }
                                i19 = R.drawable.ic_favorite_disable;
                            }
                            imageView8.setImageDrawable(AbstractC3354yh.b(context5, i19));
                            return;
                    }
                }
            });
            Context context2 = imageView6.getContext();
            C1387eR c1387eR39 = this.w;
            if (c1387eR39 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            boolean z3 = c1387eR39.p;
            if (z3) {
                i12 = R.drawable.ic_favorite_enable;
            } else if (z3) {
                throw new C0730Rf();
            }
            imageView6.setImageDrawable(AbstractC3354yh.b(context2, i12));
            return;
        }
        if (!(interfaceC2604qt0 instanceof C2385oh)) {
            if (interfaceC2604qt0 instanceof C1898jh) {
                RecyclerView recyclerView = ((C1898jh) interfaceC2604qt0).m;
                C3300y3 c3300y3 = new C3300y3();
                C1387eR c1387eR40 = this.w;
                if (c1387eR40 == null) {
                    AbstractC1474fG.U("movie");
                    throw null;
                }
                List<C1688hY> list = c1387eR40.l;
                for (C1688hY c1688hY : list) {
                    EnumC3203x3 enumC3203x3 = EnumC3203x3.L;
                    c1688hY.getClass();
                    c1688hY.e = enumC3203x3;
                }
                c3300y3.m(list);
                recyclerView.setAdapter(c3300y3);
                if (recyclerView.getItemDecorationCount() == 0) {
                    Context context3 = recyclerView.getContext();
                    AbstractC1474fG.i(context3, "getContext(...)");
                    recyclerView.g(new C2285nf0(AbstractC0397Ej.k(context3, 20)));
                    return;
                }
                return;
            }
            if (interfaceC2604qt0 instanceof C1996kh) {
                HorizontalGridView horizontalGridView = ((C1996kh) interfaceC2604qt0).m;
                horizontalGridView.setRowHeight(-2);
                C3300y3 c3300y4 = new C3300y3();
                C1387eR c1387eR41 = this.w;
                if (c1387eR41 == null) {
                    AbstractC1474fG.U("movie");
                    throw null;
                }
                List<C1688hY> list2 = c1387eR41.l;
                for (C1688hY c1688hY2 : list2) {
                    EnumC3203x3 enumC3203x4 = EnumC3203x3.M;
                    c1688hY2.getClass();
                    c1688hY2.e = enumC3203x4;
                }
                c3300y4.m(list2);
                horizontalGridView.setAdapter(c3300y4);
                horizontalGridView.setItemSpacing(80);
                return;
            }
            if (!(interfaceC2604qt0 instanceof C2191mh)) {
                if (interfaceC2604qt0 instanceof C2288nh) {
                    HorizontalGridView horizontalGridView2 = ((C2288nh) interfaceC2604qt0).m;
                    horizontalGridView2.setRowHeight(-2);
                    C3300y3 c3300y5 = new C3300y3();
                    C1387eR c1387eR42 = this.w;
                    if (c1387eR42 == null) {
                        AbstractC1474fG.U("movie");
                        throw null;
                    }
                    List<Cd0> list3 = c1387eR42.m;
                    for (Cd0 cd0 : list3) {
                        if (cd0 instanceof C1387eR) {
                            EnumC3203x3 enumC3203x5 = EnumC3203x3.x;
                            C1387eR c1387eR43 = (C1387eR) cd0;
                            c1387eR43.getClass();
                            c1387eR43.u = enumC3203x5;
                        } else if (cd0 instanceof C2109lo0) {
                            EnumC3203x3 enumC3203x6 = EnumC3203x3.U;
                            C2109lo0 c2109lo0 = (C2109lo0) cd0;
                            c2109lo0.getClass();
                            c2109lo0.s = enumC3203x6;
                        }
                    }
                    c3300y5.m(list3);
                    horizontalGridView2.setAdapter(c3300y5);
                    horizontalGridView2.setItemSpacing(20);
                    return;
                }
                return;
            }
            RecyclerView recyclerView2 = ((C2191mh) interfaceC2604qt0).m;
            C3300y3 c3300y6 = new C3300y3();
            C1387eR c1387eR44 = this.w;
            if (c1387eR44 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            List<Cd0> list4 = c1387eR44.m;
            for (Cd0 cd1 : list4) {
                if (cd1 instanceof C1387eR) {
                    EnumC3203x3 enumC3203x7 = EnumC3203x3.w;
                    C1387eR c1387eR45 = (C1387eR) cd1;
                    c1387eR45.getClass();
                    c1387eR45.u = enumC3203x7;
                } else if (cd1 instanceof C2109lo0) {
                    EnumC3203x3 enumC3203x8 = EnumC3203x3.T;
                    C2109lo0 c2109lo1 = (C2109lo0) cd1;
                    c2109lo1.getClass();
                    c2109lo1.s = enumC3203x8;
                }
            }
            c3300y6.m(list4);
            recyclerView2.setAdapter(c3300y6);
            if (recyclerView2.getItemDecorationCount() == 0) {
                Context context4 = recyclerView2.getContext();
                AbstractC1474fG.i(context4, "getContext(...)");
                recyclerView2.g(new C2285nf0(AbstractC0397Ej.k(context4, 10)));
                return;
            }
            return;
        }
        C2385oh c2385oh = (C2385oh) interfaceC2604qt0;
        ImageView imageView7 = c2385oh.p;
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E6 = com.bumptech.glide.a.e(imageView7.getContext());
        C1387eR c1387eR46 = this.w;
        if (c1387eR46 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        componentCallbacks2C3406z70E6.n(c1387eR46.h).H(imageView7);
        C1387eR c1387eR47 = this.w;
        if (c1387eR47 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        String str10 = c1387eR47.h;
        imageView7.setVisibility((str10 == null || str10.length() == 0) ? 8 : 0);
        C1387eR c1387eR48 = this.w;
        if (c1387eR48 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        c2385oh.x.setText(c1387eR48.b);
        C1387eR c1387eR49 = this.w;
        if (c1387eR49 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Double d3 = c1387eR49.g;
        c2385oh.u.setText(d3 != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3.doubleValue())}, 1)) : "N/A");
        C1387eR c1387eR50 = this.w;
        if (c1387eR50 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        String str11 = c1387eR50.f;
        TextView textView16 = c2385oh.t;
        textView16.setText(str11);
        CharSequence text11 = textView16.getText();
        textView16.setVisibility((text11 == null || text11.length() == 0) ? 8 : 0);
        C1387eR c1387eR51 = this.w;
        if (c1387eR51 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Calendar calendar3 = c1387eR51.f754o;
        String strM3 = calendar3 != null ? AbstractC0397Ej.m(calendar3, "yyyy") : null;
        TextView textView17 = c2385oh.v;
        textView17.setText(strM3);
        CharSequence text12 = textView17.getText();
        textView17.setVisibility((text12 == null || text12.length() == 0) ? 8 : 0);
        C1387eR c1387eR52 = this.w;
        if (c1387eR52 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Integer num2 = c1387eR52.d;
        TextView textView18 = c2385oh.w;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            int i18 = iIntValue2 / 60;
            int i19 = iIntValue2 % 60;
            string = i18 > 0 ? textView18.getContext().getString(R.string.movie_runtime_hours_minutes, Integer.valueOf(i18), Integer.valueOf(i19)) : textView18.getContext().getString(R.string.movie_runtime_minutes, Integer.valueOf(i19));
        } else {
            string = null;
        }
        textView18.setText(string);
        CharSequence text13 = textView18.getText();
        textView18.setVisibility((text13 == null || text13.length() == 0) ? 8 : 0);
        C1387eR c1387eR53 = this.w;
        if (c1387eR53 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        String strH1 = AbstractC0911Ye.h0(c1387eR53.j, ", ", null, null, C1182cH.s, 30);
        TextView textView19 = c2385oh.r;
        textView19.setText(strH1);
        C1387eR c1387eR54 = this.w;
        if (c1387eR54 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        textView19.setVisibility(c1387eR54.j.isEmpty() ? 8 : 0);
        C1387eR c1387eR55 = this.w;
        if (c1387eR55 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        c2385oh.s.setText(c1387eR55.c);
        final TextView textView20 = c2385oh.f950o;
        final int i20 = 0;
        textView20.setOnClickListener(new View.OnClickListener() { // from class: o.vR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strM4;
                String strM5;
                String strM6;
                String strM7;
                switch (i20) {
                    case 0:
                        TextView textView110 = textView20;
                        AbstractC1474fG.j(textView110, "$this_apply");
                        DR dr = this;
                        AbstractC1474fG.j(dr, "this$0");
                        C1387eR c1387eR210 = dr.w;
                        if (c1387eR210 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str12 = c1387eR210.a;
                        String str13 = c1387eR210.b;
                        Calendar calendar4 = c1387eR210.f754o;
                        String str14 = "";
                        if (calendar4 == null || (strM4 = AbstractC0397Ej.m(calendar4, "yyyy")) == null) {
                            strM4 = "";
                        }
                        C1387eR c1387eR211 = dr.w;
                        if (c1387eR211 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str15 = c1387eR211.a;
                        String str16 = c1387eR211.b;
                        Calendar calendar5 = c1387eR211.f754o;
                        if (calendar5 == null || (strM5 = AbstractC0397Ej.m(calendar5, "yyyy-MM-dd")) == null) {
                            strM5 = "";
                        }
                        C1387eR c1387eR212 = dr.w;
                        if (c1387eR212 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str17 = c1387eR212.h;
                        if (str17 == null) {
                            String str18 = c1387eR212.i;
                            if (str18 != null) {
                                str14 = str18;
                            }
                        } else {
                            str14 = str17;
                        }
                        Is0 is0 = new Is0(str15, str16, strM5, str14);
                        AbstractC1474fG.j(str12, "id");
                        AbstractC1474fG.j(str13, "title");
                        AbstractC0397Ej.z(textView110, new C2846tR(str12, str13, strM4, is0));
                        return;
                    case 1:
                        TextView textView111 = textView20;
                        AbstractC1474fG.j(textView111, "$this_apply");
                        DR dr2 = this;
                        AbstractC1474fG.j(dr2, "this$0");
                        C1387eR c1387eR213 = dr2.w;
                        if (c1387eR213 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str19 = c1387eR213.a;
                        String str110 = c1387eR213.b;
                        Calendar calendar6 = c1387eR213.f754o;
                        String str111 = "";
                        if (calendar6 == null || (strM6 = AbstractC0397Ej.m(calendar6, "yyyy")) == null) {
                            strM6 = "";
                        }
                        C1387eR c1387eR214 = dr2.w;
                        if (c1387eR214 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str112 = c1387eR214.a;
                        String str113 = c1387eR214.b;
                        Calendar calendar7 = c1387eR214.f754o;
                        if (calendar7 == null || (strM7 = AbstractC0397Ej.m(calendar7, "yyyy-MM-dd")) == null) {
                            strM7 = "";
                        }
                        C1387eR c1387eR215 = dr2.w;
                        if (c1387eR215 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str20 = c1387eR215.h;
                        if (str20 == null) {
                            String str21 = c1387eR215.i;
                            if (str21 != null) {
                                str111 = str21;
                            }
                        } else {
                            str111 = str20;
                        }
                        Is0 is1 = new Is0(str112, str113, strM7, str111);
                        AbstractC1474fG.j(str19, "id");
                        AbstractC1474fG.j(str110, "title");
                        AbstractC0397Ej.z(textView111, new C2168mR(str19, str110, strM6, is1));
                        return;
                    default:
                        TextView textView112 = textView20;
                        AbstractC1474fG.j(textView112, "$this_apply");
                        DR dr3 = this;
                        AbstractC1474fG.j(dr3, "this$0");
                        C1387eR c1387eR310 = dr3.w;
                        if (c1387eR310 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str22 = c1387eR310.a;
                        AbstractC1474fG.j(str22, "id");
                        AbstractC0397Ej.z(textView112, new BC(str22));
                        return;
                }
            }
        });
        C1387eR c1387eR56 = this.w;
        if (c1387eR56 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        C2123lv0 c2123lv6 = c1387eR56.s;
        int i21 = c2123lv6 != null ? (int) ((c2123lv6.b * ((long) 100)) / c2123lv6.c) : 0;
        ProgressBar progressBar7 = c2385oh.q;
        progressBar7.setProgress(i21);
        progressBar7.setVisibility(c2123lv6 != null ? 0 : 8);
        c2385oh.n.setOnClickListener(new View.OnClickListener(this) { // from class: o.yR
            public final /* synthetic */ DR m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3289xx c3289xxU;
                C3289xx c3289xxU2;
                switch (i4) {
                    case 0:
                        DR dr = this.m;
                        AbstractC1474fG.j(dr, "this$0");
                        C1387eR c1387eR310 = dr.w;
                        if (c1387eR310 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str12 = c1387eR310.e;
                        Context context5 = dr.v;
                        if (str12 == null) {
                            Toast.makeText(context5, "Trailer no disponible", 0).show();
                            return;
                        }
                        AbstractActivityC1540fx abstractActivityC1540fx2 = context5 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context5 : null;
                        if (abstractActivityC1540fx2 == null || (c3289xxU = abstractActivityC1540fx2.u()) == null) {
                            return;
                        }
                        C1387eR c1387eR311 = dr.w;
                        if (c1387eR311 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str13 = c1387eR311.e;
                        AbstractC1474fG.g(str13);
                        C2299nm0 c2299nm0 = new C2299nm0();
                        Bundle bundle = new Bundle();
                        bundle.putString("trailer_url", str13);
                        c2299nm0.U(bundle);
                        c2299nm0.Z(c3289xxU, "TrailerFragment");
                        return;
                    case 1:
                        DR dr2 = this.m;
                        AbstractC1474fG.j(dr2, "this$0");
                        C1387eR c1387eR312 = dr2.w;
                        if (c1387eR312 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str14 = c1387eR312.e;
                        Context context6 = dr2.v;
                        if (str14 == null) {
                            Toast.makeText(context6, "Trailer no disponible para esta película", 0).show();
                            return;
                        }
                        try {
                            C1387eR c1387eR410 = dr2.w;
                            if (c1387eR410 != null) {
                                context6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c1387eR410.e)));
                                return;
                            } else {
                                AbstractC1474fG.U("movie");
                                throw null;
                            }
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(context6, "No hay una aplicación para abrir este enlace", 0).show();
                            return;
                        }
                    default:
                        DR dr3 = this.m;
                        AbstractC1474fG.j(dr3, "this$0");
                        C1387eR c1387eR411 = dr3.w;
                        if (c1387eR411 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str15 = c1387eR411.e;
                        Context context7 = dr3.v;
                        if (str15 == null) {
                            Toast.makeText(context7, "Trailer no disponible", 0).show();
                            return;
                        }
                        AbstractActivityC1540fx abstractActivityC1540fx3 = context7 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context7 : null;
                        if (abstractActivityC1540fx3 == null || (c3289xxU2 = abstractActivityC1540fx3.u()) == null) {
                            return;
                        }
                        C1387eR c1387eR412 = dr3.w;
                        if (c1387eR412 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        String str16 = c1387eR412.e;
                        AbstractC1474fG.g(str16);
                        C2299nm0 c2299nm1 = new C2299nm0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("trailer_url", str16);
                        c2299nm1.U(bundle2);
                        c2299nm1.Z(c3289xxU2, "TrailerFragment");
                        return;
                }
            }
        });
        final ImageView imageView8 = c2385oh.m;
        imageView8.setOnClickListener(new View.OnClickListener(this) { // from class: o.zR
            public final /* synthetic */ DR m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i110;
                int i111;
                switch (i5) {
                    case 0:
                        DR dr = this.m;
                        AbstractC1474fG.j(dr, "this$0");
                        ImageView imageView9 = imageView8;
                        AbstractC1474fG.j(imageView9, "$this_apply");
                        C1387eR c1387eR310 = dr.w;
                        if (c1387eR310 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        c1387eR310.p = !c1387eR310.p;
                        O9 o9 = AppDatabase.m;
                        Context context5 = dr.v;
                        AbstractC1474fG.i(context5, "context");
                        C1583gR c1583gRP = o9.w(context5).p();
                        C1387eR c1387eR410 = dr.w;
                        if (c1387eR410 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        c1583gRP.I(c1387eR410);
                        Context context6 = imageView9.getContext();
                        C1387eR c1387eR411 = dr.w;
                        if (c1387eR411 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        boolean z4 = c1387eR411.p;
                        if (z4) {
                            i110 = R.drawable.ic_favorite_enable;
                        } else {
                            if (z4) {
                                throw new C0730Rf();
                            }
                            i110 = R.drawable.ic_favorite_disable;
                        }
                        imageView9.setImageDrawable(AbstractC3354yh.b(context6, i110));
                        return;
                    default:
                        DR dr2 = this.m;
                        AbstractC1474fG.j(dr2, "this$0");
                        ImageView imageView10 = imageView8;
                        AbstractC1474fG.j(imageView10, "$this_apply");
                        C1387eR c1387eR412 = dr2.w;
                        if (c1387eR412 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        c1387eR412.p = !c1387eR412.p;
                        O9 o10 = AppDatabase.m;
                        Context context7 = dr2.v;
                        AbstractC1474fG.i(context7, "context");
                        C1583gR c1583gRP2 = o10.w(context7).p();
                        C1387eR c1387eR413 = dr2.w;
                        if (c1387eR413 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        c1583gRP2.I(c1387eR413);
                        Context context8 = imageView10.getContext();
                        C1387eR c1387eR414 = dr2.w;
                        if (c1387eR414 == null) {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                        boolean z5 = c1387eR414.p;
                        if (z5) {
                            i111 = R.drawable.ic_favorite_enable;
                        } else {
                            if (z5) {
                                throw new C0730Rf();
                            }
                            i111 = R.drawable.ic_favorite_disable;
                        }
                        imageView10.setImageDrawable(AbstractC3354yh.b(context8, i111));
                        return;
                }
            }
        });
        Context context5 = imageView8.getContext();
        C1387eR c1387eR57 = this.w;
        if (c1387eR57 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        boolean z4 = c1387eR57.p;
        if (z4) {
            i12 = R.drawable.ic_favorite_enable;
        } else if (z4) {
            throw new C0730Rf();
        }
        imageView8.setImageDrawable(AbstractC3354yh.b(context5, i12));
    }

    public final void v(ImageView imageView, ImageView imageView2, InterfaceC0412Ey interfaceC0412Ey, InterfaceC0412Ey interfaceC0412Ey2, InterfaceC0412Ey interfaceC0412Ey3, InterfaceC0412Ey interfaceC0412Ey4) {
        String strD0;
        C1387eR c1387eR = this.w;
        if (c1387eR == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj = c1387eR.n.get("fana_start_date");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            C1387eR c1387eR2 = this.w;
            if (c1387eR2 == null) {
                AbstractC1474fG.U("movie");
                throw null;
            }
            strD0 = c1387eR2.f;
            if (strD0 == null) {
                strD0 = "";
            }
        } else {
            String strA = AbstractC0511It.a(str);
            strD0 = strA == null ? AbstractC1119bh0.D0(10, str) : strA;
        }
        interfaceC0412Ey.b(strD0);
        C1387eR c1387eR3 = this.w;
        if (c1387eR3 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj2 = c1387eR3.n.get("fana_tournament");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        interfaceC0412Ey2.b(str2);
        C1387eR c1387eR4 = this.w;
        if (c1387eR4 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj3 = c1387eR4.n.get("fana_home_name");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        interfaceC0412Ey3.b(str3);
        C1387eR c1387eR5 = this.w;
        if (c1387eR5 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj4 = c1387eR5.n.get("fana_away_name");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        interfaceC0412Ey4.b(str4 != null ? str4 : "");
        C1387eR c1387eR6 = this.w;
        if (c1387eR6 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj5 = c1387eR6.n.get("fana_home_logo");
        x(obj5 instanceof String ? (String) obj5 : null, imageView);
        C1387eR c1387eR7 = this.w;
        if (c1387eR7 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj6 = c1387eR7.n.get("fana_away_logo");
        x(obj6 instanceof String ? (String) obj6 : null, imageView2);
    }

    public final RecyclerView w() {
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        if (interfaceC2604qt0 instanceof C1898jh) {
            return ((C1898jh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C1996kh) {
            return ((C1996kh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2191mh) {
            return ((C2191mh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2288nh) {
            return ((C2288nh) interfaceC2604qt0).m;
        }
        return null;
    }

    public final void x(String str, ImageView imageView) {
        C2630r70 c2630r70 = (C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) com.bumptech.glide.a.e(this.v).n(str).g(C0789Tm.e)).r(EnumC1651h30.m)).q(R.drawable.ic_provider_default_logo)).k()).j(R.drawable.ic_provider_default_logo)).h(R.drawable.ic_provider_default_logo);
        c2630r70.getClass();
        ((C2630r70) c2630r70.u(AbstractC0932Yz.b, Boolean.TRUE)).H(imageView);
    }

    public final String y() {
        DateTimeFormatter dateTimeFormatter = AbstractC0511It.a;
        C1387eR c1387eR = this.w;
        if (c1387eR == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Object obj = c1387eR.n.get("fana_start_date");
        String strA = AbstractC0511It.a(obj instanceof String ? (String) obj : null);
        if (strA != null) {
            return AbstractC1899jh0.R(strA, " · ", " ", false);
        }
        C1387eR c1387eR2 = this.w;
        if (c1387eR2 == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        Calendar calendar = c1387eR2.f754o;
        String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy") : null;
        if (strM != null) {
            return strM;
        }
        String string = this.v.getString(R.string.movie_item_type);
        AbstractC1474fG.i(string, "getString(...)");
        return string;
    }

    public final void z() {
        Object next;
        Q30 q30;
        C1387eR c1387eR = this.w;
        Object obj = null;
        if (c1387eR == null) {
            AbstractC1474fG.U("movie");
            throw null;
        }
        String str = c1387eR.t;
        if (str == null) {
            return;
        }
        Cr0 cr0 = Cr0.m;
        String strB = cr0.b();
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
        if (AbstractC1474fG.b(str, q30.getName())) {
            return;
        }
        Q30.a.getClass();
        for (Object obj2 : P30.b) {
            if (AbstractC1474fG.b(((Q30) obj2).getName(), str)) {
                obj = obj2;
                break;
            }
        }
        Q30 q32 = (Q30) obj;
        if (q32 != null) {
            cr0.f(q32.getName());
        }
    }
}
