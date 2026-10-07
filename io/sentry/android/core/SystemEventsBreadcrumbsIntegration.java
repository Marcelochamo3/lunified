package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC0002a0, Closeable {
    public final Context l;
    public g0 m;
    public SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f68o;
    public boolean p;
    public final Object q;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        this.p = false;
        this.q = new Object();
        this.l = context;
        this.f68o = arrayList;
    }

    public final void a(io.sentry.K k, SentryAndroidOptions sentryAndroidOptions) {
        this.m = new g0(k, sentryAndroidOptions);
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = this.f68o.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        try {
            Context context = this.l;
            g0 g0Var = this.m;
            io.sentry.config.a.C(sentryAndroidOptions.getLogger(), "The ILogger object is required.");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(g0Var, intentFilter, 2);
            } else {
                context.registerReceiver(g0Var, intentFilter);
            }
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            io.sentry.config.a.a(SystemEventsBreadcrumbsIntegration.class);
        } catch (Throwable th) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.q) {
            this.p = true;
        }
        g0 g0Var = this.m;
        if (g0Var != null) {
            this.l.unregisterReceiver(g0Var);
            this.m = null;
            SentryAndroidOptions sentryAndroidOptions = this.n;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.n.isEnableSystemEventBreadcrumbs()));
        if (this.n.isEnableSystemEventBreadcrumbs()) {
            try {
                i1.getExecutorService().submit(new Z(this, i1));
            } catch (Throwable th) {
                i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
