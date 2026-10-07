package io.sentry.android.core;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.AbstractC0049h1;
import io.sentry.C0103x1;
import io.sentry.C0105y0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0052i1;

/* JADX INFO: loaded from: classes.dex */
public final class G implements io.sentry.transport.h, InterfaceC0052i1 {
    public static final G m = new G();
    public Object l;

    public G(int i) {
        switch (i) {
            case 4:
                this.l = new C0105y0(10);
                break;
            default:
                this.l = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // io.sentry.transport.h
    public boolean a() {
        int i = AbstractC0022t.a[((I1) this.l).getConnectionStatusProvider().a().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public Boolean b() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            ((ILogger) this.l).v(EnumC0094u1.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC0052i1
    public AbstractC0049h1 y() {
        ((C0105y0) this.l).getClass();
        return new C0103x1();
    }

    public G(I1 i1) {
        this.l = i1;
    }

    public G(ILogger iLogger) {
        io.sentry.config.a.C(iLogger, "The ILogger object is required.");
        this.l = iLogger;
    }
}
