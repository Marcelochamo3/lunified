package o;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: o.wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3178wq implements InterfaceC2450pI {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final InterfaceC2450pI g;
    public final Map h;
    public final FW i;
    public int j;

    public C3178wq(Object obj, InterfaceC2450pI interfaceC2450pI, int i, int i2, C0492Ia c0492Ia, Class cls, Class cls2, FW fw) {
        AbstractC3045vW.k(obj, "Argument must not be null");
        this.b = obj;
        AbstractC3045vW.k(interfaceC2450pI, "Signature must not be null");
        this.g = interfaceC2450pI;
        this.c = i;
        this.d = i2;
        AbstractC3045vW.k(c0492Ia, "Argument must not be null");
        this.h = c0492Ia;
        AbstractC3045vW.k(cls, "Resource class must not be null");
        this.e = cls;
        AbstractC3045vW.k(cls2, "Transcode class must not be null");
        this.f = cls2;
        AbstractC3045vW.k(fw, "Argument must not be null");
        this.i = fw;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3178wq)) {
            return false;
        }
        C3178wq c3178wq = (C3178wq) obj;
        return this.b.equals(c3178wq.b) && this.g.equals(c3178wq.g) && this.d == c3178wq.d && this.c == c3178wq.c && this.h.equals(c3178wq.h) && this.e.equals(c3178wq.e) && this.f.equals(c3178wq.f) && this.i.equals(c3178wq.i);
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
