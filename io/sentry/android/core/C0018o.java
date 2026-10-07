package io.sentry.android.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0018o implements io.sentry.android.core.internal.util.l {
    public float a = 0.0f;
    public final /* synthetic */ r b;

    public C0018o(r rVar) {
        this.b = rVar;
    }

    @Override // io.sentry.android.core.internal.util.l
    public final void c(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
        r rVar = this.b;
        long j5 = jElapsedRealtimeNanos - rVar.a;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            rVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3)));
        } else if (z) {
            rVar.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3)));
        }
        if (f != this.a) {
            this.a = f;
            rVar.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Float.valueOf(f)));
        }
    }
}
