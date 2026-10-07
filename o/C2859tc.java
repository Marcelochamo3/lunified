package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2859tc extends S8 {
    public static final byte[] b = "o.tc".getBytes(InterfaceC2450pI.a);

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // o.S8
    public final Bitmap c(Q8 q8, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC2880tm0.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return AbstractC2880tm0.b(q8, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        return obj instanceof C2859tc;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return -670243078;
    }
}
