package io.sentry.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        a.C(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return io.sentry.util.e.b(this.b.getProperty(AbstractC1701hf0.h(new StringBuilder(), this.a, str)));
    }

    @Override // io.sentry.config.d
    public final Map b() {
        String strH = AbstractC1701hf0.h(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strH)) {
                    map.put(str.substring(strH.length()), io.sentry.util.e.b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public e(Properties properties) {
        this("", properties);
    }
}
