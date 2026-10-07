package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Kw0 {
    public static final Kw0 b;
    public final Hw0 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = Gw0.q;
        } else {
            b = Hw0.b;
        }
    }

    public Kw0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new Gw0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new Fw0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new Dw0(this, windowInsets);
        } else {
            this.a = new Cw0(this, windowInsets);
        }
    }

    public static TF e(TF tf, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, tf.a - i);
        int iMax2 = Math.max(0, tf.b - i2);
        int iMax3 = Math.max(0, tf.c - i3);
        int iMax4 = Math.max(0, tf.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? tf : TF.b(iMax, iMax2, iMax3, iMax4);
    }

    public static Kw0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        Kw0 kw0 = new Kw0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Kw0 kw0H = It0.h(view);
            Hw0 hw0 = kw0.a;
            hw0.p(kw0H);
            hw0.d(view.getRootView());
        }
        return kw0;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kw0)) {
            return false;
        }
        return Objects.equals(this.a, ((Kw0) obj).a);
    }

    public final WindowInsets f() {
        Hw0 hw0 = this.a;
        if (hw0 instanceof Bw0) {
            return ((Bw0) hw0).c;
        }
        return null;
    }

    public final int hashCode() {
        Hw0 hw0 = this.a;
        if (hw0 == null) {
            return 0;
        }
        return hw0.hashCode();
    }

    public Kw0() {
        this.a = new Hw0(this);
    }
}
