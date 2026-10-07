package o;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: o.bu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145bu0 extends AbstractC0706Qh {
    public C0702Qd a;
    public int b = 0;

    public AbstractC1145bu0() {
    }

    @Override // o.AbstractC0706Qh
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.a == null) {
            C0702Qd c0702Qd = new C0702Qd();
            c0702Qd.d = view;
            this.a = c0702Qd;
        }
        C0702Qd c0702Qd2 = this.a;
        View view2 = (View) c0702Qd2.d;
        c0702Qd2.a = view2.getTop();
        c0702Qd2.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        C0702Qd c0702Qd3 = this.a;
        if (c0702Qd3.c != i2) {
            c0702Qd3.c = i2;
            c0702Qd3.b();
        }
        this.b = 0;
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(view, i);
    }

    public AbstractC1145bu0(int i) {
    }
}
