package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o.AbstractC0706Qh;
import o.AbstractC1161c3;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;
import o.AbstractC2343o9;
import o.AbstractC3021v9;
import o.AbstractC3185wt0;
import o.AbstractC3409z9;
import o.C0537Jt;
import o.C0784Th;
import o.C0962a1;
import o.C1508fh;
import o.C1891jd0;
import o.C1970kO;
import o.C2052l9;
import o.C2068lO;
import o.C2149m9;
import o.C2246n9;
import o.C2295nk0;
import o.C2440p9;
import o.C2537q9;
import o.C2706rw0;
import o.C2803sw0;
import o.C2906u0;
import o.C3003v0;
import o.E7;
import o.F0;
import o.H40;
import o.It0;
import o.NN;
import o.Nt0;
import o.RunnableC3393z1;
import o.SN;
import o.ViewOnApplyWindowInsetsListenerC2610qw0;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0706Qh implements NN {
    public final C2537q9 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public Nt0 M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public SN Y;
    public int Z;
    public final int a;
    public int a0;
    public boolean b;
    public boolean b0;
    public final float c;
    public HashMap c0;
    public final int d;
    public final SparseIntArray d0;
    public int e;
    public final C2246n9 e0;
    public boolean f;
    public int g;
    public final int h;
    public final C2068lO i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f40o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final C1891jd0 y;
    public boolean z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new C2537q9(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new C2246n9(this, 0);
    }

    public static BottomSheetBehavior A(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof C0784Th)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC0706Qh abstractC0706Qh = ((C0784Th) layoutParams).a;
        if (abstractC0706Qh instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0706Qh;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = It0.a;
        if (AbstractC3185wt0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewZ = z(viewGroup.getChildAt(i));
                if (viewZ != null) {
                    return viewZ;
                }
            }
        }
        return null;
    }

    public final int C() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(AbstractC1674hK.n(i, "Invalid state to get top offset: "));
    }

    public final boolean E() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void F(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        O();
    }

    public final void H(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC1701hf0.h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.I || i != 5) {
            int i2 = (i == 6 && this.b && D(i) <= this.D) ? 3 : i;
            WeakReference weakReference = this.U;
            if (weakReference == null || weakReference.get() == null) {
                I(i);
                return;
            }
            View view = (View) this.U.get();
            RunnableC3393z1 runnableC3393z1 = new RunnableC3393z1(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = It0.a;
                if (view.isAttachedToWindow()) {
                    view.post(runnableC3393z1);
                    return;
                }
            }
            runnableC3393z1.run();
        }
    }

    public final void I(int i) {
        View view;
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            N(true);
        } else if (i == 6 || i == 5 || i == 4) {
            N(false);
        }
        M(i, true);
        while (true) {
            ArrayList arrayList = this.W;
            if (i2 >= arrayList.size()) {
                L();
                return;
            } else {
                ((AbstractC2343o9) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean J(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) x()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        I(2);
        M(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.D(r4)
            o.Nt0 r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.n(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.I(r3)
            r3 = 1
            r2.M(r4, r3)
            o.q9 r3 = r2.A
            r3.a(r4)
            goto L43
        L40:
            r2.I(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(android.view.View, int, boolean):void");
    }

    public final void L() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        It0.m(view, 524288);
        It0.i(view, 0);
        It0.m(view, 262144);
        It0.i(view, 0);
        It0.m(view, 1048576);
        It0.i(view, 0);
        SparseIntArray sparseIntArray = this.d0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            It0.m(view, i);
            It0.i(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C2295nk0 c2295nk0 = new C2295nk0(i2, 2, this);
            ArrayList arrayListE = It0.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListE.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = It0.e[i5];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListE.size(); i7++) {
                            z &= ((F0) arrayListE.get(i7)).a() != i6;
                        }
                        if (z) {
                            i4 = i6;
                        }
                    }
                    iA = i4;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((F0) arrayListE.get(i3)).a).getLabel())) {
                    iA = ((F0) arrayListE.get(i3)).a();
                    break;
                }
                i3++;
            }
            if (iA != -1) {
                F0 f0 = new F0(null, iA, string, c2295nk0, null);
                View.AccessibilityDelegate accessibilityDelegateC = It0.c(view);
                C3003v0 c3003v0 = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof C2906u0 ? ((C2906u0) accessibilityDelegateC).a : new C3003v0(accessibilityDelegateC);
                if (c3003v0 == null) {
                    c3003v0 = new C3003v0();
                }
                It0.p(view, c3003v0);
                It0.m(view, f0.a());
                It0.e(view).add(f0);
                It0.i(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i8 = 5;
            if (this.L != 5) {
                It0.n(view, F0.j, new C2295nk0(i8, 2, this));
            }
        }
        int i9 = this.L;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            It0.n(view, F0.i, new C2295nk0(this.b ? 4 : 6, 2, this));
            return;
        }
        if (i9 == 4) {
            It0.n(view, F0.h, new C2295nk0(this.b ? 3 : 6, 2, this));
        } else {
            if (i9 != 6) {
                return;
            }
            It0.n(view, F0.i, new C2295nk0(i10, 2, this));
            It0.n(view, F0.h, new C2295nk0(i11, 2, this));
        }
    }

    public final void M(int i, boolean z) {
        C2068lO c2068lO = this.i;
        ValueAnimator valueAnimator = this.B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || E());
        if (this.z == z2 || c2068lO == null) {
            return;
        }
        this.z = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c2068lO.l.j, z2 ? w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fW = this.z ? w() : 1.0f;
        C1970kO c1970kO = c2068lO.l;
        if (c1970kO.j != fW) {
            c1970kO.j = fW;
            c2068lO.p = true;
            c2068lO.invalidateSelf();
        }
    }

    public final void N(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.c0 != null) {
                    return;
                } else {
                    this.c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.U != null) {
            v();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // o.NN
    public final void a() {
        SN sn = this.Y;
        if (sn == null) {
            return;
        }
        E7 e7 = sn.f;
        sn.f = null;
        if (e7 == null || Build.VERSION.SDK_INT < 34) {
            H(this.I ? 5 : 4);
            return;
        }
        boolean z = this.I;
        int i = sn.d;
        int i2 = sn.c;
        float f = e7.c;
        if (!z) {
            AnimatorSet animatorSetA = sn.a();
            animatorSetA.setDuration(AbstractC1161c3.c(i2, f, i));
            animatorSetA.start();
            H(4);
            return;
        }
        C0962a1 c0962a1 = new C0962a1(2, this);
        View view = sn.b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new C0537Jt(1));
        objectAnimatorOfFloat.setDuration(AbstractC1161c3.c(i2, f, i));
        objectAnimatorOfFloat.addListener(new C0962a1(5, sn));
        objectAnimatorOfFloat.addListener(c0962a1);
        objectAnimatorOfFloat.start();
    }

    @Override // o.NN
    public final void b(E7 e7) {
        SN sn = this.Y;
        if (sn == null) {
            return;
        }
        sn.f = e7;
    }

    @Override // o.NN
    public final void c(E7 e7) {
        SN sn = this.Y;
        if (sn == null) {
            return;
        }
        E7 e8 = sn.f;
        sn.f = e7;
        if (e8 == null) {
            return;
        }
        sn.b(e7.c);
    }

    @Override // o.NN
    public final void d() {
        SN sn = this.Y;
        if (sn == null) {
            return;
        }
        E7 e7 = sn.f;
        sn.f = null;
        if (e7 == null) {
            return;
        }
        AnimatorSet animatorSetA = sn.a();
        animatorSetA.setDuration(sn.e);
        animatorSetA.start();
    }

    @Override // o.AbstractC0706Qh
    public final void g(C0784Th c0784Th) {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // o.AbstractC0706Qh
    public final void i() {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        Nt0 nt0;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.a0 = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.n(view2, x, this.a0)) {
                    this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.b0 = true;
                }
            }
            this.N = this.Z == -1 && !coordinatorLayout.n(view, x, this.a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b0 = false;
            this.Z = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (nt0 = this.M) != null && nt0.o(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.a0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.M.b)) ? false : true;
    }

    @Override // o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.l;
        C2068lO c2068lO = this.i;
        WeakHashMap weakHashMap = It0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z = (i4 < 29 || this.n || this.f) ? false : true;
            if (this.f40o || this.p || this.q || this.s || this.t || this.u || z) {
                C2149m9 c2149m9 = new C2149m9();
                c2149m9.m = this;
                c2149m9.l = z;
                AbstractC3409z9.k(view, c2149m9);
            }
            C1508fh c1508fh = new C1508fh(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new C2803sw0(c1508fh));
            } else {
                PathInterpolator pathInterpolator = C2706rw0.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC2610qw0 = new ViewOnApplyWindowInsetsListenerC2610qw0(view, c1508fh);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC2610qw0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2610qw0);
                }
            }
            this.U = new WeakReference(view);
            this.Y = new SN(view);
            if (c2068lO != null) {
                view.setBackground(c2068lO);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = AbstractC3185wt0.i(view);
                }
                c2068lO.k(fI);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    AbstractC3185wt0.q(view, colorStateList);
                }
            }
            L();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new Nt0(coordinatorLayout.getContext(), coordinatorLayout, this.e0);
        }
        int top = view.getTop();
        coordinatorLayout.p(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i5 = iMin - height;
        int i6 = this.w;
        if (i5 < i6) {
            if (this.r) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        v();
        int i7 = this.L;
        if (i7 == 3) {
            It0.k(view, C());
        } else if (i7 == 6) {
            It0.k(view, this.E);
        } else if (this.I && i7 == 5) {
            It0.k(view, this.T);
        } else if (i7 == 4) {
            It0.k(view, this.G);
        } else if (i7 == 1 || i7 == 2) {
            It0.k(view, top - view.getTop());
        }
        M(this.L, false);
        this.V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.W;
            if (i3 >= arrayList.size()) {
                return true;
            }
            ((AbstractC2343o9) arrayList.get(i3)).a(view);
            i3++;
        }
    }

    @Override // o.AbstractC0706Qh
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), B(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // o.AbstractC0706Qh
    public final boolean m(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // o.AbstractC0706Qh
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < C()) {
                int iC = top - C();
                iArr[1] = iC;
                It0.k(view, -iC);
                I(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                It0.k(view, -i2);
                I(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.G;
            if (i4 > i5 && !this.I) {
                int i6 = top - i5;
                iArr[1] = i6;
                It0.k(view, -i6);
                I(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                It0.k(view, -i2);
                I(1);
            }
        }
        y(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // o.AbstractC0706Qh
    public final void q(View view, Parcelable parcelable) {
        C2440p9 c2440p9 = (C2440p9) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = c2440p9.f966o;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = c2440p9.p;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = c2440p9.q;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = c2440p9.r;
            }
        }
        int i2 = c2440p9.n;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // o.AbstractC0706Qh
    public final Parcelable r(View view) {
        return new C2440p9(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // o.AbstractC0706Qh
    public final boolean s(View view, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // o.AbstractC0706Qh
    public final void t(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == C()) {
            I(3);
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.b && view.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.X.getYVelocity(this.Z);
                }
                if (J(view, yVelocity)) {
                    i3 = 5;
                } else if (this.O == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.O == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            K(view, i3, false);
            this.P = false;
        }
    }

    @Override // o.AbstractC0706Qh
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        Nt0 nt0 = this.M;
        if (nt0 != null && (this.K || i == 1)) {
            nt0.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.a0 - motionEvent.getY());
            Nt0 nt1 = this.M;
            if (fAbs > nt1.b) {
                nt1.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void v() {
        int iX = x();
        if (this.b) {
            this.G = Math.max(this.T - iX, this.D);
        } else {
            this.G = this.T - iX;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.i != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.U.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C2068lO c2068lO = this.i;
                float fA = c2068lO.l.a.e.a(c2068lO.h());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                C2068lO c2068lO2 = this.i;
                float fA2 = c2068lO2.l.a.f.a(c2068lO2.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f2 = radius2 / fA2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int x() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v;
        }
        return (this.n || this.f40o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void y(int i) {
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != C()) {
                C();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((AbstractC2343o9) arrayList.get(i3)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new C2537q9(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new C2246n9(this, i2);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.c);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.y = C1891jd0.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        C1891jd0 c1891jd0 = this.y;
        if (c1891jd0 != null) {
            C2068lO c2068lO = new C2068lO(c1891jd0);
            this.i = c2068lO;
            c2068lO.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new C2052l9(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            G(i);
        } else {
            G(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        F(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z) {
            this.b = z;
            if (this.U != null) {
                v();
            }
            I((this.b && this.L == 6) ? 3 : this.L);
            M(this.L, true);
            L();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    M(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    M(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f40o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // o.AbstractC0706Qh
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
