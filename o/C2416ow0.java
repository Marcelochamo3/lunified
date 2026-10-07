package o;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.ow0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2416ow0 extends AP implements InterfaceC1157c1 {
    public static final AccelerateInterpolator B = new AccelerateInterpolator();
    public static final DecelerateInterpolator C = new DecelerateInterpolator();
    public final L80 A;
    public Context d;
    public Context e;
    public ActionBarOverlayLayout f;
    public ActionBarContainer g;
    public InterfaceC0760Sj h;
    public ActionBarContextView i;
    public final View j;
    public boolean k;
    public C2319nw0 l;
    public C2319nw0 m;
    public InterfaceC2811t1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f959o;
    public final ArrayList p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public C2606qu0 v;
    public boolean w;
    public boolean x;
    public final C2222mw0 y;
    public final C2222mw0 z;

    public C2416ow0(Activity activity, boolean z) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new C2222mw0(this, 0);
        this.z = new C2222mw0(this, 1);
        this.A = new L80(this);
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z) {
            return;
        }
        this.j = decorView.findViewById(R.id.content);
    }

    public final void B(boolean z) {
        C2509pu0 c2509pu0I;
        C2509pu0 c2509pu0I2;
        if (z) {
            if (!this.t) {
                this.t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                F(false);
            }
        } else if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            F(false);
        }
        if (!this.g.isLaidOut()) {
            if (z) {
                ((Ol0) this.h).a.setVisibility(4);
                this.i.setVisibility(0);
                return;
            } else {
                ((Ol0) this.h).a.setVisibility(0);
                this.i.setVisibility(8);
                return;
            }
        }
        if (z) {
            Ol0 ol0 = (Ol0) this.h;
            c2509pu0I = It0.a(ol0.a);
            c2509pu0I.a(0.0f);
            c2509pu0I.c(100L);
            c2509pu0I.d(new Nl0(ol0, 4));
            c2509pu0I2 = this.i.i(0, 200L);
        } else {
            Ol0 ol1 = (Ol0) this.h;
            C2509pu0 c2509pu0A = It0.a(ol1.a);
            c2509pu0A.a(1.0f);
            c2509pu0A.c(200L);
            c2509pu0A.d(new Nl0(ol1, 0));
            c2509pu0I = this.i.i(8, 100L);
            c2509pu0I2 = c2509pu0A;
        }
        C2606qu0 c2606qu0 = new C2606qu0();
        ArrayList arrayList = c2606qu0.a;
        arrayList.add(c2509pu0I);
        View view = (View) c2509pu0I.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c2509pu0I2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c2509pu0I2);
        c2606qu0.b();
    }

    public final Context C() {
        if (this.e == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(com.skidush.clonex.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.e = new ContextThemeWrapper(this.d, i);
            } else {
                this.e = this.d;
            }
        }
        return this.e;
    }

    public final void D(View view) {
        InterfaceC0760Sj wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.skidush.clonex.R.id.decor_content_parent);
        this.f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.skidush.clonex.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0760Sj) {
            wrapper = (InterfaceC0760Sj) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.h = wrapper;
        this.i = (ActionBarContextView) view.findViewById(com.skidush.clonex.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.skidush.clonex.R.id.action_bar_container);
        this.g = actionBarContainer;
        InterfaceC0760Sj interfaceC0760Sj = this.h;
        if (interfaceC0760Sj == null || this.i == null || actionBarContainer == null) {
            throw new IllegalStateException(C2416ow0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((Ol0) interfaceC0760Sj).a.getContext();
        this.d = context;
        if ((((Ol0) this.h).b & 4) != 0) {
            this.k = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.h.getClass();
        E(context.getResources().getBoolean(com.skidush.clonex.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.d.obtainStyledAttributes(null, T40.a, com.skidush.clonex.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f;
            if (!actionBarOverlayLayout2.r) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.g;
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(boolean z) {
        if (z) {
            this.g.setTabContainer(null);
            ((Ol0) this.h).getClass();
        } else {
            ((Ol0) this.h).getClass();
            this.g.setTabContainer(null);
        }
        this.h.getClass();
        ((Ol0) this.h).a.setCollapsible(false);
        this.f.setHasNonEmbeddedTabs(false);
    }

    public final void F(boolean z) {
        boolean z2 = this.t || !this.s;
        View view = this.j;
        L80 l80 = this.A;
        if (!z2) {
            if (this.u) {
                this.u = false;
                C2606qu0 c2606qu0 = this.v;
                if (c2606qu0 != null) {
                    c2606qu0.a();
                }
                int i = this.q;
                C2222mw0 c2222mw0 = this.y;
                if (i != 0 || (!this.w && !z)) {
                    c2222mw0.a();
                    return;
                }
                this.g.setAlpha(1.0f);
                this.g.setTransitioning(true);
                C2606qu0 c2606qu1 = new C2606qu0();
                float f = -this.g.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.g.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C2509pu0 c2509pu0A = It0.a(this.g);
                c2509pu0A.e(f);
                View view2 = (View) c2509pu0A.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(l80 != null ? new C0658Ol(l80, view2) : null);
                }
                boolean z3 = c2606qu1.e;
                ArrayList arrayList = c2606qu1.a;
                if (!z3) {
                    arrayList.add(c2509pu0A);
                }
                if (this.r && view != null) {
                    C2509pu0 c2509pu0A2 = It0.a(view);
                    c2509pu0A2.e(f);
                    if (!c2606qu1.e) {
                        arrayList.add(c2509pu0A2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = B;
                boolean z4 = c2606qu1.e;
                if (!z4) {
                    c2606qu1.c = accelerateInterpolator;
                }
                if (!z4) {
                    c2606qu1.b = 250L;
                }
                if (!z4) {
                    c2606qu1.d = c2222mw0;
                }
                this.v = c2606qu1;
                c2606qu1.b();
                return;
            }
            return;
        }
        if (this.u) {
            return;
        }
        this.u = true;
        C2606qu0 c2606qu2 = this.v;
        if (c2606qu2 != null) {
            c2606qu2.a();
        }
        this.g.setVisibility(0);
        int i2 = this.q;
        C2222mw0 c2222mw1 = this.z;
        if (i2 == 0 && (this.w || z)) {
            this.g.setTranslationY(0.0f);
            float f2 = -this.g.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.g.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.g.setTranslationY(f2);
            C2606qu0 c2606qu3 = new C2606qu0();
            C2509pu0 c2509pu0A3 = It0.a(this.g);
            c2509pu0A3.e(0.0f);
            View view3 = (View) c2509pu0A3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(l80 != null ? new C0658Ol(l80, view3) : null);
            }
            boolean z5 = c2606qu3.e;
            ArrayList arrayList2 = c2606qu3.a;
            if (!z5) {
                arrayList2.add(c2509pu0A3);
            }
            if (this.r && view != null) {
                view.setTranslationY(f2);
                C2509pu0 c2509pu0A4 = It0.a(view);
                c2509pu0A4.e(0.0f);
                if (!c2606qu3.e) {
                    arrayList2.add(c2509pu0A4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = C;
            boolean z6 = c2606qu3.e;
            if (!z6) {
                c2606qu3.c = decelerateInterpolator;
            }
            if (!z6) {
                c2606qu3.b = 250L;
            }
            if (!z6) {
                c2606qu3.d = c2222mw1;
            }
            this.v = c2606qu3;
            c2606qu3.b();
        } else {
            this.g.setAlpha(1.0f);
            this.g.setTranslationY(0.0f);
            if (this.r && view != null) {
                view.setTranslationY(0.0f);
            }
            c2222mw1.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = It0.a;
            AbstractC2991ut0.c(actionBarOverlayLayout);
        }
    }

    public C2416ow0(Dialog dialog) {
        new ArrayList();
        this.p = new ArrayList();
        this.q = 0;
        this.r = true;
        this.u = true;
        this.y = new C2222mw0(this, 0);
        this.z = new C2222mw0(this, 1);
        this.A = new L80(this);
        D(dialog.getWindow().getDecorView());
    }
}
