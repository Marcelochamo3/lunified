package o;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: o.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081bD extends Nm0 {
    public AD l;
    public AD m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3176wp f691o;
    public C0566Kw p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;
    public C2003kk0 t;
    public boolean u;
    public boolean v;
    public final String[] w = {null};
    public static final String[] x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    public static final String[] y = {"ol", "ul"};
    public static final String[] z = {"button"};
    public static final String[] A = {"html", "table"};
    public static final String[] B = {"optgroup", "option"};
    public static final String[] C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final String[] F = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] G = {"desc", "foreignObject", "title"};

    public static void D(C1613gk0 c1613gk0, C3176wp c3176wp) {
        JJ c1902jj;
        String str = c3176wp.f1103o.m;
        String str2 = c1613gk0.n;
        if (c1613gk0 instanceof C1515fk0) {
            c1902jj = new C3049va(str2);
        } else if (str.equals("script") || str.equals("style")) {
            c1902jj = new C1902jj();
            c1902jj.f339o = str2;
        } else {
            c1902jj = new Qi0(str2);
        }
        c3176wp.I(c1902jj);
    }

    public static boolean L(ArrayList arrayList, C3176wp c3176wp) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C3176wp) arrayList.get(i)) == c3176wp) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final boolean A(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            C3176wp c3176wp = (C3176wp) this.e.get(i);
            if (c3176wp.f1103o.n.equals("http://www.w3.org/1999/xhtml")) {
                String str = c3176wp.f1103o.m;
                if (AbstractC1021ah0.d(str, strArr)) {
                    return true;
                }
                if (AbstractC1021ah0.d(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && AbstractC1021ah0.d(str, strArr3)) {
                    return false;
                }
            }
            i--;
        }
        return false;
    }

    public final boolean B(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return A(strArr2, strArr, null);
    }

    public final void C(C1613gk0 c1613gk0) {
        D(c1613gk0, a());
    }

    public final void E(C1711hk0 c1711hk0) {
        String string = c1711hk0.f815o;
        if (string == null) {
            string = c1711hk0.n.toString();
        }
        a().I(new C3059vf(string));
    }

    public final C3176wp F(C2101lk0 c2101lk0) {
        C3176wp c3176wpQ = q(c2101lk0, "http://www.w3.org/1999/xhtml", false);
        r(c3176wpQ);
        if (c2101lk0.p) {
            HashMap map = C2678ri0.v;
            C2678ri0 c2678ri0 = c3176wpQ.f1103o;
            if (!map.containsKey(c2678ri0.l)) {
                c2678ri0.r = true;
            } else if (!c2678ri0.q) {
                C2392ok0 c2392ok0 = this.c;
                Object[] objArr = {c2678ri0.m};
                C2755sX c2755sX = c2392ok0.b;
                if (c2755sX.d()) {
                    c2755sX.add(new C2658rX(c2392ok0.a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
            this.c.o(El0.l);
            C2392ok0 c2392ok1 = this.c;
            C2003kk0 c2003kk0 = this.t;
            c2003kk0.C();
            c2003kk0.M(c2678ri0.l);
            c2392ok1.h(c2003kk0);
        }
        return c3176wpQ;
    }

    public final C3176wp G(C2101lk0 c2101lk0) {
        C3176wp c3176wpQ = q(c2101lk0, "http://www.w3.org/1999/xhtml", false);
        r(c3176wpQ);
        g();
        return c3176wpQ;
    }

    public final void H(C2101lk0 c2101lk0, String str) {
        C3176wp c3176wpQ = q(c2101lk0, str, true);
        r(c3176wpQ);
        if (c2101lk0.p) {
            c3176wpQ.f1103o.r = true;
            g();
        }
    }

    public final void I(C2101lk0 c2101lk0, boolean z2, boolean z3) {
        C0566Kw c0566Kw = (C0566Kw) q(c2101lk0, "http://www.w3.org/1999/xhtml", false);
        if (!z3 || !K("template")) {
            this.p = c0566Kw;
        }
        r(c0566Kw);
        if (z2) {
            return;
        }
        g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public final void J(AbstractC1099bV abstractC1099bV) {
        C3176wp c3176wpK;
        boolean z2;
        C3176wp c3176wpW = w("table");
        if (c3176wpW != null) {
            c3176wpK = (C3176wp) c3176wpW.l;
            if (c3176wpK != null) {
                z2 = true;
            } else {
                c3176wpK = k(c3176wpW);
            }
            if (z2) {
                c3176wpK.I(abstractC1099bV);
                return;
            }
            Sr0.w(c3176wpW);
            Sr0.w(c3176wpW.l);
            if (abstractC1099bV.l == c3176wpW.l) {
                abstractC1099bV.E();
            }
            c3176wpW.l.c(c3176wpW.m, abstractC1099bV);
        }
        c3176wpK = (C3176wp) this.e.get(0);
        z2 = false;
        if (z2) {
            c3176wpK.I(abstractC1099bV);
            return;
        }
        Sr0.w(c3176wpW);
        Sr0.w(c3176wpW.l);
        if (abstractC1099bV.l == c3176wpW.l) {
            abstractC1099bV.E();
        }
        c3176wpW.l.c(c3176wpW.m, abstractC1099bV);
    }

    public final boolean K(String str) {
        return w(str) != null;
    }

    public final boolean M(String[] strArr) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            if (!AbstractC1021ah0.d(((C3176wp) this.e.get(i)).f1103o.m, strArr)) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void N(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            C2678ri0 c2678ri0 = g().f1103o;
            if (c2678ri0.m.equals(str) && c2678ri0.n.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void O() {
        if (this.r.size() > 0) {
            ArrayList arrayList = this.r;
        }
    }

    public final void P(AD ad) {
        this.r.add(ad);
    }

    public final void Q() {
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        C3176wp c3176wp = this.q.size() > 0 ? (C3176wp) AbstractC1701hf0.c(1, this.q) : null;
        if (c3176wp == null || L(this.e, c3176wp)) {
            return;
        }
        int size = this.q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            c3176wp = (C3176wp) this.q.get(i3);
            if (c3176wp == null || L(this.e, c3176wp)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                c3176wp = (C3176wp) this.q.get(i3);
            }
            Sr0.w(c3176wp);
            String str = c3176wp.f1103o.m;
            C2852tX c2852tX = this.h;
            C2678ri0 c2678ri0C = (C2678ri0) this.i.get(str);
            if (c2678ri0C == null || !c2678ri0C.n.equals("http://www.w3.org/1999/xhtml")) {
                c2678ri0C = C2678ri0.c(str, "http://www.w3.org/1999/xhtml", c2852tX);
                this.i.put(str, c2678ri0C);
            }
            C3176wp c3176wp2 = new C3176wp(c2678ri0C, null, c3176wp.g().clone());
            r(c3176wp2);
            this.q.set(i3, c3176wp2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void R(C3176wp c3176wp) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (((C3176wp) this.q.get(size)) == c3176wp) {
                this.q.remove(size);
                return;
            }
        }
    }

    public final void S(C3176wp c3176wp) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((C3176wp) this.e.get(size)) == c3176wp) {
                this.e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0183 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean T() {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        AD ad = this.l;
        if (this.e.size() == 0) {
            this.l = AD.r;
        }
        boolean z2 = false;
        while (i >= i2) {
            C3176wp c3176wp = (C3176wp) this.e.get(i);
            if (i == i2) {
                z2 = true;
            }
            String str = c3176wp != null ? c3176wp.f1103o.m : "";
            if ("http://www.w3.org/1999/xhtml".equals(c3176wp.f1103o.n)) {
                str.getClass();
                str.hashCode();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            b = 0;
                        }
                        break;
                    case -1321546630:
                        if (str.equals("template")) {
                            b = 1;
                        }
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            b = 2;
                        }
                        break;
                    case -636197633:
                        if (str.equals("colgroup")) {
                            b = 3;
                        }
                        break;
                    case 3696:
                        if (str.equals("td")) {
                            b = 4;
                        }
                        break;
                    case 3700:
                        if (str.equals("th")) {
                            b = 5;
                        }
                        break;
                    case 3710:
                        if (str.equals("tr")) {
                            b = 6;
                        }
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            b = 7;
                        }
                        break;
                    case 3198432:
                        if (str.equals("head")) {
                            b = 8;
                        }
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            b = 9;
                        }
                        break;
                    case 110115790:
                        if (str.equals("table")) {
                            b = 10;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            b = C3285xv.h;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            b = 12;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            b = 13;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            b = 14;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        this.l = AD.E;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 1:
                        AD ad2 = this.r.size() > 0 ? (AD) AbstractC1701hf0.c(1, this.r) : null;
                        if (ad2 == null) {
                            throw new C1629gs0("Bug: no template insertion mode on stack!");
                        }
                        this.l = ad2;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 2:
                        this.l = AD.A;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 3:
                        this.l = AD.w;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 4:
                    case 5:
                        if (z2) {
                            if (z2) {
                                this.l = AD.r;
                            }
                            break;
                        } else {
                            this.l = AD.z;
                        }
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 6:
                        this.l = AD.y;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 7:
                        this.l = AD.r;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 8:
                        if (z2) {
                            if (z2) {
                                this.l = AD.r;
                            }
                            break;
                        } else {
                            this.l = AD.f167o;
                        }
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 9:
                        this.l = this.f691o == null ? AD.n : AD.q;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 10:
                        this.l = AD.t;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 11:
                    case 12:
                    case 13:
                        this.l = AD.x;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    case 14:
                        this.l = AD.v;
                        if (this.l != ad) {
                            return true;
                        }
                        return false;
                    default:
                        if (z2) {
                            this.l = AD.r;
                            if (this.l != ad) {
                                return true;
                            }
                            return false;
                        }
                        break;
                }
            }
            i--;
        }
        if (this.l != ad) {
            return true;
        }
        return false;
    }

    @Override // o.Nm0
    public final C2852tX d() {
        return C2852tX.c;
    }

    @Override // o.Nm0
    public final void e(Reader reader, String str, RN rn) {
        super.e(reader, str, rn);
        this.l = AD.l;
        this.m = null;
        this.n = false;
        this.f691o = null;
        this.p = null;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new C2003kk0(3, this);
        this.u = true;
        this.v = false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    @Override // o.Nm0
    public final boolean h(AbstractC3015v6 abstractC3015v6) {
        boolean zU = true;
        if (!this.e.isEmpty()) {
            C3176wp c3176wpA = a();
            String str = c3176wpA.f1103o.n;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                C2678ri0 c2678ri0 = c3176wpA.f1103o;
                if ("http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                    if (AbstractC1021ah0.d(c2678ri0.m, F)) {
                        if (abstractC3015v6.w()) {
                            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
                            if ("mglyph".equals(c2101lk0.f921o) || "malignmark".equals(c2101lk0.f921o)) {
                                if (!abstractC3015v6.q()) {
                                    if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                                        if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                                            if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                            }
                                        } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                        }
                                        zU = abstractC3015v6.u();
                                    } else {
                                        if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                                            if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                            }
                                        } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                        }
                                        zU = abstractC3015v6.u();
                                    }
                                }
                            }
                        } else if (!abstractC3015v6.q()) {
                            if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                                if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                                    if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                    }
                                } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                }
                                zU = abstractC3015v6.u();
                            } else {
                                if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                                    if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                    }
                                } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                                }
                                zU = abstractC3015v6.u();
                            }
                        }
                    } else if ("http://www.w3.org/1998/Math/MathML".equals(str) || !c3176wpA.u("annotation-xml") || !abstractC3015v6.w() || !"svg".equals(((C2101lk0) abstractC3015v6).f921o)) {
                        if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n) && c3176wpA.u("annotation-xml")) {
                            String strP = AP.p(c3176wpA.d("encoding"));
                            if (strP.equals("text/html") || strP.equals("application/xhtml+xml")) {
                                if (!abstractC3015v6.w()) {
                                }
                            } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                            }
                        } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n) && AbstractC1021ah0.c(c2678ri0.l, G)) {
                            if (!abstractC3015v6.w() && !abstractC3015v6.q()) {
                            }
                        }
                        zU = abstractC3015v6.u();
                    }
                } else if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                    if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                        if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                        }
                    } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                    }
                    zU = abstractC3015v6.u();
                } else {
                    if (!"http://www.w3.org/1998/Math/MathML".equals(c2678ri0.n)) {
                        if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                        }
                    } else if (!"http://www.w3.org/2000/svg".equals(c2678ri0.n)) {
                    }
                    zU = abstractC3015v6.u();
                }
            }
        }
        return (zU ? this.l : AD.I).c(abstractC3015v6, this);
    }

    public final C3176wp k(C3176wp c3176wp) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((C3176wp) this.e.get(size)) == c3176wp) {
                return (C3176wp) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void l(C3176wp c3176wp) {
        int size = this.q.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C3176wp c3176wp2 = (C3176wp) this.q.get(i3);
            if (c3176wp2 == null) {
                return;
            }
            if (c3176wp.f1103o.m.equals(c3176wp2.f1103o.m) && c3176wp.g().equals(c3176wp2.g())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(i3);
                return;
            }
        }
    }

    public final void m() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? (C3176wp) this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void n(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            C3176wp c3176wp = (C3176wp) this.e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(c3176wp.f1103o.n) && (AbstractC1021ah0.c(c3176wp.f1103o.m, strArr) || c3176wp.u("html"))) {
                return;
            }
            g();
        }
    }

    public final void o() {
        n("table", "template");
    }

    public final void p() {
        n("tr", "template");
    }

    public final C3176wp q(C2101lk0 c2101lk0, String str, boolean z2) {
        F6 f6 = c2101lk0.q;
        if (!z2) {
            this.h.a(f6);
        }
        if (f6 != null && f6.l != 0 && f6.j(this.h) > 0) {
            Object[] objArr = {c2101lk0.f921o};
            C2755sX c2755sX = (C2755sX) this.a.n;
            if (c2755sX.d()) {
                c2755sX.add(new C2658rX(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        String str2 = c2101lk0.n;
        C2852tX c2852tX = z2 ? C2852tX.d : this.h;
        C2678ri0 c2678ri0C = (C2678ri0) this.i.get(str2);
        if (c2678ri0C == null || !c2678ri0C.n.equals(str)) {
            c2678ri0C = C2678ri0.c(str2, str, c2852tX);
            this.i.put(str2, c2678ri0C);
        }
        return c2678ri0C.m.equals("form") ? new C0566Kw(c2678ri0C, f6) : new C3176wp(c2678ri0C, null, f6);
    }

    public final void r(C3176wp c3176wp) {
        C0566Kw c0566Kw;
        if (c3176wp.f1103o.t && (c0566Kw = this.p) != null) {
            c0566Kw.u.add(c3176wp);
        }
        if (c3176wp.r("xmlns")) {
            String strD = c3176wp.d("xmlns");
            C2678ri0 c2678ri0 = c3176wp.f1103o;
            if (!strD.equals(c2678ri0.n)) {
                Object[] objArr = {c3176wp.d("xmlns"), c2678ri0.l};
                C2755sX c2755sX = (C2755sX) this.a.n;
                if (c2755sX.d()) {
                    c2755sX.add(new C2658rX(this.b, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
                }
            }
        }
        if (this.v && AbstractC1021ah0.d(a().f1103o.m, AbstractC1468fA.C)) {
            J(c3176wp);
        } else {
            a().I(c3176wp);
        }
        this.e.add(c3176wp);
    }

    public final void s(AD ad) {
        if (((C2755sX) this.a.n).d()) {
            ((C2755sX) this.a.n).add(new C2658rX(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, ad}));
        }
    }

    public final void t(String str) {
        while (AbstractC1021ah0.d(a().f1103o.m, C)) {
            if (str != null && b(str)) {
                return;
            } else {
                g();
            }
        }
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + a() + '}';
    }

    public final void u(boolean z2) {
        String[] strArr = z2 ? D : C;
        while ("http://www.w3.org/1999/xhtml".equals(a().f1103o.n) && AbstractC1021ah0.d(a().f1103o.m, strArr)) {
            g();
        }
    }

    public final C3176wp v(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            C3176wp c3176wp = (C3176wp) this.q.get(size);
            if (c3176wp == null) {
                return null;
            }
            if (c3176wp.u(str)) {
                return c3176wp;
            }
        }
        return null;
    }

    public final C3176wp w(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C3176wp c3176wp = (C3176wp) this.e.get(i);
            C2678ri0 c2678ri0 = c3176wp.f1103o;
            if (c2678ri0.m.equals(str) && c2678ri0.n.equals("http://www.w3.org/1999/xhtml")) {
                return c3176wp;
            }
            i--;
        }
        return null;
    }

    public final boolean x(String str) {
        String[] strArr = z;
        String[] strArr2 = x;
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return A(strArr3, strArr2, strArr);
    }

    public final boolean y(String str) {
        String[] strArr = x;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return A(strArr2, strArr, null);
    }

    public final boolean z(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((C3176wp) this.e.get(size)).f1103o.m;
            if (str2.equals(str)) {
                return true;
            }
            if (!AbstractC1021ah0.d(str2, B)) {
                return false;
            }
        }
        throw new C1629gs0("Should not be reachable");
    }
}
