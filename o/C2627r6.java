package o;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2627r6 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public HandlerC2232n2 c;
    public final AtomicReference d;
    public final io.sentry.X1 e;
    public boolean f;

    public C2627r6(MediaCodec mediaCodec, HandlerThread handlerThread) {
        io.sentry.X1 x1 = new io.sentry.X1();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = x1;
        this.d = new AtomicReference();
    }

    public static C2531q6 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C2531q6();
                }
                return (C2531q6) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(C2531q6 c2531q6) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(c2531q6);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                HandlerC2232n2 handlerC2232n2 = this.c;
                handlerC2232n2.getClass();
                handlerC2232n2.removeCallbacksAndMessages(null);
                io.sentry.X1 x1 = this.e;
                x1.a();
                HandlerC2232n2 handlerC2232n3 = this.c;
                handlerC2232n3.getClass();
                handlerC2232n3.obtainMessage(2).sendToTarget();
                synchronized (x1) {
                    while (!x1.a) {
                        x1.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }
}
