package com.skidush.clonex.activities.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainTvActivity;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.navigation.widget.NavigationSlideHeaderView;
import com.skidush.navigation.widget.NavigationSlideView;
import io.sentry.android.replay.v;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.AbstractActivityC1540fx;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;
import o.AbstractC1910jn;
import o.AbstractC2822t60;
import o.AbstractC3021v9;
import o.AbstractC3151wc0;
import o.AbstractComponentCallbacksC1247cx;
import o.BU;
import o.C0560Kq;
import o.C0730Rf;
import o.C0993aN;
import o.C1123bj0;
import o.C1424eo;
import o.C1583gR;
import o.C1703hg0;
import o.C1775iN;
import o.C1816io0;
import o.C2067lN;
import o.C2860tc0;
import o.C2957uc0;
import o.C3054vc0;
import o.C3237xU;
import o.C3289xx;
import o.Cc0;
import o.Cr0;
import o.DialogC2432p5;
import o.Ec0;
import o.EnumC1706hi;
import o.FM;
import o.GT;
import o.H5;
import o.IT;
import o.InterfaceC0473Hh;
import o.Jp0;
import o.KM;
import o.Lx0;
import o.Na0;
import o.PM;
import o.Q30;
import o.QM;
import o.SY;
import o.Sq0;
import o.Sr0;
import o.UM;
import o.WM;
import o.YT;
import o.ZM;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public final class MainTvActivity extends AbstractActivityC1540fx {
    public static final /* synthetic */ int Q = 0;
    public Na0 I;
    public final C0560Kq J = new C0560Kq(AbstractC2822t60.a(C2067lN.class), new QM(this, 4), new QM(this, 3), new QM(this, 5));
    public Sq0 K;
    public DialogC2432p5 L;
    public AlertDialog M;
    public C1703hg0 N;
    public TextView O;
    public int P;

    public static final void w(MainTvActivity mainTvActivity) {
        mainTvActivity.getClass();
        mainTvActivity.M = new AlertDialog.Builder(mainTvActivity).setTitle("Confirmación de salida").setMessage("¿Estás seguro de que deseas salir de la aplicación?").setPositiveButton("Sí", new UM(0, mainTvActivity)).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x(MainTvActivity mainTvActivity, boolean z, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0993aN c0993aN;
        mainTvActivity.getClass();
        if (interfaceC0473Hh instanceof C0993aN) {
            c0993aN = (C0993aN) interfaceC0473Hh;
            int i = c0993aN.f675o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0993aN.f675o = i - Integer.MIN_VALUE;
            } else {
                c0993aN = new C0993aN(mainTvActivity, interfaceC0473Hh);
            }
        } else {
            c0993aN = new C0993aN(mainTvActivity, interfaceC0473Hh);
        }
        Object objJ = c0993aN.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0993aN.f675o;
        boolean z2 = true;
        if (i2 == 0) {
            Jp0.O(objJ);
            Ec0 ec0 = Ec0.a;
            c0993aN.l = mainTvActivity;
            c0993aN.f675o = 1;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new Cc0(mainTvActivity, z, null), c0993aN);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainTvActivity = c0993aN.l;
            Jp0.O(objJ);
        }
        AbstractC3151wc0 abstractC3151wc0 = (AbstractC3151wc0) objJ;
        if (!AbstractC1474fG.b(abstractC3151wc0, C2860tc0.a)) {
            if (abstractC3151wc0 instanceof C3054vc0) {
                Ec0 ec1 = Ec0.a;
                Ec0.g(mainTvActivity, ((C3054vc0) abstractC3151wc0).a);
            } else {
                if (!(abstractC3151wc0 instanceof C2957uc0)) {
                    throw new C0730Rf();
                }
                Throwable th = ((C2957uc0) abstractC3151wc0).b;
                Ec0 ec2 = Ec0.a;
                Ec0.b();
                Toast.makeText(mainTvActivity, "No se pudo validar la sesión. Intenta nuevamente.", 1).show();
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2 = 8;
        int i3 = 2;
        int i4 = 3;
        int i5 = 1;
        Cr0 cr0 = Cr0.y;
        String strB = cr0.b();
        if (strB == null) {
            strB = "default";
        }
        switch (strB) {
            case "steel_blue":
                i = R.style.AppTheme_Tv_Steel;
                break;
            case "retro_neon":
                i = R.style.AppTheme_Tv_Neon;
                break;
            case "nord_frost":
                i = R.style.AppTheme_Tv_Nord;
                break;
            case "crimson_noir":
                i = R.style.AppTheme_Tv_Crimson;
                break;
            case "forest_night":
                i = R.style.AppTheme_Tv_Forest;
                break;
            case "emerald_luxe":
                i = R.style.AppTheme_Tv_Emerald;
                break;
            case "sunset_cinema":
                i = R.style.AppTheme_Tv_Sunset;
                break;
            case "nero_amoled_oled":
                i = R.style.AppTheme_Tv_Amoled;
                break;
            case "midnight_violet":
                i = R.style.AppTheme_Tv_Violet;
                break;
            default:
                i = R.style.AppTheme_Tv;
                break;
        }
        setTheme(i);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_main_tv, (ViewGroup) null, false);
        int i6 = R.id.nav_main;
        NavigationSlideView navigationSlideView = (NavigationSlideView) Sr0.g(viewInflate, R.id.nav_main);
        if (navigationSlideView != null) {
            i6 = R.id.nav_main_fragment;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) Sr0.g(viewInflate, R.id.nav_main_fragment);
            if (fragmentContainerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.I = new Na0(constraintLayout, navigationSlideView, fragmentContainerView, 5);
                setContentView(constraintLayout);
                String strB2 = cr0.b();
                C1123bj0 c1123bj0F = AbstractC1459f50.F(strB2 != null ? strB2 : "default");
                Na0 na0 = this.I;
                AbstractC1474fG.g(na0);
                ((ConstraintLayout) na0.m).setBackgroundColor(c1123bj0F.a);
                Na0 na1 = this.I;
                AbstractC1474fG.g(na1);
                NavigationSlideView navigationSlideView2 = (NavigationSlideView) na1.n;
                int i7 = c1123bj0F.b;
                navigationSlideView2.setBackgroundColor(i7);
                Na0 na2 = this.I;
                AbstractC1474fG.g(na2);
                NavigationSlideHeaderView headerView = ((NavigationSlideView) na2.n).getHeaderView();
                if (headerView != null) {
                    headerView.setBackgroundColor(i7);
                    C1583gR c1583gRI = C1583gR.i(headerView);
                    ((TextView) c1583gRI.p).setTextColor(c1123bj0F.e);
                    ((TextView) c1583gRI.f793o).setTextColor(c1123bj0F.f);
                }
                getWindow().setStatusBarColor(i7);
                getWindow().setNavigationBarColor(i7);
                getWindow().getDecorView().setSystemUiVisibility(5894);
                Ec0 ec0 = Ec0.a;
                String string = Ec0.h(this).getString("vencimiento", null);
                if (string != null && !AbstractC1899jh0.O(string)) {
                    float f = getResources().getDisplayMetrics().density;
                    TextView textView = new TextView(this);
                    textView.setText("Expira: " + string + "\nApp v5.6.5 (150)");
                    textView.setTextColor(-10496);
                    textView.setTextSize(2, 10.0f);
                    textView.setMaxLines(3);
                    int i8 = (int) (6 * f);
                    textView.setPadding(i8, (int) (4 * f), i8, (int) (f * 8));
                    textView.setVisibility(8);
                    this.O = textView;
                    Na0 na3 = this.I;
                    AbstractC1474fG.g(na3);
                    TextView textView2 = this.O;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388691;
                    ((NavigationSlideView) na3.n).addView(textView2, layoutParams);
                }
                C3289xx c3289xxU = u();
                Na0 na4 = this.I;
                AbstractC1474fG.g(na4);
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = c3289xxU.D(((FragmentContainerView) na4.f414o).getId());
                AbstractC1474fG.h(abstractComponentCallbacksC1247cxD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                final YT ytW = ((NavHostFragment) abstractComponentCallbacksC1247cxD).W();
                SharedPreferences sharedPreferences = getSharedPreferences("com.skidush.clonex.preferences", 0);
                AbstractC1474fG.i(sharedPreferences, "getSharedPreferences(...)");
                AbstractC1459f50.n = sharedPreferences;
                AppDatabase.m.E(this);
                int iOrdinal = zy0.B(this).ordinal();
                if (iOrdinal == 0) {
                    startActivity(new Intent(this, (Class<?>) MainMobileActivity.class));
                    finish();
                    return;
                }
                if (iOrdinal == 1 && AbstractC1459f50.r() == null && !isFinishing() && !isDestroyed()) {
                    DialogC2432p5 dialogC2432p5 = new DialogC2432p5(this, 1);
                    this.L = dialogC2432p5;
                    dialogC2432p5.show();
                }
                if (bundle == null) {
                    Q30 q30W = AbstractC1459f50.w();
                    if (AbstractC1474fG.b(q30W.getName(), "xADULTOS") || AbstractC1474fG.b(q30W.getName(), "Pornhub")) {
                        new SY(new PM(new v(i2, this), i5)).Z(u(), "PinInputDialog");
                    } else {
                        ytW.n(R.id.home, null, null);
                    }
                }
                Na0 na5 = this.I;
                AbstractC1474fG.g(na5);
                NavigationSlideView navigationSlideView3 = (NavigationSlideView) na5.n;
                AbstractC1474fG.i(navigationSlideView3, "navMain");
                AbstractC1474fG.j(ytW, "navController");
                navigationSlideView3.setOnItemSelectedListener(new IT(ytW, i3));
                navigationSlideView3.setOnItemReselectedListener(new IT(ytW, i4));
                ytW.b(new BU(new WeakReference(navigationSlideView3), ytW, i5));
                Na0 na6 = this.I;
                AbstractC1474fG.g(na6);
                C3237xU menu = ((NavigationSlideView) na6.n).getMenu();
                MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.events) : null;
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible(AbstractC1459f50.w() == C1816io0.b);
                }
                Na0 na7 = this.I;
                AbstractC1474fG.g(na7);
                C3237xU menu2 = ((NavigationSlideView) na7.n).getMenu();
                MenuItem menuItemFindItem2 = menu2 != null ? menu2.findItem(R.id.movies_home) : null;
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setVisible((AbstractC1459f50.w() instanceof C1816io0) || (AbstractC1459f50.w() instanceof Lx0));
                }
                boolean z = (AbstractC1459f50.w() instanceof C1424eo) || (AbstractC1459f50.w() instanceof H5);
                Na0 na8 = this.I;
                AbstractC1474fG.g(na8);
                C3237xU menu3 = ((NavigationSlideView) na8.n).getMenu();
                MenuItem menuItemFindItem3 = menu3 != null ? menu3.findItem(R.id.movies) : null;
                if (menuItemFindItem3 != null) {
                    menuItemFindItem3.setVisible(!z);
                }
                Na0 na9 = this.I;
                AbstractC1474fG.g(na9);
                C3237xU menu4 = ((NavigationSlideView) na9.n).getMenu();
                MenuItem menuItemFindItem4 = menu4 != null ? menu4.findItem(R.id.tv_shows) : null;
                if (menuItemFindItem4 != null) {
                    menuItemFindItem4.setVisible(!z);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Na0 na10 = this.I;
                    AbstractC1474fG.g(na10);
                    ((FragmentContainerView) na10.f414o).setFocusedByDefault(true);
                }
                ytW.b(new GT() { // from class: o.TM
                    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.GT
                    public final void a(YT yt, TT tt) {
                        MenuItem menuItem;
                        MenuItem menuItemFindItem5;
                        MenuItem menuItemFindItem6;
                        Object next;
                        Q30 q30;
                        Object objValueOf;
                        int i9 = 0;
                        int i10 = 1;
                        int i11 = MainTvActivity.Q;
                        MainTvActivity mainTvActivity = this.a;
                        AbstractC1474fG.j(mainTvActivity, "this$0");
                        YT yt2 = ytW;
                        AbstractC1474fG.j(yt2, "$navController");
                        AbstractC1474fG.j(yt, "<anonymous parameter 0>");
                        AbstractC1474fG.j(tt, "destination");
                        Na0 na11 = mainTvActivity.I;
                        AbstractC1474fG.g(na11);
                        NavigationSlideHeaderView headerView2 = ((NavigationSlideView) na11.n).getHeaderView();
                        MenuItem menuItem2 = null;
                        if (headerView2 != null) {
                            C1583gR c1583gRI2 = C1583gR.i(headerView2);
                            ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(headerView2.getContext());
                            String strF = AbstractC1459f50.w().f();
                            if (strF == null) {
                                objValueOf = Integer.valueOf(R.drawable.ic_provider_default_logo);
                            } else {
                                if (strF.length() <= 0) {
                                    objValueOf = strF;
                                    objValueOf = null;
                                }
                                if (objValueOf == null) {
                                    objValueOf = Integer.valueOf(R.drawable.ic_provider_default_logo);
                                }
                            }
                            componentCallbacks2C3406z70E.getClass();
                            new C2630r70(componentCallbacks2C3406z70E.l, componentCallbacks2C3406z70E, Drawable.class, componentCallbacks2C3406z70E.m).J(objValueOf).H((ImageView) c1583gRI2.n);
                            ((TextView) c1583gRI2.p).setText(AbstractC1459f50.w().getName());
                            ((TextView) c1583gRI2.f793o).setText(mainTvActivity.getString(R.string.main_menu_change_provider));
                            headerView2.setOnOpenListener(new VM(c1583gRI2, mainTvActivity, i9));
                            headerView2.setOnCloseListener(new VM(c1583gRI2, mainTvActivity, i10));
                            headerView2.setOnClickListener(new ViewOnClickListenerC3251xe(7, yt2));
                        }
                        int i12 = tt.s;
                        if (i12 == R.id.search || i12 == R.id.home || i12 == R.id.movies_home || i12 == R.id.movies || i12 == R.id.tv_shows || i12 == R.id.events || i12 == R.id.favorites || i12 == R.id.history || i12 == R.id.settings) {
                            Na0 na12 = mainTvActivity.I;
                            AbstractC1474fG.g(na12);
                            ((NavigationSlideView) na12.n).setVisibility(0);
                        } else {
                            Na0 na13 = mainTvActivity.I;
                            AbstractC1474fG.g(na13);
                            ((NavigationSlideView) na13.n).setVisibility(8);
                        }
                        Na0 na14 = mainTvActivity.I;
                        AbstractC1474fG.g(na14);
                        C3237xU menu5 = ((NavigationSlideView) na14.n).getMenu();
                        MenuItem menuItemFindItem7 = menu5 != null ? menu5.findItem(R.id.movies_home) : null;
                        if (menuItemFindItem7 != null) {
                            menuItemFindItem7.setVisible((AbstractC1459f50.w() instanceof C1816io0) || (AbstractC1459f50.w() instanceof Lx0));
                        }
                        Na0 na15 = mainTvActivity.I;
                        AbstractC1474fG.g(na15);
                        C3237xU menu6 = ((NavigationSlideView) na15.n).getMenu();
                        MenuItem menuItemFindItem8 = menu6 != null ? menu6.findItem(R.id.events) : null;
                        if (menuItemFindItem8 != null) {
                            String strB3 = Cr0.m.b();
                            if (AbstractC1474fG.b(strB3, "PPV.TO")) {
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
                                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB3));
                                Q30 q31 = (Q30) next;
                                q30 = q31 == null ? C1816io0.b : q31;
                            }
                            menuItemFindItem8.setVisible(q30 == C1816io0.b);
                        }
                        i9 = ((AbstractC1459f50.w() instanceof C1424eo) || (AbstractC1459f50.w() instanceof H5)) ? 1 : 0;
                        Na0 na16 = mainTvActivity.I;
                        AbstractC1474fG.g(na16);
                        C3237xU menu7 = ((NavigationSlideView) na16.n).getMenu();
                        if (menu7 != null) {
                            menuItemFindItem6 = menu7.findItem(R.id.movies);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem = menuItemFindItem6;
                            menuItem.setVisible(i9 ^ 1);
                        }
                        menuItem = menuItemFindItem6;
                        Na0 na17 = mainTvActivity.I;
                        AbstractC1474fG.g(na17);
                        C3237xU menu8 = ((NavigationSlideView) na17.n).getMenu();
                        if (menu8 != null) {
                            menuItemFindItem5 = menu8.findItem(R.id.tv_shows);
                        }
                        if (menuItem2 == null) {
                            menuItem2 = menuItemFindItem5;
                            return;
                        } else {
                            menuItem2 = menuItemFindItem5;
                            menuItem2.setVisible(i9 ^ 1);
                        }
                    }
                });
                AbstractC1376eG.w(AbstractC1459f50.y(this), null, 0, new WM(this, null), 3);
                n().a(this, new KM(ytW, this, i5));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1703hg0 c1703hg0 = this.N;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.N = null;
        DialogC2432p5 dialogC2432p5 = this.L;
        if (dialogC2432p5 != null) {
            dialogC2432p5.dismiss();
        }
        this.L = null;
        AlertDialog alertDialog = this.M;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.M = null;
        Sq0 sq0 = this.K;
        if (sq0 != null) {
            sq0.hide();
        }
        this.O = null;
        this.I = null;
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onStart() {
        super.onStart();
        C2067lN c2067lN = (C2067lN) this.J.getValue();
        AbstractC1376eG.w(AbstractC3021v9.o(c2067lN), AbstractC1910jn.b, 0, new C1775iN(c2067lN, null), 2);
        C1703hg0 c1703hg0 = this.N;
        if (c1703hg0 == null || !c1703hg0.a()) {
            this.N = AbstractC1376eG.w(AbstractC1459f50.y(this), FM.a, 0, new ZM(this, null), 2);
        }
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onStop() {
        super.onStop();
        C1703hg0 c1703hg0 = this.N;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.N = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }
}
