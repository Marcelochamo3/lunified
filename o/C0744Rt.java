package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.favorites.FavoritesMobileFragment;
import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;
import com.skidush.clonex.fragments.genre.GenreMobileFragment;
import com.skidush.clonex.fragments.genre.GenreTvFragment;
import com.skidush.clonex.fragments.history.HistoryMobileFragment;
import com.skidush.clonex.fragments.history.HistoryTvFragment;
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import com.skidush.clonex.fragments.home.HomeTvFragment;
import com.skidush.clonex.fragments.movie.MovieMobileFragment;
import com.skidush.clonex.fragments.movie.MovieTvFragment;
import com.skidush.clonex.fragments.movies.MoviesMobileFragment;
import com.skidush.clonex.fragments.movies.MoviesTvFragment;
import com.skidush.clonex.fragments.people.PeopleMobileFragment;
import com.skidush.clonex.fragments.people.PeopleTvFragment;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;
import com.skidush.clonex.fragments.season.SeasonMobileFragment;
import com.skidush.clonex.fragments.season.SeasonTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsMobileFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsTvFragment;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744Rt implements Yt0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0744Rt(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.a = i;
        this.b = abstractComponentCallbacksC1247cx;
    }

    @Override // o.Yt0
    public final Ut0 a(Class cls) {
        switch (this.a) {
            case 0:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2314nu(((FavoritesMobileFragment) this.b).Q());
            case 1:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2314nu(((FavoritesTvFragment) this.b).Q());
            case 2:
                AbstractC1474fG.j(cls, "modelClass");
                GenreMobileFragment genreMobileFragment = (GenreMobileFragment) this.b;
                C2710rz c2710rz = (C2710rz) genreMobileFragment.m0.getValue();
                return new C0594Lz(c2710rz.a, (AppDatabase) genreMobileFragment.n0.getValue());
            case 3:
                AbstractC1474fG.j(cls, "modelClass");
                GenreTvFragment genreTvFragment = (GenreTvFragment) this.b;
                C3195wz c3195wz = (C3195wz) genreTvFragment.m0.getValue();
                return new C0594Lz(c3195wz.a, (AppDatabase) genreTvFragment.n0.getValue());
            case 4:
                AbstractC1474fG.j(cls, "modelClass");
                return new IB(((HistoryMobileFragment) this.b).Q());
            case 5:
                AbstractC1474fG.j(cls, "modelClass");
                return new IB(((HistoryTvFragment) this.b).Q());
            case 6:
                AbstractC1474fG.j(cls, "modelClass");
                HomeMobileFragment homeMobileFragment = (HomeMobileFragment) this.b;
                return new RC((AppDatabase) homeMobileFragment.m0.getValue(), homeMobileFragment.W());
            case 7:
                AbstractC1474fG.j(cls, "modelClass");
                HomeTvFragment homeTvFragment = (HomeTvFragment) this.b;
                return new RC(homeTvFragment.W(), homeTvFragment.X());
            case 8:
                AbstractC1474fG.j(cls, "modelClass");
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 9:
                AbstractC1474fG.j(cls, "modelClass");
                MovieMobileFragment movieMobileFragment = (MovieMobileFragment) this.b;
                C1875jR c1875jR = (C1875jR) movieMobileFragment.m0.getValue();
                return new MR(c1875jR.a, (AppDatabase) movieMobileFragment.n0.getValue());
            case 10:
                AbstractC1474fG.j(cls, "modelClass");
                MovieTvFragment movieTvFragment = (MovieTvFragment) this.b;
                C2556qR c2556qR = (C2556qR) movieTvFragment.m0.getValue();
                return new MR(c2556qR.a, (AppDatabase) movieTvFragment.n0.getValue());
            case 11:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2557qS((AppDatabase) ((MoviesMobileFragment) this.b).m0.getValue());
            case 12:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2557qS((AppDatabase) ((MoviesTvFragment) this.b).m0.getValue());
            case 13:
                AbstractC1474fG.j(cls, "modelClass");
                PeopleMobileFragment peopleMobileFragment = (PeopleMobileFragment) this.b;
                C1980kY c1980kY = (C1980kY) peopleMobileFragment.m0.getValue();
                return new CY(c1980kY.a, (AppDatabase) peopleMobileFragment.n0.getValue());
            case 14:
                AbstractC1474fG.j(cls, "modelClass");
                PeopleTvFragment peopleTvFragment = (PeopleTvFragment) this.b;
                C2466pY c2466pY = (C2466pY) peopleTvFragment.m0.getValue();
                return new CY(c2466pY.a, (AppDatabase) peopleTvFragment.n0.getValue());
            case 15:
                AbstractC1474fG.j(cls, "modelClass");
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.b;
                return new Z10(playerMobileFragment.h0().d, playerMobileFragment.h0().a, PlayerMobileFragment.W(playerMobileFragment));
            case 16:
                AbstractC1474fG.j(cls, "modelClass");
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.b;
                return new Z10(playerTvFragment.i0().d, playerTvFragment.i0().a, playerTvFragment.k0());
            case 17:
                AbstractC1474fG.j(cls, "modelClass");
                return new La0((AppDatabase) ((SearchMobileFragment) this.b).m0.getValue());
            case 18:
                AbstractC1474fG.j(cls, "modelClass");
                return new La0((AppDatabase) ((SearchTvFragment) this.b).m0.getValue());
            case 19:
                AbstractC1474fG.j(cls, "modelClass");
                SeasonMobileFragment seasonMobileFragment = (SeasonMobileFragment) this.b;
                return new C1302db0(seasonMobileFragment.W().e, new C2109lo0(seasonMobileFragment.W().a, seasonMobileFragment.W().b, null, null, null, null, null, null, seasonMobileFragment.W().c, seasonMobileFragment.W().d, null, null, null, null, null, null, 64764), new Ma0(seasonMobileFragment.W().e, seasonMobileFragment.W().f, seasonMobileFragment.W().g, null, null, null, 56), (AppDatabase) seasonMobileFragment.n0.getValue());
            case 20:
                AbstractC1474fG.j(cls, "modelClass");
                SeasonTvFragment seasonTvFragment = (SeasonTvFragment) this.b;
                return new C1302db0(seasonTvFragment.W().e, new C2109lo0(seasonTvFragment.W().a, seasonTvFragment.W().b, null, null, null, null, null, null, seasonTvFragment.W().c, seasonTvFragment.W().d, null, null, null, null, null, null, 64764), new Ma0(seasonTvFragment.W().e, seasonTvFragment.W().f, seasonTvFragment.W().g, null, null, null, 56), (AppDatabase) seasonTvFragment.n0.getValue());
            case 21:
                AbstractC1474fG.j(cls, "modelClass");
                TvShowMobileFragment tvShowMobileFragment = (TvShowMobileFragment) this.b;
                C2594qo0 c2594qo0 = (C2594qo0) tvShowMobileFragment.m0.getValue();
                return new Wo0(c2594qo0.a, (AppDatabase) tvShowMobileFragment.n0.getValue());
            case 22:
                AbstractC1474fG.j(cls, "modelClass");
                TvShowTvFragment tvShowTvFragment = (TvShowTvFragment) this.b;
                C3369yo0 c3369yo0 = (C3369yo0) tvShowTvFragment.m0.getValue();
                return new Wo0(c3369yo0.a, (AppDatabase) tvShowTvFragment.n0.getValue());
            case 23:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2111lp0((AppDatabase) ((TvShowsMobileFragment) this.b).m0.getValue());
            default:
                AbstractC1474fG.j(cls, "modelClass");
                return new C2111lp0((AppDatabase) ((TvShowsTvFragment) this.b).m0.getValue());
        }
    }

    @Override // o.Yt0
    public final Ut0 b(Class cls, AbstractC2484pi abstractC2484pi) {
        Ut0 ut0;
        Wt0 wt0;
        InterfaceC0412Ey interfaceC0412Ey;
        switch (this.a) {
            case 0:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 1:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 2:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 3:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 4:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 5:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 6:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 7:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 8:
                AbstractC1474fG.j(abstractC2484pi, "extras");
                C2766se c2766seA = AbstractC2822t60.a(cls);
                Wt0[] wt0Arr = (Wt0[]) this.b;
                Wt0[] wt0Arr2 = (Wt0[]) Arrays.copyOf(wt0Arr, wt0Arr.length);
                AbstractC1474fG.j(wt0Arr2, "initializers");
                int length = wt0Arr2.length;
                int i = 0;
                while (true) {
                    ut0 = null;
                    if (i < length) {
                        wt0 = wt0Arr2[i];
                        if (!AbstractC1474fG.b(wt0.a, c2766seA)) {
                            i++;
                        }
                    } else {
                        wt0 = null;
                    }
                }
                if (wt0 != null && (interfaceC0412Ey = wt0.b) != null) {
                    ut0 = (Ut0) interfaceC0412Ey.b(abstractC2484pi);
                }
                if (ut0 != null) {
                    return ut0;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + Pu0.k(c2766seA)).toString());
            case 9:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 10:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 11:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 12:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 13:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 14:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 15:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 16:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 17:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 18:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 19:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 20:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 21:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 22:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 23:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            default:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
        }
    }

    @Override // o.Yt0
    public final /* synthetic */ Ut0 c(InterfaceC1476fI interfaceC1476fI, SS ss) {
        int i = this.a;
        return AbstractC1674hK.b(this, interfaceC1476fI, ss);
    }

    public C0744Rt(Wt0[] wt0Arr) {
        this.a = 8;
        AbstractC1474fG.j(wt0Arr, "initializers");
        this.b = wt0Arr;
    }
}
