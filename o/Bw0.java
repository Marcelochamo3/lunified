package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class Bw0 extends Hw0 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public TF[] d;
    public TF e;
    public Kw0 f;
    public TF g;

    public Bw0(Kw0 kw0, WindowInsets windowInsets) {
        super(kw0);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private TF r(int i2, boolean z) {
        TF tfA = TF.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                tfA = TF.a(tfA, s(i3, z));
            }
        }
        return tfA;
    }

    private TF t() {
        Kw0 kw0 = this.f;
        return kw0 != null ? kw0.a.h() : TF.e;
    }

    private TF u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return TF.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        h = true;
    }

    @Override // o.Hw0
    public void d(View view) {
        TF tfU = u(view);
        if (tfU == null) {
            tfU = TF.e;
        }
        w(tfU);
    }

    @Override // o.Hw0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((Bw0) obj).g);
        }
        return false;
    }

    @Override // o.Hw0
    public TF f(int i2) {
        return r(i2, false);
    }

    @Override // o.Hw0
    public final TF j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = TF.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // o.Hw0
    public Kw0 l(int i2, int i3, int i4, int i5) {
        Aw0 c3385yw0;
        Kw0 kw0G = Kw0.g(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            c3385yw0 = new C3482zw0(kw0G);
        } else {
            c3385yw0 = i6 >= 29 ? new C3385yw0(kw0G) : new C3288xw0(kw0G);
        }
        c3385yw0.g(Kw0.e(j(), i2, i3, i4, i5));
        c3385yw0.e(Kw0.e(h(), i2, i3, i4, i5));
        return c3385yw0.b();
    }

    @Override // o.Hw0
    public boolean n() {
        return this.c.isRound();
    }

    @Override // o.Hw0
    public void o(TF[] tfArr) {
        this.d = tfArr;
    }

    @Override // o.Hw0
    public void p(Kw0 kw0) {
        this.f = kw0;
    }

    public TF s(int i2, boolean z) {
        TF tfH;
        int i3;
        if (i2 == 1) {
            return z ? TF.b(0, Math.max(t().b, j().b), 0, 0) : TF.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                TF tfT = t();
                TF tfH2 = h();
                return TF.b(Math.max(tfT.a, tfH2.a), 0, Math.max(tfT.c, tfH2.c), Math.max(tfT.d, tfH2.d));
            }
            TF tfJ = j();
            Kw0 kw0 = this.f;
            tfH = kw0 != null ? kw0.a.h() : null;
            int iMin = tfJ.d;
            if (tfH != null) {
                iMin = Math.min(iMin, tfH.d);
            }
            return TF.b(tfJ.a, 0, tfJ.c, iMin);
        }
        TF tf = TF.e;
        if (i2 == 8) {
            TF[] tfArr = this.d;
            tfH = tfArr != null ? tfArr[Jp0.x(8)] : null;
            if (tfH != null) {
                return tfH;
            }
            TF tfJ2 = j();
            TF tfT2 = t();
            int i4 = tfJ2.d;
            if (i4 > tfT2.d) {
                return TF.b(0, 0, 0, i4);
            }
            TF tf2 = this.g;
            return (tf2 == null || tf2.equals(tf) || (i3 = this.g.d) <= tfT2.d) ? tf : TF.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return tf;
        }
        Kw0 kw1 = this.f;
        C2106ln c2106lnE = kw1 != null ? kw1.a.e() : e();
        if (c2106lnE == null) {
            return tf;
        }
        int i5 = Build.VERSION.SDK_INT;
        return TF.b(i5 >= 28 ? AbstractC2008kn.d(c2106lnE.a) : 0, i5 >= 28 ? AbstractC2008kn.f(c2106lnE.a) : 0, i5 >= 28 ? AbstractC2008kn.e(c2106lnE.a) : 0, i5 >= 28 ? AbstractC2008kn.c(c2106lnE.a) : 0);
    }

    public void w(TF tf) {
        this.g = tf;
    }
}
