package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.G;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final G b;
    public final ILogger c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public h(Context context, ILogger iLogger, G g2) {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.config.a.C(context, "The application context is required.");
        this.a = context;
        io.sentry.config.a.C(g2, "The BuildInfoProvider is required.");
        this.b = g2;
        io.sentry.config.a.C(iLogger, "The Logger is required.");
        this.c = iLogger;
        this.d = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.config.a.C(runtime, "The Runtime is required.");
        this.f = runtime;
    }
}
