package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015ae0 implements InterfaceC1479fL {
    public final C2970uj l;
    public final C3256xg0 m;
    public byte[] n;

    public C1015ae0(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj) {
        C0991aL.a.getAndIncrement();
        this.l = c2970uj;
        this.m = new C3256xg0(interfaceC2583qj);
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        C3256xg0 c3256xg0 = this.m;
        c3256xg0.m = 0L;
        try {
            c3256xg0.v(this.l);
            int iD = 0;
            while (iD != -1) {
                int i = (int) c3256xg0.m;
                byte[] bArr = this.n;
                if (bArr == null) {
                    this.n = new byte[1024];
                } else if (i == bArr.length) {
                    this.n = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.n;
                iD = c3256xg0.D(bArr2, i, bArr2.length - i);
            }
        } finally {
            AbstractC2506pt.k(c3256xg0);
        }
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
    }
}
