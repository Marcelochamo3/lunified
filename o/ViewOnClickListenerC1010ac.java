package o;

import android.app.Dialog;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.home.MoviesHomeMobileFragment;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsMobileView;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;
import com.skidush.navigation.widget.NavigationSlideView;

/* JADX INFO: renamed from: o.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1010ac implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ViewOnClickListenerC1010ac(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UT ic;
        C2985uq0 c2985uq0;
        C2985uq0 c2985uq1;
        EnumC2035l00 enumC2035l00 = EnumC2035l00.q;
        EnumC2035l00 enumC2035l01 = EnumC2035l00.y;
        EnumC2035l00 enumC2035l02 = EnumC2035l00.A;
        EnumC2035l00 enumC2035l03 = EnumC2035l00.B;
        EnumC2035l00 enumC2035l04 = EnumC2035l00.z;
        EnumC2035l00 enumC2035l05 = EnumC2035l00.n;
        EnumC2035l00 enumC2035l06 = EnumC2035l00.m;
        C2985uq0 c2985uq2 = C2985uq0.a;
        EnumC2035l00 enumC2035l07 = EnumC2035l00.l;
        EnumC2035l00 enumC2035l08 = EnumC2035l00.f884o;
        Object obj = this.n;
        Object obj2 = this.m;
        EnumC2035l00 enumC2035l09 = EnumC2035l00.p;
        switch (this.l) {
            case 0:
                TextView textView = (TextView) obj2;
                AbstractC1474fG.j(textView, "$this_apply");
                Cd0 cd0 = (Cd0) obj;
                AbstractC1474fG.j(cd0, "$selected");
                if (cd0 instanceof C1387eR) {
                    String str = ((C1387eR) cd0).a;
                    AbstractC1474fG.j(str, "id");
                    ic = new GC(str);
                } else {
                    if (!(cd0 instanceof C2109lo0)) {
                        throw new C0730Rf();
                    }
                    String str2 = ((C2109lo0) cd0).a;
                    AbstractC1474fG.j(str2, "id");
                    ic = new IC(str2);
                }
                AbstractC0397Ej.z(textView, ic);
                return;
            case 1:
                C3172wn c3172wn = (C3172wn) obj2;
                AbstractC1474fG.j(c3172wn, "this$0");
                C3269xn c3269xn = (C3269xn) obj;
                AbstractC1474fG.j(c3269xn, "this$1");
                int iD = c3172wn.d();
                if (iD != -1) {
                    ((InterfaceC0412Ey) c3269xn.f).b(c3269xn.e.get(iD));
                    return;
                }
                return;
            case 2:
                YQ yq = (YQ) obj2;
                AbstractC1474fG.j(yq, "this$0");
                InterfaceC0360Cy interfaceC0360Cy = (InterfaceC0360Cy) obj;
                AbstractC1474fG.j(interfaceC0360Cy, "$action");
                yq.dismiss();
                interfaceC0360Cy.c();
                return;
            case 3:
                NavigationSlideView navigationSlideView = (NavigationSlideView) obj2;
                AbstractC1474fG.j(navigationSlideView, "this$0");
                MenuItem menuItem = (MenuItem) obj;
                AbstractC1474fG.j(menuItem, "$item");
                if (navigationSlideView.getMenu().q(menuItem, navigationSlideView.f49o, 0)) {
                    return;
                }
                menuItem.setChecked(true);
                return;
            case 4:
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) obj2;
                AbstractC1474fG.j(playerMobileFragment, "this$0");
                C1042as c1042as = playerMobileFragment.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                if (c1042as.f()) {
                    C1042as c1042as2 = playerMobileFragment.y0;
                    if (c1042as2 == null) {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                    c1042as2.i();
                } else {
                    C1042as c1042as3 = playerMobileFragment.y0;
                    if (c1042as3 == null) {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                    c1042as3.j();
                }
                playerMobileFragment.u0((ImageView) obj);
                return;
            case 5:
                PlayerMobileFragment playerMobileFragment2 = (PlayerMobileFragment) obj2;
                playerMobileFragment2.e0();
                PlayerMobileFragment.Z(playerMobileFragment2, (C0456Gq) obj);
                return;
            case 6:
                int i = PlayerSettingsMobileView.u0;
                EnumC2035l00 enumC2035l010 = (EnumC2035l00) obj2;
                AbstractC1474fG.j(enumC2035l010, "$setting");
                PlayerSettingsMobileView playerSettingsMobileView = (PlayerSettingsMobileView) obj;
                AbstractC1474fG.j(playerSettingsMobileView, "this$0");
                switch (enumC2035l010.ordinal()) {
                    case 0:
                        playerSettingsMobileView.p();
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 14:
                    case 15:
                    case 16:
                        playerSettingsMobileView.o(enumC2035l07);
                        return;
                    case 4:
                        playerSettingsMobileView.o(enumC2035l08);
                        return;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        playerSettingsMobileView.o(enumC2035l09);
                        return;
                    case 13:
                        playerSettingsMobileView.o(enumC2035l08);
                        return;
                    default:
                        return;
                }
            case 7:
                InterfaceC1937k00 interfaceC1937k00 = (InterfaceC1937k00) obj2;
                AbstractC1474fG.j(interfaceC1937k00, "$item");
                C1645h00 c1645h00 = (C1645h00) obj;
                AbstractC1474fG.j(c1645h00, "this$0");
                boolean z = interfaceC1937k00 instanceof C2229n00;
                PlayerSettingsMobileView playerSettingsMobileView2 = c1645h00.u;
                if (z) {
                    C2229n00 c2229n00 = (C2229n00) interfaceC1937k00;
                    if (AbstractC1474fG.b(c2229n00, AbstractC2810t00.a)) {
                        int i2 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l06);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n00, C2132m00.e)) {
                        int i3 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l05);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n00, T00.a)) {
                        int i4 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l08);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n00, C3004v00.d)) {
                        int i5 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l04);
                        return;
                    } else if (AbstractC1474fG.b(c2229n00, C2907u00.d)) {
                        int i6 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l03);
                        return;
                    } else {
                        if (AbstractC1474fG.b(c2229n00, AbstractC2520q00.a)) {
                            int i7 = PlayerSettingsMobileView.u0;
                            playerSettingsMobileView2.o(enumC2035l02);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k00 instanceof AbstractC2810t00) {
                    playerSettingsMobileView2.getOnQualitySelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.p();
                    return;
                }
                if (interfaceC1937k00 instanceof C2132m00) {
                    playerSettingsMobileView2.getOnAudioSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.p();
                    return;
                }
                if (interfaceC1937k00 instanceof T00) {
                    T00 t00 = (T00) interfaceC1937k00;
                    if (AbstractC1474fG.b(t00, R00.a)) {
                        int i8 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l09);
                        return;
                    }
                    if (t00 instanceof C3198x00 ? true : t00 instanceof S00) {
                        playerSettingsMobileView2.getOnSubtitleSelected().b(interfaceC1937k00);
                        playerSettingsMobileView2.p();
                        return;
                    } else {
                        if (AbstractC1474fG.b(t00, C3101w00.c)) {
                            InterfaceC0360Cy onLocalSubtitlesClicked = playerSettingsMobileView2.getOnLocalSubtitlesClicked();
                            if (onLocalSubtitlesClicked != null) {
                                onLocalSubtitlesClicked.c();
                            }
                            playerSettingsMobileView2.p();
                            return;
                        }
                        if (AbstractC1474fG.b(t00, C3392z00.b)) {
                            int i9 = PlayerSettingsMobileView.u0;
                            playerSettingsMobileView2.o(enumC2035l01);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k00 instanceof R00) {
                    R00 r00 = (R00) interfaceC1937k00;
                    if (AbstractC1474fG.b(r00, K00.d)) {
                        InterfaceC0412Ey onTextSizeSelected = playerSettingsMobileView2.getOnTextSizeSelected();
                        M00.c.getClass();
                        onTextSizeSelected.b(M00.d);
                        InterfaceC0412Ey onCaptionStyleChanged = playerSettingsMobileView2.getOnCaptionStyleChanged();
                        R00.a.getClass();
                        onCaptionStyleChanged.b(R00.b);
                        playerSettingsMobileView2.p();
                        return;
                    }
                    if (AbstractC1474fG.b(r00, H00.c)) {
                        int i10 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l00);
                        return;
                    }
                    if (AbstractC1474fG.b(r00, M00.c)) {
                        EnumC2035l00 enumC2035l011 = EnumC2035l00.r;
                        int i11 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l011);
                        return;
                    }
                    if (AbstractC1474fG.b(r00, J00.c)) {
                        EnumC2035l00 enumC2035l012 = EnumC2035l00.s;
                        int i12 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l012);
                        return;
                    }
                    if (AbstractC1474fG.b(r00, F00.c)) {
                        EnumC2035l00 enumC2035l013 = EnumC2035l00.t;
                        int i13 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l013);
                        return;
                    }
                    if (AbstractC1474fG.b(r00, B00.c)) {
                        EnumC2035l00 enumC2035l014 = EnumC2035l00.u;
                        int i14 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l014);
                        return;
                    }
                    if (AbstractC1474fG.b(r00, D00.c)) {
                        EnumC2035l00 enumC2035l015 = EnumC2035l00.v;
                        int i15 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l015);
                        return;
                    } else if (AbstractC1474fG.b(r00, O00.c)) {
                        EnumC2035l00 enumC2035l016 = EnumC2035l00.w;
                        int i16 = PlayerSettingsMobileView.u0;
                        playerSettingsMobileView2.o(enumC2035l016);
                        return;
                    } else {
                        if (AbstractC1474fG.b(r00, Q00.c)) {
                            EnumC2035l00 enumC2035l017 = EnumC2035l00.x;
                            int i17 = PlayerSettingsMobileView.u0;
                            playerSettingsMobileView2.o(enumC2035l017);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k00 instanceof H00) {
                    playerSettingsMobileView2.getOnFontColorSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof M00) {
                    playerSettingsMobileView2.getOnTextSizeSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof J00) {
                    playerSettingsMobileView2.getOnFontOpacitySelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof F00) {
                    playerSettingsMobileView2.getOnEdgeStyleSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof B00) {
                    playerSettingsMobileView2.getOnBackgroundColorSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof D00) {
                    playerSettingsMobileView2.getOnBackgroundOpacitySelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof O00) {
                    playerSettingsMobileView2.getOnWindowColorSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof Q00) {
                    playerSettingsMobileView2.getOnWindowOpacitySelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k00 instanceof C3392z00) {
                    InterfaceC0412Ey onOpenSubtitleSelected = playerSettingsMobileView2.getOnOpenSubtitleSelected();
                    if (onOpenSubtitleSelected != null) {
                        onOpenSubtitleSelected.b(interfaceC1937k00);
                    }
                    playerSettingsMobileView2.p();
                    return;
                }
                if (interfaceC1937k00 instanceof C3004v00) {
                    playerSettingsMobileView2.getOnSpeedSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.p();
                    return;
                } else if (interfaceC1937k00 instanceof AbstractC2520q00) {
                    playerSettingsMobileView2.getOnExtraBufferingSelected().b(interfaceC1937k00);
                    playerSettingsMobileView2.o(enumC2035l07);
                    return;
                } else {
                    if (interfaceC1937k00 instanceof C2907u00) {
                        InterfaceC0412Ey onServerSelected = playerSettingsMobileView2.getOnServerSelected();
                        if (onServerSelected != null) {
                            onServerSelected.b(interfaceC1937k00);
                        }
                        playerSettingsMobileView2.p();
                        return;
                    }
                    return;
                }
            case 8:
                InterfaceC1937k00 interfaceC1937k01 = (InterfaceC1937k00) obj2;
                AbstractC1474fG.j(interfaceC1937k01, "$item");
                C1839j00 c1839j00 = (C1839j00) obj;
                AbstractC1474fG.j(c1839j00, "this$0");
                boolean z2 = interfaceC1937k01 instanceof C2229n00;
                PlayerSettingsTvView playerSettingsTvView = c1839j00.u;
                if (z2) {
                    C2229n00 c2229n01 = (C2229n00) interfaceC1937k01;
                    if (AbstractC1474fG.b(c2229n01, AbstractC2810t00.a)) {
                        int i18 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l06);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n01, C2132m00.e)) {
                        int i19 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l05);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n01, T00.a)) {
                        int i20 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l08);
                        return;
                    }
                    if (AbstractC1474fG.b(c2229n01, C3004v00.d)) {
                        int i21 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l04);
                        return;
                    } else if (AbstractC1474fG.b(c2229n01, C2907u00.d)) {
                        int i22 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l03);
                        return;
                    } else {
                        if (AbstractC1474fG.b(c2229n01, AbstractC2520q00.a)) {
                            int i23 = PlayerSettingsTvView.u0;
                            playerSettingsTvView.o(enumC2035l02);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k01 instanceof AbstractC2810t00) {
                    playerSettingsTvView.getOnQualitySelected().b(interfaceC1937k01);
                    playerSettingsTvView.p();
                    return;
                }
                if (interfaceC1937k01 instanceof C2132m00) {
                    playerSettingsTvView.getOnAudioSelected().b(interfaceC1937k01);
                    playerSettingsTvView.p();
                    return;
                }
                if (interfaceC1937k01 instanceof T00) {
                    T00 t01 = (T00) interfaceC1937k01;
                    if (AbstractC1474fG.b(t01, R00.a)) {
                        int i24 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l09);
                        return;
                    }
                    if (t01 instanceof C3198x00 ? true : t01 instanceof S00) {
                        playerSettingsTvView.getOnSubtitleSelected().b(interfaceC1937k01);
                        playerSettingsTvView.p();
                        return;
                    } else {
                        if (AbstractC1474fG.b(t01, C3101w00.c)) {
                            InterfaceC0360Cy onLocalSubtitlesClicked2 = playerSettingsTvView.getOnLocalSubtitlesClicked();
                            if (onLocalSubtitlesClicked2 != null) {
                                onLocalSubtitlesClicked2.c();
                            }
                            playerSettingsTvView.p();
                            return;
                        }
                        if (AbstractC1474fG.b(t01, C3392z00.b)) {
                            int i25 = PlayerSettingsTvView.u0;
                            playerSettingsTvView.o(enumC2035l01);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k01 instanceof R00) {
                    R00 r01 = (R00) interfaceC1937k01;
                    if (AbstractC1474fG.b(r01, K00.d)) {
                        InterfaceC0412Ey onTextSizeSelected2 = playerSettingsTvView.getOnTextSizeSelected();
                        M00.c.getClass();
                        onTextSizeSelected2.b(M00.d);
                        InterfaceC0412Ey onCaptionStyleChanged2 = playerSettingsTvView.getOnCaptionStyleChanged();
                        R00.a.getClass();
                        onCaptionStyleChanged2.b(R00.b);
                        playerSettingsTvView.p();
                        return;
                    }
                    if (AbstractC1474fG.b(r01, H00.c)) {
                        int i26 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l00);
                        return;
                    }
                    if (AbstractC1474fG.b(r01, M00.c)) {
                        EnumC2035l00 enumC2035l018 = EnumC2035l00.r;
                        int i27 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l018);
                        return;
                    }
                    if (AbstractC1474fG.b(r01, J00.c)) {
                        EnumC2035l00 enumC2035l019 = EnumC2035l00.s;
                        int i28 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l019);
                        return;
                    }
                    if (AbstractC1474fG.b(r01, F00.c)) {
                        EnumC2035l00 enumC2035l020 = EnumC2035l00.t;
                        int i29 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l020);
                        return;
                    }
                    if (AbstractC1474fG.b(r01, B00.c)) {
                        EnumC2035l00 enumC2035l021 = EnumC2035l00.u;
                        int i30 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l021);
                        return;
                    }
                    if (AbstractC1474fG.b(r01, D00.c)) {
                        EnumC2035l00 enumC2035l022 = EnumC2035l00.v;
                        int i31 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l022);
                        return;
                    } else if (AbstractC1474fG.b(r01, O00.c)) {
                        EnumC2035l00 enumC2035l023 = EnumC2035l00.w;
                        int i32 = PlayerSettingsTvView.u0;
                        playerSettingsTvView.o(enumC2035l023);
                        return;
                    } else {
                        if (AbstractC1474fG.b(r01, Q00.c)) {
                            EnumC2035l00 enumC2035l024 = EnumC2035l00.x;
                            int i33 = PlayerSettingsTvView.u0;
                            playerSettingsTvView.o(enumC2035l024);
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1937k01 instanceof H00) {
                    playerSettingsTvView.getOnFontColorSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof M00) {
                    playerSettingsTvView.getOnTextSizeSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof J00) {
                    playerSettingsTvView.getOnFontOpacitySelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof F00) {
                    playerSettingsTvView.getOnEdgeStyleSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof B00) {
                    playerSettingsTvView.getOnBackgroundColorSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof D00) {
                    playerSettingsTvView.getOnBackgroundOpacitySelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof O00) {
                    playerSettingsTvView.getOnWindowColorSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof Q00) {
                    playerSettingsTvView.getOnWindowOpacitySelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l09);
                    return;
                }
                if (interfaceC1937k01 instanceof C3392z00) {
                    InterfaceC0412Ey onOpenSubtitleSelected2 = playerSettingsTvView.getOnOpenSubtitleSelected();
                    if (onOpenSubtitleSelected2 != null) {
                        onOpenSubtitleSelected2.b(interfaceC1937k01);
                    }
                    playerSettingsTvView.p();
                    return;
                }
                if (interfaceC1937k01 instanceof C3004v00) {
                    playerSettingsTvView.getOnSpeedSelected().b(interfaceC1937k01);
                    playerSettingsTvView.p();
                    return;
                } else if (interfaceC1937k01 instanceof AbstractC2520q00) {
                    playerSettingsTvView.getOnExtraBufferingSelected().b(interfaceC1937k01);
                    playerSettingsTvView.o(enumC2035l07);
                    return;
                } else {
                    if (interfaceC1937k01 instanceof C2907u00) {
                        InterfaceC0412Ey onServerSelected2 = playerSettingsTvView.getOnServerSelected();
                        if (onServerSelected2 != null) {
                            onServerSelected2.b(interfaceC1937k01);
                        }
                        playerSettingsTvView.p();
                        return;
                    }
                    return;
                }
            case 9:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj2;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                C1042as c1042as4 = playerTvFragment.D0;
                if (c1042as4 != null) {
                    if (c1042as4.f()) {
                        c1042as4.i();
                    } else {
                        c1042as4.j();
                    }
                    playerTvFragment.D0((ImageView) obj);
                    return;
                }
                return;
            case 10:
                PlayerTvFragment playerTvFragment2 = (PlayerTvFragment) obj2;
                playerTvFragment2.f0();
                PlayerTvFragment.X(playerTvFragment2, (C0456Gq) obj);
                return;
            case 11:
                C2083lb0 c2083lb0 = (C2083lb0) obj2;
                AbstractC1474fG.j(c2083lb0, "this$0");
                C2420oz c2420oz = (C2420oz) obj;
                AbstractC1474fG.j(c2420oz, "$genre");
                C2994uv c2994uv = c2083lb0.u;
                Context context = ((ConstraintLayout) c2994uv.m).getContext();
                AbstractC1474fG.i(context, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context);
                boolean z3 = (abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null) instanceof MoviesHomeMobileFragment;
                ConstraintLayout constraintLayout = (ConstraintLayout) c2994uv.m;
                String str3 = c2420oz.b;
                String str4 = c2420oz.a;
                if (z3) {
                    AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                    YT ytO = U9.o(constraintLayout);
                    AbstractC1474fG.j(str4, "id");
                    AbstractC1474fG.j(str3, "name");
                    ytO.p(new PR(str4, str3));
                    return;
                }
                AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                YT ytO2 = U9.o(constraintLayout);
                AbstractC1474fG.j(str4, "id");
                AbstractC1474fG.j(str3, "name");
                ytO2.p(new TR(str4, str3));
                return;
            case 12:
                Dialog dialog = (Dialog) obj2;
                AbstractC1474fG.j(dialog, "$dialog");
                InterfaceC0360Cy interfaceC0360Cy2 = (InterfaceC0360Cy) obj;
                AbstractC1474fG.j(interfaceC0360Cy2, "$onConfirm");
                dialog.dismiss();
                interfaceC0360Cy2.c();
                return;
            case 13:
                Fd0 fd0 = (Fd0) obj2;
                AbstractC1474fG.j(fd0, "this$0");
                C2109lo0 c2109lo0 = (C2109lo0) obj;
                AbstractC1474fG.j(c2109lo0, "$tvShow");
                C2303no0 c2303no0R = fd0.B.r();
                C2109lo0 c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                c2109lo0A.q = !c2109lo0.q;
                c2303no0R.getClass();
                if (c2303no0R.f(c2109lo0A.a) != null) {
                    c2303no0R.n(c2109lo0A);
                } else {
                    c2985uq0 = null;
                }
                if (c2985uq0 == null) {
                    c2985uq0 = c2985uq2;
                    c2303no0R.i(c2109lo0A);
                }
                c2985uq0 = c2985uq2;
                fd0.hide();
                return;
            case 14:
                DialogC2432p5 dialogC2432p5 = (DialogC2432p5) obj2;
                AbstractC1474fG.j(dialogC2432p5, "this$0");
                C2109lo0 c2109lo1 = (C2109lo0) obj;
                AbstractC1474fG.j(c2109lo1, "$tvShow");
                C2303no0 c2303no0R2 = ((AppDatabase) dialogC2432p5.l).r();
                C2109lo0 c2109lo0A2 = C2109lo0.a(c2109lo1, null, null, null, null, null, null, AQ.w);
                c2109lo0A2.q = !c2109lo1.q;
                c2303no0R2.getClass();
                if (c2303no0R2.f(c2109lo0A2.a) != null) {
                    c2303no0R2.n(c2109lo0A2);
                } else {
                    c2985uq1 = null;
                }
                if (c2985uq1 == null) {
                    c2985uq1 = c2985uq2;
                    c2303no0R2.i(c2109lo0A2);
                }
                c2985uq1 = c2985uq2;
                dialogC2432p5.hide();
                return;
            case 15:
                C1423en0 c1423en0 = (C1423en0) obj2;
                AbstractC1474fG.j(c1423en0, "this$0");
                C1521fn0 c1521fn0 = (C1521fn0) obj;
                AbstractC1474fG.j(c1521fn0, "this$1");
                int iD2 = c1423en0.d();
                if (iD2 != -1) {
                    Runnable runnable = c1521fn0.j;
                    if (runnable != null) {
                        c1521fn0.i.removeCallbacks(runnable);
                    }
                    int i34 = c1521fn0.h;
                    c1521fn0.h = iD2;
                    c1521fn0.d(i34);
                    c1521fn0.d(c1521fn0.h);
                    c1521fn0.e.b(c1521fn0.d.get(iD2));
                    c1521fn0.f.c();
                    return;
                }
                return;
            case 16:
                C1619gn0 c1619gn0 = (C1619gn0) obj2;
                AbstractC1474fG.j(c1619gn0, "this$0");
                C1717hn0 c1717hn0 = (C1717hn0) obj;
                AbstractC1474fG.j(c1717hn0, "this$1");
                int iD3 = c1619gn0.d();
                if (iD3 != -1) {
                    c1717hn0.f.b(c1717hn0.d.get(iD3));
                    return;
                }
                return;
            default:
                TextView textView2 = (TextView) obj2;
                AbstractC1474fG.j(textView2, "$this_apply");
                Jo0 jo0 = (Jo0) obj;
                AbstractC1474fG.j(jo0, "this$0");
                textView2.getHandler().removeCallbacksAndMessages(null);
                C2109lo0 c2109lo2 = jo0.w;
                if (c2109lo2 == null) {
                    AbstractC1474fG.U("tvShow");
                    throw null;
                }
                String str5 = c2109lo2.a;
                AbstractC1474fG.j(str5, "id");
                AbstractC0397Ej.z(textView2, new DC(str5));
                return;
        }
    }
}
