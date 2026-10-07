package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2897tv extends Fg0 {
    public C3091vv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3209x6 f1048o;

    @Override // o.Fg0
    public final long b(C2562qX c2562qX) {
        byte[] bArr = c2562qX.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c2562qX.G(4);
            c2562qX.A();
        }
        int iZ = AbstractC3045vW.z(i, c2562qX);
        c2562qX.F(0);
        return iZ;
    }

    @Override // o.Fg0
    public final boolean c(C2562qX c2562qX, long j, C2994uv c2994uv) {
        byte[] bArr = c2562qX.a;
        C3091vv c3091vv = this.n;
        if (c3091vv == null) {
            C3091vv c3091vv2 = new C3091vv(17, bArr);
            this.n = c3091vv2;
            c2994uv.m = c3091vv2.c(Arrays.copyOfRange(bArr, 9, c2562qX.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C3209x6 c3209x6 = this.f1048o;
            if (c3209x6 != null) {
                c3209x6.l = j;
                c2994uv.n = c3209x6;
            }
            ((C0643Nw) c2994uv.m).getClass();
            return false;
        }
        C2994uv c2994uvI = AbstractC1459f50.I(c2562qX);
        C3091vv c3091vv3 = new C3091vv(c3091vv.a, c3091vv.b, c3091vv.c, c3091vv.d, c3091vv.e, c3091vv.g, c3091vv.h, c3091vv.j, c2994uvI, c3091vv.l);
        this.n = c3091vv3;
        C3209x6 c3209x7 = new C3209x6();
        c3209x7.n = c3091vv3;
        c3209x7.f1112o = c2994uvI;
        c3209x7.l = -1L;
        c3209x7.m = -1L;
        this.f1048o = c3209x7;
        return true;
    }

    @Override // o.Fg0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.f1048o = null;
        }
    }
}
