package io.sentry.protocol;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0078e implements InterfaceC0084r0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(toString().toLowerCase(Locale.ROOT));
    }
}
