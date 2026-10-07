package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: o.rs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2698rs0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C2698rs0(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2795ss0 c2795ss0 = new C2795ss0();
        c2795ss0.l = (VectorDrawable) this.a.newDrawable();
        return c2795ss0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2795ss0 c2795ss0 = new C2795ss0();
        c2795ss0.l = (VectorDrawable) this.a.newDrawable(resources);
        return c2795ss0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2795ss0 c2795ss0 = new C2795ss0();
        c2795ss0.l = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c2795ss0;
    }
}
