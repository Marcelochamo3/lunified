package o;

import java.io.EOFException;

/* JADX INFO: renamed from: o.Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0921Yo implements InterfaceC1324dm0 {
    public final byte[] a = new byte[C1672hI.a.f];

    @Override // o.InterfaceC1324dm0
    public final int b(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        return f(interfaceC2000kj, i, z);
    }

    @Override // o.InterfaceC1324dm0
    public final void c(int i, C2562qX c2562qX) {
        c2562qX.G(i);
    }

    @Override // o.InterfaceC1324dm0
    public final void e(int i, C2562qX c2562qX) {
        c2562qX.G(i);
    }

    public final int f(InterfaceC2000kj interfaceC2000kj, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int iD = interfaceC2000kj.D(bArr, 0, Math.min(bArr.length, i));
        if (iD != -1) {
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC1324dm0
    public final void a(C0643Nw c0643Nw) {
    }

    @Override // o.InterfaceC1324dm0
    public final void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
    }
}
