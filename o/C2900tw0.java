package o;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: o.tw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2900tw0 extends AbstractC2997uw0 {
    public final WindowInsetsAnimation e;

    public C2900tw0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // o.AbstractC2997uw0
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // o.AbstractC2997uw0
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // o.AbstractC2997uw0
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // o.AbstractC2997uw0
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
