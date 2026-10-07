package o;

/* JADX INFO: renamed from: o.Wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0861Wg extends AbstractC1269d8 {
    public final long A;
    public final W9 B;
    public long C;
    public volatile boolean D;
    public boolean E;
    public final int z;

    public C0861Wg(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, C0643Nw c0643Nw, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, W9 w9) {
        super(interfaceC2583qj, c2970uj, c0643Nw, i, obj, j, j2, j3, j4, j5);
        this.z = i2;
        this.A = j6;
        this.B = w9;
    }

    @Override // o.AbstractC2843tO
    public final long a() {
        return this.u + ((long) this.z);
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        if (this.C == 0) {
            C2720s4 c2720s4 = this.x;
            AbstractC0397Ej.g(c2720s4);
            long j = this.A;
            for (C90 c90 : (C90[]) c2720s4.n) {
                if (c90.F != j) {
                    c90.F = j;
                    c90.z = true;
                }
            }
            W9 w9 = this.B;
            long j2 = this.v;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.A;
            long j4 = this.w;
            w9.a(c2720s4, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.A);
        }
        try {
            C2970uj c2970ujC = this.m.c(this.C);
            C3256xg0 c3256xg0 = this.t;
            C0554Kk c0554Kk = new C0554Kk(c3256xg0, c2970ujC.f, c3256xg0.v(c2970ujC));
            while (!this.D) {
                try {
                    int iH = this.B.l.h(c0554Kk, W9.u);
                    AbstractC0397Ej.f(iH != 1);
                    if (iH != 0) {
                        break;
                    }
                } catch (Throwable th) {
                    this.C = c0554Kk.f369o - this.m.f;
                    throw th;
                }
            }
            this.C = c0554Kk.f369o - this.m.f;
            AbstractC2506pt.k(this.t);
            this.E = !this.D;
        } catch (Throwable th2) {
            AbstractC2506pt.k(this.t);
            throw th2;
        }
    }

    @Override // o.AbstractC2843tO
    public final boolean c() {
        return this.E;
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
        this.D = true;
    }
}
