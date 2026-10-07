package io.sentry;

import android.os.SystemClock;
import io.sentry.android.core.C0008e;
import o.AbstractC1474fG;

/* JADX INFO: renamed from: io.sentry.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0042f0 implements InterfaceC0048h0, R0, io.sentry.util.b, io.sentry.transport.f, U0 {
    public final /* synthetic */ int l;

    public /* synthetic */ C0042f0(int i) {
        this.l = i;
    }

    @Override // io.sentry.R0
    public void a(S1 s1) {
    }

    @Override // io.sentry.transport.f
    public long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.U0
    public void c(Q q) {
        switch (this.l) {
            case 4:
                AbstractC1474fG.j(q, "it");
                q.y(io.sentry.protocol.t.m);
                break;
            default:
                q.k(new C0008e(5, q));
                break;
        }
    }

    @Override // io.sentry.util.b
    public Object d() {
        return new io.sentry.metrics.b();
    }

    @Override // io.sentry.InterfaceC0048h0
    public Object e() {
        return null;
    }
}
