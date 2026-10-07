package j$.time.temporal;

import j$.time.C0111b;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import o.C1707hi0;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private r(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    private String c(long j, p pVar) {
        if (pVar == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + pVar + " (valid values " + this + "): " + j;
    }

    public static r j(long j, long j2) {
        if (j <= j2) {
            return new r(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static r k(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j3) {
            return new r(j, 1L, j2, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j, p pVar) {
        if (h() && i(j)) {
            return (int) j;
        }
        throw new C0111b(c(j, pVar));
    }

    public final void b(long j, p pVar) {
        if (!i(j)) {
            throw new C0111b(c(j, pVar));
        }
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.b == rVar.b && this.c == rVar.c && this.d == rVar.d;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.a == this.b && this.c == this.d;
    }

    public final boolean h() {
        return this.a >= -2147483648L && this.d <= C1707hi0.a;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final boolean i(long j) {
        return j >= this.a && j <= this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
