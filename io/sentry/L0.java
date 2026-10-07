package io.sentry;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.android.core.C0007d;
import io.sentry.android.core.C0025w;
import io.sentry.android.core.RunnableC0005b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C0076c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import o.C0633Nm;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public L0(I1 i1) {
        this.d = new C0043f1();
        this.a = i1;
        Y transportFactory = i1.getTransportFactory();
        if (transportFactory instanceof E0) {
            transportFactory = new C0105y0(8);
            i1.setTransportFactory(transportFactory);
        }
        r rVar = new r(i1.getDsn());
        StringBuilder sb = new StringBuilder();
        URI uri = (URI) rVar.c;
        sb.append(uri.getPath());
        sb.append("/envelope/");
        String string = uri.resolve(sb.toString()).toString();
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(i1.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append((String) rVar.b);
        String str = (String) rVar.a;
        sb2.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String string2 = sb2.toString();
        String sentryClientName = i1.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.b = transportFactory.w(i1, new C0088s1(string, map));
        this.e = i1.isEnableMetrics() ? new RunnableC0099w0(i1, this) : io.sentry.metrics.d.l;
        this.c = i1.getSampleRate() == null ? null : new SecureRandom();
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0001a) it.next()).getClass();
        }
        return arrayList2;
    }

    public static ArrayList m(C0104y c0104y) {
        ArrayList arrayList = new ArrayList(c0104y.b);
        C0001a c0001a = c0104y.c;
        if (c0001a != null) {
            arrayList.add(c0001a);
        }
        C0001a c0001a2 = c0104y.d;
        if (c0001a2 != null) {
            arrayList.add(c0001a2);
        }
        C0001a c0001a3 = c0104y.e;
        if (c0001a3 != null) {
            arrayList.add(c0001a3);
        }
        return arrayList;
    }

    public synchronized void a(Activity activity) {
        if (n()) {
            q(new RunnableC0005b(this, activity, 0), "FrameMetricsAggregator.add");
            C0007d c0007dE = e();
            if (c0007dE != null) {
                ((WeakHashMap) this.d).put(activity, c0007dE);
            }
        }
    }

    public void b(AbstractC0037d1 abstractC0037d1, Q q) {
        if (q != null) {
            if (abstractC0037d1.f108o == null) {
                abstractC0037d1.f108o = q.e();
            }
            if (abstractC0037d1.t == null) {
                abstractC0037d1.t = q.s();
            }
            if (abstractC0037d1.p == null) {
                abstractC0037d1.p = new HashMap(new HashMap(q.C()));
            } else {
                for (Map.Entry entry : q.C().entrySet()) {
                    if (!abstractC0037d1.p.containsKey(entry.getKey())) {
                        abstractC0037d1.p.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC0037d1.x == null) {
                abstractC0037d1.x = new ArrayList(new ArrayList(q.r()));
            } else {
                Queue queueR = q.r();
                List list = abstractC0037d1.x;
                if (list != null && !queueR.isEmpty()) {
                    list.addAll(queueR);
                    Collections.sort(list, (C0043f1) this.d);
                }
            }
            if (abstractC0037d1.z == null) {
                abstractC0037d1.z = new HashMap(new HashMap(q.x()));
            } else {
                for (Map.Entry entry2 : q.x().entrySet()) {
                    if (!abstractC0037d1.z.containsKey(entry2.getKey())) {
                        abstractC0037d1.z.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Iterator it = new C0076c(q.j()).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object key = entry3.getKey();
                C0076c c0076c = abstractC0037d1.m;
                if (!c0076c.containsKey(key)) {
                    c0076c.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    public C0088s1 c(AbstractC0037d1 abstractC0037d1, ArrayList arrayList, S1 s1, d2 d2Var, J0 j0) {
        io.sentry.protocol.t tVar;
        int i = 1;
        ArrayList arrayList2 = new ArrayList();
        I1 i1 = (I1) this.a;
        if (abstractC0037d1 != null) {
            U serializer = i1.getSerializer();
            Charset charset = C0070o1.d;
            io.sentry.config.a.C(serializer, "ISerializer is required.");
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new CallableC0058k1(serializer, i, abstractC0037d1));
            arrayList2.add(new C0070o1(new C0073p1(EnumC0091t1.resolve(abstractC0037d1), new CallableC0061l1(cVar, 2), "application/json", (String) null, (String) null), new CallableC0061l1(cVar, 3)));
            tVar = abstractC0037d1.l;
        } else {
            tVar = null;
        }
        if (s1 != null) {
            arrayList2.add(C0070o1.b(i1.getSerializer(), s1));
        }
        if (j0 != null) {
            long maxTraceFileSize = i1.getMaxTraceFileSize();
            U serializer2 = i1.getSerializer();
            Charset charset2 = C0070o1.d;
            File file = j0.l;
            io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(new CallableC0067n1(file, maxTraceFileSize, j0, serializer2));
            arrayList2.add(new C0070o1(new C0073p1(EnumC0091t1.Profile, new CallableC0061l1(cVar2, 0), "application-json", file.getName(), (String) null), new CallableC0061l1(cVar2, 1)));
            if (tVar == null) {
                tVar = new io.sentry.protocol.t(j0.H);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0001a c0001a = (C0001a) it.next();
                U serializer3 = i1.getSerializer();
                ILogger logger = i1.getLogger();
                long maxAttachmentSize = i1.getMaxAttachmentSize();
                Charset charset3 = C0070o1.d;
                io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(new CallableC0067n1(c0001a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C0070o1(new C0073p1(EnumC0091t1.Attachment, new CallableC0061l1(cVar3, 12), c0001a.d, c0001a.c, c0001a.e), new CallableC0061l1(cVar3, 13)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C0088s1(new C0055j1(tVar, i1.getSdkVersion(), d2Var), arrayList2);
    }

    public C0088s1 d(final K1 k1, final P0 p0, d2 d2Var) {
        ArrayList arrayList = new ArrayList();
        I1 i1 = (I1) this.a;
        final U serializer = i1.getSerializer();
        final ILogger logger = i1.getLogger();
        Charset charset = C0070o1.d;
        final File file = k1.A;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.m1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                U u = serializer;
                K1 k2 = k1;
                File file2 = file;
                ILogger iLogger = logger;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C0070o1.d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            u.z(k2, bufferedWriter);
                            linkedHashMap.put(EnumC0091t1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            P0 p1 = p0;
                            if (p1 != null) {
                                u.z(p1, bufferedWriter);
                                linkedHashMap.put(EnumC0091t1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrA = io.sentry.config.a.A(10485760L, file2.getPath());
                                if (bArrA.length > 0) {
                                    linkedHashMap.put(EnumC0091t1.ReplayVideo.getItemType(), bArrA);
                                }
                            }
                            byte[] bArrF = C0070o1.f(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 == null) {
                                return bArrF;
                            }
                            file2.delete();
                            return bArrF;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        iLogger.v(EnumC0094u1.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            file2.delete();
                        }
                    }
                }
            }
        });
        arrayList.add(new C0070o1(new C0073p1(EnumC0091t1.ReplayVideo, new CallableC0061l1(cVar, 6), (String) null, (String) null, (String) null), new CallableC0061l1(cVar, 8)));
        return new C0088s1(new C0055j1(k1.l, i1.getSdkVersion(), d2Var), arrayList);
    }

    public C0007d e() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!n() || (frameMetricsAggregator = (FrameMetricsAggregator) this.a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrU = frameMetricsAggregator.a.u();
        int i3 = 0;
        if (sparseIntArrayArrU == null || sparseIntArrayArrU.length <= 0 || (sparseIntArray = sparseIntArrayArrU[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C0007d(i3, i, i2);
    }

    public io.sentry.protocol.t f(C0088s1 c0088s1, C0104y c0104y) {
        if (c0104y == null) {
            c0104y = new C0104y();
        }
        try {
            c0104y.a();
            return r(c0088s1, c0104y);
        } catch (IOException e) {
            ((I1) this.a).getLogger().v(EnumC0094u1.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.t.m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    public io.sentry.protocol.t g(C0083q1 c0083q1, Q q, C0104y c0104y) {
        S1 s1W;
        S1 s1;
        C0083q1 c0083q2;
        boolean z;
        d2 d2VarX;
        d2 d2Var;
        io.sentry.protocol.t tVar;
        SecureRandom secureRandom;
        int i = 1;
        if (c0104y == null) {
            c0104y = new C0104y();
        }
        if (s(c0083q1, c0104y) && q != null) {
            c0104y.b.addAll(q.f());
        }
        I1 i1 = (I1) this.a;
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "Capturing event: %s", c0083q1.l);
        Throwable th = c0083q1.u;
        if (th instanceof io.sentry.exception.a) {
            th = ((io.sentry.exception.a) th).m;
        }
        if (th != null && i1.containsIgnoredExceptionForType(th)) {
            i1.getLogger().h(enumC0094u1, "Event was dropped as the exception %s is ignored", th.getClass());
            i1.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC0053j.Error);
            return io.sentry.protocol.t.m;
        }
        if (s(c0083q1, c0104y)) {
            if (q != null) {
                b(c0083q1, q);
                if (c0083q1.G == null) {
                    c0083q1.G = q.B();
                }
                if (c0083q1.H == null) {
                    List listP = q.p();
                    c0083q1.H = listP != null ? new ArrayList(listP) : null;
                }
                if (q.t() != null) {
                    c0083q1.F = q.t();
                }
                V vM = q.m();
                C0076c c0076c = c0083q1.m;
                if (c0076c.a() == null) {
                    if (vM == null) {
                        c0076c.c((U1) f2.a(q.v()));
                    } else {
                        c0076c.c(vM.k());
                    }
                }
                c0083q1 = o(c0083q1, c0104y, q.z());
            }
            if (c0083q1 == null) {
                i1.getLogger().h(enumC0094u1, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.t.m;
            }
        }
        C0083q1 c0083q1O = o(c0083q1, c0104y, i1.getEventProcessors());
        if (c0083q1O != null) {
            B1 beforeSend = i1.getBeforeSend();
            if (beforeSend != null) {
                try {
                    ((C0633Nm) beforeSend).i(c0083q1O, c0104y);
                } catch (Throwable th2) {
                    i1.getLogger().v(EnumC0094u1.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                    c0083q1O = null;
                }
            }
            if (c0083q1O == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                i1.getClientReportRecorder().b(io.sentry.clientreport.d.BEFORE_SEND, EnumC0053j.Error);
            }
        }
        if (c0083q1O == null) {
            return io.sentry.protocol.t.m;
        }
        S1 s1W2 = q != null ? q.w(new C0042f0(i)) : null;
        if (s1W2 == null || s1W2.r == R1.Ok) {
            if (!io.sentry.config.a.E(c0104y)) {
                s1W = null;
            } else if (q != null) {
                s1W = q.w(new C0040e1(this, c0083q1O, c0104y));
            } else {
                i1.getLogger().h(EnumC0094u1.INFO, "Scope is null on client.captureEvent", new Object[0]);
                s1W = null;
            }
            s1 = s1W;
        } else {
            s1 = null;
        }
        if (i1.getSampleRate() == null || (secureRandom = (SecureRandom) this.c) == null || i1.getSampleRate().doubleValue() >= secureRandom.nextDouble()) {
            c0083q2 = c0083q1O;
        } else {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Event %s was dropped due to sampling decision.", c0083q1O.l);
            i1.getClientReportRecorder().b(io.sentry.clientreport.d.SAMPLE_RATE, EnumC0053j.Error);
            c0083q2 = null;
        }
        if (s1 != null) {
            if (s1W2 != null) {
                R1 r1 = s1.r;
                R1 r2 = R1.Crashed;
                z = (r1 == r2 && s1W2.r != r2) || (s1.n.get() > 0 && s1W2.n.get() <= 0);
            }
        }
        if (c0083q2 == null && !z) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.t.m;
        }
        io.sentry.protocol.t tVarR = io.sentry.protocol.t.m;
        if (c0083q2 != null && (tVar = c0083q2.l) != null) {
            tVarR = tVar;
        }
        if (c0083q2 != null) {
            i1.getReplayController().t(c0083q2, c0104y);
        }
        try {
            if (io.sentry.hints.b.class.isInstance(io.sentry.config.a.q(c0104y))) {
                if (c0083q2 != null) {
                    d2VarX = C0032c.m(c0083q2, i1).x();
                    d2Var = d2VarX;
                } else {
                    d2Var = null;
                }
            } else if (q != null) {
                W wB = q.b();
                if (wB != null) {
                    d2VarX = wB.b();
                } else {
                    C0032c c0032c = (C0032c) q.k(new C0039e0(i1, 7, q)).e;
                    d2VarX = c0032c != null ? c0032c.x() : null;
                }
                d2Var = d2VarX;
            } else {
                d2Var = null;
            }
            C0088s1 c0088s1C = c(c0083q2, c0083q2 != null ? m(c0104y) : null, s1, d2Var, null);
            c0104y.a();
            if (c0088s1C != null) {
                tVarR = r(c0088s1C, c0104y);
            }
        } catch (io.sentry.exception.b e) {
            e = e;
            i1.getLogger().s(EnumC0094u1.WARNING, e, "Capturing event %s failed.", tVarR);
            tVarR = io.sentry.protocol.t.m;
        } catch (IOException e2) {
            e = e2;
            i1.getLogger().s(EnumC0094u1.WARNING, e, "Capturing event %s failed.", tVarR);
            tVarR = io.sentry.protocol.t.m;
        }
        if (q != null) {
            W wB2 = q.b();
            if (wB2 != null && io.sentry.hints.k.class.isInstance(io.sentry.config.a.q(c0104y))) {
                Object objQ = io.sentry.config.a.q(c0104y);
                if (objQ instanceof io.sentry.hints.c) {
                    ((io.sentry.hints.c) objQ).f(wB2.e());
                    wB2.f(Y1.ABORTED, false, c0104y);
                } else {
                    wB2.f(Y1.ABORTED, false, null);
                }
            }
            io.sentry.protocol.t tVarU = q.u();
            if (!io.sentry.protocol.t.m.equals(tVarU) && io.sentry.hints.k.class.isInstance(io.sentry.config.a.q(c0104y))) {
                Object objQ2 = io.sentry.config.a.q(c0104y);
                if (objQ2 instanceof io.sentry.hints.c) {
                    ((io.sentry.hints.c) objQ2).f(tVarU);
                }
            }
        }
        return tVarR;
    }

    public io.sentry.protocol.t h(K1 k1, Q q, C0104y c0104y) {
        C0076c c0076c;
        io.sentry.config.a.C(k1, "SessionReplay is required.");
        if (c0104y == null) {
            c0104y = new C0104y();
        }
        if (s(k1, c0104y) && q != null) {
            if (k1.f108o == null) {
                k1.f108o = q.e();
            }
            if (k1.t == null) {
                k1.t = q.s();
            }
            if (k1.p == null) {
                k1.p = new HashMap(new HashMap(q.C()));
            } else {
                for (Map.Entry entry : q.C().entrySet()) {
                    if (!k1.p.containsKey(entry.getKey())) {
                        k1.p.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            Iterator it = new C0076c(q.j()).entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c0076c = k1.m;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!c0076c.containsKey(entry2.getKey())) {
                    c0076c.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            V vM = q.m();
            if (c0076c.a() == null) {
                if (vM == null) {
                    c0076c.c((U1) f2.a(q.v()));
                } else {
                    c0076c.c(vM.k());
                }
            }
        }
        I1 i1 = (I1) this.a;
        i1.getLogger().h(EnumC0094u1.DEBUG, "Capturing session replay: %s", k1.l);
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        io.sentry.protocol.t tVar2 = k1.l;
        if (tVar2 != null) {
            tVar = tVar2;
        }
        for (InterfaceC0092u interfaceC0092u : i1.getEventProcessors()) {
            try {
                k1 = interfaceC0092u.a(k1, c0104y);
            } catch (Throwable th) {
                i1.getLogger().s(EnumC0094u1.ERROR, th, "An exception occurred while processing replay event by processor: %s", interfaceC0092u.getClass().getName());
            }
            if (k1 == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Replay event was dropped by a processor: %s", interfaceC0092u.getClass().getName());
                i1.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC0053j.Replay);
                break;
            }
        }
        if (k1 == null) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Replay was dropped by Event processors.", new Object[0]);
            return io.sentry.protocol.t.m;
        }
        d2 d2VarX = null;
        if (q != null) {
            try {
                W wB = q.b();
                if (wB != null) {
                    d2VarX = wB.b();
                } else {
                    C0032c c0032c = (C0032c) q.k(new C0039e0(i1, 7, q)).e;
                    if (c0032c != null) {
                        d2VarX = c0032c.x();
                    }
                }
            } catch (IOException e) {
                i1.getLogger().s(EnumC0094u1.WARNING, e, "Capturing event %s failed.", tVar);
                return io.sentry.protocol.t.m;
            }
        }
        C0088s1 c0088s1D = d(k1, c0104y.f, d2VarX);
        c0104y.a();
        ((io.sentry.transport.g) this.b).x(c0088s1D, c0104y);
        return tVar;
    }

    public void i(S1 s1, C0104y c0104y) {
        io.sentry.config.a.C(s1, "Session is required.");
        I1 i1 = (I1) this.a;
        String str = s1.x;
        if (str == null || str.isEmpty()) {
            i1.getLogger().h(EnumC0094u1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            U serializer = i1.getSerializer();
            io.sentry.protocol.r sdkVersion = i1.getSdkVersion();
            io.sentry.config.a.C(serializer, "Serializer is required.");
            f(new C0088s1(null, sdkVersion, C0070o1.b(serializer, s1)), c0104y);
        } catch (IOException e) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Failed to capture session.", e);
        }
    }

    public io.sentry.protocol.t j(io.sentry.protocol.A a, d2 d2Var, Q q, C0104y c0104y, J0 j0) {
        io.sentry.protocol.A aP = a;
        C0104y c0104y2 = c0104y == null ? new C0104y() : c0104y;
        if (s(a, c0104y2) && q != null) {
            c0104y2.b.addAll(q.f());
        }
        I1 i1 = (I1) this.a;
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "Capturing transaction: %s", aP.l);
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        io.sentry.protocol.t tVar2 = aP.l;
        io.sentry.protocol.t tVar3 = tVar2 != null ? tVar2 : tVar;
        if (s(a, c0104y2)) {
            b(a, q);
            if (q != null) {
                aP = p(a, c0104y2, q.z());
            }
            if (aP == null) {
                i1.getLogger().h(enumC0094u1, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (aP != null) {
            aP = p(aP, c0104y2, i1.getEventProcessors());
        }
        if (aP == null) {
            i1.getLogger().h(enumC0094u1, "Transaction was dropped by Event processors.", new Object[0]);
            return tVar;
        }
        ArrayList arrayList = aP.D;
        int size = arrayList.size();
        i1.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            i1.getLogger().h(enumC0094u1, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            i1.getClientReportRecorder().c(io.sentry.clientreport.d.BEFORE_SEND, EnumC0053j.Span, i);
        }
        try {
            C0088s1 c0088s1C = c(aP, l(m(c0104y2)), null, d2Var, j0);
            c0104y2.a();
            return c0088s1C != null ? r(c0088s1C, c0104y2) : tVar3;
        } catch (io.sentry.exception.b | IOException e) {
            i1.getLogger().s(EnumC0094u1.WARNING, e, "Capturing transaction %s failed.", tVar3);
            return io.sentry.protocol.t.m;
        }
    }

    public void k(boolean z) {
        long shutdownTimeoutMillis;
        io.sentry.transport.g gVar = (io.sentry.transport.g) this.b;
        I1 i1 = (I1) this.a;
        i1.getLogger().h(EnumC0094u1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            ((L) this.e).close();
        } catch (IOException e) {
            i1.getLogger().v(EnumC0094u1.WARNING, "Failed to close the metrics aggregator.", e);
        }
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = i1.getShutdownTimeoutMillis();
            } catch (IOException e2) {
                i1.getLogger().v(EnumC0094u1.WARNING, "Failed to close the connection to the Sentry Server.", e2);
            }
        }
        gVar.j(shutdownTimeoutMillis);
        gVar.d(z);
        for (InterfaceC0092u interfaceC0092u : i1.getEventProcessors()) {
            if (interfaceC0092u instanceof Closeable) {
                try {
                    ((Closeable) interfaceC0092u).close();
                } catch (IOException e3) {
                    i1.getLogger().h(EnumC0094u1.WARNING, "Failed to close the event processor {}.", interfaceC0092u, e3);
                }
            }
        }
    }

    public boolean n() {
        if (((FrameMetricsAggregator) this.a) != null) {
            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
            if (sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2()) {
                return true;
            }
        }
        return false;
    }

    public C0083q1 o(C0083q1 c0083q1, C0104y c0104y, List list) {
        I1 i1 = (I1) this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0092u interfaceC0092u = (InterfaceC0092u) it.next();
            try {
                boolean z = interfaceC0092u instanceof C0025w;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(io.sentry.config.a.q(c0104y));
                if (zIsInstance && z) {
                    c0083q1 = ((C0025w) interfaceC0092u).i(c0083q1, c0104y);
                } else if (!zIsInstance && !z) {
                    c0083q1 = interfaceC0092u.i(c0083q1, c0104y);
                }
            } catch (Throwable th) {
                i1.getLogger().s(EnumC0094u1.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC0092u.getClass().getName());
            }
            if (c0083q1 == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Event was dropped by a processor: %s", interfaceC0092u.getClass().getName());
                i1.getClientReportRecorder().b(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC0053j.Error);
                break;
            }
        }
        return c0083q1;
    }

    public io.sentry.protocol.A p(io.sentry.protocol.A a, C0104y c0104y, List list) {
        I1 i1 = (I1) this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0092u interfaceC0092u = (InterfaceC0092u) it.next();
            int size = a.D.size();
            try {
                a = interfaceC0092u.f(a, c0104y);
            } catch (Throwable th) {
                i1.getLogger().s(EnumC0094u1.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC0092u.getClass().getName());
            }
            int size2 = a == null ? 0 : a.D.size();
            if (a == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Transaction was dropped by a processor: %s", interfaceC0092u.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = i1.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.b(dVar, EnumC0053j.Transaction);
                i1.getClientReportRecorder().c(dVar, EnumC0053j.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                i1.getLogger().h(EnumC0094u1.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), interfaceC0092u.getClass().getName());
                i1.getClientReportRecorder().c(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC0053j.Span, i);
            }
        }
        return a;
    }

    public void q(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                io.sentry.android.core.G g = (io.sentry.android.core.G) this.e;
                ((Handler) g.l).post(new io.sentry.android.core.Z(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.b).getLogger().h(EnumC0094u1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public io.sentry.protocol.t r(C0088s1 c0088s1, C0104y c0104y) {
        I1 i1 = (I1) this.a;
        A1 beforeEnvelopeCallback = i1.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.n.submit(new RunnableC0059l(spotlightIntegration, 3, c0088s1));
                } catch (RejectedExecutionException e) {
                    spotlightIntegration.m.v(EnumC0094u1.WARNING, "Spotlight envelope submission rejected.", e);
                }
            } catch (Throwable th) {
                i1.getLogger().v(EnumC0094u1.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        ((io.sentry.transport.g) this.b).x(c0088s1, c0104y);
        io.sentry.protocol.t tVar = ((C0055j1) c0088s1.l).l;
        return tVar != null ? tVar : io.sentry.protocol.t.m;
    }

    public boolean s(AbstractC0037d1 abstractC0037d1, C0104y c0104y) {
        if (io.sentry.config.a.E(c0104y)) {
            return true;
        }
        ((I1) this.a).getLogger().h(EnumC0094u1.DEBUG, "Event was cached so not applying scope: %s", abstractC0037d1.l);
        return false;
    }

    public synchronized Map t(io.sentry.protocol.t tVar) {
        if (!n()) {
            return null;
        }
        Map map = (Map) ((ConcurrentHashMap) this.c).get(tVar);
        ((ConcurrentHashMap) this.c).remove(tVar);
        return map;
    }

    public L0(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.android.core.G g = new io.sentry.android.core.G(3);
        this.a = null;
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        if (io.sentry.android.core.W.b("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger()) != null) {
            this.a = new FrameMetricsAggregator();
        }
        this.b = sentryAndroidOptions;
        this.e = g;
    }

    public L0() {
        this(new io.sentry.protocol.t((UUID) null), new W1(), null, null, null);
    }

    public L0(io.sentry.protocol.t tVar, W1 w1, W1 w2, C0032c c0032c, Boolean bool) {
        this.a = tVar;
        this.b = w1;
        this.c = w2;
        this.e = c0032c;
        this.d = bool;
    }

    public L0(L0 l0) {
        C0032c c0032c;
        io.sentry.protocol.t tVar = (io.sentry.protocol.t) l0.a;
        W1 w1 = (W1) l0.b;
        W1 w2 = (W1) l0.c;
        C0032c c0032c2 = (C0032c) l0.e;
        if (c0032c2 != null) {
            c0032c = new C0032c((Map) c0032c2.c, (String) c0032c2.d, c0032c2.b, (ILogger) c0032c2.e);
        } else {
            c0032c = null;
        }
        this(tVar, w1, w2, c0032c, (Boolean) l0.d);
    }
}
