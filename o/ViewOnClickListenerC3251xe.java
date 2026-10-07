package o;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.skidush.clonex.R;
import com.skidush.clonex.SettingsActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import com.skidush.clonex.fragments.genre.GenreMobileFragment;
import com.skidush.clonex.fragments.genre.GenreTvFragment;
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
import com.skidush.clonex.fragments.player.settings.PlayerSettingsMobileView;
import com.skidush.clonex.fragments.providers.ProvidersMobileFragment;
import com.skidush.clonex.fragments.providers.ProvidersTvFragment;
import com.skidush.clonex.fragments.season.SeasonMobileFragment;
import com.skidush.clonex.fragments.season.SeasonTvFragment;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;
import com.skidush.clonex.fragments.tv_shows.TvShowsMobileFragment;

/* JADX INFO: renamed from: o.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3251xe implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ViewOnClickListenerC3251xe(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.m;
        switch (this.l) {
            case 0:
                C0314Be c0314Be = (C0314Be) obj;
                EditText editText = c0314Be.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0314Be.q();
                return;
            case 1:
                ((C0869Wo) obj).u();
                return;
            case 2:
                GenreMobileFragment genreMobileFragment = (GenreMobileFragment) obj;
                AbstractC1474fG.j(genreMobileFragment, "this$0");
                ((C0594Lz) genreMobileFragment.o0.getValue()).e(((C2710rz) genreMobileFragment.m0.getValue()).a);
                return;
            case 3:
                GenreTvFragment genreTvFragment = (GenreTvFragment) obj;
                AbstractC1474fG.j(genreTvFragment, "this$0");
                ((C0594Lz) genreTvFragment.o0.getValue()).e(((C3195wz) genreTvFragment.m0.getValue()).a);
                return;
            case 4:
                ImageView imageView = (ImageView) obj;
                AbstractC1474fG.j(imageView, "$this_apply");
                U9.o(imageView).n(R.id.action_global_providers, new Bundle(), null);
                return;
            case 5:
                HomeMobileFragment homeMobileFragment = (HomeMobileFragment) obj;
                AbstractC1474fG.j(homeMobileFragment, "this$0");
                ((RC) homeMobileFragment.n0.getValue()).g(true);
                return;
            case 6:
                HomeTvFragment homeTvFragment = (HomeTvFragment) obj;
                AbstractC1474fG.j(homeTvFragment, "this$0");
                ((RC) homeTvFragment.n0.getValue()).g(true);
                return;
            case 7:
                int i = MainTvActivity.Q;
                YT yt = (YT) obj;
                AbstractC1474fG.j(yt, "$navController");
                yt.n(R.id.action_global_providers, new Bundle(), null);
                return;
            case 8:
                ((C1776iO) obj).a0();
                throw null;
            case 9:
                MovieMobileFragment movieMobileFragment = (MovieMobileFragment) obj;
                AbstractC1474fG.j(movieMobileFragment, "this$0");
                ((MR) movieMobileFragment.o0.getValue()).e(((C1875jR) movieMobileFragment.m0.getValue()).a);
                return;
            case 10:
                MovieTvFragment movieTvFragment = (MovieTvFragment) obj;
                AbstractC1474fG.j(movieTvFragment, "this$0");
                ((MR) movieTvFragment.o0.getValue()).e(((C2556qR) movieTvFragment.m0.getValue()).a);
                return;
            case 11:
                MoviesHomeMobileFragment moviesHomeMobileFragment = (MoviesHomeMobileFragment) obj;
                AbstractC1474fG.j(moviesHomeMobileFragment, "this$0");
                ((C1096bS) moviesHomeMobileFragment.m0.getValue()).e();
                return;
            case 12:
                MoviesHomeTvFragment moviesHomeTvFragment = (MoviesHomeTvFragment) obj;
                AbstractC1474fG.j(moviesHomeTvFragment, "this$0");
                ((C1096bS) moviesHomeTvFragment.m0.getValue()).e();
                return;
            case 13:
                MoviesMobileFragment moviesMobileFragment = (MoviesMobileFragment) obj;
                AbstractC1474fG.j(moviesMobileFragment, "this$0");
                ((C2557qS) moviesMobileFragment.n0.getValue()).e();
                return;
            case 14:
                MoviesTvFragment moviesTvFragment = (MoviesTvFragment) obj;
                AbstractC1474fG.j(moviesTvFragment, "this$0");
                ((C2557qS) moviesTvFragment.n0.getValue()).e();
                return;
            case 15:
                C3434zX c3434zX = (C3434zX) obj;
                EditText editText2 = c3434zX.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c3434zX.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c3434zX.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c3434zX.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c3434zX.f.setSelection(selectionEnd);
                }
                c3434zX.q();
                return;
            case 16:
                PeopleMobileFragment peopleMobileFragment = (PeopleMobileFragment) obj;
                AbstractC1474fG.j(peopleMobileFragment, "this$0");
                ((CY) peopleMobileFragment.o0.getValue()).e(((C1980kY) peopleMobileFragment.m0.getValue()).a);
                return;
            case 17:
                PeopleTvFragment peopleTvFragment = (PeopleTvFragment) obj;
                AbstractC1474fG.j(peopleTvFragment, "this$0");
                ((CY) peopleTvFragment.o0.getValue()).e(((C2466pY) peopleTvFragment.m0.getValue()).a);
                return;
            case 18:
                int i2 = PlayerSettingsMobileView.u0;
                PlayerSettingsMobileView playerSettingsMobileView = (PlayerSettingsMobileView) obj;
                AbstractC1474fG.j(playerSettingsMobileView, "this$0");
                playerSettingsMobileView.p();
                return;
            case 19:
                ProvidersMobileFragment providersMobileFragment = (ProvidersMobileFragment) obj;
                AbstractC1474fG.j(providersMobileFragment, "this$0");
                providersMobileFragment.W().e(null);
                return;
            case 20:
                ProvidersTvFragment providersTvFragment = (ProvidersTvFragment) obj;
                AbstractC1474fG.j(providersTvFragment, "this$0");
                providersTvFragment.W().e(null);
                return;
            case 21:
                SeasonMobileFragment seasonMobileFragment = (SeasonMobileFragment) obj;
                AbstractC1474fG.j(seasonMobileFragment, "this$0");
                ((C1302db0) seasonMobileFragment.o0.getValue()).e(seasonMobileFragment.W().e);
                return;
            case 22:
                SeasonTvFragment seasonTvFragment = (SeasonTvFragment) obj;
                AbstractC1474fG.j(seasonTvFragment, "this$0");
                ((C1302db0) seasonTvFragment.o0.getValue()).e(seasonTvFragment.W().e);
                return;
            case 23:
                int i3 = SettingsActivity.J;
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                AbstractC1474fG.j(settingsActivity, "this$0");
                settingsActivity.finish();
                return;
            case 24:
                Dialog dialog = (Dialog) obj;
                AbstractC1474fG.j(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 25:
                Fd0 fd0 = (Fd0) obj;
                AbstractC1474fG.j(fd0, "this$0");
                fd0.hide();
                return;
            case 26:
                DialogC2432p5 dialogC2432p5 = (DialogC2432p5) obj;
                AbstractC1474fG.j(dialogC2432p5, "this$0");
                dialogC2432p5.hide();
                return;
            case 27:
                TvShowMobileFragment tvShowMobileFragment = (TvShowMobileFragment) obj;
                AbstractC1474fG.j(tvShowMobileFragment, "this$0");
                ((Wo0) tvShowMobileFragment.o0.getValue()).e(((C2594qo0) tvShowMobileFragment.m0.getValue()).a);
                return;
            case 28:
                TvShowTvFragment tvShowTvFragment = (TvShowTvFragment) obj;
                AbstractC1474fG.j(tvShowTvFragment, "this$0");
                ((Wo0) tvShowTvFragment.o0.getValue()).e(((C3369yo0) tvShowTvFragment.m0.getValue()).a);
                return;
            default:
                TvShowsMobileFragment tvShowsMobileFragment = (TvShowsMobileFragment) obj;
                AbstractC1474fG.j(tvShowsMobileFragment, "this$0");
                ((C2111lp0) tvShowsMobileFragment.n0.getValue()).e();
                return;
        }
    }
}
