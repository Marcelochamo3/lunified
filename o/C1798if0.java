package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.if0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1798if0 implements Comparable {
    public boolean l;
    public float p;
    public int w;
    public int m = -1;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f833o = 0;
    public boolean q = false;
    public final float[] r = new float[9];
    public final float[] s = new float[9];
    public T5[] t = new T5[16];
    public int u = 0;
    public int v = 0;

    public C1798if0(int i) {
        this.w = i;
    }

    public final void a(T5 t5) {
        int i = 0;
        while (true) {
            int i2 = this.u;
            if (i >= i2) {
                T5[] t5Arr = this.t;
                if (i2 >= t5Arr.length) {
                    this.t = (T5[]) Arrays.copyOf(t5Arr, t5Arr.length * 2);
                }
                T5[] t5Arr2 = this.t;
                int i3 = this.u;
                t5Arr2[i3] = t5;
                this.u = i3 + 1;
                return;
            }
            if (this.t[i] == t5) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(T5 t5) {
        int i = this.u;
        int i2 = 0;
        while (i2 < i) {
            if (this.t[i2] == t5) {
                while (i2 < i - 1) {
                    T5[] t5Arr = this.t;
                    int i3 = i2 + 1;
                    t5Arr[i2] = t5Arr[i3];
                    i2 = i3;
                }
                this.u--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.w = 5;
        this.f833o = 0;
        this.m = -1;
        this.n = -1;
        this.p = 0.0f;
        this.q = false;
        int i = this.u;
        for (int i2 = 0; i2 < i; i2++) {
            this.t[i2] = null;
        }
        this.u = 0;
        this.v = 0;
        this.l = false;
        Arrays.fill(this.s, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.m - ((C1798if0) obj).m;
    }

    public final void d(C2742sK c2742sK, float f) {
        this.p = f;
        this.q = true;
        int i = this.u;
        this.n = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.t[i2].h(c2742sK, this, false);
        }
        this.u = 0;
    }

    public final void e(C2742sK c2742sK, T5 t5) {
        int i = this.u;
        for (int i2 = 0; i2 < i; i2++) {
            this.t[i2].i(c2742sK, t5, false);
        }
        this.u = 0;
    }

    public final String toString() {
        return "" + this.m;
    }
}
