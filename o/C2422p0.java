package o;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: o.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2422p0 implements InterfaceC0302As {
    public final C2519q0 a = new C2519q0(null, 0);
    public final C2562qX b = new C2562qX(2786);
    public boolean c;

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk;
        int iN;
        C2562qX c2562qX = new C2562qX(10);
        int i = 0;
        while (true) {
            c0554Kk = (C0554Kk) interfaceC0328Bs;
            c0554Kk.x(c2562qX.a, 0, 10, false);
            c2562qX.F(0);
            if (c2562qX.w() != 4801587) {
                break;
            }
            c2562qX.G(3);
            int iT = c2562qX.t();
            i += iT + 10;
            c0554Kk.b(iT, false);
        }
        c0554Kk.q = 0;
        c0554Kk.b(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                c0554Kk.x(c2562qX.a, 0, 6, false);
                c2562qX.F(0);
                if (c2562qX.z() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = c2562qX.a;
                if (bArr.length < 6) {
                    iN = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iN = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iN = AbstractC0397Ej.n((b & 192) >> 6, b & 63);
                }
                if (iN == -1) {
                    return false;
                }
                c0554Kk.b(iN - 6, false);
            }
            c0554Kk.q = 0;
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            c0554Kk.b(i2, false);
        }
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.a.d(interfaceC0354Cs, new Ym0(0, 1));
        interfaceC0354Cs.f();
        interfaceC0354Cs.i(new C3114w7(-9223372036854775807L));
    }

    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws EOFException, InterruptedIOException {
        C2562qX c2562qX = this.b;
        int iD = ((C0554Kk) interfaceC0328Bs).D(c2562qX.a, 0, 2786);
        if (iD == -1) {
            return -1;
        }
        c2562qX.F(0);
        c2562qX.E(iD);
        boolean z = this.c;
        C2519q0 c2519q0 = this.a;
        if (!z) {
            c2519q0.c(4, 0L);
            this.c = true;
        }
        c2519q0.b(c2562qX);
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
