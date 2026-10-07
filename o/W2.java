package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class W2 implements Drawable.Callback {
    public final /* synthetic */ int l = 1;
    public Object m;

    public /* synthetic */ W2() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.l) {
            case 0:
                ((Z2) this.m).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.l) {
            case 0:
                ((Z2) this.m).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.m;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.l) {
            case 0:
                ((Z2) this.m).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.m;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public W2(Z2 z2) {
        this.m = z2;
    }

    private final void a(Drawable drawable) {
    }
}
