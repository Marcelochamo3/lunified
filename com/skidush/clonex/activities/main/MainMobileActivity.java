package com.skidush.clonex.activities.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.ui.SixItemBottomNavigationView;
import io.sentry.android.replay.v;
import java.lang.ref.WeakReference;
import o.AbstractActivityC1540fx;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1910jn;
import o.AbstractC2822t60;
import o.AbstractC3021v9;
import o.AbstractC3151wc0;
import o.AbstractComponentCallbacksC1247cx;
import o.BU;
import o.C0560Kq;
import o.C0730Rf;
import o.C0812Uj;
import o.C1123bj0;
import o.C1424eo;
import o.C1703hg0;
import o.C1775iN;
import o.C1816io0;
import o.C2067lN;
import o.C2278nc;
import o.C2860tc0;
import o.C2957uc0;
import o.C3054vc0;
import o.C3289xx;
import o.C3362yl;
import o.Cc0;
import o.Cr0;
import o.DialogC2432p5;
import o.Ec0;
import o.EnumC1706hi;
import o.FM;
import o.GT;
import o.H5;
import o.IM;
import o.InterfaceC0473Hh;
import o.JM;
import o.Jp0;
import o.KM;
import o.Lx0;
import o.Na0;
import o.PM;
import o.Q30;
import o.QM;
import o.Qq0;
import o.RM;
import o.SM;
import o.SY;
import o.Sr0;
import o.WJ;
import o.YQ;
import o.YT;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public final class MainMobileActivity extends AbstractActivityC1540fx {
    public static final /* synthetic */ int Q = 0;
    public Na0 I;
    public Qq0 K;
    public C1703hg0 L;
    public DialogC2432p5 M;
    public YQ N;
    public int P;
    public final C0560Kq J = new C0560Kq(AbstractC2822t60.a(C2067lN.class), new QM(this, 1), new QM(this, 0), new QM(this, 2));
    public String O = "default";

    public static final void w(MainMobileActivity mainMobileActivity) {
        mainMobileActivity.getClass();
        new AlertDialog.Builder(mainMobileActivity).setTitle("Confirmación de salida").setMessage("¿Estás seguro de que deseas salir de la aplicación?").setPositiveButton("Sí", new IM(mainMobileActivity, 0)).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x(MainMobileActivity mainMobileActivity, boolean z, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        SM sm;
        mainMobileActivity.getClass();
        if (interfaceC0473Hh instanceof SM) {
            sm = (SM) interfaceC0473Hh;
            int i = sm.f511o;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm.f511o = i - Integer.MIN_VALUE;
            } else {
                sm = new SM(mainMobileActivity, interfaceC0473Hh);
            }
        } else {
            sm = new SM(mainMobileActivity, interfaceC0473Hh);
        }
        Object objJ = sm.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = sm.f511o;
        boolean z2 = true;
        if (i2 == 0) {
            Jp0.O(objJ);
            Ec0 ec0 = Ec0.a;
            sm.l = mainMobileActivity;
            sm.f511o = 1;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new Cc0(mainMobileActivity, z, null), sm);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainMobileActivity = sm.l;
            Jp0.O(objJ);
        }
        AbstractC3151wc0 abstractC3151wc0 = (AbstractC3151wc0) objJ;
        if (!AbstractC1474fG.b(abstractC3151wc0, C2860tc0.a)) {
            if (abstractC3151wc0 instanceof C3054vc0) {
                Ec0 ec1 = Ec0.a;
                Ec0.g(mainMobileActivity, ((C3054vc0) abstractC3151wc0).a);
            } else {
                if (!(abstractC3151wc0 instanceof C2957uc0)) {
                    throw new C0730Rf();
                }
                Throwable th = ((C2957uc0) abstractC3151wc0).b;
                Ec0 ec2 = Ec0.a;
                Ec0.b();
                Toast.makeText(mainMobileActivity, "No se pudo validar la sesión. Intenta nuevamente.", 1).show();
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 4;
        int i2 = 0;
        Cr0 cr0 = Cr0.y;
        String strB = cr0.b();
        if (strB == null) {
            strB = "default";
        }
        this.O = strB;
        setTheme(AbstractC1459f50.D(strB));
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_main_mobile, (ViewGroup) null, false);
        int i3 = R.id.bnv_main;
        SixItemBottomNavigationView sixItemBottomNavigationView = (SixItemBottomNavigationView) Sr0.g(viewInflate, R.id.bnv_main);
        if (sixItemBottomNavigationView != null) {
            i3 = R.id.nav_main_fragment;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) Sr0.g(viewInflate, R.id.nav_main_fragment);
            if (fragmentContainerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.I = new Na0(constraintLayout, sixItemBottomNavigationView, fragmentContainerView, i);
                setContentView(constraintLayout);
                String strB2 = cr0.b();
                C1123bj0 c1123bj0F = AbstractC1459f50.F(strB2 != null ? strB2 : "default");
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{c1123bj0F.c, c1123bj0F.d});
                Na0 na0 = this.I;
                AbstractC1474fG.g(na0);
                ((ConstraintLayout) na0.m).setBackgroundColor(c1123bj0F.a);
                Na0 na1 = this.I;
                AbstractC1474fG.g(na1);
                SixItemBottomNavigationView sixItemBottomNavigationView2 = (SixItemBottomNavigationView) na1.n;
                int i4 = c1123bj0F.b;
                sixItemBottomNavigationView2.setBackgroundColor(i4);
                Na0 na2 = this.I;
                AbstractC1474fG.g(na2);
                ((SixItemBottomNavigationView) na2.n).setItemIconTintList(colorStateList);
                Na0 na3 = this.I;
                AbstractC1474fG.g(na3);
                ((SixItemBottomNavigationView) na3.n).setItemTextColor(colorStateList);
                getWindow().setStatusBarColor(i4);
                getWindow().setNavigationBarColor(i4);
                C3289xx c3289xxU = u();
                Na0 na4 = this.I;
                AbstractC1474fG.g(na4);
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = c3289xxU.D(((FragmentContainerView) na4.f414o).getId());
                AbstractC1474fG.h(abstractComponentCallbacksC1247cxD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                YT ytW = ((NavHostFragment) abstractComponentCallbacksC1247cxD).W();
                SharedPreferences sharedPreferences = getSharedPreferences("com.skidush.clonex.preferences", 0);
                AbstractC1474fG.i(sharedPreferences, "getSharedPreferences(...)");
                AbstractC1459f50.n = sharedPreferences;
                AppDatabase.m.E(this);
                int iOrdinal = zy0.B(this).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        startActivity(new Intent(this, (Class<?>) MainTvActivity.class));
                        finish();
                        return;
                    }
                } else if (AbstractC1459f50.r() == null && !isFinishing() && !isDestroyed()) {
                    DialogC2432p5 dialogC2432p5 = new DialogC2432p5(this, 0);
                    this.M = dialogC2432p5;
                    dialogC2432p5.show();
                }
                if (bundle == null) {
                    Q30 q30W = AbstractC1459f50.w();
                    if (AbstractC1474fG.b(q30W.getName(), "xADULTOS") || AbstractC1474fG.b(q30W.getName(), "Pornhub")) {
                        new SY(new PM(new v(7, this), i2)).Z(u(), "PinInputDialog");
                    } else {
                        ytW.n(R.id.home, null, null);
                    }
                }
                C2067lN c2067lN = (C2067lN) this.J.getValue();
                AbstractC1376eG.w(AbstractC3021v9.o(c2067lN), AbstractC1910jn.b, 0, new C1775iN(c2067lN, null), 2);
                Na0 na5 = this.I;
                AbstractC1474fG.g(na5);
                SixItemBottomNavigationView sixItemBottomNavigationView3 = (SixItemBottomNavigationView) na5.n;
                AbstractC1474fG.i(sixItemBottomNavigationView3, "bnvMain");
                AbstractC1474fG.j(ytW, "navController");
                sixItemBottomNavigationView3.setOnItemSelectedListener(new C2278nc(19, ytW));
                ytW.b(new BU(new WeakReference(sixItemBottomNavigationView3), ytW, i2));
                Na0 na6 = this.I;
                AbstractC1474fG.g(na6);
                MenuItem menuItemFindItem = ((SixItemBottomNavigationView) na6.n).getMenu().findItem(R.id.movies_home);
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible((AbstractC1459f50.w() instanceof C1816io0) || (AbstractC1459f50.w() instanceof Lx0));
                }
                boolean z = (AbstractC1459f50.w() instanceof C1424eo) || (AbstractC1459f50.w() instanceof H5);
                Na0 na7 = this.I;
                AbstractC1474fG.g(na7);
                MenuItem menuItemFindItem2 = ((SixItemBottomNavigationView) na7.n).getMenu().findItem(R.id.movies);
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setVisible(!z);
                }
                Na0 na8 = this.I;
                AbstractC1474fG.g(na8);
                MenuItem menuItemFindItem3 = ((SixItemBottomNavigationView) na8.n).getMenu().findItem(R.id.tv_shows);
                if (menuItemFindItem3 != null) {
                    menuItemFindItem3.setVisible(!z);
                }
                Na0 na9 = this.I;
                AbstractC1474fG.g(na9);
                ((SixItemBottomNavigationView) na9.n).setOnItemSelectedListener(new C0812Uj(this, i, ytW));
                ytW.b(new GT() { // from class: o.GM
                    @Override // o.GT
                    public final void a(YT yt, TT tt) {
                        int i5 = MainMobileActivity.Q;
                        MainMobileActivity mainMobileActivity = this.a;
                        AbstractC1474fG.j(mainMobileActivity, "this$0");
                        AbstractC1474fG.j(yt, "<anonymous parameter 0>");
                        AbstractC1474fG.j(tt, "destination");
                        boolean z2 = (AbstractC1459f50.w() instanceof C1816io0) || (AbstractC1459f50.w() instanceof Lx0);
                        int i6 = tt.s;
                        boolean z3 = i6 == R.id.search || i6 == R.id.home || i6 == R.id.movies_home || i6 == R.id.movies || i6 == R.id.tv_shows || i6 == R.id.events;
                        Na0 na10 = mainMobileActivity.I;
                        AbstractC1474fG.g(na10);
                        ((SixItemBottomNavigationView) na10.n).setVisibility(z3 ? 0 : 8);
                        if (tt.s == R.id.events) {
                            Na0 na11 = mainMobileActivity.I;
                            AbstractC1474fG.g(na11);
                            MenuItem menuItemFindItem4 = ((SixItemBottomNavigationView) na11.n).getMenu().findItem(R.id.more);
                            if (menuItemFindItem4 != null) {
                                menuItemFindItem4.setChecked(true);
                            }
                        }
                        Na0 na12 = mainMobileActivity.I;
                        AbstractC1474fG.g(na12);
                        MenuItem menuItemFindItem5 = ((SixItemBottomNavigationView) na12.n).getMenu().findItem(R.id.movies_home);
                        if (menuItemFindItem5 != null) {
                            menuItemFindItem5.setVisible(z2);
                        }
                        boolean z4 = (AbstractC1459f50.w() instanceof C1424eo) || (AbstractC1459f50.w() instanceof H5);
                        Na0 na13 = mainMobileActivity.I;
                        AbstractC1474fG.g(na13);
                        MenuItem menuItemFindItem6 = ((SixItemBottomNavigationView) na13.n).getMenu().findItem(R.id.movies);
                        if (menuItemFindItem6 != null) {
                            menuItemFindItem6.setVisible(!z4);
                        }
                        Na0 na14 = mainMobileActivity.I;
                        AbstractC1474fG.g(na14);
                        MenuItem menuItemFindItem7 = ((SixItemBottomNavigationView) na14.n).getMenu().findItem(R.id.tv_shows);
                        if (menuItemFindItem7 == null) {
                            return;
                        }
                        menuItemFindItem7.setVisible(!z4);
                    }
                });
                AbstractC1376eG.w(AbstractC1459f50.y(this), null, 0, new JM(this, null), 3);
                n().a(this, new KM(ytW, this, i2));
                y();
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1703hg0 c1703hg0 = this.L;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.L = null;
        DialogC2432p5 dialogC2432p5 = this.M;
        if (dialogC2432p5 != null) {
            dialogC2432p5.dismiss();
        }
        this.M = null;
        YQ yq = this.N;
        if (yq != null) {
            yq.dismiss();
        }
        this.N = null;
        Qq0 qq0 = this.K;
        if (qq0 != null) {
            qq0.hide();
        }
        this.I = null;
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.O;
        String strB = Cr0.y.b();
        if (strB == null) {
            strB = "default";
        }
        if (AbstractC1474fG.b(str, strB)) {
            y();
        } else {
            recreate();
        }
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onStop() {
        super.onStop();
        C1703hg0 c1703hg0 = this.L;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.L = null;
    }

    public final void y() {
        C1703hg0 c1703hg0 = this.L;
        if (c1703hg0 == null || !c1703hg0.a()) {
            WJ wjY = AbstractC1459f50.y(this);
            C3362yl c3362yl = AbstractC1910jn.a;
            this.L = AbstractC1376eG.w(wjY, FM.a, 0, new RM(this, null), 2);
        }
    }
}
