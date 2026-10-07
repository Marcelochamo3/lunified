package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: o.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0571Lb extends C2645rK {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0571Lb(Object obj, Context context, int i) {
        super(context);
        this.p = i;
        this.q = obj;
    }

    @Override // o.C2645rK
    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // o.C2645rK
    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // o.C2645rK
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // o.C2645rK
    public int e(int i) {
        switch (this.p) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // o.C2645rK
    public PointF f(int i) {
        switch (this.p) {
            case 0:
                return ((CarouselLayoutManager) this.q).a(i);
            default:
                return super.f(i);
        }
    }

    @Override // o.C2645rK
    public void i(View view, C1562g8 c1562g8) {
        switch (this.p) {
            case 1:
                XW xw = (XW) this.q;
                int[] iArrB = xw.b(xw.a.getLayoutManager(), view);
                int i = iArrB[0];
                int i2 = iArrB[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    c1562g8.c = i;
                    c1562g8.d = i2;
                    c1562g8.e = iCeil;
                    c1562g8.g = decelerateInterpolator;
                    c1562g8.b = true;
                }
                break;
            default:
                super.i(view, c1562g8);
                break;
        }
    }
}
