package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class FW implements InterfaceC2450pI {
    public final C0492Ia b = new C0492Ia(0);

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0492Ia c0492Ia = this.b;
            if (i >= c0492Ia.n) {
                return;
            }
            CW cw = (CW) c0492Ia.f(i);
            Object objJ = this.b.j(i);
            BW bw = cw.b;
            if (cw.d == null) {
                cw.d = cw.c.getBytes(InterfaceC2450pI.a);
            }
            bw.c(cw.d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(CW cw) {
        C0492Ia c0492Ia = this.b;
        return c0492Ia.containsKey(cw) ? c0492Ia.get(cw) : cw.a;
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (obj instanceof FW) {
            return this.b.equals(((FW) obj).b);
        }
        return false;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
