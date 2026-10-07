package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: o.Rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0747Rw implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f499o;
    public RunnableC0721Qw p;
    public RunnableC0721Qw q;
    public boolean r;
    public int s;
    public final int[] t = new int[2];

    public AbstractViewOnTouchListenerC0747Rw(View view) {
        this.f499o = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.l = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.m = tapTimeout;
        this.n = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0721Qw runnableC0721Qw = this.q;
        View view = this.f499o;
        if (runnableC0721Qw != null) {
            view.removeCallbacks(runnableC0721Qw);
        }
        RunnableC0721Qw runnableC0721Qw2 = this.p;
        if (runnableC0721Qw2 != null) {
            view.removeCallbacks(runnableC0721Qw2);
        }
    }

    public abstract Id0 b();

    public abstract boolean c();

    public boolean d() {
        Id0 id0B = b();
        if (id0B == null || !id0B.b()) {
            return true;
        }
        id0B.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C0687Po c0687PoH;
        boolean z2 = this.r;
        View view2 = this.f499o;
        if (z2) {
            Id0 id0B = b();
            if (id0B != null && id0B.b() && (c0687PoH = id0B.h()) != null && c0687PoH.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.t;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0687PoH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c0687PoH.b(motionEventObtainNoHistory, this.s);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.s = motionEvent.getPointerId(0);
                    if (this.p == null) {
                        this.p = new RunnableC0721Qw(this, 0);
                    }
                    view2.postDelayed(this.p, this.m);
                    if (this.q == null) {
                        this.q = new RunnableC0721Qw(this, 1);
                    }
                    view2.postDelayed(this.q, this.n);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.s);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.l;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.r = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.r = false;
        this.s = -1;
        RunnableC0721Qw runnableC0721Qw = this.p;
        if (runnableC0721Qw != null) {
            this.f499o.removeCallbacks(runnableC0721Qw);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
