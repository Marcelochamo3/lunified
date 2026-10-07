package io.sentry.rrweb;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum d implements InterfaceC0084r0 {
    Mutation,
    MouseMove,
    MouseInteraction,
    Scroll,
    ViewportResize,
    Input,
    TouchMove,
    MediaInteraction,
    StyleSheetRule,
    CanvasMutation,
    Font,
    Log,
    Drag,
    StyleDeclaration,
    Selection,
    AdoptedStyleSheet,
    CustomElement;

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) throws IOException {
        ((io.sentry.internal.debugmeta.c) f0).i(ordinal());
    }
}
