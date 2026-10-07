package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import io.sentry.C0088s1;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0003a1;
import io.sentry.L0;
import io.sentry.M1;
import io.sentry.S0;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.android.core.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0011h implements S0, InterfaceC0003a1 {
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C0011h(Object obj, Object obj2, Object obj3) {
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // io.sentry.S0
    public void b(io.sentry.W w) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.l;
        io.sentry.W w2 = (io.sentry.W) this.n;
        if (w == null) {
            activityLifecycleIntegration.getClass();
            ((io.sentry.Q) this.m).o(w2);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f57o;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", w2.getName());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v14, types: [double] */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // io.sentry.InterfaceC0003a1
    public void c(I1 i1) {
        ?? r18;
        ?? r23;
        boolean z;
        ?? r24;
        ?? r19;
        boolean z2;
        boolean z3;
        Boolean boolValueOf;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) i1;
        boolean zA = W.a("timber.log.Timber", sentryAndroidOptions);
        boolean z4 = W.a("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && W.a("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions);
        boolean z5 = zA && W.a("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zA2 = W.a("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        ILogger iLogger = (ILogger) this.l;
        G g = new G(iLogger);
        W w = new W();
        L0 l0 = new L0(sentryAndroidOptions);
        Context context = (Context) this.m;
        io.sentry.config.a.C(context, "The context is required.");
        Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setDateProvider(new G(4));
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.m(applicationContext, iLogger, g));
        try {
            sentryAndroidOptions.getLogger();
            Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128)).metaData;
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                if (bundle != null) {
                    sentryAndroidOptions.setDebug(AbstractC0024v.h(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                    if (sentryAndroidOptions.isDebug()) {
                        String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                        Locale locale = Locale.ROOT;
                        String strL = AbstractC0024v.l(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                        if (strL != null) {
                            sentryAndroidOptions.setDiagnosticLevel(EnumC0094u1.valueOf(strL.toUpperCase(locale)));
                        }
                    }
                    sentryAndroidOptions.setAnrEnabled(AbstractC0024v.h(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                    sentryAndroidOptions.setEnableAutoSessionTracking(AbstractC0024v.h(bundle, logger, "io.sentry.auto-session-tracking.enable", AbstractC0024v.h(bundle, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                    if (sentryAndroidOptions.getSampleRate() == null) {
                        Double dI = AbstractC0024v.i(bundle, logger, "io.sentry.sample-rate");
                        zA2 = dI.doubleValue();
                        if (zA2 != -1.0d) {
                            sentryAndroidOptions.setSampleRate(dI);
                        }
                    }
                    sentryAndroidOptions.setAnrReportInDebug(AbstractC0024v.h(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                    boolean z6 = z4;
                    z = z5;
                    try {
                        sentryAndroidOptions.setAnrTimeoutIntervalMillis(AbstractC0024v.k(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                        String strL2 = AbstractC0024v.l(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                        boolean zH = AbstractC0024v.h(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                        try {
                            if (!zH || (strL2 != null && strL2.isEmpty())) {
                                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                            } else if (strL2 == null) {
                                try {
                                    sentryAndroidOptions.getLogger().h(EnumC0094u1.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                                } catch (Throwable th) {
                                    th = th;
                                    z = z;
                                    l0 = l0;
                                    zA2 = zA2;
                                    r18 = zA2;
                                    r23 = z6;
                                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to read configuration from android manifest metadata.", th);
                                    r19 = r18;
                                    r24 = r23;
                                }
                            }
                            sentryAndroidOptions.setEnabled(zH);
                            sentryAndroidOptions.setDsn(strL2);
                            sentryAndroidOptions.setEnableNdk(AbstractC0024v.h(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                            sentryAndroidOptions.setEnableScopeSync(AbstractC0024v.h(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                            sentryAndroidOptions.setRelease(AbstractC0024v.l(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                            sentryAndroidOptions.setEnvironment(AbstractC0024v.l(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                            sentryAndroidOptions.setSessionTrackingIntervalMillis(AbstractC0024v.k(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                            sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                            sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                            sentryAndroidOptions.setEnableAppComponentBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                            sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                            sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(AbstractC0024v.h(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                            sentryAndroidOptions.setEnableUncaughtExceptionHandler(AbstractC0024v.h(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                            sentryAndroidOptions.setAttachThreads(AbstractC0024v.h(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                            sentryAndroidOptions.setAttachScreenshot(AbstractC0024v.h(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                            sentryAndroidOptions.setAttachViewHierarchy(AbstractC0024v.h(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                            sentryAndroidOptions.setSendClientReports(AbstractC0024v.h(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                            sentryAndroidOptions.setCollectAdditionalContext(AbstractC0024v.h(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                            if (sentryAndroidOptions.getEnableTracing() == null) {
                                if (bundle.getSerializable("io.sentry.traces.enable") != null) {
                                    boolean z7 = bundle.getBoolean("io.sentry.traces.enable", false);
                                    logger.h(EnumC0094u1.DEBUG, "%s read: %s", "io.sentry.traces.enable", Boolean.valueOf(z7));
                                    boolValueOf = Boolean.valueOf(z7);
                                } else {
                                    logger.h(EnumC0094u1.DEBUG, "%s used default %s", "io.sentry.traces.enable", null);
                                    boolValueOf = null;
                                }
                                sentryAndroidOptions.setEnableTracing(boolValueOf);
                            } else {
                                w = w;
                            }
                            if (sentryAndroidOptions.getTracesSampleRate() == null) {
                                Double dI2 = AbstractC0024v.i(bundle, logger, "io.sentry.traces.sample-rate");
                                if (dI2.doubleValue() != -1.0d) {
                                    sentryAndroidOptions.setTracesSampleRate(dI2);
                                }
                            }
                            sentryAndroidOptions.setTraceSampling(AbstractC0024v.h(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                            sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(AbstractC0024v.h(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                            sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(AbstractC0024v.h(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                            sentryAndroidOptions.setProfilingEnabled(AbstractC0024v.h(bundle, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                            if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                                Double dI3 = AbstractC0024v.i(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                                if (dI3.doubleValue() != -1.0d) {
                                    sentryAndroidOptions.setProfilesSampleRate(dI3);
                                }
                            }
                            sentryAndroidOptions.setEnableUserInteractionTracing(AbstractC0024v.h(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                            sentryAndroidOptions.setEnableTimeToFullDisplayTracing(AbstractC0024v.h(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                            long jK = AbstractC0024v.k(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                            if (jK != -1) {
                                sentryAndroidOptions.setIdleTimeout(Long.valueOf(jK));
                            }
                            List<String> listJ = AbstractC0024v.j(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                            if (!bundle.containsKey("io.sentry.traces.trace-propagation-targets") && (listJ == null || listJ.isEmpty())) {
                                listJ = AbstractC0024v.j(bundle, logger, "io.sentry.traces.tracing-origins");
                            }
                            if ((bundle.containsKey("io.sentry.traces.trace-propagation-targets") || bundle.containsKey("io.sentry.traces.tracing-origins")) && listJ == null) {
                                sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                            } else if (listJ != null) {
                                sentryAndroidOptions.setTracePropagationTargets(listJ);
                            }
                            sentryAndroidOptions.setEnableFramesTracking(AbstractC0024v.h(bundle, logger, "io.sentry.traces.frames-tracking", true));
                            sentryAndroidOptions.setProguardUuid(AbstractC0024v.l(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                            io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
                            if (sdkVersion == null) {
                                sdkVersion = new io.sentry.protocol.r("", "");
                            }
                            String string = bundle.getString("io.sentry.sdk.name", sdkVersion.l);
                            EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
                            logger.h(enumC0094u1, "%s read: %s", "io.sentry.sdk.name", string);
                            io.sentry.config.a.C(string, "name is required.");
                            sdkVersion.l = string;
                            String string2 = bundle.getString("io.sentry.sdk.version", sdkVersion.m);
                            logger.h(enumC0094u1, "%s read: %s", "io.sentry.sdk.version", string2);
                            io.sentry.config.a.C(string2, "version is required.");
                            sdkVersion.m = string2;
                            sentryAndroidOptions.setSdkVersion(sdkVersion);
                            sentryAndroidOptions.setSendDefaultPii(AbstractC0024v.h(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                            List<String> listJ2 = AbstractC0024v.j(bundle, logger, "io.sentry.gradle-plugin-integrations");
                            if (listJ2 != null) {
                                for (String str : listJ2) {
                                    C0088s1 c0088s1J = C0088s1.j();
                                    c0088s1J.getClass();
                                    io.sentry.config.a.C(str, "integration is required.");
                                    ((CopyOnWriteArraySet) c0088s1J.l).add(str);
                                }
                            }
                            sentryAndroidOptions.setEnableRootCheck(AbstractC0024v.h(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                            sentryAndroidOptions.setSendModules(AbstractC0024v.h(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                            sentryAndroidOptions.setEnablePerformanceV2(AbstractC0024v.h(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                            sentryAndroidOptions.setEnableAppStartProfiling(AbstractC0024v.h(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                            sentryAndroidOptions.setEnableScopePersistence(AbstractC0024v.h(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                            sentryAndroidOptions.setEnableMetrics(AbstractC0024v.h(bundle, logger, "io.sentry.enable-metrics", sentryAndroidOptions.isEnableMetrics()));
                            if (sentryAndroidOptions.getExperimental().a.a == null) {
                                Double dI4 = AbstractC0024v.i(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                                if (dI4.doubleValue() != -1.0d) {
                                    M1 m1 = sentryAndroidOptions.getExperimental().a;
                                    m1.getClass();
                                    if (!io.sentry.config.a.x(dI4, true)) {
                                        throw new IllegalArgumentException("The value " + dI4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                                    }
                                    m1.a = dI4;
                                }
                            }
                            if (sentryAndroidOptions.getExperimental().a.b == null) {
                                Double dI5 = AbstractC0024v.i(bundle, logger, "io.sentry.session-replay.error-sample-rate");
                                if (dI5.doubleValue() != -1.0d) {
                                    M1 m2 = sentryAndroidOptions.getExperimental().a;
                                    m2.getClass();
                                    if (!io.sentry.config.a.x(dI5, true)) {
                                        throw new IllegalArgumentException("The value " + dI5 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                                    }
                                    m2.b = dI5;
                                }
                            }
                            sentryAndroidOptions.getExperimental().a.c = AbstractC0024v.h(bundle, logger, "io.sentry.session-replay.redact-all-text", sentryAndroidOptions.getExperimental().a.c);
                            sentryAndroidOptions.getExperimental().a.d = AbstractC0024v.h(bundle, logger, "io.sentry.session-replay.redact-all-images", sentryAndroidOptions.getExperimental().a.d);
                            z2 = zA2;
                            z3 = z6;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = z;
                        l0 = l0;
                        r18 = zA2;
                        r23 = z6;
                    }
                } else {
                    l0 = l0;
                    w = w;
                    z2 = zA2;
                    z3 = z4;
                    z = z5;
                }
                sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
                r19 = z2;
                r24 = z3;
            } catch (Throwable th4) {
                th = th4;
                r23 = i1;
            }
        } catch (Throwable th5) {
            th = th5;
            l0 = l0;
            r18 = zA2;
            r23 = z4;
            z = z5;
        }
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        PackageInfo packageInfoF = AbstractC0024v.f(applicationContext, 0, sentryAndroidOptions.getLogger(), g);
        if (packageInfoF != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoF.packageName + "@" + packageInfoF.versionName + "+" + AbstractC0024v.g(packageInfoF, g));
            }
            String str2 = packageInfoF.packageName;
            if (str2 != null && !str2.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str2);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(Q.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Could not generate distinct Id.", e);
            }
        }
        L0 l1 = l0;
        W w2 = w;
        AbstractC0017n.b(context, sentryAndroidOptions, g, w, l0, r24, z, r19);
        ((InterfaceC0003a1) this.n).c(sentryAndroidOptions);
        io.sentry.android.core.performance.c cVarC = io.sentry.android.core.performance.c.c();
        if (sentryAndroidOptions.isEnablePerformanceV2() && Build.VERSION.SDK_INT >= 24) {
            io.sentry.android.core.performance.d dVar = cVarC.b;
            if (dVar.n == 0) {
                dVar.c(Process.getStartUptimeMillis());
            }
        }
        io.sentry.android.core.performance.d dVar2 = cVarC.c;
        if (dVar2.n == 0) {
            dVar2.c(a0.a);
        }
        AbstractC0017n.a(sentryAndroidOptions, context, g, w2, l1);
        a0.a(sentryAndroidOptions, r24, z);
    }
}
