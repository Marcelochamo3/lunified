package o;

import android.content.Context;
import android.os.Build;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.database.ArCacheDatabase;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2428p3 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public static final C2428p3 n = new C2428p3(0, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2428p3 f963o = new C2428p3(0, 1);
    public static final C2428p3 p = new C2428p3(0, 2);
    public static final C2428p3 q = new C2428p3(0, 3);
    public static final C2428p3 r = new C2428p3(0, 4);
    public static final C2428p3 s = new C2428p3(0, 5);
    public static final C2428p3 t = new C2428p3(0, 6);
    public static final C2428p3 u = new C2428p3(0, 7);
    public static final C2428p3 v = new C2428p3(0, 8);
    public static final C2428p3 w = new C2428p3(0, 9);
    public static final C2428p3 x = new C2428p3(0, 10);
    public static final C2428p3 y = new C2428p3(0, 11);
    public static final C2428p3 z = new C2428p3(0, 12);
    public static final C2428p3 A = new C2428p3(0, 13);
    public static final C2428p3 B = new C2428p3(0, 14);
    public static final C2428p3 C = new C2428p3(0, 15);
    public static final C2428p3 D = new C2428p3(0, 16);
    public static final C2428p3 E = new C2428p3(0, 17);
    public static final C2428p3 F = new C2428p3(0, 18);
    public static final C2428p3 G = new C2428p3(0, 19);
    public static final C2428p3 H = new C2428p3(0, 20);
    public static final C2428p3 I = new C2428p3(0, 21);
    public static final C2428p3 J = new C2428p3(0, 22);
    public static final C2428p3 K = new C2428p3(0, 23);
    public static final C2428p3 L = new C2428p3(0, 24);
    public static final C2428p3 M = new C2428p3(0, 25);
    public static final C2428p3 N = new C2428p3(0, 26);
    public static final C2428p3 O = new C2428p3(0, 27);
    public static final C2428p3 P = new C2428p3(0, 28);
    public static final C2428p3 Q = new C2428p3(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2428p3(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        int i = 10;
        int i2 = 12;
        int i3 = 6;
        int i4 = 0;
        int i5 = 1;
        switch (this.m) {
            case 0:
                return O9.m(true);
            case 1:
                O9 o9 = ArCacheDatabase.m;
                MyApplication myApplication = MyApplication.l;
                MyApplication myApplicationS = Jp0.s();
                ArCacheDatabase arCacheDatabase = ArCacheDatabase.n;
                if (arCacheDatabase == null) {
                    synchronized (o9) {
                        arCacheDatabase = ArCacheDatabase.n;
                        if (arCacheDatabase == null) {
                            Context applicationContext = myApplicationS.getApplicationContext();
                            AbstractC1474fG.i(applicationContext, "getApplicationContext(...)");
                            E80 e80J = Nr0.j(applicationContext, ArCacheDatabase.class, "ar_cache.db");
                            e80J.a(ArCacheDatabase.f48o);
                            F80 f80B = e80J.b();
                            ArCacheDatabase.n = (ArCacheDatabase) f80B;
                            arCacheDatabase = (ArCacheDatabase) f80B;
                        }
                    }
                }
                return arCacheDatabase.o();
            case 2:
                NV nv = new NV();
                nv.g(Proxy.NO_PROXY);
                nv.h(InterfaceC2339o7.a);
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
                nv.e(15L, timeUnit);
                nv.i(20L, timeUnit);
                return new OV(nv);
            case 3:
                NV nv2 = new NV();
                nv2.g(Proxy.NO_PROXY);
                nv2.h(InterfaceC2339o7.a);
                X9 x12 = Sr0.a;
                ArrayList arrayList3 = nv2.c;
                arrayList3.add(x12);
                X9 x13 = Sr0.b;
                ArrayList arrayList4 = nv2.d;
                arrayList4.add(x13);
                X9 x14 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList3, X10.q);
                AbstractC1406ef.S(arrayList4, X10.r);
                arrayList3.add(x14);
                arrayList4.add(x14);
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                nv2.e(15L, timeUnit2);
                nv2.i(20L, timeUnit2);
                return new OV(nv2);
            case 4:
                NV nvB = AbstractC2573qe.b();
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                nvB.e(20L, timeUnit3);
                nvB.i(30L, timeUnit3);
                return new OV(nvB);
            case 5:
                NV nv3 = new NV();
                nv3.g(Proxy.NO_PROXY);
                nv3.h(InterfaceC2339o7.a);
                X9 x15 = Sr0.a;
                ArrayList arrayList5 = nv3.c;
                arrayList5.add(x15);
                X9 x16 = Sr0.b;
                ArrayList arrayList6 = nv3.d;
                arrayList6.add(x16);
                X9 x17 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList5, X10.q);
                AbstractC1406ef.S(arrayList6, X10.r);
                arrayList5.add(x17);
                arrayList6.add(x17);
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                nv3.e(15L, timeUnit4);
                nv3.i(20L, timeUnit4);
                return new OV(nv3);
            case 6:
                return new C3380yu();
            case 7:
                ArrayList arrayList7 = new ArrayList();
                for (String str : AbstractC2573qe.a) {
                    AbstractC1474fG.j(str, "pattern");
                    for (String str2 : new String[]{"sha256/qBRjZmOmkSNJL0p70zek7odSIzqs/muR4Jk9xYyCP+E="}) {
                        arrayList7.add(new C2956uc(str, str2));
                    }
                    for (String str3 : new String[]{"sha256/bDi02Jb82ljEGqWtezobfV2EW12LjZtUXEWrA3GY3Tw="}) {
                        arrayList7.add(new C2956uc(str, str3));
                    }
                }
                return new C3150wc(AbstractC0911Ye.B0(arrayList7), null);
            case 8:
                if (Build.VERSION.SDK_INT < 23) {
                    return C2879tm.a();
                }
                try {
                    return C2879tm.b();
                } catch (Throwable unused) {
                    return C2879tm.a();
                }
            case 9:
                return C0323Bn.a("https://cloudflare-dns.com/dns-query", "1.1.1.1", "1.0.0.1");
            case 10:
                return C0323Bn.a("https://dns.google/dns-query", "8.8.8.8", "8.8.4.4");
            case 11:
                return (InterfaceC2784sn) C0323Bn.f.getValue();
            case 12:
                return (InterfaceC2784sn) C0323Bn.g.getValue();
            case 13:
                return (InterfaceC2784sn) C0323Bn.g.getValue();
            case 14:
                return (InterfaceC2784sn) C0323Bn.f.getValue();
            case 15:
                return AbstractC0937Ze.K(new C1292dT(i5), new C0971a50(i4), new C0971a50(i5), new C2850tV(0), new Uu0(), new C1292dT(3), new C1292dT(5), new C2507pt0(), new C1292dT(i3), new C1340dv(), new C1435et0(i4), new C1435et0(i5), new C1292dT(i4), new VQ(0), new C1292dT(7), new Mg0(), new Ig0(), new C1292dT(4), new C1292dT(8), new C0920Yn(0), new VQ(1), new C1292dT(2), new C2850tV(1), new LB(0), new VQ(2), new C3380yu(), new C1292dT(11), new C3041vS(), new ty0(), new LB(3), new LB(1), new P80(), new LB(2), new C0920Yn(1), new C1641gy0(), new C0707Qi(), new C1292dT(10));
            case 16:
                C3084vr0 c3084vr0 = C3084vr0.a;
                NV nvO = AbstractC1701hf0.o();
                X9 x18 = Sr0.a;
                ArrayList arrayList8 = nvO.c;
                arrayList8.add(x18);
                X9 x19 = Sr0.b;
                ArrayList arrayList9 = nvO.d;
                arrayList9.add(x19);
                X9 x20 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList8, X10.q);
                AbstractC1406ef.S(arrayList9, X10.r);
                arrayList8.add(x20);
                arrayList9.add(x20);
                nvO.h = true;
                nvO.i = true;
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.b(nvO);
                arrayList8.add(new C2480pg(i3));
                TimeUnit timeUnit5 = TimeUnit.SECONDS;
                nvO.i(8L, timeUnit5);
                nvO.e(6L, timeUnit5);
                return new OV(nvO);
            case 17:
                return null;
            case 18:
                return C2834tF.a(false, true);
            case 19:
                return C2834tF.a(false, false);
            case 20:
                return C2985uq0.a;
            case 21:
                int[] iArr = {158, 55, Yu0.b.h0, 185, Yu0.b.k0, 74, 124, 21};
                int[] iArr2 = {Yu0.b.z0, 156, 192, 96, 92, 237, 200, 52};
                byte[] bArr = new byte[16];
                for (int i6 = 16; i4 < i6; i6 = 16) {
                    bArr[i4] = (byte) (i4 < 8 ? iArr[i4] : iArr2[i4 - 8]);
                    i4++;
                }
                return bArr;
            case 22:
                return new OV(AbstractC1370eA.h());
            case 23:
                NV nvH = AbstractC1370eA.h();
                nvH.c.add(new C2480pg(i));
                OV ov = new OV(nvH);
                C1583gR c1583gRK = AbstractC1370eA.k();
                c1583gRK.f("https://rest.opensubtitles.org/");
                c1583gRK.m = ov;
                ((ArrayList) c1583gRK.f793o).add(DA.c());
                Object objB = c1583gRK.m().b(InterfaceC3239xW.class);
                AbstractC1474fG.i(objB, "create(...)");
                return (InterfaceC3239xW) objB;
            case 24:
                NV nv4 = new NV();
                nv4.g(Proxy.NO_PROXY);
                nv4.h(InterfaceC2339o7.a);
                X9 x21 = Sr0.a;
                ArrayList arrayList10 = nv4.c;
                arrayList10.add(x21);
                X9 x22 = Sr0.b;
                ArrayList arrayList11 = nv4.d;
                arrayList11.add(x22);
                X9 x23 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList10, X10.q);
                AbstractC1406ef.S(arrayList11, X10.r);
                arrayList10.add(x23);
                arrayList11.add(x23);
                TimeUnit timeUnit6 = TimeUnit.SECONDS;
                nv4.e(15L, timeUnit6);
                nv4.i(20L, timeUnit6);
                nv4.h = true;
                nv4.i = true;
                C2938uM c2938uM = QW.d;
                AbstractC1474fG.j(c2938uM, "cookieJar");
                nv4.j = c2938uM;
                ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                C0323Bn.b(nv4);
                return new OV(nv4);
            case 25:
                C3084vr0 c3084vr1 = C3084vr0.a;
                NV nvO2 = AbstractC1701hf0.o();
                nvO2.c.add(Sr0.a);
                nvO2.d.add(Sr0.b);
                X9 x24 = AbstractC1370eA.m;
                AbstractC1406ef.S(nvO2.c, X10.q);
                AbstractC1406ef.S(nvO2.d, X10.r);
                nvO2.c.add(x24);
                nvO2.d.add(x24);
                C1041ar0 c1041ar0 = C3084vr0.t;
                if (c1041ar0 != null) {
                    if (c1041ar0.f <= System.currentTimeMillis() + 90000) {
                        c1041ar0 = null;
                    }
                    if (c1041ar0 != null) {
                        nvO2.g(c1041ar0.a());
                        nvO2.h(new Wq0(c1041ar0, i4));
                    }
                }
                nvO2.h = true;
                nvO2.i = true;
                ConcurrentHashMap concurrentHashMap3 = C0323Bn.a;
                C0323Bn.b(nvO2);
                nvO2.c.add(new C2480pg(i2));
                TimeUnit timeUnit7 = TimeUnit.SECONDS;
                nvO2.i(30L, timeUnit7);
                nvO2.e(30L, timeUnit7);
                OV ov2 = new OV(nvO2);
                C1583gR c1583gR = new C1583gR(12);
                C1590gY c1590gY = C1590gY.b;
                c1583gR.f("https://pelisplus.to");
                ((ArrayList) c1583gR.f793o).add(new P9(i5));
                c1583gR.m = ov2;
                return (RX) c1583gR.m().b(RX.class);
            case 26:
                String str4 = Build.MODEL;
                if (str4 == null) {
                    str4 = "";
                }
                Locale locale = Locale.ROOT;
                String lowerCase = str4.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                String str5 = Build.DEVICE;
                if (str5 == null) {
                    str5 = "";
                }
                String lowerCase2 = str5.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                String str6 = Build.HARDWARE;
                if (str6 == null) {
                    str6 = "";
                }
                String lowerCase3 = str6.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                String str7 = Build.MANUFACTURER;
                String lowerCase4 = (str7 != null ? str7 : "").toLowerCase(locale);
                AbstractC1474fG.i(lowerCase4, "toLowerCase(...)");
                return (Build.VERSION.SDK_INT <= 25 || AbstractC1119bh0.W(lowerCase, "rk322", false) || AbstractC1119bh0.W(lowerCase2, "rk322", false) || AbstractC1119bh0.W(lowerCase3, "rk322", false) || AbstractC1119bh0.W(lowerCase4, "rockchip", false)) ? EnumC1103bZ.m : EnumC1103bZ.l;
            case 27:
                NV nv5 = new NV();
                nv5.g(Proxy.NO_PROXY);
                nv5.h(InterfaceC2339o7.a);
                X9 x25 = Sr0.a;
                ArrayList arrayList12 = nv5.c;
                arrayList12.add(x25);
                X9 x26 = Sr0.b;
                ArrayList arrayList13 = nv5.d;
                arrayList13.add(x26);
                X9 x27 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList12, X10.q);
                AbstractC1406ef.S(arrayList13, X10.r);
                arrayList12.add(x27);
                arrayList13.add(x27);
                TimeUnit timeUnit8 = TimeUnit.SECONDS;
                nv5.e(15L, timeUnit8);
                nv5.i(20L, timeUnit8);
                nv5.h = true;
                nv5.i = true;
                ConcurrentHashMap concurrentHashMap4 = C0323Bn.a;
                C0323Bn.b(nv5);
                return new OV(nv5);
            case 28:
                return C1791ib0.a(false, (4 & 2) != 0, false);
            default:
                return C1791ib0.a(false, (4 & 2) != 0, false);
        }
    }
}
