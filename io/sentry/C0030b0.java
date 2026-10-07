package io.sentry;

/* JADX INFO: renamed from: io.sentry.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030b0 implements P {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.P
    public final void a(H0 h0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runtime runtime = this.a;
        h0.a = new C0096v0(jCurrentTimeMillis, runtime.totalMemory() - runtime.freeMemory(), -1L);
    }

    @Override // io.sentry.P
    public final void b() {
    }
}
