package io.sentry.protocol;

import io.sentry.C0069o0;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0033c0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C3285xv;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0033c0 {
    public final /* synthetic */ int a;

    public /* synthetic */ D(int i) {
        this.a = i;
    }

    public static io.sentry.rrweb.a b(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    if (strC1.equals("payload")) {
                        c0069o0.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strC2 = c0069o0.c0();
                            strC2.getClass();
                            switch (strC2) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z((Map) c0069o0.e0());
                                    if (concurrentHashMapZ == null) {
                                        break;
                                    } else {
                                        aVar.t = concurrentHashMapZ;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.p = c0069o0.h0();
                                    break;
                                case "category":
                                    aVar.q = c0069o0.h0();
                                    break;
                                case "timestamp":
                                    aVar.f140o = c0069o0.q();
                                    break;
                                case "level":
                                    try {
                                        aVar.s = EnumC0094u1.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        iLogger.s(EnumC0094u1.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.r = c0069o0.h0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c0069o0.j0(iLogger, concurrentHashMap2, strC2);
                                    break;
                            }
                        }
                        aVar.v = concurrentHashMap2;
                        c0069o0.i();
                    } else if (strC1.equals("tag")) {
                        String strH0 = c0069o0.h0();
                        if (strH0 == null) {
                            strH0 = "";
                        }
                        aVar.n = strH0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap, strC1);
                    }
                }
                aVar.w = concurrentHashMap;
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                aVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                aVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        aVar.u = map;
        c0069o0.i();
        return aVar;
    }

    public static io.sentry.rrweb.g c(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                HashMap map2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    switch (strC1) {
                        case "x":
                            gVar.q = c0069o0.K();
                            break;
                        case "y":
                            gVar.r = c0069o0.K();
                            break;
                        case "id":
                            gVar.p = c0069o0.R();
                            break;
                        case "type":
                            gVar.f141o = (io.sentry.rrweb.f) c0069o0.f0(iLogger, new D(7));
                            break;
                        case "pointerType":
                            gVar.s = c0069o0.R();
                            break;
                        case "pointerId":
                            gVar.t = c0069o0.R();
                            break;
                        default:
                            if (!strC1.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                c0069o0.j0(iLogger, map2, strC1);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) c0069o0.f0(iLogger, new D(5));
                                io.sentry.config.a.C(dVar, "");
                                gVar.n = dVar;
                                break;
                            }
                            break;
                    }
                }
                gVar.v = map2;
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                gVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                gVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        gVar.u = map;
        c0069o0.i();
        return gVar;
    }

    public static io.sentry.rrweb.i d(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                HashMap map2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    if (strC1.equals("pointerId")) {
                        iVar.f143o = c0069o0.R();
                    } else if (strC1.equals("positions")) {
                        iVar.p = c0069o0.X(iLogger, new D(9));
                    } else if (strC1.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) c0069o0.f0(iLogger, new D(5));
                        io.sentry.config.a.C(dVar, "");
                        iVar.n = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c0069o0.j0(iLogger, map2, strC1);
                    }
                }
                iVar.r = map2;
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                iVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                iVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        iVar.q = map;
        c0069o0.i();
        return iVar;
    }

    public static io.sentry.rrweb.j e(C0069o0 c0069o0, ILogger iLogger) throws IOException {
        c0069o0.f();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    switch (strC1) {
                        case "height":
                            Integer numW = c0069o0.W();
                            jVar.f144o = numW != null ? numW.intValue() : 0;
                            break;
                        case "href":
                            String strH0 = c0069o0.h0();
                            if (strH0 == null) {
                                strH0 = "";
                            }
                            jVar.n = strH0;
                            break;
                        case "width":
                            Integer numW2 = c0069o0.W();
                            jVar.p = numW2 != null ? numW2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap, strC1);
                            break;
                    }
                }
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                jVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                jVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        jVar.q = map;
        c0069o0.i();
        return jVar;
    }

    public static io.sentry.rrweb.k f(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        io.sentry.rrweb.k kVar = new io.sentry.rrweb.k();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    if (strC1.equals("payload")) {
                        c0069o0.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strC2 = c0069o0.c0();
                            strC2.getClass();
                            switch (strC2) {
                                case "description":
                                    kVar.p = c0069o0.h0();
                                    break;
                                case "endTimestamp":
                                    kVar.r = c0069o0.q();
                                    break;
                                case "startTimestamp":
                                    kVar.q = c0069o0.q();
                                    break;
                                case "op":
                                    kVar.f145o = c0069o0.h0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z((Map) c0069o0.e0());
                                    if (concurrentHashMapZ == null) {
                                        break;
                                    } else {
                                        kVar.s = concurrentHashMapZ;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c0069o0.j0(iLogger, concurrentHashMap2, strC2);
                                    break;
                            }
                        }
                        kVar.u = concurrentHashMap2;
                        c0069o0.i();
                    } else if (strC1.equals("tag")) {
                        String strH0 = c0069o0.h0();
                        if (strH0 == null) {
                            strH0 = "";
                        }
                        kVar.n = strH0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap, strC1);
                    }
                }
                kVar.v = concurrentHashMap;
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                kVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                kVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        kVar.t = map;
        c0069o0.i();
        return kVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static io.sentry.rrweb.l g(C0069o0 c0069o0, ILogger iLogger) throws IOException {
        c0069o0.f();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            if (strC0.equals("data")) {
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    if (strC1.equals("payload")) {
                        c0069o0.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strC2 = c0069o0.c0();
                            strC2.getClass();
                            byte b = -1;
                            switch (strC2.hashCode()) {
                                case -1992012396:
                                    if (strC2.equals("duration")) {
                                        b = 0;
                                    }
                                    break;
                                case -1627805778:
                                    if (strC2.equals("segmentId")) {
                                        b = 1;
                                    }
                                    break;
                                case -1221029593:
                                    if (strC2.equals("height")) {
                                        b = 2;
                                    }
                                    break;
                                case -410956671:
                                    if (strC2.equals("container")) {
                                        b = 3;
                                    }
                                    break;
                                case -296512606:
                                    if (strC2.equals("frameCount")) {
                                        b = 4;
                                    }
                                    break;
                                case 115029:
                                    if (strC2.equals("top")) {
                                        b = 5;
                                    }
                                    break;
                                case 3317767:
                                    if (strC2.equals("left")) {
                                        b = 6;
                                    }
                                    break;
                                case 3530753:
                                    if (strC2.equals("size")) {
                                        b = 7;
                                    }
                                    break;
                                case 113126854:
                                    if (strC2.equals("width")) {
                                        b = 8;
                                    }
                                    break;
                                case 545057773:
                                    if (strC2.equals("frameRate")) {
                                        b = 9;
                                    }
                                    break;
                                case 1711222099:
                                    if (strC2.equals("encoding")) {
                                        b = 10;
                                    }
                                    break;
                                case 2135109831:
                                    if (strC2.equals("frameRateType")) {
                                        b = C3285xv.h;
                                    }
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    lVar.q = c0069o0.Y();
                                    break;
                                case 1:
                                    lVar.f146o = c0069o0.R();
                                    break;
                                case 2:
                                    Integer numW = c0069o0.W();
                                    lVar.t = numW != null ? numW.intValue() : 0;
                                    break;
                                case 3:
                                    String strH0 = c0069o0.h0();
                                    if (strH0 == null) {
                                        strH0 = "";
                                    }
                                    lVar.s = strH0;
                                    break;
                                case 4:
                                    Integer numW2 = c0069o0.W();
                                    lVar.v = numW2 != null ? numW2.intValue() : 0;
                                    break;
                                case 5:
                                    Integer numW3 = c0069o0.W();
                                    lVar.z = numW3 != null ? numW3.intValue() : 0;
                                    break;
                                case 6:
                                    Integer numW4 = c0069o0.W();
                                    lVar.y = numW4 != null ? numW4.intValue() : 0;
                                    break;
                                case 7:
                                    Long lZ = c0069o0.Z();
                                    lVar.p = lZ == null ? 0L : lZ.longValue();
                                    break;
                                case 8:
                                    Integer numW5 = c0069o0.W();
                                    lVar.u = numW5 != null ? numW5.intValue() : 0;
                                    break;
                                case 9:
                                    Integer numW6 = c0069o0.W();
                                    lVar.x = numW6 != null ? numW6.intValue() : 0;
                                    break;
                                case 10:
                                    String strH1 = c0069o0.h0();
                                    if (strH1 == null) {
                                        strH1 = "";
                                    }
                                    lVar.r = strH1;
                                    break;
                                case 11:
                                    String strH2 = c0069o0.h0();
                                    if (strH2 == null) {
                                        strH2 = "";
                                    }
                                    lVar.w = strH2;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c0069o0.j0(iLogger, concurrentHashMap2, strC2);
                                    break;
                            }
                        }
                        lVar.B = concurrentHashMap2;
                        c0069o0.i();
                    } else if (strC1.equals("tag")) {
                        String strH3 = c0069o0.h0();
                        if (strH3 == null) {
                            strH3 = "";
                        }
                        lVar.n = strH3;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c0069o0.j0(iLogger, concurrentHashMap, strC1);
                    }
                }
                lVar.C = concurrentHashMap;
                c0069o0.i();
            } else if (strC0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c0069o0.f0(iLogger, new D(4));
                io.sentry.config.a.C(cVar, "");
                lVar.l = cVar;
            } else if (strC0.equals("timestamp")) {
                lVar.m = c0069o0.Y();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c0069o0.j0(iLogger, map, strC0);
            }
        }
        lVar.A = map;
        c0069o0.i();
        return lVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:140:0x024c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    @Override // io.sentry.InterfaceC0033c0
    public final Object a(C0069o0 c0069o0, ILogger iLogger) {
        int i = 2;
        switch (this.a) {
            case 0:
                c0069o0.f();
                E e = new E();
                ConcurrentHashMap concurrentHashMap = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC0 = c0069o0.c0();
                    strC0.getClass();
                    strC0.hashCode();
                    switch (strC0) {
                        case "username":
                            e.n = c0069o0.h0();
                            break;
                        case "id":
                            e.m = c0069o0.h0();
                            break;
                        case "geo":
                            e.r = io.sentry.clientreport.a.f(c0069o0, iLogger);
                            break;
                        case "data":
                            e.s = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "name":
                            e.q = c0069o0.h0();
                            break;
                        case "email":
                            e.l = c0069o0.h0();
                            break;
                        case "other":
                            Map map = e.s;
                            if (map != null && !map.isEmpty()) {
                                break;
                            } else {
                                e.s = io.sentry.config.a.z((Map) c0069o0.e0());
                                break;
                            }
                            break;
                        case "ip_address":
                            e.p = c0069o0.h0();
                            break;
                        case "segment":
                            e.f120o = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c0069o0.j0(iLogger, concurrentHashMap, strC0);
                            break;
                    }
                }
                e.t = concurrentHashMap;
                c0069o0.i();
                return e;
            case 1:
                c0069o0.f();
                String strH0 = null;
                ArrayList arrayListX = null;
                HashMap map2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    if (strC1.equals("rendering_system")) {
                        strH0 = c0069o0.h0();
                    } else if (strC1.equals("windows")) {
                        arrayListX = c0069o0.X(iLogger, new D(i));
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c0069o0.j0(iLogger, map2, strC1);
                    }
                }
                c0069o0.i();
                F f = new F(strH0, arrayListX);
                f.n = map2;
                return f;
            case 2:
                G g = new G();
                c0069o0.f();
                HashMap map3 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC2 = c0069o0.c0();
                    strC2.getClass();
                    strC2.hashCode();
                    switch (strC2) {
                        case "rendering_system":
                            g.l = c0069o0.h0();
                            break;
                        case "identifier":
                            g.n = c0069o0.h0();
                            break;
                        case "height":
                            g.q = c0069o0.t();
                            break;
                        case "x":
                            g.r = c0069o0.t();
                            break;
                        case "y":
                            g.s = c0069o0.t();
                            break;
                        case "tag":
                            g.f121o = c0069o0.h0();
                            break;
                        case "type":
                            g.m = c0069o0.h0();
                            break;
                        case "alpha":
                            g.u = c0069o0.t();
                            break;
                        case "width":
                            g.p = c0069o0.t();
                            break;
                        case "children":
                            g.v = c0069o0.X(iLogger, this);
                            break;
                        case "visibility":
                            g.t = c0069o0.h0();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map3, strC2);
                            break;
                    }
                }
                c0069o0.i();
                g.w = map3;
                return g;
            case 3:
                return b(c0069o0, iLogger);
            case 4:
                return io.sentry.rrweb.c.values()[c0069o0.R()];
            case 5:
                return io.sentry.rrweb.d.values()[c0069o0.R()];
            case 6:
                return c(c0069o0, iLogger);
            case 7:
                return io.sentry.rrweb.f.values()[c0069o0.R()];
            case 8:
                return d(c0069o0, iLogger);
            case 9:
                c0069o0.f();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap map4 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC3 = c0069o0.c0();
                    strC3.getClass();
                    strC3.hashCode();
                    switch (strC3) {
                        case "x":
                            hVar.m = c0069o0.K();
                            break;
                        case "y":
                            hVar.n = c0069o0.K();
                            break;
                        case "id":
                            hVar.l = c0069o0.R();
                            break;
                        case "timeOffset":
                            hVar.f142o = c0069o0.Y();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            c0069o0.j0(iLogger, map4, strC3);
                            break;
                    }
                }
                hVar.p = map4;
                c0069o0.i();
                return hVar;
            case 10:
                return e(c0069o0, iLogger);
            case 11:
                return f(c0069o0, iLogger);
            default:
                return g(c0069o0, iLogger);
        }
    }
}
