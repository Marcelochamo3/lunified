package o;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OB extends AbstractC2438p8 {
    public int g;

    @Override // o.InterfaceC1920js
    public final int m() {
        return 0;
    }

    @Override // o.InterfaceC1920js
    public final int n() {
        return this.g;
    }

    @Override // o.InterfaceC1920js
    public final Object q() {
        return null;
    }

    @Override // o.InterfaceC1920js
    public final void s(long j, long j2, long j3, List list, InterfaceC2940uO[] interfaceC2940uOArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!c(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
