package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class S8 implements InterfaceC2686rm0 {
    @Override // o.InterfaceC2686rm0
    public final M70 b(C1566gA c1566gA, M70 m70, int i, int i2) {
        if (!Kr0.i(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Q8 q8 = com.bumptech.glide.a.a(c1566gA).m;
        Bitmap bitmap = (Bitmap) m70.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(q8, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? m70 : R8.c(bitmapC, q8);
    }

    public abstract Bitmap c(Q8 q8, Bitmap bitmap, int i, int i2);
}
