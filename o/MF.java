package o;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class MF extends InputConnectionWrapper {
    public final /* synthetic */ C2278nc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MF(InputConnection inputConnection, C2278nc c2278nc) {
        super(inputConnection, false);
        this.a = c2278nc;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0334By c0334By = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0334By = new C0334By(6, new OF(inputContentInfo));
        }
        if (this.a.g(c0334By, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
