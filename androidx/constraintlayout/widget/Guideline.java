package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.C0498Ig;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean l;

    public Guideline(Context context) {
        super(context);
        this.l = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.l = z;
    }

    public void setGuidelineBegin(int i) {
        C0498Ig c0498Ig = (C0498Ig) getLayoutParams();
        if (this.l && c0498Ig.a == i) {
            return;
        }
        c0498Ig.a = i;
        setLayoutParams(c0498Ig);
    }

    public void setGuidelineEnd(int i) {
        C0498Ig c0498Ig = (C0498Ig) getLayoutParams();
        if (this.l && c0498Ig.b == i) {
            return;
        }
        c0498Ig.b = i;
        setLayoutParams(c0498Ig);
    }

    public void setGuidelinePercent(float f) {
        C0498Ig c0498Ig = (C0498Ig) getLayoutParams();
        if (this.l && c0498Ig.c == f) {
            return;
        }
        c0498Ig.c = f;
        setLayoutParams(c0498Ig);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = true;
        super.setVisibility(8);
    }
}
