package o;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OK implements View.OnTouchListener {
    public static final int C = ViewConfiguration.getTapTimeout();
    public boolean A;
    public final ListView B;
    public final C2533q7 l;
    public final AccelerateInterpolator m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RunnableC3102w1 f431o;
    public final float[] p;
    public final float[] q;
    public final int r;
    public final int s;
    public final float[] t;
    public final float[] u;
    public final float[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public OK(ListView listView) {
        C2533q7 c2533q7 = new C2533q7();
        c2533q7.e = Long.MIN_VALUE;
        c2533q7.g = -1L;
        c2533q7.f = 0L;
        this.l = c2533q7;
        this.m = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.p = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.q = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.t = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.u = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.n = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.r = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.s = C;
        c2533q7.a = 500;
        c2533q7.b = 500;
        this.B = listView;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.p[i] * f2, 0.0f, this.q[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.m;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.t[i];
            float f5 = this.u[i];
            float f6 = this.v[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.t[i];
        float f9 = this.u[i];
        float f10 = this.v[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.r;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.z && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.x) {
            this.z = false;
            return;
        }
        C2533q7 c2533q7 = this.l;
        c2533q7.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c2533q7.e);
        int i3 = c2533q7.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2533q7.i = i;
        c2533q7.h = c2533q7.a(jCurrentAnimationTimeMillis);
        c2533q7.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        C2533q7 c2533q7 = this.l;
        float f = c2533q7.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c2533q7.c);
        if (iAbs == 0 || (count = (listView = this.B).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2;
        if (!this.A) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return false;
        }
        this.y = true;
        this.w = false;
        float x = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.n;
        float fA = a(0, x, width, view2.getWidth());
        float fA2 = a(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
        C2533q7 c2533q7 = this.l;
        c2533q7.c = fA;
        c2533q7.d = fA2;
        if (!this.z && e()) {
            if (this.f431o == null) {
                this.f431o = new RunnableC3102w1(i2, this);
            }
            this.z = true;
            this.x = true;
            if (this.w || (i = this.s) <= 0) {
                this.f431o.run();
            } else {
                RunnableC3102w1 runnableC3102w1 = this.f431o;
                long j = i;
                WeakHashMap weakHashMap = It0.a;
                view2.postOnAnimationDelayed(runnableC3102w1, j);
            }
            this.w = true;
        }
        return false;
    }
}
