package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.leanback.widget.SearchEditText;

/* JADX INFO: loaded from: classes.dex */
public final class Og0 extends ReplacementSpan {
    public final int a;
    public final int b;
    public final /* synthetic */ Pg0 c;

    public Og0(SearchEditText searchEditText, int i, int i2) {
        this.c = searchEditText;
        this.a = i;
        this.b = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        Pg0 pg0 = this.c;
        int width = pg0.m.getWidth();
        int i6 = width * 2;
        int i7 = iMeasureText / i6;
        int i8 = (iMeasureText % i6) / 2;
        boolean z = 1 == pg0.getLayoutDirection();
        pg0.l.setSeed(this.a);
        int alpha = paint.getAlpha();
        for (int i9 = 0; i9 < i7 && this.b + i9 < pg0.f459o; i9++) {
            float f2 = (width / 2) + (i9 * i6) + i8;
            float f3 = z ? ((f + iMeasureText) - f2) - width : f + f2;
            paint.setAlpha((pg0.l.nextInt(4) + 1) * 63);
            if (pg0.l.nextBoolean()) {
                Bitmap bitmap = pg0.n;
                canvas.drawBitmap(bitmap, f3, i4 - bitmap.getHeight(), paint);
            } else {
                Bitmap bitmap2 = pg0.m;
                canvas.drawBitmap(bitmap2, f3, i4 - bitmap2.getHeight(), paint);
            }
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }
}
