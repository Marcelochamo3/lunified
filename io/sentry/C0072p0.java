package io.sentry;

import android.content.ContentProvider;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.SentryAndroidOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC1474fG;

/* JADX INFO: renamed from: io.sentry.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072p0 implements InterfaceC0052i1, T {
    public final Object l;

    public static io.sentry.protocol.s b(Throwable th, io.sentry.protocol.j jVar, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.y yVar = new io.sentry.protocol.y(list);
            if (z) {
                yVar.n = Boolean.TRUE;
            }
            sVar.p = yVar;
        }
        sVar.f134o = l;
        sVar.l = name;
        sVar.q = jVar;
        sVar.n = name2;
        sVar.m = message;
        return sVar;
    }

    public void a(ContentProvider contentProvider) {
        ((io.sentry.android.core.G) this.l).getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public ArrayList c(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.x xVar = new io.sentry.protocol.x();
                    xVar.s = e(className);
                    xVar.n = className;
                    xVar.m = stackTraceElement.getMethodName();
                    xVar.l = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        xVar.f137o = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    xVar.u = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(xVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Override // io.sentry.T
    public boolean d() {
        boolean zIsShutdown;
        synchronized (((ScheduledExecutorService) this.l)) {
            zIsShutdown = ((ScheduledExecutorService) this.l).isShutdown();
        }
        return zIsShutdown;
    }

    public Boolean e(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        I1 i1 = (I1) this.l;
        Iterator<String> it = i1.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = i1.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public void f(F0 f0, ILogger iLogger, Object obj) throws IOException {
        if (obj == null) {
            ((io.sentry.vendor.gson.stream.c) ((io.sentry.internal.debugmeta.c) f0).b).l();
            return;
        }
        if (obj instanceof Character) {
            ((io.sentry.internal.debugmeta.c) f0).m(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            ((io.sentry.internal.debugmeta.c) f0).m((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            ((io.sentry.internal.debugmeta.c) f0).n(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            ((io.sentry.internal.debugmeta.c) f0).l((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                ((io.sentry.internal.debugmeta.c) f0).m(io.sentry.config.a.r((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.v(EnumC0094u1.ERROR, "Error when serializing Date", e);
                ((io.sentry.vendor.gson.stream.c) ((io.sentry.internal.debugmeta.c) f0).b).l();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                ((io.sentry.internal.debugmeta.c) f0).m(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.v(EnumC0094u1.ERROR, "Error when serializing TimeZone", e2);
                ((io.sentry.vendor.gson.stream.c) ((io.sentry.internal.debugmeta.c) f0).b).l();
                return;
            }
        }
        if (obj instanceof InterfaceC0084r0) {
            ((InterfaceC0084r0) obj).serialize(f0, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            g(f0, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            g(f0, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            h(f0, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.a.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
            }
            g(f0, iLogger, arrayList);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            ((io.sentry.internal.debugmeta.c) f0).n(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            h(f0, iLogger, io.sentry.util.a.a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            ((io.sentry.internal.debugmeta.c) f0).m(obj.toString());
            return;
        }
        try {
            f(f0, iLogger, ((C0082q0) this.l).b(iLogger, obj));
        } catch (Exception e3) {
            iLogger.v(EnumC0094u1.ERROR, "Failed serializing unknown object.", e3);
            ((io.sentry.internal.debugmeta.c) f0).m("[OBJECT]");
        }
    }

    public void g(F0 f0, ILogger iLogger, Collection collection) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        cVar2.t();
        cVar2.a();
        int i = cVar2.n;
        int[] iArr = cVar2.m;
        if (i == iArr.length) {
            cVar2.m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar2.m;
        int i2 = cVar2.n;
        cVar2.n = i2 + 1;
        iArr2[i2] = 1;
        cVar2.l.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f(f0, iLogger, it.next());
        }
        ((io.sentry.vendor.gson.stream.c) cVar.b).f(']', 1, 2);
    }

    public void h(F0 f0, ILogger iLogger, Map map) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                cVar.f((String) obj);
                f(cVar, iLogger, map.get(obj));
            }
        }
        cVar.c();
    }

    @Override // io.sentry.T
    public void j(long j) {
        synchronized (((ScheduledExecutorService) this.l)) {
            if (!((ScheduledExecutorService) this.l).isShutdown()) {
                ((ScheduledExecutorService) this.l).shutdown();
                try {
                    if (!((ScheduledExecutorService) this.l).awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        ((ScheduledExecutorService) this.l).shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    ((ScheduledExecutorService) this.l).shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.T
    public Future submit(Runnable runnable) {
        return ((ScheduledExecutorService) this.l).submit(runnable);
    }

    @Override // io.sentry.T
    public Future u(Runnable runnable, long j) {
        return ((ScheduledExecutorService) this.l).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC0052i1
    public AbstractC0049h1 y() {
        return ((InterfaceC0052i1) this.l).y();
    }

    public C0072p0(int i, boolean z) {
        switch (i) {
            case 3:
                if ((!io.sentry.util.d.a) && io.sentry.util.d.b) {
                    this.l = new C0105y0(9);
                } else {
                    this.l = new C0105y0(10);
                }
                break;
            case 4:
            case 6:
            default:
                this.l = SentryAndroidOptions.class;
                break;
            case 5:
                this.l = Executors.newSingleThreadScheduledExecutor(new B(1));
                break;
            case 7:
                this.l = new io.sentry.android.core.G(A0.l);
                break;
            case 8:
                Looper mainLooper = Looper.getMainLooper();
                AbstractC1474fG.i(mainLooper, "getMainLooper()");
                this.l = new Handler(mainLooper);
                break;
            case 9:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (EnumC0053j enumC0053j : EnumC0053j.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), enumC0053j.getCategory()), new AtomicLong(0L));
                    }
                }
                this.l = Collections.unmodifiableMap(concurrentHashMap);
                break;
            case 10:
                this.l = new io.sentry.transport.n();
                break;
        }
    }

    public C0072p0(int i) {
        this.l = new C0082q0(i);
    }
}
