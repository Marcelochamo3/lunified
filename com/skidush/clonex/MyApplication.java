package com.skidush.clonex;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.provider.Settings;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.skidush.clonex.utils.RuntimeSecurityGuard;
import com.skidush.clonex.utils.TamperGuard;
import io.sentry.AbstractC0031b1;
import io.sentry.android.core.a0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.Authenticator;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o.AbstractC1370eA;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC3429zS;
import o.C0323Bn;
import o.C0633Nm;
import o.C1627gr0;
import o.C1725hr0;
import o.C1985kb0;
import o.C3084vr0;
import o.Cr0;
import o.Hv0;
import o.I7;
import o.Jp0;
import o.L3;
import o.O9;
import o.U80;
import o.UU;
import o.V80;
import o.Vb0;
import o.W80;
import o.X80;
import o.Y80;
import o.Z80;
import o.ZS;

/* JADX INFO: loaded from: classes.dex */
public final class MyApplication extends Application {
    public static MyApplication l;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (AbstractC3429zS.b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } catch (RuntimeException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return;
        }
        AbstractC3429zS.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01e7, please report this as an issue */
    @Override // android.app.Application
    public final void onCreate() {
        C1985kb0 c1985kb0;
        super.onCreate();
        l = this;
        TamperGuard tamperGuard = TamperGuard.a;
        Context applicationContext = getApplicationContext();
        AbstractC1474fG.g(applicationContext);
        tamperGuard.e(applicationContext, "");
        if (!TamperGuard.c) {
            TamperGuard.c = true;
            Thread thread = new Thread(new L3(applicationContext, 4));
            thread.setDaemon(true);
            thread.setName("wd");
            thread.start();
        }
        deleteDatabase("ar_cache.db");
        SharedPreferences sharedPreferences = getSharedPreferences("com.skidush.clonex.preferences", 0);
        AbstractC1474fG.i(sharedPreferences, "getSharedPreferences(...)");
        AbstractC1459f50.n = sharedPreferences;
        try {
            SharedPreferences sharedPreferences2 = getApplicationContext().getSharedPreferences("security_termination", 0);
            String string = sharedPreferences2.getString("reason", null);
            if (string == null) {
                c1985kb0 = null;
            } else {
                long j = sharedPreferences2.getLong("timestamp_ms", 0L);
                String string2 = sharedPreferences2.getString("app_version", "");
                String str = string2 == null ? "" : string2;
                String string3 = sharedPreferences2.getString("device", "");
                c1985kb0 = new C1985kb0(string, j, str, string3 == null ? "" : string3, sharedPreferences2.getInt("sdk", 0), sharedPreferences2.getBoolean("reported", false));
            }
        } catch (Throwable unused) {
        }
        if (c1985kb0 != null) {
            c1985kb0.a();
        }
        synchronized (C3084vr0.a) {
            try {
                if (!C3084vr0.m) {
                    Context applicationContext2 = getApplicationContext();
                    AbstractC1474fG.i(applicationContext2, "getApplicationContext(...)");
                    C3084vr0.j = applicationContext2;
                    C3084vr0.y = ProxySelector.getDefault();
                    C3084vr0.f1083o = false;
                    Cr0.z.d(Boolean.FALSE);
                    C3084vr0.m = true;
                    try {
                        ProxySelector.setDefault(C3084vr0.I);
                        Authenticator.setDefault(C3084vr0.K);
                        C3084vr0.E.f(C1627gr0.a);
                    } catch (Throwable unused2) {
                        C3084vr0.E.f(new C1725hr0("Android no permitio instalar el proxy global"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ProcessLifecycleOwner.t.q.a(new ZS(this));
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        if (RuntimeSecurityGuard.c.compareAndSet(false, true)) {
            RuntimeSecurityGuard.j = this;
            Object systemService = getSystemService("connectivity");
            RuntimeSecurityGuard.k = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            ContentObserver y80 = new Y80(RuntimeSecurityGuard.h);
            try {
                try {
                    Iterator it = Vb0.O("http_proxy", "global_http_proxy_host", "global_http_proxy_port", "global_proxy_pac_url").iterator();
                    while (it.hasNext()) {
                        getContentResolver().registerContentObserver(Settings.Global.getUriFor((String) it.next()), false, y80);
                    }
                    W80 w80 = new W80();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addDataScheme("package");
                    try {
                        try {
                            AbstractC1459f50.K(this, w80, intentFilter);
                            U80 u80A = RuntimeSecurityGuard.a();
                            if (u80A != null) {
                                RuntimeSecurityGuard runtimeSecurityGuard2 = RuntimeSecurityGuard.a;
                                RuntimeSecurityGuard.e(u80A);
                            } else {
                                registerActivityLifecycleCallbacks(new Z80());
                                ConnectivityManager connectivityManager = RuntimeSecurityGuard.k;
                                if (connectivityManager != null) {
                                    X80 x80 = new X80();
                                    try {
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            connectivityManager.registerDefaultNetworkCallback(x80);
                                        } else {
                                            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), x80);
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                                RuntimeSecurityGuard.i.scheduleWithFixedDelay(new UU(8), 5L, 5L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th2) {
                            Jp0.k(th2);
                            RuntimeSecurityGuard.e(new U80(V80.CAPTURE_TOOL, "package_monitor_unavailable"));
                        }
                    } catch (Throwable unused4) {
                        unregisterReceiver(w80);
                        RuntimeSecurityGuard.e(new U80(V80.CAPTURE_TOOL, "package_monitor_unavailable"));
                        a0.b(this, new C0633Nm(23));
                        if (c1985kb0 != null) {
                            if (!(!c1985kb0.f)) {
                                c1985kb0 = null;
                            }
                            if (c1985kb0 != null) {
                                AbstractC0031b1.b("Previous security termination: " + c1985kb0.a());
                                try {
                                    getApplicationContext().getSharedPreferences("security_termination", 0).edit().putBoolean("reported", true).apply();
                                } catch (Throwable unused5) {
                                }
                            }
                        }
                        getSharedPreferences("remote_config", 0).edit().remove("config_json").remove("fetched_at").apply();
                        O9.y = null;
                        O9.z = 0L;
                        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                        C0323Bn.e(this);
                        String str2 = C0323Bn.d.b;
                        AbstractC1370eA.y(this);
                        Context context = Hv0.b;
                        Hv0.b = getApplicationContext();
                    }
                } catch (Throwable unused6) {
                    getContentResolver().unregisterContentObserver(y80);
                    RuntimeSecurityGuard.e(new U80(V80.PROXY, "proxy_settings_monitor_unavailable"));
                    a0.b(this, new C0633Nm(23));
                    if (c1985kb0 != null) {
                        if (!(!c1985kb0.f)) {
                            c1985kb0 = null;
                        }
                        if (c1985kb0 != null) {
                            AbstractC0031b1.b("Previous security termination: " + c1985kb0.a());
                            getApplicationContext().getSharedPreferences("security_termination", 0).edit().putBoolean("reported", true).apply();
                        }
                    }
                    getSharedPreferences("remote_config", 0).edit().remove("config_json").remove("fetched_at").apply();
                    O9.y = null;
                    O9.z = 0L;
                    ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                    C0323Bn.e(this);
                    String str3 = C0323Bn.d.b;
                    AbstractC1370eA.y(this);
                    Context context2 = Hv0.b;
                    Hv0.b = getApplicationContext();
                }
            } catch (Throwable th3) {
                Jp0.k(th3);
                RuntimeSecurityGuard.e(new U80(V80.PROXY, "proxy_settings_monitor_unavailable"));
            }
        }
        a0.b(this, new C0633Nm(23));
        if (c1985kb0 != null) {
            if (!(!c1985kb0.f)) {
                c1985kb0 = null;
            }
            if (c1985kb0 != null) {
                AbstractC0031b1.b("Previous security termination: " + c1985kb0.a());
                getApplicationContext().getSharedPreferences("security_termination", 0).edit().putBoolean("reported", true).apply();
            }
        }
        getSharedPreferences("remote_config", 0).edit().remove("config_json").remove("fetched_at").apply();
        O9.y = null;
        O9.z = 0L;
        try {
            ConcurrentHashMap concurrentHashMap3 = C0323Bn.a;
            C0323Bn.e(this);
            String str4 = C0323Bn.d.b;
            AbstractC1370eA.y(this);
            Context context3 = Hv0.b;
            Hv0.b = getApplicationContext();
        } catch (Throwable unused7) {
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 20) {
            I7.a.b(this);
        }
    }
}
