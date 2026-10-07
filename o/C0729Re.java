package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: renamed from: o.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0729Re extends View {
    public final Paint l;
    public final Paint m;
    public final Path n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729Re(Context context) {
        super(context);
        AbstractC1474fG.j(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.l = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0f);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.m = paint2;
        this.n = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC1474fG.j(canvas, "canvas");
        super.onDraw(canvas);
        float f = getResources().getDisplayMetrics().density;
        Path path = this.n;
        path.reset();
        float f2 = 3.0f * f;
        path.moveTo(f2, 2.0f * f);
        path.lineTo(f2, 30.0f * f);
        path.lineTo(10.0f * f, 23.0f * f);
        float f3 = 16.0f * f;
        path.lineTo(f3, 36.0f * f);
        path.lineTo(22.0f * f, 33.0f * f);
        float f4 = 21.0f * f;
        path.lineTo(f3, f4);
        path.lineTo(f * 27.0f, f4);
        path.close();
        canvas.drawPath(path, this.l);
        canvas.drawPath(path, this.m);
    }
}
