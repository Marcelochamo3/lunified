package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1414ej implements InterfaceC2450pI {
    public final InterfaceC2450pI b;
    public final InterfaceC2450pI c;

    public C1414ej(InterfaceC2450pI interfaceC2450pI, InterfaceC2450pI interfaceC2450pI2) {
        this.b = interfaceC2450pI;
        this.c = interfaceC2450pI2;
    }

    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1414ej)) {
            return false;
        }
        C1414ej c1414ej = (C1414ej) obj;
        return this.b.equals(c1414ej.b) && this.c.equals(c1414ej.c);
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
