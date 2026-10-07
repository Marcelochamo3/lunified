package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import io.sentry.C0056k;
import io.sentry.C0065n;
import io.sentry.C0088s1;
import io.sentry.C0102x0;
import io.sentry.EnumC0094u1;
import io.sentry.L0;
import io.sentry.X0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.e2;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017n {
    public static void a(SentryAndroidOptions sentryAndroidOptions, Context context, G g, W w, L0 l0) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C0102x0) {
            sentryAndroidOptions.setConnectionStatusProvider(new e2(context, sentryAndroidOptions.getLogger(), g));
        }
        sentryAndroidOptions.addEventProcessor(new C0056k(sentryAndroidOptions, 0));
        sentryAndroidOptions.addEventProcessor(new H(context, g, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new X(sentryAndroidOptions, l0));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, g));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C0025w(context, g, sentryAndroidOptions));
        sentryAndroidOptions.setTransportGate(new G(sentryAndroidOptions));
        synchronized (io.sentry.android.core.performance.c.c()) {
            try {
                io.sentry.X xA = io.sentry.android.core.performance.c.c().a();
                if (xA != null) {
                    sentryAndroidOptions.setTransactionProfiler(xA);
                    io.sentry.android.core.performance.c.c().d();
                } else {
                    io.sentry.android.core.internal.util.m frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.config.a.C(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setTransactionProfiler(new C0021s(context, sentryAndroidOptions, g, frameMetricsCollector));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions.getLogger(), 1));
        sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, 5, sentryAndroidOptions.getLogger()));
        boolean zA = W.a("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zA2 = W.a("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(zA));
            if (zA2 && W.a("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zA2 && W.a("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(io.sentry.android.core.internal.util.b.m);
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C0015l());
            sentryAndroidOptions.addPerformanceCollector(new C0012i(sentryAndroidOptions.getLogger(), g));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.m frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.config.a.C(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new f0(sentryAndroidOptions, frameMetricsCollector2));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C0065n(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            if (sentryAndroidOptions.isEnableScopePersistence()) {
                sentryAndroidOptions.addScopeObserver(new io.sentry.android.replay.k(1, sentryAndroidOptions));
            }
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
    }

    public static void b(Context context, SentryAndroidOptions sentryAndroidOptions, G g, W w, L0 l0, boolean z, boolean z2, boolean z3) {
        C0088s1 c0088s1 = new C0088s1(new C0016m(sentryAndroidOptions, 0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new X0(new C0016m(sentryAndroidOptions, 1), 0), c0088s1));
        sentryAndroidOptions.addIntegration(new NdkIntegration(W.b("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.a());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new X0(new C0016m(sentryAndroidOptions, 2), 1), c0088s1));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AbstractC0024v.a(context, g));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, g, l0));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, sentryAndroidOptions.getLogger(), g));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            replayIntegration.a(new io.sentry.android.replay.c());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }
}
