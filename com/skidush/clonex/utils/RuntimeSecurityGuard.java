package com.skidush.clonex.utils;

import android.app.Application;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.security.KeyStore;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC1802ih0;
import o.AbstractC1899jh0;
import o.C1233cq;
import o.C3084vr0;
import o.Jj0;
import o.Kj0;
import o.U80;
import o.U9;
import o.UU;
import o.V80;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeSecurityGuard {
    public static final RuntimeSecurityGuard a = new RuntimeSecurityGuard();
    public static final String[] b = {"org.wireshark.android", "com.xk72.charles", "com.telerik.fiddler", "com.portswigger.android.burp", "app.greyshirts.sslcapture", "com.guoshi.httpcanary", "jp.co.taosoftware.android.packetcapture", "org.proxydroid", "com.mobiwol.packetcapture", "com.kaitensoft.tcpiptool", "com.minhui.networkcapture", "com.tech.httptoolkit.android.v1", "com.minhui.networkcapture.pro", "tech.httptoolkit.android.v1", "com.emanuelef.remote_capture", "com.reqable.android"};
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(false);
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static final ScheduledExecutorService i = Executors.newSingleThreadScheduledExecutor(new Kj0(2));
    public static volatile Application j;
    public static volatile ConnectivityManager k;

    static {
        try {
            System.loadLibrary("blindaje");
        } catch (Throwable unused) {
        }
    }

    public static U80 a() {
        String str;
        boolean zNativeIsVpnPackageAllowed;
        boolean z = true;
        Application application = j;
        if (application == null) {
            return null;
        }
        boolean z2 = f.get();
        V80 v80 = V80.PROXY;
        if (z2) {
            return new U80(v80, "external_proxy_settings_changed");
        }
        boolean z3 = g.get();
        V80 v81 = V80.CAPTURE_TOOL;
        if (z3) {
            return new U80(v81, "capture_package_installed");
        }
        if (Build.VERSION.SDK_INT <= 23) {
            ConnectivityManager connectivityManager = k;
            if (connectivityManager != null) {
                try {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    AbstractC1474fG.i(allNetworks, "getAllNetworks(...)");
                    for (Network network : allNetworks) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return new U80(v80, "legacy_vpn_transport");
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                keyStore.load(null);
                Enumeration<String> enumerationAliases = keyStore.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    String strNextElement = enumerationAliases.nextElement();
                    AbstractC1474fG.i(strNextElement, "nextElement(...)");
                    if (AbstractC1899jh0.U(strNextElement, "user:", true)) {
                        return new U80(v80, "legacy_user_ca");
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        String[] strArr = b;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                str = null;
                break;
            }
            str = strArr[i2];
            PackageManager packageManager = application.getPackageManager();
            AbstractC1474fG.i(packageManager, "getPackageManager(...)");
            try {
                packageManager.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
            RuntimeSecurityGuard runtimeSecurityGuard = a;
            if (AbstractC1899jh0.O(str)) {
                zNativeIsVpnPackageAllowed = false;
            } else {
                try {
                    zNativeIsVpnPackageAllowed = runtimeSecurityGuard.nativeIsVpnPackageAllowed(str);
                } catch (Throwable unused5) {
                    zNativeIsVpnPackageAllowed = false;
                }
            }
            boolean z4 = !zNativeIsVpnPackageAllowed;
            if (z4) {
                break;
            }
            i2++;
        }
        if (str != null) {
            return new U80(v81, "package=".concat(str));
        }
        try {
            if (!c()) {
                C3084vr0 c3084vr0 = C3084vr0.a;
                if (!C3084vr0.p()) {
                    if (C3084vr0.m && C3084vr0.s() && ProxySelector.getDefault() == C3084vr0.I) {
                        z = false;
                    } else {
                        String property = System.getProperty("http.proxyHost");
                        if (property == null) {
                            property = System.getProperty("https.proxyHost");
                        }
                        if (property == null || AbstractC1899jh0.O(property)) {
                            ProxySelector proxySelector = ProxySelector.getDefault();
                            List<Proxy> listSelect = proxySelector != null ? proxySelector.select(URI.create("https://example.com")) : null;
                            if (listSelect == null) {
                                listSelect = C1233cq.l;
                            }
                            if (!listSelect.isEmpty()) {
                                Iterator<T> it = listSelect.iterator();
                                while (it.hasNext()) {
                                    if (((Proxy) it.next()).type() != Proxy.Type.DIRECT) {
                                    }
                                }
                            }
                            z = false;
                        }
                    }
                }
            }
        } catch (Throwable unused6) {
        }
        if (z) {
            return new U80(v80, "external_system_proxy");
        }
        return null;
    }

    public static void b() {
        if (!c.get() || j == null) {
            throw new SecurityException("La guarda de entorno no esta disponible");
        }
        U80 u80A = a();
        if (u80A == null) {
            return;
        }
        e(u80A);
        throw new SecurityException(u80A.a.l);
    }

    public static boolean c() {
        String string;
        Integer numJ;
        Application application = j;
        if (application == null) {
            return true;
        }
        try {
            ContentResolver contentResolver = application.getContentResolver();
            String string2 = Settings.Global.getString(contentResolver, "http_proxy");
            String string3 = Settings.Global.getString(contentResolver, "global_http_proxy_host");
            String string4 = Settings.Global.getString(contentResolver, "global_http_proxy_port");
            String string5 = Settings.Global.getString(contentResolver, "global_proxy_pac_url");
            String string6 = string2 != null ? AbstractC1119bh0.E0(string2).toString() : null;
            if (string6 == null) {
                string6 = "";
            }
            if ((!U9.s(string6) || AbstractC1474fG.b(string6, ":0")) && !U9.s(string3)) {
                if (string4 == null || (string = AbstractC1119bh0.E0(string4).toString()) == null || (numJ = AbstractC1802ih0.J(string)) == null || numJ.intValue() <= 0) {
                    return U9.s(string5);
                }
                return true;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void d() {
        if (e.get() || !d.compareAndSet(false, true)) {
            return;
        }
        i.execute(new UU(10));
    }

    public static void e(U80 u80) {
        if (e.compareAndSet(false, true)) {
            String strE = AbstractC1701hf0.e(u80.a.name(), ":", u80.b);
            Application application = j;
            if (application != null) {
                zy0.x(application, "RuntimeSecurityGuard", strE);
            }
            h.post(new Jj0(24, u80));
        }
    }

    private final native boolean nativeIsVpnPackageAllowed(String str);
}
