package o;

/* JADX INFO: renamed from: o.zl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3460zl0 extends El0 {
    public C3460zl0() {
        super("CdataSection", 66);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        String strC;
        int iW = c1207cd.w("]]>");
        if (iW != -1) {
            strC = C1207cd.c(c1207cd.a, c1207cd.h, c1207cd.e, iW);
            c1207cd.e += iW;
        } else {
            int i = c1207cd.c;
            int i2 = c1207cd.e;
            if (i - i2 < 3) {
                c1207cd.b();
                char[] cArr = c1207cd.a;
                String[] strArr = c1207cd.h;
                int i3 = c1207cd.e;
                strC = C1207cd.c(cArr, strArr, i3, c1207cd.c - i3);
                c1207cd.e = c1207cd.c;
            } else {
                int i4 = i - 2;
                strC = C1207cd.c(c1207cd.a, c1207cd.h, i2, i4 - i2);
                c1207cd.e = i4;
            }
        }
        StringBuilder sb = c2392ok0.h;
        sb.append(strC);
        if (c1207cd.q("]]>") || c1207cd.n()) {
            String string = sb.toString();
            C1515fk0 c1515fk0 = new C1515fk0(5, 4);
            c1515fk0.n = string;
            c2392ok0.h(c1515fk0);
            c2392ok0.o(El0.l);
        }
    }
}
