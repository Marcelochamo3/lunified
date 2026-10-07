package io.sentry.config;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public static String c(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return io.sentry.util.e.b(System.getenv(c(str)));
    }

    @Override // io.sentry.config.d
    public final Map b() {
        String strB;
        String str = c("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strB = io.sentry.util.e.b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strB);
            }
        }
        return concurrentHashMap;
    }
}
