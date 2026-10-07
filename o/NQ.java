package o;

import io.sentry.android.core.C0020q;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class NQ extends C0020q {
    @Override // io.sentry.android.core.C0020q
    public final void c(Object obj, Object obj2) {
        OQ oq = (OQ) obj;
        oq.getClass();
        ArrayDeque arrayDeque = OQ.d;
        synchronized (arrayDeque) {
            arrayDeque.offer(oq);
        }
    }
}
