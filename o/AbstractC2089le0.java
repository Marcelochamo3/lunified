package o;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: o.le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2089le0 extends FrameLayout {
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) * 9) / 16, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
