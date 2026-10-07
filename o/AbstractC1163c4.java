package o;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

/* JADX INFO: renamed from: o.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1163c4 {
    public Object a;
    public Object b;

    public AbstractC1163c4(Context context) {
        this.a = context;
    }

    public void c() {
        C1066b4 c1066b4 = (C1066b4) this.a;
        if (c1066b4 != null) {
            try {
                ((LayoutInflaterFactory2C1456f4) this.b).v.unregisterReceiver(c1066b4);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof Lh0)) {
            return menuItem;
        }
        Lh0 lh0 = (Lh0) menuItem;
        if (((Nd0) this.b) == null) {
            this.b = new Nd0();
        }
        MenuItem menuItem2 = (MenuItem) ((Nd0) this.b).get(lh0);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1778iQ menuItemC1778iQ = new MenuItemC1778iQ((Context) this.a, lh0);
        ((Nd0) this.b).put(lh0, menuItemC1778iQ);
        return menuItemC1778iQ;
    }

    public int g(int i, int i2) {
        int i3 = i(i);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i(i6);
            i4 += i7;
            if (i4 == i2) {
                i5++;
                i4 = 0;
            } else if (i4 > i2) {
                i5++;
                i4 = i7;
            }
        }
        return i4 + i3 > i2 ? i5 + 1 : i5;
    }

    public int h(int i, int i2) {
        int i3 = i(i);
        if (i3 == i2) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i(i5);
            i4 += i6;
            if (i4 == i2) {
                i4 = 0;
            } else if (i4 > i2) {
                i4 = i6;
            }
        }
        if (i3 + i4 <= i2) {
            return i4;
        }
        return 0;
    }

    public abstract int i(int i);

    public void j() {
        ((SparseIntArray) this.a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((C1066b4) this.a) == null) {
            this.a = new C1066b4(0, this);
        }
        ((LayoutInflaterFactory2C1456f4) this.b).v.registerReceiver((C1066b4) this.a, intentFilterD);
    }

    public AbstractC1163c4() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public AbstractC1163c4(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4) {
        this.b = layoutInflaterFactory2C1456f4;
    }
}
