package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1090bM implements Iterable, InterfaceC1770iI {
    public final long l;
    public final long m;
    public final long n;

    public C1090bM(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.l = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.m = j2;
        this.n = j3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1090bM) {
            if (!isEmpty() || !((C1090bM) obj).isEmpty()) {
                C1090bM c1090bM = (C1090bM) obj;
                if (this.l != c1090bM.l || this.m != c1090bM.m || this.n != c1090bM.n) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.l;
        long j3 = this.m;
        long j4 = (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32))) * j;
        long j5 = this.n;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.n;
        long j2 = this.m;
        long j3 = this.l;
        if (j > 0) {
            if (j3 <= j2) {
                return false;
            }
        } else if (j3 >= j2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1187cM(this.l, this.m, this.n);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.m;
        long j2 = this.l;
        long j3 = this.n;
        if (j3 > 0) {
            sb = new StringBuilder();
            sb.append(j2);
            sb.append("..");
            sb.append(j);
            sb.append(" step ");
            sb.append(j3);
        } else {
            sb = new StringBuilder();
            sb.append(j2);
            sb.append(" downTo ");
            sb.append(j);
            sb.append(" step ");
            sb.append(-j3);
        }
        return sb.toString();
    }
}
