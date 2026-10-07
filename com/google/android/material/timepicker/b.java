package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView l;

    public b(ClockFaceView clockFaceView) {
        this.l = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.l;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.G.f46o) - clockFaceView.O;
        if (height != clockFaceView.E) {
            clockFaceView.E = height;
            clockFaceView.m();
            int i = clockFaceView.E;
            ClockHandView clockHandView = clockFaceView.G;
            clockHandView.w = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
