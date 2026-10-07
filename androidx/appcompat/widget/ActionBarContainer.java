package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import o.T40;
import o.W90;
import o.Y0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean l;
    public View m;
    public View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f5o;
    public Drawable p;
    public Drawable q;
    public final boolean r;
    public boolean s;
    public final int t;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new Y0(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.a);
        boolean z = false;
        this.f5o = typedArrayObtainStyledAttributes.getDrawable(0);
        this.p = typedArrayObtainStyledAttributes.getDrawable(2);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.r = true;
            this.q = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.r ? !(this.f5o != null || this.p != null) : this.q == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5o;
        if (drawable != null && drawable.isStateful()) {
            this.f5o.setState(getDrawableState());
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null && drawable2.isStateful()) {
            this.p.setState(getDrawableState());
        }
        Drawable drawable3 = this.q;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.q.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.m = findViewById(R.id.action_bar);
        this.n = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.r) {
            Drawable drawable = this.q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f5o == null) {
                z2 = false;
            } else if (this.m.getVisibility() == 0) {
                this.f5o.setBounds(this.m.getLeft(), this.m.getTop(), this.m.getRight(), this.m.getBottom());
            } else {
                View view = this.n;
                if (view == null || view.getVisibility() != 0) {
                    this.f5o.setBounds(0, 0, 0, 0);
                } else {
                    this.f5o.setBounds(this.n.getLeft(), this.n.getTop(), this.n.getRight(), this.n.getBottom());
                }
            }
            this.s = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.m == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.t) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.m == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5o);
        }
        this.f5o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.m;
            if (view != null) {
                this.f5o.setBounds(view.getLeft(), this.m.getTop(), this.m.getRight(), this.m.getBottom());
            }
        }
        boolean z = false;
        if (!this.r ? !(this.f5o != null || this.p != null) : this.q == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.q);
        }
        this.q = drawable;
        boolean z = this.r;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f5o != null || this.p != null) : this.q == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.p);
        }
        this.p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.s && this.p != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.r ? !(this.f5o != null || this.p != null) : this.q == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.l = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5o;
        boolean z = this.r;
        return (drawable == drawable2 && !z) || (drawable == this.p && this.s) || ((drawable == this.q && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(W90 w90) {
    }
}
