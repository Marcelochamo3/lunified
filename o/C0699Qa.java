package o;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: o.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699Qa implements InterfaceC1181cG {
    public final boolean a;

    public C0699Qa(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017c A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x019a A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b6 A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ba A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7 A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01dc A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:93:0x0164, B:97:0x016c, B:101:0x018a, B:103:0x019a, B:107:0x01a7, B:112:0x01b6, B:114:0x01ba, B:118:0x01c7, B:120:0x01dc, B:122:0x01e6, B:123:0x01f0, B:100:0x017c), top: B:133:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107 A[Catch: IOException -> 0x0113, TryCatch #3 {IOException -> 0x0113, blocks: (B:73:0x00fe, B:75:0x0107, B:79:0x0115, B:87:0x0139, B:89:0x0142, B:90:0x0148, B:91:0x015c), top: B:138:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142 A[Catch: IOException -> 0x0113, TryCatch #3 {IOException -> 0x0113, blocks: (B:73:0x00fe, B:75:0x0107, B:79:0x0115, B:87:0x0139, B:89:0x0142, B:90:0x0148, B:91:0x015c), top: B:138:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) throws IOException {
        C1661h80 c1661h80C;
        boolean z;
        IOException iOException;
        C1855j80 c1855j80A;
        int i;
        C1855j80 c1855j80A2;
        Long l;
        AbstractC2051l80 abstractC2051l80;
        long jI;
        AbstractC2051l80 abstractC2051l81;
        Long lValueOf;
        boolean z2;
        boolean z3;
        C1661h80 c1661h80;
        String str = "HTTP ";
        C2599qr c2599qr = d50.d;
        AbstractC1474fG.g(c2599qr);
        InterfaceC2695rr interfaceC2695rr = c2599qr.d;
        C2691rp c2691rp = c2599qr.b;
        A50 a50 = c2599qr.a;
        C50 c50 = c2599qr.g;
        C1951k70 c1951k70 = d50.e;
        AbstractC2340o70 abstractC2340o70 = c1951k70.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
                interfaceC2695rr.d(c1951k70);
                try {
                    try {
                        if (!AbstractC3045vW.y(c1951k70.b) || abstractC2340o70 == null) {
                            str = "HTTP ";
                            a50.k(c2599qr, true, false, null);
                            c1661h80C = null;
                            z = true;
                        } else {
                            if (AbstractC1899jh0.N("100-continue", c1951k70.c.a("Expect"), true)) {
                                try {
                                    interfaceC2695rr.b();
                                    c1661h80C = c2599qr.c(true);
                                    try {
                                        c2691rp.getClass();
                                        AbstractC1474fG.j(a50, "call");
                                        z2 = false;
                                    } catch (IOException e) {
                                        e = e;
                                        z = true;
                                        if (!(e instanceof C2577qg)) {
                                            throw e;
                                        }
                                        if (c2599qr.f) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (c1661h80C == null) {
                                            try {
                                                c1661h80C = c2599qr.c(false);
                                                AbstractC1474fG.g(c1661h80C);
                                                if (z) {
                                                    c2691rp.getClass();
                                                    AbstractC1474fG.j(a50, "call");
                                                    z = false;
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                if (iOException != null) {
                                                    throw e;
                                                }
                                                AbstractC3409z9.a(iOException, e);
                                                throw iOException;
                                            }
                                        }
                                        c1661h80C.a = c1951k70;
                                        c1661h80C.e = c50.e;
                                        c1661h80C.k = jCurrentTimeMillis;
                                        c1661h80C.l = System.currentTimeMillis();
                                        c1855j80A = c1661h80C.a();
                                        i = c1855j80A.f840o;
                                        if (i != 100) {
                                            C1661h80 c1661h80C2 = c2599qr.c(false);
                                            AbstractC1474fG.g(c1661h80C2);
                                            if (z) {
                                                c2691rp.getClass();
                                                AbstractC1474fG.j(a50, "call");
                                            }
                                            c1661h80C2.a = c1951k70;
                                            c1661h80C2.e = c50.e;
                                            c1661h80C2.k = jCurrentTimeMillis;
                                            c1661h80C2.l = System.currentTimeMillis();
                                            c1855j80A = c1661h80C2.a();
                                            i = c1855j80A.f840o;
                                        } else {
                                            C1661h80 c1661h80C3 = c2599qr.c(false);
                                            AbstractC1474fG.g(c1661h80C3);
                                            if (z) {
                                                c2691rp.getClass();
                                                AbstractC1474fG.j(a50, "call");
                                            }
                                            c1661h80C3.a = c1951k70;
                                            c1661h80C3.e = c50.e;
                                            c1661h80C3.k = jCurrentTimeMillis;
                                            c1661h80C3.l = System.currentTimeMillis();
                                            c1855j80A = c1661h80C3.a();
                                            i = c1855j80A.f840o;
                                        }
                                        c2691rp.getClass();
                                        AbstractC1474fG.j(a50, "call");
                                        if (this.a) {
                                            C1661h80 c1661h80Q = c1855j80A.q();
                                            c1661h80Q.g = c2599qr.b(c1855j80A);
                                            c1855j80A2 = c1661h80Q.a();
                                        } else {
                                            C1661h80 c1661h80Q2 = c1855j80A.q();
                                            c1661h80Q2.g = c2599qr.b(c1855j80A);
                                            c1855j80A2 = c1661h80Q2.a();
                                        }
                                        if (!AbstractC1899jh0.N("close", c1855j80A2.l.c.a("Connection"), true)) {
                                            l = null;
                                            if (AbstractC1899jh0.N("close", c1855j80A2.f("Connection", null), true)) {
                                            }
                                            if (i != 204) {
                                                abstractC2051l80 = c1855j80A2.r;
                                                if (abstractC2051l80 != null) {
                                                    jI = abstractC2051l80.i();
                                                } else {
                                                    jI = -1;
                                                }
                                                if (jI > 0) {
                                                    StringBuilder sb = new StringBuilder(str);
                                                    sb.append(i);
                                                    sb.append(" had non-zero Content-Length: ");
                                                    abstractC2051l81 = c1855j80A2.r;
                                                    if (abstractC2051l81 != null) {
                                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                                    } else {
                                                        lValueOf = l;
                                                    }
                                                    sb.append(lValueOf);
                                                    throw new ProtocolException(sb.toString());
                                                }
                                            } else {
                                                abstractC2051l80 = c1855j80A2.r;
                                                if (abstractC2051l80 != null) {
                                                    jI = abstractC2051l80.i();
                                                } else {
                                                    jI = -1;
                                                }
                                                if (jI > 0) {
                                                    StringBuilder sb2 = new StringBuilder(str);
                                                    sb2.append(i);
                                                    sb2.append(" had non-zero Content-Length: ");
                                                    abstractC2051l81 = c1855j80A2.r;
                                                    if (abstractC2051l81 != null) {
                                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                                    } else {
                                                        lValueOf = l;
                                                    }
                                                    sb2.append(lValueOf);
                                                    throw new ProtocolException(sb2.toString());
                                                }
                                            }
                                            return c1855j80A2;
                                        }
                                        l = null;
                                        interfaceC2695rr.h().l();
                                        if (i != 204) {
                                            abstractC2051l80 = c1855j80A2.r;
                                            if (abstractC2051l80 != null) {
                                                jI = abstractC2051l80.i();
                                            } else {
                                                jI = -1;
                                            }
                                            if (jI > 0) {
                                                StringBuilder sb3 = new StringBuilder(str);
                                                sb3.append(i);
                                                sb3.append(" had non-zero Content-Length: ");
                                                abstractC2051l81 = c1855j80A2.r;
                                                if (abstractC2051l81 != null) {
                                                    lValueOf = Long.valueOf(abstractC2051l81.i());
                                                } else {
                                                    lValueOf = l;
                                                }
                                                sb3.append(lValueOf);
                                                throw new ProtocolException(sb3.toString());
                                            }
                                        } else {
                                            abstractC2051l80 = c1855j80A2.r;
                                            if (abstractC2051l80 != null) {
                                                jI = abstractC2051l80.i();
                                            } else {
                                                jI = -1;
                                            }
                                            if (jI > 0) {
                                                StringBuilder sb4 = new StringBuilder(str);
                                                sb4.append(i);
                                                sb4.append(" had non-zero Content-Length: ");
                                                abstractC2051l81 = c1855j80A2.r;
                                                if (abstractC2051l81 != null) {
                                                    lValueOf = Long.valueOf(abstractC2051l81.i());
                                                } else {
                                                    lValueOf = l;
                                                }
                                                sb4.append(lValueOf);
                                                throw new ProtocolException(sb4.toString());
                                            }
                                        }
                                        return c1855j80A2;
                                    }
                                } catch (IOException e3) {
                                    c2691rp.getClass();
                                    AbstractC1474fG.j(a50, "call");
                                    c2599qr.d(e3);
                                    throw e3;
                                }
                            } else {
                                c1661h80C = null;
                                z2 = true;
                            }
                            try {
                                if (c1661h80C == null) {
                                    try {
                                        c2599qr.e = false;
                                        AbstractC2340o70 abstractC2340o71 = c1951k70.d;
                                        AbstractC1474fG.g(abstractC2340o71);
                                        c1661h80 = c1661h80C;
                                        z3 = z2;
                                        try {
                                            long jA = abstractC2340o71.a();
                                            c2691rp.getClass();
                                            AbstractC1474fG.j(a50, "call");
                                            str = "HTTP ";
                                            C3014v50 c3014v50F = Nr0.f(new C2405or(c2599qr, interfaceC2695rr.c(c1951k70, jA), jA));
                                            abstractC2340o70.c(c3014v50F);
                                            c3014v50F.close();
                                        } catch (IOException e4) {
                                            e = e4;
                                            str = "HTTP ";
                                            c1661h80C = c1661h80;
                                            z = z3;
                                            if (!(e instanceof C2577qg)) {
                                                throw e;
                                            }
                                            if (c2599qr.f) {
                                                throw e;
                                            }
                                            iOException = e;
                                            if (c1661h80C == null) {
                                                c1661h80C = c2599qr.c(false);
                                                AbstractC1474fG.g(c1661h80C);
                                                if (z) {
                                                    c2691rp.getClass();
                                                    AbstractC1474fG.j(a50, "call");
                                                    z = false;
                                                }
                                            }
                                            c1661h80C.a = c1951k70;
                                            c1661h80C.e = c50.e;
                                            c1661h80C.k = jCurrentTimeMillis;
                                            c1661h80C.l = System.currentTimeMillis();
                                            c1855j80A = c1661h80C.a();
                                            i = c1855j80A.f840o;
                                            if (i != 100) {
                                                C1661h80 c1661h80C4 = c2599qr.c(false);
                                                AbstractC1474fG.g(c1661h80C4);
                                                if (z) {
                                                    c2691rp.getClass();
                                                    AbstractC1474fG.j(a50, "call");
                                                }
                                                c1661h80C4.a = c1951k70;
                                                c1661h80C4.e = c50.e;
                                                c1661h80C4.k = jCurrentTimeMillis;
                                                c1661h80C4.l = System.currentTimeMillis();
                                                c1855j80A = c1661h80C4.a();
                                                i = c1855j80A.f840o;
                                            } else {
                                                C1661h80 c1661h80C5 = c2599qr.c(false);
                                                AbstractC1474fG.g(c1661h80C5);
                                                if (z) {
                                                    c2691rp.getClass();
                                                    AbstractC1474fG.j(a50, "call");
                                                }
                                                c1661h80C5.a = c1951k70;
                                                c1661h80C5.e = c50.e;
                                                c1661h80C5.k = jCurrentTimeMillis;
                                                c1661h80C5.l = System.currentTimeMillis();
                                                c1855j80A = c1661h80C5.a();
                                                i = c1855j80A.f840o;
                                            }
                                            c2691rp.getClass();
                                            AbstractC1474fG.j(a50, "call");
                                            if (this.a) {
                                                C1661h80 c1661h80Q3 = c1855j80A.q();
                                                c1661h80Q3.g = c2599qr.b(c1855j80A);
                                                c1855j80A2 = c1661h80Q3.a();
                                            } else {
                                                C1661h80 c1661h80Q4 = c1855j80A.q();
                                                c1661h80Q4.g = c2599qr.b(c1855j80A);
                                                c1855j80A2 = c1661h80Q4.a();
                                            }
                                            if (!AbstractC1899jh0.N("close", c1855j80A2.l.c.a("Connection"), true)) {
                                                l = null;
                                                if (AbstractC1899jh0.N("close", c1855j80A2.f("Connection", null), true)) {
                                                }
                                                if (i != 204) {
                                                    abstractC2051l80 = c1855j80A2.r;
                                                    if (abstractC2051l80 != null) {
                                                        jI = abstractC2051l80.i();
                                                    } else {
                                                        jI = -1;
                                                    }
                                                    if (jI > 0) {
                                                        StringBuilder sb5 = new StringBuilder(str);
                                                        sb5.append(i);
                                                        sb5.append(" had non-zero Content-Length: ");
                                                        abstractC2051l81 = c1855j80A2.r;
                                                        if (abstractC2051l81 != null) {
                                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                                        } else {
                                                            lValueOf = l;
                                                        }
                                                        sb5.append(lValueOf);
                                                        throw new ProtocolException(sb5.toString());
                                                    }
                                                } else {
                                                    abstractC2051l80 = c1855j80A2.r;
                                                    if (abstractC2051l80 != null) {
                                                        jI = abstractC2051l80.i();
                                                    } else {
                                                        jI = -1;
                                                    }
                                                    if (jI > 0) {
                                                        StringBuilder sb6 = new StringBuilder(str);
                                                        sb6.append(i);
                                                        sb6.append(" had non-zero Content-Length: ");
                                                        abstractC2051l81 = c1855j80A2.r;
                                                        if (abstractC2051l81 != null) {
                                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                                        } else {
                                                            lValueOf = l;
                                                        }
                                                        sb6.append(lValueOf);
                                                        throw new ProtocolException(sb6.toString());
                                                    }
                                                }
                                                return c1855j80A2;
                                            }
                                            l = null;
                                            interfaceC2695rr.h().l();
                                            if (i != 204) {
                                                abstractC2051l80 = c1855j80A2.r;
                                                if (abstractC2051l80 != null) {
                                                    jI = abstractC2051l80.i();
                                                } else {
                                                    jI = -1;
                                                }
                                                if (jI > 0) {
                                                    StringBuilder sb7 = new StringBuilder(str);
                                                    sb7.append(i);
                                                    sb7.append(" had non-zero Content-Length: ");
                                                    abstractC2051l81 = c1855j80A2.r;
                                                    if (abstractC2051l81 != null) {
                                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                                    } else {
                                                        lValueOf = l;
                                                    }
                                                    sb7.append(lValueOf);
                                                    throw new ProtocolException(sb7.toString());
                                                }
                                            } else {
                                                abstractC2051l80 = c1855j80A2.r;
                                                if (abstractC2051l80 != null) {
                                                    jI = abstractC2051l80.i();
                                                } else {
                                                    jI = -1;
                                                }
                                                if (jI > 0) {
                                                    StringBuilder sb8 = new StringBuilder(str);
                                                    sb8.append(i);
                                                    sb8.append(" had non-zero Content-Length: ");
                                                    abstractC2051l81 = c1855j80A2.r;
                                                    if (abstractC2051l81 != null) {
                                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                                    } else {
                                                        lValueOf = l;
                                                    }
                                                    sb8.append(lValueOf);
                                                    throw new ProtocolException(sb8.toString());
                                                }
                                            }
                                            return c1855j80A2;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        str = "HTTP ";
                                        c1661h80 = c1661h80C;
                                        z3 = z2;
                                    }
                                } else {
                                    str = "HTTP ";
                                    c1661h80 = c1661h80C;
                                    z3 = z2;
                                    a50.k(c2599qr, true, false, null);
                                    if (c50.g == null) {
                                        interfaceC2695rr.h().l();
                                    }
                                }
                                c1661h80C = c1661h80;
                                z = z3;
                            } catch (IOException e6) {
                                e = e6;
                            }
                        }
                        try {
                            interfaceC2695rr.a();
                            iOException = null;
                            if (c1661h80C == null) {
                                c1661h80C = c2599qr.c(false);
                                AbstractC1474fG.g(c1661h80C);
                                if (z) {
                                    c2691rp.getClass();
                                    AbstractC1474fG.j(a50, "call");
                                    z = false;
                                }
                            }
                            c1661h80C.a = c1951k70;
                            c1661h80C.e = c50.e;
                            c1661h80C.k = jCurrentTimeMillis;
                            c1661h80C.l = System.currentTimeMillis();
                            c1855j80A = c1661h80C.a();
                            i = c1855j80A.f840o;
                            if (i != 100 || (102 <= i && i < 200)) {
                                C1661h80 c1661h80C6 = c2599qr.c(false);
                                AbstractC1474fG.g(c1661h80C6);
                                if (z) {
                                    c2691rp.getClass();
                                    AbstractC1474fG.j(a50, "call");
                                }
                                c1661h80C6.a = c1951k70;
                                c1661h80C6.e = c50.e;
                                c1661h80C6.k = jCurrentTimeMillis;
                                c1661h80C6.l = System.currentTimeMillis();
                                c1855j80A = c1661h80C6.a();
                                i = c1855j80A.f840o;
                            }
                            c2691rp.getClass();
                            AbstractC1474fG.j(a50, "call");
                            try {
                                if (this.a || i != 101) {
                                    C1661h80 c1661h80Q5 = c1855j80A.q();
                                    c1661h80Q5.g = c2599qr.b(c1855j80A);
                                    c1855j80A2 = c1661h80Q5.a();
                                } else {
                                    C1661h80 c1661h80Q6 = c1855j80A.q();
                                    c1661h80Q6.g = Mr0.c;
                                    c1855j80A2 = c1661h80Q6.a();
                                }
                                if (!AbstractC1899jh0.N("close", c1855j80A2.l.c.a("Connection"), true)) {
                                    l = null;
                                    if (AbstractC1899jh0.N("close", c1855j80A2.f("Connection", null), true)) {
                                    }
                                    if (i != 204 || i == 205) {
                                        abstractC2051l80 = c1855j80A2.r;
                                        if (abstractC2051l80 != null) {
                                            jI = abstractC2051l80.i();
                                        } else {
                                            jI = -1;
                                        }
                                        if (jI > 0) {
                                            StringBuilder sb9 = new StringBuilder(str);
                                            sb9.append(i);
                                            sb9.append(" had non-zero Content-Length: ");
                                            abstractC2051l81 = c1855j80A2.r;
                                            if (abstractC2051l81 != null) {
                                                lValueOf = Long.valueOf(abstractC2051l81.i());
                                            } else {
                                                lValueOf = l;
                                            }
                                            sb9.append(lValueOf);
                                            throw new ProtocolException(sb9.toString());
                                        }
                                    }
                                    return c1855j80A2;
                                }
                                l = null;
                                interfaceC2695rr.h().l();
                                if (i != 204) {
                                    abstractC2051l80 = c1855j80A2.r;
                                    if (abstractC2051l80 != null) {
                                        jI = abstractC2051l80.i();
                                    } else {
                                        jI = -1;
                                    }
                                    if (jI > 0) {
                                        StringBuilder sb10 = new StringBuilder(str);
                                        sb10.append(i);
                                        sb10.append(" had non-zero Content-Length: ");
                                        abstractC2051l81 = c1855j80A2.r;
                                        if (abstractC2051l81 != null) {
                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                        } else {
                                            lValueOf = l;
                                        }
                                        sb10.append(lValueOf);
                                        throw new ProtocolException(sb10.toString());
                                    }
                                } else {
                                    abstractC2051l80 = c1855j80A2.r;
                                    if (abstractC2051l80 != null) {
                                        jI = abstractC2051l80.i();
                                    } else {
                                        jI = -1;
                                    }
                                    if (jI > 0) {
                                        StringBuilder sb11 = new StringBuilder(str);
                                        sb11.append(i);
                                        sb11.append(" had non-zero Content-Length: ");
                                        abstractC2051l81 = c1855j80A2.r;
                                        if (abstractC2051l81 != null) {
                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                        } else {
                                            lValueOf = l;
                                        }
                                        sb11.append(lValueOf);
                                        throw new ProtocolException(sb11.toString());
                                    }
                                }
                                return c1855j80A2;
                            } catch (IOException e7) {
                                e = e7;
                                if (iOException != null) {
                                    throw e;
                                }
                                AbstractC3409z9.a(iOException, e);
                                throw iOException;
                            }
                        } catch (IOException e8) {
                            try {
                                c2599qr.d(e8);
                                throw e8;
                            } catch (IOException e9) {
                                e = e9;
                                if (!(e instanceof C2577qg)) {
                                    throw e;
                                }
                                if (c2599qr.f) {
                                    throw e;
                                }
                                iOException = e;
                                if (c1661h80C == null) {
                                    c1661h80C = c2599qr.c(false);
                                    AbstractC1474fG.g(c1661h80C);
                                    if (z) {
                                        c2691rp.getClass();
                                        AbstractC1474fG.j(a50, "call");
                                        z = false;
                                    }
                                }
                                c1661h80C.a = c1951k70;
                                c1661h80C.e = c50.e;
                                c1661h80C.k = jCurrentTimeMillis;
                                c1661h80C.l = System.currentTimeMillis();
                                c1855j80A = c1661h80C.a();
                                i = c1855j80A.f840o;
                                if (i != 100) {
                                    C1661h80 c1661h80C7 = c2599qr.c(false);
                                    AbstractC1474fG.g(c1661h80C7);
                                    if (z) {
                                        c2691rp.getClass();
                                        AbstractC1474fG.j(a50, "call");
                                    }
                                    c1661h80C7.a = c1951k70;
                                    c1661h80C7.e = c50.e;
                                    c1661h80C7.k = jCurrentTimeMillis;
                                    c1661h80C7.l = System.currentTimeMillis();
                                    c1855j80A = c1661h80C7.a();
                                    i = c1855j80A.f840o;
                                } else {
                                    C1661h80 c1661h80C8 = c2599qr.c(false);
                                    AbstractC1474fG.g(c1661h80C8);
                                    if (z) {
                                        c2691rp.getClass();
                                        AbstractC1474fG.j(a50, "call");
                                    }
                                    c1661h80C8.a = c1951k70;
                                    c1661h80C8.e = c50.e;
                                    c1661h80C8.k = jCurrentTimeMillis;
                                    c1661h80C8.l = System.currentTimeMillis();
                                    c1855j80A = c1661h80C8.a();
                                    i = c1855j80A.f840o;
                                }
                                c2691rp.getClass();
                                AbstractC1474fG.j(a50, "call");
                                if (this.a) {
                                    C1661h80 c1661h80Q7 = c1855j80A.q();
                                    c1661h80Q7.g = c2599qr.b(c1855j80A);
                                    c1855j80A2 = c1661h80Q7.a();
                                } else {
                                    C1661h80 c1661h80Q8 = c1855j80A.q();
                                    c1661h80Q8.g = c2599qr.b(c1855j80A);
                                    c1855j80A2 = c1661h80Q8.a();
                                }
                                if (!AbstractC1899jh0.N("close", c1855j80A2.l.c.a("Connection"), true)) {
                                    l = null;
                                    if (AbstractC1899jh0.N("close", c1855j80A2.f("Connection", null), true)) {
                                    }
                                    if (i != 204) {
                                        abstractC2051l80 = c1855j80A2.r;
                                        if (abstractC2051l80 != null) {
                                            jI = abstractC2051l80.i();
                                        } else {
                                            jI = -1;
                                        }
                                        if (jI > 0) {
                                            StringBuilder sb12 = new StringBuilder(str);
                                            sb12.append(i);
                                            sb12.append(" had non-zero Content-Length: ");
                                            abstractC2051l81 = c1855j80A2.r;
                                            if (abstractC2051l81 != null) {
                                                lValueOf = Long.valueOf(abstractC2051l81.i());
                                            } else {
                                                lValueOf = l;
                                            }
                                            sb12.append(lValueOf);
                                            throw new ProtocolException(sb12.toString());
                                        }
                                    } else {
                                        abstractC2051l80 = c1855j80A2.r;
                                        if (abstractC2051l80 != null) {
                                            jI = abstractC2051l80.i();
                                        } else {
                                            jI = -1;
                                        }
                                        if (jI > 0) {
                                            StringBuilder sb13 = new StringBuilder(str);
                                            sb13.append(i);
                                            sb13.append(" had non-zero Content-Length: ");
                                            abstractC2051l81 = c1855j80A2.r;
                                            if (abstractC2051l81 != null) {
                                                lValueOf = Long.valueOf(abstractC2051l81.i());
                                            } else {
                                                lValueOf = l;
                                            }
                                            sb13.append(lValueOf);
                                            throw new ProtocolException(sb13.toString());
                                        }
                                    }
                                    return c1855j80A2;
                                }
                                l = null;
                                interfaceC2695rr.h().l();
                                if (i != 204) {
                                    abstractC2051l80 = c1855j80A2.r;
                                    if (abstractC2051l80 != null) {
                                        jI = abstractC2051l80.i();
                                    } else {
                                        jI = -1;
                                    }
                                    if (jI > 0) {
                                        StringBuilder sb14 = new StringBuilder(str);
                                        sb14.append(i);
                                        sb14.append(" had non-zero Content-Length: ");
                                        abstractC2051l81 = c1855j80A2.r;
                                        if (abstractC2051l81 != null) {
                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                        } else {
                                            lValueOf = l;
                                        }
                                        sb14.append(lValueOf);
                                        throw new ProtocolException(sb14.toString());
                                    }
                                } else {
                                    abstractC2051l80 = c1855j80A2.r;
                                    if (abstractC2051l80 != null) {
                                        jI = abstractC2051l80.i();
                                    } else {
                                        jI = -1;
                                    }
                                    if (jI > 0) {
                                        StringBuilder sb15 = new StringBuilder(str);
                                        sb15.append(i);
                                        sb15.append(" had non-zero Content-Length: ");
                                        abstractC2051l81 = c1855j80A2.r;
                                        if (abstractC2051l81 != null) {
                                            lValueOf = Long.valueOf(abstractC2051l81.i());
                                        } else {
                                            lValueOf = l;
                                        }
                                        sb15.append(lValueOf);
                                        throw new ProtocolException(sb15.toString());
                                    }
                                }
                                return c1855j80A2;
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        c1661h80C = null;
                        z = true;
                        if (!(e instanceof C2577qg)) {
                            throw e;
                        }
                        if (c2599qr.f) {
                            throw e;
                        }
                        iOException = e;
                        if (c1661h80C == null) {
                            c1661h80C = c2599qr.c(false);
                            AbstractC1474fG.g(c1661h80C);
                            if (z) {
                                c2691rp.getClass();
                                AbstractC1474fG.j(a50, "call");
                                z = false;
                            }
                        }
                        c1661h80C.a = c1951k70;
                        c1661h80C.e = c50.e;
                        c1661h80C.k = jCurrentTimeMillis;
                        c1661h80C.l = System.currentTimeMillis();
                        c1855j80A = c1661h80C.a();
                        i = c1855j80A.f840o;
                        if (i != 100) {
                            C1661h80 c1661h80C9 = c2599qr.c(false);
                            AbstractC1474fG.g(c1661h80C9);
                            if (z) {
                                c2691rp.getClass();
                                AbstractC1474fG.j(a50, "call");
                            }
                            c1661h80C9.a = c1951k70;
                            c1661h80C9.e = c50.e;
                            c1661h80C9.k = jCurrentTimeMillis;
                            c1661h80C9.l = System.currentTimeMillis();
                            c1855j80A = c1661h80C9.a();
                            i = c1855j80A.f840o;
                        } else {
                            C1661h80 c1661h80C10 = c2599qr.c(false);
                            AbstractC1474fG.g(c1661h80C10);
                            if (z) {
                                c2691rp.getClass();
                                AbstractC1474fG.j(a50, "call");
                            }
                            c1661h80C10.a = c1951k70;
                            c1661h80C10.e = c50.e;
                            c1661h80C10.k = jCurrentTimeMillis;
                            c1661h80C10.l = System.currentTimeMillis();
                            c1855j80A = c1661h80C10.a();
                            i = c1855j80A.f840o;
                        }
                        c2691rp.getClass();
                        AbstractC1474fG.j(a50, "call");
                        if (this.a) {
                            C1661h80 c1661h80Q9 = c1855j80A.q();
                            c1661h80Q9.g = c2599qr.b(c1855j80A);
                            c1855j80A2 = c1661h80Q9.a();
                        } else {
                            C1661h80 c1661h80Q10 = c1855j80A.q();
                            c1661h80Q10.g = c2599qr.b(c1855j80A);
                            c1855j80A2 = c1661h80Q10.a();
                        }
                        if (!AbstractC1899jh0.N("close", c1855j80A2.l.c.a("Connection"), true)) {
                            l = null;
                            if (AbstractC1899jh0.N("close", c1855j80A2.f("Connection", null), true)) {
                            }
                            if (i != 204) {
                                abstractC2051l80 = c1855j80A2.r;
                                if (abstractC2051l80 != null) {
                                    jI = abstractC2051l80.i();
                                } else {
                                    jI = -1;
                                }
                                if (jI > 0) {
                                    StringBuilder sb16 = new StringBuilder(str);
                                    sb16.append(i);
                                    sb16.append(" had non-zero Content-Length: ");
                                    abstractC2051l81 = c1855j80A2.r;
                                    if (abstractC2051l81 != null) {
                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                    } else {
                                        lValueOf = l;
                                    }
                                    sb16.append(lValueOf);
                                    throw new ProtocolException(sb16.toString());
                                }
                            } else {
                                abstractC2051l80 = c1855j80A2.r;
                                if (abstractC2051l80 != null) {
                                    jI = abstractC2051l80.i();
                                } else {
                                    jI = -1;
                                }
                                if (jI > 0) {
                                    StringBuilder sb17 = new StringBuilder(str);
                                    sb17.append(i);
                                    sb17.append(" had non-zero Content-Length: ");
                                    abstractC2051l81 = c1855j80A2.r;
                                    if (abstractC2051l81 != null) {
                                        lValueOf = Long.valueOf(abstractC2051l81.i());
                                    } else {
                                        lValueOf = l;
                                    }
                                    sb17.append(lValueOf);
                                    throw new ProtocolException(sb17.toString());
                                }
                            }
                            return c1855j80A2;
                        }
                        l = null;
                        interfaceC2695rr.h().l();
                        if (i != 204) {
                            abstractC2051l80 = c1855j80A2.r;
                            if (abstractC2051l80 != null) {
                                jI = abstractC2051l80.i();
                            } else {
                                jI = -1;
                            }
                            if (jI > 0) {
                                StringBuilder sb18 = new StringBuilder(str);
                                sb18.append(i);
                                sb18.append(" had non-zero Content-Length: ");
                                abstractC2051l81 = c1855j80A2.r;
                                if (abstractC2051l81 != null) {
                                    lValueOf = Long.valueOf(abstractC2051l81.i());
                                } else {
                                    lValueOf = l;
                                }
                                sb18.append(lValueOf);
                                throw new ProtocolException(sb18.toString());
                            }
                        } else {
                            abstractC2051l80 = c1855j80A2.r;
                            if (abstractC2051l80 != null) {
                                jI = abstractC2051l80.i();
                            } else {
                                jI = -1;
                            }
                            if (jI > 0) {
                                StringBuilder sb19 = new StringBuilder(str);
                                sb19.append(i);
                                sb19.append(" had non-zero Content-Length: ");
                                abstractC2051l81 = c1855j80A2.r;
                                if (abstractC2051l81 != null) {
                                    lValueOf = Long.valueOf(abstractC2051l81.i());
                                } else {
                                    lValueOf = l;
                                }
                                sb19.append(lValueOf);
                                throw new ProtocolException(sb19.toString());
                            }
                        }
                        return c1855j80A2;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (IOException e13) {
            c2691rp.getClass();
            AbstractC1474fG.j(a50, "call");
            c2599qr.d(e13);
            throw e13;
        }
    }
}
