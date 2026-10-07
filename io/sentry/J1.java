package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum J1 implements InterfaceC0084r0 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(name().toLowerCase(Locale.ROOT));
    }
}
