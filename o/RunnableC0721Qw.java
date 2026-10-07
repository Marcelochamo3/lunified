package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: o.Qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0721Qw implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ AbstractViewOnTouchListenerC0747Rw m;

    public /* synthetic */ RunnableC0721Qw(AbstractViewOnTouchListenerC0747Rw abstractViewOnTouchListenerC0747Rw, int i) {
        this.l = i;
        this.m = abstractViewOnTouchListenerC0747Rw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ViewParent parent = this.m.f499o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0747Rw abstractViewOnTouchListenerC0747Rw = this.m;
                abstractViewOnTouchListenerC0747Rw.a();
                View view = abstractViewOnTouchListenerC0747Rw.f499o;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0747Rw.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0747Rw.r = true;
                    break;
                }
                break;
        }
    }
}
