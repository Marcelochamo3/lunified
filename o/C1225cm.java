package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1225cm {
    public final List a;
    public int b;

    public C1225cm(int i, List list) {
        this.b = i;
        this.a = list;
    }

    public Zm0 a(int i, RN rn) {
        if (i != 2) {
            String str = (String) rn.m;
            if (i == 3 || i == 4) {
                return new FY(new C3138wS(str));
            }
            if (i == 21) {
                return new FY(new C2110lp());
            }
            if (i == 27) {
                if (d(4)) {
                    return null;
                }
                return new FY(new RA(new Ib0(0, b(rn)), d(1), d(8)));
            }
            if (i == 36) {
                return new FY(new TA(new Ib0(0, b(rn))));
            }
            if (i == 89) {
                return new FY(new C2110lp((List) rn.n));
            }
            if (i != 138) {
                if (i == 172) {
                    return new FY(new C2519q0(str, 1));
                }
                if (i == 257) {
                    return new C1595gb0(new RN("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (d(16)) {
                        return null;
                    }
                    return new C1595gb0(new RN("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (d(2)) {
                                return null;
                            }
                            return new FY(new C1452f2(false, str));
                        case 16:
                            return new FY(new OA(new Ib0(1, b(rn))));
                        case 17:
                            if (d(2)) {
                                return null;
                            }
                            return new FY(new C3420zJ(str));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case Yu0.b.l0 /* 129 */:
                                    break;
                                case Yu0.b.m0 /* 130 */:
                                    if (!d(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new FY(new C2519q0(str, 0));
            }
            return new FY(new C0895Xo(str));
        }
        return new FY(new LA(new Ib0(1, b(rn))));
    }

    public List b(RN rn) {
        String str;
        int i;
        boolean zD = d(32);
        List list = this.a;
        if (zD) {
            return list;
        }
        C2562qX c2562qX = new C2562qX((byte[]) rn.f488o);
        while (c2562qX.a() > 0) {
            int iU = c2562qX.u();
            int iU2 = c2562qX.b + c2562qX.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = c2562qX.u() & 31;
                for (int i2 = 0; i2 < iU3; i2++) {
                    String strS = c2562qX.s(3, AbstractC1402ed.c);
                    int iU4 = c2562qX.u();
                    boolean z = (iU4 & 128) != 0;
                    if (z) {
                        i = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bU = (byte) c2562qX.u();
                    c2562qX.G(1);
                    List listSingletonList = z ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C0617Mw c0617Mw = new C0617Mw();
                    c0617Mw.k = str;
                    c0617Mw.c = strS;
                    c0617Mw.C = i;
                    c0617Mw.m = listSingletonList;
                    arrayList.add(new C0643Nw(c0617Mw));
                }
                list = arrayList;
            }
            c2562qX.F(iU2);
        }
        return list;
    }

    public boolean c() {
        return this.b < this.a.size();
    }

    public boolean d(int i) {
        return (i & this.b) != 0;
    }

    public C1225cm(ArrayList arrayList) {
        this.a = arrayList;
    }
}
