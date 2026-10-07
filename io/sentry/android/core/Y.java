package io.sentry.android.core;

import android.telephony.PhoneStateListener;
import io.sentry.C0041f;
import io.sentry.EnumC0094u1;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends PhoneStateListener {
    public final io.sentry.K a;

    public Y(io.sentry.K k) {
        this.a = k;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        if (i == 1) {
            C0041f c0041f = new C0041f();
            c0041f.n = "system";
            c0041f.p = "device.event";
            c0041f.b("CALL_STATE_RINGING", "action");
            c0041f.m = "Device ringing";
            c0041f.q = EnumC0094u1.INFO;
            this.a.f(c0041f);
        }
    }
}
