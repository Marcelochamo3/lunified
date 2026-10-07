package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.K;
import io.sentry.K1;
import io.sentry.P0;
import io.sentry.Q;
import io.sentry.U0;
import io.sentry.android.core.RunnableC0006c;
import io.sentry.android.replay.r;
import io.sentry.protocol.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC0911Ye;
import o.AbstractC1016af;
import o.AbstractC1406ef;
import o.AbstractC1474fG;
import o.AbstractC2506pt;
import o.C1090bM;
import o.C1285dM;
import o.InterfaceC0412Ey;
import o.InterfaceC0775Sy;
import o.Rh0;
import o.U9;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final I1 a;
    public final K b;
    public final io.sentry.transport.f c;
    public r d;
    public final InterfaceC0775Sy e;
    public io.sentry.android.replay.h f;
    public final AtomicReference g;
    public final AtomicLong h;
    public final AtomicReference i;
    public final AtomicReference j;
    public final AtomicInteger k;
    public final LinkedList l;
    public final Object m;
    public final LinkedHashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f92o;
    public long p;
    public final Rh0 q;

    public g(I1 i1, K k, io.sentry.transport.f fVar, r rVar, ScheduledExecutorService scheduledExecutorService, InterfaceC0775Sy interfaceC0775Sy) {
        AbstractC1474fG.j(i1, "options");
        AbstractC1474fG.j(fVar, "dateProvider");
        AbstractC1474fG.j(rVar, "recorderConfig");
        this.a = i1;
        this.b = k;
        this.c = fVar;
        this.d = rVar;
        this.e = interfaceC0775Sy;
        this.g = new AtomicReference();
        this.h = new AtomicLong();
        this.i = new AtomicReference();
        this.j = new AtomicReference(t.m);
        this.k = new AtomicInteger(0);
        this.l = new LinkedList();
        this.m = new Object();
        this.n = new LinkedHashMap(10);
        this.q = new Rh0(new io.sentry.android.replay.f(2, scheduledExecutorService));
    }

    public abstract p a();

    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f0  */
    public final d b(long j, final Date date, t tVar, int i, int i2, int i3, J1 j1) {
        io.sentry.android.replay.video.d dVar;
        long j2;
        long j3;
        int i4;
        io.sentry.android.replay.video.d dVar2;
        long jConvert;
        io.sentry.android.replay.d dVar3;
        final Date dateK;
        final ArrayList arrayList;
        final LinkedList linkedList;
        K k;
        AtomicReference atomicReference;
        AbstractC1474fG.j(j1, "replayType");
        io.sentry.android.replay.h hVar = this.f;
        if (hVar != null) {
            long time = date.getTime();
            File file = new File((File) hVar.r.getValue(), i + ".mp4");
            if (hVar.s.isEmpty()) {
                hVar.l.getLogger().h(EnumC0094u1.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            } else {
                synchronized (hVar.p) {
                    dVar = (io.sentry.android.replay.video.d) hVar.f100o.f(file, Integer.valueOf(i2), Integer.valueOf(i3));
                }
                hVar.q = dVar;
                long j4 = ((long) 1000) / ((long) hVar.n.e);
                io.sentry.android.replay.i iVar = (io.sentry.android.replay.i) AbstractC0911Ye.b0(hVar.s);
                long j5 = time + j;
                C1285dM c1285dM = j5 <= Long.MIN_VALUE ? C1285dM.f736o : new C1285dM(time, j5 - 1);
                AbstractC1474fG.j(c1285dM, "<this>");
                U9.e(j4 > 0, Long.valueOf(j4));
                if (c1285dM.n > 0) {
                    j3 = j4;
                    j2 = j3;
                } else {
                    j2 = j4;
                    j3 = -j2;
                }
                long j6 = c1285dM.l;
                long j7 = new C1090bM(j6, c1285dM.m, j3).m;
                if ((j3 > 0 && j6 <= j7) || (j3 < 0 && j7 <= j6)) {
                    long j8 = j6;
                    i4 = 0;
                    while (true) {
                        for (io.sentry.android.replay.i iVar2 : hVar.s) {
                            long j9 = j8 + j2;
                            long j10 = iVar2.b;
                            if (j8 <= j10 && j10 <= j9) {
                                iVar = iVar2;
                                break;
                            }
                            if (j10 > j9) {
                                break;
                            }
                        }
                        if (hVar.f(iVar)) {
                            i4++;
                        }
                        if (j8 == j7) {
                            break;
                        }
                        j8 += j3;
                    }
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    hVar.l.getLogger().h(EnumC0094u1.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    hVar.a(file);
                } else {
                    synchronized (hVar.p) {
                        try {
                            io.sentry.android.replay.video.d dVar4 = hVar.q;
                            if (dVar4 != null) {
                                dVar4.b();
                            }
                            io.sentry.android.replay.video.d dVar5 = hVar.q;
                            if (dVar5 != null) {
                                io.sentry.android.replay.video.b bVar = dVar5.g;
                                jConvert = bVar.e == 0 ? 0L : TimeUnit.MILLISECONDS.convert(bVar.f + bVar.a, TimeUnit.MICROSECONDS);
                                dVar2 = null;
                            } else {
                                dVar2 = null;
                                jConvert = 0;
                            }
                            hVar.q = dVar2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    AbstractC1406ef.S(hVar.s, new io.sentry.android.replay.g(j5, hVar));
                    dVar3 = new io.sentry.android.replay.d(file, i4, jConvert);
                }
                if (dVar3 == null) {
                    File file2 = dVar3.a;
                    int i5 = dVar3.b;
                    long j11 = dVar3.c;
                    dateK = io.sentry.config.a.k(date.getTime() + j11);
                    AbstractC1474fG.i(dateK, "getDateTime(segmentTimestamp.time + duration)");
                    K1 k1 = new K1();
                    k1.l = tVar;
                    k1.D = tVar;
                    k1.E = i;
                    k1.F = dateK;
                    k1.G = date;
                    k1.C = j1;
                    k1.A = file2;
                    arrayList = new ArrayList();
                    io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
                    jVar.m = date.getTime();
                    jVar.f144o = i2;
                    jVar.p = i3;
                    arrayList.add(jVar);
                    io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
                    lVar.m = date.getTime();
                    lVar.f146o = i;
                    lVar.q = j11;
                    lVar.v = i5;
                    lVar.p = file2.length();
                    lVar.x = this.d.e;
                    lVar.t = i2;
                    lVar.u = i3;
                    lVar.y = 0;
                    lVar.z = 0;
                    arrayList.add(lVar);
                    linkedList = new LinkedList();
                    k = this.b;
                    if (k != null) {
                        k.m(new U0() { // from class: io.sentry.android.replay.capture.a
                            @Override // io.sentry.U0
                            public final void c(Q q) {
                                io.sentry.rrweb.b bVarQ;
                                Date date2 = date;
                                AbstractC1474fG.j(date2, "$segmentTimestamp");
                                Date date3 = dateK;
                                AbstractC1474fG.j(date3, "$endTimestamp");
                                g gVar = this;
                                AbstractC1474fG.j(gVar, "this$0");
                                List list = arrayList;
                                AbstractC1474fG.j(list, "$recordingPayload");
                                LinkedList linkedList2 = linkedList;
                                AbstractC1474fG.j(linkedList2, "$urls");
                                AbstractC1474fG.j(q, "scope");
                                Queue<C0041f> queueR = q.r();
                                AbstractC1474fG.i(queueR, "scope.breadcrumbs");
                                for (C0041f c0041f : queueR) {
                                    if (c0041f.a().getTime() >= date2.getTime() && c0041f.a().getTime() < date3.getTime() && (bVarQ = gVar.a.getReplayController().K().q(c0041f)) != null) {
                                        list.add(bVarQ);
                                        io.sentry.rrweb.a aVar = bVarQ instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarQ : null;
                                        if (AbstractC1474fG.b(aVar != null ? aVar.q : null, "navigation")) {
                                            Map map = ((io.sentry.rrweb.a) bVarQ).t;
                                            AbstractC1474fG.g(map);
                                            Object obj = map.get("to");
                                            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlin.String");
                                            linkedList2.add((String) obj);
                                        }
                                    }
                                }
                            }
                        });
                    }
                    atomicReference = this.i;
                    if (atomicReference.get() != null && !AbstractC1474fG.b(AbstractC0911Ye.d0(linkedList), atomicReference.get())) {
                        linkedList.addFirst(atomicReference.get());
                    }
                    i(dateK.getTime(), new e(date, 0, arrayList));
                    P0 p0 = new P0();
                    p0.l = Integer.valueOf(i);
                    p0.m = AbstractC0911Ye.r0(arrayList, new f());
                    k1.H = linkedList;
                    return new b(j11, k1, p0);
                }
            }
            dVar3 = null;
            if (dVar3 == null) {
                File file3 = dVar3.a;
                int i6 = dVar3.b;
                long j12 = dVar3.c;
                dateK = io.sentry.config.a.k(date.getTime() + j12);
                AbstractC1474fG.i(dateK, "getDateTime(segmentTimestamp.time + duration)");
                K1 k2 = new K1();
                k2.l = tVar;
                k2.D = tVar;
                k2.E = i;
                k2.F = dateK;
                k2.G = date;
                k2.C = j1;
                k2.A = file3;
                arrayList = new ArrayList();
                io.sentry.rrweb.j jVar2 = new io.sentry.rrweb.j();
                jVar2.m = date.getTime();
                jVar2.f144o = i2;
                jVar2.p = i3;
                arrayList.add(jVar2);
                io.sentry.rrweb.l lVar2 = new io.sentry.rrweb.l();
                lVar2.m = date.getTime();
                lVar2.f146o = i;
                lVar2.q = j12;
                lVar2.v = i6;
                lVar2.p = file3.length();
                lVar2.x = this.d.e;
                lVar2.t = i2;
                lVar2.u = i3;
                lVar2.y = 0;
                lVar2.z = 0;
                arrayList.add(lVar2);
                linkedList = new LinkedList();
                k = this.b;
                if (k != null) {
                    k.m(new U0() { // from class: io.sentry.android.replay.capture.a
                        @Override // io.sentry.U0
                        public final void c(Q q) {
                            io.sentry.rrweb.b bVarQ;
                            Date date2 = date;
                            AbstractC1474fG.j(date2, "$segmentTimestamp");
                            Date date3 = dateK;
                            AbstractC1474fG.j(date3, "$endTimestamp");
                            g gVar = this;
                            AbstractC1474fG.j(gVar, "this$0");
                            List list = arrayList;
                            AbstractC1474fG.j(list, "$recordingPayload");
                            LinkedList linkedList2 = linkedList;
                            AbstractC1474fG.j(linkedList2, "$urls");
                            AbstractC1474fG.j(q, "scope");
                            Queue<C0041f> queueR = q.r();
                            AbstractC1474fG.i(queueR, "scope.breadcrumbs");
                            for (C0041f c0041f : queueR) {
                                if (c0041f.a().getTime() >= date2.getTime() && c0041f.a().getTime() < date3.getTime() && (bVarQ = gVar.a.getReplayController().K().q(c0041f)) != null) {
                                    list.add(bVarQ);
                                    io.sentry.rrweb.a aVar = bVarQ instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarQ : null;
                                    if (AbstractC1474fG.b(aVar != null ? aVar.q : null, "navigation")) {
                                        Map map = ((io.sentry.rrweb.a) bVarQ).t;
                                        AbstractC1474fG.g(map);
                                        Object obj = map.get("to");
                                        AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlin.String");
                                        linkedList2.add((String) obj);
                                    }
                                }
                            }
                        }
                    });
                }
                atomicReference = this.i;
                if (atomicReference.get() != null) {
                    linkedList.addFirst(atomicReference.get());
                }
                i(dateK.getTime(), new e(date, 0, arrayList));
                P0 p1 = new P0();
                p1.l = Integer.valueOf(i);
                p1.m = AbstractC0911Ye.r0(arrayList, new f());
                k2.H = linkedList;
                return new b(j12, k2, p1);
            }
        }
        return c.a;
    }

    public final ScheduledExecutorService c() {
        Object value = this.q.getValue();
        AbstractC1474fG.i(value, "<get-replayExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    public abstract void d(r rVar);

    public void e(String str) {
    }

    public abstract void f(Bitmap bitmap, io.sentry.android.replay.j jVar);

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x0158  */
    /* JADX WARN: Code duplicated, block: B:48:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b0  */
    public void g(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listA;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        List listA2;
        List listA3;
        int actionMasked = motionEvent.getActionMasked();
        io.sentry.transport.f fVar = this.c;
        LinkedHashMap linkedHashMap = this.n;
        int i = 0;
        if (actionMasked != 0) {
            boolean z = true;
            if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    list = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                    gVar.m = fVar.b();
                    gVar.q = motionEvent.getX(iFindPointerIndex2) * this.d.c;
                    gVar.r = motionEvent.getY(iFindPointerIndex2) * this.d.d;
                    gVar.p = 0;
                    gVar.t = pointerId2;
                    gVar.f141o = io.sentry.rrweb.f.TouchEnd;
                    listA2 = AbstractC2506pt.A(gVar);
                }
            } else if (actionMasked == 2) {
                long jB = fVar.b();
                long j = this.p;
                if (j == 0 || j + ((long) 50) <= jB) {
                    this.p = jB;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    AbstractC1474fG.i(setKeySet, "currentPositions.keys");
                    for (Integer num : setKeySet) {
                        AbstractC1474fG.i(num, "pId");
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 != -1) {
                            if (this.f92o == 0) {
                                this.f92o = jB;
                            }
                            Object obj = linkedHashMap.get(num);
                            AbstractC1474fG.g(obj);
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            hVar.m = motionEvent.getX(iFindPointerIndex3) * this.d.c;
                            hVar.n = motionEvent.getY(iFindPointerIndex3) * this.d.d;
                            hVar.l = i;
                            hVar.f142o = jB - this.f92o;
                            ((Collection) obj).add(hVar);
                        }
                        i = 0;
                    }
                    long j2 = jB - this.f92o;
                    if (j2 > 500) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList arrayList2 = (ArrayList) entry.getValue();
                            if (arrayList2.isEmpty() ^ z) {
                                io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                                iVar.m = jB;
                                ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList2, 10));
                                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                                    io.sentry.rrweb.h hVar2 = (io.sentry.rrweb.h) it.next();
                                    hVar2.f142o -= j2;
                                    arrayList3.add(hVar2);
                                }
                                iVar.p = arrayList3;
                                iVar.f143o = iIntValue;
                                arrayList.add(iVar);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                AbstractC1474fG.g(obj2);
                                ((ArrayList) obj2).clear();
                                z = true;
                            }
                        }
                        this.f92o = 0L;
                        list = arrayList;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList());
                        io.sentry.rrweb.g gVar2 = new io.sentry.rrweb.g();
                        gVar2.m = fVar.b();
                        gVar2.q = motionEvent.getX(iFindPointerIndex) * this.d.c;
                        gVar2.r = motionEvent.getY(iFindPointerIndex) * this.d.d;
                        gVar2.p = 0;
                        gVar2.t = pointerId;
                        gVar2.f141o = io.sentry.rrweb.f.TouchStart;
                        listA = AbstractC2506pt.A(gVar2);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.g gVar3 = new io.sentry.rrweb.g();
                        gVar3.m = fVar.b();
                        gVar3.q = motionEvent.getX(iFindPointerIndex2) * this.d.c;
                        gVar3.r = motionEvent.getY(iFindPointerIndex2) * this.d.d;
                        gVar3.p = 0;
                        gVar3.t = pointerId2;
                        gVar3.f141o = io.sentry.rrweb.f.TouchEnd;
                        listA2 = AbstractC2506pt.A(gVar3);
                    }
                }
                list = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.g gVar4 = new io.sentry.rrweb.g();
                gVar4.m = fVar.b();
                gVar4.q = motionEvent.getX() * this.d.c;
                gVar4.r = motionEvent.getY() * this.d.d;
                gVar4.p = 0;
                gVar4.t = 0;
                gVar4.f141o = io.sentry.rrweb.f.TouchCancel;
                listA3 = AbstractC2506pt.A(gVar4);
            }
        } else {
            pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex != -1) {
                list = null;
            } else {
                linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList());
                io.sentry.rrweb.g gVar5 = new io.sentry.rrweb.g();
                gVar5.m = fVar.b();
                gVar5.q = motionEvent.getX(iFindPointerIndex) * this.d.c;
                gVar5.r = motionEvent.getY(iFindPointerIndex) * this.d.d;
                gVar5.p = 0;
                gVar5.t = pointerId;
                gVar5.f141o = io.sentry.rrweb.f.TouchStart;
                listA = AbstractC2506pt.A(gVar5);
            }
        }
        if (list == null) {
            list = listA;
            list = listA2;
            list = listA3;
            return;
        } else {
            list = listA;
            list = listA2;
            list = listA3;
            synchronized (this.m) {
                AbstractC1406ef.Q(this.l, list);
            }
        }
    }

    public void h() {
    }

    public final void i(long j, InterfaceC0412Ey interfaceC0412Ey) {
        synchronized (this.m) {
            try {
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) this.l.peek();
                while (bVar != null && bVar.m < j) {
                    if (interfaceC0412Ey != null) {
                        interfaceC0412Ey.b(bVar);
                    }
                    this.l.remove();
                    bVar = (io.sentry.rrweb.b) this.l.peek();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void j(boolean z, String str, C0104y c0104y, io.sentry.android.replay.f fVar);

    public void k(int i, t tVar, boolean z) {
        io.sentry.android.replay.h hVar;
        AbstractC1474fG.j(tVar, "replayId");
        this.k.set(i);
        this.j.set(tVar);
        I1 i1 = this.a;
        if (z) {
            io.sentry.config.a.F(c(), i1, "CaptureStrategy.replays_cleanup", new RunnableC0006c(5, this));
        }
        InterfaceC0775Sy interfaceC0775Sy = this.e;
        if (interfaceC0775Sy == null || (hVar = (io.sentry.android.replay.h) interfaceC0775Sy.i(tVar, this.d)) == null) {
            hVar = new io.sentry.android.replay.h(i1, tVar, this.d);
        }
        this.f = hVar;
        this.g.set(io.sentry.config.a.j());
        this.h.set(this.c.b());
    }

    public void l() {
        io.sentry.android.replay.h hVar = this.f;
        if (hVar != null) {
            hVar.close();
        }
        this.k.set(0);
        this.h.set(0L);
        this.g.set(null);
        this.j.set(t.m);
    }
}
