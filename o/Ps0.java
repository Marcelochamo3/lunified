package o;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class Ps0 extends GLSurfaceView implements Rs0 {
    public static final /* synthetic */ int m = 0;
    public final Os0 l;

    public Ps0(Context context) {
        super(context, null);
        Os0 os0 = new Os0(this);
        this.l = os0;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(os0);
        setRenderMode(0);
    }

    public void setOutputBuffer(Qs0 qs0) {
        Os0 os0 = this.l;
        AbstractC1674hK.w(os0.q.getAndSet(qs0));
        os0.l.requestRender();
    }

    @Deprecated
    public Rs0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
