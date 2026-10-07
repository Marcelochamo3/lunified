package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import io.sentry.RunnableC0059l;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class TempSensorBreadcrumbsIntegration implements InterfaceC0002a0, Closeable, SensorEventListener {
    public final Context l;
    public io.sentry.K m;
    public SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SensorManager f69o;
    public boolean p = false;
    public final Object q = new Object();

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.l = context;
    }

    public final void a(I1 i1) {
        try {
            SensorManager sensorManager = (SensorManager) this.l.getSystemService("sensor");
            this.f69o = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.f69o.registerListener(this, defaultSensor, 3);
                    i1.getLogger().h(EnumC0094u1.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.config.a.a(TempSensorBreadcrumbsIntegration.class);
                } else {
                    i1.getLogger().h(EnumC0094u1.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                }
            } else {
                i1.getLogger().h(EnumC0094u1.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
            }
        } catch (Throwable th) {
            i1.getLogger().s(EnumC0094u1.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.q) {
            this.p = true;
        }
        SensorManager sensorManager = this.f69o;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f69o = null;
            SentryAndroidOptions sentryAndroidOptions = this.n;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.m = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.n.isEnableSystemEventBreadcrumbs()));
        if (this.n.isEnableSystemEventBreadcrumbs()) {
            try {
                i1.getExecutorService().submit(new RunnableC0059l(this, 7, i1));
            } catch (Throwable th) {
                i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.m == null) {
            return;
        }
        C0041f c0041f = new C0041f();
        c0041f.n = "system";
        c0041f.p = "device.event";
        c0041f.b("TYPE_AMBIENT_TEMPERATURE", "action");
        c0041f.b(Integer.valueOf(sensorEvent.accuracy), "accuracy");
        c0041f.b(Long.valueOf(sensorEvent.timestamp), "timestamp");
        c0041f.q = EnumC0094u1.INFO;
        c0041f.b(Float.valueOf(sensorEvent.values[0]), "degree");
        C0104y c0104y = new C0104y();
        c0104y.c(sensorEvent, "android:sensorEvent");
        this.m.c(c0041f, c0104y);
    }
}
