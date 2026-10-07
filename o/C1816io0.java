package o;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.models.Video$Type;
import io.sentry.AbstractC0031b1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: o.io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1816io0 implements Q30 {
    public static final C1816io0 b = new C1816io0();
    public static final String c;
    public static final String d;
    public static final ConcurrentHashMap e;
    public static final YS f;
    public static final YS g;
    public static final C0421Fh h;
    public static final Object i;
    public static final LinkedHashMap j;
    public static final LinkedHashMap k;
    public static final LinkedHashMap l;
    public static volatile List m;
    public static volatile long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile C0882Xb f836o;
    public static volatile long p;
    public static volatile long q;
    public static final LinkedHashMap r;
    public static Context s;
    public static final Rh0 t;
    public static final Rh0 u;
    public static final Rh0 v;
    public static boolean w;
    public static final Object x;

    static {
        String str = C1263d5.a;
        c = C1263d5.f;
        d = C1263d5.e;
        e = new ConcurrentHashMap();
        f = AbstractC1923jt0.a();
        g = AbstractC1923jt0.a();
        h = zy0.c(Sr0.z(U9.a(), AbstractC1910jn.b));
        i = new Object();
        j = new LinkedHashMap();
        k = new LinkedHashMap();
        l = new LinkedHashMap();
        r = new LinkedHashMap();
        t = new Rh0(C1693hb0.s);
        u = new Rh0(C1693hb0.r);
        v = new Rh0(C1693hb0.t);
        x = new Object();
    }

    public static void C(Ds0 ds0) {
        synchronized (i) {
            String strL = L(ds0, Ec0.f.get());
            j.remove(strL);
            l.put(strL, new Object());
            InterfaceC1022ai interfaceC1022ai = (InterfaceC1323dm) k.remove(strL);
            if (interfaceC1022ai != null) {
                ((JH) interfaceC1022ai).f(null);
            }
        }
    }

    public static boolean D() {
        String str = Build.MODEL;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String str2 = Build.DEVICE;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        String str3 = Build.HARDWARE;
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase3 = str3.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
        String str4 = Build.MANUFACTURER;
        String lowerCase4 = (str4 != null ? str4 : "").toLowerCase(locale);
        AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
        return Build.VERSION.SDK_INT <= 25 || AbstractC1119bh0.W(lowerCase, "rk322", false) || AbstractC1119bh0.W(lowerCase, "rk331", false) || AbstractC1119bh0.W(lowerCase, "rk332", false) || AbstractC1119bh0.W(lowerCase2, "rk322", false) || AbstractC1119bh0.W(lowerCase2, "rk331", false) || AbstractC1119bh0.W(lowerCase2, "rk332", false) || AbstractC1119bh0.W(lowerCase3, "rk322", false) || AbstractC1119bh0.W(lowerCase3, "rk331", false) || AbstractC1119bh0.W(lowerCase3, "rk332", false) || AbstractC1119bh0.W(lowerCase4, "rockchip", false);
    }

    public static void E(List list, Ds0 ds0, boolean z) {
        Object next;
        Set setT;
        String lowerCase;
        String str;
        AbstractC1474fG.j(list, "servers");
        AbstractC1474fG.j(ds0, "selectedServer");
        List listQ = Vb0.Q(new C1732hv(new C1732hv(AbstractC0911Ye.U(F(list)), true, new io.sentry.android.replay.v(21, ds0)), true, new Tn0(z)));
        if (z) {
            Iterator it = listQ.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                setT = Lc0.T("voesx", "voe");
                Map map = ((Ds0) next).f223o;
                if (map == null || (str = (String) map.get("extractor")) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                }
            } while (!AbstractC0911Ye.W(setT, lowerCase));
            Ds0 ds1 = (Ds0) next;
            C3421zK c3421zK = new C3421zK();
            if (ds1 != null) {
                c3421zK.add(ds1);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (!AbstractC1474fG.b(((Ds0) obj).l, ds1 != null ? ds1.l : null)) {
                    arrayList.add(obj);
                }
            }
            c3421zK.addAll(arrayList);
            listQ = AbstractC2506pt.h(c3421zK);
        }
        Iterator it2 = AbstractC0911Ye.s0(2, listQ).iterator();
        while (it2.hasNext()) {
            AbstractC1376eG.w(h, null, 0, new Sn0((Ds0) it2.next(), null), 3);
        }
    }

    public static List F(List list) {
        AbstractC1474fG.j(list, "servers");
        return AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{X10.I, X10.J}));
    }

    public static void G(long j2) {
        Iterator it = j.entrySet().iterator();
        while (it.hasNext()) {
            if (j2 - ((C2398on0) ((Map.Entry) it.next()).getValue()).b > 75000) {
                it.remove();
            }
        }
    }

    public static String H(String str, boolean z) throws IOException {
        C2446pE c2446pEB = null;
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() != 0 && string.length() <= 8192) {
            for (int i2 = 0; i2 < string.length(); i2++) {
                char cCharAt = string.charAt(i2);
                if (cCharAt != '\r' && cCharAt != '\n') {
                }
            }
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, string);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
            }
            if (c2446pEB == null) {
                throw new IOException("La fuente de reproducción no es válida");
            }
            if ((z && !c2446pEB.j) || !AbstractC1370eA.C(string, false)) {
                throw new IOException("La fuente de reproducción no usa un transporte seguro");
            }
            if (c2446pEB.b.length() > 0 || c2446pEB.c.length() > 0) {
                throw new IOException("La fuente de reproducción no es válida");
            }
            return c2446pEB.i;
        }
        throw new IOException("La fuente de reproducción no es válida");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o.JH, o.em] */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.dm] */
    /* JADX WARN: Type inference failed for: r1v8, types: [o.dm] */
    public static Object I(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        C1816io0 c1816io0;
        Js0 js0;
        ?? C;
        int iF0;
        long j2 = Ec0.f.get();
        String strL = L(ds0, j2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = i;
        synchronized (obj) {
            c1816io0 = b;
            G(jElapsedRealtime);
            C2398on0 c2398on0 = (C2398on0) j.get(strL);
            js0 = c2398on0 != null ? c2398on0.a : null;
        }
        if (js0 != null) {
            return js0;
        }
        synchronized (obj) {
            LinkedHashMap linkedHashMap = k;
            C = (InterfaceC1323dm) linkedHashMap.get(strL);
            if (C == 0) {
                Object obj2 = new Object();
                l.put(strL, obj2);
                C = AbstractC1376eG.c(h, null, 2, new Xn0(ds0, j2, c1816io0, strL, obj2, null), 1);
                linkedHashMap.put(strL, C);
                C.T(false, true, new io.sentry.android.replay.p(strL, C, obj2, 8));
                do {
                    iF0 = C.f0(C.O());
                    if (iF0 == 0) {
                        break;
                    }
                } while (iF0 != 1);
            }
        }
        return C.K(interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:4: B:76:0x0136->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:58:0x00fa->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:3: B:67:0x0118->B:98:?, LOOP_END, SYNTHETIC] */
    public static final C2592qn0 J(String str, String str2) {
        C2592qn0 c2592qn0;
        String str3;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Character chValueOf;
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str2 + str);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            C1855j80 c1855j80G = ((OV) v.getValue()).c(c0560Kq.c()).g();
            try {
                if (c1855j80G.p()) {
                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                    String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                    if (strQ == null) {
                        strQ = "";
                    }
                    if (AbstractC1899jh0.O(strQ)) {
                        c2592qn0 = new C2592qn0(null, "empty");
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= strQ.length()) {
                                chValueOf = null;
                                break;
                            }
                            char cCharAt = strQ.charAt(i2);
                            if (!AbstractC3021v9.u(cCharAt)) {
                                chValueOf = Character.valueOf(cCharAt);
                                break;
                            }
                            i2++;
                        }
                        if (chValueOf == null || chValueOf.charValue() != '{') {
                            if (chValueOf == null || chValueOf.charValue() != '[') {
                                c2592qn0 = new C2592qn0(null, "non_json");
                            }
                        }
                        c2592qn0 = new C2592qn0(strQ, "ok");
                    }
                } else {
                    c2592qn0 = new C2592qn0(null, "http_" + c1855j80G.f840o);
                }
                AbstractC3409z9.g(c1855j80G, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            List listQ = Vb0.Q(Vb0.P(Vb0.K(e2, X10.K), 12));
            if (!listQ.isEmpty()) {
                Iterator it4 = listQ.iterator();
                while (it4.hasNext()) {
                    if (((Throwable) it4.next()) instanceof UnknownHostException) {
                        str3 = "dns";
                    }
                }
                if (listQ.isEmpty()) {
                    it3 = listQ.iterator();
                    while (it3.hasNext()) {
                        if (((Throwable) it3.next()) instanceof SocketTimeoutException) {
                            str3 = "timeout";
                        }
                    }
                    if (listQ.isEmpty()) {
                        it2 = listQ.iterator();
                        while (it2.hasNext()) {
                            if (((Throwable) it2.next()) instanceof SSLException) {
                                str3 = "tls";
                            }
                        }
                        if (listQ.isEmpty()) {
                            str3 = "unexpected";
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (((Throwable) it.next()) instanceof IOException) {
                                    str3 = "io";
                                }
                            }
                            str3 = "unexpected";
                        }
                    } else if (listQ.isEmpty()) {
                        str3 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str3 = "io";
                            }
                        }
                        str3 = "unexpected";
                    }
                } else if (listQ.isEmpty()) {
                    it2 = listQ.iterator();
                    while (it2.hasNext()) {
                        if (((Throwable) it2.next()) instanceof SSLException) {
                            str3 = "tls";
                        }
                    }
                    if (listQ.isEmpty()) {
                        str3 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str3 = "io";
                            }
                        }
                        str3 = "unexpected";
                    }
                } else if (listQ.isEmpty()) {
                    str3 = "unexpected";
                } else {
                    it = listQ.iterator();
                    while (it.hasNext()) {
                        if (((Throwable) it.next()) instanceof IOException) {
                            str3 = "io";
                        }
                    }
                    str3 = "unexpected";
                }
            } else if (listQ.isEmpty()) {
                it3 = listQ.iterator();
                while (it3.hasNext()) {
                    if (((Throwable) it3.next()) instanceof SocketTimeoutException) {
                        str3 = "timeout";
                    }
                }
                if (listQ.isEmpty()) {
                    it2 = listQ.iterator();
                    while (it2.hasNext()) {
                        if (((Throwable) it2.next()) instanceof SSLException) {
                            str3 = "tls";
                        }
                    }
                    if (listQ.isEmpty()) {
                        str3 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str3 = "io";
                            }
                        }
                        str3 = "unexpected";
                    }
                } else if (listQ.isEmpty()) {
                    str3 = "unexpected";
                } else {
                    it = listQ.iterator();
                    while (it.hasNext()) {
                        if (((Throwable) it.next()) instanceof IOException) {
                            str3 = "io";
                        }
                    }
                    str3 = "unexpected";
                }
            } else if (listQ.isEmpty()) {
                it2 = listQ.iterator();
                while (it2.hasNext()) {
                    if (((Throwable) it2.next()) instanceof SSLException) {
                        str3 = "tls";
                    }
                }
                if (listQ.isEmpty()) {
                    str3 = "unexpected";
                } else {
                    it = listQ.iterator();
                    while (it.hasNext()) {
                        if (((Throwable) it.next()) instanceof IOException) {
                            str3 = "io";
                        }
                    }
                    str3 = "unexpected";
                }
            } else if (listQ.isEmpty()) {
                str3 = "unexpected";
            } else {
                it = listQ.iterator();
                while (it.hasNext()) {
                    if (((Throwable) it.next()) instanceof IOException) {
                        str3 = "io";
                    }
                }
                str3 = "unexpected";
            }
            c2592qn0 = new C2592qn0(null, str3);
        }
        return c2592qn0;
    }

    public static String K(String str) {
        if (str.length() == 0) {
            return null;
        }
        return AbstractC1899jh0.R(str, "/t/p/original/", "/t/p/w342/", false);
    }

    public static String L(Ds0 ds0, long j2) {
        String lowerCase;
        String str;
        Map map = ds0.f223o;
        if (map == null || (str = (String) map.get("extractor")) == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        return j2 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + lowerCase + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + ds0.l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    public static final C1387eR p(String str) {
        Object next;
        String str2;
        String str3;
        Collection collectionValues = e.values();
        AbstractC1474fG.i(collectionValues, "<get-values>(...)");
        C3382yv c3382yv = new C3382yv(new C3479zv(AbstractC0911Ye.U(collectionValues), X10.H, Xb0.t));
        do {
            if (!c3382yv.a()) {
                next = null;
                break;
            }
            next = c3382yv.next();
        } while (!AbstractC1474fG.b(((C1387eR) next).a, str));
        C1387eR c1387eR = (C1387eR) next;
        String str4 = c1387eR != null ? c1387eR.h : null;
        if (c1387eR == null || (str3 = c1387eR.b) == null) {
            str2 = "Canal de TV";
        } else {
            String str5 = AbstractC1899jh0.O(str3) ^ true ? str3 : null;
            if (str5 == null) {
                str2 = "Canal de TV";
            } else {
                str2 = str5;
            }
        }
        return new C1387eR(str, str2, "Canal de TV en vivo", null, null, null, null, null, str4, str4, null, null, null, null, AbstractC3327yN.y(new C1101bX("is_tv_channel", Boolean.TRUE)), 15608);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:202:0x0357 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:206:0x036f A[Catch: CancellationException -> 0x0064, all -> 0x0382, TRY_ENTER, TryCatch #0 {all -> 0x0382, blocks: (B:216:0x0396, B:209:0x037e, B:206:0x036f, B:213:0x0385), top: B:369:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0385 A[Catch: CancellationException -> 0x0064, all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:216:0x0396, B:209:0x037e, B:206:0x036f, B:213:0x0385), top: B:369:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0395  */
    /* JADX WARN: Code duplicated, block: B:231:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:234:0x03da  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:243:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:246:0x0407  */
    /* JADX WARN: Code duplicated, block: B:249:0x040e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0418  */
    /* JADX WARN: Code duplicated, block: B:255:0x0426  */
    /* JADX WARN: Code duplicated, block: B:258:0x042d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0437  */
    /* JADX WARN: Code duplicated, block: B:264:0x0452  */
    /* JADX WARN: Code duplicated, block: B:267:0x0459  */
    /* JADX WARN: Code duplicated, block: B:270:0x0463  */
    /* JADX WARN: Code duplicated, block: B:273:0x0471  */
    /* JADX WARN: Code duplicated, block: B:276:0x0478  */
    /* JADX WARN: Code duplicated, block: B:279:0x0482  */
    /* JADX WARN: Code duplicated, block: B:284:0x049c  */
    /* JADX WARN: Code duplicated, block: B:287:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:292:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:295:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:308:0x0500  */
    /* JADX WARN: Code duplicated, block: B:311:0x0507  */
    /* JADX WARN: Code duplicated, block: B:314:0x0511  */
    /* JADX WARN: Code duplicated, block: B:317:0x051e A[EDGE_INSN: B:317:0x051e->B:318:0x0520 BREAK  A[LOOP:8: B:312:0x050b->B:408:?]] */
    /* JADX WARN: Code duplicated, block: B:343:0x0564  */
    /* JADX WARN: Code duplicated, block: B:347:0x056f A[PHI: r3
  0x056f: PHI (r3v31 java.lang.String) = (r3v28 java.lang.String), (r3v29 java.lang.String), (r3v30 java.lang.String), (r3v32 java.lang.String) binds: [B:360:0x0592, B:353:0x0580, B:345:0x056c, B:336:0x0553] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:361:0x0594  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:376:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:? A[LOOP:1: B:232:0x03d4->B:378:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:? A[LOOP:2: B:241:0x03f3->B:381:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:? A[LOOP:3: B:250:0x0412->B:384:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:? A[LOOP:4: B:259:0x0431->B:387:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:? A[LOOP:5: B:268:0x045d->B:390:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x048e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x047c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x04fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x051b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:? A[LOOP:8: B:312:0x050b->B:408:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x037a, code lost:
    
        if (r2 == r3) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r1.equals("voesx") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (r1.equals("waaw") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        if (r1.equals("netu") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        r2 = o.C1816io0.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
    
        r2 = new o.C1829iv0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        throw new java.lang.IllegalStateException("TvProvider not initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        if (r1.equals("voe") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
    
        r2 = new o.Uu0();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(o.C1816io0 r20, o.Ds0 r21, java.lang.String r22, o.InterfaceC0473Hh r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1816io0.q(o.io0, o.Ds0, java.lang.String, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r(C1816io0 c1816io0, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Bn0 bn0;
        c1816io0.getClass();
        if (interfaceC0473Hh instanceof Bn0) {
            bn0 = (Bn0) interfaceC0473Hh;
            int i2 = bn0.f189o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bn0.f189o = i2 - Integer.MIN_VALUE;
            } else {
                bn0 = new Bn0(c1816io0, interfaceC0473Hh);
            }
        } else {
            bn0 = new Bn0(c1816io0, interfaceC0473Hh);
        }
        Object objJ = bn0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = bn0.f189o;
        try {
            if (i3 == 0) {
                Jp0.O(objJ);
                bn0.l = str2;
                bn0.f189o = 1;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new An0(str, null), bn0);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = bn0.l;
                Jp0.O(objJ);
            }
            return (String) objJ;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static final C1387eR s(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("poster");
        AbstractC1474fG.i(strOptString, "optString(...)");
        String strK = K(strOptString);
        String strN = AbstractC1674hK.n(jSONObject.getInt("id"), "lumix-movie-");
        String string = jSONObject.getString("titulo");
        AbstractC1474fG.i(string, "getString(...)");
        return new C1387eR(strN, string, null, null, null, null, null, null, strK, strK, null, null, null, null, null, 31996);
    }

    public static final Ds0 t(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        String strOptString = jSONObject.optString("nombre", "Server");
        String strOptString2 = jSONObject.optString("idioma", "Latino");
        String strOptString3 = jSONObject.optString("calidad", "HD");
        AbstractC1474fG.g(string);
        String str = strOptString + " [" + strOptString3 + "][" + strOptString2 + "] (Online)";
        AbstractC1474fG.g(strOptString);
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return new Ds0(string, str, null, AbstractC3327yN.z(new C1101bX("extractor", lowerCase), new C1101bX("_direct", "true")), 52);
    }

    public static final C2109lo0 u(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("poster");
        AbstractC1474fG.i(strOptString, "optString(...)");
        String strK = K(strOptString);
        String strN = AbstractC1674hK.n(jSONObject.getInt("id"), "lumix-series-");
        String string = jSONObject.getString("titulo");
        AbstractC1474fG.i(string, "getString(...)");
        return new C2109lo0(strN, string, null, null, null, null, null, null, strK, strK, null, null, null, null, null, null, 64764);
    }

    public static final byte[] v(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    for (String str2 : AbstractC0937Ze.K("k", "kid")) {
                        String strOptString = jSONObjectOptJSONObject.optString(str2, "");
                        AbstractC1474fG.g(strOptString);
                        if (strOptString.length() > 0) {
                            jSONObjectOptJSONObject.put(str2, AbstractC1119bh0.G0(AbstractC1899jh0.S(AbstractC1899jh0.S(AbstractC1899jh0.R(strOptString, "\\/", "/", false), '+', '-'), '/', '_'), '='));
                        }
                    }
                }
            }
        }
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC1474fG.i(charset, "UTF_8");
        byte[] bytes = string.getBytes(charset);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String w(String str) {
        String lowerCase = AbstractC1119bh0.E0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String strNormalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        AbstractC1474fG.i(strNormalize, "normalize(...)");
        Pattern patternCompile = Pattern.compile("\\p{M}+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("\\s+");
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
        AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
        return strReplaceAll2;
    }

    public static final JSONObject x(String str) throws IOException {
        Object objK;
        C2592qn0 c2592qn0J = J(str, "https://raw.githubusercontent.com/jexiptv07/stremcore/refs/heads/main");
        String str2 = c2592qn0J.a;
        if (str2 == null) {
            C2592qn0 c2592qn0J2 = J(str, "https://cdn.statically.io/gh/jexiptv07/stremcore/main");
            String str3 = c2592qn0J2.a;
            if (str3 == null) {
                AbstractC0031b1.h(new C1054ay(str, c2592qn0J.b, c2592qn0J2.b, 3));
                throw new IOException("El catálogo devolvió una respuesta inválida");
            }
            str2 = str3;
        }
        try {
            objK = new JSONTokener(str2).nextValue();
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        JSONObject jSONObject = objK instanceof JSONObject ? (JSONObject) objK : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        throw new IOException("El catálogo devolvió un objeto JSON inválido");
    }

    public static final String y(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String strR = AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(lowerCase, "á", "a", false), "é", "e", false), "í", "i", false), "ó", "o", false), "ú", "u", false), "ü", "u", false), "ñ", "n", false), " ", "-", false);
        return AbstractC1474fG.b(strR, "thriller") ? "suspense" : strR;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x026a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x026b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0281 A[PHI: r0 r4 r6 r9 r16
  0x0281: PHI (r0v31 'e' java.lang.Exception) = (r0v23 'e' java.lang.Exception), (r0v24 'e' java.lang.Exception), (r0v42 'e' java.lang.Exception) binds: [B:125:0x0252, B:139:0x027e, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r4v22 ??) = (r4v18 ??), (r4v18 ??), (r4v31 ??) binds: [B:125:0x0252, B:139:0x027e, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r6v30 ??) = (r6v26 ??), (r6v26 ??), (r6v35 ??) binds: [B:125:0x0252, B:139:0x027e, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r9v24 java.util.List) = (r9v20 java.util.List), (r9v20 java.util.List), (r9v30 java.util.List) binds: [B:125:0x0252, B:139:0x027e, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r16v5 java.lang.String) = (r16v2 java.lang.String), (r16v2 java.lang.String), (r16v12 java.lang.String) binds: [B:125:0x0252, B:139:0x027e, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x028b A[Catch: CancellationException -> 0x0047, Exception -> 0x02cd, TRY_ENTER, TryCatch #11 {CancellationException -> 0x0047, Exception -> 0x02cd, blocks: (B:15:0x0042, B:168:0x02e9, B:145:0x028b, B:164:0x02d2, B:148:0x0292, B:149:0x0296, B:151:0x029c, B:153:0x02b0, B:155:0x02b8, B:157:0x02c3), top: B:175:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0291  */
    /* JADX WARN: Code duplicated, block: B:148:0x0292 A[Catch: CancellationException -> 0x0047, Exception -> 0x02cd, TryCatch #11 {CancellationException -> 0x0047, Exception -> 0x02cd, blocks: (B:15:0x0042, B:168:0x02e9, B:145:0x028b, B:164:0x02d2, B:148:0x0292, B:149:0x0296, B:151:0x029c, B:153:0x02b0, B:155:0x02b8, B:157:0x02c3), top: B:175:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x029c A[Catch: CancellationException -> 0x0047, Exception -> 0x02cd, TryCatch #11 {CancellationException -> 0x0047, Exception -> 0x02cd, blocks: (B:15:0x0042, B:168:0x02e9, B:145:0x028b, B:164:0x02d2, B:148:0x0292, B:149:0x0296, B:151:0x029c, B:153:0x02b0, B:155:0x02b8, B:157:0x02c3), top: B:175:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b0 A[Catch: CancellationException -> 0x0047, Exception -> 0x02cd, TryCatch #11 {CancellationException -> 0x0047, Exception -> 0x02cd, blocks: (B:15:0x0042, B:168:0x02e9, B:145:0x028b, B:164:0x02d2, B:148:0x0292, B:149:0x0296, B:151:0x029c, B:153:0x02b0, B:155:0x02b8, B:157:0x02c3), top: B:175:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ca A[LOOP:0: B:149:0x0296->B:160:0x02ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x02e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:167:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, o.io0] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, o.io0] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    public final Object A(List list, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C3173wn0 c3173wn0;
        List listF;
        String str;
        ?? arrayList;
        C1816io0 c1816io0;
        List list2;
        C1816io0 c1816io1;
        ?? r4;
        ?? r6;
        List list3;
        String lowerCase;
        String str2;
        String lowerCase2;
        String str3;
        Object next;
        Set setT;
        String lowerCase3;
        String str4;
        Ds0 ds0;
        List list4;
        long j2;
        ?? r5;
        Iterator it;
        String str5;
        Set setT2;
        Map map;
        String lowerCase4;
        String str6;
        ?? r3;
        List list5;
        ?? r7;
        if (interfaceC0473Hh instanceof C3173wn0) {
            c3173wn0 = (C3173wn0) interfaceC0473Hh;
            int i2 = c3173wn0.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3173wn0.s = i2 - Integer.MIN_VALUE;
            } else {
                c3173wn0 = new C3173wn0(this, interfaceC0473Hh);
            }
        } else {
            c3173wn0 = new C3173wn0(this, interfaceC0473Hh);
        }
        Object objZ = c3173wn0.q;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c3173wn0.s;
        String str7 = "voe";
        try {
            try {
                try {
                    if (i3 == 0) {
                        Jp0.O(objZ);
                        if (list.isEmpty()) {
                            throw new Exception("No servers provided for parallel extraction");
                        }
                        Object objB0 = AbstractC0911Ye.b0(list);
                        if (!UK.F(((Ds0) objB0).l)) {
                            objB0 = null;
                        }
                        Ds0 ds1 = (Ds0) objB0;
                        if (ds1 != null) {
                            C1816io0 c1816io2 = b;
                            c3173wn0.l = ds1;
                            c3173wn0.s = 1;
                            Object objN = c1816io2.n(ds1, c3173wn0);
                            if (objN == enumC1706hi) {
                                return enumC1706hi;
                            }
                            ds0 = ds1;
                            objZ = objN;
                            return new C2495pn0((Js0) objZ, ds0);
                        }
                        boolean zD = D();
                        Set setT3 = zD ? Lc0.T("vidhide", "filemoon", "streamwish", "doodstream", "streamtape") : Lc0.T("vidhide", "filemoon", "streamwish");
                        listF = F(list);
                        if (zD) {
                            Iterator it2 = listF.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                setT = Lc0.T("voesx", "voe");
                                Map map2 = ((Ds0) next).f223o;
                                if (map2 == null || (str4 = (String) map2.get("extractor")) == null) {
                                    lowerCase3 = null;
                                } else {
                                    lowerCase3 = str4.toLowerCase(Locale.ROOT);
                                    AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                                }
                            } while (!AbstractC0911Ye.W(setT, lowerCase3));
                            Ds0 ds2 = (Ds0) next;
                            if (ds2 != null) {
                                AbstractC1376eG.w(h, null, 0, new Sn0(ds2, null), 3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = listF.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            Ds0 ds3 = (Ds0) next2;
                            String str8 = ds3.m;
                            Locale locale = Locale.ROOT;
                            String lowerCase5 = str8.toLowerCase(locale);
                            AbstractC1474fG.i(lowerCase5, "toLowerCase(...)");
                            Iterator it4 = it3;
                            if (AbstractC1119bh0.W(lowerCase5, "latino", false)) {
                                Map map3 = ds3.f223o;
                                if (map3 == null || (str3 = (String) map3.get("extractor")) == null) {
                                    lowerCase2 = null;
                                } else {
                                    lowerCase2 = str3.toLowerCase(locale);
                                    AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                                }
                                if (AbstractC0911Ye.W(setT3, lowerCase2)) {
                                    arrayList2.add(next2);
                                }
                            }
                            it3 = it4;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = listF.iterator();
                        while (it5.hasNext()) {
                            Object next3 = it5.next();
                            Ds0 ds4 = (Ds0) next3;
                            String str9 = ds4.m;
                            Iterator it6 = it5;
                            Locale locale2 = Locale.ROOT;
                            String lowerCase6 = str9.toLowerCase(locale2);
                            AbstractC1474fG.i(lowerCase6, "toLowerCase(...)");
                            String str10 = str7;
                            if (AbstractC1119bh0.W(lowerCase6, "latino", false)) {
                                Map map4 = ds4.f223o;
                                if (map4 == null || (str2 = (String) map4.get("extractor")) == null) {
                                    lowerCase = null;
                                } else {
                                    lowerCase = str2.toLowerCase(locale2);
                                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                                }
                                if (!AbstractC0911Ye.W(setT3, lowerCase)) {
                                    arrayList3.add(next3);
                                }
                            }
                            it5 = it6;
                            str7 = str10;
                        }
                        str = str7;
                        arrayList = new ArrayList();
                        for (Object obj : listF) {
                            String lowerCase7 = ((Ds0) obj).m.toLowerCase(Locale.ROOT);
                            AbstractC1474fG.i(lowerCase7, "toLowerCase(...)");
                            if (!AbstractC1119bh0.W(lowerCase7, "latino", false)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!(!arrayList2.isEmpty())) {
                            r4 = this;
                            r6 = arrayList;
                            list3 = listF;
                            e = null;
                            list4 = arrayList3;
                            if (!list4.isEmpty()) {
                                c3173wn0.l = r4;
                                c3173wn0.m = list3;
                                c3173wn0.n = r6;
                                c3173wn0.f1101o = r4;
                                c3173wn0.p = null;
                                c3173wn0.s = 3;
                                j2 = 28000;
                                objZ = r4.z(list4, 28000L, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r5 = r4;
                                r7 = r4;
                                r6 = r6;
                                C2495pn0 c2495pn0 = (C2495pn0) objZ;
                                r7.getClass();
                                E(list3, c2495pn0.b, false);
                                return c2495pn0;
                            }
                            j2 = 28000;
                            if (!r6.isEmpty()) {
                                if (r6.isEmpty()) {
                                    it = r6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Ds0 ds5 = (Ds0) it.next();
                                            str5 = str;
                                            setT2 = Lc0.T("voesx", str5);
                                            map = ds5.f223o;
                                            if (map != null || (str6 = (String) map.get("extractor")) == null) {
                                                lowerCase4 = null;
                                            } else {
                                                lowerCase4 = str6.toLowerCase(Locale.ROOT);
                                                AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
                                            }
                                            if (AbstractC0911Ye.W(setT2, lowerCase4)) {
                                                break;
                                                break;
                                            }
                                            str = str5;
                                        }
                                    }
                                    c3173wn0.l = list3;
                                    c3173wn0.m = r4;
                                    c3173wn0.n = null;
                                    c3173wn0.f1101o = null;
                                    c3173wn0.p = null;
                                    c3173wn0.s = 4;
                                    objZ = r4.z(r6, j2, c3173wn0);
                                    if (objZ == enumC1706hi) {
                                        return enumC1706hi;
                                    }
                                    r3 = r4;
                                    list5 = list3;
                                    C2495pn0 c2495pn1 = (C2495pn0) objZ;
                                    r3.getClass();
                                    E(list5, c2495pn1.b, false);
                                    return c2495pn1;
                                }
                                j2 = 20000;
                                c3173wn0.l = list3;
                                c3173wn0.m = r4;
                                c3173wn0.n = null;
                                c3173wn0.f1101o = null;
                                c3173wn0.p = null;
                                c3173wn0.s = 4;
                                objZ = r4.z(r6, j2, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r3 = r4;
                                list5 = list3;
                                C2495pn0 c2495pn2 = (C2495pn0) objZ;
                                r3.getClass();
                                E(list5, c2495pn2.b, false);
                                return c2495pn2;
                            }
                            throw new IOException("Los extractores dedicados no pudieron resolver el video", e);
                        }
                        try {
                            c3173wn0.l = this;
                            c3173wn0.m = listF;
                            c3173wn0.n = arrayList3;
                            c3173wn0.f1101o = arrayList;
                            c3173wn0.p = this;
                            c3173wn0.s = 2;
                            objZ = z(arrayList2, 8000L, c3173wn0);
                            if (objZ == enumC1706hi) {
                                return enumC1706hi;
                            }
                            c1816io1 = this;
                            c1816io0 = c1816io1;
                            list2 = arrayList3;
                            arrayList = arrayList;
                            C2495pn0 c2495pn3 = (C2495pn0) objZ;
                            c1816io1.getClass();
                            E(listF, c2495pn3.b, false);
                            return c2495pn3;
                        } catch (Exception e2) {
                            e = e2;
                            c1816io0 = this;
                            list2 = arrayList3;
                            r4 = c1816io0;
                            r6 = arrayList;
                            list3 = listF;
                            list4 = list2;
                            if (!list4.isEmpty()) {
                                c3173wn0.l = r4;
                                c3173wn0.m = list3;
                                c3173wn0.n = r6;
                                c3173wn0.f1101o = r4;
                                c3173wn0.p = null;
                                c3173wn0.s = 3;
                                j2 = 28000;
                                objZ = r4.z(list4, 28000L, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r5 = r4;
                                r7 = r4;
                                r6 = r6;
                                C2495pn0 c2495pn4 = (C2495pn0) objZ;
                                r7.getClass();
                                E(list3, c2495pn4.b, false);
                                return c2495pn4;
                            }
                            j2 = 28000;
                            if (!r6.isEmpty()) {
                                if (r6.isEmpty()) {
                                    it = r6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Ds0 ds6 = (Ds0) it.next();
                                            str5 = str;
                                            setT2 = Lc0.T("voesx", str5);
                                            map = ds6.f223o;
                                            if (map != null) {
                                                lowerCase4 = null;
                                            } else {
                                                lowerCase4 = null;
                                            }
                                            if (AbstractC0911Ye.W(setT2, lowerCase4)) {
                                                break;
                                                break;
                                            }
                                            str = str5;
                                        }
                                    }
                                    c3173wn0.l = list3;
                                    c3173wn0.m = r4;
                                    c3173wn0.n = null;
                                    c3173wn0.f1101o = null;
                                    c3173wn0.p = null;
                                    c3173wn0.s = 4;
                                    objZ = r4.z(r6, j2, c3173wn0);
                                    if (objZ == enumC1706hi) {
                                        return enumC1706hi;
                                    }
                                    r3 = r4;
                                    list5 = list3;
                                    C2495pn0 c2495pn5 = (C2495pn0) objZ;
                                    r3.getClass();
                                    E(list5, c2495pn5.b, false);
                                    return c2495pn5;
                                }
                                j2 = 20000;
                                c3173wn0.l = list3;
                                c3173wn0.m = r4;
                                c3173wn0.n = null;
                                c3173wn0.f1101o = null;
                                c3173wn0.p = null;
                                c3173wn0.s = 4;
                                objZ = r4.z(r6, j2, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r3 = r4;
                                list5 = list3;
                                C2495pn0 c2495pn6 = (C2495pn0) objZ;
                                r3.getClass();
                                E(list5, c2495pn6.b, false);
                                return c2495pn6;
                            }
                            throw new IOException("Los extractores dedicados no pudieron resolver el video", e);
                        }
                    }
                    if (i3 == 1) {
                        ds0 = (Ds0) c3173wn0.l;
                        Jp0.O(objZ);
                        return new C2495pn0((Js0) objZ, ds0);
                    }
                    if (i3 == 2) {
                        c1816io1 = c3173wn0.p;
                        arrayList = (List) c3173wn0.f1101o;
                        list2 = c3173wn0.n;
                        listF = (List) c3173wn0.m;
                        c1816io0 = (C1816io0) c3173wn0.l;
                        try {
                            Jp0.O(objZ);
                            str = "voe";
                            arrayList = arrayList;
                            list2 = list2;
                            try {
                                C2495pn0 c2495pn7 = (C2495pn0) objZ;
                                c1816io1.getClass();
                                E(listF, c2495pn7.b, false);
                                return c2495pn7;
                            } catch (Exception e3) {
                                e = e3;
                                r4 = c1816io0;
                                r6 = arrayList;
                                list3 = listF;
                                list4 = list2;
                                if (!list4.isEmpty()) {
                                    try {
                                        c3173wn0.l = r4;
                                        c3173wn0.m = list3;
                                        c3173wn0.n = r6;
                                        c3173wn0.f1101o = r4;
                                        c3173wn0.p = null;
                                        c3173wn0.s = 3;
                                        j2 = 28000;
                                        try {
                                            objZ = r4.z(list4, 28000L, c3173wn0);
                                            if (objZ == enumC1706hi) {
                                                return enumC1706hi;
                                            }
                                            r5 = r4;
                                            r7 = r4;
                                            r6 = r6;
                                            C2495pn0 c2495pn8 = (C2495pn0) objZ;
                                            r7.getClass();
                                            E(list3, c2495pn8.b, false);
                                            return c2495pn8;
                                        } catch (Exception e4) {
                                            e = e4;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        j2 = 28000;
                                    }
                                } else {
                                    j2 = 28000;
                                }
                                if (!r6.isEmpty()) {
                                    if (r6.isEmpty()) {
                                        it = r6.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Ds0 ds7 = (Ds0) it.next();
                                                str5 = str;
                                                setT2 = Lc0.T("voesx", str5);
                                                map = ds7.f223o;
                                                if (map != null) {
                                                    lowerCase4 = null;
                                                } else {
                                                    lowerCase4 = null;
                                                }
                                                if (AbstractC0911Ye.W(setT2, lowerCase4)) {
                                                    break;
                                                }
                                                str = str5;
                                            }
                                        }
                                        c3173wn0.l = list3;
                                        c3173wn0.m = r4;
                                        c3173wn0.n = null;
                                        c3173wn0.f1101o = null;
                                        c3173wn0.p = null;
                                        c3173wn0.s = 4;
                                        objZ = r4.z(r6, j2, c3173wn0);
                                        if (objZ == enumC1706hi) {
                                            return enumC1706hi;
                                        }
                                        r3 = r4;
                                        list5 = list3;
                                        C2495pn0 c2495pn9 = (C2495pn0) objZ;
                                        r3.getClass();
                                        E(list5, c2495pn9.b, false);
                                        return c2495pn9;
                                    }
                                    j2 = 20000;
                                    c3173wn0.l = list3;
                                    c3173wn0.m = r4;
                                    c3173wn0.n = null;
                                    c3173wn0.f1101o = null;
                                    c3173wn0.p = null;
                                    c3173wn0.s = 4;
                                    objZ = r4.z(r6, j2, c3173wn0);
                                    if (objZ == enumC1706hi) {
                                        return enumC1706hi;
                                    }
                                    r3 = r4;
                                    list5 = list3;
                                    C2495pn0 c2495pn10 = (C2495pn0) objZ;
                                    r3.getClass();
                                    E(list5, c2495pn10.b, false);
                                    return c2495pn10;
                                }
                                throw new IOException("Los extractores dedicados no pudieron resolver el video", e);
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = "voe";
                            r4 = c1816io0;
                            r6 = arrayList;
                            list3 = listF;
                            list4 = list2;
                            if (!list4.isEmpty()) {
                                c3173wn0.l = r4;
                                c3173wn0.m = list3;
                                c3173wn0.n = r6;
                                c3173wn0.f1101o = r4;
                                c3173wn0.p = null;
                                c3173wn0.s = 3;
                                j2 = 28000;
                                objZ = r4.z(list4, 28000L, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r5 = r4;
                                r7 = r4;
                                r6 = r6;
                                C2495pn0 c2495pn11 = (C2495pn0) objZ;
                                r7.getClass();
                                E(list3, c2495pn11.b, false);
                                return c2495pn11;
                            }
                            j2 = 28000;
                            if (!r6.isEmpty()) {
                                if (r6.isEmpty()) {
                                    it = r6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Ds0 ds8 = (Ds0) it.next();
                                            str5 = str;
                                            setT2 = Lc0.T("voesx", str5);
                                            map = ds8.f223o;
                                            if (map != null) {
                                                lowerCase4 = null;
                                            } else {
                                                lowerCase4 = null;
                                            }
                                            if (AbstractC0911Ye.W(setT2, lowerCase4)) {
                                                break;
                                                break;
                                            }
                                            str = str5;
                                        }
                                    }
                                    c3173wn0.l = list3;
                                    c3173wn0.m = r4;
                                    c3173wn0.n = null;
                                    c3173wn0.f1101o = null;
                                    c3173wn0.p = null;
                                    c3173wn0.s = 4;
                                    objZ = r4.z(r6, j2, c3173wn0);
                                    if (objZ == enumC1706hi) {
                                        return enumC1706hi;
                                    }
                                    r3 = r4;
                                    list5 = list3;
                                    C2495pn0 c2495pn12 = (C2495pn0) objZ;
                                    r3.getClass();
                                    E(list5, c2495pn12.b, false);
                                    return c2495pn12;
                                }
                                j2 = 20000;
                                c3173wn0.l = list3;
                                c3173wn0.m = r4;
                                c3173wn0.n = null;
                                c3173wn0.f1101o = null;
                                c3173wn0.p = null;
                                c3173wn0.s = 4;
                                objZ = r4.z(r6, j2, c3173wn0);
                                if (objZ == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                r3 = r4;
                                list5 = list3;
                                C2495pn0 c2495pn13 = (C2495pn0) objZ;
                                r3.getClass();
                                E(list5, c2495pn13.b, false);
                                return c2495pn13;
                            }
                            throw new IOException("Los extractores dedicados no pudieron resolver el video", e);
                        }
                    }
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1816io0 c1816io3 = (C1816io0) c3173wn0.m;
                        list5 = (List) c3173wn0.l;
                        Jp0.O(objZ);
                        r3 = c1816io3;
                        C2495pn0 c2495pn14 = (C2495pn0) objZ;
                        r3.getClass();
                        E(list5, c2495pn14.b, false);
                        return c2495pn14;
                    }
                    C1816io0 c1816io4 = (C1816io0) c3173wn0.f1101o;
                    r6 = c3173wn0.n;
                    list3 = (List) c3173wn0.m;
                    C1816io0 c1816io5 = (C1816io0) c3173wn0.l;
                    try {
                        Jp0.O(objZ);
                        str = "voe";
                        r5 = c1816io5;
                        j2 = 28000;
                        r7 = c1816io4;
                        r6 = r6;
                        try {
                            C2495pn0 c2495pn15 = (C2495pn0) objZ;
                            r7.getClass();
                            E(list3, c2495pn15.b, false);
                            return c2495pn15;
                        } catch (Exception e7) {
                            e = e7;
                            r4 = r5;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str = "voe";
                        r4 = c1816io5;
                        j2 = 28000;
                    }
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (CancellationException e11) {
                throw e11;
            }
        } catch (CancellationException e12) {
            throw e12;
        }
    }

    public final void B(Context context) {
        synchronized (x) {
            try {
                if (w) {
                    return;
                }
                try {
                    Context applicationContext = context.getApplicationContext();
                    s = applicationContext;
                    if (Build.VERSION.SDK_INT > 22) {
                        AbstractC1376eG.w(C2345oA.l, AbstractC1910jn.b, 0, new Qn0(applicationContext, null), 2);
                    }
                    ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                    AbstractC1474fG.g(applicationContext);
                    C0323Bn.e(applicationContext);
                    w = true;
                } catch (Exception e2) {
                    AbstractC1474fG.g(AbstractC0031b1.a(e2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1133bo0(str, i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Hn0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C3464zn0(str2, str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new On0(i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Mn0(video$Type, str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return "https://static.vecteezy.com/system/resources/thumbnails/007/688/855/small/tv-logo-free-vector.jpg";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new Gn0(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "CANALES DE TV Y CINE RECOMENDADO";
    }

    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Cn0(str, i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new In0(i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Nn0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object k(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        throw new C1783iV();
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Pn0(ds0, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        Rn0 rn0;
        YS ys;
        VS vs;
        VS vs2;
        if (interfaceC0473Hh instanceof Rn0) {
            rn0 = (Rn0) interfaceC0473Hh;
            int i2 = rn0.f495o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rn0.f495o = i2 - Integer.MIN_VALUE;
            } else {
                rn0 = new Rn0(this, interfaceC0473Hh);
            }
        } else {
            rn0 = new Rn0(this, interfaceC0473Hh);
        }
        Object obj = rn0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = rn0.f495o;
        C2985uq0 c2985uq0 = C2985uq0.a;
        ConcurrentHashMap concurrentHashMap = e;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    VS vs3 = rn0.l;
                    Jp0.O(obj);
                    vs = vs3;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    VS vs4 = rn0.l;
                    Jp0.O(obj);
                    vs2 = vs4;
                }
                ((YS) vs2).e(null);
                return c2985uq0;
            }
            Jp0.O(obj);
            if (!AbstractC1899jh0.U(str, "tv-", false) || (!concurrentHashMap.isEmpty())) {
                return c2985uq0;
            }
            ys = f;
            rn0.l = ys;
            rn0.f495o = 1;
            if (ys.d(null, rn0) == enumC1706hi) {
                vs = ys;
                return enumC1706hi;
            }
            vs = ys;
            vs2 = vs;
            if (concurrentHashMap.isEmpty()) {
                C1816io0 c1816io0 = b;
                if (!w) {
                    try {
                        MyApplication myApplication = MyApplication.l;
                        c1816io0.B(Jp0.s());
                    } catch (Exception unused) {
                    }
                }
                rn0.l = vs;
                rn0.f495o = 2;
                vs2 = vs;
                if (c1816io0.g(rn0) == enumC1706hi) {
                    return enumC1706hi;
                }
            }
            ((YS) vs2).e(null);
            return c2985uq0;
        } catch (Throwable th) {
            ((YS) str).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(List list, long j2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2688rn0 c2688rn0;
        InterfaceC1608gi interfaceC1608gi;
        Ds0 ds0;
        if (interfaceC0473Hh instanceof C2688rn0) {
            c2688rn0 = (C2688rn0) interfaceC0473Hh;
            int i2 = c2688rn0.f1011o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2688rn0.f1011o = i2 - Integer.MIN_VALUE;
            } else {
                c2688rn0 = new C2688rn0(this, interfaceC0473Hh);
            }
        } else {
            c2688rn0 = new C2688rn0(this, interfaceC0473Hh);
        }
        Object objI = c2688rn0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2688rn0.f1011o;
        if (i3 != 0) {
            if (i3 == 1) {
                ds0 = (Ds0) c2688rn0.l;
                Jp0.O(objI);
                return new C2495pn0((Js0) objI, ds0);
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1608gi = (InterfaceC1608gi) c2688rn0.l;
            try {
                Jp0.O(objI);
                C2495pn0 c2495pn0 = (C2495pn0) objI;
                zy0.i(interfaceC1608gi);
                return c2495pn0;
            } catch (Throwable th) {
                th = th;
                zy0.i(interfaceC1608gi);
                throw th;
            }
        }
        Jp0.O(objI);
        if (list.size() == 1) {
            ds0 = (Ds0) AbstractC0911Ye.b0(list);
            c2688rn0.l = ds0;
            c2688rn0.f1011o = 1;
            objI = I(ds0, c2688rn0);
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
            return new C2495pn0((Js0) objI, ds0);
        }
        C0497If c0497IfA = AbstractC1474fG.a();
        AtomicReference atomicReference = new AtomicReference(null);
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        Fh0 fh0A = U9.a();
        executorC0891Xk.getClass();
        C0421Fh c0421FhC = zy0.c(Sr0.z(executorC0891Xk, fh0A));
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1376eG.w(c0421FhC, null, 0, new C2979un0(c0497IfA, (Ds0) it.next(), atomicReference, null), 3));
        }
        AbstractC1376eG.w(c0421FhC, null, 0, new C2785sn0(arrayList, c0497IfA, atomicReference, null), 3);
        try {
            C2882tn0 c2882tn0 = new C2882tn0(c0497IfA, null);
            c2688rn0.l = c0421FhC;
            c2688rn0.f1011o = 2;
            objI = Nr0.I(j2, c2882tn0, c2688rn0);
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
            interfaceC1608gi = c0421FhC;
            C2495pn0 c2495pn1 = (C2495pn0) objI;
            zy0.i(interfaceC1608gi);
            return c2495pn1;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1608gi = c0421FhC;
            zy0.i(interfaceC1608gi);
            throw th;
        }
    }
}
