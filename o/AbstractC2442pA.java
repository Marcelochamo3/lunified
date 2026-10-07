package o;

/* JADX INFO: renamed from: o.pA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2442pA {
    public C0334By b;
    public boolean c;
    public int d;
    public int e;
    public FV[] h;
    public final Object[] a = new Object[1];
    public int f = -1;
    public int g = -1;
    public int i = -1;

    public final boolean a() {
        return b(this.c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public abstract boolean b(int i, boolean z);

    public final boolean c(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (i(true, null) > i + this.d) {
                return false;
            }
        } else if (g(false, null) < i - this.d) {
            return false;
        }
        return true;
    }

    public final boolean d(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (g(false, null) < i - this.d) {
                return false;
            }
        } else if (i(true, null) > i + this.d) {
            return false;
        }
        return true;
    }

    public abstract int f(boolean z, int i, int[] iArr);

    public final int g(boolean z, int[] iArr) {
        return f(z, this.c ? this.f : this.g, iArr);
    }

    public abstract int h(boolean z, int i, int[] iArr);

    public final int i(boolean z, int[] iArr) {
        return h(z, this.c ? this.g : this.f, iArr);
    }

    public abstract FV[] j(int i, int i2);

    public abstract C2102ll k(int i);

    public void l(int i) {
        int i2;
        if (i >= 0 && (i2 = this.g) >= 0) {
            if (i2 >= i) {
                this.g = i - 1;
            }
            if (this.g < this.f) {
                this.g = -1;
                this.f = -1;
            }
            if (this.f < 0) {
                this.i = i;
            }
        }
    }

    public abstract boolean m(int i, boolean z);

    public final void n(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.h = new FV[i];
        for (int i2 = 0; i2 < this.e; i2++) {
            FV[] fvArr = this.h;
            FV fv = new FV();
            int iHighestOneBit = 8;
            if (Integer.bitCount(8) != 1) {
                iHighestOneBit = Integer.highestOneBit(7) << 1;
            }
            fv.m = iHighestOneBit - 1;
            fv.n = new int[iHighestOneBit];
            fvArr[i2] = fv;
        }
    }

    public void e(int i, int i2, C0702Qd c0702Qd) {
    }
}
