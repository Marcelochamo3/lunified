package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC0031b1;
import io.sentry.C0041f;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C0633Nm;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final long a = SystemClock.uptimeMillis();

    public static void a(I1 i1, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC0002a0 interfaceC0002a0 : i1.getIntegrations()) {
            if (z && (interfaceC0002a0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC0002a0);
            }
            if (z2 && (interfaceC0002a0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC0002a0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                i1.getIntegrations().remove((InterfaceC0002a0) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                i1.getIntegrations().remove((InterfaceC0002a0) arrayList.get(i2));
            }
        }
    }

    public static void b(Context context, C0633Nm c0633Nm) {
        W w = new W();
        synchronized (a0.class) {
            try {
                try {
                    try {
                        AbstractC0031b1.e(new C0072p0(1, false), new C0011h(w, context, c0633Nm));
                        io.sentry.K kD = AbstractC0031b1.d();
                        try {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (runningAppProcessInfo.importance == 100) {
                                if (kD.t().isEnableAutoSessionTracking()) {
                                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                    kD.m(new C0008e(2, atomicBoolean));
                                    if (!atomicBoolean.get()) {
                                        C0041f c0041f = new C0041f();
                                        c0041f.n = "session";
                                        c0041f.b("session.start", "state");
                                        c0041f.p = "app.lifecycle";
                                        c0041f.q = EnumC0094u1.INFO;
                                        kD.f(c0041f);
                                        kD.i();
                                    }
                                }
                                kD.t().getReplayController().start();
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (IllegalAccessException e) {
                        w.v(EnumC0094u1.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                    } catch (InvocationTargetException e2) {
                        w.v(EnumC0094u1.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                        throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                    }
                } catch (InstantiationException e3) {
                    w.v(EnumC0094u1.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
                } catch (NoSuchMethodException e4) {
                    w.v(EnumC0094u1.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
