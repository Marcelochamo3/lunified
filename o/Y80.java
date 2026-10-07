package o;

import android.database.ContentObserver;
import com.skidush.clonex.utils.RuntimeSecurityGuard;

/* JADX INFO: loaded from: classes.dex */
public final class Y80 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        RuntimeSecurityGuard.f.set(true);
        RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
        RuntimeSecurityGuard.d();
    }
}
