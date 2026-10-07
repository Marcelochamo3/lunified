package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1600ge {
    public static final C1600ge a = new C1600ge();
    public static final String b = AbstractC3238xV.a("zlbNUobsFsd4ujjuT2KK4hc5UJteLM0KirVT0L4UL4o=");
    public static final Rh0 c;
    public static final Rh0 d;
    public static final I60 e;

    static {
        AbstractC3238xV.a("kBuKR8y3X9Agq2bjUXWf+0MvScwPJ5xW2qQY8McwT6A90QynQwClQzozbVEu");
        new LinkedHashMap();
        c = new Rh0(C2428p3.r);
        d = new Rh0(C2428p3.s);
        e = new I60("(?i)(?:cenc:)?default_KID\\s*=\\s*[\"'](?:urn:uuid:)?([0-9a-f-]{32,36})[\"']");
    }

    public static final String a(String str, List list) {
        return AbstractC0911Ye.h0(list, "&", AbstractC1701hf0.d(str, "?"), null, E1.q, 28);
    }

    public static final String b(String str) {
        Map mapUnmodifiableMap;
        ArrayList arrayList = AbstractC2573qe.a;
        C2446pE c2446pEC = AbstractC2573qe.c(str, EnumC2476pe.l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2112lq c2112lq = new C2112lq(1);
        c2112lq.q("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
        C2152mB c2152mBF = c2112lq.f();
        byte[] bArr = Mr0.a;
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C1330dq.l;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1474fG.i(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        A50 a50C = ((OV) c.getValue()).c(new C1951k70(c2446pEC, "GET", c2152mBF, null, mapUnmodifiableMap));
        a50C.q.g(35L, TimeUnit.SECONDS);
        C1855j80 c1855j80G = a50C.g();
        try {
            if (!c1855j80G.p()) {
                throw new IOException("Claro HTTP " + c1855j80G.f840o);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            if (abstractC2051l80 == null) {
                throw new IOException("Respuesta Claro vacía");
            }
            String strQ = abstractC2051l80.q();
            AbstractC3409z9.g(c1855j80G, null);
            return strQ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static final String c() {
        JSONObject jSONObject = O9.y;
        String str = null;
        String strOptString = jSONObject != null ? jSONObject.optString("claro_base_url") : null;
        if (strOptString != null && strOptString.length() != 0) {
            str = strOptString;
        }
        if (str == null) {
            str = AbstractC1165c5.a;
        }
        return AbstractC1701hf0.d(str, "/services/player/getmedia");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(C1600ge c1600ge, String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0936Zd c0936Zd;
        c1600ge.getClass();
        if (interfaceC0473Hh instanceof C0936Zd) {
            c0936Zd = (C0936Zd) interfaceC0473Hh;
            int i = c0936Zd.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0936Zd.n = i - Integer.MIN_VALUE;
            } else {
                c0936Zd = new C0936Zd(c1600ge, interfaceC0473Hh);
            }
        } else {
            c0936Zd = new C0936Zd(c1600ge, interfaceC0473Hh);
        }
        Object objJ = c0936Zd.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0936Zd.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C1014ae c1014ae = new C1014ae(str, null);
            c0936Zd.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c1014ae, c0936Zd);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    public static Object e(Map map, int i, String str, String str2, String str3, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        if ((i2 & 16) != 0) {
            str3 = "dashwv";
        }
        return AbstractC1376eG.J(AbstractC1910jn.b, new C0910Yd(map, i, str3, str, str2, null, null), interfaceC0473Hh);
    }

    public static boolean f(String str, String str2) {
        Object objK;
        String str3 = "";
        AbstractC1474fG.j(str2, "expectedKidHex");
        try {
            boolean z = false;
            String lowerCase = AbstractC1899jh0.R(str2, "-", "", false).toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            OV ov = (OV) d.getValue();
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
            c0560Kq.j("Origin", "https://www.clarovideo.com");
            c0560Kq.j("Referer", "https://www.clarovideo.com/");
            C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
            try {
                if (c1855j80G.p()) {
                    I60 i60 = e;
                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                    String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                    if (strQ != null) {
                        str3 = strQ;
                    }
                    C3074vm0 c3074vm0M = Vb0.M(I60.c(i60, str3), E1.r);
                    Iterator it = c3074vm0M.a.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1474fG.b((String) c3074vm0M.b.b(it.next()), lowerCase)) {
                            z = true;
                            break;
                        }
                    }
                }
                AbstractC3409z9.g(c1855j80G, null);
                objK = Boolean.valueOf(z);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
        Object obj = Boolean.FALSE;
        if (objK instanceof C2439p80) {
            objK = obj;
        }
        return ((Boolean) objK).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i, LinkedHashMap linkedHashMap, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1404ee c1404ee;
        if (interfaceC0473Hh instanceof C1404ee) {
            c1404ee = (C1404ee) interfaceC0473Hh;
            int i2 = c1404ee.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1404ee.n = i2 - Integer.MIN_VALUE;
            } else {
                c1404ee = new C1404ee(this, interfaceC0473Hh);
            }
        } else {
            c1404ee = new C1404ee(this, interfaceC0473Hh);
        }
        Object objJ = c1404ee.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1404ee.n;
        if (i3 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C1502fe c1502fe = new C1502fe(i, linkedHashMap, null);
            c1404ee.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c1502fe, c1404ee);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }
}
