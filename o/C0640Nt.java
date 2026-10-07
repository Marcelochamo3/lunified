package o;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640Nt extends U50 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final RunnableC3102w1 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f419o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public C0640Nt(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        RunnableC3102w1 runnableC3102w1 = new RunnableC3102w1(9, this);
        this.B = runnableC3102w1;
        C0588Lt c0588Lt = new C0588Lt(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0614Mt(this));
        valueAnimatorOfFloat.addUpdateListener(new C2052l9(1, this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            X50 x50 = recyclerView2.y;
            if (x50 != null) {
                x50.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.B;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.C.remove(this);
            if (recyclerView3.D == this) {
                recyclerView3.D = null;
            }
            ArrayList arrayList2 = this.s.v0;
            if (arrayList2 != null) {
                arrayList2.remove(c0588Lt);
            }
            this.s.removeCallbacks(runnableC3102w1);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.s.C.add(this);
            this.s.h(c0588Lt);
        }
    }

    public static int f(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // o.U50
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.r;
                int i9 = this.f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = It0.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.u) {
                int i10 = this.r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f419o;
                int i14 = this.n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.q;
                int i17 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean d(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.f419o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f, float f2) {
        RecyclerView recyclerView = this.s;
        WeakHashMap weakHashMap = It0.a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void g(int i) {
        RunnableC3102w1 runnableC3102w1 = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(runnableC3102w1);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            h();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(runnableC3102w1);
            this.s.postDelayed(runnableC3102w1, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(runnableC3102w1);
            this.s.postDelayed(runnableC3102w1, 1500);
        }
        this.v = i;
    }

    public final void h() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
