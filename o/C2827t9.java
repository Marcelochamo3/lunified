package o;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2827t9 extends AbstractC2343o9 {
    public final Boolean a;
    public final Kw0 b;
    public Window c;
    public boolean d;

    public C2827t9(FrameLayout frameLayout, Kw0 kw0) {
        ColorStateList colorStateListG;
        this.b = kw0;
        C2068lO c2068lO = BottomSheetBehavior.A(frameLayout).i;
        if (c2068lO != null) {
            colorStateListG = c2068lO.l.c;
        } else {
            WeakHashMap weakHashMap = It0.a;
            colorStateListG = AbstractC3185wt0.g(frameLayout);
        }
        if (colorStateListG != null) {
            this.a = Boolean.valueOf(UK.C(colorStateListG.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListR = Jp0.r(frameLayout.getBackground());
        Integer numValueOf = colorStateListR != null ? Integer.valueOf(colorStateListR.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(UK.C(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // o.AbstractC2343o9
    public final void a(View view) {
        d(view);
    }

    @Override // o.AbstractC2343o9
    public final void b(View view) {
        d(view);
    }

    @Override // o.AbstractC2343o9
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        Kw0 kw0 = this.b;
        if (top < kw0.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                new Pw0(window, window.getDecorView()).a.z(bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), kw0.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                new Pw0(window2, window2.getDecorView()).a.z(this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new Pw0(window, window.getDecorView()).a.q();
        }
    }
}
