package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869Wo extends AbstractC2500pq {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC3251xe i;
    public final ViewOnFocusChangeListenerC3348ye j;
    public final C2278nc k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f605o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public C0869Wo(C2403oq c2403oq) {
        super(c2403oq);
        int i = 1;
        this.i = new ViewOnClickListenerC3251xe(i, this);
        this.j = new ViewOnFocusChangeListenerC3348ye(i, this);
        this.k = new C2278nc(6, this);
        this.f605o = Long.MAX_VALUE;
        this.f = AbstractC3045vW.D(c2403oq.getContext(), R.attr.motionDurationShort3, 67);
        this.e = AbstractC3045vW.D(c2403oq.getContext(), R.attr.motionDurationShort3, 50);
        this.g = AbstractC3045vW.E(c2403oq.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1161c3.a);
    }

    @Override // o.AbstractC2500pq
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && Ou0.q(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Jj0(16, this));
    }

    @Override // o.AbstractC2500pq
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // o.AbstractC2500pq
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // o.AbstractC2500pq
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // o.AbstractC2500pq
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // o.AbstractC2500pq
    public final C2278nc h() {
        return this.k;
    }

    @Override // o.AbstractC2500pq
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // o.AbstractC2500pq
    public final boolean j() {
        return this.l;
    }

    @Override // o.AbstractC2500pq
    public final boolean l() {
        return this.n;
    }

    @Override // o.AbstractC2500pq
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o.Uo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0869Wo c0869Wo = this.l;
                c0869Wo.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0869Wo.f605o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0869Wo.m = false;
                    }
                    c0869Wo.u();
                    c0869Wo.m = true;
                    c0869Wo.f605o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.Vo
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0869Wo c0869Wo = this.a;
                c0869Wo.m = true;
                c0869Wo.f605o = System.currentTimeMillis();
                c0869Wo.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!Ou0.q(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = It0.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // o.AbstractC2500pq
    public final void n(N0 n0) {
        if (!Ou0.q(this.h)) {
            n0.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? n0.a.isShowingHintText() : n0.e(4)) {
            n0.l(null);
        }
    }

    @Override // o.AbstractC2500pq
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || Ou0.q(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.f605o = System.currentTimeMillis();
        }
    }

    @Override // o.AbstractC2500pq
    public final void r() {
        int i = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new C0658Ol(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new C0658Ol(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0962a1(3, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // o.AbstractC2500pq
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f605o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
