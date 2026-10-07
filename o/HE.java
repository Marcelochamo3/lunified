package o;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HE implements InterfaceC2583qj {
    public final InterfaceC2583qj l;
    public final int m;
    public final B30 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f296o;
    public int p;

    public HE(C3256xg0 c3256xg0, int i, B30 b30) {
        AbstractC0397Ej.c(i > 0);
        this.l = c3256xg0;
        this.m = i;
        this.n = b30;
        this.f296o = new byte[1];
        this.p = i;
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) {
        int i3 = this.p;
        InterfaceC2583qj interfaceC2583qj = this.l;
        if (i3 == 0) {
            byte[] bArr2 = this.f296o;
            int i4 = 0;
            if (interfaceC2583qj.D(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iD = interfaceC2583qj.D(bArr3, i4, i6);
                        if (iD != -1) {
                            i4 += iD;
                            i6 -= iD;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C2562qX c2562qX = new C2562qX(i5, bArr3);
                        B30 b30 = this.n;
                        long jMax = !b30.w ? b30.t : Math.max(b30.x.j(true), b30.t);
                        int iA = c2562qX.a();
                        C90 c90 = b30.v;
                        c90.getClass();
                        c90.e(iA, c2562qX);
                        c90.d(jMax, 1, iA, 0, null);
                        b30.w = true;
                    }
                }
                this.p = this.m;
            }
            return -1;
        }
        int iD2 = interfaceC2583qj.D(bArr, i, Math.min(this.p, i2));
        if (iD2 != -1) {
            this.p -= iD2;
        }
        return iD2;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        interfaceC2590qm0.getClass();
        this.l.k(interfaceC2590qm0);
    }

    @Override // o.InterfaceC2583qj
    public final Map l() {
        return this.l.l();
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.l.w();
    }
}
