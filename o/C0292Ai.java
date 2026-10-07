package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o.Ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292Ai extends C1970kO {
    public final RectF v;

    public C0292Ai(C1891jd0 c1891jd0, RectF rectF) {
        super(c1891jd0);
        this.v = rectF;
    }

    @Override // o.C1970kO, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0318Bi c0318Bi = new C0318Bi(this);
        c0318Bi.invalidateSelf();
        return c0318Bi;
    }

    public C0292Ai(C0292Ai c0292Ai) {
        super(c0292Ai);
        this.v = c0292Ai.v;
    }
}
