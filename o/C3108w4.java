package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3108w4 extends SeekBar {
    public final C3205x4 l;

    public C3108w4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1220cj0.a(this, getContext());
        C3205x4 c3205x4 = new C3205x4(this);
        this.l = c3205x4;
        c3205x4.b0(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3205x4 c3205x4 = this.l;
        Drawable drawable = c3205x4.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c3205x4.p;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.l.q0(canvas);
    }
}
