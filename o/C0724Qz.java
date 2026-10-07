package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0724Qz implements InterfaceC2686rm0 {
    public final InterfaceC2686rm0 b;

    public C0724Qz(InterfaceC2686rm0 interfaceC2686rm0) {
        AbstractC3045vW.k(interfaceC2686rm0, "Argument must not be null");
        this.b = interfaceC2686rm0;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // o.InterfaceC2686rm0
    public final M70 b(C1566gA c1566gA, M70 m70, int i, int i2) {
        C0672Oz c0672Oz = (C0672Oz) m70.get();
        M70 r8 = new R8(((C0854Vz) c0672Oz.l.b).l, com.bumptech.glide.a.a(c1566gA).m);
        InterfaceC2686rm0 interfaceC2686rm0 = this.b;
        M70 m70B = interfaceC2686rm0.b(c1566gA, r8, i, i2);
        if (!r8.equals(m70B)) {
            r8.e();
        }
        ((C0854Vz) c0672Oz.l.b).c(interfaceC2686rm0, (Bitmap) m70B.get());
        return m70;
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (obj instanceof C0724Qz) {
            return this.b.equals(((C0724Qz) obj).b);
        }
        return false;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return this.b.hashCode();
    }
}
