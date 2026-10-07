package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.lQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2070lQ {
    public final Context a;
    public final ZP b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public InterfaceC2555qQ i;
    public AbstractC1874jQ j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final C1972kQ l = new C1972kQ(this);

    public C2070lQ(int i, int i2, Context context, View view, ZP zp, boolean z) {
        this.a = context;
        this.b = zp;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final AbstractC1874jQ a() {
        AbstractC1874jQ viewOnKeyListenerC1995kg0;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1995kg0 = new ViewOnKeyListenerC0752Sb(this.a, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                int i = this.e;
                boolean z = this.c;
                viewOnKeyListenerC1995kg0 = new ViewOnKeyListenerC1995kg0(this.d, i, this.a, view, this.b, z);
            }
            viewOnKeyListenerC1995kg0.o(this.b);
            viewOnKeyListenerC1995kg0.u(this.l);
            viewOnKeyListenerC1995kg0.q(this.f);
            viewOnKeyListenerC1995kg0.g(this.i);
            viewOnKeyListenerC1995kg0.r(this.h);
            viewOnKeyListenerC1995kg0.s(this.g);
            this.j = viewOnKeyListenerC1995kg0;
        }
        return this.j;
    }

    public final boolean b() {
        AbstractC1874jQ abstractC1874jQ = this.j;
        return abstractC1874jQ != null && abstractC1874jQ.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        AbstractC1874jQ abstractC1874jQA = a();
        abstractC1874jQA.v(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            abstractC1874jQA.t(i);
            abstractC1874jQA.w(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1874jQA.l = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1874jQA.e();
    }
}
