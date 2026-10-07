package o;

import java.io.Reader;

/* JADX INFO: renamed from: o.bx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151bx0 extends Nm0 {
    @Override // o.Nm0
    public final String c() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // o.Nm0
    public final C2852tX d() {
        return C2852tX.d;
    }

    @Override // o.Nm0
    public final void e(Reader reader, String str, RN rn) {
        super.e(reader, str, rn);
        this.e.add(this.d);
        C0634Nn c0634Nn = this.d.u;
        c0634Nn.s = 2;
        c0634Nn.l = EnumC3469zq.p;
        c0634Nn.p = false;
    }

    @Override // o.Nm0
    public final boolean h(AbstractC3015v6 abstractC3015v6) {
        C1053ax0 c1053ax0K;
        this.g = abstractC3015v6;
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        if (iW != 0) {
            C3176wp c3176wp = null;
            if (iW == 1) {
                C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
                String str = c2101lk0.n;
                if (str == null || str.length() == 0) {
                    throw new C1629gs0("Must be false");
                }
                String str2 = c2101lk0.n;
                C2852tX c2852tX = this.h;
                C2678ri0 c2678ri0C = (C2678ri0) this.i.get(str2);
                if (c2678ri0C == null || !c2678ri0C.n.equals("http://www.w3.org/XML/1998/namespace")) {
                    c2678ri0C = C2678ri0.c(str2, "http://www.w3.org/XML/1998/namespace", c2852tX);
                    this.i.put(str2, c2678ri0C);
                }
                F6 f6 = c2101lk0.q;
                if (f6 != null) {
                    f6.j(this.h);
                }
                C2852tX c2852tX2 = this.h;
                F6 f7 = c2101lk0.q;
                c2852tX2.a(f7);
                C3176wp c3176wp2 = new C3176wp(c2678ri0C, null, f7);
                a().I(c3176wp2);
                this.e.add(c3176wp2);
                if (c2101lk0.p) {
                    c2678ri0C.r = true;
                    g();
                }
            } else if (iW == 2) {
                String strB = this.h.b(((C2003kk0) abstractC3015v6).n);
                int size = this.e.size();
                int i = size + (-1) >= 256 ? size - 257 : 0;
                for (int size2 = this.e.size() - 1; size2 >= i; size2--) {
                    C3176wp c3176wp3 = (C3176wp) this.e.get(size2);
                    if (c3176wp3.w().equals(strB)) {
                        c3176wp = c3176wp3;
                        break;
                    }
                }
                if (c3176wp != null) {
                    for (int size3 = this.e.size() - 1; size3 >= 0 && g() != c3176wp; size3--) {
                    }
                }
            } else if (iW == 3) {
                C1711hk0 c1711hk0 = (C1711hk0) abstractC3015v6;
                String string = c1711hk0.f815o;
                if (string == null) {
                    string = c1711hk0.n.toString();
                }
                C3059vf c3059vf = new C3059vf(string);
                if (c1711hk0.p) {
                    String strI = c3059vf.I();
                    if (strI.length() > 1 && ((strI.startsWith("!") || strI.startsWith("?")) && (c1053ax0K = c3059vf.K()) != null)) {
                        c3059vf = c1053ax0K;
                    }
                }
                a().I(c3059vf);
            } else if (iW == 4) {
                C1613gk0 c1613gk0 = (C1613gk0) abstractC3015v6;
                String str3 = c1613gk0.n;
                a().I(c1613gk0 instanceof C1515fk0 ? new C3049va(str3) : new Qi0(str3));
            } else if (iW != 5) {
                throw new C1629gs0("Unexpected token type: ".concat(AbstractC1674hK.A(abstractC3015v6.m)));
            }
        } else {
            C1808ik0 c1808ik0 = (C1808ik0) abstractC3015v6;
            C0686Pn c0686Pn = new C0686Pn(this.h.b(c1808ik0.n.toString()), c1808ik0.p.toString(), c1808ik0.q.toString());
            String str4 = c1808ik0.f834o;
            if (str4 != null) {
                c0686Pn.e("pubSysKey", str4);
            }
            a().I(c0686Pn);
        }
        return true;
    }
}
