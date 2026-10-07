package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2122lv extends S8 {
    public static final byte[] b = "o.lv".getBytes(InterfaceC2450pI.a);

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // o.S8
    public final Bitmap c(Q8 q8, Bitmap bitmap, int i, int i2) {
        return AbstractC2880tm0.b(q8, bitmap, i, i2);
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        return obj instanceof C2122lv;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return 1572326941;
    }
}
