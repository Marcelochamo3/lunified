package o;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: o.On, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0660On extends C3176wp {
    public C0634Nn u;
    public RN v;
    public int w;
    public final String x;
    public boolean y;

    public C0660On(String str, String str2) {
        super(C2678ri0.c("#root", str, C2852tX.c), str2, null);
        this.u = new C0634Nn();
        this.w = 1;
        this.y = false;
        this.x = str2;
        this.v = new RN(new C1081bD());
    }

    @Override // o.C3176wp
    /* JADX INFO: renamed from: L */
    public final C3176wp clone() {
        C0660On c0660On = (C0660On) super.clone();
        c0660On.u = this.u.clone();
        return c0660On;
    }

    public final C3176wp b0() {
        C3176wp c3176wpP = P();
        while (true) {
            if (c3176wpP == null) {
                c3176wpP = J("html");
                break;
            }
            if (c3176wpP.u("html")) {
                break;
            }
            c3176wpP = c3176wpP.T();
        }
        for (C3176wp c3176wpP2 = c3176wpP.P(); c3176wpP2 != null; c3176wpP2 = c3176wpP2.T()) {
            if (c3176wpP2.u("body") || c3176wpP2.u("frameset")) {
                return c3176wpP2;
            }
        }
        return c3176wpP.J("body");
    }

    public final void c0(Charset charset) {
        this.y = true;
        this.u.b(charset);
        if (this.y) {
            int i = this.u.s;
            if (i != 1) {
                if (i == 2) {
                    AbstractC1099bV abstractC1099bV = (AbstractC1099bV) q().get(0);
                    if (!(abstractC1099bV instanceof C1053ax0)) {
                        C1053ax0 c1053ax0 = new C1053ax0("xml", false);
                        c1053ax0.e("version", "1.0");
                        c1053ax0.e("encoding", this.u.m.displayName());
                        c(0, c1053ax0);
                        return;
                    }
                    C1053ax0 c1053ax1 = (C1053ax0) abstractC1099bV;
                    if (c1053ax1.I().equals("xml")) {
                        c1053ax1.e("encoding", this.u.m.displayName());
                        if (c1053ax1.r("version")) {
                            c1053ax1.e("version", "1.0");
                            return;
                        }
                        return;
                    }
                    C1053ax0 c1053ax2 = new C1053ax0("xml", false);
                    c1053ax2.e("version", "1.0");
                    c1053ax2.e("encoding", this.u.m.displayName());
                    c(0, c1053ax2);
                    return;
                }
                return;
            }
            C3176wp c3176wpX = X("meta[charset]");
            if (c3176wpX != null) {
                c3176wpX.e("charset", this.u.m.displayName());
            } else {
                C3176wp c3176wpP = P();
                while (true) {
                    if (c3176wpP == null) {
                        c3176wpP = J("html");
                        break;
                    } else if (c3176wpP.u("html")) {
                        break;
                    } else {
                        c3176wpP = c3176wpP.T();
                    }
                }
                C3176wp c3176wpP2 = c3176wpP.P();
                while (true) {
                    if (c3176wpP2 == null) {
                        C3176wp c3176wp = new C3176wp(C2678ri0.c("head", c3176wpP.f1103o.n, (C2852tX) AbstractC1474fG.O(c3176wpP).f488o), c3176wpP.h(), null);
                        c3176wpP.c(0, c3176wp);
                        c3176wpP2 = c3176wp;
                        break;
                    } else if (c3176wpP2.u("head")) {
                        break;
                    } else {
                        c3176wpP2 = c3176wpP2.T();
                    }
                }
                c3176wpP2.J("meta").e("charset", this.u.m.displayName());
            }
            Iterator<E> it = W("meta[name=charset]").iterator();
            while (it.hasNext()) {
                ((C3176wp) it.next()).E();
            }
        }
    }

    @Override // o.C3176wp, o.AbstractC1099bV
    public final Object clone() {
        C0660On c0660On = (C0660On) super.clone();
        c0660On.u = this.u.clone();
        return c0660On;
    }

    @Override // o.C3176wp, o.AbstractC1099bV
    /* JADX INFO: renamed from: n */
    public final AbstractC1099bV clone() {
        C0660On c0660On = (C0660On) super.clone();
        c0660On.u = this.u.clone();
        return c0660On;
    }

    @Override // o.C3176wp, o.AbstractC1099bV
    public final String w() {
        return "#document";
    }

    @Override // o.AbstractC1099bV
    public final String y() {
        return R();
    }

    public C0660On(String str) {
        this("http://www.w3.org/1999/xhtml", str);
    }
}
