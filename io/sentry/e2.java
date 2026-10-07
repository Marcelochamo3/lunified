package io.sentry;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements H {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public e2(Boolean bool, Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    public static ConnectivityManager e(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.h(EnumC0094u1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public static boolean f(Context context, ILogger iLogger, io.sentry.android.core.G g, ConnectivityManager.NetworkCallback networkCallback) {
        g.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            iLogger.h(EnumC0094u1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerE = e(context, iLogger);
        if (connectivityManagerE == null) {
            return false;
        }
        if (!io.sentry.config.a.t(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.h(EnumC0094u1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerE.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    @Override // io.sentry.H
    public F a() {
        F f;
        Context context = (Context) this.a;
        ILogger iLogger = (ILogger) this.b;
        ConnectivityManager connectivityManagerE = e(context, iLogger);
        if (connectivityManagerE == null) {
            return F.UNKNOWN;
        }
        if (!io.sentry.config.a.t(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.h(EnumC0094u1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return F.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerE.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.h(EnumC0094u1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                f = F.DISCONNECTED;
            } else {
                f = activeNetworkInfo.isConnected() ? F.CONNECTED : F.DISCONNECTED;
            }
            return f;
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.WARNING, "Could not retrieve Connection Status", th);
            return F.UNKNOWN;
        }
    }

    @Override // io.sentry.H
    public boolean b(G g) {
        io.sentry.android.core.G g2 = (io.sentry.android.core.G) this.c;
        g2.getClass();
        io.sentry.android.core.internal.util.a aVar = new io.sentry.android.core.internal.util.a(this, g);
        ((HashMap) this.d).put(g, aVar);
        return f((Context) this.a, (ILogger) this.b, g2, aVar);
    }

    @Override // io.sentry.H
    public String c() {
        boolean zHasTransport;
        io.sentry.android.core.G g = (io.sentry.android.core.G) this.c;
        Context context = (Context) this.a;
        ILogger iLogger = (ILogger) this.b;
        ConnectivityManager connectivityManagerE = e(context, iLogger);
        if (connectivityManagerE == null) {
            return null;
        }
        boolean z = false;
        if (!io.sentry.config.a.t(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.h(EnumC0094u1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            g.getClass();
            boolean zHasTransport2 = true;
            if (Build.VERSION.SDK_INT >= 23) {
                Network activeNetwork = connectivityManagerE.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.h(EnumC0094u1.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerE.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.h(EnumC0094u1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                z = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerE.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.h(EnumC0094u1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        zHasTransport = true;
                    } else if (type != 9) {
                        zHasTransport = false;
                    } else {
                        zHasTransport = false;
                        z = true;
                    }
                    zHasTransport2 = false;
                } else {
                    zHasTransport = false;
                }
            }
            if (z) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.ERROR, "Failed to retrieve network info", th);
            return null;
        }
    }

    @Override // io.sentry.H
    public void d(G g) {
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) ((HashMap) this.d).remove(g);
        if (networkCallback != null) {
            ((io.sentry.android.core.G) this.c).getClass();
            Context context = (Context) this.a;
            ILogger iLogger = (ILogger) this.b;
            ConnectivityManager connectivityManagerE = e(context, iLogger);
            if (connectivityManagerE == null) {
                return;
            }
            try {
                connectivityManagerE.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.v(EnumC0094u1.WARNING, "unregisterNetworkCallback failed", th);
            }
        }
    }

    public e2(Boolean bool, Double d, Boolean bool2, Double d2) {
        this.a = bool;
        this.c = d;
        this.b = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.d = d2;
    }

    public e2(Context context, ILogger iLogger, io.sentry.android.core.G g) {
        this.a = context;
        this.b = iLogger;
        this.c = g;
        this.d = new HashMap();
    }
}
