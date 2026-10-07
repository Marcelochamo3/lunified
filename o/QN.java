package o;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class QN extends ON {
    @Override // o.ON
    public final OnBackInvokedCallback a(NN nn) {
        return new PN(this, nn);
    }
}
