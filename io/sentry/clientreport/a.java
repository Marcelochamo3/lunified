package io.sentry.clientreport;

import io.sentry.C0038e;
import io.sentry.C0069o0;
import io.sentry.C0097v1;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0033c0;
import io.sentry.W1;
import io.sentry.Y1;
import io.sentry.protocol.A;
import io.sentry.protocol.B;
import io.sentry.protocol.C;
import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0075b;
import io.sentry.protocol.C0076c;
import io.sentry.protocol.C0077d;
import io.sentry.protocol.C0079f;
import io.sentry.protocol.C0080g;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC0078e;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import o.AbstractC1701hf0;
import o.C3285xv;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0033c0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static C0074a b(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        C0074a c0074a = new C0074a();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "device_app_hash":
                    c0074a.n = c0069o0.h0();
                    break;
                case "start_type":
                    c0074a.u = c0069o0.h0();
                    break;
                case "view_names":
                    List list = (List) c0069o0.e0();
                    if (list == null) {
                        break;
                    } else {
                        c0074a.t = list;
                        break;
                    }
                    break;
                case "app_version":
                    c0074a.q = c0069o0.h0();
                    break;
                case "in_foreground":
                    c0074a.v = c0069o0.l();
                    break;
                case "build_type":
                    c0074a.f122o = c0069o0.h0();
                    break;
                case "app_identifier":
                    c0074a.l = c0069o0.h0();
                    break;
                case "app_start_time":
                    c0074a.m = c0069o0.p(iLogger);
                    break;
                case "permissions":
                    c0074a.s = io.sentry.config.a.z((Map) c0069o0.e0());
                    break;
                case "app_name":
                    c0074a.p = c0069o0.h0();
                    break;
                case "app_build":
                    c0074a.r = c0069o0.h0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        c0074a.w = concurrentHashMap;
        c0069o0.i();
        return c0074a;
    }

    public static C0075b c(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        C0075b c0075b = new C0075b();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("name")) {
                c0075b.l = c0069o0.h0();
            } else if (strC0.equals("version")) {
                c0075b.m = c0069o0.h0();
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                c0069o0.j0(iLogger, concurrentHashMap, strC0);
            }
        }
        c0075b.n = concurrentHashMap;
        c0069o0.i();
        return c0075b;
    }

    public static C0076c d(C0069o0 c0069o0, ILogger iLogger) {
        C0076c c0076c = new C0076c();
        c0069o0.f();
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "device":
                    c0076c.put("device", e(c0069o0, iLogger));
                    break;
                case "response":
                    p pVarB = o.b(c0069o0, iLogger);
                    synchronized (c0076c.l) {
                        c0076c.put("response", pVarB);
                        break;
                    }
                    break;
                case "os":
                    c0076c.put("os", h(c0069o0, iLogger));
                    break;
                case "app":
                    c0076c.b(b(c0069o0, iLogger));
                    break;
                case "gpu":
                    c0076c.put("gpu", g(c0069o0, iLogger));
                    break;
                case "trace":
                    c0076c.c(C0038e.b(c0069o0, iLogger));
                    break;
                case "browser":
                    c0076c.put("browser", c(c0069o0, iLogger));
                    break;
                case "runtime":
                    c0076c.put("runtime", i(c0069o0, iLogger));
                    break;
                default:
                    Object objE0 = c0069o0.e0();
                    if (objE0 == null) {
                        break;
                    } else {
                        c0076c.put(strC0, objE0);
                        break;
                    }
                    break;
            }
        }
        c0069o0.i();
        return c0076c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C0079f e(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        C0079f c0079f = new C0079f();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            byte b = -1;
            switch (strC0.hashCode()) {
                case -2076227591:
                    if (strC0.equals("timezone")) {
                        b = 0;
                    }
                    break;
                case -2012489734:
                    if (strC0.equals("boot_time")) {
                        b = 1;
                    }
                    break;
                case -1981332476:
                    if (strC0.equals("simulator")) {
                        b = 2;
                    }
                    break;
                case -1969347631:
                    if (strC0.equals("manufacturer")) {
                        b = 3;
                    }
                    break;
                case -1613589672:
                    if (strC0.equals("language")) {
                        b = 4;
                    }
                    break;
                case -1608004830:
                    if (strC0.equals("processor_count")) {
                        b = 5;
                    }
                    break;
                case -1439500848:
                    if (strC0.equals("orientation")) {
                        b = 6;
                    }
                    break;
                case -1410521534:
                    if (strC0.equals("battery_temperature")) {
                        b = 7;
                    }
                    break;
                case -1281860764:
                    if (strC0.equals("family")) {
                        b = 8;
                    }
                    break;
                case -1097462182:
                    if (strC0.equals("locale")) {
                        b = 9;
                    }
                    break;
                case -1012222381:
                    if (strC0.equals("online")) {
                        b = 10;
                    }
                    break;
                case -877252910:
                    if (strC0.equals("battery_level")) {
                        b = C3285xv.h;
                    }
                    break;
                case -619038223:
                    if (strC0.equals("model_id")) {
                        b = 12;
                    }
                    break;
                case -568274923:
                    if (strC0.equals("screen_density")) {
                        b = 13;
                    }
                    break;
                case -417046774:
                    if (strC0.equals("screen_dpi")) {
                        b = 14;
                    }
                    break;
                case -136523212:
                    if (strC0.equals("free_memory")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (strC0.equals("id")) {
                        b = 16;
                    }
                    break;
                case 3373707:
                    if (strC0.equals("name")) {
                        b = 17;
                    }
                    break;
                case 59142220:
                    if (strC0.equals("low_memory")) {
                        b = 18;
                    }
                    break;
                case 93076189:
                    if (strC0.equals("archs")) {
                        b = 19;
                    }
                    break;
                case 93997959:
                    if (strC0.equals("brand")) {
                        b = 20;
                    }
                    break;
                case 104069929:
                    if (strC0.equals("model")) {
                        b = 21;
                    }
                    break;
                case 115746789:
                    if (strC0.equals("cpu_description")) {
                        b = 22;
                    }
                    break;
                case 244497903:
                    if (strC0.equals("processor_frequency")) {
                        b = 23;
                    }
                    break;
                case 731866107:
                    if (strC0.equals("connection_type")) {
                        b = 24;
                    }
                    break;
                case 817830969:
                    if (strC0.equals("screen_width_pixels")) {
                        b = 25;
                    }
                    break;
                case 823882553:
                    if (strC0.equals("external_storage_size")) {
                        b = 26;
                    }
                    break;
                case 897428293:
                    if (strC0.equals("storage_size")) {
                        b = 27;
                    }
                    break;
                case 1331465768:
                    if (strC0.equals("usable_memory")) {
                        b = 28;
                    }
                    break;
                case 1418777727:
                    if (strC0.equals("memory_size")) {
                        b = 29;
                    }
                    break;
                case 1436115569:
                    if (strC0.equals("charging")) {
                        b = 30;
                    }
                    break;
                case 1450613660:
                    if (strC0.equals("external_free_storage")) {
                        b = 31;
                    }
                    break;
                case 1524159400:
                    if (strC0.equals("free_storage")) {
                        b = 32;
                    }
                    break;
                case 1556284978:
                    if (strC0.equals("screen_height_pixels")) {
                        b = 33;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    c0079f.K = c0069o0.i0(iLogger);
                    break;
                case 1:
                    if (c0069o0.l0() == io.sentry.vendor.gson.stream.b.STRING) {
                        c0079f.J = c0069o0.p(iLogger);
                    }
                    break;
                case 2:
                    c0079f.w = c0069o0.l();
                    break;
                case 3:
                    c0079f.m = c0069o0.h0();
                    break;
                case 4:
                    c0079f.M = c0069o0.h0();
                    break;
                case 5:
                    c0079f.Q = c0069o0.W();
                    break;
                case 6:
                    c0079f.v = (EnumC0078e) c0069o0.f0(iLogger, new a(10));
                    break;
                case 7:
                    c0079f.P = c0069o0.Q();
                    break;
                case 8:
                    c0079f.f123o = c0069o0.h0();
                    break;
                case 9:
                    c0079f.N = c0069o0.h0();
                    break;
                case 10:
                    c0079f.u = c0069o0.l();
                    break;
                case 11:
                    c0079f.s = c0069o0.Q();
                    break;
                case 12:
                    c0079f.q = c0069o0.h0();
                    break;
                case 13:
                    c0079f.H = c0069o0.Q();
                    break;
                case 14:
                    c0079f.I = c0069o0.W();
                    break;
                case 15:
                    c0079f.y = c0069o0.Z();
                    break;
                case 16:
                    c0079f.L = c0069o0.h0();
                    break;
                case 17:
                    c0079f.l = c0069o0.h0();
                    break;
                case 18:
                    c0079f.A = c0069o0.l();
                    break;
                case 19:
                    List list = (List) c0069o0.e0();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c0079f.r = strArr;
                    }
                    break;
                case 20:
                    c0079f.n = c0069o0.h0();
                    break;
                case 21:
                    c0079f.p = c0069o0.h0();
                    break;
                case 22:
                    c0079f.S = c0069o0.h0();
                    break;
                case 23:
                    c0079f.R = c0069o0.t();
                    break;
                case 24:
                    c0079f.O = c0069o0.h0();
                    break;
                case 25:
                    c0079f.F = c0069o0.W();
                    break;
                case 26:
                    c0079f.D = c0069o0.Z();
                    break;
                case 27:
                    c0079f.B = c0069o0.Z();
                    break;
                case 28:
                    c0079f.z = c0069o0.Z();
                    break;
                case 29:
                    c0079f.x = c0069o0.Z();
                    break;
                case 30:
                    c0079f.t = c0069o0.l();
                    break;
                case 31:
                    c0079f.E = c0069o0.Z();
                    break;
                case 32:
                    c0079f.C = c0069o0.Z();
                    break;
                case 33:
                    c0079f.G = c0069o0.W();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        c0079f.T = concurrentHashMap;
        c0069o0.i();
        return c0079f;
    }

    public static C0080g f(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        C0080g c0080g = new C0080g();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "region":
                    c0080g.n = c0069o0.h0();
                    break;
                case "city":
                    c0080g.l = c0069o0.h0();
                    break;
                case "country_code":
                    c0080g.m = c0069o0.h0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        c0080g.f124o = concurrentHashMap;
        c0069o0.i();
        return c0080g;
    }

    public static h g(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "npot_support":
                    hVar.t = c0069o0.h0();
                    break;
                case "vendor_id":
                    hVar.n = c0069o0.h0();
                    break;
                case "multi_threaded_rendering":
                    hVar.r = c0069o0.l();
                    break;
                case "id":
                    hVar.m = c0069o0.W();
                    break;
                case "name":
                    hVar.l = c0069o0.h0();
                    break;
                case "vendor_name":
                    hVar.f125o = c0069o0.h0();
                    break;
                case "version":
                    hVar.s = c0069o0.h0();
                    break;
                case "api_type":
                    hVar.q = c0069o0.h0();
                    break;
                case "memory_size":
                    hVar.p = c0069o0.W();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        hVar.u = concurrentHashMap;
        c0069o0.i();
        return hVar;
    }

    public static m h(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "rooted":
                    mVar.q = c0069o0.l();
                    break;
                case "raw_description":
                    mVar.n = c0069o0.h0();
                    break;
                case "name":
                    mVar.l = c0069o0.h0();
                    break;
                case "build":
                    mVar.f129o = c0069o0.h0();
                    break;
                case "version":
                    mVar.m = c0069o0.h0();
                    break;
                case "kernel_version":
                    mVar.p = c0069o0.h0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        mVar.r = concurrentHashMap;
        c0069o0.i();
        return mVar;
    }

    public static v i(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        v vVar = new v();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "raw_description":
                    vVar.n = c0069o0.h0();
                    break;
                case "name":
                    vVar.l = c0069o0.h0();
                    break;
                case "version":
                    vVar.m = c0069o0.h0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        vVar.f135o = concurrentHashMap;
        c0069o0.i();
        return vVar;
    }

    public static IllegalStateException j(String str, ILogger iLogger) {
        String strU = AbstractC1701hf0.u("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strU);
        iLogger.v(EnumC0094u1.ERROR, strU, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException k(String str, ILogger iLogger) {
        String strU = AbstractC1701hf0.u("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strU);
        iLogger.v(EnumC0094u1.ERROR, strU, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException l(String str, ILogger iLogger) {
        String strU = AbstractC1701hf0.u("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strU);
        iLogger.v(EnumC0094u1.ERROR, strU, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:153:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0337  */
    /* JADX WARN: Code duplicated, block: B:277:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:410:0x0720  */
    /* JADX WARN: Code duplicated, block: B:452:0x07de  */
    /* JADX WARN: Code duplicated, block: B:495:0x0898  */
    /* JADX WARN: Code duplicated, block: B:527:0x0918  */
    /* JADX WARN: Code duplicated, block: B:602:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:639:0x0add  */
    /* JADX WARN: Code duplicated, block: B:668:0x0b4f  */
    /* JADX WARN: Code duplicated, block: B:756:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:856:0x0e91  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0060  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.InterfaceC0033c0
    public final Object a(C0069o0 c0069o0, ILogger iLogger) {
        byte b;
        byte b2;
        int i = 13;
        int i2 = 16;
        int i3 = 10;
        ConcurrentHashMap concurrentHashMap = null;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                c0069o0.f();
                Date dateP = null;
                HashMap map = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC0 = c0069o0.c0();
                    strC0.getClass();
                    if (strC0.equals("discarded_events")) {
                        arrayList.addAll(c0069o0.X(iLogger, new a(1)));
                    } else if (strC0.equals("timestamp")) {
                        dateP = c0069o0.p(iLogger);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c0069o0.j0(iLogger, map, strC0);
                    }
                }
                c0069o0.i();
                if (dateP == null) {
                    throw j("timestamp", iLogger);
                }
                if (arrayList.isEmpty()) {
                    throw j("discarded_events", iLogger);
                }
                b bVar = new b(dateP, arrayList);
                bVar.n = map;
                return bVar;
            case 1:
                c0069o0.f();
                String strH0 = null;
                String strH1 = null;
                Long lZ = null;
                HashMap map2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    strC1.hashCode();
                    switch (strC1) {
                        case "quantity":
                            lZ = c0069o0.Z();
                            break;
                        case "reason":
                            strH0 = c0069o0.h0();
                            break;
                        case "category":
                            strH1 = c0069o0.h0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map2, strC1);
                            break;
                    }
                }
                c0069o0.i();
                if (strH0 == null) {
                    throw k("reason", iLogger);
                }
                if (strH1 == null) {
                    throw k("category", iLogger);
                }
                if (lZ == null) {
                    throw k("quantity", iLogger);
                }
                e eVar = new e(strH0, strH1, lZ);
                eVar.f107o = map2;
                return eVar;
            case 2:
                c0069o0.f();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC2 = c0069o0.c0();
                    strC2.getClass();
                    if (strC2.equals("values")) {
                        ArrayList arrayListX = c0069o0.X(iLogger, new a(3));
                        if (arrayListX != null) {
                            aVar.n = arrayListX;
                        }
                    } else if (strC2.equals("unit")) {
                        String strH2 = c0069o0.h0();
                        if (strH2 != null) {
                            aVar.m = strH2;
                        }
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap2, strC2);
                    }
                }
                aVar.l = concurrentHashMap2;
                c0069o0.i();
                return aVar;
            case 3:
                c0069o0.f();
                io.sentry.profilemeasurements.b bVar2 = new io.sentry.profilemeasurements.b(0L, 0);
                ConcurrentHashMap concurrentHashMap3 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC3 = c0069o0.c0();
                    strC3.getClass();
                    if (strC3.equals("elapsed_since_start_ns")) {
                        String strH3 = c0069o0.h0();
                        if (strH3 != null) {
                            bVar2.m = strH3;
                        }
                    } else if (strC3.equals("value")) {
                        Double dT = c0069o0.t();
                        if (dT != null) {
                            bVar2.n = dT.doubleValue();
                        }
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap3, strC3);
                    }
                }
                bVar2.l = concurrentHashMap3;
                c0069o0.i();
                return bVar2;
            case 4:
                return b(c0069o0, iLogger);
            case 5:
                return c(c0069o0, iLogger);
            case 6:
                return d(c0069o0, iLogger);
            case 7:
                DebugImage debugImage = new DebugImage();
                c0069o0.f();
                HashMap map3 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC4 = c0069o0.c0();
                    strC4.getClass();
                    strC4.hashCode();
                    switch (strC4) {
                        case "debug_file":
                            debugImage.debugFile = c0069o0.h0();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = c0069o0.h0();
                            break;
                        case "image_size":
                            debugImage.imageSize = c0069o0.Z();
                            break;
                        case "code_file":
                            debugImage.codeFile = c0069o0.h0();
                            break;
                        case "arch":
                            debugImage.arch = c0069o0.h0();
                            break;
                        case "type":
                            debugImage.type = c0069o0.h0();
                            break;
                        case "uuid":
                            debugImage.uuid = c0069o0.h0();
                            break;
                        case "debug_id":
                            debugImage.debugId = c0069o0.h0();
                            break;
                        case "code_id":
                            debugImage.codeId = c0069o0.h0();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map3, strC4);
                            break;
                    }
                }
                c0069o0.i();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                C0077d c0077d = new C0077d();
                c0069o0.f();
                HashMap map4 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC5 = c0069o0.c0();
                    strC5.getClass();
                    if (strC5.equals("images")) {
                        c0077d.m = c0069o0.X(iLogger, new a(7));
                    } else if (strC5.equals("sdk_info")) {
                        c0077d.l = (q) c0069o0.f0(iLogger, new a(19));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        c0069o0.j0(iLogger, map4, strC5);
                    }
                }
                c0069o0.i();
                c0077d.n = map4;
                return c0077d;
            case 9:
                return e(c0069o0, iLogger);
            case 10:
                return EnumC0078e.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
            case 11:
                return f(c0069o0, iLogger);
            case 12:
                return g(c0069o0, iLogger);
            case 13:
                c0069o0.f();
                Number number = null;
                String strH4 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC6 = c0069o0.c0();
                    strC6.getClass();
                    if (strC6.equals("unit")) {
                        strH4 = c0069o0.h0();
                    } else if (strC6.equals("value")) {
                        number = (Number) c0069o0.e0();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap4, strC6);
                    }
                }
                c0069o0.i();
                if (number != null) {
                    i iVar = new i(number, strH4);
                    iVar.n = concurrentHashMap4;
                    return iVar;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
                iLogger.v(EnumC0094u1.ERROR, "Missing required field \"value\"", illegalStateException);
                throw illegalStateException;
            case 14:
                j jVar = new j();
                c0069o0.f();
                HashMap map5 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC7 = c0069o0.c0();
                    strC7.getClass();
                    strC7.hashCode();
                    switch (strC7) {
                        case "description":
                            jVar.m = c0069o0.h0();
                            break;
                        case "data":
                            jVar.q = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "meta":
                            jVar.p = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "type":
                            jVar.l = c0069o0.h0();
                            break;
                        case "handled":
                            jVar.f126o = c0069o0.l();
                            break;
                        case "synthetic":
                            jVar.r = c0069o0.l();
                            break;
                        case "help_link":
                            jVar.n = c0069o0.h0();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map5, strC7);
                            break;
                    }
                }
                c0069o0.i();
                jVar.s = map5;
                return jVar;
            case 15:
                c0069o0.f();
                k kVar = new k();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC8 = c0069o0.c0();
                    strC8.getClass();
                    strC8.hashCode();
                    switch (strC8) {
                        case "params":
                            List list = (List) c0069o0.e0();
                            if (list != null) {
                                kVar.n = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            kVar.m = c0069o0.h0();
                            break;
                        case "formatted":
                            kVar.l = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap5, strC8);
                            break;
                    }
                }
                kVar.f127o = concurrentHashMap5;
                c0069o0.i();
                return kVar;
            case 16:
                l lVar = new l();
                c0069o0.f();
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC9 = c0069o0.c0();
                    strC9.getClass();
                    strC9.hashCode();
                    switch (strC9) {
                        case "max":
                            lVar.m = c0069o0.q();
                            break;
                        case "min":
                            lVar.l = c0069o0.q();
                            break;
                        case "sum":
                            lVar.n = c0069o0.q();
                            break;
                        case "tags":
                            lVar.p = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "count":
                            lVar.f128o = c0069o0.R();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            ConcurrentHashMap concurrentHashMap6 = concurrentHashMap;
                            c0069o0.j0(iLogger, concurrentHashMap6, strC9);
                            concurrentHashMap = concurrentHashMap6;
                            break;
                    }
                }
                c0069o0.i();
                return lVar;
            case 17:
                return h(c0069o0, iLogger);
            case 18:
                c0069o0.f();
                n nVar = new n();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC10 = c0069o0.c0();
                    strC10.getClass();
                    strC10.hashCode();
                    switch (strC10) {
                        case "fragment":
                            nVar.u = c0069o0.h0();
                            break;
                        case "method":
                            nVar.m = c0069o0.h0();
                            break;
                        case "env":
                            Map map6 = (Map) c0069o0.e0();
                            if (map6 != null) {
                                nVar.r = io.sentry.config.a.z(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            nVar.l = c0069o0.h0();
                            break;
                        case "data":
                            nVar.f130o = c0069o0.e0();
                            break;
                        case "other":
                            Map map7 = (Map) c0069o0.e0();
                            if (map7 != null) {
                                nVar.t = io.sentry.config.a.z(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) c0069o0.e0();
                            if (map8 != null) {
                                nVar.q = io.sentry.config.a.z(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            nVar.p = c0069o0.h0();
                            break;
                        case "body_size":
                            nVar.s = c0069o0.Z();
                            break;
                        case "query_string":
                            nVar.n = c0069o0.h0();
                            break;
                        case "api_target":
                            nVar.v = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap7, strC10);
                            break;
                    }
                }
                nVar.w = concurrentHashMap7;
                c0069o0.i();
                return nVar;
            case 19:
                q qVar = new q();
                c0069o0.f();
                HashMap map9 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC11 = c0069o0.c0();
                    strC11.getClass();
                    strC11.hashCode();
                    switch (strC11) {
                        case "sdk_name":
                            qVar.l = c0069o0.h0();
                            break;
                        case "version_patchlevel":
                            qVar.f132o = c0069o0.W();
                            break;
                        case "version_major":
                            qVar.m = c0069o0.W();
                            break;
                        case "version_minor":
                            qVar.n = c0069o0.W();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map9, strC11);
                            break;
                    }
                }
                c0069o0.i();
                qVar.p = map9;
                return qVar;
            case 20:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                c0069o0.f();
                String strG0 = null;
                String strG1 = null;
                HashMap map10 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC12 = c0069o0.c0();
                    strC12.getClass();
                    strC12.hashCode();
                    switch (strC12) {
                        case "name":
                            strG0 = c0069o0.g0();
                            break;
                        case "version":
                            strG1 = c0069o0.g0();
                            break;
                        case "packages":
                            ArrayList arrayListX2 = c0069o0.X(iLogger, new a(23));
                            if (arrayListX2 != null) {
                                arrayList2.addAll(arrayListX2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) c0069o0.e0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map10, strC12);
                            break;
                    }
                }
                c0069o0.i();
                if (strG0 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.v(EnumC0094u1.ERROR, "Missing required field \"name\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (strG1 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"version\"");
                    iLogger.v(EnumC0094u1.ERROR, "Missing required field \"version\"", illegalStateException3);
                    throw illegalStateException3;
                }
                r rVar = new r(strG0, strG1);
                rVar.n = new CopyOnWriteArraySet(arrayList2);
                rVar.f133o = new CopyOnWriteArraySet(arrayList3);
                rVar.p = map10;
                return rVar;
            case 21:
                s sVar = new s();
                c0069o0.f();
                HashMap map11 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC13 = c0069o0.c0();
                    strC13.getClass();
                    strC13.hashCode();
                    switch (strC13) {
                        case "thread_id":
                            sVar.f134o = c0069o0.Z();
                            break;
                        case "module":
                            sVar.n = c0069o0.h0();
                            break;
                        case "type":
                            sVar.l = c0069o0.h0();
                            break;
                        case "value":
                            sVar.m = c0069o0.h0();
                            break;
                        case "mechanism":
                            sVar.q = (j) c0069o0.f0(iLogger, new a(14));
                            break;
                        case "stacktrace":
                            sVar.p = (y) c0069o0.f0(iLogger, new a(27));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map11, strC13);
                            break;
                    }
                }
                c0069o0.i();
                sVar.r = map11;
                return sVar;
            case 22:
                return new t(c0069o0.g0());
            case 23:
                c0069o0.f();
                String strG2 = null;
                String strG3 = null;
                HashMap map12 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC14 = c0069o0.c0();
                    strC14.getClass();
                    if (strC14.equals("name")) {
                        strG2 = c0069o0.g0();
                    } else if (strC14.equals("version")) {
                        strG3 = c0069o0.g0();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        c0069o0.j0(iLogger, map12, strC14);
                    }
                }
                c0069o0.i();
                if (strG2 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.v(EnumC0094u1.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strG3 != null) {
                    u uVar = new u(strG2, strG3);
                    uVar.n = map12;
                    return uVar;
                }
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                iLogger.v(EnumC0094u1.ERROR, "Missing required field \"version\"", illegalStateException5);
                throw illegalStateException5;
            case 24:
                return i(c0069o0, iLogger);
            case 25:
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap8 = null;
                Map map13 = null;
                HashMap mapB0 = null;
                Double dValueOf = null;
                Double dValueOf2 = null;
                t tVar = null;
                W1 w1 = null;
                W1 w2 = null;
                String strH5 = null;
                String strH6 = null;
                Y1 y1 = null;
                String strH7 = null;
                HashMap mapA0 = null;
                Map map14 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC15 = c0069o0.c0();
                    strC15.getClass();
                    switch (strC15.hashCode()) {
                        case -2011840976:
                            if (!strC15.equals("span_id")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -1757797477:
                            if (!strC15.equals("parent_span_id")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case -1724546052:
                            if (!strC15.equals("description")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1526966919:
                            if (!strC15.equals("start_timestamp")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -1008619738:
                            if (!strC15.equals("origin")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case -892481550:
                            if (!strC15.equals("status")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case -682561045:
                            if (!strC15.equals("_metrics_summary")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -362243017:
                            if (!strC15.equals("measurements")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 3553:
                            if (!strC15.equals("op")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 3076010:
                            if (!strC15.equals("data")) {
                                b = -1;
                            } else {
                                b = 9;
                            }
                            break;
                        case 3552281:
                            if (!strC15.equals("tags")) {
                                b = -1;
                            } else {
                                b = 10;
                            }
                            break;
                        case 55126294:
                            if (!strC15.equals("timestamp")) {
                                b = -1;
                            } else {
                                b = C3285xv.h;
                            }
                            break;
                        case 1270300245:
                            if (!strC15.equals("trace_id")) {
                                b = -1;
                            } else {
                                b = 12;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            w1 = new W1(c0069o0.g0());
                            break;
                        case 1:
                            w2 = (W1) c0069o0.f0(iLogger, new C0038e(15));
                            break;
                        case 2:
                            strH6 = c0069o0.h0();
                            break;
                        case 3:
                            try {
                                dValueOf = c0069o0.t();
                            } catch (NumberFormatException unused) {
                                Date dateP2 = c0069o0.p(iLogger);
                                dValueOf = dateP2 == null ? null : Double.valueOf(dateP2.getTime() / 1000.0d);
                            }
                            break;
                        case 4:
                            strH7 = c0069o0.h0();
                            break;
                        case 5:
                            y1 = (Y1) c0069o0.f0(iLogger, new C0038e(16));
                            break;
                        case 6:
                            mapA0 = c0069o0.a0(iLogger, new a(16));
                            break;
                        case 7:
                            mapB0 = c0069o0.b0(iLogger, new a(13));
                            break;
                        case 8:
                            strH5 = c0069o0.h0();
                            break;
                        case 9:
                            map14 = (Map) c0069o0.e0();
                            break;
                        case 10:
                            map13 = (Map) c0069o0.e0();
                            break;
                        case 11:
                            try {
                                dValueOf2 = c0069o0.t();
                            } catch (NumberFormatException unused2) {
                                Date dateP3 = c0069o0.p(iLogger);
                                dValueOf2 = dateP3 == null ? null : Double.valueOf(dateP3.getTime() / 1000.0d);
                            }
                            break;
                        case 12:
                            tVar = new t(c0069o0.g0());
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap8, strC15);
                            break;
                    }
                }
                if (dValueOf == null) {
                    throw l("start_timestamp", iLogger);
                }
                if (tVar == null) {
                    throw l("trace_id", iLogger);
                }
                if (w1 == null) {
                    throw l("span_id", iLogger);
                }
                if (strH5 == null) {
                    throw l("op", iLogger);
                }
                w wVar = new w(dValueOf, dValueOf2, tVar, w1, w2, strH5, strH6, y1, strH7, map13 == null ? new HashMap() : map13, mapB0 == null ? new HashMap() : mapB0, mapA0, map14);
                wVar.y = concurrentHashMap8;
                c0069o0.i();
                return wVar;
            case 26:
                x xVar = new x();
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC16 = c0069o0.c0();
                    strC16.getClass();
                    strC16.hashCode();
                    switch (strC16.hashCode()) {
                        case -1443345323:
                            if (!strC16.equals("image_addr")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case -1184392185:
                            if (!strC16.equals("in_app")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -1113875953:
                            if (!strC16.equals("raw_function")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -1102671691:
                            if (!strC16.equals("lineno")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case -1068784020:
                            if (!strC16.equals("module")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case -1052618729:
                            if (!strC16.equals("native")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case -887523944:
                            if (!strC16.equals("symbol")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case -807062458:
                            if (!strC16.equals("package")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case -734768633:
                            if (!strC16.equals("filename")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case -330260936:
                            if (!strC16.equals("symbol_addr")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case 3327275:
                            if (!strC16.equals("lock")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 94842689:
                            if (!strC16.equals("colno")) {
                                b2 = -1;
                            } else {
                                b2 = C3285xv.h;
                            }
                            break;
                        case 410194178:
                            if (!strC16.equals("instruction_addr")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 1116694660:
                            if (!strC16.equals("context_line")) {
                                b2 = -1;
                            } else {
                                b2 = 13;
                            }
                            break;
                        case 1380938712:
                            if (!strC16.equals("function")) {
                                b2 = -1;
                            } else {
                                b2 = 14;
                            }
                            break;
                        case 1713445842:
                            if (!strC16.equals("abs_path")) {
                                b2 = -1;
                            } else {
                                b2 = 15;
                            }
                            break;
                        case 1874684019:
                            if (!strC16.equals("platform")) {
                                b2 = -1;
                            } else {
                                b2 = 16;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            xVar.w = c0069o0.h0();
                            break;
                        case 1:
                            xVar.s = c0069o0.l();
                            break;
                        case 2:
                            xVar.B = c0069o0.h0();
                            break;
                        case 3:
                            xVar.f137o = c0069o0.W();
                            break;
                        case 4:
                            xVar.n = c0069o0.h0();
                            break;
                        case 5:
                            xVar.u = c0069o0.l();
                            break;
                        case 6:
                            xVar.z = c0069o0.h0();
                            break;
                        case 7:
                            xVar.t = c0069o0.h0();
                            break;
                        case 8:
                            xVar.l = c0069o0.h0();
                            break;
                        case 9:
                            xVar.x = c0069o0.h0();
                            break;
                        case 10:
                            xVar.C = (C0097v1) c0069o0.f0(iLogger, new C0038e(i3));
                            break;
                        case 11:
                            xVar.p = c0069o0.W();
                            break;
                        case 12:
                            xVar.y = c0069o0.h0();
                            break;
                        case 13:
                            xVar.r = c0069o0.h0();
                            break;
                        case 14:
                            xVar.m = c0069o0.h0();
                            break;
                        case 15:
                            xVar.q = c0069o0.h0();
                            break;
                        case 16:
                            xVar.v = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap9, strC16);
                            break;
                    }
                }
                xVar.A = concurrentHashMap9;
                c0069o0.i();
                return xVar;
            case 27:
                y yVar = new y();
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap10 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC17 = c0069o0.c0();
                    strC17.getClass();
                    strC17.hashCode();
                    switch (strC17) {
                        case "frames":
                            yVar.l = c0069o0.X(iLogger, new a(26));
                            break;
                        case "registers":
                            yVar.m = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "snapshot":
                            yVar.n = c0069o0.l();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap10, strC17);
                            break;
                    }
                }
                yVar.f138o = concurrentHashMap10;
                c0069o0.i();
                return yVar;
            case 28:
                z zVar = new z();
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC18 = c0069o0.c0();
                    strC18.getClass();
                    strC18.hashCode();
                    switch (strC18) {
                        case "daemon":
                            zVar.r = c0069o0.l();
                            break;
                        case "priority":
                            zVar.m = c0069o0.W();
                            break;
                        case "held_locks":
                            HashMap mapB1 = c0069o0.b0(iLogger, new C0038e(i3));
                            if (mapB1 != null) {
                                zVar.u = new HashMap(mapB1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            zVar.l = c0069o0.Z();
                            break;
                        case "main":
                            zVar.s = c0069o0.l();
                            break;
                        case "name":
                            zVar.n = c0069o0.h0();
                            break;
                        case "state":
                            zVar.f139o = c0069o0.h0();
                            break;
                        case "crashed":
                            zVar.p = c0069o0.l();
                            break;
                        case "current":
                            zVar.q = c0069o0.l();
                            break;
                        case "stacktrace":
                            zVar.t = (y) c0069o0.f0(iLogger, new a(27));
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap11, strC18);
                            break;
                    }
                }
                zVar.v = concurrentHashMap11;
                c0069o0.i();
                return zVar;
            default:
                c0069o0.f();
                A a = new A(new ArrayList(), new HashMap(), new B(C.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap12 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC19 = c0069o0.c0();
                    strC19.getClass();
                    switch (strC19) {
                        case "start_timestamp":
                            try {
                                Double dT2 = c0069o0.t();
                                if (dT2 != null) {
                                    a.B = dT2;
                                }
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateP4 = c0069o0.p(iLogger);
                                if (dateP4 != null) {
                                    a.B = Double.valueOf(dateP4.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "_metrics_summary":
                            a.F = c0069o0.a0(iLogger, new a(i2));
                            break;
                        case "measurements":
                            HashMap mapB2 = c0069o0.b0(iLogger, new a(i));
                            if (mapB2 != null) {
                                a.E.putAll(mapB2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            c0069o0.g0();
                            break;
                        case "timestamp":
                            try {
                                Double dT3 = c0069o0.t();
                                if (dT3 != null) {
                                    a.C = dT3;
                                }
                                break;
                            } catch (NumberFormatException unused4) {
                                Date dateP5 = c0069o0.p(iLogger);
                                if (dateP5 != null) {
                                    a.C = Double.valueOf(dateP5.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListX3 = c0069o0.X(iLogger, new a(25));
                            if (arrayListX3 != null) {
                                a.D.addAll(arrayListX3);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            c0069o0.f();
                            String strH8 = null;
                            ConcurrentHashMap concurrentHashMap13 = null;
                            while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strC20 = c0069o0.c0();
                                strC20.getClass();
                                if (strC20.equals("source")) {
                                    strH8 = c0069o0.h0();
                                } else {
                                    if (concurrentHashMap13 == null) {
                                        concurrentHashMap13 = new ConcurrentHashMap();
                                    }
                                    c0069o0.j0(iLogger, concurrentHashMap13, strC20);
                                }
                            }
                            B b3 = new B(strH8);
                            b3.m = concurrentHashMap13;
                            c0069o0.i();
                            a.G = b3;
                            break;
                        case "transaction":
                            a.A = c0069o0.h0();
                            break;
                        default:
                            if (io.sentry.config.a.d(a, strC19, c0069o0, iLogger)) {
                                break;
                            } else {
                                if (concurrentHashMap12 == null) {
                                    concurrentHashMap12 = new ConcurrentHashMap();
                                }
                                c0069o0.j0(iLogger, concurrentHashMap12, strC19);
                                break;
                            }
                            break;
                    }
                }
                a.H = concurrentHashMap12;
                c0069o0.i();
                return a;
        }
    }
}
