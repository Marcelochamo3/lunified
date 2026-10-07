package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.A70;
import o.AbstractC1923jt0;
import o.AbstractC3045vW;
import o.AbstractComponentCallbacksC1247cx;
import o.C0334By;
import o.C0519Jb;
import o.C0622Nb;
import o.C1566gA;
import o.C1797ie0;
import o.C1813in;
import o.C2292nj;
import o.C2597qq;
import o.C2647rM;
import o.C2712s0;
import o.C3132wM;
import o.C3289xx;
import o.ComponentCallbacks2C3406z70;
import o.ExecutorServiceC1956kA;
import o.Kr0;
import o.O9;
import o.Pu0;
import o.Q8;
import o.S5;
import o.ThreadFactoryC1858jA;
import o.ThreadFactoryC3199x1;
import o.VP;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a t;
    public static volatile boolean u;
    public final C2597qq l;
    public final Q8 m;
    public final C3132wM n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1566gA f34o;
    public final C1813in p;
    public final A70 q;
    public final C0519Jb r;
    public final ArrayList s = new ArrayList();

    public a(Context context, C2597qq c2597qq, C3132wM c3132wM, Q8 q8, C1813in c1813in, A70 a70, C0519Jb c0519Jb, int i, C0622Nb c0622Nb, S5 s5, List list, ArrayList arrayList, Pu0 pu0, C0334By c0334By) {
        this.l = c2597qq;
        this.m = q8;
        this.p = c1813in;
        this.n = c3132wM;
        this.q = a70;
        this.r = c0519Jb;
        this.f34o = new C1566gA(context, c1813in, new C1797ie0(this, arrayList, pu0), new C0622Nb(28), c0622Nb, s5, list, c2597qq, c0334By, i);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (t == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (t == null) {
                    if (u) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    u = true;
                    try {
                        c(context, generatedAppGlideModule);
                        u = false;
                    } catch (Throwable th) {
                        u = false;
                        throw th;
                    }
                }
            }
        }
        return t;
    }

    public static A70 b(Context context) {
        AbstractC3045vW.k(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).q;
    }

    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        S5 s5 = new S5(0);
        C2292nj c2292nj = new C2292nj(1);
        C0622Nb c0622Nb = new C0622Nb(26);
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(AbstractC1923jt0.C(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                if (hashSet.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        okHttpGlideModule.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((OkHttpGlideModule) it2.next()).getClass().toString();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((OkHttpGlideModule) it3.next()).getClass();
        }
        ThreadFactoryC3199x1 threadFactoryC3199x1 = new ThreadFactoryC3199x1(1);
        if (ExecutorServiceC1956kA.n == 0) {
            ExecutorServiceC1956kA.n = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC1956kA.n;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC1956kA executorServiceC1956kA = new ExecutorServiceC1956kA(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1858jA(threadFactoryC3199x1, "source", false)));
        ThreadFactoryC3199x1 threadFactoryC3199x2 = new ThreadFactoryC3199x1(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC1956kA executorServiceC1956kA2 = new ExecutorServiceC1956kA(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1858jA(threadFactoryC3199x2, "disk-cache", true)));
        if (ExecutorServiceC1956kA.n == 0) {
            ExecutorServiceC1956kA.n = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC1956kA.n >= 4 ? 2 : 1;
        ThreadFactoryC3199x1 threadFactoryC3199x3 = new ThreadFactoryC3199x1(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC1956kA executorServiceC1956kA3 = new ExecutorServiceC1956kA(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1858jA(threadFactoryC3199x3, "animation", true)));
        VP vp = new VP(applicationContext);
        C2712s0 c2712s0 = new C2712s0();
        Context context2 = vp.a;
        ActivityManager activityManager = vp.b;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c2712s0.c = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) vp.c.m;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = vp.d;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i4 = iRound - i3;
        if (iRound3 + iRound2 <= i4) {
            c2712s0.b = iRound3;
            c2712s0.a = iRound2;
        } else {
            float f3 = i4 / (f2 + 2.0f);
            c2712s0.b = Math.round(2.0f * f3);
            c2712s0.a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context2, c2712s0.b);
            Formatter.formatFileSize(context2, c2712s0.a);
            Formatter.formatFileSize(context2, i3);
            Formatter.formatFileSize(context2, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
        C0519Jb c0519Jb = new C0519Jb(9);
        int i5 = c2712s0.a;
        Q8 c2647rM = i5 > 0 ? new C2647rM(i5) : new O9(25);
        C1813in c1813in = new C1813in(c2712s0.c);
        C3132wM c3132wM = new C3132wM(c2712s0.b);
        a aVar = new a(applicationContext, new C2597qq(c3132wM, new C0334By(applicationContext), executorServiceC1956kA2, executorServiceC1956kA, new ExecutorServiceC1956kA(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC1956kA.m, timeUnit, new SynchronousQueue(), new ThreadFactoryC1858jA(new ThreadFactoryC3199x1(1), "source-unlimited", false))), executorServiceC1956kA3), c3132wM, c2647rM, c1813in, new A70(null), c0519Jb, 4, c0622Nb, s5, Collections.emptyList(), arrayList, generatedAppGlideModule, new C0334By(c2292nj));
        applicationContext.registerComponentCallbacks(aVar);
        t = aVar;
    }

    public static ComponentCallbacks2C3406z70 e(Context context) {
        return b(context).b(context);
    }

    public static ComponentCallbacks2C3406z70 f(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        A70 a70B = b(abstractComponentCallbacksC1247cx.j());
        a70B.getClass();
        AbstractC3045vW.k(abstractComponentCallbacksC1247cx.j(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = Kr0.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return a70B.b(abstractComponentCallbacksC1247cx.j().getApplicationContext());
        }
        if (abstractComponentCallbacksC1247cx.h() != null) {
            a70B.n.e(abstractComponentCallbacksC1247cx.h());
        }
        C3289xx c3289xxI = abstractComponentCallbacksC1247cx.i();
        Context contextJ = abstractComponentCallbacksC1247cx.j();
        return a70B.f164o.Z(contextJ, a(contextJ.getApplicationContext()), abstractComponentCallbacksC1247cx.b0, c3289xxI, abstractComponentCallbacksC1247cx.w());
    }

    public final void d(ComponentCallbacks2C3406z70 componentCallbacks2C3406z70) {
        synchronized (this.s) {
            try {
                if (!this.s.contains(componentCallbacks2C3406z70)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.s.remove(componentCallbacks2C3406z70);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Kr0.a();
        this.n.e(0L);
        this.m.g();
        this.p.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Kr0.a();
        synchronized (this.s) {
            try {
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3406z70) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.n.f(i);
        this.m.f(i);
        this.p.p(i);
    }
}
