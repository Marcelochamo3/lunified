package o;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: o.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2615r0 implements InterfaceC0302As {
    public final C2519q0 a = new C2519q0(null, 1);
    public final C2562qX b = new C2562qX(16384);
    public boolean c;

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk;
        int i;
        C2562qX c2562qX = new C2562qX(10);
        int i2 = 0;
        while (true) {
            c0554Kk = (C0554Kk) interfaceC0328Bs;
            c0554Kk.x(c2562qX.a, 0, 10, false);
            c2562qX.F(0);
            if (c2562qX.w() != 4801587) {
                break;
            }
            c2562qX.G(3);
            int iT = c2562qX.t();
            i2 += iT + 10;
            c0554Kk.b(iT, false);
        }
        c0554Kk.q = 0;
        c0554Kk.b(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c0554Kk.x(c2562qX.a, 0, 7, false);
                c2562qX.F(0);
                int iZ = c2562qX.z();
                if (iZ == 44096 || iZ == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArr = c2562qX.a;
                    if (bArr.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iZ == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    c0554Kk.b(i - 7, false);
                }
            }
            c0554Kk.q = 0;
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            c0554Kk.b(i3, false);
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
        int iD = ((C0554Kk) interfaceC0328Bs).D(c2562qX.a, 0, 16384);
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
