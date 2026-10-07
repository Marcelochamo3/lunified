package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Jh0 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ Kh0 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f349o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ActionProviderVisibilityListenerC1484fQ z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public Jh0(Kh0 kh0, Menu menu) {
        this.E = kh0;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        Kh0 kh0 = this.E;
        if (str != null) {
            if (kh0.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (kh0.d == null) {
                kh0.d = Kh0.a(kh0.c);
            }
            Object obj = kh0.d;
            String str2 = this.y;
            Ih0 ih0 = new Ih0();
            ih0.m = obj;
            Class<?> cls = obj.getClass();
            try {
                ih0.n = cls.getMethod(str2, Ih0.f328o);
                menuItem.setOnMenuItemClickListener(ih0);
            } catch (Exception e) {
                StringBuilder sbL = AbstractC1701hf0.l("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbL.append(cls.getName());
                InflateException inflateException = new InflateException(sbL.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof C1386eQ) {
                ((C1386eQ) menuItem).g(true);
            } else if (menuItem instanceof MenuItemC1778iQ) {
                MenuItemC1778iQ menuItemC1778iQ = (MenuItemC1778iQ) menuItem;
                try {
                    Method method = menuItemC1778iQ.d;
                    Lh0 lh0 = menuItemC1778iQ.c;
                    if (method == null) {
                        menuItemC1778iQ.d = lh0.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1778iQ.d.invoke(lh0, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, Kh0.e, kh0.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        ActionProviderVisibilityListenerC1484fQ actionProviderVisibilityListenerC1484fQ = this.z;
        if (actionProviderVisibilityListenerC1484fQ != null && (menuItem instanceof Lh0)) {
            ((Lh0) menuItem).b(actionProviderVisibilityListenerC1484fQ);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof Lh0;
        if (z2) {
            ((Lh0) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1191cQ.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((Lh0) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1191cQ.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.f349o;
        if (z2) {
            ((Lh0) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1191cQ.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((Lh0) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1191cQ.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((Lh0) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1191cQ.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((Lh0) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1191cQ.i(menuItem, colorStateList);
            }
        }
    }
}
