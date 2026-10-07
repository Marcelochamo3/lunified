package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: o.nd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2281nd0 extends AbstractC2668rd0 {
    public final C2475pd0 c;
    public final float d;
    public final float e;

    public C2281nd0(C2475pd0 c2475pd0, float f, float f2) {
        this.c = c2475pd0;
        this.d = f;
        this.e = f2;
    }

    @Override // o.AbstractC2668rd0
    public final void a(Matrix matrix, C1697hd0 c1697hd0, int i, Canvas canvas) {
        C2475pd0 c2475pd0 = this.c;
        float f = c2475pd0.c;
        float f2 = this.e;
        float f3 = c2475pd0.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c1697hd0.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C1697hd0.i;
        iArr[0] = c1697hd0.f;
        iArr[1] = c1697hd0.e;
        iArr[2] = c1697hd0.d;
        Paint paint = c1697hd0.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C1697hd0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C2475pd0 c2475pd0 = this.c;
        return (float) Math.toDegrees(Math.atan((c2475pd0.c - this.e) / (c2475pd0.b - this.d)));
    }
}
