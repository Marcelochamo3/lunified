package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
class MediaRowFocusView extends View {
    public final Paint l;
    public final RectF m;
    public int n;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        this.l = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.n = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        RectF rectF = this.m;
        rectF.set(0.0f, -height2, getWidth(), getHeight() + height2);
        int i = this.n;
        canvas.drawRoundRect(rectF, i, i, this.l);
    }
}
