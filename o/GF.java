package o;

/* JADX INFO: loaded from: classes.dex */
public final class GF extends AbstractC2764sd {
    public final W9 u;
    public C2720s4 v;
    public long w;
    public volatile boolean x;

    public GF(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, C0643Nw c0643Nw, int i, Object obj, W9 w9) {
        super(interfaceC2583qj, c2970uj, 2, c0643Nw, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u = w9;
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        if (this.w == 0) {
            this.u.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C2970uj c2970ujC = this.m.c(this.w);
            C3256xg0 c3256xg0 = this.t;
            C0554Kk c0554Kk = new C0554Kk(c3256xg0, c2970ujC.f, c3256xg0.v(c2970ujC));
            while (!this.x) {
                try {
                    W9 w9 = this.u;
                    int iH = w9.l.h(c0554Kk, W9.u);
                    boolean z = true;
                    if (iH == 1) {
                        z = false;
                    }
                    AbstractC0397Ej.f(z);
                    if (iH != 0) {
                        break;
                    }
                } catch (Throwable th) {
                    this.w = c0554Kk.f369o - this.m.f;
                    throw th;
                }
            }
            this.w = c0554Kk.f369o - this.m.f;
            AbstractC2506pt.k(this.t);
        } catch (Throwable th2) {
            AbstractC2506pt.k(this.t);
            throw th2;
        }
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
        this.x = true;
    }
}
