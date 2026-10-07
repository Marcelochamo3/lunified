package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;

/* JADX INFO: renamed from: o.qw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2610qw0 implements View.OnApplyWindowInsetsListener {
    public final C1508fh a;
    public Kw0 b;

    public ViewOnApplyWindowInsetsListenerC2610qw0(View view, C1508fh c1508fh) {
        Kw0 kw0B;
        this.a = c1508fh;
        Kw0 kw0H = It0.h(view);
        if (kw0H != null) {
            int i = Build.VERSION.SDK_INT;
            kw0B = (i >= 30 ? new C3482zw0(kw0H) : i >= 29 ? new C3385yw0(kw0H) : new C3288xw0(kw0H)).b();
        } else {
            kw0B = null;
        }
        this.b = kw0B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Hw0 hw0;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = Kw0.g(view, windowInsets);
            return C2706rw0.i(view, windowInsets);
        }
        Kw0 kw0G = Kw0.g(view, windowInsets);
        if (this.b == null) {
            this.b = It0.h(view);
        }
        if (this.b == null) {
            this.b = kw0G;
            return C2706rw0.i(view, windowInsets);
        }
        C1508fh c1508fhJ = C2706rw0.j(view);
        if (c1508fhJ != null && Objects.equals((WindowInsets) c1508fhJ.m, windowInsets)) {
            return C2706rw0.i(view, windowInsets);
        }
        Kw0 kw0 = this.b;
        int i = 0;
        int i2 = 1;
        while (true) {
            hw0 = kw0G.a;
            if (i2 > 256) {
                break;
            }
            if (!hw0.f(i2).equals(kw0.a.f(i2))) {
                i |= i2;
            }
            i2 <<= 1;
        }
        if (i == 0) {
            return C2706rw0.i(view, windowInsets);
        }
        Kw0 kw1 = this.b;
        if ((i & 8) != 0) {
            interpolator = hw0.f(8).d > kw1.a.f(8).d ? C2706rw0.e : C2706rw0.f;
        } else {
            interpolator = C2706rw0.g;
        }
        C3094vw0 c3094vw0 = new C3094vw0(i, interpolator, 160L);
        c3094vw0.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3094vw0.a.a());
        TF tfF = hw0.f(i);
        TF tfF2 = kw1.a.f(i);
        int iMin = Math.min(tfF.a, tfF2.a);
        int i3 = tfF.b;
        int i4 = tfF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = tfF.c;
        int i6 = tfF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = tfF.d;
        int i8 = i;
        int i9 = tfF2.d;
        Vm0 vm0 = new Vm0(TF.b(iMin, iMin2, iMin3, Math.min(i7, i9)), 4, TF.b(Math.max(tfF.a, tfF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C2706rw0.f(view, windowInsets, false);
        duration.addUpdateListener(new C2513pw0(c3094vw0, kw0G, kw1, i8, view));
        duration.addListener(new C3171wm0(c3094vw0, view));
        ViewTreeObserverOnPreDrawListenerC2754sW.a(view, new RunnableC3018v70(view, c3094vw0, vm0, duration));
        this.b = kw0G;
        return C2706rw0.i(view, windowInsets);
    }
}
