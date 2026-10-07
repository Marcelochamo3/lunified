package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2914u4 extends RatingBar {
    public final C2720s4 l;

    public C2914u4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1220cj0.a(this, getContext());
        C2720s4 c2720s4 = new C2720s4(this);
        this.l = c2720s4;
        c2720s4.b0(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.l.n;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
