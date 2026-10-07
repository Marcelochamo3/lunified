package o;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Qh0 extends AbstractC1923jt0 {
    public int e;
    public int f = -1;
    public final /* synthetic */ SwipeDismissBehavior g;

    public Qh0(SwipeDismissBehavior swipeDismissBehavior) {
        this.g = swipeDismissBehavior;
    }

    @Override // o.AbstractC1923jt0
    public final void A(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.g;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.e);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // o.AbstractC1923jt0
    public final void B(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f = -1;
        int width = view.getWidth();
        boolean z = true;
        SwipeDismissBehavior swipeDismissBehavior = this.g;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = It0.a;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.e;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.e;
                if (left < i2) {
                    i = this.e - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.e - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.e) < Math.round(view.getWidth() * swipeDismissBehavior.e)) {
                i = this.e;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.e;
                if (left < i2) {
                    i = this.e - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.e - width;
            }
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            RunnableC1938k1 runnableC1938k1 = new RunnableC1938k1(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = It0.a;
            view.postOnAnimation(runnableC1938k1);
        }
    }

    @Override // o.AbstractC1923jt0
    public final boolean J(View view, int i) {
        int i2 = this.f;
        return (i2 == -1 || i2 == i) && this.g.v(view);
    }

    @Override // o.AbstractC1923jt0
    public final int i(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = It0.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.g.d;
        if (i2 == 0) {
            if (z) {
                width = this.e - view.getWidth();
                width2 = this.e;
            } else {
                width = this.e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.e - view.getWidth();
            width2 = view.getWidth() + this.e;
        } else if (z) {
            width = this.e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.e - view.getWidth();
            width2 = this.e;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // o.AbstractC1923jt0
    public final int j(View view, int i) {
        return view.getTop();
    }

    @Override // o.AbstractC1923jt0
    public final int o(View view) {
        return view.getWidth();
    }

    @Override // o.AbstractC1923jt0
    public final void y(View view, int i) {
        this.f = i;
        this.e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.g;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // o.AbstractC1923jt0
    public final void z(int i) {
        this.g.getClass();
    }
}
