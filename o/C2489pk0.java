package o;

/* JADX INFO: renamed from: o.pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2489pk0 extends El0 {
    public C2489pk0() {
        super("TagName", 9);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char c;
        c1207cd.b();
        int i = c1207cd.e;
        int i2 = c1207cd.c;
        char[] cArr = c1207cd.a;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '<' && c != '>') {
            i3++;
        }
        c1207cd.e = i3;
        c2392ok0.k.I(i3 > i ? C1207cd.c(c1207cd.a, c1207cd.h, i, i3 - i) : "");
        char cF = c1207cd.f();
        if (cF == 0) {
            c2392ok0.k.I(El0.C0);
            return;
        }
        if (cF != ' ') {
            if (cF == '/') {
                c2392ok0.o(El0.a0);
                return;
            }
            C3458zk0 c3458zk0 = El0.l;
            if (cF == '<') {
                c1207cd.B();
                c2392ok0.m(this);
            } else if (cF != '>') {
                if (cF == 65535) {
                    c2392ok0.l(this);
                    c2392ok0.o(c3458zk0);
                    return;
                } else if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                    AbstractC2198mk0 abstractC2198mk0 = c2392ok0.k;
                    abstractC2198mk0.getClass();
                    abstractC2198mk0.I(String.valueOf(cF));
                    return;
                }
            }
            c2392ok0.k();
            c2392ok0.o(c3458zk0);
            return;
        }
        c2392ok0.o(El0.S);
    }
}
