package io.sentry.android.core;

import io.sentry.EnumC0094u1;
import io.sentry.G0;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC0002a0, Closeable {
    public N l;
    public ILogger m;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f59o = new Object();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i) {
            this();
        }
    }

    public static EnvelopeFileObserverIntegration a() {
        return new OutboxEnvelopeFileObserverIntegration(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f59o) {
            this.n = true;
        }
        N n = this.l;
        if (n != null) {
            n.stopWatching();
            ILogger iLogger = this.m;
            if (iLogger != null) {
                iLogger.h(EnumC0094u1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    public final void f(io.sentry.K k, I1 i1, String str) {
        N n = new N(str, new G0(k, i1.getEnvelopeReader(), i1.getSerializer(), i1.getLogger(), i1.getFlushTimeoutMillis(), i1.getMaxQueueSize()), i1.getLogger(), i1.getFlushTimeoutMillis());
        this.l = n;
        try {
            n.startWatching();
            i1.getLogger().h(EnumC0094u1.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.m = i1.getLogger();
        String outboxPath = i1.getOutboxPath();
        if (outboxPath == null) {
            this.m.h(EnumC0094u1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.m.h(EnumC0094u1.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            i1.getExecutorService().submit(new O(this, i1, outboxPath));
        } catch (Throwable th) {
            this.m.v(EnumC0094u1.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}
