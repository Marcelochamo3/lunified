package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Af0 extends GLSurfaceView {
    public static final /* synthetic */ int w = 0;
    public final CopyOnWriteArrayList l;
    public final SensorManager m;
    public final Sensor n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final KW f176o;
    public final Handler p;
    public final P90 q;
    public SurfaceTexture r;
    public Surface s;
    public boolean t;
    public boolean u;
    public boolean v;

    public Af0(Context context) {
        super(context, null);
        this.l = new CopyOnWriteArrayList();
        this.p = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.m = sensorManager;
        Sensor defaultSensor = Lr0.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.n = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        P90 p90 = new P90();
        this.q = p90;
        C3448zf0 c3448zf0 = new C3448zf0(this, p90);
        View.OnTouchListener ul0 = new Ul0(context, c3448zf0);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f176o = new KW(windowManager.getDefaultDisplay(), ul0, c3448zf0);
        this.t = true;
        setEGLContextClientVersion(2);
        setRenderer(c3448zf0);
        setOnTouchListener(ul0);
    }

    public final void a() {
        boolean z = this.t && this.u;
        Sensor sensor = this.n;
        if (sensor == null || z == this.v) {
            return;
        }
        KW kw = this.f176o;
        SensorManager sensorManager = this.m;
        if (z) {
            sensorManager.registerListener(kw, sensor, 0);
        } else {
            sensorManager.unregisterListener(kw);
        }
        this.v = z;
    }

    public InterfaceC1008ab getCameraMotionListener() {
        return this.q;
    }

    public Ss0 getVideoFrameMetadataListener() {
        return this.q;
    }

    public Surface getVideoSurface() {
        return this.s;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.post(new Jj0(28, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.u = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.u = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.q.v = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.t = z;
        a();
    }
}
