package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.skidush.clonex.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0687Po extends ListView {
    public final Rect l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f463o;
    public int p;
    public int q;
    public C0635No r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public OK v;
    public RunnableC3102w1 w;

    public C0687Po(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.l = new Rect();
        this.m = 0;
        this.n = 0;
        this.f463o = 0;
        this.p = 0;
        this.t = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:92:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        OK ok;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || z2) {
                    this.u = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.q - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.v == null) {
                        this.v = new OK(this);
                    }
                    OK ok2 = this.v;
                    boolean z3 = ok2.A;
                    ok2.A = true;
                    ok2.onTouch(this, motionEvent);
                } else {
                    ok = this.v;
                    if (ok != null) {
                        if (ok.A) {
                            ok.d();
                        }
                        ok.A = false;
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.u = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0558Ko.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.q;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.q = iPointToPosition;
                AbstractC0558Ko.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.l;
                rect.set(left, top, right, bottom);
                rect.left -= this.m;
                rect.top -= this.n;
                rect.right += this.f463o;
                rect.bottom += this.p;
                if (i2 >= 33) {
                    zA = AbstractC0609Mo.a(this);
                } else {
                    Field field = AbstractC0661Oo.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException unused) {
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z5 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0609Mo.b(this, z5);
                    } else {
                        Field field2 = AbstractC0661Oo.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException unused2) {
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC2205mo.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC2205mo.e(selector2, f, f2);
                }
                C0635No c0635No = this.r;
                if (c0635No != null) {
                    c0635No.m = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.q - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.q - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.v == null) {
                this.v = new OK(this);
            }
            OK ok3 = this.v;
            boolean z6 = ok3.A;
            ok3.A = true;
            ok3.onTouch(this, motionEvent);
        } else {
            ok = this.v;
            if (ok != null) {
                if (ok.A) {
                    ok.d();
                }
                ok.A = false;
            }
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.l;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.w != null) {
            return;
        }
        super.drawableStateChanged();
        C0635No c0635No = this.r;
        if (c0635No != null) {
            c0635No.m = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.u && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.t || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.t || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.t && this.s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = 7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.w == null) {
            RunnableC3102w1 runnableC3102w1 = new RunnableC3102w1(i, this);
            this.w = runnableC3102w1;
            post(runnableC3102w1);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !AbstractC0584Lo.d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0584Lo.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0584Lo.b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0584Lo.c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.u && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3102w1 runnableC3102w1 = this.w;
        if (runnableC3102w1 != null) {
            C0687Po c0687Po = (C0687Po) runnableC3102w1.m;
            c0687Po.w = null;
            c0687Po.removeCallbacks(runnableC3102w1);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.s = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0635No c0635No;
        if (drawable != null) {
            c0635No = new C0635No(drawable);
            c0635No.m = true;
        } else {
            c0635No = null;
        }
        this.r = c0635No;
        super.setSelector(c0635No);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.m = rect.left;
        this.n = rect.top;
        this.f463o = rect.right;
        this.p = rect.bottom;
    }
}
