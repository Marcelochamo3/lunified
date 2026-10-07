package io.sentry;

import io.sentry.android.core.C0011h;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: io.sentry.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0031b1 {
    public static final ThreadLocal a = new ThreadLocal();
    public static volatile K b = C0108z0.b;
    public static volatile boolean c = false;
    public static final Charset d = Charset.forName("UTF-8");
    public static final long e = System.currentTimeMillis();

    public static io.sentry.protocol.t a(Throwable th) {
        return d().n(th);
    }

    public static void b(String str) {
        d().p(str);
    }

    public static synchronized void c() {
        K kD = d();
        b = C0108z0.b;
        a.remove();
        kD.d(false);
    }

    public static K d() {
        if (c) {
            return b;
        }
        ThreadLocal threadLocal = a;
        K k = (K) threadLocal.get();
        if (k != null && !(k instanceof C0108z0)) {
            return k;
        }
        K kClone = b.clone();
        threadLocal.set(kClone);
        return kClone;
    }

    public static void e(C0072p0 c0072p0, C0011h c0011h) {
        final int i = 1;
        final int i2 = 0;
        final I1 i1 = (I1) ((Class) c0072p0.l).getDeclaredConstructor(null).newInstance(null);
        try {
            c0011h.c(i1);
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        synchronized (AbstractC0031b1.class) {
            try {
                if (g()) {
                    i1.getLogger().h(EnumC0094u1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (f(i1)) {
                    i1.getLogger().h(EnumC0094u1.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    c = true;
                    K kD = d();
                    if (i1.getDsn() == null || i1.getDsn().isEmpty()) {
                        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                    }
                    b = new D(i1, new io.sentry.internal.debugmeta.c(i1.getLogger(), new Z1(i1, new L0(i1), new T0(i1))));
                    a.set(b);
                    kD.d(true);
                    if (i1.getExecutorService().d()) {
                        i1.setExecutorService(new C0072p0(5, false));
                    }
                    Iterator<InterfaceC0002a0> it = i1.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().l(i1);
                    }
                    try {
                        i1.getExecutorService().submit(new Runnable() { // from class: io.sentry.Y0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        I1 i3 = i1;
                                        String cacheDirPathWithoutDsn = i3.getCacheDirPathWithoutDsn();
                                        if (cacheDirPathWithoutDsn != null) {
                                            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                                            try {
                                                io.sentry.config.a.c(file);
                                                if (i3.isEnableAppStartProfiling()) {
                                                    if (!i3.isTracingEnabled()) {
                                                        i3.getLogger().h(EnumC0094u1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                                        return;
                                                    }
                                                    if (file.createNewFile()) {
                                                        C0034c1 c0034c1 = new C0034c1(i3, new C0088s1(i3, 5).o(new C0072p0(new f2("app.launch", io.sentry.protocol.C.CUSTOM, "profile", null))));
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                        try {
                                                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC0031b1.d));
                                                            try {
                                                                i3.getSerializer().z(c0034c1, bufferedWriter);
                                                                bufferedWriter.close();
                                                                fileOutputStream.close();
                                                                return;
                                                            } catch (Throwable th2) {
                                                                try {
                                                                    bufferedWriter.close();
                                                                    break;
                                                                } catch (Throwable th3) {
                                                                    th2.addSuppressed(th3);
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th4) {
                                                            try {
                                                                fileOutputStream.close();
                                                                break;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                            }
                                                            throw th4;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th6) {
                                                i3.getLogger().v(EnumC0094u1.ERROR, "Unable to create app start profiling config file. ", th6);
                                                return;
                                            }
                                        }
                                        return;
                                    default:
                                        I1 i4 = i1;
                                        for (M m : i4.getOptionsObservers()) {
                                            String release = i4.getRelease();
                                            io.sentry.cache.e eVar = (io.sentry.cache.e) m;
                                            if (release == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "release.json");
                                            } else {
                                                eVar.b(release, "release.json");
                                            }
                                            String proguardUuid = i4.getProguardUuid();
                                            if (proguardUuid == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "proguard-uuid.json");
                                            } else {
                                                eVar.b(proguardUuid, "proguard-uuid.json");
                                            }
                                            io.sentry.protocol.r sdkVersion = i4.getSdkVersion();
                                            if (sdkVersion == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "sdk-version.json");
                                            } else {
                                                eVar.b(sdkVersion, "sdk-version.json");
                                            }
                                            String dist = i4.getDist();
                                            if (dist == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "dist.json");
                                            } else {
                                                eVar.b(dist, "dist.json");
                                            }
                                            String environment = i4.getEnvironment();
                                            if (environment == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "environment.json");
                                            } else {
                                                eVar.b(environment, "environment.json");
                                            }
                                            eVar.b(i4.getTags(), "tags.json");
                                        }
                                        return;
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to notify options observers.", th2);
                    }
                    try {
                        i1.getExecutorService().submit(new I0(i1));
                    } catch (Throwable th3) {
                        i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to finalize previous session.", th3);
                    }
                    try {
                        i1.getExecutorService().submit(new Runnable() { // from class: io.sentry.Y0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        I1 i3 = i1;
                                        String cacheDirPathWithoutDsn = i3.getCacheDirPathWithoutDsn();
                                        if (cacheDirPathWithoutDsn != null) {
                                            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                                            try {
                                                io.sentry.config.a.c(file);
                                                if (i3.isEnableAppStartProfiling()) {
                                                    if (!i3.isTracingEnabled()) {
                                                        i3.getLogger().h(EnumC0094u1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                                        return;
                                                    }
                                                    if (file.createNewFile()) {
                                                        C0034c1 c0034c1 = new C0034c1(i3, new C0088s1(i3, 5).o(new C0072p0(new f2("app.launch", io.sentry.protocol.C.CUSTOM, "profile", null))));
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                        try {
                                                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC0031b1.d));
                                                            try {
                                                                i3.getSerializer().z(c0034c1, bufferedWriter);
                                                                bufferedWriter.close();
                                                                fileOutputStream.close();
                                                                return;
                                                            } catch (Throwable th4) {
                                                                try {
                                                                    bufferedWriter.close();
                                                                    break;
                                                                } catch (Throwable th5) {
                                                                    th4.addSuppressed(th5);
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (Throwable th6) {
                                                            try {
                                                                fileOutputStream.close();
                                                                break;
                                                            } catch (Throwable th7) {
                                                                th6.addSuppressed(th7);
                                                            }
                                                            throw th6;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th8) {
                                                i3.getLogger().v(EnumC0094u1.ERROR, "Unable to create app start profiling config file. ", th8);
                                                return;
                                            }
                                        }
                                        return;
                                    default:
                                        I1 i4 = i1;
                                        for (M m : i4.getOptionsObservers()) {
                                            String release = i4.getRelease();
                                            io.sentry.cache.e eVar = (io.sentry.cache.e) m;
                                            if (release == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "release.json");
                                            } else {
                                                eVar.b(release, "release.json");
                                            }
                                            String proguardUuid = i4.getProguardUuid();
                                            if (proguardUuid == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "proguard-uuid.json");
                                            } else {
                                                eVar.b(proguardUuid, "proguard-uuid.json");
                                            }
                                            io.sentry.protocol.r sdkVersion = i4.getSdkVersion();
                                            if (sdkVersion == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "sdk-version.json");
                                            } else {
                                                eVar.b(sdkVersion, "sdk-version.json");
                                            }
                                            String dist = i4.getDist();
                                            if (dist == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "dist.json");
                                            } else {
                                                eVar.b(dist, "dist.json");
                                            }
                                            String environment = i4.getEnvironment();
                                            if (environment == null) {
                                                io.sentry.cache.a.a(eVar.a, ".options-cache", "environment.json");
                                            } else {
                                                eVar.b(environment, "environment.json");
                                            }
                                            eVar.b(i4.getTags(), "tags.json");
                                        }
                                        return;
                                }
                            }
                        });
                    } catch (Throwable th4) {
                        i1.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th4);
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public static boolean f(I1 i1) {
        io.sentry.cache.d cVar;
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Properties propertiesE;
        Properties propertiesE2;
        int i = 11;
        int i2 = 0;
        if (i1.isEnableExternalConfiguration()) {
            C0105y0 c0105y0 = new C0105y0(i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesE2 = new io.sentry.internal.debugmeta.c(property, 6, c0105y0).e()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesE2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesE = new io.sentry.internal.debugmeta.c(str, 6, c0105y0).e()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesE));
            }
            ClassLoader classLoader = io.sentry.config.a.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Long lValueOf5 = null;
            try {
                InputStream resourceAsStream = classLoader.getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e2) {
                c0105y0.s(EnumC0094u1.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
                properties = null;
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.e(properties));
            }
            Properties propertiesE3 = new io.sentry.internal.debugmeta.c("sentry.properties", 6, c0105y0).e();
            if (propertiesE3 != null) {
                arrayList.add(new io.sentry.config.e(propertiesE3));
            }
            io.sentry.config.b bVar = new io.sentry.config.b(arrayList);
            ILogger logger = i1.getLogger();
            C0098w c0098w = new C0098w();
            c0098w.a = bVar.a("dsn");
            c0098w.b = bVar.a("environment");
            c0098w.c = bVar.a("release");
            c0098w.d = bVar.a("dist");
            c0098w.e = bVar.a("servername");
            c0098w.f = bVar.c("uncaught.handler.enabled");
            c0098w.u = bVar.c("uncaught.handler.print-stacktrace");
            c0098w.i = bVar.c("enable-tracing");
            String strA = bVar.a("traces-sample-rate");
            if (strA != null) {
                try {
                    dValueOf = Double.valueOf(strA);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            c0098w.j = dValueOf;
            String strA2 = bVar.a("profiles-sample-rate");
            if (strA2 != null) {
                try {
                    dValueOf2 = Double.valueOf(strA2);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            c0098w.k = dValueOf2;
            c0098w.g = bVar.c("debug");
            c0098w.h = bVar.c("enable-deduplication");
            c0098w.v = bVar.c("send-client-reports");
            String strA3 = bVar.a("max-request-body-size");
            if (strA3 != null) {
                G1.valueOf(strA3.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) bVar.b()).entrySet()) {
                c0098w.l.put((String) entry.getKey(), (String) entry.getValue());
            }
            String strA4 = bVar.a("proxy.host");
            String strA5 = bVar.a("proxy.user");
            String strA6 = bVar.a("proxy.pass");
            String strD = bVar.d();
            if (strA4 != null) {
                F1 f1 = new F1();
                f1.a = strA4;
                f1.b = strD;
                f1.e = null;
                f1.c = strA5;
                f1.d = strA6;
                c0098w.m = f1;
            }
            Iterator it = AbstractC0035d.a(bVar, "in-app-includes").iterator();
            while (it.hasNext()) {
                c0098w.f154o.add((String) it.next());
            }
            Iterator it2 = AbstractC0035d.a(bVar, "in-app-excludes").iterator();
            while (it2.hasNext()) {
                c0098w.n.add((String) it2.next());
            }
            List<String> listA = bVar.a("trace-propagation-targets") != null ? AbstractC0035d.a(bVar, "trace-propagation-targets") : null;
            if (listA == null && bVar.a("tracing-origins") != null) {
                listA = AbstractC0035d.a(bVar, "tracing-origins");
            }
            if (listA != null) {
                for (String str2 : listA) {
                    if (c0098w.p == null) {
                        c0098w.p = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        c0098w.p.add(str2);
                    }
                }
            }
            Iterator it3 = AbstractC0035d.a(bVar, "context-tags").iterator();
            while (it3.hasNext()) {
                c0098w.q.add((String) it3.next());
            }
            c0098w.r = bVar.a("proguard-uuid");
            Iterator it4 = AbstractC0035d.a(bVar, "bundle-ids").iterator();
            while (it4.hasNext()) {
                c0098w.w.add((String) it4.next());
            }
            String strA7 = bVar.a("idle-timeout");
            if (strA7 != null) {
                try {
                    lValueOf = Long.valueOf(strA7);
                } catch (NumberFormatException unused3) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            c0098w.s = lValueOf;
            c0098w.x = bVar.c("enabled");
            c0098w.y = bVar.c("enable-pretty-serialization-output");
            c0098w.A = bVar.c("send-modules");
            c0098w.z = AbstractC0035d.a(bVar, "ignored-checkins");
            c0098w.B = bVar.c("enable-backpressure-handling");
            for (String str3 : AbstractC0035d.a(bVar, "ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        c0098w.t.add(cls);
                    } else {
                        logger.h(EnumC0094u1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.h(EnumC0094u1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            String strA8 = bVar.a("cron.default-checkin-margin");
            if (strA8 != null) {
                try {
                    lValueOf2 = Long.valueOf(strA8);
                } catch (NumberFormatException unused5) {
                    lValueOf2 = null;
                }
            } else {
                lValueOf2 = null;
            }
            String strA9 = bVar.a("cron.default-max-runtime");
            if (strA9 != null) {
                try {
                    lValueOf3 = Long.valueOf(strA9);
                } catch (NumberFormatException unused6) {
                    lValueOf3 = null;
                }
            } else {
                lValueOf3 = null;
            }
            String strA10 = bVar.a("cron.default-timezone");
            String strA11 = bVar.a("cron.default-failure-issue-threshold");
            if (strA11 != null) {
                try {
                    lValueOf4 = Long.valueOf(strA11);
                } catch (NumberFormatException unused7) {
                    lValueOf4 = null;
                }
            } else {
                lValueOf4 = null;
            }
            String strA12 = bVar.a("cron.default-recovery-threshold");
            if (strA12 != null) {
                try {
                    lValueOf5 = Long.valueOf(strA12);
                } catch (NumberFormatException unused8) {
                }
            }
            if (lValueOf2 != null || lValueOf3 != null || strA10 != null || lValueOf4 != null || lValueOf5 != null) {
                D1 d1 = new D1();
                d1.a = lValueOf2;
                d1.b = lValueOf3;
                d1.c = strA10;
                d1.d = lValueOf4;
                d1.e = lValueOf5;
                c0098w.C = d1;
            }
            i1.merge(c0098w);
        }
        String dsn = i1.getDsn();
        if (!i1.isEnabled() || (dsn != null && dsn.isEmpty())) {
            c();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        new r(dsn);
        ILogger logger2 = i1.getLogger();
        if (i1.isDebug() && (logger2 instanceof A0)) {
            i1.setLogger(new C0105y0(i));
            logger2 = i1.getLogger();
        }
        EnumC0094u1 enumC0094u1 = EnumC0094u1.INFO;
        logger2.h(enumC0094u1, "Initializing SDK with DSN: '%s'", i1.getDsn());
        String outboxPath = i1.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger2.h(enumC0094u1, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = i1.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (i1.getEnvelopeDiskCache() instanceof io.sentry.transport.i) {
                Charset charset = io.sentry.cache.c.r;
                String cacheDirPath2 = i1.getCacheDirPath();
                int maxCacheItems = i1.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    i1.getLogger().h(EnumC0094u1.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    cVar = io.sentry.transport.i.l;
                } else {
                    cVar = new io.sentry.cache.c(i1, cacheDirPath2, maxCacheItems);
                }
                i1.setEnvelopeDiskCache(cVar);
            }
        }
        String profilingTracesDirPath = i1.getProfilingTracesDirPath();
        if (i1.isProfilingEnabled() && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                i1.getExecutorService().submit(new Z0(file, i2));
            } catch (RejectedExecutionException e3) {
                i1.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e3);
            }
        }
        io.sentry.internal.modules.a modulesLoader = i1.getModulesLoader();
        if (!i1.isSendModules()) {
            i1.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            i1.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(i1.getLogger()), new io.sentry.internal.modules.f(i1.getLogger())), i1.getLogger(), 2));
        }
        if (i1.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            i1.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(i1.getLogger()));
        }
        List listA2 = i1.getDebugMetaLoader().a();
        if (listA2 != null) {
            if (i1.getBundleIds().isEmpty()) {
                Iterator it5 = listA2.iterator();
                while (it5.hasNext()) {
                    String property2 = ((Properties) it5.next()).getProperty("io.sentry.bundle-ids");
                    i1.getLogger().h(EnumC0094u1.DEBUG, "Bundle IDs found: %s", property2);
                    if (property2 != null) {
                        for (String str4 : property2.split(",", -1)) {
                            i1.addBundleId(str4);
                        }
                    }
                }
            }
            if (i1.getProguardUuid() == null) {
                Iterator it6 = listA2.iterator();
                while (it6.hasNext()) {
                    String property3 = ((Properties) it6.next()).getProperty("io.sentry.ProguardUuids");
                    if (property3 != null) {
                        i1.getLogger().h(EnumC0094u1.DEBUG, "Proguard UUID found: %s", property3);
                        i1.setProguardUuid(property3);
                        break;
                    }
                }
            }
        }
        if (i1.getMainThreadChecker() instanceof io.sentry.util.thread.c) {
            i1.setMainThreadChecker(io.sentry.util.thread.b.m);
        }
        if (i1.getPerformanceCollectors().isEmpty()) {
            i1.addPerformanceCollector(new C0030b0());
        }
        if (i1.isEnableBackpressureHandling() && (!io.sentry.util.d.a)) {
            i1.setBackpressureMonitor(new io.sentry.backpressure.a(i1));
            i1.getBackpressureMonitor().start();
        }
        return true;
    }

    public static boolean g() {
        return d().isEnabled();
    }

    public static void h(U0 u0) {
        d().v(u0);
    }
}
