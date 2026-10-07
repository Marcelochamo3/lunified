package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class I1 {
    static final EnumC0094u1 DEFAULT_DIAGNOSTIC_LEVEL = EnumC0094u1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private InterfaceC0106y1 beforeBreadcrumb;
    private InterfaceC0109z1 beforeEmitMetricCallback;
    private A1 beforeEnvelopeCallback;
    private B1 beforeSend;
    private C1 beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    io.sentry.clientreport.f clientReportRecorder;
    private H connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private D1 cron;
    private InterfaceC0052i1 dateProvider;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC0094u1 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableDefaultTagsForMetrics;
    private boolean enableExternalConfiguration;
    private boolean enableMetrics;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpanLocalMetricAggregation;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private I envelopeReader;
    private String environment;
    private final List<InterfaceC0092u> eventProcessors;
    private T executorService;
    private final C0095v experimental;
    private long flushTimeoutMillis;
    private final C0101x fullyDisplayedReporter;
    private final List<io.sentry.android.core.internal.gestures.a> gestureTargetLocators;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private Z instrumenter;
    private final List<InterfaceC0002a0> integrations;
    private ILogger logger;
    private io.sentry.util.thread.a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private G1 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<S> observers;
    private final List<M> optionsObservers;
    private final List<N> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private E1 profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private F1 proxy;
    private int readTimeoutMillis;
    private String release;
    private N0 replayController;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private U serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private H1 tracesSampler;
    private h2 transactionPerformanceCollector;
    private X transactionProfiler;
    private Y transportFactory;
    private io.sentry.transport.h transportGate;
    private final List<Object> viewHierarchyExporters;

    public I1(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = A0.l;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C0086s(new C0087s0(this));
        this.serializer = new C0087s0(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = E0.l;
        this.transportGate = io.sentry.transport.d.m;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C0105y0.p;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.i.l;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = G1.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C0105y0.s;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C0088s1(this, 6);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = Z.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = io.sentry.util.thread.c.l;
        this.traceOptionsRequests = true;
        this.dateProvider = new C0072p0(3, false);
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = C0105y0.r;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C0101x.b;
        this.connectionStatusProvider = new C0102x0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.backpressureMonitor = io.sentry.backpressure.c.l;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.enableMetrics = false;
        this.enableDefaultTagsForMetrics = true;
        this.enableSpanLocalMetricAggregation = true;
        this.profilingTracesHz = 101;
        this.cron = null;
        C0095v c0095v = new C0095v();
        M1 m1 = new M1();
        m1.c = true;
        m1.d = true;
        m1.e = new CopyOnWriteArraySet();
        m1.f = L1.MEDIUM;
        m1.g = 1;
        m1.h = 30000L;
        m1.i = 5000L;
        m1.j = 3600000L;
        c0095v.a = m1;
        this.experimental = c0095v;
        this.replayController = C0105y0.f156o;
        this.enableScreenTracking = true;
        if (z) {
            return;
        }
        this.executorService = new C0072p0(5, false);
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new C0090t0(this));
        copyOnWriteArrayList.add(new C0056k(this, 1));
        if (!io.sentry.util.d.a) {
            copyOnWriteArrayList.add(new C0056k());
        }
        setSentryClientName("sentry.java/7.12.0");
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "7.12.0");
        rVar.m = "7.12.0";
        setSdkVersion(rVar);
        C0088s1.j().f("maven:io.sentry:sentry");
    }

    public static I1 empty() {
        return new I1(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC0092u interfaceC0092u) {
        this.eventProcessors.add(interfaceC0092u);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC0002a0 interfaceC0002a0) {
        this.integrations.add(interfaceC0002a0);
    }

    public void addOptionsObserver(M m) {
        this.optionsObservers.add(m);
    }

    public void addPerformanceCollector(N n) {
        this.performanceCollectors.add(n);
    }

    public void addScopeObserver(S s) {
        this.observers.add(s);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC0106y1 getBeforeBreadcrumb() {
        return null;
    }

    public InterfaceC0109z1 getBeforeEmitMetricCallback() {
        return null;
    }

    public A1 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public B1 getBeforeSend() {
        return this.beforeSend;
    }

    public C1 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public H getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public D1 getCron() {
        return this.cron;
    }

    public InterfaceC0052i1 getDateProvider() {
        return this.dateProvider;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC0094u1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public I getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC0092u> getEventProcessors() {
        return this.eventProcessors;
    }

    public T getExecutorService() {
        return this.executorService;
    }

    public C0095v getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C0101x getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.android.core.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public Z getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC0002a0> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public io.sentry.util.thread.a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public G1 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public List<M> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<N> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public E1 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public F1 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public N0 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<S> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public U getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public H1 getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public h2 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public X getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public Y getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableDefaultTagsForMetrics() {
        return isEnableMetrics() && this.enableDefaultTagsForMetrics;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpanLocalMetricAggregation() {
        return isEnableMetrics() && this.enableSpanLocalMetricAggregation;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void merge(C0098w c0098w) {
        String str = c0098w.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c0098w.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c0098w.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c0098w.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c0098w.e;
        if (str5 != null) {
            setServerName(str5);
        }
        F1 f1 = c0098w.m;
        if (f1 != null) {
            setProxy(f1);
        }
        Boolean bool = c0098w.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c0098w.u;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Boolean bool3 = c0098w.i;
        if (bool3 != null) {
            setEnableTracing(bool3);
        }
        Double d = c0098w.j;
        if (d != null) {
            setTracesSampleRate(d);
        }
        Double d2 = c0098w.k;
        if (d2 != null) {
            setProfilesSampleRate(d2);
        }
        Boolean bool4 = c0098w.g;
        if (bool4 != null) {
            setDebug(bool4.booleanValue());
        }
        Boolean bool5 = c0098w.h;
        if (bool5 != null) {
            setEnableDeduplication(bool5.booleanValue());
        }
        Boolean bool6 = c0098w.v;
        if (bool6 != null) {
            setSendClientReports(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c0098w.l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c0098w.f154o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c0098w.n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c0098w.t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c0098w.p != null) {
            setTracePropagationTargets(new ArrayList(c0098w.p));
        }
        Iterator it4 = new ArrayList(c0098w.q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c0098w.r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = c0098w.s;
        if (l != null) {
            setIdleTimeout(l);
        }
        Iterator it5 = c0098w.w.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c0098w.x;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c0098w.y;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c0098w.A;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c0098w.z != null) {
            setIgnoredCheckIns(new ArrayList(c0098w.z));
        }
        Boolean bool10 = c0098w.B;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        if (c0098w.C != null) {
            if (getCron() == null) {
                setCron(c0098w.C);
                return;
            }
            if (c0098w.C.a != null) {
                getCron().a = c0098w.C.a;
            }
            if (c0098w.C.b != null) {
                getCron().b = c0098w.C.b;
            }
            if (c0098w.C.c != null) {
                getCron().c = c0098w.C.c;
            }
            if (c0098w.C.d != null) {
                getCron().d = c0098w.C.d;
            }
            if (c0098w.C.e != null) {
                getCron().e = c0098w.C.e;
            }
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(InterfaceC0106y1 interfaceC0106y1) {
    }

    public void setBeforeEmitMetricCallback(InterfaceC0109z1 interfaceC0109z1) {
    }

    public void setBeforeEnvelopeCallback(A1 a1) {
        this.beforeEnvelopeCallback = a1;
    }

    public void setBeforeSend(B1 b1) {
        this.beforeSend = b1;
    }

    public void setBeforeSendTransaction(C1 c1) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(H h) {
        this.connectionStatusProvider = h;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setCron(D1 d1) {
        this.cron = d1;
    }

    public void setDateProvider(InterfaceC0052i1 interfaceC0052i1) {
        this.dateProvider = interfaceC0052i1;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDiagnosticLevel(EnumC0094u1 enumC0094u1) {
        if (enumC0094u1 == null) {
            enumC0094u1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC0094u1;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        ILogger iLogger = this.logger;
        Charset charset = io.sentry.util.e.a;
        String string = null;
        if (str != null && !str.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(io.sentry.util.e.a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                iLogger.v(EnumC0094u1.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                iLogger.h(EnumC0094u1.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableDefaultTagsForMetrics(boolean z) {
        this.enableDefaultTagsForMetrics = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableMetrics(boolean z) {
        this.enableMetrics = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpanLocalMetricAggregation(boolean z) {
        this.enableSpanLocalMetricAggregation = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.l;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(I i) {
        if (i == null) {
            i = C0105y0.m;
        }
        this.envelopeReader = i;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(T t) {
        if (t != null) {
            this.executorService = t;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setGestureTargetLocators(List<io.sentry.android.core.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(Z z) {
        this.instrumenter = z;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? A0.l : new C0088s1(this, iLogger);
    }

    public void setMainThreadChecker(io.sentry.util.thread.a aVar) {
        this.mainThreadChecker = aVar;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(G1 g1) {
        this.maxRequestBodySize = g1;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.config.a.x(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(E1 e1) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(F1 f1) {
        this.proxy = f1;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(N0 n0) {
        if (n0 == null) {
            n0 = C0105y0.f156o;
        }
        this.replayController = n0;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.config.a.x(d, true)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C0088s1(this, 6);
        } else {
            this.clientReportRecorder = new io.sentry.hints.i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(U u) {
        if (u == null) {
            u = C0105y0.q;
        }
        this.serializer = u;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    @Deprecated
    public void setShutdownTimeout(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (io.sentry.config.a.x(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(H1 h1) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(h2 h2Var) {
        this.transactionPerformanceCollector = h2Var;
    }

    public void setTransactionProfiler(X x) {
        if (this.transactionProfiler != C0105y0.s || x == null) {
            return;
        }
        this.transactionProfiler = x;
    }

    public void setTransportFactory(Y y) {
        if (y == null) {
            y = E0.l;
        }
        this.transportFactory = y;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.d.m;
        }
        this.transportGate = hVar;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
