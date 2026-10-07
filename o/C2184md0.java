package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: o.md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2184md0 extends AbstractC2668rd0 {
    public final C2378od0 c;

    public C2184md0(C2378od0 c2378od0) {
        this.c = c2378od0;
    }

    @Override // o.AbstractC2668rd0
    public final void a(Matrix matrix, C1697hd0 c1697hd0, int i, Canvas canvas) {
        C2378od0 c2378od0 = this.c;
        float f = c2378od0.f;
        float f2 = c2378od0.g;
        RectF rectF = new RectF(c2378od0.b, c2378od0.c, c2378od0.d, c2378od0.e);
        c1697hd0.getClass();
        boolean z = f2 < 0.0f;
        Path path = c1697hd0.g;
        int[] iArr = C1697hd0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c1697hd0.f;
            iArr[2] = c1697hd0.e;
            iArr[3] = c1697hd0.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c1697hd0.d;
            iArr[2] = c1697hd0.e;
            iArr[3] = c1697hd0.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C1697hd0.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c1697hd0.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1697hd0.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
