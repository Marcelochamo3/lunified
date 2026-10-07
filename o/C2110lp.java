package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2110lp implements InterfaceC3273xp {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public C2110lp(List list) {
        this.a = 0;
        this.f = list;
        this.g = new InterfaceC1324dm0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // o.InterfaceC3273xp
    public final void a() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void b(C2562qX c2562qX) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (c2562qX.a() == 0) {
                            z2 = false;
                        } else {
                            if (c2562qX.u() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (c2562qX.a() == 0) {
                            z = false;
                        } else {
                            if (c2562qX.u() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = c2562qX.b;
                    int iA = c2562qX.a();
                    for (InterfaceC1324dm0 interfaceC1324dm0 : (InterfaceC1324dm0[]) this.g) {
                        c2562qX.F(i);
                        interfaceC1324dm0.e(iA, c2562qX);
                    }
                    this.e += iA;
                }
                break;
            default:
                AbstractC0397Ej.g((InterfaceC1324dm0) this.g);
                if (this.b) {
                    int iA2 = c2562qX.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        byte[] bArr = c2562qX.a;
                        int i3 = c2562qX.b;
                        C2562qX c2562qX2 = (C2562qX) this.f;
                        System.arraycopy(bArr, i3, c2562qX2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            c2562qX2.F(0);
                            if (73 == c2562qX2.u() && 68 == c2562qX2.u() && 51 == c2562qX2.u()) {
                                c2562qX2.G(3);
                                this.d = c2562qX2.t() + 10;
                            } else {
                                AP.z();
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((InterfaceC1324dm0) this.g).e(iMin2, c2562qX);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void c(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    if (j != -9223372036854775807L) {
                        this.c = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    if (j != -9223372036854775807L) {
                        this.c = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void d(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC1324dm0[] interfaceC1324dm0Arr = (InterfaceC1324dm0[]) this.g;
                    if (i < interfaceC1324dm0Arr.length) {
                        Xm0 xm0 = (Xm0) ((List) this.f).get(i);
                        ym0.a();
                        ym0.b();
                        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 3);
                        C0617Mw c0617Mw = new C0617Mw();
                        ym0.b();
                        c0617Mw.a = ym0.e;
                        c0617Mw.k = "application/dvbsubs";
                        c0617Mw.m = Collections.singletonList(xm0.b);
                        c0617Mw.c = xm0.a;
                        interfaceC1324dm0S.a(new C0643Nw(c0617Mw));
                        interfaceC1324dm0Arr[i] = interfaceC1324dm0S;
                        i++;
                    }
                    break;
                }
                break;
            default:
                ym0.a();
                ym0.b();
                InterfaceC1324dm0 interfaceC1324dm0S2 = interfaceC0354Cs.s(ym0.d, 5);
                this.g = interfaceC1324dm0S2;
                C0617Mw c0617Mw2 = new C0617Mw();
                ym0.b();
                c0617Mw2.a = ym0.e;
                c0617Mw2.k = "application/id3";
                interfaceC1324dm0S2.a(new C0643Nw(c0617Mw2));
                break;
        }
    }

    @Override // o.InterfaceC3273xp
    public final void e() {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c != -9223372036854775807L) {
                        for (InterfaceC1324dm0 interfaceC1324dm0 : (InterfaceC1324dm0[]) this.g) {
                            interfaceC1324dm0.d(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.b = false;
                }
                break;
            default:
                AbstractC0397Ej.g((InterfaceC1324dm0) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    long j = this.c;
                    if (j != -9223372036854775807L) {
                        ((InterfaceC1324dm0) this.g).d(j, 1, i, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    public C2110lp() {
        this.a = 1;
        this.f = new C2562qX(10);
        this.c = -9223372036854775807L;
    }
}
