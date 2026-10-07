package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2762sc extends S8 {
    public static final byte[] b = "o.sc".getBytes(InterfaceC2450pI.a);

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // o.S8
    public final Bitmap c(Q8 q8, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC2880tm0.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapC = q8.c(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapC.setHasAlpha(bitmap.hasAlpha());
        AbstractC2880tm0.a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        return obj instanceof C2762sc;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return -599754482;
    }
}
