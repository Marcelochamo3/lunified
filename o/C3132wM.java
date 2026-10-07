package o;

import io.sentry.android.core.C0020q;

/* JADX INFO: renamed from: o.wM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3132wM extends C0020q {
    public UP d;

    @Override // io.sentry.android.core.C0020q
    public final int b(Object obj) {
        M70 m70 = (M70) obj;
        if (m70 == null) {
            return 1;
        }
        return m70.b();
    }

    @Override // io.sentry.android.core.C0020q
    public final void c(Object obj, Object obj2) {
        M70 m70 = (M70) obj2;
        UP up = this.d;
        if (up == null || m70 == null) {
            return;
        }
        ((C2597qq) up).e.e(m70, true);
    }

    public final void f(int i) {
        long j;
        if (i >= 40) {
            e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.a;
            }
            e(j / 2);
        }
    }
}
