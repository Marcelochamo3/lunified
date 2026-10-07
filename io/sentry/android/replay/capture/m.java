package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.K;
import io.sentry.Z0;
import io.sentry.android.replay.r;
import io.sentry.protocol.t;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.concurrent.ScheduledExecutorService;
import o.AbstractC0911Ye;
import o.AbstractC1474fG;
import o.C1101bX;
import o.InterfaceC0360Cy;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    public final I1 r;
    public final K s;
    public final io.sentry.transport.f t;
    public final SecureRandom u;
    public final ArrayList v;
    public final Object w;
    public final ArrayList x;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(I1 i1, K k, r rVar, SecureRandom secureRandom) {
        io.sentry.transport.d dVar = io.sentry.transport.d.l;
        AbstractC1474fG.j(secureRandom, "random");
        super(i1, k, dVar, rVar, null, null);
        this.r = i1;
        this.s = k;
        this.t = dVar;
        this.u = secureRandom;
        this.v = new ArrayList();
        this.w = new Object();
        this.x = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.g
    public final p a() {
        r rVar = this.d;
        ScheduledExecutorService scheduledExecutorServiceC = c();
        p pVar = new p(this.r, this.s, this.t, rVar, scheduledExecutorServiceC, 32);
        int i = this.k.get();
        Object obj = this.j.get();
        AbstractC1474fG.i(obj, "currentReplayId.get()");
        pVar.k(i, (t) obj, false);
        return pVar;
    }

    @Override // io.sentry.android.replay.capture.g
    public final void d(r rVar) {
        Date dateK;
        ArrayList arrayList;
        I1 i1 = this.r;
        long j = i1.getExperimental().a.h;
        long jB = this.t.b();
        io.sentry.android.replay.h hVar = this.f;
        if (hVar == null || (arrayList = hVar.s) == null || !(!arrayList.isEmpty())) {
            dateK = io.sentry.config.a.k(jB - j);
        } else {
            io.sentry.android.replay.h hVar2 = this.f;
            AbstractC1474fG.g(hVar2);
            dateK = io.sentry.config.a.k(((io.sentry.android.replay.i) AbstractC0911Ye.b0(hVar2.s)).b);
        }
        final Date date = dateK;
        AbstractC1474fG.i(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        final int i = this.k.get();
        final long time = jB - date.getTime();
        final t tVar = (t) this.j.get();
        r rVar2 = this.d;
        final int i2 = rVar2.b;
        ScheduledExecutorService scheduledExecutorServiceC = c();
        final int i3 = rVar2.a;
        io.sentry.config.a.F(scheduledExecutorServiceC, i1, "BufferCaptureStrategy.onConfigurationChanged", new Runnable() { // from class: io.sentry.android.replay.capture.j
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = this.l;
                AbstractC1474fG.j(mVar, "this$0");
                Date date2 = date;
                AbstractC1474fG.j(date2, "$currentSegmentTimestamp");
                t tVar2 = tVar;
                AbstractC1474fG.i(tVar2, "replayId");
                J1 j1 = J1.BUFFER;
                d dVarB = mVar.b(time, date2, tVar2, i, i2, i3, j1);
                if (dVarB instanceof b) {
                    mVar.v.add(dVarB);
                    mVar.k.getAndIncrement();
                }
            }
        });
        this.d = rVar;
    }

    @Override // io.sentry.android.replay.capture.g
    public final void e(String str) {
        synchronized (this.w) {
            try {
                C1101bX c1101bX = (C1101bX) AbstractC0911Ye.j0(this.x);
                String str2 = c1101bX != null ? (String) c1101bX.l : null;
                if (str != null && !AbstractC1474fG.b(str2, str)) {
                    this.x.add(new C1101bX(str, Long.valueOf(this.t.b())));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.android.replay.capture.g
    public final void f(Bitmap bitmap, io.sentry.android.replay.j jVar) {
        long jB = this.t.b();
        io.sentry.config.a.F(c(), this.r, "BufferCaptureStrategy.add_frame", new k(this, jVar, jB, 0));
    }

    @Override // io.sentry.android.replay.capture.g
    public final void g(MotionEvent motionEvent) {
        super.g(motionEvent);
        i(this.t.b() - this.r.getExperimental().a.h, null);
    }

    @Override // io.sentry.android.replay.capture.g
    public final void j(boolean z, String str, final C0104y c0104y, final io.sentry.android.replay.f fVar) {
        Date dateK;
        Object objPrevious;
        ArrayList arrayList;
        SecureRandom secureRandom = this.u;
        Double d = this.r.getExperimental().a.b;
        AbstractC1474fG.j(secureRandom, "<this>");
        if (d == null || d.doubleValue() < secureRandom.nextDouble()) {
            this.r.getLogger().h(EnumC0094u1.INFO, "Replay wasn't sampled by errorSampleRate, not capturing for event %s", str);
            return;
        }
        K k = this.s;
        if (k != null) {
            k.m(new h(this, 0));
        }
        long j = this.r.getExperimental().a.h;
        final long jB = this.t.b();
        io.sentry.android.replay.h hVar = this.f;
        if (hVar == null || (arrayList = hVar.s) == null || !(!arrayList.isEmpty())) {
            dateK = io.sentry.config.a.k(jB - j);
        } else {
            io.sentry.android.replay.h hVar2 = this.f;
            AbstractC1474fG.g(hVar2);
            dateK = io.sentry.config.a.k(((io.sentry.android.replay.i) AbstractC0911Ye.b0(hVar2.s)).b);
        }
        final Date date = dateK;
        AbstractC1474fG.i(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        final int i = this.k.get();
        final t tVar = (t) this.j.get();
        r rVar = this.d;
        final int i2 = rVar.b;
        final int i3 = rVar.a;
        long time = date.getTime();
        synchronized (this.w) {
            try {
                ArrayList arrayList2 = this.x;
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (((Number) ((C1101bX) objPrevious).m).longValue() > time);
                C1101bX c1101bX = (C1101bX) objPrevious;
                String str2 = c1101bX != null ? (String) c1101bX.l : null;
                if (str2 != null) {
                    this.i.set(str2);
                }
                this.v.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        io.sentry.config.a.F(c(), this.r, "BufferCaptureStrategy.send_replay_for_event", new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                K k2;
                m mVar = this.l;
                AbstractC1474fG.j(mVar, "this$0");
                Date date2 = date;
                AbstractC1474fG.j(date2, "$currentSegmentTimestamp");
                InterfaceC0360Cy interfaceC0360Cy = fVar;
                AbstractC1474fG.j(interfaceC0360Cy, "$onSegmentSent");
                ArrayList arrayList3 = mVar.v;
                AbstractC1474fG.j(arrayList3, "<this>");
                b bVar = (b) (arrayList3.isEmpty() ? null : arrayList3.remove(0));
                while (true) {
                    k2 = mVar.s;
                    if (bVar == null) {
                        break;
                    }
                    bVar.a(k2, new C0104y());
                    AbstractC1474fG.j(arrayList3, "<this>");
                    bVar = (b) (arrayList3.isEmpty() ? null : arrayList3.remove(0));
                    Thread.sleep(100L);
                }
                long time2 = jB - date2.getTime();
                t tVar2 = tVar;
                AbstractC1474fG.i(tVar2, "replayId");
                d dVarB = mVar.b(time2, date2, tVar2, i, i2, i3, J1.BUFFER);
                if (dVarB instanceof b) {
                    b bVar2 = (b) dVarB;
                    C0104y c0104y2 = c0104y;
                    if (c0104y2 == null) {
                        c0104y2 = new C0104y();
                    }
                    bVar2.a(k2, c0104y2);
                    interfaceC0360Cy.c();
                }
            }
        });
    }

    @Override // io.sentry.android.replay.capture.g
    public final void k(int i, t tVar, boolean z) {
        AbstractC1474fG.j(tVar, "replayId");
        super.k(i, tVar, z);
        K k = this.s;
        if (k != null) {
            k.m(new h(this, 1));
        }
    }

    @Override // io.sentry.android.replay.capture.g
    public final void l() {
        io.sentry.android.replay.h hVar = this.f;
        io.sentry.config.a.F(c(), this.r, "BufferCaptureStrategy.stop", new Z0(hVar != null ? (File) hVar.r.getValue() : null, 1));
        super.l();
    }
}
