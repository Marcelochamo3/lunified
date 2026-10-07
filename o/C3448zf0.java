package o;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: o.zf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3448zf0 implements GLSurfaceView.Renderer, JW {
    public final P90 l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f1160o;
    public final float[] p;
    public final float[] q;
    public float r;
    public float s;
    public final /* synthetic */ Af0 v;
    public final float[] m = new float[16];
    public final float[] n = new float[16];
    public final float[] t = new float[16];
    public final float[] u = new float[16];

    public C3448zf0(Af0 af0, P90 p90) {
        this.v = af0;
        float[] fArr = new float[16];
        this.f1160o = fArr;
        float[] fArr2 = new float[16];
        this.p = fArr2;
        float[] fArr3 = new float[16];
        this.q = fArr3;
        this.l = p90;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.s = 3.1415927f;
    }

    @Override // o.JW
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.f1160o;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.s = f2;
        Matrix.setRotateM(this.p, 0, -this.r, (float) Math.cos(f2), (float) Math.sin(this.s), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.u, 0, this.f1160o, 0, this.q, 0);
            Matrix.multiplyMM(this.t, 0, this.p, 0, this.u, 0);
        }
        Matrix.multiplyMM(this.n, 0, this.m, 0, this.t, 0);
        this.l.c(this.n);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.m, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Af0 af0 = this.v;
        af0.p.post(new O3(af0, 17, this.l.e()));
    }
}
