package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import o.AbstractC0397Ej;
import o.C0658Ol;
import o.C1042as;
import o.C1672hI;
import o.C2951uZ;
import o.Fj0;
import o.G40;
import o.InterfaceC2370oZ;
import o.InterfaceC3456zj0;
import o.Jj0;
import o.Lr0;
import o.ViewOnClickListenerC2660rZ;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DefaultTimeBar extends View implements InterfaceC3456zj0 {
    public static final /* synthetic */ int b0 = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final StringBuilder F;
    public final Formatter G;
    public final Jj0 H;
    public final CopyOnWriteArraySet I;
    public final Point J;
    public final float K;
    public int L;
    public long M;
    public int N;
    public Rect O;
    public float P;
    public boolean Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public int V;
    public long[] W;
    public boolean[] a0;
    public final Rect l;
    public final Rect m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f36o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Drawable v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet);
    }

    public static int a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.M;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.S;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.L);
    }

    private String getProgressText() {
        return Lr0.A(this.F, this.G, this.T);
    }

    private long getScrubberPosition() {
        Rect rect = this.m;
        if (rect.width() <= 0 || this.S == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f36o.width()) * this.S) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.S;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.Q ? this.R : this.T;
        long jK = Lr0.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.Q) {
            f(jK);
        } else {
            c(jK);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.R = j;
        this.Q = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            C2951uZ c2951uZ = ((ViewOnClickListenerC2660rZ) it.next()).l;
            c2951uZ.V = true;
            TextView textView = c2951uZ.x;
            if (textView != null) {
                textView.setText(Lr0.A(c2951uZ.z, c2951uZ.A, j));
            }
        }
    }

    public final void d(boolean z) {
        InterfaceC2370oZ interfaceC2370oZ;
        int iA;
        removeCallbacks(this.H);
        this.Q = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (ViewOnClickListenerC2660rZ viewOnClickListenerC2660rZ : this.I) {
            long j = this.R;
            C2951uZ c2951uZ = viewOnClickListenerC2660rZ.l;
            c2951uZ.V = false;
            if (!z && (interfaceC2370oZ = c2951uZ.R) != null) {
                C1042as c1042as = (C1042as) interfaceC2370oZ;
                Fj0 fj0E = c1042as.E();
                if (c2951uZ.U && !fj0E.q()) {
                    int iP = fj0E.p();
                    iA = 0;
                    while (true) {
                        long jX = Lr0.X(fj0E.n(iA, c2951uZ.C, 0L).y);
                        if (j < jX) {
                            break;
                        }
                        if (iA == iP - 1) {
                            j = jX;
                            break;
                        } else {
                            j -= jX;
                            iA++;
                        }
                    }
                } else {
                    iA = c1042as.A();
                }
                c1042as.k(iA, j, false);
                c2951uZ.h();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.n;
        Rect rect2 = this.m;
        rect.set(rect2);
        Rect rect3 = this.f36o;
        rect3.set(rect2);
        long j = this.Q ? this.R : this.T;
        if (this.S > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.U) / this.S)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.S)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.l);
    }

    public final void f(long j) {
        if (this.R == j) {
            return;
        }
        this.R = j;
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            C2951uZ c2951uZ = ((ViewOnClickListenerC2660rZ) it.next()).l;
            TextView textView = c2951uZ.x;
            if (textView != null) {
                textView.setText(Lr0.A(c2951uZ.z, c2951uZ.A, j));
            }
        }
    }

    @Override // o.InterfaceC3456zj0
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.m.width() / this.K);
        if (iWidth != 0) {
            long j = this.S;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.m;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.S;
        Paint paint = this.r;
        Rect rect2 = this.f36o;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.n;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.q);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.p);
            }
            if (this.V != 0) {
                long[] jArr = this.W;
                jArr.getClass();
                boolean[] zArr = this.a0;
                zArr.getClass();
                int i6 = this.z;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.V) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * Lr0.k(jArr[i9], 0L, this.S)) / this.S)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.t : this.s);
                    i9++;
                    i6 = i6;
                    i8 = 0;
                }
            }
        }
        if (this.S > 0) {
            int iJ = Lr0.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.v;
            if (drawable == null) {
                if (this.Q || isFocused()) {
                    i = this.C;
                } else {
                    i = isEnabled() ? this.A : this.B;
                }
                canvas.drawCircle(iJ, iCenterY2, (int) ((i * this.P) / 2.0f), this.u);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.P)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.P)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.Q || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.S <= 0) {
            return;
        }
        if (Lr0.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(C1672hI.a.f);
            accessibilityNodeInfo.addAction(C1672hI.a.e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            Jj0 jj0 = this.H;
                            removeCallbacks(jj0);
                            postDelayed(jj0, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            Jj0 jj1 = this.H;
                            removeCallbacks(jj1);
                            postDelayed(jj1, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.Q) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.Q) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.y;
        int i8 = this.w;
        int i9 = this.x;
        int i10 = this.D;
        if (i7 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i8) - Math.max(i10 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            paddingBottom2 = (i6 - i8) / 2;
        }
        Rect rect2 = this.l;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.m.set(rect2.left + i10, paddingBottom2, rect2.right - i10, i8 + paddingBottom2);
        if (Lr0.a >= 29 && ((rect = this.O) == null || rect.width() != i5 || this.O.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.O = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.x;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.v;
        if (drawable == null || Lr0.a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.S > 0) {
            Point point = this.J;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f36o;
            Rect rect2 = this.m;
            if (action == 0) {
                int i3 = i;
                if (this.l.contains(i3, i2)) {
                    rect.right = Lr0.j(i3, rect2.left, rect2.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.Q) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.Q) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.Q) {
                if (i2 < this.E) {
                    int i4 = this.N;
                    rect.right = Lr0.j(((i - i4) / 3) + i4, rect2.left, rect2.right);
                } else {
                    this.N = i;
                    rect.right = Lr0.j(i, rect2.left, rect2.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.S <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.s.setColor(i);
        invalidate(this.l);
    }

    public void setBufferedColor(int i) {
        this.q.setColor(i);
        invalidate(this.l);
    }

    @Override // o.InterfaceC3456zj0
    public void setBufferedPosition(long j) {
        if (this.U == j) {
            return;
        }
        this.U = j;
        e();
    }

    @Override // o.InterfaceC3456zj0
    public void setDuration(long j) {
        if (this.S == j) {
            return;
        }
        this.S = j;
        if (this.Q && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, o.InterfaceC3456zj0
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.Q || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        AbstractC0397Ej.c(i > 0);
        this.L = i;
        this.M = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        AbstractC0397Ej.c(j > 0);
        this.L = -1;
        this.M = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.t.setColor(i);
        invalidate(this.l);
    }

    public void setPlayedColor(int i) {
        this.p.setColor(i);
        invalidate(this.l);
    }

    @Override // o.InterfaceC3456zj0
    public void setPosition(long j) {
        if (this.T == j) {
            return;
        }
        this.T = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.u.setColor(i);
        invalidate(this.l);
    }

    public void setUnplayedColor(int i) {
        this.r.setColor(i);
        invalidate(this.l);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2) {
        Paint paint;
        super(context, attributeSet, 0);
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Rect();
        this.f36o = new Rect();
        Paint paint2 = new Paint();
        this.p = paint2;
        Paint paint3 = new Paint();
        this.q = paint3;
        Paint paint4 = new Paint();
        this.r = paint4;
        Paint paint5 = new Paint();
        this.s = paint5;
        Paint paint6 = new Paint();
        this.t = paint6;
        Paint paint7 = new Paint();
        this.u = paint7;
        paint7.setAntiAlias(true);
        this.I = new CopyOnWriteArraySet();
        this.J = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.K = f;
        this.E = a(-50, f);
        int iA = a(4, f);
        int iA2 = a(26, f);
        int iA3 = a(4, f);
        int iA4 = a(12, f);
        int iA5 = a(0, f);
        int iA6 = a(16, f);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, G40.b, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.v = drawable;
                if (drawable != null) {
                    int i = Lr0.a;
                    if (i >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                } else {
                    paint = paint5;
                }
                this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.y = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i5 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i2);
                paint7.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint.setColor(i6);
                paint6.setColor(i7);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.w = iA;
            this.x = iA2;
            this.y = 0;
            this.z = iA3;
            this.A = iA4;
            this.B = iA5;
            this.C = iA6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.v = null;
        }
        StringBuilder sb = new StringBuilder();
        this.F = sb;
        this.G = new Formatter(sb, Locale.getDefault());
        this.H = new Jj0(14, this);
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            this.D = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.D = (Math.max(this.B, Math.max(this.A, this.C)) + 1) / 2;
        }
        this.P = 1.0f;
        new ValueAnimator().addUpdateListener(new C0658Ol(0, this));
        this.S = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.L = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
