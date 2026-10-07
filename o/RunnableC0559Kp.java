package o;

import android.os.Trace;

/* JADX INFO: renamed from: o.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0559Kp implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = Vl0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0455Gp.k != null) {
                C0455Gp.a().c();
            }
        } finally {
            int i2 = Vl0.a;
            Trace.endSection();
        }
    }
}
