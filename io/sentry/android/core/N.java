package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.EnumC0094u1;
import io.sentry.G0;
import io.sentry.ILogger;
import java.io.File;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends FileObserver {
    public final String a;
    public final io.sentry.J b;
    public final ILogger c;
    public final long d;

    public N(String str, G0 g0, ILogger iLogger, long j) {
        super(str);
        this.a = str;
        this.b = g0;
        io.sentry.config.a.C(iLogger, "Logger is required.");
        this.c = iLogger;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        ILogger iLogger = this.c;
        iLogger.h(enumC0094u1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        this.b.a(AbstractC1701hf0.h(AbstractC1701hf0.k(str2), File.separator, str), io.sentry.config.a.b(new M(this.d, iLogger)));
    }
}
