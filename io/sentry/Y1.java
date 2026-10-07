package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum Y1 implements InterfaceC0084r0 {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    Y1(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static Y1 fromHttpStatusCode(int i) {
        for (Y1 y1 : values()) {
            if (y1.matches(i)) {
                return y1;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(name().toLowerCase(Locale.ROOT));
    }

    public static Y1 fromHttpStatusCode(Integer num, Y1 y1) {
        Y1 y1FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : y1;
        return y1FromHttpStatusCode != null ? y1FromHttpStatusCode : y1;
    }

    Y1(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
