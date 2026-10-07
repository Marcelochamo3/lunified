package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class UY extends Surface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f554o;
    public static boolean p;
    public final boolean l;
    public final TY m;
    public boolean n;

    public UY(TY ty, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.m = ty;
        this.l = z;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = Lr0.a;
        if (i >= 24 && ((i >= 26 || !("samsung".equals(Lr0.c) || "XT1650".equals(Lr0.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        try {
            if (!p) {
                f554o = a(context);
                p = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f554o != 0;
    }

    public static UY f(Context context, boolean z) {
        boolean z2 = false;
        AbstractC0397Ej.f(!z || e(context));
        TY ty = new TY("ExoPlayer:PlaceholderSurface");
        int i = z ? f554o : 0;
        ty.start();
        Handler handler = new Handler(ty.getLooper(), ty);
        ty.m = handler;
        ty.l = new RunnableC2401op(handler);
        synchronized (ty) {
            ty.m.obtainMessage(1, i, 0).sendToTarget();
            while (ty.p == null && ty.f536o == null && ty.n == null) {
                try {
                    ty.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = ty.f536o;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = ty.n;
        if (error != null) {
            throw error;
        }
        UY uy = ty.p;
        uy.getClass();
        return uy;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.m) {
            try {
                if (!this.n) {
                    TY ty = this.m;
                    ty.m.getClass();
                    ty.m.sendEmptyMessage(2);
                    this.n = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
