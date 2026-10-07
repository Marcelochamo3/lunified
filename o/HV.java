package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class HV {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final C2562qX g = new C2562qX(255);

    public final boolean a(C0554Kk c0554Kk, boolean z) throws C2949uX, EOFException {
        boolean zX;
        boolean zX2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        C2562qX c2562qX = this.g;
        c2562qX.C(27);
        try {
            zX = c0554Kk.x(c2562qX.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zX = false;
        }
        if (!zX || c2562qX.v() != 1332176723) {
            return false;
        }
        if (c2562qX.u() != 0) {
            if (z) {
                return false;
            }
            throw C2949uX.c("unsupported bit stream revision");
        }
        this.a = c2562qX.u();
        this.b = c2562qX.j();
        c2562qX.l();
        c2562qX.l();
        c2562qX.l();
        int iU = c2562qX.u();
        this.c = iU;
        this.d = iU + 27;
        c2562qX.C(iU);
        try {
            zX2 = c0554Kk.x(c2562qX.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zX2 = false;
        }
        if (!zX2) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int iU2 = c2562qX.u();
            this.f[i] = iU2;
            this.e += iU2;
        }
        return true;
    }

    public final boolean b(C0554Kk c0554Kk, long j) {
        boolean zX;
        AbstractC0397Ej.c(c0554Kk.f369o == c0554Kk.A());
        C2562qX c2562qX = this.g;
        c2562qX.C(4);
        while (true) {
            if (j != -1 && c0554Kk.f369o + 4 >= j) {
                break;
            }
            try {
                zX = c0554Kk.x(c2562qX.a, 0, 4, true);
            } catch (EOFException unused) {
                zX = false;
            }
            if (!zX) {
                break;
            }
            c2562qX.F(0);
            if (c2562qX.v() == 1332176723) {
                c0554Kk.q = 0;
                return true;
            }
            c0554Kk.q(1);
        }
        do {
            if (j != -1 && c0554Kk.f369o >= j) {
                break;
            }
        } while (c0554Kk.g(1) != -1);
        return false;
    }
}
