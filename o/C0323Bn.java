package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0323Bn {
    public static SharedPreferences c;
    public static boolean e;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ExecutorService b = Executors.newFixedThreadPool(4, new Kj0(1));
    public static volatile AbstractC0531Jn d = C0401En.e;
    public static final Rh0 f = new Rh0(C2428p3.x);
    public static final Rh0 g = new Rh0(C2428p3.w);
    public static final C2687rn h = new C2687rn(1);

    public static final C0349Cn a(String str, String... strArr) {
        NV nv = new NV();
        nv.g(Proxy.NO_PROXY);
        X9 x9 = Sr0.a;
        ArrayList arrayList = nv.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nv.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nv.e(3L, timeUnit);
        nv.i(3L, timeUnit);
        nv.k(3L, timeUnit);
        nv.c(4L, timeUnit);
        nv.f = true;
        Rh0 rh0 = C2376oc0.a;
        C2376oc0.b(nv, false);
        OV ov = new OV(nv);
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str);
        C2446pE c2446pEB = c2349oE.b();
        ArrayList arrayList3 = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList3.add(InetAddress.getByName(str2));
        }
        InetAddress[] inetAddressArr = (InetAddress[]) arrayList3.toArray(new InetAddress[0]);
        InetAddress[] inetAddressArr2 = (InetAddress[]) Arrays.copyOf(inetAddressArr, inetAddressArr.length);
        AbstractC1474fG.j(inetAddressArr2, "bootstrapDnsHosts");
        List listY = X5.Y(inetAddressArr2);
        NV nvB = ov.b();
        TP tp = C0349Cn.e;
        nvB.f(new C1271d9(c2446pEB.d, listY));
        return new C0349Cn(new OV(nvB), c2446pEB, false);
    }

    public static void b(NV nv) {
        if (e) {
            nv.f(h);
            String str = d.b;
        }
    }

    public static List c(String str) {
        if (!f(str)) {
            return C1233cq.l;
        }
        List listK = AbstractC0937Ze.K(new byte[]{104, 21, 71, 108}, new byte[]{-84, 67, -112, 122});
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(InetAddress.getByAddress(str, (byte[]) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = a;
        String lowerCase = AbstractC1119bh0.G0(str, '.').toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        concurrentHashMap.put(lowerCase, new C3463zn(SystemClock.elapsedRealtime() + 60000, arrayList));
        return arrayList;
    }

    public static List d() {
        return AbstractC0937Ze.K(C0401En.e, C0427Fn.e, C0375Dn.e, C0479Hn.e, C0453Gn.e, C0505In.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    public static void e(Context context) {
        AbstractC0531Jn abstractC0531Jn;
        AbstractC1474fG.j(context, "context");
        if (e) {
            return;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("dns_preferences", 0);
        AbstractC1474fG.i(sharedPreferences, "getSharedPreferences(...)");
        c = sharedPreferences;
        String string = sharedPreferences.getString("dns_provider_id", "cloudflare");
        if (string == null) {
            string = "cloudflare";
        }
        switch (string) {
            case "opendns":
                abstractC0531Jn = C0453Gn.e;
                break;
            case "google":
                abstractC0531Jn = C0427Fn.e;
                break;
            case "adguard":
                abstractC0531Jn = C0375Dn.e;
                break;
            case "system":
                abstractC0531Jn = C0505In.e;
                break;
            case "cloudflare":
                abstractC0531Jn = C0401En.e;
                break;
            case "quad9":
                abstractC0531Jn = C0479Hn.e;
                break;
            default:
                abstractC0531Jn = C0401En.e;
                break;
        }
        d = abstractC0531Jn;
        e = true;
        String str = d.b;
    }

    public static boolean f(String str) {
        Object objK;
        if (AbstractC1899jh0.N(str, "updates.neoplay.es", true)) {
            return true;
        }
        try {
            objK = Boolean.valueOf(AbstractC1899jh0.N(str, AbstractC1360e5.b, true));
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj = Boolean.FALSE;
        if (objK instanceof C2439p80) {
            objK = obj;
        }
        return ((Boolean) objK).booleanValue();
    }

    public static List g(String str, boolean z) throws UnknownHostException {
        List listH;
        AbstractC1474fG.j(str, "hostname");
        if (!e) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                AbstractC1474fG.i(allByName, "getAllByName(hostname)");
                return X5.Y(allByName);
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
        }
        AbstractC0531Jn abstractC0531Jn = d;
        System.currentTimeMillis();
        AtomicReference atomicReference = new AtomicReference(null);
        boolean z2 = z || f(str);
        if (z2) {
            List listH2 = h(str, z2, abstractC0531Jn, atomicReference);
            if (listH2 != null) {
                return listH2;
            }
            List listC = c(str);
            if (!(!listC.isEmpty())) {
                listC = null;
            }
            if (listC != null) {
                return listC;
            }
        }
        boolean z3 = abstractC0531Jn instanceof C0505In;
        try {
            if (z3) {
                try {
                    InetAddress[] allByName2 = InetAddress.getAllByName(str);
                    AbstractC1474fG.i(allByName2, "getAllByName(hostname)");
                    return X5.Y(allByName2);
                } catch (NullPointerException e3) {
                    UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException2.initCause(e3);
                    throw unknownHostException2;
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Iterator it = abstractC0531Jn.d.iterator();
                while (it.hasNext()) {
                    try {
                        List listI = i(str, (String) it.next());
                        if (!listI.isEmpty()) {
                            return listI;
                        }
                    } catch (Throwable th) {
                        atomicReference.set(th);
                    }
                }
            }
        } catch (Throwable th2) {
            atomicReference.set(th2);
        }
        if (!z2 && (listH = h(str, z2, abstractC0531Jn, atomicReference)) != null) {
            return listH;
        }
        if (!z3) {
            try {
                try {
                    InetAddress[] allByName3 = InetAddress.getAllByName(str);
                    AbstractC1474fG.i(allByName3, "getAllByName(hostname)");
                    return X5.Y(allByName3);
                } catch (Throwable th3) {
                    atomicReference.set(th3);
                }
            } catch (NullPointerException e4) {
                UnknownHostException unknownHostException3 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException3.initCause(e4);
                throw unknownHostException3;
            }
        }
        List listC2 = c(str);
        List list = listC2.isEmpty() ^ true ? listC2 : null;
        if (list != null) {
            return list;
        }
        UnknownHostException unknownHostException4 = new UnknownHostException("No se pudo resolver ".concat(str));
        Throwable th4 = (Throwable) atomicReference.get();
        if (th4 != null) {
            unknownHostException4.initCause(th4);
        }
        throw unknownHostException4;
    }

    public static final List h(final String str, boolean z, AbstractC0531Jn abstractC0531Jn, final AtomicReference atomicReference) {
        Future futurePoll;
        Object objK;
        String lowerCase = AbstractC1119bh0.G0(str, '.').toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        ConcurrentHashMap concurrentHashMap = a;
        C3463zn c3463zn = (C3463zn) concurrentHashMap.get(lowerCase);
        if (c3463zn != null) {
            if (c3463zn.b <= SystemClock.elapsedRealtime()) {
                c3463zn = null;
            }
            if (c3463zn != null) {
                return c3463zn.a;
            }
        }
        List<C1101bX> listK = (z || (abstractC0531Jn instanceof C0427Fn)) ? AbstractC0937Ze.K(new C1101bX("Google", C2428p3.y), new C1101bX("Cloudflare", C2428p3.z)) : AbstractC0937Ze.K(new C1101bX("Cloudflare", C2428p3.A), new C1101bX("Google", C2428p3.B));
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(b);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
        for (C1101bX c1101bX : listK) {
            final String str2 = (String) c1101bX.l;
            final InterfaceC0360Cy interfaceC0360Cy = (InterfaceC0360Cy) c1101bX.m;
            arrayList.add(executorCompletionService.submit(new Callable() { // from class: o.yn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC0360Cy interfaceC0360Cy2 = interfaceC0360Cy;
                    AbstractC1474fG.j(interfaceC0360Cy2, "$factory");
                    String str3 = str;
                    AbstractC1474fG.j(str3, "$hostname");
                    AtomicReference atomicReference2 = atomicReference;
                    AbstractC1474fG.j(atomicReference2, "$lastError");
                    String str4 = str2;
                    AbstractC1474fG.j(str4, "$name");
                    try {
                        List listA = ((InterfaceC2784sn) interfaceC0360Cy2.c()).a(str3);
                        if (!(!listA.isEmpty())) {
                            listA = null;
                        }
                        if (listA != null) {
                            return new C0297An(str4, listA);
                        }
                        return null;
                    } catch (Throwable th) {
                        atomicReference2.set(th);
                        return null;
                    }
                }
            }));
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(4500L) + System.nanoTime();
        try {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long jNanoTime = nanos - System.nanoTime();
                if (jNanoTime > 0 && (futurePoll = executorCompletionService.poll(jNanoTime, TimeUnit.NANOSECONDS)) != null) {
                    try {
                        objK = (C0297An) futurePoll.get();
                    } catch (Throwable th) {
                        objK = Jp0.k(th);
                    }
                    if (objK instanceof C2439p80) {
                        objK = null;
                    }
                    C0297An c0297An = (C0297An) objK;
                    if (c0297An != null) {
                        List listX = AbstractC0911Ye.X(c0297An.b);
                        concurrentHashMap.put(lowerCase, new C3463zn(SystemClock.elapsedRealtime() + 60000, listX));
                        System.currentTimeMillis();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Future) it.next()).cancel(true);
                        }
                        return listX;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Future) it2.next()).cancel(true);
            }
            return null;
        } catch (Throwable th2) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Future) it3.next()).cancel(true);
            }
            throw th2;
        }
    }

    public static List i(String str, String str2) throws IOException {
        AbstractC1474fG.j(str, "hostname");
        AbstractC1474fG.j(str2, "dnsServerIp");
        if (Build.VERSION.SDK_INT < 24) {
            throw new IOException("DNS UDP no compatible con esta versión de Android");
        }
        H50 h50Z = H50.z(C2848tT.m(AbstractC1119bh0.G0(str, '.') + "."), 1, 1);
        Qd0 qd0 = new Qd0(str2);
        qd0.e(Duration.ofSeconds(1L));
        List<H50> listQ = G70.b(qd0, AQ.w(h50Z)).q(1);
        AbstractC1474fG.i(listQ, "getSection(...)");
        ArrayList arrayList = new ArrayList();
        for (H50 h50 : listQ) {
            C1837j c1837j = h50 instanceof C1837j ? (C1837j) h50 : null;
            InetAddress inetAddressV = c1837j != null ? c1837j.V() : null;
            if (inetAddressV != null) {
                arrayList.add(inetAddressV);
            }
        }
        return AbstractC0911Ye.X(arrayList);
    }

    public static void j(AbstractC0531Jn abstractC0531Jn) {
        AbstractC1474fG.j(abstractC0531Jn, "provider");
        if (!e) {
            throw new IllegalStateException("DnsManager not initialized. Call DnsManager.init(context) first.");
        }
        d = abstractC0531Jn;
        a.clear();
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("dns_provider_id", abstractC0531Jn.a).commit();
        } else {
            AbstractC1474fG.U("sharedPreferences");
            throw null;
        }
    }
}
