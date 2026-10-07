package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Nt0 {
    public static final M50 v = new M50(1);
    public int a;
    public final int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f420o;
    public final OverScroller p;
    public final AbstractC1923jt0 q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public int c = -1;
    public final RunnableC3102w1 u = new RunnableC3102w1(27, this);

    public Nt0(Context context, ViewGroup viewGroup, AbstractC1923jt0 abstractC1923jt0) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC1923jt0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = viewGroup;
        this.q = abstractC1923jt0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f420o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context, v);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.r = view;
        this.c = i;
        this.q.y(view, i);
        m(1);
    }

    public final boolean c(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC1923jt0 abstractC1923jt0 = this.q;
        boolean z = abstractC1923jt0.o(view) > 0;
        boolean z2 = abstractC1923jt0.p() > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.b;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.b);
        }
        return z2 && Math.abs(f2) > ((float) this.b);
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                It0.j(this.r, left);
            }
            if (top != 0) {
                It0.k(this.r, top);
            }
            if (left != 0 || top != 0) {
                this.q.A(this.r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.t.post(this.u);
            }
        }
        return this.a == 2;
    }

    public final View g(int i, int i2) {
        ViewGroup viewGroup = this.t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC1923jt0 abstractC1923jt0 = this.q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, abstractC1923jt0.p()) * f6) + (e(i5, i3, abstractC1923jt0.o(view)) * f5)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x, (int) y);
            k(x, y, pointerId);
            p(viewG, pointerId);
            int i3 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                j();
            }
            a();
            return;
        }
        AbstractC1923jt0 abstractC1923jt0 = this.q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    this.s = true;
                    abstractC1923jt0.B(this.r, 0.0f, 0.0f);
                    this.s = false;
                    if (this.a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                k(x2, y2, pointerId2);
                if (this.a == 0) {
                    p(g((int) x2, (int) y2), pointerId2);
                    int i4 = this.h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    p(this.r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.c) {
                        View viewG2 = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.r;
                        if (viewG2 == view2 && p(view2, pointerId4)) {
                            i = this.c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.a == 1) {
            int i7 = this.c;
            if (((this.k & (1 << i7)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i7);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f;
            int i8 = this.c;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.g[i8]);
            int left = this.r.getLeft() + i9;
            int top = this.r.getTop() + i10;
            int left2 = this.r.getLeft();
            int top2 = this.r.getTop();
            if (i9 != 0) {
                left = abstractC1923jt0.i(this.r, left);
                It0.j(this.r, left - left2);
            }
            if (i10 != 0) {
                top = abstractC1923jt0.j(this.r, top);
                It0.k(this.r, top - top2);
            }
            if (i9 != 0 || i10 != 0) {
                abstractC1923jt0.A(this.r, left, top);
            }
            l(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if ((this.k & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i11);
                float y4 = motionEvent.getY(i11);
                float f = x4 - this.d[pointerId5];
                float f2 = y4 - this.e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i14 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i15 = this.h[pointerId5];
                if (this.a == 1) {
                    break;
                }
                View viewG3 = g((int) x4, (int) y4);
                if (c(viewG3, f, f2) && p(viewG3, pointerId5)) {
                    break;
                }
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f2) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.s = true;
        this.q.B(this.r, xVelocity, f3);
        this.s = false;
        if (this.a == 1) {
            m(0);
        }
    }

    public final void k(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.t;
        int left = viewGroup.getLeft();
        int i5 = this.f420o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.k |= 1 << i;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void m(int i) {
        this.t.removeCallbacks(this.u);
        if (this.a != i) {
            this.a = i;
            this.q.z(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean n(int i, int i2) {
        if (this.s) {
            return h(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    public final boolean o(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            k(x, y, pointerId);
            View viewG2 = g((int) x, (int) y);
            if (viewG2 == this.r && this.a == 2) {
                p(viewG2, pointerId);
            }
            int i = this.h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                k(x2, y2, pointerId2);
                int i2 = this.a;
                if (i2 == 0) {
                    int i3 = this.h[pointerId2];
                } else if (i2 == 2 && (viewG = g((int) x2, (int) y2)) == this.r) {
                    p(viewG, pointerId2);
                }
            } else if (actionMasked == 6) {
                d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.d != null && this.e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.k & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.d[pointerId3];
                    float f2 = y3 - this.e[pointerId3];
                    View viewG3 = g((int) x3, (int) y3);
                    boolean z = viewG3 != null && c(viewG3, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.h[pointerId3];
                        if (this.a != 1) {
                            break;
                        }
                    } else {
                        int left = viewG3.getLeft();
                        AbstractC1923jt0 abstractC1923jt0 = this.q;
                        int i9 = abstractC1923jt0.i(viewG3, ((int) f) + left);
                        int top = viewG3.getTop();
                        int iJ = abstractC1923jt0.j(viewG3, ((int) f2) + top);
                        int iO = abstractC1923jt0.o(viewG3);
                        int iP = abstractC1923jt0.p();
                        if ((iO == 0 || (iO > 0 && i9 == left)) && (iP == 0 || (iP > 0 && iJ == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i10 = this.h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i11 = this.h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i12 = this.h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i13 = this.h[pointerId3];
                        if (this.a != 1 || (z && p(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            l(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean p(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.J(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }
}
