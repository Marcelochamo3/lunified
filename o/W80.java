package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.skidush.clonex.utils.RuntimeSecurityGuard;

/* JADX INFO: loaded from: classes.dex */
public final class W80 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        String schemeSpecificPart = (intent == null || (data = intent.getData()) == null) ? null : data.getSchemeSpecificPart();
        if (schemeSpecificPart == null) {
            schemeSpecificPart = "";
        }
        String[] strArr = RuntimeSecurityGuard.b;
        for (int i = 0; i < 16; i++) {
            if (AbstractC1899jh0.N(strArr[i], schemeSpecificPart, true)) {
                RuntimeSecurityGuard.g.set(true);
                RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
                RuntimeSecurityGuard.d();
                return;
            }
        }
    }
}
