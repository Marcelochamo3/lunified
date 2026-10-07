package io.sentry.rrweb;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum f implements InterfaceC0084r0 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) throws IOException {
        ((io.sentry.internal.debugmeta.c) f0).i(ordinal());
    }
}
