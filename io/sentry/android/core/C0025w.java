package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.C0038e;
import io.sentry.C0066n0;
import io.sentry.C0072p0;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0092u;
import io.sentry.K1;
import io.sentry.U1;
import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0076c;
import io.sentry.protocol.C0077d;
import io.sentry.protocol.C0079f;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.android.core.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025w implements InterfaceC0092u {
    public final Context l;
    public final SentryAndroidOptions m;
    public final G n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0072p0 f85o;

    public C0025w(Context context, G g, SentryAndroidOptions sentryAndroidOptions) {
        this.l = context;
        this.m = sentryAndroidOptions;
        this.n = g;
        this.f85o = new C0072p0(new C0072p0(sentryAndroidOptions));
    }

    public static boolean b(io.sentry.hints.b bVar) {
        if (bVar instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) bVar).d());
        }
        return false;
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        return k1;
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        return a;
    }

    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        io.sentry.protocol.z zVar;
        ArrayList arrayList;
        C0076c c0076c;
        String strA;
        String str;
        int i;
        DisplayMetrics displayMetrics;
        String strA2;
        Object objQ = io.sentry.config.a.q(c0104y);
        boolean z = objQ instanceof io.sentry.hints.b;
        int i2 = 0;
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (!z) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c0083q1;
        }
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        C0028z c0028z = (C0028z) ((io.sentry.hints.b) objQ);
        if (c0028z.p) {
            jVar.l = "AppExitInfo";
        } else {
            jVar.l = "HistoricalAppExitInfo";
        }
        io.sentry.hints.b bVar = (io.sentry.hints.b) objQ;
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(b(bVar) ? "Background ANR" : "ANR", Thread.currentThread());
        C0066n0 c0066n0 = c0083q1.D;
        ArrayList arrayList2 = c0066n0 != null ? c0066n0.a : null;
        if (arrayList2 == null) {
            zVar = null;
            break;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = (io.sentry.protocol.z) it.next();
            String str2 = zVar.n;
            if (str2 != null && str2.equals("main")) {
                break;
            }
        }
        if (zVar == null) {
            zVar = new io.sentry.protocol.z();
            zVar.t = new io.sentry.protocol.y();
        }
        this.f85o.getClass();
        io.sentry.protocol.y yVar = zVar.t;
        if (yVar == null) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(C0072p0.b(applicationNotResponding, jVar, zVar.l, yVar.l, true));
            arrayList = arrayList3;
        }
        c0083q1.E = new C0066n0(arrayList);
        if (c0083q1.s == null) {
            c0083q1.s = "java";
        }
        C0076c c0076c2 = c0083q1.m;
        io.sentry.protocol.m mVar = (io.sentry.protocol.m) c0076c2.d("os", io.sentry.protocol.m.class);
        io.sentry.protocol.m mVar2 = new io.sentry.protocol.m();
        mVar2.l = "Android";
        mVar2.m = Build.VERSION.RELEASE;
        mVar2.f129o = Build.DISPLAY;
        try {
            mVar2.p = AbstractC0024v.d(sentryAndroidOptions.getLogger());
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting OperatingSystem.", th);
        }
        c0076c2.put("os", mVar2);
        if (mVar != null) {
            String str3 = mVar.l;
            c0076c2.put((str3 == null || str3.isEmpty()) ? "os_1" : "os_" + str3.trim().toLowerCase(Locale.ROOT), mVar);
        }
        C0079f c0079f = (C0079f) c0076c2.d("device", C0079f.class);
        Context context = this.l;
        G g = this.n;
        if (c0079f == null) {
            C0079f c0079f2 = new C0079f();
            if (sentryAndroidOptions.isSendDefaultPii()) {
                c0079f2.l = Settings.Global.getString(context.getContentResolver(), "device_name");
            }
            c0079f2.m = Build.MANUFACTURER;
            c0079f2.n = Build.BRAND;
            c0079f2.f123o = AbstractC0024v.c(sentryAndroidOptions.getLogger());
            c0079f2.p = Build.MODEL;
            c0079f2.q = Build.ID;
            g.getClass();
            c0079f2.r = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoE = AbstractC0024v.e(context, sentryAndroidOptions.getLogger());
            if (memoryInfoE != null) {
                c0079f2.x = Long.valueOf(memoryInfoE.totalMem);
            }
            c0079f2.w = g.b();
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th2) {
                logger.v(EnumC0094u1.ERROR, "Error getting DisplayMetrics.", th2);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c0079f2.F = Integer.valueOf(displayMetrics.widthPixels);
                c0079f2.G = Integer.valueOf(displayMetrics.heightPixels);
                c0079f2.H = Float.valueOf(displayMetrics.density);
                c0079f2.I = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (c0079f2.L == null) {
                try {
                    strA2 = Q.a(context);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting installationId.", th3);
                    strA2 = null;
                }
                c0079f2.L = strA2;
            }
            ArrayList arrayListA = io.sentry.android.core.internal.util.c.b.a();
            if (!arrayListA.isEmpty()) {
                c0079f2.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                c0079f2.Q = Integer.valueOf(arrayListA.size());
            }
            c0076c = c0076c2;
            c0076c.put("device", c0079f2);
        } else {
            c0076c = c0076c2;
        }
        if (!c0028z.p) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c0083q1;
        }
        if (c0083q1.f108o == null) {
            c0083q1.f108o = (io.sentry.protocol.n) io.sentry.android.replay.k.h(sentryAndroidOptions, "request.json", io.sentry.protocol.n.class);
        }
        if (c0083q1.t == null) {
            c0083q1.t = (io.sentry.protocol.E) io.sentry.android.replay.k.h(sentryAndroidOptions, "user.json", io.sentry.protocol.E.class);
        }
        Map map = (Map) io.sentry.android.replay.k.h(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (c0083q1.p == null) {
                c0083q1.p = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c0083q1.p.containsKey(entry.getKey())) {
                        c0083q1.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) io.sentry.cache.a.b(sentryAndroidOptions, ".scope-cache", "breadcrumbs.json", List.class, new C0038e(i2));
        if (list != null) {
            List list2 = c0083q1.x;
            if (list2 == null) {
                c0083q1.x = new ArrayList(new ArrayList(list));
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) io.sentry.android.replay.k.h(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (c0083q1.z == null) {
                c0083q1.z = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!c0083q1.z.containsKey(entry2.getKey())) {
                        c0083q1.z.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        C0076c c0076c3 = (C0076c) io.sentry.android.replay.k.h(sentryAndroidOptions, "contexts.json", C0076c.class);
        if (c0076c3 != null) {
            Iterator it2 = new C0076c(c0076c3).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                Object value = entry3.getValue();
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof U1)) && !c0076c.containsKey(entry3.getKey())) {
                    c0076c.put((String) entry3.getKey(), value);
                }
            }
        }
        String str4 = (String) io.sentry.android.replay.k.h(sentryAndroidOptions, "transaction.json", String.class);
        if (c0083q1.G == null) {
            c0083q1.G = str4;
        }
        List list3 = (List) io.sentry.android.replay.k.h(sentryAndroidOptions, "fingerprint.json", List.class);
        if (c0083q1.H == null) {
            c0083q1.H = list3 != null ? new ArrayList(list3) : null;
        }
        boolean zB = b(bVar);
        if (c0083q1.H == null) {
            List listAsList = Arrays.asList("{{ default }}", zB ? "background-anr" : "foreground-anr");
            c0083q1.H = listAsList != null ? new ArrayList(listAsList) : null;
        }
        EnumC0094u1 enumC0094u1 = (EnumC0094u1) io.sentry.android.replay.k.h(sentryAndroidOptions, "level.json", EnumC0094u1.class);
        if (c0083q1.F == null) {
            c0083q1.F = enumC0094u1;
        }
        U1 u1 = (U1) io.sentry.android.replay.k.h(sentryAndroidOptions, "trace.json", U1.class);
        if (c0076c.a() == null && u1 != null && u1.m != null && u1.l != null) {
            c0076c.c(u1);
        }
        if (c0083q1.q == null) {
            c0083q1.q = (String) io.sentry.cache.e.a(sentryAndroidOptions, "release.json", String.class);
        }
        if (c0083q1.r == null) {
            String environment = (String) io.sentry.cache.e.a(sentryAndroidOptions, "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            c0083q1.r = environment;
        }
        if (c0083q1.w == null) {
            c0083q1.w = (String) io.sentry.cache.e.a(sentryAndroidOptions, "dist.json", String.class);
        }
        if (c0083q1.w == null && (str = (String) io.sentry.cache.e.a(sentryAndroidOptions, "release.json", String.class)) != null) {
            try {
                i = 1;
                try {
                    c0083q1.w = str.substring(str.indexOf(43) + 1);
                } catch (Throwable unused) {
                    ILogger logger2 = sentryAndroidOptions.getLogger();
                    EnumC0094u1 enumC0094u2 = EnumC0094u1.WARNING;
                    Object[] objArr = new Object[i];
                    objArr[0] = str;
                    logger2.h(enumC0094u2, "Failed to parse release from scope cache: %s", objArr);
                }
            } catch (Throwable unused2) {
                i = 1;
            }
        }
        C0077d c0077d = c0083q1.y;
        if (c0077d == null) {
            c0077d = new C0077d();
        }
        if (c0077d.m == null) {
            c0077d.m = new ArrayList(new ArrayList());
        }
        List list4 = c0077d.m;
        if (list4 != null) {
            String str5 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "proguard-uuid.json", String.class);
            if (str5 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str5);
                list4.add(debugImage);
            }
            c0083q1.y = c0077d;
        }
        if (c0083q1.n == null) {
            c0083q1.n = (io.sentry.protocol.r) io.sentry.cache.e.a(sentryAndroidOptions, "sdk-version.json", io.sentry.protocol.r.class);
        }
        C0074a c0074a = (C0074a) c0076c.d("app", C0074a.class);
        if (c0074a == null) {
            c0074a = new C0074a();
        }
        c0074a.p = AbstractC0024v.b(context, sentryAndroidOptions.getLogger());
        c0074a.v = Boolean.valueOf(!b(bVar));
        PackageInfo packageInfoF = AbstractC0024v.f(context, 0, sentryAndroidOptions.getLogger(), g);
        if (packageInfoF != null) {
            c0074a.l = packageInfoF.packageName;
        }
        String str6 = c0083q1.q;
        if (str6 == null) {
            str6 = (String) io.sentry.cache.a.b(sentryAndroidOptions, ".options-cache", "release.json", String.class, null);
        }
        if (str6 != null) {
            try {
                String strSubstring = str6.substring(str6.indexOf(64) + 1, str6.indexOf(43));
                String strSubstring2 = str6.substring(str6.indexOf(43) + 1);
                c0074a.q = strSubstring;
                c0074a.r = strSubstring2;
            } catch (Throwable unused3) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "Failed to parse release from scope cache: %s", str6);
            }
        }
        c0076c.b(c0074a);
        Map map3 = (Map) io.sentry.cache.a.b(sentryAndroidOptions, ".options-cache", "tags.json", Map.class, null);
        if (map3 != null) {
            if (c0083q1.p == null) {
                c0083q1.p = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!c0083q1.p.containsKey(entry4.getKey())) {
                        c0083q1.a((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.E e = c0083q1.t;
        if (e == null) {
            e = new io.sentry.protocol.E();
            c0083q1.t = e;
        }
        io.sentry.protocol.E e2 = e;
        if (e2.m == null) {
            try {
                strA = Q.a(context);
            } catch (Throwable th4) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting installationId.", th4);
                strA = null;
            }
            e2.m = strA;
        }
        if (e2.p == null) {
            e2.p = "{{auto}}";
        }
        try {
            F fM = AbstractC0024v.m(context, sentryAndroidOptions.getLogger(), g);
            if (fM != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(fM.b));
                String str7 = fM.a;
                if (str7 != null) {
                    map4.put("installerStore", str7);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    c0083q1.a((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting side loaded info.", th5);
        }
        return c0083q1;
    }
}
