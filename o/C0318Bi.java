package o;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: o.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0318Bi extends C2068lO {
    public static final /* synthetic */ int J = 0;
    public C0292Ai I;

    public C0318Bi(C0292Ai c0292Ai) {
        super(c0292Ai);
        this.I = c0292Ai;
    }

    @Override // o.C2068lO
    public final void g(Canvas canvas) {
        if (this.I.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.I.v);
        } else {
            canvas.clipRect(this.I.v, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // o.C2068lO, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I = new C0292Ai(this.I);
        return this;
    }

    public final void p(float f, float f2, float f3, float f4) {
        RectF rectF = this.I.v;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
