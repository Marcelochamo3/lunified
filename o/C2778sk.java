package o;

/* JADX INFO: renamed from: o.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2778sk {
    public final W9 a;
    public final AbstractC1853j70 b;
    public final C2922u8 c;
    public final InterfaceC1219cj d;
    public final long e;
    public final long f;

    public C2778sk(long j, AbstractC1853j70 abstractC1853j70, C2922u8 c2922u8, W9 w9, long j2, InterfaceC1219cj interfaceC1219cj) {
        this.e = j;
        this.b = abstractC1853j70;
        this.c = c2922u8;
        this.f = j2;
        this.a = w9;
        this.d = interfaceC1219cj;
    }

    public final C2778sk a(long j, AbstractC1853j70 abstractC1853j70) throws B8 {
        long jC;
        InterfaceC1219cj interfaceC1219cjD = this.b.d();
        InterfaceC1219cj interfaceC1219cjD2 = abstractC1853j70.d();
        if (interfaceC1219cjD == null) {
            return new C2778sk(j, abstractC1853j70, this.c, this.a, this.f, interfaceC1219cjD);
        }
        if (!interfaceC1219cjD.r()) {
            return new C2778sk(j, abstractC1853j70, this.c, this.a, this.f, interfaceC1219cjD2);
        }
        long jY = interfaceC1219cjD.y(j);
        if (jY == 0) {
            return new C2778sk(j, abstractC1853j70, this.c, this.a, this.f, interfaceC1219cjD2);
        }
        long jU = interfaceC1219cjD.u();
        long jB = interfaceC1219cjD.b(jU);
        long j2 = jY + jU;
        long j3 = j2 - 1;
        long jG = interfaceC1219cjD.g(j3, j) + interfaceC1219cjD.b(j3);
        long jU2 = interfaceC1219cjD2.u();
        long jB2 = interfaceC1219cjD2.b(jU2);
        long j4 = this.f;
        if (jG == jB2) {
            jC = (j2 - jU2) + j4;
        } else {
            if (jG < jB2) {
                throw new B8();
            }
            jC = jB2 < jB ? j4 - (interfaceC1219cjD2.c(jB, j) - jU) : (interfaceC1219cjD.c(jB2, j) - jU2) + j4;
        }
        return new C2778sk(j, abstractC1853j70, this.c, this.a, jC, interfaceC1219cjD2);
    }

    public final long b(long j) {
        InterfaceC1219cj interfaceC1219cj = this.d;
        long j2 = this.e;
        return (interfaceC1219cj.z(j2, j) + (interfaceC1219cj.j(j2, j) + this.f)) - 1;
    }

    public final long c(long j) {
        return this.d.g(j - this.f, this.e) + d(j);
    }

    public final long d(long j) {
        return this.d.b(j - this.f);
    }
}
