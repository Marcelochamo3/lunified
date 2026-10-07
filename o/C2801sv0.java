package o;

import android.util.Pair;

/* JADX INFO: renamed from: o.sv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2801sv0 implements InterfaceC0302As {
    public InterfaceC0354Cs a;
    public InterfaceC1324dm0 b;
    public int c;
    public long d;
    public InterfaceC2608qv0 e;
    public int f;
    public long g;

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        InterfaceC2608qv0 interfaceC2608qv0 = this.e;
        if (interfaceC2608qv0 != null) {
            interfaceC2608qv0.c(j2);
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        return AbstractC1468fA.b((C0554Kk) interfaceC0328Bs);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.a = interfaceC0354Cs;
        this.b = interfaceC0354Cs.s(0, 1);
        interfaceC0354Cs.f();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        byte[] bArr;
        int iX;
        AbstractC0397Ej.g(this.b);
        int i = Lr0.a;
        int i2 = this.c;
        if (i2 == 0) {
            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
            AbstractC0397Ej.f(c0554Kk.f369o == 0);
            int i3 = this.f;
            if (i3 != -1) {
                c0554Kk.q(i3);
                this.c = 4;
            } else {
                if (!AbstractC1468fA.b(c0554Kk)) {
                    throw C2949uX.a("Unsupported or unrecognized wav file type.", null);
                }
                c0554Kk.q((int) (c0554Kk.A() - c0554Kk.f369o));
                this.c = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            C2562qX c2562qX = new C2562qX(8);
            C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
            ZK zkB = ZK.b(c0554Kk2, c2562qX);
            if (zkB.a != 1685272116) {
                c0554Kk2.q = 0;
            } else {
                c0554Kk2.b(8, false);
                c2562qX.F(0);
                c0554Kk2.x(c2562qX.a, 0, 8, false);
                j = c2562qX.j();
                c0554Kk2.q(((int) zkB.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC0397Ej.f(this.g != -1);
                C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
                long j2 = this.g - c0554Kk3.f369o;
                InterfaceC2608qv0 interfaceC2608qv0 = this.e;
                interfaceC2608qv0.getClass();
                return interfaceC2608qv0.b(c0554Kk3, j2) ? -1 : 0;
            }
            C0554Kk c0554Kk4 = (C0554Kk) interfaceC0328Bs;
            c0554Kk4.q = 0;
            ZK zkC = AbstractC1468fA.C(1684108385, c0554Kk4, new C2562qX(8));
            c0554Kk4.q(8);
            Pair pairCreate = Pair.create(Long.valueOf(c0554Kk4.f369o), Long.valueOf(zkC.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && jLongValue == 4294967295L) {
                jLongValue = j3;
            }
            long j4 = ((long) this.f) + jLongValue;
            this.g = j4;
            long j5 = c0554Kk4.n;
            if (j5 != -1 && j4 > j5) {
                AP.z();
                this.g = j5;
            }
            InterfaceC2608qv0 interfaceC2608qv1 = this.e;
            interfaceC2608qv1.getClass();
            interfaceC2608qv1.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        C2562qX c2562qX2 = new C2562qX(16);
        C0554Kk c0554Kk5 = (C0554Kk) interfaceC0328Bs;
        long j6 = AbstractC1468fA.C(1718449184, c0554Kk5, c2562qX2).b;
        AbstractC0397Ej.f(j6 >= 16);
        c0554Kk5.x(c2562qX2.a, 0, 16, false);
        c2562qX2.F(0);
        int iN = c2562qX2.n();
        int iN2 = c2562qX2.n();
        int iM = c2562qX2.m();
        c2562qX2.m();
        int iN3 = c2562qX2.n();
        int iN4 = c2562qX2.n();
        int i4 = ((int) j6) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            c0554Kk5.x(bArr, 0, i4, false);
        } else {
            bArr = Lr0.e;
        }
        c0554Kk5.q((int) (c0554Kk5.A() - c0554Kk5.f369o));
        A6 a6 = new A6();
        a6.l = iN2;
        a6.m = iM;
        a6.n = iN3;
        a6.f163o = iN4;
        a6.p = bArr;
        if (iN == 17) {
            this.e = new C2511pv0(this.a, this.b, a6);
        } else if (iN == 6) {
            this.e = new C2704rv0(this.a, this.b, a6, "audio/g711-alaw", -1);
        } else if (iN == 7) {
            this.e = new C2704rv0(this.a, this.b, a6, "audio/g711-mlaw", -1);
        } else {
            if (iN == 1) {
                iX = Lr0.x(iN4);
            } else if (iN == 3) {
                iX = iN4 != 32 ? 0 : 4;
            } else if (iN != 65534) {
                iX = 0;
            } else {
                iX = Lr0.x(iN4);
            }
            if (iX == 0) {
                throw C2949uX.c("Unsupported WAV format type: " + iN);
            }
            this.e = new C2704rv0(this.a, this.b, a6, "audio/raw", iX);
        }
        this.c = 3;
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
