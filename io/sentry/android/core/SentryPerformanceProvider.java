package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C0034c1;
import io.sentry.C0072p0;
import io.sentry.C0087s0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.e2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends L {
    public static final long q = SystemClock.uptimeMillis();
    public Application m;
    public c0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W f67o;
    public final G p;

    public SentryPerformanceProvider() {
        W w = new W();
        this.f67o = w;
        this.p = new G(w);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.c cVarC = io.sentry.android.core.performance.c.c();
        Context context = getContext();
        cVarC.c.c(q);
        G g = this.p;
        g.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            if (context instanceof Application) {
                this.m = (Application) context;
            }
            if (this.m != null) {
                cVarC.b.c(Process.getStartUptimeMillis());
                c0 c0Var = new c0(this, cVarC, new AtomicBoolean(false));
                this.n = c0Var;
                this.m.registerActivityLifecycleCallbacks(c0Var);
            }
        }
        Context context2 = getContext();
        W w = this.f67o;
        if (context2 == null) {
            w.h(EnumC0094u1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C0034c1 c0034c1 = (C0034c1) new C0087s0(I1.empty()).b(bufferedReader, C0034c1.class);
                if (c0034c1 == null) {
                    w.h(EnumC0094u1.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (c0034c1.q) {
                    boolean z = c0034c1.n;
                    e2 e2Var = new e2(Boolean.valueOf(z), c0034c1.f105o, Boolean.valueOf(c0034c1.l), c0034c1.m);
                    cVarC.h = e2Var;
                    if (((Boolean) e2Var.b).booleanValue() && z) {
                        w.h(EnumC0094u1.DEBUG, "App start profiling started.", new Object[0]);
                        C0021s c0021s = new C0021s(context2.getApplicationContext(), this.p, new io.sentry.android.core.internal.util.m(context2.getApplicationContext(), w, g), w, c0034c1.p, c0034c1.q, c0034c1.r, new C0072p0(5, false));
                        cVarC.g = c0021s;
                        c0021s.start();
                    } else {
                        w.h(EnumC0094u1.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
                    }
                } else {
                    w.h(EnumC0094u1.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                }
                bufferedReader.close();
                return true;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            w.v(EnumC0094u1.ERROR, "App start profiling config file not found. ", e);
            return true;
        } catch (Throwable th3) {
            w.v(EnumC0094u1.ERROR, "Error reading app start profiling config file. ", th3);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        synchronized (io.sentry.android.core.performance.c.c()) {
            try {
                io.sentry.X x = io.sentry.android.core.performance.c.c().g;
                if (x != null) {
                    x.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
