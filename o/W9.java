package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class W9 implements InterfaceC0354Cs {
    public static final C2800sv u = new C2800sv();
    public final InterfaceC0302As l;
    public final int m;
    public final C0643Nw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f588o = new SparseArray();
    public boolean p;
    public C2720s4 q;
    public long r;
    public InterfaceC2664rb0 s;
    public C0643Nw[] t;

    public W9(InterfaceC0302As interfaceC0302As, int i, C0643Nw c0643Nw) {
        this.l = interfaceC0302As;
        this.m = i;
        this.n = c0643Nw;
    }

    public final void a(C2720s4 c2720s4, long j, long j2) {
        this.q = c2720s4;
        this.r = j2;
        boolean z = this.p;
        InterfaceC0302As interfaceC0302As = this.l;
        if (!z) {
            interfaceC0302As.f(this);
            if (j != -9223372036854775807L) {
                interfaceC0302As.d(0L, j);
            }
            this.p = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC0302As.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f588o;
            if (i >= sparseArray.size()) {
                return;
            }
            V9 v9 = (V9) sparseArray.valueAt(i);
            if (c2720s4 == null) {
                v9.e = v9.c;
            } else {
                v9.f = j2;
                InterfaceC1324dm0 interfaceC1324dm0O0 = c2720s4.o0(v9.a);
                v9.e = interfaceC1324dm0O0;
                C0643Nw c0643Nw = v9.d;
                if (c0643Nw != null) {
                    interfaceC1324dm0O0.a(c0643Nw);
                }
            }
            i++;
        }
    }

    @Override // o.InterfaceC0354Cs
    public final void f() {
        SparseArray sparseArray = this.f588o;
        C0643Nw[] c0643NwArr = new C0643Nw[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C0643Nw c0643Nw = ((V9) sparseArray.valueAt(i)).d;
            AbstractC0397Ej.g(c0643Nw);
            c0643NwArr[i] = c0643Nw;
        }
        this.t = c0643NwArr;
    }

    @Override // o.InterfaceC0354Cs
    public final void i(InterfaceC2664rb0 interfaceC2664rb0) {
        this.s = interfaceC2664rb0;
    }

    @Override // o.InterfaceC0354Cs
    public final InterfaceC1324dm0 s(int i, int i2) {
        SparseArray sparseArray = this.f588o;
        V9 v9 = (V9) sparseArray.get(i);
        if (v9 == null) {
            AbstractC0397Ej.f(this.t == null);
            v9 = new V9(i, i2, i2 == this.m ? this.n : null);
            C2720s4 c2720s4 = this.q;
            long j = this.r;
            if (c2720s4 == null) {
                v9.e = v9.c;
            } else {
                v9.f = j;
                InterfaceC1324dm0 interfaceC1324dm0O0 = c2720s4.o0(i2);
                v9.e = interfaceC1324dm0O0;
                C0643Nw c0643Nw = v9.d;
                if (c0643Nw != null) {
                    interfaceC1324dm0O0.a(c0643Nw);
                }
            }
            sparseArray.put(i, v9);
        }
        return v9;
    }
}
