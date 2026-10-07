package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class AV implements InterfaceC2450pI {
    public final Object b;

    public AV(Object obj) {
        AbstractC3045vW.k(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC2450pI.a));
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (obj instanceof AV) {
            return this.b.equals(((AV) obj).b);
        }
        return false;
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
