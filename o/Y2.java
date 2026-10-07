package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ Y2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                Z2 z2 = new Z2(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                z2.l = drawableNewDrawable;
                drawableNewDrawable.setCallback(z2.q);
                return z2;
            default:
                return new C0672Oz(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                Z2 z2 = new Z2(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                z2.l = drawableNewDrawable;
                drawableNewDrawable.setCallback(z2.q);
                return z2;
            default:
                return new C0672Oz(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                Z2 z2 = new Z2(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                z2.l = drawableNewDrawable;
                drawableNewDrawable.setCallback(z2.q);
                return z2;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
