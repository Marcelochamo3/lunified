package o;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Uh0 implements InterfaceC1274dB {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public Uh0(Handler handler) {
        this.a = handler;
    }

    public static Th0 b() {
        Th0 th0;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                th0 = arrayList.isEmpty() ? new Th0() : (Th0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return th0;
    }

    public final Th0 a(int i, Object obj) {
        Th0 th0B = b();
        th0B.a = this.a.obtainMessage(i, obj);
        return th0B;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final boolean d(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
