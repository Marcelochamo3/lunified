package o;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class Os0 implements GLSurfaceView.Renderer {
    public static final String[] s = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer t = AbstractC3409z9.i(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final GLSurfaceView l;
    public final int[] m = new int[3];
    public final int[] n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f443o = new int[3];
    public final int[] p = new int[3];
    public final AtomicReference q = new AtomicReference();
    public C1909jm0 r;

    public Os0(GLSurfaceView gLSurfaceView) {
        this.l = gLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f443o;
            this.p[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        AbstractC1674hK.w(this.q.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.n;
        try {
            C1909jm0 c1909jm0 = new C1909jm0("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.r = c1909jm0;
            GLES20.glVertexAttribPointer(c1909jm0.t("in_pos"), 2, 5126, false, 0, (Buffer) t);
            iArr[0] = this.r.t("in_tc_y");
            iArr[1] = this.r.t("in_tc_u");
            iArr[2] = this.r.t("in_tc_v");
            GLES20.glGetUniformLocation(this.r.l, "mColorConversion");
            AbstractC3409z9.e();
            int[] iArr2 = this.m;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    C1909jm0 c1909jm1 = this.r;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(c1909jm1.l, s[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    AbstractC3409z9.b(3553, iArr2[i]);
                }
                AbstractC3409z9.e();
            } catch (C1273dA unused) {
            }
            AbstractC3409z9.e();
        } catch (C1273dA unused2) {
        }
    }
}
