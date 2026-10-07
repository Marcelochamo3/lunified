package io.sentry.protocol;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC0084r0 {
    public static final t m = new t(new UUID(0, 0));
    public final UUID l;

    public t(UUID uuid) {
        this.l = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t.class == obj.getClass() && this.l.compareTo(((t) obj).l) == 0;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(toString());
    }

    public final String toString() {
        String string = this.l.toString();
        Charset charset = io.sentry.util.e.a;
        if (string.equals("0000-0000")) {
            string = "00000000-0000-0000-0000-000000000000";
        }
        return string.replace("-", "");
    }

    public t(String str) {
        Charset charset = io.sentry.util.e.a;
        str = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.l = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
