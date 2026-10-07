package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import io.sentry.C0042f0;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.F;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.K;
import io.sentry.android.core.C0008e;
import io.sentry.android.replay.r;
import io.sentry.android.replay.v;
import io.sentry.protocol.t;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC1474fG;
import o.InterfaceC0412Ey;
import o.InterfaceC0775Sy;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {
    public final I1 r;
    public final K s;
    public final io.sentry.transport.f t;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(I1 i1, K k, io.sentry.transport.f fVar, r rVar, ScheduledExecutorService scheduledExecutorService, int i) {
        scheduledExecutorService = (i & 16) != 0 ? null : scheduledExecutorService;
        AbstractC1474fG.j(i1, "options");
        AbstractC1474fG.j(fVar, "dateProvider");
        AbstractC1474fG.j(rVar, "recorderConfig");
        super(i1, k, fVar, rVar, scheduledExecutorService, null);
        this.r = i1;
        this.s = k;
        this.t = fVar;
    }

    @Override // io.sentry.android.replay.capture.g
    public final void d(r rVar) {
        m("onConfigurationChanged", new e(this, (Date) this.g.get()));
        this.d = rVar;
    }

    @Override // io.sentry.android.replay.capture.g
    public final void f(Bitmap bitmap, final io.sentry.android.replay.j jVar) {
        I1 i1 = this.r;
        if (i1.getConnectionStatusProvider().a() == F.DISCONNECTED) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Skipping screenshot recording, no internet connection", new Object[0]);
            bitmap.recycle();
            return;
        }
        final long jB = this.t.b();
        r rVar = this.d;
        final int i = rVar.b;
        ScheduledExecutorService scheduledExecutorServiceC = c();
        final int i2 = rVar.a;
        io.sentry.config.a.F(scheduledExecutorServiceC, i1, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.o
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = this.l;
                AbstractC1474fG.j(pVar, "this$0");
                InterfaceC0775Sy interfaceC0775Sy = jVar;
                AbstractC1474fG.j(interfaceC0775Sy, "$store");
                io.sentry.android.replay.h hVar = pVar.f;
                if (hVar != null) {
                    interfaceC0775Sy.i(hVar, Long.valueOf(jB));
                }
                long jB2 = pVar.t.b();
                AtomicReference atomicReference = pVar.g;
                long time = jB2 - ((Date) atomicReference.get()).getTime();
                I1 i3 = pVar.r;
                if (time < i3.getExperimental().a.i) {
                    if (jB2 - pVar.h.get() >= i3.getExperimental().a.j) {
                        pVar.l();
                        i3.getLogger().h(EnumC0094u1.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                        return;
                    }
                    return;
                }
                Date date = (Date) atomicReference.get();
                AtomicInteger atomicInteger = pVar.k;
                int i4 = atomicInteger.get();
                t tVar = (t) pVar.j.get();
                long j = i3.getExperimental().a.i;
                AbstractC1474fG.i(date, "currentSegmentTimestamp");
                AbstractC1474fG.i(tVar, "replayId");
                d dVarB = pVar.b(j, date, tVar, i4, i, i2, J1.SESSION);
                if (dVarB instanceof b) {
                    b bVar = (b) dVarB;
                    bVar.a(pVar.s, new C0104y());
                    atomicInteger.getAndIncrement();
                    atomicReference.set(io.sentry.config.a.k(date.getTime() + bVar.a));
                }
            }
        });
    }

    @Override // io.sentry.android.replay.capture.g
    public final void h() {
        m("pause", new v(1, this));
    }

    @Override // io.sentry.android.replay.capture.g
    public final void j(boolean z, String str, C0104y c0104y, io.sentry.android.replay.f fVar) {
        I1 i1 = this.r;
        if (!z) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Replay is already running in 'session' mode, not capturing for event %s", str);
        } else {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Replay is already running in 'session' mode, capturing last segment for crashed event %s", str);
            m("send_replay_for_event", new e(this, 2, c0104y));
        }
    }

    @Override // io.sentry.android.replay.capture.g
    public final void k(int i, t tVar, boolean z) {
        AbstractC1474fG.j(tVar, "replayId");
        super.k(i, tVar, z);
        K k = this.s;
        if (k != null) {
            k.m(new C0008e(4, this));
        }
    }

    @Override // io.sentry.android.replay.capture.g
    public final void l() {
        io.sentry.android.replay.h hVar = this.f;
        m("stop", new e(this, 3, hVar != null ? (File) hVar.r.getValue() : null));
        K k = this.s;
        if (k != null) {
            k.m(new C0042f0(4));
        }
        super.l();
    }

    public final void m(String str, final InterfaceC0412Ey interfaceC0412Ey) {
        long jB = this.t.b();
        final Date date = (Date) this.g.get();
        final int i = this.k.get();
        final long time = jB - (date != null ? date.getTime() : 0L);
        final t tVar = (t) this.j.get();
        r rVar = this.d;
        final int i2 = rVar.b;
        ScheduledExecutorService scheduledExecutorServiceC = c();
        String strConcat = "SessionCaptureStrategy.".concat(str);
        final int i3 = rVar.a;
        io.sentry.config.a.F(scheduledExecutorServiceC, this.r, strConcat, new Runnable() { // from class: io.sentry.android.replay.capture.n
            @Override // java.lang.Runnable
            public final void run() {
                p pVar = this.l;
                AbstractC1474fG.j(pVar, "this$0");
                InterfaceC0412Ey interfaceC0412Ey2 = interfaceC0412Ey;
                AbstractC1474fG.j(interfaceC0412Ey2, "$onSegmentCreated");
                Date date2 = date;
                AbstractC1474fG.i(date2, "currentSegmentTimestamp");
                t tVar2 = tVar;
                AbstractC1474fG.i(tVar2, "replayId");
                interfaceC0412Ey2.b(pVar.b(time, date2, tVar2, i, i2, i3, J1.SESSION));
            }
        });
    }

    @Override // io.sentry.android.replay.capture.g
    public final p a() {
        return this;
    }
}
