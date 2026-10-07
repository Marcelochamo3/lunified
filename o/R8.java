package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class R8 implements M70, FF {
    public final /* synthetic */ int l = 1;
    public final Object m;
    public final Object n;

    public R8(Bitmap bitmap, Q8 q8) {
        AbstractC3045vW.k(bitmap, "Bitmap must not be null");
        this.m = bitmap;
        AbstractC3045vW.k(q8, "BitmapPool must not be null");
        this.n = q8;
    }

    public static R8 c(Bitmap bitmap, Q8 q8) {
        if (bitmap == null) {
            return null;
        }
        return new R8(bitmap, q8);
    }

    @Override // o.FF
    public final void a() {
        switch (this.l) {
            case 0:
                ((Bitmap) this.m).prepareToDraw();
                break;
            default:
                M70 m70 = (M70) this.n;
                if (m70 instanceof FF) {
                    ((FF) m70).a();
                }
                break;
        }
    }

    @Override // o.M70
    public final int b() {
        switch (this.l) {
            case 0:
                return Kr0.c((Bitmap) this.m);
            default:
                return ((M70) this.n).b();
        }
    }

    @Override // o.M70
    public final Class d() {
        switch (this.l) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // o.M70
    public final void e() {
        switch (this.l) {
            case 0:
                ((Q8) this.n).d((Bitmap) this.m);
                break;
            default:
                ((M70) this.n).e();
                break;
        }
    }

    @Override // o.M70
    public final Object get() {
        switch (this.l) {
            case 0:
                return (Bitmap) this.m;
            default:
                return new BitmapDrawable((Resources) this.m, (Bitmap) ((M70) this.n).get());
        }
    }

    public R8(Resources resources, M70 m70) {
        AbstractC3045vW.k(resources, "Argument must not be null");
        this.m = resources;
        AbstractC3045vW.k(m70, "Argument must not be null");
        this.n = m70;
    }
}
