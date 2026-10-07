package o;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2593qo implements InterfaceC2686rm0 {
    public final InterfaceC2686rm0 b;
    public final boolean c;

    public C2593qo(InterfaceC2686rm0 interfaceC2686rm0, boolean z) {
        this.b = interfaceC2686rm0;
        this.c = z;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // o.InterfaceC2686rm0
    public final M70 b(C1566gA c1566gA, M70 m70, int i, int i2) {
        Q8 q8 = com.bumptech.glide.a.a(c1566gA).m;
        Drawable drawable = (Drawable) m70.get();
        R8 r8L = zy0.l(q8, drawable, i, i2);
        if (r8L != null) {
            M70 m70B = this.b.b(c1566gA, r8L, i, i2);
            if (!m70B.equals(r8L)) {
                return new R8(c1566gA.getResources(), m70B);
            }
            m70B.e();
            return m70;
        }
        if (!this.c) {
            return m70;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (obj instanceof C2593qo) {
            return this.b.equals(((C2593qo) obj).b);
        }
        return false;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return this.b.hashCode();
    }
}
