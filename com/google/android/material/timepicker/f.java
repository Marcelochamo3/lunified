package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView l;

    public f(TimePickerView timePickerView) {
        this.l = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.E;
        this.l.getClass();
        return false;
    }
}
