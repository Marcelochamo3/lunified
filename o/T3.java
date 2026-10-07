package o;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.skidush.clonex.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class T3 implements VV, InterfaceC1313dh, InterfaceC2555qQ {
    public final /* synthetic */ int l;
    public final /* synthetic */ LayoutInflaterFactory2C1456f4 m;

    public /* synthetic */ T3(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, int i) {
        this.l = i;
        this.m = layoutInflaterFactory2C1456f4;
    }

    @Override // o.InterfaceC2555qQ
    public void a(ZP zp, boolean z) {
        C1358e4 c1358e4;
        switch (this.l) {
            case 2:
                this.m.n(zp);
                break;
            default:
                ZP zpK = zp.k();
                int i = 0;
                boolean z2 = zpK != zp;
                if (z2) {
                    zp = zpK;
                }
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.m;
                C1358e4[] c1358e4Arr = layoutInflaterFactory2C1456f4.X;
                int length = c1358e4Arr != null ? c1358e4Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c1358e4 = null;
                    } else {
                        c1358e4 = c1358e4Arr[i];
                        if (c1358e4 == null || c1358e4.h != zp) {
                            i++;
                        }
                    }
                }
                if (c1358e4 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C1456f4.o(c1358e4, z);
                    } else {
                        layoutInflaterFactory2C1456f4.m(c1358e4.a, c1358e4, zpK);
                        layoutInflaterFactory2C1456f4.o(c1358e4, true);
                    }
                }
                break;
        }
    }

    @Override // o.VV
    public Kw0 r(View view, Kw0 kw0) {
        boolean z;
        Aw0 c3385yw0;
        boolean z2;
        boolean z3;
        Kw0 kw0B = kw0;
        int iD = kw0.d();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.m;
        layoutInflaterFactory2C1456f4.getClass();
        int iD2 = kw0.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1456f4.G;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1456f4.G.getLayoutParams();
            if (layoutInflaterFactory2C1456f4.G.isShown()) {
                if (layoutInflaterFactory2C1456f4.o0 == null) {
                    layoutInflaterFactory2C1456f4.o0 = new Rect();
                    layoutInflaterFactory2C1456f4.p0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1456f4.o0;
                Rect rect2 = layoutInflaterFactory2C1456f4.p0;
                rect.set(kw0.b(), kw0.d(), kw0.c(), kw0.a());
                ViewGroup viewGroup = layoutInflaterFactory2C1456f4.M;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = AbstractC3478zu0.a;
                    AbstractC3187wu0.a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC3478zu0.a) {
                        AbstractC3478zu0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC3478zu0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC3478zu0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = AbstractC3478zu0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                Kw0 kw0H = It0.h(layoutInflaterFactory2C1456f4.M);
                int iB = kw0H == null ? 0 : kw0H.b();
                int iC = kw0H == null ? 0 : kw0H.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C1456f4.v;
                if (i <= 0 || layoutInflaterFactory2C1456f4.O != null) {
                    View view2 = layoutInflaterFactory2C1456f4.O;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            layoutInflaterFactory2C1456f4.O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C1456f4.O = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    layoutInflaterFactory2C1456f4.M.addView(layoutInflaterFactory2C1456f4.O, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C1456f4.O;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C1456f4.O;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & C1672hI.a.e) != 0 ? AbstractC1459f50.u(context, R.color.abc_decor_view_status_guard_light) : AbstractC1459f50.u(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1456f4.T && z5) {
                    iD2 = 0;
                }
                z = z5;
                z2 = z3;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                layoutInflaterFactory2C1456f4.G.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C1456f4.O;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = kw0.b();
            int iC2 = kw0.c();
            int iA = kw0.a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                c3385yw0 = new C3482zw0(kw0B);
            } else {
                c3385yw0 = i6 >= 29 ? new C3385yw0(kw0B) : new C3288xw0(kw0B);
            }
            c3385yw0.g(TF.b(iB2, iD2, iC2, iA));
            kw0B = c3385yw0.b();
        }
        WeakHashMap weakHashMap = It0.a;
        WindowInsets windowInsetsF = kw0B.f();
        if (windowInsetsF == null) {
            return kw0B;
        }
        WindowInsets windowInsetsB = AbstractC2991ut0.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? Kw0.g(view, windowInsetsB) : kw0B;
    }

    @Override // o.InterfaceC2555qQ
    public boolean u(ZP zp) {
        Window.Callback callback;
        switch (this.l) {
            case 2:
                Window.Callback callback2 = this.m.w.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(C3080vp0.v0, zp);
                }
                break;
            default:
                if (zp == zp.k()) {
                    LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.m;
                    if (layoutInflaterFactory2C1456f4.R && (callback = layoutInflaterFactory2C1456f4.w.getCallback()) != null && !layoutInflaterFactory2C1456f4.c0) {
                        callback.onMenuOpened(C3080vp0.v0, zp);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
