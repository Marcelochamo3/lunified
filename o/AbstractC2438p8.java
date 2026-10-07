package o;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2438p8 implements InterfaceC1920js {
    public final Zl0 a;
    public final int b;
    public final int[] c;
    public final C0643Nw[] d;
    public final long[] e;
    public int f;

    public AbstractC2438p8(Zl0 zl0, int[] iArr) {
        int i = 0;
        AbstractC0397Ej.f(iArr.length > 0);
        zl0.getClass();
        this.a = zl0;
        int length = iArr.length;
        this.b = length;
        this.d = new C0643Nw[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = zl0.f665o[iArr[i2]];
        }
        Arrays.sort(this.d, new C2147m8(1));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = zl0.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // o.InterfaceC1920js
    public final int a(C0643Nw c0643Nw) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == c0643Nw) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC1920js
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // o.InterfaceC1920js
    public final boolean c(int i, long j) {
        return this.e[i] > j;
    }

    @Override // o.InterfaceC1920js
    public final C0643Nw d(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC2438p8 abstractC2438p8 = (AbstractC2438p8) obj;
        return this.a == abstractC2438p8.a && Arrays.equals(this.c, abstractC2438p8.c);
    }

    @Override // o.InterfaceC1920js
    public final int f(int i) {
        return this.c[i];
    }

    @Override // o.InterfaceC1920js
    public int g(long j, List list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // o.InterfaceC1920js
    public final int i() {
        return this.c[n()];
    }

    @Override // o.InterfaceC1920js
    public final Zl0 j() {
        return this.a;
    }

    @Override // o.InterfaceC1920js
    public final C0643Nw k() {
        return this.d[n()];
    }

    @Override // o.InterfaceC1920js
    public final /* synthetic */ boolean l(long j, AbstractC2764sd abstractC2764sd, List list) {
        return false;
    }

    @Override // o.InterfaceC1920js
    public final int length() {
        return this.c.length;
    }

    @Override // o.InterfaceC1920js
    public final boolean o(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = c(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zC) {
            zC = (i2 == i || c(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zC) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = Lr0.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // o.InterfaceC1920js
    public final /* synthetic */ void r() {
    }

    @Override // o.InterfaceC1920js
    public final /* synthetic */ void t() {
    }

    @Override // o.InterfaceC1920js
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC1920js
    public void e() {
    }

    @Override // o.InterfaceC1920js
    public void h() {
    }

    @Override // o.InterfaceC1920js
    public void p(float f) {
    }
}
