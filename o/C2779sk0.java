package o;

/* JADX INFO: renamed from: o.sk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2779sk0 extends El0 {
    public C2779sk0() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(C2392ok0 c2392ok0, C1207cd c1207cd) {
        c2392ok0.f("</");
        c2392ok0.g(c2392ok0.h);
        c1207cd.B();
        c2392ok0.o(El0.n);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        if (c1207cd.u()) {
            String strI = c1207cd.i();
            c2392ok0.k.I(strI);
            c2392ok0.h.append(strI);
            return;
        }
        char cF = c1207cd.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (c2392ok0.n()) {
                c2392ok0.o(El0.S);
                return;
            } else {
                e(c2392ok0, c1207cd);
                return;
            }
        }
        if (cF == '/') {
            if (c2392ok0.n()) {
                c2392ok0.o(El0.a0);
                return;
            } else {
                e(c2392ok0, c1207cd);
                return;
            }
        }
        if (cF != '>') {
            e(c2392ok0, c1207cd);
        } else if (!c2392ok0.n()) {
            e(c2392ok0, c1207cd);
        } else {
            c2392ok0.k();
            c2392ok0.o(El0.l);
        }
    }
}
