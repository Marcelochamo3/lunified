package o;

import android.os.Process;

/* JADX INFO: renamed from: o.t70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2824t70 extends Thread {
    public final int l;

    public C2824t70(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.l = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.l);
        super.run();
    }
}
