package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.skidush.clonex.R;
import o.AbstractC2180mb0;

/* JADX INFO: loaded from: classes.dex */
public final class SeekBar extends View {
    public final RectF l;
    public final RectF m;
    public final RectF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f26o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        Paint paint = new Paint(1);
        this.f26o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        Paint paint3 = new Paint(1);
        this.q = paint3;
        Paint paint4 = new Paint(1);
        this.r = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.x = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    public final void a() {
        int i = isFocused() ? this.y : this.x;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        RectF rectF = this.n;
        int i3 = this.x;
        float f = i2;
        float f2 = height - i2;
        rectF.set(i3 / 2, f, width - (i3 / 2), f2);
        int i4 = isFocused() ? this.w : this.x / 2;
        float f3 = width - (i4 * 2);
        float f4 = (this.s / this.u) * f3;
        RectF rectF2 = this.l;
        int i5 = this.x;
        rectF2.set(i5 / 2, f, (i5 / 2) + f4, f2);
        this.m.set(rectF2.right, f, (this.x / 2) + ((this.t / this.u) * f3), f2);
        this.v = i4 + ((int) f4);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.u;
    }

    public int getProgress() {
        return this.s;
    }

    public int getSecondProgress() {
        return this.t;
    }

    public int getSecondaryProgressColor() {
        return this.f26o.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.w : this.x / 2;
        canvas.drawRoundRect(this.n, f, f, this.q);
        RectF rectF = this.m;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.f26o);
        }
        canvas.drawRoundRect(this.l, f, f, this.p);
        canvas.drawCircle(this.v, getHeight() / 2, f, this.r);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle);
    }

    public void setActiveBarHeight(int i) {
        this.y = i;
        a();
    }

    public void setActiveRadius(int i) {
        this.w = i;
        a();
    }

    public void setBarHeight(int i) {
        this.x = i;
        a();
    }

    public void setMax(int i) {
        this.u = i;
        a();
    }

    public void setProgress(int i) {
        int i2 = this.u;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.s = i;
        a();
    }

    public void setProgressColor(int i) {
        this.p.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.u;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.t = i;
        a();
    }

    public void setSecondaryProgressColor(int i) {
        this.f26o.setColor(i);
    }

    public void setAccessibilitySeekListener(AbstractC2180mb0 abstractC2180mb0) {
    }
}
