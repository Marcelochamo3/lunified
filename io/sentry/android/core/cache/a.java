package io.sentry.android.core.cache;

import io.sentry.C0039e0;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.android.core.C0028z;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.b;
import io.sentry.android.core.performance.d;
import io.sentry.cache.c;
import io.sentry.i2;
import io.sentry.transport.f;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final /* synthetic */ int t = 0;
    public final f s;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(SentryAndroidOptions sentryAndroidOptions) {
        b bVar = b.l;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.config.a.C(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.s = bVar;
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final void b(C0088s1 c0088s1, C0104y c0104y) {
        super.b(c0088s1, c0104y);
        I1 i1 = this.l;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) i1;
        d dVar = io.sentry.android.core.performance.c.c().c;
        if (i2.class.isInstance(io.sentry.config.a.q(c0104y)) && dVar.a()) {
            long jB = this.s.b() - dVar.n;
            if (jB <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
                logger.h(enumC0094u1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jB));
                String outboxPath = i1.getOutboxPath();
                if (outboxPath == null) {
                    i1.getLogger().h(enumC0094u1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        i1.getLogger().v(EnumC0094u1.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        C0039e0 c0039e0 = new C0039e0(this, 4, sentryAndroidOptions);
        Object objQ = io.sentry.config.a.q(c0104y);
        if (!C0028z.class.isInstance(io.sentry.config.a.q(c0104y)) || objQ == null) {
            return;
        }
        c0039e0.d(objQ);
    }
}
