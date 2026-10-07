package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AbstractActivityC1540fx;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2991ut0;
import o.AbstractComponentCallbacksC1247cx;
import o.C0670Ox;
import o.C2611qx;
import o.C3289xx;
import o.F7;
import o.It0;
import o.Kw0;
import o.P40;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList l;
    public final ArrayList m;
    public View.OnApplyWindowInsetsListener n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17o;

    public FragmentContainerView(Context context) {
        super(context);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f17o = true;
    }

    public final void a(View view) {
        if (this.m.contains(view)) {
            this.l.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC1474fG.j(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC1247cx ? (AbstractComponentCallbacksC1247cx) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        Kw0 kw0G;
        AbstractC1474fG.j(windowInsets, "insets");
        Kw0 kw0G2 = Kw0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.n;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC1474fG.i(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            kw0G = Kw0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = It0.a;
            WindowInsets windowInsetsF = kw0G2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = AbstractC2991ut0.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    kw0G2 = Kw0.g(this, windowInsetsB);
                }
            }
            kw0G = kw0G2;
        }
        if (!kw0G.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = It0.a;
                WindowInsets windowInsetsF2 = kw0G.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = AbstractC2991ut0.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        Kw0.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC1474fG.j(canvas, "canvas");
        if (this.f17o) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC1474fG.j(canvas, "canvas");
        AbstractC1474fG.j(view, "child");
        if (this.f17o) {
            ArrayList arrayList = this.l;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC1474fG.j(view, "view");
        this.m.remove(view);
        if (this.l.remove(view)) {
            this.f17o = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1247cx> F getFragment() {
        AbstractActivityC1540fx abstractActivityC1540fx;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx;
        C3289xx c3289xxU;
        View view = this;
        while (true) {
            abstractActivityC1540fx = null;
            if (view == null) {
                abstractComponentCallbacksC1247cx = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC1247cx = tag instanceof AbstractComponentCallbacksC1247cx ? (AbstractComponentCallbacksC1247cx) tag : null;
            if (abstractComponentCallbacksC1247cx != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC1247cx == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof AbstractActivityC1540fx) {
                    abstractActivityC1540fx = (AbstractActivityC1540fx) context;
                    break;
                }
            }
            if (abstractActivityC1540fx == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            c3289xxU = abstractActivityC1540fx.u();
        } else {
            if (!abstractComponentCallbacksC1247cx.t()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC1247cx + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c3289xxU = abstractComponentCallbacksC1247cx.i();
        }
        return (F) c3289xxU.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC1474fG.j(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC1474fG.i(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC1474fG.j(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC1474fG.i(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC1474fG.j(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC1474fG.i(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC1474fG.i(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f17o = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC1474fG.j(onApplyWindowInsetsListener, "listener");
        this.n = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC1474fG.j(view, "view");
        if (view.getParent() == this) {
            this.m.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC1474fG.j(context, "context");
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f17o = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P40.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C3289xx c3289xx) {
        View view;
        super(context, attributeSet);
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(attributeSet, "attrs");
        AbstractC1474fG.j(c3289xx, "fm");
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f17o = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P40.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = c3289xx.D(id);
        if (classAttribute != null && abstractComponentCallbacksC1247cxD == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC1701hf0.u("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C2611qx c2611qxI = c3289xx.I();
            context.getClassLoader();
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = c2611qxI.a(classAttribute);
            AbstractC1474fG.i(abstractComponentCallbacksC1247cxA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC1247cxA.J = id;
            abstractComponentCallbacksC1247cxA.K = id;
            abstractComponentCallbacksC1247cxA.L = string;
            abstractComponentCallbacksC1247cxA.F = c3289xx;
            abstractComponentCallbacksC1247cxA.G = c3289xx.v;
            abstractComponentCallbacksC1247cxA.E(context, attributeSet, null);
            F7 f7 = new F7(c3289xx);
            f7.p = true;
            abstractComponentCallbacksC1247cxA.R = this;
            abstractComponentCallbacksC1247cxA.B = true;
            f7.f(getId(), abstractComponentCallbacksC1247cxA, string, 1);
            if (!f7.g) {
                f7.h = false;
                f7.r.A(f7, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (C0670Ox c0670Ox : c3289xx.c.s()) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
            if (abstractComponentCallbacksC1247cx.K == getId() && (view = abstractComponentCallbacksC1247cx.S) != null && view.getParent() == null) {
                abstractComponentCallbacksC1247cx.R = this;
                c0670Ox.b();
                c0670Ox.k();
            }
        }
    }
}
