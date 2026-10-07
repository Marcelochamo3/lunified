package o;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: o.Cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0349Cn implements InterfaceC2784sn {
    public static final TP e;
    public final OV b;
    public final C2446pE c;
    public final boolean d;

    static {
        Pattern pattern = TP.e;
        e = AbstractC1474fG.o("application/dns-message");
    }

    public C0349Cn(OV ov, C2446pE c2446pE, boolean z) {
        this.b = ov;
        this.c = c2446pE;
        this.d = z;
    }

    public static void c(C1855j80 c1855j80, String str, List list, List list2) {
        try {
            ArrayList arrayListD = d(str, c1855j80);
            synchronized (list) {
                list.addAll(arrayListD);
            }
        } catch (Exception e2) {
            synchronized (list2) {
                list2.add(e2);
            }
        }
    }

    public static ArrayList d(String str, C1855j80 c1855j80) {
        if (c1855j80.t == null && c1855j80.m != O30.HTTP_2) {
            VY vy = VY.a;
            VY.j(VY.a, "Incorrect protocol: " + c1855j80.m, 5, 4);
        }
        try {
            if (!c1855j80.p()) {
                throw new IOException("response: " + c1855j80.f840o + ' ' + c1855j80.n);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80.r;
            AbstractC1474fG.g(abstractC2051l80);
            if (abstractC2051l80.i() <= 65536) {
                ArrayList arrayListA = AbstractC0557Kn.a(str, abstractC2051l80.p().m());
                AbstractC3409z9.g(c1855j80, null);
                return arrayListA;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + abstractC2051l80.i() + " bytes");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80, th);
                throw th2;
            }
        }
    }

    @Override // o.InterfaceC2784sn
    public final List a(String str) throws Exception {
        AbstractC1474fG.j(str, "hostname");
        if (PublicSuffixDatabase.g.a(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        b(str, arrayList, arrayList3, arrayList2, 1);
        if (this.d) {
            b(str, arrayList, arrayList3, arrayList2, 28);
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((A50) it.next()).e(new C0560Kq(arrayList2, countDownLatch, this, str, arrayList3, 1));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            arrayList2.add(e2);
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        if (arrayList2.isEmpty()) {
            throw new UnknownHostException(str);
        }
        Exception exc = (Exception) arrayList2.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(str);
        unknownHostException.initCause(exc);
        int size = arrayList2.size();
        for (int i = 1; i < size; i++) {
            AbstractC3409z9.a(unknownHostException, (Throwable) arrayList2.get(i));
        }
        throw unknownHostException;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0152  */
    public final void b(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        List<String> listS0;
        Map mapUnmodifiableMap;
        C1855j80 c1855j80G;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2112lq c2112lq = new C2112lq(1);
        String str2 = e.a;
        AbstractC1474fG.j(str2, "value");
        c2112lq.q("Accept", str2);
        int i2 = AbstractC0557Kn.a;
        AbstractC1474fG.j(str, "host");
        E9 e9 = new E9();
        e9.j0(0);
        e9.j0(256);
        e9.j0(1);
        e9.j0(0);
        e9.j0(0);
        e9.j0(0);
        E9 e10 = new E9();
        List listS1 = AbstractC1119bh0.s0(str, new char[]{'.'}, 0, 6);
        if (listS1.isEmpty()) {
            listS0 = C1233cq.l;
            break;
        }
        ListIterator listIterator = listS1.listIterator(listS1.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listS0 = AbstractC0911Ye.s0(listIterator.nextIndex() + 1, listS1);
                    break;
                }
            } else {
                listS0 = C1233cq.l;
                break;
            }
        }
        for (String str3 : listS0) {
            long jK = Jp0.K(str3);
            if (jK != str3.length()) {
                throw new IllegalArgumentException("non-ascii hostname: ".concat(str).toString());
            }
            e10.f0((int) jK);
            e10.l0(str3);
        }
        e10.f0(0);
        e10.t(e9, 0L, e10.m);
        e9.j0(i);
        e9.j0(1);
        String strR = AbstractC1899jh0.R(e9.n(e9.m).b(), "=", "", false);
        C2349oE c2349oEF = this.c.f();
        c2349oEF.a("dns", strR);
        C2446pE c2446pEB = c2349oEF.b();
        C2152mB c2152mBF = c2112lq.f();
        byte[] bArr = Mr0.a;
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C1330dq.l;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1474fG.i(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        C1951k70 c1951k70 = new C1951k70(c2446pEB, "GET", c2152mBF, null, mapUnmodifiableMap);
        OV ov = this.b;
        if (ov.v != null) {
            try {
                C0414Fa c0414Fa = new C0414Fa(false, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
                C0560Kq c0560KqA = c1951k70.a();
                String string = c0414Fa.toString();
                if (string.length() == 0) {
                    c0560KqA.n("Cache-Control");
                } else {
                    c0560KqA.j("Cache-Control", string);
                }
                c1855j80G = ov.c(c0560KqA.c()).g();
                if (c1855j80G.f840o == 504) {
                    c1855j80G = null;
                }
            } catch (IOException unused) {
            }
        } else {
            c1855j80G = null;
        }
        if (c1855j80G != null) {
            c(c1855j80G, str, arrayList2, arrayList3);
        } else {
            arrayList.add(ov.c(c1951k70));
        }
    }
}
