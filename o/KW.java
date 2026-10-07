package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import io.sentry.C0032c;

/* JADX INFO: loaded from: classes.dex */
public final class KW implements SensorEventListener {
    public final float[] l = new float[16];
    public final float[] m = new float[16];
    public final float[] n = new float[16];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f362o = new float[3];
    public final Display p;
    public final JW[] q;
    public boolean r;

    public KW(Display display, JW... jwArr) {
        this.p = display;
        this.q = jwArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.l;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.p.getRotation();
        float[] fArr3 = this.m;
        if (rotation != 0) {
            int i2 = Yu0.b.l0;
            if (rotation != 1) {
                i = Yu0.b.m0;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = Yu0.b.m0;
                    i = 1;
                }
            } else {
                i2 = 2;
                i = Yu0.b.l0;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, Yu0.b.n0, fArr3);
        float[] fArr4 = this.f362o;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.l, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.r;
        float[] fArr5 = this.l;
        if (!z) {
            C0032c.j(this.n, fArr5);
            this.r = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.m, 0, this.n, 0);
        for (JW jw : this.q) {
            jw.a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
