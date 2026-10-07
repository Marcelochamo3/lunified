package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MB extends AbstractC2764sd {
    public byte[] u;
    public volatile boolean v;
    public byte[] w;

    @Override // o.InterfaceC1479fL
    public final void b() {
        try {
            this.t.v(this.m);
            int iD = 0;
            int i = 0;
            while (iD != -1 && !this.v) {
                byte[] bArr = this.u;
                if (bArr.length < i + 16384) {
                    this.u = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iD = this.t.D(this.u, i, 16384);
                if (iD != -1) {
                    i += iD;
                }
            }
            if (!this.v) {
                this.w = Arrays.copyOf(this.u, i);
            }
        } finally {
            AbstractC2506pt.k(this.t);
        }
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
        this.v = true;
    }
}
