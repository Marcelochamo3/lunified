package o;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Gu0 extends Fu0 {
    @Override // o.U9
    public final void F(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o.Fu0, o.U9
    public final void G(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o.Du0
    public final void P(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.Du0
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o.Du0
    public final void R(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // o.U9
    public final float r(View view) {
        return view.getTransitionAlpha();
    }
}
