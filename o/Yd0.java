package o;

/* JADX INFO: loaded from: classes.dex */
public final class Yd0 extends AbstractC1269d8 {
    public final C0643Nw A;
    public long B;
    public boolean C;
    public final int z;

    public Yd0(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, C0643Nw c0643Nw, int i, Object obj, long j, long j2, long j3, int i2, C0643Nw c0643Nw2) {
        super(interfaceC2583qj, c2970uj, c0643Nw, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.z = i2;
        this.A = c0643Nw2;
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        C3256xg0 c3256xg0 = this.t;
        C2720s4 c2720s4 = this.x;
        AbstractC0397Ej.g(c2720s4);
        for (C90 c90 : (C90[]) c2720s4.n) {
            if (c90.F != 0) {
                c90.F = 0L;
                c90.z = true;
            }
        }
        InterfaceC1324dm0 interfaceC1324dm0O0 = c2720s4.o0(this.z);
        interfaceC1324dm0O0.a(this.A);
        try {
            long jV = c3256xg0.v(this.m.c(this.B));
            if (jV != -1) {
                jV += this.B;
            }
            C0554Kk c0554Kk = new C0554Kk(this.t, this.B, jV);
            for (int iB = 0; iB != -1; iB = interfaceC1324dm0O0.b(c0554Kk, Integer.MAX_VALUE, true)) {
                this.B += (long) iB;
            }
            interfaceC1324dm0O0.d(this.r, 1, (int) this.B, 0, null);
            AbstractC2506pt.k(c3256xg0);
            this.C = true;
        } catch (Throwable th) {
            AbstractC2506pt.k(c3256xg0);
            throw th;
        }
    }

    @Override // o.AbstractC2843tO
    public final boolean c() {
        return this.C;
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
    }
}
