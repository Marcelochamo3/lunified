package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AbstractC1161c3;
import o.AbstractC3045vW;
import o.H40;
import o.InterfaceC0496Ie;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public final ValueAnimator l;
    public boolean m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f46o;
    public final float p;
    public final Paint q;
    public final RectF r;
    public final int s;
    public float t;
    public boolean u;
    public double v;
    public int w;
    public int x;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.l = new ValueAnimator();
        this.n = new ArrayList();
        Paint paint = new Paint();
        this.q = paint;
        this.r = new RectF();
        this.x = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC3045vW.D(context, R.attr.motionDurationLong2, 200);
        AbstractC3045vW.E(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.b);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f46o = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.s = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = It0.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.w * 0.66f) : this.w;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.t = f2;
        this.v = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.x);
        float fCos = (((float) Math.cos(this.v)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.v))) + height;
        float f3 = this.f46o;
        this.r.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0496Ie) it.next());
            if (Math.abs(clockFaceView.T - f2) > 0.001f) {
                clockFaceView.T = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.x);
        float f = width;
        float f2 = iA;
        float fCos = (((float) Math.cos(this.v)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.v))) + f3;
        Paint paint = this.q;
        paint.setStrokeWidth(0.0f);
        int i = this.f46o;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.v);
        double d = iA - i;
        paint.setStrokeWidth(this.s);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.v) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.p, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.l.isRunning()) {
            return;
        }
        b(this.t);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z = this.u;
                if (this.m) {
                    this.x = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.u = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.u;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.t != f;
        if (z2 && z5) {
            z3 = true;
        } else if (z5 || z) {
            b(f);
            z3 = true;
        }
        this.u = z4 | z3;
        return true;
    }
}
