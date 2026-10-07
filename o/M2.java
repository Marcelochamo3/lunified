package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2$AnimationCallback;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class M2 extends Animatable2$AnimationCallback {
    public final /* synthetic */ C1384eO a;

    public M2(C1384eO c1384eO) {
        this.a = c1384eO;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.z;
        if (colorStateList != null) {
            AbstractC2205mo.h(drawable, colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        C1580gO c1580gO = this.a.b;
        ColorStateList colorStateList = c1580gO.z;
        if (colorStateList != null) {
            AbstractC2205mo.g(drawable, colorStateList.getColorForState(c1580gO.D, colorStateList.getDefaultColor()));
        }
    }
}
