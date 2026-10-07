package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC2924u9 extends AbstractDialogC1652h4 {
    public final C2730s9 A;
    public BottomSheetBehavior q;
    public FrameLayout r;
    public CoordinatorLayout s;
    public FrameLayout t;
    public boolean u;
    public boolean v;
    public boolean w;
    public C2827t9 x;
    public final boolean y;
    public RN z;

    public DialogC2924u9(Context context) {
        TypedValue typedValue = new TypedValue();
        super(context, context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
        this.u = true;
        this.v = true;
        this.A = new C2730s9(this);
        e().e(1);
        this.y = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        this.y = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.q == null) {
            i();
        }
        super.cancel();
    }

    public final void i() {
        if (this.r == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.r = frameLayout;
            this.s = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.r.findViewById(R.id.design_bottom_sheet);
            this.t = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout2);
            this.q = bottomSheetBehaviorA;
            C2730s9 c2730s9 = this.A;
            ArrayList arrayList = bottomSheetBehaviorA.W;
            if (!arrayList.contains(c2730s9)) {
                arrayList.add(c2730s9);
            }
            this.q.F(this.u);
            this.z = new RN(this.q, this.t);
        }
    }

    public final FrameLayout j(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 0;
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.r.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.y) {
            FrameLayout frameLayout = this.t;
            C2133m1 c2133m1 = new C2133m1(7, this);
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.u(frameLayout, c2133m1);
        }
        this.t.removeAllViews();
        if (layoutParams == null) {
            this.t.addView(view);
        } else {
            this.t.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new Z0(2, this));
        It0.p(this.t, new C2633r9(i2, this));
        this.t.setOnTouchListener(new ViewOnTouchListenerC2631r8(1));
        return this.r;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.y && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.s;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            AbstractC1459f50.L(window, !z);
            C2827t9 c2827t9 = this.x;
            if (c2827t9 != null) {
                c2827t9.e(window);
            }
        }
        RN rn = this.z;
        if (rn == null) {
            return;
        }
        boolean z2 = this.u;
        View view = (View) rn.f488o;
        ON on = (ON) rn.m;
        if (z2) {
            if (on != null) {
                on.b((NN) rn.n, view, false);
            }
        } else if (on != null) {
            on.c(view);
        }
    }

    @Override // o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ON on;
        C2827t9 c2827t9 = this.x;
        if (c2827t9 != null) {
            c2827t9.e(null);
        }
        RN rn = this.z;
        if (rn == null || (on = (ON) rn.m) == null) {
            return;
        }
        on.c((View) rn.f488o);
    }

    @Override // o.DialogC1213cg, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.q;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        RN rn;
        super.setCancelable(z);
        if (this.u != z) {
            this.u = z;
            BottomSheetBehavior bottomSheetBehavior = this.q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z);
            }
            if (getWindow() == null || (rn = this.z) == null) {
                return;
            }
            boolean z2 = this.u;
            View view = (View) rn.f488o;
            ON on = (ON) rn.m;
            if (z2) {
                if (on != null) {
                    on.b((NN) rn.n, view, false);
                }
            } else if (on != null) {
                on.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.u) {
            this.u = true;
        }
        this.v = z;
        this.w = true;
    }

    @Override // o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(j(null, i, null));
    }

    @Override // o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // o.AbstractDialogC1652h4, o.DialogC1213cg, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
