package io.sentry;

import j$.time.Instant;

/* JADX INFO: renamed from: io.sentry.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0085r1 extends AbstractC0049h1 {
    public final Instant l = Instant.now();

    @Override // io.sentry.AbstractC0049h1
    public final long d() {
        Instant instant = this.l;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
