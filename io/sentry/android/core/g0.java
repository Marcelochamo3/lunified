package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends BroadcastReceiver {
    public final io.sentry.K a;
    public final SentryAndroidOptions b;
    public final io.sentry.android.core.internal.util.d c = new io.sentry.android.core.internal.util.d(0, 60000);

    public g0(io.sentry.K k, SentryAndroidOptions sentryAndroidOptions) {
        this.a = k;
        this.b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strSubstring;
        int i;
        boolean zB = this.c.b();
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        if (zEquals && zB) {
            return;
        }
        C0041f c0041f = new C0041f();
        c0041f.n = "system";
        c0041f.p = "device.event";
        Charset charset = io.sentry.util.e.a;
        if (action != null) {
            int iLastIndexOf = action.lastIndexOf(".");
            strSubstring = (iLastIndexOf < 0 || action.length() <= (i = iLastIndexOf + 1)) ? action : action.substring(i);
        } else {
            strSubstring = null;
        }
        if (strSubstring != null) {
            c0041f.b(strSubstring, "action");
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (zEquals) {
            Float fB = K.b(intent, sentryAndroidOptions);
            if (fB != null) {
                c0041f.b(fB, "level");
            }
            Boolean boolC = K.c(intent, sentryAndroidOptions);
            if (boolC != null) {
                c0041f.b(boolC, "charging");
            }
        } else {
            Bundle extras = intent.getExtras();
            HashMap map = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            map.put(str, obj.toString());
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().s(EnumC0094u1.ERROR, th, "%s key of the %s action threw an error.", str, action);
                    }
                }
                c0041f.b(map, "extras");
            }
        }
        c0041f.q = EnumC0094u1.INFO;
        C0104y c0104y = new C0104y();
        c0104y.c(intent, "android:intent");
        this.a.c(c0041f, c0104y);
    }
}
