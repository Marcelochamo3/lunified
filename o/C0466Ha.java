package o;

import io.sentry.C0032c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466Ha implements InterfaceC1181cG {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C0466Ha(InterfaceC0654Oh interfaceC0654Oh) {
        AbstractC1474fG.j(interfaceC0654Oh, "cookieJar");
        this.b = interfaceC0654Oh;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:104:0x0271  */
    /* JADX WARN: Code duplicated, block: B:107:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x028a  */
    /* JADX WARN: Code duplicated, block: B:117:0x029f  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x0318  */
    /* JADX WARN: Code duplicated, block: B:138:0x0323  */
    /* JADX WARN: Code duplicated, block: B:141:0x0334  */
    /* JADX WARN: Code duplicated, block: B:143:0x0338  */
    /* JADX WARN: Code duplicated, block: B:146:0x0346  */
    /* JADX WARN: Code duplicated, block: B:149:0x035e  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:153:0x0366  */
    /* JADX WARN: Code duplicated, block: B:154:0x0368  */
    /* JADX WARN: Code duplicated, block: B:156:0x036b  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:182:0x0405  */
    /* JADX WARN: Code duplicated, block: B:202:0x0469  */
    /* JADX WARN: Code duplicated, block: B:225:0x052b  */
    /* JADX WARN: Code duplicated, block: B:227:0x052f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0556  */
    /* JADX WARN: Code duplicated, block: B:247:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:269:0x0621  */
    /* JADX WARN: Code duplicated, block: B:306:0x0656 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0515 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final C1855j80 c(D50 d50) {
        C1855j80 c1855j80A;
        int i;
        long time;
        long time2;
        Date dateA;
        Date dateA2;
        String str;
        String str2;
        String str3;
        Date date;
        C1951k70 c1951k70;
        C2720s4 c2720s4;
        long millis;
        long jMin;
        String string;
        long time3;
        int i2;
        int i3;
        long millis2;
        String str4;
        long j;
        C1661h80 c1661h80Q;
        int i4;
        C1951k70 c1951k71;
        C1855j80 c1855j80;
        C0362Da c0362Da;
        A50 a50;
        A50 a51;
        AbstractC2051l80 abstractC2051l80;
        C1855j80 c1855j80B;
        C1855j80 c1855j80A2;
        String str5;
        C0336Ca c0336Ca;
        C0032c c0032c;
        AbstractC2051l80 abstractC2051l81;
        C2152mB c2152mB;
        C2152mB c2152mB2;
        ArrayList arrayList;
        int size;
        int i5;
        boolean z;
        int size2;
        int i6;
        C0284Aa c0284Aa;
        C0032c c0032cI;
        String strD;
        String strD2;
        String strH;
        AbstractC2051l80 abstractC2051l82;
        C0414Fa c0414FaW;
        A50 a52 = d50.a;
        C0362Da c0362Da2 = (C0362Da) this.b;
        if (c0362Da2 != null) {
            C1951k70 c1951k72 = d50.e;
            AbstractC1474fG.j(c1951k72, "request");
            C2446pE c2446pE = c1951k72.a;
            try {
                C1032an c1032anL = c0362Da2.l.l(AP.l(c2446pE));
                if (c1032anL == null) {
                    c1855j80A = null;
                } else {
                    try {
                        C0284Aa c0284Aa2 = new C0284Aa((InterfaceC2091lf0) c1032anL.n.get(0));
                        C2152mB c2152mB3 = c0284Aa2.b;
                        String str6 = c0284Aa2.c;
                        C2446pE c2446pE2 = c0284Aa2.a;
                        C2152mB c2152mB4 = c0284Aa2.g;
                        String strA = c2152mB4.a("Content-Type");
                        String strA2 = c2152mB4.a("Content-Length");
                        C0560Kq c0560Kq = new C0560Kq();
                        AbstractC1474fG.j(c2446pE2, "url");
                        c0560Kq.m = c2446pE2;
                        c0560Kq.m(str6, null);
                        AbstractC1474fG.j(c2152mB3, "headers");
                        c0560Kq.f370o = c2152mB3.f();
                        C1951k70 c1951k70C = c0560Kq.c();
                        C1661h80 c1661h80 = new C1661h80();
                        c1661h80.a = c1951k70C;
                        O30 o30 = c0284Aa2.d;
                        AbstractC1474fG.j(o30, "protocol");
                        c1661h80.b = o30;
                        c1661h80.c = c0284Aa2.e;
                        String str7 = c0284Aa2.f;
                        AbstractC1474fG.j(str7, "message");
                        c1661h80.d = str7;
                        c1661h80.c(c2152mB4);
                        c1661h80.g = new C3437za(c1032anL, strA, strA2);
                        c1661h80.e = c0284Aa2.h;
                        c1661h80.k = c0284Aa2.i;
                        c1661h80.l = c0284Aa2.j;
                        c1855j80A = c1661h80.a();
                        if (AbstractC1474fG.b(c2446pE2, c2446pE) && AbstractC1474fG.b(str6, c1951k72.b)) {
                            Set setY = AP.y(c1855j80A.q);
                            if (!setY.isEmpty()) {
                                Iterator it = setY.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str8 = (String) it.next();
                                        if (!AbstractC1474fG.b(c2152mB3.i(str8), c1951k72.c.i(str8))) {
                                        }
                                    }
                                }
                            }
                        }
                        AbstractC2051l80 abstractC2051l83 = c1855j80A.r;
                        if (abstractC2051l83 != null) {
                            Mr0.d(abstractC2051l83);
                        }
                    } catch (IOException unused) {
                        Mr0.d(c1032anL);
                    }
                    c1855j80A = null;
                }
            } catch (IOException unused2) {
            }
        } else {
            c1855j80A = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1951k70 c1951k73 = d50.e;
        AbstractC1474fG.j(c1951k73, "request");
        if (c1855j80A != null) {
            time = c1855j80A.v;
            time2 = c1855j80A.w;
            C2152mB c2152mB5 = c1855j80A.q;
            int size3 = c2152mB5.size();
            int i7 = 0;
            Date dateA3 = null;
            dateA = null;
            dateA2 = null;
            str = null;
            str2 = null;
            str3 = null;
            int iY = -1;
            while (i7 < size3) {
                String strD3 = c2152mB5.d(i7);
                Date date2 = dateA3;
                String strH2 = c2152mB5.h(i7);
                long j2 = time;
                if (AbstractC1899jh0.N(strD3, "Date", true)) {
                    str3 = strH2;
                    dateA3 = AbstractC0319Bj.a(strH2);
                } else {
                    if (AbstractC1899jh0.N(strD3, "Expires", true)) {
                        dateA2 = AbstractC0319Bj.a(strH2);
                    } else if (AbstractC1899jh0.N(strD3, "Last-Modified", true)) {
                        dateA = AbstractC0319Bj.a(strH2);
                        str2 = strH2;
                    } else if (AbstractC1899jh0.N(strD3, "ETag", true)) {
                        str = strH2;
                    } else if (AbstractC1899jh0.N(strD3, "Age", true)) {
                        iY = Mr0.y(-1, strH2);
                    }
                    dateA3 = date2;
                }
                i7++;
                time = j2;
            }
            date = dateA3;
            i = iY;
        } else {
            i = -1;
            time = 0;
            time2 = 0;
            dateA = null;
            dateA2 = null;
            str = null;
            str2 = null;
            str3 = null;
            date = null;
        }
        if (c1855j80A != null) {
            Object obj = null;
            int i8 = 10;
            if (!(c1951k73.a.j && c1855j80A.p == null) && AbstractC1459f50.B(c1855j80A, c1951k73)) {
                C0414Fa c0414FaW2 = c1951k73.f;
                if (c0414FaW2 == null) {
                    int i9 = C0414Fa.n;
                    c0414FaW2 = AbstractC3045vW.w(c1951k73.c);
                    c1951k73.f = c0414FaW2;
                }
                if (c0414FaW2.a) {
                    c1951k70 = c1951k73;
                    a52 = a52;
                    c2720s4 = new C2720s4(c1951k70, 10, null);
                } else {
                    String str9 = "If-Modified-Since";
                    if (c1951k73.c.a("If-Modified-Since") == null && c1951k73.c.a("If-None-Match") == null) {
                        C0414Fa c0414FaA = c1855j80A.a();
                        long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                        if (i != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                        }
                        long j3 = jMax + (time2 - time) + (jCurrentTimeMillis - time2);
                        int i10 = c1855j80A.a().c;
                        if (i10 != -1) {
                            time3 = TimeUnit.SECONDS.toMillis(i10);
                        } else {
                            if (dateA2 != null) {
                                if (date != null) {
                                    time2 = date.getTime();
                                }
                                time3 = dateA2.getTime() - time2;
                                if (time3 <= 0) {
                                    time3 = 0;
                                }
                            } else if (dateA == null) {
                                millis = 0;
                                jMin = millis;
                            } else {
                                List list = c1855j80A.l.a.g;
                                if (list == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    C0622Nb.J(list, sb);
                                    string = sb.toString();
                                }
                                if (string == null) {
                                    if (date != null) {
                                        time = date.getTime();
                                    }
                                    long time4 = time - dateA.getTime();
                                    millis = 0;
                                    if (time4 > 0) {
                                        jMin = time4 / ((long) 10);
                                    }
                                } else {
                                    millis = 0;
                                }
                                jMin = millis;
                            }
                            i2 = c0414FaW2.c;
                            if (i2 != -1) {
                                jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i2));
                            }
                            i3 = c0414FaW2.i;
                            if (i3 != -1) {
                                millis2 = TimeUnit.SECONDS.toMillis(i3);
                            } else {
                                millis2 = millis;
                            }
                            if (!c0414FaA.g && (i4 = c0414FaW2.h) != -1) {
                                millis = TimeUnit.SECONDS.toMillis(i4);
                            }
                            if (c0414FaA.a) {
                                if (str != null) {
                                    str9 = "If-None-Match";
                                    str4 = str;
                                } else if (dateA != null) {
                                    str4 = str2;
                                } else if (date != null) {
                                    str4 = str3;
                                } else {
                                    c1951k70 = c1951k73;
                                    c2720s4 = new C2720s4(c1951k70, 10, null);
                                }
                                c1951k70 = c1951k73;
                                C2112lq c2112lqF = c1951k70.c.f();
                                AbstractC1474fG.g(str4);
                                c2112lqF.d(str9, str4);
                                C0560Kq c0560KqA = c1951k70.a();
                                c0560KqA.f370o = c2112lqF.f().f();
                                c2720s4 = new C2720s4(c0560KqA.c(), 10, c1855j80A);
                            } else {
                                j = millis2 + j3;
                                if (j < millis + jMin) {
                                    c1661h80Q = c1855j80A.q();
                                    if (j >= jMin) {
                                        c1661h80Q.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000 && c1855j80A.a().c == -1 && dateA2 == null) {
                                        c1661h80Q.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    c2720s4 = new C2720s4(null, 10, c1661h80Q.a());
                                    c1951k70 = c1951k73;
                                } else {
                                    if (str != null) {
                                        str9 = "If-None-Match";
                                        str4 = str;
                                    } else if (dateA != null) {
                                        str4 = str2;
                                    } else if (date != null) {
                                        str4 = str3;
                                    } else {
                                        c1951k70 = c1951k73;
                                        c2720s4 = new C2720s4(c1951k70, 10, null);
                                    }
                                    c1951k70 = c1951k73;
                                    C2112lq c2112lqF2 = c1951k70.c.f();
                                    AbstractC1474fG.g(str4);
                                    c2112lqF2.d(str9, str4);
                                    C0560Kq c0560KqA2 = c1951k70.a();
                                    c0560KqA2.f370o = c2112lqF2.f().f();
                                    c2720s4 = new C2720s4(c0560KqA2.c(), 10, c1855j80A);
                                }
                            }
                        }
                        jMin = time3;
                        millis = 0;
                        i2 = c0414FaW2.c;
                        if (i2 != -1) {
                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i2));
                        }
                        i3 = c0414FaW2.i;
                        if (i3 != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(i3);
                        } else {
                            millis2 = millis;
                        }
                        if (!c0414FaA.g) {
                            millis = TimeUnit.SECONDS.toMillis(i4);
                        }
                        if (c0414FaA.a) {
                            j = millis2 + j3;
                            if (j < millis + jMin) {
                                c1661h80Q = c1855j80A.q();
                                if (j >= jMin) {
                                    c1661h80Q.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    c1661h80Q.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c2720s4 = new C2720s4(null, 10, c1661h80Q.a());
                                c1951k70 = c1951k73;
                            } else {
                                if (str != null) {
                                    str9 = "If-None-Match";
                                    str4 = str;
                                } else if (dateA != null) {
                                    str4 = str2;
                                } else if (date != null) {
                                    str4 = str3;
                                } else {
                                    c1951k70 = c1951k73;
                                    c2720s4 = new C2720s4(c1951k70, 10, null);
                                }
                                c1951k70 = c1951k73;
                                C2112lq c2112lqF3 = c1951k70.c.f();
                                AbstractC1474fG.g(str4);
                                c2112lqF3.d(str9, str4);
                                C0560Kq c0560KqA3 = c1951k70.a();
                                c0560KqA3.f370o = c2112lqF3.f().f();
                                c2720s4 = new C2720s4(c0560KqA3.c(), 10, c1855j80A);
                            }
                        } else {
                            if (str != null) {
                                str9 = "If-None-Match";
                                str4 = str;
                            } else if (dateA != null) {
                                str4 = str2;
                            } else if (date != null) {
                                str4 = str3;
                            } else {
                                c1951k70 = c1951k73;
                                c2720s4 = new C2720s4(c1951k70, 10, null);
                            }
                            c1951k70 = c1951k73;
                            C2112lq c2112lqF4 = c1951k70.c.f();
                            AbstractC1474fG.g(str4);
                            c2112lqF4.d(str9, str4);
                            C0560Kq c0560KqA4 = c1951k70.a();
                            c0560KqA4.f370o = c2112lqF4.f().f();
                            c2720s4 = new C2720s4(c0560KqA4.c(), 10, c1855j80A);
                        }
                    } else {
                        c1951k70 = c1951k73;
                        a52 = a52;
                        c2720s4 = new C2720s4(c1951k70, 10, null);
                    }
                }
            } else {
                c2720s4 = new C2720s4(c1951k73, i8, obj);
            }
            if (((C1951k70) c2720s4.m) != null) {
                c0414FaW = c1951k70.f;
                if (c0414FaW == null) {
                    int i11 = C0414Fa.n;
                    c0414FaW = AbstractC3045vW.w(c1951k70.c);
                    c1951k70.f = c0414FaW;
                }
                if (c0414FaW.j) {
                    Object obj2 = null;
                    c2720s4 = new C2720s4(obj2, 10, obj2);
                }
            }
            c1951k71 = (C1951k70) c2720s4.m;
            c1855j80 = (C1855j80) c2720s4.n;
            c0362Da = (C0362Da) this.b;
            if (c0362Da != null) {
                synchronized (c0362Da) {
                }
            }
            a50 = a52;
            if (a50 instanceof A50) {
                a51 = a50;
            } else {
                a51 = null;
            }
            if (a51 != null) {
                C2691rp c2691rp = a51.p;
            }
            if (c1855j80A != null && c1855j80 == null && (abstractC2051l82 = c1855j80A.r) != null) {
                Mr0.d(abstractC2051l82);
            }
            if (c1951k71 != null && c1855j80 == null) {
                C1661h80 c1661h81 = new C1661h80();
                C1951k70 c1951k74 = d50.e;
                AbstractC1474fG.j(c1951k74, "request");
                c1661h81.a = c1951k74;
                c1661h81.b = O30.HTTP_1_1;
                c1661h81.c = 504;
                c1661h81.d = "Unsatisfiable Request (only-if-cached)";
                c1661h81.g = Mr0.c;
                c1661h81.k = -1L;
                c1661h81.l = System.currentTimeMillis();
                C1855j80 c1855j80A3 = c1661h81.a();
                AbstractC1474fG.j(a50, "call");
                return c1855j80A3;
            }
            if (c1951k71 == null) {
                AbstractC1474fG.g(c1855j80);
                C1661h80 c1661h80Q2 = c1855j80.q();
                C1855j80 c1855j80H = O9.h(c1855j80);
                C1661h80.b("cacheResponse", c1855j80H);
                c1661h80Q2.i = c1855j80H;
                C1855j80 c1855j80A4 = c1661h80Q2.a();
                AbstractC1474fG.j(a50, "call");
                return c1855j80A4;
            }
            if (c1855j80 == null || ((C0362Da) this.b) != null) {
                AbstractC1474fG.j(a50, "call");
            }
            try {
                c1855j80B = d50.b(c1951k71);
                if (c1855j80 != null) {
                    if (c1855j80B.f840o == 304) {
                        C1661h80 c1661h80Q3 = c1855j80.q();
                        c2152mB = c1855j80.q;
                        c2152mB2 = c1855j80B.q;
                        arrayList = new ArrayList(20);
                        size = c2152mB.size();
                        for (i5 = 0; i5 < size; i5++) {
                            strD2 = c2152mB.d(i5);
                            strH = c2152mB.h(i5);
                            if ((AbstractC1899jh0.N("Warning", strD2, true) || !AbstractC1899jh0.U(strH, "1", false)) && (AbstractC1899jh0.N("Content-Length", strD2, true) || AbstractC1899jh0.N("Content-Encoding", strD2, true) || AbstractC1899jh0.N("Content-Type", strD2, true) || !O9.y(strD2) || c2152mB2.a(strD2) == null)) {
                                AbstractC1474fG.j(strD2, "name");
                                AbstractC1474fG.j(strH, "value");
                                arrayList.add(strD2);
                                arrayList.add(AbstractC1119bh0.E0(strH).toString());
                            }
                        }
                        z = true;
                        size2 = c2152mB2.size();
                        i6 = 0;
                        while (i6 < size2) {
                            strD = c2152mB2.d(i6);
                            if (AbstractC1899jh0.N("Content-Length", strD, z) && !AbstractC1899jh0.N("Content-Encoding", strD, z) && !AbstractC1899jh0.N("Content-Type", strD, z) && O9.y(strD)) {
                                String strH3 = c2152mB2.h(i6);
                                AbstractC1474fG.j(strD, "name");
                                AbstractC1474fG.j(strH3, "value");
                                arrayList.add(strD);
                                arrayList.add(AbstractC1119bh0.E0(strH3).toString());
                            }
                            i6++;
                            z = true;
                        }
                        c1661h80Q3.c(new C2152mB((String[]) arrayList.toArray(new String[0])));
                        c1661h80Q3.k = c1855j80B.v;
                        c1661h80Q3.l = c1855j80B.w;
                        C1855j80 c1855j80H2 = O9.h(c1855j80);
                        C1661h80.b("cacheResponse", c1855j80H2);
                        c1661h80Q3.i = c1855j80H2;
                        C1855j80 c1855j80H3 = O9.h(c1855j80B);
                        C1661h80.b("networkResponse", c1855j80H3);
                        c1661h80Q3.h = c1855j80H3;
                        C1855j80 c1855j80A5 = c1661h80Q3.a();
                        AbstractC2051l80 abstractC2051l84 = c1855j80B.r;
                        AbstractC1474fG.g(abstractC2051l84);
                        abstractC2051l84.close();
                        C0362Da c0362Da3 = (C0362Da) this.b;
                        AbstractC1474fG.g(c0362Da3);
                        c0362Da3.f();
                        ((C0362Da) this.b).getClass();
                        c0284Aa = new C0284Aa(c1855j80A5);
                        AbstractC2051l80 abstractC2051l85 = c1855j80.r;
                        AbstractC1474fG.h(abstractC2051l85, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                        C1032an c1032an = ((C3437za) abstractC2051l85).m;
                        try {
                            c0032cI = c1032an.f679o.i(c1032an.m, c1032an.l);
                            if (c0032cI != null) {
                                try {
                                    c0284Aa.c(c0032cI);
                                    c0032cI.i();
                                } catch (IOException unused3) {
                                    if (c0032cI != null) {
                                        try {
                                            c0032cI.e();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException unused5) {
                            c0032cI = null;
                        }
                        AbstractC1474fG.j(a50, "call");
                        return c1855j80A5;
                    }
                    abstractC2051l81 = c1855j80.r;
                    if (abstractC2051l81 != null) {
                        Mr0.d(abstractC2051l81);
                    }
                }
                C1661h80 c1661h80Q4 = c1855j80B.q();
                C1855j80 c1855j80H4 = O9.h(c1855j80);
                C1661h80.b("cacheResponse", c1855j80H4);
                c1661h80Q4.i = c1855j80H4;
                C1855j80 c1855j80H5 = O9.h(c1855j80B);
                C1661h80.b("networkResponse", c1855j80H5);
                c1661h80Q4.h = c1855j80H5;
                c1855j80A2 = c1661h80Q4.a();
                if (((C0362Da) this.b) != null) {
                    if (!AbstractC1960kE.a(c1855j80A2) && AbstractC1459f50.B(c1855j80A2, c1951k71)) {
                        C0362Da c0362Da4 = (C0362Da) this.b;
                        c0362Da4.getClass();
                        C1951k70 c1951k75 = c1855j80A2.l;
                        String str10 = c1951k75.b;
                        AbstractC1474fG.j(str10, "method");
                        try {
                            if (!AbstractC1474fG.b(str10, "POST") && !AbstractC1474fG.b(str10, "PATCH") && !AbstractC1474fG.b(str10, "PUT") && !AbstractC1474fG.b(str10, "DELETE") && !AbstractC1474fG.b(str10, "MOVE")) {
                                if (AbstractC1474fG.b(str10, "GET") && !AP.y(c1855j80A2.q).contains("*")) {
                                    C0284Aa c0284Aa3 = new C0284Aa(c1855j80A2);
                                    try {
                                        C1227cn c1227cn = c0362Da4.l;
                                        String strL = AP.l(c1951k75.a);
                                        I60 i60 = C1227cn.E;
                                        C0032c c0032cI2 = c1227cn.i(-1L, strL);
                                        if (c0032cI2 == null) {
                                            c0336Ca = null;
                                        } else {
                                            try {
                                                c0284Aa3.c(c0032cI2);
                                                c0336Ca = new C0336Ca(c0362Da4, c0032cI2);
                                            } catch (IOException unused6) {
                                                c0032c = c0032cI2;
                                                if (c0032c != null) {
                                                    c0032c.e();
                                                }
                                                c0336Ca = null;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                        c0032c = null;
                                    }
                                } else {
                                    c0336Ca = null;
                                }
                                if (c0336Ca != null) {
                                    C0310Ba c0310Ba = c0336Ca.c;
                                    AbstractC2051l80 abstractC2051l86 = c1855j80A2.r;
                                    AbstractC1474fG.g(abstractC2051l86);
                                    C0440Ga c0440Ga = new C0440Ga(abstractC2051l86.p(), c0336Ca, Nr0.f(c0310Ba));
                                    String strF = c1855j80A2.f("Content-Type", null);
                                    long jI = c1855j80A2.r.i();
                                    C1661h80 c1661h80Q5 = c1855j80A2.q();
                                    c1661h80Q5.g = new E50(strF, jI, Nr0.g(c0440Ga), 0);
                                    c1855j80A2 = c1661h80Q5.a();
                                }
                                if (c1855j80 != null) {
                                    AbstractC1474fG.j(a50, "call");
                                }
                                return c1855j80A2;
                            }
                            c0362Da4.a(c1951k75);
                        } catch (IOException unused8) {
                        }
                        c0336Ca = null;
                        if (c0336Ca != null) {
                            C0310Ba c0310Ba2 = c0336Ca.c;
                            AbstractC2051l80 abstractC2051l87 = c1855j80A2.r;
                            AbstractC1474fG.g(abstractC2051l87);
                            C0440Ga c0440Ga2 = new C0440Ga(abstractC2051l87.p(), c0336Ca, Nr0.f(c0310Ba2));
                            String strF2 = c1855j80A2.f("Content-Type", null);
                            long jI2 = c1855j80A2.r.i();
                            C1661h80 c1661h80Q6 = c1855j80A2.q();
                            c1661h80Q6.g = new E50(strF2, jI2, Nr0.g(c0440Ga2), 0);
                            c1855j80A2 = c1661h80Q6.a();
                        }
                        if (c1855j80 != null) {
                            AbstractC1474fG.j(a50, "call");
                        }
                        return c1855j80A2;
                    }
                    str5 = c1951k71.b;
                    AbstractC1474fG.j(str5, "method");
                    if (AbstractC1474fG.b(str5, "POST") || AbstractC1474fG.b(str5, "PATCH") || AbstractC1474fG.b(str5, "PUT") || AbstractC1474fG.b(str5, "DELETE") || AbstractC1474fG.b(str5, "MOVE")) {
                        try {
                            ((C0362Da) this.b).a(c1951k71);
                        } catch (IOException unused9) {
                        }
                    }
                }
                return c1855j80A2;
            } catch (Throwable th) {
                if (c1855j80A == null || (abstractC2051l80 = c1855j80A.r) == null) {
                    throw th;
                }
                Mr0.d(abstractC2051l80);
                throw th;
            }
        }
        c2720s4 = new C2720s4(c1951k73, 10, null);
        c1951k70 = c1951k73;
        a52 = a52;
        if (((C1951k70) c2720s4.m) != null) {
            c0414FaW = c1951k70.f;
            if (c0414FaW == null) {
                int i12 = C0414Fa.n;
                c0414FaW = AbstractC3045vW.w(c1951k70.c);
                c1951k70.f = c0414FaW;
            }
            if (c0414FaW.j) {
                Object obj3 = null;
                c2720s4 = new C2720s4(obj3, 10, obj3);
            }
        }
        c1951k71 = (C1951k70) c2720s4.m;
        c1855j80 = (C1855j80) c2720s4.n;
        c0362Da = (C0362Da) this.b;
        if (c0362Da != null) {
            synchronized (c0362Da) {
            }
        }
        a50 = a52;
        if (a50 instanceof A50) {
            a51 = a50;
        } else {
            a51 = null;
        }
        if (a51 != null) {
            C2691rp c2691rp2 = a51.p;
        }
        if (c1855j80A != null) {
            Mr0.d(abstractC2051l82);
        }
        if (c1951k71 != null) {
        }
        if (c1951k71 == null) {
            AbstractC1474fG.g(c1855j80);
            C1661h80 c1661h80Q7 = c1855j80.q();
            C1855j80 c1855j80H6 = O9.h(c1855j80);
            C1661h80.b("cacheResponse", c1855j80H6);
            c1661h80Q7.i = c1855j80H6;
            C1855j80 c1855j80A6 = c1661h80Q7.a();
            AbstractC1474fG.j(a50, "call");
            return c1855j80A6;
        }
        if (c1855j80 == null) {
            AbstractC1474fG.j(a50, "call");
        } else {
            AbstractC1474fG.j(a50, "call");
        }
        c1855j80B = d50.b(c1951k71);
        if (c1855j80 != null) {
            if (c1855j80B.f840o == 304) {
                C1661h80 c1661h80Q8 = c1855j80.q();
                c2152mB = c1855j80.q;
                c2152mB2 = c1855j80B.q;
                arrayList = new ArrayList(20);
                size = c2152mB.size();
                while (i5 < size) {
                    strD2 = c2152mB.d(i5);
                    strH = c2152mB.h(i5);
                    if (AbstractC1899jh0.N("Warning", strD2, true)) {
                        AbstractC1474fG.j(strD2, "name");
                        AbstractC1474fG.j(strH, "value");
                        arrayList.add(strD2);
                        arrayList.add(AbstractC1119bh0.E0(strH).toString());
                    } else {
                        AbstractC1474fG.j(strD2, "name");
                        AbstractC1474fG.j(strH, "value");
                        arrayList.add(strD2);
                        arrayList.add(AbstractC1119bh0.E0(strH).toString());
                    }
                }
                z = true;
                size2 = c2152mB2.size();
                i6 = 0;
                while (i6 < size2) {
                    strD = c2152mB2.d(i6);
                    if (AbstractC1899jh0.N("Content-Length", strD, z)) {
                    }
                    i6++;
                    z = true;
                }
                c1661h80Q8.c(new C2152mB((String[]) arrayList.toArray(new String[0])));
                c1661h80Q8.k = c1855j80B.v;
                c1661h80Q8.l = c1855j80B.w;
                C1855j80 c1855j80H7 = O9.h(c1855j80);
                C1661h80.b("cacheResponse", c1855j80H7);
                c1661h80Q8.i = c1855j80H7;
                C1855j80 c1855j80H8 = O9.h(c1855j80B);
                C1661h80.b("networkResponse", c1855j80H8);
                c1661h80Q8.h = c1855j80H8;
                C1855j80 c1855j80A7 = c1661h80Q8.a();
                AbstractC2051l80 abstractC2051l88 = c1855j80B.r;
                AbstractC1474fG.g(abstractC2051l88);
                abstractC2051l88.close();
                C0362Da c0362Da5 = (C0362Da) this.b;
                AbstractC1474fG.g(c0362Da5);
                c0362Da5.f();
                ((C0362Da) this.b).getClass();
                c0284Aa = new C0284Aa(c1855j80A7);
                AbstractC2051l80 abstractC2051l89 = c1855j80.r;
                AbstractC1474fG.h(abstractC2051l89, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                C1032an c1032an2 = ((C3437za) abstractC2051l89).m;
                c0032cI = c1032an2.f679o.i(c1032an2.m, c1032an2.l);
                if (c0032cI != null) {
                    c0284Aa.c(c0032cI);
                    c0032cI.i();
                }
                AbstractC1474fG.j(a50, "call");
                return c1855j80A7;
            }
            abstractC2051l81 = c1855j80.r;
            if (abstractC2051l81 != null) {
                Mr0.d(abstractC2051l81);
            }
        }
        C1661h80 c1661h80Q9 = c1855j80B.q();
        C1855j80 c1855j80H9 = O9.h(c1855j80);
        C1661h80.b("cacheResponse", c1855j80H9);
        c1661h80Q9.i = c1855j80H9;
        C1855j80 c1855j80H10 = O9.h(c1855j80B);
        C1661h80.b("networkResponse", c1855j80H10);
        c1661h80Q9.h = c1855j80H10;
        c1855j80A2 = c1661h80Q9.a();
        if (((C0362Da) this.b) != null) {
            if (!AbstractC1960kE.a(c1855j80A2)) {
            }
            str5 = c1951k71.b;
            AbstractC1474fG.j(str5, "method");
            if (AbstractC1474fG.b(str5, "POST")) {
                ((C0362Da) this.b).a(c1951k71);
            } else {
                ((C0362Da) this.b).a(c1951k71);
            }
        }
        return c1855j80A2;
    }

    public static int e(C1855j80 c1855j80, int i) {
        String strF = c1855j80.f("Retry-After", null);
        if (strF == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strF).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strF);
        AbstractC1474fG.i(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) throws Throwable {
        boolean z;
        AbstractC2051l80 abstractC2051l80;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C3150wc c3150wc;
        switch (this.a) {
            case 0:
                return c(d50);
            case 1:
                C1951k70 c1951k70 = d50.e;
                C0560Kq c0560KqA = c1951k70.a();
                AbstractC2340o70 abstractC2340o70 = c1951k70.d;
                if (abstractC2340o70 != null) {
                    TP tpB = abstractC2340o70.b();
                    if (tpB != null) {
                        c0560KqA.j("Content-Type", tpB.a);
                    }
                    long jA = abstractC2340o70.a();
                    if (jA != -1) {
                        c0560KqA.j("Content-Length", String.valueOf(jA));
                        c0560KqA.n("Transfer-Encoding");
                    } else {
                        c0560KqA.j("Transfer-Encoding", "chunked");
                        c0560KqA.n("Content-Length");
                    }
                }
                C2152mB c2152mB = c1951k70.c;
                String strA = c2152mB.a("Host");
                C2446pE c2446pE = c1951k70.a;
                if (strA == null) {
                    c0560KqA.j("Host", Mr0.w(c2446pE, false));
                }
                if (c2152mB.a("Connection") == null) {
                    c0560KqA.j("Connection", "Keep-Alive");
                }
                if (c2152mB.a("Accept-Encoding") == null && c2152mB.a("Range") == null) {
                    c0560KqA.j("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC0654Oh interfaceC0654Oh = (InterfaceC0654Oh) this.b;
                List listH = interfaceC0654Oh.h(c2446pE);
                if (!listH.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (Object obj : listH) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0937Ze.N();
                            throw null;
                        }
                        C0628Nh c0628Nh = (C0628Nh) obj;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(c0628Nh.a);
                        sb.append('=');
                        sb.append(c0628Nh.b);
                        i = i2;
                    }
                    String string = sb.toString();
                    AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
                    c0560KqA.j("Cookie", string);
                }
                if (c2152mB.a("User-Agent") == null) {
                    c0560KqA.j("User-Agent", "okhttp/4.12.0");
                }
                C1855j80 c1855j80B = d50.b(c0560KqA.c());
                C2152mB c2152mB2 = c1855j80B.q;
                AbstractC1960kE.b(interfaceC0654Oh, c2446pE, c2152mB2);
                C1661h80 c1661h80Q = c1855j80B.q();
                c1661h80Q.a = c1951k70;
                if (z && AbstractC1899jh0.N("gzip", c1855j80B.f("Content-Encoding", null), true) && AbstractC1960kE.a(c1855j80B) && (abstractC2051l80 = c1855j80B.r) != null) {
                    JA ja = new JA(abstractC2051l80.p());
                    C2112lq c2112lqF = c2152mB2.f();
                    c2112lqF.n("Content-Encoding");
                    c2112lqF.n("Content-Length");
                    c1661h80Q.c(c2112lqF.f());
                    c1661h80Q.g = new E50(c1855j80B.f("Content-Type", null), -1L, Nr0.g(ja), 0);
                }
                return c1661h80Q.a();
            default:
                C1951k70 c1951k71 = d50.e;
                A50 a50 = d50.a;
                boolean z2 = true;
                List listN0 = C1233cq.l;
                C1855j80 c1855j80 = null;
                int i3 = 0;
                C1951k70 c1951k70B = c1951k71;
                boolean z3 = true;
                while (true) {
                    a50.getClass();
                    AbstractC1474fG.j(c1951k70B, "request");
                    if (a50.w != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    synchronized (a50) {
                        try {
                            if (!(a50.y ^ z2)) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                            }
                            if (!(a50.x ^ z2)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z3) {
                        io.sentry.android.core.internal.util.d dVar = a50.f162o;
                        C2446pE c2446pE2 = c1951k70B.a;
                        boolean z4 = c2446pE2.j;
                        OV ov = a50.l;
                        if (z4) {
                            SSLSocketFactory sSLSocketFactory2 = ov.B;
                            if (sSLSocketFactory2 == null) {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                            HostnameVerifier hostnameVerifier2 = ov.F;
                            c3150wc = ov.G;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            c3150wc = null;
                        }
                        a50.t = new C2792sr(dVar, new C1159c2(c2446pE2.d, c2446pE2.e, ov.w, ov.A, sSLSocketFactory, hostnameVerifier, c3150wc, ov.z, ov.x, ov.E, ov.D, ov.y), a50, a50.p);
                    }
                    try {
                        if (a50.A) {
                            throw new IOException("Canceled");
                        }
                        try {
                            try {
                                try {
                                    C1855j80 c1855j80B2 = d50.b(c1951k70B);
                                    if (c1855j80 != null) {
                                        C1661h80 c1661h80Q2 = c1855j80B2.q();
                                        C1661h80 c1661h80Q3 = c1855j80.q();
                                        c1661h80Q3.g = null;
                                        C1855j80 c1855j80A = c1661h80Q3.a();
                                        if (c1855j80A.r != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                                        }
                                        c1661h80Q2.j = c1855j80A;
                                        c1855j80B2 = c1661h80Q2.a();
                                    }
                                    c1855j80 = c1855j80B2;
                                    C2599qr c2599qr = a50.w;
                                    try {
                                        c1951k70B = b(c1855j80, c2599qr);
                                        if (c1951k70B == null) {
                                            if (c2599qr != null && c2599qr.e) {
                                                if (!(!a50.v)) {
                                                    throw new IllegalStateException("Check failed.".toString());
                                                }
                                                a50.v = true;
                                                a50.q.i();
                                            }
                                            a50.h(false);
                                            return c1855j80;
                                        }
                                        AbstractC2051l80 abstractC2051l81 = c1855j80.r;
                                        if (abstractC2051l81 != null) {
                                            Mr0.d(abstractC2051l81);
                                        }
                                        i3++;
                                        if (i3 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i3);
                                        }
                                        a50.h(true);
                                        listN0 = listN0;
                                        z3 = true;
                                        z2 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e) {
                                    if (!d(e, a50, c1951k70B, !(e instanceof C2577qg))) {
                                        Iterator it = listN0.iterator();
                                        while (it.hasNext()) {
                                            AbstractC3409z9.a(e, (Exception) it.next());
                                        }
                                        throw e;
                                    }
                                    listN0 = AbstractC0911Ye.n0(listN0, e);
                                    a50.h(true);
                                    i3 = i3;
                                    z3 = false;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (M80 e2) {
                            List list = listN0;
                            if (!d(e2.m, a50, c1951k70B, false)) {
                                IOException iOException = e2.l;
                                AbstractC1474fG.j(iOException, "<this>");
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    AbstractC3409z9.a(iOException, (Exception) it2.next());
                                }
                                throw iOException;
                            }
                            listN0 = AbstractC0911Ye.n0(list, e2.l);
                            a50.h(true);
                            i3 = i3;
                            z3 = false;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    a50.h(true);
                    throw th;
                }
        }
    }

    public C1951k70 b(C1855j80 c1855j80, C2599qr c2599qr) throws ProtocolException {
        String strF;
        C50 c50;
        K80 k80 = (c2599qr == null || (c50 = c2599qr.g) == null) ? null : c50.b;
        int i = c1855j80.f840o;
        String str = c1855j80.l.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return ((OV) this.b).r.e(k80, c1855j80);
            }
            if (i == 421) {
                if (c2599qr == null || !(!AbstractC1474fG.b(c2599qr.c.b.i.d, c2599qr.g.b.a.i.d))) {
                    return null;
                }
                C50 c51 = c2599qr.g;
                synchronized (c51) {
                    c51.k = true;
                }
                return c1855j80.l;
            }
            if (i == 503) {
                C1855j80 c1855j81 = c1855j80.u;
                if ((c1855j81 == null || c1855j81.f840o != 503) && e(c1855j80, Integer.MAX_VALUE) == 0) {
                    return c1855j80.l;
                }
                return null;
            }
            if (i == 407) {
                AbstractC1474fG.g(k80);
                if (k80.b.type() == Proxy.Type.HTTP) {
                    return ((OV) this.b).z.e(k80, c1855j80);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!((OV) this.b).q) {
                    return null;
                }
                C1855j80 c1855j82 = c1855j80.u;
                if ((c1855j82 == null || c1855j82.f840o != 408) && e(c1855j80, 0) <= 0) {
                    return c1855j80.l;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        OV ov = (OV) this.b;
        if (!ov.s || (strF = c1855j80.f("Location", null)) == null) {
            return null;
        }
        C1951k70 c1951k70 = c1855j80.l;
        C2446pE c2446pEJ = c1951k70.a.j(strF);
        if (c2446pEJ == null) {
            return null;
        }
        if (!AbstractC1474fG.b(c2446pEJ.a, c1951k70.a.a) && !ov.t) {
            return null;
        }
        C0560Kq c0560KqA = c1951k70.a();
        if (AbstractC3045vW.y(str)) {
            boolean zB = AbstractC1474fG.b(str, "PROPFIND");
            int i2 = c1855j80.f840o;
            boolean z = zB || i2 == 308 || i2 == 307;
            if (!(true ^ AbstractC1474fG.b(str, "PROPFIND")) || i2 == 308 || i2 == 307) {
                c0560KqA.m(str, z ? c1951k70.d : null);
            } else {
                c0560KqA.m("GET", null);
            }
            if (!z) {
                c0560KqA.n("Transfer-Encoding");
                c0560KqA.n("Content-Length");
                c0560KqA.n("Content-Type");
            }
        }
        if (!Mr0.a(c1951k70.a, c2446pEJ)) {
            c0560KqA.n("Authorization");
        }
        c0560KqA.m = c2446pEJ;
        return c0560KqA.c();
    }

    public boolean d(IOException iOException, A50 a50, C1951k70 c1951k70, boolean z) {
        C2349oE c2349oE;
        boolean zE;
        C50 c50;
        if (!((OV) this.b).q) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C2792sr c2792sr = a50.t;
        AbstractC1474fG.g(c2792sr);
        int i = c2792sr.g;
        if (i == 0 && c2792sr.h == 0 && c2792sr.i == 0) {
            zE = false;
        } else if (c2792sr.j != null) {
            zE = true;
        } else {
            K80 k80 = null;
            if (i <= 1 && c2792sr.h <= 1 && c2792sr.i <= 0 && (c50 = c2792sr.c.u) != null) {
                synchronized (c50) {
                    if (c50.l == 0 && Mr0.a(c50.b.a.i, c2792sr.b.i)) {
                        k80 = c50.b;
                    }
                }
            }
            if (k80 != null) {
                c2792sr.j = k80;
            } else {
                C1225cm c1225cm = c2792sr.e;
                if ((c1225cm == null || !c1225cm.c()) && (c2349oE = c2792sr.f) != null) {
                    zE = c2349oE.e();
                }
            }
            zE = true;
        }
        return zE;
    }

    public C0466Ha(C0362Da c0362Da) {
        this.b = c0362Da;
    }

    public C0466Ha(OV ov) {
        AbstractC1474fG.j(ov, "client");
        this.b = ov;
    }
}
