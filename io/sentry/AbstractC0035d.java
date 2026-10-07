package io.sentry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0035d {
    public static List a(io.sentry.config.d dVar, String str) {
        String strA = dVar.a(str);
        return strA != null ? Arrays.asList(strA.split(",")) : Collections.emptyList();
    }

    public static boolean b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.h(EnumC0094u1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static void c(Map map, String str, io.sentry.internal.debugmeta.c cVar, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        cVar.f(str2);
        cVar.j(iLogger, obj);
    }
}
