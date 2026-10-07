package io.sentry;

import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class W1 implements InterfaceC0084r0 {
    public static final W1 m = new W1(new UUID(0, 0));
    public final String l;

    public W1(String str) {
        io.sentry.config.a.C(str, "value is required");
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W1.class != obj.getClass()) {
            return false;
        }
        return this.l.equals(((W1) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(this.l);
    }

    public final String toString() {
        return this.l;
    }

    public W1() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W1(UUID uuid) {
        String string = uuid.toString();
        Charset charset = io.sentry.util.e.a;
        this((string.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : string).replace("-", "").substring(0, 16));
    }
}
