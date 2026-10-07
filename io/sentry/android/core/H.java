package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import io.sentry.AbstractC0037d1;
import io.sentry.C0066n0;
import io.sentry.C0083q1;
import io.sentry.C0100w1;
import io.sentry.C0104y;
import io.sentry.CallableC0058k1;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0092u;
import io.sentry.K1;
import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0076c;
import io.sentry.protocol.C0079f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import o.C1672hI;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC0092u {
    public final Context l;
    public final G m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Future f60o;

    public H(Context context, G g, SentryAndroidOptions sentryAndroidOptions) {
        this.l = context;
        this.m = g;
        io.sentry.config.a.C(sentryAndroidOptions, "The options object is required.");
        this.n = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f60o = executorServiceNewSingleThreadExecutor.submit(new CallableC0058k1(context, 3, sentryAndroidOptions));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        boolean zD = d(k1, c0104y);
        if (zD) {
            b(k1, c0104y);
        }
        c(k1, false, zD);
        return k1;
    }

    public final void b(AbstractC0037d1 abstractC0037d1, C0104y c0104y) {
        Boolean bool;
        C0074a c0074a = (C0074a) abstractC0037d1.m.d("app", C0074a.class);
        if (c0074a == null) {
            c0074a = new C0074a();
        }
        SentryAndroidOptions sentryAndroidOptions = this.n;
        ILogger logger = sentryAndroidOptions.getLogger();
        Context context = this.l;
        c0074a.p = AbstractC0024v.b(context, logger);
        io.sentry.android.core.performance.d dVarB = io.sentry.android.core.performance.c.c().b(sentryAndroidOptions);
        if (dVarB.a()) {
            C0100w1 c0100w1 = dVarB.a() ? new C0100w1(dVarB.m * 1000000) : null;
            c0074a.m = c0100w1 != null ? io.sentry.config.a.k(Double.valueOf(c0100w1.l / 1000000.0d).longValue()) : null;
        }
        if (!io.sentry.config.a.v(c0104y) && c0074a.v == null && (bool = B.b.a) != null) {
            c0074a.v = Boolean.valueOf(!bool.booleanValue());
        }
        ILogger logger2 = sentryAndroidOptions.getLogger();
        G g = this.m;
        PackageInfo packageInfoF = AbstractC0024v.f(context, C1672hI.a.f, logger2, g);
        if (packageInfoF != null) {
            String strG = AbstractC0024v.g(packageInfoF, g);
            if (abstractC0037d1.w == null) {
                abstractC0037d1.w = strG;
            }
            c0074a.l = packageInfoF.packageName;
            c0074a.q = packageInfoF.versionName;
            c0074a.r = AbstractC0024v.g(packageInfoF, g);
            HashMap map = new HashMap();
            String[] strArr = packageInfoF.requestedPermissions;
            int[] iArr = packageInfoF.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c0074a.s = map;
        }
        abstractC0037d1.m.b(c0074a);
    }

    public final void c(AbstractC0037d1 abstractC0037d1, boolean z, boolean z2) {
        io.sentry.protocol.E e = abstractC0037d1.t;
        if (e == null) {
            e = new io.sentry.protocol.E();
            abstractC0037d1.t = e;
        }
        if (e.m == null) {
            e.m = Q.a(this.l);
        }
        if (e.p == null) {
            e.p = "{{auto}}";
        }
        C0076c c0076c = abstractC0037d1.m;
        C0079f c0079f = (C0079f) c0076c.d("device", C0079f.class);
        Future future = this.f60o;
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (c0079f == null) {
            try {
                c0076c.put("device", ((K) future.get()).a(z, z2));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to retrieve device info", th);
            }
            io.sentry.protocol.m mVar = (io.sentry.protocol.m) c0076c.d("os", io.sentry.protocol.m.class);
            try {
                c0076c.put("os", ((K) future.get()).f);
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to retrieve os system", th2);
            }
            if (mVar != null) {
                String str = mVar.l;
                c0076c.put((str == null || str.isEmpty()) ? "os_1" : "os_" + str.trim().toLowerCase(Locale.ROOT), mVar);
            }
        }
        try {
            F f = ((K) future.get()).e;
            if (f != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(f.b));
                String str2 = f.a;
                if (str2 != null) {
                    map.put("installerStore", str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    abstractC0037d1.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting side loaded info.", th3);
        }
    }

    public final boolean d(AbstractC0037d1 abstractC0037d1, C0104y c0104y) {
        if (io.sentry.config.a.E(c0104y)) {
            return true;
        }
        this.n.getLogger().h(EnumC0094u1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC0037d1.l);
        return false;
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        boolean zD = d(a, c0104y);
        if (zD) {
            b(a, c0104y);
        }
        c(a, false, zD);
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        io.sentry.protocol.y yVar;
        List list;
        boolean z;
        boolean zD = d(c0083q1, c0104y);
        if (zD) {
            b(c0083q1, c0104y);
            C0066n0 c0066n0 = c0083q1.D;
            if ((c0066n0 != null ? c0066n0.a : null) != null) {
                boolean zV = io.sentry.config.a.v(c0104y);
                C0066n0 c0066n1 = c0083q1.D;
                for (io.sentry.protocol.z zVar : c0066n1 != null ? c0066n1.a : null) {
                    Long l = zVar.l;
                    if (l == null) {
                        z = false;
                    } else if (Looper.getMainLooper().getThread().getId() == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zVar.q == null) {
                        zVar.q = Boolean.valueOf(z);
                    }
                    if (!zV && zVar.s == null) {
                        zVar.s = Boolean.valueOf(z);
                    }
                }
            }
        }
        c(c0083q1, true, zD);
        C0066n0 c0066n2 = c0083q1.E;
        ArrayList arrayList = c0066n2 != null ? c0066n2.a : null;
        if (arrayList != null && arrayList.size() > 1) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) arrayList.get(arrayList.size() - 1);
            if ("java.lang".equals(sVar.n) && (yVar = sVar.p) != null && (list = yVar.l) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.x) it.next()).n)) {
                        Collections.reverse(arrayList);
                        break;
                    }
                }
            }
        }
        return c0083q1;
    }
}
