package o;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: o.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3104w2 implements InterfaceC0302As {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public InterfaceC0354Cs l;
    public InterfaceC1324dm0 m;
    public InterfaceC2664rb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1087o;
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i = Lr0.a;
        Charset charset = AbstractC1402ed.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public final int b(C0554Kk c0554Kk) throws C2949uX {
        boolean z;
        c0554Kk.q = 0;
        byte[] bArr = this.a;
        c0554Kk.x(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C2949uX.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? q[i] : p[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C2949uX.a(sb.toString(), null);
    }

    public final boolean c(C0554Kk c0554Kk) {
        c0554Kk.q = 0;
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        c0554Kk.x(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            c0554Kk.q(bArr.length);
            return true;
        }
        c0554Kk.q = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        c0554Kk.x(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        c0554Kk.q(bArr3.length);
        return true;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            InterfaceC2664rb0 interfaceC2664rb0 = this.n;
            if (interfaceC2664rb0 instanceof C0316Bg) {
                C0316Bg c0316Bg = (C0316Bg) interfaceC2664rb0;
                this.k = (Math.max(0L, j - c0316Bg.b) * 8000000) / ((long) c0316Bg.e);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        return c((C0554Kk) interfaceC0328Bs);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.l = interfaceC0354Cs;
        this.m = interfaceC0354Cs.s(0, 1);
        interfaceC0354Cs.f();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        int i;
        int i2;
        int iB;
        int i3;
        AbstractC0397Ej.g(this.m);
        int i4 = Lr0.a;
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        if (c0554Kk.f369o == 0 && !c(c0554Kk)) {
            throw C2949uX.a("Could not find AMR header.", null);
        }
        if (!this.f1087o) {
            this.f1087o = true;
            boolean z = this.c;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i5 = z ? 16000 : 8000;
            InterfaceC1324dm0 interfaceC1324dm0 = this.m;
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = str;
            c0617Mw.l = t;
            c0617Mw.x = 1;
            c0617Mw.y = i5;
            interfaceC1324dm0.a(new C0643Nw(c0617Mw));
        }
        if (this.f == 0) {
            try {
                int iB2 = b((C0554Kk) interfaceC0328Bs);
                this.e = iB2;
                this.f = iB2;
                if (this.i == -1) {
                    this.h = c0554Kk.f369o;
                    this.i = iB2;
                }
                if (this.i == iB2) {
                    this.j++;
                }
                iB = this.m.b(interfaceC0328Bs, this.f, true);
                if (iB == -1) {
                    i = -1;
                } else {
                    i3 = this.f - iB;
                    this.f = i3;
                    if (i3 <= 0) {
                        this.m.d(this.k + this.d, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iB = this.m.b(interfaceC0328Bs, this.f, true);
            if (iB == -1) {
                i = -1;
            } else {
                i3 = this.f - iB;
                this.f = i3;
                if (i3 <= 0) {
                    this.m.d(this.k + this.d, 1, this.e, 0, null);
                    this.d += 20000;
                }
                i = 0;
            }
        }
        if (!this.g) {
            int i6 = this.b;
            if ((i6 & 1) != 0) {
                long j = c0554Kk.n;
                if (j == -1 || !((i2 = this.i) == -1 || i2 == this.e)) {
                    C3114w7 c3114w7 = new C3114w7(-9223372036854775807L);
                    this.n = c3114w7;
                    this.l.i(c3114w7);
                    this.g = true;
                } else if (this.j >= 20 || i == -1) {
                    C0316Bg c0316Bg = new C0316Bg(j, this.h, (int) ((((long) i2) * 8000000) / 20000), i2, (i6 & 2) != 0);
                    this.n = c0316Bg;
                    this.l.i(c0316Bg);
                    this.g = true;
                }
            } else {
                C3114w7 c3114w8 = new C3114w7(-9223372036854775807L);
                this.n = c3114w8;
                this.l.i(c3114w8);
                this.g = true;
            }
        }
        return i;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
