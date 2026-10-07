package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z3 implements Window.Callback {
    public final Window.Callback l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f650o;
    public final /* synthetic */ LayoutInflaterFactory2C1456f4 p;

    public Z3(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, Window.Callback callback) {
        this.p = layoutInflaterFactory2C1456f4;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.l = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.m = true;
            callback.onContentChanged();
        } finally {
            this.m = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.l.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.l.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC1929jw0.a(this.l, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.l.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.n;
        Window.Callback callback = this.l;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.p.q(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C1358e4 c1358e4;
        boolean z;
        ZP zp;
        boolean zPerformShortcut;
        if (this.l.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.p;
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 == null) {
            c1358e4 = layoutInflaterFactory2C1456f4.Y;
            if (c1358e4 == null && layoutInflaterFactory2C1456f4.D(c1358e4, keyEvent.getKeyCode(), keyEvent)) {
                C1358e4 c1358e5 = layoutInflaterFactory2C1456f4.Y;
                if (c1358e5 != null) {
                    c1358e5.l = true;
                }
            } else {
                if (layoutInflaterFactory2C1456f4.Y == null) {
                    C1358e4 c1358e4X = layoutInflaterFactory2C1456f4.x(0);
                    layoutInflaterFactory2C1456f4.E(c1358e4X, keyEvent);
                    boolean zD = layoutInflaterFactory2C1456f4.D(c1358e4X, keyEvent.getKeyCode(), keyEvent);
                    c1358e4X.k = false;
                    if (zD) {
                    }
                }
            }
        } else {
            C2319nw0 c2319nw0 = c2416ow0.l;
            if (c2319nw0 == null || (zp = c2319nw0.f946o) == null) {
                zPerformShortcut = false;
            } else {
                zp.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                zPerformShortcut = zp.performShortcut(keyCode, keyEvent, 0);
            }
            if (!zPerformShortcut) {
                c1358e4 = layoutInflaterFactory2C1456f4.Y;
                if (c1358e4 == null) {
                    if (layoutInflaterFactory2C1456f4.Y == null) {
                        C1358e4 c1358e4X2 = layoutInflaterFactory2C1456f4.x(0);
                        layoutInflaterFactory2C1456f4.E(c1358e4X2, keyEvent);
                        boolean zD2 = layoutInflaterFactory2C1456f4.D(c1358e4X2, keyEvent.getKeyCode(), keyEvent);
                        c1358e4X2.k = false;
                        z = zD2;
                    }
                } else {
                    if (layoutInflaterFactory2C1456f4.Y == null) {
                        C1358e4 c1358e4X3 = layoutInflaterFactory2C1456f4.x(0);
                        layoutInflaterFactory2C1456f4.E(c1358e4X3, keyEvent);
                        boolean zD3 = layoutInflaterFactory2C1456f4.D(c1358e4X3, keyEvent.getKeyCode(), keyEvent);
                        c1358e4X3.k = false;
                        if (zD3) {
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.l.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.l.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.l.dispatchTrackballEvent(motionEvent);
    }

    public final Hh0 e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        boolean z = false;
        int i = 1;
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.p;
        C1583gR c1583gR = new C1583gR(layoutInflaterFactory2C1456f4.v, callback);
        AbstractC2908u1 abstractC2908u1 = layoutInflaterFactory2C1456f4.F;
        if (abstractC2908u1 != null) {
            abstractC2908u1.a();
        }
        C2720s4 c2720s4 = new C2720s4(layoutInflaterFactory2C1456f4, c1583gR, 4, z);
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 != null) {
            C2319nw0 c2319nw0 = c2416ow0.l;
            if (c2319nw0 != null) {
                c2319nw0.a();
            }
            c2416ow0.f.setHideOnContentScrollEnabled(false);
            c2416ow0.i.e();
            C2319nw0 c2319nw1 = new C2319nw0(c2416ow0, c2416ow0.i.getContext(), c2720s4);
            ZP zp = c2319nw1.f946o;
            zp.w();
            try {
                boolean zN = c2319nw1.p.N(c2319nw1, zp);
                zp.v();
                if (zN) {
                    c2416ow0.l = c2319nw1;
                    c2319nw1.g();
                    c2416ow0.i.c(c2319nw1);
                    c2416ow0.B(true);
                } else {
                    c2319nw1 = null;
                }
                layoutInflaterFactory2C1456f4.F = c2319nw1;
            } catch (Throwable th) {
                zp.v();
                throw th;
            }
        }
        if (layoutInflaterFactory2C1456f4.F == null) {
            C2509pu0 c2509pu0 = layoutInflaterFactory2C1456f4.J;
            if (c2509pu0 != null) {
                c2509pu0.b();
            }
            AbstractC2908u1 abstractC2908u2 = layoutInflaterFactory2C1456f4.F;
            if (abstractC2908u2 != null) {
                abstractC2908u2.a();
            }
            if (layoutInflaterFactory2C1456f4.y != null) {
                boolean z2 = layoutInflaterFactory2C1456f4.c0;
            }
            if (layoutInflaterFactory2C1456f4.G == null) {
                boolean z3 = layoutInflaterFactory2C1456f4.U;
                Context context = layoutInflaterFactory2C1456f4.v;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0447Gh c0447Gh = new C0447Gh(context, 0);
                        c0447Gh.getTheme().setTo(themeNewTheme);
                        context = c0447Gh;
                    }
                    layoutInflaterFactory2C1456f4.G = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C1456f4.H = popupWindow;
                    AbstractC1474fG.R(popupWindow, 2);
                    layoutInflaterFactory2C1456f4.H.setContentView(layoutInflaterFactory2C1456f4.G);
                    layoutInflaterFactory2C1456f4.H.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C1456f4.G.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C1456f4.H.setHeight(-2);
                    layoutInflaterFactory2C1456f4.I = new S3(layoutInflaterFactory2C1456f4, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C1456f4.M.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C1456f4.y();
                        C2416ow0 c2416ow1 = layoutInflaterFactory2C1456f4.z;
                        Context contextC = c2416ow1 != null ? c2416ow1.C() : null;
                        if (contextC != null) {
                            context = contextC;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C1456f4.G = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C1456f4.G != null) {
                C2509pu0 c2509pu1 = layoutInflaterFactory2C1456f4.J;
                if (c2509pu1 != null) {
                    c2509pu1.b();
                }
                layoutInflaterFactory2C1456f4.G.e();
                Context context2 = layoutInflaterFactory2C1456f4.G.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C1456f4.G;
                C1605gg0 c1605gg0 = new C1605gg0();
                c1605gg0.n = context2;
                c1605gg0.f797o = actionBarContextView;
                c1605gg0.p = c2720s4;
                ZP zp2 = new ZP(actionBarContextView.getContext());
                zp2.l = 1;
                c1605gg0.s = zp2;
                zp2.e = c1605gg0;
                if (((InterfaceC2811t1) c2720s4.m).N(c1605gg0, zp2)) {
                    c1605gg0.g();
                    layoutInflaterFactory2C1456f4.G.c(c1605gg0);
                    layoutInflaterFactory2C1456f4.F = c1605gg0;
                    if (layoutInflaterFactory2C1456f4.L && (viewGroup = layoutInflaterFactory2C1456f4.M) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C1456f4.G.setAlpha(0.0f);
                        C2509pu0 c2509pu0A = It0.a(layoutInflaterFactory2C1456f4.G);
                        c2509pu0A.a(1.0f);
                        layoutInflaterFactory2C1456f4.J = c2509pu0A;
                        c2509pu0A.d(new U3(i, layoutInflaterFactory2C1456f4));
                    } else {
                        layoutInflaterFactory2C1456f4.G.setAlpha(1.0f);
                        layoutInflaterFactory2C1456f4.G.setVisibility(0);
                        if (layoutInflaterFactory2C1456f4.G.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C1456f4.G.getParent();
                            WeakHashMap weakHashMap = It0.a;
                            AbstractC2991ut0.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C1456f4.H != null) {
                        layoutInflaterFactory2C1456f4.w.getDecorView().post(layoutInflaterFactory2C1456f4.I);
                    }
                } else {
                    layoutInflaterFactory2C1456f4.F = null;
                }
            }
            layoutInflaterFactory2C1456f4.G();
            layoutInflaterFactory2C1456f4.F = layoutInflaterFactory2C1456f4.F;
        }
        layoutInflaterFactory2C1456f4.G();
        AbstractC2908u1 abstractC2908u3 = layoutInflaterFactory2C1456f4.F;
        if (abstractC2908u3 != null) {
            return c1583gR.r(abstractC2908u3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.l.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.l.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.l.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.m) {
            this.l.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ZP)) {
            return this.l.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.l.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.l.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.l.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.p;
        if (i == 108) {
            layoutInflaterFactory2C1456f4.y();
            C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
            if (c2416ow0 != null && true != c2416ow0.f959o) {
                c2416ow0.f959o = true;
                ArrayList arrayList = c2416ow0.p;
                if (arrayList.size() > 0) {
                    AbstractC1674hK.w(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            layoutInflaterFactory2C1456f4.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f650o) {
            this.l.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.p;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C1456f4.getClass();
                return;
            }
            C1358e4 c1358e4X = layoutInflaterFactory2C1456f4.x(i);
            if (c1358e4X.m) {
                layoutInflaterFactory2C1456f4.o(c1358e4X, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 == null || !c2416ow0.f959o) {
            return;
        }
        c2416ow0.f959o = false;
        ArrayList arrayList = c2416ow0.p;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC1674hK.w(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC2027kw0.a(this.l, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ZP zp = menu instanceof ZP ? (ZP) menu : null;
        if (i == 0 && zp == null) {
            return false;
        }
        if (zp != null) {
            zp.x = true;
        }
        boolean zOnPreparePanel = this.l.onPreparePanel(i, view, menu);
        if (zp != null) {
            zp.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ZP zp = this.p.x(0).h;
        if (zp != null) {
            d(list, zp, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1831iw0.a(this.l, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.l.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.l.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return (this.p.K && i == 0) ? e(callback) : AbstractC1831iw0.b(this.l, callback, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.l.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.p.K) {
            return e(callback);
        }
        return this.l.onWindowStartingActionMode(callback);
    }
}
