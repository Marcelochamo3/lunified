package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fj0 implements T9 {
    public static final Cj0 l = new Cj0();

    static {
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, Dj0 dj0, Ej0 ej0, int i2, boolean z) {
        int i3 = g(i, dj0, false).n;
        if (n(i3, ej0, 0L).A != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, ej0, 0L).z;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fj0)) {
            return false;
        }
        Fj0 fj0 = (Fj0) obj;
        if (fj0.p() != p() || fj0.i() != i()) {
            return false;
        }
        Ej0 ej0 = new Ej0();
        Dj0 dj0 = new Dj0();
        Ej0 ej1 = new Ej0();
        Dj0 dj1 = new Dj0();
        for (int i = 0; i < p(); i++) {
            if (!n(i, ej0, 0L).equals(fj0.n(i, ej1, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, dj0, true).equals(fj0.g(i2, dj1, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != fj0.a(true) || (iC = c(true)) != fj0.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != fj0.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final Dj0 f(int i, Dj0 dj0) {
        return g(i, dj0, false);
    }

    public abstract Dj0 g(int i, Dj0 dj0, boolean z);

    public Dj0 h(Object obj, Dj0 dj0) {
        return g(b(obj), dj0, true);
    }

    public final int hashCode() {
        Ej0 ej0 = new Ej0();
        Dj0 dj0 = new Dj0();
        int iP = p() + 217;
        for (int i = 0; i < p(); i++) {
            iP = (iP * 31) + n(i, ej0, 0L).hashCode();
        }
        int i2 = i() + (iP * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, dj0, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i2 = (i2 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(Ej0 ej0, Dj0 dj0, int i, long j) {
        Pair pairK = k(ej0, dj0, i, j, 0L);
        pairK.getClass();
        return pairK;
    }

    public final Pair k(Ej0 ej0, Dj0 dj0, int i, long j, long j2) {
        AbstractC0397Ej.d(i, p());
        n(i, ej0, j2);
        if (j == -9223372036854775807L) {
            j = ej0.x;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = ej0.z;
        g(i2, dj0, false);
        while (i2 < ej0.A && dj0.p != j) {
            int i3 = i2 + 1;
            if (g(i3, dj0, false).p > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, dj0, true);
        long jMin = j - dj0.p;
        long j3 = dj0.f219o;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = dj0.m;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i);

    public abstract Ej0 n(int i, Ej0 ej0, long j);

    public final void o(int i, Ej0 ej0) {
        n(i, ej0, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
