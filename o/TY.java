package o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class TY extends HandlerThread implements Handler.Callback {
    public RunnableC2401op l;
    public Handler m;
    public Error n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RuntimeException f536o;
    public UY p;

    public final void a(int i) throws C1273dA {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.l.getClass();
        RunnableC2401op runnableC2401op = this.l;
        runnableC2401op.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC3409z9.f("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC3409z9.f("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC2401op.n = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC2401op.r, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i2 = Lr0.a;
        AbstractC3409z9.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC2401op.n, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC3409z9.f("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC2401op.f953o = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC2401op.n;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC3409z9.f("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC3409z9.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC2401op.p = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC2401op.m;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC3409z9.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC2401op.q = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC2401op);
        SurfaceTexture surfaceTexture2 = this.l.q;
        surfaceTexture2.getClass();
        this.p = new UY(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.l.getClass();
        RunnableC2401op runnableC2401op = this.l;
        runnableC2401op.l.removeCallbacks(runnableC2401op);
        try {
            SurfaceTexture surfaceTexture = runnableC2401op.q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC2401op.m, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC2401op.n;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC2401op.n;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC2401op.p;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC2401op.n, runnableC2401op.p);
            }
            EGLContext eGLContext = runnableC2401op.f953o;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC2401op.n, eGLContext);
            }
            if (Lr0.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = runnableC2401op.n;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC2401op.n);
            }
            runnableC2401op.n = null;
            runnableC2401op.f953o = null;
            runnableC2401op.p = null;
            runnableC2401op.q = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } catch (Throwable th) {
                    try {
                        AP.g("Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                AP.g("Failed to initialize placeholder surface", e);
                this.n = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                AP.g("Failed to initialize placeholder surface", e2);
                this.f536o = e2;
                synchronized (this) {
                    notify();
                }
            } catch (C1273dA e3) {
                AP.g("Failed to initialize placeholder surface", e3);
                this.f536o = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
