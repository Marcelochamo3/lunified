package o;

import java.util.Locale;

/* JADX INFO: renamed from: o.qk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2586qk0 extends El0 {
    public C2586qk0() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        Locale locale;
        int iW;
        if (c1207cd.s('/')) {
            c2392ok0.d();
            c2392ok0.o(El0.w);
            c2392ok0.a.a();
            return;
        }
        if (c1207cd.k && c1207cd.u() && c2392ok0.f951o != null) {
            if (c2392ok0.p == null) {
                c2392ok0.p = "</" + c2392ok0.f951o;
            }
            String str = c2392ok0.p;
            boolean z = true;
            if (str.equals(c1207cd.l)) {
                int i = c1207cd.m;
                if (i == -1) {
                    z = false;
                } else if (i < c1207cd.e) {
                    c1207cd.l = str;
                    locale = Locale.ENGLISH;
                    iW = c1207cd.w(str.toLowerCase(locale));
                    if (iW > -1) {
                        c1207cd.m = c1207cd.e + iW;
                    } else {
                        int iW2 = c1207cd.w(str.toUpperCase(locale));
                        if (iW2 > -1) {
                        }
                        c1207cd.m = z ? c1207cd.e + iW2 : -1;
                    }
                }
            } else {
                c1207cd.l = str;
                locale = Locale.ENGLISH;
                iW = c1207cd.w(str.toLowerCase(locale));
                if (iW > -1) {
                    c1207cd.m = c1207cd.e + iW;
                } else {
                    int iW3 = c1207cd.w(str.toUpperCase(locale));
                    z = iW3 > -1;
                    c1207cd.m = z ? c1207cd.e + iW3 : -1;
                }
            }
            if (!z) {
                AbstractC2198mk0 abstractC2198mk0C = c2392ok0.c(false);
                abstractC2198mk0C.M(c2392ok0.f951o);
                c2392ok0.k = abstractC2198mk0C;
                c2392ok0.k();
                c2392ok0.o(El0.s);
                return;
            }
        }
        c2392ok0.f("<");
        c2392ok0.o(El0.n);
    }
}
