package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ShutdownHookIntegration implements InterfaceC0002a0, Closeable {
    public final Runtime l;
    public Thread m;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.config.a.C(runtime, "Runtime is required");
        this.l = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m != null) {
            try {
                this.l.removeShutdownHook(this.m);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        if (!i1.isEnableShutdownHook()) {
            i1.getLogger().h(EnumC0094u1.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.m = new Thread(new RunnableC0059l(i1));
        try {
            this.l.addShutdownHook(this.m);
            i1.getLogger().h(EnumC0094u1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            io.sentry.config.a.a(ShutdownHookIntegration.class);
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
