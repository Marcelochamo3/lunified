package o;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.l60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2047l60 implements Runnable {
    public int l;
    public int m;
    public OverScroller n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Interpolator f890o;
    public boolean p;
    public boolean q;
    public final /* synthetic */ RecyclerView r;

    public RunnableC2047l60(RecyclerView recyclerView) {
        this.r = recyclerView;
        M50 m50 = RecyclerView.S0;
        this.f890o = m50;
        this.p = false;
        this.q = false;
        this.n = new OverScroller(recyclerView.getContext(), m50);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.r;
        recyclerView.setScrollState(2);
        this.m = 0;
        this.l = 0;
        Interpolator interpolator = this.f890o;
        M50 m50 = RecyclerView.S0;
        if (interpolator != m50) {
            this.f890o = m50;
            this.n = new OverScroller(recyclerView.getContext(), m50);
        }
        this.n.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.p) {
            this.q = true;
            return;
        }
        RecyclerView recyclerView = this.r;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = It0.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.r;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.S0;
        }
        if (this.f890o != interpolator) {
            this.f890o = interpolator;
            this.n = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.m = 0;
        this.l = 0;
        recyclerView.setScrollState(2);
        this.n.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.n.computeScrollOffset();
        }
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.r;
        if (recyclerView.y == null) {
            recyclerView.removeCallbacks(this);
            this.n.abortAnimation();
            return;
        }
        this.q = false;
        this.p = true;
        recyclerView.n();
        OverScroller overScroller = this.n;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.l;
            int i7 = currY - this.m;
            this.l = currX;
            this.m = currY;
            int iM = RecyclerView.m(i6, recyclerView.U, recyclerView.W, recyclerView.getWidth());
            int iM2 = RecyclerView.m(i7, recyclerView.V, recyclerView.a0, recyclerView.getHeight());
            int[] iArr = recyclerView.F0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zT = recyclerView.t(iM, iM2, 1, iArr, null);
            int[] iArr2 = recyclerView.F0;
            if (zT) {
                iM -= iArr2[0];
                iM2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(iM, iM2);
            }
            if (recyclerView.x != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.f0(iM, iM2, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = iM - i8;
                int i11 = iM2 - i9;
                C2645rK c2645rK = recyclerView.y.e;
                if (c2645rK != null && !c2645rK.d && c2645rK.e) {
                    int iB = recyclerView.t0.b();
                    if (iB == 0) {
                        c2645rK.j();
                    } else if (c2645rK.a >= iB) {
                        c2645rK.a = iB - 1;
                        c2645rK.g(i8, i9);
                    } else {
                        c2645rK.g(i8, i9);
                    }
                }
                i4 = i8;
                i = i10;
                i2 = i11;
                i3 = i9;
            } else {
                i = iM;
                i2 = iM2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.B.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.F0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i3;
            recyclerView.u(i4, i3, i, i2, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i2 - iArr2[1];
            if (i4 != 0 || i12 != 0) {
                recyclerView.v(i4, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            C2645rK c2645rK2 = recyclerView.y.e;
            if ((c2645rK2 == null || !c2645rK2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i13 > 0 ? currVelocity : 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.x();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.y();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.z();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.w();
                        if (recyclerView.a0.isFinished()) {
                            recyclerView.a0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = It0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.Q0) {
                    C0702Qd c0702Qd = recyclerView.s0;
                    int[] iArr4 = (int[]) c0702Qd.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0702Qd.c = 0;
                }
            } else {
                b();
                RunnableC1544fz runnableC1544fz = recyclerView.r0;
                if (runnableC1544fz != null) {
                    runnableC1544fz.a(recyclerView, i4, i12);
                }
            }
        }
        C2645rK c2645rK3 = recyclerView.y.e;
        if (c2645rK3 != null && c2645rK3.d) {
            c2645rK3.g(0, 0);
        }
        this.p = false;
        if (!this.q) {
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = It0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
