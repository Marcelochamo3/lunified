package o;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import io.sentry.C0032c;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class P90 implements Ss0, InterfaceC1008ab {
    public int t;
    public SurfaceTexture u;
    public byte[] x;
    public final AtomicBoolean l = new AtomicBoolean();
    public final AtomicBoolean m = new AtomicBoolean(true);
    public final K30 n = new K30();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0032c f450o = new C0032c(5, (byte) 0);
    public final C0709Qk p = new C0709Qk(4);
    public final C0709Qk q = new C0709Qk(4);
    public final float[] r = new float[16];
    public final float[] s = new float[16];
    public volatile int v = 0;
    public int w = -1;

    @Override // o.InterfaceC1008ab
    public final void a(long j, float[] fArr) {
        ((C0709Qk) this.f450o.e).a(j, fArr);
    }

    @Override // o.Ss0
    public final void b(long j, long j2, C0643Nw c0643Nw, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        ArrayList arrayListD;
        int i4 = 1;
        this.p.a(j2, Long.valueOf(j));
        byte[] bArr = c0643Nw.G;
        int i5 = c0643Nw.H;
        byte[] bArr2 = this.x;
        int i6 = this.w;
        this.x = bArr;
        if (i5 == -1) {
            i5 = this.v;
        }
        this.w = i5;
        if (i6 == i5 && Arrays.equals(bArr2, this.x)) {
            return;
        }
        byte[] bArr3 = this.x;
        J30 j30 = null;
        if (bArr3 != null) {
            int i7 = this.w;
            C2562qX c2562qX = new C2562qX(bArr3);
            try {
                c2562qX.G(4);
                int iG = c2562qX.g();
                c2562qX.F(0);
                if (iG == 1886547818) {
                    c2562qX.G(8);
                    int i8 = c2562qX.b;
                    int i9 = c2562qX.c;
                    while (true) {
                        if (i8 < i9) {
                            int iG2 = c2562qX.g() + i8;
                            if (iG2 > i8 && iG2 <= i9) {
                                int iG3 = c2562qX.g();
                                if (iG3 != 2037673328 && iG3 != 1836279920) {
                                    c2562qX.F(iG2);
                                    i8 = iG2;
                                }
                                c2562qX.E(iG2);
                                arrayListD = AbstractC1923jt0.D(c2562qX);
                            }
                        }
                        arrayListD = null;
                    }
                } else {
                    arrayListD = AbstractC1923jt0.D(c2562qX);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListD != null) {
                int size = arrayListD.size();
                if (size == 1) {
                    I30 i30 = (I30) arrayListD.get(0);
                    j30 = new J30(i30, i30, i7);
                } else if (size == 2) {
                    j30 = new J30((I30) arrayListD.get(0), (I30) arrayListD.get(1), i7);
                }
            }
        }
        if (j30 == null || !K30.c(j30)) {
            int i10 = this.w;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 36; i11 < i14; i14 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                int i15 = i11 + 1;
                float f5 = (i15 * f) - f3;
                int i16 = 0;
                while (i16 < 73) {
                    float f6 = f5;
                    float f7 = f4;
                    int i17 = i15;
                    int i18 = i12;
                    int i19 = i13;
                    int i20 = 0;
                    int i21 = 2;
                    while (i20 < i21) {
                        float f8 = i16 * f2;
                        float f9 = f2;
                        int i22 = i16;
                        float f10 = radians;
                        double d = 50.0f;
                        int i23 = i10;
                        double d2 = (3.1415927f + f8) - (radians2 / 2.0f);
                        double d3 = i20 == 0 ? f7 : f6;
                        int i24 = i20;
                        float f11 = f;
                        fArr[i18] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i25 = i11;
                        float[] fArr3 = fArr2;
                        fArr[i18 + 1] = (float) (Math.sin(d3) * d);
                        int i26 = i18 + 3;
                        fArr[i18 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr3[i19] = f8 / radians2;
                        int i27 = i19 + 2;
                        fArr3[i19 + 1] = ((i25 + i24) * f11) / f10;
                        if (i22 == 0 && i24 == 0) {
                            i2 = i24;
                            i = i22;
                            i3 = 3;
                        } else {
                            i = i22;
                            i2 = i24;
                            i3 = 3;
                            if (i != 72 || i2 != 1) {
                                i19 = i27;
                                i18 = i26;
                            }
                            int i28 = i2 + 1;
                            i16 = i;
                            fArr2 = fArr3;
                            f2 = f9;
                            radians = f10;
                            i10 = i23;
                            i11 = i25;
                            f = f11;
                            i21 = 2;
                            i20 = i28;
                        }
                        System.arraycopy(fArr, i18, fArr, i26, i3);
                        i18 += 6;
                        System.arraycopy(fArr3, i19, fArr3, i27, 2);
                        i19 += 4;
                        int i29 = i2 + 1;
                        i16 = i;
                        fArr2 = fArr3;
                        f2 = f9;
                        radians = f10;
                        i10 = i23;
                        i11 = i25;
                        f = f11;
                        i21 = 2;
                        i20 = i29;
                    }
                    i16++;
                    i13 = i19;
                    i12 = i18;
                    f4 = f7;
                    i15 = i17;
                    radians = radians;
                    i10 = i10;
                    f = f;
                    f5 = f6;
                }
                i11 = i15;
                i4 = 1;
            }
            int i31 = i10;
            C0709Qk[] c0709QkArr = new C0709Qk[i4];
            c0709QkArr[0] = new C0709Qk(0, fArr, fArr2, i4);
            I30 i32 = new I30(c0709QkArr);
            j30 = new J30(i32, i32, i31);
        }
        this.q.a(j2, j30);
    }

    public final void c(float[] fArr) {
        float[] fArr2;
        Object objD;
        GLES20.glClear(16384);
        try {
            AbstractC3409z9.e();
        } catch (C1273dA e) {
            AP.g("Failed to draw a frame", e);
        }
        if (this.l.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.u;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC3409z9.e();
            } catch (C1273dA e2) {
                AP.g("Failed to draw a frame", e2);
            }
            if (this.m.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.r, 0);
            }
            long timestamp = this.u.getTimestamp();
            C0709Qk c0709Qk = this.p;
            synchronized (c0709Qk) {
                objD = c0709Qk.d(timestamp, false);
            }
            Long l = (Long) objD;
            if (l != null) {
                C0032c c0032c = this.f450o;
                float[] fArr3 = this.r;
                float[] fArr4 = (float[]) ((C0709Qk) c0032c.e).e(l.longValue());
                if (fArr4 != null) {
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    float[] fArr5 = (float[]) c0032c.d;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!c0032c.b) {
                        C0032c.j((float[]) c0032c.c, (float[]) c0032c.d);
                        c0032c.b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) c0032c.c, 0, (float[]) c0032c.d, 0);
                }
            }
            J30 j30 = (J30) this.q.e(timestamp);
            if (j30 != null) {
                K30 k30 = this.n;
                k30.getClass();
                if (K30.c(j30)) {
                    k30.a = j30.c;
                    k30.g = new C0709Qk(j30.a.a[0]);
                    if (!j30.d) {
                        new C0709Qk(j30.b.a[0]);
                    }
                    k30.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.s, 0, fArr, 0, this.r, 0);
        K30 k31 = this.n;
        int i = this.t;
        float[] fArr6 = this.s;
        C0709Qk c0709Qk2 = (C0709Qk) k31.g;
        if (c0709Qk2 == null) {
            return;
        }
        int i2 = k31.a;
        if (i2 == 1) {
            fArr2 = K30.j;
        } else {
            fArr2 = i2 == 2 ? K30.k : K30.i;
        }
        GLES20.glUniformMatrix3fv(k31.c, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(k31.b, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(k31.f, 0);
        try {
            AbstractC3409z9.e();
        } catch (C1273dA unused) {
        }
        GLES20.glVertexAttribPointer(k31.d, 3, 5126, false, 12, (Buffer) c0709Qk2.n);
        try {
            AbstractC3409z9.e();
        } catch (C1273dA unused2) {
        }
        GLES20.glVertexAttribPointer(k31.e, 2, 5126, false, 8, (Buffer) c0709Qk2.f477o);
        try {
            AbstractC3409z9.e();
        } catch (C1273dA unused3) {
        }
        GLES20.glDrawArrays(c0709Qk2.m, 0, c0709Qk2.l);
        try {
            AbstractC3409z9.e();
        } catch (C1273dA unused4) {
        }
    }

    @Override // o.InterfaceC1008ab
    public final void d() {
        this.p.b();
        C0032c c0032c = this.f450o;
        ((C0709Qk) c0032c.e).b();
        c0032c.b = false;
        this.m.set(true);
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC3409z9.e();
            this.n.a();
            AbstractC3409z9.e();
            AbstractC3409z9.f("No current context", !Lr0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC3409z9.e();
            int i = iArr[0];
            AbstractC3409z9.b(36197, i);
            this.t = i;
        } catch (C1273dA e) {
            AP.g("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.t);
        this.u = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o.O90
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.l.l.set(true);
            }
        });
        return this.u;
    }
}
