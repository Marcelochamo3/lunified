package o;

import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: renamed from: o.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2782sm {
    public final PrivateKey a;
    public final PublicKey b;

    public C2782sm(PrivateKey privateKey, PublicKey publicKey) {
        this.a = privateKey;
        this.b = publicKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2782sm)) {
            return false;
        }
        C2782sm c2782sm = (C2782sm) obj;
        return AbstractC1474fG.b(this.a, c2782sm.a) && AbstractC1474fG.b(this.b, c2782sm.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SigningIdentity(privateKey=" + this.a + ", publicKey=" + this.b + ")";
    }
}
