package o;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Ul0 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, JW {
    public final C3448zf0 n;
    public final GestureDetector p;
    public final PointF l = new PointF();
    public final PointF m = new PointF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f558o = 25.0f;
    public volatile float q = 3.1415927f;

    public Ul0(Context context, C3448zf0 c3448zf0) {
        this.n = c3448zf0;
        this.p = new GestureDetector(context, this);
    }

    @Override // o.JW
    public final void a(float[] fArr, float f) {
        this.q = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.l.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.l.x) / this.f558o;
        float y = motionEvent2.getY();
        PointF pointF = this.l;
        float f3 = (y - pointF.y) / this.f558o;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.q;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.m;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C3448zf0 c3448zf0 = this.n;
        PointF pointF3 = this.m;
        synchronized (c3448zf0) {
            float f5 = pointF3.y;
            c3448zf0.r = f5;
            Matrix.setRotateM(c3448zf0.p, 0, -f5, (float) Math.cos(c3448zf0.s), (float) Math.sin(c3448zf0.s), 0.0f);
            Matrix.setRotateM(c3448zf0.q, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.n.v.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.p.onTouchEvent(motionEvent);
    }
}
