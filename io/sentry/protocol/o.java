package io.sentry.protocol;

import io.sentry.C0069o0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0033c0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements InterfaceC0033c0 {
    public static p b(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        p pVar = new p();
        ConcurrentHashMap concurrentHashMap = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "status_code":
                    pVar.n = c0069o0.W();
                    break;
                case "data":
                    pVar.p = c0069o0.e0();
                    break;
                case "headers":
                    Map map = (Map) c0069o0.e0();
                    if (map == null) {
                        break;
                    } else {
                        pVar.m = io.sentry.config.a.z(map);
                        break;
                    }
                    break;
                case "cookies":
                    pVar.l = c0069o0.h0();
                    break;
                case "body_size":
                    pVar.f131o = c0069o0.Z();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        pVar.q = concurrentHashMap;
        c0069o0.i();
        return pVar;
    }
}
