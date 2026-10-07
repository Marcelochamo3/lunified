package io.sentry.android.replay;

import io.sentry.C0041f;
import io.sentry.EnumC0094u1;
import io.sentry.M0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.AP;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;
import o.CJ;
import o.I60;
import o.IJ;
import o.Lc0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements M0 {
    public static final CJ m = AP.m(IJ.n, a.n);
    public static final Set n = Lc0.T("status_code", "method", "response_content_length", "request_content_length", "http.response_content_length", "http.request_content_length");
    public String l;

    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    @Override // io.sentry.M0
    public final io.sentry.rrweb.b q(C0041f c0041f) {
        String str;
        EnumC0094u1 enumC0094u1;
        Object obj;
        String strY0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        io.sentry.rrweb.k kVar = null;
        if (AbstractC1474fG.b(c0041f.p, "http")) {
            Object obj2 = c0041f.f111o.get("url");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null && str2.length() != 0) {
                Map map = c0041f.f111o;
                AbstractC1474fG.i(map, "data");
                if (map.containsKey("http.start_timestamp")) {
                    Map map2 = c0041f.f111o;
                    AbstractC1474fG.i(map2, "data");
                    if (map2.containsKey("http.end_timestamp")) {
                        kVar = new io.sentry.rrweb.k();
                        kVar.m = c0041f.a().getTime();
                        kVar.f145o = "resource.http";
                        Object obj3 = c0041f.f111o.get("url");
                        AbstractC1474fG.h(obj3, "null cannot be cast to non-null type kotlin.String");
                        kVar.p = (String) obj3;
                        Object obj4 = c0041f.f111o.get("http.start_timestamp");
                        AbstractC1474fG.h(obj4, "null cannot be cast to non-null type kotlin.Long");
                        kVar.q = ((Long) obj4).longValue() / 1000.0d;
                        Object obj5 = c0041f.f111o.get("http.end_timestamp");
                        AbstractC1474fG.h(obj5, "null cannot be cast to non-null type kotlin.Long");
                        kVar.r = ((Long) obj5).longValue() / 1000.0d;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Map map3 = c0041f.f111o;
                        AbstractC1474fG.i(map3, "breadcrumb.data");
                        for (Map.Entry entry : map3.entrySet()) {
                            String str3 = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (n.contains(str3)) {
                                AbstractC1474fG.i(str3, "key");
                                String strR = AbstractC1899jh0.R(str3, "content_length", "body_size", false);
                                linkedHashMap2.put(((I60) m.getValue()).e(AbstractC1119bh0.x0(strR, ".", strR), b.m), value);
                            }
                        }
                        kVar.s = new ConcurrentHashMap(linkedHashMap2);
                    }
                }
            }
            return kVar;
        }
        String str4 = "navigation";
        if (AbstractC1474fG.b(c0041f.n, "navigation") && AbstractC1474fG.b(c0041f.p, "app.lifecycle")) {
            str4 = "app." + c0041f.f111o.get("state");
        } else if (AbstractC1474fG.b(c0041f.n, "navigation") && AbstractC1474fG.b(c0041f.p, "device.orientation")) {
            str4 = c0041f.p;
            AbstractC1474fG.g(str4);
            Object obj6 = c0041f.f111o.get("position");
            if (!AbstractC1474fG.b(obj6, "landscape") && !AbstractC1474fG.b(obj6, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj6);
        } else {
            if (!AbstractC1474fG.b(c0041f.n, "navigation")) {
                if (AbstractC1474fG.b(c0041f.p, "ui.click")) {
                    Object obj7 = c0041f.f111o.get("view.id");
                    if (obj7 == null && (obj7 = c0041f.f111o.get("view.tag")) == null) {
                        obj7 = c0041f.f111o.get("view.class");
                    }
                    str = obj7 instanceof String ? (String) obj7 : null;
                    if (str == null) {
                        return null;
                    }
                    Map map4 = c0041f.f111o;
                    AbstractC1474fG.i(map4, "breadcrumb.data");
                    linkedHashMap.putAll(map4);
                    str4 = "ui.tap";
                    enumC0094u1 = null;
                } else if (AbstractC1474fG.b(c0041f.n, "system") && AbstractC1474fG.b(c0041f.p, "network.event")) {
                    if (!AbstractC1474fG.b(c0041f.f111o.get("action"), "NETWORK_LOST")) {
                        Map map5 = c0041f.f111o;
                        AbstractC1474fG.i(map5, "breadcrumb.data");
                        if (map5.containsKey("network_type")) {
                            Object obj8 = c0041f.f111o.get("network_type");
                            String str5 = obj8 instanceof String ? (String) obj8 : null;
                            obj = (str5 == null || str5.length() == 0) ? "offline" : c0041f.f111o.get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (AbstractC1474fG.b(this.l, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj9 = linkedHashMap.get("state");
                    this.l = obj9 instanceof String ? (String) obj9 : null;
                    str4 = "device.connectivity";
                } else if (AbstractC1474fG.b(c0041f.f111o.get("action"), "BATTERY_CHANGED")) {
                    Map map6 = c0041f.f111o;
                    AbstractC1474fG.i(map6, "breadcrumb.data");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : map6.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        if (AbstractC1474fG.b(str6, "level") || AbstractC1474fG.b(str6, "charging")) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str4 = "device.battery";
                } else {
                    str4 = c0041f.p;
                    str = c0041f.m;
                    enumC0094u1 = c0041f.q;
                    Map map7 = c0041f.f111o;
                    AbstractC1474fG.i(map7, "breadcrumb.data");
                    linkedHashMap.putAll(map7);
                }
                if (str4 == null && str4.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.m = c0041f.a().getTime();
                    aVar.f140o = c0041f.a().getTime() / 1000.0d;
                    aVar.p = "default";
                    aVar.q = str4;
                    aVar.r = str;
                    aVar.s = enumC0094u1;
                    aVar.t = new ConcurrentHashMap(linkedHashMap);
                    return aVar;
                }
            }
            if (AbstractC1474fG.b(c0041f.f111o.get("state"), "resumed")) {
                Object obj10 = c0041f.f111o.get("screen");
                String str7 = obj10 instanceof String ? (String) obj10 : null;
                if (str7 != null) {
                    strY0 = AbstractC1119bh0.y0(str7, '.', str7);
                } else {
                    strY0 = null;
                }
            } else {
                Map map8 = c0041f.f111o;
                AbstractC1474fG.i(map8, "breadcrumb.data");
                if (map8.containsKey("to")) {
                    Object obj11 = c0041f.f111o.get("to");
                    if (obj11 instanceof String) {
                        strY0 = (String) obj11;
                    } else {
                        strY0 = null;
                    }
                } else {
                    strY0 = null;
                }
            }
            if (strY0 == null) {
                return null;
            }
            linkedHashMap.put("to", strY0);
        }
        str = null;
        enumC0094u1 = null;
        return str4 == null ? null : null;
    }
}
