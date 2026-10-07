package o;

import android.content.Context;
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
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import com.skidush.clonex.fragments.home.MoviesHomeMobileFragment;
import com.skidush.clonex.fragments.home.MoviesHomeTvFragment;
import com.skidush.clonex.fragments.movie.MovieMobileFragment;
import com.skidush.clonex.fragments.movie.MovieTvFragment;
import com.skidush.clonex.fragments.people.PeopleMobileFragment;
import com.skidush.clonex.fragments.people.PeopleTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsMobileFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsTvFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Jo0 extends AbstractC2144m60 {
    public final InterfaceC2604qt0 u;
    public final Context v;
    public C2109lo0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public Jo0(InterfaceC2604qt0 interfaceC2604qt0) {
        View viewB = interfaceC2604qt0.b();
        super(viewB);
        this.u = interfaceC2604qt0;
        this.v = viewB.getContext();
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:211:0x0458  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:392:0x0776  */
    /* JADX WARN: Code duplicated, block: B:577:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de  */
    public final void u(C2109lo0 c2109lo0) {
        String string;
        int i;
        String string2;
        int iNextIndex;
        Object next;
        List list;
        String string3;
        int i2;
        String string4;
        int iNextIndex2;
        Object next2;
        List list2;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        final int i3 = 2;
        final int i4 = 1;
        this.w = c2109lo0;
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        boolean z = interfaceC2604qt0 instanceof UG;
        C0789Tm c0789Tm = C0789Tm.b;
        Context context = this.v;
        String str = "";
        final int i5 = 0;
        if (z) {
            UG ug = (UG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout = ug.l;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.Eo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            Context context2 = constraintLayout2.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof FavoritesTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo1 = jo0.w;
                                if (c2109lo1 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str2 = c2109lo1.a;
                                AbstractC1474fG.j(str2, "id");
                                AbstractC0397Ej.z(constraintLayout2, new C0926Yt(str2));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                                C2109lo0 c2109lo2 = jo0.w;
                                if (c2109lo2 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str3 = c2109lo2.a;
                                AbstractC1474fG.j(str3, "id");
                                AbstractC0397Ej.z(constraintLayout2, new IC(str3));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesHomeTvFragment) {
                                C2109lo0 c2109lo3 = jo0.w;
                                if (c2109lo3 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str4 = c2109lo3.a;
                                AbstractC1474fG.j(str4, "id");
                                AbstractC0397Ej.z(constraintLayout2, new VR(str4));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MovieTvFragment) {
                                C2109lo0 c2109lo4 = jo0.w;
                                if (c2109lo4 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str5 = c2109lo4.a;
                                AbstractC1474fG.j(str5, "id");
                                AbstractC0397Ej.z(constraintLayout2, new C2943uR(str5));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof TvShowTvFragment) {
                                C2109lo0 c2109lo5 = jo0.w;
                                if (c2109lo5 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str6 = c2109lo5.a;
                                AbstractC1474fG.j(str6, "id");
                                AbstractC0397Ej.z(constraintLayout2, new Do0(str6));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo6 = jo0.w;
                                if (c2109lo6 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str7 = c2109lo6.a;
                                AbstractC1474fG.j(str7, "id");
                                AbstractC0397Ej.z(constraintLayout2, new C3147wa0(str7));
                                return;
                            }
                            return;
                        case 1:
                            ConstraintLayout constraintLayout3 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            Context context3 = constraintLayout3.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C2109lo0 c2109lo7 = jo1.w;
                                if (c2109lo7 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str8 = c2109lo7.a;
                                AbstractC1474fG.j(str8, "id");
                                AbstractC0397Ej.z(constraintLayout3, new C2904tz(str8));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C2109lo0 c2109lo8 = jo1.w;
                                if (c2109lo8 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str9 = c2109lo8.a;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC0397Ej.z(constraintLayout3, new C2175mY(str9));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                jo1.y();
                                C2109lo0 c2109lo9 = jo1.w;
                                if (c2109lo9 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str10 = c2109lo9.a;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC0397Ej.z(constraintLayout3, new C2275na0(str10));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof TvShowsMobileFragment) {
                                C2109lo0 c2109lo10 = jo1.w;
                                if (c2109lo10 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str11 = c2109lo10.a;
                                AbstractC1474fG.j(str11, "id");
                                AbstractC0397Ej.z(constraintLayout3, new Zo0(str11));
                                return;
                            }
                            return;
                        case 2:
                            ConstraintLayout constraintLayout4 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            Context context4 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                jo2.y();
                                C2109lo0 c2109lo11 = jo2.w;
                                if (c2109lo11 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str12 = c2109lo11.a;
                                AbstractC1474fG.j(str12, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C0822Ut(str12));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment) {
                                C2109lo0 c2109lo12 = jo2.w;
                                if (c2109lo12 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str13 = c2109lo12.a;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC0397Ej.z(constraintLayout4, new DC(str13));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                C2109lo0 c2109lo13 = jo2.w;
                                if (c2109lo13 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str14 = c2109lo13.a;
                                AbstractC1474fG.j(str14, "id");
                                AbstractC0397Ej.z(constraintLayout4, new RR(str14));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                C2109lo0 c2109lo14 = jo2.w;
                                if (c2109lo14 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str15 = c2109lo14.a;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C2265nR(str15));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                C2109lo0 c2109lo15 = jo2.w;
                                if (c2109lo15 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str16 = c2109lo15.a;
                                AbstractC1474fG.j(str16, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C3078vo0(str16));
                                return;
                            }
                            return;
                        default:
                            ConstraintLayout constraintLayout5 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            Context context5 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof GenreTvFragment) {
                                C2109lo0 c2109lo16 = jo3.w;
                                if (c2109lo16 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str17 = c2109lo16.a;
                                AbstractC1474fG.j(str17, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C3389yz(str17));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof PeopleTvFragment) {
                                C2109lo0 c2109lo17 = jo3.w;
                                if (c2109lo17 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str18 = c2109lo17.a;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2659rY(str18));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                jo3.y();
                                C2109lo0 c2109lo18 = jo3.w;
                                if (c2109lo18 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str19 = c2109lo18.a;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C3147wa0(str19));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof TvShowsTvFragment) {
                                C2109lo0 c2109lo19 = jo3.w;
                                if (c2109lo19 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str20 = c2109lo19.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C1329dp0(str20));
                                return;
                            }
                            return;
                    }
                }
            });
            constraintLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.Fo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i3) {
                        case 0:
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout2, "$this_apply");
                            jo0.y();
                            Context context2 = constraintLayout2.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C2109lo0 c2109lo1 = jo0.w;
                            if (c2109lo1 != null) {
                                new Fd0(context2, c2109lo1).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 1:
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            ConstraintLayout constraintLayout3 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout3, "$this_apply");
                            jo1.y();
                            Context context3 = constraintLayout3.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C2109lo0 c2109lo2 = jo1.w;
                            if (c2109lo2 != null) {
                                new DialogC2432p5(context3, c2109lo2).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 2:
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            ConstraintLayout constraintLayout4 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            jo2.y();
                            Context context4 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            C2109lo0 c2109lo3 = jo2.w;
                            if (c2109lo3 != null) {
                                new Fd0(context4, c2109lo3).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        default:
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            ConstraintLayout constraintLayout5 = constraintLayout;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            jo3.y();
                            Context context5 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            C2109lo0 c2109lo4 = jo3.w;
                            if (c2109lo4 != null) {
                                new DialogC2432p5(context5, c2109lo4).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                    }
                }
            });
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(context);
            C2109lo0 c2109lo1 = this.w;
            if (c2109lo1 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E.n(c2109lo1.h).g(c0789Tm)).p(300, 450)).c()).H(ug.m);
            C2109lo0 c2109lo2 = this.w;
            if (c2109lo2 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str2 = c2109lo2.f;
            str = str2 != null ? str2 : "";
            TextView textView = ug.f551o;
            textView.setText(str);
            C2109lo0 c2109lo3 = this.w;
            if (c2109lo3 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str3 = c2109lo3.f;
            textView.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo4 = this.w;
            if (c2109lo4 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Ma0 ma0 = (Ma0) AbstractC0911Ye.j0(c2109lo4.k);
            if (ma0 == null) {
                string9 = context.getString(R.string.tv_show_item_type);
            } else {
                C0456Gq c0456Gq = (C0456Gq) AbstractC0911Ye.j0(ma0.f);
                if (c0456Gq != null) {
                    int i6 = ma0.b;
                    string9 = i6 != 0 ? context.getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(i6), Integer.valueOf(c0456Gq.b)) : context.getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq.b));
                } else {
                    string9 = null;
                }
                if (string9 == null) {
                    string9 = context.getString(R.string.tv_show_item_type);
                }
            }
            ug.n.setText(string9);
            C2109lo0 c2109lo5 = this.w;
            if (c2109lo5 != null) {
                ug.p.setText(c2109lo5.b);
                return;
            } else {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof VG) {
            VG vg = (VG) interfaceC2604qt0;
            AbstractC1474fG.i(context, "context");
            AbstractActivityC1540fx abstractActivityC1540fx = context instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context : null;
            if ((abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null) instanceof MoviesHomeTvFragment) {
                ConstraintLayout constraintLayout2 = vg.l;
                AbstractC1474fG.i(constraintLayout2, "getRoot(...)");
                CardView cardView = vg.m;
                AbstractC1474fG.i(cardView, "cvTvShowPoster");
                AbstractC0397Ej.y(constraintLayout2, cardView);
            }
            final ConstraintLayout constraintLayout3 = vg.l;
            constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: o.Eo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            ConstraintLayout constraintLayout4 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            Context context2 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof FavoritesTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo6 = jo0.w;
                                if (c2109lo6 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str4 = c2109lo6.a;
                                AbstractC1474fG.j(str4, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C0926Yt(str4));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                                C2109lo0 c2109lo7 = jo0.w;
                                if (c2109lo7 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str5 = c2109lo7.a;
                                AbstractC1474fG.j(str5, "id");
                                AbstractC0397Ej.z(constraintLayout4, new IC(str5));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesHomeTvFragment) {
                                C2109lo0 c2109lo8 = jo0.w;
                                if (c2109lo8 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str6 = c2109lo8.a;
                                AbstractC1474fG.j(str6, "id");
                                AbstractC0397Ej.z(constraintLayout4, new VR(str6));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MovieTvFragment) {
                                C2109lo0 c2109lo9 = jo0.w;
                                if (c2109lo9 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str7 = c2109lo9.a;
                                AbstractC1474fG.j(str7, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C2943uR(str7));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof TvShowTvFragment) {
                                C2109lo0 c2109lo10 = jo0.w;
                                if (c2109lo10 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str8 = c2109lo10.a;
                                AbstractC1474fG.j(str8, "id");
                                AbstractC0397Ej.z(constraintLayout4, new Do0(str8));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo11 = jo0.w;
                                if (c2109lo11 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str9 = c2109lo11.a;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC0397Ej.z(constraintLayout4, new C3147wa0(str9));
                                return;
                            }
                            return;
                        case 1:
                            ConstraintLayout constraintLayout5 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            Context context3 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C2109lo0 c2109lo12 = jo1.w;
                                if (c2109lo12 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str10 = c2109lo12.a;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2904tz(str10));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C2109lo0 c2109lo13 = jo1.w;
                                if (c2109lo13 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str11 = c2109lo13.a;
                                AbstractC1474fG.j(str11, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2175mY(str11));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                jo1.y();
                                C2109lo0 c2109lo14 = jo1.w;
                                if (c2109lo14 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str12 = c2109lo14.a;
                                AbstractC1474fG.j(str12, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2275na0(str12));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof TvShowsMobileFragment) {
                                C2109lo0 c2109lo15 = jo1.w;
                                if (c2109lo15 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str13 = c2109lo15.a;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC0397Ej.z(constraintLayout5, new Zo0(str13));
                                return;
                            }
                            return;
                        case 2:
                            ConstraintLayout constraintLayout6 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            Context context4 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                jo2.y();
                                C2109lo0 c2109lo16 = jo2.w;
                                if (c2109lo16 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str14 = c2109lo16.a;
                                AbstractC1474fG.j(str14, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C0822Ut(str14));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment) {
                                C2109lo0 c2109lo17 = jo2.w;
                                if (c2109lo17 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str15 = c2109lo17.a;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC0397Ej.z(constraintLayout6, new DC(str15));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                C2109lo0 c2109lo18 = jo2.w;
                                if (c2109lo18 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str16 = c2109lo18.a;
                                AbstractC1474fG.j(str16, "id");
                                AbstractC0397Ej.z(constraintLayout6, new RR(str16));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                C2109lo0 c2109lo19 = jo2.w;
                                if (c2109lo19 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str17 = c2109lo19.a;
                                AbstractC1474fG.j(str17, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2265nR(str17));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                C2109lo0 c2109lo110 = jo2.w;
                                if (c2109lo110 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str18 = c2109lo110.a;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C3078vo0(str18));
                                return;
                            }
                            return;
                        default:
                            ConstraintLayout constraintLayout7 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            Context context5 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof GenreTvFragment) {
                                C2109lo0 c2109lo111 = jo3.w;
                                if (c2109lo111 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str19 = c2109lo111.a;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C3389yz(str19));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof PeopleTvFragment) {
                                C2109lo0 c2109lo112 = jo3.w;
                                if (c2109lo112 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str110 = c2109lo112.a;
                                AbstractC1474fG.j(str110, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2659rY(str110));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                jo3.y();
                                C2109lo0 c2109lo113 = jo3.w;
                                if (c2109lo113 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str111 = c2109lo113.a;
                                AbstractC1474fG.j(str111, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C3147wa0(str111));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof TvShowsTvFragment) {
                                C2109lo0 c2109lo114 = jo3.w;
                                if (c2109lo114 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str20 = c2109lo114.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C1329dp0(str20));
                                return;
                            }
                            return;
                    }
                }
            });
            constraintLayout3.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.Fo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i4) {
                        case 0:
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            ConstraintLayout constraintLayout4 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout4, "$this_apply");
                            jo0.y();
                            Context context2 = constraintLayout4.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C2109lo0 c2109lo6 = jo0.w;
                            if (c2109lo6 != null) {
                                new Fd0(context2, c2109lo6).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 1:
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            ConstraintLayout constraintLayout5 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            jo1.y();
                            Context context3 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C2109lo0 c2109lo7 = jo1.w;
                            if (c2109lo7 != null) {
                                new DialogC2432p5(context3, c2109lo7).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 2:
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            ConstraintLayout constraintLayout6 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            jo2.y();
                            Context context4 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            C2109lo0 c2109lo8 = jo2.w;
                            if (c2109lo8 != null) {
                                new Fd0(context4, c2109lo8).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        default:
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            ConstraintLayout constraintLayout7 = constraintLayout3;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            jo3.y();
                            Context context5 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            C2109lo0 c2109lo9 = jo3.w;
                            if (c2109lo9 != null) {
                                new DialogC2432p5(context5, c2109lo9).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                    }
                }
            });
            constraintLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0637Nq(constraintLayout3, vg, this, 4));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70B = com.bumptech.glide.a.b(context).b(context);
            C2109lo0 c2109lo6 = this.w;
            if (c2109lo6 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70B.n(c2109lo6.h).g(c0789Tm)).p(300, 450)).j(R.drawable.glide_fallback_cover)).c()).H(vg.n);
            C2109lo0 c2109lo7 = this.w;
            if (c2109lo7 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str4 = c2109lo7.f;
            str = str4 != null ? str4 : "";
            TextView textView2 = vg.p;
            textView2.setText(str);
            C2109lo0 c2109lo8 = this.w;
            if (c2109lo8 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str5 = c2109lo8.f;
            textView2.setVisibility((str5 == null || str5.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo9 = this.w;
            if (c2109lo9 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Ma0 ma1 = (Ma0) AbstractC0911Ye.j0(c2109lo9.k);
            if (ma1 == null) {
                string8 = context.getString(R.string.tv_show_item_type);
            } else {
                C0456Gq c0456Gq2 = (C0456Gq) AbstractC0911Ye.j0(ma1.f);
                if (c0456Gq2 != null) {
                    int i7 = ma1.b;
                    string8 = i7 != 0 ? context.getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(i7), Integer.valueOf(c0456Gq2.b)) : context.getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq2.b));
                } else {
                    string8 = null;
                }
                if (string8 == null) {
                    string8 = context.getString(R.string.tv_show_item_type);
                }
            }
            vg.f569o.setText(string8);
            C2109lo0 c2109lo10 = this.w;
            if (c2109lo10 != null) {
                vg.q.setText(c2109lo10.b);
                return;
            } else {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof TG) {
            TG tg = (TG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout4 = tg.l;
            constraintLayout4.setOnClickListener(new View.OnClickListener() { // from class: o.Eo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            ConstraintLayout constraintLayout5 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            Context context2 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof FavoritesTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo11 = jo0.w;
                                if (c2109lo11 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str6 = c2109lo11.a;
                                AbstractC1474fG.j(str6, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C0926Yt(str6));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                                C2109lo0 c2109lo12 = jo0.w;
                                if (c2109lo12 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str7 = c2109lo12.a;
                                AbstractC1474fG.j(str7, "id");
                                AbstractC0397Ej.z(constraintLayout5, new IC(str7));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesHomeTvFragment) {
                                C2109lo0 c2109lo13 = jo0.w;
                                if (c2109lo13 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str8 = c2109lo13.a;
                                AbstractC1474fG.j(str8, "id");
                                AbstractC0397Ej.z(constraintLayout5, new VR(str8));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MovieTvFragment) {
                                C2109lo0 c2109lo14 = jo0.w;
                                if (c2109lo14 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str9 = c2109lo14.a;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C2943uR(str9));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof TvShowTvFragment) {
                                C2109lo0 c2109lo15 = jo0.w;
                                if (c2109lo15 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str10 = c2109lo15.a;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC0397Ej.z(constraintLayout5, new Do0(str10));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo16 = jo0.w;
                                if (c2109lo16 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str11 = c2109lo16.a;
                                AbstractC1474fG.j(str11, "id");
                                AbstractC0397Ej.z(constraintLayout5, new C3147wa0(str11));
                                return;
                            }
                            return;
                        case 1:
                            ConstraintLayout constraintLayout6 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            Context context3 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C2109lo0 c2109lo17 = jo1.w;
                                if (c2109lo17 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str12 = c2109lo17.a;
                                AbstractC1474fG.j(str12, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2904tz(str12));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C2109lo0 c2109lo18 = jo1.w;
                                if (c2109lo18 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str13 = c2109lo18.a;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2175mY(str13));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                jo1.y();
                                C2109lo0 c2109lo19 = jo1.w;
                                if (c2109lo19 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str14 = c2109lo19.a;
                                AbstractC1474fG.j(str14, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2275na0(str14));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof TvShowsMobileFragment) {
                                C2109lo0 c2109lo110 = jo1.w;
                                if (c2109lo110 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str15 = c2109lo110.a;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC0397Ej.z(constraintLayout6, new Zo0(str15));
                                return;
                            }
                            return;
                        case 2:
                            ConstraintLayout constraintLayout7 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            Context context4 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                jo2.y();
                                C2109lo0 c2109lo111 = jo2.w;
                                if (c2109lo111 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str16 = c2109lo111.a;
                                AbstractC1474fG.j(str16, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C0822Ut(str16));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment) {
                                C2109lo0 c2109lo112 = jo2.w;
                                if (c2109lo112 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str17 = c2109lo112.a;
                                AbstractC1474fG.j(str17, "id");
                                AbstractC0397Ej.z(constraintLayout7, new DC(str17));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                C2109lo0 c2109lo113 = jo2.w;
                                if (c2109lo113 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str18 = c2109lo113.a;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC0397Ej.z(constraintLayout7, new RR(str18));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                C2109lo0 c2109lo114 = jo2.w;
                                if (c2109lo114 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str19 = c2109lo114.a;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2265nR(str19));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                C2109lo0 c2109lo115 = jo2.w;
                                if (c2109lo115 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str110 = c2109lo115.a;
                                AbstractC1474fG.j(str110, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C3078vo0(str110));
                                return;
                            }
                            return;
                        default:
                            ConstraintLayout constraintLayout8 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            Context context5 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof GenreTvFragment) {
                                C2109lo0 c2109lo116 = jo3.w;
                                if (c2109lo116 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str111 = c2109lo116.a;
                                AbstractC1474fG.j(str111, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C3389yz(str111));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof PeopleTvFragment) {
                                C2109lo0 c2109lo117 = jo3.w;
                                if (c2109lo117 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str112 = c2109lo117.a;
                                AbstractC1474fG.j(str112, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2659rY(str112));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                jo3.y();
                                C2109lo0 c2109lo118 = jo3.w;
                                if (c2109lo118 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str113 = c2109lo118.a;
                                AbstractC1474fG.j(str113, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C3147wa0(str113));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof TvShowsTvFragment) {
                                C2109lo0 c2109lo119 = jo3.w;
                                if (c2109lo119 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str20 = c2109lo119.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C1329dp0(str20));
                                return;
                            }
                            return;
                    }
                }
            });
            constraintLayout4.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.Fo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i5) {
                        case 0:
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            ConstraintLayout constraintLayout5 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout5, "$this_apply");
                            jo0.y();
                            Context context2 = constraintLayout5.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C2109lo0 c2109lo11 = jo0.w;
                            if (c2109lo11 != null) {
                                new Fd0(context2, c2109lo11).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 1:
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            ConstraintLayout constraintLayout6 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            jo1.y();
                            Context context3 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C2109lo0 c2109lo12 = jo1.w;
                            if (c2109lo12 != null) {
                                new DialogC2432p5(context3, c2109lo12).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 2:
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            ConstraintLayout constraintLayout7 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            jo2.y();
                            Context context4 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            C2109lo0 c2109lo13 = jo2.w;
                            if (c2109lo13 != null) {
                                new Fd0(context4, c2109lo13).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        default:
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            ConstraintLayout constraintLayout8 = constraintLayout4;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            jo3.y();
                            Context context5 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            C2109lo0 c2109lo14 = jo3.w;
                            if (c2109lo14 != null) {
                                new DialogC2432p5(context5, c2109lo14).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                    }
                }
            });
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E2 = com.bumptech.glide.a.e(context);
            C2109lo0 c2109lo11 = this.w;
            if (c2109lo11 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E2.n(c2109lo11.h).g(c0789Tm)).p(300, 450)).c()).H(tg.m);
            C2109lo0 c2109lo12 = this.w;
            if (c2109lo12 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str6 = c2109lo12.f;
            str = str6 != null ? str6 : "";
            TextView textView3 = tg.f531o;
            textView3.setText(str);
            C2109lo0 c2109lo13 = this.w;
            if (c2109lo13 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str7 = c2109lo13.f;
            textView3.setVisibility((str7 == null || str7.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo14 = this.w;
            if (c2109lo14 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Ma0 ma2 = (Ma0) AbstractC0911Ye.j0(c2109lo14.k);
            if (ma2 == null) {
                string7 = context.getString(R.string.tv_show_item_type);
            } else {
                C0456Gq c0456Gq3 = (C0456Gq) AbstractC0911Ye.j0(ma2.f);
                if (c0456Gq3 != null) {
                    int i8 = ma2.b;
                    string7 = i8 != 0 ? context.getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(i8), Integer.valueOf(c0456Gq3.b)) : context.getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq3.b));
                } else {
                    string7 = null;
                }
                if (string7 == null) {
                    string7 = context.getString(R.string.tv_show_item_type);
                }
            }
            tg.n.setText(string7);
            C2109lo0 c2109lo15 = this.w;
            if (c2109lo15 != null) {
                tg.p.setText(c2109lo15.b);
                return;
            } else {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof SG) {
            SG sg = (SG) interfaceC2604qt0;
            final ConstraintLayout constraintLayout5 = sg.l;
            final int i9 = 3;
            constraintLayout5.setOnClickListener(new View.OnClickListener() { // from class: o.Eo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            ConstraintLayout constraintLayout6 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            Context context2 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context2);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                            if (abstractComponentCallbacksC1247cxO instanceof FavoritesTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo16 = jo0.w;
                                if (c2109lo16 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str8 = c2109lo16.a;
                                AbstractC1474fG.j(str8, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C0926Yt(str8));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                                C2109lo0 c2109lo17 = jo0.w;
                                if (c2109lo17 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str9 = c2109lo17.a;
                                AbstractC1474fG.j(str9, "id");
                                AbstractC0397Ej.z(constraintLayout6, new IC(str9));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MoviesHomeTvFragment) {
                                C2109lo0 c2109lo18 = jo0.w;
                                if (c2109lo18 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str10 = c2109lo18.a;
                                AbstractC1474fG.j(str10, "id");
                                AbstractC0397Ej.z(constraintLayout6, new VR(str10));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof MovieTvFragment) {
                                C2109lo0 c2109lo19 = jo0.w;
                                if (c2109lo19 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str11 = c2109lo19.a;
                                AbstractC1474fG.j(str11, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C2943uR(str11));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof TvShowTvFragment) {
                                C2109lo0 c2109lo110 = jo0.w;
                                if (c2109lo110 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str12 = c2109lo110.a;
                                AbstractC1474fG.j(str12, "id");
                                AbstractC0397Ej.z(constraintLayout6, new Do0(str12));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO instanceof SearchTvFragment) {
                                jo0.y();
                                C2109lo0 c2109lo111 = jo0.w;
                                if (c2109lo111 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str13 = c2109lo111.a;
                                AbstractC1474fG.j(str13, "id");
                                AbstractC0397Ej.z(constraintLayout6, new C3147wa0(str13));
                                return;
                            }
                            return;
                        case 1:
                            ConstraintLayout constraintLayout7 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            Context context3 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ2 = AbstractC0397Ej.J(context3);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fxJ2 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ2) : null;
                            if (abstractComponentCallbacksC1247cxO2 instanceof GenreMobileFragment) {
                                C2109lo0 c2109lo112 = jo1.w;
                                if (c2109lo112 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str14 = c2109lo112.a;
                                AbstractC1474fG.j(str14, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2904tz(str14));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof PeopleMobileFragment) {
                                C2109lo0 c2109lo113 = jo1.w;
                                if (c2109lo113 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str15 = c2109lo113.a;
                                AbstractC1474fG.j(str15, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2175mY(str15));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof SearchMobileFragment) {
                                jo1.y();
                                C2109lo0 c2109lo114 = jo1.w;
                                if (c2109lo114 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str16 = c2109lo114.a;
                                AbstractC1474fG.j(str16, "id");
                                AbstractC0397Ej.z(constraintLayout7, new C2275na0(str16));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO2 instanceof TvShowsMobileFragment) {
                                C2109lo0 c2109lo115 = jo1.w;
                                if (c2109lo115 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str17 = c2109lo115.a;
                                AbstractC1474fG.j(str17, "id");
                                AbstractC0397Ej.z(constraintLayout7, new Zo0(str17));
                                return;
                            }
                            return;
                        case 2:
                            ConstraintLayout constraintLayout8 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            Context context4 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ3 = AbstractC0397Ej.J(context4);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fxJ3 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ3) : null;
                            if (abstractComponentCallbacksC1247cxO3 instanceof FavoritesMobileFragment) {
                                jo2.y();
                                C2109lo0 c2109lo116 = jo2.w;
                                if (c2109lo116 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str18 = c2109lo116.a;
                                AbstractC1474fG.j(str18, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C0822Ut(str18));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof HomeMobileFragment) {
                                C2109lo0 c2109lo117 = jo2.w;
                                if (c2109lo117 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str19 = c2109lo117.a;
                                AbstractC1474fG.j(str19, "id");
                                AbstractC0397Ej.z(constraintLayout8, new DC(str19));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MoviesHomeMobileFragment) {
                                C2109lo0 c2109lo118 = jo2.w;
                                if (c2109lo118 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str110 = c2109lo118.a;
                                AbstractC1474fG.j(str110, "id");
                                AbstractC0397Ej.z(constraintLayout8, new RR(str110));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof MovieMobileFragment) {
                                C2109lo0 c2109lo119 = jo2.w;
                                if (c2109lo119 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str111 = c2109lo119.a;
                                AbstractC1474fG.j(str111, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C2265nR(str111));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO3 instanceof TvShowMobileFragment) {
                                C2109lo0 c2109lo1110 = jo2.w;
                                if (c2109lo1110 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str112 = c2109lo1110.a;
                                AbstractC1474fG.j(str112, "id");
                                AbstractC0397Ej.z(constraintLayout8, new C3078vo0(str112));
                                return;
                            }
                            return;
                        default:
                            ConstraintLayout constraintLayout9 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            Context context5 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            AbstractActivityC1540fx abstractActivityC1540fxJ4 = AbstractC0397Ej.J(context5);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fxJ4 != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ4) : null;
                            if (abstractComponentCallbacksC1247cxO4 instanceof GenreTvFragment) {
                                C2109lo0 c2109lo1111 = jo3.w;
                                if (c2109lo1111 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str113 = c2109lo1111.a;
                                AbstractC1474fG.j(str113, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C3389yz(str113));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof PeopleTvFragment) {
                                C2109lo0 c2109lo1112 = jo3.w;
                                if (c2109lo1112 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str114 = c2109lo1112.a;
                                AbstractC1474fG.j(str114, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C2659rY(str114));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof SearchTvFragment) {
                                jo3.y();
                                C2109lo0 c2109lo1113 = jo3.w;
                                if (c2109lo1113 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str115 = c2109lo1113.a;
                                AbstractC1474fG.j(str115, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C3147wa0(str115));
                                return;
                            }
                            if (abstractComponentCallbacksC1247cxO4 instanceof TvShowsTvFragment) {
                                C2109lo0 c2109lo1114 = jo3.w;
                                if (c2109lo1114 == null) {
                                    AbstractC1474fG.U("tvShow");
                                    throw null;
                                }
                                String str20 = c2109lo1114.a;
                                AbstractC1474fG.j(str20, "id");
                                AbstractC0397Ej.z(constraintLayout9, new C1329dp0(str20));
                                return;
                            }
                            return;
                    }
                }
            });
            constraintLayout5.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.Fo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    switch (i9) {
                        case 0:
                            Jo0 jo0 = this;
                            AbstractC1474fG.j(jo0, "this$0");
                            ConstraintLayout constraintLayout6 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout6, "$this_apply");
                            jo0.y();
                            Context context2 = constraintLayout6.getContext();
                            AbstractC1474fG.i(context2, "getContext(...)");
                            C2109lo0 c2109lo16 = jo0.w;
                            if (c2109lo16 != null) {
                                new Fd0(context2, c2109lo16).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 1:
                            Jo0 jo1 = this;
                            AbstractC1474fG.j(jo1, "this$0");
                            ConstraintLayout constraintLayout7 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout7, "$this_apply");
                            jo1.y();
                            Context context3 = constraintLayout7.getContext();
                            AbstractC1474fG.i(context3, "getContext(...)");
                            C2109lo0 c2109lo17 = jo1.w;
                            if (c2109lo17 != null) {
                                new DialogC2432p5(context3, c2109lo17).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        case 2:
                            Jo0 jo2 = this;
                            AbstractC1474fG.j(jo2, "this$0");
                            ConstraintLayout constraintLayout8 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout8, "$this_apply");
                            jo2.y();
                            Context context4 = constraintLayout8.getContext();
                            AbstractC1474fG.i(context4, "getContext(...)");
                            C2109lo0 c2109lo18 = jo2.w;
                            if (c2109lo18 != null) {
                                new Fd0(context4, c2109lo18).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        default:
                            Jo0 jo3 = this;
                            AbstractC1474fG.j(jo3, "this$0");
                            ConstraintLayout constraintLayout9 = constraintLayout5;
                            AbstractC1474fG.j(constraintLayout9, "$this_apply");
                            jo3.y();
                            Context context5 = constraintLayout9.getContext();
                            AbstractC1474fG.i(context5, "getContext(...)");
                            C2109lo0 c2109lo19 = jo3.w;
                            if (c2109lo19 != null) {
                                new DialogC2432p5(context5, c2109lo19).show();
                                return true;
                            }
                            AbstractC1474fG.U("tvShow");
                            throw null;
                    }
                }
            });
            constraintLayout5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(constraintLayout5, 8, sg));
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E3 = com.bumptech.glide.a.e(context);
            C2109lo0 c2109lo16 = this.w;
            if (c2109lo16 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) ((C2630r70) componentCallbacks2C3406z70E3.n(c2109lo16.h).L().r(EnumC1651h30.m)).g(c0789Tm)).p(300, 450)).j(R.drawable.glide_fallback_cover)).c()).H(sg.m);
            C2109lo0 c2109lo17 = this.w;
            if (c2109lo17 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str8 = c2109lo17.f;
            str = str8 != null ? str8 : "";
            TextView textView4 = sg.f508o;
            textView4.setText(str);
            C2109lo0 c2109lo18 = this.w;
            if (c2109lo18 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str9 = c2109lo18.f;
            textView4.setVisibility((str9 == null || str9.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo19 = this.w;
            if (c2109lo19 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Ma0 ma3 = (Ma0) AbstractC0911Ye.j0(c2109lo19.k);
            if (ma3 == null) {
                string6 = context.getString(R.string.tv_show_item_type);
            } else {
                C0456Gq c0456Gq4 = (C0456Gq) AbstractC0911Ye.j0(ma3.f);
                if (c0456Gq4 != null) {
                    int i10 = ma3.b;
                    string6 = i10 != 0 ? context.getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(i10), Integer.valueOf(c0456Gq4.b)) : context.getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq4.b));
                } else {
                    string6 = null;
                }
                if (string6 == null) {
                    string6 = context.getString(R.string.tv_show_item_type);
                }
            }
            sg.n.setText(string6);
            C2109lo0 c2109lo20 = this.w;
            if (c2109lo20 != null) {
                sg.p.setText(c2109lo20.b);
                return;
            } else {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
        }
        if (interfaceC2604qt0 instanceof C2932uG) {
            C2932uG c2932uG = (C2932uG) interfaceC2604qt0;
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E4 = com.bumptech.glide.a.e(context);
            C2109lo0 c2109lo21 = this.w;
            if (c2109lo21 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ((C2630r70) componentCallbacks2C3406z70E4.n(c2109lo21.i).c()).H(c2932uG.n);
            C2109lo0 c2109lo22 = this.w;
            if (c2109lo22 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            c2932uG.u.setText(c2109lo22.b);
            C2109lo0 c2109lo23 = this.w;
            if (c2109lo23 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Ma0 ma4 = (Ma0) AbstractC0911Ye.j0(c2109lo23.k);
            TextView textView5 = c2932uG.v;
            if (ma4 == null) {
                string5 = textView5.getContext().getString(R.string.tv_show_item_type);
            } else {
                C0456Gq c0456Gq5 = (C0456Gq) AbstractC0911Ye.j0(ma4.f);
                string5 = c0456Gq5 != null ? ma4.b != 0 ? textView5.getContext().getString(R.string.tv_show_item_season_number_episode_number, Integer.valueOf(ma4.b), Integer.valueOf(c0456Gq5.b)) : textView5.getContext().getString(R.string.tv_show_item_episode_number, Integer.valueOf(c0456Gq5.b)) : null;
                if (string5 == null) {
                    string5 = textView5.getContext().getString(R.string.tv_show_item_type);
                }
            }
            textView5.setText(string5);
            C2109lo0 c2109lo24 = this.w;
            if (c2109lo24 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str10 = c2109lo24.f;
            TextView textView6 = c2932uG.r;
            textView6.setText(str10);
            CharSequence text = textView6.getText();
            textView6.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo25 = this.w;
            if (c2109lo25 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Calendar calendar = c2109lo25.p;
            String strM = calendar != null ? AbstractC0397Ej.m(calendar, "yyyy") : null;
            TextView textView7 = c2932uG.t;
            textView7.setText(strM);
            CharSequence text2 = textView7.getText();
            textView7.setVisibility((text2 == null || text2.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo26 = this.w;
            if (c2109lo26 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Double d = c2109lo26.g;
            String str11 = d != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1)) : "N/A";
            TextView textView8 = c2932uG.s;
            textView8.setText(str11);
            CharSequence text3 = textView8.getText();
            textView8.setVisibility((text3 == null || text3.length() == 0) ? 8 : 0);
            c2932uG.f1053o.setVisibility(textView8.getVisibility());
            TextView textView9 = c2932uG.q;
            textView9.setOnClickListener(new AR(textView9, 1));
            C2109lo0 c2109lo27 = this.w;
            if (c2109lo27 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            textView9.setText(c2109lo27.c);
            TextView textView10 = c2932uG.m;
            textView10.setOnClickListener(new ViewOnClickListenerC1010ac(textView10, 17, this));
            c2932uG.p.setVisibility(8);
            return;
        }
        if (interfaceC2604qt0 instanceof C2675rh) {
            C2675rh c2675rh = (C2675rh) interfaceC2604qt0;
            ImageView imageView = c2675rh.p;
            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E5 = com.bumptech.glide.a.e(imageView.getContext());
            C2109lo0 c2109lo28 = this.w;
            if (c2109lo28 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            componentCallbacks2C3406z70E5.n(c2109lo28.h).H(imageView);
            C2109lo0 c2109lo29 = this.w;
            if (c2109lo29 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str12 = c2109lo29.h;
            imageView.setVisibility((str12 == null || str12.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo30 = this.w;
            if (c2109lo30 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            c2675rh.y.setText(c2109lo30.b);
            C2109lo0 c2109lo31 = this.w;
            if (c2109lo31 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Double d2 = c2109lo31.g;
            c2675rh.v.setText(d2 != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2.doubleValue())}, 1)) : "N/A");
            C2109lo0 c2109lo32 = this.w;
            if (c2109lo32 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String str13 = c2109lo32.f;
            TextView textView11 = c2675rh.u;
            textView11.setText(str13);
            CharSequence text4 = textView11.getText();
            textView11.setVisibility((text4 == null || text4.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo33 = this.w;
            if (c2109lo33 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Calendar calendar2 = c2109lo33.p;
            String strM2 = calendar2 != null ? AbstractC0397Ej.m(calendar2, "yyyy") : null;
            TextView textView12 = c2675rh.w;
            textView12.setText(strM2);
            CharSequence text5 = textView12.getText();
            textView12.setVisibility((text5 == null || text5.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo34 = this.w;
            if (c2109lo34 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            Integer num = c2109lo34.d;
            TextView textView13 = c2675rh.x;
            if (num != null) {
                int iIntValue = num.intValue();
                int i11 = iIntValue / 60;
                int i12 = iIntValue % 60;
                string3 = i11 > 0 ? textView13.getContext().getString(R.string.tv_show_runtime_hours_minutes, Integer.valueOf(i11), Integer.valueOf(i12)) : textView13.getContext().getString(R.string.tv_show_runtime_minutes, Integer.valueOf(i12));
            } else {
                string3 = null;
            }
            textView13.setText(string3);
            CharSequence text6 = textView13.getText();
            textView13.setVisibility((text6 == null || text6.length() == 0) ? 8 : 0);
            C2109lo0 c2109lo35 = this.w;
            if (c2109lo35 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            String strH0 = AbstractC0911Ye.h0(c2109lo35.l, ", ", null, null, X10.L, 30);
            TextView textView14 = c2675rh.s;
            textView14.setText(strH0);
            C2109lo0 c2109lo36 = this.w;
            if (c2109lo36 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            textView14.setVisibility(c2109lo36.l.isEmpty() ? 8 : 0);
            C2109lo0 c2109lo37 = this.w;
            if (c2109lo37 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            c2675rh.t.setText(c2109lo37.c);
            C2109lo0 c2109lo38 = this.w;
            if (c2109lo38 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = c2109lo38.k.iterator();
            while (it.hasNext()) {
                AbstractC1406ef.Q(arrayList, ((Ma0) it.next()).f);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C0456Gq) obj).j != null) {
                    arrayList2.add(obj);
                }
            }
            final C0456Gq c0456Gq6 = (C0456Gq) AbstractC0911Ye.d0(AbstractC0911Ye.r0(arrayList2, new C1749i30(9)));
            if (c0456Gq6 == null) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((C0456Gq) listIterator.previous()).h) {
                            iNextIndex2 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex2 = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(iNextIndex2);
                if (iNextIndex2 == -1 || iNextIndex2 + 1 >= arrayList.size()) {
                    numValueOf = null;
                }
                c0456Gq6 = numValueOf != null ? (C0456Gq) AbstractC0911Ye.e0(numValueOf.intValue() + 1, arrayList) : null;
                if (c0456Gq6 == null) {
                    C2109lo0 c2109lo39 = this.w;
                    if (c2109lo39 == null) {
                        AbstractC1474fG.U("tvShow");
                        throw null;
                    }
                    Iterator it2 = c2109lo39.k.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((Ma0) next2).b == 0);
                    Ma0 ma5 = (Ma0) next2;
                    c0456Gq6 = (ma5 == null || (list2 = ma5.f) == null) ? null : (C0456Gq) AbstractC0911Ye.d0(list2);
                    if (c0456Gq6 == null) {
                        c0456Gq6 = (C0456Gq) AbstractC0911Ye.d0(arrayList);
                    }
                }
            }
            final TextView textView15 = c2675rh.f1006o;
            textView15.setOnClickListener(new View.OnClickListener() { // from class: o.Go0
                /* JADX WARN: Code duplicated, block: B:21:0x0079  */
                /* JADX WARN: Code duplicated, block: B:23:0x0087  */
                /* JADX WARN: Code duplicated, block: B:57:0x016a  */
                /* JADX WARN: Code duplicated, block: B:59:0x0178  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string10;
                    String string11;
                    String string12;
                    String string13;
                    C0456Gq c0456Gq7 = c0456Gq6;
                    Jo0 jo0 = this;
                    TextView textView16 = textView15;
                    switch (i4) {
                        case 0:
                            AbstractC1474fG.j(textView16, "$this_apply");
                            AbstractC1474fG.j(jo0, "this$0");
                            if (c0456Gq7 == null) {
                                return;
                            }
                            String str14 = c0456Gq7.a;
                            C2109lo0 c2109lo40 = jo0.w;
                            if (c2109lo40 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str15 = c2109lo40.b;
                            Ma0 ma6 = c0456Gq7.f;
                            if (ma6 == null) {
                                Context context2 = textView16.getContext();
                                Integer numValueOf2 = Integer.valueOf(c0456Gq7.b);
                                string10 = c0456Gq7.c;
                                if (string10 == null) {
                                    string10 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                    AbstractC1474fG.i(string10, "getString(...)");
                                }
                                string11 = context2.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf2, string10);
                            } else {
                                if (ma6.b == 0) {
                                    ma6 = null;
                                }
                                if (ma6 != null) {
                                    Context context3 = textView16.getContext();
                                    Integer numValueOf3 = Integer.valueOf(ma6.b);
                                    Integer numValueOf4 = Integer.valueOf(c0456Gq7.b);
                                    String string14 = c0456Gq7.c;
                                    if (string14 == null) {
                                        string14 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                        AbstractC1474fG.i(string14, "getString(...)");
                                    }
                                    string11 = context3.getString(R.string.player_subtitle_tv_show, numValueOf3, numValueOf4, string14);
                                    if (string11 == null) {
                                        Context context4 = textView16.getContext();
                                        Integer numValueOf5 = Integer.valueOf(c0456Gq7.b);
                                        string10 = c0456Gq7.c;
                                        if (string10 == null) {
                                            string10 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                            AbstractC1474fG.i(string10, "getString(...)");
                                        }
                                        string11 = context4.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf5, string10);
                                    }
                                } else {
                                    Context context5 = textView16.getContext();
                                    Integer numValueOf6 = Integer.valueOf(c0456Gq7.b);
                                    string10 = c0456Gq7.c;
                                    if (string10 == null) {
                                        string10 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                        AbstractC1474fG.i(string10, "getString(...)");
                                    }
                                    string11 = context5.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf6, string10);
                                }
                            }
                            AbstractC1474fG.g(string11);
                            String str16 = c0456Gq7.a;
                            int i13 = c0456Gq7.b;
                            String str17 = c0456Gq7.c;
                            String str18 = c0456Gq7.d;
                            C2109lo0 c2109lo41 = jo0.w;
                            if (c2109lo41 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            Gs0 gs0 = new Gs0(c2109lo41.a, c2109lo41.b, c2109lo41.h, c2109lo41.i);
                            Ma0 ma7 = c0456Gq7.f;
                            Hs0 hs0 = new Hs0(str16, i13, str17, str18, gs0, new Fs0(ma7 != null ? ma7.b : 0, ma7 != null ? ma7.c : null));
                            AbstractC1474fG.j(str14, "id");
                            AbstractC1474fG.j(str15, "title");
                            AbstractC0397Ej.z(textView16, new Bo0(str14, str15, string11, hs0));
                            return;
                        default:
                            AbstractC1474fG.j(textView16, "$this_apply");
                            AbstractC1474fG.j(jo0, "this$0");
                            if (c0456Gq7 == null) {
                                return;
                            }
                            String str19 = c0456Gq7.a;
                            C2109lo0 c2109lo42 = jo0.w;
                            if (c2109lo42 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str20 = c2109lo42.b;
                            Ma0 ma8 = c0456Gq7.f;
                            if (ma8 == null) {
                                Context context6 = textView16.getContext();
                                Integer numValueOf7 = Integer.valueOf(c0456Gq7.b);
                                string12 = c0456Gq7.c;
                                if (string12 == null) {
                                    string12 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                    AbstractC1474fG.i(string12, "getString(...)");
                                }
                                string13 = context6.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf7, string12);
                            } else {
                                if (ma8.b == 0) {
                                    ma8 = null;
                                }
                                if (ma8 != null) {
                                    Context context7 = textView16.getContext();
                                    Integer numValueOf8 = Integer.valueOf(ma8.b);
                                    Integer numValueOf9 = Integer.valueOf(c0456Gq7.b);
                                    String string15 = c0456Gq7.c;
                                    if (string15 == null) {
                                        string15 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                        AbstractC1474fG.i(string15, "getString(...)");
                                    }
                                    string13 = context7.getString(R.string.player_subtitle_tv_show, numValueOf8, numValueOf9, string15);
                                    if (string13 == null) {
                                        Context context8 = textView16.getContext();
                                        Integer numValueOf10 = Integer.valueOf(c0456Gq7.b);
                                        string12 = c0456Gq7.c;
                                        if (string12 == null) {
                                            string12 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                            AbstractC1474fG.i(string12, "getString(...)");
                                        }
                                        string13 = context8.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf10, string12);
                                    }
                                } else {
                                    Context context9 = textView16.getContext();
                                    Integer numValueOf11 = Integer.valueOf(c0456Gq7.b);
                                    string12 = c0456Gq7.c;
                                    if (string12 == null) {
                                        string12 = textView16.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq7.b));
                                        AbstractC1474fG.i(string12, "getString(...)");
                                    }
                                    string13 = context9.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf11, string12);
                                }
                            }
                            AbstractC1474fG.g(string13);
                            String str21 = c0456Gq7.a;
                            int i14 = c0456Gq7.b;
                            String str22 = c0456Gq7.c;
                            String str23 = c0456Gq7.d;
                            C2109lo0 c2109lo43 = jo0.w;
                            if (c2109lo43 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            Gs0 gs1 = new Gs0(c2109lo43.a, c2109lo43.b, c2109lo43.h, c2109lo43.i);
                            Ma0 ma9 = c0456Gq7.f;
                            Hs0 hs1 = new Hs0(str21, i14, str22, str23, gs1, new Fs0(ma9 != null ? ma9.b : 0, ma9 != null ? ma9.c : null));
                            AbstractC1474fG.j(str19, "id");
                            AbstractC1474fG.j(str20, "title");
                            AbstractC0397Ej.z(textView16, new C2884to0(str19, str20, string13, hs1));
                            return;
                    }
                }
            });
            if (c0456Gq6 != null) {
                Ma0 ma6 = c0456Gq6.f;
                if (ma6 == null) {
                    string4 = textView15.getContext().getString(R.string.tv_show_watch_episode, Integer.valueOf(c0456Gq6.b));
                } else {
                    if (ma6.b == 0) {
                        ma6 = null;
                    }
                    if (ma6 == null || (string4 = textView15.getContext().getString(R.string.tv_show_watch_season_episode, Integer.valueOf(ma6.b), Integer.valueOf(c0456Gq6.b))) == null) {
                        string4 = textView15.getContext().getString(R.string.tv_show_watch_episode, Integer.valueOf(c0456Gq6.b));
                    }
                }
                str = string4;
            }
            textView15.setText(str);
            textView15.setVisibility(c0456Gq6 != null ? 0 : 8);
            c2675rh.r.setVisibility(c0456Gq6 != null ? 8 : 0);
            C2123lv0 c2123lv0 = c0456Gq6 != null ? c0456Gq6.j : null;
            int i13 = c2123lv0 != null ? (int) ((c2123lv0.b * ((long) 100)) / c2123lv0.c) : 0;
            ProgressBar progressBar = c2675rh.q;
            progressBar.setProgress(i13);
            progressBar.setVisibility(c2123lv0 == null ? 8 : 0);
            c2675rh.n.setOnClickListener(new View.OnClickListener(this) { // from class: o.Ho0
                public final /* synthetic */ Jo0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3289xx c3289xxU;
                    C3289xx c3289xxU2;
                    switch (i4) {
                        case 0:
                            Jo0 jo0 = this.m;
                            AbstractC1474fG.j(jo0, "this$0");
                            C2109lo0 c2109lo40 = jo0.w;
                            if (c2109lo40 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str14 = c2109lo40.e;
                            Context context2 = jo0.v;
                            if (str14 == null) {
                                Toast.makeText(context2, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                            if (abstractActivityC1540fx2 == null || (c3289xxU = abstractActivityC1540fx2.u()) == null) {
                                return;
                            }
                            C2109lo0 c2109lo41 = jo0.w;
                            if (c2109lo41 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str15 = c2109lo41.e;
                            AbstractC1474fG.g(str15);
                            C2299nm0 c2299nm0 = new C2299nm0();
                            Bundle bundle = new Bundle();
                            bundle.putString("trailer_url", str15);
                            c2299nm0.U(bundle);
                            c2299nm0.Z(c3289xxU, "TrailerFragment");
                            return;
                        default:
                            Jo0 jo1 = this.m;
                            AbstractC1474fG.j(jo1, "this$0");
                            C2109lo0 c2109lo42 = jo1.w;
                            if (c2109lo42 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str16 = c2109lo42.e;
                            Context context3 = jo1.v;
                            if (str16 == null) {
                                Toast.makeText(context3, "Trailer no disponible", 0).show();
                                return;
                            }
                            AbstractActivityC1540fx abstractActivityC1540fx3 = context3 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context3 : null;
                            if (abstractActivityC1540fx3 == null || (c3289xxU2 = abstractActivityC1540fx3.u()) == null) {
                                return;
                            }
                            C2109lo0 c2109lo43 = jo1.w;
                            if (c2109lo43 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            String str17 = c2109lo43.e;
                            AbstractC1474fG.g(str17);
                            C2299nm0 c2299nm1 = new C2299nm0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("trailer_url", str17);
                            c2299nm1.U(bundle2);
                            c2299nm1.Z(c3289xxU2, "TrailerFragment");
                            return;
                    }
                }
            });
            final ImageView imageView2 = c2675rh.m;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: o.Io0
                public final /* synthetic */ Jo0 m;

                {
                    this.m = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14;
                    int i15;
                    switch (i4) {
                        case 0:
                            Jo0 jo0 = this.m;
                            AbstractC1474fG.j(jo0, "this$0");
                            ImageView imageView3 = imageView2;
                            AbstractC1474fG.j(imageView3, "$this_apply");
                            C2109lo0 c2109lo40 = jo0.w;
                            if (c2109lo40 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            c2109lo40.q = !c2109lo40.q;
                            O9 o9 = AppDatabase.m;
                            Context context2 = jo0.v;
                            AbstractC1474fG.i(context2, "context");
                            C2303no0 c2303no0R = o9.w(context2).r();
                            C2109lo0 c2109lo41 = jo0.w;
                            if (c2109lo41 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            c2303no0R.n(c2109lo41);
                            Context context3 = imageView3.getContext();
                            C2109lo0 c2109lo42 = jo0.w;
                            if (c2109lo42 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            boolean z2 = c2109lo42.q;
                            if (z2) {
                                i14 = R.drawable.ic_favorite_enable;
                            } else {
                                if (z2) {
                                    throw new C0730Rf();
                                }
                                i14 = R.drawable.ic_favorite_disable;
                            }
                            imageView3.setImageDrawable(AbstractC3354yh.b(context3, i14));
                            return;
                        default:
                            Jo0 jo1 = this.m;
                            AbstractC1474fG.j(jo1, "this$0");
                            ImageView imageView4 = imageView2;
                            AbstractC1474fG.j(imageView4, "$this_apply");
                            C2109lo0 c2109lo43 = jo1.w;
                            if (c2109lo43 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            c2109lo43.q = !c2109lo43.q;
                            O9 o10 = AppDatabase.m;
                            Context context4 = jo1.v;
                            AbstractC1474fG.i(context4, "context");
                            C2303no0 c2303no0R2 = o10.w(context4).r();
                            C2109lo0 c2109lo44 = jo1.w;
                            if (c2109lo44 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            c2303no0R2.n(c2109lo44);
                            Context context5 = imageView4.getContext();
                            C2109lo0 c2109lo45 = jo1.w;
                            if (c2109lo45 == null) {
                                AbstractC1474fG.U("tvShow");
                                throw null;
                            }
                            boolean z3 = c2109lo45.q;
                            if (z3) {
                                i15 = R.drawable.ic_favorite_enable;
                            } else {
                                if (z3) {
                                    throw new C0730Rf();
                                }
                                i15 = R.drawable.ic_favorite_disable;
                            }
                            imageView4.setImageDrawable(AbstractC3354yh.b(context5, i15));
                            return;
                    }
                }
            });
            Context context2 = imageView2.getContext();
            C2109lo0 c2109lo40 = this.w;
            if (c2109lo40 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            boolean z2 = c2109lo40.q;
            if (z2) {
                i2 = R.drawable.ic_favorite_enable;
            } else {
                if (z2) {
                    throw new C0730Rf();
                }
                i2 = R.drawable.ic_favorite_disable;
            }
            imageView2.setImageDrawable(AbstractC3354yh.b(context2, i2));
            return;
        }
        if (!(interfaceC2604qt0 instanceof C3160wh)) {
            if (interfaceC2604qt0 instanceof C2966uh) {
                RecyclerView recyclerView = ((C2966uh) interfaceC2604qt0).m;
                C3300y3 c3300y3 = new C3300y3();
                C2109lo0 c2109lo41 = this.w;
                if (c2109lo41 == null) {
                    AbstractC1474fG.U("tvShow");
                    throw null;
                }
                List<Ma0> list3 = c2109lo41.k;
                for (Ma0 ma7 : list3) {
                    EnumC3203x3 enumC3203x3 = EnumC3203x3.P;
                    ma7.getClass();
                    ma7.g = enumC3203x3;
                }
                c3300y3.m(list3);
                recyclerView.setAdapter(c3300y3);
                if (recyclerView.getItemDecorationCount() == 0) {
                    Context context3 = recyclerView.getContext();
                    AbstractC1474fG.i(context3, "getContext(...)");
                    recyclerView.g(new C2285nf0(AbstractC0397Ej.k(context3, 20)));
                    return;
                }
                return;
            }
            if (interfaceC2604qt0 instanceof C3063vh) {
                HorizontalGridView horizontalGridView = ((C3063vh) interfaceC2604qt0).m;
                horizontalGridView.setRowHeight(-2);
                C3300y3 c3300y4 = new C3300y3();
                C2109lo0 c2109lo42 = this.w;
                if (c2109lo42 == null) {
                    AbstractC1474fG.U("tvShow");
                    throw null;
                }
                List<Ma0> list4 = c2109lo42.k;
                for (Ma0 ma8 : list4) {
                    EnumC3203x3 enumC3203x4 = EnumC3203x3.Q;
                    ma8.getClass();
                    ma8.g = enumC3203x4;
                }
                c3300y4.m(list4);
                horizontalGridView.setAdapter(c3300y4);
                horizontalGridView.setItemSpacing(80);
                return;
            }
            if (interfaceC2604qt0 instanceof C2482ph) {
                RecyclerView recyclerView2 = ((C2482ph) interfaceC2604qt0).m;
                C3300y3 c3300y5 = new C3300y3();
                C2109lo0 c2109lo43 = this.w;
                if (c2109lo43 == null) {
                    AbstractC1474fG.U("tvShow");
                    throw null;
                }
                List<C1688hY> list5 = c2109lo43.n;
                for (C1688hY c1688hY : list5) {
                    EnumC3203x3 enumC3203x5 = EnumC3203x3.L;
                    c1688hY.getClass();
                    c1688hY.e = enumC3203x5;
                }
                c3300y5.m(list5);
                recyclerView2.setAdapter(c3300y5);
                if (recyclerView2.getItemDecorationCount() == 0) {
                    Context context4 = recyclerView2.getContext();
                    AbstractC1474fG.i(context4, "getContext(...)");
                    recyclerView2.g(new C2285nf0(AbstractC0397Ej.k(context4, 20)));
                    return;
                }
                return;
            }
            if (!(interfaceC2604qt0 instanceof C2579qh)) {
                if (interfaceC2604qt0 instanceof C2772sh) {
                    v((C2772sh) interfaceC2604qt0);
                    return;
                } else {
                    if (interfaceC2604qt0 instanceof C2869th) {
                        w((C2869th) interfaceC2604qt0);
                        return;
                    }
                    return;
                }
            }
            HorizontalGridView horizontalGridView2 = ((C2579qh) interfaceC2604qt0).m;
            horizontalGridView2.setRowHeight(-2);
            C3300y3 c3300y6 = new C3300y3();
            C2109lo0 c2109lo44 = this.w;
            if (c2109lo44 == null) {
                AbstractC1474fG.U("tvShow");
                throw null;
            }
            List<C1688hY> list6 = c2109lo44.n;
            for (C1688hY c1688hY2 : list6) {
                EnumC3203x3 enumC3203x6 = EnumC3203x3.M;
                c1688hY2.getClass();
                c1688hY2.e = enumC3203x6;
            }
            c3300y6.m(list6);
            horizontalGridView2.setAdapter(c3300y6);
            horizontalGridView2.setItemSpacing(80);
            return;
        }
        C3160wh c3160wh = (C3160wh) interfaceC2604qt0;
        ImageView imageView3 = c3160wh.p;
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E6 = com.bumptech.glide.a.e(imageView3.getContext());
        C2109lo0 c2109lo45 = this.w;
        if (c2109lo45 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        componentCallbacks2C3406z70E6.n(c2109lo45.h).H(imageView3);
        C2109lo0 c2109lo46 = this.w;
        if (c2109lo46 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        String str14 = c2109lo46.h;
        imageView3.setVisibility((str14 == null || str14.length() == 0) ? 8 : 0);
        C2109lo0 c2109lo47 = this.w;
        if (c2109lo47 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        c3160wh.y.setText(c2109lo47.b);
        C2109lo0 c2109lo48 = this.w;
        if (c2109lo48 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        Double d3 = c2109lo48.g;
        c3160wh.v.setText(d3 != null ? String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3.doubleValue())}, 1)) : "N/A");
        C2109lo0 c2109lo49 = this.w;
        if (c2109lo49 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        String str15 = c2109lo49.f;
        TextView textView16 = c3160wh.u;
        textView16.setText(str15);
        CharSequence text7 = textView16.getText();
        textView16.setVisibility((text7 == null || text7.length() == 0) ? 8 : 0);
        C2109lo0 c2109lo50 = this.w;
        if (c2109lo50 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        Calendar calendar3 = c2109lo50.p;
        String strM3 = calendar3 != null ? AbstractC0397Ej.m(calendar3, "yyyy") : null;
        TextView textView17 = c3160wh.w;
        textView17.setText(strM3);
        CharSequence text8 = textView17.getText();
        textView17.setVisibility((text8 == null || text8.length() == 0) ? 8 : 0);
        C2109lo0 c2109lo51 = this.w;
        if (c2109lo51 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        Integer num2 = c2109lo51.d;
        TextView textView18 = c3160wh.x;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            int i14 = iIntValue2 / 60;
            int i15 = iIntValue2 % 60;
            string = i14 > 0 ? textView18.getContext().getString(R.string.tv_show_runtime_hours_minutes, Integer.valueOf(i14), Integer.valueOf(i15)) : textView18.getContext().getString(R.string.tv_show_runtime_minutes, Integer.valueOf(i15));
        } else {
            string = null;
        }
        textView18.setText(string);
        CharSequence text9 = textView18.getText();
        textView18.setVisibility((text9 == null || text9.length() == 0) ? 8 : 0);
        C2109lo0 c2109lo52 = this.w;
        if (c2109lo52 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        String strH1 = AbstractC0911Ye.h0(c2109lo52.l, ", ", null, null, X10.M, 30);
        TextView textView19 = c3160wh.s;
        textView19.setText(strH1);
        C2109lo0 c2109lo53 = this.w;
        if (c2109lo53 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        textView19.setVisibility(c2109lo53.l.isEmpty() ? 8 : 0);
        C2109lo0 c2109lo54 = this.w;
        if (c2109lo54 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        c3160wh.t.setText(c2109lo54.c);
        C2109lo0 c2109lo55 = this.w;
        if (c2109lo55 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = c2109lo55.k.iterator();
        while (it3.hasNext()) {
            AbstractC1406ef.Q(arrayList3, ((Ma0) it3.next()).f);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((C0456Gq) obj2).j != null) {
                arrayList4.add(obj2);
            }
        }
        final C0456Gq c0456Gq7 = (C0456Gq) AbstractC0911Ye.d0(AbstractC0911Ye.r0(arrayList4, new C1749i30(10)));
        if (c0456Gq7 == null) {
            ListIterator listIterator2 = arrayList3.listIterator(arrayList3.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (((C0456Gq) listIterator2.previous()).h) {
                        iNextIndex = listIterator2.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            Integer numValueOf2 = Integer.valueOf(iNextIndex);
            if (iNextIndex == -1 || iNextIndex + 1 >= arrayList3.size()) {
                numValueOf2 = null;
            }
            c0456Gq7 = numValueOf2 != null ? (C0456Gq) AbstractC0911Ye.e0(numValueOf2.intValue() + 1, arrayList3) : null;
            if (c0456Gq7 == null) {
                C2109lo0 c2109lo56 = this.w;
                if (c2109lo56 == null) {
                    AbstractC1474fG.U("tvShow");
                    throw null;
                }
                Iterator it4 = c2109lo56.k.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((Ma0) next).b == 0);
                Ma0 ma9 = (Ma0) next;
                c0456Gq7 = (ma9 == null || (list = ma9.f) == null) ? null : (C0456Gq) AbstractC0911Ye.d0(list);
                if (c0456Gq7 == null) {
                    c0456Gq7 = (C0456Gq) AbstractC0911Ye.d0(arrayList3);
                }
            }
        }
        final TextView textView20 = c3160wh.f1098o;
        textView20.setOnClickListener(new View.OnClickListener() { // from class: o.Go0
            /* JADX WARN: Code duplicated, block: B:21:0x0079  */
            /* JADX WARN: Code duplicated, block: B:23:0x0087  */
            /* JADX WARN: Code duplicated, block: B:57:0x016a  */
            /* JADX WARN: Code duplicated, block: B:59:0x0178  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string10;
                String string11;
                String string12;
                String string13;
                C0456Gq c0456Gq8 = c0456Gq7;
                Jo0 jo0 = this;
                TextView textView110 = textView20;
                switch (i5) {
                    case 0:
                        AbstractC1474fG.j(textView110, "$this_apply");
                        AbstractC1474fG.j(jo0, "this$0");
                        if (c0456Gq8 == null) {
                            return;
                        }
                        String str16 = c0456Gq8.a;
                        C2109lo0 c2109lo410 = jo0.w;
                        if (c2109lo410 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str17 = c2109lo410.b;
                        Ma0 ma10 = c0456Gq8.f;
                        if (ma10 == null) {
                            Context context5 = textView110.getContext();
                            Integer numValueOf6 = Integer.valueOf(c0456Gq8.b);
                            string10 = c0456Gq8.c;
                            if (string10 == null) {
                                string10 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                AbstractC1474fG.i(string10, "getString(...)");
                            }
                            string11 = context5.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf6, string10);
                        } else {
                            if (ma10.b == 0) {
                                ma10 = null;
                            }
                            if (ma10 != null) {
                                Context context6 = textView110.getContext();
                                Integer numValueOf3 = Integer.valueOf(ma10.b);
                                Integer numValueOf4 = Integer.valueOf(c0456Gq8.b);
                                String string14 = c0456Gq8.c;
                                if (string14 == null) {
                                    string14 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                    AbstractC1474fG.i(string14, "getString(...)");
                                }
                                string11 = context6.getString(R.string.player_subtitle_tv_show, numValueOf3, numValueOf4, string14);
                                if (string11 == null) {
                                    Context context7 = textView110.getContext();
                                    Integer numValueOf7 = Integer.valueOf(c0456Gq8.b);
                                    string10 = c0456Gq8.c;
                                    if (string10 == null) {
                                        string10 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                        AbstractC1474fG.i(string10, "getString(...)");
                                    }
                                    string11 = context7.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf7, string10);
                                }
                            } else {
                                Context context8 = textView110.getContext();
                                Integer numValueOf8 = Integer.valueOf(c0456Gq8.b);
                                string10 = c0456Gq8.c;
                                if (string10 == null) {
                                    string10 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                    AbstractC1474fG.i(string10, "getString(...)");
                                }
                                string11 = context8.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf8, string10);
                            }
                        }
                        AbstractC1474fG.g(string11);
                        String str18 = c0456Gq8.a;
                        int i16 = c0456Gq8.b;
                        String str19 = c0456Gq8.c;
                        String str110 = c0456Gq8.d;
                        C2109lo0 c2109lo411 = jo0.w;
                        if (c2109lo411 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        Gs0 gs0 = new Gs0(c2109lo411.a, c2109lo411.b, c2109lo411.h, c2109lo411.i);
                        Ma0 ma11 = c0456Gq8.f;
                        Hs0 hs0 = new Hs0(str18, i16, str19, str110, gs0, new Fs0(ma11 != null ? ma11.b : 0, ma11 != null ? ma11.c : null));
                        AbstractC1474fG.j(str16, "id");
                        AbstractC1474fG.j(str17, "title");
                        AbstractC0397Ej.z(textView110, new Bo0(str16, str17, string11, hs0));
                        return;
                    default:
                        AbstractC1474fG.j(textView110, "$this_apply");
                        AbstractC1474fG.j(jo0, "this$0");
                        if (c0456Gq8 == null) {
                            return;
                        }
                        String str111 = c0456Gq8.a;
                        C2109lo0 c2109lo412 = jo0.w;
                        if (c2109lo412 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str20 = c2109lo412.b;
                        Ma0 ma12 = c0456Gq8.f;
                        if (ma12 == null) {
                            Context context9 = textView110.getContext();
                            Integer numValueOf11 = Integer.valueOf(c0456Gq8.b);
                            string12 = c0456Gq8.c;
                            if (string12 == null) {
                                string12 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                AbstractC1474fG.i(string12, "getString(...)");
                            }
                            string13 = context9.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf11, string12);
                        } else {
                            if (ma12.b == 0) {
                                ma12 = null;
                            }
                            if (ma12 != null) {
                                Context context10 = textView110.getContext();
                                Integer numValueOf9 = Integer.valueOf(ma12.b);
                                Integer numValueOf10 = Integer.valueOf(c0456Gq8.b);
                                String string15 = c0456Gq8.c;
                                if (string15 == null) {
                                    string15 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                    AbstractC1474fG.i(string15, "getString(...)");
                                }
                                string13 = context10.getString(R.string.player_subtitle_tv_show, numValueOf9, numValueOf10, string15);
                                if (string13 == null) {
                                    Context context11 = textView110.getContext();
                                    Integer numValueOf12 = Integer.valueOf(c0456Gq8.b);
                                    string12 = c0456Gq8.c;
                                    if (string12 == null) {
                                        string12 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                        AbstractC1474fG.i(string12, "getString(...)");
                                    }
                                    string13 = context11.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf12, string12);
                                }
                            } else {
                                Context context12 = textView110.getContext();
                                Integer numValueOf13 = Integer.valueOf(c0456Gq8.b);
                                string12 = c0456Gq8.c;
                                if (string12 == null) {
                                    string12 = textView110.getContext().getString(R.string.episode_number, Integer.valueOf(c0456Gq8.b));
                                    AbstractC1474fG.i(string12, "getString(...)");
                                }
                                string13 = context12.getString(R.string.player_subtitle_tv_show_episode_only, numValueOf13, string12);
                            }
                        }
                        AbstractC1474fG.g(string13);
                        String str21 = c0456Gq8.a;
                        int i17 = c0456Gq8.b;
                        String str22 = c0456Gq8.c;
                        String str23 = c0456Gq8.d;
                        C2109lo0 c2109lo413 = jo0.w;
                        if (c2109lo413 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        Gs0 gs1 = new Gs0(c2109lo413.a, c2109lo413.b, c2109lo413.h, c2109lo413.i);
                        Ma0 ma13 = c0456Gq8.f;
                        Hs0 hs1 = new Hs0(str21, i17, str22, str23, gs1, new Fs0(ma13 != null ? ma13.b : 0, ma13 != null ? ma13.c : null));
                        AbstractC1474fG.j(str111, "id");
                        AbstractC1474fG.j(str20, "title");
                        AbstractC0397Ej.z(textView110, new C2884to0(str111, str20, string13, hs1));
                        return;
                }
            }
        });
        if (c0456Gq7 != null) {
            Ma0 ma10 = c0456Gq7.f;
            if (ma10 == null) {
                string2 = textView20.getContext().getString(R.string.tv_show_watch_episode, Integer.valueOf(c0456Gq7.b));
            } else {
                if (ma10.b == 0) {
                    ma10 = null;
                }
                if (ma10 == null || (string2 = textView20.getContext().getString(R.string.tv_show_watch_season_episode, Integer.valueOf(ma10.b), Integer.valueOf(c0456Gq7.b))) == null) {
                    string2 = textView20.getContext().getString(R.string.tv_show_watch_episode, Integer.valueOf(c0456Gq7.b));
                }
            }
            str = string2;
        }
        textView20.setText(str);
        textView20.setVisibility(c0456Gq7 != null ? 0 : 8);
        c3160wh.r.setVisibility(c0456Gq7 != null ? 8 : 0);
        C2123lv0 c2123lv1 = c0456Gq7 != null ? c0456Gq7.j : null;
        int i16 = c2123lv1 != null ? (int) ((c2123lv1.b * ((long) 100)) / c2123lv1.c) : 0;
        ProgressBar progressBar2 = c3160wh.q;
        progressBar2.setProgress(i16);
        progressBar2.setVisibility(c2123lv1 != null ? 0 : 8);
        c3160wh.n.setOnClickListener(new View.OnClickListener(this) { // from class: o.Ho0
            public final /* synthetic */ Jo0 m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3289xx c3289xxU;
                C3289xx c3289xxU2;
                switch (i5) {
                    case 0:
                        Jo0 jo0 = this.m;
                        AbstractC1474fG.j(jo0, "this$0");
                        C2109lo0 c2109lo410 = jo0.w;
                        if (c2109lo410 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str16 = c2109lo410.e;
                        Context context5 = jo0.v;
                        if (str16 == null) {
                            Toast.makeText(context5, "Trailer no disponible", 0).show();
                            return;
                        }
                        AbstractActivityC1540fx abstractActivityC1540fx2 = context5 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context5 : null;
                        if (abstractActivityC1540fx2 == null || (c3289xxU = abstractActivityC1540fx2.u()) == null) {
                            return;
                        }
                        C2109lo0 c2109lo411 = jo0.w;
                        if (c2109lo411 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str17 = c2109lo411.e;
                        AbstractC1474fG.g(str17);
                        C2299nm0 c2299nm0 = new C2299nm0();
                        Bundle bundle = new Bundle();
                        bundle.putString("trailer_url", str17);
                        c2299nm0.U(bundle);
                        c2299nm0.Z(c3289xxU, "TrailerFragment");
                        return;
                    default:
                        Jo0 jo1 = this.m;
                        AbstractC1474fG.j(jo1, "this$0");
                        C2109lo0 c2109lo412 = jo1.w;
                        if (c2109lo412 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str18 = c2109lo412.e;
                        Context context6 = jo1.v;
                        if (str18 == null) {
                            Toast.makeText(context6, "Trailer no disponible", 0).show();
                            return;
                        }
                        AbstractActivityC1540fx abstractActivityC1540fx3 = context6 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context6 : null;
                        if (abstractActivityC1540fx3 == null || (c3289xxU2 = abstractActivityC1540fx3.u()) == null) {
                            return;
                        }
                        C2109lo0 c2109lo413 = jo1.w;
                        if (c2109lo413 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        String str19 = c2109lo413.e;
                        AbstractC1474fG.g(str19);
                        C2299nm0 c2299nm1 = new C2299nm0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("trailer_url", str19);
                        c2299nm1.U(bundle2);
                        c2299nm1.Z(c3289xxU2, "TrailerFragment");
                        return;
                }
            }
        });
        final ImageView imageView4 = c3160wh.m;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: o.Io0
            public final /* synthetic */ Jo0 m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17;
                int i18;
                switch (i5) {
                    case 0:
                        Jo0 jo0 = this.m;
                        AbstractC1474fG.j(jo0, "this$0");
                        ImageView imageView5 = imageView4;
                        AbstractC1474fG.j(imageView5, "$this_apply");
                        C2109lo0 c2109lo410 = jo0.w;
                        if (c2109lo410 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        c2109lo410.q = !c2109lo410.q;
                        O9 o9 = AppDatabase.m;
                        Context context5 = jo0.v;
                        AbstractC1474fG.i(context5, "context");
                        C2303no0 c2303no0R = o9.w(context5).r();
                        C2109lo0 c2109lo411 = jo0.w;
                        if (c2109lo411 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        c2303no0R.n(c2109lo411);
                        Context context6 = imageView5.getContext();
                        C2109lo0 c2109lo412 = jo0.w;
                        if (c2109lo412 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        boolean z3 = c2109lo412.q;
                        if (z3) {
                            i17 = R.drawable.ic_favorite_enable;
                        } else {
                            if (z3) {
                                throw new C0730Rf();
                            }
                            i17 = R.drawable.ic_favorite_disable;
                        }
                        imageView5.setImageDrawable(AbstractC3354yh.b(context6, i17));
                        return;
                    default:
                        Jo0 jo1 = this.m;
                        AbstractC1474fG.j(jo1, "this$0");
                        ImageView imageView6 = imageView4;
                        AbstractC1474fG.j(imageView6, "$this_apply");
                        C2109lo0 c2109lo413 = jo1.w;
                        if (c2109lo413 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        c2109lo413.q = !c2109lo413.q;
                        O9 o10 = AppDatabase.m;
                        Context context7 = jo1.v;
                        AbstractC1474fG.i(context7, "context");
                        C2303no0 c2303no0R2 = o10.w(context7).r();
                        C2109lo0 c2109lo414 = jo1.w;
                        if (c2109lo414 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        c2303no0R2.n(c2109lo414);
                        Context context8 = imageView6.getContext();
                        C2109lo0 c2109lo415 = jo1.w;
                        if (c2109lo415 == null) {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                        boolean z4 = c2109lo415.q;
                        if (z4) {
                            i18 = R.drawable.ic_favorite_enable;
                        } else {
                            if (z4) {
                                throw new C0730Rf();
                            }
                            i18 = R.drawable.ic_favorite_disable;
                        }
                        imageView6.setImageDrawable(AbstractC3354yh.b(context8, i18));
                        return;
                }
            }
        });
        Context context5 = imageView4.getContext();
        C2109lo0 c2109lo57 = this.w;
        if (c2109lo57 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        boolean z3 = c2109lo57.q;
        if (z3) {
            i = R.drawable.ic_favorite_enable;
        } else {
            if (z3) {
                throw new C0730Rf();
            }
            i = R.drawable.ic_favorite_disable;
        }
        imageView4.setImageDrawable(AbstractC3354yh.b(context5, i));
    }

    public final void v(C2772sh c2772sh) {
        RecyclerView recyclerView = c2772sh.m;
        C3300y3 c3300y3 = new C3300y3();
        C2109lo0 c2109lo0 = this.w;
        if (c2109lo0 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        List<Cd0> list = c2109lo0.f900o;
        for (Cd0 cd0 : list) {
            if (cd0 instanceof C1387eR) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.w;
                C1387eR c1387eR = (C1387eR) cd0;
                c1387eR.getClass();
                c1387eR.u = enumC3203x3;
            } else if (cd0 instanceof C2109lo0) {
                EnumC3203x3 enumC3203x4 = EnumC3203x3.T;
                C2109lo0 c2109lo1 = (C2109lo0) cd0;
                c2109lo1.getClass();
                c2109lo1.s = enumC3203x4;
            }
        }
        c3300y3.m(list);
        recyclerView.setAdapter(c3300y3);
        if (recyclerView.getItemDecorationCount() == 0) {
            Context context = recyclerView.getContext();
            AbstractC1474fG.i(context, "getContext(...)");
            recyclerView.g(new C2285nf0(AbstractC0397Ej.k(context, 10)));
        }
    }

    public final void w(C2869th c2869th) {
        HorizontalGridView horizontalGridView = c2869th.m;
        horizontalGridView.setRowHeight(-2);
        C3300y3 c3300y3 = new C3300y3();
        C2109lo0 c2109lo0 = this.w;
        if (c2109lo0 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        List<Cd0> list = c2109lo0.f900o;
        for (Cd0 cd0 : list) {
            if (cd0 instanceof C1387eR) {
                EnumC3203x3 enumC3203x3 = EnumC3203x3.x;
                C1387eR c1387eR = (C1387eR) cd0;
                c1387eR.getClass();
                c1387eR.u = enumC3203x3;
            } else if (cd0 instanceof C2109lo0) {
                EnumC3203x3 enumC3203x4 = EnumC3203x3.U;
                C2109lo0 c2109lo1 = (C2109lo0) cd0;
                c2109lo1.getClass();
                c2109lo1.s = enumC3203x4;
            }
        }
        c3300y3.m(list);
        horizontalGridView.setAdapter(c3300y3);
        horizontalGridView.setItemSpacing(20);
    }

    public final RecyclerView x() {
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        if (interfaceC2604qt0 instanceof C2966uh) {
            return ((C2966uh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C3063vh) {
            return ((C3063vh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2482ph) {
            return ((C2482ph) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2579qh) {
            return ((C2579qh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2772sh) {
            return ((C2772sh) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C2869th) {
            return ((C2869th) interfaceC2604qt0).m;
        }
        return null;
    }

    public final void y() {
        Object next;
        Q30 q30;
        C2109lo0 c2109lo0 = this.w;
        Object obj = null;
        if (c2109lo0 == null) {
            AbstractC1474fG.U("tvShow");
            throw null;
        }
        String str = c2109lo0.r;
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
