package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.AbstractC0706Qh;
import o.AbstractC1161c3;
import o.AbstractC1474fG;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;
import o.AbstractC3021v9;
import o.AbstractC3185wt0;
import o.C0537Jt;
import o.C0784Th;
import o.C0846Vr;
import o.C0962a1;
import o.C1795id0;
import o.C1891jd0;
import o.C2068lO;
import o.C2165mO;
import o.C2246n9;
import o.C2262nO;
import o.C2421p;
import o.C2537q9;
import o.E7;
import o.F0;
import o.H40;
import o.It0;
import o.LJ;
import o.Ld0;
import o.NN;
import o.Nt0;
import o.R6;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0706Qh implements NN {
    public AbstractC1474fG a;
    public final C2068lO b;
    public final ColorStateList c;
    public final C1891jd0 d;
    public final C2537q9 e;
    public final float f;
    public final boolean g;
    public int h;
    public Nt0 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public C2262nO t;
    public int u;
    public final LinkedHashSet v;
    public final C2246n9 w;

    public SideSheetBehavior() {
        this.e = new C2537q9(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new C2246n9(this, 1);
    }

    @Override // o.NN
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C2262nO c2262nO = this.t;
        if (c2262nO == null) {
            return;
        }
        E7 e7 = c2262nO.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c2262nO.f = null;
        int i2 = 5;
        if (e7 == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        AbstractC1474fG abstractC1474fG = this.a;
        if (abstractC1474fG != null && abstractC1474fG.z() != 0) {
            i2 = 3;
        }
        C0962a1 c0962a1 = new C0962a1(6, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iP = this.a.p(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.Kd0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.W(marginLayoutParams, AbstractC1161c3.c(iP, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        boolean z = e7.d == 0;
        WeakHashMap weakHashMap = It0.a;
        View view2 = c2262nO.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C0537Jt(1));
        objectAnimatorOfFloat.setDuration(AbstractC1161c3.c(c2262nO.c, e7.c, c2262nO.d));
        objectAnimatorOfFloat.addListener(new C2165mO(c2262nO, z, i2));
        objectAnimatorOfFloat.addListener(c0962a1);
        objectAnimatorOfFloat.start();
    }

    @Override // o.NN
    public final void b(E7 e7) {
        C2262nO c2262nO = this.t;
        if (c2262nO == null) {
            return;
        }
        c2262nO.f = e7;
    }

    @Override // o.NN
    public final void c(E7 e7) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C2262nO c2262nO = this.t;
        if (c2262nO == null) {
            return;
        }
        AbstractC1474fG abstractC1474fG = this.a;
        int i = 5;
        if (abstractC1474fG != null && abstractC1474fG.z() != 0) {
            i = 3;
        }
        E7 e8 = c2262nO.f;
        c2262nO.f = e7;
        if (e8 != null) {
            c2262nO.a(e7.c, e7.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.W(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.f44o));
        view2.requestLayout();
    }

    @Override // o.NN
    public final void d() {
        C2262nO c2262nO = this.t;
        if (c2262nO == null) {
            return;
        }
        E7 e7 = c2262nO.f;
        c2262nO.f = null;
        if (e7 == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = c2262nO.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(c2262nO.e);
        animatorSet.start();
    }

    @Override // o.AbstractC0706Qh
    public final void g(C0784Th c0784Th) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // o.AbstractC0706Qh
    public final void i() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Nt0 nt0;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && It0.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (nt0 = this.i) == null || !nt0.o(motionEvent)) ? false : true;
    }

    @Override // o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int iW = 0;
        int i3 = 1;
        C2068lO c2068lO = this.b;
        WeakHashMap weakHashMap = It0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.p == null) {
            this.p = new WeakReference(view);
            this.t = new C2262nO(view);
            if (c2068lO != null) {
                view.setBackground(c2068lO);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = AbstractC3185wt0.i(view);
                }
                c2068lO.k(fI);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    AbstractC3185wt0.q(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (It0.d(view) == null) {
                It0.q(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0784Th) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        AbstractC1474fG abstractC1474fG = this.a;
        if (abstractC1474fG == null || abstractC1474fG.z() != i5) {
            C1891jd0 c1891jd0 = this.d;
            C0784Th c0784Th = null;
            if (i5 == 0) {
                this.a = new LJ(this, i3);
                if (c1891jd0 != null) {
                    WeakReference weakReference = this.p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0784Th)) {
                        c0784Th = (C0784Th) view3.getLayoutParams();
                    }
                    if (c0784Th == null || ((ViewGroup.MarginLayoutParams) c0784Th).rightMargin <= 0) {
                        C1795id0 c1795id0E = c1891jd0.e();
                        c1795id0E.f = new C2421p(0.0f);
                        c1795id0E.g = new C2421p(0.0f);
                        C1891jd0 c1891jd0A = c1795id0E.a();
                        if (c2068lO != null) {
                            c2068lO.setShapeAppearanceModel(c1891jd0A);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(AbstractC1674hK.p("Invalid sheet edge position value: ", i5, ". Must be 0 or 1."));
                }
                this.a = new LJ(this, iW);
                if (c1891jd0 != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0784Th)) {
                        c0784Th = (C0784Th) view2.getLayoutParams();
                    }
                    if (c0784Th == null || ((ViewGroup.MarginLayoutParams) c0784Th).leftMargin <= 0) {
                        C1795id0 c1795id0E2 = c1891jd0.e();
                        c1795id0E2.e = new C2421p(0.0f);
                        c1795id0E2.h = new C2421p(0.0f);
                        C1891jd0 c1891jd0A2 = c1795id0E2.a();
                        if (c2068lO != null) {
                            c2068lO.setShapeAppearanceModel(c1891jd0A2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new Nt0(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iW2 = this.a.w(view);
        coordinatorLayout.p(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.x(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f44o = marginLayoutParams != null ? this.a.d(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iW = iW2 - this.a.w(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iW = this.a.s();
        }
        It0.j(view, iW);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            AbstractC1674hK.w(it.next());
        }
        return true;
    }

    @Override // o.AbstractC0706Qh
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // o.AbstractC0706Qh
    public final void q(View view, Parcelable parcelable) {
        int i = ((Ld0) parcelable).n;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // o.AbstractC0706Qh
    public final Parcelable r(View view) {
        return new Ld0(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // o.AbstractC0706Qh
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.j && x()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            Nt0 nt0 = this.i;
            if (fAbs > nt0.b) {
                nt0.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC1701hf0.h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.p.get();
        R6 r6 = new R6(i, 4, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = It0.a;
            if (view.isAttachedToWindow()) {
                view.post(r6);
                return;
            }
        }
        r6.run();
    }

    public final void w(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            throw null;
        }
        z();
    }

    public final boolean x() {
        return this.i != null && (this.g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        w(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            o.fG r0 = r2.a
            int r0 = r0.s()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = o.AbstractC1674hK.n(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            o.fG r0 = r2.a
            int r0 = r0.r()
        L1f:
            o.Nt0 r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.n(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.w(r3)
            o.q9 r3 = r2.e
            r3.a(r4)
            goto L5a
        L57:
            r2.w(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.y(android.view.View, int, boolean):void");
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        It0.m(view, 262144);
        It0.i(view, 0);
        It0.m(view, 1048576);
        It0.i(view, 0);
        if (this.h != 5) {
            It0.n(view, F0.j, new C0846Vr(5, this));
        }
        if (this.h != 3) {
            It0.n(view, F0.h, new C0846Vr(3, this));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new C2537q9(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new C2246n9(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.A);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = C1891jd0.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = It0.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C1891jd0 c1891jd0 = this.d;
        if (c1891jd0 != null) {
            C2068lO c2068lO = new C2068lO(c1891jd0);
            this.b = c2068lO;
            c2068lO.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
