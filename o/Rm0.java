package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rm0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(InterfaceC1324dm0 interfaceC1324dm0, C1226cm0 c1226cm0) {
        if (this.c > 0) {
            interfaceC1324dm0.d(this.d, this.e, this.f, this.g, c1226cm0);
            this.c = 0;
        }
    }

    public final void b(InterfaceC1324dm0 interfaceC1324dm0, long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(interfaceC1324dm0, c1226cm0);
            }
        }
    }

    public final void c(InterfaceC0328Bs interfaceC0328Bs) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        interfaceC0328Bs.B(bArr, 0, 10);
        interfaceC0328Bs.o();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
