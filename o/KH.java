package o;

import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class KH implements InterfaceC0302As {
    public InterfaceC0354Cs b;
    public int c;
    public int d;
    public int e;
    public C1095bR g;
    public InterfaceC0328Bs h;
    public C3306y6 i;
    public C2847tS j;
    public final C2562qX a = new C2562qX(6);
    public long f = -1;

    @Override // o.InterfaceC0302As
    public final void a() {
        C2847tS c2847tS = this.j;
        if (c2847tS != null) {
            c2847tS.getClass();
        }
    }

    public final void b() {
        c(new BQ[0]);
        InterfaceC0354Cs interfaceC0354Cs = this.b;
        interfaceC0354Cs.getClass();
        interfaceC0354Cs.f();
        this.b.i(new C3114w7(-9223372036854775807L));
        this.c = 6;
    }

    public final void c(BQ... bqArr) {
        InterfaceC0354Cs interfaceC0354Cs = this.b;
        interfaceC0354Cs.getClass();
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(1024, 4);
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.j = "image/jpeg";
        c0617Mw.i = new CQ(bqArr);
        interfaceC1324dm0S.a(new C0643Nw(c0617Mw));
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            C2847tS c2847tS = this.j;
            c2847tS.getClass();
            c2847tS.d(j, j2);
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        C2562qX c2562qX = this.a;
        c2562qX.C(2);
        c0554Kk.x(c2562qX.a, 0, 2, false);
        if (c2562qX.z() != 65496) {
            return false;
        }
        c2562qX.C(2);
        c0554Kk.x(c2562qX.a, 0, 2, false);
        int iZ = c2562qX.z();
        this.d = iZ;
        if (iZ == 65504) {
            c2562qX.C(2);
            c0554Kk.x(c2562qX.a, 0, 2, false);
            c0554Kk.b(c2562qX.z() - 2, false);
            c2562qX.C(2);
            c0554Kk.x(c2562qX.a, 0, 2, false);
            this.d = c2562qX.z();
        }
        if (this.d != 65505) {
            return false;
        }
        c0554Kk.b(2, false);
        c2562qX.C(6);
        c0554Kk.x(c2562qX.a, 0, 6, false);
        return c2562qX.v() == 1165519206 && c2562qX.z() == 0;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.b = interfaceC0354Cs;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        String strP;
        C3306y6 c3306y6W;
        C1095bR c1095bR;
        long j;
        int i = this.c;
        C2562qX c2562qX = this.a;
        if (i == 0) {
            c2562qX.C(2);
            ((C0554Kk) interfaceC0328Bs).a(c2562qX.a, 0, 2, false);
            int iZ = c2562qX.z();
            this.d = iZ;
            if (iZ == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((iZ >= 65488 && iZ <= 65497) || iZ == 65281) {
                return 0;
            }
            this.c = 1;
            return 0;
        }
        if (i == 1) {
            c2562qX.C(2);
            ((C0554Kk) interfaceC0328Bs).a(c2562qX.a, 0, 2, false);
            this.e = c2562qX.z() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || interfaceC0328Bs != this.h) {
                    this.h = interfaceC0328Bs;
                    this.i = new C3306y6((C0554Kk) interfaceC0328Bs, this.f);
                }
                C2847tS c2847tS = this.j;
                c2847tS.getClass();
                int iH = c2847tS.h(this.i, c2800sv);
                if (iH == 1) {
                    c2800sv.a += this.f;
                }
                return iH;
            }
            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
            long j2 = c0554Kk.f369o;
            long j3 = this.f;
            if (j2 != j3) {
                c2800sv.a = j3;
                return 1;
            }
            if (c0554Kk.x(c2562qX.a, 0, 1, true)) {
                c0554Kk.q = 0;
                if (this.j == null) {
                    this.j = new C2847tS();
                }
                C3306y6 c3306y6 = new C3306y6(c0554Kk, this.f);
                this.i = c3306y6;
                this.j.getClass();
                if (AbstractC1459f50.N(c3306y6, false, false)) {
                    C2847tS c2847tS2 = this.j;
                    long j4 = this.f;
                    InterfaceC0354Cs interfaceC0354Cs = this.b;
                    interfaceC0354Cs.getClass();
                    c2847tS2.q = new C3306y6(j4, interfaceC0354Cs, 9);
                    C1095bR c1095bR2 = this.g;
                    c1095bR2.getClass();
                    c(c1095bR2);
                    this.c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        }
        if (this.d == 65505) {
            C2562qX c2562qX2 = new C2562qX(this.e);
            C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
            c0554Kk2.a(c2562qX2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(c2562qX2.p()) && (strP = c2562qX2.p()) != null) {
                long j5 = c0554Kk2.n;
                if (j5 == -1) {
                    c1095bR = null;
                } else {
                    try {
                        c3306y6W = AbstractC3409z9.w(strP);
                    } catch (NumberFormatException | C2949uX | XmlPullParserException unused) {
                        AP.z();
                        c3306y6W = null;
                    }
                    if (c3306y6W == null) {
                        c1095bR = null;
                    } else {
                        List list = (List) c3306y6W.n;
                        if (list.size() < 2) {
                            c1095bR = null;
                        } else {
                            int size = list.size() - 1;
                            long j6 = -1;
                            long j7 = -1;
                            long j8 = -1;
                            long j9 = -1;
                            boolean z = false;
                            while (size >= 0) {
                                C0997aR c0997aR = (C0997aR) list.get(size);
                                boolean zEquals = "video/mp4".equals(c0997aR.a) | z;
                                if (size == 0) {
                                    j5 -= c0997aR.c;
                                    j = 0;
                                } else {
                                    j = j5 - c0997aR.b;
                                }
                                long j10 = j;
                                long j11 = j5;
                                j5 = j10;
                                if (zEquals && j5 != j11) {
                                    j9 = j11 - j5;
                                    j8 = j5;
                                    zEquals = false;
                                }
                                if (size == 0) {
                                    j7 = j11;
                                    j6 = j5;
                                }
                                size--;
                                z = zEquals;
                            }
                            if (j8 == -1 || j9 == -1 || j6 == -1 || j7 == -1) {
                                c1095bR = null;
                            } else {
                                c1095bR = new C1095bR(j6, j7, c3306y6W.m, j8, j9);
                            }
                        }
                    }
                }
                this.g = c1095bR;
                if (c1095bR != null) {
                    this.f = c1095bR.f694o;
                }
            }
        } else {
            ((C0554Kk) interfaceC0328Bs).q(this.e);
        }
        this.c = 0;
        return 0;
    }
}
