package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class C80 extends Drawable implements InterfaceC2862td0, Pj0 {
    public B80 l;

    public C80(B80 b80) {
        this.l = b80;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        B80 b80 = this.l;
        if (b80.b) {
            b80.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.l.a.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.l = new B80(this.l);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.l.a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = AbstractC1376eG.E(iArr);
        B80 b80 = this.l;
        if (b80.b == zE) {
            return zOnStateChange;
        }
        b80.b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.a.setColorFilter(colorFilter);
    }

    @Override // o.InterfaceC2862td0
    public final void setShapeAppearanceModel(C1891jd0 c1891jd0) {
        this.l.a.setShapeAppearanceModel(c1891jd0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.l.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.l.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.l.a.setTintMode(mode);
    }
}
