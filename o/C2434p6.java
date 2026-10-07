package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: o.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2434p6 implements InterfaceC3328yO {
    public final MediaCodec l;
    public final C2724s6 m;
    public final C2627r6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f965o;
    public boolean p;
    public int q = 0;

    public C2434p6(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.l = mediaCodec;
        this.m = new C2724s6(handlerThread);
        this.n = new C2627r6(mediaCodec, handlerThread2);
        this.f965o = z;
    }

    public static void b(C2434p6 c2434p6, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        C2724s6 c2724s6 = c2434p6.m;
        AbstractC0397Ej.f(c2724s6.c == null);
        HandlerThread handlerThread = c2724s6.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c2434p6.l;
        mediaCodec.setCallback(c2724s6, handler);
        c2724s6.c = handler;
        Pu0.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        Pu0.i();
        C2627r6 c2627r6 = c2434p6.n;
        if (!c2627r6.f) {
            HandlerThread handlerThread2 = c2627r6.b;
            handlerThread2.start();
            c2627r6.c = new HandlerC2232n2(c2627r6, handlerThread2.getLooper(), 1);
            c2627r6.f = true;
        }
        Pu0.c("startCodec");
        mediaCodec.start();
        Pu0.i();
        c2434p6.q = 1;
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // o.InterfaceC3328yO
    public final void a() {
        try {
            if (this.q == 1) {
                C2627r6 c2627r6 = this.n;
                if (c2627r6.f) {
                    c2627r6.a();
                    c2627r6.b.quit();
                }
                c2627r6.f = false;
                C2724s6 c2724s6 = this.m;
                synchronized (c2724s6.a) {
                    c2724s6.l = true;
                    c2724s6.b.quit();
                    c2724s6.a();
                }
            }
            this.q = 2;
            if (this.p) {
                return;
            }
            this.l.release();
            this.p = true;
        } catch (Throwable th) {
            if (!this.p) {
                this.l.release();
                this.p = true;
            }
            throw th;
        }
    }

    @Override // o.InterfaceC3328yO
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int iE;
        RuntimeException runtimeException = (RuntimeException) this.n.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C2724s6 c2724s6 = this.m;
        synchronized (c2724s6.a) {
            try {
                IllegalStateException illegalStateException = c2724s6.m;
                if (illegalStateException != null) {
                    c2724s6.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c2724s6.j;
                if (codecException != null) {
                    c2724s6.j = null;
                    throw codecException;
                }
                iE = -1;
                if (!(c2724s6.k > 0 || c2724s6.l)) {
                    A6 a6 = c2724s6.e;
                    if (a6.n != 0) {
                        iE = a6.e();
                        if (iE >= 0) {
                            AbstractC0397Ej.g(c2724s6.h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c2724s6.f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (iE == -2) {
                            c2724s6.h = (MediaFormat) c2724s6.g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iE;
    }

    public final void e() {
        if (this.f965o) {
            try {
                C2627r6 c2627r6 = this.n;
                io.sentry.X1 x1 = c2627r6.e;
                x1.a();
                HandlerC2232n2 handlerC2232n2 = c2627r6.c;
                handlerC2232n2.getClass();
                handlerC2232n2.obtainMessage(2).sendToTarget();
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

    @Override // o.InterfaceC3328yO
    public final void f(int i, boolean z) {
        this.l.releaseOutputBuffer(i, z);
    }

    @Override // o.InterfaceC3328yO
    public final void flush() {
        this.n.a();
        this.l.flush();
        C2724s6 c2724s6 = this.m;
        synchronized (c2724s6.a) {
            c2724s6.k++;
            Handler handler = c2724s6.c;
            int i = Lr0.a;
            handler.post(new Jj0(2, c2724s6));
        }
        this.l.start();
    }

    @Override // o.InterfaceC3328yO
    public final void g(int i) {
        e();
        this.l.setVideoScalingMode(i);
    }

    @Override // o.InterfaceC3328yO
    public final MediaFormat i() {
        MediaFormat mediaFormat;
        C2724s6 c2724s6 = this.m;
        synchronized (c2724s6.a) {
            try {
                mediaFormat = c2724s6.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // o.InterfaceC3328yO
    public final void j(int i, C2968ui c2968ui, long j) {
        C2627r6 c2627r6 = this.n;
        RuntimeException runtimeException = (RuntimeException) c2627r6.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C2531q6 c2531q6B = C2627r6.b();
        c2531q6B.a = i;
        c2531q6B.b = 0;
        c2531q6B.c = 0;
        c2531q6B.e = j;
        c2531q6B.f = 0;
        int i2 = c2968ui.f;
        MediaCodec.CryptoInfo cryptoInfo = c2531q6B.d;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = c2968ui.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c2968ui.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c2968ui.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c2968ui.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c2968ui.c;
        if (Lr0.a >= 24) {
            AbstractC3197x0.q();
            cryptoInfo.setPattern(AbstractC3197x0.c(c2968ui.g, c2968ui.h));
        }
        c2627r6.c.obtainMessage(1, c2531q6B).sendToTarget();
    }

    @Override // o.InterfaceC3328yO
    public final ByteBuffer k(int i) {
        return this.l.getInputBuffer(i);
    }

    @Override // o.InterfaceC3328yO
    public final void l(Surface surface) {
        e();
        this.l.setOutputSurface(surface);
    }

    @Override // o.InterfaceC3328yO
    public final void m(Bundle bundle) {
        e();
        this.l.setParameters(bundle);
    }

    @Override // o.InterfaceC3328yO
    public final ByteBuffer n(int i) {
        return this.l.getOutputBuffer(i);
    }

    @Override // o.InterfaceC3328yO
    public final void o(int i, long j) {
        this.l.releaseOutputBuffer(i, j);
    }

    @Override // o.InterfaceC3328yO
    public final int p() {
        int iE;
        RuntimeException runtimeException = (RuntimeException) this.n.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C2724s6 c2724s6 = this.m;
        synchronized (c2724s6.a) {
            try {
                IllegalStateException illegalStateException = c2724s6.m;
                if (illegalStateException != null) {
                    c2724s6.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c2724s6.j;
                if (codecException != null) {
                    c2724s6.j = null;
                    throw codecException;
                }
                iE = -1;
                if (!(c2724s6.k > 0 || c2724s6.l)) {
                    A6 a6 = c2724s6.d;
                    if (a6.n != 0) {
                        iE = a6.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iE;
    }

    @Override // o.InterfaceC3328yO
    public final void q(RO ro, Handler handler) {
        e();
        this.l.setOnFrameRenderedListener(new C2240n6(this, ro, 0), handler);
    }

    @Override // o.InterfaceC3328yO
    public final void r(int i, int i2, long j, int i3) {
        C2627r6 c2627r6 = this.n;
        RuntimeException runtimeException = (RuntimeException) c2627r6.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C2531q6 c2531q6B = C2627r6.b();
        c2531q6B.a = i;
        c2531q6B.b = 0;
        c2531q6B.c = i2;
        c2531q6B.e = j;
        c2531q6B.f = i3;
        HandlerC2232n2 handlerC2232n2 = c2627r6.c;
        int i4 = Lr0.a;
        handlerC2232n2.obtainMessage(0, c2531q6B).sendToTarget();
    }
}
