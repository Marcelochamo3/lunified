package o;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2197mk implements N7, InterfaceC2590qm0 {
    public static final M60 n = AbstractC0985aF.p(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M60 f920o = AbstractC0985aF.p(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final M60 p = AbstractC0985aF.p(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final M60 q = AbstractC0985aF.p(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final M60 r = AbstractC0985aF.p(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final M60 s = AbstractC0985aF.p(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static C2197mk t;
    public final AbstractC1278dF a;
    public final C2133m1 b = new C2133m1(6);
    public final C3349ye0 c;
    public final Sh0 d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public C2197mk(Context context, HashMap map, int i, Sh0 sh0, boolean z) {
        this.a = AbstractC1278dF.b(map);
        this.c = new C3349ye0(i);
        this.d = sh0;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = b(0);
            return;
        }
        QU quC = QU.c(context);
        int iD = quC.d();
        this.i = iD;
        this.l = b(iD);
        C2002kk c2002kk = new C2002kk(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) quC.c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c2002kk));
        ((Handler) quC.b).post(new O3(quC, 11, c2002kk));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public static int[] a(String str) {
        byte b = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                if (!str.equals("AD")) {
                    b = -1;
                }
                break;
            case 2084:
                if (!str.equals("AE")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 2085:
                if (!str.equals("AF")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 2086:
                if (!str.equals("AG")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 2088:
                if (!str.equals("AI")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 2091:
                if (!str.equals("AL")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 2092:
                if (!str.equals("AM")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 2094:
                if (!str.equals("AO")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 2096:
                if (!str.equals("AQ")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 2098:
                if (!str.equals("AS")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2099:
                if (!str.equals("AT")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 2100:
                if (!str.equals("AU")) {
                    b = -1;
                } else {
                    b = C3285xv.h;
                }
                break;
            case 2102:
                if (!str.equals("AW")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 2103:
                if (!str.equals("AX")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 2105:
                if (!str.equals("AZ")) {
                    b = -1;
                } else {
                    b = 14;
                }
                break;
            case 2111:
                if (!str.equals("BA")) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case 2112:
                if (!str.equals("BB")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 2114:
                if (!str.equals("BD")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 2115:
                if (!str.equals("BE")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 2116:
                if (!str.equals("BF")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 2117:
                if (!str.equals("BG")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 2118:
                if (!str.equals("BH")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 2119:
                if (!str.equals("BI")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 2120:
                if (!str.equals("BJ")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 2122:
                if (!str.equals("BL")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 2123:
                if (!str.equals("BM")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case 2124:
                if (!str.equals("BN")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 2125:
                if (!str.equals("BO")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 2127:
                if (!str.equals("BQ")) {
                    b = -1;
                } else {
                    b = 28;
                }
                break;
            case 2128:
                if (!str.equals("BR")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 2129:
                if (!str.equals("BS")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 2130:
                if (!str.equals("BT")) {
                    b = -1;
                } else {
                    b = 31;
                }
                break;
            case 2133:
                if (!str.equals("BW")) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case 2135:
                if (!str.equals("BY")) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case 2136:
                if (!str.equals("BZ")) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case 2142:
                if (!str.equals("CA")) {
                    b = -1;
                } else {
                    b = 35;
                }
                break;
            case 2145:
                if (!str.equals("CD")) {
                    b = -1;
                } else {
                    b = 36;
                }
                break;
            case 2147:
                if (!str.equals("CF")) {
                    b = -1;
                } else {
                    b = 37;
                }
                break;
            case 2148:
                if (!str.equals("CG")) {
                    b = -1;
                } else {
                    b = 38;
                }
                break;
            case 2149:
                if (!str.equals("CH")) {
                    b = -1;
                } else {
                    b = 39;
                }
                break;
            case 2150:
                if (!str.equals("CI")) {
                    b = -1;
                } else {
                    b = 40;
                }
                break;
            case 2152:
                if (!str.equals("CK")) {
                    b = -1;
                } else {
                    b = 41;
                }
                break;
            case 2153:
                if (!str.equals("CL")) {
                    b = -1;
                } else {
                    b = 42;
                }
                break;
            case 2154:
                if (!str.equals("CM")) {
                    b = -1;
                } else {
                    b = 43;
                }
                break;
            case 2155:
                if (!str.equals("CN")) {
                    b = -1;
                } else {
                    b = 44;
                }
                break;
            case 2156:
                if (!str.equals("CO")) {
                    b = -1;
                } else {
                    b = 45;
                }
                break;
            case 2159:
                if (!str.equals("CR")) {
                    b = -1;
                } else {
                    b = 46;
                }
                break;
            case 2162:
                if (!str.equals("CU")) {
                    b = -1;
                } else {
                    b = 47;
                }
                break;
            case 2163:
                if (!str.equals("CV")) {
                    b = -1;
                } else {
                    b = 48;
                }
                break;
            case 2164:
                if (!str.equals("CW")) {
                    b = -1;
                } else {
                    b = 49;
                }
                break;
            case 2165:
                if (!str.equals("CX")) {
                    b = -1;
                } else {
                    b = 50;
                }
                break;
            case 2166:
                if (!str.equals("CY")) {
                    b = -1;
                } else {
                    b = 51;
                }
                break;
            case 2167:
                if (!str.equals("CZ")) {
                    b = -1;
                } else {
                    b = 52;
                }
                break;
            case 2177:
                if (!str.equals("DE")) {
                    b = -1;
                } else {
                    b = 53;
                }
                break;
            case 2182:
                if (!str.equals("DJ")) {
                    b = -1;
                } else {
                    b = 54;
                }
                break;
            case 2183:
                if (!str.equals("DK")) {
                    b = -1;
                } else {
                    b = 55;
                }
                break;
            case 2185:
                if (!str.equals("DM")) {
                    b = -1;
                } else {
                    b = 56;
                }
                break;
            case 2187:
                if (!str.equals("DO")) {
                    b = -1;
                } else {
                    b = 57;
                }
                break;
            case 2198:
                if (!str.equals("DZ")) {
                    b = -1;
                } else {
                    b = 58;
                }
                break;
            case 2206:
                if (!str.equals("EC")) {
                    b = -1;
                } else {
                    b = 59;
                }
                break;
            case 2208:
                if (!str.equals("EE")) {
                    b = -1;
                } else {
                    b = 60;
                }
                break;
            case 2210:
                if (!str.equals("EG")) {
                    b = -1;
                } else {
                    b = 61;
                }
                break;
            case 2221:
                if (!str.equals("ER")) {
                    b = -1;
                } else {
                    b = 62;
                }
                break;
            case 2222:
                if (!str.equals("ES")) {
                    b = -1;
                } else {
                    b = 63;
                }
                break;
            case 2223:
                if (!str.equals("ET")) {
                    b = -1;
                } else {
                    b = 64;
                }
                break;
            case 2243:
                if (!str.equals("FI")) {
                    b = -1;
                } else {
                    b = 65;
                }
                break;
            case 2244:
                if (!str.equals("FJ")) {
                    b = -1;
                } else {
                    b = 66;
                }
                break;
            case 2247:
                if (!str.equals("FM")) {
                    b = -1;
                } else {
                    b = 67;
                }
                break;
            case 2249:
                if (!str.equals("FO")) {
                    b = -1;
                } else {
                    b = 68;
                }
                break;
            case 2252:
                if (!str.equals("FR")) {
                    b = -1;
                } else {
                    b = 69;
                }
                break;
            case 2266:
                if (!str.equals("GA")) {
                    b = -1;
                } else {
                    b = 70;
                }
                break;
            case 2267:
                if (!str.equals("GB")) {
                    b = -1;
                } else {
                    b = 71;
                }
                break;
            case 2269:
                if (!str.equals("GD")) {
                    b = -1;
                } else {
                    b = 72;
                }
                break;
            case 2270:
                if (!str.equals("GE")) {
                    b = -1;
                } else {
                    b = 73;
                }
                break;
            case 2271:
                if (!str.equals("GF")) {
                    b = -1;
                } else {
                    b = 74;
                }
                break;
            case 2272:
                if (!str.equals("GG")) {
                    b = -1;
                } else {
                    b = 75;
                }
                break;
            case 2273:
                if (!str.equals("GH")) {
                    b = -1;
                } else {
                    b = 76;
                }
                break;
            case 2274:
                if (!str.equals("GI")) {
                    b = -1;
                } else {
                    b = 77;
                }
                break;
            case 2277:
                if (!str.equals("GL")) {
                    b = -1;
                } else {
                    b = 78;
                }
                break;
            case 2278:
                if (!str.equals("GM")) {
                    b = -1;
                } else {
                    b = 79;
                }
                break;
            case 2279:
                if (!str.equals("GN")) {
                    b = -1;
                } else {
                    b = 80;
                }
                break;
            case 2281:
                if (!str.equals("GP")) {
                    b = -1;
                } else {
                    b = 81;
                }
                break;
            case 2282:
                if (!str.equals("GQ")) {
                    b = -1;
                } else {
                    b = 82;
                }
                break;
            case 2283:
                if (!str.equals("GR")) {
                    b = -1;
                } else {
                    b = 83;
                }
                break;
            case 2285:
                if (!str.equals("GT")) {
                    b = -1;
                } else {
                    b = 84;
                }
                break;
            case 2286:
                if (!str.equals("GU")) {
                    b = -1;
                } else {
                    b = 85;
                }
                break;
            case 2288:
                if (!str.equals("GW")) {
                    b = -1;
                } else {
                    b = 86;
                }
                break;
            case 2290:
                if (!str.equals("GY")) {
                    b = -1;
                } else {
                    b = 87;
                }
                break;
            case 2307:
                if (!str.equals("HK")) {
                    b = -1;
                } else {
                    b = 88;
                }
                break;
            case 2310:
                if (!str.equals("HN")) {
                    b = -1;
                } else {
                    b = 89;
                }
                break;
            case 2314:
                if (!str.equals("HR")) {
                    b = -1;
                } else {
                    b = 90;
                }
                break;
            case 2316:
                if (!str.equals("HT")) {
                    b = -1;
                } else {
                    b = 91;
                }
                break;
            case 2317:
                if (!str.equals("HU")) {
                    b = -1;
                } else {
                    b = 92;
                }
                break;
            case 2331:
                if (!str.equals("ID")) {
                    b = -1;
                } else {
                    b = 93;
                }
                break;
            case 2332:
                if (!str.equals("IE")) {
                    b = -1;
                } else {
                    b = 94;
                }
                break;
            case 2339:
                if (!str.equals("IL")) {
                    b = -1;
                } else {
                    b = 95;
                }
                break;
            case 2340:
                if (!str.equals("IM")) {
                    b = -1;
                } else {
                    b = 96;
                }
                break;
            case 2341:
                if (!str.equals("IN")) {
                    b = -1;
                } else {
                    b = 97;
                }
                break;
            case 2342:
                if (!str.equals("IO")) {
                    b = -1;
                } else {
                    b = 98;
                }
                break;
            case 2344:
                if (!str.equals("IQ")) {
                    b = -1;
                } else {
                    b = 99;
                }
                break;
            case 2345:
                if (!str.equals("IR")) {
                    b = -1;
                } else {
                    b = 100;
                }
                break;
            case 2346:
                if (!str.equals("IS")) {
                    b = -1;
                } else {
                    b = 101;
                }
                break;
            case 2347:
                if (!str.equals("IT")) {
                    b = -1;
                } else {
                    b = 102;
                }
                break;
            case 2363:
                if (!str.equals("JE")) {
                    b = -1;
                } else {
                    b = 103;
                }
                break;
            case 2371:
                if (!str.equals("JM")) {
                    b = -1;
                } else {
                    b = 104;
                }
                break;
            case 2373:
                if (!str.equals("JO")) {
                    b = -1;
                } else {
                    b = 105;
                }
                break;
            case 2374:
                if (!str.equals("JP")) {
                    b = -1;
                } else {
                    b = 106;
                }
                break;
            case 2394:
                if (!str.equals("KE")) {
                    b = -1;
                } else {
                    b = 107;
                }
                break;
            case 2396:
                if (!str.equals("KG")) {
                    b = -1;
                } else {
                    b = 108;
                }
                break;
            case 2397:
                if (!str.equals("KH")) {
                    b = -1;
                } else {
                    b = 109;
                }
                break;
            case 2398:
                if (!str.equals("KI")) {
                    b = -1;
                } else {
                    b = 110;
                }
                break;
            case 2402:
                if (!str.equals("KM")) {
                    b = -1;
                } else {
                    b = 111;
                }
                break;
            case 2403:
                if (!str.equals("KN")) {
                    b = -1;
                } else {
                    b = 112;
                }
                break;
            case 2407:
                if (!str.equals("KR")) {
                    b = -1;
                } else {
                    b = 113;
                }
                break;
            case 2412:
                if (!str.equals("KW")) {
                    b = -1;
                } else {
                    b = 114;
                }
                break;
            case 2414:
                if (!str.equals("KY")) {
                    b = -1;
                } else {
                    b = 115;
                }
                break;
            case 2415:
                if (!str.equals("KZ")) {
                    b = -1;
                } else {
                    b = 116;
                }
                break;
            case 2421:
                if (!str.equals("LA")) {
                    b = -1;
                } else {
                    b = 117;
                }
                break;
            case 2422:
                if (!str.equals("LB")) {
                    b = -1;
                } else {
                    b = 118;
                }
                break;
            case 2423:
                if (!str.equals("LC")) {
                    b = -1;
                } else {
                    b = 119;
                }
                break;
            case 2429:
                if (!str.equals("LI")) {
                    b = -1;
                } else {
                    b = 120;
                }
                break;
            case 2431:
                if (!str.equals("LK")) {
                    b = -1;
                } else {
                    b = 121;
                }
                break;
            case 2438:
                if (!str.equals("LR")) {
                    b = -1;
                } else {
                    b = 122;
                }
                break;
            case 2439:
                if (!str.equals("LS")) {
                    b = -1;
                } else {
                    b = 123;
                }
                break;
            case 2440:
                if (!str.equals("LT")) {
                    b = -1;
                } else {
                    b = 124;
                }
                break;
            case 2441:
                if (!str.equals("LU")) {
                    b = -1;
                } else {
                    b = 125;
                }
                break;
            case 2442:
                if (!str.equals("LV")) {
                    b = -1;
                } else {
                    b = 126;
                }
                break;
            case 2445:
                if (!str.equals("LY")) {
                    b = -1;
                } else {
                    b = 127;
                }
                break;
            case 2452:
                if (!str.equals("MA")) {
                    b = -1;
                } else {
                    b = 128;
                }
                break;
            case 2454:
                if (!str.equals("MC")) {
                    b = -1;
                } else {
                    b = 129;
                }
                break;
            case 2455:
                if (!str.equals("MD")) {
                    b = -1;
                } else {
                    b = 130;
                }
                break;
            case 2456:
                if (!str.equals("ME")) {
                    b = -1;
                } else {
                    b = 131;
                }
                break;
            case 2457:
                if (!str.equals("MF")) {
                    b = -1;
                } else {
                    b = 132;
                }
                break;
            case 2458:
                if (!str.equals("MG")) {
                    b = -1;
                } else {
                    b = 133;
                }
                break;
            case 2459:
                if (!str.equals("MH")) {
                    b = -1;
                } else {
                    b = 134;
                }
                break;
            case 2462:
                if (!str.equals("MK")) {
                    b = -1;
                } else {
                    b = 135;
                }
                break;
            case 2463:
                if (!str.equals("ML")) {
                    b = -1;
                } else {
                    b = 136;
                }
                break;
            case 2464:
                if (!str.equals("MM")) {
                    b = -1;
                } else {
                    b = 137;
                }
                break;
            case 2465:
                if (!str.equals("MN")) {
                    b = -1;
                } else {
                    b = 138;
                }
                break;
            case 2466:
                if (!str.equals("MO")) {
                    b = -1;
                } else {
                    b = 139;
                }
                break;
            case 2467:
                if (!str.equals("MP")) {
                    b = -1;
                } else {
                    b = 140;
                }
                break;
            case 2468:
                if (!str.equals("MQ")) {
                    b = -1;
                } else {
                    b = 141;
                }
                break;
            case 2469:
                if (!str.equals("MR")) {
                    b = -1;
                } else {
                    b = 142;
                }
                break;
            case 2470:
                if (!str.equals("MS")) {
                    b = -1;
                } else {
                    b = 143;
                }
                break;
            case 2471:
                if (!str.equals("MT")) {
                    b = -1;
                } else {
                    b = 144;
                }
                break;
            case 2472:
                if (!str.equals("MU")) {
                    b = -1;
                } else {
                    b = 145;
                }
                break;
            case 2473:
                if (!str.equals("MV")) {
                    b = -1;
                } else {
                    b = 146;
                }
                break;
            case 2474:
                if (!str.equals("MW")) {
                    b = -1;
                } else {
                    b = 147;
                }
                break;
            case 2475:
                if (!str.equals("MX")) {
                    b = -1;
                } else {
                    b = 148;
                }
                break;
            case 2476:
                if (!str.equals("MY")) {
                    b = -1;
                } else {
                    b = 149;
                }
                break;
            case 2477:
                if (!str.equals("MZ")) {
                    b = -1;
                } else {
                    b = 150;
                }
                break;
            case 2483:
                if (!str.equals("NA")) {
                    b = -1;
                } else {
                    b = 151;
                }
                break;
            case 2485:
                if (!str.equals("NC")) {
                    b = -1;
                } else {
                    b = 152;
                }
                break;
            case 2487:
                if (!str.equals("NE")) {
                    b = -1;
                } else {
                    b = 153;
                }
                break;
            case 2489:
                if (!str.equals("NG")) {
                    b = -1;
                } else {
                    b = 154;
                }
                break;
            case 2491:
                if (!str.equals("NI")) {
                    b = -1;
                } else {
                    b = 155;
                }
                break;
            case 2494:
                if (!str.equals("NL")) {
                    b = -1;
                } else {
                    b = 156;
                }
                break;
            case 2497:
                if (!str.equals("NO")) {
                    b = -1;
                } else {
                    b = 157;
                }
                break;
            case 2498:
                if (!str.equals("NP")) {
                    b = -1;
                } else {
                    b = 158;
                }
                break;
            case 2500:
                if (!str.equals("NR")) {
                    b = -1;
                } else {
                    b = 159;
                }
                break;
            case 2503:
                if (!str.equals("NU")) {
                    b = -1;
                } else {
                    b = 160;
                }
                break;
            case 2508:
                if (!str.equals("NZ")) {
                    b = -1;
                } else {
                    b = 161;
                }
                break;
            case 2526:
                if (!str.equals("OM")) {
                    b = -1;
                } else {
                    b = 162;
                }
                break;
            case 2545:
                if (!str.equals("PA")) {
                    b = -1;
                } else {
                    b = 163;
                }
                break;
            case 2549:
                if (!str.equals("PE")) {
                    b = -1;
                } else {
                    b = 164;
                }
                break;
            case 2550:
                if (!str.equals("PF")) {
                    b = -1;
                } else {
                    b = 165;
                }
                break;
            case 2551:
                if (!str.equals("PG")) {
                    b = -1;
                } else {
                    b = 166;
                }
                break;
            case 2552:
                if (!str.equals("PH")) {
                    b = -1;
                } else {
                    b = 167;
                }
                break;
            case 2555:
                if (!str.equals("PK")) {
                    b = -1;
                } else {
                    b = 168;
                }
                break;
            case 2556:
                if (!str.equals("PL")) {
                    b = -1;
                } else {
                    b = 169;
                }
                break;
            case 2557:
                if (!str.equals("PM")) {
                    b = -1;
                } else {
                    b = 170;
                }
                break;
            case 2562:
                if (!str.equals("PR")) {
                    b = -1;
                } else {
                    b = 171;
                }
                break;
            case 2563:
                if (!str.equals("PS")) {
                    b = -1;
                } else {
                    b = 172;
                }
                break;
            case 2564:
                if (!str.equals("PT")) {
                    b = -1;
                } else {
                    b = 173;
                }
                break;
            case 2567:
                if (!str.equals("PW")) {
                    b = -1;
                } else {
                    b = 174;
                }
                break;
            case 2569:
                if (!str.equals("PY")) {
                    b = -1;
                } else {
                    b = 175;
                }
                break;
            case 2576:
                if (!str.equals("QA")) {
                    b = -1;
                } else {
                    b = 176;
                }
                break;
            case 2611:
                if (!str.equals("RE")) {
                    b = -1;
                } else {
                    b = 177;
                }
                break;
            case 2621:
                if (!str.equals("RO")) {
                    b = -1;
                } else {
                    b = 178;
                }
                break;
            case 2625:
                if (!str.equals("RS")) {
                    b = -1;
                } else {
                    b = 179;
                }
                break;
            case 2627:
                if (!str.equals("RU")) {
                    b = -1;
                } else {
                    b = 180;
                }
                break;
            case 2629:
                if (!str.equals("RW")) {
                    b = -1;
                } else {
                    b = 181;
                }
                break;
            case 2638:
                if (!str.equals("SA")) {
                    b = -1;
                } else {
                    b = 182;
                }
                break;
            case 2639:
                if (!str.equals("SB")) {
                    b = -1;
                } else {
                    b = 183;
                }
                break;
            case 2640:
                if (!str.equals("SC")) {
                    b = -1;
                } else {
                    b = 184;
                }
                break;
            case 2641:
                if (!str.equals("SD")) {
                    b = -1;
                } else {
                    b = 185;
                }
                break;
            case 2642:
                if (!str.equals("SE")) {
                    b = -1;
                } else {
                    b = 186;
                }
                break;
            case 2644:
                if (!str.equals("SG")) {
                    b = -1;
                } else {
                    b = 187;
                }
                break;
            case 2645:
                if (!str.equals("SH")) {
                    b = -1;
                } else {
                    b = 188;
                }
                break;
            case 2646:
                if (!str.equals("SI")) {
                    b = -1;
                } else {
                    b = 189;
                }
                break;
            case 2647:
                if (!str.equals("SJ")) {
                    b = -1;
                } else {
                    b = 190;
                }
                break;
            case 2648:
                if (!str.equals("SK")) {
                    b = -1;
                } else {
                    b = 191;
                }
                break;
            case 2649:
                if (!str.equals("SL")) {
                    b = -1;
                } else {
                    b = 192;
                }
                break;
            case 2650:
                if (!str.equals("SM")) {
                    b = -1;
                } else {
                    b = 193;
                }
                break;
            case 2651:
                if (!str.equals("SN")) {
                    b = -1;
                } else {
                    b = 194;
                }
                break;
            case 2652:
                if (!str.equals("SO")) {
                    b = -1;
                } else {
                    b = 195;
                }
                break;
            case 2655:
                if (!str.equals("SR")) {
                    b = -1;
                } else {
                    b = 196;
                }
                break;
            case 2656:
                if (!str.equals("SS")) {
                    b = -1;
                } else {
                    b = 197;
                }
                break;
            case 2657:
                if (!str.equals("ST")) {
                    b = -1;
                } else {
                    b = 198;
                }
                break;
            case 2659:
                if (!str.equals("SV")) {
                    b = -1;
                } else {
                    b = 199;
                }
                break;
            case 2661:
                if (!str.equals("SX")) {
                    b = -1;
                } else {
                    b = 200;
                }
                break;
            case 2662:
                if (!str.equals("SY")) {
                    b = -1;
                } else {
                    b = 201;
                }
                break;
            case 2663:
                if (!str.equals("SZ")) {
                    b = -1;
                } else {
                    b = 202;
                }
                break;
            case 2671:
                if (!str.equals("TC")) {
                    b = -1;
                } else {
                    b = 203;
                }
                break;
            case 2672:
                if (!str.equals("TD")) {
                    b = -1;
                } else {
                    b = 204;
                }
                break;
            case 2675:
                if (!str.equals("TG")) {
                    b = -1;
                } else {
                    b = 205;
                }
                break;
            case 2676:
                if (!str.equals("TH")) {
                    b = -1;
                } else {
                    b = 206;
                }
                break;
            case 2678:
                if (!str.equals("TJ")) {
                    b = -1;
                } else {
                    b = 207;
                }
                break;
            case 2679:
                if (!str.equals("TK")) {
                    b = -1;
                } else {
                    b = 208;
                }
                break;
            case 2680:
                if (!str.equals("TL")) {
                    b = -1;
                } else {
                    b = 209;
                }
                break;
            case 2681:
                if (!str.equals("TM")) {
                    b = -1;
                } else {
                    b = 210;
                }
                break;
            case 2682:
                if (!str.equals("TN")) {
                    b = -1;
                } else {
                    b = 211;
                }
                break;
            case 2683:
                if (!str.equals("TO")) {
                    b = -1;
                } else {
                    b = 212;
                }
                break;
            case 2686:
                if (!str.equals("TR")) {
                    b = -1;
                } else {
                    b = 213;
                }
                break;
            case 2688:
                if (!str.equals("TT")) {
                    b = -1;
                } else {
                    b = 214;
                }
                break;
            case 2690:
                if (!str.equals("TV")) {
                    b = -1;
                } else {
                    b = 215;
                }
                break;
            case 2691:
                if (!str.equals("TW")) {
                    b = -1;
                } else {
                    b = 216;
                }
                break;
            case 2694:
                if (!str.equals("TZ")) {
                    b = -1;
                } else {
                    b = 217;
                }
                break;
            case 2700:
                if (!str.equals("UA")) {
                    b = -1;
                } else {
                    b = 218;
                }
                break;
            case 2706:
                if (!str.equals("UG")) {
                    b = -1;
                } else {
                    b = 219;
                }
                break;
            case 2718:
                if (!str.equals("US")) {
                    b = -1;
                } else {
                    b = 220;
                }
                break;
            case 2724:
                if (!str.equals("UY")) {
                    b = -1;
                } else {
                    b = 221;
                }
                break;
            case 2725:
                if (!str.equals("UZ")) {
                    b = -1;
                } else {
                    b = 222;
                }
                break;
            case 2731:
                if (!str.equals("VA")) {
                    b = -1;
                } else {
                    b = 223;
                }
                break;
            case 2733:
                if (!str.equals("VC")) {
                    b = -1;
                } else {
                    b = 224;
                }
                break;
            case 2735:
                if (!str.equals("VE")) {
                    b = -1;
                } else {
                    b = 225;
                }
                break;
            case 2737:
                if (!str.equals("VG")) {
                    b = -1;
                } else {
                    b = 226;
                }
                break;
            case 2739:
                if (!str.equals("VI")) {
                    b = -1;
                } else {
                    b = 227;
                }
                break;
            case 2744:
                if (!str.equals("VN")) {
                    b = -1;
                } else {
                    b = 228;
                }
                break;
            case 2751:
                if (!str.equals("VU")) {
                    b = -1;
                } else {
                    b = 229;
                }
                break;
            case 2767:
                if (!str.equals("WF")) {
                    b = -1;
                } else {
                    b = 230;
                }
                break;
            case 2780:
                if (!str.equals("WS")) {
                    b = -1;
                } else {
                    b = 231;
                }
                break;
            case 2803:
                if (!str.equals("XK")) {
                    b = -1;
                } else {
                    b = 232;
                }
                break;
            case 2828:
                if (!str.equals("YE")) {
                    b = -1;
                } else {
                    b = 233;
                }
                break;
            case 2843:
                if (!str.equals("YT")) {
                    b = -1;
                } else {
                    b = 234;
                }
                break;
            case 2855:
                if (!str.equals("ZA")) {
                    b = -1;
                } else {
                    b = 235;
                }
                break;
            case 2867:
                if (!str.equals("ZM")) {
                    b = -1;
                } else {
                    b = 236;
                }
                break;
            case 2877:
                if (!str.equals("ZW")) {
                    b = -1;
                } else {
                    b = 237;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case C3080vp0.c0 /* 56 */:
            case Yu0.b.G /* 68 */:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 10:
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case 12:
            case 85:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 13:
            case C3080vp0.X /* 50 */:
            case 120:
            case Yu0.b.w0 /* 140 */:
            case 143:
            case 170:
            case 193:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case C3080vp0.e0 /* 58 */:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case 94:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 116:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case 63:
            case 83:
            case 189:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case Yu0.b.P /* 91 */:
            case Yu0.b.p0 /* 133 */:
            case 153:
            case 204:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case Yu0.b.o0 /* 132 */:
            case 175:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 118:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{1, 1, 2, 3, 2, 2};
            case C3080vp0.H /* 34 */:
            case 41:
                return new int[]{2, 2, 2, 1, 2, 2};
            case C3080vp0.I /* 35 */:
                return new int[]{0, 2, 3, 3, 3, 3};
            case C3080vp0.J /* 36 */:
            case Yu0.b.c0 /* 111 */:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 37:
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case C3080vp0.L /* 38 */:
            case Yu0.a.N /* 76 */:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 0, 0, 3};
            case C3080vp0.N /* 40 */:
            case 61:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 42:
                return new int[]{1, 1, 2, 1, 3, 2};
            case 43:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 44:
                return new int[]{2, 0, 4, 3, 3, 1};
            case 45:
                return new int[]{2, 3, 4, 2, 2, 2};
            case 46:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 47:
            case 110:
                return new int[]{4, 2, 4, 3, 2, 2};
            case C3080vp0.V /* 48 */:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 51:
            case 90:
            case 126:
                return new int[]{1, 0, 0, 0, 0, 2};
            case C3080vp0.Z /* 52 */:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 3, 2, 2, 2};
            case 54:
            case 201:
            case 207:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 55:
            case C3080vp0.g0 /* 60 */:
            case 92:
            case 124:
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case C3080vp0.d0 /* 57 */:
                return new int[]{3, 4, 4, 4, 4, 2};
            case C3080vp0.f0 /* 59 */:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
            case 194:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 2, 0, 2};
            case Yu0.a.J /* 66 */:
                return new int[]{3, 1, 2, 3, 2, 2};
            case 67:
                return new int[]{4, 2, 3, 0, 2, 2};
            case 69:
                return new int[]{1, 1, 2, 1, 1, 2};
            case 70:
            case 205:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 71:
                return new int[]{0, 1, 1, 2, 1, 2};
            case Yu0.b.J /* 72 */:
            case 112:
            case Yu0.b.e0 /* 115 */:
            case Yu0.b.g0 /* 119 */:
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case Yu0.b.K /* 73 */:
                return new int[]{1, 0, 0, 2, 2, 2};
            case Yu0.b.L /* 74 */:
            case 168:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 75:
                return new int[]{0, 2, 1, 0, 2, 2};
            case 77:
            case 103:
                return new int[]{1, 2, 0, 1, 2, 2};
            case Yu0.a.O /* 78 */:
            case 208:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 79:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 80:
                return new int[]{4, 4, 4, 2, 2, 2};
            case Yu0.b.N /* 81 */:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 82:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 84:
                return new int[]{2, 2, 2, 1, 1, 2};
            case 86:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 87:
                return new int[]{3, 0, 1, 1, 2, 2};
            case 88:
                return new int[]{0, 1, 1, 3, 2, 0};
            case Yu0.b.O /* 89 */:
                return new int[]{3, 3, 2, 2, 2, 2};
            case Yu0.b.Q /* 93 */:
                return new int[]{3, 1, 1, 2, 3, 2};
            case Yu0.b.R /* 95 */:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 96:
                return new int[]{0, 2, 0, 1, 2, 2};
            case Yu0.b.S /* 97 */:
                return new int[]{1, 1, 2, 1, 2, 1};
            case Yu0.b.T /* 98 */:
            case 215:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
            case 190:
                return new int[]{3, 2, 2, 2, 2, 2};
            case C3080vp0.n0 /* 100 */:
                return new int[]{4, 2, 3, 3, 4, 2};
            case 101:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 102:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 104:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 105:
                return new int[]{2, 0, 1, 1, 2, 2};
            case C3080vp0.t0 /* 106 */:
                return new int[]{0, 3, 3, 3, 4, 4};
            case 107:
                return new int[]{3, 2, 2, 1, 2, 2};
            case C3080vp0.v0 /* 108 */:
            case Yu0.b.x0 /* 141 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 109:
                return new int[]{1, 0, 4, 2, 2, 2};
            case Yu0.b.d0 /* 113 */:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 114:
                return new int[]{1, 0, 1, 0, 0, 2};
            case Yu0.b.f0 /* 117 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case Yu0.b.h0 /* 121 */:
                return new int[]{3, 2, 3, 4, 4, 2};
            case 122:
                return new int[]{3, 4, 3, 4, 2, 2};
            case Yu0.b.i0 /* 123 */:
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case Yu0.b.j0 /* 125 */:
                return new int[]{1, 1, 4, 2, 0, 2};
            case Yu0.b.k0 /* 127 */:
            case 212:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case Yu0.b.l0 /* 129 */:
                return new int[]{0, 2, 2, 0, 2, 2};
            case Yu0.b.m0 /* 130 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case Yu0.b.n0 /* 131 */:
                return new int[]{2, 0, 0, 1, 1, 2};
            case Yu0.b.q0 /* 134 */:
                return new int[]{4, 2, 1, 3, 2, 2};
            case Yu0.b.r0 /* 135 */:
                return new int[]{2, 0, 0, 1, 3, 2};
            case Yu0.b.s0 /* 136 */:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case Yu0.b.t0 /* 137 */:
                return new int[]{2, 2, 2, 3, 4, 2};
            case Yu0.b.u0 /* 138 */:
                return new int[]{2, 0, 1, 2, 2, 2};
            case Yu0.b.v0 /* 139 */:
                return new int[]{0, 2, 4, 4, 4, 2};
            case Yu0.b.y0 /* 142 */:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 145:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 146:
                return new int[]{3, 4, 1, 3, 3, 2};
            case 147:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 152:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 155:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 156:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case 160:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case 199:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case 172:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case 195:
                return new int[]{3, 2, 2, 4, 4, 2};
            case 196:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 198:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case 206:
                return new int[]{0, 1, 2, 1, 2, 2};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case 218:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case 226:
                return new int[]{2, 2, 0, 1, 2, 2};
            case 227:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 228:
                return new int[]{0, 0, 1, 2, 2, 1};
            case 229:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 232:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        AbstractC1278dF abstractC1278dF = this.a;
        Long l = (Long) abstractC1278dF.get(numValueOf);
        if (l == null) {
            l = (Long) abstractC1278dF.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void c(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (M7 m7 : (CopyOnWriteArrayList) this.b.m) {
            if (!m7.c) {
                m7.a.post(new RunnableC1267d7(m7, i, j, j2, 1));
            }
        }
    }
}
