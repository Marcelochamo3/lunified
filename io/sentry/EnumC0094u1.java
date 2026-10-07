package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0094u1 implements InterfaceC0084r0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(name().toLowerCase(Locale.ROOT));
    }
}
