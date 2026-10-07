package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088s1 implements ILogger, io.sentry.clientreport.f {
    public static volatile C0088s1 n;
    public Object l;
    public final Object m;

    public C0088s1(I1 i1, int i) {
        switch (i) {
            case 6:
                this.m = i1;
                this.l = new C0072p0(9, false);
                break;
            default:
                io.sentry.config.a.C(i1, "options are required");
                SecureRandom secureRandom = new SecureRandom();
                this.l = i1;
                this.m = secureRandom;
                break;
        }
    }

    public static EnumC0053j g(EnumC0091t1 enumC0091t1) {
        if (EnumC0091t1.Event.equals(enumC0091t1)) {
            return EnumC0053j.Error;
        }
        if (EnumC0091t1.Session.equals(enumC0091t1)) {
            return EnumC0053j.Session;
        }
        if (EnumC0091t1.Transaction.equals(enumC0091t1)) {
            return EnumC0053j.Transaction;
        }
        if (EnumC0091t1.UserFeedback.equals(enumC0091t1)) {
            return EnumC0053j.UserReport;
        }
        if (EnumC0091t1.Profile.equals(enumC0091t1)) {
            return EnumC0053j.Profile;
        }
        if (EnumC0091t1.Statsd.equals(enumC0091t1)) {
            return EnumC0053j.MetricBucket;
        }
        if (EnumC0091t1.Attachment.equals(enumC0091t1)) {
            return EnumC0053j.Attachment;
        }
        return EnumC0091t1.CheckIn.equals(enumC0091t1) ? EnumC0053j.Monitor : EnumC0053j.Default;
    }

    public static C0088s1 j() {
        if (n == null) {
            synchronized (C0088s1.class) {
                try {
                    if (n == null) {
                        n = new C0088s1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    @Override // io.sentry.clientreport.f
    public C0088s1 a(C0088s1 c0088s1) {
        I1 i1 = (I1) this.m;
        Date dateJ = io.sentry.config.a.j();
        C0072p0 c0072p0 = (C0072p0) this.l;
        c0072p0.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) c0072p0.l).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.e(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateJ, arrayList);
        if (bVar == null) {
            return c0088s1;
        }
        try {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) c0088s1.m).iterator();
            while (it.hasNext()) {
                arrayList2.add((C0070o1) it.next());
            }
            arrayList2.add(C0070o1.a(i1.getSerializer(), bVar));
            return new C0088s1((C0055j1) c0088s1.l, arrayList2);
        } catch (Throwable th) {
            i1.getLogger().s(EnumC0094u1.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c0088s1;
        }
    }

    @Override // io.sentry.clientreport.f
    public void b(io.sentry.clientreport.d dVar, EnumC0053j enumC0053j) {
        c(dVar, enumC0053j, 1L);
    }

    @Override // io.sentry.clientreport.f
    public void c(io.sentry.clientreport.d dVar, EnumC0053j enumC0053j, long j) {
        try {
            l(dVar.getReason(), enumC0053j.getCategory(), Long.valueOf(j));
        } catch (Throwable th) {
            ((I1) this.m).getLogger().s(EnumC0094u1.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void d(io.sentry.clientreport.d dVar, C0070o1 c0070o1) {
        io.sentry.protocol.A aE;
        I1 i1 = (I1) this.m;
        if (c0070o1 == null) {
            return;
        }
        try {
            EnumC0091t1 enumC0091t1 = c0070o1.a.n;
            if (EnumC0091t1.ClientReport.equals(enumC0091t1)) {
                try {
                    m(c0070o1.c(i1.getSerializer()));
                } catch (Exception unused) {
                    i1.getLogger().h(EnumC0094u1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                EnumC0053j enumC0053jG = g(enumC0091t1);
                if (enumC0053jG.equals(EnumC0053j.Transaction) && (aE = c0070o1.e(i1.getSerializer())) != null) {
                    l(dVar.getReason(), EnumC0053j.Span.getCategory(), Long.valueOf(((long) aE.D.size()) + 1));
                }
                l(dVar.getReason(), enumC0053jG.getCategory(), 1L);
            }
        } catch (Throwable th) {
            i1.getLogger().s(EnumC0094u1.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void e(io.sentry.clientreport.d dVar, C0088s1 c0088s1) {
        if (c0088s1 == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) c0088s1.m).iterator();
            while (it.hasNext()) {
                d(dVar, (C0070o1) it.next());
            }
        } catch (Throwable th) {
            ((I1) this.m).getLogger().s(EnumC0094u1.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    public void f(String str) {
        ((CopyOnWriteArraySet) this.m).add(new io.sentry.protocol.u(str, "7.12.0"));
    }

    @Override // io.sentry.ILogger
    public void h(EnumC0094u1 enumC0094u1, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.m;
        if (iLogger == null || !n(enumC0094u1)) {
            return;
        }
        iLogger.h(enumC0094u1, str, objArr);
    }

    public ArrayList i(Map map, ArrayList arrayList, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z2 = (thread == threadCurrentThread && !z) || (arrayList != null && arrayList.contains(Long.valueOf(thread.getId())));
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.z zVar = new io.sentry.protocol.z();
            zVar.n = thread2.getName();
            zVar.m = Integer.valueOf(thread2.getPriority());
            zVar.l = Long.valueOf(thread2.getId());
            zVar.r = Boolean.valueOf(thread2.isDaemon());
            zVar.f139o = thread2.getState().name();
            zVar.p = Boolean.valueOf(z2);
            ArrayList arrayListC = ((C0072p0) this.l).c(stackTraceElementArr, false);
            if (((I1) this.m).isAttachStacktrace() && arrayListC != null && !arrayListC.isEmpty()) {
                io.sentry.protocol.y yVar = new io.sentry.protocol.y(arrayListC);
                yVar.n = Boolean.TRUE;
                zVar.t = yVar;
            }
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    public synchronized Object k() {
        try {
            if (this.l == null) {
                this.l = ((io.sentry.util.b) this.m).d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public void l(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((C0072p0) this.l).l).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void m(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (io.sentry.clientreport.e eVar : bVar.m) {
            l(eVar.l, eVar.m, eVar.n);
        }
    }

    @Override // io.sentry.ILogger
    public boolean n(EnumC0094u1 enumC0094u1) {
        I1 i1 = (I1) this.l;
        return enumC0094u1 != null && i1.isDebug() && enumC0094u1.ordinal() >= i1.getDiagnosticLevel().ordinal();
    }

    public e2 o(C0072p0 c0072p0) {
        f2 f2Var = (f2) c0072p0.l;
        e2 e2Var = f2Var.f55o;
        if (e2Var != null) {
            return e2Var;
        }
        I1 i1 = (I1) this.l;
        i1.getProfilesSampler();
        Double profilesSampleRate = i1.getProfilesSampleRate();
        SecureRandom secureRandom = (SecureRandom) this.m;
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= secureRandom.nextDouble());
        i1.getTracesSampler();
        e2 e2Var2 = f2Var.x;
        if (e2Var2 != null) {
            return e2Var2;
        }
        Double tracesSampleRate = i1.getTracesSampleRate();
        Double dValueOf = Boolean.TRUE.equals(i1.getEnableTracing()) ? Double.valueOf(1.0d) : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = dValueOf;
        }
        Double dValueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, i1.getBackpressureMonitor().a()));
        if (dValueOf2 != null) {
            return new e2(Boolean.valueOf(dValueOf2.doubleValue() >= secureRandom.nextDouble()), dValueOf2, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new e2(bool, null, bool, null);
    }

    @Override // io.sentry.ILogger
    public void s(EnumC0094u1 enumC0094u1, Throwable th, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.m;
        if (iLogger == null || !n(enumC0094u1)) {
            return;
        }
        iLogger.s(enumC0094u1, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void v(EnumC0094u1 enumC0094u1, String str, Throwable th) {
        ILogger iLogger = (ILogger) this.m;
        if (iLogger == null || !n(enumC0094u1)) {
            return;
        }
        iLogger.v(enumC0094u1, str, th);
    }

    public C0088s1(String str, HashMap map) {
        io.sentry.config.a.C(str, "url is required");
        try {
            this.l = URI.create(str).toURL();
            this.m = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public C0088s1(I1 i1, ILogger iLogger) {
        io.sentry.config.a.C(i1, "SentryOptions is required.");
        this.l = i1;
        this.m = iLogger;
    }

    public C0088s1(io.sentry.util.b bVar) {
        this.l = null;
        this.m = bVar;
    }

    public C0088s1(C0055j1 c0055j1, Collection collection) {
        io.sentry.config.a.C(c0055j1, "SentryEnvelopeHeader is required.");
        this.l = c0055j1;
        io.sentry.config.a.C(collection, "SentryEnvelope items are required.");
        this.m = collection;
    }

    public C0088s1(C0072p0 c0072p0, I1 i1) {
        this.l = c0072p0;
        io.sentry.config.a.C(i1, "The SentryOptions is required");
        this.m = i1;
    }

    public C0088s1() {
        this.l = new CopyOnWriteArraySet();
        this.m = new CopyOnWriteArraySet();
    }

    public C0088s1(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, C0070o1 c0070o1) {
        this.l = new C0055j1(tVar, rVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c0070o1);
        this.m = arrayList;
    }
}
